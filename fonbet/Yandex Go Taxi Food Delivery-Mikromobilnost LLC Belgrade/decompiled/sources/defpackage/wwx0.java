package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.builders.MapBuilder;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.taxi.cashback.sdk.c0;

/* loaded from: classes9.dex */
public final class wwx0 {
    public final c0 a;
    public final iic0 b;
    public final t61 c;
    public final AtomicReference d = new AtomicReference(null);

    public wwx0(c0 c0Var, iic0 iic0Var, t61 t61Var) {
        this.a = c0Var;
        this.b = iic0Var;
        this.c = t61Var;
    }

    public final void a(String str, Map map, ye0 ye0Var) {
        String a = this.a.a.a();
        String j = ye0Var.j();
        b6d0 b6d0Var = ye0Var instanceof b6d0 ? (b6d0) ye0Var : null;
        Long valueOf = b6d0Var != null ? Long.valueOf(b6d0Var.p()) : null;
        if (map.isEmpty()) {
            map = null;
        }
        t61 t61Var = this.c;
        t61Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("closed_by", j);
        if (valueOf != null) {
            hashMap.put("delay", valueOf);
        }
        if (map != null) {
            hashMap.put("metric_context", map);
        }
        t61Var.a.a("UniversalPlaque.Closed", hashMap, 1, x4e.q(hashMap, "plaque_id", str, MetaDataField.SCREEN_FIELD, a));
    }

    public final void b(h22 h22Var) {
        String str;
        vwx0 vwx0Var = (vwx0) this.d.get();
        if (vwx0Var != null) {
            this.b.getClass();
            MapBuilder mapBuilder = new MapBuilder();
            iic0.a(mapBuilder, h22Var.getAction());
            if (h22Var instanceof m22) {
                str = "group";
            } else if (h22Var instanceof n22) {
                str = "level";
            } else if (h22Var instanceof p22) {
                str = "plaque";
            } else {
                if (!(h22Var instanceof u22)) {
                    w511.b();
                    return;
                }
                str = "widget";
            }
            mapBuilder.put("element_type", str);
            mapBuilder.put("element_id", h22Var.getId());
            if (h22Var instanceof u22) {
                iic0.b(mapBuilder, (u22) h22Var);
            }
            MapBuilder j = mapBuilder.j();
            String a = vwx0Var.a();
            String c = vwx0Var.c();
            String d = vwx0Var.d();
            List<u22> e = vwx0Var.e();
            ArrayList arrayList = new ArrayList(tcc.n(e, 10));
            for (u22 u22Var : e) {
                MapBuilder mapBuilder2 = new MapBuilder();
                mapBuilder2.put("widget_id", u22Var.getId());
                iic0.a(mapBuilder2, u22Var.getAction());
                iic0.b(mapBuilder2, u22Var);
                arrayList.add(mapBuilder2.j());
            }
            Map b = vwx0Var.b();
            if (b.isEmpty()) {
                b = null;
            }
            t61 t61Var = this.c;
            t61Var.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("element_clicked", j);
            if (b != null) {
                hashMap.put("metric_context", b);
            }
            hashMap.put("notification_count", a);
            hashMap.put("plaque_id", c);
            hashMap.put(MetaDataField.SCREEN_FIELD, d);
            hashMap.put("widget_list", arrayList);
            t61Var.a.a("UniversalPlaque.Tapped", hashMap, 1, new HashMap());
        }
    }

    public final void c(String str, String str2, Throwable th) {
        xby.l(jst.e, "PLUS_UNIVERSAL_PLAQUE.".concat(str), null, th, str2, 2);
    }
}
