package defpackage;

import com.yandex.go.design.compose.badge.BadgeSize;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.slot.body.BodyAlign;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes13.dex */
public final /* synthetic */ class y0p0 implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ m1p0 b;

    public /* synthetic */ y0p0(m1p0 m1p0Var, int i) {
        this.a = i;
        this.b = m1p0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        final m1p0 m1p0Var = this.b;
        Object[] objArr = 0;
        final int i2 = 1;
        switch (i) {
            case 0:
                l1p0 l1p0Var = m1p0Var.h;
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 17) != 16)) {
                    btsVar.Y();
                    break;
                } else {
                    wp2 wp2Var = l1p0Var.b;
                    long b = ldc.b(tje.n(wp2Var, btsVar), 0.2f, 0.0f, 0.0f, 0.0f, 14);
                    int i3 = up2.c;
                    wk4.a(BadgeSize.M, new mm4(wp2Var, AppColor$Palette.EverFront, new am4(new up2(b))), an91.d(6.0f, 0.0f, 6.0f, 2.0f, 2), an91.o(c530.a, 0.0f, 0.0f, 16.0f, 0.0f, 11), wwg.S(363410840, true, new jrn0(l1p0Var.a, xya1.e(btsVar).h.b, 3), btsVar), btsVar, 200070);
                    break;
                }
            default:
                final ebp0 ebp0Var = (ebp0) obj;
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((bts) fidVar2).k(ebp0Var) ? 4 : 2;
                }
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                    btsVar2.Y();
                    break;
                } else {
                    final Object[] objArr2 = objArr == true ? 1 : 0;
                    vub1.b(wwg.S(28411475, true, new wls() { // from class: a1p0
                        @Override // defpackage.wls
                        public final Object invoke(Object obj4, Object obj5) {
                            int i4 = objArr2;
                            zy11 zy11Var2 = zy11.a;
                            m1p0 m1p0Var2 = m1p0Var;
                            switch (i4) {
                                case 0:
                                    fid fidVar3 = (fid) obj4;
                                    int intValue3 = ((Integer) obj5).intValue();
                                    bts btsVar3 = (bts) fidVar3;
                                    if (!btsVar3.V(intValue3 & 1, (intValue3 & 3) != 2)) {
                                        btsVar3.Y();
                                        break;
                                    } else {
                                        m9b1.b(ebp0Var, m1p0Var2.b, null, null, null, 0, 0, m1p0Var2.c, null, null, 0, 0, null, btsVar3, 0, 0, 32638);
                                        break;
                                    }
                                default:
                                    fid fidVar4 = (fid) obj4;
                                    int intValue4 = ((Integer) obj5).intValue();
                                    bts btsVar4 = (bts) fidVar4;
                                    if (!btsVar4.V(intValue4 & 1, (intValue4 & 3) != 2)) {
                                        btsVar4.Y();
                                        break;
                                    } else {
                                        m9b1.b(ebp0Var, m1p0Var2.d, null, null, null, 0, 0, m1p0Var2.e, null, null, 0, 0, BodyAlign.End, btsVar4, 0, HProv.ALG_CLASS_DATA_ENCRYPT, 24446);
                                        break;
                                    }
                            }
                            return zy11Var2;
                        }
                    }, btsVar2), wwg.S(-110373932, true, new wls() { // from class: a1p0
                        @Override // defpackage.wls
                        public final Object invoke(Object obj4, Object obj5) {
                            int i4 = i2;
                            zy11 zy11Var2 = zy11.a;
                            m1p0 m1p0Var2 = m1p0Var;
                            switch (i4) {
                                case 0:
                                    fid fidVar3 = (fid) obj4;
                                    int intValue3 = ((Integer) obj5).intValue();
                                    bts btsVar3 = (bts) fidVar3;
                                    if (!btsVar3.V(intValue3 & 1, (intValue3 & 3) != 2)) {
                                        btsVar3.Y();
                                        break;
                                    } else {
                                        m9b1.b(ebp0Var, m1p0Var2.b, null, null, null, 0, 0, m1p0Var2.c, null, null, 0, 0, null, btsVar3, 0, 0, 32638);
                                        break;
                                    }
                                default:
                                    fid fidVar4 = (fid) obj4;
                                    int intValue4 = ((Integer) obj5).intValue();
                                    bts btsVar4 = (bts) fidVar4;
                                    if (!btsVar4.V(intValue4 & 1, (intValue4 & 3) != 2)) {
                                        btsVar4.Y();
                                        break;
                                    } else {
                                        m9b1.b(ebp0Var, m1p0Var2.d, null, null, null, 0, 0, m1p0Var2.e, null, null, 0, 0, BodyAlign.End, btsVar4, 0, HProv.ALG_CLASS_DATA_ENCRYPT, 24446);
                                        break;
                                    }
                            }
                            return zy11Var2;
                        }
                    }, btsVar2), null, 0.0f, null, null, btsVar2, 54, 60);
                    break;
                }
        }
        return zy11Var;
    }
}
