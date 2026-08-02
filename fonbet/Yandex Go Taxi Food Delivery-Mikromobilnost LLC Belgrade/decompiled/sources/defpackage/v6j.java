package defpackage;

import com.yandex.go.taxi.order.details.v1.ui.DetailsCardListItem;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class v6j {
    public static final v6j i = new v6j(false, false, false, "", "", null, DetailsCardListItem.a.g, s9k0.a);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final CharSequence d;
    public final CharSequence e;
    public final t0a0 f;
    public final DetailsCardListItem.a g;
    public final ibk0 h;

    public v6j(boolean z, boolean z2, boolean z3, CharSequence charSequence, CharSequence charSequence2, t0a0 t0a0Var, DetailsCardListItem.a aVar, ibk0 ibk0Var) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = charSequence;
        this.e = charSequence2;
        this.f = t0a0Var;
        this.g = aVar;
        this.h = ibk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v6j)) {
            return false;
        }
        v6j v6jVar = (v6j) obj;
        return this.a == v6jVar.a && this.b == v6jVar.b && this.c == v6jVar.c && jl40.l(this.d, v6jVar.d) && jl40.l(this.e, v6jVar.e) && jl40.l(this.f, v6jVar.f) && jl40.l(this.g, v6jVar.g) && jl40.l(this.h, v6jVar.h);
    }

    public final int hashCode() {
        int b = smw0.b(smw0.b(unr0.e(unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        t0a0 t0a0Var = this.f;
        return this.h.hashCode() + ((this.g.hashCode() + ((b + (t0a0Var == null ? 0 : t0a0Var.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder u = qv10.u("DetailsCardPaymentUiState(isVisible=", ", isEnabled=", ", isLoading=", this.a, this.b);
        u.append(this.c);
        u.append(", title=");
        u.append((Object) this.d);
        u.append(", subtitle=");
        u.append((Object) this.e);
        u.append(", paymentOptionInfo=");
        u.append(this.f);
        u.append(", style=");
        u.append(this.g);
        u.append(", onClickAction=");
        u.append(this.h);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }
}
