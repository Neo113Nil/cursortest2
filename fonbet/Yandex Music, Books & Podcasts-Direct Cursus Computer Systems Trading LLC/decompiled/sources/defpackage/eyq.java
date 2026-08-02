package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.messenger.websdk.api.Cancelable;
import com.yandex.music.shared.smart.downloading.domain.SmartDownloadWorker;
import com.yandex.pulse.metrics.o;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class eyq implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ eyq(lik likVar) {
        this.a = 25;
        bjk bjkVar = bjk.a;
        this.b = likVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = 3;
        int i2 = 1;
        int i3 = 0;
        Continuation continuation = null;
        switch (this.a) {
            case 0:
                dyq dyqVar = ((fyq) this.b).b;
                x97.y(dyqVar.d, null, null, new byq(dyqVar, continuation, i3), 3);
                return Unit.a;
            case 1:
                return (zxq) ((o) this.b).a.getValue();
            case 2:
                pzl pzlVar = ((zxq) ((iyq) this.b).a.getValue()).a;
                pzlVar.getClass();
                bdt I = hag.I(dyq.class);
                qdc qdcVar = pzlVar.a;
                qdcVar.getClass();
                return (dyq) qdcVar.C(I);
            case 3:
                return ((cmj) ((SmartDownloadWorker) this.b).h.getValue()).m;
            case 4:
                bzq bzqVar = ((wyq) this.b).a;
                bzqVar.getClass();
                return new nyq(bzqVar);
            case 5:
                h0r h0rVar = (h0r) this.b;
                return mqs.e(h0rVar.a, h0rVar.b, null, null, null, h0rVar.c, -536870929);
            case 6:
                x3n x3nVar = (x3n) this.b;
                Context context = (Context) x3nVar.a;
                xxq c = ((frt) ((jyr) x3nVar.b).getValue()).c();
                c.getClass();
                return new pst(context, c.a, "rup_onboarding");
            case 7:
                l13 l13Var = ((l7r) ((pzl) this.b).b).a;
                pzl pzlVar2 = ((z7r) l13Var.a.D(hag.I(z7r.class), l13Var, l13Var.b)).a;
                k7r k7rVar = (k7r) pzlVar2.b;
                l13 l13Var2 = k7rVar.a;
                x6r x6rVar = (x6r) ((h7r) l13Var2.a.D(hag.I(h7r.class), l13Var2, l13Var2.b)).a.getValue();
                l13 l13Var3 = k7rVar.a;
                lzp lzpVar = (lzp) l13Var3.a.D(hag.I(lzp.class), l13Var3, l13Var3.b);
                qy2 qy2Var = (qy2) l13Var3.a.D(hag.I(qy2.class), l13Var3, l13Var3.b);
                g8r g8rVar = (g8r) l13Var3.a.D(hag.I(g8r.class), l13Var3, l13Var3.b);
                bdt I2 = hag.I(h8r.class);
                qdc qdcVar2 = pzlVar2.a;
                qdcVar2.getClass();
                return new e8r(x6rVar, lzpVar, qy2Var, g8rVar, (h8r) qdcVar2.C(I2));
            case 8:
                View inflate = View.inflate((hn5) ((aqd) this.b).b, R.layout.splash_screen_view, null);
                inflate.getClass();
                return (ViewGroup) inflate;
            case 9:
                int i4 = ((lar) this.b).a.d;
                TimeUnit.SECONDS.getClass();
                if (i4 >= 0) {
                    long j = i4;
                    return new cp3(false, false, -1, -1, false, false, false, j > 2147483647L ? Integer.MAX_VALUE : (int) j, -1, true, false, false, null);
                }
                xq0.o(k5r.i(i4, "maxStale < 0: "));
                return null;
            case 10:
                ((sr7) this.b).run();
                return Unit.a;
            case 11:
                return Integer.valueOf(((two) this.b).a.h());
            case 12:
                return ((dc7) ((cc7) ((gjr) this.b).a.getValue())).b("stream_bitrate_storage");
            case 13:
                ((ior) this.b).getClass();
                return new hor();
            case 14:
                dpr dprVar = (dpr) this.b;
                l13 l13Var4 = ((qnr) dprVar.a.getValue()).a;
                return zsd.F0(zsd.b0(new u21(10, ((lwc) l13Var4.b(hag.I(lwc.class), true).getValue()).j, new p6o(((z66) l13Var4.b(hag.I(z66.class), true).getValue()).c(), 28), new ib3(i, 12, continuation))), dprVar.d, lbq.b, Boolean.FALSE);
            case 15:
                return (ymk) ((hvq) this.b).l().getValue();
            case 16:
                ((Cancelable) this.b).cancel();
                return Unit.a;
            case 17:
                bsr bsrVar = (bsr) this.b;
                return zsd.F0(zsd.M0(zsd.M0(new clc(bsrVar.d, new urr(i2, bsrVar, continuation), 3), new asr(i3, bsrVar, continuation)), new asr(i2, bsrVar, continuation)), bsrVar.e, new hdr(5000L, Long.MAX_VALUE), 0);
            case 18:
                return new tn("d.MM", "d.MM.yyyy", ((htr) this.b).c);
            case 19:
                ((uqn) this.b).a = 0.0f;
                return Unit.a;
            case 20:
                pxr.a.remove((fme) this.b);
                return Unit.a;
            case 21:
                vxr vxrVar = (vxr) this.b;
                x0q b = y0q.b(0, 0, null, 7);
                ox6.B(zsd.X(b, 500L), (mm6) vxrVar.b.getValue(), new o7b(11, vxrVar));
                return b;
            case 22:
                return Float.valueOf(((Number) ((x2s) this.b).c.d.getValue()).floatValue());
            case 23:
                l13 l13Var5 = ((g5s) ((m5s) this.b).c.getValue()).a;
                return (c5s) l13Var5.a.D(hag.I(c5s.class), l13Var5, l13Var5.b);
            case 24:
                evj evjVar = (evj) this.b;
                l18 l18Var = l18.b;
                bdt I3 = hag.I(pjk.class);
                qdc qdcVar3 = l18Var.a;
                qdcVar3.getClass();
                return ((pjk) qdcVar3.C(I3)).a((bve) evjVar.c);
            case 25:
                bjk bjkVar = bjk.a;
                lik likVar = (lik) this.b;
                l18 l18Var2 = l18.b;
                bdt I4 = hag.I(njk.class);
                qdc qdcVar4 = l18Var2.a;
                qdcVar4.getClass();
                likVar.getClass();
                return new zhk(bjkVar, likVar, btf.b(new s9j(29)));
            case 26:
                ojk ojkVar = (ojk) ((z6s) this.b).a.getValue();
                bik bikVar = bik.c;
                ojkVar.getClass();
                return ojk.a(bikVar);
            case 27:
                ojk ojkVar2 = (ojk) ((f7s) this.b).a.getValue();
                bik bikVar2 = bik.a;
                ojkVar2.getClass();
                return ojk.a(bikVar2);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ojk ojkVar3 = (ojk) ((q7s) this.b).a.getValue();
                bik bikVar3 = bik.d;
                ojkVar3.getClass();
                return ojk.a(bikVar3);
            default:
                return asq.K(((e8s) this.b).t.j, new d5s(23));
        }
    }

    public /* synthetic */ eyq(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
