package defpackage;

import com.yandex.music.shared.wizard3.network.WizardApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class lxv implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pzl b;

    public /* synthetic */ lxv(pzl pzlVar, int i) {
        this.a = i;
        this.b = pzlVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                o18 o18Var = (o18) obj;
                o18Var.getClass();
                o18Var.c = hag.I(WizardApi.class);
                rp7 rp7Var = o18Var.b;
                rp7Var.getClass();
                pzl pzlVar = this.b;
                rp7Var.E(new lxv(pzlVar, 1));
                o18Var.c = hag.I(n0w.class);
                rp7Var.getClass();
                int i = 2;
                rp7Var.D(new jwv(i));
                o18Var.c = hag.I(mxv.class);
                rp7Var.getClass();
                rp7Var.E(new lxv(pzlVar, i));
                o18Var.c = hag.I(oxv.class);
                rp7Var.getClass();
                rp7Var.E(new jwv(3));
                return Unit.a;
            case 1:
                ((l13) obj).getClass();
                return (WizardApi) i0j.a((i0j) ((dx5) this.b.b).a.getValue(), null, null, new nxv(0), null, 55).a.b(WizardApi.class);
            default:
                l13 l13Var = (l13) obj;
                l13Var.getClass();
                return new mxv(this.b, l13Var);
        }
    }
}
