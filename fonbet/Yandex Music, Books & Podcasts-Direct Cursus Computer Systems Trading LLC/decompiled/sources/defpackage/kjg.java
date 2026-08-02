package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class kjg implements ujg {

    @NotNull
    public static final jjg Companion = new jjg();
    public static final arf[] e;
    public final String a;
    public final String b;
    public final fjg c;
    public final tpi d;

    static {
        bwf bwfVar = bwf.b;
        e = new arf[]{null, null, btf.a(bwfVar, new hjg(0)), btf.a(bwfVar, new hjg(1))};
    }

    public /* synthetic */ kjg(int i, String str, String str2, fjg fjgVar, tpi tpiVar) {
        if (15 != (i & 15)) {
            u7g.V(i, 15, ijg.a.getDescriptor());
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
        if (!(obj instanceof kjg)) {
            return false;
        }
        kjg kjgVar = (kjg) obj;
        return Intrinsics.d(this.a, kjgVar.a) && Intrinsics.d(this.b, kjgVar.b) && Intrinsics.d(this.c, kjgVar.c) && Intrinsics.d(this.d, kjgVar.d);
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
        return "Entry(id=" + this.a + ", title=" + this.b + ", action=" + this.c + ", metricContext=" + this.d + ')';
    }

    public kjg(String str, String str2, ejg ejgVar, tpi tpiVar) {
        this.a = str;
        this.b = str2;
        this.c = ejgVar;
        this.d = tpiVar;
    }
}
