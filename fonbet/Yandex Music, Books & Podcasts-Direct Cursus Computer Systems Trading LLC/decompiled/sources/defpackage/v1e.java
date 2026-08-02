package defpackage;

import android.view.View;
import androidx.fragment.app.y;
import com.yandex.pulse.metrics.o;
import java.io.File;
import java.util.concurrent.LinkedBlockingQueue;
import javax.net.ssl.X509TrustManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final /* synthetic */ class v1e implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v1e(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                x1e x1eVar = (x1e) this.b;
                return new ovv(x1eVar.a.x().a(new jab(qkb.Wizard, 1, 1, 0), null), ((mvv) x1eVar.i.getValue()).a);
            case 1:
                return new to3((File) ((kpm) this.b).b, 10485760L);
            case 2:
                wge wgeVar = (wge) this.b;
                while (!Thread.currentThread().isInterrupted()) {
                    Object take = ((LinkedBlockingQueue) wgeVar.c).take();
                    take.getClass();
                    if (take instanceof String) {
                        wgeVar.a((String) take);
                    } else {
                        if (!(take instanceof Runnable)) {
                            b6e.l(take, "Invalid message ");
                            return null;
                        }
                        ((Runnable) take).run();
                    }
                }
                return Unit.a;
            case 3:
                return new oeo((File) ((vw1) this.b).invoke());
            case 4:
                return ((nke) this.b).a;
            case 5:
                return ydr.a(((mle) ((qke) this.b).c.getValue()).c());
            case 6:
                return (lke) ((fle) this.b).b.getValue();
            case 7:
                eme.a.remove((dme) this.b);
                return Unit.a;
            case 8:
                Boolean bool = (Boolean) ((d0q) ((pre) this.b).j.a.getValue()).e.getValue();
                bool.booleanValue();
                return bool;
            case 9:
                lze lzeVar = (lze) this.b;
                return new h0h(lzeVar.c.a, lzeVar.e.a);
            case 10:
                ((v1e) ((s7f) this.b).e).invoke();
                return Unit.a;
            case 11:
                ((w7f) this.b).b.invoke();
                return Unit.a;
            case 12:
                qdc qdcVar = (qdc) ((jtc) this.b).a;
                kxi kxiVar = (kxi) qdcVar.b;
                cvo cvoVar = cvo.i;
                return new qe3(kxiVar, o6m.b(wjb.BottomsheetScreen, new avo(pkb.Track, (String) qdcVar.c), 2));
            case 13:
                ((zx4) ((fdf) this.b).m.getValue()).getClass();
                return new adf();
            case 14:
                ((qy4) ((gdf) this.b).q.getValue()).getClass();
                return new py4();
            case 15:
                ((zx4) ((cff) this.b).m.getValue()).getClass();
                return new yef();
            case 16:
                ((qy4) ((dff) this.b).p.getValue()).getClass();
                return new ty4();
            case 17:
                dn9 dn9Var = (dn9) this.b;
                return ((wst) ((jyr) dn9Var.d).getValue()).a(((frt) ((jyr) dn9Var.e).getValue()).c());
            case 18:
                uff uffVar = (uff) this.b;
                return ((wst) uffVar.b.getValue()).a(((frt) uffVar.c.getValue()).c());
            case 19:
                e00 e00Var = ((bgf) this.b).a.a;
                e00Var.getClass();
                return (ggf) e00Var.c(hag.I(ggf.class));
            case 20:
                ((zx4) ((fhf) this.b).m.getValue()).getClass();
                return new xgf();
            case 21:
                ((qy4) ((ghf) this.b).p.getValue()).getClass();
                return new xy4();
            case 22:
                return new elf(((tkf) this.b).d());
            case 23:
                b6 b6Var = (b6) this.b;
                View z = b6Var.z(b6Var);
                b6Var.w(z);
                return z;
            case 24:
                return ixf.u((X509TrustManager) ((mxf) this.b).a.b.getValue());
            case 25:
                return ixf.v(((nxf) this.b).a);
            case 26:
                zzf zzfVar = (zzf) this.b;
                d0g d0gVar = new d0g();
                y yVar = zzfVar.a;
                yVar.getClass();
                x7f.B(d0gVar, yVar, "LIKE_DIALOG");
                return Unit.a;
            case 27:
                l0g l0gVar = (l0g) this.b;
                return ((dc7) l0gVar.b).c(l0gVar.c.c().a, "like_onboarding");
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                i4g i4gVar = (i4g) this.b;
                l18 l18Var = l18.b;
                bdt I = hag.I(t3g.class);
                qdc qdcVar2 = l18Var.a;
                qdcVar2.getClass();
                return new njf(((t3g) qdcVar2.C(I)).c, i4gVar, 3);
            default:
                return ((dc7) ((fkg) this.b).a).b("local_queue_datastore");
        }
    }
}
