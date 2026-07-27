package com.anythink.core.common.h;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class bz {

    /* renamed from: e, reason: collision with root package name */
    static final String f13997e = "reqId";

    /* renamed from: f, reason: collision with root package name */
    static final String f13998f = "reqDatetime";

    /* renamed from: g, reason: collision with root package name */
    static final String f13999g = "fillOffers";

    /* renamed from: h, reason: collision with root package name */
    static final String f14000h = "bidResps";
    static final String i = "adSourceId";

    /* renamed from: j, reason: collision with root package name */
    static final String f14001j = "price";

    /* renamed from: k, reason: collision with root package name */
    static final String f14002k = "networkFirmId";

    /* renamed from: l, reason: collision with root package name */
    static final String f14003l = "demandType";

    /* renamed from: m, reason: collision with root package name */
    static final String f14004m = "tp_bid_id";

    /* renamed from: n, reason: collision with root package name */
    static final String f14005n = "deal_type";

    /* renamed from: o, reason: collision with root package name */
    static final String f14006o = "deal_id";

    /* renamed from: p, reason: collision with root package name */
    static final String f14007p = "deal_pri";

    /* renamed from: a, reason: collision with root package name */
    String f14008a;

    /* renamed from: b, reason: collision with root package name */
    long f14009b;

    /* renamed from: c, reason: collision with root package name */
    List<a> f14010c = new ArrayList(3);

    /* renamed from: d, reason: collision with root package name */
    List<a> f14011d = new ArrayList(3);

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f14013a;

        /* renamed from: b, reason: collision with root package name */
        public String f14014b;

        /* renamed from: c, reason: collision with root package name */
        public int f14015c;

        /* renamed from: d, reason: collision with root package name */
        public double f14016d;

        /* renamed from: e, reason: collision with root package name */
        public String f14017e;

        /* renamed from: f, reason: collision with root package name */
        public int f14018f;

        /* renamed from: g, reason: collision with root package name */
        public String f14019g;

        /* renamed from: h, reason: collision with root package name */
        public String f14020h;
        public int i;

        /* renamed from: j, reason: collision with root package name */
        public ad f14021j;

        public a() {
        }

        public final synchronized JSONObject a() {
            JSONObject jSONObject;
            jSONObject = new JSONObject();
            try {
                jSONObject.put(bz.i, this.f14014b);
                jSONObject.put("price", this.f14016d);
                jSONObject.put(bz.f14002k, this.f14015c);
                jSONObject.put(bz.f14003l, this.f14013a);
                jSONObject.put(bz.f14004m, this.f14017e);
                if (!TextUtils.isEmpty(this.f14019g)) {
                    jSONObject.put(bz.f14005n, this.f14019g);
                    jSONObject.put(bz.f14007p, this.i);
                }
                if (!TextUtils.isEmpty(this.f14020h)) {
                    jSONObject.put(bz.f14006o, this.f14020h);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            return jSONObject;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
        
            if (r0 != 8) goto L23;
         */
        /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0078  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0054  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(bv bvVar, ad adVar) {
            this.f14014b = bvVar.z();
            if (adVar != null) {
                this.f14016d = adVar.getPrice();
            } else {
                this.f14016d = bvVar.D();
            }
            this.f14015c = bvVar.g();
            int q6 = bvVar.q();
            if (q6 != 0) {
                if (q6 != 1) {
                    if (q6 == 2) {
                        this.f14013a = 3;
                    } else if (q6 == 3) {
                        this.f14013a = 4;
                    } else if (q6 != 4 && q6 != 7) {
                    }
                    if (35 == bvVar.g()) {
                        this.f14013a = 2;
                    }
                    this.f14017e = adVar != null ? adVar.f13582g : "";
                    this.f14021j = adVar;
                    this.f14019g = adVar != null ? adVar.u() : "";
                    this.f14018f = adVar != null ? adVar.t() : 0;
                    this.f14020h = adVar != null ? adVar.v() : "";
                    this.i = adVar != null ? adVar.w() : 0;
                }
                this.f14013a = 2;
                if (35 == bvVar.g()) {
                }
                this.f14017e = adVar != null ? adVar.f13582g : "";
                this.f14021j = adVar;
                this.f14019g = adVar != null ? adVar.u() : "";
                this.f14018f = adVar != null ? adVar.t() : 0;
                this.f14020h = adVar != null ? adVar.v() : "";
                this.i = adVar != null ? adVar.w() : 0;
            }
            this.f14013a = 1;
            if (35 == bvVar.g()) {
            }
            this.f14017e = adVar != null ? adVar.f13582g : "";
            this.f14021j = adVar;
            this.f14019g = adVar != null ? adVar.u() : "";
            this.f14018f = adVar != null ? adVar.t() : 0;
            this.f14020h = adVar != null ? adVar.v() : "";
            this.i = adVar != null ? adVar.w() : 0;
        }
    }

    private synchronized long c() {
        return this.f14009b;
    }

    private synchronized JSONArray d() {
        return c(this.f14010c);
    }

    private synchronized JSONArray e() {
        return c(this.f14011d);
    }

    public final synchronized JSONObject a() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            jSONObject.put(f13997e, this.f14008a);
            jSONObject.put(f13998f, this.f14009b);
            jSONObject.put(f13999g, d());
            jSONObject.put(f14000h, e());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    public final synchronized void b(String str) {
        this.f14008a = str;
    }

    private synchronized List<a> c(String str) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONArray jSONArray = new JSONArray(str);
                int length = jSONArray.length();
                for (int i4 = 0; i4 < length; i4++) {
                    a aVar = new a();
                    JSONObject jSONObject = new JSONObject(jSONArray.optString(i4));
                    aVar.f14014b = jSONObject.getString(i);
                    aVar.f14016d = jSONObject.getDouble("price");
                    aVar.f14015c = jSONObject.getInt(f14002k);
                    aVar.f14013a = jSONObject.getInt(f14003l);
                    if (jSONObject.has(f14004m)) {
                        aVar.f14017e = jSONObject.getString(f14004m);
                    }
                    aVar.f14019g = jSONObject.optString(f14005n);
                    aVar.f14020h = jSONObject.optString(f14006o);
                    aVar.i = jSONObject.optInt(f14007p);
                    arrayList.add(aVar);
                }
                Collections.sort(arrayList, new Comparator<a>() { // from class: com.anythink.core.common.h.bz.1
                    private static int a(a aVar2, a aVar3) {
                        return com.anythink.core.common.v.l.a(aVar2, aVar3);
                    }

                    @Override // java.util.Comparator
                    public final /* synthetic */ int compare(a aVar2, a aVar3) {
                        return com.anythink.core.common.v.l.a(aVar2, aVar3);
                    }
                });
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return arrayList;
    }

    private synchronized void b(List<a> list) {
        this.f14011d = list;
    }

    public final synchronized String b() {
        return this.f14008a;
    }

    public final synchronized void b(a aVar) {
        a(this.f14011d, aVar);
    }

    public static bz a(String str) {
        bz bzVar = new bz();
        try {
            JSONObject jSONObject = new JSONObject(str);
            bzVar.b(jSONObject.getString(f13997e));
            bzVar.a(jSONObject.getLong(f13998f));
            bzVar.a(bzVar.c(jSONObject.getString(f13999g)));
            bzVar.b(bzVar.c(jSONObject.getString(f14000h)));
            return bzVar;
        } catch (Throwable th) {
            th.printStackTrace();
            return bzVar;
        }
    }

    public final synchronized void a(long j9) {
        this.f14009b = j9;
    }

    private synchronized void a(List<a> list) {
        this.f14010c = list;
    }

    public final synchronized void a(a aVar) {
        a(this.f14010c, aVar);
    }

    private synchronized void a(List<a> list, a aVar) {
        if (aVar != null) {
            if (list.size() == 0) {
                list.add(aVar);
                return;
            }
            int i4 = 0;
            while (true) {
                if (i4 >= list.size()) {
                    i4 = -1;
                    break;
                } else if (com.anythink.core.common.v.l.a(aVar, list.get(i4)) < 0) {
                    break;
                } else {
                    i4++;
                }
            }
            if (i4 != -1) {
                list.add(i4, aVar);
                return;
            }
            list.add(aVar);
        }
    }

    private synchronized JSONArray c(List<a> list) {
        JSONArray jSONArray;
        jSONArray = new JSONArray();
        if (list != null) {
            Iterator<a> it = list.iterator();
            while (it.hasNext()) {
                try {
                    jSONArray.put(it.next().a());
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
        return jSONArray;
    }
}
