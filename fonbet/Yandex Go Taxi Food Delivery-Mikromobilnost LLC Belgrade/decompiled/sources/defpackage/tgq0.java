package defpackage;

import com.ybsdk.feature.autotopup.internal.domain.entities.regular.FrequencyType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class tgq0 {
    public final FrequencyType a;
    public final b730 b;
    public final b730 c;
    public final fk11 d;

    public tgq0(FrequencyType frequencyType, b730 b730Var, b730 b730Var2, fk11 fk11Var) {
        this.a = frequencyType;
        this.b = b730Var;
        this.c = b730Var2;
        this.d = fk11Var;
    }

    public final b730 a() {
        return this.c;
    }

    public final b730 b() {
        return this.b;
    }

    public final fk11 c() {
        return this.d;
    }

    public final FrequencyType d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tgq0)) {
            return false;
        }
        tgq0 tgq0Var = (tgq0) obj;
        return this.a == tgq0Var.a && jl40.l(this.b, tgq0Var.b) && jl40.l(this.c, tgq0Var.c) && jl40.l(this.d, tgq0Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        b730 b730Var = this.b;
        int hashCode2 = (hashCode + (b730Var == null ? 0 : b730Var.hashCode())) * 31;
        b730 b730Var2 = this.c;
        int hashCode3 = (hashCode2 + (b730Var2 == null ? 0 : b730Var2.hashCode())) * 31;
        fk11 fk11Var = this.d;
        return hashCode3 + (fk11Var != null ? fk11Var.hashCode() : 0);
    }

    public final String toString() {
        return "SelectedFrequencyOptionViewItem(type=" + this.a + ", oncePerWeek=" + this.b + ", oncePerMonth=" + this.c + ", twicePerMonth=" + this.d + Extension.C_BRAKE;
    }
}
