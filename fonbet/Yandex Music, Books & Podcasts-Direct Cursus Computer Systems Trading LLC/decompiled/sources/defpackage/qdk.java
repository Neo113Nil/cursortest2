package defpackage;

import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public final class qdk {
    public final lik a;
    public final jyr b;
    public final jyr c;
    public final jyr d;
    public final wkj e;
    public final llb f;

    public qdk(bve bveVar, boolean z, lik likVar, jyr jyrVar, jyr jyrVar2, jyr jyrVar3) {
        bveVar.getClass();
        likVar.getClass();
        this.a = likVar;
        this.b = jyrVar;
        this.c = jyrVar2;
        this.d = jyrVar3;
        jkj jkjVar = bveVar.p;
        this.e = new wkj(t75.c(jkjVar.a), t75.c(jkjVar.b), jkjVar.c);
        this.f = z ? llb.NonUi : llb.Ui;
    }

    public final void a() {
        nmb nmbVar = (nmb) this.b.getValue();
        wkj wkjVar = this.e;
        String q = dag.q(wkjVar.a);
        String q2 = dag.q(wkjVar.b);
        String q3 = dag.q(wkjVar.c);
        hkb[] hkbVarArr = hkb.a;
        klb[] klbVarArr = klb.a;
        lik likVar = this.a;
        gkb F = dag.F(likVar.a);
        String str = likVar.b;
        if (str == null) {
            str = "";
        }
        nmbVar.getClass();
        llb llbVar = this.f;
        llbVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("offersBatchId", q);
        linkedHashMap.put("offersPositionIds", q2);
        linkedHashMap.put("billingProductIds", q3);
        linkedHashMap.put("clientSource", "music");
        linkedHashMap.put("clientSubSource", "music_mobile_app");
        linkedHashMap.put("paymentIntegration", "payment_sdk");
        linkedHashMap.put("clientPlace", F.a);
        linkedHashMap.put("contentId", str);
        dfi.p(2, "paymentType", llbVar.a, "_meta", linkedHashMap);
        nmbVar.C("PayWallScreen.PlusSDK.Canceled", linkedHashMap);
    }

    public final void b(nek nekVar, String str) {
        rlb rlbVar;
        nmb nmbVar = (nmb) this.b.getValue();
        int ordinal = nekVar.ordinal();
        if (ordinal == 0) {
            rlbVar = rlb.Network;
        } else if (ordinal == 1) {
            rlbVar = rlb.Native;
        } else if (ordinal == 2) {
            rlbVar = rlb.Store;
        } else {
            if (ordinal != 3) {
                b6e.s();
                return;
            }
            rlbVar = rlb.Other;
        }
        if (str == null) {
            str = "";
        }
        wkj wkjVar = this.e;
        String q = dag.q(wkjVar.a);
        String q2 = dag.q(wkjVar.b);
        String q3 = dag.q(wkjVar.c);
        hkb[] hkbVarArr = hkb.a;
        klb[] klbVarArr = klb.a;
        lik likVar = this.a;
        gkb F = dag.F(likVar.a);
        String str2 = likVar.b;
        if (str2 == null) {
            str2 = "";
        }
        jyr jyrVar = this.d;
        String a = ((r18) jyrVar.getValue()).a.a();
        String str3 = a != null ? a : "";
        String str4 = ((frt) this.c.getValue()).c().a;
        String E = avf.E(((r18) jyrVar.getValue()).b);
        nmbVar.getClass();
        str4.getClass();
        llb llbVar = this.f;
        llbVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("error_type", rlbVar.a);
        linkedHashMap.put("error_message", str);
        linkedHashMap.put("offersBatchId", q);
        linkedHashMap.put("offersPositionIds", q2);
        linkedHashMap.put("billingProductIds", q3);
        linkedHashMap.put("clientSource", "music");
        linkedHashMap.put("clientSubSource", "music_mobile_app");
        linkedHashMap.put("paymentIntegration", "payment_sdk");
        linkedHashMap.put("clientPlace", F.a);
        linkedHashMap.put("contentId", str2);
        linkedHashMap.put("device_id", str3);
        linkedHashMap.put("puid", str4);
        linkedHashMap.put("device_name", E);
        dfi.p(2, "paymentType", llbVar.a, "_meta", linkedHashMap);
        nmbVar.C("PayWallScreen.PlusSDK.ErrorRaised", linkedHashMap);
    }

    public final void c() {
        nmb nmbVar = (nmb) this.b.getValue();
        wkj wkjVar = this.e;
        String q = dag.q(wkjVar.a);
        String q2 = dag.q(wkjVar.b);
        String q3 = dag.q(wkjVar.c);
        hkb[] hkbVarArr = hkb.a;
        klb[] klbVarArr = klb.a;
        lik likVar = this.a;
        gkb F = dag.F(likVar.a);
        String str = likVar.b;
        if (str == null) {
            str = "";
        }
        nmbVar.getClass();
        llb llbVar = this.f;
        llbVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("offersBatchId", q);
        linkedHashMap.put("offersPositionIds", q2);
        linkedHashMap.put("billingProductIds", q3);
        linkedHashMap.put("clientSource", "music");
        linkedHashMap.put("clientSubSource", "music_mobile_app");
        linkedHashMap.put("paymentIntegration", "payment_sdk");
        linkedHashMap.put("clientPlace", F.a);
        linkedHashMap.put("contentId", str);
        dfi.p(2, "paymentType", llbVar.a, "_meta", linkedHashMap);
        nmbVar.C("PayWallScreen.PlusSDK.Loaded", linkedHashMap);
    }

    public final void d() {
        nmb nmbVar = (nmb) this.b.getValue();
        wkj wkjVar = this.e;
        String q = dag.q(wkjVar.a);
        String q2 = dag.q(wkjVar.b);
        String q3 = dag.q(wkjVar.c);
        hkb[] hkbVarArr = hkb.a;
        klb[] klbVarArr = klb.a;
        lik likVar = this.a;
        gkb F = dag.F(likVar.a);
        String str = likVar.b;
        if (str == null) {
            str = "";
        }
        nmbVar.getClass();
        llb llbVar = this.f;
        llbVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("offersBatchId", q);
        linkedHashMap.put("offersPositionIds", q2);
        linkedHashMap.put("billingProductIds", q3);
        linkedHashMap.put("clientSource", "music");
        linkedHashMap.put("clientSubSource", "music_mobile_app");
        linkedHashMap.put("paymentIntegration", "payment_sdk");
        linkedHashMap.put("clientPlace", F.a);
        linkedHashMap.put("contentId", str);
        dfi.p(2, "paymentType", llbVar.a, "_meta", linkedHashMap);
        nmbVar.C("PayWallScreen.PlusSDK.Succeeded", linkedHashMap);
    }
}
