package com.anythink.core.common.h;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.basead.adx.api.ATAdxBidFloorInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f13320a = "a";

    /* renamed from: A, reason: collision with root package name */
    public ATAdxBidFloorInfo f13321A;

    /* renamed from: B, reason: collision with root package name */
    public String f13322B;

    /* renamed from: C, reason: collision with root package name */
    public double f13323C;

    /* renamed from: D, reason: collision with root package name */
    public int f13324D;

    /* renamed from: F, reason: collision with root package name */
    public com.anythink.core.common.h f13326F;

    /* renamed from: b, reason: collision with root package name */
    public Context f13327b;

    /* renamed from: c, reason: collision with root package name */
    public ar f13328c;

    /* renamed from: d, reason: collision with root package name */
    public String f13329d;

    /* renamed from: e, reason: collision with root package name */
    public String f13330e;

    /* renamed from: f, reason: collision with root package name */
    public int f13331f;

    /* renamed from: g, reason: collision with root package name */
    public long f13332g;

    /* renamed from: h, reason: collision with root package name */
    public long f13333h;
    public long i;

    /* renamed from: j, reason: collision with root package name */
    public List<bv> f13334j;

    /* renamed from: k, reason: collision with root package name */
    public List<bv> f13335k;

    /* renamed from: l, reason: collision with root package name */
    public String f13336l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f13337m;

    /* renamed from: n, reason: collision with root package name */
    public cb f13338n;

    /* renamed from: o, reason: collision with root package name */
    public String f13339o;

    /* renamed from: p, reason: collision with root package name */
    public String f13340p;

    /* renamed from: q, reason: collision with root package name */
    public Map<String, Object> f13341q;

    /* renamed from: r, reason: collision with root package name */
    public JSONObject f13342r;

    /* renamed from: s, reason: collision with root package name */
    public n f13343s;

    /* renamed from: u, reason: collision with root package name */
    public Map<String, Double> f13345u;

    /* renamed from: v, reason: collision with root package name */
    public bz f13346v;

    /* renamed from: w, reason: collision with root package name */
    public bq f13347w;

    /* renamed from: x, reason: collision with root package name */
    public ac f13348x;

    /* renamed from: y, reason: collision with root package name */
    public com.anythink.core.common.w.i f13349y;

    /* renamed from: t, reason: collision with root package name */
    public int f13344t = 2;

    /* renamed from: z, reason: collision with root package name */
    public int f13350z = 0;

    /* renamed from: E, reason: collision with root package name */
    public int f13325E = 2;

    private a d(List<bv> list) {
        a aVar = new a();
        aVar.f13327b = this.f13327b;
        aVar.f13329d = this.f13329d;
        aVar.f13330e = this.f13330e;
        aVar.f13331f = this.f13331f;
        aVar.f13333h = this.f13333h;
        aVar.f13338n = this.f13338n;
        long j6 = this.f13332g;
        if (j6 < 0) {
            aVar.f13332g = 10000L;
        } else {
            aVar.f13332g = j6;
        }
        aVar.f13337m = this.f13337m;
        aVar.f13339o = this.f13339o;
        aVar.f13340p = this.f13340p;
        aVar.f13334j = list;
        aVar.f13341q = this.f13341q;
        aVar.i = this.i;
        aVar.f13328c = this.f13328c;
        aVar.f13343s = this.f13343s;
        aVar.f13344t = this.f13344t;
        aVar.f13345u = this.f13345u;
        aVar.f13350z = this.f13350z;
        aVar.f13349y = this.f13349y;
        aVar.f13348x = this.f13348x;
        aVar.f13321A = this.f13321A;
        aVar.f13322B = this.f13322B;
        aVar.f13323C = this.f13323C;
        aVar.f13324D = this.f13324D;
        aVar.f13325E = this.f13325E;
        return aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0095, code lost:
    
        if (r6.equals("2") != false) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d6 A[Catch: all -> 0x008c, TryCatch #0 {all -> 0x008c, blocks: (B:18:0x006e, B:27:0x00a1, B:28:0x00cc, B:30:0x00d6, B:31:0x00d9, B:33:0x00e9, B:34:0x00f7, B:36:0x00fd, B:38:0x0109, B:39:0x0114, B:42:0x011a, B:47:0x0126, B:49:0x012c, B:50:0x0131, B:52:0x0137, B:53:0x013c, B:56:0x00a5, B:58:0x00a9, B:59:0x00ad, B:61:0x00c9, B:62:0x0082, B:65:0x008f), top: B:17:0x006e }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e9 A[Catch: all -> 0x008c, TryCatch #0 {all -> 0x008c, blocks: (B:18:0x006e, B:27:0x00a1, B:28:0x00cc, B:30:0x00d6, B:31:0x00d9, B:33:0x00e9, B:34:0x00f7, B:36:0x00fd, B:38:0x0109, B:39:0x0114, B:42:0x011a, B:47:0x0126, B:49:0x012c, B:50:0x0131, B:52:0x0137, B:53:0x013c, B:56:0x00a5, B:58:0x00a9, B:59:0x00ad, B:61:0x00c9, B:62:0x0082, B:65:0x008f), top: B:17:0x006e }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a5 A[Catch: all -> 0x008c, TryCatch #0 {all -> 0x008c, blocks: (B:18:0x006e, B:27:0x00a1, B:28:0x00cc, B:30:0x00d6, B:31:0x00d9, B:33:0x00e9, B:34:0x00f7, B:36:0x00fd, B:38:0x0109, B:39:0x0114, B:42:0x011a, B:47:0x0126, B:49:0x012c, B:50:0x0131, B:52:0x0137, B:53:0x013c, B:56:0x00a5, B:58:0x00a9, B:59:0x00ad, B:61:0x00c9, B:62:0x0082, B:65:0x008f), top: B:17:0x006e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final a a(List<bv> list, List<bv> list2) {
        String valueOf;
        int hashCode;
        List<be> a9;
        a d2 = d(list);
        d2.f13336l = this.f13336l;
        if (list2 != null && list2.size() > 0) {
            Collections.sort(list2);
            List<bv> a10 = com.anythink.core.common.v.p.a(list2, (com.anythink.core.common.k.f) null);
            d2.f13335k = a10;
            char c9 = 0;
            bv bvVar = a10.get(0);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (bv bvVar2 : a10) {
                if (bvVar2.q() == 7) {
                    arrayList.add(Integer.valueOf(Integer.parseInt(bvVar2.z())));
                    arrayList2.add(bvVar2.z());
                }
            }
            JSONObject jSONObject = new JSONObject();
            String valueOf2 = String.valueOf(d2.f13331f);
            this.f13338n.a();
            com.anythink.core.b.d.b.a(jSONObject, valueOf2, bvVar, d2);
            try {
                valueOf = String.valueOf(d2.f13331f);
                hashCode = valueOf.hashCode();
            } catch (Throwable th) {
                th.printStackTrace();
            }
            if (hashCode != 50) {
                if (hashCode == 52 && valueOf.equals("4")) {
                    c9 = 1;
                    if (c9 != 0) {
                        ar arVar = d2.f13328c;
                        String obj = d2.f13338n.a().a(d2.f13330e, d2.f13329d, bvVar, arVar != null ? arVar.b() : null).get("size").toString();
                        if (!TextUtils.isEmpty(obj)) {
                            jSONObject.put("size", obj);
                        }
                    } else if (c9 == 1) {
                        jSONObject.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.GET_OFFER, 2);
                    }
                    if (d2.f13350z == d2.f13335k.size()) {
                        jSONObject.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.GET_OFFER, 2);
                    }
                    a9 = com.anythink.core.common.f.c.a(d2.f13327b).a(arrayList2);
                    if (a9.size() > 0) {
                        JSONObject jSONObject2 = new JSONObject();
                        JSONObject jSONObject3 = new JSONObject();
                        for (be beVar : a9) {
                            if (beVar.d() > 0) {
                                jSONObject2.put(beVar.a(), beVar.d());
                            }
                            if (beVar.c() > 0) {
                                jSONObject3.put(beVar.a(), beVar.c());
                            }
                        }
                        if (jSONObject2.length() > 0) {
                            jSONObject.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.DIRECTLY_DA_OFFER_CLICK, jSONObject2);
                        }
                        if (jSONObject3.length() > 0) {
                            jSONObject.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.DIRECTLY_DA_OFFER_IMPRESSION, jSONObject3);
                        }
                    }
                    jSONObject.put("unit_ids", new JSONArray(arrayList.toString()));
                    d2.f13342r = jSONObject;
                }
                c9 = 65535;
                if (c9 != 0) {
                }
                if (d2.f13350z == d2.f13335k.size()) {
                }
                a9 = com.anythink.core.common.f.c.a(d2.f13327b).a(arrayList2);
                if (a9.size() > 0) {
                }
                jSONObject.put("unit_ids", new JSONArray(arrayList.toString()));
                d2.f13342r = jSONObject;
            }
            th.printStackTrace();
            d2.f13342r = jSONObject;
        }
        d2.f13346v = this.f13346v;
        d2.f13347w = this.f13347w;
        return d2;
    }

    public final a b(List<bv> list) {
        a d2 = d(list);
        d2.f13339o = this.f13339o;
        d2.f13333h = this.f13333h;
        return d2;
    }

    public final a c(List<bv> list) {
        a d2 = d(list);
        d2.f13340p = this.f13340p;
        return d2;
    }

    public final a a(List<bv> list) {
        return d(list);
    }
}
