package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.yandex.go.design.compose.modal.bottomsheet.c;
import java.util.ArrayList;
import kotlin.Result;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public abstract class upb1 {
    public static final void a(bzd bzdVar, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-882678395);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(bzdVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            c.a(null, null, null, false, false, null, null, wwg.S(535591763, true, new wg0(14, tlsVar), btsVar), null, null, wwg.S(-219028591, true, new sp5(23, bzdVar, tlsVar), btsVar), wwg.S(1883495653, true, new alb0(7, bzdVar), btsVar), btsVar, 12582912, 54, 895);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zyd(bzdVar, tlsVar, i, 0);
        }
    }

    public static final dh40 b(zg40 zg40Var) {
        return new dh40(zg40Var.a, zg40Var.b, zg40Var.c, zg40Var.d, zg40Var.e, zg40Var.f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0141 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static q7z0 c(Context context, JSONObject jSONObject, u2l u2lVar, wa90 wa90Var) {
        JSONArray optJSONArray;
        n7z0 n7z0Var;
        Object failure;
        v3k v3kVar;
        Object p7z0Var;
        String str = null;
        if (jSONObject == null || (optJSONArray = jSONObject.optJSONArray("items")) == null) {
            return null;
        }
        boolean z = false;
        d6w n = y6i0.n(0, optJSONArray.length());
        ArrayList arrayList = new ArrayList();
        c6w it = n.iterator();
        while (it.c) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(it.nextInt());
            if (optJSONObject != null) {
                String optString = optJSONObject.optString("id");
                String str2 = (optString == null || optString.length() == 0) ? str : optString;
                if (str2 != null) {
                    String optString2 = optJSONObject.optString("label");
                    String str3 = (optString2 == null || optString2.length() == 0) ? str : optString2;
                    String optString3 = optJSONObject.optString("top_label");
                    String str4 = (optString3 == null || optString3.length() == 0) ? str : optString3;
                    boolean optBoolean = optJSONObject.optBoolean("is_shimmering", z);
                    if (optBoolean || str3 != null || str4 != null) {
                        Resources resources = context.getResources();
                        int i = usg0.default_bar_height_fraction;
                        ThreadLocal threadLocal = wuj0.a;
                        float optDouble = (float) optJSONObject.optDouble("height_ratio", resources.getFloat(i));
                        float optDouble2 = (float) optJSONObject.optDouble("width_ratio", 1.0d);
                        String optString4 = optJSONObject.optString("accessibility_label");
                        String str5 = (optString4 == null || optString4.length() == 0) ? str : optString4;
                        String optString5 = optJSONObject.optString("image_url");
                        String str6 = (optString5 == null || optString5.length() == 0) ? str : optString5;
                        JSONObject optJSONObject2 = optJSONObject.optJSONObject("design_configuration");
                        if (optJSONObject2 != null) {
                            JSONObject optJSONObject3 = optJSONObject2.optJSONObject("foreground_color");
                            o7z0 d = optJSONObject3 != null ? d(optJSONObject3, wa90Var) : str;
                            JSONObject optJSONObject4 = optJSONObject2.optJSONObject("label_color");
                            o7z0 d2 = optJSONObject4 != null ? d(optJSONObject4, wa90Var) : str;
                            JSONObject optJSONObject5 = optJSONObject2.optJSONObject("top_label_color");
                            o7z0 d3 = optJSONObject5 != null ? d(optJSONObject5, wa90Var) : null;
                            JSONObject optJSONObject6 = optJSONObject2.optJSONObject("image_tint_color");
                            n7z0Var = new n7z0(d, d2, d3, optJSONObject6 != null ? d(optJSONObject6, wa90Var) : null);
                        } else {
                            n7z0Var = null;
                        }
                        JSONObject optJSONObject7 = optJSONObject.optJSONObject("on_select_action");
                        if (optJSONObject7 != null) {
                            try {
                                kvo kvoVar = v3k.m;
                                try {
                                    failure = kp50.p(u2lVar, optJSONObject7);
                                } catch (Throwable th) {
                                    th = th;
                                    failure = new Result.Failure(th);
                                    if (failure instanceof Result.Failure) {
                                    }
                                    v3kVar = (v3k) failure;
                                    p7z0Var = new p7z0(str2, str3, str4, optDouble, optDouble2, optBoolean, str5, str6, n7z0Var, v3kVar, optJSONObject.optInt("width_autofit_text", 0));
                                    if (p7z0Var != null) {
                                    }
                                    str = null;
                                    z = false;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                            if (failure instanceof Result.Failure) {
                                failure = null;
                            }
                            v3kVar = (v3k) failure;
                        } else {
                            v3kVar = null;
                        }
                        p7z0Var = new p7z0(str2, str3, str4, optDouble, optDouble2, optBoolean, str5, str6, n7z0Var, v3kVar, optJSONObject.optInt("width_autofit_text", 0));
                        if (p7z0Var != null) {
                            arrayList.add(p7z0Var);
                        }
                        str = null;
                        z = false;
                    }
                }
            }
            p7z0Var = str;
            if (p7z0Var != null) {
            }
            str = null;
            z = false;
        }
        String optString6 = jSONObject.optString("selected_id");
        return new q7z0(arrayList, (optString6 == null || optString6.length() == 0) ? null : optString6, jSONObject.optBoolean("is_enabled", true), jSONObject.optBoolean("on_scroll_action_enabled", false));
    }

    public static o7z0 d(JSONObject jSONObject, wa90 wa90Var) {
        String optString = jSONObject.optString("focused");
        String obj = optString != null ? evu0.k0(optString).toString() : null;
        if (obj == null) {
            obj = "";
        }
        Integer a = obj.length() != 0 ? wa90Var.a(obj) : null;
        String optString2 = jSONObject.optString("unfocused");
        String obj2 = optString2 != null ? evu0.k0(optString2).toString() : null;
        String str = obj2 != null ? obj2 : "";
        return new o7z0(a, str.length() != 0 ? wa90Var.a(str) : null);
    }
}
