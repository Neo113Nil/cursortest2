package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class kla implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mla b;
    public final /* synthetic */ qnq c;

    public /* synthetic */ kla(mla mlaVar, qnq qnqVar, int i) {
        this.a = i;
        this.b = mlaVar;
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
                    pd.b(new qzm[0], false, ild.C(953025833, new kla(this.b, this.c, 1), oq5Var), oq5Var, 0, 2);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                mla mlaVar = this.b;
                jyr jyrVar = mlaVar.l;
                jyr jyrVar2 = mlaVar.k;
                ybf ybfVar = mlaVar.n;
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    boolean f = oq5Var2.f((vla) ybfVar.getValue()) | oq5Var2.f((fla) jyrVar2.getValue()) | oq5Var2.f((oda) jyrVar.getValue());
                    Object K = oq5Var2.K();
                    if (f || K == gq5.a) {
                        K = new nla((vla) ybfVar.getValue(), (fla) jyrVar2.getValue(), (oda) jyrVar.getValue());
                        oq5Var2.k0(K);
                    }
                    pd.l((nla) K, ((ila) mlaVar.m.getValue()).b, this.c, oq5Var2, RemoteCameraConfig.Mic.BUFFER_SIZE);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
