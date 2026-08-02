package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class u35 {
    public final cvl a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public u35(cvl cvlVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.a = cvlVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u35)) {
            return false;
        }
        u35 u35Var = (u35) obj;
        return Intrinsics.d(this.a, u35Var.a) && this.b == u35Var.b && this.c == u35Var.c && this.d == u35Var.d && this.e == u35Var.e && this.f == u35Var.f && this.g == u35Var.g && this.h == u35Var.h;
    }

    public final int hashCode() {
        cvl cvlVar = this.a;
        return Boolean.hashCode(this.h) + k5r.e(k5r.e(k5r.e(k5r.e(k5r.e(k5r.e((cvlVar == null ? 0 : cvlVar.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CollectionScreenState(favoritePlaylist=");
        sb.append(this.a);
        sb.append(", isNeedPlaylistSection=");
        sb.append(this.b);
        sb.append(", isNeedAlbumSection=");
        dfi.t(sb, this.c, ", isNeedBooksSection=", this.d, ", isNeedPodcastsSection=");
        dfi.t(sb, this.e, ", isNeedKidsSection=", this.f, ", isNeedDownloadedSection=");
        return v3w.g(sb, this.g, ", isNeedArtistSection=", this.h, ")");
    }
}
