package com.anythink.core.c.b;

import android.text.TextUtils;
import com.IceFishing.LiveIceFishing.k;
import com.anythink.core.c.b.e;
import com.anythink.core.common.v.ah;
import com.onesignal.notifications.internal.badges.impl.shortcutbadger.impl.AdwHomeBadger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q5.C4876a;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final double f12860a = -1.0d;

    /* renamed from: b, reason: collision with root package name */
    private static final String f12861b = "UserValueCalculator";

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f12862c = {"MAX", "MIN", "AVG", "SUM", AdwHomeBadger.COUNT};

    /* renamed from: d, reason: collision with root package name */
    private static final String[] f12863d = {"=", ">", "<", "!=", ">=", "<="};

    /* renamed from: e, reason: collision with root package name */
    private static final String[] f12864e = {"OR", "AND"};

    /* renamed from: f, reason: collision with root package name */
    private static final String[] f12865f = {"DESC", "ASC"};

    /* renamed from: g, reason: collision with root package name */
    private final e f12866g;

    public f(e eVar) {
        this.f12866g = eVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(36:0|1|(3:122|123|(32:125|(1:5)|6|7|(2:9|(27:11|12|13|(3:17|18|(28:20|21|22|(7:26|(1:28)(2:40|(1:42)(1:43))|29|(2:34|35)|36|23|24)|44|45|46|47|48|(2:50|51)(1:104)|52|53|(1:55)|57|(1:61)|62|(1:64)|65|(3:67|(1:69)|70)|71|(3:73|(1:75)|76)|77|(1:79)|80|81|82|83|(4:85|(2:87|(1:89)(1:93))(1:94)|90|91)(1:95)))|117|111|47|48|(0)(0)|52|53|(0)|57|(2:59|61)|62|(0)|65|(0)|71|(0)|77|(0)|80|81|82|83|(0)(0)))|121|12|13|(3:17|18|(0))|117|111|47|48|(0)(0)|52|53|(0)|57|(0)|62|(0)|65|(0)|71|(0)|77|(0)|80|81|82|83|(0)(0)))|3|(0)|6|7|(0)|121|12|13|(0)|117|111|47|48|(0)(0)|52|53|(0)|57|(0)|62|(0)|65|(0)|71|(0)|77|(0)|80|81|82|83|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x013c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x013d, code lost:
    
        r0.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0118, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0119, code lost:
    
        r10 = "";
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0068 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0072 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010c A[Catch: Exception -> 0x0118, TRY_LEAVE, TryCatch #4 {Exception -> 0x0118, blocks: (B:48:0x0100, B:50:0x010c), top: B:47:0x0100 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0125 A[Catch: Exception -> 0x013c, TRY_LEAVE, TryCatch #3 {Exception -> 0x013c, blocks: (B:53:0x011c, B:55:0x0125), top: B:52:0x011c }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0146 A[Catch: Exception -> 0x00f6, TryCatch #5 {Exception -> 0x00f6, blocks: (B:18:0x006c, B:57:0x0140, B:59:0x0146, B:61:0x014c, B:62:0x0156, B:64:0x0161, B:65:0x0181, B:67:0x0187, B:69:0x018d, B:70:0x0190, B:71:0x0193, B:73:0x0199, B:75:0x019f, B:76:0x01a2, B:77:0x01a5, B:79:0x01c2, B:80:0x01d4, B:102:0x013d, B:110:0x00f2), top: B:17:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0029 A[Catch: Exception -> 0x001f, TryCatch #1 {Exception -> 0x001f, blocks: (B:123:0x0010, B:125:0x0016, B:5:0x0029, B:6:0x002d, B:9:0x0038, B:11:0x003d, B:12:0x0042), top: B:122:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0161 A[Catch: Exception -> 0x00f6, TryCatch #5 {Exception -> 0x00f6, blocks: (B:18:0x006c, B:57:0x0140, B:59:0x0146, B:61:0x014c, B:62:0x0156, B:64:0x0161, B:65:0x0181, B:67:0x0187, B:69:0x018d, B:70:0x0190, B:71:0x0193, B:73:0x0199, B:75:0x019f, B:76:0x01a2, B:77:0x01a5, B:79:0x01c2, B:80:0x01d4, B:102:0x013d, B:110:0x00f2), top: B:17:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0187 A[Catch: Exception -> 0x00f6, TryCatch #5 {Exception -> 0x00f6, blocks: (B:18:0x006c, B:57:0x0140, B:59:0x0146, B:61:0x014c, B:62:0x0156, B:64:0x0161, B:65:0x0181, B:67:0x0187, B:69:0x018d, B:70:0x0190, B:71:0x0193, B:73:0x0199, B:75:0x019f, B:76:0x01a2, B:77:0x01a5, B:79:0x01c2, B:80:0x01d4, B:102:0x013d, B:110:0x00f2), top: B:17:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0199 A[Catch: Exception -> 0x00f6, TryCatch #5 {Exception -> 0x00f6, blocks: (B:18:0x006c, B:57:0x0140, B:59:0x0146, B:61:0x014c, B:62:0x0156, B:64:0x0161, B:65:0x0181, B:67:0x0187, B:69:0x018d, B:70:0x0190, B:71:0x0193, B:73:0x0199, B:75:0x019f, B:76:0x01a2, B:77:0x01a5, B:79:0x01c2, B:80:0x01d4, B:102:0x013d, B:110:0x00f2), top: B:17:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01c2 A[Catch: Exception -> 0x00f6, TryCatch #5 {Exception -> 0x00f6, blocks: (B:18:0x006c, B:57:0x0140, B:59:0x0146, B:61:0x014c, B:62:0x0156, B:64:0x0161, B:65:0x0181, B:67:0x0187, B:69:0x018d, B:70:0x0190, B:71:0x0193, B:73:0x0199, B:75:0x019f, B:76:0x01a2, B:77:0x01a5, B:79:0x01c2, B:80:0x01d4, B:102:0x013d, B:110:0x00f2), top: B:17:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x020e A[Catch: Exception -> 0x0220, TryCatch #0 {Exception -> 0x0220, blocks: (B:83:0x01fc, B:85:0x020e, B:87:0x0214, B:89:0x021d, B:94:0x0222), top: B:82:0x01fc }] */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0038 A[Catch: Exception -> 0x001f, TRY_ENTER, TryCatch #1 {Exception -> 0x001f, blocks: (B:123:0x0010, B:125:0x0016, B:5:0x0029, B:6:0x002d, B:9:0x0038, B:11:0x003d, B:12:0x0042), top: B:122:0x0010 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final double a(int i, String str) {
        JSONObject jSONObject;
        double d9;
        JSONObject jSONObject2;
        int i4;
        String str2;
        String str3;
        JSONArray optJSONArray;
        char c9;
        char c10;
        String str4;
        String str5;
        String sb;
        double d10;
        double d11;
        int optInt;
        int optInt2;
        com.anythink.core.d.b k9 = k.k(k.l());
        try {
            if (k9 != null) {
                try {
                    JSONObject Z8 = k9.Z();
                    if (Z8 != null) {
                        jSONObject = Z8.getJSONObject(String.valueOf(i));
                        if (jSONObject == null) {
                            jSONObject = a();
                        }
                        jSONObject2 = jSONObject;
                        i4 = jSONObject2.getInt("f");
                        str2 = "";
                        if (i4 >= 0) {
                            String[] strArr = f12862c;
                            if (i4 < strArr.length) {
                                str3 = strArr[i4];
                                String string = jSONObject2.getString("q_f");
                                optJSONArray = jSONObject2.optJSONArray("w_c_f");
                                JSONArray optJSONArray2 = jSONObject2.optJSONArray("w_c_o");
                                JSONArray optJSONArray3 = jSONObject2.optJSONArray("w_c_v");
                                JSONArray optJSONArray4 = jSONObject2.optJSONArray("w_o");
                                d9 = -1.0d;
                                if (optJSONArray != null && optJSONArray2 != null && optJSONArray3 != null) {
                                    try {
                                        if (optJSONArray.length() > 0) {
                                            try {
                                                StringBuilder sb2 = new StringBuilder();
                                                c9 = 1;
                                                int i6 = 0;
                                                c10 = 0;
                                                while (i6 < optJSONArray.length()) {
                                                    try {
                                                        String string2 = optJSONArray.getString(i6);
                                                        int i9 = optJSONArray2.getInt(i6);
                                                        JSONArray jSONArray = optJSONArray;
                                                        String string3 = optJSONArray3.getString(i6);
                                                        sb2.append(string2);
                                                        sb2.append(f12863d[i9]);
                                                        if (ah.a((CharSequence) string3)) {
                                                            sb2.append(string3);
                                                        } else if (string3.startsWith("strftime")) {
                                                            sb2.append(string3);
                                                        } else {
                                                            sb2.append("'");
                                                            sb2.append(string3);
                                                            sb2.append("'");
                                                        }
                                                        if (i6 != jSONArray.length() - 1 && optJSONArray4 != null && i6 < optJSONArray4.length()) {
                                                            int i10 = optJSONArray4.getInt(i6);
                                                            sb2.append(" ");
                                                            sb2.append(f12864e[i10]);
                                                            sb2.append(" ");
                                                        }
                                                        i6++;
                                                        optJSONArray = jSONArray;
                                                    } catch (Exception e9) {
                                                        e = e9;
                                                        e.getMessage();
                                                        str4 = "";
                                                        String optString = jSONObject2.optString("o_f");
                                                        if (!TextUtils.isEmpty(optString)) {
                                                        }
                                                        optInt2 = jSONObject2.optInt(C4876a.PUSH_MINIFIED_BUTTONS_LIST, -1);
                                                        if (optInt2 != -1) {
                                                        }
                                                        if (!jSONObject2.isNull("l")) {
                                                        }
                                                        StringBuilder sb3 = new StringBuilder();
                                                        if (!TextUtils.isEmpty(str4)) {
                                                        }
                                                        if (!TextUtils.isEmpty(str5)) {
                                                        }
                                                        if (!TextUtils.isEmpty(str2)) {
                                                        }
                                                        sb = sb3.toString();
                                                        String str6 = "SELECT " + string + " FROM user_value_placement";
                                                        if (!TextUtils.isEmpty(sb)) {
                                                        }
                                                        double[] a9 = this.f12866g.a(new String[]{str3 + "(" + string + ")", "count(*)"}, "(" + str6 + ")");
                                                        d10 = a9[c9];
                                                        if (d10 > 0.0d) {
                                                        }
                                                    }
                                                }
                                                str4 = "WHERE ".concat(String.valueOf(sb2));
                                            } catch (Exception e10) {
                                                e = e10;
                                                c9 = 1;
                                                c10 = 0;
                                            }
                                            String optString2 = jSONObject2.optString("o_f");
                                            str5 = !TextUtils.isEmpty(optString2) ? "ORDER BY ".concat(String.valueOf(optString2)) : "";
                                            optInt2 = jSONObject2.optInt(C4876a.PUSH_MINIFIED_BUTTONS_LIST, -1);
                                            if (optInt2 != -1) {
                                                str5 = str5 + " " + f12865f[optInt2];
                                            }
                                            if (!jSONObject2.isNull("l") && (optInt = jSONObject2.optInt("l")) > 0) {
                                                str2 = "LIMIT ".concat(String.valueOf(optInt));
                                            }
                                            StringBuilder sb32 = new StringBuilder();
                                            if (!TextUtils.isEmpty(str4)) {
                                                sb32.append(str4);
                                                sb32.append(" ");
                                                sb32.append("AND ");
                                                sb32.append("placement_id");
                                                sb32.append("=");
                                                sb32.append("'");
                                                sb32.append(str);
                                                sb32.append("'");
                                            }
                                            if (!TextUtils.isEmpty(str5)) {
                                                if (sb32.length() > 0) {
                                                    sb32.append(" ");
                                                }
                                                sb32.append(str5);
                                            }
                                            if (!TextUtils.isEmpty(str2)) {
                                                if (sb32.length() > 0) {
                                                    sb32.append(" ");
                                                }
                                                sb32.append(str2);
                                            }
                                            sb = sb32.toString();
                                            String str62 = "SELECT " + string + " FROM user_value_placement";
                                            if (!TextUtils.isEmpty(sb)) {
                                                str62 = str62 + " " + sb;
                                            }
                                            double[] a92 = this.f12866g.a(new String[]{str3 + "(" + string + ")", "count(*)"}, "(" + str62 + ")");
                                            d10 = a92[c9];
                                            if (d10 > 0.0d) {
                                                return -1.0d;
                                            }
                                            if (jSONObject2.isNull("l")) {
                                                d11 = a92[c10];
                                            } else {
                                                if (d10 < jSONObject2.optInt("l")) {
                                                    return -1.0d;
                                                }
                                                d11 = a92[c10];
                                            }
                                            return d11;
                                        }
                                    } catch (Exception e11) {
                                        e = e11;
                                        e.getMessage();
                                        return d9;
                                    }
                                }
                                c9 = 1;
                                c10 = 0;
                                str4 = "";
                                String optString22 = jSONObject2.optString("o_f");
                                if (!TextUtils.isEmpty(optString22)) {
                                }
                                optInt2 = jSONObject2.optInt(C4876a.PUSH_MINIFIED_BUTTONS_LIST, -1);
                                if (optInt2 != -1) {
                                }
                                if (!jSONObject2.isNull("l")) {
                                    str2 = "LIMIT ".concat(String.valueOf(optInt));
                                }
                                StringBuilder sb322 = new StringBuilder();
                                if (!TextUtils.isEmpty(str4)) {
                                }
                                if (!TextUtils.isEmpty(str5)) {
                                }
                                if (!TextUtils.isEmpty(str2)) {
                                }
                                sb = sb322.toString();
                                String str622 = "SELECT " + string + " FROM user_value_placement";
                                if (!TextUtils.isEmpty(sb)) {
                                }
                                double[] a922 = this.f12866g.a(new String[]{str3 + "(" + string + ")", "count(*)"}, "(" + str622 + ")");
                                d10 = a922[c9];
                                if (d10 > 0.0d) {
                                }
                            }
                        }
                        str3 = "";
                        String string4 = jSONObject2.getString("q_f");
                        optJSONArray = jSONObject2.optJSONArray("w_c_f");
                        JSONArray optJSONArray22 = jSONObject2.optJSONArray("w_c_o");
                        JSONArray optJSONArray32 = jSONObject2.optJSONArray("w_c_v");
                        JSONArray optJSONArray42 = jSONObject2.optJSONArray("w_o");
                        d9 = -1.0d;
                        if (optJSONArray != null) {
                            if (optJSONArray.length() > 0) {
                            }
                        }
                        c9 = 1;
                        c10 = 0;
                        str4 = "";
                        String optString222 = jSONObject2.optString("o_f");
                        if (!TextUtils.isEmpty(optString222)) {
                        }
                        optInt2 = jSONObject2.optInt(C4876a.PUSH_MINIFIED_BUTTONS_LIST, -1);
                        if (optInt2 != -1) {
                        }
                        if (!jSONObject2.isNull("l")) {
                        }
                        StringBuilder sb3222 = new StringBuilder();
                        if (!TextUtils.isEmpty(str4)) {
                        }
                        if (!TextUtils.isEmpty(str5)) {
                        }
                        if (!TextUtils.isEmpty(str2)) {
                        }
                        sb = sb3222.toString();
                        String str6222 = "SELECT " + string4 + " FROM user_value_placement";
                        if (!TextUtils.isEmpty(sb)) {
                        }
                        double[] a9222 = this.f12866g.a(new String[]{str3 + "(" + string4 + ")", "count(*)"}, "(" + str6222 + ")");
                        d10 = a9222[c9];
                        if (d10 > 0.0d) {
                        }
                    }
                } catch (Exception e12) {
                    e = e12;
                    d9 = -1.0d;
                    e.getMessage();
                    return d9;
                }
            }
            double[] a92222 = this.f12866g.a(new String[]{str3 + "(" + string4 + ")", "count(*)"}, "(" + str6222 + ")");
            d10 = a92222[c9];
            if (d10 > 0.0d) {
            }
        } catch (Exception e13) {
            e = e13;
            e.getMessage();
            return d9;
        }
        jSONObject = null;
        if (jSONObject == null) {
        }
        jSONObject2 = jSONObject;
        i4 = jSONObject2.getInt("f");
        str2 = "";
        if (i4 >= 0) {
        }
        str3 = "";
        String string42 = jSONObject2.getString("q_f");
        optJSONArray = jSONObject2.optJSONArray("w_c_f");
        JSONArray optJSONArray222 = jSONObject2.optJSONArray("w_c_o");
        JSONArray optJSONArray322 = jSONObject2.optJSONArray("w_c_v");
        JSONArray optJSONArray422 = jSONObject2.optJSONArray("w_o");
        d9 = -1.0d;
        if (optJSONArray != null) {
        }
        c9 = 1;
        c10 = 0;
        str4 = "";
        String optString2222 = jSONObject2.optString("o_f");
        if (!TextUtils.isEmpty(optString2222)) {
        }
        optInt2 = jSONObject2.optInt(C4876a.PUSH_MINIFIED_BUTTONS_LIST, -1);
        if (optInt2 != -1) {
        }
        if (!jSONObject2.isNull("l")) {
        }
        StringBuilder sb32222 = new StringBuilder();
        if (!TextUtils.isEmpty(str4)) {
        }
        if (!TextUtils.isEmpty(str5)) {
        }
        if (!TextUtils.isEmpty(str2)) {
        }
        sb = sb32222.toString();
        String str62222 = "SELECT " + string42 + " FROM user_value_placement";
        if (!TextUtils.isEmpty(sb)) {
        }
    }

    private static JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("f", 2);
            jSONObject.put("q_f", e.a.f12854h);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put("type");
            jSONObject.put("w_c_f", jSONArray);
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(0);
            jSONObject.put("w_c_o", jSONArray2);
            JSONArray jSONArray3 = new JSONArray();
            jSONArray3.put("4");
            jSONObject.put("w_c_v", jSONArray3);
            jSONObject.put("o_f", e.a.i);
            jSONObject.put(C4876a.PUSH_MINIFIED_BUTTONS_LIST, 0);
            jSONObject.put("l", 3);
            return jSONObject;
        } catch (JSONException e9) {
            e9.getMessage();
            return jSONObject;
        }
    }
}
