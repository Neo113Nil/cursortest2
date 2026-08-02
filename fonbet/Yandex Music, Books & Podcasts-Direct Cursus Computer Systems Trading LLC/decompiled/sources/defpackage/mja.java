package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class mja implements drf {
    public final nrf a;
    public final int b;

    public mja(nrf nrfVar, int i) {
        nrfVar.getClass();
        this.a = nrfVar;
        this.b = i;
    }

    @Override // defpackage.drf
    public final nrf a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mja)) {
            return false;
        }
        mja mjaVar = (mja) obj;
        return Intrinsics.d(this.a, mjaVar.a) && this.b == mjaVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DownloadedTracksBlock(meta=" + this.a + ", downloadedTracksCount=" + this.b + ")";
    }
}
