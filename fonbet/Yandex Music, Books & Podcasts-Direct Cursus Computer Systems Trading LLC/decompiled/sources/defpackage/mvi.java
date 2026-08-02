package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class mvi extends nvi {
    public final zab a;

    public mvi(zab zabVar) {
        zabVar.getClass();
        this.a = zabVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mvi) && Intrinsics.d(this.a, ((mvi) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PromoBlock(promotionBlock=" + this.a + ")";
    }
}
