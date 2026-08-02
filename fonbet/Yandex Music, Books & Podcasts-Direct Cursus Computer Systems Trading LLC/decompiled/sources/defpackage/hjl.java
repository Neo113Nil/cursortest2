package defpackage;

import com.appsflyer.internal.k;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.LinkedHashMap;

/* loaded from: classes4.dex */
public final class hjl {
    public final nab a;
    public final okb b;
    public final vdr c;
    public final xmb d;
    public final LinkedHashMap e;
    public final jyr f;

    public hjl(nab nabVar, fnb fnbVar, okb okbVar, xdr xdrVar) {
        fnbVar.getClass();
        okbVar.getClass();
        xdrVar.getClass();
        this.a = nabVar;
        this.b = okbVar;
        this.c = xdrVar;
        this.d = new xmb(fnbVar);
        this.e = new LinkedHashMap();
        this.f = btf.b(new ufl(9));
    }

    public static void b(hjl hjlVar, wjb wjbVar, pkl pklVar, thj thjVar, int i, int i2) {
        if ((i2 & 8) != 0) {
            i = 0;
        }
        int i3 = i;
        hjlVar.getClass();
        pklVar.getClass();
        xmb xmbVar = hjlVar.d;
        nab nabVar = hjlVar.a;
        cvo d = pklVar.d();
        String str = (String) hjlVar.e.get(thjVar.b);
        if (str == null) {
            str = "";
        }
        xmbVar.g(wjbVar, nabVar, null, d, i3, str, thjVar, null, (r20 & 256) != 0 ? null : null, "");
    }

    public final void a(sjb sjbVar, thj thjVar, pkl pklVar, int i) {
        pklVar.getClass();
        String str = (String) this.e.get(thjVar.b);
        if (str == null) {
            str = "";
        }
        cvo d = pklVar.d();
        u0s u0sVar = (u0s) this.f.getValue();
        xmb.b(this.d, sjbVar, this.a, u0sVar, d, i, str, thjVar, 514);
    }

    public final void c(wjb wjbVar, pkl pklVar) {
        pklVar.getClass();
        thj thjVar = (thj) pklVar.h.getValue();
        zil zilVar = pklVar.c.a;
        zlb zlbVar = zilVar.c;
        ylb ylbVar = zilVar.d;
        hmb hmbVar = zilVar.e;
        cvo d = pklVar.d();
        String str = (String) this.e.get(thjVar.b);
        if (str == null) {
            str = "";
        }
        String str2 = pklVar.d;
        String str3 = pklVar.c().b;
        xmb xmbVar = this.d;
        xmbVar.getClass();
        zlbVar.getClass();
        ylbVar.getClass();
        d.getClass();
        wjb wjbVar2 = d.a;
        str2.getClass();
        str3.getClass();
        okb okbVar = this.b;
        okbVar.getClass();
        nmb d2 = xmbVar.d();
        if (d2 != null) {
            String G = xmbVar.a.G();
            ilb ilbVar = d.g;
            glb glbVar = d.c;
            String str4 = d.d.a;
            avo avoVar = d.e;
            pkb pkbVar = avoVar.a;
            String str5 = avoVar.b;
            qkb qkbVar = qkb.Carousel;
            nab nabVar = this.a;
            int b = nabVar.b();
            int d3 = nabVar.d();
            G.getClass();
            wjbVar2.getClass();
            String str6 = wjbVar2.a;
            ilbVar.getClass();
            glbVar.getClass();
            str4.getClass();
            pkbVar.getClass();
            str5.getClass();
            String str7 = str;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("queue_source", ylbVar.a);
            linkedHashMap.put("queue_type", zlbVar.a);
            linkedHashMap.put("target_device", hmbVar.a);
            linkedHashMap.put("hash", G);
            linkedHashMap.put("page_id", str6);
            linkedHashMap.put("page_style", ilbVar.a);
            linkedHashMap.put("page_placement", glbVar.a);
            linkedHashMap.put("skeleton_id", str4);
            linkedHashMap.put("main_object_type", pkbVar.a);
            linkedHashMap.put("main_object_id", str5);
            linkedHashMap.put("page_type", "object");
            linkedHashMap.put("track_id", str3);
            linkedHashMap.put("entity_type", "player");
            eta.m(b, "entity_id", "player", "entity_pos_x", linkedHashMap);
            k.u(d3, "entity_pos_y", "from", str6, linkedHashMap);
            linkedHashMap.put("to", wjbVar.a);
            linkedHashMap.put("deep_link", "");
            linkedHashMap.put(CommonUrlParts.DEVICE_TYPE, okbVar.a);
            linkedHashMap.put("view_uuid", str7);
            eta.m(0, "loaded_view_uuid", str2, "player_parameters", linkedHashMap);
            linkedHashMap.put("_meta", nmb.u(1));
            d2.C("Player.Navigated", linkedHashMap);
        }
    }

    public final void e(boolean z, String str, thj thjVar, int i, pkl pklVar, fcc fccVar) {
        str.getClass();
        thjVar.getClass();
        String str2 = thjVar.b;
        pklVar.getClass();
        jyr jyrVar = this.f;
        nab nabVar = this.a;
        LinkedHashMap linkedHashMap = this.e;
        if (z) {
            linkedHashMap.put(str2, str);
            xmb.k(i, 128, nabVar, this.d, fccVar, thjVar, pklVar.d(), (u0s) jyrVar.getValue(), str, null);
            return;
        }
        if (z) {
            b6e.s();
            return;
        }
        String str3 = (String) linkedHashMap.remove(str2);
        if (str3 == null) {
            str3 = "";
        }
        cvo d = pklVar.d();
        u0s u0sVar = (u0s) jyrVar.getValue();
        xmb.f(i, 128, nabVar, this.d, fccVar, thjVar, d, u0sVar, str3, null);
    }
}
