package com.google.android.gms.internal.ads;

import android.os.Looper;
import q2.C4907p;

/* renamed from: com.google.android.gms.internal.ads.Kc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2634Kc implements InterfaceC2583Hc, InterfaceC2787Tc {

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC3858rh f25993n;

    public static final void l(Runnable runnable) {
        u2.d dVar = C4907p.f40108g.f40109a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            t2.C.k("runOnUiThread > the UI thread is the main thread, the runnable will be run now");
            runnable.run();
        } else {
            t2.C.k("runOnUiThread > the UI thread is not the main thread, the runnable will be added to the message queue");
            if (t2.G.f40858l.post(runnable)) {
                return;
            }
            u2.i.f("runOnUiThread > the runnable could not be placed to the message queue");
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2583Hc, com.google.android.gms.internal.ads.InterfaceC2651Lc
    public final void d(String str) {
        t2.C.k("invokeJavascript on adWebView from js");
        l(new RunnableC2617Jc(this, str, 3));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2787Tc
    public final void e(String str, InterfaceC2990bc interfaceC2990bc) {
        InterfaceC3858rh interfaceC3858rh = this.f25993n;
        if (interfaceC3858rh != null) {
            interfaceC3858rh.K0(str, new Rx(9, interfaceC2990bc));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2787Tc
    public final void f(String str, InterfaceC2990bc interfaceC2990bc) {
        InterfaceC3858rh interfaceC3858rh = this.f25993n;
        if (interfaceC3858rh != null) {
            interfaceC3858rh.N0(str, new C2600Ic(this, interfaceC2990bc));
        }
    }
}
