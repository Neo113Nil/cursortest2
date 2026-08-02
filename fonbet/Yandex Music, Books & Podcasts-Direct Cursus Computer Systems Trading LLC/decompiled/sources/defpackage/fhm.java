package defpackage;

import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class fhm implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ at5 c;

    public /* synthetic */ fhm(List list, at5 at5Var, int i) {
        this.a = 3;
        this.b = list;
        this.c = at5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        hq5 hq5Var = (hq5) obj;
        Integer num = (Integer) obj2;
        switch (this.a) {
            case 0:
                int intValue = num.intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    pd.b(new qzm[0], false, ild.C(1756803967, new fhm(this.b, this.c, 1, (byte) 0), oq5Var), oq5Var, 0, 2);
                } else {
                    oq5Var.S();
                }
                break;
            case 1:
                int intValue2 = num.intValue();
                oq5 oq5Var2 = (oq5) hq5Var;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    q5g.k(null, null, ((dq0) oq5Var2.j(eq0.a)).c.a, 0L, null, 0.0f, ild.C(1151307715, new fhm(this.b, this.c, 2, (byte) 0), oq5Var2), oq5Var2, ScreenMirroringConfig.Video.BITRATE_1_5MB, 59);
                } else {
                    oq5Var2.S();
                }
                break;
            case 2:
                int intValue3 = num.intValue();
                oq5 oq5Var3 = (oq5) hq5Var;
                if (oq5Var3.P(intValue3 & 1, (intValue3 & 3) != 2)) {
                    wyf.j(this.b, this.c, oq5Var3, 0);
                } else {
                    oq5Var3.S();
                }
                break;
            default:
                num.getClass();
                wyf.j(this.b, this.c, hq5Var, rvf.R(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ fhm(List list, at5 at5Var, int i, byte b) {
        this.a = i;
        this.b = list;
        this.c = at5Var;
    }
}
