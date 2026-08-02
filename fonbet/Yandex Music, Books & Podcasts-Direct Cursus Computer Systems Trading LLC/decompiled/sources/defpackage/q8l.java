package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class q8l implements u8l {
    public final n7q a;
    public final n4q b;

    public q8l(n7q n7qVar, n4q n4qVar) {
        n7qVar.getClass();
        n4qVar.getClass();
        this.a = n7qVar;
        this.b = n4qVar;
    }

    @Override // defpackage.u8l
    public final n7q a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q8l)) {
            return false;
        }
        q8l q8lVar = (q8l) obj;
        return Intrinsics.d(this.a, q8lVar.a) && Intrinsics.d(this.b, q8lVar.b);
    }

    public final int hashCode() {
        return Float.hashCode(this.b.a) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SetPlaybackVolume(queueState=" + this.a + ", volume=" + this.b + ")";
    }
}
