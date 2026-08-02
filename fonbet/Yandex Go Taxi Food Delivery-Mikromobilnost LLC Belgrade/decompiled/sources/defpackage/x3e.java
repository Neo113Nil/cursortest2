package defpackage;

import androidx.compose.runtime.f;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.an8;
import defpackage.bts;
import defpackage.did;
import defpackage.e4e;
import defpackage.f5z;
import defpackage.fid;
import defpackage.j2m0;
import defpackage.ny61;
import defpackage.o430;
import defpackage.ooc;
import defpackage.q7u;
import defpackage.qoi0;
import defpackage.rs31;
import defpackage.sls;
import defpackage.tfx;
import defpackage.w8f;
import defpackage.yt0;
import defpackage.zy11;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes5.dex */
public final /* synthetic */ class x3e implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ an8 b;

    public /* synthetic */ x3e(an8 an8Var, int i) {
        this.a = i;
        this.b = an8Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        final an8 an8Var = this.b;
        int i2 = 2;
        int i3 = 1;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    sb2.b(ua3.a.a((dci) an8Var.b), wwg.S(-1509807306, true, new x3e(an8Var, i3), btsVar), btsVar, 56);
                    break;
                }
            case 1:
                hwy0 hwy0Var = (hwy0) an8Var.x;
                fid fidVar2 = (fid) obj;
                int intValue2 = ((Integer) obj2).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                    btsVar2.Y();
                    break;
                } else {
                    qti.c(hwy0Var.c(btsVar2), hwy0Var.a, false, wwg.S(-1269031331, true, new x3e(an8Var, i2), btsVar2), btsVar2, HProv.ALG_TYPE_SECURECHANNEL, 4);
                    break;
                }
            default:
                fid fidVar3 = (fid) obj;
                int intValue3 = ((Integer) obj2).intValue();
                bts btsVar3 = (bts) fidVar3;
                if (!btsVar3.V(intValue3 & 1, (intValue3 & 3) != 2)) {
                    btsVar3.Y();
                    break;
                } else {
                    xi91.a(wwg.S(-1943613498, true, new wls() { // from class: ru.yandex.taxi.logistics.sdk.confirmation_modal_view.ui.a
                        @Override // defpackage.wls
                        public final Object invoke(Object obj3, Object obj4) {
                            fid fidVar4 = (fid) obj3;
                            int intValue4 = ((Integer) obj4).intValue();
                            bts btsVar4 = (bts) fidVar4;
                            if (btsVar4.V(intValue4 & 1, (intValue4 & 3) != 2)) {
                                yt0 yt0Var = new yt0((j2m0) btsVar4.m(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner()), (e) an8.this.w, 3);
                                rs31 a = f5z.a(btsVar4);
                                if (a == null) {
                                    ny61.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                e eVar = (e) ooc.G(qoi0.a(e.class), a, null, yt0Var, a instanceof q7u ? ((q7u) a).getDefaultViewModelCreationExtras() : w8f.b, btsVar4);
                                e4e e4eVar = (e4e) f.b(eVar.z, btsVar4).getValue();
                                if (e4eVar == null) {
                                    btsVar4.e0(-1735111989);
                                    btsVar4.t(false);
                                } else {
                                    btsVar4.e0(-1735111988);
                                    boolean e = btsVar4.e(eVar);
                                    Object Q = btsVar4.Q();
                                    o430 o430Var = did.a;
                                    if (e || Q == o430Var) {
                                        ConfirmationModalViewRoot$getView$1$1$1$1$1$1$1$1 confirmationModalViewRoot$getView$1$1$1$1$1$1$1$1 = new ConfirmationModalViewRoot$getView$1$1$1$1$1$1$1$1(0, eVar, e.class, "onShown", "onShown()V", 0);
                                        btsVar4.o0(confirmationModalViewRoot$getView$1$1$1$1$1$1$1$1);
                                        Q = confirmationModalViewRoot$getView$1$1$1$1$1$1$1$1;
                                    }
                                    sls slsVar = (sls) ((tfx) Q);
                                    boolean e2 = btsVar4.e(eVar);
                                    Object Q2 = btsVar4.Q();
                                    if (e2 || Q2 == o430Var) {
                                        ConfirmationModalViewRoot$getView$1$1$1$1$1$1$2$1 confirmationModalViewRoot$getView$1$1$1$1$1$1$2$1 = new ConfirmationModalViewRoot$getView$1$1$1$1$1$1$2$1(0, eVar, e.class, "onConfirmClick", "onConfirmClick()V", 0);
                                        btsVar4.o0(confirmationModalViewRoot$getView$1$1$1$1$1$1$2$1);
                                        Q2 = confirmationModalViewRoot$getView$1$1$1$1$1$1$2$1;
                                    }
                                    sls slsVar2 = (sls) ((tfx) Q2);
                                    boolean e3 = btsVar4.e(eVar);
                                    Object Q3 = btsVar4.Q();
                                    if (e3 || Q3 == o430Var) {
                                        ConfirmationModalViewRoot$getView$1$1$1$1$1$1$3$1 confirmationModalViewRoot$getView$1$1$1$1$1$1$3$1 = new ConfirmationModalViewRoot$getView$1$1$1$1$1$1$3$1(0, eVar, e.class, "onCloseClick", "onCloseClick()V", 0);
                                        btsVar4.o0(confirmationModalViewRoot$getView$1$1$1$1$1$1$3$1);
                                        Q3 = confirmationModalViewRoot$getView$1$1$1$1$1$1$3$1;
                                    }
                                    b.c(e4eVar, slsVar, slsVar2, (sls) ((tfx) Q3), btsVar4, 0);
                                    btsVar4.t(false);
                                }
                            } else {
                                btsVar4.Y();
                            }
                            return zy11.a;
                        }
                    }, btsVar3), btsVar3, 6);
                    break;
                }
        }
        return zy11Var;
    }
}
