package defpackage;

import android.content.Context;
import android.util.LruCache;
import com.yandex.passport.api.g;
import com.yandex.plus.adapter.auth.passport750.i;
import com.yandex.pulse.metrics.o;
import io.appmetrica.analytics.AppMetricaYandex;
import io.appmetrica.analytics.PulseLibraryConfig;
import io.appmetrica.analytics.ReporterYandexConfig;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.R;
import ru.yandex.music.profile.ProfileActivity;

/* loaded from: classes6.dex */
public final /* synthetic */ class ril implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ril(rbm rbmVar, dam damVar) {
        this.a = 20;
        this.b = rbmVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str;
        Map map;
        switch (this.a) {
            case 0:
                til tilVar = (til) this.b;
                hn5 hn5Var = tilVar.a;
                l18 l18Var = l18.b;
                bdt I = hag.I(dk4.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                dk4 dk4Var = (dk4) qdcVar.C(I);
                bdt I2 = hag.I(oq7.class);
                qdc qdcVar2 = l18Var.a;
                qdcVar2.getClass();
                return new jvo(hn5Var, tilVar.c.a, dk4Var, ((oq7) qdcVar2.C(I2)).a);
            case 1:
                return new vil((gs4) this.b);
            case 2:
                pkl pklVar = ((gjl) this.b).a;
                pkb pkbVar = pklVar.c().a;
                String str2 = pklVar.c().b;
                pkbVar.getClass();
                str2.getClass();
                return new thj(pkbVar, str2, 1, 1, "");
            case 3:
                evj evjVar = ((xjl) this.b).a;
                lkl lklVar = new lkl();
                lklVar.a(new hkl(evjVar, r2));
                return lklVar;
            case 4:
                iwe iweVar = ((fml) this.b).a;
                hml hmlVar = new hml();
                hmlVar.a(new gml(iweVar, r2));
                return hmlVar;
            case 5:
                rdk rdkVar = ((oml) this.b).a;
                uml umlVar = new uml();
                umlVar.a(new rml(r2, rdkVar));
                return umlVar;
            case 6:
                ikl iklVar = ((anl) this.b).a;
                cnl cnlVar = new cnl();
                cnlVar.a(new bnl(iklVar, r2));
                return cnlVar;
            case 7:
                return (nnq) ((jyr) ((ikl) this.b).c).getValue();
            case 8:
                dx5 dx5Var = ((mnl) this.b).a;
                skr skrVar = (skr) dx5Var.b.getValue();
                skrVar.getClass();
                g8c g8cVar = new g8c();
                g8cVar.a = skrVar;
                return new h9n((bdc) dx5Var.a.getValue(), g8cVar, (jcl) dx5Var.c.getValue());
            case 9:
                grl grlVar = (grl) this.b;
                kkl kklVar = grlVar.n;
                fnb fnbVar = grlVar.k;
                kklVar.getClass();
                fnbVar.getClass();
                return new v5n(fnbVar);
            case 10:
                String string = ((vrl) this.b).b.getResources().getString(R.string.dialog_action_radio_playlist);
                string.getClass();
                return new zrl(string);
            case 11:
                yrl yrlVar = (yrl) this.b;
                cvl cvlVar = yrlVar.a;
                List list = yrlVar.b;
                vrl vrlVar = yrlVar.c;
                return new r0m(cvlVar, list, (frt) vrlVar.i.getValue(), (lwc) vrlVar.j.getValue(), (z66) vrlVar.k.getValue(), (f7l) vrlVar.l.getValue());
            case 12:
                return qwp.v(((qxl) this.b).a);
            case 13:
                pzl pzlVar = ((zxl) this.b).a;
                bdt I3 = hag.I(tmb.class);
                qdc qdcVar3 = pzlVar.a;
                qdcVar3.getClass();
                return (tmb) qdcVar3.C(I3);
            case 14:
                a5m a5mVar = (a5m) this.b;
                String str3 = a5mVar.d;
                ReporterYandexConfig build = ReporterYandexConfig.newBuilder(str3).withPulseLibraryConfig(PulseLibraryConfig.newBuilder("PLUSSDKA", a5mVar.a, a5mVar.b).withChannelId(a5mVar.f).build()).build();
                build.getClass();
                Context context = a5mVar.c;
                AppMetricaYandex.activateReporter(context, build);
                return AppMetricaYandex.getReporter(context, str3);
            case 15:
                return new i((g) this.b);
            case 16:
                return (q7m) ((t5m) this.b).b.getValue();
            case 17:
                p6m p6mVar = (p6m) this.b;
                jyr jyrVar = p6m.f;
                return p6mVar.a();
            case 18:
                return (l7m) ((y8m) this.b).a.getValue();
            case 19:
                ((aam) this.b).a.a.r();
                return Unit.a;
            case 20:
                ((rbm) this.b).a.i(new jab(qkb.Header, 1, 1, 1), null);
                return Unit.a;
            case 21:
                return szf.g0(new jcj(((dam) this.b).c, true));
            case 22:
                ((zx4) ((uem) this.b).m.getValue()).getClass();
                return new rem();
            case 23:
                kgm kgmVar = (kgm) this.b;
                ohp x = avf.x("kotlinx.serialization.Polymorphic", igm.b, new mhp[0], new s8i(29, kgmVar));
                f9f f9fVar = kgmVar.a;
                f9fVar.getClass();
                return new ze6(x, f9fVar);
            case 24:
                nim nimVar = (nim) this.b;
                kn0 kn0Var = new kn0();
                kn0Var.c(nimVar.a);
                return kn0Var.h();
            case 25:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                int i = ProfileActivity.w0;
                profileActivity.recreate();
                return Unit.a;
            case 26:
                bwm bwmVar = (bwm) this.b;
                t5a t5aVar = bwmVar.a;
                int hashCode = ((((t5aVar == null || (map = t5aVar.b) == null) ? 0 : map.hashCode()) * 31) + ((t5aVar == null || (str = t5aVar.a) == null) ? 0 : str.hashCode())) * 31;
                q2a q2aVar = bwmVar.b;
                return Integer.valueOf(hashCode + (q2aVar != null ? q2aVar.hashCode() : 0));
            case 27:
                nwm nwmVar = (nwm) this.b;
                cx cxVar = (cx) nwmVar.i.getValue();
                s63 s63Var = nwmVar.e;
                String str4 = s63Var.c + StringUtils.PROCESS_POSTFIX_DELIMITER + ((fwm) s63Var.a).a.a;
                cxVar.getClass();
                ax axVar = (ax) cxVar.a.getValue();
                LruCache lruCache = axVar.c;
                ReentrantLock reentrantLock = axVar.b;
                reentrantLock.lock();
                try {
                    bx bxVar = (bx) lruCache.get(str4);
                    if (bxVar == null) {
                        bxVar = new bx(axVar.a);
                        lruCache.put(str4, bxVar);
                    }
                    return bxVar;
                } finally {
                    reentrantLock.unlock();
                }
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ((c4n) ((e4n) this.b).a.a).requireActivity().finish();
                return Unit.a;
            default:
                ((y5n) this.b).a.c();
                return Unit.a;
        }
    }

    public /* synthetic */ ril(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
