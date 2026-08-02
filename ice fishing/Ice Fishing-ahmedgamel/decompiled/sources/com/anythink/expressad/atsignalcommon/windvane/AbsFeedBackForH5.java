package com.anythink.expressad.atsignalcommon.windvane;

import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class AbsFeedBackForH5 extends BaseAbsFeedBackForH5 {
    @Override // com.anythink.expressad.atsignalcommon.windvane.BaseAbsFeedBackForH5
    public void getCacheKey(Object obj, String str) {
        try {
            com.anythink.expressad.atsignalcommon.d.a.a().a(obj);
        } catch (Throwable th) {
            callbackExcep(obj, th.getMessage());
            th.printStackTrace();
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.BaseAbsFeedBackForH5
    public void startShake(Object obj, String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                jSONObject.optInt("deviceMotionUpdateInterval", 1);
                com.anythink.expressad.atsignalcommon.d.a.a().a(obj, ((b) obj).f18849a, jSONObject.optString("oldCache", ""), jSONObject.optString(com.anythink.expressad.foundation.g.g.a.b.f20208O, ""));
            }
            callbackSuccess(obj);
        } catch (Throwable th) {
            callbackExcep(obj, th.getMessage());
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.BaseAbsFeedBackForH5
    public void stopShake(Object obj, String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                com.anythink.expressad.atsignalcommon.d.a.a().a(obj, ((b) obj).f18849a, new JSONObject(str).optString(com.anythink.expressad.foundation.g.g.a.b.f20208O, ""));
            }
            callbackSuccess(obj);
        } catch (Throwable th) {
            callbackExcep(obj, th.getMessage());
        }
    }
}
