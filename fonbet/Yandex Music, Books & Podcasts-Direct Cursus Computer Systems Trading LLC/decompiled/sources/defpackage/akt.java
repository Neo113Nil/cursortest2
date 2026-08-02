package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class akt implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ckt b;
    public final /* synthetic */ zit c;

    public /* synthetic */ akt(ckt cktVar, zit zitVar, int i) {
        this.a = i;
        this.b = cktVar;
        this.c = zitVar;
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
                    pd.b(new qzm[0], false, ild.C(322815077, new akt(this.b, this.c, 1), oq5Var), oq5Var, 0, 2);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                oq5 oq5Var2 = (oq5) hq5Var;
                if (oq5Var2.P(intValue & 1, (intValue & 3) != 2)) {
                    Object K = oq5Var2.K();
                    kjn kjnVar = gq5.a;
                    ckt cktVar = this.b;
                    if (K == kjnVar) {
                        kxi d = cktVar.d();
                        cvo j = cktVar.getJ();
                        jkt jktVar = (jkt) cktVar.j.getValue();
                        kpm kpmVar = new kpm(15, cktVar);
                        nyf lifecycle = cktVar.getLifecycle();
                        lifecycle.getClass();
                        njt njtVar = new njt(d, j, this.c, jktVar, kpmVar, wyf.F(lifecycle));
                        oq5Var2.k0(njtVar);
                        K = njtVar;
                    }
                    ixf.k(cktVar.A().a.c, (njt) K, cktVar.x(), oq5Var2, RemoteCameraConfig.Mic.BUFFER_SIZE);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
