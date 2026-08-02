package defpackage;

import android.content.Context;
import com.yandex.pulse.metrics.o;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class s2 implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ s2(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = 23;
        int i2 = 0;
        switch (this.a) {
            case 0:
                return new wjg(i2, new xjf(i));
            case 1:
                return new d3();
            case 2:
                return new e3();
            case 3:
                return ((g2q) l18.b.c(hag.I(g2q.class))).b;
            case 4:
                return new wjg(i2, new xjf(i));
            case 5:
                return new wjg(i2, new xjf(i));
            case 6:
                return Unit.a;
            case 7:
                return Long.valueOf(System.currentTimeMillis());
            case 8:
                tkr tkrVar = tkr.a;
                return new wsd(tkrVar, new qy0(tkrVar, 0), 1);
            case 9:
                return new fm();
            case 10:
                return new wjg(i2, new xjf(i));
            case 11:
                return new e4t((Context) l18.b.c(hag.I(Context.class)));
            case 12:
                return new wbb();
            case 13:
                return new p0t();
            case 14:
                return new gpj();
            case 15:
                return new opr();
            case 16:
                return new t6k(0.0f);
            case 17:
                return Boolean.valueOf(((hx) ((byb) l18.b.c(hag.I(byb.class))).b(hx.class)).h());
            case 18:
                return Unit.a;
            case 19:
                return Unit.a;
            case 20:
                return Unit.a;
            case 21:
                return Unit.a;
            case 22:
                return Unit.a;
            case 23:
                return Unit.a;
            case 24:
                return new y40();
            case 25:
                return new z40();
            case 26:
                return new e60();
            case 27:
                return new h60();
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return Float.valueOf(1.0f);
            default:
                l18 l18Var = l18.b;
                bdt I = hag.I(upq.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                upq upqVar = (upq) qdcVar.C(I);
                jyr jyrVar = tpq.e;
                Integer b = ((cd0) cd0.e.getValue()).a().b("upperLimitSlowNetworkSpeedKbps");
                jyr jyrVar2 = dvu.e;
                boolean d = kwl.d();
                spq w = t7g.w();
                return new upq(upqVar.a, w != null ? spq.a(w, d, b, 59) : null, upqVar.c, upqVar.d, upqVar.e, upqVar.f);
        }
    }
}
