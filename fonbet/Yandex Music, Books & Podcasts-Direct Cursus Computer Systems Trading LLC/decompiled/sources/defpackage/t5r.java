package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class t5r {
    public final String a;
    public final hfs b;

    public t5r(String str, hfs hfsVar) {
        str.getClass();
        this.a = str;
        this.b = hfsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t5r)) {
            return false;
        }
        t5r t5rVar = (t5r) obj;
        return Intrinsics.d(this.a, t5rVar.a) && Intrinsics.d(this.b, t5rVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        hfs hfsVar = this.b;
        return hashCode + (hfsVar == null ? 0 : hfsVar.hashCode());
    }

    public final String toString() {
        return "Title(text=" + this.a + ", textColor=" + this.b + ")";
    }
}
