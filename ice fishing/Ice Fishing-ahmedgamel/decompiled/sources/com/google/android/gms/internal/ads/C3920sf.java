package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import s2.C4921b;
import s2.C4945n;
import s2.C4949p;
import s2.InterfaceC4963w0;

/* renamed from: com.google.android.gms.internal.ads.sf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3920sf extends I2.c {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3435jf f34748a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f34749b;

    /* renamed from: c, reason: collision with root package name */
    public final BinderC4136wf f34750c;

    /* renamed from: d, reason: collision with root package name */
    public final long f34751d;

    public C3920sf(Context context, String str) {
        C4945n c4945n = C4949p.f40498g.f40500b;
        BinderC3487kd binderC3487kd = new BinderC3487kd();
        c4945n.getClass();
        InterfaceC3435jf interfaceC3435jf = (InterfaceC3435jf) new C4921b(c4945n, context, str, binderC3487kd).d(context, false);
        this.f34751d = System.currentTimeMillis();
        new AtomicLong();
        this.f34749b = context.getApplicationContext();
        new AtomicReference(str);
        this.f34748a = interfaceC3435jf;
        this.f34750c = new BinderC4136wf();
    }

    @Override // I2.c
    public final m2.s a() {
        InterfaceC4963w0 interfaceC4963w0 = null;
        try {
            InterfaceC3435jf interfaceC3435jf = this.f34748a;
            if (interfaceC3435jf != null) {
                interfaceC4963w0 = interfaceC3435jf.l();
            }
        } catch (RemoteException e9) {
            x2.i.i("#007 Could not call remote method.", e9);
        }
        return new m2.s(interfaceC4963w0);
    }

    @Override // I2.c
    public final void d(Activity activity, m2.q qVar) {
        BinderC4136wf binderC4136wf = this.f34750c;
        binderC4136wf.f35623u = qVar;
        if (activity == null) {
            x2.i.f("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            InterfaceC3435jf interfaceC3435jf = this.f34748a;
            if (interfaceC3435jf != null) {
                interfaceC3435jf.X1(binderC4136wf);
                interfaceC3435jf.K1(new Y2.b(activity));
            }
        } catch (RemoteException e9) {
            x2.i.i("#007 Could not call remote method.", e9);
        }
    }

    public final void e(s2.F0 f02, I2.d dVar) {
        try {
            InterfaceC3435jf interfaceC3435jf = this.f34748a;
            if (interfaceC3435jf != null) {
                f02.f40335n = this.f34751d;
                interfaceC3435jf.R1(s2.e1.a(this.f34749b, f02), new BinderC3974tf(dVar, this, 0));
            }
        } catch (RemoteException e9) {
            x2.i.i("#007 Could not call remote method.", e9);
        }
    }
}
