package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ezu {
    public final kcr a;
    public final Boolean b;

    public ezu(kcr kcrVar, Boolean bool) {
        kcrVar.getClass();
        this.a = kcrVar;
        this.b = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ezu)) {
            return false;
        }
        ezu ezuVar = (ezu) obj;
        return Intrinsics.d(this.a, ezuVar.a) && Intrinsics.d(this.b, ezuVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Boolean bool = this.b;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        return "StartParameters(position=" + this.a + ", isShuffleEnabled=" + this.b + ")";
    }
}
