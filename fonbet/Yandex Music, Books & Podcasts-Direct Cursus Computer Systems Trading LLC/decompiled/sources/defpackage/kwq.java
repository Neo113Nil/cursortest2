package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class kwq extends lwq {
    public final ptq a;

    public kwq(ptq ptqVar) {
        ptqVar.getClass();
        this.a = ptqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kwq) && Intrinsics.d(this.a, ((kwq) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(uiData=" + this.a + ")";
    }
}
