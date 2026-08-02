package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class p8l implements u8l {
    public final n7q a;
    public final h4q b;

    public p8l(n7q n7qVar, h4q h4qVar) {
        n7qVar.getClass();
        h4qVar.getClass();
        this.a = n7qVar;
        this.b = h4qVar;
    }

    @Override // defpackage.u8l
    public final n7q a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p8l)) {
            return false;
        }
        p8l p8lVar = (p8l) obj;
        return Intrinsics.d(this.a, p8lVar.a) && Intrinsics.d(this.b, p8lVar.b);
    }

    public final int hashCode() {
        return Float.hashCode(this.b.a) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SetPlaybackSpeed(queueState=" + this.a + ", speed=" + this.b + ")";
    }
}
