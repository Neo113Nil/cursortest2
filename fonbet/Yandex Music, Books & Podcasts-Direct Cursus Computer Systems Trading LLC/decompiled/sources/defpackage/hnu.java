package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class hnu extends jnu {
    public final String a;
    public final v3g b;
    public final String c;
    public final d85 d;
    public final d85 e;

    public hnu(String str, v3g v3gVar, String str2, d85 d85Var, d85 d85Var2) {
        str.getClass();
        this.a = str;
        this.b = v3gVar;
        this.c = str2;
        this.d = d85Var;
        this.e = d85Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hnu)) {
            return false;
        }
        hnu hnuVar = (hnu) obj;
        return Intrinsics.d(this.a, hnuVar.a) && this.b.equals(hnuVar.b) && Intrinsics.d(this.c, hnuVar.c) && Intrinsics.d(this.d, hnuVar.d) && Intrinsics.d(this.e, hnuVar.e);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        int i = 0;
        String str = this.c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        d85 d85Var = this.d;
        if (d85Var == null) {
            hashCode = 0;
        } else {
            long j = d85Var.a;
            met metVar = net.b;
            hashCode = Long.hashCode(j);
        }
        int i2 = (hashCode3 + hashCode) * 31;
        d85 d85Var2 = this.e;
        if (d85Var2 != null) {
            long j2 = d85Var2.a;
            met metVar2 = net.b;
            i = Long.hashCode(j2);
        }
        return i2 + i;
    }

    public final String toString() {
        return "Loading(title=" + this.a + ", image=" + this.b + ", waveHeader=" + this.c + ", headerTextColor=" + this.d + ", titleTextColor=" + this.e + ")";
    }
}
