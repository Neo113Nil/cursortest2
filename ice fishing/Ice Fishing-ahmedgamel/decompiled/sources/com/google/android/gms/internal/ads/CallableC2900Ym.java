package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import com.IceFishing.LiveIceFishing.C5248R;
import com.anythink.core.c.b.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import r2.C4906k;

/* renamed from: com.google.android.gms.internal.ads.Ym, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class CallableC2900Ym implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29512a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f29513b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f29514c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f29515d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f29516e;

    public /* synthetic */ CallableC2900Ym(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f29512a = i;
        this.f29513b = obj;
        this.f29514c = obj2;
        this.f29515d = obj3;
        this.f29516e = obj4;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundle;
        Bundle bundle2;
        switch (this.f29512a) {
            case 0:
                C2590Gf c2590Gf = (C2590Gf) this.f29513b;
                Yt yt = (Yt) this.f29514c;
                St st = (St) this.f29515d;
                JSONObject jSONObject = (JSONObject) this.f29516e;
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32888Q2)).booleanValue()) {
                    com.IceFishing.LiveIceFishing.k.v(C4906k.f40186C.f40198k, (C3069co) c2590Gf.f25833x, "native-assets-loading-basic-start");
                }
                C4089vm c4089vm = new C4089vm();
                int optInt = jSONObject.optInt("template_id", -1);
                synchronized (c4089vm) {
                    c4089vm.f35485a = optInt;
                }
                String optString = jSONObject.optString("custom_template_id");
                synchronized (c4089vm) {
                    c4089vm.f35504u = optString;
                }
                JSONObject optJSONObject = jSONObject.optJSONObject("omid_settings");
                String optString2 = optJSONObject != null ? optJSONObject.optString("omid_partner_name") : null;
                synchronized (c4089vm) {
                    c4089vm.f35508y = optString2;
                }
                C3075cu c3075cu = (C3075cu) yt.f29532a.f32643u;
                if (!c3075cu.f30397h.contains(Integer.toString(c4089vm.q()))) {
                    int q8 = c4089vm.q();
                    throw new Zq(1, D.x.k(q8, "Invalid template ID: ", new StringBuilder(String.valueOf(q8).length() + 21)));
                }
                if (c4089vm.q() == 3) {
                    if (c4089vm.g() == null) {
                        throw new Zq(1, "No custom template id for custom template ad response.");
                    }
                    if (!c3075cu.i.contains(c4089vm.g())) {
                        throw new Zq(1, "Unexpected custom template id in the response.");
                    }
                }
                double optDouble = jSONObject.optDouble(com.anythink.expressad.foundation.d.d.ae, -1.0d);
                synchronized (c4089vm) {
                    c4089vm.f35501r = optDouble;
                }
                String optString3 = jSONObject.optString("headline", null);
                if (st.f28376M) {
                    C4906k c4906k = C4906k.f40186C;
                    w2.D d9 = c4906k.f40191c;
                    Resources c9 = c4906k.f40196h.c();
                    String string = c9 != null ? c9.getString(C5248R.string.s7) : "Test Ad";
                    optString3 = D.x.p(new StringBuilder(String.valueOf(string).length() + 3 + String.valueOf(optString3).length()), string, " : ", optString3);
                }
                c4089vm.o("headline", optString3);
                c4089vm.o("body", jSONObject.optString("body", null));
                c4089vm.o("call_to_action", jSONObject.optString("call_to_action", null));
                c4089vm.o("store", jSONObject.optString("store", null));
                c4089vm.o(e.a.f12854h, jSONObject.optString(e.a.f12854h, null));
                c4089vm.o("advertiser", jSONObject.optString("advertiser", null));
                return c4089vm;
            case 1:
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32828J2)).booleanValue() && (bundle = ((C2759Qe) this.f29513b).f27825F) != null) {
                    C4906k.f40186C.f40198k.getClass();
                    bundle.putLong("http-response-ready", System.currentTimeMillis());
                }
                return new C2566Ep((C2634Ip) ((Iu) this.f29514c).f26368v.get(), (JSONObject) ((Iu) this.f29515d).f26368v.get(), (C2776Re) ((Iu) this.f29516e).f26368v.get());
            case 2:
                Iterator it = ((ArrayList) this.f29513b).iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    Object obj = this.f29514c;
                    if (!hasNext) {
                        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32828J2)).booleanValue() && (bundle2 = (Bundle) this.f29515d) != null) {
                            C4906k.f40186C.f40198k.getClass();
                            long currentTimeMillis = System.currentTimeMillis();
                            boolean z6 = obj instanceof Bundle;
                            Bundle bundle3 = (Bundle) this.f29516e;
                            if (z6) {
                                bundle2.putLong("client-signals-end", currentTimeMillis);
                                bundle2.putBundle("client_sig_latency_key", bundle3);
                            } else {
                                bundle2.putLong("gms-signals-end", currentTimeMillis);
                                bundle2.putBundle("gms_sig_latency_key", bundle3);
                            }
                        }
                        return obj;
                    }
                    Os os = (Os) ((P3.a) it.next()).get();
                    if (os != null) {
                        os.a(obj);
                    }
                }
                break;
            case 3:
                Lz lz = (Lz) this.f29513b;
                Xw b9 = lz.f26988a.b();
                C4006uA c4006uA = lz.f26991d;
                if (b9 == null) {
                    c4006uA.b(15004);
                    return "";
                }
                String f2 = b9.f((Context) this.f29514c, (View) this.f29515d, (Activity) this.f29516e);
                if (f2 != null) {
                    return f2;
                }
                c4006uA.b(15007);
                return "";
            case 4:
                Lz lz2 = (Lz) this.f29513b;
                Xw b10 = lz2.f26988a.b();
                C4006uA c4006uA2 = lz2.f26991d;
                if (b10 == null) {
                    c4006uA2.b(15004);
                    return "";
                }
                String h3 = b10.h((Context) this.f29514c, (String) this.f29515d, (View) this.f29516e, null);
                if (h3 != null) {
                    return h3;
                }
                c4006uA2.b(15008);
                return "";
            case 5:
                Pz pz = (Pz) this.f29513b;
                pz.getClass();
                HashMap hashMap = new HashMap();
                pz.f27688f.f(20106, new RunnableC2846Vg(pz, hashMap, (Context) this.f29514c, (View) this.f29515d, (Activity) this.f29516e));
                String j6 = pz.j(hashMap);
                hashMap.clear();
                return j6;
            case 6:
                Pz pz2 = (Pz) this.f29513b;
                pz2.getClass();
                HashMap hashMap2 = new HashMap();
                pz2.f27688f.f(20106, new RunnableC2846Vg(pz2, hashMap2, (Context) this.f29514c, (View) this.f29516e, (String) this.f29515d));
                String j9 = pz2.j(hashMap2);
                hashMap2.clear();
                return j9;
            default:
                ((C3145eA) this.f29513b).f30684a.a((Ky) this.f29514c, (byte[]) this.f29515d, (byte[]) this.f29516e);
                return null;
        }
    }
}
