package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes9.dex */
public final class U4 {
    public final Object a;
    public final Y5 b;
    public final HashMap c;
    public final Ob d;
    public final Context e;
    public final C0238c5 f;

    public U4(Context context, Y5 y5, C0238c5 c0238c5) {
        this.a = new Object();
        this.c = new HashMap();
        this.d = new Ob();
        this.e = context.getApplicationContext();
        this.b = y5;
        this.f = c0238c5;
    }

    public final void a(String str, Integer num, String str2) {
        synchronized (this.a) {
            try {
                Ob ob = this.d;
                Collection collection = (Collection) ob.a.remove(new T4(str, num, str2));
                if (!Or.a(collection)) {
                    collection.size();
                    ArrayList arrayList = new ArrayList(collection.size());
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        arrayList.add((Z4) this.c.remove((J4) it.next()));
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((Z4) it2.next()).a();
                    }
                }
            } finally {
            }
        }
    }

    public U4(Context context, Y5 y5) {
        this(context, y5, new C0238c5());
    }

    public final Z4 a(J4 j4, C0468k5 c0468k5) {
        Z4 z4;
        synchronized (this.a) {
            try {
                z4 = (Z4) this.c.get(j4);
                if (z4 == null) {
                    this.f.getClass();
                    z4 = C0238c5.a(j4).a(this.e, this.b, j4, c0468k5);
                    this.c.put(j4, z4);
                    this.d.a(new T4(j4.b, j4.c, j4.d), j4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z4;
    }
}
