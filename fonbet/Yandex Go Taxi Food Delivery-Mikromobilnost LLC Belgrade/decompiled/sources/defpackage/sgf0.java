package defpackage;

import com.yandex.go.user_profile.ui.ProfileContext;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes14.dex */
public final class sgf0 {
    public final Long a;
    public final String b;
    public final ul21 c;
    public final sff0 d;
    public final jff0 e;
    public final boolean f;
    public final lk51 g;
    public final i20 h;
    public final hv11 i;
    public final ThemeType j;
    public final boolean k;
    public final boolean l;
    public final ProfileContext m;
    public final boolean n;

    public sgf0(Long l, String str, ul21 ul21Var, sff0 sff0Var, jff0 jff0Var, boolean z, lk51 lk51Var, i20 i20Var, hv11 hv11Var, ThemeType themeType, boolean z2, boolean z3, ProfileContext profileContext, boolean z4) {
        this.a = l;
        this.b = str;
        this.c = ul21Var;
        this.d = sff0Var;
        this.e = jff0Var;
        this.f = z;
        this.g = lk51Var;
        this.h = i20Var;
        this.i = hv11Var;
        this.j = themeType;
        this.k = z2;
        this.l = z3;
        this.m = profileContext;
        this.n = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sgf0)) {
            return false;
        }
        sgf0 sgf0Var = (sgf0) obj;
        return jl40.l(this.a, sgf0Var.a) && jl40.l(this.b, sgf0Var.b) && jl40.l(this.c, sgf0Var.c) && jl40.l(this.d, sgf0Var.d) && jl40.l(this.e, sgf0Var.e) && this.f == sgf0Var.f && jl40.l(this.g, sgf0Var.g) && jl40.l(this.h, sgf0Var.h) && jl40.l(this.i, sgf0Var.i) && this.j == sgf0Var.j && this.k == sgf0Var.k && this.l == sgf0Var.l && this.m == sgf0Var.m && this.n == sgf0Var.n;
    }

    public final int hashCode() {
        Long l = this.a;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        return Boolean.hashCode(this.n) + ((this.m.hashCode() + unr0.e(unr0.e((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + unr0.e((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31)) * 31, 31, this.f)) * 31)) * 31)) * 31)) * 31, 31, this.k), 31, this.l)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProfileUiState(uid=");
        sb.append(this.a);
        sb.append(", phone=");
        sb.append(this.b);
        sb.append(", email=");
        sb.append(this.c);
        sb.append(", rating=");
        sb.append(this.d);
        sb.append(", name=");
        sb.append(this.e);
        sb.append(", isLinkAccountAvailable=");
        sb.append(this.f);
        sb.append(", plusInfo=");
        sb.append(this.g);
        sb.append(", activeOrdersState=");
        sb.append(this.h);
        sb.append(", ultimaModeStateInfo=");
        sb.append(this.i);
        sb.append(", themeType=");
        sb.append(this.j);
        sb.append(", isUserPhotoUploadingEnabled=");
        nnm.v(", hasAnyNameAndRating=", ", profileContext=", sb, this.k, this.l);
        sb.append(this.m);
        sb.append(", disableProfileEditing=");
        sb.append(this.n);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
