package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import s2.BinderC4996d;

/* renamed from: com.google.android.gms.internal.ads.Wp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2851Wp extends TimerTask {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f28470n = 0;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Timer f28471u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f28472v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f28473w;

    public C2851Wp(BinderC2949aq binderC2949aq, AlertDialog alertDialog, Timer timer, BinderC4996d binderC4996d) {
        this.f28472v = alertDialog;
        this.f28471u = timer;
        this.f28473w = binderC4996d;
        Objects.requireNonNull(binderC2949aq);
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        Timer timer = this.f28471u;
        Object obj = this.f28472v;
        Object obj2 = this.f28473w;
        switch (this.f28470n) {
            case 0:
                ((AlertDialog) obj).dismiss();
                timer.cancel();
                BinderC4996d binderC4996d = (BinderC4996d) obj2;
                if (binderC4996d != null) {
                    binderC4996d.z();
                    return;
                }
                return;
            default:
                C2955aw c2955aw = (C2955aw) obj2;
                c2955aw.getClass();
                int i = H0.e.f1207a;
                if (!I0.m.f1238d.b()) {
                    throw I0.m.a();
                }
                ((WebViewProviderBoundaryInterface) H0.e.c(c2955aw.f29351b).f37858u).removeWebMessageListener("omidJsSessionService");
                C2486Bh c2486Bh = (C2486Bh) ((Rx) obj).f27448u;
                t2.D d2 = t2.G.f40858l;
                ViewTreeObserverOnGlobalLayoutListenerC2520Dh viewTreeObserverOnGlobalLayoutListenerC2520Dh = c2486Bh.f24059n;
                Objects.requireNonNull(viewTreeObserverOnGlobalLayoutListenerC2520Dh);
                d2.post(new RunnableC2469Ah(viewTreeObserverOnGlobalLayoutListenerC2520Dh, 0));
                timer.cancel();
                return;
        }
    }

    public C2851Wp(C2955aw c2955aw, Rx rx, Timer timer) {
        this.f28472v = rx;
        this.f28471u = timer;
        Objects.requireNonNull(c2955aw);
        this.f28473w = c2955aw;
    }
}
