package com.google.android.gms.internal.ads;

import android.os.Looper;
import s2.C4949p;

/* renamed from: com.google.android.gms.internal.ads.Pc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2740Pc implements InterfaceC2689Mc, InterfaceC2890Yc {

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC4084vh f27625n;

    public static final void f(Runnable runnable) {
        x2.d dVar = C4949p.f40498g.f40499a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            w2.z.k("runOnUiThread > the UI thread is the main thread, the runnable will be run now");
            runnable.run();
        } else {
            w2.z.k("runOnUiThread > the UI thread is not the main thread, the runnable will be added to the message queue");
            if (w2.D.f41627l.post(runnable)) {
                return;
            }
            x2.i.f("runOnUiThread > the runnable could not be placed to the message queue");
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2689Mc, com.google.android.gms.internal.ads.InterfaceC2757Qc
    public final void b(String str) {
        w2.z.k("invokeJavascript on adWebView from js");
        f(new RunnableC2723Oc(this, str, 3));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2890Yc
    public final void h(String str, InterfaceC3272gc interfaceC3272gc) {
        InterfaceC4084vh interfaceC4084vh = this.f27625n;
        if (interfaceC4084vh != null) {
            interfaceC4084vh.r0(str, new Qx(9, interfaceC3272gc));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2890Yc
    public final void i(String str, InterfaceC3272gc interfaceC3272gc) {
        InterfaceC4084vh interfaceC4084vh = this.f27625n;
        if (interfaceC4084vh != null) {
            interfaceC4084vh.Z0(str, new C2706Nc(this, interfaceC3272gc));
        }
    }
}
