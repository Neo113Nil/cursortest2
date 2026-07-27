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
    String f11884a;

    /* renamed from: b, reason: collision with root package name */
    List<bv> f11885b;

    /* renamed from: c, reason: collision with root package name */
    List<bv> f11886c;

    /* renamed from: d, reason: collision with root package name */
    boolean f11887d;

    /* renamed from: e, reason: collision with root package name */
    boolean f11888e;

    public c(com.anythink.core.common.h.a aVar, List<bv> list) {
        super(aVar);
        this.f11884a = p.a(aVar.f13484b, this.f11978o, this.f11979p, aVar.f13488f, 0).toString();
        com.anythink.core.common.w.i iVar = aVar.f13506y;
        this.f11885b = iVar != null ? iVar.a() : null;
        this.f11886c = list != null ? new ArrayList(list) : null;
    }

    private String f() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ToolBar.REFRESH, this.f11893f.f13500s.U());
            com.anythink.core.common.j.a.a().a(jSONObject);
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }

    @Override // com.anythink.core.b.e
    public final synchronized void a(List<JSONObject> list, Map<String, bv> map, Map<String, JSONObject> map2) {
        super.a(list, map, map2);
        v.a(this.f11893f.f13484b).a(this.f11893f.f13487e);
        this.f11887d = false;
        this.f11888e = false;
        try {
            Iterator<Map.Entry<String, bv>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                try {
                    bv value = it.next().getValue();
                    if (value.g() == 66) {
                        this.f11887d = true;
                    } else if (value.g() == 6) {
                        this.f11888e = true;
                    }
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
        }
    }

    @Override // com.anythink.core.b.e
    public final String b() {
        return this.f11893f.f13493l;
    }

    private void b(JSONArray jSONArray) {
        com.anythink.core.common.w.i iVar = this.f11893f.f13506y;
        List<bv> a9 = iVar != null ? iVar.a() : null;
        if (a9 != null) {
            int size = a9.size();
            for (int i = 0; i < size; i++) {
                bv bvVar = a9.get(i);
                if (!bvVar.an()) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("ad_source_id", bvVar.z());
                        jSONObject.put(e.a.f12225h, bvVar.D());
                        ad R8 = bvVar.R();
                        if (R8 != null) {
                            jSONObject.put("tp_bid_id", R8.f13582g);
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
        boolean z8;
        String str2;
        Boolean bool;
        String str3;
        long j9;
        long j10;
        ar arVar;
        ar arVar2;
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = new JSONArray();
        b(jSONArray2);
        a(jSONArray);
        com.anythink.core.b.a.b bVar = new com.anythink.core.b.a.b();
        bVar.f11825a = this.f11884a;
        bVar.f11826b = jSONArray2.toString();
        bVar.f11830f = this.f11893f.f13495n.a().aL();
        String jSONArray3 = jSONArray.length() > 0 ? jSONArray.toString() : "";
        bz bzVar = this.f11893f.f13503v;
        if (bzVar != null) {
            str = bzVar.a().toString();
            bVar.f11828d = str;
        } else {
            str = "";
        }
        bVar.f11829e = jSONArray3;
        bVar.f11831g = this.f11893f.f13495n.a().B();
        bVar.f11832h = f();
        ac acVar = this.f11893f.f13505x;
        bVar.i = acVar != null ? acVar.h() : "";
        com.anythink.core.common.h.a aVar = this.f11893f;
        String str4 = aVar.f13479B;
        if (str4 == null) {
            str4 = "";
        }
        bVar.f11833j = str4;
        bVar.f11834k = aVar.f13500s.ax();
        int b9 = v.a(this.f11893f.f13484b).b(this.f11893f.f13487e);
        bq bqVar = this.f11893f.f13504w;
        ATAdRequest aTAdRequest = null;
        if (bqVar != null) {
            bool = bqVar.c();
            str2 = this.f11893f.f13504w.a();
            z8 = this.f11893f.f13504w.b();
        } else {
            z8 = true;
            str2 = "";
            bool = null;
        }
        com.anythink.core.common.h.a aVar2 = this.f11893f;
        n nVar = aVar2.f13500s;
        int i = aVar2.f13485c.f13704c;
        int i4 = aVar2.f13501t;
        boolean z9 = this.f11887d;
        boolean z10 = this.f11888e;
        boolean a9 = com.anythink.core.common.v.q.a(aVar2.f13484b);
        Boolean bool2 = bool;
        u uVar = new u(nVar.aK(), null);
        uVar.f14232c = "1004684";
        uVar.a(nVar);
        uVar.f14233d = nVar.aJ();
        uVar.f14234e = nVar.aI();
        uVar.f14240l = String.valueOf(i);
        uVar.f14244p = String.valueOf(b9);
        uVar.f14245q = String.valueOf(nVar.aK());
        uVar.f14246r = z8 ? "1" : "2";
        uVar.f14247s = String.valueOf(i4);
        if (!TextUtils.isEmpty(jSONArray3)) {
            uVar.f14248t = jSONArray3;
        }
        if (!TextUtils.isEmpty(str)) {
            uVar.f14249u = str;
        }
        if (bool2 == null) {
            str3 = "0";
        } else {
            str3 = bool2.booleanValue() ? "1" : "2";
        }
        uVar.f14250v = str3;
        uVar.f14251w = str2;
        uVar.f14252x = z9 ? "1" : "2";
        uVar.f14253y = z10 ? "1" : "2";
        uVar.f14254z = String.valueOf(i);
        uVar.f14208A = a9 ? "1" : "2";
        com.anythink.core.common.u.e.b(uVar);
        com.anythink.core.common.h.a aVar3 = this.f11893f;
        if (aVar3 == null || (arVar2 = aVar3.f13485c) == null) {
            j9 = 0;
            j10 = 0;
        } else {
            j9 = arVar2.f13711k;
            j10 = arVar2.f13709h;
        }
        if (j9 > 0) {
            bVar.f11835l = this.f11982s - aVar3.f13485c.f13711k;
            bVar.f11836m = SystemClock.elapsedRealtime() - this.f11893f.f13485c.f13711k;
        }
        bVar.f11837n = this.i;
        bVar.f11840q = j10;
        bVar.f11839p = this.f11893f.f13495n.i();
        l a10 = this.f11893f.f13495n.a();
        if (a10 != null) {
            bVar.f11838o = a10.ab();
        }
        bVar.f11841r = com.anythink.core.d.n.a(this.f11893f.f13484b).j(this.f11979p);
        bVar.f11842s = (System.currentTimeMillis() - t.b().Y()) - bVar.f11836m;
        com.anythink.core.common.h.a aVar4 = this.f11893f;
        if (aVar4 != null && (arVar = aVar4.f13485c) != null) {
            aTAdRequest = arVar.b();
        }
        bVar.f11843t = aTAdRequest;
        com.anythink.core.b.a.a aVar5 = new com.anythink.core.b.a.a(this.f11980q, this.f11979p, this.f11978o, list, 0, a10);
        aVar5.a(bVar);
        aVar5.a(0, qVar);
    }

    private void a(String str, String str2) {
        String str3;
        boolean z8;
        Boolean bool;
        String str4;
        int b9 = v.a(this.f11893f.f13484b).b(this.f11893f.f13487e);
        bq bqVar = this.f11893f.f13504w;
        if (bqVar != null) {
            bool = bqVar.c();
            str3 = this.f11893f.f13504w.a();
            z8 = this.f11893f.f13504w.b();
        } else {
            str3 = "";
            z8 = true;
            bool = null;
        }
        com.anythink.core.common.h.a aVar = this.f11893f;
        n nVar = aVar.f13500s;
        int i = aVar.f13485c.f13704c;
        int i4 = aVar.f13501t;
        boolean z9 = this.f11887d;
        boolean z10 = this.f11888e;
        boolean a9 = com.anythink.core.common.v.q.a(aVar.f13484b);
        u uVar = new u(nVar.aK(), null);
        uVar.f14232c = "1004684";
        uVar.a(nVar);
        uVar.f14233d = nVar.aJ();
        uVar.f14234e = nVar.aI();
        uVar.f14240l = String.valueOf(i);
        uVar.f14244p = String.valueOf(b9);
        uVar.f14245q = String.valueOf(nVar.aK());
        uVar.f14246r = z8 ? "1" : "2";
        uVar.f14247s = String.valueOf(i4);
        if (!TextUtils.isEmpty(str2)) {
            uVar.f14248t = str2;
        }
        if (!TextUtils.isEmpty(str)) {
            uVar.f14249u = str;
        }
        if (bool == null) {
            str4 = "0";
        } else {
            str4 = bool.booleanValue() ? "1" : "2";
        }
        uVar.f14250v = str4;
        uVar.f14251w = str3;
        uVar.f14252x = z9 ? "1" : "2";
        uVar.f14253y = z10 ? "1" : "2";
        uVar.f14254z = String.valueOf(i);
        uVar.f14208A = a9 ? "1" : "2";
        com.anythink.core.common.u.e.b(uVar);
    }

    @Override // com.anythink.core.b.e, com.anythink.core.b.d
    public final void a(bv bvVar, z zVar, long j9) {
        super.a(bvVar, zVar, j9);
    }

    private void a(JSONArray jSONArray) {
        List<bv> list = this.f11886c;
        if (list != null) {
            Iterator<bv> it = list.iterator();
            while (it.hasNext()) {
                List<bz.a> a9 = ak.a(this.f11979p, it.next());
                if (a9 != null && a9.size() > 0) {
                    Iterator<bz.a> it2 = a9.iterator();
                    while (it2.hasNext()) {
                        jSONArray.put(it2.next().a());
                    }
                }
            }
        }
        List<bv> list2 = this.f11885b;
        if (list2 != null) {
            Iterator<bv> it3 = list2.iterator();
            while (it3.hasNext()) {
                List<bz.a> a10 = ak.a(this.f11979p, it3.next());
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
