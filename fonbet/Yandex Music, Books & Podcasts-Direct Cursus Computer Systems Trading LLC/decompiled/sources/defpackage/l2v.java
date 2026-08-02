package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l2v {
    public final k2v a;
    public final eml b;

    public l2v(k2v k2vVar, eml emlVar) {
        emlVar.getClass();
        this.a = k2vVar;
        this.b = emlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2v)) {
            return false;
        }
        l2v l2vVar = (l2v) obj;
        return this.a.equals(l2vVar.a) && Intrinsics.d(this.b, l2vVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WaveScreenPlayableUiState(uiData=" + this.a + ", likeUiState=" + this.b + ")";
    }
}
