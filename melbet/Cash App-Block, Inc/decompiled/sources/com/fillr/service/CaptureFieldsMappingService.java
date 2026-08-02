package com.fillr.service;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import android.os.ResultReceiver;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.profileinstaller.DeviceProfileWriter;
import coil3.request.OneShotDisposable;
import com.caverock.androidsvg.SVG;
import com.fillr.analytics.AnalyticsEvent;
import com.fillr.analytics.metrics.FillrAPI;
import com.fillr.analytics.metrics.PersistentIdentity;
import com.fillr.browsersdk.Fillr;
import com.fillr.browsersdk.model.FillrMappedFields;
import com.fillr.browsersdk.model.FillrMappingProcessor;
import com.fillr.browsersdk.model.FillrWidget;
import com.fillr.core.analytics.FillrAnalyticsServiceBuilder;
import com.fillr.core.apiclientv2.Repository;
import com.fillr.core.model.ModelBase;
import com.fillr.core.utilities.AppPreferenceStore;
import com.fillr.e0;
import com.fillr.n;
import com.google.android.gms.internal.time.zzbq;
import com.google.android.libraries.places.internal.zzka;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import net.oneformapp.ProfileStore_;
import net.oneformapp.schema.Schema_;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class CaptureFieldsMappingService extends BaseMappingService {
    public FillrWidget.WidgetSource autofillWidgetSource;
    public e0 captureDataPostProcessor;
    public FillrWidget.WidgetSource cartScraperWidgetSource;
    public Boolean isNewPage;
    public String mDevKey;
    public ProfileStore_ mProfileStore;
    public String mSdkVersion;
    public String mSecretKey;
    public FillrMappingProcessor mappingProcessor;
    public Repository repository;
    public ResultReceiver resultReceiver;
    public long startTime;
    public final HashMap fieldValueMap = new HashMap();
    public final OneShotDisposable addressCallBackListener = new OneShotDisposable(this, 15);

    @Override // com.fillr.core.apiclientv2.ConsumerAPIClientListener
    public final boolean onBeforeAPICallback() {
        return true;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.fillr.core.apiclientv2.ConsumerAPIClientListener
    public final void onConsumerAPICallProgressStart(String str) {
    }

    @Override // com.fillr.core.apiclientv2.ConsumerAPIClientListener
    public final void onConsumerAPIData(int i, ModelBase modelBase) {
        boolean z;
        boolean z2;
        if (modelBase instanceof FillrMappedFields) {
            FillrMappedFields fillrMappedFields = (FillrMappedFields) modelBase;
            if (!modelBase.mFromCache) {
                double nanoTime = (System.nanoTime() - this.startTime) / 1000000.0d;
                String str = fillrMappedFields.mFillId;
                if (nanoTime > 0.0d && str != null) {
                    try {
                        Intent intent = new Intent(this, (Class<?>) PerformanceStatsService.class);
                        intent.putExtra("PerformanceStatsServiceElapsedTime", nanoTime);
                        intent.putExtra("PerformanceStatsServiceFillID", str);
                        if (Fillr.getInstance().currentState == 1) {
                            startService(intent);
                        }
                    } catch (Exception unused) {
                        SVG svg = Fillr.getInstance().fillrConfig;
                    }
                }
            }
            String str2 = (String) this.fieldValueMap.get(Integer.valueOf(i));
            if (str2 != null && str2.length() > 0) {
                try {
                    Objects.toString(fillrMappedFields);
                    SVG svg2 = Fillr.getInstance().fillrConfig;
                    FillrMappingProcessor fillrMappingProcessor = new FillrMappingProcessor(this, fillrMappedFields, str2);
                    this.mappingProcessor = fillrMappingProcessor;
                    Fillr fillr = Fillr.getInstance();
                    if (fillr.isCaptureValueEnabled()) {
                        fillr.getFeatureToggleManager().getClass();
                        z = true;
                    } else {
                        z = false;
                    }
                    DeviceProfileWriter deviceProfileWriter = fillrMappingProcessor.captureValuesProcessor;
                    if (deviceProfileWriter != null) {
                        deviceProfileWriter.mDeviceSupportsAotProfile = z;
                    }
                    HashMap hashMap = this.mappingProcessor.mFieldValues;
                    if (hashMap == null || hashMap.size() <= 0) {
                        SVG svg3 = Fillr.getInstance().fillrConfig;
                    } else {
                        FillrMappingProcessor fillrMappingProcessor2 = this.mappingProcessor;
                        Fillr fillr2 = Fillr.getInstance();
                        if (fillr2.isCaptureValueEnabled()) {
                            fillr2.getFeatureToggleManager().getClass();
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        HashMap fieldNamespaceValueMappings = fillrMappingProcessor2.getFieldNamespaceValueMappings(true ^ z2);
                        Bundle bundle = new Bundle();
                        bundle.putSerializable("value_mappings", fieldNamespaceValueMappings);
                        Bundle bundle2 = fillrMappedFields.params.mSpecialParams;
                        bundle.putString("view_id", bundle2 != null ? bundle2.getString("view_id") : null);
                        this.resultReceiver.send(0, bundle);
                        if (Fillr.getInstance().mFillMode != 2) {
                            if (this.isNewPage.booleanValue()) {
                                this.mappingProcessor.refreshMappingCache();
                            }
                            FillrMappingProcessor fillrMappingProcessor3 = this.mappingProcessor;
                            OneShotDisposable oneShotDisposable = this.addressCallBackListener;
                            DeviceProfileWriter deviceProfileWriter2 = fillrMappingProcessor3.captureValuesProcessor;
                            if (deviceProfileWriter2 != null) {
                                deviceProfileWriter2.mApkName = oneShotDisposable;
                            }
                            HashMap captureFormFieldValues = fillrMappingProcessor3.captureFormFieldValues();
                            this.captureDataPostProcessor.checkAndFilterMappingResultForSensitiveData(captureFormFieldValues);
                            this.mProfileStore.setData(captureFormFieldValues);
                            this.mProfileStore.store();
                            AnalyticsEvent analyticsEvent = new AnalyticsEvent();
                            analyticsEvent.action = "End Capture";
                            FillrAnalyticsServiceBuilder.build().sendEvent(this, analyticsEvent);
                        }
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        stopSelf(i);
    }

    @Override // com.fillr.core.apiclientv2.ConsumerAPIClientListener
    public final void onConsumerAPILog(String str) {
    }

    @Override // com.fillr.service.BaseMappingService, android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.repository = new Repository(new Repository(this));
        ProfileStore_ instance_ = ProfileStore_.getInstance_(this);
        this.mProfileStore = instance_;
        instance_.loadStoredPin();
        e0 e0Var = new e0(this);
        this.captureDataPostProcessor = e0Var;
        e0Var.a = new n.b(this, 17);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        e0 e0Var = this.captureDataPostProcessor;
        LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance((CaptureFieldsMappingService) e0Var.i);
        zzbq zzbqVar = (zzbq) e0Var.h;
        synchronized (localBroadcastManager.mReceivers) {
            try {
                ArrayList arrayList = (ArrayList) localBroadcastManager.mReceivers.remove(zzbqVar);
                if (arrayList == null) {
                    return;
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    LocalBroadcastManager.ReceiverRecord receiverRecord = (LocalBroadcastManager.ReceiverRecord) arrayList.get(size);
                    receiverRecord.dead = true;
                    for (int i = 0; i < receiverRecord.filter.countActions(); i++) {
                        String action = receiverRecord.filter.getAction(i);
                        ArrayList arrayList2 = (ArrayList) localBroadcastManager.mActions.get(action);
                        if (arrayList2 != null) {
                            for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                                LocalBroadcastManager.ReceiverRecord receiverRecord2 = (LocalBroadcastManager.ReceiverRecord) arrayList2.get(size2);
                                if (receiverRecord2.receiver == zzbqVar) {
                                    receiverRecord2.dead = true;
                                    arrayList2.remove(size2);
                                }
                            }
                            if (arrayList2.size() <= 0) {
                                localBroadcastManager.mActions.remove(action);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.fillr.service.BaseMappingService, android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        processMappingRequest(i2, intent);
        return 1;
    }

    @Override // com.fillr.service.BaseMappingService
    public final void processMappingRequest(int i, Intent intent) {
        if (!Fillr.getInstance().isCaptureValueEnabled() || intent == null) {
            return;
        }
        FillrAPI fillrAPI = FillrAPI.getInstance(this, (String) FillrAnalyticsServiceBuilder.build().mCenter);
        if (fillrAPI != null) {
            long currentTimeMillis = System.currentTimeMillis();
            synchronized (fillrAPI.mEventTimings) {
                fillrAPI.mEventTimings.put("End Capture", Long.valueOf(currentTimeMillis));
                PersistentIdentity persistentIdentity = fillrAPI.mPersistentIdentity;
                persistentIdentity.getClass();
                try {
                    SharedPreferences.Editor edit = ((SharedPreferences) persistentIdentity.mTimeEventsPreferences.get()).edit();
                    edit.putLong("End Capture", currentTimeMillis);
                    edit.apply();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ExecutionException e2) {
                    e2.printStackTrace();
                }
            }
        }
        Bundle extras = intent.getExtras();
        String stringExtra = intent.getStringExtra("com.fillr.jsonfields");
        this.mDevKey = intent.getStringExtra("com.fillr.devkey");
        this.mSecretKey = intent.getStringExtra("com.fillr.secretkey");
        this.mSdkVersion = intent.getStringExtra("com.fillr.sdkversion");
        this.autofillWidgetSource = (FillrWidget.WidgetSource) intent.getSerializableExtra("com.fillr.autofillwidgetsource");
        this.cartScraperWidgetSource = (FillrWidget.WidgetSource) intent.getSerializableExtra("com.fillr.cartscraperwidgetsource");
        String stringExtra2 = intent.getStringExtra("com.fillr.jsonvalues");
        if (this.fieldValueMap.size() > 1000) {
            this.fieldValueMap.clear();
        }
        this.fieldValueMap.put(Integer.valueOf(i), stringExtra2);
        this.isNewPage = Boolean.valueOf(intent.getBooleanExtra("com.fillr.isnewpage", false));
        SVG svg = Fillr.getInstance().fillrConfig;
        if (extras != null) {
            this.resultReceiver = (ResultReceiver) extras.getParcelable("receiver");
        }
        if (this.repository != null && stringExtra != null) {
            try {
                Schema_ instance_ = Schema_.getInstance_(getApplicationContext());
                zzka zzkaVar = new zzka(this, stringExtra);
                zzkaVar.zze = (String) instance_.mVersion;
                zzkaVar.zzf = this.mDevKey;
                zzkaVar.zzg = this.mSecretKey;
                zzkaVar.zzh = false;
                zzkaVar.zzb = this.autofillWidgetSource;
                zzkaVar.zzi = this.cartScraperWidgetSource;
                zzkaVar.zzc = 2;
                JSONObject buildJson = zzkaVar.buildJson();
                this.startTime = System.nanoTime();
                ((Repository) this.repository.consumerAPIClient).getMappingFields(i, buildJson, this, null);
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
        if (this.isNewPage.booleanValue()) {
            e0 e0Var = this.captureDataPostProcessor;
            AppPreferenceStore appPreferenceStore = (AppPreferenceStore) e0Var.f;
            SharedPreferences sharedPreferences = appPreferenceStore.mPreferences;
            e0.shouldShowPasswordPrompt = sharedPreferences != null ? sharedPreferences.getBoolean("F_SHOW_PASSWORD_PROMPT", true) : false;
            SharedPreferences sharedPreferences2 = appPreferenceStore.mPreferences;
            e0.shouldShowCreditCardPrompt = sharedPreferences2 != null ? sharedPreferences2.getBoolean("F_SHOW_CREDIT_CARD_PROMPT", true) : false;
            SharedPreferences sharedPreferences3 = appPreferenceStore.mPreferences;
            e0.shouldCapturePasswordValue = sharedPreferences3 != null ? sharedPreferences3.getBoolean("F_CAPTURE_PASSWORD", true) : false;
            SharedPreferences sharedPreferences4 = appPreferenceStore.mPreferences;
            e0.shouldCaptureCreditCardValue = sharedPreferences4 != null ? sharedPreferences4.getBoolean("F_CAPTURE_CREDIT_CARD", true) : false;
            HashMap hashMap = (HashMap) e0Var.b;
            if (hashMap != null) {
                hashMap.clear();
            }
            HashMap hashMap2 = (HashMap) e0Var.c;
            if (hashMap2 != null) {
                hashMap2.clear();
            }
        }
    }
}
