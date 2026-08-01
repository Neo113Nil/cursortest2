package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import com.anythink.core.c.b.e;
import com.icefishing.icefishingbigwin.C5275R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p2.C4835j;

/* renamed from: com.google.android.gms.internal.ads.Xm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class CallableC2861Xm implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28567a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28568b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28569c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f28570d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f28571e;

    public /* synthetic */ CallableC2861Xm(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f28567a = i;
        this.f28568b = obj;
        this.f28569c = obj2;
        this.f28570d = obj3;
        this.f28571e = obj4;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundle;
        Bundle bundle2;
        switch (this.f28567a) {
            case 0:
                C2570Gf c2570Gf = (C2570Gf) this.f28568b;
                Yt yt = (Yt) this.f28569c;
                St st = (St) this.f28570d;
                JSONObject jSONObject = (JSONObject) this.f28571e;
                if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32108Q2)).booleanValue()) {
                    com.anythink.basead.exoplayer.f.f.s(C4835j.f39733C.f39745k, (C2993bo) c2570Gf.f25045x, "native-assets-loading-basic-start");
                }
                C4012um c4012um = new C4012um();
                int optInt = jSONObject.optInt("template_id", -1);
                synchronized (c4012um) {
                    c4012um.f34564a = optInt;
                }
                String optString = jSONObject.optString("custom_template_id");
                synchronized (c4012um) {
                    c4012um.f34583u = optString;
                }
                JSONObject optJSONObject = jSONObject.optJSONObject("omid_settings");
                String optString2 = optJSONObject != null ? optJSONObject.optString("omid_partner_name") : null;
                synchronized (c4012um) {
                    c4012um.f34587y = optString2;
                }
                C3052cu c3052cu = (C3052cu) yt.f28753a.f31863u;
                if (!c3052cu.f29627h.contains(Integer.toString(c4012um.q()))) {
                    int q8 = c4012um.q();
                    throw new Zq(1, D.y.m(q8, "Invalid template ID: ", new StringBuilder(String.valueOf(q8).length() + 21)));
                }
                if (c4012um.q() == 3) {
                    if (c4012um.g() == null) {
                        throw new Zq(1, "No custom template id for custom template ad response.");
                    }
                    if (!c3052cu.i.contains(c4012um.g())) {
                        throw new Zq(1, "Unexpected custom template id in the response.");
                    }
                }
                double optDouble = jSONObject.optDouble(com.anythink.expressad.foundation.d.d.ae, -1.0d);
                synchronized (c4012um) {
                    c4012um.f34580r = optDouble;
                }
                String optString3 = jSONObject.optString("headline", null);
                if (st.f27593M) {
                    C4835j c4835j = C4835j.f39733C;
                    u2.D d2 = c4835j.f39738c;
                    Resources c9 = c4835j.f39743h.c();
                    String string = c9 != null ? c9.getString(C5275R.string.s7) : "Test Ad";
                    optString3 = D.y.s(new StringBuilder(String.valueOf(string).length() + 3 + String.valueOf(optString3).length()), string, " : ", optString3);
                }
                c4012um.o("headline", optString3);
                c4012um.o("body", jSONObject.optString("body", null));
                c4012um.o("call_to_action", jSONObject.optString("call_to_action", null));
                c4012um.o("store", jSONObject.optString("store", null));
                c4012um.o(e.a.f12068h, jSONObject.optString(e.a.f12068h, null));
                c4012um.o("advertiser", jSONObject.optString("advertiser", null));
                return c4012um;
            case 1:
                if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.J2)).booleanValue() && (bundle = ((C2739Qe) this.f28568b).f27040F) != null) {
                    C4835j.f39733C.f39745k.getClass();
                    bundle.putLong("http-response-ready", System.currentTimeMillis());
                }
                return new C2546Ep((C2614Ip) ((Iu) this.f28569c).f25615v.get(), (JSONObject) ((Iu) this.f28570d).f25615v.get(), (C2756Re) ((Iu) this.f28571e).f25615v.get());
            case 2:
                Iterator it = ((ArrayList) this.f28568b).iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    Object obj = this.f28569c;
                    if (!hasNext) {
                        if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.J2)).booleanValue() && (bundle2 = (Bundle) this.f28570d) != null) {
                            C4835j.f39733C.f39745k.getClass();
                            long currentTimeMillis = System.currentTimeMillis();
                            boolean z3 = obj instanceof Bundle;
                            Bundle bundle3 = (Bundle) this.f28571e;
                            if (z3) {
                                bundle2.putLong("client-signals-end", currentTimeMillis);
                                bundle2.putBundle("client_sig_latency_key", bundle3);
                            } else {
                                bundle2.putLong("gms-signals-end", currentTimeMillis);
                                bundle2.putBundle("gms_sig_latency_key", bundle3);
                            }
                        }
                        return obj;
                    }
                    Os os = (Os) ((N3.a) it.next()).get();
                    if (os != null) {
                        os.a(obj);
                    }
                }
                break;
            case 3:
                Lz lz = (Lz) this.f28568b;
                Xw b9 = lz.f26197a.b();
                C3983uA c3983uA = lz.f26200d;
                if (b9 == null) {
                    c3983uA.b(15004);
                    return "";
                }
                String f3 = b9.f((Context) this.f28569c, (View) this.f28570d, (Activity) this.f28571e);
                if (f3 != null) {
                    return f3;
                }
                c3983uA.b(15007);
                return "";
            case 4:
                Lz lz2 = (Lz) this.f28568b;
                Xw b10 = lz2.f26197a.b();
                C3983uA c3983uA2 = lz2.f26200d;
                if (b10 == null) {
                    c3983uA2.b(15004);
                    return "";
                }
                String h9 = b10.h((Context) this.f28569c, (String) this.f28570d, (View) this.f28571e, null);
                if (h9 != null) {
                    return h9;
                }
                c3983uA2.b(15008);
                return "";
            case 5:
                Pz pz = (Pz) this.f28568b;
                pz.getClass();
                HashMap hashMap = new HashMap();
                pz.f26901f.f(20106, new RunnableC2823Vg(pz, hashMap, (Context) this.f28569c, (View) this.f28570d, (Activity) this.f28571e));
                String j6 = pz.j(hashMap);
                hashMap.clear();
                return j6;
            case 6:
                Pz pz2 = (Pz) this.f28568b;
                pz2.getClass();
                HashMap hashMap2 = new HashMap();
                pz2.f26901f.f(20106, new RunnableC2823Vg(pz2, hashMap2, (Context) this.f28569c, (View) this.f28571e, (String) this.f28570d));
                String j9 = pz2.j(hashMap2);
                hashMap2.clear();
                return j9;
            default:
                ((C3122eA) this.f28568b).f29892a.a((Ky) this.f28569c, (byte[]) this.f28570d, (byte[]) this.f28571e);
                return null;
        }
    }
}
