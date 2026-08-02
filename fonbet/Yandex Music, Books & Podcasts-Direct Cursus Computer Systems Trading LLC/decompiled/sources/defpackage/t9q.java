package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class t9q implements z9q {
    public final String a;

    public t9q(String str) {
        str.getClass();
        this.a = str;
    }

    @Override // defpackage.z9q
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t9q) && Intrinsics.d(this.a, ((t9q) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hrg.q("AlbumId(albumId=", this.a, ")");
    }
}
