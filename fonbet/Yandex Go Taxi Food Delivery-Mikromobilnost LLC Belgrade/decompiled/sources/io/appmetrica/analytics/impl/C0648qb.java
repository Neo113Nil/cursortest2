package io.appmetrica.analytics.impl;

import android.content.Context;
import defpackage.qoi0;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.qb, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0648qb {
    public static volatile C0648qb c;
    public final Context a;
    public final HashMap b = new HashMap();

    public C0648qb(Context context) {
        this.a = context;
    }

    public static final C0648qb a(Context context) {
        if (c == null) {
            synchronized (qoi0.a(C0648qb.class)) {
                if (c == null) {
                    c = new C0648qb(context);
                }
            }
        }
        C0648qb c0648qb = c;
        if (c0648qb == null) {
            return null;
        }
        return c0648qb;
    }

    public final synchronized Ma b(String str) {
        Object obj;
        try {
            HashMap hashMap = this.b;
            obj = hashMap.get(str);
            if (obj == null) {
                obj = new Ma(this.a, str);
                hashMap.put(str, obj);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Ma) obj;
    }

    public final synchronized void a(String str) {
        this.b.remove(str);
    }
}
