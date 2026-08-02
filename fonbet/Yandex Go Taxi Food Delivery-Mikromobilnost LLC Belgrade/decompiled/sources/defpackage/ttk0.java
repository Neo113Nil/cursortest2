package defpackage;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.slot.SlotSize;
import com.yandex.go.design.compose.slot.body.BodyAlign;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes12.dex */
public final /* synthetic */ class ttk0 implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ utk0 b;

    public /* synthetic */ ttk0(utk0 utk0Var, int i) {
        this.a = i;
        this.b = utk0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        utk0 utk0Var = this.b;
        int i2 = 1;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 17) != 16)) {
                    btsVar.Y();
                    break;
                } else {
                    ydb1.a(null, null, wwg.S(561086327, true, new ttk0(utk0Var, i2), btsVar), null, null, null, SlotSize.L, false, btsVar, 1573248, 187);
                    break;
                }
            default:
                ebp0 ebp0Var = (ebp0) obj;
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
                    f530 d = ooc.d(ljs0.c(c530.a, 1.0f), null, 3);
                    int i3 = intValue2;
                    CharSequence charSequence = utk0Var.a;
                    AppColor$Palette appColor$Palette = AppColor$Palette.TextOnControl;
                    m9b1.b(ebp0Var, charSequence, d, appColor$Palette, xya1.e(btsVar2).g.b, 0, 0, utk0Var.b, appColor$Palette, null, 0, 0, BodyAlign.Center, btsVar2, (i3 & 14) | 805309440, HProv.ALG_CLASS_DATA_ENCRYPT, 24176);
                    break;
                }
        }
        return zy11Var;
    }
}
