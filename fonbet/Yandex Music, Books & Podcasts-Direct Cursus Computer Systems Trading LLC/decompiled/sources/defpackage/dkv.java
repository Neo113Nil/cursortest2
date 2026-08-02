package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class dkv implements ekv {
    public final fhv a;
    public final boolean b;

    public dkv(fhv fhvVar, boolean z) {
        fhvVar.getClass();
        this.a = fhvVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkv)) {
            return false;
        }
        dkv dkvVar = (dkv) obj;
        return Intrinsics.d(this.a, dkvVar.a) && this.b == dkvVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(wheel=" + this.a + ", isOffline=" + this.b + ")";
    }
}
