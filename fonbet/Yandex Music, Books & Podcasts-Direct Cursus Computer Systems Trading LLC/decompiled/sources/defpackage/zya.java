package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import com.yandex.messenger.websdk.api.MessengerAnalytics;
import com.yandex.music.shared.skeleton.data.network.LandingSkeletonApi;
import com.yandex.pulse.metrics.o;
import io.appmetrica.analytics.AppMetricaYandex;
import io.appmetrica.analytics.IReporterYandex;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import ru.yandex.music.settings.SettingsActivity;

/* loaded from: classes3.dex */
public final /* synthetic */ class zya implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zya(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v72, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        mdg mdgVar;
        String str;
        String[] names;
        imb b;
        jmb jmbVar = null;
        switch (this.a) {
            case 0:
                IReporterYandex reporter = AppMetricaYandex.getReporter(((gza) this.b).a, (String) this.c);
                reporter.getClass();
                return reporter;
            case 1:
                return new p0b((k0b) this.b, ((a0b) this.c).a);
            case 2:
                udb udbVar = (udb) this.b;
                String str2 = (String) this.c;
                pdb pdbVar = (pdb) udbVar.c;
                if (pdbVar == null) {
                    Enum[] enumArr = (Enum[]) udbVar.b;
                    pdbVar = new pdb(str2, enumArr.length);
                    for (Enum r0 : enumArr) {
                        pdbVar.k(r0.name(), false);
                    }
                }
                return pdbVar;
            case 3:
                ((Function1) this.b).invoke((jxi) this.c);
                return Unit.a;
            case 4:
                e7c e7cVar = (e7c) this.b;
                String str3 = (String) this.c;
                e7cVar.getClass();
                str3.getClass();
                x2i.a0((y) e7cVar.b.b, pd.t(new qzm[0]), new teb(str3));
                return Unit.a;
            case 5:
                return Integer.valueOf(((Number) ((Function1) this.c).invoke((jx7) this.b)).intValue());
            case 6:
                ((q0d) this.b).a(((z0d) this.c).b);
                return Unit.a;
            case 7:
                return new c4d((b5d) ((jyr) this.b).getValue(), (zzp) this.c);
            case 8:
                List<mdg> list = (List) this.b;
                ConcurrentHashMap concurrentHashMap = ((ked) this.c).g;
                for (mdg mdgVar2 : list) {
                    if (!concurrentHashMap.contains(mdgVar2.getDeviceId().a)) {
                        concurrentHashMap.put(mdgVar2.getDeviceId().a, mdgVar2);
                    }
                }
                return Unit.a;
            case 9:
                ked kedVar = (ked) this.b;
                String[] strArr = (String[]) this.c;
                Iterator it = kedVar.g.entrySet().iterator();
                while (it.hasNext()) {
                    String str4 = (String) ((Map.Entry) it.next()).getKey();
                    if (!xz0.u(strArr, str4) && (mdgVar = (mdg) kedVar.g.remove(str4)) != null) {
                        mdgVar.close();
                    }
                }
                return Unit.a;
            case 10:
                mdg mdgVar3 = (mdg) ((ked) this.b).g.remove((String) this.c);
                if (mdgVar3 != null) {
                    mdgVar3.close();
                }
                return Unit.a;
            case 11:
                ((Handler) this.b).removeCallbacks((sr7) this.c);
                return Unit.a;
            case 12:
                ((Function1) this.b).invoke(((xud) this.c).d);
                return Unit.a;
            case 13:
                tur turVar = (tur) this.b;
                m1v m1vVar = (m1v) this.c;
                if (turVar != null) {
                    turVar.a.a(uur.b);
                }
                m1vVar.g.e(new s9p(t75.c(r9p.a)), m1vVar.b, new u5l((cvo) m1vVar.a.getValue(), m1vVar.h, m1vVar.i, null), new qfn("radio-mobile-wave_screen-clean-default"));
                return Unit.a;
            case 14:
                ((Function1) this.b).invoke((Uri) this.c);
                return Unit.a;
            case 15:
                x1e x1eVar = (x1e) this.b;
                zh zhVar = (zh) this.c;
                l18 l18Var = l18.b;
                bdt I = hag.I(kuv.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                t requireActivity = x1eVar.a.requireActivity();
                requireActivity.getClass();
                zhVar.getClass();
                return new muv(requireActivity, zhVar);
            case 16:
                zh zhVar2 = (zh) this.b;
                tmb tmbVar = (tmb) this.c;
                l18 l18Var2 = l18.b;
                bdt I2 = hag.I(qtv.class);
                qdc qdcVar2 = l18Var2.a;
                qdcVar2.getClass();
                return new rsj(zhVar2, (qtv) qdcVar2.C(I2), tmbVar);
            case 17:
                return new cma(((fle) this.b).a((jx7) this.c));
            case 18:
                qdc qdcVar3 = (qdc) this.b;
                ((MessengerAnalytics) qdcVar3.b).sendEvent((String) this.c, qdcVar3.c);
                return Unit.a;
            case 19:
                return "old=" + ((lve) this.b) + " current=" + ((lve) this.c);
            case 20:
                ((Function1) this.b).invoke((yze) this.c);
                return Unit.a;
            case 21:
                mhp mhpVar = (mhp) this.b;
                x3f x3fVar = (x3f) this.c;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                boolean z = x3fVar.a.j && Intrinsics.d(mhpVar.a(), thp.b);
                c3x.O(x3fVar, mhpVar);
                int e = mhpVar.e();
                for (int i = 0; i < e; i++) {
                    List g = mhpVar.g(i);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : g) {
                        if (obj instanceof l5f) {
                            arrayList.add(obj);
                        }
                    }
                    l5f l5fVar = (l5f) CollectionsKt.l0(arrayList);
                    if (l5fVar != null && (names = l5fVar.names()) != null) {
                        for (String str5 : names) {
                            if (z) {
                                str5 = str5.toLowerCase(Locale.ROOT);
                                str5.getClass();
                            }
                            c3x.A(linkedHashMap, mhpVar, str5, i);
                        }
                    }
                    if (z) {
                        str = mhpVar.f(i).toLowerCase(Locale.ROOT);
                        str.getClass();
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        c3x.A(linkedHashMap, mhpVar, str, i);
                    }
                }
                if (!linkedHashMap.isEmpty()) {
                    return linkedHashMap;
                }
                e5b e5bVar = e5b.a;
                e5bVar.getClass();
                return e5bVar;
            case 22:
                xb5 xb5Var = (xb5) this.b;
                zya zyaVar = (zya) this.c;
                xb5Var.a.invoke();
                zyaVar.invoke();
                return Unit.a;
            case 23:
                z8f z8fVar = (z8f) this.b;
                xe xeVar = (xe) this.c;
                pwl pwlVar = (pwl) z8fVar.o;
                mqs mqsVar = (mqs) z8fVar.j;
                dh dhVar = xeVar.b;
                pwlVar.getClass();
                mqsVar.getClass();
                dhVar.getClass();
                nmb nmbVar = pwlVar.b;
                String str6 = mqsVar.a;
                String str7 = mqsVar.c;
                imb b2 = pwl.b(dhVar);
                if (b2 != null) {
                    nmbVar.getClass();
                    str6.getClass();
                    str7.getClass();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.put("page_type", "object");
                    linkedHashMap2.put("track_id", str6);
                    linkedHashMap2.put("track_name", str7);
                    dfi.p(1, "action_type", b2.a, "_meta", linkedHashMap2);
                    nmbVar.C("TrackActions.ActionButton.Tapped", linkedHashMap2);
                    int ordinal = dhVar.ordinal();
                    if (ordinal != 0) {
                        switch (ordinal) {
                            case 10:
                                jmbVar = jmb.AlbumScreen;
                                break;
                            case 11:
                                jmbVar = jmb.ArtistScreen;
                                break;
                            case 12:
                                jmbVar = jmb.TextScreen;
                                break;
                        }
                    } else {
                        jmbVar = jmb.ShareScreen;
                    }
                    if (jmbVar != null && (b = pwl.b(dhVar)) != null) {
                        LinkedHashMap m = dfi.m("page_type", "object", "track_id", str6);
                        m.put("track_name", str7);
                        m.put("action_type", b.a);
                        m.put("from", "track_actions_screen");
                        dfi.p(1, "to", jmbVar.a, "_meta", m);
                        nmbVar.C("TrackActions.ActionButton.Navigated", m);
                    }
                }
                return Unit.a;
            case 24:
                Context context = (Context) this.b;
                EditText editText = (EditText) this.c;
                context.getClass();
                Object systemService = context.getSystemService("input_method");
                InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
                if (inputMethodManager != null) {
                    inputMethodManager.showSoftInput(editText, 1);
                }
                return Unit.a;
            case 25:
                ((Function1) this.b).invoke((thj) this.c);
                return Unit.a;
            case 26:
                dgf dgfVar = (dgf) this.b;
                Context context2 = (Context) this.c;
                dgfVar.getClass();
                context2.getClass();
                fq1 fq1Var = dgfVar.a;
                cpp cppVar = SettingsActivity.v0;
                lsp lspVar = lsp.g;
                cppVar.getClass();
                context2.startActivity(cpp.a(context2, lspVar));
                ggf ggfVar = (ggf) fq1Var.a.getValue();
                rar rarVar = ggfVar.g;
                if (rarVar != null) {
                    rarVar.g(null);
                }
                ggfVar.g = null;
                rar rarVar2 = ggfVar.h;
                if (rarVar2 != null) {
                    rarVar2.g(null);
                }
                ggfVar.h = null;
                xdr xdrVar = ggfVar.d;
                Boolean bool = Boolean.FALSE;
                xdrVar.getClass();
                xdrVar.m(null, bool);
                return Unit.a;
            case 27:
                cjf cjfVar = (cjf) this.b;
                spq spqVar = (spq) this.c;
                upq upqVar = cjfVar.b;
                if (spqVar == null) {
                    spqVar = upqVar.b;
                }
                return (LandingSkeletonApi) upqVar.a(spqVar, new lhd(17, cjfVar)).a.b(LandingSkeletonApi.class);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return ost.a((Context) this.b, ((frt) ((jyr) ((t1f) this.c).b).getValue()).c());
            default:
                View view = (View) this.b;
                zkf zkfVar = (zkf) this.c;
                View findViewById = view.findViewById(R.id.rup_settings_diversity_flow);
                findViewById.getClass();
                View findViewById2 = view.findViewById(R.id.rup_settings_diversity_text_view);
                findViewById2.getClass();
                mmo mmoVar = zkfVar.a;
                View findViewById3 = view.findViewById(R.id.rup_settings_diversity_1);
                findViewById3.getClass();
                m7o m7oVar = new m7o((mkf) findViewById3);
                View findViewById4 = view.findViewById(R.id.rup_settings_diversity_2);
                findViewById4.getClass();
                m7o m7oVar2 = new m7o((mkf) findViewById4);
                View findViewById5 = view.findViewById(R.id.rup_settings_diversity_3);
                findViewById5.getClass();
                l7o l7oVar = new l7o(findViewById, (TextView) findViewById2, mmoVar, u75.h(m7oVar, m7oVar2, new m7o((mkf) findViewById5)));
                View findViewById6 = view.findViewById(R.id.rup_settings_mood_flow);
                findViewById6.getClass();
                View findViewById7 = view.findViewById(R.id.rup_settings_mood_text_view);
                findViewById7.getClass();
                View findViewById8 = view.findViewById(R.id.rup_settings_mood_1);
                findViewById8.getClass();
                m7o m7oVar3 = new m7o((mkf) findViewById8);
                View findViewById9 = view.findViewById(R.id.rup_settings_mood_2);
                findViewById9.getClass();
                m7o m7oVar4 = new m7o((mkf) findViewById9);
                View findViewById10 = view.findViewById(R.id.rup_settings_mood_3);
                findViewById10.getClass();
                m7o m7oVar5 = new m7o((mkf) findViewById10);
                View findViewById11 = view.findViewById(R.id.rup_settings_mood_4);
                findViewById11.getClass();
                return u75.h(l7oVar, new l7o(findViewById6, (TextView) findViewById7, mmoVar, u75.h(m7oVar3, m7oVar4, m7oVar5, new m7o((mkf) findViewById11))));
        }
    }
}
