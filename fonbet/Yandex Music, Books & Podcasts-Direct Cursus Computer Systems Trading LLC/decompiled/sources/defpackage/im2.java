package defpackage;

import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes4.dex */
public final class im2 implements uvn {
    public final nrf a;
    public final onq b;
    public final String c;
    public final f73 d = f73.d;
    public final String e;

    public im2(nrf nrfVar, onq onqVar, String str) {
        this.a = nrfVar;
        this.b = onqVar;
        this.c = str;
        this.e = ouj.o(nrfVar.a, StringUtils.PROCESS_POSTFIX_DELIMITER, str);
    }

    @Override // defpackage.drf
    public final nrf a() {
        return this.a;
    }

    @Override // defpackage.wfm
    public final String c() {
        return this.e;
    }

    @Override // defpackage.wfm
    public final f73 d() {
        return this.d;
    }

    @Override // defpackage.uvn
    public final onq e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof im2)) {
            return false;
        }
        im2 im2Var = (im2) obj;
        return this.a.equals(im2Var.a) && this.b.equals(im2Var.b) && this.c.equals(im2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + eta.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return su4.o(eta.i("BannerBlock(meta=", this.a, ", source=", this.b, ", bannerId="), this.c, ")");
    }
}
