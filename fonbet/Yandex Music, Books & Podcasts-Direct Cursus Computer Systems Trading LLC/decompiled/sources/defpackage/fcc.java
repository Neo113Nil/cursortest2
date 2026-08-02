package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class fcc {
    public final String a;
    public final String b;
    public final int c;

    public fcc(String str, String str2, int i) {
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fcc)) {
            return false;
        }
        fcc fccVar = (fcc) obj;
        return this.a.equals(fccVar.a) && Intrinsics.d(this.b, fccVar.b) && this.c == fccVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return f1d.i(f1d.m("FilterInfo(key=", this.a, ", value=", this.b, ", position="), this.c, ")");
    }
}
