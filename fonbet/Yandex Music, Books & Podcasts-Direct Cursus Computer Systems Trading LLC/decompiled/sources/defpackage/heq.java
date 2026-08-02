package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class heq extends md {

    @NotNull
    public static final geq Companion = new geq();
    public static final arf[] k;
    public final t5a a;
    public final q2a b;
    public final Boolean c;
    public final Boolean d;
    public final Boolean e;
    public final Boolean f;
    public final Float g;
    public final Boolean h;
    public final bjn i;
    public final md j;

    static {
        bwf bwfVar = bwf.b;
        k = new arf[]{btf.a(bwfVar, new h2q(18)), btf.a(bwfVar, new h2q(19)), null, null, null, null, null, null, null, btf.a(bwfVar, new h2q(20))};
    }

    public heq(int i, t5a t5aVar, q2a q2aVar, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Float f, Boolean bool5, bjn bjnVar, md mdVar) {
        if (767 != (i & 767)) {
            u7g.V(i, 767, feq.a.getDescriptor());
            throw null;
        }
        this.a = t5aVar;
        this.b = q2aVar;
        this.c = bool;
        this.d = bool2;
        this.e = bool3;
        this.f = bool4;
        this.g = f;
        this.h = bool5;
        if ((i & 256) == 0) {
            bjn.Companion.getClass();
            this.i = bjn.b;
        } else {
            this.i = bjnVar;
        }
        this.j = mdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof heq) || !heq.class.equals(obj.getClass())) {
            return false;
        }
        heq heqVar = (heq) obj;
        return Intrinsics.d(this.a, heqVar.a) && Intrinsics.d(this.b, heqVar.b) && Intrinsics.d(this.c, heqVar.c) && Intrinsics.d(this.d, heqVar.d) && Intrinsics.d(this.e, heqVar.e) && Intrinsics.d(this.f, heqVar.f) && Intrinsics.c(this.g, heqVar.g) && Intrinsics.d(this.h, heqVar.h) && Intrinsics.d(this.i, heqVar.i) && Intrinsics.d(this.j, heqVar.j);
    }

    public final int hashCode() {
        t5a t5aVar = this.a;
        int hashCode = (t5aVar != null ? t5aVar.hashCode() : 0) * 31;
        q2a q2aVar = this.b;
        int hashCode2 = (hashCode + (q2aVar != null ? q2aVar.hashCode() : 0)) * 31;
        Boolean bool = this.c;
        int hashCode3 = (hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.d;
        int hashCode4 = (hashCode3 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Boolean bool3 = this.e;
        int hashCode5 = (hashCode4 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
        Boolean bool4 = this.f;
        int hashCode6 = (hashCode5 + (bool4 != null ? bool4.hashCode() : 0)) * 31;
        Float f = this.g;
        int hashCode7 = (hashCode6 + (f != null ? f.hashCode() : 0)) * 31;
        Boolean bool5 = this.h;
        int hashCode8 = (this.i.a.hashCode() + ((hashCode7 + (bool5 != null ? bool5.hashCode() : 0)) * 31)) * 31;
        md mdVar = this.j;
        return hashCode8 + (mdVar != null ? mdVar.hashCode() : 0);
    }

    public final String toString() {
        return "ShowPopupAction(query=" + this.a + ", document=" + this.b + ", fullscreen=" + this.c + ", closeOnSlideDown=" + this.d + ", closeOnTapOutside=" + this.e + ", dimBackground=" + this.f + ", defaultHeight=" + this.g + ", shouldLoadByQuery=" + this.h + ", customProps=" + this.i + ", completionAction=" + this.j + ")";
    }
}
