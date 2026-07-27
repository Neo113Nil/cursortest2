package androidx.lifecycle;

import java.lang.reflect.Method;

/* renamed from: androidx.lifecycle.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0485c {

    /* renamed from: a, reason: collision with root package name */
    public final int f5156a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f5157b;

    public C0485c(int i, Method method) {
        this.f5156a = i;
        this.f5157b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0485c)) {
            return false;
        }
        C0485c c0485c = (C0485c) obj;
        return this.f5156a == c0485c.f5156a && this.f5157b.getName().equals(c0485c.f5157b.getName());
    }

    public final int hashCode() {
        return this.f5157b.getName().hashCode() + (this.f5156a * 31);
    }
}
