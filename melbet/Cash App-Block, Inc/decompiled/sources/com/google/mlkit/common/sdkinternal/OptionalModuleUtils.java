package com.google.mlkit.common.sdkinternal;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.room.Room;
import com.google.android.gms.auth.api.zbc;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.zacn;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest;
import com.google.android.gms.common.moduleinstall.internal.zay;
import com.google.android.gms.internal.base.zap;
import com.google.android.gms.internal.mlkit_common.zzad;
import com.google.android.gms.internal.mlkit_common.zzaf;
import com.google.android.gms.internal.mlkit_common.zzag;
import com.google.android.gms.internal.mlkit_common.zzal;
import com.google.android.gms.internal.mlkit_common.zzaq;
import com.google.android.gms.tasks.zzw;
import com.squareup.util.cash.Countries;
import java.util.ArrayList;
import java.util.List;
import org.brotli.dec.HuffmanTreeGroup;

/* loaded from: classes4.dex */
public abstract class OptionalModuleUtils {
    public static final Feature[] EMPTY_FEATURES = new Feature[0];
    public static final Feature FEATURE_BARCODE;
    public static final Feature FEATURE_FACE;
    public static final Feature FEATURE_OCR;
    public static final zzaq zza;
    public static final zzaq zzb;

    static {
        Feature feature = new Feature("vision.barcode", 1L);
        FEATURE_BARCODE = feature;
        Feature feature2 = new Feature("vision.custom.ica", 1L);
        Feature feature3 = new Feature("vision.face", 1L);
        FEATURE_FACE = feature3;
        Feature feature4 = new Feature("vision.ica", 1L);
        Feature feature5 = new Feature("vision.ocr", 1L);
        FEATURE_OCR = feature5;
        Feature feature6 = new Feature("mlkit.langid", 1L);
        Feature feature7 = new Feature("mlkit.nlclassifier", 1L);
        Feature feature8 = new Feature("tflite_dynamite", 1L);
        Feature feature9 = new Feature("mlkit.barcode.ui", 1L);
        Feature feature10 = new Feature("mlkit.smartreply", 1L);
        HuffmanTreeGroup huffmanTreeGroup = new HuffmanTreeGroup(16);
        huffmanTreeGroup.zza("barcode", feature);
        huffmanTreeGroup.zza("custom_ica", feature2);
        huffmanTreeGroup.zza("face", feature3);
        huffmanTreeGroup.zza("ica", feature4);
        huffmanTreeGroup.zza("ocr", feature5);
        huffmanTreeGroup.zza("langid", feature6);
        huffmanTreeGroup.zza("nlclassifier", feature7);
        huffmanTreeGroup.zza("tflite_dynamite", feature8);
        huffmanTreeGroup.zza("barcode_ui", feature9);
        huffmanTreeGroup.zza("smart_reply", feature10);
        zzag zzagVar = (zzag) huffmanTreeGroup.trees;
        if (zzagVar != null) {
            throw zzagVar.zza();
        }
        zzaq zzg = zzaq.zzg(huffmanTreeGroup.alphabetSize, (Object[]) huffmanTreeGroup.codes, huffmanTreeGroup);
        zzag zzagVar2 = (zzag) huffmanTreeGroup.trees;
        if (zzagVar2 != null) {
            throw zzagVar2.zza();
        }
        zza = zzg;
        HuffmanTreeGroup huffmanTreeGroup2 = new HuffmanTreeGroup(16);
        huffmanTreeGroup2.zza("com.google.android.gms.vision.barcode", feature);
        huffmanTreeGroup2.zza("com.google.android.gms.vision.custom.ica", feature2);
        huffmanTreeGroup2.zza("com.google.android.gms.vision.face", feature3);
        huffmanTreeGroup2.zza("com.google.android.gms.vision.ica", feature4);
        huffmanTreeGroup2.zza("com.google.android.gms.vision.ocr", feature5);
        huffmanTreeGroup2.zza("com.google.android.gms.mlkit.langid", feature6);
        huffmanTreeGroup2.zza("com.google.android.gms.mlkit.nlclassifier", feature7);
        huffmanTreeGroup2.zza("com.google.android.gms.tflite_dynamite", feature8);
        huffmanTreeGroup2.zza("com.google.android.gms.mlkit_smartreply", feature10);
        zzag zzagVar3 = (zzag) huffmanTreeGroup2.trees;
        if (zzagVar3 != null) {
            throw zzagVar3.zza();
        }
        zzaq zzg2 = zzaq.zzg(huffmanTreeGroup2.alphabetSize, (Object[]) huffmanTreeGroup2.codes, huffmanTreeGroup2);
        zzag zzagVar4 = (zzag) huffmanTreeGroup2.trees;
        if (zzagVar4 != null) {
            throw zzagVar4.zza();
        }
        zzb = zzg2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.gms.common.Feature[], java.io.Serializable] */
    public static void requestDownload(Context context, Feature[] featureArr) {
        zzw zae;
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        arrayList.add(new zzo(featureArr, 0));
        zzae.checkArgument("APIs must not be empty.", !arrayList.isEmpty());
        zay zayVar = new zay(context, null, zay.zae, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
        ApiFeatureRequest zaa = ApiFeatureRequest.zaa(arrayList, true);
        if (zaa.zab.isEmpty()) {
            zae = Room.forResult(new ModuleInstallResponse(0, false));
        } else {
            zacn builder = zacn.builder();
            builder.zaa$1 = new Feature[]{zap.zaa};
            builder.zab = true;
            builder.zac = 27304;
            builder.zaa = new zbc(zayVar, zaa, z, 8);
            zae = zayVar.zae(0, builder.build());
        }
        zae.addOnFailureListener(new com.google.mlkit.vision.text.zzd(10));
    }

    public static Feature[] zza(zzaq zzaqVar, List list) {
        Feature[] featureArr = new Feature[list.size()];
        for (int i = 0; i < list.size(); i++) {
            Feature feature = (Feature) zzaqVar.get(list.get(i));
            zzae.checkNotNull(feature);
            featureArr[i] = feature;
        }
        return featureArr;
    }

    public static void requestDownload(Context context, String str) {
        zzad zzadVar = zzaf.zza;
        Object[] objArr = {str};
        Countries.zza(1, objArr);
        requestDownload(context, new zzal(1, objArr));
    }

    public static void requestDownload(Context context, List list) {
        GoogleApiAvailabilityLight.zza.getClass();
        if (GoogleApiAvailabilityLight.getApkVersion(context) >= 221500000) {
            requestDownload(context, zza(zza, list));
            return;
        }
        Intent intent = new Intent();
        intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
        intent.setAction("com.google.android.gms.vision.DEPENDENCY");
        intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", TextUtils.join(",", list));
        intent.putExtra("requester_app_package", context.getApplicationInfo().packageName);
        context.sendBroadcast(intent);
    }
}
