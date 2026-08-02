package defpackage;

import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class snk0 implements olk0 {
    public final String a;
    public final String b;
    public final xss0 c;
    public final kdc d;
    public final boolean e;
    public final String f;
    public final vfk0 g;
    public final akk0 h;

    public snk0(String str, String str2, xss0 xss0Var, kdc kdcVar, boolean z, String str3, vfk0 vfk0Var) {
        this.a = str;
        this.b = str2;
        this.c = xss0Var;
        this.d = kdcVar;
        this.e = z;
        this.f = str3;
        this.g = vfk0Var;
        this.h = qpa1.c(xss0Var, str2, EmptyList.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof snk0)) {
            return false;
        }
        snk0 snk0Var = (snk0) obj;
        return jl40.l(this.a, snk0Var.a) && jl40.l(this.b, snk0Var.b) && this.c.equals(snk0Var.c) && jl40.l(this.d, snk0Var.d) && this.e == snk0Var.e && jl40.l(this.f, snk0Var.f) && jl40.l(this.g, snk0Var.g);
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
        int e = unr0.e(smw0.d(this.d, (this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31), 31, this.e);
        String str2 = this.f;
        return this.g.hashCode() + ((e + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // defpackage.olk0
    public final vfk0 o() {
        return this.g;
    }

    public final String toString() {
        StringBuilder v = b64.v("RideCardStatusItemUiState(id=", this.a, ", analyticsId=", this.b, ", slotItemState=");
        v.append(this.c);
        v.append(", backgroundColor=");
        v.append(this.d);
        v.append(", isShimmering=");
        unr0.A(", contentDescription=", this.f, ", sourceType=", v, this.e);
        v.append(this.g);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
