package defpackage;

import androidx.compose.runtime.f;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.bts;
import defpackage.did;
import defpackage.f5z;
import defpackage.fid;
import defpackage.j2m0;
import defpackage.k7d0;
import defpackage.ny61;
import defpackage.o430;
import defpackage.ooc;
import defpackage.q7u;
import defpackage.qoi0;
import defpackage.rs31;
import defpackage.sls;
import defpackage.tfx;
import defpackage.tls;
import defpackage.w8f;
import defpackage.xv10;
import defpackage.yfe0;
import defpackage.yt0;
import defpackage.zpn;
import defpackage.zy11;

/* loaded from: classes5.dex */
public final /* synthetic */ class tfe0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ xv10 b;

    public /* synthetic */ tfe0(xv10 xv10Var, int i) {
        this.a = i;
        this.b = xv10Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        final xv10 xv10Var = this.b;
        int i2 = 2;
        int i3 = 1;
        fid fidVar = (fid) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    sb2.b(ua3.a.a((dci) xv10Var.w), wwg.S(746435133, true, new tfe0(xv10Var, i3), btsVar), btsVar, 56);
                    break;
                }
            case 1:
                bts btsVar2 = (bts) fidVar;
                if (!btsVar2.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar2.Y();
                    break;
                } else {
                    qti.a((hwy0) xv10Var.b, wwg.S(1021945574, true, new tfe0(xv10Var, i2), btsVar2), btsVar2, 56);
                    break;
                }
            default:
                bts btsVar3 = (bts) fidVar;
                if (!btsVar3.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar3.Y();
                    break;
                } else {
                    xi91.a(wwg.S(122920591, true, new wls() { // from class: ru.yandex.taxi.logistics.sdk.postcard.presentation.ui.b
                        @Override // defpackage.wls
                        public final Object invoke(Object obj3, Object obj4) {
                            fid fidVar2 = (fid) obj3;
                            int intValue2 = ((Integer) obj4).intValue();
                            bts btsVar4 = (bts) fidVar2;
                            boolean V = btsVar4.V(intValue2 & 1, (intValue2 & 3) != 2);
                            zy11 zy11Var2 = zy11.a;
                            if (!V) {
                                btsVar4.Y();
                                return zy11Var2;
                            }
                            xv10 xv10Var2 = xv10.this;
                            String str = (String) xv10Var2.x;
                            yt0 yt0Var = new yt0((j2m0) btsVar4.m(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner()), (d) xv10Var2.c, 18);
                            rs31 a = f5z.a(btsVar4);
                            if (a == null) {
                                ny61.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                return null;
                            }
                            d dVar = (d) ooc.G(qoi0.a(d.class), a, str, yt0Var, a instanceof q7u ? ((q7u) a).getDefaultViewModelCreationExtras() : w8f.b, btsVar4);
                            yfe0 yfe0Var = (yfe0) f.b(dVar.z, btsVar4).getValue();
                            o430 o430Var = did.a;
                            if (yfe0Var == null) {
                                btsVar4.e0(-1679200003);
                                btsVar4.t(false);
                            } else {
                                btsVar4.e0(-1679200002);
                                boolean e = btsVar4.e(dVar);
                                Object Q = btsVar4.Q();
                                if (e || Q == o430Var) {
                                    PostcardPresentationScreen$getView$1$1$1$1$1$1$1$1 postcardPresentationScreen$getView$1$1$1$1$1$1$1$1 = new PostcardPresentationScreen$getView$1$1$1$1$1$1$1$1(0, dVar, d.class, "onButtonClick", "onButtonClick()V", 0);
                                    btsVar4.o0(postcardPresentationScreen$getView$1$1$1$1$1$1$1$1);
                                    Q = postcardPresentationScreen$getView$1$1$1$1$1$1$1$1;
                                }
                                sls slsVar = (sls) ((tfx) Q);
                                boolean e2 = btsVar4.e(dVar);
                                Object Q2 = btsVar4.Q();
                                if (e2 || Q2 == o430Var) {
                                    PostcardPresentationScreen$getView$1$1$1$1$1$1$2$1 postcardPresentationScreen$getView$1$1$1$1$1$1$2$1 = new PostcardPresentationScreen$getView$1$1$1$1$1$1$2$1(0, dVar, d.class, "onImageLoaded", "onImageLoaded()V", 0);
                                    btsVar4.o0(postcardPresentationScreen$getView$1$1$1$1$1$1$2$1);
                                    Q2 = postcardPresentationScreen$getView$1$1$1$1$1$1$2$1;
                                }
                                sls slsVar2 = (sls) ((tfx) Q2);
                                boolean e3 = btsVar4.e(dVar);
                                Object Q3 = btsVar4.Q();
                                if (e3 || Q3 == o430Var) {
                                    PostcardPresentationScreen$getView$1$1$1$1$1$1$3$1 postcardPresentationScreen$getView$1$1$1$1$1$1$3$1 = new PostcardPresentationScreen$getView$1$1$1$1$1$1$3$1(0, dVar, d.class, "onImageLoadingError", "onImageLoadingError()V", 0);
                                    btsVar4.o0(postcardPresentationScreen$getView$1$1$1$1$1$1$3$1);
                                    Q3 = postcardPresentationScreen$getView$1$1$1$1$1$1$3$1;
                                }
                                a.a(yfe0Var, slsVar, slsVar2, (sls) ((tfx) Q3), btsVar4, 0);
                                btsVar4.t(false);
                            }
                            boolean e4 = btsVar4.e(dVar);
                            Object Q4 = btsVar4.Q();
                            if (e4 || Q4 == o430Var) {
                                Q4 = new k7d0(14, dVar);
                                btsVar4.o0(Q4);
                            }
                            zpn.a(zy11Var2, (tls) Q4, btsVar4);
                            return zy11Var2;
                        }
                    }, btsVar3), btsVar3, 6);
                    break;
                }
        }
        return zy11Var;
    }
}
