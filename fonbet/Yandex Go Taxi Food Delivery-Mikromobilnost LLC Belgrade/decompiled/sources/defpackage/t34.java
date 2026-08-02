package defpackage;

import defpackage.yz5;

/* loaded from: classes10.dex */
public final class t34 extends yz5.a {
    public final k590 a;
    public final int b;

    public t34(k590 k590Var, int i) {
        if (k590Var == null) {
            ny61.t("Null packet");
            throw null;
        }
        this.a = k590Var;
        this.b = i;
    }

    @Override // yz5.a
    public final int a() {
        return this.b;
    }

    @Override // yz5.a
    public final k590 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof yz5.a)) {
            return false;
        }
        yz5.a aVar = (yz5.a) obj;
        return this.a.equals(aVar.b()) && this.b == aVar.a();
    }

    public final int hashCode() {
        return this.b ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("In{packet=");
        sb.append(this.a);
        sb.append(", jpegQuality=");
        return oyr.m(this.b, "}", sb);
    }
}
