package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import q2.C4872b;
import q2.C4896n;
import q2.C4900p;
import q2.InterfaceC4914w0;

/* renamed from: com.google.android.gms.internal.ads.sf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3897sf extends G2.c {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3412jf f33982a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f33983b;

    /* renamed from: c, reason: collision with root package name */
    public final BinderC4113wf f33984c;

    /* renamed from: d, reason: collision with root package name */
    public final long f33985d;

    public C3897sf(Context context, String str) {
        C4896n c4896n = C4900p.f40196g.f40198b;
        BinderC3464kd binderC3464kd = new BinderC3464kd();
        c4896n.getClass();
        InterfaceC3412jf interfaceC3412jf = (InterfaceC3412jf) new C4872b(c4896n, context, str, binderC3464kd).d(context, false);
        this.f33985d = System.currentTimeMillis();
        new AtomicLong();
        this.f33983b = context.getApplicationContext();
        new AtomicReference(str);
        this.f33982a = interfaceC3412jf;
        this.f33984c = new BinderC4113wf();
    }

    @Override // G2.c
    public final k2.s a() {
        InterfaceC4914w0 interfaceC4914w0 = null;
        try {
            InterfaceC3412jf interfaceC3412jf = this.f33982a;
            if (interfaceC3412jf != null) {
                interfaceC4914w0 = interfaceC3412jf.l();
            }
        } catch (RemoteException e9) {
            v2.i.i("#007 Could not call remote method.", e9);
        }
        return new k2.s(interfaceC4914w0);
    }

    @Override // G2.c
    public final void d(Activity activity, k2.q qVar) {
        BinderC4113wf binderC4113wf = this.f33984c;
        binderC4113wf.f34846u = qVar;
        if (activity == null) {
            v2.i.f("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            InterfaceC3412jf interfaceC3412jf = this.f33982a;
            if (interfaceC3412jf != null) {
                interfaceC3412jf.Z1(binderC4113wf);
                interfaceC3412jf.X1(new W2.b(activity));
            }
        } catch (RemoteException e9) {
            v2.i.i("#007 Could not call remote method.", e9);
        }
    }

    public final void e(q2.F0 f02, G2.d dVar) {
        try {
            InterfaceC3412jf interfaceC3412jf = this.f33982a;
            if (interfaceC3412jf != null) {
                f02.f40033n = this.f33985d;
                interfaceC3412jf.k1(q2.e1.a(this.f33983b, f02), new BinderC3951tf(dVar, this, 0));
            }
        } catch (RemoteException e9) {
            v2.i.i("#007 Could not call remote method.", e9);
        }
    }
}
