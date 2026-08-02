package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class lnu {
    public final String a;
    public final String b;
    public final long c;
    public final amu d;
    public final String e;
    public final nmu f;
    public final d85 g;
    public final d85 h;

    public lnu(String str, String str2, long j, amu amuVar, String str3, nmu nmuVar, d85 d85Var, d85 d85Var2, int i) {
        amuVar = (i & 8) != 0 ? null : amuVar;
        str3 = (i & 16) != 0 ? null : str3;
        nmuVar = (i & 32) != 0 ? nmu.a : nmuVar;
        d85Var = (i & 64) != 0 ? null : d85Var;
        d85Var2 = (i & 128) != 0 ? null : d85Var2;
        str.getClass();
        nmuVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = amuVar;
        this.e = str3;
        this.f = nmuVar;
        this.g = d85Var;
        this.h = d85Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lnu)) {
            return false;
        }
        lnu lnuVar = (lnu) obj;
        return Intrinsics.d(this.a, lnuVar.a) && Intrinsics.d(this.b, lnuVar.b) && d85.c(this.c, lnuVar.c) && Intrinsics.d(this.d, lnuVar.d) && Intrinsics.d(this.e, lnuVar.e) && this.f == lnuVar.f && Intrinsics.d(this.g, lnuVar.g) && Intrinsics.d(this.h, lnuVar.h);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        int i = d85.o;
        met metVar = net.b;
        int c = tlm.c(this.c, hashCode2, 31);
        amu amuVar = this.d;
        int hashCode3 = (c + (amuVar == null ? 0 : amuVar.hashCode())) * 31;
        String str2 = this.e;
        int hashCode4 = (this.f.hashCode() + ((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        d85 d85Var = this.g;
        int hashCode5 = (hashCode4 + (d85Var == null ? 0 : Long.hashCode(d85Var.a))) * 31;
        d85 d85Var2 = this.h;
        return hashCode5 + (d85Var2 != null ? Long.hashCode(d85Var2.a) : 0);
    }

    public final String toString() {
        String i = d85.i(this.c);
        StringBuilder m = f1d.m("WaveButtonUiData(title=", this.a, ", waveHeader=", this.b, ", backgroundColor=");
        m.append(i);
        m.append(", waveAssetsLinks=");
        m.append(this.d);
        m.append(", imageUrl=");
        m.append(this.e);
        m.append(", imageRounding=");
        m.append(this.f);
        m.append(", headerTextColor=");
        m.append(this.g);
        m.append(", titleTextColor=");
        m.append(this.h);
        m.append(")");
        return m.toString();
    }
}
