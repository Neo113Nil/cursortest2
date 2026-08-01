package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* loaded from: classes2.dex */
public final class Gw {

    /* renamed from: a, reason: collision with root package name */
    public final Context f25170a;

    /* renamed from: b, reason: collision with root package name */
    public final Looper f25171b;

    public Gw(Context context, Looper looper) {
        this.f25170a = context;
        this.f25171b = looper;
    }

    public final void a(String str) {
        Lw A9 = Mw.A();
        Context context = this.f25170a;
        String packageName = context.getPackageName();
        A9.h();
        ((Mw) A9.f27721u).B(packageName);
        A9.h();
        ((Mw) A9.f27721u).D(2);
        Jw A10 = Kw.A();
        A10.h();
        ((Kw) A10.f27721u).B(str);
        A10.h();
        ((Kw) A10.f27721u).C(2);
        A9.h();
        ((Mw) A9.f27721u).C((Kw) A10.j());
        C3428jv c3428jv = new C3428jv(context, this.f25171b, (Mw) A9.j());
        synchronized (c3428jv.f31349x) {
            try {
                if (!c3428jv.f31345n) {
                    c3428jv.f31345n = true;
                    ((Qw) c3428jv.f31347v).o();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
