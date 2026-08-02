package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class q2c {
    public final ukd a;
    public final ukd b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ q2c(ukd ukdVar, int i) {
        this(r0, r3 != 0 ? r0 : ukdVar);
        int i2 = i & 2;
        skd skdVar = skd.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q2c)) {
            return false;
        }
        q2c q2cVar = (q2c) obj;
        return Intrinsics.d(this.a, q2cVar.a) && Intrinsics.d(this.b, q2cVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ExtractedSizeModifiers(sizeModifiers=" + this.a + ", nonSizeModifiers=" + this.b + ')';
    }

    public q2c(ukd ukdVar, ukd ukdVar2) {
        this.a = ukdVar;
        this.b = ukdVar2;
    }
}
