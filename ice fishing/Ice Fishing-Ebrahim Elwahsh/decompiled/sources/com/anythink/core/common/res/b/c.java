package com.anythink.core.common.res.b;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static volatile c f16363a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, a> f16364b = new HashMap();

    private c() {
    }

    public static c a() {
        if (f16363a == null) {
            synchronized (c.class) {
                try {
                    if (f16363a == null) {
                        f16363a = new c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f16363a;
    }

    public final synchronized void b(String str) {
        if (this.f16364b != null && !TextUtils.isEmpty(str)) {
            this.f16364b.remove(str);
        }
    }

    public final synchronized void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        a aVar = this.f16364b.get(str);
        if (aVar != null) {
            aVar.f();
        }
    }

    public final synchronized void d(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        a aVar = this.f16364b.get(str);
        if (aVar != null) {
            aVar.g();
        }
    }

    public final synchronized a a(String str) {
        a aVar = this.f16364b.get(str);
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a(str);
        this.f16364b.put(str, aVar2);
        return aVar2;
    }
}
