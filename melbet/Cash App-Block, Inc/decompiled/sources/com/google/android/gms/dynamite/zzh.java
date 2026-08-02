package com.google.android.gms.dynamite;

import android.content.Context;
import androidx.compose.ui.text.font.PlatformResolveInterceptor;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.room.util.DBUtil;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.internal.CoreFeature$stop$2;
import com.datadog.android.core.internal.DatadogCore;
import com.datadog.android.core.internal.utils.RuntimeUtilsKt;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.measurement.zzaec;
import com.google.android.gms.internal.measurement.zzags;
import com.google.android.gms.internal.measurement.zzagu;
import com.google.android.gms.internal.measurement.zzagy;
import com.google.android.gms.internal.measurement.zzaic;
import com.google.android.gms.internal.measurement.zzaie;
import com.google.android.gms.measurement.internal.zzbo;
import com.google.android.gms.measurement.internal.zzfy;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.text.Charsets;

/* loaded from: classes.dex */
public final class zzh implements CoroutineContext.Key, PlatformResolveInterceptor, CreationExtras.Key, DynamiteModule.VersionPolicy, zzaec, zzbo {
    public final /* synthetic */ int $r8$classId;
    public static final /* synthetic */ zzh zza = new zzh(12);
    public static final /* synthetic */ zzh zza$1 = new zzh(13);
    public static final /* synthetic */ zzh zza$2 = new zzh(14);
    public static final /* synthetic */ zzh zza$3 = new zzh(15);
    public static final /* synthetic */ zzh zza$4 = new zzh(16);
    public static final /* synthetic */ zzh zza$5 = new zzh(17);
    public static final /* synthetic */ zzh zza$6 = new zzh(18);
    public static final /* synthetic */ zzh zza$7 = new zzh(19);
    public static final /* synthetic */ zzh zza$8 = new zzh(20);
    public static final /* synthetic */ zzh zza$9 = new zzh(21);
    public static final /* synthetic */ zzh zza$10 = new zzh(22);
    public static final /* synthetic */ zzh zza$11 = new zzh(23);
    public static final /* synthetic */ zzh zza$12 = new zzh(24);
    public static final /* synthetic */ zzh zza$13 = new zzh(25);
    public static final /* synthetic */ zzh zza$14 = new zzh(26);
    public static final /* synthetic */ zzh zza$15 = new zzh(27);
    public static final /* synthetic */ zzh zza$16 = new zzh(28);
    public static final /* synthetic */ zzh zza$17 = new zzh(29);

    public /* synthetic */ zzh(int i) {
        this.$r8$classId = i;
    }

    public static String generate(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            bytes.getClass();
            messageDigest.update(bytes);
            byte[] digest = messageDigest.digest();
            digest.getClass();
            return ArraysKt___ArraysKt.joinToString$default(digest, "", DatadogCore.AnonymousClass1.INSTANCE$2, 30);
        } catch (NoSuchAlgorithmException e) {
            DBUtil.log$default(RuntimeUtilsKt.unboundInternalLogger, 5, InternalLogger.Target.USER, CoreFeature$stop$2.INSTANCE$14, e, false, 48);
            return null;
        }
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    public DynamiteModule.VersionPolicy.SelectionResult selectModule(Context context, String str, DynamiteModule.VersionPolicy.IVersions iVersions) {
        DynamiteModule.VersionPolicy.SelectionResult selectionResult = new DynamiteModule.VersionPolicy.SelectionResult();
        int zzb = iVersions.zzb(context, str);
        selectionResult.localVersion = zzb;
        if (zzb != 0) {
            selectionResult.selection = -1;
            return selectionResult;
        }
        int zza2 = iVersions.zza(context, str, true);
        selectionResult.remoteVersion = zza2;
        if (zza2 != 0) {
            selectionResult.selection = 1;
        }
        return selectionResult;
    }

    public String toString() {
        switch (this.$r8$classId) {
            case 2:
                return "CompositionErrorContext";
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzbo
    /* renamed from: zza */
    public Object mo1425zza() {
        switch (this.$r8$classId) {
            case 12:
                return new Boolean(zzagy.zzb());
            case 13:
                List list = zzfy.zzbk;
                zzags.zza.get();
                return (String) zzagu.zza.zzd(4, "measurement.gbraid_campaign.campaign_params_triggering_info_update", "gclid,gbraid,gad_campaignid").get();
            case 14:
                List list2 = zzfy.zzbk;
                zzags.zza.get();
                return Integer.valueOf((int) ((Long) zzagu.zza.zzb(1000L, "measurement.upload.max_error_events_per_day", 69).get()).longValue());
            case 15:
                List list3 = zzfy.zzbk;
                zzags.zza.get();
                return (String) zzagu.zza.zzd(78, "measurement.upload.url", "https://app-measurement.com/a").get();
            case 16:
                List list4 = zzfy.zzbk;
                zzags.zza.get();
                return (Long) zzagu.zza.zzb(86400000L, "measurement.monitoring.sample_period_millis", 29).get();
            case 17:
                List list5 = zzfy.zzbk;
                zzags.zza.get();
                return Integer.valueOf((int) ((Long) zzagu.zza.zzb(5000L, "measurement.sgtm.upload.max_queued_batches", 47).get()).longValue());
            case 18:
                List list6 = zzfy.zzbk;
                zzags.zza.get();
                return (Long) zzagu.zza.zzb(240000L, "measurement.sgtm.batch.long_queuing_threshold", 40).get();
            case 19:
                List list7 = zzfy.zzbk;
                zzags.zza.get();
                return (Long) zzagu.zza.zzb(10000L, "measurement.upload.realtime_upload_interval", 33).get();
            case 20:
                List list8 = zzfy.zzbk;
                zzags.zza.get();
                return (Long) zzagu.zza.zzb(604800000L, "measurement.upload.refresh_blacklisted_config_interval", 34).get();
            case 21:
                List list9 = zzfy.zzbk;
                zzags.zza.get();
                return (Long) zzagu.zza.zzb(518400000L, "measurement.upload.max_queue_time", 73).get();
            case 22:
                List list10 = zzfy.zzbk;
                zzags.zza.get();
                return (Long) zzagu.zza.zzb(1000L, "measurement.service_client.reconnect_millis", 38).get();
            case 23:
                List list11 = zzfy.zzbk;
                zzaic.zza.get();
                return (Long) zzaie.zza.zzb(-1L, "measurement.test.cached_long_flag", 1).get();
            case 24:
                List list12 = zzfy.zzbk;
                zzags.zza.get();
                return Integer.valueOf((int) ((Long) zzagu.zza.zzb(500L, "measurement.upload.max_event_parameter_value_length", 19).get()).longValue());
            case 25:
                List list13 = zzfy.zzbk;
                zzags.zza.get();
                return Integer.valueOf((int) ((Long) zzagu.zza.zzb(7L, "measurement.rb.attribution.client.min_ad_services_version", 26).get()).longValue());
            case 26:
                List list14 = zzfy.zzbk;
                zzags.zza.get();
                return (Long) zzagu.zza.zzb(3600000L, "measurement.session.engagement_interval", 12).get();
            case 27:
                List list15 = zzfy.zzbk;
                zzags.zza.get();
                return Integer.valueOf((int) ((Long) zzagu.zza.zzb(65536L, "measurement.upload.max_batch_size", 75).get()).longValue());
            case 28:
                List list16 = zzfy.zzbk;
                zzags.zza.get();
                return Integer.valueOf((int) ((Long) zzagu.zza.zzb(1000L, "measurement.rb.max_trigger_registrations_per_day", 24).get()).longValue());
            default:
                List list17 = zzfy.zzbk;
                zzags.zza.get();
                return (Long) zzagu.zza.zzb(3600000L, "45769094", 11).get();
        }
    }
}
