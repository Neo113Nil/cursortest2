package defpackage;

import defpackage.c3f;

/* loaded from: classes.dex */
public final class z44 extends c3f.e.d.a.b.AbstractC0014a {
    public final long a;
    public final long b;
    public final String c;
    public final String d;

    public z44(long j, String str, long j2, String str2) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
    }

    @Override // c3f.e.d.a.b.AbstractC0014a
    public final long a() {
        return this.a;
    }

    @Override // c3f.e.d.a.b.AbstractC0014a
    public final String b() {
        return this.c;
    }

    @Override // c3f.e.d.a.b.AbstractC0014a
    public final long c() {
        return this.b;
    }

    @Override // c3f.e.d.a.b.AbstractC0014a
    public final String d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c3f.e.d.a.b.AbstractC0014a)) {
            return false;
        }
        c3f.e.d.a.b.AbstractC0014a abstractC0014a = (c3f.e.d.a.b.AbstractC0014a) obj;
        if (this.a != abstractC0014a.a() || this.b != abstractC0014a.c() || !this.c.equals(abstractC0014a.b())) {
            return false;
        }
        String str = this.d;
        return str == null ? abstractC0014a.d() == null : str.equals(abstractC0014a.d());
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int hashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.c.hashCode()) * 1000003;
        String str = this.d;
        return (str == null ? 0 : str.hashCode()) ^ hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BinaryImage{baseAddress=");
        sb.append(this.a);
        sb.append(", size=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.c);
        sb.append(", uuid=");
        return oyr.t(sb, this.d, "}");
    }
}
