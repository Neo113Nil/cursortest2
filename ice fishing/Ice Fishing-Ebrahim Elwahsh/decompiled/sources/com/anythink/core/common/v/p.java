package com.anythink.core.common.v;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import com.anythink.core.api.ATCustomRuleKeys;
import com.anythink.core.api.ATShowConfig;
import com.anythink.core.common.d.j;
import com.anythink.core.common.h.bj;
import com.anythink.core.common.h.bo;
import com.anythink.core.common.h.bv;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;
import t0.AbstractC5051n;
import u.AbstractC5088e;

/* loaded from: classes.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    static Random f17004a = new Random();

    /* renamed from: b, reason: collision with root package name */
    private static final String f17005b = "CommonSDKUtil";

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final String f17006a = "com.android.vending";
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.e("anythink", "Channel Error: The channel cannot be null or empty.");
        }
        return !TextUtils.isEmpty(str);
    }

    public static boolean b(int i) {
        return i == 2 || i == 7 || i == 9 || i == 12;
    }

    public static boolean c(int i) {
        return i == 3 || i == 4 || i == 5 || i == 8 || i == 11 || i == 13;
    }

    public static boolean d(int i) {
        return i == 1 || i == 6 || i == 10;
    }

    public static ATShowConfig e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return new ATShowConfig.Builder().scenarioId(str).build();
    }

    public static String f(String str) {
        str.getClass();
        switch (str) {
            case "0":
                return j.n.f12662a;
            case "1":
                return j.n.f12663b;
            case "2":
                return j.n.f12664c;
            case "3":
                return "Interstitial";
            case "4":
                return j.n.f12666e;
            default:
                return "";
        }
    }

    public static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.e("anythink", "SubChannel Error: The subChannel cannot be null or empty.");
        }
        return !TextUtils.isEmpty(str);
    }

    public static boolean c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.length() > 50) {
            Log.e("anythink", "Invalid ScenarioId(" + str + "):The length of ScenarioId must be between 1-50.");
            return false;
        }
        if (!Pattern.matches(".*[\\u4E00-\\u9FFF\\s]+.*", str)) {
            return true;
        }
        Log.e("anythink", "Invalid ScenarioId(" + str + "):ScenarioId cannot contain spaces or chinese characters.");
        return false;
    }

    public static String d(String str) {
        return (!TextUtils.isEmpty(str) && c(str)) ? str : "";
    }

    public static int e(int i) {
        if (c(i)) {
            return 1;
        }
        return b(i) ? 2 : 0;
    }

    public static String a(String str, String str2, long j9) {
        return str + "_" + str2 + "_" + j9;
    }

    private static String d(Context context) {
        String B8 = com.anythink.core.common.d.t.b().B();
        if (TextUtils.isEmpty(B8)) {
            B8 = m.d(context) + m.f();
        }
        StringBuilder b9 = AbstractC5088e.b(B8);
        b9.append(UUID.randomUUID().toString());
        return o.a(b9.toString());
    }

    public static JSONObject a(Context context, String str, String str2, int i, int i4) {
        int[] a9 = com.anythink.core.a.a.a(context).a(i);
        int i9 = a9[0];
        int i10 = a9[1];
        bo a10 = com.anythink.core.a.a.a(context).a(str2, i);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sr", "tp");
            jSONObject.put("rid", str);
            jSONObject.put(com.anythink.expressad.foundation.d.e.f18820h, i9);
            jSONObject.put("ahs", i10);
            jSONObject.put("pds", a10 != null ? a10.f13879c : 0);
            jSONObject.put("phs", a10 != null ? a10.f13880d : 0);
            jSONObject.put("ap", i4);
            jSONObject.put("tpl", str2);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static String b(String str, String str2, long j9) {
        return AbstractC5051n.g(new StringBuilder(), a(str, str2, j9), "_refresh");
    }

    public static double c(bv bvVar) {
        if (bvVar == null) {
            return 0.0d;
        }
        double at = bvVar.at();
        if (at <= 0.0d) {
            return at;
        }
        try {
            if (!bvVar.o()) {
                return at;
            }
            double bp = bvVar.bp();
            return bp > 0.0d ? at * bp : at;
        } catch (Throwable unused) {
            return at;
        }
    }

    public static double b(bv bvVar) {
        if (bvVar != null) {
            return bvVar.c();
        }
        return 0.0d;
    }

    public static boolean c(Context context) {
        return ag.a().b(context);
    }

    public static String b(com.anythink.core.common.h.w wVar) {
        if (wVar instanceof bj) {
            return ((bj) wVar).aD();
        }
        return "";
    }

    public static boolean c() {
        return ag.a().b();
    }

    private static double d(bv bvVar) {
        if (bvVar != null) {
            return bvVar.bp();
        }
        return 0.0d;
    }

    public static boolean b() {
        try {
            Map<String, Object> m8 = com.anythink.core.common.d.t.b().m();
            if (m8 == null || !m8.containsKey(ATCustomRuleKeys.AGE)) {
                return false;
            }
            return Integer.parseInt(m8.get(ATCustomRuleKeys.AGE).toString()) <= 13;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String a(Context context) {
        String B8 = com.anythink.core.common.d.t.b().B();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(m.d(context));
        stringBuffer.append("&");
        stringBuffer.append(m.f());
        stringBuffer.append("&");
        stringBuffer.append(B8);
        stringBuffer.append("&");
        stringBuffer.append(System.currentTimeMillis());
        stringBuffer.append("&");
        stringBuffer.append(new Random().nextInt(10000));
        return o.a(stringBuffer.toString());
    }

    public static boolean b(Context context) {
        return ag.a().a(context);
    }

    public static boolean b(List<String> list, String str) {
        return list != null && list.size() > 0 && list.contains(str);
    }

    public static void a(List<bv> list, bv bvVar) {
        if (list == null) {
            return;
        }
        int size = list.size();
        if (size == 0) {
            list.add(bvVar);
            return;
        }
        int i = size - 1;
        for (int i4 = 0; i4 < size; i4++) {
            if (l.a(bvVar, list.get(i4)) <= 0) {
                list.add(i4, bvVar);
                return;
            } else {
                if (i4 == i) {
                    list.add(bvVar);
                    return;
                }
            }
        }
    }

    private static boolean a(List<bv> list, bv bvVar, bv bvVar2, int i, int i4, boolean z8) {
        if (z8 && bvVar.e() == -1) {
            list.add(i, bvVar2);
            return true;
        }
        if (l.a(bvVar2, bvVar) <= 0) {
            list.add(i, bvVar2);
            return true;
        }
        if (i != i4) {
            return false;
        }
        list.add(bvVar2);
        return true;
    }

    public static void a(WebView webView) {
        if (webView == null) {
            return;
        }
        webView.removeJavascriptInterface("searchBoxjavaBridge_");
        webView.removeJavascriptInterface("accessibility");
        webView.removeJavascriptInterface("accessibilityTraversal");
        webView.getSettings().setAllowFileAccess(false);
        webView.getSettings().setAllowFileAccessFromFileURLs(false);
        webView.getSettings().setAllowUniversalAccessFromFileURLs(false);
        webView.getSettings().setSavePassword(false);
    }

    public static double a(bv bvVar) {
        if (bvVar != null) {
            return bvVar.at();
        }
        return 0.0d;
    }

    private static void a(String str, List<bv> list) {
        if (list != null) {
            try {
                StringBuilder sb = new StringBuilder();
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    bv bvVar = list.get(i);
                    sb.append("\n");
                    sb.append(i);
                    sb.append(" --> adSourceId: ");
                    sb.append(bvVar.z());
                    sb.append(", ");
                    sb.append(bvVar.h());
                    sb.append(", real: ");
                    sb.append(bvVar.D());
                    sb.append(", sort: ");
                    sb.append(a(bvVar));
                    String F8 = bvVar.F();
                    if (!TextUtils.isEmpty(F8)) {
                        sb.append(", errorMsg: ");
                        sb.append(F8);
                    }
                }
                Log.e(str, sb.toString());
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static String a() {
        if (!TextUtils.isEmpty("UA_6.5.13")) {
            return "UA_6.5.13";
        }
        return "UA_0.0.0";
    }

    public static String a(com.anythink.core.common.h.w wVar) {
        String str;
        com.anythink.core.common.h.y r9;
        String str2 = wVar.I() + wVar.v();
        if ((wVar instanceof bj) && (r9 = wVar.r()) != null) {
            if (r9.ay() != 2) {
                str2 = b(wVar) + wVar.I() + wVar.v();
            } else {
                str2 = b(wVar) + wVar.I();
            }
        }
        if (com.anythink.core.common.d.t.b().g() != null) {
            str = com.anythink.core.common.d.t.b().g().getPackageName();
        } else {
            str = "";
        }
        return o.a(str2 + str);
    }

    public static void a(Map<String, Object> map, com.anythink.core.common.h.n nVar) {
        if (nVar == null || nVar.Y() >= 100000) {
            return;
        }
        map.put(j.w.i, nVar);
        map.put(j.w.f12779j, nVar.aI());
    }

    private static int a(int i, int[] iArr, int i4) {
        if (iArr != null) {
            for (int i9 : iArr) {
                if (i == i9) {
                    return i;
                }
            }
        }
        return i4;
    }

    public static List<bv> a(List<bv> list, com.anythink.core.common.k.f fVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HashMap hashMap = new HashMap(3);
        ArrayList arrayList = new ArrayList();
        for (bv bvVar : list) {
            double a9 = a(bvVar);
            List list2 = (List) linkedHashMap.get(String.valueOf(a9));
            if (list2 == null) {
                list2 = new ArrayList();
                linkedHashMap.put(String.valueOf(a9), list2);
            }
            Integer num = (Integer) hashMap.get(String.valueOf(a9));
            if (num == null) {
                num = 0;
            }
            hashMap.put(String.valueOf(a9), Integer.valueOf(bvVar.Z() + num.intValue()));
            list2.add(bvVar);
        }
        int i = 0;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            List list3 = (List) entry.getValue();
            int intValue = ((Integer) hashMap.get(entry.getKey())).intValue();
            int i4 = -1;
            while (true) {
                if (list3.size() <= 0) {
                    break;
                }
                if (list3.size() == 1) {
                    bv bvVar2 = (bv) list3.get(0);
                    arrayList.add(bvVar2);
                    list3.remove(0);
                    if (fVar != null) {
                        fVar.a(bvVar2, i, i4);
                    }
                    i++;
                } else {
                    int nextInt = f17004a.nextInt(intValue) + 1;
                    Iterator it = list3.iterator();
                    int i9 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            bv bvVar3 = (bv) it.next();
                            if (bvVar3.Z() + i9 >= nextInt) {
                                arrayList.add(bvVar3);
                                list3.remove(bvVar3);
                                intValue -= bvVar3.Z();
                                if (i4 == -1) {
                                    i4 = 0;
                                }
                                if (fVar != null) {
                                    fVar.a(bvVar3, i, i4);
                                }
                                i4++;
                                i++;
                            } else {
                                i9 += bvVar3.Z();
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public static String a(int i) {
        switch (i) {
            case 2:
                return "c2s";
            case 3:
                return "s2s";
            case 4:
                return "adx";
            case 5:
                return "adx open";
            case 6:
            case 10:
            default:
                return "";
            case 7:
                return "fb in-house";
            case 8:
                return "directly";
            case 9:
                return "dynamic";
            case 11:
                return "custom in-house";
            case 12:
                return "dynamic c2s";
            case 13:
                return "dynamic s2s";
        }
    }

    public static JSONObject a(StackTraceElement[] stackTraceElementArr) {
        JSONObject jSONObject = null;
        if (stackTraceElementArr == null || stackTraceElementArr.length <= 0) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray = new JSONArray();
                JSONArray jSONArray2 = new JSONArray();
                for (int i = 0; i < stackTraceElementArr.length; i++) {
                    String className = stackTraceElementArr[i].getClassName();
                    if (!className.startsWith("com.anythink")) {
                        jSONArray.put(stackTraceElementArr[i].toString());
                        try {
                            jSONArray2.put(Class.forName(className).getSuperclass().getName());
                        } catch (Throwable unused) {
                            jSONArray2.put("fail");
                        }
                        if (jSONArray.length() >= 5) {
                            break;
                        }
                    }
                }
                jSONObject2.put("stacks", jSONArray);
                jSONObject2.put("classes", jSONArray2);
                return jSONObject2;
            } catch (Throwable unused2) {
                jSONObject = jSONObject2;
                return jSONObject;
            }
        } catch (Throwable unused3) {
        }
    }

    public static boolean a(List<String> list, String str) {
        return list == null || list.size() <= 0 || list.contains(str);
    }
}
