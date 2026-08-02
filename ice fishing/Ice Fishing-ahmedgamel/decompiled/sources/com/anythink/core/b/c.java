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
    String f12513a;

    /* renamed from: b, reason: collision with root package name */
    List<bv> f12514b;

    /* renamed from: c, reason: collision with root package name */
    List<bv> f12515c;

    /* renamed from: d, reason: collision with root package name */
    boolean f12516d;

    /* renamed from: e, reason: collision with root package name */
    boolean f12517e;

    public c(com.anythink.core.common.h.a aVar, List<bv> list) {
        super(aVar);
        this.f12513a = p.a(aVar.f14113b, this.f12607o, this.f12608p, aVar.f14117f, 0).toString();
        com.anythink.core.common.w.i iVar = aVar.f14135y;
        this.f12514b = iVar != null ? iVar.a() : null;
        this.f12515c = list != null ? new ArrayList(list) : null;
    }

    private String f() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ToolBar.REFRESH, this.f12522f.f14129s.U());
            com.anythink.core.common.j.a.a().a(jSONObject);
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }

    @Override // com.anythink.core.b.e
    public final synchronized void a(List<JSONObject> list, Map<String, bv> map, Map<String, JSONObject> map2) {
        super.a(list, map, map2);
        v.a(this.f12522f.f14113b).a(this.f12522f.f14116e);
        this.f12516d = false;
        this.f12517e = false;
        try {
            Iterator<Map.Entry<String, bv>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                try {
                    bv value = it.next().getValue();
                    if (value.g() == 66) {
                        this.f12516d = true;
                    } else if (value.g() == 6) {
                        this.f12517e = true;
                    }
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
        }
    }

    @Override // com.anythink.core.b.e
    public final String b() {
        return this.f12522f.f14122l;
    }

    private void b(JSONArray jSONArray) {
        com.anythink.core.common.w.i iVar = this.f12522f.f14135y;
        List<bv> a9 = iVar != null ? iVar.a() : null;
        if (a9 != null) {
            int size = a9.size();
            for (int i = 0; i < size; i++) {
                bv bvVar = a9.get(i);
                if (!bvVar.an()) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("ad_source_id", bvVar.z());
                        jSONObject.put(e.a.f12854h, bvVar.D());
                        ad R8 = bvVar.R();
                        if (R8 != null) {
                            jSONObject.put("tp_bid_id", R8.f14211g);
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
        boolean z6;
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
        bVar.f12454a = this.f12513a;
        bVar.f12455b = jSONArray2.toString();
        bVar.f12459f = this.f12522f.f14124n.a().aL();
        String jSONArray3 = jSONArray.length() > 0 ? jSONArray.toString() : "";
        bz bzVar = this.f12522f.f14132v;
        if (bzVar != null) {
            str = bzVar.a().toString();
            bVar.f12457d = str;
        } else {
            str = "";
        }
        bVar.f12458e = jSONArray3;
        bVar.f12460g = this.f12522f.f14124n.a().B();
        bVar.f12461h = f();
        ac acVar = this.f12522f.f14134x;
        bVar.i = acVar != null ? acVar.h() : "";
        com.anythink.core.common.h.a aVar = this.f12522f;
        String str4 = aVar.f14108B;
        if (str4 == null) {
            str4 = "";
        }
        bVar.f12462j = str4;
        bVar.f12463k = aVar.f14129s.ax();
        int b9 = v.a(this.f12522f.f14113b).b(this.f12522f.f14116e);
        bq bqVar = this.f12522f.f14133w;
        ATAdRequest aTAdRequest = null;
        if (bqVar != null) {
            bool = bqVar.c();
            str2 = this.f12522f.f14133w.a();
            z6 = this.f12522f.f14133w.b();
        } else {
            z6 = true;
            str2 = "";
            bool = null;
        }
        com.anythink.core.common.h.a aVar2 = this.f12522f;
        n nVar = aVar2.f14129s;
        int i = aVar2.f14114c.f14333c;
        int i4 = aVar2.f14130t;
        boolean z9 = this.f12516d;
        boolean z10 = this.f12517e;
        boolean a9 = com.anythink.core.common.v.q.a(aVar2.f14113b);
        Boolean bool2 = bool;
        u uVar = new u(nVar.aK(), null);
        uVar.f14861c = "1004684";
        uVar.a(nVar);
        uVar.f14862d = nVar.aJ();
        uVar.f14863e = nVar.aI();
        uVar.f14869l = String.valueOf(i);
        uVar.f14873p = String.valueOf(b9);
        uVar.f14874q = String.valueOf(nVar.aK());
        uVar.f14875r = z6 ? "1" : "2";
        uVar.f14876s = String.valueOf(i4);
        if (!TextUtils.isEmpty(jSONArray3)) {
            uVar.f14877t = jSONArray3;
        }
        if (!TextUtils.isEmpty(str)) {
            uVar.f14878u = str;
        }
        if (bool2 == null) {
            str3 = "0";
        } else {
            str3 = bool2.booleanValue() ? "1" : "2";
        }
        uVar.f14879v = str3;
        uVar.f14880w = str2;
        uVar.f14881x = z9 ? "1" : "2";
        uVar.f14882y = z10 ? "1" : "2";
        uVar.f14883z = String.valueOf(i);
        uVar.f14837A = a9 ? "1" : "2";
        com.anythink.core.common.u.e.b(uVar);
        com.anythink.core.common.h.a aVar3 = this.f12522f;
        if (aVar3 == null || (arVar2 = aVar3.f14114c) == null) {
            j6 = 0;
            j9 = 0;
        } else {
            j6 = arVar2.f14340k;
            j9 = arVar2.f14338h;
        }
        if (j6 > 0) {
            bVar.f12464l = this.f12611s - aVar3.f14114c.f14340k;
            bVar.f12465m = SystemClock.elapsedRealtime() - this.f12522f.f14114c.f14340k;
        }
        bVar.f12466n = this.i;
        bVar.f12469q = j9;
        bVar.f12468p = this.f12522f.f14124n.i();
        l a10 = this.f12522f.f14124n.a();
        if (a10 != null) {
            bVar.f12467o = a10.ab();
        }
        bVar.f12470r = com.anythink.core.d.n.a(this.f12522f.f14113b).j(this.f12608p);
        bVar.f12471s = (System.currentTimeMillis() - t.b().Y()) - bVar.f12465m;
        com.anythink.core.common.h.a aVar4 = this.f12522f;
        if (aVar4 != null && (arVar = aVar4.f14114c) != null) {
            aTAdRequest = arVar.b();
        }
        bVar.f12472t = aTAdRequest;
        com.anythink.core.b.a.a aVar5 = new com.anythink.core.b.a.a(this.f12609q, this.f12608p, this.f12607o, list, 0, a10);
        aVar5.a(bVar);
        aVar5.a(0, qVar);
    }

    private void a(String str, String str2) {
        String str3;
        boolean z6;
        Boolean bool;
        String str4;
        int b9 = v.a(this.f12522f.f14113b).b(this.f12522f.f14116e);
        bq bqVar = this.f12522f.f14133w;
        if (bqVar != null) {
            bool = bqVar.c();
            str3 = this.f12522f.f14133w.a();
            z6 = this.f12522f.f14133w.b();
        } else {
            str3 = "";
            z6 = true;
            bool = null;
        }
        com.anythink.core.common.h.a aVar = this.f12522f;
        n nVar = aVar.f14129s;
        int i = aVar.f14114c.f14333c;
        int i4 = aVar.f14130t;
        boolean z9 = this.f12516d;
        boolean z10 = this.f12517e;
        boolean a9 = com.anythink.core.common.v.q.a(aVar.f14113b);
        u uVar = new u(nVar.aK(), null);
        uVar.f14861c = "1004684";
        uVar.a(nVar);
        uVar.f14862d = nVar.aJ();
        uVar.f14863e = nVar.aI();
        uVar.f14869l = String.valueOf(i);
        uVar.f14873p = String.valueOf(b9);
        uVar.f14874q = String.valueOf(nVar.aK());
        uVar.f14875r = z6 ? "1" : "2";
        uVar.f14876s = String.valueOf(i4);
        if (!TextUtils.isEmpty(str2)) {
            uVar.f14877t = str2;
        }
        if (!TextUtils.isEmpty(str)) {
            uVar.f14878u = str;
        }
        if (bool == null) {
            str4 = "0";
        } else {
            str4 = bool.booleanValue() ? "1" : "2";
        }
        uVar.f14879v = str4;
        uVar.f14880w = str3;
        uVar.f14881x = z9 ? "1" : "2";
        uVar.f14882y = z10 ? "1" : "2";
        uVar.f14883z = String.valueOf(i);
        uVar.f14837A = a9 ? "1" : "2";
        com.anythink.core.common.u.e.b(uVar);
    }

    @Override // com.anythink.core.b.e, com.anythink.core.b.d
    public final void a(bv bvVar, z zVar, long j6) {
        super.a(bvVar, zVar, j6);
    }

    private void a(JSONArray jSONArray) {
        List<bv> list = this.f12515c;
        if (list != null) {
            Iterator<bv> it = list.iterator();
            while (it.hasNext()) {
                List<bz.a> a9 = ak.a(this.f12608p, it.next());
                if (a9 != null && a9.size() > 0) {
                    Iterator<bz.a> it2 = a9.iterator();
                    while (it2.hasNext()) {
                        jSONArray.put(it2.next().a());
                    }
                }
            }
        }
        List<bv> list2 = this.f12514b;
        if (list2 != null) {
            Iterator<bv> it3 = list2.iterator();
            while (it3.hasNext()) {
                List<bz.a> a10 = ak.a(this.f12608p, it3.next());
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
