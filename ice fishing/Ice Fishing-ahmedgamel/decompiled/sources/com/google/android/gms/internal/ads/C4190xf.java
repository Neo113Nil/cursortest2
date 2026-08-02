package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicLong;
import s2.C4921b;
import s2.C4945n;
import s2.C4949p;

/* renamed from: com.google.android.gms.internal.ads.xf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4190xf extends J2.a {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3435jf f35811a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f35812b;

    /* renamed from: c, reason: collision with root package name */
    public final BinderC4136wf f35813c;

    /* renamed from: d, reason: collision with root package name */
    public final long f35814d = System.currentTimeMillis();

    public C4190xf(Context context, String str) {
        new AtomicLong();
        this.f35812b = context.getApplicationContext();
        C4945n c4945n = C4949p.f40498g.f40500b;
        BinderC3487kd binderC3487kd = new BinderC3487kd();
        c4945n.getClass();
        this.f35811a = (InterfaceC3435jf) new C4921b(c4945n, context, str, binderC3487kd).d(context, false);
        this.f35813c = new BinderC4136wf();
    }

    @Override // J2.a
    public final void b(Activity activity, m2.q qVar) {
        BinderC4136wf binderC4136wf = this.f35813c;
        binderC4136wf.f35623u = qVar;
        try {
            InterfaceC3435jf interfaceC3435jf = this.f35811a;
            if (interfaceC3435jf != null) {
                interfaceC3435jf.X1(binderC4136wf);
                interfaceC3435jf.K1(new Y2.b(activity));
            }
        } catch (RemoteException e9) {
            x2.i.i("#007 Could not call remote method.", e9);
        }
    }

    public final void c(s2.F0 f02, J2.b bVar) {
        try {
            InterfaceC3435jf interfaceC3435jf = this.f35811a;
            if (interfaceC3435jf != null) {
                f02.f40335n = this.f35814d;
                interfaceC3435jf.H0(s2.e1.a(this.f35812b, f02), new BinderC3974tf(bVar, this, 1));
            }
        } catch (RemoteException e9) {
            x2.i.i("#007 Could not call remote method.", e9);
        }
    }
}
