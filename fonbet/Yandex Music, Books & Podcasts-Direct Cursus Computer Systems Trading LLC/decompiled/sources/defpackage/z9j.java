package defpackage;

import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes4.dex */
public final class z9j implements uvn {
    public final nrf a;
    public final onq b;
    public final f73 c;
    public final String d;
    public final String e;

    public z9j(nrf nrfVar, onq onqVar, f73 f73Var, String str) {
        this.a = nrfVar;
        this.b = onqVar;
        this.c = f73Var;
        this.d = str;
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
        return this.c;
    }

    @Override // defpackage.uvn
    public final onq e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z9j)) {
            return false;
        }
        z9j z9jVar = (z9j) obj;
        return this.a.equals(z9jVar.a) && this.b.equals(z9jVar.b) && this.c == z9jVar.c && this.d.equals(z9jVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + eta.b(this.c, eta.c(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder i = eta.i("NonMusicBannerBlock(meta=", this.a, ", source=", this.b, ", showPolicy=");
        i.append(this.c);
        i.append(", bannerId=");
        i.append(this.d);
        i.append(")");
        return i.toString();
    }
}
