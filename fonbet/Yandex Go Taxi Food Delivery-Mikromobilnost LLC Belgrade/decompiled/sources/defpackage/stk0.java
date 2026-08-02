package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class stk0 {
    public final ctk0 a;
    public final msk0 b;
    public final qtk0 c;
    public final rtk0 d;
    public final kuk0 e;
    public final String f;

    public stk0(ctk0 ctk0Var, msk0 msk0Var, qtk0 qtk0Var, rtk0 rtk0Var, kuk0 kuk0Var, String str) {
        this.a = ctk0Var;
        this.b = msk0Var;
        this.c = qtk0Var;
        this.d = rtk0Var;
        this.e = kuk0Var;
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof stk0)) {
            return false;
        }
        stk0 stk0Var = (stk0) obj;
        return this.a.equals(stk0Var.a) && this.b.equals(stk0Var.b) && jl40.l(this.c, stk0Var.c) && this.d.equals(stk0Var.d) && jl40.l(this.e, stk0Var.e) && this.f.equals(stk0Var.f);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        qtk0 qtk0Var = this.c;
        int hashCode2 = (this.d.hashCode() + ((hashCode + (qtk0Var == null ? 0 : qtk0Var.a.hashCode())) * 31)) * 31;
        kuk0 kuk0Var = this.e;
        return this.f.hashCode() + ((hashCode2 + (kuk0Var != null ? kuk0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "RoadUiState(leadUiState=" + this.a + ", bodyUiState=" + this.b + ", trail2UiState=" + this.c + ", trailUiState=" + this.d + ", uiAction=" + this.e + ", contentDescription=" + this.f + Extension.C_BRAKE;
    }
}
