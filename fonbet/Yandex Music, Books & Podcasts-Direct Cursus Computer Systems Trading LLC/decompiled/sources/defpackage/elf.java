package defpackage;

import android.os.Handler;
import com.yandex.music.shared.playback.api.commands.PauseCommand;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class elf extends bfu {
    public final kxi k;
    public final jyr l;
    public final qdc m;
    public final iwe n;
    public final xdr o;
    public final xdr p;
    public final jyr q;
    public final x0q r;
    public final x0q s;
    public final tc4 t;
    public final j0q u;
    public final xdr v;
    public final jyr w;
    public final xdr x;
    public final ekf y;
    public final jyr z;

    public elf(kxi kxiVar) {
        this.k = kxiVar;
        bdt I = hag.I(j5v.class);
        l18 l18Var = l18.b;
        this.l = l18Var.b(I, true);
        qdc qdcVar = new qdc(28);
        this.m = qdcVar;
        iwe iweVar = new iwe(19);
        this.n = iweVar;
        xdr xdrVar = (xdr) iweVar.c;
        this.o = xdrVar;
        xdr xdrVar2 = (xdr) qdcVar.c;
        this.p = xdrVar2;
        jyr b = l18Var.b(hag.I(mg5.class), true);
        this.q = b;
        Continuation continuation = null;
        x0q b2 = y0q.b(0, 1, null, 5);
        this.r = b2;
        x0q b3 = y0q.b(0, 0, null, 7);
        this.s = b3;
        this.t = zsd.u0(new u21(10, xdrVar2, xdrVar, new t81(3, 9, continuation)), b3);
        this.u = new j0q();
        xdr a = ydr.a(Boolean.FALSE);
        this.v = a;
        this.w = l18Var.b(hag.I(ofo.class), true);
        this.x = a;
        fnb fnbVar = kxiVar.a;
        fnbVar.getClass();
        this.y = new ekf(fnbVar);
        this.z = btf.b(new bff(14));
        int i = 18;
        zsd.r0(ot0.F(this), zsd.s0(b2, new ptd(this, continuation, i)));
        b2.a(Unit.a);
        ox6.B(new ifd(((mg5) b.getValue()).e, 11), ot0.F(this), new otd(i, this));
    }

    /* JADX WARN: Type inference failed for: r2v23, types: [arf, java.lang.Object] */
    public final void G() {
        Continuation continuation;
        Object obj;
        cgr cgrVar;
        String t = weo.t();
        Iterator it = ((Iterable) this.p.getValue()).iterator();
        while (true) {
            continuation = null;
            if (it.hasNext()) {
                obj = it.next();
                if (((nfn) obj).b) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        nfn nfnVar = (nfn) obj;
        String h = (nfnVar == null || (cgrVar = nfnVar.a) == null) ? "user:onyourwave" : cgrVar.a.h();
        Collection<zgn> values = ((ahn) this.o.getValue()).b.values();
        ArrayList arrayList = new ArrayList();
        for (zgn zgnVar : values) {
            String a = zgnVar.a();
            if (!(zgnVar instanceof xgn)) {
                a = null;
            }
            if (a != null) {
                arrayList.add(a);
            }
        }
        pz0 pz0Var = new pz0(2);
        ArrayList arrayList2 = pz0Var.a;
        pz0Var.b(h);
        pz0Var.c(arrayList.toArray(new String[0]));
        List h2 = u75.h(arrayList2.toArray(new String[arrayList2.size()]));
        j5v j5vVar = (j5v) this.l.getValue();
        a6l a2 = this.k.a(t);
        j5vVar.getClass();
        h2.getClass();
        ((k1l) ((e3q) ((vyk) j5vVar.a.getValue())).i.getValue()).a(PauseCommand.INSTANCE, new b3t("core_pause"));
        ime imeVar = j5vVar.c;
        jw jwVar = new jw(j5vVar, h2, a2, continuation, 3);
        imeVar.getClass();
        rjq rjqVar = (rjq) imeVar.d;
        rjqVar.g();
        int i = 20;
        y6g y6gVar = new y6g(i, imeVar, jwVar);
        Handler handler = (Handler) pld.a.getValue();
        handler.getClass();
        sr7 sr7Var = new sr7(i, y6gVar);
        handler.postDelayed(sr7Var, 1000L);
        rjqVar.d.D(new zya(11, handler, sr7Var));
        ekf ekfVar = this.y;
        ekfVar.getClass();
        nmb nmbVar = dkf.a;
        fnb fnbVar = ekfVar.a;
        String X = CollectionsKt.X(h2, null, null, null, null, 63);
        fnbVar.getClass();
        nmb nmbVar2 = dkf.a;
        String G = fnbVar.G();
        wjb wjbVar = wjb.MyWaweSettingsScreen;
        pkb pkbVar = pkb.Audiobook;
        nmb.z(nmbVar2, G, wjbVar, null, null, null, null, 0, false, "my_wave", "my_wave", 0, "wave", X, 0, t, 52476);
    }

    public final void H() {
        x97.y(ot0.F(this), null, null, new jmd(this, null, 13), 3);
    }
}
