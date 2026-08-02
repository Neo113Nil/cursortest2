package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class m3j implements cri {
    public final String a;
    public final eri b;
    public final int c;
    public final bri d;

    public m3j(String str, eri eriVar, int i, bri briVar) {
        this.a = str;
        this.b = eriVar;
        this.c = i;
        this.d = briVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m3j)) {
            return false;
        }
        m3j m3jVar = (m3j) obj;
        return Intrinsics.d(this.a, m3jVar.a) && this.b == m3jVar.b && this.c == m3jVar.c && this.d.equals(m3jVar.d);
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
        return "NewEpisodesButtonElement(id=" + this.a + ", type=" + this.b + ", position=" + this.c + ", data=" + this.d + ")";
    }
}
