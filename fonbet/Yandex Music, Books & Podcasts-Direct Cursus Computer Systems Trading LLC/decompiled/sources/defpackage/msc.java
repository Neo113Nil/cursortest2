package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class msc extends md {

    @NotNull
    public static final lsc Companion = new lsc();
    public static final arf[] e;
    public final t5a a;
    public final q2a b;
    public final Boolean c;
    public final bjn d;

    static {
        bwf bwfVar = bwf.b;
        e = new arf[]{btf.a(bwfVar, new htb(9)), btf.a(bwfVar, new htb(10)), null, null};
    }

    public msc(int i, t5a t5aVar, q2a q2aVar, Boolean bool, bjn bjnVar) {
        if (7 != (i & 7)) {
            u7g.V(i, 7, ksc.a.getDescriptor());
            throw null;
        }
        this.a = t5aVar;
        this.b = q2aVar;
        this.c = bool;
        if ((i & 8) != 0) {
            this.d = bjnVar;
        } else {
            bjn.Companion.getClass();
            this.d = bjn.b;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof msc) || !msc.class.equals(obj.getClass())) {
            return false;
        }
        msc mscVar = (msc) obj;
        return Intrinsics.d(this.a, mscVar.a) && Intrinsics.d(this.b, mscVar.b) && Intrinsics.d(this.c, mscVar.c) && Intrinsics.d(this.d, mscVar.d);
    }

    public final int hashCode() {
        t5a t5aVar = this.a;
        int hashCode = (t5aVar != null ? t5aVar.hashCode() : 0) * 31;
        q2a q2aVar = this.b;
        int hashCode2 = (hashCode + (q2aVar != null ? q2aVar.hashCode() : 0)) * 31;
        Boolean bool = this.c;
        return this.d.a.hashCode() + ((hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ForwardAction(query=" + this.a + ", document=" + this.b + ", animated=" + this.c + ", customProps=" + this.d + ")";
    }
}
