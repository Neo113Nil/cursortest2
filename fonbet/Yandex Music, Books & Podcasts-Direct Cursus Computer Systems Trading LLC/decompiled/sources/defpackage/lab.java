package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class lab implements nab {
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;

    public lab(int i, int i2, int i3, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    @Override // defpackage.nab
    public final String a() {
        return this.b;
    }

    @Override // defpackage.nab
    public final int b() {
        return this.c;
    }

    @Override // defpackage.nab
    public final String c() {
        return this.a;
    }

    @Override // defpackage.nab
    public final int d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lab)) {
            return false;
        }
        lab labVar = (lab) obj;
        return Intrinsics.d(this.a, labVar.a) && Intrinsics.d(this.b, labVar.b) && this.c == labVar.c && this.d == labVar.d && this.e == labVar.e;
    }

    @Override // defpackage.nab
    public final int getCount() {
        return this.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + f1d.a(this.d, f1d.a(this.c, k5r.c(this.a.hashCode() * 31, 31, this.b), 31), 31);
    }

    public final String toString() {
        StringBuilder m = f1d.m("RemoteBlock(entityTypeString=", this.a, ", entityId=", this.b, ", positionX=");
        hrg.w(this.c, this.d, ", positionY=", ", count=", m);
        return f1d.i(m, this.e, ")");
    }
}
