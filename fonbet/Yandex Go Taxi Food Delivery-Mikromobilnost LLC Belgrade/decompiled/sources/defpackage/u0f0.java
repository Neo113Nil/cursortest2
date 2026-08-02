package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class u0f0 {
    public static final u0f0 k = new u0f0((CharSequence) null, (CharSequence) null, (CharSequence) null, (q47) null, (f4a0) null, false, (String) null, (String) null, (String) null, 1023);
    public final CharSequence a;
    public final CharSequence b;
    public final CharSequence c;
    public final q47 d;
    public final f4a0 e;
    public final boolean f;
    public final boolean g;
    public final String h;
    public final String i;
    public final String j;

    public u0f0(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, q47 q47Var, f4a0 f4a0Var, boolean z, String str, String str2, String str3, int i) {
        this((i & 1) != 0 ? null : charSequence, (i & 2) != 0 ? null : charSequence2, (i & 4) != 0 ? null : charSequence3, (i & 8) != 0 ? new q47((List) null, 3) : q47Var, (i & 16) != 0 ? f4a0.c : f4a0Var, (i & 32) == 0, (i & 64) != 0 ? false : z, (i & 128) != 0 ? "" : str, (i & 256) != 0 ? null : str2, (i & 512) != 0 ? null : str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0f0)) {
            return false;
        }
        u0f0 u0f0Var = (u0f0) obj;
        return jl40.l(this.a, u0f0Var.a) && jl40.l(this.b, u0f0Var.b) && jl40.l(this.c, u0f0Var.c) && jl40.l(this.d, u0f0Var.d) && jl40.l(this.e, u0f0Var.e) && this.f == u0f0Var.f && this.g == u0f0Var.g && jl40.l(this.h, u0f0Var.h) && jl40.l(this.i, u0f0Var.i) && jl40.l(this.j, u0f0Var.j);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.b;
        int hashCode2 = (hashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.c;
        int b = unr0.b(unr0.e(unr0.e((this.e.hashCode() + ((this.d.hashCode() + ((hashCode2 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31)) * 31)) * 31, 31, this.f), 31, this.g), 31, this.h);
        String str = this.i;
        int hashCode3 = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.j;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "PriceUIState(lead=", ", trail=", ", discountTrail=");
        r.append((Object) this.c);
        r.append(", button=");
        r.append(this.d);
        r.append(", paymentMethod=");
        r.append(this.e);
        r.append(", isLoading=");
        r.append(this.f);
        r.append(", isListPaymentMethodsLoading=");
        unr0.A(", source=", this.h, ", noCardsDescription=", r, this.g);
        return g8e.r(r, this.i, ", cardsDescription=", this.j, Extension.C_BRAKE);
    }

    public u0f0(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, q47 q47Var, f4a0 f4a0Var, boolean z, boolean z2, String str, String str2, String str3) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = charSequence3;
        this.d = q47Var;
        this.e = f4a0Var;
        this.f = z;
        this.g = z2;
        this.h = str;
        this.i = str2;
        this.j = str3;
    }

    public u0f0() {
        this((CharSequence) null, (CharSequence) null, (CharSequence) null, (q47) null, (f4a0) null, false, (String) null, (String) null, (String) null, 1023);
    }
}
