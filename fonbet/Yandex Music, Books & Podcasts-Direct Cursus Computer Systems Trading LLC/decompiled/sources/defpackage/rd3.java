package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class rd3 extends ox6 {
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final List q;

    public rd3(String str, String str2, String str3, String str4, String str5, String str6, String str7, List list) {
        str.getClass();
        str3.getClass();
        list.getClass();
        this.j = str;
        this.k = str2;
        this.l = str3;
        this.m = str4;
        this.n = str5;
        this.o = str6;
        this.p = str7;
        this.q = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rd3)) {
            return false;
        }
        rd3 rd3Var = (rd3) obj;
        return Intrinsics.d(this.j, rd3Var.j) && Intrinsics.d(this.k, rd3Var.k) && Intrinsics.d(this.l, rd3Var.l) && Intrinsics.d(this.m, rd3Var.m) && Intrinsics.d(this.n, rd3Var.n) && Intrinsics.d(this.o, rd3Var.o) && Intrinsics.d(this.p, rd3Var.p) && Intrinsics.d(this.q, rd3Var.q);
    }

    public final int hashCode() {
        int hashCode = this.j.hashCode() * 31;
        String str = this.k;
        int c = k5r.c((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.l);
        String str2 = this.m;
        int hashCode2 = (c + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.n;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.o;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.p;
        return this.q.hashCode() + ((hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = f1d.m("WaveButton(title=", this.j, ", header=", this.k, ", stationId=");
        su4.v(m, this.l, ", imageUrl=", this.m, ", bgImageUrl=");
        su4.v(m, this.n, ", bgColor=", this.o, ", waveText=");
        m.append(this.p);
        m.append(", seeds=");
        m.append(this.q);
        m.append(")");
        return m.toString();
    }
}
