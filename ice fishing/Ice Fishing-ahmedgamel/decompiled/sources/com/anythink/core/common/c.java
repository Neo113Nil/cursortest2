package com.anythink.core.common;

import android.text.TextUtils;
import com.anythink.core.api.AdError;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.common.h.au;
import com.anythink.core.common.h.bv;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static String f13031a = "c";

    /* renamed from: f, reason: collision with root package name */
    private static volatile c f13032f;

    /* renamed from: b, reason: collision with root package name */
    ConcurrentHashMap<String, Long> f13033b = new ConcurrentHashMap<>();

    /* renamed from: c, reason: collision with root package name */
    ConcurrentHashMap<String, Long> f13034c = new ConcurrentHashMap<>();

    /* renamed from: d, reason: collision with root package name */
    Map<String, a> f13035d = new ConcurrentHashMap(5);

    /* renamed from: e, reason: collision with root package name */
    Map<String, au> f13036e;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        String f13039a;

        /* renamed from: b, reason: collision with root package name */
        String f13040b;

        /* renamed from: c, reason: collision with root package name */
        long f13041c;
    }

    private c() {
    }

    public static c a() {
        if (f13032f == null) {
            synchronized (c.class) {
                try {
                    if (f13032f == null) {
                        f13032f = new c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f13032f;
    }

    public final boolean b(bv bvVar) {
        if (bvVar.q() == 7) {
            return false;
        }
        if (bvVar.N() == 0) {
            return false;
        }
        return bvVar.N() + (this.f13034c.get(bvVar.z()) != null ? this.f13034c.get(bvVar.z()).longValue() : 0L) >= System.currentTimeMillis();
    }

    private void b(String str, long j6) {
        this.f13034c.put(str, Long.valueOf(j6));
    }

    public final boolean a(bv bvVar) {
        if (bvVar.M() == 0) {
            return false;
        }
        return bvVar.M() + (this.f13033b.get(bvVar.z()) != null ? this.f13033b.get(bvVar.z()).longValue() : 0L) >= System.currentTimeMillis();
    }

    public final void b(String str) {
        JSONObject optJSONObject;
        this.f13036e = new ConcurrentHashMap(3);
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                try {
                    String next = keys.next();
                    if (!TextUtils.isEmpty(next) && (optJSONObject = jSONObject.optJSONObject(next)) != null) {
                        this.f13036e.put(next, new au(optJSONObject));
                    }
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
        }
    }

    public final void a(String str, long j6) {
        this.f13033b.put(str, Long.valueOf(j6));
    }

    public final long a(String str) {
        Long l9 = this.f13034c.get(str);
        if (l9 != null) {
            return l9.longValue();
        }
        return 0L;
    }

    public final void a(String str, long j6, AdError adError) {
        if (TextUtils.equals(adError.getCode(), ErrorCode.noADError)) {
            a aVar = this.f13035d.get(str);
            if (aVar == null) {
                aVar = new a();
            }
            aVar.f13039a = adError.getPlatformCode();
            aVar.f13040b = adError.getPlatformMSG();
            aVar.f13041c = j6;
            this.f13035d.put(str, aVar);
        }
    }

    public final boolean a(int i, com.anythink.core.d.l lVar, bv bvVar) {
        int i4;
        if (this.f13036e == null) {
            return false;
        }
        List<Integer> z6 = lVar.z();
        if (z6.isEmpty()) {
            return false;
        }
        a aVar = this.f13035d.get(bvVar.z());
        if (aVar == null) {
            return false;
        }
        switch (i) {
            case 1:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                i4 = 3;
                break;
            case 2:
            default:
                i4 = 1;
                break;
            case 8:
                i4 = 2;
                break;
        }
        if (!z6.contains(Integer.valueOf(i4))) {
            return false;
        }
        au auVar = this.f13036e.get(String.valueOf(bvVar.g()));
        if (auVar == null) {
            return false;
        }
        List<au.a> a9 = auVar.a();
        if (a9.isEmpty()) {
            return false;
        }
        return a(a9, aVar);
    }

    private static boolean a(List<au.a> list, a aVar) {
        if (aVar != null && list != null) {
            try {
                list.toString();
                for (int i = 0; i < list.size(); i++) {
                    au.a aVar2 = list.get(i);
                    if (aVar2 != null) {
                        String a9 = aVar2.a();
                        if (TextUtils.isEmpty(a9)) {
                            continue;
                        } else {
                            long b9 = aVar2.b();
                            Map<String, Long> c9 = aVar2.c();
                            if (a9.equals("-88888")) {
                                if (!TextUtils.isEmpty(aVar.f13040b) && c9 != null && !c9.isEmpty()) {
                                    for (Map.Entry<String, Long> entry : c9.entrySet()) {
                                        String key = entry.getKey();
                                        Long value = entry.getValue();
                                        if (value.longValue() > 0 && !TextUtils.isEmpty(key) && aVar.f13040b.contains(key) && aVar.f13041c + value.longValue() > System.currentTimeMillis()) {
                                            return true;
                                        }
                                    }
                                }
                            } else if (TextUtils.isEmpty(aVar.f13039a)) {
                                continue;
                            } else if (TextUtils.isEmpty(aVar.f13040b)) {
                                if (a9.equals(aVar.f13039a) && ((c9 == null || c9.isEmpty()) && b9 > 0 && aVar.f13041c + b9 > System.currentTimeMillis())) {
                                    return true;
                                }
                            } else if (c9 != null && !c9.isEmpty()) {
                                for (Map.Entry<String, Long> entry2 : c9.entrySet()) {
                                    String key2 = entry2.getKey();
                                    Long value2 = entry2.getValue();
                                    if (value2.longValue() > 0 && !TextUtils.isEmpty(key2) && aVar.f13040b.contains(key2) && aVar.f13041c + value2.longValue() > System.currentTimeMillis()) {
                                        return true;
                                    }
                                }
                            } else if (b9 > 0 && aVar.f13041c + b9 > System.currentTimeMillis()) {
                                return true;
                            }
                        }
                    }
                }
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
        return false;
    }
}
