package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class te {
    public final String a;
    public final d85 b;
    public final String c;
    public final boolean d;

    public te(String str, d85 d85Var, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = d85Var;
        this.c = str2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof te)) {
            return false;
        }
        te teVar = (te) obj;
        return Intrinsics.d(this.a, teVar.a) && Intrinsics.d(this.b, teVar.b) && Intrinsics.d(this.c, teVar.c) && this.d == teVar.d;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        d85 d85Var = this.b;
        if (d85Var == null) {
            hashCode = 0;
        } else {
            long j = d85Var.a;
            met metVar = net.b;
            hashCode = Long.hashCode(j);
        }
        return Boolean.hashCode(this.d) + k5r.c((hashCode2 + hashCode) * 31, 31, this.c);
    }

    public final String toString() {
        return "ActionButtonUiData(title=" + this.a + ", color=" + this.b + ", url=" + this.c + ", viewInBrowser=" + this.d + ")";
    }
}
