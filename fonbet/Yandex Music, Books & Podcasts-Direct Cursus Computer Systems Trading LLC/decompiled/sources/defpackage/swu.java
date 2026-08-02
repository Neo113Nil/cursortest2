package defpackage;

import android.content.Context;
import com.yandex.music.shared.music_starter.executor.GenerativeQueueStartCommand;
import com.yandex.music.shared.music_starter.executor.WaveQueueStartCommand;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes3.dex */
public final class swu extends pwu {
    public final /* synthetic */ int d = 1;
    public final kxi e;
    public final Function0 f;
    public final vdr g;
    public final Object h;
    public final Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public swu(StationId stationId, String str, kxi kxiVar, Function0 function0, k6l k6lVar, mm6 mm6Var) {
        super(k6lVar, null, null);
        str.getClass();
        kxiVar.getClass();
        mm6Var.getClass();
        this.h = stationId;
        this.e = kxiVar;
        this.f = function0;
        l18 l18Var = l18.b;
        bdt I = hag.I(m4d.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        m4d m4dVar = (m4d) qdcVar.C(I);
        bdt I2 = hag.I(g0l.class);
        qdc qdcVar2 = l18Var.a;
        qdcVar2.getClass();
        this.i = (g0l) qdcVar2.C(I2);
        this.g = sk3.a0(mm6Var, new mpq(26, m4dVar.a, this));
    }

    @Override // defpackage.owu
    public final vdr c() {
        switch (this.d) {
        }
        return this.g;
    }

    @Override // defpackage.pwu
    public final void e(String str) {
        Object qsuVar;
        Continuation continuation;
        n7q n7qVar;
        n7q n7qVar2;
        l7q l7qVar;
        int i = this.d;
        b0l b0lVar = b0l.b;
        Function0 function0 = this.f;
        kxi kxiVar = this.e;
        Object obj = this.h;
        Object obj2 = this.i;
        str.getClass();
        switch (i) {
            case 0:
                g0l g0lVar = (g0l) obj2;
                d5d N = ox6.N((StationId) obj);
                x5l x5lVar = (x5l) function0.invoke();
                evk evkVar = new evk(24);
                g0lVar.getClass();
                kxiVar.getClass();
                x5lVar.getClass();
                a6l a = kxiVar.a(weo.t());
                if (g0lVar.a(a, evkVar)) {
                    n7q c = g0lVar.c(false);
                    if (!(c instanceof y4d) || !Intrinsics.d(((y4d) c).a.a.a, N)) {
                        GenerativeQueueStartCommand generativeQueueStartCommand = new GenerativeQueueStartCommand(N, g0lVar.u(b0lVar), a, evkVar);
                        g0lVar.e.c(x5lVar, a.a);
                        g0lVar.t(generativeQueueStartCommand, g0lVar.u(b0lVar), false, false);
                        break;
                    } else {
                        g0l.d(g0lVar);
                        break;
                    }
                }
                break;
            default:
                zy7 zy7Var = (zy7) obj2;
                rr5 rr5Var = (rr5) obj;
                x5l x5lVar2 = (x5l) function0.invoke();
                zy7Var.getClass();
                rr5Var.getClass();
                kxiVar.getClass();
                x5lVar2.getClass();
                mg5 mg5Var = (mg5) zy7Var.a.getValue();
                mg5Var.getClass();
                wvu wvuVar = mg5Var.b;
                String str2 = rr5Var.a;
                StationId o = StationId.o(str2);
                o.getClass();
                s9p E = o8g.E(c9g.E(o));
                oq7 oq7Var = mg5Var.c;
                e6l e6lVar = (e6l) oq7Var.a.c.getValue();
                y7q y7qVar = (y7q) oq7Var.b.f.a.getValue();
                x7q x7qVar = y7qVar instanceof x7q ? (x7q) y7qVar : null;
                s9p s9pVar = (x7qVar == null || (l7qVar = x7qVar.b) == null) ? null : (s9p) ldg.k(l7qVar, y9w.g);
                d6l x = p6g.x(e6lVar);
                uvu uvuVar = (x == null || (n7qVar2 = x.a) == null) ? null : (uvu) wdg.A(n7qVar2, new jzk(7));
                if (uvuVar != null ? E.b(uvuVar.a) : false) {
                    g0l.d(wvuVar.a);
                    break;
                } else if (s9pVar == null || !E.b(s9pVar)) {
                    g0l g0lVar2 = wvuVar.a;
                    qfn qfnVar = new qfn("radio-mobile-default");
                    evk evkVar2 = new evk(23);
                    g0lVar2.getClass();
                    a6l a2 = kxiVar.a(weo.t());
                    gxc gxcVar = a2.a;
                    if (g0lVar2.a(a2, evkVar2)) {
                        s9p s9pVar2 = new s9p(new q9p(str2));
                        d6l x2 = p6g.x((e6l) ((oq7) g0lVar2.a.getValue()).a.c.getValue());
                        mwk b = (x2 == null || (n7qVar = x2.a) == null) ? null : n7qVar.b();
                        jzs jzsVar = b instanceof jzs ? (jzs) b : null;
                        if (jzsVar != null) {
                            mqs mqsVar = jzsVar.a;
                            if (mqsVar.d().equals(rr5Var)) {
                                y5g.n0((Context) zy7Var.b.getValue(), R.string.starting_wave_by_track_without_interruption_message, 0);
                                qsuVar = new wsu(t75.c(jzs.d(jzsVar, null, new d6v(new u4q(new tnu(s9pVar2, ""), new t4q(new qfn(jzsVar.b.a), "error-from", gxcVar, false), new s4v(mqsVar.c, null), o4q.a, p4q.b, null), c6v.a), 447)), c5b.a, new tsu(), req.a, false);
                                continuation = null;
                                WaveQueueStartCommand waveQueueStartCommand = new WaveQueueStartCommand(new qs(qsuVar, continuation, 7), new iyu(s9pVar2, new c5q(qfnVar, gxcVar), true), nyn.a, Boolean.FALSE, g0lVar2.u(b0lVar), a2, q0q.a, false, evkVar2);
                                g0lVar2.e.c(x5lVar2, gxcVar);
                                g0lVar2.t(waveQueueStartCommand, g0lVar2.u(b0lVar), false, false);
                                break;
                            }
                        }
                        continuation = null;
                        qsuVar = new qsu(rr5Var, null);
                        WaveQueueStartCommand waveQueueStartCommand2 = new WaveQueueStartCommand(new qs(qsuVar, continuation, 7), new iyu(s9pVar2, new c5q(qfnVar, gxcVar), true), nyn.a, Boolean.FALSE, g0lVar2.u(b0lVar), a2, q0q.a, false, evkVar2);
                        g0lVar2.e.c(x5lVar2, gxcVar);
                        g0lVar2.t(waveQueueStartCommand2, g0lVar2.u(b0lVar), false, false);
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public swu(rr5 rr5Var, kxi kxiVar, Function0 function0, k6l k6lVar, uwu uwuVar, zy7 zy7Var, nwu nwuVar, mm6 mm6Var) {
        super(k6lVar, nwuVar, null);
        kxiVar.getClass();
        k6lVar.getClass();
        uwuVar.getClass();
        zy7Var.getClass();
        mm6Var.getClass();
        this.h = rr5Var;
        this.e = kxiVar;
        this.f = function0;
        this.i = zy7Var;
        StationId o = StationId.o(rr5Var.a);
        o.getClass();
        this.g = sk3.a0(mm6Var, uwuVar.a(o8g.E(c9g.E(o))));
    }
}
