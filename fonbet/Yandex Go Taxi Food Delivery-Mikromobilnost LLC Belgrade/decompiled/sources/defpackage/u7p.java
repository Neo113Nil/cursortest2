package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* loaded from: classes9.dex */
public final class u7p extends yme {
    public final wg10 a;
    public final yo40 b;

    public u7p(wg10 wg10Var, yo40 yo40Var) {
        this.a = wg10Var;
        this.b = yo40Var;
    }

    @Override // defpackage.yme
    public final zme a(Type type, Annotation[] annotationArr) {
        yo40 yo40Var = this.b;
        return new nfh(this.a, gtq0.I(((sbx) ((itu0) yo40Var.a)).b, type), yo40Var);
    }

    @Override // defpackage.yme
    public final zme b(Type type, Annotation[] annotationArr, t0k0 t0k0Var) {
        yo40 yo40Var = this.b;
        return new lb7(27, gtq0.I(((sbx) ((itu0) yo40Var.a)).b, type), yo40Var);
    }
}
