package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import t2.BinderC5036d;
import u2.HandlerC5068A;

/* renamed from: com.google.android.gms.internal.ads.Up, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2816Up extends TimerTask {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f27984n = 0;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Timer f27985u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f27986v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f27987w;

    public C2816Up(BinderC2880Yp binderC2880Yp, AlertDialog alertDialog, Timer timer, BinderC5036d binderC5036d) {
        this.f27986v = alertDialog;
        this.f27985u = timer;
        this.f27987w = binderC5036d;
        Objects.requireNonNull(binderC2880Yp);
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        Timer timer = this.f27985u;
        Object obj = this.f27986v;
        Object obj2 = this.f27987w;
        switch (this.f27984n) {
            case 0:
                ((AlertDialog) obj).dismiss();
                timer.cancel();
                BinderC5036d binderC5036d = (BinderC5036d) obj2;
                if (binderC5036d != null) {
                    binderC5036d.t();
                    return;
                }
                return;
            default:
                Yv yv = (Yv) obj2;
                yv.getClass();
                int i = H0.e.f1084a;
                if (!I0.m.f1269d.b()) {
                    throw I0.m.a();
                }
                ((WebViewProviderBoundaryInterface) H0.e.c(yv.f28756b).f1264u).removeWebMessageListener("omidJsSessionService");
                C2555Fh c2555Fh = (C2555Fh) ((Qx) obj).f27139u;
                HandlerC5068A handlerC5068A = u2.D.f41234l;
                ViewTreeObserverOnGlobalLayoutListenerC2572Gh viewTreeObserverOnGlobalLayoutListenerC2572Gh = c2555Fh.f24817n;
                Objects.requireNonNull(viewTreeObserverOnGlobalLayoutListenerC2572Gh);
                handlerC5068A.post(new RunnableC2538Eh(viewTreeObserverOnGlobalLayoutListenerC2572Gh, 0));
                timer.cancel();
                return;
        }
    }

    public C2816Up(Yv yv, Qx qx, Timer timer) {
        this.f27986v = qx;
        this.f27985u = timer;
        Objects.requireNonNull(yv);
        this.f27987w = yv;
    }
}
