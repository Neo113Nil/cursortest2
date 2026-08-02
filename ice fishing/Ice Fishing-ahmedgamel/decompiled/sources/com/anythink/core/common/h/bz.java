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
    static final String f14626e = "reqId";

    /* renamed from: f, reason: collision with root package name */
    static final String f14627f = "reqDatetime";

    /* renamed from: g, reason: collision with root package name */
    static final String f14628g = "fillOffers";

    /* renamed from: h, reason: collision with root package name */
    static final String f14629h = "bidResps";
    static final String i = "adSourceId";

    /* renamed from: j, reason: collision with root package name */
    static final String f14630j = "price";

    /* renamed from: k, reason: collision with root package name */
    static final String f14631k = "networkFirmId";

    /* renamed from: l, reason: collision with root package name */
    static final String f14632l = "demandType";

    /* renamed from: m, reason: collision with root package name */
    static final String f14633m = "tp_bid_id";

    /* renamed from: n, reason: collision with root package name */
    static final String f14634n = "deal_type";

    /* renamed from: o, reason: collision with root package name */
    static final String f14635o = "deal_id";

    /* renamed from: p, reason: collision with root package name */
    static final String f14636p = "deal_pri";

    /* renamed from: a, reason: collision with root package name */
    String f14637a;

    /* renamed from: b, reason: collision with root package name */
    long f14638b;

    /* renamed from: c, reason: collision with root package name */
    List<a> f14639c = new ArrayList(3);

    /* renamed from: d, reason: collision with root package name */
    List<a> f14640d = new ArrayList(3);

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f14642a;

        /* renamed from: b, reason: collision with root package name */
        public String f14643b;

        /* renamed from: c, reason: collision with root package name */
        public int f14644c;

        /* renamed from: d, reason: collision with root package name */
        public double f14645d;

        /* renamed from: e, reason: collision with root package name */
        public String f14646e;

        /* renamed from: f, reason: collision with root package name */
        public int f14647f;

        /* renamed from: g, reason: collision with root package name */
        public String f14648g;

        /* renamed from: h, reason: collision with root package name */
        public String f14649h;
        public int i;

        /* renamed from: j, reason: collision with root package name */
        public ad f14650j;

        public a() {
        }

        public final synchronized JSONObject a() {
            JSONObject jSONObject;
            jSONObject = new JSONObject();
            try {
                jSONObject.put(bz.i, this.f14643b);
                jSONObject.put("price", this.f14645d);
                jSONObject.put(bz.f14631k, this.f14644c);
                jSONObject.put(bz.f14632l, this.f14642a);
                jSONObject.put(bz.f14633m, this.f14646e);
                if (!TextUtils.isEmpty(this.f14648g)) {
                    jSONObject.put(bz.f14634n, this.f14648g);
                    jSONObject.put(bz.f14636p, this.i);
                }
                if (!TextUtils.isEmpty(this.f14649h)) {
                    jSONObject.put(bz.f14635o, this.f14649h);
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
            this.f14643b = bvVar.z();
            if (adVar != null) {
                this.f14645d = adVar.getPrice();
            } else {
                this.f14645d = bvVar.D();
            }
            this.f14644c = bvVar.g();
            int q8 = bvVar.q();
            if (q8 != 0) {
                if (q8 != 1) {
                    if (q8 == 2) {
                        this.f14642a = 3;
                    } else if (q8 == 3) {
                        this.f14642a = 4;
                    } else if (q8 != 4 && q8 != 7) {
                    }
                    if (35 == bvVar.g()) {
                        this.f14642a = 2;
                    }
                    this.f14646e = adVar != null ? adVar.f14211g : "";
                    this.f14650j = adVar;
                    this.f14648g = adVar != null ? adVar.u() : "";
                    this.f14647f = adVar != null ? adVar.t() : 0;
                    this.f14649h = adVar != null ? adVar.v() : "";
                    this.i = adVar != null ? adVar.w() : 0;
                }
                this.f14642a = 2;
                if (35 == bvVar.g()) {
                }
                this.f14646e = adVar != null ? adVar.f14211g : "";
                this.f14650j = adVar;
                this.f14648g = adVar != null ? adVar.u() : "";
                this.f14647f = adVar != null ? adVar.t() : 0;
                this.f14649h = adVar != null ? adVar.v() : "";
                this.i = adVar != null ? adVar.w() : 0;
            }
            this.f14642a = 1;
            if (35 == bvVar.g()) {
            }
            this.f14646e = adVar != null ? adVar.f14211g : "";
            this.f14650j = adVar;
            this.f14648g = adVar != null ? adVar.u() : "";
            this.f14647f = adVar != null ? adVar.t() : 0;
            this.f14649h = adVar != null ? adVar.v() : "";
            this.i = adVar != null ? adVar.w() : 0;
        }
    }

    private synchronized long c() {
        return this.f14638b;
    }

    private synchronized JSONArray d() {
        return c(this.f14639c);
    }

    private synchronized JSONArray e() {
        return c(this.f14640d);
    }

    public final synchronized JSONObject a() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            jSONObject.put(f14626e, this.f14637a);
            jSONObject.put(f14627f, this.f14638b);
            jSONObject.put(f14628g, d());
            jSONObject.put(f14629h, e());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    public final synchronized void b(String str) {
        this.f14637a = str;
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
                    aVar.f14643b = jSONObject.getString(i);
                    aVar.f14645d = jSONObject.getDouble("price");
                    aVar.f14644c = jSONObject.getInt(f14631k);
                    aVar.f14642a = jSONObject.getInt(f14632l);
                    if (jSONObject.has(f14633m)) {
                        aVar.f14646e = jSONObject.getString(f14633m);
                    }
                    aVar.f14648g = jSONObject.optString(f14634n);
                    aVar.f14649h = jSONObject.optString(f14635o);
                    aVar.i = jSONObject.optInt(f14636p);
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
        this.f14640d = list;
    }

    public final synchronized String b() {
        return this.f14637a;
    }

    public final synchronized void b(a aVar) {
        a(this.f14640d, aVar);
    }

    public static bz a(String str) {
        bz bzVar = new bz();
        try {
            JSONObject jSONObject = new JSONObject(str);
            bzVar.b(jSONObject.getString(f14626e));
            bzVar.a(jSONObject.getLong(f14627f));
            bzVar.a(bzVar.c(jSONObject.getString(f14628g)));
            bzVar.b(bzVar.c(jSONObject.getString(f14629h)));
            return bzVar;
        } catch (Throwable th) {
            th.printStackTrace();
            return bzVar;
        }
    }

    public final synchronized void a(long j6) {
        this.f14638b = j6;
    }

    private synchronized void a(List<a> list) {
        this.f14639c = list;
    }

    public final synchronized void a(a aVar) {
        a(this.f14639c, aVar);
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
