package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import q2.BinderC4905s;
import q2.C4886i;
import q2.C4896n;
import q2.C4900p;
import q2.InterfaceC4914w0;
import w2.AbstractC5148a;

/* renamed from: com.google.android.gms.internal.ads.Kc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2635Kc extends AbstractC5148a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f25931a;

    /* renamed from: b, reason: collision with root package name */
    public final q2.e1 f25932b;

    /* renamed from: c, reason: collision with root package name */
    public final q2.K f25933c;

    /* renamed from: d, reason: collision with root package name */
    public final long f25934d;

    public C2635Kc(Context context, String str) {
        BinderC3464kd binderC3464kd = new BinderC3464kd();
        this.f25934d = System.currentTimeMillis();
        new AtomicLong();
        this.f25931a = context;
        new AtomicReference(str);
        this.f25932b = q2.e1.f40127a;
        C4896n c4896n = C4900p.f40196g.f40198b;
        q2.f1 f1Var = new q2.f1();
        c4896n.getClass();
        this.f25933c = (q2.K) new C4886i(c4896n, context, f1Var, str, binderC3464kd).d(context, false);
    }

    @Override // w2.AbstractC5148a
    public final k2.s a() {
        InterfaceC4914w0 interfaceC4914w0 = null;
        try {
            q2.K k9 = this.f25933c;
            if (k9 != null) {
                interfaceC4914w0 = k9.C();
            }
        } catch (RemoteException e9) {
            v2.i.i("#007 Could not call remote method.", e9);
        }
        return new k2.s(interfaceC4914w0);
    }

    @Override // w2.AbstractC5148a
    public final void c(k2.m mVar) {
        try {
            q2.K k9 = this.f25933c;
            if (k9 != null) {
                k9.X0(new BinderC4905s(mVar));
            }
        } catch (RemoteException e9) {
            v2.i.i("#007 Could not call remote method.", e9);
        }
    }

    @Override // w2.AbstractC5148a
    public final void d(Activity activity) {
        if (activity == null) {
            v2.i.f("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            q2.K k9 = this.f25933c;
            if (k9 != null) {
                k9.C1(new W2.b(activity));
            }
        } catch (RemoteException e9) {
            v2.i.i("#007 Could not call remote method.", e9);
        }
    }

    public final void e(q2.F0 f02, k2.x xVar) {
        try {
            q2.K k9 = this.f25933c;
            if (k9 != null) {
                f02.f40033n = this.f25934d;
                q2.e1 e1Var = this.f25932b;
                Context context = this.f25931a;
                e1Var.getClass();
                k9.m2(q2.e1.a(context, f02), new q2.b1(xVar, this));
            }
        } catch (RemoteException e9) {
            v2.i.i("#007 Could not call remote method.", e9);
            xVar.onAdFailedToLoad(new k2.n(0, "Internal Error.", "com.google.android.gms.ads", null, null));
        }
    }
}
