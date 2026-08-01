package com.anythink.core.common.b;

import android.content.Context;
import com.anythink.core.d.b;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    private Object f12243a;

    /* renamed from: b, reason: collision with root package name */
    private Method f12244b;

    public b() {
        try {
            Class<?> cls = Class.forName("com.aegis.guard.TDNAHandler");
            Method method = cls.getMethod("getInstance", new Class[0]);
            method.setAccessible(true);
            this.f12243a = method.invoke(null, new Object[0]);
            Method method2 = cls.getMethod(b.a.f17192A, Context.class, Long.TYPE);
            this.f12244b = method2;
            method2.setAccessible(true);
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.core.common.b.c
    public final byte[] a(Context context) {
        try {
            Object obj = this.f12243a;
            if (obj != null) {
                return (byte[]) this.f12244b.invoke(obj, context, -1L);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
