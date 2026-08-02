package defpackage;

import defpackage.c3f;

/* loaded from: classes.dex */
public final class v54 extends c3f.e.AbstractC0027e {
    public final int a;
    public final String b;
    public final String c;
    public final boolean d;

    public v54(String str, int i, String str2, boolean z) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    @Override // c3f.e.AbstractC0027e
    public final String a() {
        return this.c;
    }

    @Override // c3f.e.AbstractC0027e
    public final int b() {
        return this.a;
    }

    @Override // c3f.e.AbstractC0027e
    public final String c() {
        return this.b;
    }

    @Override // c3f.e.AbstractC0027e
    public final boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c3f.e.AbstractC0027e)) {
            return false;
        }
        c3f.e.AbstractC0027e abstractC0027e = (c3f.e.AbstractC0027e) obj;
        return this.a == abstractC0027e.b() && this.b.equals(abstractC0027e.c()) && this.c.equals(abstractC0027e.a()) && this.d == abstractC0027e.d();
    }

    public final int hashCode() {
        return (this.d ? 1231 : 1237) ^ ((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OperatingSystem{platform=");
        sb.append(this.a);
        sb.append(", version=");
        sb.append(this.b);
        sb.append(", buildVersion=");
        sb.append(this.c);
        sb.append(", jailbroken=");
        return x4e.i(sb, this.d, "}");
    }
}
