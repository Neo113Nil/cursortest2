package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class x630 {
    public final boolean a;
    public final Integer b;

    public x630(boolean z, Integer num) {
        this.a = z;
        this.b = num;
    }

    public final Integer a() {
        return this.b;
    }

    public final boolean b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x630)) {
            return false;
        }
        x630 x630Var = (x630) obj;
        return this.a == x630Var.a && jl40.l(this.b, x630Var.b);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        Integer num = this.b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "SaveResult(isLastDay=" + this.a + ", day=" + this.b + Extension.C_BRAKE;
    }
}
