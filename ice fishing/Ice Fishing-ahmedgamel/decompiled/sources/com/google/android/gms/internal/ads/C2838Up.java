package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import v2.BinderC5100d;
import w2.HandlerC5139A;

/* renamed from: com.google.android.gms.internal.ads.Up, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2838Up extends TimerTask {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f28781n = 0;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Timer f28782u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f28783v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f28784w;

    public C2838Up(BinderC2903Yp binderC2903Yp, AlertDialog alertDialog, Timer timer, BinderC5100d binderC5100d) {
        this.f28783v = alertDialog;
        this.f28782u = timer;
        this.f28784w = binderC5100d;
        Objects.requireNonNull(binderC2903Yp);
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        Timer timer = this.f28782u;
        Object obj = this.f28783v;
        Object obj2 = this.f28784w;
        switch (this.f28781n) {
            case 0:
                ((AlertDialog) obj).dismiss();
                timer.cancel();
                BinderC5100d binderC5100d = (BinderC5100d) obj2;
                if (binderC5100d != null) {
                    binderC5100d.t();
                    return;
                }
                return;
            default:
                Zv zv = (Zv) obj2;
                zv.getClass();
                int i = H0.e.f1187a;
                if (!I0.m.f1296d.b()) {
                    throw I0.m.a();
                }
                ((WebViewProviderBoundaryInterface) H0.e.c(zv.f29746b).f1291u).removeWebMessageListener("omidJsSessionService");
                C2575Fh c2575Fh = (C2575Fh) ((Qx) obj).f27895u;
                HandlerC5139A handlerC5139A = w2.D.f41627l;
                ViewTreeObserverOnGlobalLayoutListenerC2592Gh viewTreeObserverOnGlobalLayoutListenerC2592Gh = c2575Fh.f25606n;
                Objects.requireNonNull(viewTreeObserverOnGlobalLayoutListenerC2592Gh);
                handlerC5139A.post(new RunnableC2558Eh(viewTreeObserverOnGlobalLayoutListenerC2592Gh, 0));
                timer.cancel();
                return;
        }
    }

    public C2838Up(Zv zv, Qx qx, Timer timer) {
        this.f28783v = qx;
        this.f28782u = timer;
        Objects.requireNonNull(zv);
        this.f28784w = zv;
    }
}
