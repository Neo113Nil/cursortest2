package com.anythink.core.b;

import android.os.SystemClock;
import android.text.TextUtils;
import com.anythink.core.api.ATAdRequest;
import com.anythink.core.c.b.e;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.ac;
import com.anythink.core.common.h.ad;
import com.anythink.core.common.h.ar;
import com.anythink.core.common.h.bq;
import com.anythink.core.common.h.bv;
import com.anythink.core.common.h.bz;
import com.anythink.core.common.h.n;
import com.anythink.core.common.h.u;
import com.anythink.core.common.h.z;
import com.anythink.core.common.k;
import com.anythink.core.common.m.q;
import com.anythink.core.common.v;
import com.anythink.core.common.v.ak;
import com.anythink.core.common.v.p;
import com.anythink.core.d.l;
import com.anythink.expressad.atsignalcommon.commonwebview.ToolBar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c extends e {

    /* renamed from: a, reason: collision with root package name */
    String f11727a;

    /* renamed from: b, reason: collision with root package name */
    List<bv> f11728b;

    /* renamed from: c, reason: collision with root package name */
    List<bv> f11729c;

    /* renamed from: d, reason: collision with root package name */
    boolean f11730d;

    /* renamed from: e, reason: collision with root package name */
    boolean f11731e;

    public c(com.anythink.core.common.h.a aVar, List<bv> list) {
        super(aVar);
        this.f11727a = p.a(aVar.f13327b, this.f11821o, this.f11822p, aVar.f13331f, 0).toString();
        com.anythink.core.common.w.i iVar = aVar.f13349y;
        this.f11728b = iVar != null ? iVar.a() : null;
        this.f11729c = list != null ? new ArrayList(list) : null;
    }

    private String f() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ToolBar.REFRESH, this.f11736f.f13343s.U());
            com.anythink.core.common.j.a.a().a(jSONObject);
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }

    @Override // com.anythink.core.b.e
    public final synchronized void a(List<JSONObject> list, Map<String, bv> map, Map<String, JSONObject> map2) {
        super.a(list, map, map2);
        v.a(this.f11736f.f13327b).a(this.f11736f.f13330e);
        this.f11730d = false;
        this.f11731e = false;
        try {
            Iterator<Map.Entry<String, bv>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                try {
                    bv value = it.next().getValue();
                    if (value.g() == 66) {
                        this.f11730d = true;
                    } else if (value.g() == 6) {
                        this.f11731e = true;
                    }
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
        }
    }

    @Override // com.anythink.core.b.e
    public final String b() {
        return this.f11736f.f13336l;
    }

    private void b(JSONArray jSONArray) {
        com.anythink.core.common.w.i iVar = this.f11736f.f13349y;
        List<bv> a9 = iVar != null ? iVar.a() : null;
        if (a9 != null) {
            int size = a9.size();
            for (int i = 0; i < size; i++) {
                bv bvVar = a9.get(i);
                if (!bvVar.an()) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("ad_source_id", bvVar.z());
                        jSONObject.put(e.a.f12068h, bvVar.D());
                        ad R8 = bvVar.R();
                        if (R8 != null) {
                            jSONObject.put("tp_bid_id", R8.f13425g);
                        }
                        jSONObject.put(k.ap, bvVar.at());
                        jSONArray.put(jSONObject);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            }
        }
    }

    @Override // com.anythink.core.b.e
    public final void a(List<JSONObject> list, q qVar) {
        String str;
        boolean z3;
        String str2;
        Boolean bool;
        String str3;
        long j6;
        long j9;
        ar arVar;
        ar arVar2;
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = new JSONArray();
        b(jSONArray2);
        a(jSONArray);
        com.anythink.core.b.a.b bVar = new com.anythink.core.b.a.b();
        bVar.f11668a = this.f11727a;
        bVar.f11669b = jSONArray2.toString();
        bVar.f11673f = this.f11736f.f13338n.a().aL();
        String jSONArray3 = jSONArray.length() > 0 ? jSONArray.toString() : "";
        bz bzVar = this.f11736f.f13346v;
        if (bzVar != null) {
            str = bzVar.a().toString();
            bVar.f11671d = str;
        } else {
            str = "";
        }
        bVar.f11672e = jSONArray3;
        bVar.f11674g = this.f11736f.f13338n.a().B();
        bVar.f11675h = f();
        ac acVar = this.f11736f.f13348x;
        bVar.i = acVar != null ? acVar.h() : "";
        com.anythink.core.common.h.a aVar = this.f11736f;
        String str4 = aVar.f13322B;
        if (str4 == null) {
            str4 = "";
        }
        bVar.f11676j = str4;
        bVar.f11677k = aVar.f13343s.ax();
        int b9 = v.a(this.f11736f.f13327b).b(this.f11736f.f13330e);
        bq bqVar = this.f11736f.f13347w;
        ATAdRequest aTAdRequest = null;
        if (bqVar != null) {
            bool = bqVar.c();
            str2 = this.f11736f.f13347w.a();
            z3 = this.f11736f.f13347w.b();
        } else {
            z3 = true;
            str2 = "";
            bool = null;
        }
        com.anythink.core.common.h.a aVar2 = this.f11736f;
        n nVar = aVar2.f13343s;
        int i = aVar2.f13328c.f13547c;
        int i6 = aVar2.f13344t;
        boolean z6 = this.f11730d;
        boolean z9 = this.f11731e;
        boolean a9 = com.anythink.core.common.v.q.a(aVar2.f13327b);
        Boolean bool2 = bool;
        u uVar = new u(nVar.aK(), null);
        uVar.f14075c = "1004684";
        uVar.a(nVar);
        uVar.f14076d = nVar.aJ();
        uVar.f14077e = nVar.aI();
        uVar.f14083l = String.valueOf(i);
        uVar.f14087p = String.valueOf(b9);
        uVar.f14088q = String.valueOf(nVar.aK());
        uVar.f14089r = z3 ? "1" : "2";
        uVar.f14090s = String.valueOf(i6);
        if (!TextUtils.isEmpty(jSONArray3)) {
            uVar.f14091t = jSONArray3;
        }
        if (!TextUtils.isEmpty(str)) {
            uVar.f14092u = str;
        }
        if (bool2 == null) {
            str3 = "0";
        } else {
            str3 = bool2.booleanValue() ? "1" : "2";
        }
        uVar.f14093v = str3;
        uVar.f14094w = str2;
        uVar.f14095x = z6 ? "1" : "2";
        uVar.f14096y = z9 ? "1" : "2";
        uVar.f14097z = String.valueOf(i);
        uVar.f14051A = a9 ? "1" : "2";
        com.anythink.core.common.u.e.b(uVar);
        com.anythink.core.common.h.a aVar3 = this.f11736f;
        if (aVar3 == null || (arVar2 = aVar3.f13328c) == null) {
            j6 = 0;
            j9 = 0;
        } else {
            j6 = arVar2.f13554k;
            j9 = arVar2.f13552h;
        }
        if (j6 > 0) {
            bVar.f11678l = this.f11825s - aVar3.f13328c.f13554k;
            bVar.f11679m = SystemClock.elapsedRealtime() - this.f11736f.f13328c.f13554k;
        }
        bVar.f11680n = this.i;
        bVar.f11683q = j9;
        bVar.f11682p = this.f11736f.f13338n.i();
        l a10 = this.f11736f.f13338n.a();
        if (a10 != null) {
            bVar.f11681o = a10.ab();
        }
        bVar.f11684r = com.anythink.core.d.n.a(this.f11736f.f13327b).j(this.f11822p);
        bVar.f11685s = (System.currentTimeMillis() - t.b().Y()) - bVar.f11679m;
        com.anythink.core.common.h.a aVar4 = this.f11736f;
        if (aVar4 != null && (arVar = aVar4.f13328c) != null) {
            aTAdRequest = arVar.b();
        }
        bVar.f11686t = aTAdRequest;
        com.anythink.core.b.a.a aVar5 = new com.anythink.core.b.a.a(this.f11823q, this.f11822p, this.f11821o, list, 0, a10);
        aVar5.a(bVar);
        aVar5.a(0, qVar);
    }

    private void a(String str, String str2) {
        String str3;
        boolean z3;
        Boolean bool;
        String str4;
        int b9 = v.a(this.f11736f.f13327b).b(this.f11736f.f13330e);
        bq bqVar = this.f11736f.f13347w;
        if (bqVar != null) {
            bool = bqVar.c();
            str3 = this.f11736f.f13347w.a();
            z3 = this.f11736f.f13347w.b();
        } else {
            str3 = "";
            z3 = true;
            bool = null;
        }
        com.anythink.core.common.h.a aVar = this.f11736f;
        n nVar = aVar.f13343s;
        int i = aVar.f13328c.f13547c;
        int i6 = aVar.f13344t;
        boolean z6 = this.f11730d;
        boolean z9 = this.f11731e;
        boolean a9 = com.anythink.core.common.v.q.a(aVar.f13327b);
        u uVar = new u(nVar.aK(), null);
        uVar.f14075c = "1004684";
        uVar.a(nVar);
        uVar.f14076d = nVar.aJ();
        uVar.f14077e = nVar.aI();
        uVar.f14083l = String.valueOf(i);
        uVar.f14087p = String.valueOf(b9);
        uVar.f14088q = String.valueOf(nVar.aK());
        uVar.f14089r = z3 ? "1" : "2";
        uVar.f14090s = String.valueOf(i6);
        if (!TextUtils.isEmpty(str2)) {
            uVar.f14091t = str2;
        }
        if (!TextUtils.isEmpty(str)) {
            uVar.f14092u = str;
        }
        if (bool == null) {
            str4 = "0";
        } else {
            str4 = bool.booleanValue() ? "1" : "2";
        }
        uVar.f14093v = str4;
        uVar.f14094w = str3;
        uVar.f14095x = z6 ? "1" : "2";
        uVar.f14096y = z9 ? "1" : "2";
        uVar.f14097z = String.valueOf(i);
        uVar.f14051A = a9 ? "1" : "2";
        com.anythink.core.common.u.e.b(uVar);
    }

    @Override // com.anythink.core.b.e, com.anythink.core.b.d
    public final void a(bv bvVar, z zVar, long j6) {
        super.a(bvVar, zVar, j6);
    }

    private void a(JSONArray jSONArray) {
        List<bv> list = this.f11729c;
        if (list != null) {
            Iterator<bv> it = list.iterator();
            while (it.hasNext()) {
                List<bz.a> a9 = ak.a(this.f11822p, it.next());
                if (a9 != null && a9.size() > 0) {
                    Iterator<bz.a> it2 = a9.iterator();
                    while (it2.hasNext()) {
                        jSONArray.put(it2.next().a());
                    }
                }
            }
        }
        List<bv> list2 = this.f11728b;
        if (list2 != null) {
            Iterator<bv> it3 = list2.iterator();
            while (it3.hasNext()) {
                List<bz.a> a10 = ak.a(this.f11822p, it3.next());
                if (a10 != null && a10.size() > 0) {
                    Iterator<bz.a> it4 = a10.iterator();
                    while (it4.hasNext()) {
                        jSONArray.put(it4.next().a());
                    }
                }
            }
        }
    }
}
