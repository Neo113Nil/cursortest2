package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class rnu {
    public final String a;
    public final String b;

    public rnu(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rnu)) {
            return false;
        }
        rnu rnuVar = (rnu) obj;
        return Intrinsics.d(this.a, rnuVar.a) && Intrinsics.d(this.b, rnuVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return hrg.s("WaveColors(average=", this.a, ", waveText=", this.b, ")");
    }
}
