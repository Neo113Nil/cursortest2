package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.data.stores.CoverPath;

/* loaded from: classes4.dex */
public final class i21 {
    public final c01 a;
    public final List b;
    public final kjm c;
    public final List d;
    public final List e;
    public final List f;
    public final List g;
    public final List h;
    public final nk2 i;
    public final List j;
    public final List k;
    public final nnk l;
    public final List m;
    public final List n;
    public final List o;
    public final List p;
    public final fk1 q;
    public final CoverPath r;
    public final String s;
    public final r1u t;
    public final ArrayList u;

    public i21(c01 c01Var, List list, kjm kjmVar, List list2, List list3, List list4, List list5, List list6, nk2 nk2Var, List list7, List list8, nnk nnkVar, List list9, List list10, List list11, List list12, fk1 fk1Var, CoverPath coverPath, String str, r1u r1uVar, ArrayList arrayList) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        list5.getClass();
        list6.getClass();
        list7.getClass();
        list8.getClass();
        list9.getClass();
        list10.getClass();
        list11.getClass();
        list12.getClass();
        this.a = c01Var;
        this.b = list;
        this.c = kjmVar;
        this.d = list2;
        this.e = list3;
        this.f = list4;
        this.g = list5;
        this.h = list6;
        this.i = nk2Var;
        this.j = list7;
        this.k = list8;
        this.l = nnkVar;
        this.m = list9;
        this.n = list10;
        this.o = list11;
        this.p = list12;
        this.q = fk1Var;
        this.r = coverPath;
        this.s = str;
        this.t = r1uVar;
        this.u = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i21)) {
            return false;
        }
        i21 i21Var = (i21) obj;
        return this.a.equals(i21Var.a) && Intrinsics.d(this.b, i21Var.b) && Intrinsics.d(this.c, i21Var.c) && Intrinsics.d(this.d, i21Var.d) && Intrinsics.d(this.e, i21Var.e) && Intrinsics.d(this.f, i21Var.f) && Intrinsics.d(this.g, i21Var.g) && Intrinsics.d(this.h, i21Var.h) && Intrinsics.d(this.i, i21Var.i) && Intrinsics.d(this.j, i21Var.j) && Intrinsics.d(this.k, i21Var.k) && Intrinsics.d(this.l, i21Var.l) && Intrinsics.d(this.m, i21Var.m) && Intrinsics.d(this.n, i21Var.n) && Intrinsics.d(this.o, i21Var.o) && Intrinsics.d(this.p, i21Var.p) && Intrinsics.d(this.q, i21Var.q) && this.r.equals(i21Var.r) && Intrinsics.d(this.s, i21Var.s) && Intrinsics.d(this.t, i21Var.t) && Intrinsics.d(this.u, i21Var.u);
    }

    public final int hashCode() {
        int d = k5r.d(this.a.a.hashCode() * 31, 31, this.b);
        kjm kjmVar = this.c;
        int d2 = k5r.d(k5r.d(k5r.d(k5r.d(k5r.d((d + (kjmVar == null ? 0 : kjmVar.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
        nk2 nk2Var = this.i;
        int d3 = k5r.d(k5r.d((d2 + (nk2Var == null ? 0 : nk2Var.hashCode())) * 31, 31, this.j), 31, this.k);
        nnk nnkVar = this.l;
        int d4 = k5r.d(k5r.d(k5r.d(k5r.d((d3 + (nnkVar == null ? 0 : nnkVar.hashCode())) * 31, 31, this.m), 31, this.n), 31, this.o), 31, this.p);
        fk1 fk1Var = this.q;
        int hashCode = (this.r.hashCode() + ((d4 + (fk1Var == null ? 0 : fk1Var.hashCode())) * 31)) * 31;
        String str = this.s;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        r1u r1uVar = this.t;
        int hashCode3 = (hashCode2 + (r1uVar == null ? 0 : r1uVar.hashCode())) * 961;
        ArrayList arrayList = this.u;
        return hashCode3 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArtistBriefInfo(artist=");
        sb.append(this.a);
        sb.append(", albums=");
        sb.append(this.b);
        sb.append(", preSave=");
        sb.append(this.c);
        sb.append(", alsoAlbums=");
        sb.append(this.d);
        sb.append(", discography=");
        sb.append(this.e);
        sb.append(", lastReleasesAlbums=");
        sb.append(this.f);
        sb.append(", popularTracks=");
        sb.append(this.g);
        sb.append(", popularVideoClips=");
        sb.append(this.h);
        sb.append(", bandLink=");
        sb.append(this.i);
        sb.append(", links=");
        sb.append(this.j);
        sb.append(", similarArtists=");
        sb.append(this.k);
        sb.append(", artistPick=");
        sb.append(this.l);
        sb.append(", allCovers=");
        sb.append(this.m);
        sb.append(", concerts=");
        sb.append(this.n);
        sb.append(", lastReleaseIds=");
        sb.append(this.o);
        sb.append(", playlists=");
        sb.append(this.p);
        sb.append(", stats=");
        sb.append(this.q);
        sb.append(", bgImagePath=");
        sb.append(this.r);
        sb.append(", bgVideoUrl=");
        sb.append(this.s);
        sb.append(", vibeButtonInfo=");
        sb.append(this.t);
        sb.append(", lastReleaseAlbum=null, extraActions=");
        return vz1.t(sb, this.u, ")");
    }
}
