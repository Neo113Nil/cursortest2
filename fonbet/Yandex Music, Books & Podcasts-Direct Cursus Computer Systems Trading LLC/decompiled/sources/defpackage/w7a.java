package defpackage;

import androidx.compose.ui.platform.a;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class w7a implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ w7a(Function0 function0, Function0 function02) {
        this.a = 0;
        this.b = function0;
        this.c = function02;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        hq5 hq5Var = (hq5) obj;
        Integer num = (Integer) obj2;
        switch (this.a) {
            case 0:
                if ((num.intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                yci a = a.a(vci.a, "donation_button");
                oq5 oq5Var2 = (oq5) hq5Var;
                Object K = oq5Var2.K();
                kjn kjnVar = gq5.a;
                if (K == kjnVar) {
                    K = new c68(18);
                    oq5Var2.k0(K);
                }
                yci a2 = nfp.a(a, (Function1) K);
                Object K2 = oq5Var2.K();
                if (K2 == kjnVar) {
                    K2 = szf.U(new or(18, this.c));
                    oq5Var2.k0(K2);
                }
                a0g.p(this.b, a2, false, ((Boolean) ((sdr) K2).getValue()).booleanValue(), 0L, ((q9b) oq5Var2.j(s9b.a)).a(), qld.b, oq5Var2, ScreenMirroringConfig.Video.BITRATE_1_5MB, 20);
            case 1:
                num.getClass();
                irf.m(this.b, this.c, hq5Var, rvf.R(1));
                break;
            case 2:
                num.getClass();
                lg3.x(this.b, this.c, hq5Var, rvf.R(1));
                break;
            case 3:
                num.getClass();
                szf.a(this.b, this.c, hq5Var, rvf.R(1));
                break;
            default:
                num.getClass();
                a4g.p(this.b, this.c, hq5Var, rvf.R(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ w7a(Function0 function0, Function0 function02, int i, int i2) {
        this.a = i2;
        this.b = function0;
        this.c = function02;
    }
}
