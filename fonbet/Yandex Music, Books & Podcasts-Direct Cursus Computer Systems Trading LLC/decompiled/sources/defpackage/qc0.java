package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class qc0 extends wc0 {
    public final oq a;
    public final mqs b;
    public final boolean c;

    public qc0(oq oqVar, mqs mqsVar) {
        oqVar.getClass();
        this.a = oqVar;
        this.b = mqsVar;
        this.c = oqVar.F.isEmpty();
    }

    @Override // defpackage.wc0
    public final boolean a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qc0)) {
            return false;
        }
        qc0 qc0Var = (qc0) obj;
        return Intrinsics.d(this.a, qc0Var.a) && Intrinsics.d(this.b, qc0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.a.hashCode() * 31;
        mqs mqsVar = this.b;
        return hashCode + (mqsVar == null ? 0 : mqsVar.a.hashCode());
    }

    public final String toString() {
        return "AlbumAndroidAutoPlayableItem(album=" + this.a + ", startWithTrack=" + this.b + ")";
    }
}
