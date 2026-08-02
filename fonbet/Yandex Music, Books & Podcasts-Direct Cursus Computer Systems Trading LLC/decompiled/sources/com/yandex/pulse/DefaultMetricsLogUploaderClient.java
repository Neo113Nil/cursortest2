package com.yandex.pulse;

import android.os.Build;
import android.os.Message;
import androidx.annotation.Keep;
import com.connectsdk.etc.helper.HttpMessage;
import com.connectsdk.service.command.ServiceCommand;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.pulse.DefaultMetricsLogUploaderClient;
import com.yandex.pulse.metrics.k;
import defpackage.dfi;
import defpackage.e5i;
import defpackage.j4i;
import defpackage.k4i;
import defpackage.l4i;
import defpackage.m4i;
import defpackage.olk;
import defpackage.p4i;
import defpackage.php;
import defpackage.q4i;
import defpackage.uo7;
import defpackage.xav;
import defpackage.xq0;
import defpackage.zav;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0018B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/yandex/pulse/DefaultMetricsLogUploaderClient;", "Lm4i;", "Ljava/util/concurrent/Executor;", "backgroundExecutor", "", "uploadURL", "", "enableLogging", "<init>", "(Ljava/util/concurrent/Executor;Ljava/lang/String;Z)V", "getMetricsServerUrl", "()Ljava/lang/String;", "serverUrl", "mimeType", "logHashHeader", "Lk4i;", "onUploadComplete", "Ll4i;", "createUploader", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lk4i;)Ll4i;", "Ljava/lang/String;", "Z", "Lphp;", "Lphp;", "LogUploader", "histograms_release"}, k = 1, mv = {1, 6, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public final class DefaultMetricsLogUploaderClient implements m4i {

    @NotNull
    private final php backgroundExecutor;
    private final boolean enableLogging;

    @NotNull
    private final String uploadURL;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/yandex/pulse/DefaultMetricsLogUploaderClient$LogUploader;", "Ll4i;", "Lxav;", "handlerCallback", "Lxav;", "Companion", "histograms_release"}, k = 1, mv = {1, 6, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class LogUploader implements l4i {
        public static final Companion h = new Companion(null);
        public final Executor a;
        public final String b;
        public final String c;
        public final String d;
        public final k4i e;
        public final String f;
        public final zav g;

        @Keep
        @NotNull
        private final xav handlerCallback;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/yandex/pulse/DefaultMetricsLogUploaderClient$LogUploader$Companion;", "", "()V", "TAG", "", "UPLOAD_COMPLETE_MESSAGE_ID", "", "getUserAgent", "histograms_release"}, k = 1, mv = {1, 6, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final String getUserAgent() {
                StringBuilder sb = new StringBuilder("com.yandex.pulse/5.0.0 (");
                sb.append(Build.MODEL);
                sb.append("; Android ");
                return dfi.i(sb, Build.VERSION.RELEASE, ')');
            }

            private Companion() {
            }
        }

        public LogUploader(Executor executor, String str, String str2, String str3, k4i k4iVar, boolean z) {
            LogUploader logUploader;
            Function1 cVar;
            executor.getClass();
            str.getClass();
            str2.getClass();
            str3.getClass();
            k4iVar.getClass();
            this.a = executor;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = k4iVar;
            this.f = h.getUserAgent();
            if (z) {
                logUploader = this;
                cVar = new b(1, 0, LogUploader.class, logUploader, "onUploadCompleteWithLogging", "onUploadCompleteWithLogging(Landroid/os/Message;)V");
            } else {
                logUploader = this;
                cVar = new c(1, 0, LogUploader.class, this, "onUploadComplete", "onUploadComplete(Landroid/os/Message;)V");
            }
            uo7 uo7Var = new uo7(cVar);
            logUploader.handlerCallback = uo7Var;
            logUploader.g = new zav(uo7Var);
        }

        @Override // defpackage.l4i
        public final void a(final String str, final byte[] bArr) {
            bArr.getClass();
            this.a.execute(new Runnable() { // from class: com.yandex.pulse.a
                @Override // java.lang.Runnable
                public final void run() {
                    int i;
                    URLConnection openConnection;
                    OutputStream outputStream;
                    DefaultMetricsLogUploaderClient.LogUploader logUploader = DefaultMetricsLogUploaderClient.LogUploader.this;
                    String str2 = str;
                    DefaultMetricsLogUploaderClient.LogUploader.Companion companion = DefaultMetricsLogUploaderClient.LogUploader.h;
                    byte[] bArr2 = bArr;
                    bArr2.getClass();
                    HttpURLConnection httpURLConnection = null;
                    try {
                        openConnection = new URL(logUploader.b).openConnection();
                    } catch (Throwable unused) {
                    }
                    if (openConnection == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
                    }
                    HttpURLConnection httpURLConnection2 = (HttpURLConnection) openConnection;
                    try {
                        httpURLConnection2.setRequestMethod(ServiceCommand.TYPE_POST);
                        httpURLConnection2.setRequestProperty(HttpMessage.CONTENT_TYPE_HEADER, logUploader.c);
                        httpURLConnection2.setRequestProperty("Content-Encoding", "gzip");
                        httpURLConnection2.setRequestProperty(HttpMessage.USER_AGENT, logUploader.f);
                        httpURLConnection2.setRequestProperty(logUploader.d, str2);
                        httpURLConnection2.setFixedLengthStreamingMode(bArr2.length);
                        httpURLConnection2.setDoOutput(true);
                        outputStream = httpURLConnection2.getOutputStream();
                    } catch (Throwable unused2) {
                        httpURLConnection = httpURLConnection2;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        i = -1;
                        logUploader.g.obtainMessage(0, i, 0).sendToTarget();
                    }
                    try {
                        outputStream.write(bArr2);
                        outputStream.close();
                        i = httpURLConnection2.getResponseCode();
                        httpURLConnection2.disconnect();
                        logUploader.g.obtainMessage(0, i, 0).sendToTarget();
                    } finally {
                    }
                }
            });
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x006c, code lost:
        
            if (r12 == 400) goto L18;
         */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0094  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void b(Message message) {
            byte[] w;
            boolean z;
            int i = message.arg1;
            q4i q4iVar = ((p4i) this.e).a;
            j4i j4iVar = q4iVar.b;
            boolean z2 = true;
            q4i.h.a(i, 1);
            boolean z3 = i == 200;
            boolean O = j4iVar.O();
            olk olkVar = j4iVar.e;
            olk olkVar2 = j4iVar.d;
            if (O) {
                if (olkVar2.O()) {
                    w = ((k) olkVar2.g.get(olkVar2.h)).getCompressedLogData().w();
                    w.getClass();
                } else {
                    w = ((k) olkVar.g.get(olkVar.h)).getCompressedLogData().w();
                    w.getClass();
                }
                int length = w.length;
                if (z3) {
                    q4i.i.b(length / 1024);
                } else {
                    if (length > 102400) {
                        q4i.j.b(length);
                    }
                    z = true;
                    if (!z3 || z) {
                        j4iVar.O();
                        if (olkVar2.O()) {
                            if (!olkVar.O()) {
                                xq0.q("No staged log to discard");
                                return;
                            } else {
                                olkVar.g.remove(olkVar.h);
                                olkVar.h = -1;
                            }
                        } else if (!olkVar2.O()) {
                            xq0.q("No staged log to discard");
                            return;
                        } else {
                            olkVar2.g.remove(olkVar2.h);
                            olkVar2.h = -1;
                        }
                        j4iVar.O();
                        if (j4iVar.f) {
                            olkVar2.Q();
                            olkVar.Q();
                        }
                    }
                }
                z = false;
                if (!z3) {
                }
                j4iVar.O();
                if (olkVar2.O()) {
                }
                j4iVar.O();
                if (j4iVar.f) {
                }
            }
            if (!z3 && i != 400) {
                z2 = false;
            }
            if (!j4iVar.P()) {
                e5i e5iVar = q4iVar.e;
                e5iVar.getClass();
                e5iVar.stop();
            }
            e5i e5iVar2 = q4iVar.e;
            e5iVar2.getClass();
            e5iVar2.a(z2);
        }
    }

    public DefaultMetricsLogUploaderClient(@NotNull Executor executor, @NotNull String str, boolean z) {
        executor.getClass();
        str.getClass();
        this.uploadURL = str;
        this.enableLogging = z;
        this.backgroundExecutor = new php(executor);
    }

    @Override // defpackage.m4i
    @NotNull
    public l4i createUploader(@NotNull String serverUrl, @NotNull String mimeType, @NotNull String logHashHeader, @NotNull k4i onUploadComplete) {
        serverUrl.getClass();
        mimeType.getClass();
        logHashHeader.getClass();
        onUploadComplete.getClass();
        return new LogUploader(this.backgroundExecutor, serverUrl, mimeType, logHashHeader, onUploadComplete, this.enableLogging);
    }

    @Override // defpackage.m4i
    @NotNull
    /* renamed from: getMetricsServerUrl, reason: from getter */
    public String getUploadURL() {
        return this.uploadURL;
    }
}
