package defpackage;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.b;
import com.yandex.div.evaluable.c;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import java.util.List;

/* loaded from: classes11.dex */
public final class zfc extends c {
    public static final zfc b = new zfc();
    public static final String c = "rgb";
    public static final List d;
    public static final EvaluableType e;
    public static final boolean f;

    static {
        EvaluableType evaluableType = EvaluableType.NUMBER;
        d = scc.g(new kms(evaluableType, false), new kms(evaluableType, false), new kms(evaluableType, false));
        e = EvaluableType.COLOR;
        f = true;
    }

    @Override // com.yandex.div.evaluable.c
    public final Object a(cxq0 cxq0Var, jdo jdoVar, List list) {
        try {
            int c2 = eob1.c(((Double) list.get(0)).doubleValue());
            int c3 = eob1.c(((Double) list.get(1)).doubleValue());
            return new jdc((c2 << 16) | ModalContentViewContainer.BASE_SHADOW_COLOR | (c3 << 8) | eob1.c(((Double) list.get(2)).doubleValue()));
        } catch (IllegalArgumentException unused) {
            b.e(c, list, "Value out of range 0..1.", null);
            throw null;
        }
    }

    @Override // com.yandex.div.evaluable.c
    public final List b() {
        return d;
    }

    @Override // com.yandex.div.evaluable.c
    public final String c() {
        return c;
    }

    @Override // com.yandex.div.evaluable.c
    public final EvaluableType d() {
        return e;
    }

    @Override // com.yandex.div.evaluable.c
    public final boolean f() {
        return f;
    }
}
