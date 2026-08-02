package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class vr2 {
    public final String a;
    public final List b;
    public final boolean c;

    public vr2(String str, List list, boolean z) {
        this.a = str;
        this.b = list;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vr2)) {
            return false;
        }
        vr2 vr2Var = (vr2) obj;
        return Intrinsics.d(this.a, vr2Var.a) && Intrinsics.d(this.b, vr2Var.b) && this.c == vr2Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + k5r.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MaskData(pattern=");
        sb.append(this.a);
        sb.append(", decoding=");
        sb.append(this.b);
        sb.append(", alwaysVisible=");
        return dfi.j(sb, this.c, ')');
    }
}
