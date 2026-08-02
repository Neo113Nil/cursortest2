package defpackage;

import com.yandex.payment.divkit.preselect.f;
import com.yandex.payment.divkit.usecases.l;

/* loaded from: classes2.dex */
public final class rtf implements hs31 {
    public final l a;
    public final rwo b;
    public final abe c;
    public final vv90 w;

    public rtf(l lVar, rwo rwoVar, abe abeVar, vv90 vv90Var) {
        this.a = lVar;
        this.b = rwoVar;
        this.c = abeVar;
        this.w = vv90Var;
    }

    @Override // defpackage.hs31
    public final yr31 create(Class cls) {
        return new f(this.a, this.b, this.c, this.w);
    }
}
