package androidx.lifecycle;

import java.lang.reflect.Method;

/* renamed from: androidx.lifecycle.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0489c {

    /* renamed from: a, reason: collision with root package name */
    public final int f5123a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f5124b;

    public C0489c(int i, Method method) {
        this.f5123a = i;
        this.f5124b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0489c)) {
            return false;
        }
        C0489c c0489c = (C0489c) obj;
        return this.f5123a == c0489c.f5123a && this.f5124b.getName().equals(c0489c.f5124b.getName());
    }

    public final int hashCode() {
        return this.f5124b.getName().hashCode() + (this.f5123a * 31);
    }
}
