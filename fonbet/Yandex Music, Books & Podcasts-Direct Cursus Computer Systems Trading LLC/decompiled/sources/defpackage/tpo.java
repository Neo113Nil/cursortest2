package defpackage;

import android.view.View;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class tpo implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ xpo b;

    public /* synthetic */ tpo(xpo xpoVar, int i) {
        this.a = i;
        this.b = xpoVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        mfk mfkVar;
        switch (this.a) {
            case 0:
                this.b.y().K();
                break;
            default:
                jqo y = this.b.y();
                voi voiVar = y.t;
                if (Intrinsics.d(voiVar.d(), ypo.a)) {
                    g0c g0cVar = y.n;
                    qne b1 = gut.b1(y.L());
                    x60 x60Var = (x60) g0cVar;
                    x60Var.getClass();
                    x60Var.a(b1);
                    voiVar.m(aqo.a);
                    w03 w03Var = ((tdk) y.m).h;
                    Pair pair = (Pair) y.p.d();
                    String str = (pair == null || (mfkVar = (mfk) pair.a) == null) ? null : mfkVar.a;
                    if (str == null) {
                        str = "";
                    }
                    w03Var.d(str, y.L(), y.v);
                    break;
                }
                break;
        }
    }
}
