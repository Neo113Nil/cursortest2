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
    static final String f13840e = "reqId";

    /* renamed from: f, reason: collision with root package name */
    static final String f13841f = "reqDatetime";

    /* renamed from: g, reason: collision with root package name */
    static final String f13842g = "fillOffers";

    /* renamed from: h, reason: collision with root package name */
    static final String f13843h = "bidResps";
    static final String i = "adSourceId";

    /* renamed from: j, reason: collision with root package name */
    static final String f13844j = "price";

    /* renamed from: k, reason: collision with root package name */
    static final String f13845k = "networkFirmId";

    /* renamed from: l, reason: collision with root package name */
    static final String f13846l = "demandType";

    /* renamed from: m, reason: collision with root package name */
    static final String f13847m = "tp_bid_id";

    /* renamed from: n, reason: collision with root package name */
    static final String f13848n = "deal_type";

    /* renamed from: o, reason: collision with root package name */
    static final String f13849o = "deal_id";

    /* renamed from: p, reason: collision with root package name */
    static final String f13850p = "deal_pri";

    /* renamed from: a, reason: collision with root package name */
    String f13851a;

    /* renamed from: b, reason: collision with root package name */
    long f13852b;

    /* renamed from: c, reason: collision with root package name */
    List<a> f13853c = new ArrayList(3);

    /* renamed from: d, reason: collision with root package name */
    List<a> f13854d = new ArrayList(3);

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f13856a;

        /* renamed from: b, reason: collision with root package name */
        public String f13857b;

        /* renamed from: c, reason: collision with root package name */
        public int f13858c;

        /* renamed from: d, reason: collision with root package name */
        public double f13859d;

        /* renamed from: e, reason: collision with root package name */
        public String f13860e;

        /* renamed from: f, reason: collision with root package name */
        public int f13861f;

        /* renamed from: g, reason: collision with root package name */
        public String f13862g;

        /* renamed from: h, reason: collision with root package name */
        public String f13863h;
        public int i;

        /* renamed from: j, reason: collision with root package name */
        public ad f13864j;

        public a() {
        }

        public final synchronized JSONObject a() {
            JSONObject jSONObject;
            jSONObject = new JSONObject();
            try {
                jSONObject.put(bz.i, this.f13857b);
                jSONObject.put("price", this.f13859d);
                jSONObject.put(bz.f13845k, this.f13858c);
                jSONObject.put(bz.f13846l, this.f13856a);
                jSONObject.put(bz.f13847m, this.f13860e);
                if (!TextUtils.isEmpty(this.f13862g)) {
                    jSONObject.put(bz.f13848n, this.f13862g);
                    jSONObject.put(bz.f13850p, this.i);
                }
                if (!TextUtils.isEmpty(this.f13863h)) {
                    jSONObject.put(bz.f13849o, this.f13863h);
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
            this.f13857b = bvVar.z();
            if (adVar != null) {
                this.f13859d = adVar.getPrice();
            } else {
                this.f13859d = bvVar.D();
            }
            this.f13858c = bvVar.g();
            int q8 = bvVar.q();
            if (q8 != 0) {
                if (q8 != 1) {
                    if (q8 == 2) {
                        this.f13856a = 3;
                    } else if (q8 == 3) {
                        this.f13856a = 4;
                    } else if (q8 != 4 && q8 != 7) {
                    }
                    if (35 == bvVar.g()) {
                        this.f13856a = 2;
                    }
                    this.f13860e = adVar != null ? adVar.f13425g : "";
                    this.f13864j = adVar;
                    this.f13862g = adVar != null ? adVar.u() : "";
                    this.f13861f = adVar != null ? adVar.t() : 0;
                    this.f13863h = adVar != null ? adVar.v() : "";
                    this.i = adVar != null ? adVar.w() : 0;
                }
                this.f13856a = 2;
                if (35 == bvVar.g()) {
                }
                this.f13860e = adVar != null ? adVar.f13425g : "";
                this.f13864j = adVar;
                this.f13862g = adVar != null ? adVar.u() : "";
                this.f13861f = adVar != null ? adVar.t() : 0;
                this.f13863h = adVar != null ? adVar.v() : "";
                this.i = adVar != null ? adVar.w() : 0;
            }
            this.f13856a = 1;
            if (35 == bvVar.g()) {
            }
            this.f13860e = adVar != null ? adVar.f13425g : "";
            this.f13864j = adVar;
            this.f13862g = adVar != null ? adVar.u() : "";
            this.f13861f = adVar != null ? adVar.t() : 0;
            this.f13863h = adVar != null ? adVar.v() : "";
            this.i = adVar != null ? adVar.w() : 0;
        }
    }

    private synchronized long c() {
        return this.f13852b;
    }

    private synchronized JSONArray d() {
        return c(this.f13853c);
    }

    private synchronized JSONArray e() {
        return c(this.f13854d);
    }

    public final synchronized JSONObject a() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            jSONObject.put(f13840e, this.f13851a);
            jSONObject.put(f13841f, this.f13852b);
            jSONObject.put(f13842g, d());
            jSONObject.put(f13843h, e());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    public final synchronized void b(String str) {
        this.f13851a = str;
    }

    private synchronized List<a> c(String str) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONArray jSONArray = new JSONArray(str);
                int length = jSONArray.length();
                for (int i6 = 0; i6 < length; i6++) {
                    a aVar = new a();
                    JSONObject jSONObject = new JSONObject(jSONArray.optString(i6));
                    aVar.f13857b = jSONObject.getString(i);
                    aVar.f13859d = jSONObject.getDouble("price");
                    aVar.f13858c = jSONObject.getInt(f13845k);
                    aVar.f13856a = jSONObject.getInt(f13846l);
                    if (jSONObject.has(f13847m)) {
                        aVar.f13860e = jSONObject.getString(f13847m);
                    }
                    aVar.f13862g = jSONObject.optString(f13848n);
                    aVar.f13863h = jSONObject.optString(f13849o);
                    aVar.i = jSONObject.optInt(f13850p);
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
        this.f13854d = list;
    }

    public final synchronized String b() {
        return this.f13851a;
    }

    public final synchronized void b(a aVar) {
        a(this.f13854d, aVar);
    }

    public static bz a(String str) {
        bz bzVar = new bz();
        try {
            JSONObject jSONObject = new JSONObject(str);
            bzVar.b(jSONObject.getString(f13840e));
            bzVar.a(jSONObject.getLong(f13841f));
            bzVar.a(bzVar.c(jSONObject.getString(f13842g)));
            bzVar.b(bzVar.c(jSONObject.getString(f13843h)));
            return bzVar;
        } catch (Throwable th) {
            th.printStackTrace();
            return bzVar;
        }
    }

    public final synchronized void a(long j6) {
        this.f13852b = j6;
    }

    private synchronized void a(List<a> list) {
        this.f13853c = list;
    }

    public final synchronized void a(a aVar) {
        a(this.f13853c, aVar);
    }

    private synchronized void a(List<a> list, a aVar) {
        if (aVar != null) {
            if (list.size() == 0) {
                list.add(aVar);
                return;
            }
            int i6 = 0;
            while (true) {
                if (i6 >= list.size()) {
                    i6 = -1;
                    break;
                } else if (com.anythink.core.common.v.l.a(aVar, list.get(i6)) < 0) {
                    break;
                } else {
                    i6++;
                }
            }
            if (i6 != -1) {
                list.add(i6, aVar);
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
