package defpackage;

import android.content.Context;
import com.yandex.music.shared.wave.data.network.TrackRotorApi;
import com.yandex.passport.sloth.ui.dependencies.m;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class kuu implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ luu b;

    public /* synthetic */ kuu(luu luuVar, int i) {
        this.a = i;
        this.b = luuVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                luu luuVar = this.b;
                m mVar = luuVar.a;
                rp7 rp7Var = new rp7(new yks((pv9) mVar.i, new bma((Context) mVar.b)));
                Object b = i0j.a((i0j) mVar.d, null, new phs(28), new x6s(16), null, 51).a.b(TrackRotorApi.class);
                b.getClass();
                qzc qzcVar = new qzc(28, (TrackRotorApi) b);
                f5v f5vVar = new f5v(qzcVar, btf.b(new kuu(luuVar, 2)));
                sml smlVar = new sml((oou) mVar.e);
                pt7 pt7Var = new pt7((jyr) mVar.c, btf.b(new kuu(luuVar, 3)), 0);
                mn7 mn7Var = dm6.b;
                mn7Var.getClass();
                gs4 gs4Var = new gs4();
                gs4Var.a = smlVar;
                gs4Var.b = qzcVar;
                gs4Var.c = gld.e(e.c(a4g.n(), mn7Var).plus(new im6("LeftoverFeedbackReporter")));
                gs4Var.d = new ReentrantLock();
                mmo mmoVar = new mmo(smlVar, pt7Var, gs4Var, mn7Var);
                return new ysu(f5vVar, new rdk(luuVar, mmoVar, qzcVar, f5vVar, new fmu(new wul(), new vtm((guu) mVar.g)), rp7Var, 29), mmoVar, mn7Var);
            case 1:
                return (ryu) this.b.a.h;
            case 2:
                rsh rshVar = (rsh) this.b.a.k;
                if (rshVar != null) {
                    return (bou) rshVar.b.getValue();
                }
                return null;
            default:
                return (muu) this.b.a.f;
        }
    }
}
