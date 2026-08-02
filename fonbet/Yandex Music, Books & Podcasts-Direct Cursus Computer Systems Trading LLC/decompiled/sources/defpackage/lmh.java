package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class lmh {
    public final String a;
    public final int b;
    public final String c;
    public final int d;
    public final int e;
    public final String f;
    public final String g;
    public final String h;
    public final cee i;
    public final kmh j;

    public lmh(jmh jmhVar, cee ceeVar, kmh kmhVar) {
        this.a = jmhVar.a;
        this.b = jmhVar.b;
        this.c = jmhVar.c;
        this.d = jmhVar.d;
        this.f = jmhVar.g;
        this.g = jmhVar.h;
        this.e = jmhVar.f;
        this.h = jmhVar.i;
        this.i = ceeVar;
        this.j = kmhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || lmh.class != obj.getClass()) {
            return false;
        }
        lmh lmhVar = (lmh) obj;
        if (this.a.equals(lmhVar.a) && this.b == lmhVar.b && this.c.equals(lmhVar.c) && this.d == lmhVar.d && this.e == lmhVar.e) {
            return gdg.v(lmhVar.i, this.i) && this.j.equals(lmhVar.j) && Objects.equals(this.f, lmhVar.f) && Objects.equals(this.g, lmhVar.g) && Objects.equals(this.h, lmhVar.h);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.j.hashCode() + ((this.i.hashCode() + ((((k5r.c((k5r.c(217, 31, this.a) + this.b) * 31, 31, this.c) + this.d) * 31) + this.e) * 31)) * 31)) * 31;
        String str = this.f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }
}
