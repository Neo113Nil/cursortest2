package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class cwu implements kwu {
    public final iwu a;
    public final String b;

    public cwu(iwu iwuVar, String str) {
        iwuVar.getClass();
        str.getClass();
        this.a = iwuVar;
        this.b = str;
    }

    @Override // defpackage.jwu
    public final iwu a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cwu)) {
            return false;
        }
        cwu cwuVar = (cwu) obj;
        return Intrinsics.d(this.a, cwuVar.a) && Intrinsics.d(this.b, cwuVar.b);
    }

    @Override // defpackage.kwu
    public final String getName() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "NotInPlayer(waveInfo=" + this.a + ", name=" + this.b + ")";
    }
}
