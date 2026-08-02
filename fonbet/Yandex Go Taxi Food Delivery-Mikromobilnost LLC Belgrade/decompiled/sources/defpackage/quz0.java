package defpackage;

import com.yandex.go.summary.ui.model.common.tooltip.TooltipAlignment;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class quz0 {
    public final wp2 a;
    public final TooltipAlignment b;
    public final euz0 c;
    public final tvz0 d;
    public final puz0 e;
    public final puz0 f;
    public final puz0 g;

    public quz0(wp2 wp2Var, TooltipAlignment tooltipAlignment, euz0 euz0Var, tvz0 tvz0Var, puz0 puz0Var, nuz0 nuz0Var, puz0 puz0Var2) {
        this.a = wp2Var;
        this.b = tooltipAlignment;
        this.c = euz0Var;
        this.d = tvz0Var;
        this.e = puz0Var;
        this.f = nuz0Var;
        this.g = puz0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof quz0)) {
            return false;
        }
        quz0 quz0Var = (quz0) obj;
        return jl40.l(this.a, quz0Var.a) && this.b == quz0Var.b && this.c.equals(quz0Var.c) && jl40.l(this.d, quz0Var.d) && this.e.equals(quz0Var.e) && jl40.l(this.f, quz0Var.f) && jl40.l(this.g, quz0Var.g);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        tvz0 tvz0Var = this.d;
        int hashCode2 = (this.e.hashCode() + ((hashCode + (tvz0Var == null ? 0 : tvz0Var.a.hashCode())) * 31)) * 31;
        puz0 puz0Var = this.f;
        int hashCode3 = (hashCode2 + (puz0Var == null ? 0 : puz0Var.hashCode())) * 31;
        puz0 puz0Var2 = this.g;
        return hashCode3 + (puz0Var2 != null ? puz0Var2.hashCode() : 0);
    }

    public final String toString() {
        return "TooltipContentUiState(backgroundColor=" + this.a + ", alignment=" + this.b + ", bodyUiState=" + this.c + ", trailUiState=" + this.d + ", shownUiAction=" + this.e + ", dismissedUiAction=" + this.f + ", clickedUiAction=" + this.g + Extension.C_BRAKE;
    }
}
