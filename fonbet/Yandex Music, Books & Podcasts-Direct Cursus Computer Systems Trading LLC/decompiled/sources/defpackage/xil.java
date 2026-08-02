package defpackage;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class xil {
    public final okb a;
    public final fnb b;
    public final xdh c;
    public final xdr d;
    public final by7 e;

    public xil(okb okbVar, fnb fnbVar, xdh xdhVar, pkl pklVar) {
        okbVar.getClass();
        fnbVar.getClass();
        this.a = okbVar;
        this.b = fnbVar;
        this.c = xdhVar;
        xdr a = ydr.a(pklVar);
        this.d = a;
        this.e = asq.K(a, new hcl(29));
    }

    public final hjl a(nab nabVar) {
        return new hjl(nabVar, this.b, this.a, this.d);
    }

    public final void b() {
        pkl c = c();
        String G = this.b.G();
        c.getClass();
        G.getClass();
        ajl ajlVar = c.c;
        xdh xdhVar = this.c;
        nmb nmbVar = (nmb) xdhVar.d;
        zil zilVar = ajlVar.a;
        ylb ylbVar = zilVar.d;
        zlb zlbVar = zilVar.c;
        hmb hmbVar = zilVar.e;
        String str = ajlVar.b;
        wjb wjbVar = wjb.AboutArtistScreen;
        ilb ilbVar = c.f;
        glb glbVar = c.b;
        pkb pkbVar = pkb.Audiobook;
        String str2 = zilVar.b;
        okb okbVar = (okb) xdhVar.a;
        String a = c.d().a();
        String str3 = c.d;
        int i = ajlVar.a((vil) xdhVar.c, c.d()).a;
        nmbVar.getClass();
        ylbVar.getClass();
        zlbVar.getClass();
        ilbVar.getClass();
        glbVar.getClass();
        str2.getClass();
        a.getClass();
        okbVar.getClass();
        str3.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("queue_source", ylbVar.a);
        linkedHashMap.put("queue_type", zlbVar.a);
        linkedHashMap.put("target_device", hmbVar.a);
        linkedHashMap.put("hash", G);
        linkedHashMap.put("page_id", "player_screen");
        linkedHashMap.put("page_style", ilbVar.a);
        linkedHashMap.put("page_placement", glbVar.a);
        linkedHashMap.put("skeleton_id", str);
        linkedHashMap.put("main_object_type", "track");
        linkedHashMap.put("main_object_id", str2);
        linkedHashMap.put("page_type", "object");
        linkedHashMap.put("track_id", str2);
        linkedHashMap.put("view_uuid", a);
        linkedHashMap.put(CommonUrlParts.DEVICE_TYPE, okbVar.a);
        eta.m(i, "loaded_view_uuid", str3, "player_parameters", linkedHashMap);
        linkedHashMap.put("_meta", nmb.u(1));
        nmbVar.C("Player.Closed", linkedHashMap);
        pkl c2 = c();
        c2.getClass();
        pkl a2 = pkl.a(c2, ajl.d, "", "");
        xdr xdrVar = this.d;
        xdrVar.getClass();
        xdrVar.m(null, a2);
    }

    public final pkl c() {
        return (pkl) this.d.getValue();
    }

    public final void d(ajl ajlVar) {
        ajlVar.getClass();
        if (Intrinsics.d(c().c, ajlVar)) {
            return;
        }
        f(ajlVar);
        pkl c = c();
        String G = this.b.G();
        c.getClass();
        G.getClass();
        ajl ajlVar2 = c.c;
        xdh xdhVar = this.c;
        nmb nmbVar = (nmb) xdhVar.d;
        zil zilVar = ajlVar2.a;
        ylb ylbVar = zilVar.d;
        zlb zlbVar = zilVar.c;
        hmb hmbVar = zilVar.e;
        wjb wjbVar = wjb.AboutArtistScreen;
        ilb ilbVar = c.f;
        glb glbVar = c.b;
        pkb pkbVar = pkb.Audiobook;
        String str = zilVar.b;
        okb okbVar = (okb) xdhVar.a;
        String str2 = ajlVar2.b;
        String a = c.d().a();
        String str3 = c.d;
        int i = ajlVar2.a((vil) xdhVar.c, c.d()).a;
        ((wil) xdhVar.b).getClass();
        int a2 = wil.a();
        nmbVar.getClass();
        ylbVar.getClass();
        zlbVar.getClass();
        ilbVar.getClass();
        glbVar.getClass();
        str.getClass();
        a.getClass();
        okbVar.getClass();
        str3.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("queue_source", ylbVar.a);
        linkedHashMap.put("queue_type", zlbVar.a);
        linkedHashMap.put("target_device", hmbVar.a);
        linkedHashMap.put("hash", G);
        linkedHashMap.put("page_id", "player_screen");
        linkedHashMap.put("page_style", ilbVar.a);
        linkedHashMap.put("page_placement", glbVar.a);
        linkedHashMap.put("skeleton_id", str2);
        linkedHashMap.put("main_object_type", "track");
        linkedHashMap.put("main_object_id", str);
        linkedHashMap.put("page_type", "object");
        linkedHashMap.put("track_id", str);
        linkedHashMap.put("view_uuid", a);
        linkedHashMap.put(CommonUrlParts.DEVICE_TYPE, okbVar.a);
        eta.m(i, "loaded_view_uuid", str3, "player_parameters", linkedHashMap);
        linkedHashMap.put("is_loaded_visible", String.valueOf(true));
        linkedHashMap.put("sleep_timer_time", String.valueOf(a2));
        linkedHashMap.put("_meta", nmb.u(1));
        nmbVar.C("Player.Loaded", linkedHashMap);
    }

    public final void e(ajl ajlVar) {
        ajlVar.getClass();
        if (!Intrinsics.d(c().c, ajlVar)) {
            f(ajlVar);
        }
        pkl c = c();
        String G = this.b.G();
        c.getClass();
        G.getClass();
        ajl ajlVar2 = c.c;
        xdh xdhVar = this.c;
        nmb nmbVar = (nmb) xdhVar.d;
        zil zilVar = ajlVar2.a;
        ylb ylbVar = zilVar.d;
        zlb zlbVar = zilVar.c;
        hmb hmbVar = zilVar.e;
        String str = ajlVar2.b;
        wjb wjbVar = wjb.AboutArtistScreen;
        ilb ilbVar = c.f;
        glb glbVar = c.b;
        pkb pkbVar = pkb.Audiobook;
        String str2 = zilVar.b;
        okb okbVar = (okb) xdhVar.a;
        String a = c.d().a();
        String str3 = c.d;
        int i = ajlVar2.a((vil) xdhVar.c, c.d()).a;
        ((wil) xdhVar.b).getClass();
        int a2 = wil.a();
        nmbVar.getClass();
        ylbVar.getClass();
        zlbVar.getClass();
        ilbVar.getClass();
        glbVar.getClass();
        str2.getClass();
        a.getClass();
        okbVar.getClass();
        str3.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("queue_source", ylbVar.a);
        linkedHashMap.put("queue_type", zlbVar.a);
        linkedHashMap.put("target_device", hmbVar.a);
        linkedHashMap.put("hash", G);
        linkedHashMap.put("page_id", "player_screen");
        linkedHashMap.put("page_style", ilbVar.a);
        linkedHashMap.put("page_placement", glbVar.a);
        linkedHashMap.put("skeleton_id", str);
        linkedHashMap.put("main_object_type", "track");
        linkedHashMap.put("main_object_id", str2);
        linkedHashMap.put("page_type", "object");
        linkedHashMap.put("track_id", str2);
        linkedHashMap.put("view_uuid", a);
        linkedHashMap.put(CommonUrlParts.DEVICE_TYPE, okbVar.a);
        eta.m(i, "loaded_view_uuid", str3, "player_parameters", linkedHashMap);
        linkedHashMap.put("is_loaded_visible", String.valueOf(true));
        linkedHashMap.put("sleep_timer_time", String.valueOf(a2));
        linkedHashMap.put("_meta", nmb.u(1));
        nmbVar.C("Player.Opened", linkedHashMap);
    }

    public final void f(ajl ajlVar) {
        pkl c = c();
        c.getClass();
        ajlVar.getClass();
        String e = eta.e();
        String str = c.e;
        if (StringsKt.U(str)) {
            str = eta.e();
        }
        pkl a = pkl.a(c, ajlVar, e, str);
        xdr xdrVar = this.d;
        xdrVar.getClass();
        xdrVar.m(null, a);
    }
}
