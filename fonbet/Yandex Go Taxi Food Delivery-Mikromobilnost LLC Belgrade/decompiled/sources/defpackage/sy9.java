package defpackage;

import com.yandex.go.chargers.error.api.ChargersErrorUiState$Icon;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class sy9 {
    public final CharSequence a;
    public final CharSequence b;
    public final ry9 c;
    public final ry9 d;
    public final ChargersErrorUiState$Icon e;

    public sy9(CharSequence charSequence, CharSequence charSequence2, ry9 ry9Var, ry9 ry9Var2, ChargersErrorUiState$Icon chargersErrorUiState$Icon) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = ry9Var;
        this.d = ry9Var2;
        this.e = chargersErrorUiState$Icon;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sy9)) {
            return false;
        }
        sy9 sy9Var = (sy9) obj;
        return jl40.l(this.a, sy9Var.a) && jl40.l(this.b, sy9Var.b) && jl40.l(this.c, sy9Var.c) && jl40.l(this.d, sy9Var.d) && this.e == sy9Var.e;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + smw0.b(this.a.hashCode() * 31, 31, this.b)) * 31;
        ry9 ry9Var = this.d;
        return this.e.hashCode() + ((hashCode + (ry9Var == null ? 0 : ry9Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "ChargersErrorUiState(title=", ", subtitle=", ", primaryButton=");
        r.append(this.c);
        r.append(", secondaryButton=");
        r.append(this.d);
        r.append(", icon=");
        r.append(this.e);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
