package io.appmetrica.analytics.impl;

import android.content.Context;
import defpackage.scc;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.LinkedHashMap;
import kotlin.Pair;

/* loaded from: classes9.dex */
public final class ds {
    public final Context a;
    public final LinkedHashMap b = new LinkedHashMap();
    public final Zr c;
    public final Zr d;

    public ds(Context context) {
        this.a = context;
        C0734tb c0734tb = new C0734tb(context, "appmetrica_vital.dat", Jb.k().w().f(), 0L, 8, null);
        this.c = new Zr(Jb.k().y(), c0734tb);
        this.d = new Zr(new Lh(Jb.k().B().e(context)), c0734tb);
    }

    public final synchronized as a(K5 k5) {
        Object obj;
        es c0734tb;
        try {
            String valueOf = String.valueOf(k5);
            LinkedHashMap linkedHashMap = this.b;
            obj = linkedHashMap.get(valueOf);
            if (obj == null) {
                Ih ih = new Ih(Jb.I.B().b(this.a, k5));
                IHandlerExecutor f = Jb.I.d.f();
                if (k5.d()) {
                    String a = AbstractC0748tp.a(new StringBuilder("appmetrica_vital_"), k5.b, ".dat");
                    c0734tb = new C0210b6(scc.g(new Pair(a, new C0734tb(this.a, a, f, 0L, 8, null)), new Pair("appmetrica_vital_main.dat", new C0734tb(this.a, "appmetrica_vital_main.dat", f, 0L, 8, null))));
                } else {
                    c0734tb = new C0734tb(this.a, AbstractC0748tp.a(new StringBuilder("appmetrica_vital_"), k5.b, ".dat"), f, 0L, 8, null);
                }
                obj = new as(ih, c0734tb, valueOf);
                linkedHashMap.put(valueOf, obj);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (as) obj;
    }

    public final Zr b() {
        return this.d;
    }

    public final Zr a() {
        return this.c;
    }
}
