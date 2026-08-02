package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class kzl implements mzl {
    public final po6 a;
    public final mqs b;

    public kzl(po6 po6Var, mqs mqsVar) {
        mqsVar.getClass();
        this.a = po6Var;
        this.b = mqsVar;
    }

    @Override // defpackage.mzl
    public final mqs a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kzl)) {
            return false;
        }
        kzl kzlVar = (kzl) obj;
        return this.a.equals(kzlVar.a) && Intrinsics.d(this.b, kzlVar.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CoverTrack(coverTrackUiData=" + this.a + ", track=" + this.b + ")";
    }
}
