package defpackage;

import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class z16 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c26 b;
    public final /* synthetic */ yci c;

    public /* synthetic */ z16(c26 c26Var, yci yciVar) {
        this.a = 1;
        this.b = c26Var;
        this.c = yciVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        yci yciVar = this.c;
        c26 c26Var = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                zc4.c(c26Var, yciVar, (hq5) obj, rvf.R(1));
                break;
            case 1:
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                c26 c26Var2 = this.b;
                cpq cpqVar = (cpq) gld.M(c26Var2.s(), hq5Var).getValue();
                ogp.g.e(cpqVar instanceof zoq, cpqVar instanceof apq, null, hq5Var, 4096, 4);
                t16 t16Var = ((l26) gld.O(c26Var2.y(), hq5Var).getValue()).a;
                String M = rvf.M(R.string.concert_tab_top_bar_title, hq5Var);
                boolean q = c26Var2.q();
                oq5 oq5Var2 = (oq5) hq5Var;
                boolean h = oq5Var2.h(c26Var2);
                Object K = oq5Var2.K();
                kjn kjnVar = gq5.a;
                if (h || K == kjnVar) {
                    K = new e65(0, c26Var2, c26.class, "onLocationClick", "onLocationClick()V", 0, 20);
                    oq5Var2.k0(K);
                }
                h9f h9fVar = (h9f) K;
                boolean h2 = oq5Var2.h(c26Var2);
                Object K2 = oq5Var2.K();
                if (h2 || K2 == kjnVar) {
                    e65 e65Var = new e65(0, c26Var2, c26.class, "onSearchClick", "onSearchClick()V", 0, 21);
                    oq5Var2.k0(e65Var);
                    K2 = e65Var;
                }
                wn5 C = ild.C(1182679754, new ar(22, cpqVar, c26Var2), oq5Var2);
                yd5.h(M, t16Var, q, (Function0) h9fVar, this.c, (Function0) ((h9f) K2), C, oq5Var2, ScreenMirroringConfig.Video.BITRATE_1_5MB);
            default:
                ((Integer) obj2).getClass();
                zc4.b(c26Var, yciVar, (hq5) obj, rvf.R(49));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ z16(c26 c26Var, yci yciVar, int i, int i2) {
        this.a = i2;
        this.b = c26Var;
        this.c = yciVar;
    }
}
