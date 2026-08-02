package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class rus0 {
    public static final rus0 d = new rus0(0);
    public final int a;
    public final String b;
    public final int c;

    public rus0(int i, String str, int i2) {
        this.a = i;
        this.b = str;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rus0)) {
            return false;
        }
        rus0 rus0Var = (rus0) obj;
        return this.a == rus0Var.a && jl40.l(this.b, rus0Var.b) && this.c == rus0Var.c;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        return Integer.hashCode(this.c) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return oyr.m(this.c, Extension.C_BRAKE, unr0.v(this.a, "SlotStyleState(horizontalInset=", ", backgroundColor=", this.b, ", backgroundCornerRadius="));
    }

    public /* synthetic */ rus0(int i) {
        this(8, null, 0);
    }

    public rus0() {
        this(0);
    }
}
