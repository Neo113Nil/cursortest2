package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class okg {

    @NotNull
    public static final nkg Companion = new nkg();
    public static final arf[] d = {null, null, btf.a(bwf.b, new hjg(12))};
    public final String a;
    public final String b;
    public final upi c;

    public /* synthetic */ okg(int i, String str, String str2, upi upiVar) {
        if (7 != (i & 7)) {
            u7g.V(i, 7, mkg.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = upiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof okg)) {
            return false;
        }
        okg okgVar = (okg) obj;
        return Intrinsics.d(this.a, okgVar.a) && Intrinsics.d(this.b, okgVar.b) && Intrinsics.d(this.c, okgVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "LocalExperiments(testIds=" + this.a + ", triggeredTestIds=" + this.b + ", flags=" + this.c + ')';
    }

    public okg(String str, String str2, upi upiVar) {
        this.a = str;
        this.b = str2;
        this.c = upiVar;
    }
}
