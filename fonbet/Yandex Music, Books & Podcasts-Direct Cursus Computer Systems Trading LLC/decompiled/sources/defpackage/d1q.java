package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d1q implements g1q {
    public final String a;

    public d1q(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d1q) && Intrinsics.d(this.a, ((d1q) obj).a);
    }

    @Override // defpackage.g1q
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hrg.q("SharedGlagolAlbumId(albumId=", this.a, ")");
    }
}
