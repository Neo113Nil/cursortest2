package com.anythink.expressad.video.module.b;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.common.d.t;
import com.anythink.core.common.e.g;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.foundation.g.f.h.b;
import com.anythink.expressad.videocommon.c.c;
import com.google.android.gms.internal.ads.Wv;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static HashMap<String, ArrayList<String>> f22558a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private static final String f22559b = "VideoViewReport";

    public static void a() {
    }

    public static void b(Context context, d dVar) {
        if (dVar == null || dVar.M() == null || dVar.M().j() == null) {
            return;
        }
        com.anythink.expressad.b.a.a(context, dVar, dVar.L(), dVar.M().j(), false);
    }

    public static void c(Context context, d dVar) {
        if (dVar == null || dVar.M() == null || dVar.M().k() == null) {
            return;
        }
        com.anythink.expressad.b.a.a(context, dVar, dVar.L(), dVar.M().k(), false);
    }

    public static void d(Context context, d dVar) {
        if (dVar == null || dVar.M() == null || dVar.M().q() == null) {
            return;
        }
        com.anythink.expressad.b.a.a(context, dVar, dVar.L(), dVar.M().q(), false);
    }

    public static void e(Context context, d dVar) {
        if (dVar == null || dVar.M() == null || dVar.M().m() == null) {
            return;
        }
        com.anythink.expressad.b.a.a(context, dVar, dVar.L(), dVar.M().m(), false);
    }

    private static void f(Context context, d dVar) {
        if (dVar == null || dVar.M() == null || dVar.M().d() == null) {
            return;
        }
        com.anythink.expressad.b.a.a(context, dVar, dVar.L(), dVar.M().d(), true);
    }

    private static void g(Context context, d dVar) {
        if (dVar == null || dVar.M() == null || dVar.M().e() == null) {
            return;
        }
        com.anythink.expressad.b.a.a(context, dVar, dVar.L(), dVar.M().e(), false);
    }

    private static void h(Context context, d dVar) {
        if (dVar == null || dVar.M() == null || dVar.M().f() == null) {
            return;
        }
        com.anythink.expressad.b.a.a(context, dVar, dVar.L(), dVar.M().f(), false);
    }

    private static void i(Context context, d dVar) {
        if (dVar == null || dVar.M() == null || dVar.M().g() == null) {
            return;
        }
        com.anythink.expressad.b.a.a(context, dVar, dVar.L(), dVar.M().g(), false);
    }

    private static void j(Context context, d dVar) {
        if (dVar == null || dVar.M() == null || dVar.M().h() == null) {
            return;
        }
        com.anythink.expressad.b.a.a(context, dVar, dVar.L(), dVar.M().h(), false);
    }

    private static void k(Context context, d dVar) {
        if (dVar == null || dVar.M() == null || dVar.M().l() == null) {
            return;
        }
        String L2 = dVar.L();
        ArrayList<String> arrayList = f22558a.get(L2);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            f22558a.put(L2, arrayList);
        }
        if (arrayList.contains(dVar.bh())) {
            return;
        }
        com.anythink.expressad.b.a.a(context, dVar, dVar.L(), dVar.M().l(), false);
        arrayList.add(dVar.bh());
    }

    public static void a(String str) {
        f22558a.remove(str);
    }

    public static void a(Context context, d dVar) {
        if (dVar == null || dVar.M() == null || dVar.M().o() == null) {
            return;
        }
        com.anythink.expressad.b.a.a(context, dVar, dVar.L(), dVar.M().o(), false);
    }

    public static void a(Context context, d dVar, int i, int i4) {
        try {
            String[] p9 = dVar.M().p();
            if (dVar.M() == null || p9 == null) {
                return;
            }
            String[] strArr = new String[p9.length];
            for (int i6 = 0; i6 < p9.length; i6++) {
                String str = p9[i6];
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("endscreen_type", i);
                String jSONObject2 = jSONObject.toString();
                if (!TextUtils.isEmpty(jSONObject2)) {
                    jSONObject2 = com.anythink.core.express.a.a.a(jSONObject2);
                }
                if (!TextUtils.isEmpty(jSONObject2)) {
                    str = str + "&value=" + URLEncoder.encode(jSONObject2);
                }
                strArr[i6] = dVar.n() == 1 ? str + "&to=1&cbt=" + dVar.aB() + "&tmorl=" + i4 : str + "&to=0&cbt=" + dVar.aB() + "&tmorl=" + i4;
            }
            com.anythink.expressad.b.a.a(context, dVar, dVar.L(), strArr, true);
        } catch (Throwable unused) {
        }
    }

    public static void a(Context context, d dVar, int i, int i4, int i6) {
        String str;
        if (i4 == 0 || context == null || dVar == null) {
            return;
        }
        try {
            List<Map<Integer, String>> i9 = dVar.M().i();
            int i10 = ((i + 1) * 100) / i4;
            if (i9 != null) {
                int i11 = 0;
                while (i11 < i9.size()) {
                    Map<Integer, String> map = i9.get(i11);
                    if (map != null && map.size() > 0) {
                        Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry<Integer, String> next = it.next();
                            int intValue = next.getKey().intValue();
                            String value = next.getValue();
                            if (dVar.n() == 1) {
                                str = value + "&to=1&cbt=" + dVar.aB() + "&tmorl=" + i6;
                            } else {
                                str = value + "&to=0&cbt=" + dVar.aB() + "&tmorl=" + i6;
                            }
                            if (intValue <= i10 && !TextUtils.isEmpty(str)) {
                                com.anythink.expressad.b.a.a(context, dVar, dVar.L(), new String[]{str}, true);
                                it.remove();
                                i9.remove(i11);
                                i11--;
                            }
                        }
                    }
                    i11++;
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(d dVar, Map<Integer, String> map, String str, int i) {
        if (dVar == null || map == null) {
            return;
        }
        try {
            if (map.size() > 0) {
                Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<Integer, String> next = it.next();
                    Integer key = next.getKey();
                    String value = next.getValue();
                    if (i == key.intValue() && !TextUtils.isEmpty(value)) {
                        com.anythink.expressad.b.a.a(t.b().g(), dVar, str, value, false);
                        it.remove();
                    }
                }
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public static void a(d dVar, String str) {
        if (dVar != null) {
            try {
                if (dVar.an() == null || dVar.an().size() <= 0) {
                    return;
                }
                for (String str2 : dVar.an()) {
                    if (!TextUtils.isEmpty(str2)) {
                        com.anythink.expressad.b.a.a(t.b().g(), dVar, str, str2, false);
                    }
                }
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
    }

    public static void a(d dVar, c cVar, String str, String str2, String str3) {
        String str4 = "&";
        String str5 = "";
        if (dVar == null || cVar == null) {
            return;
        }
        try {
            com.anythink.expressad.video.module.c.a aVar = new com.anythink.expressad.video.module.c.a(t.b().g());
            b bVar = new b();
            bVar.a("user_id", com.anythink.core.express.a.a.a(str2));
            bVar.a(com.anythink.expressad.f.a.b.aM, "1");
            bVar.a("reward_name", cVar.a());
            StringBuilder sb = new StringBuilder();
            sb.append(cVar.b());
            bVar.a("reward_amount", sb.toString());
            bVar.a("unit_id", str);
            bVar.a(g.a.f13749c, dVar.ac());
            if (!TextUtils.isEmpty(str3)) {
                bVar.a("extra", str3);
            }
            aVar.a("", bVar);
            String str6 = dVar.am() + "/addReward?";
            String trim = bVar.a().trim();
            if (!TextUtils.isEmpty(trim)) {
                if (!str6.endsWith("?") && !str6.endsWith("&")) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str6);
                    if (!str6.contains("?")) {
                        str4 = "?";
                    }
                    sb2.append(str4);
                    str6 = sb2.toString();
                }
                str5 = str6 + trim;
            }
            com.anythink.expressad.b.a.a(t.b().g(), dVar, dVar.L(), str5, false);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    private static String a(String str, b bVar) {
        String trim = bVar.a().trim();
        if (!TextUtils.isEmpty(trim)) {
            if (!str.endsWith("?") && !str.endsWith("&")) {
                str = str.concat(str.contains("?") ? "&" : "?");
            }
            return Wv.g(str, trim);
        }
        return "";
    }
}
