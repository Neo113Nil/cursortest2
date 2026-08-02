package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class xqs0 {
    public final xss0 a;
    public final wqs0 b;

    public xqs0(xss0 xss0Var, wqs0 wqs0Var) {
        this.a = xss0Var;
        this.b = wqs0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xqs0)) {
            return false;
        }
        xqs0 xqs0Var = (xqs0) obj;
        return this.a.equals(xqs0Var.a) && jl40.l(this.b, xqs0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SlotItemButtonUiState(slotItemState=" + this.a + ", properties=" + this.b + Extension.C_BRAKE;
    }
}
