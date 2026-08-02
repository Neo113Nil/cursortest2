package defpackage;

/* loaded from: classes4.dex */
public final class e0w implements g0w {
    public final int a;
    public final int b;
    public final float c;
    public final String d;
    public final boolean e;

    public e0w(int i, int i2, float f, String str, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = str;
        this.e = z;
    }

    @Override // defpackage.g0w
    public final boolean a() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0w)) {
            return false;
        }
        e0w e0wVar = (e0w) obj;
        return this.a == e0wVar.a && this.b == e0wVar.b && Float.compare(this.c, e0wVar.c) == 0 && this.d.equals(e0wVar.d) && this.e == e0wVar.e;
    }

    @Override // defpackage.g0w
    public final String getText() {
        return this.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + k5r.c(eta.a(f1d.a(this.b, Integer.hashCode(this.a) * 31, 31), this.c, 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder l = dfi.l("ForNewUser(likedArtistCount=", this.a, this.b, ", stageIndex=", ", stageProgress=");
        l.append(this.c);
        l.append(", text=");
        l.append(this.d);
        l.append(", isSaveAvailable=");
        return ouj.r(l, this.e, ")");
    }
}
