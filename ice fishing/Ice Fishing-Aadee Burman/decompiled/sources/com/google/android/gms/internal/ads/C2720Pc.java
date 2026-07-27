package com.google.android.gms.internal.ads;

import android.os.Looper;
import q2.C4900p;

/* renamed from: com.google.android.gms.internal.ads.Pc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2720Pc implements InterfaceC2669Mc, InterfaceC2867Yc {

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC4061vh f26837n;

    public static final void f(Runnable runnable) {
        v2.d dVar = C4900p.f40196g.f40197a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            u2.z.k("runOnUiThread > the UI thread is the main thread, the runnable will be run now");
            runnable.run();
        } else {
            u2.z.k("runOnUiThread > the UI thread is not the main thread, the runnable will be added to the message queue");
            if (u2.D.f41234l.post(runnable)) {
                return;
            }
            v2.i.f("runOnUiThread > the runnable could not be placed to the message queue");
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2669Mc, com.google.android.gms.internal.ads.InterfaceC2737Qc
    public final void b(String str) {
        u2.z.k("invokeJavascript on adWebView from js");
        f(new RunnableC2703Oc(this, str, 3));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2867Yc
    public final void h(String str, InterfaceC3249gc interfaceC3249gc) {
        InterfaceC4061vh interfaceC4061vh = this.f26837n;
        if (interfaceC4061vh != null) {
            interfaceC4061vh.s0(str, new Qx(9, interfaceC3249gc));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2867Yc
    public final void i(String str, InterfaceC3249gc interfaceC3249gc) {
        InterfaceC4061vh interfaceC4061vh = this.f26837n;
        if (interfaceC4061vh != null) {
            interfaceC4061vh.a1(str, new C2686Nc(this, interfaceC3249gc));
        }
    }
}
