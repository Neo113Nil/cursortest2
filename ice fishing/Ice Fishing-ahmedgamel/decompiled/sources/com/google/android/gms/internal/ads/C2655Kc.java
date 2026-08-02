package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import s2.BinderC4954s;
import s2.C4935i;
import s2.C4945n;
import s2.C4949p;
import s2.InterfaceC4963w0;
import y2.AbstractC5205a;

/* renamed from: com.google.android.gms.internal.ads.Kc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2655Kc extends AbstractC5205a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f26709a;

    /* renamed from: b, reason: collision with root package name */
    public final s2.e1 f26710b;

    /* renamed from: c, reason: collision with root package name */
    public final s2.K f26711c;

    /* renamed from: d, reason: collision with root package name */
    public final long f26712d;

    public C2655Kc(Context context, String str) {
        BinderC3487kd binderC3487kd = new BinderC3487kd();
        this.f26712d = System.currentTimeMillis();
        new AtomicLong();
        this.f26709a = context;
        new AtomicReference(str);
        this.f26710b = s2.e1.f40429a;
        C4945n c4945n = C4949p.f40498g.f40500b;
        s2.f1 f1Var = new s2.f1();
        c4945n.getClass();
        this.f26711c = (s2.K) new C4935i(c4945n, context, f1Var, str, binderC3487kd).d(context, false);
    }

    @Override // y2.AbstractC5205a
    public final m2.s a() {
        InterfaceC4963w0 interfaceC4963w0 = null;
        try {
            s2.K k9 = this.f26711c;
            if (k9 != null) {
                interfaceC4963w0 = k9.C();
            }
        } catch (RemoteException e9) {
            x2.i.i("#007 Could not call remote method.", e9);
        }
        return new m2.s(interfaceC4963w0);
    }

    @Override // y2.AbstractC5205a
    public final void c(m2.m mVar) {
        try {
            s2.K k9 = this.f26711c;
            if (k9 != null) {
                k9.E3(new BinderC4954s(mVar));
            }
        } catch (RemoteException e9) {
            x2.i.i("#007 Could not call remote method.", e9);
        }
    }

    @Override // y2.AbstractC5205a
    public final void d(Activity activity) {
        if (activity == null) {
            x2.i.f("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            s2.K k9 = this.f26711c;
            if (k9 != null) {
                k9.x0(new Y2.b(activity));
            }
        } catch (RemoteException e9) {
            x2.i.i("#007 Could not call remote method.", e9);
        }
    }

    public final void e(s2.F0 f02, m2.x xVar) {
        try {
            s2.K k9 = this.f26711c;
            if (k9 != null) {
                f02.f40335n = this.f26712d;
                s2.e1 e1Var = this.f26710b;
                Context context = this.f26709a;
                e1Var.getClass();
                k9.I3(s2.e1.a(context, f02), new s2.b1(xVar, this));
            }
        } catch (RemoteException e9) {
            x2.i.i("#007 Could not call remote method.", e9);
            xVar.onAdFailedToLoad(new m2.n(0, "Internal Error.", "com.google.android.gms.ads", null, null));
        }
    }
}
