package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class u8k0 implements zjk0, kjk0 {
    public final String a;
    public final String b;
    public final xss0 c;
    public final List d;
    public final akk0 e;

    public u8k0(String str, String str2, xss0 xss0Var, List list) {
        this.a = str;
        this.b = str2;
        this.c = xss0Var;
        this.d = list;
        this.e = qpa1.c(xss0Var, str2, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u8k0)) {
            return false;
        }
        u8k0 u8k0Var = (u8k0) obj;
        return jl40.l(this.a, u8k0Var.a) && jl40.l(this.b, u8k0Var.b) && jl40.l(this.c, u8k0Var.c) && jl40.l(this.d, u8k0Var.d);
    }

    @Override // defpackage.zjk0
    public final wrs0 getAnalytics() {
        return this.e;
    }

    @Override // defpackage.kjk0
    public final List getChildren() {
        return this.d;
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
        StringBuilder v = b64.v("RideCardAccordionItemUiState(id=", this.a, ", analyticsId=", this.b, ", header=");
        v.append(this.c);
        v.append(", children=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
