package defpackage;

/* loaded from: classes3.dex */
public final class q76 {
    public final a0j a;
    public final jyr b;

    public q76(a0j a0jVar, jyr jyrVar) {
        this.a = a0jVar;
        this.b = jyrVar;
    }

    public final v76 a() {
        w0j w0jVar;
        int ordinal = this.a.a().b.ordinal();
        if (ordinal == 0) {
            w0jVar = w0j.WIFI_ONLY;
        } else if (ordinal == 1) {
            w0jVar = w0j.MOBILE;
        } else if (ordinal == 2) {
            w0jVar = w0j.OTHER;
        } else {
            if (ordinal != 3) {
                b6e.s();
                return null;
            }
            w0jVar = w0j.NONE;
        }
        jyr jyrVar = this.b;
        return new v76(w0jVar, ((z66) jyrVar.getValue()).h() ? y0j.OFFLINE : y0j.MOBILE, ((z66) jyrVar.getValue()).a().a, ((z66) jyrVar.getValue()).f());
    }
}
