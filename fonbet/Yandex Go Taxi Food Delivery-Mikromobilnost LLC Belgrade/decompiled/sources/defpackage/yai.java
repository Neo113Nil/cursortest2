package defpackage;

import ru.yandex.taxi.delivery.extracted_delivery_form.interactors.unitedsummary.b;
import ru.yandex.taxi.delivery.ui.form.e;

/* loaded from: classes5.dex */
public final /* synthetic */ class yai implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;

    public /* synthetic */ yai(e eVar, int i) {
        this.a = i;
        this.b = eVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        e eVar = this.b;
        switch (i) {
            case 0:
                ovi oviVar = eVar.y;
                tpr t = kotlinx.coroutines.flow.e.t(new b(kotlinx.coroutines.flow.e.t(oviVar.b.a()), oviVar));
                tse Jg = eVar.Jg();
                xsr0.a.getClass();
                return kotlinx.coroutines.flow.e.R(t, Jg, wsr0.c, null);
            default:
                ((wai) eVar.Dg()).hd();
                return zy11.a;
        }
    }
}
