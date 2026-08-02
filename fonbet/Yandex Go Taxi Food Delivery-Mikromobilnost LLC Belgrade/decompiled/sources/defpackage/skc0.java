package defpackage;

import com.yandex.plus.core.graphql.type.CORNER_SETTINGS;

/* loaded from: classes8.dex */
public final class skc0 {
    public final CORNER_SETTINGS a;
    public final Integer b;

    public skc0(CORNER_SETTINGS corner_settings, Integer num) {
        this.a = corner_settings;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof skc0)) {
            return false;
        }
        skc0 skc0Var = (skc0) obj;
        return this.a == skc0Var.a && jl40.l(this.b, skc0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaqueCorner(type=");
        sb.append(this.a);
        sb.append(", heightFix=");
        return vfc.o(sb, this.b, ')');
    }
}
