package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import kotlin.Unit;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class ez4 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hz4 b;
    public final /* synthetic */ qnq c;

    public /* synthetic */ ez4(hz4 hz4Var, qnq qnqVar, int i) {
        this.a = i;
        this.b = hz4Var;
        this.c = qnqVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    pd.b(new qzm[0], false, ild.C(636767624, new ez4(this.b, this.c, 1), oq5Var), oq5Var, 0, 2);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                hz4 hz4Var = this.b;
                ybf ybfVar = hz4Var.n;
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Object K = oq5Var2.K();
                    kjn kjnVar = gq5.a;
                    if (K == kjnVar) {
                        K = gld.R(g.a, oq5Var2);
                        oq5Var2.k0(K);
                    }
                    mm6 mm6Var = (mm6) K;
                    Object K2 = oq5Var2.K();
                    if (K2 == kjnVar) {
                        K2 = new jz4((yz4) ybfVar.getValue(), (yy4) hz4Var.o.getValue(), mm6Var);
                        oq5Var2.k0(K2);
                    }
                    h4a.e((jz4) K2, ((cz4) hz4Var.m.getValue()).b, this.c, oq5Var2, RemoteCameraConfig.Mic.BUFFER_SIZE);
                    rzf.j(((yz4) ybfVar.getValue()).y, null, oq5Var2, 0, 2);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
