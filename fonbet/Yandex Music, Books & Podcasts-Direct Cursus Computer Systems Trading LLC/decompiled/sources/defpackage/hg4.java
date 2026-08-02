package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class hg4 {
    public final mqs a;
    public final zf4 b;

    public hg4(zf4 zf4Var, mqs mqsVar) {
        mqsVar.getClass();
        this.a = mqsVar;
        this.b = zf4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hg4)) {
            return false;
        }
        hg4 hg4Var = (hg4) obj;
        return Intrinsics.d(this.a, hg4Var.a) && this.b.equals(hg4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "ChartTracksBlockUiItem(modelTrack=" + this.a + ", chartTrackUiData=" + this.b + ")";
    }
}
