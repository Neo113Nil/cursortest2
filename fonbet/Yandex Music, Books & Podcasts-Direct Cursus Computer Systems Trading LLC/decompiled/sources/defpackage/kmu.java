package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class kmu {
    public final String a;
    public final v3g b;
    public final qmu c;
    public final long d;
    public final String e;
    public final d85 f;
    public final d85 g;

    public kmu(String str, v3g v3gVar, qmu qmuVar, long j, String str2, d85 d85Var, d85 d85Var2) {
        str.getClass();
        this.a = str;
        this.b = v3gVar;
        this.c = qmuVar;
        this.d = j;
        this.e = str2;
        this.f = d85Var;
        this.g = d85Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kmu)) {
            return false;
        }
        kmu kmuVar = (kmu) obj;
        return Intrinsics.d(this.a, kmuVar.a) && this.b.equals(kmuVar.b) && this.c == kmuVar.c && d85.c(this.d, kmuVar.d) && Intrinsics.d(this.e, kmuVar.e) && Intrinsics.d(this.f, kmuVar.f) && Intrinsics.d(this.g, kmuVar.g);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        int i = d85.o;
        met metVar = net.b;
        int c = tlm.c(this.d, hashCode, 31);
        String str = this.e;
        int hashCode2 = (c + (str == null ? 0 : str.hashCode())) * 31;
        d85 d85Var = this.f;
        int hashCode3 = (hashCode2 + (d85Var == null ? 0 : Long.hashCode(d85Var.a))) * 31;
        d85 d85Var2 = this.g;
        return hashCode3 + (d85Var2 != null ? Long.hashCode(d85Var2.a) : 0);
    }

    public final String toString() {
        return "WaveButtonContentState(title=" + this.a + ", waveButtonImageState=" + this.b + ", playbackState=" + this.c + ", backgroundColor=" + d85.i(this.d) + ", waveButtonHeader=" + this.e + ", headerTextColor=" + this.f + ", titleTextColor=" + this.g + ")";
    }
}
