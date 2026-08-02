package defpackage;

import com.yandex.payment.divkit.usecases.g;

/* loaded from: classes2.dex */
public final class usf implements hs31 {
    public final g a;
    public final rwo b;

    public usf(g gVar, rwo rwoVar) {
        this.a = gVar;
        this.b = rwoVar;
    }

    @Override // defpackage.hs31
    public final yr31 create(Class cls) {
        if (cls.equals(xmo.class)) {
            return new xmo(this.a, this.b);
        }
        ny61.r("Unknown view model");
        return null;
    }
}
