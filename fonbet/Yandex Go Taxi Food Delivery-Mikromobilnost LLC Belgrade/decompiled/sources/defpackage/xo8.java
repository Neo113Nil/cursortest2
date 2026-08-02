package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class xo8 {
    public final int a;
    public final vo8 b;

    public xo8(int i, vo8 vo8Var) {
        this.a = i;
        this.b = vo8Var;
    }

    public final int a() {
        return this.a;
    }

    public final vo8 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xo8)) {
            return false;
        }
        xo8 xo8Var = (xo8) obj;
        return this.a == xo8Var.a && this.b.equals(xo8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "CardSettingsTermViewState(bottomPaddingPx=" + this.a + ", state=" + this.b + Extension.C_BRAKE;
    }
}
