package com.fillr.analytics.metrics;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Message;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import coil3.request.OneShotDisposable;
import com.fillr.analytics.metrics.AnalyticsMessages;
import com.google.android.gms.measurement.internal.zziv;
import com.google.android.gms.tasks.zzb;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class FillrAPI {
    public static final HashMap sInstanceMap = new HashMap();
    public static final OneShotDisposable sPrefsLoader = new OneShotDisposable(14);
    public static FutureTask sReferrerPrefs;
    public final FAConfig mConfig;
    public final Context mContext;
    public final HashMap mEventTimings;
    public final AnalyticsMessages mMessages;
    public final PersistentIdentity mPersistentIdentity;
    public final String mToken;

    public FillrAPI(Context context, Future future, String str) {
        String str2;
        AnalyticsMessages analyticsMessages;
        boolean z;
        FAConfig fAConfig = FAConfig.getInstance(context);
        this.mContext = context;
        this.mToken = str;
        this.mConfig = fAConfig;
        HashMap hashMap = new HashMap();
        hashMap.put("$android_lib_version", "11.2.0");
        hashMap.put("$android_os", "Android");
        String str3 = Build.VERSION.RELEASE;
        hashMap.put("$android_os_version", str3 == null ? "UNKNOWN" : str3);
        String str4 = Build.MANUFACTURER;
        hashMap.put("$android_manufacturer", str4 == null ? "UNKNOWN" : str4);
        String str5 = Build.BRAND;
        hashMap.put("$android_brand", str5 == null ? "UNKNOWN" : str5);
        String str6 = Build.MODEL;
        hashMap.put("$android_model", str6 == null ? "UNKNOWN" : str6);
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            hashMap.put("$android_app_version", packageInfo.versionName);
            hashMap.put("$android_app_version_code", Integer.toString(packageInfo.versionCode));
        } catch (PackageManager.NameNotFoundException e) {
            e.getMessage();
        }
        Collections.unmodifiableMap(hashMap);
        zzb zzbVar = new zzb(this, 11);
        String str7 = "com.mixpanel.android.mpmetrics.MixpanelAPI_d200489724ed415d7930ea65c62d7278";
        SharedPreferences sharedPreferences = this.mContext.getSharedPreferences("com.mixpanel.android.mpmetrics.MixpanelAPI_d200489724ed415d7930ea65c62d7278", 0);
        String string2 = sharedPreferences.getString("events_distinct_id", null);
        String string3 = sharedPreferences.getString("people_distinct_id", null);
        String m = Recorder$$ExternalSyntheticOutline2.m("com.fillr.analytics.metrics.FillrAPI_", str);
        if (string2 == null && string3 == null) {
            str7 = m;
        }
        OneShotDisposable oneShotDisposable = sPrefsLoader;
        oneShotDisposable.getClass();
        FutureTask futureTask = new FutureTask(new zziv(context, str7, zzbVar));
        ((ExecutorService) oneShotDisposable.job).execute(futureTask);
        FutureTask futureTask2 = new FutureTask(new zziv(context, "com.fillr.analytics.metrics.FillrAPI.TimeEvents_" + str, null));
        ((ExecutorService) oneShotDisposable.job).execute(futureTask2);
        this.mPersistentIdentity = new PersistentIdentity(future, futureTask, futureTask2);
        HashMap hashMap2 = new HashMap();
        try {
            for (Map.Entry<String, ?> entry : ((SharedPreferences) futureTask2.get()).getAll().entrySet()) {
                hashMap2.put(entry.getKey(), Long.valueOf(entry.getValue().toString()));
            }
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        } catch (ExecutionException e3) {
            e3.printStackTrace();
        }
        this.mEventTimings = hashMap2;
        PersistentIdentity persistentIdentity = this.mPersistentIdentity;
        synchronized (persistentIdentity) {
            try {
                if (!persistentIdentity.mIdentitiesLoaded) {
                    persistentIdentity.readIdentities();
                }
                str2 = persistentIdentity.mPeopleDistinctId;
            } finally {
            }
        }
        if (str2 == null) {
            this.mPersistentIdentity.getEventsDistinctId();
        }
        Context context2 = this.mContext;
        HashMap hashMap3 = AnalyticsMessages.sInstances;
        synchronized (hashMap3) {
            try {
                Context applicationContext = context2.getApplicationContext();
                if (hashMap3.containsKey(applicationContext)) {
                    analyticsMessages = (AnalyticsMessages) hashMap3.get(applicationContext);
                } else {
                    analyticsMessages = new AnalyticsMessages(applicationContext);
                    hashMap3.put(applicationContext, analyticsMessages);
                }
            } finally {
            }
        }
        this.mMessages = analyticsMessages;
        if (!this.mConfig.mDisableAppOpenEvent) {
            track("$app_open", null);
        }
        PersistentIdentity persistentIdentity2 = this.mPersistentIdentity;
        synchronized (persistentIdentity2) {
            try {
                if (!persistentIdentity2.mIdentitiesLoaded) {
                    persistentIdentity2.readIdentities();
                }
                z = persistentIdentity2.mTrackedIntegration;
            } finally {
            }
        }
        if (z) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("mp_lib", "Android");
            jSONObject.put("lib", "Android");
            jSONObject.put("distinct_id", str);
            AnalyticsMessages.EventDescription eventDescription = new AnalyticsMessages.EventDescription(jSONObject, "Integration", "85053bf24bba75239b16a601d9387e17");
            analyticsMessages.getClass();
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = eventDescription;
            analyticsMessages.mWorker.runMessage(obtain);
            flush();
            PersistentIdentity persistentIdentity3 = this.mPersistentIdentity;
            synchronized (persistentIdentity3) {
                try {
                    if (!persistentIdentity3.mIdentitiesLoaded) {
                        persistentIdentity3.readIdentities();
                    }
                    persistentIdentity3.mTrackedIntegration = true;
                    persistentIdentity3.writeIdentities();
                } finally {
                }
            }
        } catch (JSONException unused) {
        }
    }

    public static FillrAPI getInstance(Context context, String str) {
        FillrAPI fillrAPI;
        if (str == null || context == null) {
            return null;
        }
        HashMap hashMap = sInstanceMap;
        synchronized (hashMap) {
            try {
                Context applicationContext = context.getApplicationContext();
                if (sReferrerPrefs == null) {
                    OneShotDisposable oneShotDisposable = sPrefsLoader;
                    oneShotDisposable.getClass();
                    FutureTask futureTask = new FutureTask(new zziv(context, "com.fillr.analytics.metrics.ReferralInfo", null));
                    ((ExecutorService) oneShotDisposable.job).execute(futureTask);
                    sReferrerPrefs = futureTask;
                }
                Map map = (Map) hashMap.get(str);
                if (map == null) {
                    map = new HashMap();
                    hashMap.put(str, map);
                }
                fillrAPI = (FillrAPI) map.get(applicationContext);
                if (fillrAPI == null) {
                    PackageManager packageManager = applicationContext.getPackageManager();
                    String packageName = applicationContext.getPackageName();
                    if (packageManager != null && packageName != null && packageManager.checkPermission("android.permission.INTERNET", packageName) == 0) {
                        fillrAPI = new FillrAPI(applicationContext, sReferrerPrefs, str);
                        map.put(applicationContext, fillrAPI);
                    }
                }
                if (context instanceof Activity) {
                    try {
                        Class.forName("bolts.AppLinks").getMethod("getTargetUrlFromInboundIntent", Context.class, Intent.class).invoke(null, context, ((Activity) context).getIntent());
                    } catch (ClassNotFoundException | NoSuchMethodException e) {
                        e.getMessage();
                    } catch (IllegalAccessException e2) {
                        e2.getMessage();
                    } catch (InvocationTargetException unused) {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return fillrAPI;
    }

    public final void flush() {
        AnalyticsMessages analyticsMessages = this.mMessages;
        analyticsMessages.getClass();
        Message obtain = Message.obtain();
        obtain.what = 2;
        analyticsMessages.mWorker.runMessage(obtain);
    }

    public final void track(String str, JSONObject jSONObject) {
        Long l;
        synchronized (this.mEventTimings) {
            l = (Long) this.mEventTimings.get(str);
            this.mEventTimings.remove(str);
            PersistentIdentity persistentIdentity = this.mPersistentIdentity;
            persistentIdentity.getClass();
            try {
                try {
                    SharedPreferences.Editor edit = ((SharedPreferences) persistentIdentity.mTimeEventsPreferences.get()).edit();
                    edit.remove(str);
                    edit.apply();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            PersistentIdentity persistentIdentity2 = this.mPersistentIdentity;
            persistentIdentity2.getClass();
            synchronized (PersistentIdentity.sReferrerPrefsLock) {
                try {
                    if (!PersistentIdentity.sReferrerPrefsDirty) {
                        if (persistentIdentity2.mReferrerPropertiesCache == null) {
                        }
                    }
                    persistentIdentity2.readReferrerProperties();
                    PersistentIdentity.sReferrerPrefsDirty = false;
                } finally {
                }
            }
            for (Map.Entry entry : persistentIdentity2.mReferrerPropertiesCache.entrySet()) {
                jSONObject2.put((String) entry.getKey(), (String) entry.getValue());
            }
            PersistentIdentity persistentIdentity3 = this.mPersistentIdentity;
            synchronized (persistentIdentity3) {
                JSONObject superPropertiesCache = persistentIdentity3.getSuperPropertiesCache();
                Iterator<String> keys = superPropertiesCache.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    try {
                        jSONObject2.put(next, superPropertiesCache.get(next));
                    } catch (JSONException unused) {
                    }
                }
            }
            double currentTimeMillis = System.currentTimeMillis() / 1000.0d;
            jSONObject2.put("time", (long) currentTimeMillis);
            jSONObject2.put("distinct_id", this.mPersistentIdentity.getEventsDistinctId());
            if (l != null) {
                jSONObject2.put("$duration", currentTimeMillis - (l.longValue() / 1000.0d));
            }
            if (jSONObject != null) {
                Iterator<String> keys2 = jSONObject.keys();
                while (keys2.hasNext()) {
                    String next2 = keys2.next();
                    jSONObject2.put(next2, jSONObject.get(next2));
                }
            }
            AnalyticsMessages.EventDescription eventDescription = new AnalyticsMessages.EventDescription(jSONObject2, str, this.mToken);
            AnalyticsMessages analyticsMessages = this.mMessages;
            analyticsMessages.getClass();
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = eventDescription;
            analyticsMessages.mWorker.runMessage(obtain);
        } catch (JSONException unused2) {
        }
    }
}
