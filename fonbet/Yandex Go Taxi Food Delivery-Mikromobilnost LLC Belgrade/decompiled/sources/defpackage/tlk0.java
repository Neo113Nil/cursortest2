package defpackage;

import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class tlk0 implements zjk0 {
    public final String a;
    public final String b;
    public final nqs0 c;
    public final String d;
    public final CharSequence e;
    public final CharSequence f;
    public final boolean g;
    public final akk0 h;

    public tlk0(String str, String str2, nqs0 nqs0Var, String str3, CharSequence charSequence, CharSequence charSequence2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = nqs0Var;
        this.d = str3;
        this.e = charSequence;
        this.f = charSequence2;
        this.g = z;
        this.h = qpa1.e(str2, EmptyList.a, new nqs0[0]);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tlk0)) {
            return false;
        }
        tlk0 tlk0Var = (tlk0) obj;
        return jl40.l(this.a, tlk0Var.a) && jl40.l(this.b, tlk0Var.b) && jl40.l(this.c, tlk0Var.c) && jl40.l(this.d, tlk0Var.d) && jl40.l(this.e, tlk0Var.e) && jl40.l(this.f, tlk0Var.f) && this.g == tlk0Var.g;
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
        return Boolean.hashCode(this.g) + smw0.b(smw0.b(unr0.b((this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder v = b64.v("RideCardPickupCodeItemUiState(id=", this.a, ", analyticsId=", this.b, ", action=");
        v.append(this.c);
        v.append(", contentDescription=");
        v.append(this.d);
        v.append(", text=");
        vfc.A(v, this.e, ", code=", this.f, ", shouldInitializeImmediately=");
        return x4e.i(v, this.g, Extension.C_BRAKE);
    }
}
