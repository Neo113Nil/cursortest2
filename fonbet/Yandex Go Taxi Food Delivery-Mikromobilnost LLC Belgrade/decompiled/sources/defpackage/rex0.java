package defpackage;

import com.yandex.go.summary.ui.model.expanded.content.tariffcard.header.TariffDescriptionTextStyleUiState;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class rex0 implements tex0 {
    public final CharSequence a;
    public final wp2 b;
    public final TariffDescriptionTextStyleUiState c;
    public final float d;
    public final boolean e;
    public final int f;

    public rex0(CharSequence charSequence, wp2 wp2Var, TariffDescriptionTextStyleUiState tariffDescriptionTextStyleUiState, float f, boolean z, int i) {
        this.a = charSequence;
        this.b = wp2Var;
        this.c = tariffDescriptionTextStyleUiState;
        this.d = f;
        this.e = z;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rex0)) {
            return false;
        }
        rex0 rex0Var = (rex0) obj;
        return jl40.l(this.a, rex0Var.a) && jl40.l(this.b, rex0Var.b) && this.c == rex0Var.c && Float.compare(this.d, rex0Var.d) == 0 && this.e == rex0Var.e && this.f == rex0Var.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + unr0.e(g8e.c(this.d, (this.c.hashCode() + n.b(this.b, this.a.hashCode() * 31, 31)) * 31, 31), 31, this.e);
    }

    public final String toString() {
        return "DefaultUiState(text=" + ((Object) this.a) + ", textColor=" + this.b + ", textStyleUiState=" + this.c + ", textAlpha=" + this.d + ", isShimmering=" + this.e + ", bottomPadding=" + this.f + Extension.C_BRAKE;
    }
}
