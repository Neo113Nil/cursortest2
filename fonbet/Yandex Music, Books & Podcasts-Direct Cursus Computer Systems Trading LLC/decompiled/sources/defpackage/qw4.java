package defpackage;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class qw4 {
    public final String a;
    public final Set b;

    public qw4(String str, Set set) {
        str.getClass();
        set.getClass();
        this.a = str;
        this.b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qw4)) {
            return false;
        }
        qw4 qw4Var = (qw4) obj;
        return Intrinsics.d(this.a, qw4Var.a) && Intrinsics.d(this.b, qw4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AlbumTracksId(albumId=" + this.a + ", trackIds=" + this.b + ")";
    }
}
