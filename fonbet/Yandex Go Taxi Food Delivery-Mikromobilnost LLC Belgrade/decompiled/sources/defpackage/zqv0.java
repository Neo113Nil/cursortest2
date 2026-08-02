package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class zqv0 {
    public final ug00 a;
    public final aiv0 b;

    public zqv0(ug00 ug00Var, aiv0 aiv0Var) {
        this.a = ug00Var;
        this.b = aiv0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zqv0)) {
            return false;
        }
        zqv0 zqv0Var = (zqv0) obj;
        return jl40.l(this.a, zqv0Var.a) && jl40.l(this.b, zqv0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SummaryUiState(mapContentUiState=" + this.a + ", summaryModalBottomSheetUiState=" + this.b + Extension.C_BRAKE;
    }
}
