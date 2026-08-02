package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.fragment.app.t;
import com.yandex.music.shared.concert.info.screen.network.ConcertHeaderApi;
import com.yandex.music.shared.concert.info.screen.network.ConcertSkeletonApi;
import com.yandex.pulse.metrics.o;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.concert.ConcertActivity;
import ru.yandex.music.concert.catalog.ConcertCatalogActivity;
import ru.yandex.music.congratulations.CongratulationsScreenActivity;

/* loaded from: classes3.dex */
public final /* synthetic */ class r25 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r25(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        wjb wjbVar;
        String stringExtra;
        switch (this.a) {
            case 0:
                return Integer.valueOf(((y25) this.b).a.size());
            case 1:
                r35 r35Var = new r35((t35) this.b, 5);
                ly4 ly4Var = new ly4();
                if (ly4Var.a != null) {
                    xq0.q("Di already initialized");
                    return null;
                }
                o18 o18Var = new o18();
                o18Var.c = hag.I(ly4.class);
                rp7 rp7Var = o18Var.b;
                rp7Var.getClass();
                rp7Var.C(ly4Var);
                r35Var.invoke(o18Var);
                ly4Var.a = new qdc(new ix6(o18Var.a));
                return ly4Var;
            case 2:
                return ((t35) ((jyr) ((t20) this.b).g).getValue()).d.a;
            case 3:
                ((k75) this.b).a.invoke();
                return Unit.a;
            case 4:
                return ((Iterable) this.b).iterator();
            case 5:
                hc5 hc5Var = (hc5) this.b;
                int ordinal = hc5Var.b().ordinal();
                if (ordinal == 0) {
                    wjbVar = hc5Var.a(2) == null ? wjb.NonmusicLandingScreen : wjb.DynamicScreen;
                } else {
                    if (ordinal != 1) {
                        b6e.s();
                        return null;
                    }
                    wjbVar = hc5Var.a(2) == null ? wjb.KidsLandingScreen : wjb.DynamicScreen;
                }
                return new aqt(wjbVar);
            case 6:
                v7g.L(((qbj) ((ce5) this.b).c).a, new lik(vik.f, null, null));
                return Unit.a;
            case 7:
                rr5 rr5Var = (rr5) this.b;
                String str = rr5Var.b;
                String str2 = rr5Var.a;
                if (str == null) {
                    return str2;
                }
                for (int i = 0; i < str2.length(); i++) {
                    if (!Character.isDigit(str2.charAt(i))) {
                        return str2;
                    }
                }
                return ouj.o(str2, StringUtils.PROCESS_POSTFIX_DELIMITER, str);
            case 8:
                ConcertActivity concertActivity = (ConcertActivity) this.b;
                int i2 = ConcertActivity.w0;
                vs5 vs5Var = (vs5) concertActivity.getIntent().getParcelableExtra("extra.concert.params");
                if (vs5Var == null) {
                    return null;
                }
                return vs5Var;
            case 9:
                ConcertCatalogActivity concertCatalogActivity = (ConcertCatalogActivity) this.b;
                int i3 = ConcertCatalogActivity.w0;
                String stringExtra2 = concertCatalogActivity.getIntent().getStringExtra("extra.type");
                if (stringExtra2 == null || (stringExtra = concertCatalogActivity.getIntent().getStringExtra("extra.id")) == null) {
                    return null;
                }
                return new lt5(stringExtra2, stringExtra);
            case 10:
                return (ot5) ((qt5) this.b).j.a.getValue();
            case 11:
                return Integer.valueOf(((lv5) this.b).e.size());
            case 12:
                return (ConcertHeaderApi) ((uv5) this.b).a.c().a.b(ConcertHeaderApi.class);
            case 13:
                return (a06) ((znk) this.b).b;
            case 14:
                g06 g06Var = ((yy5) this.b).a;
                return new c4((String) g06Var.a, (dy5) ((a06) g06Var.b).a.getValue(), (i06) g06Var.c, (tmb) g06Var.d);
            case 15:
                return (cvo) ((bz5) ((osh) this.b).a).f.getValue();
            case 16:
                return (cvo) ((jyr) ((dz5) this.b).k.c).getValue();
            case 17:
                g06 g06Var2 = (g06) this.b;
                return new rw5((frt) ((jyr) g06Var2.b).getValue(), (cc7) ((jyr) g06Var2.a).getValue(), (fkn) g06Var2.c, (cp5) g06Var2.d);
            case 18:
                g06 g06Var3 = (g06) this.b;
                return (ConcertSkeletonApi) upq.b((upq) g06Var3.c, null, new at5(4, g06Var3), 1).a.b(ConcertSkeletonApi.class);
            case 19:
                return Integer.valueOf(((m16) this.b).b.size());
            case 20:
                g06 g06Var4 = (g06) this.b;
                upq upqVar = (upq) g06Var4.b;
                spq spqVar = upqVar.b;
                spq a = spqVar != null ? spq.a(spqVar, false, null, 123) : null;
                hnq hnqVar = (hnq) g06Var4.c;
                gnq gnqVar = (gnq) g06Var4.d;
                gnqVar.getClass();
                hnqVar.getClass();
                return new cjf("concerts", upqVar, gnqVar, null, hnqVar, a);
            case 21:
                u26 u26Var = (u26) ((i3) this.b).b;
                return new i36(u26Var.e(), u26Var.b());
            case 22:
                float f = ((k46) this.b).c;
                return Float.valueOf((float) Math.sqrt(2 * f * f));
            case 23:
                CongratulationsScreenActivity congratulationsScreenActivity = (CongratulationsScreenActivity) this.b;
                int i4 = CongratulationsScreenActivity.x;
                ((k56) congratulationsScreenActivity.v.getValue()).getClass();
                return i56.class;
            case 24:
                i56 i56Var = (i56) this.b;
                e56 e56Var = i56Var.k;
                t requireActivity = i56Var.requireActivity();
                requireActivity.getClass();
                e56Var.getClass();
                e56Var.a.getClass();
                return new d56(requireActivity);
            case 25:
                return ((qne) this.b).e(":memory:");
            case 26:
                return (wvt) this.b;
            case 27:
                owf owfVar = (owf) this.b;
                switch (owfVar.a) {
                    case 0:
                        fx1.r((Context) owfVar.c, (pwf) owfVar.b);
                        break;
                    default:
                        ((ConnectivityManager) owfVar.c).unregisterNetworkCallback((wni) owfVar.b);
                        break;
                }
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ((g76) ((g01) this.b).d).getClass();
                l18 l18Var = l18.b;
                bdt I = hag.I(z66.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                return (z66) qdcVar.C(I);
            default:
                y86 y86Var = (y86) this.b;
                v86 v86Var = y86Var.b;
                v86Var.getClass();
                ox6.D(v86Var);
                q96 q96Var = new q96();
                q96Var.f(v86Var);
                y86Var.a(q96Var);
                q96Var.b(v86Var);
                y86Var.d(v86Var);
                return v86Var;
        }
    }
}
