package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class t8l implements u8l {
    public final n7q a;

    public t8l(n7q n7qVar) {
        n7qVar.getClass();
        this.a = n7qVar;
    }

    @Override // defpackage.u8l
    public final n7q a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t8l) && Intrinsics.d(this.a, ((t8l) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Unsuspend(queueState=" + this.a + ")";
    }
}
