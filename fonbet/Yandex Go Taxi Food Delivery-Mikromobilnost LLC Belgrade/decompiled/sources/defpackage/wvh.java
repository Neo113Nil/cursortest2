package defpackage;

import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.delivery.extracted_delivery_form.interactors.f;
import ru.yandex.taxi.delivery.ui.recycler.a;

/* loaded from: classes5.dex */
public final /* synthetic */ class wvh implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ wvh(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        boolean z = false;
        zy11 zy11Var = zy11.a;
        a aVar = this.b;
        switch (i) {
            case 0:
                zo31 zo31Var = (zo31) aVar.R;
                hki hkiVar = aVar.e0;
                if (hkiVar != null && aVar.F() != -1) {
                    if (((d1x) zo31Var).d.getVisibility() == 0) {
                        aVar.T.a();
                        z = true;
                        ((d1x) zo31Var).d.hide(true);
                    }
                    aVar.a0.a(new nq(hkiVar, z));
                    break;
                }
                break;
            case 1:
                if (aVar.F() != -1) {
                    jvi jviVar = (jvi) aVar.W.b;
                    r0 r0Var = jviVar.a;
                    jviVar.b = (ivi) r0Var.getValue();
                    r0Var.l(ivi.d);
                    break;
                }
                break;
            default:
                if (aVar.F() != -1) {
                    f fVar = aVar.U;
                    int i2 = aVar.z;
                    if (i2 == -1) {
                        i2 = aVar.c;
                    }
                    fVar.a(i2, false);
                    break;
                }
                break;
        }
        return zy11Var;
    }
}
