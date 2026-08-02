package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class wbl {
    public final kes a;

    public wbl(kes kesVar) {
        this.a = kesVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!wbl.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return Intrinsics.d(this.a, ((wbl) obj).a);
    }

    public final int hashCode() {
        kes kesVar = this.a;
        if (kesVar != null) {
            return Long.hashCode(kesVar.a);
        }
        return 0;
    }

    public final String toString() {
        return "PlayerDebugViewConfig(fontSize=" + this.a + ')';
    }
}
