package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class exh extends tcm {
    public final String a;
    public final String b;
    public final List c;
    public final vcm d;
    public final int e;
    public final g94 f;
    public final String g;

    public exh(String str, String str2, List list, vcm vcmVar, int i, g94 g94Var, String str3) {
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = vcmVar;
        this.e = i;
        this.f = g94Var;
        this.g = str3;
    }

    @Override // defpackage.tcm
    public final g94 a() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof exh)) {
            return false;
        }
        exh exhVar = (exh) obj;
        return Intrinsics.d(this.a, exhVar.a) && this.b.equals(exhVar.b) && Intrinsics.d(this.c, exhVar.c) && this.d.equals(exhVar.d) && this.e == exhVar.e && this.f == exhVar.f && this.g.equals(exhVar.g);
    }

    public final int hashCode() {
        String str = this.a;
        return this.g.hashCode() + ((this.f.hashCode() + f1d.a(this.e, (this.d.hashCode() + k5r.d(k5r.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c)) * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder m = f1d.m("MenuBlock(title=", this.a, ", id=", this.b, ", items=");
        m.append(this.c);
        m.append(", parent=");
        m.append(this.d);
        m.append(", positionInParent=");
        m.append(this.e);
        m.append(", type=");
        m.append(this.f);
        m.append(", typeForFrom=");
        return su4.o(m, this.g, ")");
    }
}
