package com.anythink.core.d;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    private static final String f18280a = "PrePlacementStrategy";

    /* renamed from: b, reason: collision with root package name */
    private String f18281b;

    private String c(String str) {
        int parseInt;
        int parseInt2;
        Context g9 = com.anythink.core.common.d.t.b().g();
        if (g9 != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(this.f18281b)) {
            try {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(g9.getResources().getAssets().open(this.f18281b + File.separator + str + ".json")));
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        sb.append(readLine);
                    }
                    JSONObject jSONObject = new JSONObject(com.anythink.core.common.v.k.b(sb.toString()));
                    int optInt = jSONObject.optInt(com.anythink.core.common.m.e.f15407M, 0);
                    if (optInt != 0) {
                        com.anythink.core.common.u.e.b("pre_s_cus_code_error", "sdk_cus_code = 0 strategy_cus_code = ".concat(String.valueOf(optInt)), com.anythink.core.common.d.t.b().r());
                        return "";
                    }
                    if (!jSONObject.isNull("sdk_ver")) {
                        String string = jSONObject.getString("sdk_ver");
                        if (!TextUtils.isEmpty(string) && (parseInt2 = Integer.parseInt(com.anythink.core.common.v.p.a().replace("UA_", "").replace(com.anythink.core.common.d.j.f13164z, ""))) < (parseInt = Integer.parseInt(string.replace(com.anythink.core.common.d.j.f13164z, "")))) {
                            Log.e(f18280a, "The sdk version(" + parseInt2 + ") must be greater than or equal to the version(" + parseInt + ") in the placement strategy.");
                            return "";
                        }
                    }
                    if (!jSONObject.isNull(com.anythink.core.common.m.e.bk)) {
                        String string2 = jSONObject.getString(com.anythink.core.common.m.e.bk);
                        if (!TextUtils.isEmpty(string2) && !str.equals(string2)) {
                            return "";
                        }
                    }
                    if (!jSONObject.isNull("pl_data")) {
                        return jSONObject.getJSONObject("pl_data").toString();
                    }
                } catch (IOException unused) {
                    return "";
                }
            } catch (Throwable th) {
                Log.e(f18280a, "Get pre placement strategy failed: " + th.getMessage());
            }
        }
        return "";
    }

    public final void a(String str) {
        this.f18281b = str;
    }

    public final l b(String str) {
        String c9 = c(str);
        if (TextUtils.isEmpty(c9)) {
            return null;
        }
        try {
            l a9 = l.a(str, new JSONObject(c9));
            a9.a(1);
            return a9;
        } catch (Throwable unused) {
            return null;
        }
    }
}
