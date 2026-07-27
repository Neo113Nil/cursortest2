package com.anythink.core.c;

import android.text.TextUtils;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.common.d.j;
import com.anythink.core.common.d.t;
import com.anythink.core.common.d.u;
import com.anythink.core.common.h.bv;
import com.anythink.core.common.h.n;
import com.anythink.core.common.u.e;
import com.anythink.core.common.v.af;
import com.anythink.core.d.l;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    private static volatile a f12156e;

    /* renamed from: a, reason: collision with root package name */
    final String f12157a = "a";

    /* renamed from: b, reason: collision with root package name */
    private final String f12158b = "sv_request_id";

    /* renamed from: c, reason: collision with root package name */
    private final String f12159c = "sv_price";

    /* renamed from: d, reason: collision with root package name */
    private Map<String, LinkedList<C0072a>> f12160d = new HashMap();

    /* renamed from: com.anythink.core.c.a$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f12161a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LinkedList f12162b;

        public AnonymousClass1(String str, LinkedList linkedList) {
            this.f12161a = str;
            this.f12162b = linkedList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            String str;
            if (TextUtils.isEmpty(this.f12161a) || this.f12162b == null) {
                return;
            }
            try {
                JSONArray jSONArray = new JSONArray();
                Iterator it = this.f12162b.iterator();
                while (it.hasNext()) {
                    C0072a c0072a = (C0072a) it.next();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("sv_request_id", c0072a.f12164a);
                    jSONObject.put("sv_price", c0072a.f12165b);
                    jSONArray.put(jSONObject);
                }
                str = jSONArray.toString();
            } catch (Throwable unused) {
                str = "";
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            af.b(t.b().g(), u.b.f13015m, this.f12161a, str);
        }
    }

    /* renamed from: com.anythink.core.c.a$a, reason: collision with other inner class name */
    public class C0072a {

        /* renamed from: a, reason: collision with root package name */
        public String f12164a;

        /* renamed from: b, reason: collision with root package name */
        public double f12165b;

        public C0072a(String str, double d2) {
            this.f12164a = str;
            this.f12165b = d2;
        }

        public final String toString() {
            return "ProverbPriceBean{requestId='" + this.f12164a + "', impPrice=" + this.f12165b + '}';
        }
    }

    private a() {
    }

    public static a a() {
        if (f12156e == null) {
            synchronized (b.class) {
                try {
                    if (f12156e == null) {
                        f12156e = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f12156e;
    }

    private LinkedList<C0072a> b(String str) {
        try {
            String c4 = af.c(t.b().g(), u.b.f13015m, str, "");
            if (TextUtils.isEmpty(c4)) {
                return null;
            }
            LinkedList<C0072a> linkedList = new LinkedList<>();
            try {
                JSONArray jSONArray = new JSONArray(c4);
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        linkedList.add(new C0072a(optJSONObject.optString("sv_request_id"), optJSONObject.optDouble("sv_price", 0.0d)));
                    }
                }
                return linkedList;
            } catch (Throwable unused) {
                return linkedList;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    private String c(String str) {
        LinkedList<C0072a> a9 = a(str);
        if (a9.size() <= 0) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (C0072a c0072a : a9) {
                jSONObject.put(c0072a.f12164a, c0072a.f12165b);
            }
            return jSONObject.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0087 A[Catch: all -> 0x00e4, TryCatch #0 {all -> 0x00e4, blocks: (B:9:0x0029, B:14:0x0038, B:16:0x003e, B:18:0x0044, B:19:0x0055, B:23:0x0087, B:26:0x00c3, B:27:0x00ca, B:29:0x00d1, B:36:0x0058, B:38:0x005e, B:41:0x0079, B:43:0x0030), top: B:8:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d1 A[Catch: all -> 0x00e4, TRY_LEAVE, TryCatch #0 {all -> 0x00e4, blocks: (B:9:0x0029, B:14:0x0038, B:16:0x003e, B:18:0x0044, B:19:0x0055, B:23:0x0087, B:26:0x00c3, B:27:0x00ca, B:29:0x00d1, B:36:0x0058, B:38:0x005e, B:41:0x0079, B:43:0x0030), top: B:8:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(n nVar, bv bvVar) {
        l b9;
        double d2;
        n nVar2;
        l lVar;
        double parseDouble;
        double d3;
        double L8;
        if (nVar == null || bvVar == null || (b9 = com.anythink.core.d.n.a(t.b().g()).b(nVar.aI())) == null || bvVar.az() != 1) {
            return;
        }
        try {
            Map<String, Object> h9 = nVar.h();
            if (h9 != null) {
                h9.toString();
            }
            if (h9 != null) {
                if (bvVar.g() == 2 && h9.containsKey("value_micros")) {
                    parseDouble = Double.parseDouble(h9.get("value_micros").toString());
                    d3 = 1000.0d;
                } else if (h9.containsKey(ATAdConst.NETWORK_CUSTOM_KEY.NETWORK_ECPM)) {
                    parseDouble = Double.parseDouble(h9.get(ATAdConst.NETWORK_CUSTOM_KEY.NETWORK_ECPM).toString());
                    d3 = 100.0d;
                    if (j.C0075j.f12643b.equalsIgnoreCase(bvVar.au())) {
                        L8 = (parseDouble / 100.0d) * b9.L();
                        d2 = L8;
                        if (d2 == -1.0d) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(bvVar.g());
                            String sb2 = sb.toString();
                            String z8 = bvVar.z();
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(bvVar.at());
                            String sb4 = sb3.toString();
                            lVar = b9;
                            nVar2 = nVar;
                            e.a(nVar2, lVar, sb2, z8, sb4, a(bvVar.z(), b9.t()) <= 0.0d ? 1 : 2);
                        } else {
                            nVar2 = nVar;
                            lVar = b9;
                        }
                        nVar2.d(d2);
                        if (d2 > 0.0d) {
                            bvVar.f(d2);
                            a(bvVar.z(), nVar2.aJ(), d2, lVar.t());
                            return;
                        }
                        return;
                    }
                }
                L8 = parseDouble / d3;
                d2 = L8;
                if (d2 == -1.0d) {
                }
                nVar2.d(d2);
                if (d2 > 0.0d) {
                }
            }
            d2 = -1.0d;
            if (d2 == -1.0d) {
            }
            nVar2.d(d2);
            if (d2 > 0.0d) {
            }
        } catch (Throwable unused) {
        }
    }

    public final void a(n nVar, List<bv> list, l lVar) {
        ListIterator<bv> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            bv next = listIterator.next();
            if (next.az() == 1) {
                int t9 = lVar.t();
                double a9 = a(next.z(), t9);
                next.z();
                if (a9 > 0.0d) {
                    next.aB();
                    next.b(a9);
                    next.e(a9);
                    next.c(nVar.u() * a9);
                    next.i("estimated");
                    StringBuilder sb = new StringBuilder();
                    sb.append(next.g());
                    e.a(nVar, lVar, sb.toString(), next.z(), String.valueOf(a9), String.valueOf(t9), c(next.z()));
                }
            }
        }
    }

    private synchronized void a(String str, String str2, double d2, int i) {
        try {
            LinkedList<C0072a> a9 = a(str);
            if (a9 != null) {
                a9.toString();
            }
            if (a9 == null) {
                return;
            }
            if (i == 0) {
                a9.clear();
            } else {
                if (a9.size() >= i - 1) {
                    int size = (a9.size() - i) + 1;
                    for (int i4 = 0; i4 < size; i4++) {
                        a9.removeLast();
                    }
                }
                if (a9.size() < i) {
                    a9.addFirst(new C0072a(str2, d2));
                }
            }
            a9.toString();
            com.anythink.core.common.v.b.b.a().a(new AnonymousClass1(str, a9));
        } finally {
        }
    }

    private double a(String str, int i) {
        LinkedList<C0072a> a9 = a(str);
        if (a9 != null) {
            a9.toString();
        }
        if (a9 == null || a9.size() == 0 || i == 0) {
            return -1.0d;
        }
        Iterator<C0072a> it = a9.subList(0, Math.min(i, a9.size())).iterator();
        double d2 = 0.0d;
        while (it.hasNext()) {
            d2 += it.next().f12165b;
        }
        return d2 / r5.size();
    }

    private synchronized LinkedList<C0072a> a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            LinkedList<C0072a> linkedList = this.f12160d.get(str);
            if (linkedList == null) {
                linkedList = b(str);
                if (linkedList == null) {
                    linkedList = new LinkedList<>();
                }
                this.f12160d.put(str, linkedList);
            }
            return linkedList;
        } catch (Throwable th) {
            throw th;
        }
    }

    private void a(String str, LinkedList<C0072a> linkedList) {
        com.anythink.core.common.v.b.b.a().a(new AnonymousClass1(str, linkedList));
    }
}
