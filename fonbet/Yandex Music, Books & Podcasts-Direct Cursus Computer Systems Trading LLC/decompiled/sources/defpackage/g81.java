package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g81 {
    public final int a;
    public final int b;
    public final int c;
    public final p43 d;
    public final int e;
    public final int f;
    public final int g;
    public final boolean h;

    public g81(int i, int i2, int i3, p43 p43Var) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = p43Var;
        int i4 = i + i2;
        this.e = i4;
        this.f = i3;
        int i5 = i4 + i3;
        this.g = i5;
        this.h = i5 == 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g81)) {
            return false;
        }
        g81 g81Var = (g81) obj;
        return this.a == g81Var.a && this.b == g81Var.b && this.c == g81Var.c && Intrinsics.d(this.d, g81Var.d);
    }

    public final int hashCode() {
        int a = f1d.a(this.c, f1d.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
        p43 p43Var = this.d;
        return a + (p43Var == null ? 0 : p43Var.a.hashCode());
    }

    public final String toString() {
        StringBuilder l = dfi.l("ArtistFamiliarToYouBlockData(waveTracksCount=", this.a, this.b, ", collectionTracksCount=", ", collectionAlbumsCount=");
        l.append(this.c);
        l.append(", analytics=");
        l.append(this.d);
        l.append(")");
        return l.toString();
    }
}
