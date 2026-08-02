package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class l21 implements cri {
    public final String a;
    public final eri b;
    public final int c;
    public final bri d;

    public l21(String str, eri eriVar, int i, bri briVar) {
        this.a = str;
        this.b = eriVar;
        this.c = i;
        this.d = briVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l21)) {
            return false;
        }
        l21 l21Var = (l21) obj;
        return Intrinsics.d(this.a, l21Var.a) && this.b == l21Var.b && this.c == l21Var.c && this.d.equals(l21Var.d);
    }

    @Override // defpackage.cri
    public final eri getType() {
        return this.b;
    }

    public final int hashCode() {
        String str = this.a;
        return this.d.hashCode() + f1d.a(this.c, (this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31, 31);
    }

    public final String toString() {
        return "ArtistButtonElement(id=" + this.a + ", type=" + this.b + ", position=" + this.c + ", data=" + this.d + ")";
    }
}
