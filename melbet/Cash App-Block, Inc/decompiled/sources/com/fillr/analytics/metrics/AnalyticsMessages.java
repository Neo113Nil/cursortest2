package com.fillr.analytics.metrics;

import android.content.Context;
import com.fillr.browsersdk.Fillr;
import com.google.android.gms.measurement.internal.zzbc;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class AnalyticsMessages {
    public static final HashMap sInstances = new HashMap();
    public final FAConfig mConfig;
    public final Context mContext;
    public final zzbc mWorker = new zzbc(this);

    public final class EventDescription {
        public final String eventName;
        public final JSONObject properties;
        public final String token;

        public EventDescription(JSONObject jSONObject, String str, String str2) {
            this.eventName = str;
            this.properties = jSONObject;
            this.token = str2;
        }
    }

    /* renamed from: -$$Nest$mlogAboutMessageToMixpanel, reason: not valid java name */
    public static void m1934$$Nest$mlogAboutMessageToMixpanel(AnalyticsMessages analyticsMessages) {
        analyticsMessages.getClass();
        Thread.currentThread().getId();
    }

    public AnalyticsMessages(Context context) {
        this.mContext = context;
        this.mConfig = FAConfig.getInstance(context);
        new Thread(new Fillr.AnonymousClass3(2)).start();
    }
}
