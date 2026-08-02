package defpackage;

import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class ay5 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ny5 b;
    public final /* synthetic */ aw5 c;

    public /* synthetic */ ay5(ny5 ny5Var, aw5 aw5Var, int i) {
        this.a = i;
        this.b = ny5Var;
        this.c = aw5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        hq5 hq5Var = (hq5) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    pd.b(new qzm[0], false, ild.C(-1253482698, new ay5(this.b, this.c, 1), oq5Var), oq5Var, 0, 2);
                } else {
                    oq5Var.S();
                }
                break;
            case 1:
                oq5 oq5Var2 = (oq5) hq5Var;
                if (oq5Var2.P(intValue & 1, (intValue & 3) != 2)) {
                    q5g.k(null, null, ((dq0) oq5Var2.j(eq0.a)).c.a, 0L, null, 0.0f, ild.C(1052831346, new ay5(this.b, this.c, 2), oq5Var2), oq5Var2, ScreenMirroringConfig.Video.BITRATE_1_5MB, 59);
                } else {
                    oq5Var2.S();
                }
                break;
            default:
                oq5 oq5Var3 = (oq5) hq5Var;
                if (oq5Var3.P(intValue & 1, (intValue & 3) != 2)) {
                    ny5 ny5Var = this.b;
                    pd.h(ny5Var.a, this.c, ny5Var.b, ny5Var.c, ny5Var.d, null, oq5Var3, 0);
                } else {
                    oq5Var3.S();
                }
                break;
        }
        return Unit.a;
    }
}
