package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g63 implements k63 {
    public final Integer a;
    public final Boolean b;
    public final u2m c;
    public final u2m d;
    public final int e;

    public g63(Integer num, Boolean bool, u2m u2mVar, u2m u2mVar2, int i) {
        this.a = num;
        this.b = bool;
        this.c = u2mVar;
        this.d = u2mVar2;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g63)) {
            return false;
        }
        g63 g63Var = (g63) obj;
        return Intrinsics.d(this.a, g63Var.a) && Intrinsics.d(this.b, g63Var.b) && this.c.equals(g63Var.c) && this.d.equals(g63Var.d) && this.e == g63Var.e;
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Boolean bool = this.b;
        return Integer.hashCode(this.e) + ((this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (bool != null ? bool.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LikedTracksBlockLocalData(revision=");
        sb.append(this.a);
        sb.append(", allValuesRequired=");
        sb.append(this.b);
        sb.append(", likedPlaylist=");
        sb.append(this.c);
        sb.append(", dislikedPlaylist=");
        sb.append(this.d);
        sb.append(", likedPlaylistTrackCount=");
        return f1d.i(sb, this.e, ")");
    }
}
