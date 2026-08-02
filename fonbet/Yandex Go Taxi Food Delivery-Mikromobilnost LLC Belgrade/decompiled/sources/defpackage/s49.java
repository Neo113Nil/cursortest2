package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import ru.yandex.taxi.cashback.view.a;

/* loaded from: classes9.dex */
public final class s49 implements jn4 {
    public final rqo a;
    public final fkd b;
    public final xrd0 c;
    public final k49 d;
    public final int e;

    public s49(rqo rqoVar, fkd fkdVar, xrd0 xrd0Var, k49 k49Var, Context context) {
        this.a = rqoVar;
        this.b = fkdVar;
        this.c = xrd0Var;
        this.d = k49Var;
        this.e = xw31.b(hsg0.plus_badge_bottom_margin, context);
    }

    @Override // defpackage.jn4
    public final kn4 a(ViewGroup viewGroup, String str, nn4 nn4Var) {
        return new a(viewGroup, str, this.b, this.c, this.a, this.d, new lb7(14, nn4Var, this));
    }
}
