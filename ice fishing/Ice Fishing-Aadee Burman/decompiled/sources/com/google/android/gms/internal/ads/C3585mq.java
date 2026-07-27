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
import p2.C4835j;
import q2.C4920z0;

/* renamed from: com.google.android.gms.internal.ads.mq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3585mq {

    /* renamed from: c, reason: collision with root package name */
    public final String f32593c;

    /* renamed from: d, reason: collision with root package name */
    public Ut f32594d = null;

    /* renamed from: e, reason: collision with root package name */
    public St f32595e = null;

    /* renamed from: f, reason: collision with root package name */
    public q2.h1 f32596f = null;

    /* renamed from: b, reason: collision with root package name */
    public final Map f32592b = Collections.synchronizedMap(new HashMap());

    /* renamed from: a, reason: collision with root package name */
    public final List f32591a = Collections.synchronizedList(new ArrayList());

    public C3585mq(String str) {
        this.f32593c = str;
    }

    public static String d(St st) {
        return ((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32392v4)).booleanValue() ? st.f27635p0 : st.f27648w;
    }

    public final void a(St st) {
        String d2 = d(st);
        Map map = this.f32592b;
        Object obj = map.get(d2);
        List list = this.f32591a;
        int indexOf = list.indexOf(obj);
        if (indexOf < 0 || indexOf >= map.size()) {
            indexOf = list.indexOf(this.f32596f);
        }
        if (indexOf < 0 || indexOf >= map.size()) {
            return;
        }
        this.f32596f = (q2.h1) list.get(indexOf);
        while (true) {
            indexOf++;
            if (indexOf >= list.size()) {
                return;
            }
            q2.h1 h1Var = (q2.h1) list.get(indexOf);
            h1Var.f40162u = 0L;
            h1Var.f40163v = null;
        }
    }

    public final synchronized void b(St st, int i) {
        Map map = this.f32592b;
        String d2 = d(st);
        if (map.containsKey(d2)) {
            return;
        }
        Bundle bundle = new Bundle();
        JSONObject jSONObject = st.f27646v;
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                bundle.putString(next, jSONObject.getString(next));
            } catch (JSONException unused) {
            }
        }
        q2.h1 h1Var = new q2.h1(st.f27581E, 0L, null, bundle, st.f27583F, st.f27585G, st.f27587H, st.f27589I);
        try {
            this.f32591a.add(i, h1Var);
        } catch (IndexOutOfBoundsException e9) {
            C4835j.f39730C.f39740h.d("AdapterResponseInfoCollector.addAdapterResponseInfoEntryAtLocation", e9);
        }
        this.f32592b.put(d2, h1Var);
    }

    public final void c(St st, long j6, C4920z0 c4920z0, boolean z3) {
        String d2 = d(st);
        Map map = this.f32592b;
        if (map.containsKey(d2)) {
            if (this.f32595e == null) {
                this.f32595e = st;
            }
            q2.h1 h1Var = (q2.h1) map.get(d2);
            h1Var.f40162u = j6;
            h1Var.f40163v = c4920z0;
            if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.G7)).booleanValue() && z3) {
                this.f32596f = h1Var;
            }
        }
    }
}
