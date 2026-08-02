package defpackage;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class x7u {
    public final String a;
    public final ArrayList b;
    public final boolean c;

    public x7u(String str, ArrayList arrayList, boolean z) {
        this.a = str;
        this.b = arrayList;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x7u)) {
            return false;
        }
        x7u x7uVar = (x7u) obj;
        return this.a.equals(x7uVar.a) && this.b.equals(x7uVar.b) && this.c == x7uVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + k5r.e(dfi.b(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoClipRadioSessionBatch(batchId=");
        sb.append(this.a);
        sb.append(", sequence=");
        sb.append(this.b);
        sb.append(", pumpkin=");
        return ouj.r(sb, this.c, ", unknownSession=false)");
    }
}
