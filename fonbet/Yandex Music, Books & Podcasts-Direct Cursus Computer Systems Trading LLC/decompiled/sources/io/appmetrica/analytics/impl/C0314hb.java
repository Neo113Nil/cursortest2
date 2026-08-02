package io.appmetrica.analytics.impl;

import android.content.Context;
import defpackage.ern;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.impl.hb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0314hb {
    public static volatile C0314hb c;
    public final Context a;
    public final HashMap b = new HashMap();

    public C0314hb(Context context) {
        this.a = context;
    }

    public static final C0314hb a(Context context) {
        if (c == null) {
            synchronized (ern.a(C0314hb.class)) {
                if (c == null) {
                    c = new C0314hb(context);
                }
            }
        }
        C0314hb c0314hb = c;
        if (c0314hb != null) {
            return c0314hb;
        }
        Intrinsics.j("INSTANCE");
        throw null;
    }

    public final synchronized Fa b(String str) {
        Object obj;
        try {
            HashMap hashMap = this.b;
            obj = hashMap.get(str);
            if (obj == null) {
                obj = new Fa(this.a, str);
                hashMap.put(str, obj);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Fa) obj;
    }

    public final synchronized void a(String str) {
        this.b.remove(str);
    }
}
