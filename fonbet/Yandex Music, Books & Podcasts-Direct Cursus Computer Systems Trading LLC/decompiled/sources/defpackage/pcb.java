package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class pcb implements tcb {
    public final boolean a;
    public final yxc b;

    public pcb(yxc yxcVar, boolean z) {
        yxcVar.getClass();
        this.a = z;
        this.b = yxcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pcb)) {
            return false;
        }
        pcb pcbVar = (pcb) obj;
        return this.a == pcbVar.a && Intrinsics.d(this.b, pcbVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Close(shouldShowMainScreen=" + this.a + ", userInfo=" + this.b + ")";
    }
}
