package defpackage;

import androidx.fragment.app.t;
import androidx.fragment.app.y;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class zu4 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jac b;

    public /* synthetic */ zu4(jac jacVar, int i) {
        this.a = i;
        this.b = jacVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return ((tmb) this.b.b).a(new jab(qkb.Albums, 1, 1, 0), null);
            case 1:
                return new ru4((rmb) ((jyr) this.b.d).getValue());
            case 2:
                jac jacVar = this.b;
                l18 l18Var = l18.b;
                bdt I = hag.I(ku4.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                t tVar = (t) jacVar.a;
                y yVar = (y) jacVar.c;
                tVar.getClass();
                yVar.getClass();
                return new ju4(yVar, tVar);
            default:
                jac jacVar2 = this.b;
                l18 l18Var2 = l18.b;
                bdt I2 = hag.I(ibc.class);
                qdc qdcVar2 = l18Var2.a;
                qdcVar2.getClass();
                return ibc.a((t) jacVar2.a);
        }
    }
}
