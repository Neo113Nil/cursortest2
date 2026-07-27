package com.anythink.expressad.videocommon.e;

import android.text.TextUtils;
import com.anythink.expressad.videocommon.b.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static final String f22413a = "reward";

    /* renamed from: c, reason: collision with root package name */
    private static final String f22414c = "RewardSettingManager";

    /* renamed from: e, reason: collision with root package name */
    private static Map<String, d> f22415e = new HashMap(3);

    /* renamed from: f, reason: collision with root package name */
    private static volatile c f22416f;

    /* renamed from: b, reason: collision with root package name */
    public a f22417b;

    /* renamed from: d, reason: collision with root package name */
    private Object f22418d = new Object();

    /* renamed from: com.anythink.expressad.videocommon.e.c$1, reason: invalid class name */
    public class AnonymousClass1 implements i.d {
        public AnonymousClass1() {
        }

        @Override // com.anythink.expressad.videocommon.b.i.a
        public final void a(String str) {
        }

        @Override // com.anythink.expressad.videocommon.b.i.a
        public final void a(String str, String str2) {
        }
    }

    private c() {
        this.f22417b = null;
        this.f22417b = c();
    }

    public static c a() {
        if (f22416f == null) {
            synchronized (c.class) {
                try {
                    if (f22416f == null) {
                        f22416f = new c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f22416f;
    }

    public static a c() {
        a aVar = new a();
        HashMap hashMap = new HashMap(5);
        hashMap.put("1", 1000);
        hashMap.put(b.f22396j, 1000);
        hashMap.put("8", 1000);
        HashMap hashMap2 = new HashMap(3);
        hashMap2.put("1", new com.anythink.expressad.videocommon.c.c("Virtual Item", 1));
        aVar.a(hashMap);
        aVar.b(hashMap2);
        aVar.a();
        aVar.b();
        aVar.d();
        aVar.f();
        aVar.h();
        return aVar;
    }

    public final a b() {
        a aVar = this.f22417b;
        return aVar == null ? c() : aVar;
    }

    private static boolean b(String str) {
        JSONArray optJSONArray;
        try {
            if (!TextUtils.isEmpty(str) && (optJSONArray = new JSONObject(str).optJSONArray("unitSetting")) != null) {
                String optString = optJSONArray.optJSONObject(0).optString("unitId");
                if (optJSONArray.length() > 0) {
                    if (!TextUtils.isEmpty(optString)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Exception e9) {
            e9.printStackTrace();
            return false;
        }
    }

    public final d a(String str, String str2) {
        synchronized (this.f22418d) {
            try {
                String str3 = "reward_" + str + "_" + str2;
                if (f22415e.containsKey(str3)) {
                    return f22415e.get(str3);
                }
                d c9 = d.c(com.anythink.expressad.foundation.a.a.a.a().a(str3));
                f22415e.put(str3, c9);
                return c9;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final d a(String str, String str2, boolean z3) {
        d dVar;
        synchronized (this.f22418d) {
            try {
                String str3 = "reward_" + str + "_" + str2;
                dVar = f22415e.get(str3);
                if (dVar == null) {
                    dVar = a(z3);
                    f22415e.put(str3, dVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }

    public final void a(String str, boolean z3) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String J = a().a(com.anythink.expressad.foundation.b.a.c().f(), str, z3) != null ? d.J() : "";
        if (TextUtils.isEmpty(J) || !TextUtils.isEmpty(i.a().b(J)) || TextUtils.isEmpty(J)) {
            return;
        }
        i.a().b(J, (i.a) new AnonymousClass1());
    }

    private void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        i.a().b(str, (i.a) new AnonymousClass1());
    }

    private static d a(boolean z3) {
        d dVar = new d();
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new com.anythink.expressad.videocommon.c.b(1, 60, null));
            dVar.a((List<com.anythink.expressad.videocommon.c.b>) arrayList);
            dVar.B();
            dVar.z();
            dVar.C();
            dVar.H();
            dVar.E();
            dVar.G();
            dVar.t();
            dVar.u();
            dVar.w();
            dVar.y();
            dVar.s();
            dVar.i();
            dVar.T();
            dVar.g();
            if (z3) {
                dVar.a(5);
            } else {
                dVar.a(-1);
            }
            dVar.d();
            dVar.c();
            dVar.q();
            dVar.N();
            dVar.P();
            ArrayList<Integer> arrayList2 = new ArrayList<>();
            arrayList2.add(4);
            arrayList2.add(6);
            dVar.a(arrayList2);
            return dVar;
        } catch (Exception e9) {
            e9.printStackTrace();
            return dVar;
        }
    }
}
