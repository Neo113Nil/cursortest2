package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class vdk0 implements zjk0, kjk0 {
    public final String a;
    public final String b;
    public final List c;
    public final akk0 d;

    public vdk0(String str, String str2, List list) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = qpa1.e(str2, list, new nqs0[0]);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vdk0)) {
            return false;
        }
        vdk0 vdk0Var = (vdk0) obj;
        return jl40.l(this.a, vdk0Var.a) && jl40.l(this.b, vdk0Var.b) && jl40.l(this.c, vdk0Var.c);
    }

    @Override // defpackage.zjk0
    public final wrs0 getAnalytics() {
        return this.d;
    }

    @Override // defpackage.kjk0
    public final List getChildren() {
        return this.c;
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return ly3.s(b64.v("RideCardCollapsingContainerItemUiState(id=", this.a, ", analyticsId=", this.b, ", children="), this.c, Extension.C_BRAKE);
    }
}
