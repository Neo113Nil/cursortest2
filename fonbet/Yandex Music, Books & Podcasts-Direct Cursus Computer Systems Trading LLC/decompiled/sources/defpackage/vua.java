package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class vua {
    public final String a;
    public final String b;

    public vua(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vua)) {
            return false;
        }
        vua vuaVar = (vua) obj;
        return Intrinsics.d(this.a, vuaVar.a) && Intrinsics.d(this.b, vuaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return hrg.s("Action(uri=", this.a, ", id=", this.b, ")");
    }
}
