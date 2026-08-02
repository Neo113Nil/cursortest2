package defpackage;

import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class xmk0 implements zjk0 {
    public final String a;
    public final String b;
    public final xss0 c;
    public final bdc d;
    public final akk0 e;

    public xmk0(String str, String str2, xss0 xss0Var, bdc bdcVar) {
        this.a = str;
        this.b = str2;
        this.c = xss0Var;
        this.d = bdcVar;
        this.e = qpa1.c(xss0Var, str2, EmptyList.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xmk0)) {
            return false;
        }
        xmk0 xmk0Var = (xmk0) obj;
        return jl40.l(this.a, xmk0Var.a) && jl40.l(this.b, xmk0Var.b) && jl40.l(this.c, xmk0Var.c) && this.d.equals(xmk0Var.d);
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
        return Integer.hashCode(this.d.a) + ((this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("RideCardShareLocationItemUiState(id=", this.a, ", analyticsId=", this.b, ", slotItemState=");
        v.append(this.c);
        v.append(", backgroundColor=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
