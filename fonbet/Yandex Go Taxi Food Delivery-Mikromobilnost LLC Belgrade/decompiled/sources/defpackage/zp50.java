package defpackage;

import com.yandex.plus.home.datasource.openapi.models.NetworkComparePredicateModel$CompareType;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class zp50 implements ry50 {
    public static final yp50 Companion = new yp50();
    public static final i3y[] e = {null, null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new rk50(17))};
    public final String a;
    public final String b;
    public final xy50 c;
    public final NetworkComparePredicateModel$CompareType d;

    public /* synthetic */ zp50(int i, String str, String str2, xy50 xy50Var, NetworkComparePredicateModel$CompareType networkComparePredicateModel$CompareType) {
        if (15 != (i & 15)) {
            qje.Z(i, 15, xp50.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = xy50Var;
        this.d = networkComparePredicateModel$CompareType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zp50)) {
            return false;
        }
        zp50 zp50Var = (zp50) obj;
        return jl40.l(this.a, zp50Var.a) && jl40.l(this.b, zp50Var.b) && jl40.l(this.c, zp50Var.c) && this.d == zp50Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "NetworkComparePredicateModel(type=" + this.a + ", argName=" + this.b + ", primitiveArg=" + this.c + ", compareType=" + this.d + ')';
    }
}
