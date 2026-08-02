package defpackage;

import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class wek0 implements zjk0 {
    public final String a;
    public final String b;
    public final rek0 c;
    public final vek0 d;
    public final akk0 e;

    public wek0(String str, String str2, rek0 rek0Var, vek0 vek0Var) {
        this.a = str;
        this.b = str2;
        this.c = rek0Var;
        this.d = vek0Var;
        this.e = qpa1.e(str2, EmptyList.a, new nqs0[0]);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wek0)) {
            return false;
        }
        wek0 wek0Var = (wek0) obj;
        return jl40.l(this.a, wek0Var.a) && jl40.l(this.b, wek0Var.b) && jl40.l(this.c, wek0Var.c) && jl40.l(this.d, wek0Var.d);
    }

    @Override // defpackage.zjk0
    public final wrs0 getAnalytics() {
        return this.e;
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("RideCardCompanionItemUiState(id=", this.a, ", analyticsId=", this.b, ", body=");
        v.append(this.c);
        v.append(", trail=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
