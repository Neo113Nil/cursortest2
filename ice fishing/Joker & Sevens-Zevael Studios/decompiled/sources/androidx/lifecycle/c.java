package androidx.lifecycle;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f660a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f661b;

    public c(int i10, Method method) {
        this.f660a = i10;
        this.f661b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f660a == cVar.f660a && this.f661b.getName().equals(cVar.f661b.getName());
    }

    public final int hashCode() {
        return this.f661b.getName().hashCode() + (this.f660a * 31);
    }
}
