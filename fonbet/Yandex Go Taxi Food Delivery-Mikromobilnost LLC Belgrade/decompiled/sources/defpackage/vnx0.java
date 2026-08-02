package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class vnx0 {
    public final int a;
    public final bpl0 b;

    public vnx0(int i, bpl0 bpl0Var) {
        this.a = i;
        this.b = bpl0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vnx0)) {
            return false;
        }
        vnx0 vnx0Var = (vnx0) obj;
        return this.a == vnx0Var.a && jl40.l(this.b, vnx0Var.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "TariffSelectorUiState(selectedTariffCellIndex=" + this.a + ", compoundTariffCells=" + this.b + Extension.C_BRAKE;
    }
}
