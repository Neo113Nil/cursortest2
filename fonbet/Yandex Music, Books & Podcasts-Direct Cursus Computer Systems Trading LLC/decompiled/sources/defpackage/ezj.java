package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class ezj extends md {

    @NotNull
    public static final dzj Companion = new dzj();
    public static final arf[] f;
    public final t5a a;
    public final q2a b;
    public final Boolean c;
    public final Boolean d;
    public final bjn e;

    static {
        bwf bwfVar = bwf.b;
        f = new arf[]{btf.a(bwfVar, new s9j(22)), btf.a(bwfVar, new s9j(23)), null, null, null};
    }

    public ezj(int i, t5a t5aVar, q2a q2aVar, Boolean bool, Boolean bool2, bjn bjnVar) {
        if (15 != (i & 15)) {
            u7g.V(i, 15, czj.a.getDescriptor());
            throw null;
        }
        this.a = t5aVar;
        this.b = q2aVar;
        this.c = bool;
        this.d = bool2;
        if ((i & 16) != 0) {
            this.e = bjnVar;
        } else {
            bjn.Companion.getClass();
            this.e = bjn.b;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ezj.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        ezj ezjVar = (ezj) obj;
        return Intrinsics.d(this.a, ezjVar.a) && Intrinsics.d(this.b, ezjVar.b) && Intrinsics.d(this.c, ezjVar.c) && Intrinsics.d(this.d, ezjVar.d) && Intrinsics.d(this.e, ezjVar.e);
    }

    public final int hashCode() {
        t5a t5aVar = this.a;
        int hashCode = (t5aVar != null ? t5aVar.hashCode() : 0) * 31;
        q2a q2aVar = this.b;
        int hashCode2 = (hashCode + (q2aVar != null ? q2aVar.hashCode() : 0)) * 31;
        Boolean bool = this.c;
        int hashCode3 = (hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.d;
        return this.e.a.hashCode() + ((hashCode3 + (bool2 != null ? bool2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "OverlayAction(query=" + this.a + ", document=" + this.b + ", animated=" + this.c + ", fullscreen=" + this.d + ", customProps=" + this.e + ")";
    }
}
