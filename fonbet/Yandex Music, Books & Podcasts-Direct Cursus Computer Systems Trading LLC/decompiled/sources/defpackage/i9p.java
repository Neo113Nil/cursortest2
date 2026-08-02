package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i9p implements k7h {
    public final String a;

    public i9p(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i9p) && Intrinsics.d(this.a, ((i9p) obj).a);
    }

    @Override // defpackage.g9p
    public final String getTag() {
        return this.a;
    }

    @Override // defpackage.g9p
    public final String getType() {
        return "album";
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hrg.q("SeedAlbum(tag=", this.a, ")");
    }
}
