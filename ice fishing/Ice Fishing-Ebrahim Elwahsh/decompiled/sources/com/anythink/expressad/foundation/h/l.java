package com.anythink.expressad.foundation.h;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final int f19796a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f19797b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final String f19798c = "mbridge.msdk.db";

    /* renamed from: d, reason: collision with root package name */
    public static final int f19799d = 30000;

    /* renamed from: e, reason: collision with root package name */
    public static final int f19800e = 60000;

    /* renamed from: f, reason: collision with root package name */
    public static final int f19801f = 60000;

    /* renamed from: g, reason: collision with root package name */
    public static final int f19802g = 60000;

    /* renamed from: h, reason: collision with root package name */
    private static final String f19803h = "SameCommon";

    public static abstract class a {
        public abstract void a();
    }

    private static long a(long j9, long j10) {
        return j9 >= 0 ? j9 : j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(com.anythink.expressad.foundation.d.d dVar, Context context, com.anythink.expressad.foundation.g.g.a.e eVar, a aVar) {
        int i;
        if (dVar == null || aVar == null) {
            return;
        }
        if (eVar == null) {
            try {
                eVar = new com.anythink.expressad.foundation.g.g.a.e();
            } catch (Exception e6) {
                if (com.anythink.expressad.a.f17776a) {
                    e6.printStackTrace();
                    return;
                }
                return;
            }
        }
        boolean a9 = v.a(dVar);
        int b9 = v.b(context, dVar.bi());
        if (context != null) {
            try {
                i = d.b(context) ? 1 : 2;
            } catch (Exception e9) {
                e9.getMessage();
            }
            com.anythink.expressad.foundation.g.g.a.f fVar = new com.anythink.expressad.foundation.g.g.a.f();
            fVar.a("cid", dVar.bh());
            fVar.a("wtick", Integer.valueOf(dVar.ag()));
            fVar.a("retarget_offer", Integer.valueOf(dVar.O()));
            fVar.a(com.anythink.expressad.foundation.g.g.a.b.aW, Integer.valueOf(b9));
            fVar.a(com.anythink.expressad.foundation.g.g.a.b.aX, 1);
            fVar.a("ac", 0);
            fVar.a(com.anythink.expressad.foundation.g.g.a.b.aZ, Integer.valueOf(i));
            if (a9) {
                if (b9 == 1) {
                    eVar.a(com.anythink.expressad.foundation.g.g.a.c.f19630Q, fVar);
                }
                eVar.a(com.anythink.expressad.foundation.g.g.a.c.f19632S, fVar);
                return;
            } else {
                if (b9 != 1) {
                    eVar.a(com.anythink.expressad.foundation.g.g.a.c.f19630Q, fVar);
                }
                eVar.a(com.anythink.expressad.foundation.g.g.a.c.f19631R, fVar);
                return;
            }
        }
        i = 0;
        com.anythink.expressad.foundation.g.g.a.f fVar2 = new com.anythink.expressad.foundation.g.g.a.f();
        fVar2.a("cid", dVar.bh());
        fVar2.a("wtick", Integer.valueOf(dVar.ag()));
        fVar2.a("retarget_offer", Integer.valueOf(dVar.O()));
        fVar2.a(com.anythink.expressad.foundation.g.g.a.b.aW, Integer.valueOf(b9));
        fVar2.a(com.anythink.expressad.foundation.g.g.a.b.aX, 1);
        fVar2.a("ac", 0);
        fVar2.a(com.anythink.expressad.foundation.g.g.a.b.aZ, Integer.valueOf(i));
        if (a9) {
        }
    }

    public static String a(List<com.anythink.expressad.foundation.d.d> list) {
        if (list == null || list.isEmpty()) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        for (com.anythink.expressad.foundation.d.d dVar : list) {
            if (dVar != null && dVar.r() != 0) {
                arrayList.add(dVar);
            }
        }
        if (arrayList.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arrayList.size(); i++) {
            try {
                com.anythink.expressad.foundation.d.d dVar2 = (com.anythink.expressad.foundation.d.d) arrayList.get(i);
                if (dVar2 != null) {
                    long r9 = dVar2.r();
                    if (i == arrayList.size() - 1) {
                        sb.append(r9);
                    } else {
                        sb.append(r9);
                        sb.append(",");
                    }
                }
            } catch (Exception unused) {
            }
        }
        return sb.toString();
    }

    public static boolean a(Context context, com.anythink.expressad.foundation.d.d dVar) {
        if (context == null || dVar == null) {
            return false;
        }
        return v.a(dVar) || dVar.ag() == 1 || !v.a(context, dVar.bi());
    }

    private static JSONObject a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            for (String str2 : str.split("&")) {
                String[] split = str2.split("=");
                if (split.length == 2) {
                    String str3 = split[0];
                    if (!TextUtils.isEmpty(str3)) {
                        String str4 = split[1];
                        jSONObject.put(str3, str4 != null ? str4 : "");
                    }
                } else if (split.length == 1) {
                    String str5 = split[0];
                    if (!TextUtils.isEmpty(str5)) {
                        jSONObject.put(str5, "");
                    }
                }
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String a(String str, Map<String, String> map) {
        Uri parse = Uri.parse(str);
        Uri.Builder buildUpon = parse.buildUpon();
        buildUpon.clearQuery();
        for (String str2 : parse.getQueryParameterNames()) {
            if (map.containsKey(str2)) {
                buildUpon.appendQueryParameter(str2, map.get(str2));
            } else {
                Iterator<String> it = parse.getQueryParameters(str2).iterator();
                while (it.hasNext()) {
                    buildUpon.appendQueryParameter(str2, it.next());
                }
            }
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            if (!parse.getQueryParameterNames().contains(key)) {
                buildUpon.appendQueryParameter(key, entry.getValue());
            }
        }
        return buildUpon.build().toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(com.anythink.expressad.foundation.d.d dVar, Context context, com.anythink.expressad.foundation.g.g.a.e eVar, a aVar) {
        int i;
        if (dVar == null || aVar == null) {
            return;
        }
        if (eVar == null) {
            try {
                eVar = new com.anythink.expressad.foundation.g.g.a.e();
            } catch (Exception e6) {
                if (com.anythink.expressad.a.f17776a) {
                    e6.printStackTrace();
                    return;
                }
                return;
            }
        }
        boolean a9 = v.a(dVar);
        int b9 = v.b(context, dVar.bi());
        if (context != null) {
            try {
                i = d.b(context) ? 1 : 2;
            } catch (Exception e9) {
                e9.getMessage();
            }
            com.anythink.expressad.foundation.g.g.a.f fVar = new com.anythink.expressad.foundation.g.g.a.f();
            fVar.a("cid", dVar.bh());
            fVar.a("wtick", Integer.valueOf(dVar.ag()));
            fVar.a("retarget_offer", Integer.valueOf(dVar.O()));
            fVar.a(com.anythink.expressad.foundation.g.g.a.b.aW, Integer.valueOf(b9));
            fVar.a(com.anythink.expressad.foundation.g.g.a.b.aX, 1);
            fVar.a("ac", 0);
            fVar.a(com.anythink.expressad.foundation.g.g.a.b.aZ, Integer.valueOf(i));
            if (!a9) {
                if (b9 != 1) {
                    eVar.a(com.anythink.expressad.foundation.g.g.a.c.f19630Q, fVar);
                }
                eVar.a(com.anythink.expressad.foundation.g.g.a.c.f19631R, fVar);
                return;
            } else {
                if (b9 == 1) {
                    eVar.a(com.anythink.expressad.foundation.g.g.a.c.f19630Q, fVar);
                }
                eVar.a(com.anythink.expressad.foundation.g.g.a.c.f19632S, fVar);
                return;
            }
        }
        i = 0;
        com.anythink.expressad.foundation.g.g.a.f fVar2 = new com.anythink.expressad.foundation.g.g.a.f();
        fVar2.a("cid", dVar.bh());
        fVar2.a("wtick", Integer.valueOf(dVar.ag()));
        fVar2.a("retarget_offer", Integer.valueOf(dVar.O()));
        fVar2.a(com.anythink.expressad.foundation.g.g.a.b.aW, Integer.valueOf(b9));
        fVar2.a(com.anythink.expressad.foundation.g.g.a.b.aX, 1);
        fVar2.a("ac", 0);
        fVar2.a(com.anythink.expressad.foundation.g.g.a.b.aZ, Integer.valueOf(i));
        if (!a9) {
        }
    }
}
