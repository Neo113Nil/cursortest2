package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class vh6 implements xh6 {
    public final k10 a;
    public final mqs b;

    public vh6(k10 k10Var, mqs mqsVar) {
        k10Var.getClass();
        mqsVar.getClass();
        this.a = k10Var;
        this.b = mqsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vh6)) {
            return false;
        }
        vh6 vh6Var = (vh6) obj;
        return Intrinsics.d(this.a, vh6Var.a) && Intrinsics.d(this.b, vh6Var.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "QueueAlbumItem(albumTrack=" + this.a + ", track=" + this.b + ")";
    }
}
