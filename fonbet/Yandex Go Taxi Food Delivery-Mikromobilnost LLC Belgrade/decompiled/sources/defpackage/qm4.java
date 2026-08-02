package defpackage;

import com.yandex.go.design.compose.plus.text.PlusNewType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class qm4 {
    public final String a;
    public final mm4 b;
    public final PlusNewType c;
    public final quz0 d;

    public qm4(String str, mm4 mm4Var, PlusNewType plusNewType, quz0 quz0Var) {
        this.a = str;
        this.b = mm4Var;
        this.c = plusNewType;
        this.d = quz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qm4)) {
            return false;
        }
        qm4 qm4Var = (qm4) obj;
        return jl40.l(this.a, qm4Var.a) && jl40.l(this.b, qm4Var.b) && this.c == qm4Var.c && jl40.l(this.d, qm4Var.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        quz0 quz0Var = this.d;
        return hashCode + (quz0Var == null ? 0 : quz0Var.hashCode());
    }

    public final String toString() {
        return "PlusBadgeUiState(text=" + this.a + ", badgeStyle=" + this.b + ", plusNewType=" + this.c + ", tooltipContentUiState=" + this.d + Extension.C_BRAKE;
    }
}
