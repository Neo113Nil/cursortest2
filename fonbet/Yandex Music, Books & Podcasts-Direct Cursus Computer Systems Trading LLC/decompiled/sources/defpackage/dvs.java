package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class dvs implements fvs {
    public final oq a;
    public final List b;

    public dvs(oq oqVar, List list) {
        oqVar.getClass();
        list.getClass();
        this.a = oqVar;
        this.b = list;
    }

    @Override // defpackage.fvs
    public final List a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dvs)) {
            return false;
        }
        dvs dvsVar = (dvs) obj;
        return Intrinsics.d(this.a, dvsVar.a) && Intrinsics.d(this.b, dvsVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "AlbumTrackDownloadMeta(album=" + this.a + ", tracks=" + this.b + ")";
    }
}
