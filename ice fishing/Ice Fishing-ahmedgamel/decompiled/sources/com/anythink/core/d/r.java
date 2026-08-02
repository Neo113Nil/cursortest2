package com.anythink.core.d;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.core.d.b;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    private static final String f18278a = "r";

    /* renamed from: b, reason: collision with root package name */
    private String f18279b;

    private String c(String str) {
        try {
            Context g9 = com.anythink.core.common.d.t.b().g();
            if (g9 != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(this.f18279b)) {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(g9.getResources().getAssets().open(this.f18279b + File.separator + str + ".json")));
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            return com.anythink.core.common.v.k.b(sb.toString());
                        }
                        sb.append(readLine);
                    }
                } catch (IOException unused) {
                }
            }
            return "";
        } catch (Exception e9) {
            Log.e(f18278a, "getPreAppStrategyStr() >>> error: " + e9.getMessage());
            return "";
        }
    }

    public final void a(String str) {
        this.f18279b = str;
    }

    public final b b(String str) {
        com.anythink.core.common.r.g a9;
        Looper.myLooper();
        Looper.getMainLooper();
        try {
            String c9 = c(str);
            if (!TextUtils.isEmpty(c9) && (a9 = com.anythink.core.common.r.g.a(new JSONObject(c9).optJSONObject(b.a.f18012k))) != null) {
                a9.j();
                b bVar = new b();
                bVar.a(a9);
                return bVar;
            }
        } catch (Throwable th) {
            th.getMessage();
        }
        return null;
    }
}
