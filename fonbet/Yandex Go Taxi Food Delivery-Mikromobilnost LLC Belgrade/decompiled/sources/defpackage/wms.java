package defpackage;

import java.nio.charset.Charset;
import java.util.List;
import kotlin.Pair;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class wms implements ams, gqw, x8r0, vm11, lq31, kfo, ga91 {
    public final /* synthetic */ int a;
    public static final /* synthetic */ wms b = new wms(14);
    public static final /* synthetic */ wms c = new wms(15);
    public static final /* synthetic */ wms w = new wms(16);
    public static final /* synthetic */ wms x = new wms(17);
    public static final /* synthetic */ wms y = new wms(18);
    public static final /* synthetic */ wms z = new wms(19);
    public static final /* synthetic */ wms A = new wms(20);
    public static final /* synthetic */ wms B = new wms(21);
    public static final /* synthetic */ wms C = new wms(22);
    public static final /* synthetic */ wms D = new wms(23);
    public static final /* synthetic */ wms E = new wms(24);
    public static final /* synthetic */ wms F = new wms(25);
    public static final /* synthetic */ wms G = new wms(26);
    public static final /* synthetic */ wms H = new wms(27);
    public static final /* synthetic */ wms I = new wms(28);
    public static final /* synthetic */ wms J = new wms(29);

    public /* synthetic */ wms(int i) {
        this.a = i;
    }

    public static l5j0 a(String str, wg10 wg10Var) {
        Pair a = sqw.a(wg10Var);
        Charset charset = (Charset) a.getFirst();
        wg10 wg10Var2 = (wg10) a.getSecond();
        byte[] bytes = str.getBytes(charset);
        int length = bytes.length;
        yf61.a(bytes.length, 0L, length);
        return new l5j0(length, wg10Var2, bytes);
    }

    public static l5j0 b(int i, wg10 wg10Var, byte[] bArr) {
        if ((i & 1) != 0) {
            wg10Var = null;
        }
        int length = bArr.length;
        yf61.a(bArr.length, 0L, length);
        return new l5j0(length, wg10Var, bArr);
    }

    public static l5j0 c(wg10 wg10Var, byte[] bArr) {
        int length = bArr.length;
        yf61.a(bArr.length, 0L, length);
        return new l5j0(length, wg10Var, bArr);
    }

    @Override // defpackage.ams
    public Object d(jje jjeVar, inj injVar) {
        if (injVar.c == 3) {
            Object[] objArr = injVar.a;
            return ihb1.j(objArr[0], objArr[1], objArr[2]);
        }
        throw oyr.x(injVar.c, " arguments passed", new StringBuilder("Function \"replace\" requires 3 argument but "));
    }

    @Override // defpackage.x8r0
    public m6r0 e(t2x0 t2x0Var, JSONObject jSONObject) {
        jSONObject.optInt("settings_version", 0);
        int optInt = jSONObject.optInt("cache_duration", 3600);
        double optDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double optDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int optInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        hgz hgzVar = jSONObject.has("session") ? new hgz(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8)) : new hgz(new JSONObject().optInt("max_custom_exception_events", 8));
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        return new m6r0(jSONObject.has("expires_at") ? jSONObject.optLong("expires_at") : (optInt * 1000) + System.currentTimeMillis(), hgzVar, new i6r0(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false)), optDouble, optDouble2, optInt2);
    }

    @Override // defpackage.vm11
    public /* bridge */ /* synthetic */ Object q() {
        return Boolean.FALSE;
    }

    @Override // defpackage.vm11
    public boolean t(Object obj) {
        return obj instanceof Boolean;
    }

    @Override // defpackage.ga91
    public Object zza() {
        switch (this.a) {
            case 15:
                ((neb1) feb1.b.a.get()).getClass();
                return new Boolean(((Boolean) neb1.a.b()).booleanValue());
            case 16:
                List list = nw91.a;
                ((zjb1) kjb1.b.a.get()).getClass();
                Boolean bool = (Boolean) zjb1.a.b();
                bool.getClass();
                return bool;
            case 17:
                List list2 = nw91.a;
                hcb1.b.get().getClass();
                return Integer.valueOf((int) ((Long) qcb1.k0.b()).longValue());
            case 18:
                List list3 = nw91.a;
                hcb1.b.get().getClass();
                return (String) qcb1.N.b();
            case 19:
                List list4 = nw91.a;
                hcb1.b.get().getClass();
                return Integer.valueOf((int) ((Long) qcb1.K.b()).longValue());
            case 20:
                List list5 = nw91.a;
                hcb1.b.get().getClass();
                Long l = (Long) qcb1.I.b();
                l.getClass();
                return l;
            case 21:
                List list6 = nw91.a;
                hcb1.b.get().getClass();
                Long l2 = (Long) qcb1.i.b();
                l2.getClass();
                return l2;
            case 22:
                List list7 = nw91.a;
                hcb1.b.get().getClass();
                return (String) qcb1.h.b();
            case 23:
                List list8 = nw91.a;
                hcb1.b.get().getClass();
                return Integer.valueOf((int) ((Long) qcb1.t.b()).longValue());
            case 24:
                List list9 = nw91.a;
                uhb1.b.get().getClass();
                Long l3 = (Long) bib1.e.b();
                l3.getClass();
                return l3;
            case 25:
                List list10 = nw91.a;
                hcb1.b.get().getClass();
                return Integer.valueOf((int) ((Long) qcb1.q.b()).longValue());
            case 26:
                List list11 = nw91.a;
                hcb1.b.get().getClass();
                return Integer.valueOf((int) ((Long) qcb1.p.b()).longValue());
            case 27:
                List list12 = nw91.a;
                hcb1.b.get().getClass();
                return (String) qcb1.w0.b();
            case 28:
                List list13 = nw91.a;
                hcb1.b.get().getClass();
                return Integer.valueOf((int) ((Long) qcb1.X.b()).longValue());
            default:
                List list14 = nw91.a;
                ((jfb1) cfb1.b.a.get()).getClass();
                Boolean bool2 = (Boolean) jfb1.b.b();
                bool2.getClass();
                return bool2;
        }
    }
}
