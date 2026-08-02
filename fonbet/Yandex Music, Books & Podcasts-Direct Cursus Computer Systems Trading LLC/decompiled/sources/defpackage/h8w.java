package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class h8w extends tcm {
    public final String a;
    public final String b;
    public final g8w c;
    public final vcm d;
    public final int e;
    public final g94 f;
    public final String g;

    public h8w(String str, String str2, g8w g8wVar, vcm vcmVar, int i, g94 g94Var, String str3) {
        this.a = str;
        this.b = str2;
        this.c = g8wVar;
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
        if (!(obj instanceof h8w)) {
            return false;
        }
        h8w h8wVar = (h8w) obj;
        return Intrinsics.d(this.a, h8wVar.a) && this.b.equals(h8wVar.b) && this.c.equals(h8wVar.c) && this.d.equals(h8wVar.d) && this.e == h8wVar.e && this.f == h8wVar.f && this.g.equals(h8wVar.g);
    }

    public final int hashCode() {
        String str = this.a;
        return this.g.hashCode() + ((this.f.hashCode() + f1d.a(this.e, (this.d.hashCode() + ((this.c.hashCode() + k5r.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b)) * 31)) * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder m = f1d.m("YandexBooksBannerBlock(title=", this.a, ", id=", this.b, ", banner=");
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
