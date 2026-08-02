package com.fillr.browsersdk.apiclient;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import androidx.core.os.CancellationSignal;
import com.caverock.androidsvg.SVG;
import com.fillr.browsersdk.Fillr;
import com.fillr.browsersdk.FillrAuthenticationStore;
import com.fillr.browsersdk.analytics.FillrAnalyticsEvents;
import com.fillr.browsersdk.model.FillrMapping;
import com.google.mlkit.vision.text.zzd;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class FillrMappingServiceClient {
    public static CancellationSignal captureDialogManager;
    public static Boolean isFeatureToggleUpdateRunning;
    public boolean delayCaptureValuesMappingRequestService = false;
    public boolean delayHeadlessFillMappingRequestService = false;
    public Fillr mFillr;

    /* renamed from: com.fillr.browsersdk.apiclient.FillrMappingServiceClient$1, reason: invalid class name */
    public final class AnonymousClass1 extends ResultReceiver {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ FillrMappingServiceClient this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(FillrMappingServiceClient fillrMappingServiceClient, Handler handler, int i) {
            super(handler);
            this.$r8$classId = i;
            this.this$0 = fillrMappingServiceClient;
        }

        @Override // android.os.ResultReceiver
        public final void onReceiveResult(int i, Bundle bundle) {
            int i2 = this.$r8$classId;
            FillrMappingServiceClient fillrMappingServiceClient = this.this$0;
            switch (i2) {
                case 0:
                    try {
                        HashMap hashMap = (HashMap) bundle.getSerializable("value_mappings");
                        fillrMappingServiceClient.mFillr.notifyCaptureValueListener(bundle.getString("com.fillr.viewid"), hashMap);
                        break;
                    } catch (Exception unused) {
                        SVG svg = Fillr.getInstance().fillrConfig;
                    }
                default:
                    try {
                        JSONObject jSONObject = new JSONObject(bundle.getString("raw_response"));
                        String string2 = bundle.getString("com.fillr.viewid");
                        long j = bundle.getLong("com.fillr.start_time");
                        ArrayList<String> stringArrayList = bundle.getStringArrayList("fields");
                        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("empty_fields");
                        if (fillrMappingServiceClient.mFillr == null) {
                            fillrMappingServiceClient.mFillr = Fillr.getInstance();
                        }
                        FillrMapping fillrMapping = new FillrMapping(jSONObject, stringArrayList, stringArrayList2);
                        fillrMapping.startTime = j;
                        fillrMappingServiceClient.mFillr.notifyProfileListener(fillrMapping, string2);
                        break;
                    } catch (Exception unused2) {
                        SVG svg2 = Fillr.getInstance().fillrConfig;
                        return;
                    }
            }
        }
    }

    /* renamed from: com.fillr.browsersdk.apiclient.FillrMappingServiceClient$2, reason: invalid class name */
    public final class AnonymousClass2 implements Runnable {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ FillrMappingServiceClient this$0;

        public /* synthetic */ AnonymousClass2(FillrMappingServiceClient fillrMappingServiceClient, int i) {
            this.$r8$classId = i;
            this.this$0 = fillrMappingServiceClient;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = this.$r8$classId;
            FillrMappingServiceClient fillrMappingServiceClient = this.this$0;
            switch (i) {
                case 0:
                    fillrMappingServiceClient.delayCaptureValuesMappingRequestService = false;
                    break;
                case 1:
                    fillrMappingServiceClient.delayHeadlessFillMappingRequestService = false;
                    break;
                default:
                    Date date = Fillr.getInstance().lastActiveTime;
                    if (date != null && System.currentTimeMillis() < date.getTime() + 300000) {
                        fillrMappingServiceClient.updateFeatureToggles();
                        new Handler(Looper.getMainLooper()).postDelayed(new AnonymousClass2(fillrMappingServiceClient, 2), 300000L);
                        break;
                    } else {
                        FillrMappingServiceClient.isFeatureToggleUpdateRunning = Boolean.FALSE;
                        break;
                    }
            }
        }
    }

    static {
        zzd.getInstance();
        isFeatureToggleUpdateRunning = Boolean.FALSE;
    }

    public FillrMappingServiceClient(Fillr fillr) {
        this.mFillr = fillr;
    }

    public final void runFeatureTogglesUpdateIfStopped() {
        if (isFeatureToggleUpdateRunning.booleanValue()) {
            return;
        }
        isFeatureToggleUpdateRunning = Boolean.TRUE;
        updateFeatureToggles();
        new Handler(Looper.getMainLooper()).postDelayed(new AnonymousClass2(this, 2), 300000L);
    }

    public final void sendPerformanceForHeadlessFill(FillrMapping fillrMapping) {
        if (fillrMapping != null) {
            try {
                JSONObject jSONObject = fillrMapping.formMetaData;
                double nanoTime = (System.nanoTime() - fillrMapping.startTime) / 1000000.0d;
                String string2 = jSONObject.getString("fill_id");
                if (nanoTime > 0.0d) {
                    Intent intent = new Intent("com.fillr.service.PerformanceStatsService");
                    intent.setPackage((String) this.mFillr.getIntentBuilder().mCenter);
                    intent.putExtra("PerformanceStatsServiceElapsedTime", nanoTime);
                    intent.putExtra("PerformanceStatsServiceFillID", string2);
                    intent.putExtra("PerformanceStatsServiceFilled", true);
                    intent.putExtra("com.fillr.headless.mode", true);
                    startFillrService(intent);
                    Fillr fillr = this.mFillr;
                    FillrAnalyticsEvents fillrAnalyticsEvents = FillrAnalyticsEvents.FillrFillHeadlessMode;
                    Iterator it = fillrMapping.fields.iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        if (((String) it.next()).startsWith("CreditCards.CreditCard")) {
                            i++;
                        }
                    }
                    String num = Integer.toString(i);
                    String str = "";
                    JSONObject optJSONObject = jSONObject.optJSONObject("location");
                    if (optJSONObject != null) {
                        try {
                            str = optJSONObject.getString("domain");
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                    fillr.trackEvent(fillrAnalyticsEvents, string2, num, str);
                }
            } catch (Exception unused) {
                SVG svg = Fillr.getInstance().fillrConfig;
            }
        }
    }

    public final void startFillrService(Intent intent) {
        try {
            Fillr fillr = this.mFillr;
            Activity activity = fillr.parentActivity;
            boolean z = true;
            if (fillr.currentState != 1) {
                z = false;
            }
            if (activity != null && z && FillrAuthenticationStore.isEnabled(activity)) {
                activity.startService(intent);
            }
        } catch (Exception unused) {
            SVG svg = Fillr.getInstance().fillrConfig;
        }
    }

    public final void updateFeatureToggles() {
        try {
            Intent intent = new Intent("com.fillr.service.FeatureFlagsService");
            intent.setPackage((String) this.mFillr.getIntentBuilder().mCenter);
            startFillrService(intent);
        } catch (Exception unused) {
            SVG svg = Fillr.getInstance().fillrConfig;
        }
    }
}
