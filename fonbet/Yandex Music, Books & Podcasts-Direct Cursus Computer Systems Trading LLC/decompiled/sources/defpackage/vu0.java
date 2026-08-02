package defpackage;

import android.app.Activity;
import com.yandex.passport.api.d;
import com.yandex.passport.internal.ui.bouncer.chooser.e;
import com.yandex.plus.pay.ui.core.b;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class vu0 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ vu0(boolean z, aqi aqiVar, int i, mm6 mm6Var, fk0 fk0Var, d24 d24Var) {
        this.a = 9;
        this.c = z;
        this.d = aqiVar;
        this.b = i;
        this.e = mm6Var;
        this.f = fk0Var;
        this.g = d24Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).intValue();
                jf0.g((qzm[]) this.d, this.c, (cce) this.e, (q8r) this.f, (Function2) this.g, (hq5) obj, rvf.R(this.b | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                n7w.f((String) this.d, this.b, (kf4) this.e, (lzs) this.f, (yci) this.g, this.c, (hq5) obj, rvf.R(1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                quj.v((q6k) this.d, (d85) this.e, this.c, (Function1) this.f, (Function0) this.g, (hq5) obj, rvf.R(this.b | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                ivf.i((nmj) this.d, this.c, (Activity) this.e, (dmj) this.f, (hmj) this.g, (hq5) obj, rvf.R(this.b | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                a0g.s((String) this.d, (String) this.e, this.c, (Function1) this.f, (yci) this.g, (hq5) obj, rvf.R(this.b | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                ows.a((wxk) this.d, this.c, (sdr) this.e, (c6h) this.f, (yci) this.g, (hq5) obj, rvf.R(this.b | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                ycu.a((pbu) this.d, (wn5) this.e, (jd6) this.f, this.c, (yci) this.g, (hq5) obj, rvf.R(this.b | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                ywf.j((ab0) this.d, (wn5) this.e, (ltu) this.f, this.c, (yci) this.g, (hq5) obj, rvf.R(this.b | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                o2g.u((String) this.d, this.c, (Function0) this.e, (Function0) this.f, (yci) this.g, (hq5) obj, rvf.R(this.b | 1));
                break;
            case 9:
                aqi aqiVar = (aqi) this.d;
                mm6 mm6Var = (mm6) this.e;
                fk0 fk0Var = (fk0) this.f;
                d24 d24Var = (d24) this.g;
                float floatValue = ((Float) obj).floatValue();
                float floatValue2 = ((Float) obj2).floatValue();
                if (this.c) {
                    floatValue = floatValue2;
                }
                boolean z = true;
                int i = floatValue > 0.0f ? 1 : -1;
                int d = yhn.d(((Number) aqiVar.getValue()).intValue() + i, 0, this.b - 1);
                if (d == ((Number) aqiVar.getValue()).intValue()) {
                    z = false;
                } else {
                    aqiVar.setValue(Integer.valueOf(d));
                    x97.y(mm6Var, null, null, new rs(fk0Var, d24Var, i, null, 10), 3);
                }
                break;
            case 10:
                ((Integer) obj2).getClass();
                e.a((Function0) this.d, this.c, (d) this.e, (Locale) this.f, (yci) this.g, (hq5) obj, rvf.R(this.b | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                b.d((Function0) this.d, (yci) this.e, this.c, (zk3) this.f, (wn5) this.g, (hq5) obj, rvf.R(this.b | 1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ vu0(Object obj, wn5 wn5Var, Object obj2, boolean z, yci yciVar, int i, int i2) {
        this.a = i2;
        this.d = obj;
        this.e = wn5Var;
        this.f = obj2;
        this.c = z;
        this.g = yciVar;
        this.b = i;
    }

    public /* synthetic */ vu0(Object obj, Object obj2, boolean z, Object obj3, Object obj4, int i, int i2) {
        this.a = i2;
        this.d = obj;
        this.e = obj2;
        this.c = z;
        this.f = obj3;
        this.g = obj4;
        this.b = i;
    }

    public /* synthetic */ vu0(Object obj, boolean z, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.a = i2;
        this.d = obj;
        this.c = z;
        this.e = obj2;
        this.f = obj3;
        this.g = obj4;
        this.b = i;
    }

    public /* synthetic */ vu0(String str, int i, kf4 kf4Var, lzs lzsVar, yci yciVar, boolean z, int i2) {
        this.a = 1;
        this.d = str;
        this.b = i;
        this.e = kf4Var;
        this.f = lzsVar;
        this.g = yciVar;
        this.c = z;
    }

    public /* synthetic */ vu0(nmj nmjVar, boolean z, Activity activity, dmj dmjVar, hmj hmjVar, int i) {
        this.a = 3;
        this.d = nmjVar;
        this.c = z;
        this.e = activity;
        this.f = dmjVar;
        this.g = hmjVar;
        this.b = i;
    }
}
