package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class zxc implements byc {
    public final yxc a;

    public zxc(yxc yxcVar) {
        this.a = yxcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zxc) && Intrinsics.d(this.a, ((zxc) obj).a);
    }

    public final int hashCode() {
        yxc yxcVar = this.a;
        if (yxcVar == null) {
            return 0;
        }
        return yxcVar.hashCode();
    }

    public final String toString() {
        return "Initialized(info=" + this.a + ")";
    }
}
