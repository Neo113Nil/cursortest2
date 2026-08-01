package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicLong;
import q2.C4872b;
import q2.C4896n;
import q2.C4900p;

/* renamed from: com.google.android.gms.internal.ads.xf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4167xf extends H2.a {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3412jf f35032a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f35033b;

    /* renamed from: c, reason: collision with root package name */
    public final BinderC4113wf f35034c;

    /* renamed from: d, reason: collision with root package name */
    public final long f35035d = System.currentTimeMillis();

    public C4167xf(Context context, String str) {
        new AtomicLong();
        this.f35033b = context.getApplicationContext();
        C4896n c4896n = C4900p.f40199g.f40201b;
        BinderC3464kd binderC3464kd = new BinderC3464kd();
        c4896n.getClass();
        this.f35032a = (InterfaceC3412jf) new C4872b(c4896n, context, str, binderC3464kd).d(context, false);
        this.f35034c = new BinderC4113wf();
    }

    @Override // H2.a
    public final void b(Activity activity, k2.q qVar) {
        BinderC4113wf binderC4113wf = this.f35034c;
        binderC4113wf.f34846u = qVar;
        try {
            InterfaceC3412jf interfaceC3412jf = this.f35032a;
            if (interfaceC3412jf != null) {
                interfaceC3412jf.Z1(binderC4113wf);
                interfaceC3412jf.X1(new W2.b(activity));
            }
        } catch (RemoteException e9) {
            v2.i.i("#007 Could not call remote method.", e9);
        }
    }

    public final void c(q2.F0 f02, H2.b bVar) {
        try {
            InterfaceC3412jf interfaceC3412jf = this.f35032a;
            if (interfaceC3412jf != null) {
                f02.f40036n = this.f35035d;
                interfaceC3412jf.I1(q2.e1.a(this.f35033b, f02), new BinderC3951tf(bVar, this, 1));
            }
        } catch (RemoteException e9) {
            v2.i.i("#007 Could not call remote method.", e9);
        }
    }
}
