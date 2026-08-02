package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class qkk0 {
    public final qnk0 a;
    public final a741 b;
    public final mpk0 c;
    public final boolean d;
    public final dgk0 e;
    public final ykk0 f;
    public final String g;

    public qkk0(qnk0 qnk0Var, a741 a741Var, mpk0 mpk0Var, boolean z, dgk0 dgk0Var, ykk0 ykk0Var, String str) {
        this.a = qnk0Var;
        this.b = a741Var;
        this.c = mpk0Var;
        this.d = z;
        this.e = dgk0Var;
        this.f = ykk0Var;
        this.g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qkk0)) {
            return false;
        }
        qkk0 qkk0Var = (qkk0) obj;
        return this.a.equals(qkk0Var.a) && jl40.l(this.b, qkk0Var.b) && jl40.l(this.c, qkk0Var.c) && this.d == qkk0Var.d && jl40.l(this.e, qkk0Var.e) && jl40.l(this.f, qkk0Var.f) && jl40.l(this.g, qkk0Var.g);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        a741 a741Var = this.b;
        int hashCode2 = (hashCode + (a741Var == null ? 0 : a741Var.hashCode())) * 31;
        mpk0 mpk0Var = this.c;
        int e = unr0.e((hashCode2 + (mpk0Var == null ? 0 : mpk0Var.a.hashCode())) * 31, 31, this.d);
        dgk0 dgk0Var = this.e;
        return this.g.hashCode() + ((this.f.hashCode() + ((e + (dgk0Var != null ? dgk0Var.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RideCardModalUiState(rideCardState=");
        sb.append(this.a);
        sb.append(", walkingInfoState=");
        sb.append(this.b);
        sb.append(", topDecoration=");
        sb.append(this.c);
        sb.append(", hasButtonFooter=");
        sb.append(this.d);
        sb.append(", doneButtonState=");
        sb.append(this.e);
        sb.append(", modalViewState=");
        sb.append(this.f);
        sb.append(", backButtonBadgeText=");
        return oyr.t(sb, this.g, Extension.C_BRAKE);
    }
}
