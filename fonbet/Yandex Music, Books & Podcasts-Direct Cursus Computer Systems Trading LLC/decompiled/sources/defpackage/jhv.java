package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class jhv {
    public final f2v a;
    public final fhv b;

    public jhv(f2v f2vVar, fhv fhvVar) {
        this.a = f2vVar;
        this.b = fhvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jhv)) {
            return false;
        }
        jhv jhvVar = (jhv) obj;
        return this.a.equals(jhvVar.a) && Intrinsics.d(this.b, jhvVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        fhv fhvVar = this.b;
        return hashCode + (fhvVar == null ? 0 : fhvVar.hashCode());
    }

    public final String toString() {
        return "LoadedWheelState(playableSource=" + this.a + ", wheel=" + this.b + ")";
    }
}
