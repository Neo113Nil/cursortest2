package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class sr3 {
    public final String a;
    public final rr3 b;
    public final boolean c;

    public sr3(String str, rr3 rr3Var, boolean z) {
        str.getClass();
        this.a = str;
        this.b = rr3Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sr3)) {
            return false;
        }
        sr3 sr3Var = (sr3) obj;
        return Intrinsics.d(this.a, sr3Var.a) && this.b == sr3Var.b && this.c == sr3Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CachedTrackFilterUiData(title=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", isSelected=");
        return ouj.r(sb, this.c, ")");
    }
}
