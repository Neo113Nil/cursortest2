package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class bu8 {
    public final String a;
    public final rv8 b;

    public bu8(String str, rv8 rv8Var) {
        rv8Var.getClass();
        this.a = str;
        this.b = rv8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bu8)) {
            return false;
        }
        bu8 bu8Var = (bu8) obj;
        return Intrinsics.d(this.a, bu8Var.a) && Intrinsics.d(this.b, bu8Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "DivContent(screenId=" + this.a + ", divData=" + this.b + ")";
    }
}
