package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class se4 {
    public final v1g a;
    public final String b;
    public final kf4 c;

    public se4(v1g v1gVar, String str, kf4 kf4Var) {
        str.getClass();
        this.a = v1gVar;
        this.b = str;
        this.c = kf4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof se4)) {
            return false;
        }
        se4 se4Var = (se4) obj;
        return this.a.equals(se4Var.a) && Intrinsics.d(this.b, se4Var.b) && this.c == se4Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "ChartAlbumGridItemUiData(likedEntityItemUiData=" + this.a + ", trackPosition=" + this.b + ", progress=" + this.c + ")";
    }
}
