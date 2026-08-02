package io.appmetrica.analytics.push.impl;

import android.content.Context;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class F2 implements w2 {
    @Override // io.appmetrica.analytics.push.impl.w2
    public final void a(Context context, u2 u2Var) {
        y2 y2Var = r.a(context).e;
        if (y2Var != null) {
            y2Var.a(u2Var.b, u2Var.a, System.currentTimeMillis());
        }
        Y1 y1 = Y1.b;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(AuthSdkActivity.RESPONSE_TYPE_TOKEN, u2Var.b);
        y1.onPushTokenUpdated(jSONObject.toString(), u2Var.a);
    }
}
