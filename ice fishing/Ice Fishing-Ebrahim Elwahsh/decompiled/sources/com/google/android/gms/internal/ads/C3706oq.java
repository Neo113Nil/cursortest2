package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import q2.C4927z0;

/* renamed from: com.google.android.gms.internal.ads.oq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3706oq {

    /* renamed from: c, reason: collision with root package name */
    public final String f33223c;

    /* renamed from: d, reason: collision with root package name */
    public Wt f33224d = null;

    /* renamed from: e, reason: collision with root package name */
    public Ut f33225e = null;

    /* renamed from: f, reason: collision with root package name */
    public q2.i1 f33226f = null;

    /* renamed from: b, reason: collision with root package name */
    public final Map f33222b = Collections.synchronizedMap(new HashMap());

    /* renamed from: a, reason: collision with root package name */
    public final List f33221a = Collections.synchronizedList(new ArrayList());

    public C3706oq(String str) {
        this.f33223c = str;
    }

    public static String d(Ut ut) {
        return ((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31811v4)).booleanValue() ? ut.f28168p0 : ut.f28181w;
    }

    public final void a(Ut ut) {
        String d2 = d(ut);
        Map map = this.f33222b;
        Object obj = map.get(d2);
        List list = this.f33221a;
        int indexOf = list.indexOf(obj);
        if (indexOf < 0 || indexOf >= map.size()) {
            indexOf = list.indexOf(this.f33226f);
        }
        if (indexOf < 0 || indexOf >= map.size()) {
            return;
        }
        this.f33226f = (q2.i1) list.get(indexOf);
        while (true) {
            indexOf++;
            if (indexOf >= list.size()) {
                return;
            }
            q2.i1 i1Var = (q2.i1) list.get(indexOf);
            i1Var.f40080u = 0L;
            i1Var.f40081v = null;
        }
    }

    public final synchronized void b(Ut ut, int i) {
        Map map = this.f33222b;
        String d2 = d(ut);
        if (map.containsKey(d2)) {
            return;
        }
        Bundle bundle = new Bundle();
        JSONObject jSONObject = ut.f28179v;
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                bundle.putString(next, jSONObject.getString(next));
            } catch (JSONException unused) {
            }
        }
        q2.i1 i1Var = new q2.i1(ut.f28114E, 0L, null, bundle, ut.f28116F, ut.f28118G, ut.f28120H, ut.f28122I);
        try {
            this.f33221a.add(i, i1Var);
        } catch (IndexOutOfBoundsException e6) {
            p2.j.f39798C.f39808h.d("AdapterResponseInfoCollector.addAdapterResponseInfoEntryAtLocation", e6);
        }
        this.f33222b.put(d2, i1Var);
    }

    public final void c(Ut ut, long j9, C4927z0 c4927z0, boolean z8) {
        String d2 = d(ut);
        Map map = this.f33222b;
        if (map.containsKey(d2)) {
            if (this.f33225e == null) {
                this.f33225e = ut;
            }
            q2.i1 i1Var = (q2.i1) map.get(d2);
            i1Var.f40080u = j9;
            i1Var.f40081v = c4927z0;
            if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.G7)).booleanValue() && z8) {
                this.f33226f = i1Var;
            }
        }
    }
}
