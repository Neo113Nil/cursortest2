package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class njg implements ujg {

    @NotNull
    public static final mjg Companion = new mjg();
    public static final arf[] e;
    public final String a;
    public final String b;
    public final fjg c;
    public final tpi d;

    static {
        bwf bwfVar = bwf.b;
        e = new arf[]{null, null, btf.a(bwfVar, new hjg(2)), btf.a(bwfVar, new hjg(3))};
    }

    public /* synthetic */ njg(int i, String str, String str2, fjg fjgVar, tpi tpiVar) {
        if (15 != (i & 15)) {
            u7g.V(i, 15, ljg.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = fjgVar;
        this.d = tpiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof njg)) {
            return false;
        }
        njg njgVar = (njg) obj;
        return Intrinsics.d(this.a, njgVar.a) && Intrinsics.d(this.b, njgVar.b) && Intrinsics.d(this.c, njgVar.c) && Intrinsics.d(this.d, njgVar.d);
    }

    public final int hashCode() {
        int c = k5r.c(this.a.hashCode() * 31, 31, this.b);
        fjg fjgVar = this.c;
        return this.d.hashCode() + ((c + (fjgVar == null ? 0 : ((ejg) fjgVar).a.hashCode())) * 31);
    }

    @Override // defpackage.ujg
    public final fjg q() {
        return this.c;
    }

    public final String toString() {
        return "Gift(id=" + this.a + ", title=" + this.b + ", action=" + this.c + ", metricContext=" + this.d + ')';
    }

    public njg(String str, String str2, ejg ejgVar, tpi tpiVar) {
        this.a = str;
        this.b = str2;
        this.c = ejgVar;
        this.d = tpiVar;
    }
}
