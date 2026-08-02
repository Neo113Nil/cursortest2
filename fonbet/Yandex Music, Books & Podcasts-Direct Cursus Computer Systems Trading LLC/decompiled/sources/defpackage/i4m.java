package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i4m implements drf {
    public final nrf a;
    public final String b;

    public i4m(nrf nrfVar, String str) {
        this.a = nrfVar;
        this.b = str;
    }

    @Override // defpackage.drf
    public final nrf a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i4m)) {
            return false;
        }
        i4m i4mVar = (i4m) obj;
        return this.a.equals(i4mVar.a) && Intrinsics.d(this.b, i4mVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "PlaylistWithLikesBlock(meta=" + this.a + ", title=" + this.b + ")";
    }
}
