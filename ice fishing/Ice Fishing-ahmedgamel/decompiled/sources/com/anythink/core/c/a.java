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
    private static volatile a f12785e;

    /* renamed from: a, reason: collision with root package name */
    final String f12786a = "a";

    /* renamed from: b, reason: collision with root package name */
    private final String f12787b = "sv_request_id";

    /* renamed from: c, reason: collision with root package name */
    private final String f12788c = "sv_price";

    /* renamed from: d, reason: collision with root package name */
    private Map<String, LinkedList<C0073a>> f12789d = new HashMap();

    /* renamed from: com.anythink.core.c.a$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f12790a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LinkedList f12791b;

        public AnonymousClass1(String str, LinkedList linkedList) {
            this.f12790a = str;
            this.f12791b = linkedList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            String str;
            if (TextUtils.isEmpty(this.f12790a) || this.f12791b == null) {
                return;
            }
            try {
                JSONArray jSONArray = new JSONArray();
                Iterator it = this.f12791b.iterator();
                while (it.hasNext()) {
                    C0073a c0073a = (C0073a) it.next();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("sv_request_id", c0073a.f12793a);
                    jSONObject.put("sv_price", c0073a.f12794b);
                    jSONArray.put(jSONObject);
                }
                str = jSONArray.toString();
            } catch (Throwable unused) {
                str = "";
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            af.b(t.b().g(), u.b.f13644m, this.f12790a, str);
        }
    }

    /* renamed from: com.anythink.core.c.a$a, reason: collision with other inner class name */
    public class C0073a {

        /* renamed from: a, reason: collision with root package name */
        public String f12793a;

        /* renamed from: b, reason: collision with root package name */
        public double f12794b;

        public C0073a(String str, double d9) {
            this.f12793a = str;
            this.f12794b = d9;
        }

        public final String toString() {
            return "ProverbPriceBean{requestId='" + this.f12793a + "', impPrice=" + this.f12794b + '}';
        }
    }

    private a() {
    }

    public static a a() {
        if (f12785e == null) {
            synchronized (b.class) {
                try {
                    if (f12785e == null) {
                        f12785e = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f12785e;
    }

    private LinkedList<C0073a> b(String str) {
        try {
            String c9 = af.c(t.b().g(), u.b.f13644m, str, "");
            if (TextUtils.isEmpty(c9)) {
                return null;
            }
            LinkedList<C0073a> linkedList = new LinkedList<>();
            try {
                JSONArray jSONArray = new JSONArray(c9);
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        linkedList.add(new C0073a(optJSONObject.optString("sv_request_id"), optJSONObject.optDouble("sv_price", 0.0d)));
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
        LinkedList<C0073a> a9 = a(str);
        if (a9.size() <= 0) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (C0073a c0073a : a9) {
                jSONObject.put(c0073a.f12793a, c0073a.f12794b);
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
        double d9;
        n nVar2;
        l lVar;
        double parseDouble;
        double d10;
        double L2;
        if (nVar == null || bvVar == null || (b9 = com.anythink.core.d.n.a(t.b().g()).b(nVar.aI())) == null || bvVar.az() != 1) {
            return;
        }
        try {
            Map<String, Object> h3 = nVar.h();
            if (h3 != null) {
                h3.toString();
            }
            if (h3 != null) {
                if (bvVar.g() == 2 && h3.containsKey("value_micros")) {
                    parseDouble = Double.parseDouble(h3.get("value_micros").toString());
                    d10 = 1000.0d;
                } else if (h3.containsKey(ATAdConst.NETWORK_CUSTOM_KEY.NETWORK_ECPM)) {
                    parseDouble = Double.parseDouble(h3.get(ATAdConst.NETWORK_CUSTOM_KEY.NETWORK_ECPM).toString());
                    d10 = 100.0d;
                    if (j.C0076j.f13272b.equalsIgnoreCase(bvVar.au())) {
                        L2 = (parseDouble / 100.0d) * b9.L();
                        d9 = L2;
                        if (d9 == -1.0d) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(bvVar.g());
                            String sb2 = sb.toString();
                            String z6 = bvVar.z();
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(bvVar.at());
                            String sb4 = sb3.toString();
                            lVar = b9;
                            nVar2 = nVar;
                            e.a(nVar2, lVar, sb2, z6, sb4, a(bvVar.z(), b9.t()) <= 0.0d ? 1 : 2);
                        } else {
                            nVar2 = nVar;
                            lVar = b9;
                        }
                        nVar2.d(d9);
                        if (d9 > 0.0d) {
                            bvVar.f(d9);
                            a(bvVar.z(), nVar2.aJ(), d9, lVar.t());
                            return;
                        }
                        return;
                    }
                }
                L2 = parseDouble / d10;
                d9 = L2;
                if (d9 == -1.0d) {
                }
                nVar2.d(d9);
                if (d9 > 0.0d) {
                }
            }
            d9 = -1.0d;
            if (d9 == -1.0d) {
            }
            nVar2.d(d9);
            if (d9 > 0.0d) {
            }
        } catch (Throwable unused) {
        }
    }

    public final void a(n nVar, List<bv> list, l lVar) {
        ListIterator<bv> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            bv next = listIterator.next();
            if (next.az() == 1) {
                int t6 = lVar.t();
                double a9 = a(next.z(), t6);
                next.z();
                if (a9 > 0.0d) {
                    next.aB();
                    next.b(a9);
                    next.e(a9);
                    next.c(nVar.u() * a9);
                    next.i("estimated");
                    StringBuilder sb = new StringBuilder();
                    sb.append(next.g());
                    e.a(nVar, lVar, sb.toString(), next.z(), String.valueOf(a9), String.valueOf(t6), c(next.z()));
                }
            }
        }
    }

    private synchronized void a(String str, String str2, double d9, int i) {
        try {
            LinkedList<C0073a> a9 = a(str);
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
                    a9.addFirst(new C0073a(str2, d9));
                }
            }
            a9.toString();
            com.anythink.core.common.v.b.b.a().a(new AnonymousClass1(str, a9));
        } finally {
        }
    }

    private double a(String str, int i) {
        LinkedList<C0073a> a9 = a(str);
        if (a9 != null) {
            a9.toString();
        }
        if (a9 == null || a9.size() == 0 || i == 0) {
            return -1.0d;
        }
        Iterator<C0073a> it = a9.subList(0, Math.min(i, a9.size())).iterator();
        double d9 = 0.0d;
        while (it.hasNext()) {
            d9 += it.next().f12794b;
        }
        return d9 / r5.size();
    }

    private synchronized LinkedList<C0073a> a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            LinkedList<C0073a> linkedList = this.f12789d.get(str);
            if (linkedList == null) {
                linkedList = b(str);
                if (linkedList == null) {
                    linkedList = new LinkedList<>();
                }
                this.f12789d.put(str, linkedList);
            }
            return linkedList;
        } catch (Throwable th) {
            throw th;
        }
    }

    private void a(String str, LinkedList<C0073a> linkedList) {
        com.anythink.core.common.v.b.b.a().a(new AnonymousClass1(str, linkedList));
    }
}
