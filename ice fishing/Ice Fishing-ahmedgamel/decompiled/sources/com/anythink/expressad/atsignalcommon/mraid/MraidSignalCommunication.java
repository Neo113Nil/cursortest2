package com.anythink.expressad.atsignalcommon.mraid;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.express.b.a;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.atsignalcommon.windvane.b;
import com.anythink.expressad.foundation.d.d;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class MraidSignalCommunication extends BaseMraidSignalCommunication {

    /* renamed from: a, reason: collision with root package name */
    protected static final String f18820a = "MraidSignalCommunication";
    private IMraidSignalCommunication i;

    public void close(Object obj, String str) {
        if (obj instanceof b) {
            a.a();
            a.a(((b) obj).f18849a, d.cs);
        }
        try {
            IMraidSignalCommunication iMraidSignalCommunication = this.i;
            if (iMraidSignalCommunication != null) {
                iMraidSignalCommunication.close();
            }
        } catch (Throwable unused) {
        }
    }

    public void expand(Object obj, String str) {
        if (obj instanceof b) {
            a.a();
            a.a(((b) obj).f18849a, "expand");
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("url");
            String optString2 = jSONObject.optString("shouldUseCustomClose");
            if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2) || this.i == null) {
                return;
            }
            this.i.expand(optString, optString2.toLowerCase().equals("true"));
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.anythink.expressad.atsignalcommon.mraid.BaseMraidSignalCommunication, com.anythink.expressad.atsignalcommon.windvane.j
    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        super.initialize(context, windVaneWebView);
        try {
            if (context instanceof IMraidSignalCommunication) {
                this.i = (IMraidSignalCommunication) context;
                return;
            }
            if (windVaneWebView.getObject() != null && (windVaneWebView.getObject() instanceof IMraidSignalCommunication)) {
                this.i = (IMraidSignalCommunication) windVaneWebView.getObject();
            }
            if (windVaneWebView.getMraidObject() == null || !(windVaneWebView.getMraidObject() instanceof IMraidSignalCommunication)) {
                return;
            }
            this.i = (IMraidSignalCommunication) windVaneWebView.getMraidObject();
        } catch (Exception e9) {
            if (com.anythink.expressad.a.f18405a) {
                e9.printStackTrace();
            }
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.BaseMraidSignalCommunication
    public void open(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        if (obj instanceof b) {
            b bVar = (b) obj;
            windVaneWebView = bVar.f18849a;
            a.a();
            a.a(bVar.f18849a, "open");
        } else {
            windVaneWebView = null;
        }
        try {
            String optString = new JSONObject(str).optString("url");
            if (this.i == null || TextUtils.isEmpty(optString)) {
                return;
            }
            if (windVaneWebView == null || System.currentTimeMillis() - windVaneWebView.lastTouchTime <= com.anythink.expressad.b.c.a.f18985c) {
                this.i.open(optString);
                return;
            }
            d mraidCampaign = this.i.getMraidCampaign();
            windVaneWebView.getUrl();
            com.anythink.expressad.b.c.a.a(mraidCampaign);
        } catch (Throwable unused) {
        }
    }

    public void setOrientationProperties(Object obj, String str) {
        String str2;
        if (obj instanceof b) {
            a.a();
            a.a(((b) obj).f18849a, "setOrientationProperties");
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("allowOrientationChange");
            String optString2 = jSONObject.optString("forceOrientation");
            if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2) || this.i == null) {
                return;
            }
            optString.toLowerCase().equals("true");
            String lowerCase = optString2.toLowerCase();
            int hashCode = lowerCase.hashCode();
            if (hashCode == 729267099) {
                str2 = "portrait";
            } else if (hashCode != 1430647483) {
                return;
            } else {
                str2 = "landscape";
            }
            lowerCase.equals(str2);
        } catch (Throwable unused) {
        }
    }

    public void unload(Object obj, String str) {
        if (obj instanceof b) {
            a.a();
            a.a(((b) obj).f18849a, "unload");
        }
        try {
            IMraidSignalCommunication iMraidSignalCommunication = this.i;
            if (iMraidSignalCommunication != null) {
                iMraidSignalCommunication.unload();
            }
        } catch (Throwable unused) {
        }
    }

    public void useCustomClose(Object obj, String str) {
        if (obj instanceof b) {
            a.a();
            a.a(((b) obj).f18849a, "useCustomClose");
        }
        try {
            String optString = new JSONObject(str).optString("shouldUseCustomClose");
            if (TextUtils.isEmpty(optString) || this.i == null) {
                return;
            }
            this.i.useCustomClose(optString.toLowerCase().equals("true"));
        } catch (Throwable unused) {
        }
    }
}
