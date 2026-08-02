package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class th80 {
    public final ArrayList a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public th80(int i, int i2, int i3, int i4, int i5, ArrayList arrayList) {
        this.a = arrayList;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof th80)) {
            return false;
        }
        th80 th80Var = (th80) obj;
        return this.a.equals(th80Var.a) && this.b == th80Var.b && this.c == th80Var.c && this.d == th80Var.d && this.e == th80Var.e && this.f == th80Var.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + oyr.b(this.e, oyr.b(this.d, oyr.b(this.c, oyr.b(this.b, this.a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MergedOrganizations(list=");
        sb.append(this.a);
        sb.append(", currentPositionNew=");
        sb.append(this.b);
        sb.append(", currentPositionOld=");
        vfc.u(this.c, this.d, ", appendedCount=", ", removedHeadCount=", sb);
        return ly3.k(this.e, this.f, ", removedTailCount=", Extension.C_BRAKE, sb);
    }
}
