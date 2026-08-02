package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class w20 extends tcm {
    public final String a;
    public final String b;
    public final String c;
    public final ypt d;
    public final List e;
    public final vcm f;
    public final int g;
    public final g94 h;
    public final String i;

    public w20(String str, String str2, String str3, ypt yptVar, List list, vcm vcmVar, int i, g94 g94Var, String str4) {
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = yptVar;
        this.e = list;
        this.f = vcmVar;
        this.g = i;
        this.h = g94Var;
        this.i = str4;
    }

    @Override // defpackage.tcm
    public final g94 a() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w20)) {
            return false;
        }
        w20 w20Var = (w20) obj;
        return Intrinsics.d(this.a, w20Var.a) && Intrinsics.d(this.b, w20Var.b) && this.c.equals(w20Var.c) && Intrinsics.d(this.d, w20Var.d) && Intrinsics.d(this.e, w20Var.e) && this.f.equals(w20Var.f) && this.g == w20Var.g && this.h == w20Var.h && this.i.equals(w20Var.i);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int c = k5r.c((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.c);
        ypt yptVar = this.d;
        return this.i.hashCode() + ((this.h.hashCode() + f1d.a(this.g, (this.f.hashCode() + k5r.d((c + (yptVar != null ? yptVar.hashCode() : 0)) * 31, 31, this.e)) * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder m = f1d.m("AlbumsChartBlock(title=", this.a, ", description=", this.b, ", id=");
        m.append(this.c);
        m.append(", viewAllUrlScheme=");
        m.append(this.d);
        m.append(", albums=");
        m.append(this.e);
        m.append(", parent=");
        m.append(this.f);
        m.append(", positionInParent=");
        m.append(this.g);
        m.append(", type=");
        m.append(this.h);
        m.append(", typeForFrom=");
        return su4.o(m, this.i, ")");
    }
}
