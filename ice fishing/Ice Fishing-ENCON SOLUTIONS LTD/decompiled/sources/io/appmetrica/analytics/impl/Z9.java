package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class Z9 {

    /* renamed from: c, reason: collision with root package name */
    public static volatile Z9 f5490c;

    /* renamed from: a, reason: collision with root package name */
    public final Context f5491a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f5492b = new HashMap();

    public Z9(Context context) {
        this.f5491a = context;
    }

    public static final Z9 a(Context context) {
        if (f5490c == null) {
            synchronized (kotlin.jvm.internal.q.a(Z9.class)) {
                if (f5490c == null) {
                    f5490c = new Z9(context);
                }
            }
        }
        Z9 z9 = f5490c;
        if (z9 != null) {
            return z9;
        }
        kotlin.jvm.internal.i.i("INSTANCE");
        throw null;
    }

    public final synchronized C0868x9 b(String str) {
        Object obj;
        try {
            HashMap hashMap = this.f5492b;
            obj = hashMap.get(str);
            if (obj == null) {
                obj = new C0868x9(this.f5491a, str);
                hashMap.put(str, obj);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (C0868x9) obj;
    }

    public final synchronized void a(String str) {
        this.f5492b.remove(str);
    }
}
