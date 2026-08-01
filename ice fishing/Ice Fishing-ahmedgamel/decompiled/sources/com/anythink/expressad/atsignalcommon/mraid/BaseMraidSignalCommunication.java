package com.anythink.expressad.atsignalcommon.mraid;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.expressad.a;
import com.anythink.expressad.atsignalcommon.windvane.AbsFeedBackForH5;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.atsignalcommon.windvane.b;
import com.anythink.expressad.foundation.d.d;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class BaseMraidSignalCommunication extends AbsFeedBackForH5 {

    /* renamed from: a, reason: collision with root package name */
    private IMraidSignalCommunication f18032a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.anythink.expressad.atsignalcommon.windvane.j
    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        super.initialize(context, windVaneWebView);
        try {
            if (context instanceof IMraidSignalCommunication) {
                this.f18032a = (IMraidSignalCommunication) context;
                return;
            }
            if (windVaneWebView.getObject() != null && (windVaneWebView.getObject() instanceof IMraidSignalCommunication)) {
                this.f18032a = (IMraidSignalCommunication) windVaneWebView.getObject();
            }
            if (windVaneWebView.getMraidObject() == null || !(windVaneWebView.getMraidObject() instanceof IMraidSignalCommunication)) {
                return;
            }
            this.f18032a = (IMraidSignalCommunication) windVaneWebView.getMraidObject();
        } catch (Exception e9) {
            if (a.f17618a) {
                e9.printStackTrace();
            }
        }
    }

    public void open(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        if (obj instanceof b) {
            windVaneWebView = ((b) obj).f18062a;
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.a(windVaneWebView, "open");
        } else {
            windVaneWebView = null;
        }
        try {
            String optString = new JSONObject(str).optString("url");
            if (this.f18032a == null || TextUtils.isEmpty(optString)) {
                return;
            }
            if (windVaneWebView == null || System.currentTimeMillis() - windVaneWebView.lastTouchTime <= com.anythink.expressad.b.c.a.f18198c) {
                this.f18032a.open(optString);
                return;
            }
            d mraidCampaign = this.f18032a.getMraidCampaign();
            windVaneWebView.getUrl();
            com.anythink.expressad.b.c.a.a(mraidCampaign);
        } catch (Throwable unused) {
        }
    }
}
