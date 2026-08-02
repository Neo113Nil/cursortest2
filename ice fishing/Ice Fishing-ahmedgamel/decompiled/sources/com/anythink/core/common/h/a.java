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
    public static final String f14106a = "a";

    /* renamed from: A, reason: collision with root package name */
    public ATAdxBidFloorInfo f14107A;

    /* renamed from: B, reason: collision with root package name */
    public String f14108B;

    /* renamed from: C, reason: collision with root package name */
    public double f14109C;

    /* renamed from: D, reason: collision with root package name */
    public int f14110D;

    /* renamed from: F, reason: collision with root package name */
    public com.anythink.core.common.h f14112F;

    /* renamed from: b, reason: collision with root package name */
    public Context f14113b;

    /* renamed from: c, reason: collision with root package name */
    public ar f14114c;

    /* renamed from: d, reason: collision with root package name */
    public String f14115d;

    /* renamed from: e, reason: collision with root package name */
    public String f14116e;

    /* renamed from: f, reason: collision with root package name */
    public int f14117f;

    /* renamed from: g, reason: collision with root package name */
    public long f14118g;

    /* renamed from: h, reason: collision with root package name */
    public long f14119h;
    public long i;

    /* renamed from: j, reason: collision with root package name */
    public List<bv> f14120j;

    /* renamed from: k, reason: collision with root package name */
    public List<bv> f14121k;

    /* renamed from: l, reason: collision with root package name */
    public String f14122l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f14123m;

    /* renamed from: n, reason: collision with root package name */
    public cb f14124n;

    /* renamed from: o, reason: collision with root package name */
    public String f14125o;

    /* renamed from: p, reason: collision with root package name */
    public String f14126p;

    /* renamed from: q, reason: collision with root package name */
    public Map<String, Object> f14127q;

    /* renamed from: r, reason: collision with root package name */
    public JSONObject f14128r;

    /* renamed from: s, reason: collision with root package name */
    public n f14129s;

    /* renamed from: u, reason: collision with root package name */
    public Map<String, Double> f14131u;

    /* renamed from: v, reason: collision with root package name */
    public bz f14132v;

    /* renamed from: w, reason: collision with root package name */
    public bq f14133w;

    /* renamed from: x, reason: collision with root package name */
    public ac f14134x;

    /* renamed from: y, reason: collision with root package name */
    public com.anythink.core.common.w.i f14135y;

    /* renamed from: t, reason: collision with root package name */
    public int f14130t = 2;

    /* renamed from: z, reason: collision with root package name */
    public int f14136z = 0;

    /* renamed from: E, reason: collision with root package name */
    public int f14111E = 2;

    private a d(List<bv> list) {
        a aVar = new a();
        aVar.f14113b = this.f14113b;
        aVar.f14115d = this.f14115d;
        aVar.f14116e = this.f14116e;
        aVar.f14117f = this.f14117f;
        aVar.f14119h = this.f14119h;
        aVar.f14124n = this.f14124n;
        long j6 = this.f14118g;
        if (j6 < 0) {
            aVar.f14118g = 10000L;
        } else {
            aVar.f14118g = j6;
        }
        aVar.f14123m = this.f14123m;
        aVar.f14125o = this.f14125o;
        aVar.f14126p = this.f14126p;
        aVar.f14120j = list;
        aVar.f14127q = this.f14127q;
        aVar.i = this.i;
        aVar.f14114c = this.f14114c;
        aVar.f14129s = this.f14129s;
        aVar.f14130t = this.f14130t;
        aVar.f14131u = this.f14131u;
        aVar.f14136z = this.f14136z;
        aVar.f14135y = this.f14135y;
        aVar.f14134x = this.f14134x;
        aVar.f14107A = this.f14107A;
        aVar.f14108B = this.f14108B;
        aVar.f14109C = this.f14109C;
        aVar.f14110D = this.f14110D;
        aVar.f14111E = this.f14111E;
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
        a d9 = d(list);
        d9.f14122l = this.f14122l;
        if (list2 != null && list2.size() > 0) {
            Collections.sort(list2);
            List<bv> a10 = com.anythink.core.common.v.p.a(list2, (com.anythink.core.common.k.f) null);
            d9.f14121k = a10;
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
            String valueOf2 = String.valueOf(d9.f14117f);
            this.f14124n.a();
            com.anythink.core.b.d.b.a(jSONObject, valueOf2, bvVar, d9);
            try {
                valueOf = String.valueOf(d9.f14117f);
                hashCode = valueOf.hashCode();
            } catch (Throwable th) {
                th.printStackTrace();
            }
            if (hashCode != 50) {
                if (hashCode == 52 && valueOf.equals("4")) {
                    c9 = 1;
                    if (c9 != 0) {
                        ar arVar = d9.f14114c;
                        String obj = d9.f14124n.a().a(d9.f14116e, d9.f14115d, bvVar, arVar != null ? arVar.b() : null).get("size").toString();
                        if (!TextUtils.isEmpty(obj)) {
                            jSONObject.put("size", obj);
                        }
                    } else if (c9 == 1) {
                        jSONObject.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.GET_OFFER, 2);
                    }
                    if (d9.f14136z == d9.f14121k.size()) {
                        jSONObject.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.GET_OFFER, 2);
                    }
                    a9 = com.anythink.core.common.f.c.a(d9.f14113b).a(arrayList2);
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
                    d9.f14128r = jSONObject;
                }
                c9 = 65535;
                if (c9 != 0) {
                }
                if (d9.f14136z == d9.f14121k.size()) {
                }
                a9 = com.anythink.core.common.f.c.a(d9.f14113b).a(arrayList2);
                if (a9.size() > 0) {
                }
                jSONObject.put("unit_ids", new JSONArray(arrayList.toString()));
                d9.f14128r = jSONObject;
            }
            th.printStackTrace();
            d9.f14128r = jSONObject;
        }
        d9.f14132v = this.f14132v;
        d9.f14133w = this.f14133w;
        return d9;
    }

    public final a b(List<bv> list) {
        a d9 = d(list);
        d9.f14125o = this.f14125o;
        d9.f14119h = this.f14119h;
        return d9;
    }

    public final a c(List<bv> list) {
        a d9 = d(list);
        d9.f14126p = this.f14126p;
        return d9;
    }

    public final a a(List<bv> list) {
        return d(list);
    }
}
