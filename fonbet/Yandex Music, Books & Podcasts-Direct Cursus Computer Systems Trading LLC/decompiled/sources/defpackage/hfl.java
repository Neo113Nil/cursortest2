package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class hfl implements jfl {
    public final mqs a;
    public final wdl b;

    public hfl(mqs mqsVar, wdl wdlVar) {
        mqsVar.getClass();
        this.a = mqsVar;
        this.b = wdlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hfl)) {
            return false;
        }
        hfl hflVar = (hfl) obj;
        return Intrinsics.d(this.a, hflVar.a) && this.b.equals(hflVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "Available(track=" + this.a + ", informer=" + this.b + ")";
    }
}
