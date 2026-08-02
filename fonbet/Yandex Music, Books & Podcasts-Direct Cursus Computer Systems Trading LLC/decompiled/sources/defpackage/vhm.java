package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class vhm {
    public final Map a;
    public final Map b;

    public vhm() {
        e5b e5bVar = e5b.a;
        e5bVar.getClass();
        e5bVar.getClass();
        this.a = e5bVar;
        this.b = e5bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!vhm.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        vhm vhmVar = (vhm) obj;
        return Intrinsics.d(this.a, vhmVar.a) && Intrinsics.d(this.b, vhmVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PortionParams(query=" + this.a + ", body=" + this.b + ")";
    }
}
