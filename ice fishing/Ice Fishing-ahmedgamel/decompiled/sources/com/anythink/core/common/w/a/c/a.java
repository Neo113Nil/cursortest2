package com.anythink.core.common.w.a.c;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.AdError;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.ai;
import com.anythink.core.common.h.aj;
import com.anythink.core.common.h.am;
import com.anythink.core.common.h.an;
import com.anythink.core.common.h.bv;
import com.anythink.core.common.k;
import com.anythink.core.common.m.b;
import com.anythink.core.common.m.b.g;
import com.anythink.core.common.m.q;
import com.anythink.core.common.w.a.a;
import com.anythink.core.common.w.a.b.d;
import com.anythink.core.d.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f17018a = "am";

    /* renamed from: b, reason: collision with root package name */
    private final Context f17019b;

    /* renamed from: c, reason: collision with root package name */
    private final l f17020c;

    /* renamed from: d, reason: collision with root package name */
    private final ai f17021d;

    /* renamed from: e, reason: collision with root package name */
    private final d f17022e;

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC0104a f17023f;

    /* renamed from: com.anythink.core.common.w.a.c.a$a, reason: collision with other inner class name */
    public interface InterfaceC0104a {
        void a(List<aj> list, boolean z3);

        void a(boolean z3);
    }

    public a(Context context, l lVar, ai aiVar, d dVar) {
        this.f17019b = context;
        this.f17020c = lVar;
        this.f17022e = dVar;
        this.f17021d = aiVar;
    }

    private void b() {
        l lVar;
        d dVar = this.f17022e;
        if (dVar == null || (lVar = this.f17020c) == null) {
            return;
        }
        dVar.b(lVar.i());
    }

    private an c() {
        l lVar;
        Map<String, Integer> map;
        Map<String, List<am.a>> map2;
        List<am.a> list;
        Integer num;
        an anVar = new an();
        anVar.a(t.b().p());
        anVar.b(t.b().q());
        anVar.a(this.f17019b);
        l lVar2 = this.f17020c;
        if (lVar2 != null) {
            anVar.b(lVar2.ay());
            anVar.a(this.f17020c.ai());
            anVar.d(this.f17020c.i());
        }
        ai aiVar = this.f17021d;
        if (aiVar != null) {
            anVar.c(aiVar.g());
        }
        d dVar = this.f17022e;
        if (dVar != null && (lVar = this.f17020c) != null) {
            am a9 = dVar.a(lVar.i());
            if (a9 != null) {
                map = a9.b();
                map2 = a9.a();
            } else {
                map = null;
                map2 = null;
            }
            Map<String, bv> w6 = this.f17020c.w();
            if (w6 != null) {
                Set<String> keySet = w6.keySet();
                ArrayList arrayList = new ArrayList();
                for (String str : keySet) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        bv bvVar = w6.get(str);
                        if (bvVar != null) {
                            jSONObject.put("unitid", Integer.parseInt(bvVar.z()));
                            jSONObject.put("nwfid", bvVar.g());
                            jSONObject.put(k.f14285H, bvVar.D());
                            jSONObject.put("unit_type", bvVar.aM());
                        }
                        if (map != null && (num = map.get(str)) != null && num.intValue() > 0) {
                            jSONObject.put(g.f14526j, num.intValue());
                        }
                        if (map2 != null && (list = map2.get(str)) != null && !list.isEmpty()) {
                            JSONObject jSONObject2 = new JSONObject();
                            for (am.a aVar : list) {
                                String a10 = aVar.a();
                                if (!TextUtils.isEmpty(a10)) {
                                    jSONObject2.put(a10, aVar.b());
                                }
                            }
                            if (jSONObject2.length() > 0) {
                                jSONObject.put("error_code", jSONObject2);
                            }
                        }
                        arrayList.add(jSONObject);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                }
                anVar.a(new JSONArray((Collection) arrayList));
            }
        }
        return anVar;
    }

    public static /* synthetic */ void b(a aVar) {
        l lVar;
        d dVar = aVar.f17022e;
        if (dVar == null || (lVar = aVar.f17020c) == null) {
            return;
        }
        dVar.b(lVar.i());
    }

    public final void a(InterfaceC0104a interfaceC0104a) {
        this.f17023f = interfaceC0104a;
    }

    public final void a(final boolean z3) {
        try {
            new com.anythink.core.common.m.l(c()).a(0, (q) new b() { // from class: com.anythink.core.common.w.a.c.a.1
                @Override // com.anythink.core.common.m.q
                public final void onLoadError(int i, String str, AdError adError) {
                    if (a.this.f17023f != null) {
                        InterfaceC0104a interfaceC0104a = a.this.f17023f;
                        adError.getCode();
                        adError.getDesc();
                        interfaceC0104a.a(z3);
                    }
                    a.b(a.this);
                }

                @Override // com.anythink.core.common.m.q
                public final void onLoadFinish(int i, Object obj) {
                    JSONArray optJSONArray;
                    CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                    try {
                        if ((obj instanceof JSONObject) && (optJSONArray = ((JSONObject) obj).optJSONArray("u_d")) != null && optJSONArray.length() > 0) {
                            for (int i6 = 0; i6 < optJSONArray.length(); i6++) {
                                copyOnWriteArrayList.add(aj.a(String.valueOf(optJSONArray.optInt(i6)), a.C0103a.f16979a));
                            }
                        }
                    } catch (Throwable th) {
                        String unused = a.f17018a;
                        th.getMessage();
                    }
                    if (a.this.f17023f != null) {
                        a.this.f17023f.a(copyOnWriteArrayList, z3);
                    }
                    a.b(a.this);
                }
            });
        } catch (Throwable unused) {
        }
    }
}
