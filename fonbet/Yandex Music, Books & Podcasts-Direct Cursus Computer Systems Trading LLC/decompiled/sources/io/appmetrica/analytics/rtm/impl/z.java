package io.appmetrica.analytics.rtm.impl;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import defpackage.qen;
import defpackage.ren;
import defpackage.sen;
import defpackage.ven;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.coreutils.internal.services.frequency.EventFrequencyOverWindowLimitDetector;
import io.appmetrica.analytics.rtm.internal.Constants;
import io.appmetrica.analytics.rtm.internal.service.DataSendingRestrictionProvider;
import io.appmetrica.analytics.rtm.internal.service.ReporterEventProcessorComponents;
import io.appmetrica.analytics.rtm.internal.service.UploadScheduler;
import io.appmetrica.analytics.rtm.internal.service.UploadSchedulerConfig;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class z {
    public static final int i = 10;
    public final ReporterEventProcessorComponents a;
    public EventFrequencyOverWindowLimitDetector b;
    public EventFrequencyOverWindowLimitDetector c;
    public String d = "default";
    public final y e;
    public final UploadScheduler f;
    public static final Boolean g = Boolean.FALSE;
    public static final long h = 300000;
    public static final long j = 600000;

    public z(ReporterEventProcessorComponents reporterEventProcessorComponents, String str, A a, DataSendingRestrictionProvider dataSendingRestrictionProvider) {
        this.a = reporterEventProcessorComponents;
        UploadScheduler uploadScheduler = new UploadScheduler(reporterEventProcessorComponents.getExecutor(), reporterEventProcessorComponents.getRtmLibBuilderWrapper(), reporterEventProcessorComponents.getTempCacheStorage(), str, dataSendingRestrictionProvider);
        this.f = uploadScheduler;
        this.e = new y(reporterEventProcessorComponents.getContext(), reporterEventProcessorComponents.getDefaultValuesProvider(), reporterEventProcessorComponents.getRtmLibBuilderWrapper(), uploadScheduler, a);
    }

    public final void a(@NonNull Bundle bundle) {
        ven a;
        String string = bundle.getString(Constants.KEY_ACTION);
        String string2 = bundle.getString("data");
        if (Constants.ACTION_UPDATE_RTM_CONFIG.equals(string)) {
            b(string2);
            return;
        }
        try {
            if (!Constants.ACTION_REPORT_EVENT.equals(string)) {
                if (Constants.ACTION_REPORT_ERROR.equals(string)) {
                    a(string2);
                    return;
                }
                if (!Constants.ACTION_REPORT_EXCEPTION.equals(string) || TextUtils.isEmpty(string2)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject(string2);
                String optString = jSONObject.optString(Constants.KEY_MESSAGE);
                String optString2 = jSONObject.optString(Constants.KEY_EXCEPTION);
                if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
                    return;
                }
                EventFrequencyOverWindowLimitDetector eventFrequencyOverWindowLimitDetector = this.b;
                this.e.a(optString, optString2, eventFrequencyOverWindowLimitDetector == null ? null : Boolean.valueOf(eventFrequencyOverWindowLimitDetector.detect(optString)));
                return;
            }
            if (TextUtils.isEmpty(string2)) {
                return;
            }
            JSONObject jSONObject2 = new JSONObject(string2);
            String optString3 = jSONObject2.optString("eventName");
            if (TextUtils.isEmpty(optString3)) {
                return;
            }
            y yVar = this.e;
            i iVar = new i(jSONObject2, optString3);
            synchronized (yVar) {
                try {
                    a = yVar.a();
                } catch (Throwable unused) {
                }
                if (a == null) {
                    return;
                }
                sen a2 = iVar.a(a);
                a2.f = yVar.a;
                a2.g = yVar.b;
                a2.h = yVar.c;
                iVar.a((qen) a2);
                a2.e();
            }
        } catch (Throwable unused2) {
        }
    }

    public void b(String str) {
        UploadSchedulerConfig uploadSchedulerConfig;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.e.a(jSONObject.optJSONObject("projectName"), jSONObject.optJSONObject("version"), jSONObject.optJSONObject("platform"), jSONObject.optJSONObject(Constants.KEY_VERSION_FLAVOR), jSONObject.optJSONObject("userAgent"), jSONObject.optJSONObject("environment"), jSONObject.optJSONObject("userId"), jSONObject.optJSONObject("experiment"), jSONObject.optJSONObject("slot"), jSONObject.optJSONObject("uploadUrl"));
            this.d = "default";
            JSONObject optJSONObject = jSONObject.optJSONObject("projectName");
            if (optJSONObject != null) {
                this.d = optJSONObject.optString(Constants.KEY_VALUE, this.d);
            }
            a(jSONObject);
            Boolean optBooleanOrNull = JsonUtils.optBooleanOrNull(jSONObject, "events_sending_retry_enabled");
            Long optLongOrNull = JsonUtils.optLongOrNull(jSONObject, "events_sending_retry_ttl");
            if (optBooleanOrNull != null && optLongOrNull != null) {
                uploadSchedulerConfig = new UploadSchedulerConfig(optBooleanOrNull.booleanValue(), optLongOrNull.longValue());
                this.f.setUploadSchedulerConfig(uploadSchedulerConfig);
            }
            uploadSchedulerConfig = new UploadSchedulerConfig(false, j);
            this.f.setUploadSchedulerConfig(uploadSchedulerConfig);
        } catch (Throwable unused) {
        }
    }

    public final void a(JSONObject jSONObject) {
        boolean optBoolean = jSONObject.optBoolean("silent_frequent_errors", g.booleanValue());
        long optLong = jSONObject.optLong("silent_frequent_errors_time_window", h);
        int optInt = jSONObject.optInt("silent_frequent_errors_count_limit", 10);
        if (optBoolean) {
            EventFrequencyOverWindowLimitDetector eventFrequencyOverWindowLimitDetector = this.b;
            if (eventFrequencyOverWindowLimitDetector == null) {
                this.b = new EventFrequencyOverWindowLimitDetector(optLong, optInt, new k(this.a.getBinaryDataHelper(), this.d, optLong));
            } else {
                eventFrequencyOverWindowLimitDetector.updateParameters(optLong, optInt);
            }
            EventFrequencyOverWindowLimitDetector eventFrequencyOverWindowLimitDetector2 = this.c;
            if (eventFrequencyOverWindowLimitDetector2 == null) {
                this.c = new EventFrequencyOverWindowLimitDetector(optLong, optInt, this.a.getErrorsFrequencyStorage());
            } else {
                eventFrequencyOverWindowLimitDetector2.updateParameters(optLong, optInt);
            }
        }
    }

    public final void a(String str) {
        ven a;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString(Constants.KEY_MESSAGE);
            Boolean bool = null;
            String optString2 = jSONObject.has("source") ? jSONObject.optString("source") : null;
            if (TextUtils.isEmpty(optString)) {
                return;
            }
            EventFrequencyOverWindowLimitDetector eventFrequencyOverWindowLimitDetector = this.c;
            if (eventFrequencyOverWindowLimitDetector != null) {
                if (TextUtils.isEmpty(optString2)) {
                    optString2 = optString;
                }
                bool = Boolean.valueOf(eventFrequencyOverWindowLimitDetector.detect(this.d + "_" + optString2));
            }
            y yVar = this.e;
            h hVar = new h(jSONObject, optString, bool);
            synchronized (yVar) {
                try {
                    a = yVar.a();
                } catch (Throwable unused) {
                }
                if (a == null) {
                    return;
                }
                ren a2 = a.a(hVar.c);
                a2.f = yVar.a;
                a2.g = yVar.b;
                a2.h = yVar.c;
                hVar.a((qen) a2);
                a2.e();
            }
        } catch (Throwable unused2) {
        }
    }
}
