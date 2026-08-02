package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import kotlin.Unit;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class p3j implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ q3j c;

    public /* synthetic */ p3j(String str, q3j q3jVar, int i) {
        this.a = i;
        this.b = str;
        this.c = q3jVar;
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
                    pd.b(new qzm[0], false, ild.C(-1267419528, new p3j(this.b, this.c, 1), oq5Var), oq5Var, 0, 2);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                oq5 oq5Var2 = (oq5) hq5Var;
                if (oq5Var2.P(intValue & 1, (intValue & 3) != 2)) {
                    Object K = oq5Var2.K();
                    kjn kjnVar = gq5.a;
                    if (K == kjnVar) {
                        K = gld.R(g.a, oq5Var2);
                        oq5Var2.k0(K);
                    }
                    mm6 mm6Var = (mm6) K;
                    Object K2 = oq5Var2.K();
                    q3j q3jVar = this.c;
                    if (K2 == kjnVar) {
                        K2 = new s3j((z3j) q3jVar.j.getValue(), (pui) q3jVar.l.getValue(), mm6Var);
                        oq5Var2.k0(K2);
                    }
                    wxf.a(this.b, (s3j) K2, q3jVar.x(), oq5Var2, RemoteCameraConfig.Mic.BUFFER_SIZE);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
