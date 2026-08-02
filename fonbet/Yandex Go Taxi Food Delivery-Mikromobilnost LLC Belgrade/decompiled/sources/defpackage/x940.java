package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.masstransit.trains.checkout.model.ModalButtonResultType;

/* loaded from: classes6.dex */
public final class x940 {
    public final CharSequence a;
    public final CharSequence b;
    public final ovi0 c;
    public final CharSequence d;
    public final ModalButtonResultType e;

    public x940(CharSequence charSequence, CharSequence charSequence2, ovi0 ovi0Var, CharSequence charSequence3, ModalButtonResultType modalButtonResultType) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = ovi0Var;
        this.d = charSequence3;
        this.e = modalButtonResultType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x940)) {
            return false;
        }
        x940 x940Var = (x940) obj;
        return jl40.l(this.a, x940Var.a) && jl40.l(this.b, x940Var.b) && jl40.l(this.c, x940Var.c) && jl40.l(this.d, x940Var.d) && this.e == x940Var.e;
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.b;
        int hashCode2 = (hashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        ovi0 ovi0Var = this.c;
        int hashCode3 = (hashCode2 + (ovi0Var == null ? 0 : ovi0Var.hashCode())) * 31;
        CharSequence charSequence3 = this.d;
        int hashCode4 = (hashCode3 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
        ModalButtonResultType modalButtonResultType = this.e;
        return hashCode4 + (modalButtonResultType != null ? modalButtonResultType.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "MtTrainActionPopupUiState(title=", ", description=", ", iconTag=");
        r.append(this.c);
        r.append(", buttonTitle=");
        r.append((Object) this.d);
        r.append(", buttonAction=");
        r.append(this.e);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }

    public x940() {
        this(0);
    }

    public /* synthetic */ x940(int i) {
        this(null, null, null, null, null);
    }
}
