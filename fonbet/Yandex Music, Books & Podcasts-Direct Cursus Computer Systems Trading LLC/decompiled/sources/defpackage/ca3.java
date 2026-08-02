package defpackage;

import androidx.compose.foundation.lazy.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class ca3 implements pyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ aqi b;

    public /* synthetic */ ca3(p93 p93Var, aqi aqiVar) {
        this.a = 0;
        this.b = aqiVar;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        kjn kjnVar = gq5.a;
        int i2 = 6;
        aqi aqiVar = this.b;
        switch (i) {
            case 0:
                hq5 hq5Var = (hq5) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((a) obj).getClass();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 17) != 16)) {
                    String M = rvf.M(R.string.non_music_screen_about_book_tab, oq5Var);
                    String M2 = rvf.M(R.string.non_music_screen_content_list_tab, oq5Var);
                    j0s j0sVar = ((jcj) aqiVar.getValue()).a;
                    boolean f = oq5Var.f(aqiVar);
                    Object K = oq5Var.K();
                    if (f || K == kjnVar) {
                        K = new x80(aqiVar, i2);
                        oq5Var.k0(K);
                    }
                    ocg.c(M, M2, j0sVar, (Function1) K, oq5Var, 0);
                } else {
                    oq5Var.S();
                }
                return Unit.a;
            case 1:
                mfh mfhVar = (mfh) obj;
                ffh ffhVar = (ffh) obj2;
                ga6 ga6Var = (ga6) obj3;
                mfhVar.getClass();
                ffhVar.getClass();
                ksk M3 = ffhVar.M(ia6.b(0, 0, 15));
                int g = ia6.g(M3.a, ga6Var.a);
                int f2 = ia6.f(M3.b, ga6Var.a);
                aqiVar.setValue(new xov(M3.a, g));
                return mfh.m0(mfhVar, g, f2, new zj(M3, 1));
            default:
                int intValue2 = ((Integer) obj).intValue();
                int intValue3 = ((Integer) obj3).intValue();
                oq5 oq5Var2 = (oq5) ((hq5) obj2);
                oq5Var2.Z(47996763);
                boolean z = (((intValue3 & 14) ^ 6) > 4 && oq5Var2.d(intValue2)) || (intValue3 & 6) == 4;
                Object K2 = oq5Var2.K();
                if (z || K2 == kjnVar) {
                    K2 = new uw1(intValue2, 1);
                    oq5Var2.k0(K2);
                }
                fp7 b = r3k.b(0, (Function0) K2, oq5Var2, 0, 3);
                aqiVar.setValue(b);
                oq5Var2.p(false);
                return b;
        }
    }

    public /* synthetic */ ca3(aqi aqiVar, int i) {
        this.a = i;
        this.b = aqiVar;
    }
}
