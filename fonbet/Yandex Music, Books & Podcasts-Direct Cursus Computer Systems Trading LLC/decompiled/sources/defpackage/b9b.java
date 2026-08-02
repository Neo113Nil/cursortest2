package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b9b implements c9b {
    public final fhi a;

    public b9b(fhi fhiVar) {
        fhiVar.getClass();
        this.a = fhiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b9b) && Intrinsics.d(this.a, ((b9b) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(group=" + this.a + ")";
    }
}
