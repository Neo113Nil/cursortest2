package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class xbb {
    public final String a;
    public final String b;
    public final String c;
    public final jzb d;
    public final rab e;
    public final klu f;
    public final q91 g;
    public final String h;
    public final qo6 i;

    public xbb(String str, String str2, String str3, jzb jzbVar, rab rabVar, klu kluVar, q91 q91Var, String str4, qo6 qo6Var) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = jzbVar;
        this.e = rabVar;
        this.f = kluVar;
        this.g = q91Var;
        this.h = str4;
        this.i = qo6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xbb)) {
            return false;
        }
        xbb xbbVar = (xbb) obj;
        return Intrinsics.d(this.a, xbbVar.a) && Intrinsics.d(this.b, xbbVar.b) && Intrinsics.d(this.c, xbbVar.c) && this.d == xbbVar.d && Intrinsics.d(this.e, xbbVar.e) && Intrinsics.d(this.f, xbbVar.f) && Intrinsics.d(this.g, xbbVar.g) && Intrinsics.d(this.h, xbbVar.h) && this.i == xbbVar.i;
    }

    public final int hashCode() {
        int c = k5r.c(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        jzb jzbVar = this.d;
        int hashCode2 = (this.e.hashCode() + ((hashCode + (jzbVar == null ? 0 : jzbVar.hashCode())) * 31)) * 31;
        klu kluVar = this.f;
        int hashCode3 = (hashCode2 + (kluVar == null ? 0 : kluVar.hashCode())) * 31;
        q91 q91Var = this.g;
        int hashCode4 = (hashCode3 + (q91Var == null ? 0 : q91Var.hashCode())) * 31;
        String str2 = this.h;
        return this.i.hashCode() + ((hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = f1d.m("EntitySheetHeaderUiData(coverUrl=", this.a, ", title=", this.b, ", subtitle=");
        m.append(this.c);
        m.append(", explicitType=");
        m.append(this.d);
        m.append(", entityItemUiData=");
        m.append(this.e);
        m.append(", waveAgentUiData=");
        m.append(this.f);
        m.append(", artistGridItemUiData=");
        m.append(this.g);
        m.append(", subtitleContentDescription=");
        m.append(this.h);
        m.append(", coverType=");
        m.append(this.i);
        m.append(")");
        return m.toString();
    }
}
