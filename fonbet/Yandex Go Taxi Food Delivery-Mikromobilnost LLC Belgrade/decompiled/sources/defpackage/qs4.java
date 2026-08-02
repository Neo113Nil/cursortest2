package defpackage;

import defpackage.bts;
import defpackage.did;
import defpackage.fid;
import defpackage.k4b1;
import defpackage.o430;
import defpackage.rs4;
import defpackage.sls;
import defpackage.tfx;
import defpackage.zs4;
import defpackage.zy11;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final /* synthetic */ class qs4 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ss4 b;
    public final /* synthetic */ rs4 c;
    public final /* synthetic */ zs4 w;

    public /* synthetic */ qs4(ss4 ss4Var, rs4 rs4Var, zs4 zs4Var, int i) {
        this.a = i;
        this.b = ss4Var;
        this.c = rs4Var;
        this.w = zs4Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        final zs4 zs4Var = this.w;
        final rs4 rs4Var = this.c;
        ss4 ss4Var = this.b;
        int i2 = 1;
        fid fidVar = (fid) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    sb2.b(nnm.f(ss4Var.c, btsVar, qti.e), wwg.S(160243541, true, new qs4(ss4Var, rs4Var, zs4Var, i2), btsVar), btsVar, 56);
                    break;
                }
            default:
                bts btsVar2 = (bts) fidVar;
                if (!btsVar2.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar2.Y();
                    break;
                } else {
                    qti.a(ss4Var.c, wwg.S(-1862585204, true, new wls() { // from class: ru.yandex.taxi.logistics.sdk.promotions.impl.ui.info.a
                        @Override // defpackage.wls
                        public final Object invoke(Object obj3, Object obj4) {
                            fid fidVar2 = (fid) obj3;
                            int intValue2 = ((Integer) obj4).intValue();
                            bts btsVar3 = (bts) fidVar2;
                            if (btsVar3.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                                ArrayList arrayList = rs4.this.a;
                                zs4 zs4Var2 = zs4Var;
                                boolean e = btsVar3.e(zs4Var2);
                                Object Q = btsVar3.Q();
                                o430 o430Var = did.a;
                                if (e || Q == o430Var) {
                                    BannerInfoModalView$getView$1$1$1$1$1$1 bannerInfoModalView$getView$1$1$1$1$1$1 = new BannerInfoModalView$getView$1$1$1$1$1$1(0, zs4Var2, zs4.class, "onShown", "onShown()V", 0);
                                    btsVar3.o0(bannerInfoModalView$getView$1$1$1$1$1$1);
                                    Q = bannerInfoModalView$getView$1$1$1$1$1$1;
                                }
                                sls slsVar = (sls) ((tfx) Q);
                                boolean e2 = btsVar3.e(zs4Var2);
                                Object Q2 = btsVar3.Q();
                                if (e2 || Q2 == o430Var) {
                                    BannerInfoModalView$getView$1$1$1$1$2$1 bannerInfoModalView$getView$1$1$1$1$2$1 = new BannerInfoModalView$getView$1$1$1$1$2$1(0, zs4Var2, zs4.class, "onClosed", "onClosed()V", 0);
                                    btsVar3.o0(bannerInfoModalView$getView$1$1$1$1$2$1);
                                    Q2 = bannerInfoModalView$getView$1$1$1$1$2$1;
                                }
                                sls slsVar2 = (sls) ((tfx) Q2);
                                boolean e3 = btsVar3.e(zs4Var2);
                                Object Q3 = btsVar3.Q();
                                if (e3 || Q3 == o430Var) {
                                    BannerInfoModalView$getView$1$1$1$1$3$1 bannerInfoModalView$getView$1$1$1$1$3$1 = new BannerInfoModalView$getView$1$1$1$1$3$1(0, zs4Var2, zs4.class, "onCloseClicked", "onCloseClicked()V", 0);
                                    btsVar3.o0(bannerInfoModalView$getView$1$1$1$1$3$1);
                                    Q3 = bannerInfoModalView$getView$1$1$1$1$3$1;
                                }
                                k4b1.b(arrayList, slsVar, slsVar2, (sls) ((tfx) Q3), btsVar3, 0, 0);
                            } else {
                                btsVar3.Y();
                            }
                            return zy11.a;
                        }
                    }, btsVar2), btsVar2, 56);
                    break;
                }
        }
        return zy11Var;
    }
}
