package defpackage;

import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class xdk0 implements zjk0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final kdc f;
    public final nqs0 g;
    public final akk0 h;

    public xdk0(String str, String str2, String str3, String str4, String str5, kdc kdcVar, ibk0 ibk0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = kdcVar;
        this.g = ibk0Var;
        this.h = qpa1.e(str2, EmptyList.a, ibk0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xdk0)) {
            return false;
        }
        xdk0 xdk0Var = (xdk0) obj;
        return jl40.l(this.a, xdk0Var.a) && jl40.l(this.b, xdk0Var.b) && jl40.l(this.c, xdk0Var.c) && jl40.l(this.d, xdk0Var.d) && jl40.l(this.e, xdk0Var.e) && this.f.equals(xdk0Var.f) && jl40.l(this.g, xdk0Var.g);
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
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        return this.g.hashCode() + smw0.d(this.f, (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("RideCardCommentUiState(id=", this.a, ", analyticsId=", this.b, ", title=");
        g8e.D(v, this.c, ", hint=", this.d, ", comment=");
        v.append(this.e);
        v.append(", backgroundColor=");
        v.append(this.f);
        v.append(", action=");
        v.append(this.g);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
