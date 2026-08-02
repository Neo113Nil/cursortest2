package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class fvo {
    public final wjb a;
    public final nab b;

    public fvo(wjb wjbVar, nab nabVar) {
        nabVar.getClass();
        this.a = wjbVar;
        this.b = nabVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fvo)) {
            return false;
        }
        fvo fvoVar = (fvo) obj;
        return this.a == fvoVar.a && Intrinsics.d(this.b, fvoVar.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
    }

    public final String toString() {
        return "ScreenNavigationData(evgenScreen=" + this.a + ", entityInfo=" + this.b + ", tabInfo=null)";
    }
}
