package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class q62 {
    public final ggj a;
    public final wdu b;
    public final z91 c;
    public final omq0 d;
    public final lej0 e;
    public final me3 f;

    public q62(ggj ggjVar, wdu wduVar, z91 z91Var, omq0 omq0Var, lej0 lej0Var, me3 me3Var) {
        this.a = ggjVar;
        this.b = wduVar;
        this.c = z91Var;
        this.d = omq0Var;
        this.e = lej0Var;
        this.f = me3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q62)) {
            return false;
        }
        q62 q62Var = (q62) obj;
        return jl40.l(this.a, q62Var.a) && jl40.l(this.b, q62Var.b) && jl40.l(this.c, q62Var.c) && jl40.l(this.d, q62Var.d) && jl40.l(this.e, q62Var.e) && jl40.l(this.f, q62Var.f);
    }

    public final int hashCode() {
        ggj ggjVar = this.a;
        int hashCode = (ggjVar == null ? 0 : ggjVar.hashCode()) * 31;
        wdu wduVar = this.b;
        int hashCode2 = (hashCode + (wduVar == null ? 0 : wduVar.hashCode())) * 31;
        z91 z91Var = this.c;
        int hashCode3 = (this.d.hashCode() + ((hashCode2 + (z91Var == null ? 0 : z91Var.hashCode())) * 31)) * 31;
        lej0 lej0Var = this.e;
        int hashCode4 = (hashCode3 + (lej0Var == null ? 0 : lej0Var.hashCode())) * 31;
        me3 me3Var = this.f;
        return hashCode4 + (me3Var != null ? me3Var.hashCode() : 0);
    }

    public final String toString() {
        return "AnchoredSummaryContentUiState(dialogueUiState=" + this.a + ", headerUiState=" + this.b + ", addressesUiState=" + this.c + ", selectorUiState=" + this.d + ", requirementChipsUiState=" + this.e + ", auctionUiState=" + this.f + Extension.C_BRAKE;
    }
}
