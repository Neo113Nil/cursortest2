package defpackage;

import android.content.Context;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.yandex.pulse.metrics.o;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class uv1 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ uv1(int i) {
        this.a = i;
    }

    /* JADX WARN: Finally extract failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        cko D0;
        switch (this.a) {
            case 0:
                lv1 lv1Var = (lv1) obj;
                lv1Var.getClass();
                if (lv1Var instanceof jv1) {
                    return rv1.a;
                }
                if (lv1Var instanceof kv1) {
                    return new sv1(((kv1) lv1Var).a);
                }
                b6e.s();
                return null;
            case 1:
                ((String) obj).getClass();
                return Boolean.TRUE;
            case 2:
                o18 o18Var = (o18) obj;
                vz1.e(o18Var, c9k.class).E(new uv1(3));
                o18Var.b(hag.I(c9k.class)).E(new uv1(4));
                o18Var.b(hag.I(iv0.class)).E(new uv1(5));
                o18Var.b(hag.I(av0.class)).E(new uv1(6));
                return Unit.a;
            case 3:
                ((l13) obj).getClass();
                c9k c9kVar = wz1.a;
                if (c9kVar != null) {
                    return c9kVar;
                }
                Intrinsics.j("accountManagerClient");
                throw null;
            case 4:
                ((l13) obj).getClass();
                c9k c9kVar2 = wz1.a;
                if (c9kVar2 != null) {
                    return c9kVar2;
                }
                Intrinsics.j("accountManagerClient");
                throw null;
            case 5:
                l13 l13Var = (l13) obj;
                l13Var.getClass();
                bdt I = hag.I(Context.class);
                qdc qdcVar = l13Var.a;
                Set set = l13Var.b;
                return new iv0((Context) qdcVar.D(I, l13Var, set), (dqi) ((ani) qdcVar.D(hag.I(ani.class), l13Var, set)).h.getValue(), (c9k) qdcVar.D(hag.I(c9k.class), l13Var, set), (cc7) qdcVar.D(hag.I(cc7.class), l13Var, set));
            case 6:
                return (av0) vz1.l((l13) obj, iv0.class);
            case 7:
                Throwable th = (Throwable) obj;
                if (th instanceof d02) {
                    d02 d02Var = (d02) th;
                    String str = d02Var.a;
                    d02Var.getMessage();
                    str.getClass();
                }
                return Unit.a;
            case 8:
                jfp jfpVar = (jfp) obj;
                jfpVar.getClass();
                wfp.e(jfpVar);
                return Unit.a;
            case 9:
                o18 o18Var2 = (o18) obj;
                vz1.e(o18Var2, b32.class).E(new uv1(10));
                o18Var2.b(hag.I(zxq.class)).E(new uv1(11));
                o18Var2.b(hag.I(iyq.class)).E(new uv1(12));
                return Unit.a;
            case 10:
                l13 l13Var2 = (l13) obj;
                l13Var2.getClass();
                return new b32(l13Var2.b(hag.I(lwc.class), true));
            case 11:
                ((l13) obj).getClass();
                return new zxq(new u12(5));
            case 12:
                ((l13) obj).getClass();
                return new iyq(new o(6));
            case 13:
                jfp jfpVar2 = (jfp) obj;
                jfpVar2.getClass();
                wfp.f(jfpVar2);
                return Unit.a;
            case 14:
                jfp jfpVar3 = (jfp) obj;
                jfpVar3.getClass();
                wfp.f(jfpVar3);
                return Unit.a;
            case 15:
                Integer num = (Integer) obj;
                num.intValue();
                return num;
            case 16:
                dtr dtrVar = (dtr) obj;
                dtrVar.getClass();
                dtrVar.execute();
                return Unit.a;
            case 17:
                zp2 zp2Var = (zp2) obj;
                zp2Var.getClass();
                return zp2Var.b;
            case 18:
                xjo xjoVar = (xjo) obj;
                xjoVar.getClass();
                D0 = xjoVar.D0("SELECT * FROM auto_tracks_cache_info");
                try {
                    int v = s7g.v(D0, "track_id");
                    int v2 = s7g.v(D0, "cache_info");
                    ArrayList arrayList = new ArrayList();
                    while (D0.q()) {
                        String x0 = D0.x0(v);
                        String x02 = D0.x0(v2);
                        x02.getClass();
                        JsonObject m = JsonParser.b(x02).m();
                        if (m.v("version").a() != 1) {
                            throw new IllegalArgumentException("Unsupported auto tracks cache table version: 1");
                        }
                        arrayList.add(new ib2(x0, new x62(((JsonObject) m.a.get(Constants.KEY_VALUE)).v("lastUseTimestamp").o())));
                    }
                    return arrayList;
                } catch (Throwable th2) {
                    throw th2;
                }
            case 19:
                xjo xjoVar2 = (xjo) obj;
                xjoVar2.getClass();
                D0 = xjoVar2.D0("SELECT * FROM auto_tracks_cache_info");
                try {
                    int v3 = s7g.v(D0, "track_id");
                    int v4 = s7g.v(D0, "cache_info");
                    ArrayList arrayList2 = new ArrayList();
                    while (D0.q()) {
                        String x03 = D0.x0(v3);
                        String x04 = D0.x0(v4);
                        x04.getClass();
                        JsonObject m2 = JsonParser.b(x04).m();
                        if (m2.v("version").a() != 1) {
                            throw new IllegalArgumentException("Unsupported auto tracks cache table version: 1");
                        }
                        arrayList2.add(new ib2(x03, new x62(((JsonObject) m2.a.get(Constants.KEY_VALUE)).v("lastUseTimestamp").o())));
                    }
                    return arrayList2;
                } catch (Throwable th3) {
                    throw th3;
                }
            case 20:
                xjo xjoVar3 = (xjo) obj;
                xjoVar3.getClass();
                D0 = xjoVar3.D0("DELETE FROM auto_tracks_cache_info");
                try {
                    D0.q();
                    D0.close();
                    return Unit.a;
                } finally {
                    D0.close();
                }
            case 21:
                o18 o18Var3 = (o18) obj;
                vz1.e(o18Var3, ze2.class).E(new uv1(22));
                o18Var3.b(hag.I(ef2.class)).D(new uv1(23));
                o18Var3.b(hag.I(we2.class)).D(new uv1(24));
                o18Var3.b(hag.I(gf2.class)).D(new uv1(25));
                o18Var3.b(hag.I(ff2.class)).E(new uv1(26));
                o18Var3.b(hag.I(jf2.class)).E(new uv1(27));
                return Unit.a;
            case 22:
                l13 l13Var3 = (l13) obj;
                l13Var3.getClass();
                return new ze2((lk5) l13Var3.a.D(hag.I(lk5.class), l13Var3, l13Var3.b));
            case 23:
                return (ef2) vz1.l((l13) obj, ze2.class);
            case 24:
                return (we2) vz1.l((l13) obj, ze2.class);
            case 25:
                l13 l13Var4 = (l13) obj;
                l13Var4.getClass();
                bdt I2 = hag.I(oq7.class);
                qdc qdcVar2 = l13Var4.a;
                Set set2 = l13Var4.b;
                return new gf2((Context) qdcVar2.D(hag.I(Context.class), l13Var4, set2), (k1l) qdcVar2.D(hag.I(k1l.class), l13Var4, set2), (oq7) qdcVar2.D(I2, l13Var4, set2), ((oq7) qdcVar2.D(hag.I(oq7.class), l13Var4, set2)).b.f, (g64) qdcVar2.D(hag.I(g64.class), l13Var4, set2), (syp) qdcVar2.D(hag.I(syp.class), l13Var4, set2), (fw1) qdcVar2.D(hag.I(fw1.class), l13Var4, set2), (ef2) qdcVar2.D(hag.I(ef2.class), l13Var4, set2), (we2) qdcVar2.D(hag.I(we2.class), l13Var4, set2));
            case 26:
                l13 l13Var5 = (l13) obj;
                l13Var5.getClass();
                return new ff2((gf2) l13Var5.a.D(hag.I(gf2.class), l13Var5, l13Var5.b));
            case 27:
                return (jf2) ((ff2) vz1.l((l13) obj, ff2.class)).a.c(hag.I(kf2.class));
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ((l13) obj).getClass();
                return gld.e(dm6.c);
            default:
                ((l13) obj).getClass();
                return new wf2();
        }
    }

    public /* synthetic */ uv1(int i, Object obj) {
        this.a = i;
    }
}
