package defpackage;

import com.yandex.payment.divkit.usecases.e;

/* loaded from: classes2.dex */
public final class qsf implements hs31 {
    public final e a;
    public final rwo b;
    public final g99 c;
    public final vv90 w;

    public qsf(e eVar, rwo rwoVar, g99 g99Var, vv90 vv90Var) {
        this.a = eVar;
        this.b = rwoVar;
        this.c = g99Var;
        this.w = vv90Var;
    }

    @Override // defpackage.hs31
    public final yr31 create(Class cls) {
        if (!cls.equals(psf.class)) {
            ny61.r("Unknown view model");
            return null;
        }
        return new psf(this.a, this.b, this.c, this.w);
    }
}
