package defpackage;

import android.view.View;
import com.yandex.div.core.expression.local.a;
import com.yandex.div.core.state.b;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.f;
import com.yandex.div.internal.widget.DivLayoutParams;

/* loaded from: classes.dex */
public final class z2k {
    public final f a;
    public final hgk b;
    public final a c;

    public z2k(f fVar, hgk hgkVar, a aVar) {
        this.a = fVar;
        this.b = hgkVar;
        this.c = aVar;
    }

    public final View a(m3k m3kVar, aw5 aw5Var, b bVar) {
        rvo rvoVar = aw5Var.b;
        Div2View div2View = aw5Var.a;
        a aVar = this.c;
        aVar.getClass();
        com.yandex.div.core.expression.a b = div2View.getRuntimeStore().b();
        yuf0 yuf0Var = b.c;
        if (yuf0Var != null) {
            yuf0Var.H(div2View);
        }
        aVar.b(m3kVar, div2View, bVar, b);
        View o = this.a.o(m3kVar, rvoVar);
        o.setLayoutParams(new DivLayoutParams(-1, -2));
        return o;
    }
}
