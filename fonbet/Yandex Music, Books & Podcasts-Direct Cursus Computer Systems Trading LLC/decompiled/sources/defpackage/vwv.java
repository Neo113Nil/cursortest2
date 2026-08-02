package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class vwv implements xwv {
    public final wrv a;
    public final wrv b;

    public vwv(wrv wrvVar, wrv wrvVar2) {
        wrvVar.getClass();
        this.a = wrvVar;
        this.b = wrvVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vwv)) {
            return false;
        }
        vwv vwvVar = (vwv) obj;
        return Intrinsics.d(this.a, vwvVar.a) && this.b.equals(vwvVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WithRecommendations(insertionInitiator=" + this.a + ", insertionCenter=" + this.b + ")";
    }
}
