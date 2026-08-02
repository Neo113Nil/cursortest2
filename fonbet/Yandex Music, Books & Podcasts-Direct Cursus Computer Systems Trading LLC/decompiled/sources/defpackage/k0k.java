package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k0k {
    public final float a;
    public final List b;

    static {
        new k0k(3, 0.0f);
    }

    public k0k(int i, float f) {
        this((i & 1) != 0 ? 0 : f, c5b.a);
    }

    public final k0k a(k0k k0kVar) {
        return new k0k(this.a + k0kVar.a, CollectionsKt.g0(this.b, k0kVar.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0k)) {
            return false;
        }
        k0k k0kVar = (k0k) obj;
        return cma.a(this.a, k0kVar.a) && Intrinsics.d(this.b, k0kVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaddingDimension(dp=");
        vz1.z(this.a, ", resourceIds=", sb);
        return eta.h(sb, this.b, ')');
    }

    public k0k(float f, List list) {
        this.a = f;
        this.b = list;
    }
}
