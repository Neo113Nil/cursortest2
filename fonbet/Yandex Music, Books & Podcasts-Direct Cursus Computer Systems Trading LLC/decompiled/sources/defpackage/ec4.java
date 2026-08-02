package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ec4 {
    public final int a;
    public final Integer b;
    public final mqs c;
    public final mqs d;

    public ec4(int i, Integer num, mqs mqsVar, mqs mqsVar2) {
        mqsVar2.getClass();
        this.a = i;
        this.b = num;
        this.c = mqsVar;
        this.d = mqsVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ec4)) {
            return false;
        }
        ec4 ec4Var = (ec4) obj;
        return this.a == ec4Var.a && Intrinsics.d(this.b, ec4Var.b) && Intrinsics.d(this.c, ec4Var.c) && Intrinsics.d(this.d, ec4Var.d);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        mqs mqsVar = this.c;
        return this.d.a.hashCode() + ((hashCode2 + (mqsVar != null ? mqsVar.a.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ChangedTrackInfo(oldPositionChangedTrack=" + this.a + ", newPositionChangedTrack=" + this.b + ", oldTrackInNewPosition=" + this.c + ", changedTrack=" + this.d + ")";
    }
}
