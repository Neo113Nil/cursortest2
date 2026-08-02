package defpackage;

import androidx.compose.runtime.f;
import defpackage.atb1;
import defpackage.bts;
import defpackage.did;
import defpackage.f5z;
import defpackage.fid;
import defpackage.j2m0;
import defpackage.l4z;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.oz40;
import defpackage.q7u;
import defpackage.qoi0;
import defpackage.rs31;
import defpackage.sk7;
import defpackage.sls;
import defpackage.tfx;
import defpackage.tls;
import defpackage.vfc;
import defpackage.w1f;
import defpackage.w8f;
import defpackage.wls;
import defpackage.yt0;
import defpackage.yur;
import defpackage.zpn;
import defpackage.zy11;

/* loaded from: classes5.dex */
public final /* synthetic */ class t1f implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ sk7 b;

    public /* synthetic */ t1f(sk7 sk7Var, int i) {
        this.a = i;
        this.b = sk7Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        final sk7 sk7Var = this.b;
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
                    qti.a((hwy0) sk7Var.c, wwg.S(1162246059, true, new t1f(sk7Var, i2), btsVar), btsVar, 56);
                    break;
                }
            default:
                bts btsVar2 = (bts) fidVar;
                if (!btsVar2.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar2.Y();
                    break;
                } else {
                    xi91.a(wwg.S(-305150110, true, new wls() { // from class: ru.yandex.logistics.sdk.cargo_form.impl.screen_coupon.impl.ui.a
                        @Override // defpackage.wls
                        public final Object invoke(Object obj3, Object obj4) {
                            b bVar = (b) sk7.this.w;
                            fid fidVar2 = (fid) obj3;
                            int intValue2 = ((Integer) obj4).intValue();
                            bts btsVar3 = (bts) fidVar2;
                            boolean V = btsVar3.V(intValue2 & 1, (intValue2 & 3) != 2);
                            zy11 zy11Var2 = zy11.a;
                            if (!V) {
                                btsVar3.Y();
                                return zy11Var2;
                            }
                            String obj5 = bVar.toString();
                            yt0 yt0Var = new yt0((j2m0) btsVar3.m(l4z.a), bVar, 5);
                            rs31 a = f5z.a(btsVar3);
                            if (a == null) {
                                ny61.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                return null;
                            }
                            b bVar2 = (b) ooc.G(qoi0.a(b.class), a, obj5, yt0Var, a instanceof q7u ? ((q7u) a).getDefaultViewModelCreationExtras() : w8f.b, btsVar3);
                            Object Q = btsVar3.Q();
                            Object obj6 = did.a;
                            if (Q == obj6) {
                                Q = vfc.g(btsVar3);
                            }
                            yur yurVar = (yur) Q;
                            oz40 b = f.b(bVar2.w, btsVar3);
                            boolean e = btsVar3.e(bVar2);
                            Object Q2 = btsVar3.Q();
                            if (e || Q2 == obj6) {
                                Q2 = new CouponScreen$getView$1$1$1$1$1$1(bVar2, yurVar, null);
                                btsVar3.o0(Q2);
                            }
                            zpn.e(btsVar3, (wls) Q2, zy11Var2);
                            w1f w1fVar = (w1f) b.getValue();
                            boolean e2 = btsVar3.e(bVar2);
                            Object Q3 = btsVar3.Q();
                            if (e2 || Q3 == obj6) {
                                CouponScreen$getView$1$1$1$1$2$1 couponScreen$getView$1$1$1$1$2$1 = new CouponScreen$getView$1$1$1$1$2$1(1, bVar2, b.class, "onInputFieldValueChanged", "onInputFieldValueChanged(Lru/yandex/logistics/sdk/cargo_form/impl/screen_coupon/impl/ui/data/InputFieldValue;)V", 0);
                                btsVar3.o0(couponScreen$getView$1$1$1$1$2$1);
                                Q3 = couponScreen$getView$1$1$1$1$2$1;
                            }
                            tls tlsVar = (tls) ((tfx) Q3);
                            boolean e3 = btsVar3.e(bVar2);
                            Object Q4 = btsVar3.Q();
                            if (e3 || Q4 == obj6) {
                                CouponScreen$getView$1$1$1$1$3$1 couponScreen$getView$1$1$1$1$3$1 = new CouponScreen$getView$1$1$1$1$3$1(0, bVar2, b.class, "onConfirmClicked", "onConfirmClicked()V", 0);
                                btsVar3.o0(couponScreen$getView$1$1$1$1$3$1);
                                Q4 = couponScreen$getView$1$1$1$1$3$1;
                            }
                            atb1.a(w1fVar, yurVar, tlsVar, (sls) ((tfx) Q4), null, btsVar3, 48);
                            return zy11Var2;
                        }
                    }, btsVar2), btsVar2, 6);
                    break;
                }
        }
        return zy11Var;
    }
}
