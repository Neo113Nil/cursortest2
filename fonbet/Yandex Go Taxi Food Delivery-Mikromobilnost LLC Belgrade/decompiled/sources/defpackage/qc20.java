package defpackage;

import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillManager;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.service.zai;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDivHandler;
import com.yandex.go.payments.paymentlist.experiments.SelectedPaymentMethodButtonUIExperiment;
import com.yandex.plus.core.network.okhttp.call.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import just.adapter.sticky.StickyGravity;
import kotlin.Result;
import kotlin.collections.EmptyList;
import org.json.JSONObject;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.contentbaseitems.ContentFontWeightDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.contentbaseitems.ContentIconItemDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.contentbaseitems.ContentTextItemDto;
import ru.yandex.taxi.logistics.sdk.ui_models.common.YaFontWeight;
import ru.yandex.taxi.logistics.sdk.ui_models.common.YaTextOverflow;
import ru.yandex.taxi.logistics.sdk.ui_models.common.YaTextStyle;

/* loaded from: classes8.dex */
public final class qc20 implements pc20, uyz0, a, gbd0, uu60, pll0, i531, wi61, pui0 {
    public Object a;

    public qc20(rqo rqoVar) {
        this.a = ((jbh) rqoVar).c(SelectedPaymentMethodButtonUIExperiment.i);
    }

    public static kr q(w4t0 w4t0Var, t4t0 t4t0Var, StickyGravity stickyGravity, boolean z) {
        int i = eb80.a[stickyGravity.ordinal()];
        if (i != 1) {
            if (i != 2) {
                w511.b();
                return null;
            }
            if (z) {
                if (t4t0Var != null) {
                    return t4t0Var.a;
                }
            } else if (t4t0Var != null) {
                return t4t0Var.b;
            }
        } else if (z) {
            if (w4t0Var != null) {
                return w4t0Var.a;
            }
        } else if (w4t0Var != null) {
            return w4t0Var.b;
        }
        return null;
    }

    public static x4t0 s(List list, g0c g0cVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            x4t0 x4t0Var = (x4t0) it.next();
            if (qoi0.a(x4t0Var.getClass()).equals(g0cVar)) {
                return x4t0Var;
            }
        }
        return null;
    }

    public static String w(String str) {
        return b64.j(str, "#patchParam");
    }

    public static zp1 y(ContentTextItemDto contentTextItemDto, YaTextOverflow yaTextOverflow) {
        YaTextStyle yaTextStyle;
        String text = contentTextItemDto.getText();
        YaFontWeight yaFontWeight = null;
        switch (m4u0.a[contentTextItemDto.getTypography().ordinal()]) {
            case 1:
                yaTextStyle = YaTextStyle.TITLE1;
                break;
            case 2:
                yaTextStyle = YaTextStyle.TITLE2;
                break;
            case 3:
                yaTextStyle = YaTextStyle.TITLE3;
                break;
            case 4:
                yaTextStyle = YaTextStyle.BODY1;
                break;
            case 5:
                yaTextStyle = YaTextStyle.BODY2;
                break;
            case 6:
                yaTextStyle = YaTextStyle.CAPTION1;
                break;
            case 7:
                yaTextStyle = YaTextStyle.CAPTION2;
                break;
            case 8:
                yaTextStyle = YaTextStyle.CAPTION1;
                break;
            default:
                w511.b();
                return null;
        }
        ContentFontWeightDto weight = contentTextItemDto.getWeight();
        if (weight != null) {
            int i = m4u0.b[weight.ordinal()];
            if (i == 1) {
                yaFontWeight = YaFontWeight.LIGHT;
            } else if (i == 2) {
                yaFontWeight = YaFontWeight.NORMAL;
            } else if (i == 3) {
                yaFontWeight = YaFontWeight.MEDIUM;
            } else if (i == 4) {
                yaFontWeight = YaFontWeight.BOLD;
            } else {
                if (i != 5) {
                    w511.b();
                    return null;
                }
                yaFontWeight = YaFontWeight.EXTRA_BOLD;
            }
        }
        return new zp1(text, yaTextStyle, yaFontWeight, contentTextItemDto.getColor(), contentTextItemDto.getMaxLines(), yaTextOverflow);
    }

    public static /* synthetic */ zp1 z(qc20 qc20Var, ContentTextItemDto contentTextItemDto) {
        YaTextOverflow yaTextOverflow = YaTextOverflow.Ellipsis;
        qc20Var.getClass();
        return y(contentTextItemDto, yaTextOverflow);
    }

    public void A(int i, View view, boolean z) {
        u2b1.b(view, (AutofillManager) this.a, i, z);
    }

    public m6r0 B(JSONObject jSONObject) {
        x8r0 wmsVar;
        int i = jSONObject.getInt("settings_version");
        if (i != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i + ". Using default settings values.", null);
            wmsVar = new kl40(21);
        } else {
            wmsVar = new wms(9);
        }
        return wmsVar.e((t2x0) this.a, jSONObject);
    }

    public void C(u0x u0xVar) {
        D(Collections.singletonList(u0xVar));
    }

    public void D(List list) {
        Iterator it = ((f0q0) this.a).a.iterator();
        while (it.hasNext()) {
            h89 h89Var = (h89) it.next();
            j89 j89Var = h89Var.b;
            g89 g89Var = h89Var.a;
            if (!jl40.l(g89Var.c, list) || g89Var.d) {
                g89Var.b.a.remove(h89Var);
                int indexOf = j89Var.g.indexOf(g89Var);
                if (indexOf != -1) {
                    g89 a = g89.a(g89Var, null, list, 3);
                    j89Var.g.set(indexOf, a);
                    f0q0 f0q0Var = a.b;
                    f0q0Var.a.add(new h89(j89Var, a));
                }
                j89Var.d();
            }
        }
    }

    public void E(String str, String str2) {
        List t = t(str);
        ArrayList arrayList = t != null ? new ArrayList(t) : new ArrayList();
        if (!arrayList.contains(new fe7(str2))) {
            arrayList.add(new fe7(str2));
        }
        ((am2) this.a).n(new fe7(str), arrayList);
    }

    @Override // defpackage.pc20
    public void a(double d, String str) {
        pc20[] pc20VarArr = (pc20[]) this.a;
        for (int i = 0; i < 2; i++) {
            pc20 pc20Var = pc20VarArr[i];
            if (pc20Var != null) {
                pc20Var.a(d, str);
            }
        }
    }

    @Override // defpackage.pui0
    public void accept(Object obj, Object obj2) {
        zm2 zm2Var = e091.k;
        ((zai) ((f091) obj).i()).zae((TelemetryData) this.a);
        ((atx0) obj2).a(null);
    }

    @Override // defpackage.i531, defpackage.f531
    public boolean b() {
        ((ofa0) this.a).getClass();
        return false;
    }

    @Override // defpackage.pll0
    public oll0 c(String str) {
        lkw0 lkw0Var = (lkw0) this.a;
        String databaseName = lkw0Var.getDatabaseName();
        if (databaseName == null) {
            if (!str.equals(":memory:")) {
                w511.f(oyr.p("This driver is configured to open an in-memory database but a file-based named '", str, "' was requested."));
                return null;
            }
        } else if (!databaseName.equals(str) && !evu0.e0('/', databaseName, databaseName).equals(evu0.e0('/', str, str))) {
            vg10.q("This driver is configured to open a database named '", lkw0Var.getDatabaseName(), "' but '", str, "' was requested.");
            return null;
        }
        return new androidx.sqlite.driver.a(lkw0Var.getWritableDatabase());
    }

    @Override // defpackage.uu60
    public boolean d() {
        Object failure;
        bed0 bed0Var = (bed0) this.a;
        if (bed0Var == null) {
            return false;
        }
        try {
            failure = Boolean.valueOf(bed0Var.d());
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Object obj = Boolean.FALSE;
        if (failure instanceof Result.Failure) {
            failure = obj;
        }
        return ((Boolean) failure).booleanValue();
    }

    @Override // defpackage.f531
    public long e(sj2 sj2Var, sj2 sj2Var2, sj2 sj2Var3) {
        return ((ofa0) this.a).e(sj2Var, sj2Var2, sj2Var3);
    }

    @Override // defpackage.uyz0
    public void g(double d, Map map) {
        ev20 ev20Var = (ev20) this.a;
        ev20Var.a.reportTotalScore(ev20Var.r, "", d, map);
    }

    @Override // defpackage.uyz0
    public void h(double d, Map map) {
        ev20 ev20Var = (ev20) this.a;
        ev20Var.a.reportTotalScoreStartupSpecific(ev20Var.r, "", d, map, "warm");
    }

    @Override // defpackage.f531
    public sj2 i(sj2 sj2Var, sj2 sj2Var2, sj2 sj2Var3) {
        return ((ofa0) this.a).i(sj2Var, sj2Var2, sj2Var3);
    }

    @Override // defpackage.uyz0
    public void j(double d, Map map) {
        ev20 ev20Var = (ev20) this.a;
        ev20Var.a.reportTotalScoreStartupSpecific(ev20Var.r, "", d, map, "hot");
    }

    @Override // defpackage.f531
    public sj2 k(long j, sj2 sj2Var, sj2 sj2Var2, sj2 sj2Var3) {
        return ((ofa0) this.a).k(j, sj2Var, sj2Var2, sj2Var3);
    }

    @Override // defpackage.uyz0
    public void l(double d, Map map) {
        ev20 ev20Var = (ev20) this.a;
        ev20Var.a.reportTotalScoreStartupSpecific(ev20Var.r, "", d, map, "cold");
    }

    @Override // defpackage.pll0
    public boolean m() {
        return true;
    }

    @Override // defpackage.f531
    public sj2 n(long j, sj2 sj2Var, sj2 sj2Var2, sj2 sj2Var3) {
        return ((ofa0) this.a).n(j, sj2Var, sj2Var2, sj2Var3);
    }

    @Override // defpackage.pc20
    public void p() {
        pc20[] pc20VarArr = (pc20[]) this.a;
        for (int i = 0; i < 2; i++) {
            pc20 pc20Var = pc20VarArr[i];
            if (pc20Var != null) {
                pc20Var.p();
            }
        }
    }

    @Override // defpackage.pc20
    public void reset() {
        pc20[] pc20VarArr = (pc20[]) this.a;
        for (int i = 0; i < 2; i++) {
            pc20 pc20Var = pc20VarArr[i];
            if (pc20Var != null) {
                pc20Var.reset();
            }
        }
    }

    public List t(String str) {
        return (List) ((am2) this.a).i(new fe7(str));
    }

    public boolean u() {
        rqo rqoVar = (rqo) this.a;
        lf11.Companion.getClass();
        return ((lf11) ((jbh) rqoVar).e(lf11.c).c()).getB();
    }

    public String v(String str, String str2) {
        List t = t(str);
        if (t == null) {
            t = EmptyList.a;
        }
        return str + ShimmerDivHandler.NUMBER_SING + str2 + ShimmerDivHandler.NUMBER_SING + (t.size() + 1);
    }

    public jk51 x(ContentIconItemDto contentIconItemDto) {
        return new jk51(((l7x0) this.a).a(contentIconItemDto.getImageTag()), contentIconItemDto.getTintColor());
    }

    public /* synthetic */ qc20(Object obj) {
        this.a = obj;
    }

    public qc20(uo11 uo11Var) {
        this.a = new am2(uo11Var);
    }

    @Override // defpackage.wi61
    public /* bridge */ /* synthetic */ Object a() {
        return new ih61((ji61) ((fi61) this.a).a());
    }
}
