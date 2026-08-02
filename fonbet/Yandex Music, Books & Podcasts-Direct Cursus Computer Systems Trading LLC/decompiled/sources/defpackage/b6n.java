package defpackage;

import android.content.Context;
import com.yandex.plus.home.dailyquests.plugin.api.model.i;
import com.yandex.plus.home.dailyquests.plugin.internal.proxy.b;
import com.yandex.plus.home.dailyquests.plugin.internal.proxy.c;
import com.yandex.pulse.metrics.o;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.in_app_restore.RestorePurchasesActivity;

/* loaded from: classes3.dex */
public final /* synthetic */ class b6n implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b6n(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = 6;
        int i2 = 21;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        int i3 = 7;
        switch (this.a) {
            case 0:
                jyr jyrVar = ((d6n) this.b).j;
                a6n a6nVar = (a6n) jyrVar.getValue();
                a6nVar.getClass();
                return new n6n(new vtm(a6nVar), ((a6n) jyrVar.getValue()).b.a());
            case 1:
                t5n t5nVar = (t5n) this.b;
                tnb.d((tnb) ((jyr) t5nVar.c.e).getValue(), wjb.Link);
                w1g.y((hn5) t5nVar.b.b, "yandexmusic://cards/promo/audio_quality_formats", true);
                return Unit.a;
            case 2:
                return new hv0((i3) this.b, objArr == true ? 1 : 0, 26);
            case 3:
                h8n h8nVar = (h8n) this.b;
                c cVar = h8nVar.a;
                ((i) h8nVar.b.getValue()).getClass();
                return new b(cVar.a, new com.yandex.plus.home.dailyquests.feature.api.model.i(), cVar.b);
            case 4:
                return new ayk((Context) ((lum) this.b).a);
            case 5:
                return new z50(zsd.d0(zsd.a0(new cla(y1g.L(((oan) this.b).b.a), i), new d6h(i2)), 1), 4);
            case 6:
                oan oanVar = (oan) this.b;
                return new eno(new s1n((Object) zsd.d0(q6k.m(oanVar.b.c.i, new mjm(i3, oanVar), q6k.g), 1), (Continuation) (objArr2 == true ? 1 : 0), 8));
            case 7:
                return new z50(zsd.d0(q6k.m(y1g.L(((oan) this.b).b.a), san.b, q6k.g), 1), 5);
            case 8:
                return new f9l(i, new h0m(((oan) this.b).b.c.i, i2));
            case 9:
                return ((wbn) this.b).b.d();
            case 10:
                return new z50(zsd.d0(q6k.m(((oan) this.b).b.c.j, new gkm(20), q6k.g), 1), i);
            case 11:
                return new z50(zsd.d0(q6k.m(((oan) this.b).b.c.k, new gkm(i2), q6k.g), 1), i3);
            case 12:
                Context context = ((ein) this.b).a;
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                return new e7x(new ndx(context));
            case 13:
                return Boolean.valueOf(((mkn) ((ukn) this.b).g).p);
            case 14:
                ((r9n) this.b).invoke();
                return Unit.a;
            case 15:
                ((wln) this.b).a();
                return Unit.a;
            case 16:
                r9t r9tVar = (r9t) this.b;
                r9tVar.getClass();
                j6e j6eVar = new j6e();
                j6eVar.a = r9tVar;
                return j6eVar;
            case 17:
                ((oc4) ((ltm) this.b)).c(xln.a);
                return Unit.a;
            case 18:
                rrn rrnVar = (rrn) this.b;
                String G = hyf.G(rrnVar.a);
                b6d b6dVar = G != null ? new b6d(G) : null;
                return b6dVar == null ? rrnVar.b : b6dVar;
            case 19:
                htn htnVar = (htn) this.b;
                return new mye((oq7) htnVar.c.getValue(), (k1l) htnVar.d.getValue(), new qec((g0l) htnVar.e.getValue()), (kbn) htnVar.g.getValue(), (lwr) htnVar.h.getValue());
            case 20:
                return new e2o((d2o) this.b, 0.0f, 1.0f);
            case 21:
                RestorePurchasesActivity restorePurchasesActivity = (RestorePurchasesActivity) this.b;
                int i4 = RestorePurchasesActivity.y;
                ((age) restorePurchasesActivity.w.getValue()).getClass();
                return sfe.class;
            case 22:
                return Integer.valueOf(((l7o) this.b).e.size());
            case 23:
                zhi zhiVar = (zhi) this.b;
                Throwable th = zhiVar.b;
                if (th instanceof IOException) {
                    Throwable fillInStackTrace = th.fillInStackTrace();
                    fillInStackTrace.getClass();
                    return (IOException) fillInStackTrace;
                }
                if (!(th instanceof GeneralSecurityException)) {
                    ssg.a(7, "awaitResult", "unexpected not network error", th);
                }
                return new IOException(zhiVar.b);
            case 24:
                return ((Callable) this.b).call();
            case 25:
                ((Runnable) this.b).run();
                return Unit.a;
            case 26:
                ka8 ka8Var = (ka8) ((AtomicReference) this.b).getAndSet(t4b.a);
                if (ka8Var != null) {
                    ka8Var.a();
                }
                return Unit.a;
            case 27:
                return q6k.w((kfu) this.b);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                woo wooVar = (woo) this.b;
                wooVar.getLifecycle().a(new xnn(0, wooVar));
                return Unit.a;
            default:
                mg1 mg1Var = (mg1) this.b;
                return new vvo((Context) mg1Var.a.getValue(), (zzp) mg1Var.b.getValue());
        }
    }
}
