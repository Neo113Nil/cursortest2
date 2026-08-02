package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class wdf implements drf {
    public final nrf a;
    public final String b;

    public wdf(nrf nrfVar, String str) {
        this.a = nrfVar;
        this.b = str;
    }

    @Override // defpackage.drf
    public final nrf a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wdf)) {
            return false;
        }
        wdf wdfVar = (wdf) obj;
        return this.a.equals(wdfVar.a) && Intrinsics.d(this.b, wdfVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "KidsFavouriteSectionsBlock(meta=" + this.a + ", title=" + this.b + ")";
    }
}
