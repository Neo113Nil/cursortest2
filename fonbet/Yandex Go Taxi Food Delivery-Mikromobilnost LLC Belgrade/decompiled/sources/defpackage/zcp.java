package defpackage;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.input.InputState;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public final /* synthetic */ class zcp implements bms {
    public final /* synthetic */ int a;
    public final /* synthetic */ oz40 b;

    public /* synthetic */ zcp(int i, oz40 oz40Var) {
        this.a = i;
        this.b = oz40Var;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3 = this.a;
        zy11 zy11Var = zy11.a;
        oz40 oz40Var = this.b;
        switch (i3) {
            case 0:
                fid fidVar = (fid) obj3;
                int intValue = ((Integer) obj4).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & HProv.PP_SECURITY_LEVEL) != 128)) {
                    btsVar.Y();
                    break;
                } else {
                    jeb1.f(cvu0.v(cvu0.v(ohb1.e(btsVar, kyh0.payment_methods_name_edit_characters_counter), "$CURRENT$", String.valueOf(((String) oz40Var.getValue()).length()), false), "$MAX$", "40", false), an91.m(c530.a, 16.0f, 0.0f, 2), null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar).h.a, btsVar, 0, 0, 16380);
                    break;
                }
            case 1:
                ibp0 ibp0Var = (ibp0) obj;
                InputState inputState = (InputState) obj2;
                fid fidVar2 = (fid) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    i = intValue2 | (((bts) fidVar2).k(ibp0Var) ? 4 : 2);
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i |= fidVar2.c(inputState.ordinal()) ? 32 : 16;
                }
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(i & 1, (i & 147) != 146)) {
                    btsVar2.Y();
                    break;
                } else {
                    boolean e = k7b1.e(inputState);
                    c530 c530Var = c530.a;
                    if (!e) {
                        if (!k7b1.d(inputState)) {
                            btsVar2.e0(1695285907);
                            jeb1.f(cvu0.v(cvu0.v(ohb1.e(btsVar2, kyh0.payment_methods_name_edit_characters_counter), "$CURRENT$", String.valueOf(((String) oz40Var.getValue()).length()), false), "$MAX$", "20", false), an91.m(c530Var, 16.0f, 0.0f, 2), null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar2).h.a, btsVar2, 0, 0, 16380);
                            btsVar2.t(false);
                            break;
                        } else {
                            btsVar2.e0(1695668199);
                            nnm.s(c530Var, !Float.isNaN(Float.NaN) ? Float.NaN : deb1.a(ibp0Var.c()), btsVar2, false);
                            break;
                        }
                    } else {
                        btsVar2.e0(1695199975);
                        zrb1.a(ibp0Var, tea1.f(), c530Var, AppColor$Palette.Error, btsVar2, i & 14, 4);
                        btsVar2.t(false);
                        break;
                    }
                }
            default:
                ibp0 ibp0Var2 = (ibp0) obj;
                InputState inputState2 = (InputState) obj2;
                fid fidVar3 = (fid) obj3;
                int intValue3 = ((Integer) obj4).intValue();
                if ((intValue3 & 6) == 0) {
                    i2 = intValue3 | (((bts) fidVar3).k(ibp0Var2) ? 4 : 2);
                } else {
                    i2 = intValue3;
                }
                if ((intValue3 & 48) == 0) {
                    i2 |= fidVar3.c(inputState2.ordinal()) ? 32 : 16;
                }
                bts btsVar3 = (bts) fidVar3;
                if (!btsVar3.V(i2 & 1, (i2 & 147) != 146)) {
                    btsVar3.Y();
                    break;
                } else {
                    boolean e2 = k7b1.e(inputState2);
                    c530 c530Var2 = c530.a;
                    if (!e2) {
                        if (!k7b1.d(inputState2)) {
                            btsVar3.e0(-1007604104);
                            jeb1.f(cvu0.v(cvu0.v(ohb1.e(btsVar3, kyh0.payment_methods_name_edit_characters_counter), "$CURRENT$", String.valueOf(((String) oz40Var.getValue()).length()), false), "$MAX$", "40", false), an91.m(c530Var2, 16.0f, 0.0f, 2), null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar3).h.a, btsVar3, 0, 0, 16380);
                            btsVar3.t(false);
                            break;
                        } else {
                            btsVar3.e0(-1007187495);
                            nnm.s(c530Var2, !Float.isNaN(Float.NaN) ? Float.NaN : deb1.a(ibp0Var2.c()), btsVar3, false);
                            break;
                        }
                    } else {
                        btsVar3.e0(-1007702343);
                        zrb1.a(ibp0Var2, tea1.f(), c530Var2, AppColor$Palette.Error, btsVar3, i2 & 14, 4);
                        btsVar3.t(false);
                        break;
                    }
                }
        }
        return zy11Var;
    }
}
