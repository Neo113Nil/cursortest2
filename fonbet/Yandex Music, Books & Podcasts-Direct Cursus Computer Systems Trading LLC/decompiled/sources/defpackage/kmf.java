package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class kmf implements cri {
    public final String a;
    public final eri b;
    public final int c;
    public final dsi d;

    public kmf(String str, eri eriVar, int i, dsi dsiVar) {
        this.a = str;
        this.b = eriVar;
        this.c = i;
        this.d = dsiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kmf)) {
            return false;
        }
        kmf kmfVar = (kmf) obj;
        return Intrinsics.d(this.a, kmfVar.a) && this.b == kmfVar.b && this.c == kmfVar.c && this.d.equals(kmfVar.d);
    }

    @Override // defpackage.cri
    public final eri getType() {
        return this.b;
    }

    public final int hashCode() {
        String str = this.a;
        return this.d.a.hashCode() + f1d.a(this.c, (this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31, 31);
    }

    public final String toString() {
        return "LastRecentlyPlayedElement(id=" + this.a + ", type=" + this.b + ", position=" + this.c + ", data=" + this.d + ")";
    }
}
