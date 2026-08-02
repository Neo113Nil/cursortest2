package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class nwn implements own {
    public final fhi a;

    public nwn(fhi fhiVar) {
        fhiVar.getClass();
        this.a = fhiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nwn) && Intrinsics.d(this.a, ((nwn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(group=" + this.a + ")";
    }
}
