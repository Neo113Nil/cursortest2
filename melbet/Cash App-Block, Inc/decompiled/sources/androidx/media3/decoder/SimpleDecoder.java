package androidx.media3.decoder;

import android.net.TrafficStats;
import android.net.Uri;
import android.util.Log;
import androidx.media3.extractor.text.SubtitleInputBuffer;
import androidx.tracing.Trace;
import com.caverock.androidsvg.SVG;
import com.datadog.trace.core.CoreTracer;
import com.datadog.trace.util.AgentThreadFactory;
import com.fillr.browsersdk.Fillr;
import com.fillr.browsersdk.model.FillrClientServerPipe;
import com.fillr.browsersdk.model.SaveWidgetToLocalStorageAsynTask;
import com.fillr.browsersdk.model.WebviewProxy;
import com.fillr.browsersdk.tls.utils.HttpParser;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes3.dex */
public abstract class SimpleDecoder implements Decoder {
    public int availableInputBufferCount;
    public final DecoderInputBuffer[] availableInputBuffers;
    public int availableOutputBufferCount;
    public final DecoderOutputBuffer[] availableOutputBuffers;
    public final AnonymousClass1 decodeThread;
    public DecoderInputBuffer dequeuedInputBuffer;
    public DecoderException exception;
    public boolean flushed;
    public final Object lock = new Object();
    public long outputStartTimeUs = -9223372036854775807L;
    public final ArrayDeque queuedInputBuffers = new ArrayDeque();
    public final ArrayDeque queuedOutputBuffers = new ArrayDeque();
    public boolean released;

    public SimpleDecoder(DecoderInputBuffer[] decoderInputBufferArr, DecoderOutputBuffer[] decoderOutputBufferArr) {
        this.availableInputBuffers = decoderInputBufferArr;
        this.availableInputBufferCount = decoderInputBufferArr.length;
        for (int i = 0; i < this.availableInputBufferCount; i++) {
            this.availableInputBuffers[i] = createInputBuffer();
        }
        this.availableOutputBuffers = decoderOutputBufferArr;
        this.availableOutputBufferCount = decoderOutputBufferArr.length;
        for (int i2 = 0; i2 < this.availableOutputBufferCount; i2++) {
            this.availableOutputBuffers[i2] = createOutputBuffer();
        }
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this);
        this.decodeThread = anonymousClass1;
        anonymousClass1.start();
    }

    public abstract DecoderInputBuffer createInputBuffer();

    public abstract DecoderOutputBuffer createOutputBuffer();

    public abstract DecoderException createUnexpectedDecodeException(Throwable th);

    public abstract DecoderException decode(DecoderInputBuffer decoderInputBuffer, DecoderOutputBuffer decoderOutputBuffer, boolean z);

    public final boolean decode() {
        boolean z;
        DecoderException createUnexpectedDecodeException;
        synchronized (this.lock) {
            while (!this.released) {
                try {
                    if (!this.queuedInputBuffers.isEmpty() && this.availableOutputBufferCount > 0) {
                        break;
                    }
                    this.lock.wait();
                } finally {
                }
            }
            if (this.released) {
                return false;
            }
            DecoderInputBuffer decoderInputBuffer = (DecoderInputBuffer) this.queuedInputBuffers.removeFirst();
            DecoderOutputBuffer[] decoderOutputBufferArr = this.availableOutputBuffers;
            int i = this.availableOutputBufferCount - 1;
            this.availableOutputBufferCount = i;
            DecoderOutputBuffer decoderOutputBuffer = decoderOutputBufferArr[i];
            boolean z2 = this.flushed;
            this.flushed = false;
            if (decoderInputBuffer.getFlag(4)) {
                decoderOutputBuffer.addFlag(4);
            } else {
                decoderOutputBuffer.timeUs = decoderInputBuffer.timeUs;
                if (decoderInputBuffer.getFlag(134217728)) {
                    decoderOutputBuffer.addFlag(134217728);
                }
                long j = decoderInputBuffer.timeUs;
                synchronized (this.lock) {
                    long j2 = this.outputStartTimeUs;
                    if (j2 != -9223372036854775807L && j < j2) {
                        z = false;
                    }
                    z = true;
                }
                if (!z) {
                    decoderOutputBuffer.shouldBeSkipped = true;
                }
                try {
                    createUnexpectedDecodeException = decode(decoderInputBuffer, decoderOutputBuffer, z2);
                } catch (OutOfMemoryError e) {
                    createUnexpectedDecodeException = createUnexpectedDecodeException(e);
                } catch (RuntimeException e2) {
                    createUnexpectedDecodeException = createUnexpectedDecodeException(e2);
                }
                if (createUnexpectedDecodeException != null) {
                    synchronized (this.lock) {
                        this.exception = createUnexpectedDecodeException;
                    }
                    return false;
                }
            }
            synchronized (this.lock) {
                try {
                    if (this.flushed) {
                        decoderOutputBuffer.release();
                    } else if (decoderOutputBuffer.shouldBeSkipped) {
                        decoderOutputBuffer.release();
                    } else {
                        this.queuedOutputBuffers.addLast(decoderOutputBuffer);
                    }
                    decoderInputBuffer.clear();
                    DecoderInputBuffer[] decoderInputBufferArr = this.availableInputBuffers;
                    int i2 = this.availableInputBufferCount;
                    this.availableInputBufferCount = i2 + 1;
                    decoderInputBufferArr[i2] = decoderInputBuffer;
                } finally {
                }
            }
            return true;
        }
    }

    @Override // androidx.media3.decoder.Decoder
    public final Object dequeueInputBuffer() {
        DecoderInputBuffer decoderInputBuffer;
        synchronized (this.lock) {
            try {
                DecoderException decoderException = this.exception;
                if (decoderException != null) {
                    throw decoderException;
                }
                Trace.checkState(this.dequeuedInputBuffer == null);
                int i = this.availableInputBufferCount;
                if (i == 0) {
                    decoderInputBuffer = null;
                } else {
                    DecoderInputBuffer[] decoderInputBufferArr = this.availableInputBuffers;
                    int i2 = i - 1;
                    this.availableInputBufferCount = i2;
                    decoderInputBuffer = decoderInputBufferArr[i2];
                }
                this.dequeuedInputBuffer = decoderInputBuffer;
            } catch (Throwable th) {
                throw th;
            }
        }
        return decoderInputBuffer;
    }

    @Override // androidx.media3.decoder.Decoder
    public final DecoderOutputBuffer dequeueOutputBuffer() {
        synchronized (this.lock) {
            try {
                DecoderException decoderException = this.exception;
                if (decoderException != null) {
                    throw decoderException;
                }
                if (this.queuedOutputBuffers.isEmpty()) {
                    return null;
                }
                return (DecoderOutputBuffer) this.queuedOutputBuffers.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.media3.decoder.Decoder
    public final void flush() {
        synchronized (this.lock) {
            try {
                this.flushed = true;
                DecoderInputBuffer decoderInputBuffer = this.dequeuedInputBuffer;
                if (decoderInputBuffer != null) {
                    decoderInputBuffer.clear();
                    DecoderInputBuffer[] decoderInputBufferArr = this.availableInputBuffers;
                    int i = this.availableInputBufferCount;
                    this.availableInputBufferCount = i + 1;
                    decoderInputBufferArr[i] = decoderInputBuffer;
                    this.dequeuedInputBuffer = null;
                }
                while (!this.queuedInputBuffers.isEmpty()) {
                    DecoderInputBuffer decoderInputBuffer2 = (DecoderInputBuffer) this.queuedInputBuffers.removeFirst();
                    decoderInputBuffer2.clear();
                    DecoderInputBuffer[] decoderInputBufferArr2 = this.availableInputBuffers;
                    int i2 = this.availableInputBufferCount;
                    this.availableInputBufferCount = i2 + 1;
                    decoderInputBufferArr2[i2] = decoderInputBuffer2;
                }
                while (!this.queuedOutputBuffers.isEmpty()) {
                    ((DecoderOutputBuffer) this.queuedOutputBuffers.removeFirst()).release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void queueInputBuffer(DecoderInputBuffer decoderInputBuffer) {
        synchronized (this.lock) {
            try {
                DecoderException decoderException = this.exception;
                if (decoderException != null) {
                    throw decoderException;
                }
                Trace.checkArgument(decoderInputBuffer == this.dequeuedInputBuffer);
                this.queuedInputBuffers.addLast(decoderInputBuffer);
                if (!this.queuedInputBuffers.isEmpty() && this.availableOutputBufferCount > 0) {
                    this.lock.notify();
                }
                this.dequeuedInputBuffer = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.media3.decoder.Decoder
    public final void release() {
        synchronized (this.lock) {
            this.released = true;
            this.lock.notify();
        }
        try {
            this.decodeThread.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public final void releaseOutputBuffer(DecoderOutputBuffer decoderOutputBuffer) {
        synchronized (this.lock) {
            decoderOutputBuffer.clear();
            DecoderOutputBuffer[] decoderOutputBufferArr = this.availableOutputBuffers;
            int i = this.availableOutputBufferCount;
            this.availableOutputBufferCount = i + 1;
            decoderOutputBufferArr[i] = decoderOutputBuffer;
            if (!this.queuedInputBuffers.isEmpty() && this.availableOutputBufferCount > 0) {
                this.lock.notify();
            }
        }
    }

    @Override // androidx.media3.decoder.Decoder
    public final void setOutputStartTimeUs(long j) {
        boolean z;
        synchronized (this.lock) {
            try {
                if (this.availableInputBufferCount != this.availableInputBuffers.length && !this.flushed) {
                    z = false;
                    Trace.checkState(z);
                    this.outputStartTimeUs = j;
                }
                z = true;
                Trace.checkState(z);
                this.outputStartTimeUs = j;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: androidx.media3.decoder.SimpleDecoder$1, reason: invalid class name */
    public final class AnonymousClass1 extends Thread {
        public final /* synthetic */ int $r8$classId;
        public final Object this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CoreTracer coreTracer) {
            super(AgentThreadFactory.AGENT_THREAD_GROUP, "dd-tracer-shutdown-hook");
            this.$r8$classId = 1;
            this.this$0 = new WeakReference(coreTracer);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            Socket accept;
            InetAddress inetAddress;
            String inetAddress2;
            switch (this.$r8$classId) {
                case 0:
                    do {
                        try {
                        } catch (InterruptedException e) {
                            OptionalProvider$$ExternalSyntheticLambda0.m(e);
                            return;
                        }
                    } while (((SimpleDecoder) this.this$0).decode());
                    return;
                case 1:
                    CoreTracer coreTracer = (CoreTracer) ((WeakReference) this.this$0).get();
                    if (coreTracer != null) {
                        coreTracer.pendingTraceBuffer.close();
                        coreTracer.writer.close();
                        coreTracer.statsDClient.getClass();
                        coreTracer.metricsAggregator.getClass();
                        return;
                    }
                    return;
                case 2:
                    FillrClientServerPipe fillrClientServerPipe = (FillrClientServerPipe) this.this$0;
                    try {
                        try {
                            byte[] bArr = new byte[1024];
                            while (true) {
                                InputStream inputStream = fillrClientServerPipe.serverIn;
                                int read = inputStream.read(bArr, 0, Math.min(inputStream.available(), 1024));
                                if (read != -1) {
                                    if (read > 0) {
                                        fillrClientServerPipe.lastDataFromServer = System.currentTimeMillis();
                                        fillrClientServerPipe.clientOut.write(bArr, 0, read);
                                        fillrClientServerPipe.clientOut.flush();
                                    } else {
                                        if (fillrClientServerPipe.lastDataFromServer >= fillrClientServerPipe.lastDataFromClient && System.currentTimeMillis() - fillrClientServerPipe.lastDataFromServer > 10000) {
                                            throw new IOException("Stopped receiving data; server timeout of 10000ms exceeded");
                                        }
                                        Thread.sleep(100L);
                                    }
                                }
                            }
                        } catch (Exception e2) {
                            e2.getMessage();
                            SVG svg = Fillr.getInstance().fillrConfig;
                        }
                        fillrClientServerPipe.closeSockets();
                        ((FillrClientServerPipe) this.this$0).closeSockets();
                        return;
                    } catch (Throwable th) {
                        fillrClientServerPipe.closeSockets();
                        throw th;
                    }
                case 3:
                    SaveWidgetToLocalStorageAsynTask saveWidgetToLocalStorageAsynTask = (SaveWidgetToLocalStorageAsynTask) this.this$0;
                    saveWidgetToLocalStorageAsynTask.onPostExecute(saveWidgetToLocalStorageAsynTask.doInBackground());
                    return;
                case 4:
                    WebviewProxy webviewProxy = (WebviewProxy) this.this$0;
                    ServerSocket serverSocket = webviewProxy.socket;
                    Set set = webviewProxy.webviews;
                    set.size();
                    SVG svg2 = Fillr.getInstance().fillrConfig;
                    while (!set.isEmpty()) {
                        try {
                            TrafficStats.setThreadStatsTag((int) Thread.currentThread().getId());
                            SVG svg3 = Fillr.getInstance().fillrConfig;
                            accept = serverSocket.accept();
                            SVG svg4 = Fillr.getInstance().fillrConfig;
                            inetAddress = accept.getInetAddress();
                            inetAddress2 = inetAddress.toString();
                        } catch (Exception unused) {
                            SVG svg5 = Fillr.getInstance().fillrConfig;
                            if (!serverSocket.isBound() || serverSocket.isClosed()) {
                                SVG svg6 = Fillr.getInstance().fillrConfig;
                                set.clear();
                            }
                        }
                        if (!inetAddress.isAnyLocalAddress() && !inetAddress.isLoopbackAddress() && !inetAddress2.endsWith("::1") && !inetAddress2.endsWith("127.0.0.1")) {
                            Objects.toString(accept.getInetAddress());
                            SVG svg7 = Fillr.getInstance().fillrConfig;
                            WebviewProxy.closeSockets(accept);
                        }
                        if (webviewProxy.concurrent) {
                            long currentTimeMillis = System.currentTimeMillis();
                            accept.hashCode();
                            SVG svg8 = Fillr.getInstance().fillrConfig;
                            webviewProxy.threadPool.execute(new Thread(currentTimeMillis, accept) { // from class: com.fillr.browsersdk.model.WebviewProxy.5
                                public final /* synthetic */ Socket val$clientConnection;

                                {
                                    this.val$clientConnection = accept;
                                }

                                @Override // java.lang.Thread, java.lang.Runnable
                                public final void run() {
                                    System.currentTimeMillis();
                                    WebviewProxy webviewProxy2 = WebviewProxy.this;
                                    Socket socket = this.val$clientConnection;
                                    webviewProxy2.handleAndClose(socket);
                                    System.currentTimeMillis();
                                    socket.hashCode();
                                    Thread.activeCount();
                                    SVG svg9 = Fillr.getInstance().fillrConfig;
                                }
                            });
                        } else {
                            webviewProxy.handleAndClose(accept);
                        }
                    }
                    try {
                        SVG svg9 = Fillr.getInstance().fillrConfig;
                        serverSocket.close();
                    } catch (IOException unused2) {
                        SVG svg10 = Fillr.getInstance().fillrConfig;
                    }
                    webviewProxy.port = -1;
                    WebviewProxy.proxy = null;
                    SVG svg11 = Fillr.getInstance().fillrConfig;
                    return;
                case 5:
                    HttpParser httpParser = (HttpParser) this.this$0;
                    CountDownLatch countDownLatch = httpParser.completionSignal;
                    try {
                        HttpParser.m1938$$Nest$mparse(httpParser);
                        return;
                    } finally {
                        countDownLatch.countDown();
                    }
                default:
                    Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
                    HashMap hashMap = (HashMap) this.this$0;
                    for (String str : hashMap.keySet()) {
                        buildUpon.appendQueryParameter(str, (String) hashMap.get(str));
                    }
                    String uri = buildUpon.build().toString();
                    try {
                        try {
                            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
                            try {
                                int responseCode = httpURLConnection.getResponseCode();
                                if (responseCode < 200 || responseCode >= 300) {
                                    StringBuilder sb = new StringBuilder(String.valueOf(responseCode).length() + 54 + String.valueOf(uri).length());
                                    sb.append("Received non-success response code ");
                                    sb.append(responseCode);
                                    sb.append(" from pinging URL: ");
                                    sb.append(uri);
                                    Log.w("HttpUrlPinger", sb.toString());
                                }
                                httpURLConnection.disconnect();
                                return;
                            } catch (Throwable th2) {
                                httpURLConnection.disconnect();
                                throw th2;
                            }
                        } catch (IOException | RuntimeException e3) {
                            String message = e3.getMessage();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + String.valueOf(uri).length() + 27);
                            sb2.append("Error while pinging URL: ");
                            sb2.append(uri);
                            sb2.append(". ");
                            sb2.append(message);
                            Log.w("HttpUrlPinger", sb2.toString(), e3);
                            return;
                        }
                    } catch (IndexOutOfBoundsException e4) {
                        String message2 = e4.getMessage();
                        StringBuilder sb3 = new StringBuilder(String.valueOf(message2).length() + String.valueOf(uri).length() + 32);
                        sb3.append("Error while parsing ping URL: ");
                        sb3.append(uri);
                        sb3.append(". ");
                        sb3.append(message2);
                        Log.w("HttpUrlPinger", sb3.toString(), e4);
                        return;
                    }
            }
        }

        public AnonymousClass1(AdvertisingIdClient advertisingIdClient, HashMap hashMap) {
            this.$r8$classId = 6;
            this.this$0 = hashMap;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SimpleDecoder simpleDecoder) {
            super("ExoPlayer:SimpleDecoder");
            this.$r8$classId = 0;
            this.this$0 = simpleDecoder;
        }

        public /* synthetic */ AnonymousClass1(Object obj, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
        }
    }

    @Override // androidx.media3.decoder.Decoder
    public final /* bridge */ /* synthetic */ void queueInputBuffer(SubtitleInputBuffer subtitleInputBuffer) {
        queueInputBuffer((DecoderInputBuffer) subtitleInputBuffer);
    }
}
