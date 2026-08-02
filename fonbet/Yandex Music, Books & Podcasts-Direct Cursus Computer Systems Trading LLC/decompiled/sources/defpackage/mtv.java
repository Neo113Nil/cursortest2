package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class mtv implements otv {
    public final zrv a;
    public final String b;
    public final wrv c;

    public mtv(zrv zrvVar, String str, wrv wrvVar) {
        str.getClass();
        this.a = zrvVar;
        this.b = str;
        this.c = wrvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mtv)) {
            return false;
        }
        mtv mtvVar = (mtv) obj;
        return this.a.equals(mtvVar.a) && Intrinsics.d(this.b, mtvVar.b) && this.c.equals(mtvVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "LikeWithRecommendations(artist=" + this.a + ", genreId=" + this.b + ", center=" + this.c + ")";
    }
}
