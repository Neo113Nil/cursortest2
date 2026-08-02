package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* loaded from: classes2.dex */
public final class Gw {

    /* renamed from: a, reason: collision with root package name */
    public final Context f25942a;

    /* renamed from: b, reason: collision with root package name */
    public final Looper f25943b;

    public Gw(Context context, Looper looper) {
        this.f25942a = context;
        this.f25943b = looper;
    }

    public final void a(String str) {
        Lw A9 = Mw.A();
        Context context = this.f25942a;
        String packageName = context.getPackageName();
        A9.h();
        ((Mw) A9.f28504u).B(packageName);
        A9.h();
        ((Mw) A9.f28504u).D(2);
        Jw A10 = Kw.A();
        A10.h();
        ((Kw) A10.f28504u).B(str);
        A10.h();
        ((Kw) A10.f28504u).C(2);
        A9.h();
        ((Mw) A9.f28504u).C((Kw) A10.j());
        C3451jv c3451jv = new C3451jv(context, this.f25943b, (Mw) A9.j());
        synchronized (c3451jv.f32128x) {
            try {
                if (!c3451jv.f32124n) {
                    c3451jv.f32124n = true;
                    ((Qw) c3451jv.f32126v).o();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
