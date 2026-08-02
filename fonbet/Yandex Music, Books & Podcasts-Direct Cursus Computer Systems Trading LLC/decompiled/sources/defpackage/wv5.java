package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class wv5 {
    public final mu5 a;
    public final String b;
    public final String c;
    public final long d;
    public final ArrayList e;
    public final ct5 f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;

    public wv5(mu5 mu5Var, String str, String str2, long j, ArrayList arrayList, ct5 ct5Var, String str3, String str4, String str5, String str6) {
        dfi.s(str, str2, str3);
        this.a = mu5Var;
        this.b = str;
        this.c = str2;
        this.d = j;
        this.e = arrayList;
        this.f = ct5Var;
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.j = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wv5)) {
            return false;
        }
        wv5 wv5Var = (wv5) obj;
        return this.a.equals(wv5Var.a) && Intrinsics.d(this.b, wv5Var.b) && Intrinsics.d(this.c, wv5Var.c) && d85.c(this.d, wv5Var.d) && this.e.equals(wv5Var.e) && this.f.equals(wv5Var.f) && Intrinsics.d(this.g, wv5Var.g) && Intrinsics.d(this.h, wv5Var.h) && Intrinsics.d(this.i, wv5Var.i) && Intrinsics.d(this.j, wv5Var.j);
    }

    public final int hashCode() {
        int c = k5r.c(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        int i = d85.o;
        met metVar = net.b;
        int c2 = k5r.c((this.f.hashCode() + dfi.b(this.e, tlm.c(this.d, c, 31), 31)) * 31, 31, this.g);
        String str = this.h;
        int hashCode = (c2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.i;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.j;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String i = d85.i(this.d);
        StringBuilder sb = new StringBuilder("ConcertHeaderUiData(concert=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", bgImageUrl=");
        su4.v(sb, this.c, ", imageAverageColor=", i, ", covers=");
        sb.append(this.e);
        sb.append(", uiData=");
        sb.append(this.f);
        sb.append(", dateContentDescription=");
        su4.v(sb, this.g, ", price=", this.h, ", leadArtistId=");
        return ouj.q(sb, this.i, ", description=", this.j, ")");
    }
}
