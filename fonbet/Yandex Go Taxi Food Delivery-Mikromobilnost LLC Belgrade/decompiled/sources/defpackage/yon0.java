package defpackage;

import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.runtime.internal.a;
import com.yandex.go.design.compose.button.ButtonForm;
import com.yandex.go.design.compose.button.ButtonStyle;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.go.design.compose.slot.SlotSize;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public final class yon0 implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ cms c;

    public /* synthetic */ yon0(cms cmsVar, boolean z, int i) {
        this.a = i;
        this.c = cmsVar;
        this.b = z;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        boolean z = this.b;
        cms cmsVar = this.c;
        int i2 = 1;
        switch (i) {
            case 0:
                ibp0 ibp0Var = (ibp0) obj;
                fid fidVar = (fid) obj2;
                int intValue = ((Number) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= ((bts) fidVar).k(ibp0Var) ? 4 : 2;
                }
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 19) != 18)) {
                    btsVar.Y();
                    break;
                } else {
                    d17.c(fj91.d(an91.o(c530.a, 8.0f, 0.0f, ibp0Var.c() == SlotSize.XS ? 4.0f : 16.0f, 0.0f, 10), IntrinsicSize.Min), true, ButtonSize.XS, ButtonStyle.Outline, ButtonForm.Circle, (sls) cmsVar, wwg.S(-147163348, true, new xon0(z, i2), btsVar), btsVar, 1576320, 0);
                    break;
                }
            default:
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Number) obj3).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                    btsVar2.Y();
                    break;
                } else {
                    ydb1.a(null, null, (a) cmsVar, null, wwg.S(-598334930, true, new xon0(z, r3), btsVar2), null, null, false, btsVar2, HProv.ALG_CLASS_DATA_ENCRYPT, 235);
                    break;
                }
        }
        return zy11Var;
    }
}
