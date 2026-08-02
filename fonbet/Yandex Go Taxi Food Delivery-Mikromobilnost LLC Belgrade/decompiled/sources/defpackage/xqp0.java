package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class xqp0 extends crp0 {
    public final String c;
    public final String d;
    public final ArrayList e;

    public xqp0(String str, String str2, ArrayList arrayList) {
        super("UnknownQueryParameter");
        this.c = str;
        this.d = str2;
        this.e = arrayList;
    }

    @Override // defpackage.crp0
    public final Object c() {
        return this.e;
    }

    @Override // defpackage.crp0
    public final String d() {
        return this.c;
    }

    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xqp0)) {
            return false;
        }
        xqp0 xqp0Var = (xqp0) obj;
        return this.c.equals(xqp0Var.c) && jl40.l(this.d, xqp0Var.d) && this.e.equals(xqp0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.b(((this.c.hashCode() * 31) + 1047298600) * 31, 31, this.d);
    }

    public final String toString() {
        return b64.n(Extension.C_BRAKE, b64.v("UnknownQueryParameter(url=", this.c, ", message=Unknown query parameters in the deeplink, deeplinkSource=", this.d, ", payload="), this.e);
    }
}
