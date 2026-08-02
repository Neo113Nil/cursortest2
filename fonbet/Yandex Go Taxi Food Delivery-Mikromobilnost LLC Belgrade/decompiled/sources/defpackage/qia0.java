package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlin.collections.EmptyList;

@gsq0
/* loaded from: classes2.dex */
public final class qia0 {
    public static final mia0 Companion = new mia0();
    public static final i3y[] f = {a.b(LazyThreadSafetyMode.PUBLICATION, new t7a0(14)), null, null, null, null};
    public final List a;
    public final String b;
    public final String c;
    public final String d;
    public final pia0 e;

    public /* synthetic */ qia0(int i, List list, String str, String str2, String str3, pia0 pia0Var) {
        if (31 != (i & 31)) {
            qje.Z(i, 31, lia0.a.getDescriptor());
            throw null;
        }
        this.a = list;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = pia0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qia0)) {
            return false;
        }
        qia0 qia0Var = (qia0) obj;
        return jl40.l(this.a, qia0Var.a) && jl40.l(this.b, qia0Var.b) && jl40.l(this.c, qia0Var.c) && jl40.l(this.d, qia0Var.d) && jl40.l(this.e, qia0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        return "PaymentScreenRequestDto(supportedFeatures=" + this.a + ", requestedScreenName=" + this.b + ", language=" + this.c + ", theme=" + this.d + ", params=" + this.e + ')';
    }

    public qia0(String str, String str2, pia0 pia0Var) {
        this.a = EmptyList.a;
        this.b = "SUCCESS";
        this.c = str;
        this.d = str2;
        this.e = pia0Var;
    }
}
