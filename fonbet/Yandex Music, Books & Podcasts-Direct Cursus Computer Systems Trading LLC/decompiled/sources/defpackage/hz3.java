package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class hz3 implements drf {
    public final nrf a;
    public final String b;
    public final int c;
    public final boolean d;

    public hz3(nrf nrfVar, String str, int i, boolean z) {
        nrfVar.getClass();
        this.a = nrfVar;
        this.b = str;
        this.c = i;
        this.d = z;
    }

    @Override // defpackage.drf
    public final nrf a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hz3)) {
            return false;
        }
        hz3 hz3Var = (hz3) obj;
        return Intrinsics.d(this.a, hz3Var.a) && Intrinsics.d(this.b, hz3Var.b) && this.c == hz3Var.c && this.d == hz3Var.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.d) + f1d.a(this.c, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        return "CarouselArtistsBlock(meta=" + this.a + ", title=" + this.b + ", artistSize=" + this.c + ", hasMore=" + this.d + ")";
    }
}
