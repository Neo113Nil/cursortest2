package defpackage;

import defpackage.c3f;

/* loaded from: classes.dex */
public final class r44 extends c3f.e.c {
    public final int a;
    public final String b;
    public final int c;
    public final long d;
    public final long e;
    public final boolean f;
    public final int g;
    public final String h;
    public final String i;

    public r44(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = j;
        this.e = j2;
        this.f = z;
        this.g = i3;
        this.h = str2;
        this.i = str3;
    }

    @Override // c3f.e.c
    public final int a() {
        return this.a;
    }

    @Override // c3f.e.c
    public final int b() {
        return this.c;
    }

    @Override // c3f.e.c
    public final long c() {
        return this.e;
    }

    @Override // c3f.e.c
    public final String d() {
        return this.h;
    }

    @Override // c3f.e.c
    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c3f.e.c)) {
            return false;
        }
        c3f.e.c cVar = (c3f.e.c) obj;
        return this.a == cVar.a() && this.b.equals(cVar.e()) && this.c == cVar.b() && this.d == cVar.g() && this.e == cVar.c() && this.f == cVar.i() && this.g == cVar.h() && this.h.equals(cVar.d()) && this.i.equals(cVar.f());
    }

    @Override // c3f.e.c
    public final String f() {
        return this.i;
    }

    @Override // c3f.e.c
    public final long g() {
        return this.d;
    }

    @Override // c3f.e.c
    public final int h() {
        return this.g;
    }

    public final int hashCode() {
        int hashCode = (((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003;
        long j = this.d;
        int i = (hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.e;
        return this.i.hashCode() ^ ((((((((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ this.g) * 1000003) ^ this.h.hashCode()) * 1000003);
    }

    @Override // c3f.e.c
    public final boolean i() {
        return this.f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Device{arch=");
        sb.append(this.a);
        sb.append(", model=");
        sb.append(this.b);
        sb.append(", cores=");
        sb.append(this.c);
        sb.append(", ram=");
        sb.append(this.d);
        sb.append(", diskSpace=");
        sb.append(this.e);
        sb.append(", simulator=");
        sb.append(this.f);
        sb.append(", state=");
        sb.append(this.g);
        sb.append(", manufacturer=");
        sb.append(this.h);
        sb.append(", modelClass=");
        return oyr.t(sb, this.i, "}");
    }
}
