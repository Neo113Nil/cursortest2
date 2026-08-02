package defpackage;

import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class aso extends uif implements pyc {
    public final /* synthetic */ pyc A;
    public final /* synthetic */ hso B;
    public final /* synthetic */ gqi r;
    public final /* synthetic */ ufc s;
    public final /* synthetic */ long t;
    public final /* synthetic */ long u;
    public final /* synthetic */ int v;
    public final /* synthetic */ wn5 w;
    public final /* synthetic */ wn5 x;
    public final /* synthetic */ Function2 y;
    public final /* synthetic */ Function2 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aso(gqi gqiVar, ufc ufcVar, long j, long j2, int i, wn5 wn5Var, wn5 wn5Var2, Function2 function2, Function2 function22, pyc pycVar, hso hsoVar) {
        super(3);
        this.r = gqiVar;
        this.s = ufcVar;
        this.t = j;
        this.u = j2;
        this.v = i;
        this.w = wn5Var;
        this.x = wn5Var2;
        this.y = function2;
        this.z = function22;
        this.A = pycVar;
        this.B = hsoVar;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        yci yciVar = (yci) obj;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= ((oq5) hq5Var).f(yciVar) ? 4 : 2;
        }
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(intValue & 1, (intValue & 19) != 18)) {
            gqi gqiVar = this.r;
            boolean f = oq5Var.f(gqiVar);
            ufc ufcVar = this.s;
            boolean f2 = f | oq5Var.f(ufcVar);
            Object K = oq5Var.K();
            if (f2 || K == gq5.a) {
                K = new afg(28, gqiVar, ufcVar);
                oq5Var.k0(K);
            }
            pzm pzmVar = sqv.a;
            q5g.k(vnj.q(yciVar, new kna(1, (Function1) K)), null, this.t, this.u, null, 0.0f, ild.C(1772955108, new rl0(this.v, this.w, this.x, this.y, this.r, this.z, this.A, this.B), oq5Var), oq5Var, ScreenMirroringConfig.Video.BITRATE_1_5MB, 50);
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }
}
