package com.google.android.datatransport.cct;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.appsflyer.AdRevenueScheme;
import com.google.android.datatransport.cct.internal.AndroidClientInfo;
import com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$AndroidClientInfoEncoder;
import com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$BatchedLogRequestEncoder;
import com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$ClientInfoEncoder;
import com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$ComplianceDataEncoder;
import com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$ExternalPRequestContextEncoder;
import com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$ExternalPrivacyContextEncoder;
import com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$LogEventEncoder;
import com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$LogRequestEncoder;
import com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$NetworkConnectionInfoEncoder;
import com.google.android.datatransport.cct.internal.AutoValue_AndroidClientInfo;
import com.google.android.datatransport.cct.internal.AutoValue_BatchedLogRequest;
import com.google.android.datatransport.cct.internal.AutoValue_ClientInfo;
import com.google.android.datatransport.cct.internal.AutoValue_ComplianceData;
import com.google.android.datatransport.cct.internal.AutoValue_ExternalPRequestContext;
import com.google.android.datatransport.cct.internal.AutoValue_ExternalPrivacyContext;
import com.google.android.datatransport.cct.internal.AutoValue_LogEvent;
import com.google.android.datatransport.cct.internal.AutoValue_LogRequest;
import com.google.android.datatransport.cct.internal.AutoValue_NetworkConnectionInfo;
import com.google.android.datatransport.cct.internal.BatchedLogRequest;
import com.google.android.datatransport.cct.internal.ClientInfo;
import com.google.android.datatransport.cct.internal.ComplianceData;
import com.google.android.datatransport.cct.internal.ExternalPRequestContext;
import com.google.android.datatransport.cct.internal.ExternalPrivacyContext;
import com.google.android.datatransport.cct.internal.LogEvent;
import com.google.android.datatransport.cct.internal.LogRequest;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
import com.google.android.datatransport.runtime.AutoValue_EventInternal;
import com.google.android.datatransport.runtime.backends.TransportBackend;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import com.google.mlkit.vision.common.zzb;
import com.squareup.workflow1.internal.SubtreeManager;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import papa.Handlers$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class CctTransportBackend implements TransportBackend {
    public final Context applicationContext;
    public final ConnectivityManager connectivityManager;
    public final zzb dataEncoder;
    public final URL endPoint;
    public final int readTimeout;
    public final Clock uptimeClock;
    public final Clock wallTimeClock;

    public CctTransportBackend(Context context, Clock clock, Clock clock2) {
        JsonDataEncoderBuilder jsonDataEncoderBuilder = new JsonDataEncoderBuilder();
        AutoBatchedLogRequestEncoder$BatchedLogRequestEncoder autoBatchedLogRequestEncoder$BatchedLogRequestEncoder = AutoBatchedLogRequestEncoder$BatchedLogRequestEncoder.INSTANCE;
        jsonDataEncoderBuilder.registerEncoder(BatchedLogRequest.class, autoBatchedLogRequestEncoder$BatchedLogRequestEncoder);
        jsonDataEncoderBuilder.registerEncoder(AutoValue_BatchedLogRequest.class, autoBatchedLogRequestEncoder$BatchedLogRequestEncoder);
        AutoBatchedLogRequestEncoder$LogRequestEncoder autoBatchedLogRequestEncoder$LogRequestEncoder = AutoBatchedLogRequestEncoder$LogRequestEncoder.INSTANCE;
        jsonDataEncoderBuilder.registerEncoder(LogRequest.class, autoBatchedLogRequestEncoder$LogRequestEncoder);
        jsonDataEncoderBuilder.registerEncoder(AutoValue_LogRequest.class, autoBatchedLogRequestEncoder$LogRequestEncoder);
        AutoBatchedLogRequestEncoder$ClientInfoEncoder autoBatchedLogRequestEncoder$ClientInfoEncoder = AutoBatchedLogRequestEncoder$ClientInfoEncoder.INSTANCE;
        jsonDataEncoderBuilder.registerEncoder(ClientInfo.class, autoBatchedLogRequestEncoder$ClientInfoEncoder);
        jsonDataEncoderBuilder.registerEncoder(AutoValue_ClientInfo.class, autoBatchedLogRequestEncoder$ClientInfoEncoder);
        AutoBatchedLogRequestEncoder$AndroidClientInfoEncoder autoBatchedLogRequestEncoder$AndroidClientInfoEncoder = AutoBatchedLogRequestEncoder$AndroidClientInfoEncoder.INSTANCE;
        jsonDataEncoderBuilder.registerEncoder(AndroidClientInfo.class, autoBatchedLogRequestEncoder$AndroidClientInfoEncoder);
        jsonDataEncoderBuilder.registerEncoder(AutoValue_AndroidClientInfo.class, autoBatchedLogRequestEncoder$AndroidClientInfoEncoder);
        AutoBatchedLogRequestEncoder$LogEventEncoder autoBatchedLogRequestEncoder$LogEventEncoder = AutoBatchedLogRequestEncoder$LogEventEncoder.INSTANCE;
        jsonDataEncoderBuilder.registerEncoder(LogEvent.class, autoBatchedLogRequestEncoder$LogEventEncoder);
        jsonDataEncoderBuilder.registerEncoder(AutoValue_LogEvent.class, autoBatchedLogRequestEncoder$LogEventEncoder);
        AutoBatchedLogRequestEncoder$ComplianceDataEncoder autoBatchedLogRequestEncoder$ComplianceDataEncoder = AutoBatchedLogRequestEncoder$ComplianceDataEncoder.INSTANCE;
        jsonDataEncoderBuilder.registerEncoder(ComplianceData.class, autoBatchedLogRequestEncoder$ComplianceDataEncoder);
        jsonDataEncoderBuilder.registerEncoder(AutoValue_ComplianceData.class, autoBatchedLogRequestEncoder$ComplianceDataEncoder);
        AutoBatchedLogRequestEncoder$ExternalPrivacyContextEncoder autoBatchedLogRequestEncoder$ExternalPrivacyContextEncoder = AutoBatchedLogRequestEncoder$ExternalPrivacyContextEncoder.INSTANCE;
        jsonDataEncoderBuilder.registerEncoder(ExternalPrivacyContext.class, autoBatchedLogRequestEncoder$ExternalPrivacyContextEncoder);
        jsonDataEncoderBuilder.registerEncoder(AutoValue_ExternalPrivacyContext.class, autoBatchedLogRequestEncoder$ExternalPrivacyContextEncoder);
        AutoBatchedLogRequestEncoder$ExternalPRequestContextEncoder autoBatchedLogRequestEncoder$ExternalPRequestContextEncoder = AutoBatchedLogRequestEncoder$ExternalPRequestContextEncoder.INSTANCE;
        jsonDataEncoderBuilder.registerEncoder(ExternalPRequestContext.class, autoBatchedLogRequestEncoder$ExternalPRequestContextEncoder);
        jsonDataEncoderBuilder.registerEncoder(AutoValue_ExternalPRequestContext.class, autoBatchedLogRequestEncoder$ExternalPRequestContextEncoder);
        AutoBatchedLogRequestEncoder$NetworkConnectionInfoEncoder autoBatchedLogRequestEncoder$NetworkConnectionInfoEncoder = AutoBatchedLogRequestEncoder$NetworkConnectionInfoEncoder.INSTANCE;
        jsonDataEncoderBuilder.registerEncoder(NetworkConnectionInfo.class, autoBatchedLogRequestEncoder$NetworkConnectionInfoEncoder);
        jsonDataEncoderBuilder.registerEncoder(AutoValue_NetworkConnectionInfo.class, autoBatchedLogRequestEncoder$NetworkConnectionInfoEncoder);
        jsonDataEncoderBuilder.ignoreNullValues = true;
        this.dataEncoder = new zzb(jsonDataEncoderBuilder);
        this.applicationContext = context;
        this.connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.endPoint = parseUrlOrThrow(CCTDestination.DEFAULT_END_POINT);
        this.uptimeClock = clock2;
        this.wallTimeClock = clock;
        this.readTimeout = 130000;
    }

    public static URL parseUrlOrThrow(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            Handlers$$ExternalSyntheticBUOutline0.m(Recorder$$ExternalSyntheticOutline2.m("Invalid url: ", str), e);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00aa, code lost:
    
        if (((com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype) com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype.valueMap.get(r0)) != null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AutoValue_EventInternal decorate(AutoValue_EventInternal autoValue_EventInternal) {
        int type2;
        int subtype;
        HashMap hashMap;
        NetworkInfo activeNetworkInfo = this.connectivityManager.getActiveNetworkInfo();
        SubtreeManager builder = autoValue_EventInternal.toBuilder();
        int i = Build.VERSION.SDK_INT;
        HashMap hashMap2 = (HashMap) builder.idCounter;
        if (hashMap2 == null) {
            a$$ExternalSyntheticBUOutline0.m$1("Property \"autoMetadata\" has not been set");
            return null;
        }
        hashMap2.put("sdk-version", String.valueOf(i));
        builder.addMetadata("model", Build.MODEL);
        builder.addMetadata("hardware", Build.HARDWARE);
        builder.addMetadata("device", Build.DEVICE);
        builder.addMetadata("product", Build.PRODUCT);
        builder.addMetadata("os-uild", Build.ID);
        builder.addMetadata("manufacturer", Build.MANUFACTURER);
        builder.addMetadata("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO;
        HashMap hashMap3 = (HashMap) builder.idCounter;
        if (hashMap3 == null) {
            a$$ExternalSyntheticBUOutline0.m$1("Property \"autoMetadata\" has not been set");
            return null;
        }
        hashMap3.put("tz-offset", String.valueOf(offset));
        int i2 = -1;
        if (activeNetworkInfo == null) {
            SparseArray sparseArray = NetworkConnectionInfo.NetworkType.valueMap;
            type2 = -1;
        } else {
            type2 = activeNetworkInfo.getType();
        }
        HashMap hashMap4 = (HashMap) builder.idCounter;
        if (hashMap4 == null) {
            a$$ExternalSyntheticBUOutline0.m$1("Property \"autoMetadata\" has not been set");
            return null;
        }
        hashMap4.put("net-type", String.valueOf(type2));
        if (activeNetworkInfo != null) {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                SparseArray sparseArray2 = NetworkConnectionInfo.MobileSubtype.valueMap;
                subtype = 100;
            }
            hashMap = (HashMap) builder.idCounter;
            if (hashMap != null) {
                a$$ExternalSyntheticBUOutline0.m$1("Property \"autoMetadata\" has not been set");
                return null;
            }
            hashMap.put("mobile-subtype", String.valueOf(subtype));
            builder.addMetadata(AdRevenueScheme.COUNTRY, Locale.getDefault().getCountry());
            builder.addMetadata("locale", Locale.getDefault().getLanguage());
            Context context = this.applicationContext;
            String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
            if (simOperator == null) {
                simOperator = "";
            }
            builder.addMetadata("mcc_mnc", simOperator);
            try {
                i2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e) {
                Logging.e(e, "CctTransportBackend", "Unable to find version code for package");
            }
            builder.addMetadata("application_build", Integer.toString(i2));
            return builder.m4005build();
        }
        SparseArray sparseArray3 = NetworkConnectionInfo.MobileSubtype.valueMap;
        subtype = 0;
        hashMap = (HashMap) builder.idCounter;
        if (hashMap != null) {
        }
    }
}
