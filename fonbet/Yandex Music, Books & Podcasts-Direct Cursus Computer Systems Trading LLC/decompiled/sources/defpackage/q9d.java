package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class q9d implements r9d {
    public final fhi a;

    public q9d(fhi fhiVar) {
        fhiVar.getClass();
        this.a = fhiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q9d) && Intrinsics.d(this.a, ((q9d) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(group=" + this.a + ")";
    }
}
