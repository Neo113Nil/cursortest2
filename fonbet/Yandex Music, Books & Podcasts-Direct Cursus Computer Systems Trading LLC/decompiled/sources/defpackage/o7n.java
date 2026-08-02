package defpackage;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class o7n implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ aqi b;

    public /* synthetic */ o7n(aqi aqiVar, int i) {
        this.a = i;
        this.b = aqiVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        aqi aqiVar = this.b;
        switch (i) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                orl.a(0, 2, ((ma5) ((oq5) hq5Var).j(pa5.a)).d(), hq5Var, null, ((qmu) aqiVar.getValue()) == qmu.c);
            case 1:
                hq5 hq5Var2 = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue & 1, (intValue & 3) != 2)) {
                    Object K = oq5Var2.K();
                    if (K == gq5.a) {
                        K = new jc(aqiVar, 23);
                        oq5Var2.k0(K);
                    }
                    bcx.d((Function0) K, a.a(vci.a, "dismiss_button"), false, h4a.h, oq5Var2, 3126, 4);
                } else {
                    oq5Var2.S();
                }
                break;
            case 2:
                hq5 hq5Var3 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var3 = (oq5) hq5Var3;
                if (oq5Var3.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    String quantityString = ((Context) oq5Var3.j(AndroidCompositionLocals_androidKt.b)).getResources().getQuantityString(R.plurals.delete_tracks_cache_num, ((Number) aqiVar.getValue()).intValue(), Integer.valueOf(((Number) aqiVar.getValue()).intValue()));
                    quantityString.getClass();
                    xcs.b(quantityString, null, ((dq0) oq5Var3.j(eq0.a)).b.a, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, nu0.j(), oq5Var3, 0, 0, 65530);
                } else {
                    oq5Var3.S();
                }
                break;
            default:
                lfm lfmVar = (lfm) obj;
                enj enjVar = (enj) obj2;
                lfmVar.getClass();
                lfmVar.a();
                aqiVar.setValue(new enj((Float.floatToRawIntBits(Float.intBitsToFloat((int) (enjVar.a >> 32)) + Float.intBitsToFloat((int) (((enj) aqiVar.getValue()).a >> 32))) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (enjVar.a & 4294967295L)) + Float.intBitsToFloat((int) (((enj) aqiVar.getValue()).a & 4294967295L))) & 4294967295L)));
                break;
        }
        return Unit.a;
    }
}
