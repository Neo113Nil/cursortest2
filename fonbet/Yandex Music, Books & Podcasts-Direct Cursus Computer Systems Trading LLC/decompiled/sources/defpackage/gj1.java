package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class gj1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;

    public gj1(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16) {
        ai1 ai1Var = ai1.a;
        eta.s(str, str2, str3, str4, str5);
        eta.s(str6, str7, str8, str9, str10);
        eta.s(str11, str12, str13, str14, str15);
        str16.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = str10;
        this.k = str11;
        this.l = str12;
        this.m = str13;
        this.n = str14;
        this.o = str15;
        this.p = str16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gj1)) {
            return false;
        }
        gj1 gj1Var = (gj1) obj;
        ai1 ai1Var = ai1.a;
        return ai1Var.equals(ai1Var) && Intrinsics.d(this.a, gj1Var.a) && Intrinsics.d(this.b, gj1Var.b) && Intrinsics.d(this.c, gj1Var.c) && Intrinsics.d(this.d, gj1Var.d) && Intrinsics.d(this.e, gj1Var.e) && Intrinsics.d(this.f, gj1Var.f) && Intrinsics.d(this.g, gj1Var.g) && Intrinsics.d(this.h, gj1Var.h) && Intrinsics.d(this.i, gj1Var.i) && Intrinsics.d(this.j, gj1Var.j) && Intrinsics.d(this.k, gj1Var.k) && Intrinsics.d(this.l, gj1Var.l) && Intrinsics.d(this.m, gj1Var.m) && Intrinsics.d(this.n, gj1Var.n) && Intrinsics.d(this.o, gj1Var.o) && Intrinsics.d(this.p, gj1Var.p);
    }

    public final int hashCode() {
        return this.p.hashCode() + k5r.c(k5r.c(k5r.c(k5r.c(k5r.c(k5r.c(k5r.c(k5r.c(k5r.c(k5r.c(k5r.c(k5r.c(k5r.c(k5r.c(k5r.c(ai1.a.hashCode() * 31, 31, this.a), 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o);
    }

    public final String toString() {
        ai1 ai1Var = ai1.a;
        StringBuilder sb = new StringBuilder("ArtistScreenStringResources(noNetworkMessage=");
        sb.append(ai1Var);
        sb.append(", popularTracksTitle=");
        sb.append(this.a);
        sb.append(", downloadedAlbumsTitle=");
        su4.v(sb, this.b, ", downloadedTracksTitle=", this.c, ", albumsBlockTitle=");
        su4.v(sb, this.d, ", studioAlbumsBlockTitle=", this.e, ", playlistsBlockTitle=");
        su4.v(sb, this.f, ", compilationsBlockTitle=", this.g, ", similarArtistsBlockTitle=");
        su4.v(sb, this.h, ", clipsBlockTitle=", this.i, ", concertsBlockTitle=");
        su4.v(sb, this.j, ", donationsBlockTitle=", this.k, ", familiarYouTitle=");
        su4.v(sb, this.l, ", aboutTitle=", this.m, ", pickTitle=");
        su4.v(sb, this.n, ", releaseTitle=", this.o, ", preSaveTitle=");
        return su4.o(sb, this.p, ")");
    }
}
