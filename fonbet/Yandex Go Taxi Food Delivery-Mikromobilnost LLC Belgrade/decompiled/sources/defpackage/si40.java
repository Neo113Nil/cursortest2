package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class si40 {
    public static final si40 e = new si40("", EmptyList.a, new na11("", "", ""), "");
    public final CharSequence a;
    public final List b;
    public final na11 c;
    public final CharSequence d;

    public si40(CharSequence charSequence, List list, na11 na11Var, CharSequence charSequence2) {
        this.a = charSequence;
        this.b = list;
        this.c = na11Var;
        this.d = charSequence2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof si40)) {
            return false;
        }
        si40 si40Var = (si40) obj;
        return jl40.l(this.a, si40Var.a) && jl40.l(this.b, si40Var.b) && jl40.l(this.c, si40Var.c) && jl40.l(this.d, si40Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + unr0.c(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "MtTrainTransportTypesUiState(title=" + ((Object) this.a) + ", transportTypes=" + this.b + ", selectedTransportType=" + this.c + ", applyButtonTitle=" + ((Object) this.d) + Extension.C_BRAKE;
    }
}
