package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f99 extends ksw {
    public final List A;
    public final chu B;
    public final List C;
    public final t0k D;
    public final List E;
    public final List z;

    public f99(List list, List list2, chu chuVar, List list3, t0k t0kVar, List list4) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        this.z = list;
        this.A = list2;
        this.B = chuVar;
        this.C = list3;
        this.D = t0kVar;
        this.E = list4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f99)) {
            return false;
        }
        f99 f99Var = (f99) obj;
        if (!Intrinsics.d(this.z, f99Var.z) || !Intrinsics.d(this.A, f99Var.A) || !this.B.equals(f99Var.B) || !Intrinsics.d(this.C, f99Var.C) || !this.D.equals(f99Var.D)) {
            return false;
        }
        Object obj2 = bhu.b;
        return obj2.equals(obj2) && Intrinsics.d(this.E, f99Var.E);
    }

    public final int hashCode() {
        return this.E.hashCode() + ((bhu.b.hashCode() + ((this.D.hashCode() + ((((this.C.hashCode() + k5r.d(((this.z.hashCode() * 31) - 1364013995) * 31, 961, this.A)) * 31) + 1387629604) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DivMethodItemData(actions=");
        sb.append(this.z);
        sb.append(", content_alignment_vertical=center, extensions=");
        sb.append(this.A);
        sb.append(", height=");
        sb.append(this.B);
        sb.append(", items=");
        sb.append(this.C);
        sb.append(", orientation=horizontal, paddings=");
        sb.append(this.D);
        sb.append(", width=");
        sb.append(bhu.b);
        sb.append(", background=");
        return vz1.u(sb, this.E, ")");
    }
}
