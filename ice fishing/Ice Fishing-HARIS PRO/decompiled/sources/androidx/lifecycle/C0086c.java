package androidx.lifecycle;

import java.lang.reflect.Method;

/* renamed from: androidx.lifecycle.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0086c {

    /* renamed from: a, reason: collision with root package name */
    public final int f2028a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f2029b;

    public C0086c(int i, Method method) {
        this.f2028a = i;
        this.f2029b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0086c)) {
            return false;
        }
        C0086c c0086c = (C0086c) obj;
        return this.f2028a == c0086c.f2028a && this.f2029b.getName().equals(c0086c.f2029b.getName());
    }

    public final int hashCode() {
        return this.f2029b.getName().hashCode() + (this.f2028a * 31);
    }
}
