package androidx.media3.exoplayer.upstream;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.media3.common.Format;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException;
import androidx.media3.datasource.StatsDataSource;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda1;
import androidx.media3.exoplayer.source.MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda3;
import androidx.media3.exoplayer.source.ProgressiveMediaPeriod;
import androidx.media3.exoplayer.source.SampleQueue;
import androidx.media3.extractor.SeekMap;
import androidx.tracing.Trace;
import com.caverock.androidsvg.IntegerParser;
import com.google.android.libraries.places.internal.zzayv;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes3.dex */
public final class Loader {
    public static final IntegerParser DONT_RETRY = new IntegerParser(2, -9223372036854775807L);
    public static final IntegerParser DONT_RETRY_FATAL = new IntegerParser(3, -9223372036854775807L);
    public LoadTask currentTask;
    public final zzayv downloadExecutor;
    public IOException fatalError;

    public final class LoadTask extends Handler implements Runnable {
        public ProgressiveMediaPeriod callback;
        public boolean canceled;
        public IOException currentError;
        public final int defaultMinRetryCount;
        public int errorCount;
        public Thread executorThread;
        public final ProgressiveMediaPeriod.ExtractingLoadable loadable;
        public volatile boolean released;
        public final long startTimeMs;

        public LoadTask(Looper looper, ProgressiveMediaPeriod.ExtractingLoadable extractingLoadable, ProgressiveMediaPeriod progressiveMediaPeriod, int i, long j) {
            super(looper);
            this.loadable = extractingLoadable;
            this.callback = progressiveMediaPeriod;
            this.defaultMinRetryCount = i;
            this.startTimeMs = j;
        }

        public final void cancel(boolean z) {
            this.released = z;
            this.currentError = null;
            if (hasMessages(1)) {
                this.canceled = true;
                removeMessages(1);
                if (!z) {
                    sendEmptyMessage(2);
                }
            } else {
                synchronized (this) {
                    try {
                        this.canceled = true;
                        this.loadable.loadCanceled = true;
                        Thread thread = this.executorThread;
                        if (thread != null) {
                            thread.interrupt();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (z) {
                Loader.this.currentTask = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                ProgressiveMediaPeriod progressiveMediaPeriod = this.callback;
                progressiveMediaPeriod.getClass();
                progressiveMediaPeriod.onLoadCanceled(this.loadable, elapsedRealtime, elapsedRealtime - this.startTimeMs, true);
                this.callback = null;
            }
        }

        public final void execute() {
            LoadEventInfo loadEventInfo;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.startTimeMs;
            ProgressiveMediaPeriod progressiveMediaPeriod = this.callback;
            progressiveMediaPeriod.getClass();
            int i = this.errorCount;
            ProgressiveMediaPeriod.ExtractingLoadable extractingLoadable = this.loadable;
            StatsDataSource statsDataSource = extractingLoadable.dataSource;
            if (i == 0) {
                DataSpec dataSpec = extractingLoadable.dataSpec;
                loadEventInfo = new LoadEventInfo(dataSpec, dataSpec.uri, Collections.EMPTY_MAP, elapsedRealtime, 0L, 0L);
            } else {
                loadEventInfo = new LoadEventInfo(extractingLoadable.dataSpec, statsDataSource.lastOpenedUri, statsDataSource.lastResponseHeaders, elapsedRealtime, j, statsDataSource.bytesRead);
            }
            DrmSessionEventListener.EventDispatcher eventDispatcher = progressiveMediaPeriod.mediaSourceEventDispatcher;
            eventDispatcher.dispatchEvent(new MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda1(eventDispatcher, loadEventInfo, new MediaLoadData(-1, (Format) null, Util.usToMs(extractingLoadable.seekTimeUs), Util.usToMs(progressiveMediaPeriod.durationUs)), i));
            this.currentError = null;
            Loader loader = Loader.this;
            zzayv zzayvVar = loader.downloadExecutor;
            LoadTask loadTask = loader.currentTask;
            loadTask.getClass();
            zzayvVar.execute(loadTask);
        }

        /* JADX WARN: Removed duplicated region for block: B:45:0x0142  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0149  */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void handleMessage(Message message) {
            long min;
            long j;
            IntegerParser integerParser;
            SeekMap seekMap;
            int i;
            if (this.released) {
                return;
            }
            int i2 = message.what;
            if (i2 == 1) {
                execute();
                return;
            }
            if (i2 == 4) {
                throw ((Error) message.obj);
            }
            Loader.this.currentTask = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = elapsedRealtime - this.startTimeMs;
            ProgressiveMediaPeriod progressiveMediaPeriod = this.callback;
            progressiveMediaPeriod.getClass();
            if (this.canceled) {
                progressiveMediaPeriod.onLoadCanceled(this.loadable, elapsedRealtime, j2, false);
                return;
            }
            int i3 = message.what;
            if (i3 == 2) {
                try {
                    progressiveMediaPeriod.onLoadCompleted(this.loadable, elapsedRealtime, j2);
                    return;
                } catch (RuntimeException e) {
                    Log.e("LoadTask", "Unexpected exception handling load completed", e);
                    Loader.this.fatalError = new UnexpectedLoaderException(e);
                    return;
                }
            }
            if (i3 != 3) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.currentError = iOException;
            int i4 = this.errorCount + 1;
            this.errorCount = i4;
            ProgressiveMediaPeriod.ExtractingLoadable extractingLoadable = this.loadable;
            StatsDataSource statsDataSource = extractingLoadable.dataSource;
            LoadEventInfo loadEventInfo = new LoadEventInfo(extractingLoadable.dataSpec, statsDataSource.lastOpenedUri, statsDataSource.lastResponseHeaders, elapsedRealtime, j2, statsDataSource.bytesRead);
            String str = Util.DEVICE_DEBUG_INFO;
            progressiveMediaPeriod.loadErrorHandlingPolicy.getClass();
            for (Throwable th = iOException; th != null; th = th.getCause()) {
                if ((th instanceof ParserException) || (th instanceof FileNotFoundException) || (th instanceof HttpDataSource$CleartextNotPermittedException) || (th instanceof UnexpectedLoaderException) || ((th instanceof DataSourceException) && ((DataSourceException) th).reason == 2008)) {
                    min = -9223372036854775807L;
                    break;
                }
            }
            min = Math.min((i4 - 1) * IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO, 5000);
            if (min != -9223372036854775807L) {
                int extractedSamplesCount = progressiveMediaPeriod.getExtractedSamplesCount();
                int i5 = extractedSamplesCount > progressiveMediaPeriod.extractedSamplesCountAtStartOfLoad ? 1 : 0;
                if (progressiveMediaPeriod.isLengthKnown || !((seekMap = progressiveMediaPeriod.seekMap) == null || seekMap.getDurationUs() == -9223372036854775807L)) {
                    j = -9223372036854775807L;
                    progressiveMediaPeriod.extractedSamplesCountAtStartOfLoad = extractedSamplesCount;
                } else if (!progressiveMediaPeriod.prepared || progressiveMediaPeriod.suppressRead()) {
                    progressiveMediaPeriod.notifyDiscontinuity = progressiveMediaPeriod.prepared;
                    progressiveMediaPeriod.lastSeekPositionUs = 0L;
                    progressiveMediaPeriod.extractedSamplesCountAtStartOfLoad = 0;
                    j = -9223372036854775807L;
                    for (SampleQueue sampleQueue : progressiveMediaPeriod.sampleQueues) {
                        sampleQueue.reset(false);
                    }
                    extractingLoadable.positionHolder.b = 0L;
                    extractingLoadable.seekTimeUs = 0L;
                    extractingLoadable.pendingExtractorSeek = true;
                    extractingLoadable.seenIcyMetadata = false;
                } else {
                    progressiveMediaPeriod.pendingDeferredRetry = true;
                    integerParser = Loader.DONT_RETRY;
                }
                integerParser = new IntegerParser(i5, min);
                int i6 = integerParser.pos;
                boolean z = !(i6 != 0 || i6 == 1);
                DrmSessionEventListener.EventDispatcher eventDispatcher = progressiveMediaPeriod.mediaSourceEventDispatcher;
                eventDispatcher.dispatchEvent(new MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda3(eventDispatcher, loadEventInfo, new MediaLoadData(-1, (Format) null, Util.usToMs(extractingLoadable.seekTimeUs), Util.usToMs(progressiveMediaPeriod.durationUs)), iOException, z));
                i = integerParser.pos;
                if (i != 3) {
                    Loader.this.fatalError = this.currentError;
                    return;
                }
                if (i != 2) {
                    if (i == 1) {
                        this.errorCount = 1;
                    }
                    long j3 = integerParser.value;
                    if (j3 == j) {
                        j3 = Math.min((this.errorCount - 1) * IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO, 5000);
                    }
                    Loader loader = Loader.this;
                    Trace.checkState(loader.currentTask == null);
                    loader.currentTask = this;
                    if (j3 > 0) {
                        sendEmptyMessageDelayed(1, j3);
                        return;
                    } else {
                        execute();
                        return;
                    }
                }
                return;
            }
            integerParser = Loader.DONT_RETRY_FATAL;
            j = -9223372036854775807L;
            int i62 = integerParser.pos;
            boolean z2 = !(i62 != 0 || i62 == 1);
            DrmSessionEventListener.EventDispatcher eventDispatcher2 = progressiveMediaPeriod.mediaSourceEventDispatcher;
            eventDispatcher2.dispatchEvent(new MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda3(eventDispatcher2, loadEventInfo, new MediaLoadData(-1, (Format) null, Util.usToMs(extractingLoadable.seekTimeUs), Util.usToMs(progressiveMediaPeriod.durationUs)), iOException, z2));
            i = integerParser.pos;
            if (i != 3) {
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z;
            try {
                synchronized (this) {
                    z = this.canceled;
                    this.executorThread = Thread.currentThread();
                }
                if (!z) {
                    android.os.Trace.beginSection("load:".concat(this.loadable.getClass().getSimpleName()));
                    try {
                        this.loadable.load();
                        android.os.Trace.endSection();
                    } catch (Throwable th) {
                        android.os.Trace.endSection();
                        throw th;
                    }
                }
                synchronized (this) {
                    this.executorThread = null;
                    Thread.interrupted();
                }
                if (this.released) {
                    return;
                }
                sendEmptyMessage(2);
            } catch (IOException e) {
                if (this.released) {
                    return;
                }
                obtainMessage(3, e).sendToTarget();
            } catch (OutOfMemoryError e2) {
                if (this.released) {
                    return;
                }
                Log.e("LoadTask", "OutOfMemory error loading stream", e2);
                obtainMessage(3, new UnexpectedLoaderException(e2)).sendToTarget();
            } catch (Error e3) {
                if (!this.released) {
                    Log.e("LoadTask", "Unexpected error loading stream", e3);
                    obtainMessage(4, e3).sendToTarget();
                }
                throw e3;
            } catch (Exception e4) {
                if (this.released) {
                    return;
                }
                Log.e("LoadTask", "Unexpected exception loading stream", e4);
                obtainMessage(3, new UnexpectedLoaderException(e4)).sendToTarget();
            }
        }
    }

    public final class UnexpectedLoaderException extends IOException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public UnexpectedLoaderException(Throwable th) {
            super(r0.toString(), th);
            String str;
            StringBuilder sb = new StringBuilder("Unexpected ");
            sb.append(th.getClass().getSimpleName());
            if (th.getMessage() != null) {
                str = ": " + th.getMessage();
            } else {
                str = "";
            }
            sb.append(str);
        }
    }

    public Loader(zzayv zzayvVar) {
        this.downloadExecutor = zzayvVar;
    }

    public final boolean isLoading() {
        return this.currentTask != null;
    }
}
