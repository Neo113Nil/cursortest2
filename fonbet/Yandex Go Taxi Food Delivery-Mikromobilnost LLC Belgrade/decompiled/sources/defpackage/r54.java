package defpackage;

import defpackage.c3f;

/* loaded from: classes.dex */
public final class r54 extends c3f.e.d.AbstractC0026e.b {
    public final String a;
    public final String b;

    public r54(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // c3f.e.d.AbstractC0026e.b
    public final String a() {
        return this.a;
    }

    @Override // c3f.e.d.AbstractC0026e.b
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c3f.e.d.AbstractC0026e.b)) {
            return false;
        }
        c3f.e.d.AbstractC0026e.b bVar = (c3f.e.d.AbstractC0026e.b) obj;
        return this.a.equals(bVar.a()) && this.b.equals(bVar.b());
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutVariant{rolloutId=");
        sb.append(this.a);
        sb.append(", variantId=");
        return oyr.t(sb, this.b, "}");
    }
}
