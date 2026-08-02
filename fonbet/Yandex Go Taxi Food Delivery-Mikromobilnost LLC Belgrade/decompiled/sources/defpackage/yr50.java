package defpackage;

import com.yandex.plus.home.datasource.openapi.models.NetworkDisplayRulesModel$HorizontalGravity;
import com.yandex.plus.home.datasource.openapi.models.NetworkDisplayRulesModel$VerticalGravity;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class yr50 {
    public static final xr50 Companion = new xr50();
    public static final i3y[] h;
    public final k260 a;
    public final List b;
    public final qo50 c;
    public final Integer d;
    public final ov50 e;
    public final NetworkDisplayRulesModel$HorizontalGravity f;
    public final NetworkDisplayRulesModel$VerticalGravity g;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        h = new i3y[]{null, a.b(lazyThreadSafetyMode, new rk50(21)), null, null, null, a.b(lazyThreadSafetyMode, new rk50(22)), a.b(lazyThreadSafetyMode, new rk50(23))};
    }

    public /* synthetic */ yr50(int i, k260 k260Var, List list, qo50 qo50Var, Integer num, ov50 ov50Var, NetworkDisplayRulesModel$HorizontalGravity networkDisplayRulesModel$HorizontalGravity, NetworkDisplayRulesModel$VerticalGravity networkDisplayRulesModel$VerticalGravity) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, wr50.a.getDescriptor());
            throw null;
        }
        this.a = k260Var;
        this.b = list;
        this.c = qo50Var;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = ov50Var;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = networkDisplayRulesModel$HorizontalGravity;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = networkDisplayRulesModel$VerticalGravity;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yr50)) {
            return false;
        }
        yr50 yr50Var = (yr50) obj;
        return jl40.l(this.a, yr50Var.a) && jl40.l(this.b, yr50Var.b) && jl40.l(this.c, yr50Var.c) && jl40.l(this.d, yr50Var.d) && jl40.l(this.e, yr50Var.e) && this.f == yr50Var.f && this.g == yr50Var.g;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + unr0.c(this.a.hashCode() * 31, 31, this.b)) * 31;
        Integer num = this.d;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        ov50 ov50Var = this.e;
        int hashCode3 = (hashCode2 + (ov50Var == null ? 0 : ov50Var.hashCode())) * 31;
        NetworkDisplayRulesModel$HorizontalGravity networkDisplayRulesModel$HorizontalGravity = this.f;
        int hashCode4 = (hashCode3 + (networkDisplayRulesModel$HorizontalGravity == null ? 0 : networkDisplayRulesModel$HorizontalGravity.hashCode())) * 31;
        NetworkDisplayRulesModel$VerticalGravity networkDisplayRulesModel$VerticalGravity = this.g;
        return hashCode4 + (networkDisplayRulesModel$VerticalGravity != null ? networkDisplayRulesModel$VerticalGravity.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkDisplayRulesModel(widthType=" + this.a + ", backgroundColors=" + this.b + ", backgroundShape=" + this.c + ", opacity=" + this.d + ", indents=" + this.e + ", horizontalGravity=" + this.f + ", verticalGravity=" + this.g + ')';
    }
}
