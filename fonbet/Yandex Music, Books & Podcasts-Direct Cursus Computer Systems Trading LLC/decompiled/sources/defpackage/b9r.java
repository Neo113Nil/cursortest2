package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b9r implements wdc {
    public final float a;
    public final float b;
    public final Object c;

    public /* synthetic */ b9r(int i, Object obj) {
        this(1.0f, 1500.0f, (i & 4) != 0 ? null : obj);
    }

    @Override // defpackage.tm0
    public final rzt a(oct octVar) {
        Object obj = this.c;
        return new hjp(this.a, this.b, obj == null ? null : (cn0) octVar.a.invoke(obj));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b9r) {
            b9r b9rVar = (b9r) obj;
            if (b9rVar.a == this.a && b9rVar.b == this.b && Intrinsics.d(b9rVar.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.c;
        return Float.hashCode(this.b) + eta.a((obj != null ? obj.hashCode() : 0) * 31, this.a, 31);
    }

    public b9r(float f, float f2, Object obj) {
        this.a = f;
        this.b = f2;
        this.c = obj;
    }
}
