package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class v32 implements w32 {
    public final boolean a;
    public final List b;
    public final x32 c;

    public v32(boolean z, List list, x32 x32Var) {
        list.getClass();
        x32Var.getClass();
        this.a = z;
        this.b = list;
        this.c = x32Var;
    }

    public static v32 a(v32 v32Var, boolean z, x32 x32Var, int i) {
        if ((i & 1) != 0) {
            z = v32Var.a;
        }
        List list = v32Var.b;
        if ((i & 4) != 0) {
            x32Var = v32Var.c;
        }
        list.getClass();
        x32Var.getClass();
        return new v32(z, list, x32Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v32)) {
            return false;
        }
        v32 v32Var = (v32) obj;
        return this.a == v32Var.a && Intrinsics.d(this.b, v32Var.b) && Intrinsics.d(this.c, v32Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.d(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "Success(isAutoCachedEnabled=" + this.a + ", autoCachedVariants=" + this.b + ", currentCachedVariant=" + this.c + ")";
    }
}
