package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.internal.measurement.zzdb;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzjm;
import com.google.android.gms.measurement.internal.zzlk;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Deprecated
/* loaded from: classes4.dex */
public class AppMeasurement {
    public static volatile AppMeasurement zza;
    public final zzc zzb;

    public static class ConditionalUserProperty {
        public boolean mActive;
        public String mAppId;
        public long mCreationTimestamp;
        public String mExpiredEventName;
        public Bundle mExpiredEventParams;
        public String mName;
        public String mOrigin;
        public long mTimeToLive;
        public String mTimedOutEventName;
        public Bundle mTimedOutEventParams;
        public String mTriggerEventName;
        public long mTriggerTimeout;
        public String mTriggeredEventName;
        public Bundle mTriggeredEventParams;
        public long mTriggeredTimestamp;
        public Object mValue;
    }

    public AppMeasurement(zzic zzicVar) {
        this.zzb = new zza(zzicVar);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        if (zza == null) {
            synchronized (AppMeasurement.class) {
                if (zza == null) {
                    zzlk zzlkVar = (zzlk) FirebaseAnalytics.class.getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
                    if (zzlkVar != null) {
                        zza = new AppMeasurement(zzlkVar);
                    } else {
                        zza = new AppMeasurement(zzic.zzy(context, new zzdb(0L, 0L, true, null, null), null, null));
                    }
                }
            }
        }
        return zza;
    }

    public void beginAdUnitExposure(String str) {
        this.zzb.zzm(str);
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.zzb.zzp(str, str2, bundle);
    }

    public void endAdUnitExposure(String str) {
        this.zzb.zzn(str);
    }

    public long generateEventId() {
        return this.zzb.zzl();
    }

    public String getAppInstanceId() {
        return this.zzb.zzj();
    }

    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List<Bundle> zzq = this.zzb.zzq(str, str2);
        ArrayList arrayList = new ArrayList(zzq == null ? 0 : zzq.size());
        for (Bundle bundle : zzq) {
            ConditionalUserProperty conditionalUserProperty = new ConditionalUserProperty();
            zzae.checkNotNull(bundle);
            conditionalUserProperty.mAppId = (String) zzjm.zzb(bundle, "app_id", String.class, null);
            conditionalUserProperty.mOrigin = (String) zzjm.zzb(bundle, "origin", String.class, null);
            conditionalUserProperty.mName = (String) zzjm.zzb(bundle, "name", String.class, null);
            conditionalUserProperty.mValue = zzjm.zzb(bundle, "value", Object.class, null);
            conditionalUserProperty.mTriggerEventName = (String) zzjm.zzb(bundle, "trigger_event_name", String.class, null);
            conditionalUserProperty.mTriggerTimeout = ((Long) zzjm.zzb(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            conditionalUserProperty.mTimedOutEventName = (String) zzjm.zzb(bundle, "timed_out_event_name", String.class, null);
            conditionalUserProperty.mTimedOutEventParams = (Bundle) zzjm.zzb(bundle, "timed_out_event_params", Bundle.class, null);
            conditionalUserProperty.mTriggeredEventName = (String) zzjm.zzb(bundle, "triggered_event_name", String.class, null);
            conditionalUserProperty.mTriggeredEventParams = (Bundle) zzjm.zzb(bundle, "triggered_event_params", Bundle.class, null);
            conditionalUserProperty.mTimeToLive = ((Long) zzjm.zzb(bundle, "time_to_live", Long.class, 0L)).longValue();
            conditionalUserProperty.mExpiredEventName = (String) zzjm.zzb(bundle, "expired_event_name", String.class, null);
            conditionalUserProperty.mExpiredEventParams = (Bundle) zzjm.zzb(bundle, "expired_event_params", Bundle.class, null);
            conditionalUserProperty.mActive = ((Boolean) zzjm.zzb(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            conditionalUserProperty.mCreationTimestamp = ((Long) zzjm.zzb(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            conditionalUserProperty.mTriggeredTimestamp = ((Long) zzjm.zzb(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
            arrayList.add(conditionalUserProperty);
        }
        return arrayList;
    }

    public String getCurrentScreenClass() {
        return this.zzb.zzi();
    }

    public String getCurrentScreenName() {
        return this.zzb.zzh();
    }

    public String getGmpAppId() {
        return this.zzb.zzk();
    }

    public int getMaxUserProperties(String str) {
        return this.zzb.zzr(str);
    }

    public Map<String, Object> getUserProperties(String str, String str2, boolean z) {
        return this.zzb.zzd(str, str2, z);
    }

    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.zzb.zza(str, str2, bundle);
    }

    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        zzae.checkNotNull(conditionalUserProperty);
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            zzjm.zza(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        this.zzb.zzo(bundle);
    }

    public AppMeasurement(zzlk zzlkVar) {
        this.zzb = new zzb(zzlkVar);
    }
}
