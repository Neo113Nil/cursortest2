package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c21 {
    public final String a;
    public final String b;

    public c21(String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c21)) {
            return false;
        }
        c21 c21Var = (c21) obj;
        return Intrinsics.d(this.a, c21Var.a) && Intrinsics.d(this.b, c21Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return hrg.s("ArtistBottomSheetStringResources(waveHeaderTitle=", this.a, ", listenersCountTitle=", this.b, ")");
    }
}
