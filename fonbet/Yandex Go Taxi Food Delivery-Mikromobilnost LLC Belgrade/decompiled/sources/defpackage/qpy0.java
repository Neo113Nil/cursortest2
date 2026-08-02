package defpackage;

import androidx.compose.runtime.f;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.bts;
import defpackage.did;
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
import defpackage.spy0;
import defpackage.tfx;
import defpackage.tls;
import defpackage.tpy0;
import defpackage.upy0;
import defpackage.w8f;
import defpackage.yt0;
import defpackage.zy11;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes5.dex */
public final /* synthetic */ class qpy0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ spy0 b;

    public /* synthetic */ qpy0(spy0 spy0Var, int i) {
        this.a = i;
        this.b = spy0Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        final spy0 spy0Var = this.b;
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
                    sb2.c(new vvf0[]{nnm.f(spy0Var.c, btsVar, qti.e), ua3.a.a(spy0Var.w)}, wwg.S(1017639524, true, new qpy0(spy0Var, i3), btsVar), btsVar, 56);
                    break;
                }
            case 1:
                hwy0 hwy0Var = spy0Var.c;
                fid fidVar2 = (fid) obj;
                int intValue2 = ((Integer) obj2).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                    btsVar2.Y();
                    break;
                } else {
                    qti.c(hwy0Var.c(btsVar2), hwy0Var.a, false, wwg.S(-1270521653, true, new qpy0(spy0Var, i2), btsVar2), btsVar2, HProv.ALG_TYPE_SECURECHANNEL, 4);
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
                    xi91.a(wwg.S(150217460, true, new wls() { // from class: ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.neuro_postcard.text_input_screen.ui.b
                        @Override // defpackage.wls
                        public final Object invoke(Object obj3, Object obj4) {
                            fid fidVar4 = (fid) obj3;
                            int intValue4 = ((Integer) obj4).intValue();
                            bts btsVar4 = (bts) fidVar4;
                            if (btsVar4.V(intValue4 & 1, (intValue4 & 3) != 2)) {
                                yt0 yt0Var = new yt0((j2m0) btsVar4.m(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner()), spy0.this.b, 24);
                                rs31 a = f5z.a(btsVar4);
                                if (a == null) {
                                    ny61.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                upy0 upy0Var = (upy0) ooc.G(qoi0.a(upy0.class), a, null, yt0Var, a instanceof q7u ? ((q7u) a).getDefaultViewModelCreationExtras() : w8f.b, btsVar4);
                                tpy0 tpy0Var = (tpy0) f.b(upy0Var.A, btsVar4).getValue();
                                boolean e = btsVar4.e(upy0Var);
                                Object Q = btsVar4.Q();
                                o430 o430Var = did.a;
                                if (e || Q == o430Var) {
                                    TextInputScreenRoot$getView$1$1$1$1$1$1$1 textInputScreenRoot$getView$1$1$1$1$1$1$1 = new TextInputScreenRoot$getView$1$1$1$1$1$1$1(1, upy0Var, upy0.class, "onShown", "onShown(Ljava/lang/String;)V", 0);
                                    btsVar4.o0(textInputScreenRoot$getView$1$1$1$1$1$1$1);
                                    Q = textInputScreenRoot$getView$1$1$1$1$1$1$1;
                                }
                                tls tlsVar = (tls) ((tfx) Q);
                                boolean e2 = btsVar4.e(upy0Var);
                                Object Q2 = btsVar4.Q();
                                if (e2 || Q2 == o430Var) {
                                    TextInputScreenRoot$getView$1$1$1$1$1$2$1 textInputScreenRoot$getView$1$1$1$1$1$2$1 = new TextInputScreenRoot$getView$1$1$1$1$1$2$1(0, upy0Var, upy0.class, "onButtonClick", "onButtonClick()V", 0);
                                    btsVar4.o0(textInputScreenRoot$getView$1$1$1$1$1$2$1);
                                    Q2 = textInputScreenRoot$getView$1$1$1$1$1$2$1;
                                }
                                sls slsVar = (sls) ((tfx) Q2);
                                boolean e3 = btsVar4.e(upy0Var);
                                Object Q3 = btsVar4.Q();
                                if (e3 || Q3 == o430Var) {
                                    TextInputScreenRoot$getView$1$1$1$1$1$3$1 textInputScreenRoot$getView$1$1$1$1$1$3$1 = new TextInputScreenRoot$getView$1$1$1$1$1$3$1(1, upy0Var, upy0.class, "onTextChange", "onTextChange(Ljava/lang/String;)V", 0);
                                    btsVar4.o0(textInputScreenRoot$getView$1$1$1$1$1$3$1);
                                    Q3 = textInputScreenRoot$getView$1$1$1$1$1$3$1;
                                }
                                a.d(tpy0Var, tlsVar, slsVar, (tls) ((tfx) Q3), btsVar4, 0);
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
