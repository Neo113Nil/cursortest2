package defpackage;

import com.yandex.go.layers.api.model.MapObjectComponentType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.layers.LayersAnalyticEventEmmiter;
import ru.yandex.taxi.layers.a;

/* loaded from: classes9.dex */
public final class sd1 implements a {
    public final lx4 a;
    public final kf00 b;
    public final dyx c;
    public final nmx d;
    public final HashSet e = new HashSet();
    public final HashSet f = new HashSet();
    public final HashSet g = new HashSet();

    public sd1(lx4 lx4Var, kf00 kf00Var, dyx dyxVar, nmx nmxVar) {
        this.a = lx4Var;
        this.b = kf00Var;
        this.c = dyxVar;
        this.d = nmxVar;
    }

    @Override // ru.yandex.taxi.layers.a
    public final void a(String str, MapObjectComponentType mapObjectComponentType, LayersAnalyticEventEmmiter.Event event, sm00 sm00Var) {
        String str2;
        jmx jmxVar;
        String str3 = sm00Var.d() ? "full" : "mini";
        if (mapObjectComponentType == MapObjectComponentType.IMAGE_OVERLAY) {
            return;
        }
        if (event != LayersAnalyticEventEmmiter.Event.AVAILABLE || this.g.add(str)) {
            if (event == LayersAnalyticEventEmmiter.Event.SHOWN) {
                if (!this.e.add(str + str3)) {
                    return;
                }
            }
            if (event == LayersAnalyticEventEmmiter.Event.SEEN) {
                if (!this.f.add(str + str3)) {
                    return;
                }
            }
            dyx dyxVar = this.c;
            String analyticsName = dyxVar.a().b.a.getAnalyticsName();
            String analyticsName2 = dyxVar.a().a.getAnalyticsName();
            ArrayList b = this.d.b();
            if (b == null || (jmxVar = (jmx) kotlin.collections.a.R(b)) == null) {
                str2 = null;
            } else {
                uvx0 uvx0Var = jmxVar instanceof uvx0 ? (uvx0) jmxVar : null;
                str2 = g8e.p(jl40.l(uvx0Var != null ? uvx0Var.b() : null, "intercity") ? "intercity" : jmxVar.getService(), ":", jmxVar.a());
            }
            int i = rd1.a[event.ordinal()];
            String str4 = str2;
            String str5 = str3;
            kf00 kf00Var = this.b;
            if (i == 1) {
                String m = sm00Var.m();
                String l = sm00Var.l();
                String c = sm00Var.c();
                String b2 = sm00Var.b();
                String h = sm00Var.h();
                String g = sm00Var.g();
                String i2 = sm00Var.i();
                String j = sm00Var.j();
                zzs e = sm00Var.e();
                Double valueOf = e != null ? Double.valueOf(e.a) : null;
                zzs e2 = sm00Var.e();
                Double d = valueOf;
                Double valueOf2 = e2 != null ? Double.valueOf(e2.b) : null;
                String f = sm00Var.f();
                String k = sm00Var.k();
                Boolean n = sm00Var.n();
                HashMap A = oyr.A(kf00Var);
                if (str != null) {
                    A.put("id", str);
                }
                if (analyticsName != null) {
                    A.put("mode", analyticsName);
                }
                if (analyticsName2 != null) {
                    A.put(MetaDataField.SCREEN_FIELD, analyticsName2);
                }
                if (m != null) {
                    A.put("poi_title", m);
                }
                if (l != null) {
                    A.put("poi_subtitle", l);
                }
                if (c != null) {
                    A.put("poi_formatted_title", c);
                }
                if (b2 != null) {
                    A.put("poi_formatted_subtitle", b2);
                }
                if (h != null) {
                    A.put("poi_icon_type", h);
                }
                if (g != null) {
                    A.put("poi_icon", g);
                }
                if (i2 != null) {
                    A.put("poi_permalink", i2);
                }
                if (j != null) {
                    A.put("poi_location_type", j);
                }
                if (d != null) {
                    A.put("poi_location_lat", d);
                }
                if (valueOf2 != null) {
                    A.put("poi_location_lon", valueOf2);
                }
                if (f != null) {
                    A.put("poi_hitlog", f);
                }
                if (k != null) {
                    A.put("permalink_source", k);
                }
                if (n != null) {
                    A.put("permalink_is_paid", n);
                }
                if (str4 != null) {
                    A.put("order_id", str4);
                }
                kf00Var.a.a("Map.AdvertObject.Available", A, 1, new HashMap());
                return;
            }
            if (i == 2) {
                HashMap A2 = oyr.A(kf00Var);
                if (str != null) {
                    A2.put("id", str);
                }
                if (analyticsName != null) {
                    A2.put("mode", analyticsName);
                }
                if (analyticsName2 != null) {
                    A2.put(MetaDataField.SCREEN_FIELD, analyticsName2);
                }
                kf00Var.a.a("Map.AdvertObject.Shown", A2, 1, tse0.r("poi_mode", A2, str5));
                return;
            }
            if (i == 3) {
                HashMap A3 = oyr.A(kf00Var);
                if (str != null) {
                    A3.put("id", str);
                }
                if (analyticsName != null) {
                    A3.put("mode", analyticsName);
                }
                if (analyticsName2 != null) {
                    A3.put(MetaDataField.SCREEN_FIELD, analyticsName2);
                }
                kf00Var.a.a("Map.AdvertObject.Seen", A3, 1, tse0.r("poi_mode", A3, str5));
                return;
            }
            if (i != 4) {
                w511.b();
                return;
            }
            i d2 = ((j) this.a).d("Map.AdvertObject.Tapped");
            LinkedHashMap linkedHashMap = d2.a;
            d2.d("id", str);
            d2.d("mode", analyticsName);
            d2.d(MetaDataField.SCREEN_FIELD, analyticsName2);
            String m2 = sm00Var.m();
            if (m2 != null) {
                linkedHashMap.put("poi_title", m2);
            }
            String l2 = sm00Var.l();
            if (l2 != null) {
                linkedHashMap.put("poi_subtitle", l2);
            }
            String c2 = sm00Var.c();
            if (c2 != null) {
                linkedHashMap.put("poi_formatted_title", c2);
            }
            String b3 = sm00Var.b();
            if (b3 != null) {
                linkedHashMap.put("poi_formatted_subtitle", b3);
            }
            String h2 = sm00Var.h();
            if (h2 != null) {
                linkedHashMap.put("poi_icon_type", h2);
            }
            String g2 = sm00Var.g();
            if (g2 != null) {
                linkedHashMap.put("poi_icon", g2);
            }
            String i3 = sm00Var.i();
            if (i3 != null) {
                linkedHashMap.put("poi_permalink", i3);
            }
            String j2 = sm00Var.j();
            if (j2 != null) {
                linkedHashMap.put("poi_location_type", j2);
            }
            zzs e3 = sm00Var.e();
            if (e3 != null) {
                d2.a(e3.a, "poi_location_lat");
                d2.a(e3.b, "poi_location_lon");
            }
            String f2 = sm00Var.f();
            if (f2 != null) {
                linkedHashMap.put("poi_hitlog", f2);
            }
            String k2 = sm00Var.k();
            if (k2 != null) {
                linkedHashMap.put("permalink_source", k2);
            }
            Boolean n2 = sm00Var.n();
            if (n2 != null) {
                linkedHashMap.put("permalink_is_paid", n2);
            }
            d2.d("poi_mode", str5);
            if (str4 != null) {
                d2.d("order_id", str4);
            }
            d2.m();
        }
    }
}
