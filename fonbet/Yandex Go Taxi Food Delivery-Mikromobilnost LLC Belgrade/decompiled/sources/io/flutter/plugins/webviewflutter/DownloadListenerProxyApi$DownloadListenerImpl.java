package io.flutter.plugins.webviewflutter;

import android.webkit.DownloadListener;
import defpackage.c0m;
import defpackage.h7m;
import defpackage.m2v;
import defpackage.nd2;
import defpackage.scc;
import defpackage.tt5;
import defpackage.w4u;
import defpackage.xv10;
import defpackage.zy11;
import io.flutter.plugins.webviewflutter.DownloadListenerProxyApi$DownloadListenerImpl;
import kotlin.Result;

/* loaded from: classes4.dex */
public class DownloadListenerProxyApi$DownloadListenerImpl implements DownloadListener {
    private final h7m api;

    public DownloadListenerProxyApi$DownloadListenerImpl(h7m h7mVar) {
        this.api = h7mVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ zy11 lambda$onDownloadStart$0(Result result) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$onDownloadStart$1(String str, String str2, String str3, String str4, long j) {
        h7m h7mVar = this.api;
        c0m c0mVar = new c0m(1);
        xv10 xv10Var = h7mVar.a;
        xv10Var.getClass();
        if (!((w4u) xv10Var.b).k(this)) {
            lambda$onDownloadStart$0(new Result(new Result.Failure(new AndroidWebKitError("missing-instance-error", "Callback to `DownloadListener.onDownloadStart` failed because native instance was not in the instance manager.", ""))));
        } else {
            new m2v((tt5) xv10Var.a, "dev.flutter.pigeon.webview_flutter_android.DownloadListener.onDownloadStart", xv10Var.f(), null).z(scc.g(this, str, str2, str3, str4, Long.valueOf(j)), new nd2(27, c0mVar));
        }
    }

    @Override // android.webkit.DownloadListener
    public void onDownloadStart(final String str, final String str2, final String str3, final String str4, final long j) {
        this.api.a.n(new Runnable() { // from class: g7m
            @Override // java.lang.Runnable
            public final void run() {
                DownloadListenerProxyApi$DownloadListenerImpl.this.lambda$onDownloadStart$1(str, str2, str3, str4, j);
            }
        });
    }
}
