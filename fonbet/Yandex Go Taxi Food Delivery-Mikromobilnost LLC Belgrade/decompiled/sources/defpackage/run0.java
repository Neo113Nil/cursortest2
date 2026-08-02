package defpackage;

import com.yandex.go.scooters.insurance.suggest.v2.ScootersInsuranceSuggestV2UiState$Item$Action;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class run0 {
    public final CharSequence a;
    public final CharSequence b;
    public final String c;
    public final ScootersInsuranceSuggestV2UiState$Item$Action d;

    public run0(CharSequence charSequence, CharSequence charSequence2, String str, ScootersInsuranceSuggestV2UiState$Item$Action scootersInsuranceSuggestV2UiState$Item$Action) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = str;
        this.d = scootersInsuranceSuggestV2UiState$Item$Action;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof run0)) {
            return false;
        }
        run0 run0Var = (run0) obj;
        return jl40.l(this.a, run0Var.a) && jl40.l(this.b, run0Var.b) && jl40.l(this.c, run0Var.c) && this.d == run0Var.d;
    }

    public final int hashCode() {
        int b = unr0.b(smw0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        ScootersInsuranceSuggestV2UiState$Item$Action scootersInsuranceSuggestV2UiState$Item$Action = this.d;
        return b + (scootersInsuranceSuggestV2UiState$Item$Action == null ? 0 : scootersInsuranceSuggestV2UiState$Item$Action.hashCode());
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "Item(title=", ", subtitle=", ", leadIconTag=");
        r.append(this.c);
        r.append(", action=");
        r.append(this.d);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
