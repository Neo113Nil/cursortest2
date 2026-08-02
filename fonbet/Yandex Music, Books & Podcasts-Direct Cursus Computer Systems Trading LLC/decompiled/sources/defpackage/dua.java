package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class dua {
    public final d85 a;
    public final d85 b;
    public final d85 c;
    public final String d;

    public dua(d85 d85Var, d85 d85Var2, d85 d85Var3, String str) {
        this.a = d85Var;
        this.b = d85Var2;
        this.c = d85Var3;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dua)) {
            return false;
        }
        dua duaVar = (dua) obj;
        return Intrinsics.d(this.a, duaVar.a) && Intrinsics.d(this.b, duaVar.b) && Intrinsics.d(this.c, duaVar.c) && Intrinsics.d(this.d, duaVar.d);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        d85 d85Var = this.a;
        if (d85Var == null) {
            hashCode = 0;
        } else {
            long j = d85Var.a;
            met metVar = net.b;
            hashCode = Long.hashCode(j);
        }
        int i = hashCode * 31;
        d85 d85Var2 = this.b;
        if (d85Var2 == null) {
            hashCode2 = 0;
        } else {
            long j2 = d85Var2.a;
            met metVar2 = net.b;
            hashCode2 = Long.hashCode(j2);
        }
        int i2 = (i + hashCode2) * 31;
        d85 d85Var3 = this.c;
        if (d85Var3 == null) {
            hashCode3 = 0;
        } else {
            long j3 = d85Var3.a;
            met metVar3 = net.b;
            hashCode3 = Long.hashCode(j3);
        }
        int i3 = (i2 + hashCode3) * 31;
        String str = this.d;
        return i3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "Theme(titleColor=" + this.a + ", subtitleColor=" + this.b + ", bgColor=" + this.c + ", bgUrl=" + this.d + ")";
    }
}
