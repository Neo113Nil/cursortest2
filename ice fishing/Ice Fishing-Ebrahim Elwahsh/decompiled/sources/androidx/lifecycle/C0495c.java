package androidx.lifecycle;

import java.lang.reflect.Method;

/* renamed from: androidx.lifecycle.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0495c {

    /* renamed from: a, reason: collision with root package name */
    public final int f5268a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f5269b;

    public C0495c(int i, Method method) {
        this.f5268a = i;
        this.f5269b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0495c)) {
            return false;
        }
        C0495c c0495c = (C0495c) obj;
        return this.f5268a == c0495c.f5268a && this.f5269b.getName().equals(c0495c.f5269b.getName());
    }

    public final int hashCode() {
        return this.f5269b.getName().hashCode() + (this.f5268a * 31);
    }
}
