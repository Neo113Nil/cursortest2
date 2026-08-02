package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class yv {
    public final lt a;
    public final iab b;
    public final ry c;
    public final ly d;
    public final ny e;
    public final sy f;
    public final ty g;
    public final oy h;
    public final qy i;
    public final py j;
    public final my k;

    public yv(lt ltVar, iab iabVar, ry ryVar, ly lyVar, ny nyVar, sy syVar, ty tyVar, oy oyVar, qy qyVar, py pyVar, my myVar) {
        this.a = ltVar;
        this.b = iabVar;
        this.c = ryVar;
        this.d = lyVar;
        this.e = nyVar;
        this.f = syVar;
        this.g = tyVar;
        this.h = oyVar;
        this.i = qyVar;
        this.j = pyVar;
        this.k = myVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yv)) {
            return false;
        }
        yv yvVar = (yv) obj;
        return this.a.equals(yvVar.a) && this.b.equals(yvVar.b) && Intrinsics.d(this.c, yvVar.c) && Intrinsics.d(this.d, yvVar.d) && Intrinsics.d(this.e, yvVar.e) && this.f.equals(yvVar.f) && Intrinsics.d(this.g, yvVar.g) && Intrinsics.d(this.h, yvVar.h) && Intrinsics.d(this.i, yvVar.i) && Intrinsics.d(this.j, yvVar.j) && Intrinsics.d(this.k, yvVar.k);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        ry ryVar = this.c;
        int hashCode2 = (hashCode + (ryVar == null ? 0 : ryVar.a.hashCode())) * 31;
        ly lyVar = this.d;
        int hashCode3 = (hashCode2 + (lyVar == null ? 0 : lyVar.a.hashCode())) * 31;
        ny nyVar = this.e;
        int b = dfi.b(this.f.a, (hashCode3 + (nyVar == null ? 0 : nyVar.hashCode())) * 31, 31);
        ty tyVar = this.g;
        int hashCode4 = (b + (tyVar == null ? 0 : tyVar.hashCode())) * 31;
        oy oyVar = this.h;
        int hashCode5 = (hashCode4 + (oyVar == null ? 0 : oyVar.a.hashCode())) * 31;
        qy qyVar = this.i;
        int hashCode6 = (hashCode5 + (qyVar == null ? 0 : qyVar.a.hashCode())) * 31;
        py pyVar = this.j;
        return ((hashCode6 + (pyVar == null ? 0 : pyVar.a.hashCode())) * 31) + (this.k != null ? 588370049 : 0);
    }

    public final String toString() {
        return "AlbumLoadedScreenState(domainItem=" + this.a + ", header=" + this.b + ", similarEntities=" + this.c + ", brandedButton=" + this.d + ", donationCarousel=" + this.e + ", tracks=" + this.f + ", vibeButton=" + this.g + ", duplicateAlbums=" + this.h + ", sameGenreAlbums=" + this.i + ", moreAlbums=" + this.j + ", disableOffline=" + this.k + ")";
    }
}
