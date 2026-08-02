package defpackage;

import com.yandex.go.scooters.misc.api.attention.domain.ScootersAttention$Chelka$Style;

/* loaded from: classes13.dex */
public final class vym0 implements xym0 {
    public final String a;
    public final ScootersAttention$Chelka$Style b;
    public final CharSequence c;
    public final String d;
    public final uym0 e;

    public vym0(String str, ScootersAttention$Chelka$Style scootersAttention$Chelka$Style, CharSequence charSequence, String str2, uym0 uym0Var) {
        this.a = str;
        this.b = scootersAttention$Chelka$Style;
        this.c = charSequence;
        this.d = str2;
        this.e = uym0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!vym0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        vym0 vym0Var = obj instanceof vym0 ? (vym0) obj : null;
        return jl40.l(this.a, vym0Var != null ? vym0Var.a : null);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
