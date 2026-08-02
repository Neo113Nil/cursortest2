package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zhk {
    public final bjk a;
    public final lik b;
    public final jyr c;
    public wkj d;

    public zhk(bjk bjkVar, lik likVar, jyr jyrVar) {
        likVar.getClass();
        this.a = bjkVar;
        this.b = likVar;
        this.c = jyrVar;
    }

    public final void a() {
        List list;
        List list2;
        nmb nmbVar = (nmb) this.c.getValue();
        nlb G = dag.G(this.a);
        lik likVar = this.b;
        gkb F = dag.F(likVar.a);
        String str = likVar.b;
        if (str == null) {
            str = "";
        }
        wkj wkjVar = this.d;
        String q = (wkjVar == null || (list2 = wkjVar.a) == null) ? null : dag.q(list2);
        if (q == null) {
            q = "";
        }
        wkj wkjVar2 = this.d;
        String q2 = (wkjVar2 == null || (list = wkjVar2.b) == null) ? null : dag.q(list);
        if (q2 == null) {
            q2 = "";
        }
        wkj wkjVar3 = this.d;
        String q3 = wkjVar3 != null ? dag.q(wkjVar3.c) : null;
        String str2 = q3 != null ? q3 : "";
        hkb[] hkbVarArr = hkb.a;
        klb[] klbVarArr = klb.a;
        nmbVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("paywall_type", G.a);
        linkedHashMap.put("clientPlace", F.a);
        linkedHashMap.put("contentId", str);
        linkedHashMap.put("offersBatchId", q);
        linkedHashMap.put("offersPositionIds", q2);
        linkedHashMap.put("billingProductIds", str2);
        linkedHashMap.put("clientSource", "music");
        linkedHashMap.put("clientSubSource", "music_mobile_app");
        dfi.p(2, "paymentIntegration", "payment_sdk", "_meta", linkedHashMap);
        nmbVar.C("PayWallScreen.Closed", linkedHashMap);
    }

    public final void b(mkj mkjVar) {
        List list;
        List list2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (mkjVar != null) {
            Iterator it = mkjVar.b.entrySet().iterator();
            while (it.hasNext()) {
                jkj jkjVar = ((bve) ((Map.Entry) it.next()).getValue()).p;
                arrayList.add(jkjVar.a);
                arrayList2.add(jkjVar.b);
                arrayList3.addAll(jkjVar.c);
            }
        }
        this.d = new wkj(arrayList, arrayList2, arrayList3);
        nmb nmbVar = (nmb) this.c.getValue();
        nlb G = dag.G(this.a);
        lik likVar = this.b;
        gkb F = dag.F(likVar.a);
        String str = likVar.b;
        if (str == null) {
            str = "";
        }
        wkj wkjVar = this.d;
        String q = (wkjVar == null || (list2 = wkjVar.a) == null) ? null : dag.q(list2);
        if (q == null) {
            q = "";
        }
        wkj wkjVar2 = this.d;
        String q2 = (wkjVar2 == null || (list = wkjVar2.b) == null) ? null : dag.q(list);
        if (q2 == null) {
            q2 = "";
        }
        wkj wkjVar3 = this.d;
        String q3 = wkjVar3 != null ? dag.q(wkjVar3.c) : null;
        String str2 = q3 != null ? q3 : "";
        hkb[] hkbVarArr = hkb.a;
        klb[] klbVarArr = klb.a;
        nmbVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("paywall_type", G.a);
        linkedHashMap.put("clientPlace", F.a);
        linkedHashMap.put("contentId", str);
        linkedHashMap.put("offersBatchId", q);
        linkedHashMap.put("offersPositionIds", q2);
        linkedHashMap.put("billingProductIds", str2);
        linkedHashMap.put("clientSource", "music");
        linkedHashMap.put("clientSubSource", "music_mobile_app");
        dfi.p(2, "paymentIntegration", "payment_sdk", "_meta", linkedHashMap);
        nmbVar.C("PayWallScreen.Loaded", linkedHashMap);
    }

    public final void c() {
        mlb mlbVar;
        List list;
        List list2;
        nmb nmbVar = (nmb) this.c.getValue();
        nlb G = dag.G(this.a);
        lik likVar = this.b;
        gkb F = dag.F(likVar.a);
        String str = likVar.b;
        if (str == null) {
            str = "";
        }
        wkj wkjVar = this.d;
        String q = (wkjVar == null || (list2 = wkjVar.a) == null) ? null : dag.q(list2);
        if (q == null) {
            q = "";
        }
        wkj wkjVar2 = this.d;
        String q2 = (wkjVar2 == null || (list = wkjVar2.b) == null) ? null : dag.q(list);
        if (q2 == null) {
            q2 = "";
        }
        wkj wkjVar3 = this.d;
        String q3 = wkjVar3 != null ? dag.q(wkjVar3.c) : null;
        String str2 = q3 != null ? q3 : "";
        hkb[] hkbVarArr = hkb.a;
        klb[] klbVarArr = klb.a;
        vik vikVar = likVar.a;
        vikVar.getClass();
        switch (vikVar.ordinal()) {
            case 0:
                mlbVar = mlb.AlbumScreen;
                break;
            case 1:
                mlbVar = mlb.ArtistScreen;
                break;
            case 2:
                mlbVar = mlb.PlaylistScreen;
                break;
            case 3:
                mlbVar = mlb.Unknown;
                break;
            case 4:
                mlbVar = mlb.MainScreen;
                break;
            case 5:
                mlbVar = mlb.PodcastLandingScreen;
                break;
            case 6:
                mlbVar = mlb.KidsLandingScreen;
                break;
            case 7:
                mlbVar = mlb.Unknown;
                break;
            case 8:
                mlbVar = mlb.DebugScreen;
                break;
            case 9:
                mlbVar = mlb.Unknown;
                break;
            case 10:
                mlbVar = mlb.Unknown;
                break;
            default:
                b6e.s();
                return;
        }
        nmbVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("paywall_type", G.a);
        linkedHashMap.put("clientPlace", F.a);
        linkedHashMap.put("contentId", str);
        linkedHashMap.put("offersBatchId", q);
        linkedHashMap.put("offersPositionIds", q2);
        linkedHashMap.put("billingProductIds", str2);
        linkedHashMap.put("clientSource", "music");
        linkedHashMap.put("clientSubSource", "music_mobile_app");
        linkedHashMap.put("paymentIntegration", "payment_sdk");
        linkedHashMap.put("to", mlbVar.a);
        linkedHashMap.put("from", "paywall_screen");
        dfi.p(1, "entity_type", "button", "_meta", linkedHashMap);
        nmbVar.C("PayWallScreen.Navigated", linkedHashMap);
    }

    public final void d() {
        nmb nmbVar = (nmb) this.c.getValue();
        nlb G = dag.G(this.a);
        lik likVar = this.b;
        gkb F = dag.F(likVar.a);
        String str = likVar.b;
        if (str == null) {
            str = "";
        }
        nmbVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("paywall_type", G.a);
        linkedHashMap.put("clientPlace", F.a);
        dfi.p(1, "contentId", str, "_meta", linkedHashMap);
        nmbVar.C("PayWallScreen.Opened", linkedHashMap);
    }

    public final void e() {
        List list;
        List list2;
        nmb nmbVar = (nmb) this.c.getValue();
        nlb G = dag.G(this.a);
        lik likVar = this.b;
        gkb F = dag.F(likVar.a);
        String str = likVar.b;
        if (str == null) {
            str = "";
        }
        wkj wkjVar = this.d;
        String q = (wkjVar == null || (list2 = wkjVar.a) == null) ? null : dag.q(list2);
        if (q == null) {
            q = "";
        }
        wkj wkjVar2 = this.d;
        String q2 = (wkjVar2 == null || (list = wkjVar2.b) == null) ? null : dag.q(list);
        if (q2 == null) {
            q2 = "";
        }
        wkj wkjVar3 = this.d;
        String q3 = wkjVar3 != null ? dag.q(wkjVar3.c) : null;
        String str2 = q3 != null ? q3 : "";
        hkb[] hkbVarArr = hkb.a;
        klb[] klbVarArr = klb.a;
        nmbVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("paywall_type", G.a);
        linkedHashMap.put("clientPlace", F.a);
        linkedHashMap.put("contentId", str);
        linkedHashMap.put("offersBatchId", q);
        linkedHashMap.put("offersPositionIds", q2);
        linkedHashMap.put("billingProductIds", str2);
        linkedHashMap.put("clientSource", "music");
        linkedHashMap.put("clientSubSource", "music_mobile_app");
        dfi.p(2, "paymentIntegration", "payment_sdk", "_meta", linkedHashMap);
        nmbVar.C("PayWallScreen.Showed", linkedHashMap);
    }
}
