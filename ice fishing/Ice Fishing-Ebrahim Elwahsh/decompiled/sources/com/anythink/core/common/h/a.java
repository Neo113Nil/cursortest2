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
    public static final String f13477a = "a";

    /* renamed from: A, reason: collision with root package name */
    public ATAdxBidFloorInfo f13478A;

    /* renamed from: B, reason: collision with root package name */
    public String f13479B;

    /* renamed from: C, reason: collision with root package name */
    public double f13480C;

    /* renamed from: D, reason: collision with root package name */
    public int f13481D;

    /* renamed from: F, reason: collision with root package name */
    public com.anythink.core.common.h f13483F;

    /* renamed from: b, reason: collision with root package name */
    public Context f13484b;

    /* renamed from: c, reason: collision with root package name */
    public ar f13485c;

    /* renamed from: d, reason: collision with root package name */
    public String f13486d;

    /* renamed from: e, reason: collision with root package name */
    public String f13487e;

    /* renamed from: f, reason: collision with root package name */
    public int f13488f;

    /* renamed from: g, reason: collision with root package name */
    public long f13489g;

    /* renamed from: h, reason: collision with root package name */
    public long f13490h;
    public long i;

    /* renamed from: j, reason: collision with root package name */
    public List<bv> f13491j;

    /* renamed from: k, reason: collision with root package name */
    public List<bv> f13492k;

    /* renamed from: l, reason: collision with root package name */
    public String f13493l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f13494m;

    /* renamed from: n, reason: collision with root package name */
    public cb f13495n;

    /* renamed from: o, reason: collision with root package name */
    public String f13496o;

    /* renamed from: p, reason: collision with root package name */
    public String f13497p;

    /* renamed from: q, reason: collision with root package name */
    public Map<String, Object> f13498q;

    /* renamed from: r, reason: collision with root package name */
    public JSONObject f13499r;

    /* renamed from: s, reason: collision with root package name */
    public n f13500s;

    /* renamed from: u, reason: collision with root package name */
    public Map<String, Double> f13502u;

    /* renamed from: v, reason: collision with root package name */
    public bz f13503v;

    /* renamed from: w, reason: collision with root package name */
    public bq f13504w;

    /* renamed from: x, reason: collision with root package name */
    public ac f13505x;

    /* renamed from: y, reason: collision with root package name */
    public com.anythink.core.common.w.i f13506y;

    /* renamed from: t, reason: collision with root package name */
    public int f13501t = 2;

    /* renamed from: z, reason: collision with root package name */
    public int f13507z = 0;

    /* renamed from: E, reason: collision with root package name */
    public int f13482E = 2;

    private a d(List<bv> list) {
        a aVar = new a();
        aVar.f13484b = this.f13484b;
        aVar.f13486d = this.f13486d;
        aVar.f13487e = this.f13487e;
        aVar.f13488f = this.f13488f;
        aVar.f13490h = this.f13490h;
        aVar.f13495n = this.f13495n;
        long j9 = this.f13489g;
        if (j9 < 0) {
            aVar.f13489g = 10000L;
        } else {
            aVar.f13489g = j9;
        }
        aVar.f13494m = this.f13494m;
        aVar.f13496o = this.f13496o;
        aVar.f13497p = this.f13497p;
        aVar.f13491j = list;
        aVar.f13498q = this.f13498q;
        aVar.i = this.i;
        aVar.f13485c = this.f13485c;
        aVar.f13500s = this.f13500s;
        aVar.f13501t = this.f13501t;
        aVar.f13502u = this.f13502u;
        aVar.f13507z = this.f13507z;
        aVar.f13506y = this.f13506y;
        aVar.f13505x = this.f13505x;
        aVar.f13478A = this.f13478A;
        aVar.f13479B = this.f13479B;
        aVar.f13480C = this.f13480C;
        aVar.f13481D = this.f13481D;
        aVar.f13482E = this.f13482E;
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
        d2.f13493l = this.f13493l;
        if (list2 != null && list2.size() > 0) {
            Collections.sort(list2);
            List<bv> a10 = com.anythink.core.common.v.p.a(list2, (com.anythink.core.common.k.f) null);
            d2.f13492k = a10;
            char c4 = 0;
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
            String valueOf2 = String.valueOf(d2.f13488f);
            this.f13495n.a();
            com.anythink.core.b.d.b.a(jSONObject, valueOf2, bvVar, d2);
            try {
                valueOf = String.valueOf(d2.f13488f);
                hashCode = valueOf.hashCode();
            } catch (Throwable th) {
                th.printStackTrace();
            }
            if (hashCode != 50) {
                if (hashCode == 52 && valueOf.equals("4")) {
                    c4 = 1;
                    if (c4 != 0) {
                        ar arVar = d2.f13485c;
                        String obj = d2.f13495n.a().a(d2.f13487e, d2.f13486d, bvVar, arVar != null ? arVar.b() : null).get("size").toString();
                        if (!TextUtils.isEmpty(obj)) {
                            jSONObject.put("size", obj);
                        }
                    } else if (c4 == 1) {
                        jSONObject.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.GET_OFFER, 2);
                    }
                    if (d2.f13507z == d2.f13492k.size()) {
                        jSONObject.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.GET_OFFER, 2);
                    }
                    a9 = com.anythink.core.common.f.c.a(d2.f13484b).a(arrayList2);
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
                    d2.f13499r = jSONObject;
                }
                c4 = 65535;
                if (c4 != 0) {
                }
                if (d2.f13507z == d2.f13492k.size()) {
                }
                a9 = com.anythink.core.common.f.c.a(d2.f13484b).a(arrayList2);
                if (a9.size() > 0) {
                }
                jSONObject.put("unit_ids", new JSONArray(arrayList.toString()));
                d2.f13499r = jSONObject;
            }
            th.printStackTrace();
            d2.f13499r = jSONObject;
        }
        d2.f13503v = this.f13503v;
        d2.f13504w = this.f13504w;
        return d2;
    }

    public final a b(List<bv> list) {
        a d2 = d(list);
        d2.f13496o = this.f13496o;
        d2.f13490h = this.f13490h;
        return d2;
    }

    public final a c(List<bv> list) {
        a d2 = d(list);
        d2.f13497p = this.f13497p;
        return d2;
    }

    public final a a(List<bv> list) {
        return d(list);
    }
}
