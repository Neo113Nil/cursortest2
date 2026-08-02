package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class dvl {
    public final iab a;
    public final ndc b;
    public final gvd c;
    public final boolean d;
    public final boolean e;

    public dvl(iab iabVar, ndc ndcVar, ivd ivdVar, boolean z, boolean z2) {
        ivdVar.getClass();
        this.a = iabVar;
        this.b = ndcVar;
        this.c = ivdVar;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dvl)) {
            return false;
        }
        dvl dvlVar = (dvl) obj;
        return this.a.equals(dvlVar.a) && Intrinsics.d(this.b, dvlVar.b) && Intrinsics.d(this.c, dvlVar.c) && this.d == dvlVar.d && this.e == dvlVar.e;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ndc ndcVar = this.b;
        return Boolean.hashCode(this.e) + k5r.e((this.c.hashCode() + ((hashCode + (ndcVar == null ? 0 : ndcVar.hashCode())) * 31)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaylistHeaderBlock(header=");
        sb.append(this.a);
        sb.append(", headerFilters=");
        sb.append(this.b);
        sb.append(", coverLoadState=");
        sb.append(this.c);
        sb.append(", hasTracks=");
        sb.append(this.d);
        sb.append(", canBeLiked=");
        return ouj.r(sb, this.e, ")");
    }
}
