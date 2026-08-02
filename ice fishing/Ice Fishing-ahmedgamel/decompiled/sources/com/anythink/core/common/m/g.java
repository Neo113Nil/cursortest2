package com.anythink.core.common.m;

import android.content.Context;
import com.anythink.core.api.AdError;
import com.anythink.core.common.d.j;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class g extends a {
    @Override // com.anythink.core.common.m.a
    public final int a() {
        return 1;
    }

    @Override // com.anythink.core.common.m.a
    public final void b(AdError adError) {
    }

    @Override // com.anythink.core.common.m.a
    public final Map<String, String> c() {
        HashMap hashMap = new HashMap();
        hashMap.put("Content-Encoding", com.anythink.expressad.foundation.g.f.g.b.f20128d);
        hashMap.put("Content-Type", "application/json;charset=utf-8");
        return hashMap;
    }

    @Override // com.anythink.core.common.m.a
    public final byte[] d() {
        try {
            return g().getBytes(com.anythink.expressad.foundation.g.a.bR);
        } catch (Exception unused) {
            return g().getBytes();
        }
    }

    @Override // com.anythink.core.common.m.a
    public final boolean d_() {
        return true;
    }

    @Override // com.anythink.core.common.m.a
    public final JSONObject e() {
        JSONObject e9 = super.e();
        try {
            e9.put("app_id", com.anythink.core.common.d.t.b().p());
            e9.put("curr_ts", System.currentTimeMillis());
        } catch (Exception unused) {
        }
        return e9;
    }

    @Override // com.anythink.core.common.m.a
    public final String g() {
        HashMap hashMap = new HashMap();
        String a9 = com.anythink.core.common.v.k.a(e().toString());
        hashMap.put(e.f15410P, j.e.f13222a);
        hashMap.put("p", a9);
        ArrayList arrayList = new ArrayList(hashMap.size());
        arrayList.addAll(hashMap.keySet());
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(str);
            sb.append("=");
            sb.append(hashMap.get(str));
        }
        try {
            hashMap.put("sign", URLEncoder.encode(com.anythink.core.common.v.o.c(com.anythink.core.common.d.t.b().q() + sb.toString()), com.anythink.expressad.foundation.g.a.bR));
        } catch (UnsupportedEncodingException e9) {
            e9.printStackTrace();
        }
        return new JSONObject(hashMap).toString();
    }

    @Override // com.anythink.core.common.m.a
    public final String h() {
        return com.anythink.core.common.d.t.b().p();
    }

    @Override // com.anythink.core.common.m.a
    public final Context i() {
        return null;
    }

    @Override // com.anythink.core.common.m.a
    public final String j() {
        return com.anythink.core.common.d.t.b().q();
    }

    @Override // com.anythink.core.common.m.a
    public final Map<String, Object> k() {
        return null;
    }

    @Override // com.anythink.core.common.m.a
    public final com.anythink.core.common.m.b.d m() {
        return com.anythink.core.common.m.b.d.a(com.anythink.core.common.m.b.g.f15307d);
    }

    @Override // com.anythink.core.common.m.a
    public final Object a(Object obj) {
        return obj;
    }

    @Override // com.anythink.core.common.m.a
    public final String b() {
        com.anythink.core.common.i.a();
        return com.anythink.core.common.g.c.a().a(com.anythink.core.common.i.l() ? j.e.f13220I : j.e.f13238r);
    }

    @Override // com.anythink.core.common.m.a
    public final void a(AdError adError) {
    }
}
