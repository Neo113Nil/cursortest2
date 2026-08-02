package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class xxd extends md {

    @NotNull
    public static final wxd Companion = new wxd();
    public final String a;
    public final bjn b;

    public xxd(int i, String str, bjn bjnVar) {
        if (1 != (i & 1)) {
            u7g.V(i, 1, vxd.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) != 0) {
            this.b = bjnVar;
        } else {
            bjn.Companion.getClass();
            this.b = bjn.b;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xxd) || !xxd.class.equals(obj.getClass())) {
            return false;
        }
        xxd xxdVar = (xxd) obj;
        return Intrinsics.d(this.a, xxdVar.a) && Intrinsics.d(this.b, xxdVar.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "HideOverlayAction(tag=" + this.a + ", customProps=" + this.b + ")";
    }
}
