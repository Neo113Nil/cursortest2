package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class az2 {
    public final kbj a;
    public final boolean b;

    public az2(kbj kbjVar, boolean z) {
        kbjVar.getClass();
        this.a = kbjVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof az2)) {
            return false;
        }
        az2 az2Var = (az2) obj;
        return Intrinsics.d(this.a, az2Var.a) && this.b == az2Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BestResultNonMusicUiData(nonMusicListItemUiData=" + this.a + ", available=" + this.b + ")";
    }
}
