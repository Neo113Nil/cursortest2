package defpackage;

/* loaded from: classes3.dex */
public final class jab implements nab {
    public final qkb a;
    public final int b;
    public final int c;
    public final int d;
    public final String e;
    public final String f;

    public jab(qkb qkbVar, int i, int i2, int i3) {
        qkbVar.getClass();
        this.a = qkbVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        String str = qkbVar.a;
        this.e = str;
        this.f = str;
    }

    @Override // defpackage.nab
    public final String a() {
        return this.f;
    }

    @Override // defpackage.nab
    public final int b() {
        return this.b;
    }

    @Override // defpackage.nab
    public final String c() {
        return this.e;
    }

    @Override // defpackage.nab
    public final int d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jab)) {
            return false;
        }
        jab jabVar = (jab) obj;
        return this.a == jabVar.a && this.b == jabVar.b && this.c == jabVar.c && this.d == jabVar.d;
    }

    @Override // defpackage.nab
    public final int getCount() {
        return this.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + f1d.a(this.c, f1d.a(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "ClientDataBlock(entityType=" + this.a + ", positionX=" + this.b + ", positionY=" + this.c + ", count=" + this.d + ")";
    }
}
