package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import com.anythink.core.c.b.e;
import com.icefishing.icefishingliveapp.C5284R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Vm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class CallableC2831Vm implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28298a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28299b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28300c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f28301d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f28302e;

    public /* synthetic */ CallableC2831Vm(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f28298a = i;
        this.f28299b = obj;
        this.f28300c = obj2;
        this.f28301d = obj3;
        this.f28302e = obj4;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundle;
        Bundle bundle2;
        switch (this.f28298a) {
            case 0:
                C2518Df c2518Df = (C2518Df) this.f28299b;
                C2953au c2953au = (C2953au) this.f28300c;
                Ut ut = (Ut) this.f28301d;
                JSONObject jSONObject = (JSONObject) this.f28302e;
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31529Q2)).booleanValue()) {
                    com.anythink.basead.b.c.i.u(p2.j.f39798C.f39810k, (C3002bo) c2518Df.f24456x, "native-assets-loading-basic-start");
                }
                C3917sm c3917sm = new C3917sm();
                int optInt = jSONObject.optInt("template_id", -1);
                synchronized (c3917sm) {
                    c3917sm.f34275a = optInt;
                }
                String optString = jSONObject.optString("custom_template_id");
                synchronized (c3917sm) {
                    c3917sm.f34294u = optString;
                }
                JSONObject optJSONObject = jSONObject.optJSONObject("omid_settings");
                String optString2 = optJSONObject != null ? optJSONObject.optString("omid_partner_name") : null;
                synchronized (c3917sm) {
                    c3917sm.f34298y = optString2;
                }
                C3226fu c3226fu = (C3226fu) c2953au.f29348a.f26393u;
                if (!c3226fu.f30905h.contains(Integer.toString(c3917sm.q()))) {
                    int q6 = c3917sm.q();
                    throw new C3059cr(1, D.y.j(q6, "Invalid template ID: ", new StringBuilder(String.valueOf(q6).length() + 21)));
                }
                if (c3917sm.q() == 3) {
                    if (c3917sm.g() == null) {
                        throw new C3059cr(1, "No custom template id for custom template ad response.");
                    }
                    if (!c3226fu.i.contains(c3917sm.g())) {
                        throw new C3059cr(1, "Unexpected custom template id in the response.");
                    }
                }
                double optDouble = jSONObject.optDouble(com.anythink.expressad.foundation.d.d.ae, -1.0d);
                synchronized (c3917sm) {
                    c3917sm.f34291r = optDouble;
                }
                String optString3 = jSONObject.optString("headline", null);
                if (ut.f28126M) {
                    p2.j jVar = p2.j.f39798C;
                    t2.G g9 = jVar.f39803c;
                    Resources c4 = jVar.f39808h.c();
                    String string = c4 != null ? c4.getString(C5284R.string.s7) : "Test Ad";
                    optString3 = D.y.o(new StringBuilder(String.valueOf(string).length() + 3 + String.valueOf(optString3).length()), string, " : ", optString3);
                }
                c3917sm.o("headline", optString3);
                c3917sm.o("body", jSONObject.optString("body", null));
                c3917sm.o("call_to_action", jSONObject.optString("call_to_action", null));
                c3917sm.o("store", jSONObject.optString("store", null));
                c3917sm.o(e.a.f12225h, jSONObject.optString(e.a.f12225h, null));
                c3917sm.o("advertiser", jSONObject.optString("advertiser", null));
                return c3917sm;
            case 1:
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31467J2)).booleanValue() && (bundle = ((C2687Ne) this.f28299b).f26578F) != null) {
                    p2.j.f39798C.f39810k.getClass();
                    bundle.putLong("http-response-ready", System.currentTimeMillis());
                }
                return new C2596Hp((C2664Lp) ((Ku) this.f28300c).f26063v.get(), (JSONObject) ((Ku) this.f28301d).f26063v.get(), (C2704Oe) ((Ku) this.f28302e).f26063v.get());
            case 2:
                Iterator it = ((ArrayList) this.f28299b).iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    Object obj = this.f28300c;
                    if (!hasNext) {
                        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31467J2)).booleanValue() && (bundle2 = (Bundle) this.f28301d) != null) {
                            p2.j.f39798C.f39810k.getClass();
                            long currentTimeMillis = System.currentTimeMillis();
                            boolean z8 = obj instanceof Bundle;
                            Bundle bundle3 = (Bundle) this.f28302e;
                            if (z8) {
                                bundle2.putLong("client-signals-end", currentTimeMillis);
                                bundle2.putBundle("client_sig_latency_key", bundle3);
                            } else {
                                bundle2.putLong("gms-signals-end", currentTimeMillis);
                                bundle2.putBundle("gms_sig_latency_key", bundle3);
                            }
                        }
                        return obj;
                    }
                    Qs qs = (Qs) ((J3.a) it.next()).get();
                    if (qs != null) {
                        qs.b(obj);
                    }
                }
                break;
            case 3:
                Nz nz = (Nz) this.f28299b;
                Zw b9 = nz.f26628a.b();
                C4158xA c4158xA = nz.f26631d;
                if (b9 == null) {
                    c4158xA.b(15004);
                    return "";
                }
                String f6 = b9.f((Context) this.f28300c, (View) this.f28301d, (Activity) this.f28302e);
                if (f6 != null) {
                    return f6;
                }
                c4158xA.b(15007);
                return "";
            case 4:
                Nz nz2 = (Nz) this.f28299b;
                Zw b10 = nz2.f26628a.b();
                C4158xA c4158xA2 = nz2.f26631d;
                if (b10 == null) {
                    c4158xA2.b(15004);
                    return "";
                }
                String h9 = b10.h((Context) this.f28300c, (String) this.f28301d, (View) this.f28302e, null);
                if (h9 != null) {
                    return h9;
                }
                c4158xA2.b(15008);
                return "";
            case 5:
                Sz sz = (Sz) this.f28299b;
                sz.getClass();
                HashMap hashMap = new HashMap();
                sz.f27668f.f(20106, new RunnableC2774Sg(sz, hashMap, (Context) this.f28300c, (View) this.f28301d, (Activity) this.f28302e));
                String j9 = sz.j(hashMap);
                hashMap.clear();
                return j9;
            case 6:
                Sz sz2 = (Sz) this.f28299b;
                sz2.getClass();
                HashMap hashMap2 = new HashMap();
                sz2.f27668f.f(20106, new RunnableC2774Sg(sz2, hashMap2, (Context) this.f28300c, (View) this.f28302e, (String) this.f28301d));
                String j10 = sz2.j(hashMap2);
                hashMap2.clear();
                return j10;
            default:
                ((C3297hA) this.f28299b).f31206a.a((My) this.f28300c, (byte[]) this.f28301d, (byte[]) this.f28302e);
                return null;
        }
    }
}
