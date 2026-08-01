package com.anythink.core.common.m.d;

import android.text.TextUtils;
import com.anythink.core.common.d.j;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.aq;
import com.anythink.core.common.v.k;
import com.anythink.core.common.v.m;
import com.anythink.core.common.v.o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a extends d {

    /* renamed from: a, reason: collision with root package name */
    List<String> f14570a;

    /* renamed from: b, reason: collision with root package name */
    int f14571b;

    /* renamed from: c, reason: collision with root package name */
    boolean f14572c;

    /* renamed from: l, reason: collision with root package name */
    private final String f14573l = "a";

    public a(List<String> list) {
        this.f14570a = list;
        this.f14571b = list.size();
    }

    private String j() {
        JSONObject h9 = h();
        JSONObject i = i();
        if (h9 != null) {
            try {
                h9.put("app_id", t.b().p());
                h9.put("nw_ver", m.g());
                JSONArray jSONArray = new JSONArray();
                List<String> list = this.f14570a;
                if (list != null && list.size() > 0) {
                    for (String str : this.f14570a) {
                        if (!TextUtils.isEmpty(str)) {
                            jSONArray.put(new JSONObject(str));
                        }
                    }
                }
                h9.put("data", jSONArray);
            } catch (Exception unused) {
            }
        }
        if (i != null) {
            try {
                i.put(com.anythink.core.common.m.e.f14627S, this.f14600j);
                i.put(com.anythink.core.common.m.e.f14629U, this.f14601k);
            } catch (Exception unused2) {
            }
        }
        HashMap hashMap = new HashMap();
        String a9 = k.a(h9.toString());
        String a10 = k.a(i.toString());
        hashMap.put(com.anythink.core.common.m.e.f14624P, j.e.f12436a);
        hashMap.put("p", a9);
        hashMap.put(com.anythink.core.common.m.e.f14631W, a10);
        ArrayList arrayList = new ArrayList(hashMap.size());
        arrayList.addAll(hashMap.keySet());
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(str2);
            sb.append("=");
            sb.append(hashMap.get(str2));
        }
        hashMap.put("sign", o.c(t.b().q() + sb.toString()));
        return new JSONObject(hashMap).toString();
    }

    public final void a() {
        this.f14572c = true;
    }

    public final int b() {
        return this.f14571b;
    }

    @Override // com.anythink.core.common.m.d.d
    public final int c() {
        return 2;
    }

    @Override // com.anythink.core.common.m.d.d
    public final int d() {
        return 3;
    }

    @Override // com.anythink.core.common.m.d.d
    public final byte[] e() {
        return d.a(j());
    }

    @Override // com.anythink.core.common.m.d.d
    public final boolean f() {
        return false;
    }

    @Override // com.anythink.core.common.m.d.d
    public final int g() {
        return 4;
    }

    @Override // com.anythink.core.common.m.d.d
    public final void a(String str, String str2, String str3, int i) {
        if (this.f14572c) {
            com.anythink.core.common.t.a().a(3, "", "", j(), aq.a(1001));
        }
    }
}
