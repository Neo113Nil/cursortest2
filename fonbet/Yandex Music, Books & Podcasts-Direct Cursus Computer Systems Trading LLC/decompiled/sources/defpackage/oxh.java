package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class oxh extends qgg {
    public final String a;
    public final qxh b;
    public final nxh c;
    public final tcm d;
    public final int e;
    public final i94 f;
    public final String g;

    public oxh(String str, qxh qxhVar, nxh nxhVar, tcm tcmVar, int i, i94 i94Var, String str2) {
        this.a = str;
        this.b = qxhVar;
        this.c = nxhVar;
        this.d = tcmVar;
        this.e = i;
        this.f = i94Var;
        this.g = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oxh)) {
            return false;
        }
        oxh oxhVar = (oxh) obj;
        return this.a.equals(oxhVar.a) && this.b.equals(oxhVar.b) && this.c == oxhVar.c && this.d.equals(oxhVar.d) && this.e == oxhVar.e && this.f == oxhVar.f && Intrinsics.d(this.g, oxhVar.g);
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + f1d.a(this.e, (this.d.hashCode() + ((this.c.hashCode() + f1d.a(this.b.a, this.a.hashCode() * 31, 31)) * 31)) * 31, 31)) * 31;
        String str = this.g;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MenuItemEntityAlias(title=");
        sb.append(this.a);
        sb.append(", icon=");
        sb.append(this.b);
        sb.append(", aliasType=");
        sb.append(this.c);
        sb.append(", parent=");
        sb.append(this.d);
        sb.append(", positionInParent=");
        sb.append(this.e);
        sb.append(", type=");
        sb.append(this.f);
        sb.append(", entityId=");
        return su4.o(sb, this.g, ")");
    }
}
