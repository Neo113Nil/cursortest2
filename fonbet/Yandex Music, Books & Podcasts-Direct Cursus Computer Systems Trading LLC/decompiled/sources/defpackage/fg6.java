package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class fg6 extends tcm {
    public final String a;
    public final String b;
    public final List c;
    public final vcm d;
    public final int e;
    public final g94 f;
    public final String g;

    public fg6(String str, String str2, List list, vcm vcmVar, int i, g94 g94Var, String str3) {
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
        if (!(obj instanceof fg6)) {
            return false;
        }
        fg6 fg6Var = (fg6) obj;
        return Intrinsics.d(this.a, fg6Var.a) && this.b.equals(fg6Var.b) && this.c.equals(fg6Var.c) && this.d.equals(fg6Var.d) && this.e == fg6Var.e && this.f == fg6Var.f && this.g.equals(fg6Var.g);
    }

    public final int hashCode() {
        String str = this.a;
        return this.g.hashCode() + ((this.f.hashCode() + f1d.a(this.e, (this.d.hashCode() + k5r.d(k5r.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c)) * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder m = f1d.m("ContinueListenBlock(title=", this.a, ", id=", this.b, ", elements=");
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
