package defpackage;

import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;

/* loaded from: classes14.dex */
public final class vmk0 implements zjk0 {
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final UiStateDrawableWrapper e;
    public final w8i0 f;
    public final ibk0 g;
    public final akk0 h;

    static {
        int i = w8i0.c;
        ut11 ut11Var = UiStateDrawableWrapper.Companion;
    }

    public vmk0(String str, String str2, int i, String str3, UiStateDrawableWrapper uiStateDrawableWrapper, w8i0 w8i0Var, ibk0 ibk0Var) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = uiStateDrawableWrapper;
        this.f = w8i0Var;
        this.g = ibk0Var;
        this.h = qpa1.e(str2, EmptyList.a, new nqs0[0]);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vmk0)) {
            return false;
        }
        vmk0 vmk0Var = (vmk0) obj;
        return jl40.l(this.a, vmk0Var.a) && jl40.l(this.b, vmk0Var.b) && this.c == vmk0Var.c && jl40.l(this.d, vmk0Var.d) && jl40.l(this.e, vmk0Var.e) && jl40.l(this.f, vmk0Var.f) && this.g.equals(vmk0Var.g);
    }

    @Override // defpackage.zjk0
    public final wrs0 getAnalytics() {
        return this.h;
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int b = oyr.b(this.c, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.d;
        int hashCode2 = (b + (str2 == null ? 0 : str2.hashCode())) * 31;
        UiStateDrawableWrapper uiStateDrawableWrapper = this.e;
        int hashCode3 = (hashCode2 + (uiStateDrawableWrapper == null ? 0 : uiStateDrawableWrapper.hashCode())) * 31;
        w8i0 w8i0Var = this.f;
        return this.g.hashCode() + ((hashCode3 + (w8i0Var != null ? w8i0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("RideCardRatingSelectorItemUiState(id=", this.a, ", analyticsId=", this.b, ", rating=");
        smw0.t(this.c, ", hint=", this.d, ", background=", v);
        v.append(this.e);
        v.append(", itemsDecoration=");
        v.append(this.f);
        v.append(", action=");
        v.append(this.g);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
