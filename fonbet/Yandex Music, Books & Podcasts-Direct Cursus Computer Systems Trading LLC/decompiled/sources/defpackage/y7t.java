package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class y7t implements x7t {
    public final Object a;
    public final Object b;

    public y7t(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // defpackage.x7t
    public final Object a() {
        return this.b;
    }

    @Override // defpackage.x7t
    public final Object b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x7t)) {
            return false;
        }
        x7t x7tVar = (x7t) obj;
        return Intrinsics.d(this.a, x7tVar.b()) && Intrinsics.d(this.b, x7tVar.a());
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}
