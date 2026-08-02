package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class lyh extends tcm {
    public final String a;
    public final String b;
    public final ArrayList c;
    public final vcm d;
    public final int e;
    public final g94 f;
    public final String g;

    public lyh(String str, String str2, ArrayList arrayList, vcm vcmVar, int i, g94 g94Var, String str3) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
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
        if (!(obj instanceof lyh)) {
            return false;
        }
        lyh lyhVar = (lyh) obj;
        return Intrinsics.d(this.a, lyhVar.a) && this.b.equals(lyhVar.b) && this.c.equals(lyhVar.c) && this.d.equals(lyhVar.d) && this.e == lyhVar.e && this.f == lyhVar.f && this.g.equals(lyhVar.g);
    }

    public final int hashCode() {
        String str = this.a;
        return this.g.hashCode() + ((this.f.hashCode() + f1d.a(this.e, (this.d.hashCode() + dfi.b(this.c, k5r.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31)) * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder m = f1d.m("MenuTabsBlock(title=", this.a, ", id=", this.b, ", tabs=");
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
