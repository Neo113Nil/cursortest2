package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicLong;
import q2.C4879b;
import q2.C4903n;
import q2.C4907p;

/* renamed from: com.google.android.gms.internal.ads.uf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4018uf extends G2.a {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3211ff f34633a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f34634b;

    /* renamed from: c, reason: collision with root package name */
    public final BinderC3964tf f34635c;

    /* renamed from: d, reason: collision with root package name */
    public final long f34636d = System.currentTimeMillis();

    public C4018uf(Context context, String str) {
        new AtomicLong();
        this.f34634b = context.getApplicationContext();
        C4903n c4903n = C4907p.f40108g.f40110b;
        BinderC3317hd binderC3317hd = new BinderC3317hd();
        c4903n.getClass();
        this.f34633a = (InterfaceC3211ff) new C4879b(c4903n, context, str, binderC3317hd).d(context, false);
        this.f34635c = new BinderC3964tf();
    }

    @Override // G2.a
    public final void b(Activity activity, k2.q qVar) {
        BinderC3964tf binderC3964tf = this.f34635c;
        binderC3964tf.f34425u = qVar;
        try {
            InterfaceC3211ff interfaceC3211ff = this.f34633a;
            if (interfaceC3211ff != null) {
                interfaceC3211ff.h1(binderC3964tf);
                interfaceC3211ff.i3(new V2.b(activity));
            }
        } catch (RemoteException e6) {
            u2.i.i("#007 Could not call remote method.", e6);
        }
    }

    public final void c(q2.F0 f02, G2.b bVar) {
        try {
            InterfaceC3211ff interfaceC3211ff = this.f34633a;
            if (interfaceC3211ff != null) {
                f02.f39943n = this.f34636d;
                interfaceC3211ff.H2(q2.f1.a(this.f34634b, f02), new BinderC3803qf(bVar, this, 1));
            }
        } catch (RemoteException e6) {
            u2.i.i("#007 Could not call remote method.", e6);
        }
    }
}
