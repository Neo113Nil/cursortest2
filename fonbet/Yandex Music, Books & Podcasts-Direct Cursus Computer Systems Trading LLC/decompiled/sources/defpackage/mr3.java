package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class mr3 {
    public final c01 a;
    public final List b;

    public mr3(c01 c01Var, List list) {
        c01Var.getClass();
        list.getClass();
        this.a = c01Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mr3)) {
            return false;
        }
        mr3 mr3Var = (mr3) obj;
        return Intrinsics.d(this.a, mr3Var.a) && Intrinsics.d(this.b, mr3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "ArtistPlaybackStartInfo(artist=" + this.a + ", popularTracks=" + this.b + ")";
    }
}
