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
import r2.C4906k;
import s2.C4969z0;

/* renamed from: com.google.android.gms.internal.ads.mq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3608mq {

    /* renamed from: c, reason: collision with root package name */
    public final String f33371c;

    /* renamed from: d, reason: collision with root package name */
    public Ut f33372d = null;

    /* renamed from: e, reason: collision with root package name */
    public St f33373e = null;

    /* renamed from: f, reason: collision with root package name */
    public s2.h1 f33374f = null;

    /* renamed from: b, reason: collision with root package name */
    public final Map f33370b = Collections.synchronizedMap(new HashMap());

    /* renamed from: a, reason: collision with root package name */
    public final List f33369a = Collections.synchronizedList(new ArrayList());

    public C3608mq(String str) {
        this.f33371c = str;
    }

    public static String d(St st) {
        return ((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33172v4)).booleanValue() ? st.f28418p0 : st.f28431w;
    }

    public final void a(St st) {
        String d9 = d(st);
        Map map = this.f33370b;
        Object obj = map.get(d9);
        List list = this.f33369a;
        int indexOf = list.indexOf(obj);
        if (indexOf < 0 || indexOf >= map.size()) {
            indexOf = list.indexOf(this.f33374f);
        }
        if (indexOf < 0 || indexOf >= map.size()) {
            return;
        }
        this.f33374f = (s2.h1) list.get(indexOf);
        while (true) {
            indexOf++;
            if (indexOf >= list.size()) {
                return;
            }
            s2.h1 h1Var = (s2.h1) list.get(indexOf);
            h1Var.f40464u = 0L;
            h1Var.f40465v = null;
        }
    }

    public final synchronized void b(St st, int i) {
        Map map = this.f33370b;
        String d9 = d(st);
        if (map.containsKey(d9)) {
            return;
        }
        Bundle bundle = new Bundle();
        JSONObject jSONObject = st.f28429v;
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                bundle.putString(next, jSONObject.getString(next));
            } catch (JSONException unused) {
            }
        }
        s2.h1 h1Var = new s2.h1(st.f28364E, 0L, null, bundle, st.f28366F, st.f28368G, st.f28370H, st.f28372I);
        try {
            this.f33369a.add(i, h1Var);
        } catch (IndexOutOfBoundsException e9) {
            C4906k.f40186C.f40196h.d("AdapterResponseInfoCollector.addAdapterResponseInfoEntryAtLocation", e9);
        }
        this.f33370b.put(d9, h1Var);
    }

    public final void c(St st, long j6, C4969z0 c4969z0, boolean z6) {
        String d9 = d(st);
        Map map = this.f33370b;
        if (map.containsKey(d9)) {
            if (this.f33373e == null) {
                this.f33373e = st;
            }
            s2.h1 h1Var = (s2.h1) map.get(d9);
            h1Var.f40464u = j6;
            h1Var.f40465v = c4969z0;
            if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.G7)).booleanValue() && z6) {
                this.f33374f = h1Var;
            }
        }
    }
}
