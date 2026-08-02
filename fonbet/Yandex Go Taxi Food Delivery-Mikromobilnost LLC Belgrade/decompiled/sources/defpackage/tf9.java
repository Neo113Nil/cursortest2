package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class tf9 extends vf9 {
    public final Integer a;
    public final boolean b;

    public tf9(Integer num, boolean z) {
        this.a = num;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tf9)) {
            return false;
        }
        tf9 tf9Var = (tf9) obj;
        return jl40.l(this.a, tf9Var.a) && this.b == tf9Var.b;
    }

    public final int hashCode() {
        Integer num = this.a;
        return Boolean.hashCode(this.b) + ((num == null ? 0 : num.hashCode()) * 31);
    }

    public final String toString() {
        return "Idle(etaSeconds=" + this.a + ", shouldUseFloor=" + this.b + Extension.C_BRAKE;
    }

    public tf9() {
        this(0);
    }

    public /* synthetic */ tf9(int i) {
        this(null, false);
    }
}
