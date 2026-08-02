package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class xac0 {
    public final Boolean a;
    public final Integer b;
    public final boolean c;

    public xac0(Boolean bool, Integer num, boolean z) {
        this.a = bool;
        this.b = num;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xac0)) {
            return false;
        }
        xac0 xac0Var = (xac0) obj;
        return jl40.l(this.a, xac0Var.a) && jl40.l(this.b, xac0Var.b) && this.c == xac0Var.c;
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SliderMapUpdatesConfig(selectedOrgOutlivesMapUpdates=");
        sb.append(this.a);
        sb.append(", orgsToKeepBeforeSelected=");
        sb.append(this.b);
        sb.append(", showSelectedSliderPinOnly=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }
}
