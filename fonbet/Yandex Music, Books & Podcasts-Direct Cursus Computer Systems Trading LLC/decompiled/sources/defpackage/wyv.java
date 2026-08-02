package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class wyv implements xyv {
    public final jtv a;
    public final zzv b;

    public wyv(jtv jtvVar, zzv zzvVar) {
        zzvVar.getClass();
        this.a = jtvVar;
        this.b = zzvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wyv)) {
            return false;
        }
        wyv wyvVar = (wyv) obj;
        return this.a.equals(wyvVar.a) && Intrinsics.d(this.b, wyvVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OneToOne(coordinatesInFocus=" + this.a + ", playerState=" + this.b + ")";
    }
}
