package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class kba {
    public final nwr a;
    public final cr b;

    public kba(nwr nwrVar, cr crVar) {
        nwrVar.getClass();
        crVar.getClass();
        this.a = nwrVar;
        this.b = crVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kba)) {
            return false;
        }
        kba kbaVar = (kba) obj;
        return Intrinsics.d(this.a, kbaVar.a) && Intrinsics.d(this.b, kbaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DownloadResult(syncEntities=" + this.a + ", dataToUpdate=" + this.b + ")";
    }
}
