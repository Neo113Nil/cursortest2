package defpackage;

import com.yandex.music.shared.wizard.entry.data.WizardMonolithApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class vuv implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wuv b;

    public /* synthetic */ vuv(wuv wuvVar, int i) {
        this.a = i;
        this.b = wuvVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                o18 o18Var = (o18) obj;
                o18Var.getClass();
                o18Var.c = hag.I(wuv.class);
                rp7 rp7Var = o18Var.b;
                rp7Var.getClass();
                wuv wuvVar = this.b;
                rp7Var.C(wuvVar);
                o18Var.c = hag.I(iuv.class);
                rp7Var.getClass();
                rp7Var.E(new vuv(wuvVar, 1));
                o18Var.c = hag.I(e0j.class);
                rp7Var.getClass();
                rp7Var.E(new vuv(wuvVar, 2));
                o18Var.c = hag.I(WizardMonolithApi.class);
                rp7Var.getClass();
                rp7Var.E(new ulv(20));
                o18Var.c = hag.I(gvv.class);
                rp7Var.getClass();
                rp7Var.E(new ulv(21));
                return Unit.a;
            case 1:
                ((l13) obj).getClass();
                return (iuv) this.b.b.b.getValue();
            default:
                ((l13) obj).getClass();
                return (e0j) this.b.b.a.getValue();
        }
    }
}
