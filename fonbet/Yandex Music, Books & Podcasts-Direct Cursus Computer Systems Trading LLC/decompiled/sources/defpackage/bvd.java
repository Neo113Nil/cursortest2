package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class bvd {
    public final String a;
    public final hfs b;

    public bvd(String str, hfs hfsVar) {
        str.getClass();
        this.a = str;
        this.b = hfsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bvd)) {
            return false;
        }
        bvd bvdVar = (bvd) obj;
        return Intrinsics.d(this.a, bvdVar.a) && Intrinsics.d(this.b, bvdVar.b);
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
