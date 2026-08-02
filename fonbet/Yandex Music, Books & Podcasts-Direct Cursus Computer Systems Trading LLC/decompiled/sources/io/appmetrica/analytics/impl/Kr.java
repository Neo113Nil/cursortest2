package io.appmetrica.analytics.impl;

import android.content.Context;
import defpackage.u75;
import java.util.LinkedHashMap;
import kotlin.Pair;

/* loaded from: classes5.dex */
public final class Kr {
    public final Context a;
    public final LinkedHashMap b = new LinkedHashMap();
    public final Gr c;
    public final Gr d;

    public Kr(Context context) {
        this.a = context;
        C0371jb c0371jb = new C0371jb(context, "appmetrica_vital.dat");
        this.c = new Gr(C0747wb.k().y(), c0371jb);
        this.d = new Gr(new C0724vh(C0747wb.k().B().e(context)), c0371jb);
    }

    public final synchronized Hr a(H5 h5) {
        Object obj;
        Lr c0371jb;
        try {
            String valueOf = String.valueOf(h5);
            LinkedHashMap linkedHashMap = this.b;
            obj = linkedHashMap.get(valueOf);
            if (obj == null) {
                C0637sh c0637sh = new C0637sh(C0747wb.I.B().b(this.a, h5));
                if (h5.d()) {
                    String a = AbstractC0155bp.a(new StringBuilder("appmetrica_vital_"), h5.b, ".dat");
                    c0371jb = new Y5(u75.h(new Pair(a, new C0371jb(this.a, a)), new Pair("appmetrica_vital_main.dat", new C0371jb(this.a, "appmetrica_vital_main.dat"))));
                } else {
                    c0371jb = new C0371jb(this.a, AbstractC0155bp.a(new StringBuilder("appmetrica_vital_"), h5.b, ".dat"));
                }
                obj = new Hr(c0637sh, c0371jb, valueOf);
                linkedHashMap.put(valueOf, obj);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Hr) obj;
    }

    public final Gr b() {
        return this.d;
    }

    public final Gr a() {
        return this.c;
    }
}
