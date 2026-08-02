package defpackage;

import com.yandex.plus.pay.ui.core.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class m5m implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pzl b;

    public /* synthetic */ m5m(pzl pzlVar, int i) {
        this.a = i;
        this.b = pzlVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                o18 o18Var = (o18) obj;
                o18Var.getClass();
                o18Var.c = hag.I(vwi.class);
                rp7 rp7Var = o18Var.b;
                rp7Var.getClass();
                pzl pzlVar = this.b;
                rp7Var.D(new m5m(pzlVar, 1));
                o18Var.c = hag.I(qkj.class);
                rp7Var.getClass();
                rp7Var.D(new m5m(pzlVar, 2));
                o18Var.c = hag.I(efk.class);
                rp7Var.getClass();
                rp7Var.D(new m5m(pzlVar, 3));
                o18Var.c = hag.I(kkj.class);
                rp7Var.getClass();
                rp7Var.D(new m5m(pzlVar, 4));
                o18Var.c = hag.I(cfe.class);
                rp7Var.getClass();
                rp7Var.D(new m5m(pzlVar, 5));
                return Unit.a;
            case 1:
                ((l13) obj).getClass();
                l5m l5mVar = (l5m) this.b.b;
                return new vwi(l5mVar.a().a(), ((u7m) l5mVar.a().d.getValue()).a());
            case 2:
                l13 l13Var = (l13) obj;
                l13Var.getClass();
                l5m l5mVar2 = (l5m) this.b.b;
                return new qkj(l5mVar2.a().a(), (vwi) l13Var.a.D(hag.I(vwi.class), l13Var, l13Var.b), (c7m) l5mVar2.a().j.getValue());
            case 3:
                ((l13) obj).getClass();
                return new efk((a) ((l5m) this.b.b).a().b.getValue());
            case 4:
                ((l13) obj).getClass();
                l5m l5mVar3 = (l5m) this.b.b;
                return new lkj(l5mVar3.a().a(), (c7m) l5mVar3.a().j.getValue());
            default:
                ((l13) obj).getClass();
                return new cfe(((l5m) this.b.b).a().a());
        }
    }
}
