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
    List<String> f15356a;

    /* renamed from: b, reason: collision with root package name */
    int f15357b;

    /* renamed from: c, reason: collision with root package name */
    boolean f15358c;

    /* renamed from: l, reason: collision with root package name */
    private final String f15359l = "a";

    public a(List<String> list) {
        this.f15356a = list;
        this.f15357b = list.size();
    }

    private String j() {
        JSONObject h3 = h();
        JSONObject i = i();
        if (h3 != null) {
            try {
                h3.put("app_id", t.b().p());
                h3.put("nw_ver", m.g());
                JSONArray jSONArray = new JSONArray();
                List<String> list = this.f15356a;
                if (list != null && list.size() > 0) {
                    for (String str : this.f15356a) {
                        if (!TextUtils.isEmpty(str)) {
                            jSONArray.put(new JSONObject(str));
                        }
                    }
                }
                h3.put("data", jSONArray);
            } catch (Exception unused) {
            }
        }
        if (i != null) {
            try {
                i.put(com.anythink.core.common.m.e.f15413S, this.f15386j);
                i.put(com.anythink.core.common.m.e.f15415U, this.f15387k);
            } catch (Exception unused2) {
            }
        }
        HashMap hashMap = new HashMap();
        String a9 = k.a(h3.toString());
        String a10 = k.a(i.toString());
        hashMap.put(com.anythink.core.common.m.e.f15410P, j.e.f13222a);
        hashMap.put("p", a9);
        hashMap.put(com.anythink.core.common.m.e.f15417W, a10);
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
        this.f15358c = true;
    }

    public final int b() {
        return this.f15357b;
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
        if (this.f15358c) {
            com.anythink.core.common.t.a().a(3, "", "", j(), aq.a(1001));
        }
    }
}
