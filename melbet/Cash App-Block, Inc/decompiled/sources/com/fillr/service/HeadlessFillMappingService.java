package com.fillr.service;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.ResultReceiver;
import android.util.Log;
import com.fillr.browsersdk.model.FillrMappedField;
import com.fillr.browsersdk.model.FillrMappedFields;
import com.fillr.browsersdk.model.FillrWidget;
import com.fillr.core.apiclientv2.Repository;
import com.fillr.core.model.ModelBase;
import com.fillr.m1;
import com.google.android.libraries.places.internal.zzka;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import net.oneformapp.schema.Schema_;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class HeadlessFillMappingService extends BaseMappingService {
    public final m1 mMappingRequestListener = new m1(this, 17);
    public ResultReceiver resultReceiver;
    public long startTime;

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
        if (modelBase instanceof FillrMappedFields) {
            FillrMappedFields fillrMappedFields = (FillrMappedFields) modelBase;
            HashMap hashMap = fillrMappedFields.basicFieldPopIdMapping;
            m1 m1Var = this.mMappingRequestListener;
            if (m1Var != null) {
                HeadlessFillMappingService headlessFillMappingService = (HeadlessFillMappingService) m1Var.a;
                try {
                    ArrayList<String> arrayList = new ArrayList<>();
                    for (Map.Entry entry : hashMap.entrySet()) {
                        String str = (String) entry.getKey();
                        if (((FillrMappedField) entry.getValue()).fieldEmptyValue) {
                            arrayList.add(str);
                        }
                    }
                    Bundle bundle = new Bundle();
                    JSONObject jSONObject = fillrMappedFields.rawResponse;
                    bundle.putString("raw_response", jSONObject != null ? jSONObject.toString() : null);
                    Bundle bundle2 = fillrMappedFields.params.mSpecialParams;
                    bundle.putString("com.fillr.viewid", bundle2 != null ? bundle2.getString("view_id") : null);
                    bundle.putLong("com.fillr.start_time", headlessFillMappingService.startTime);
                    bundle.putStringArrayList("fields", new ArrayList<>(hashMap.keySet()));
                    bundle.putStringArrayList("empty_fields", arrayList);
                    headlessFillMappingService.resultReceiver.send(0, bundle);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        stopSelf(i);
    }

    @Override // com.fillr.core.apiclientv2.ConsumerAPIClientListener
    public final void onConsumerAPILog(String str) {
    }

    @Override // com.fillr.service.BaseMappingService
    public final void processMappingRequest(int i, Intent intent) {
        Bundle extras;
        if (intent == null || (extras = intent.getExtras()) == null || !extras.containsKey("receiver")) {
            return;
        }
        this.resultReceiver = (ResultReceiver) extras.getParcelable("receiver");
        String stringExtra = intent.hasExtra("com.fillr.jsonfields") ? intent.getStringExtra("com.fillr.jsonfields") : null;
        String stringExtra2 = intent.hasExtra("com.fillr.devkey") ? intent.getStringExtra("com.fillr.devkey") : null;
        String stringExtra3 = intent.hasExtra("com.fillr.secretkey") ? intent.getStringExtra("com.fillr.secretkey") : null;
        if (intent.hasExtra("com.fillr.sdkversion")) {
            intent.getStringExtra("com.fillr.sdkversion");
        }
        if (intent.hasExtra("com.fillr.headless.mode")) {
            intent.getBooleanExtra("com.fillr.headless.mode", false);
        }
        String stringExtra4 = intent.hasExtra("com.fillr.viewid") ? intent.getStringExtra("com.fillr.viewid") : "";
        boolean booleanExtra = intent.hasExtra("com.fillr.whitelistdisabled") ? intent.getBooleanExtra("com.fillr.whitelistdisabled", false) : false;
        FillrWidget.WidgetSource widgetSource = (FillrWidget.WidgetSource) intent.getSerializableExtra("com.fillr.autofillwidgetsource");
        FillrWidget.WidgetSource widgetSource2 = (FillrWidget.WidgetSource) intent.getSerializableExtra("com.fillr.cartscraperwidgetsource");
        if (this.repository == null || stringExtra == null) {
            return;
        }
        try {
            zzka zzkaVar = new zzka(this, stringExtra);
            Schema_ instance_ = Schema_.getInstance_(this);
            zzkaVar.zze = instance_ != null ? (String) instance_.mVersion : null;
            zzkaVar.zzf = stringExtra2;
            zzkaVar.zzg = stringExtra3;
            zzkaVar.zzh = booleanExtra;
            zzkaVar.zzb = widgetSource;
            zzkaVar.zzi = widgetSource2;
            zzkaVar.zzc = 3;
            JSONObject buildJson = zzkaVar.buildJson();
            this.startTime = System.nanoTime();
            ((Repository) this.repository.consumerAPIClient).getMappingFields(i, buildJson, this, stringExtra4);
        } catch (Exception e) {
            Log.e("Mapping Request", e.getMessage());
        }
    }
}
