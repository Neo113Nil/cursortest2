package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class zcb implements cdb {
    public final yxc a;

    public zcb(yxc yxcVar) {
        yxcVar.getClass();
        this.a = yxcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zcb) && Intrinsics.d(this.a, ((zcb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ReadyToSync(userInfo=" + this.a + ")";
    }
}
