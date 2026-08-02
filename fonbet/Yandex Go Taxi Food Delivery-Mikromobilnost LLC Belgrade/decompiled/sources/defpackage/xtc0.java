package defpackage;

import com.yandex.plus.core.graphql.type.HORIZONTAL_RULE;
import com.yandex.plus.core.graphql.type.VERTICAL_RULE;
import com.yandex.plus.core.graphql.type.WIDTH_TYPE;

/* loaded from: classes8.dex */
public final class xtc0 {
    public final wtc0 a;
    public final Integer b;
    public final HORIZONTAL_RULE c;
    public final VERTICAL_RULE d;
    public final Integer e;
    public final WIDTH_TYPE f;

    public xtc0(wtc0 wtc0Var, Integer num, HORIZONTAL_RULE horizontal_rule, VERTICAL_RULE vertical_rule, Integer num2, WIDTH_TYPE width_type) {
        this.a = wtc0Var;
        this.b = num;
        this.c = horizontal_rule;
        this.d = vertical_rule;
        this.e = num2;
        this.f = width_type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xtc0)) {
            return false;
        }
        xtc0 xtc0Var = (xtc0) obj;
        return this.a.equals(xtc0Var.a) && jl40.l(this.b, xtc0Var.b) && this.c == xtc0Var.c && this.d == xtc0Var.d && jl40.l(this.e, xtc0Var.e) && this.f == xtc0Var.f;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        HORIZONTAL_RULE horizontal_rule = this.c;
        int hashCode3 = (hashCode2 + (horizontal_rule == null ? 0 : horizontal_rule.hashCode())) * 31;
        VERTICAL_RULE vertical_rule = this.d;
        int hashCode4 = (hashCode3 + (vertical_rule == null ? 0 : vertical_rule.hashCode())) * 31;
        Integer num2 = this.e;
        return this.f.hashCode() + ((hashCode4 + (num2 != null ? num2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "PlaqueWidgetRules(displayRules=" + this.a + ", opacity=" + this.b + ", horizontalRule=" + this.c + ", verticalRule=" + this.d + ", widthFix=" + this.e + ", widthType=" + this.f + ')';
    }
}
