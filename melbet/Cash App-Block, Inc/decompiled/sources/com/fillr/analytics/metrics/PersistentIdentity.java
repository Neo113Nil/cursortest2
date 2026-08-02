package com.fillr.analytics.metrics;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class PersistentIdentity {
    public static boolean sReferrerPrefsDirty = true;
    public static final Object sReferrerPrefsLock = new Object();
    public String mEventsDistinctId;
    public final Future mLoadReferrerPreferences;
    public final FutureTask mLoadStoredPreferences;
    public String mPeopleDistinctId;
    public final FutureTask mTimeEventsPreferences;
    public boolean mTrackedIntegration;
    public JSONArray mWaitingPeopleRecords;
    public JSONObject mSuperPropertiesCache = null;
    public HashMap mReferrerPropertiesCache = null;
    public boolean mIdentitiesLoaded = false;
    public final AnonymousClass1 mReferrerChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.fillr.analytics.metrics.PersistentIdentity.1
        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            synchronized (PersistentIdentity.sReferrerPrefsLock) {
                PersistentIdentity.this.readReferrerProperties();
                PersistentIdentity.sReferrerPrefsDirty = false;
            }
        }
    };

    /* JADX WARN: Type inference failed for: r1v3, types: [com.fillr.analytics.metrics.PersistentIdentity$1] */
    public PersistentIdentity(Future future, FutureTask futureTask, FutureTask futureTask2) {
        this.mLoadReferrerPreferences = future;
        this.mLoadStoredPreferences = futureTask;
        this.mTimeEventsPreferences = futureTask2;
    }

    public final synchronized String getEventsDistinctId() {
        try {
            if (!this.mIdentitiesLoaded) {
                readIdentities();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.mEventsDistinctId;
    }

    public final JSONObject getSuperPropertiesCache() {
        JSONObject jSONObject;
        if (this.mSuperPropertiesCache == null) {
            FutureTask futureTask = this.mLoadStoredPreferences;
            try {
                try {
                    this.mSuperPropertiesCache = new JSONObject(((SharedPreferences) futureTask.get()).getString("super_properties", "{}"));
                } catch (InterruptedException unused) {
                    if (this.mSuperPropertiesCache == null) {
                        jSONObject = new JSONObject();
                        this.mSuperPropertiesCache = jSONObject;
                    }
                } catch (ExecutionException e) {
                    e.getCause();
                    if (this.mSuperPropertiesCache == null) {
                        jSONObject = new JSONObject();
                        this.mSuperPropertiesCache = jSONObject;
                    }
                } catch (JSONException unused2) {
                    JSONObject jSONObject2 = this.mSuperPropertiesCache;
                    if (jSONObject2 != null) {
                        String jSONObject3 = jSONObject2.toString();
                        try {
                            SharedPreferences.Editor edit = ((SharedPreferences) futureTask.get()).edit();
                            edit.putString("super_properties", jSONObject3);
                            edit.apply();
                        } catch (InterruptedException unused3) {
                        } catch (ExecutionException e2) {
                            e2.getCause();
                        }
                    }
                    if (this.mSuperPropertiesCache == null) {
                        jSONObject = new JSONObject();
                        this.mSuperPropertiesCache = jSONObject;
                    }
                }
            } catch (Throwable th) {
                if (this.mSuperPropertiesCache == null) {
                    this.mSuperPropertiesCache = new JSONObject();
                }
                throw th;
            }
        }
        return this.mSuperPropertiesCache;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0011 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void readIdentities() {
        SharedPreferences sharedPreferences;
        try {
            sharedPreferences = (SharedPreferences) this.mLoadStoredPreferences.get();
        } catch (InterruptedException unused) {
            sharedPreferences = null;
            if (sharedPreferences == null) {
            }
        } catch (ExecutionException e) {
            e.getCause();
            sharedPreferences = null;
            if (sharedPreferences == null) {
            }
        }
        if (sharedPreferences == null) {
            return;
        }
        this.mEventsDistinctId = sharedPreferences.getString("events_distinct_id", null);
        this.mPeopleDistinctId = sharedPreferences.getString("people_distinct_id", null);
        this.mTrackedIntegration = sharedPreferences.getBoolean("tracked_integration", false);
        this.mWaitingPeopleRecords = null;
        String string2 = sharedPreferences.getString("waiting_array", null);
        if (string2 != null) {
            try {
                this.mWaitingPeopleRecords = new JSONArray(string2);
            } catch (JSONException unused2) {
            }
        }
        if (this.mEventsDistinctId == null) {
            this.mEventsDistinctId = UUID.randomUUID().toString();
            writeIdentities();
        }
        this.mIdentitiesLoaded = true;
    }

    public final void readReferrerProperties() {
        AnonymousClass1 anonymousClass1 = this.mReferrerChangeListener;
        this.mReferrerPropertiesCache = new HashMap();
        try {
            SharedPreferences sharedPreferences = (SharedPreferences) this.mLoadReferrerPreferences.get();
            sharedPreferences.unregisterOnSharedPreferenceChangeListener(anonymousClass1);
            sharedPreferences.registerOnSharedPreferenceChangeListener(anonymousClass1);
            for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
                this.mReferrerPropertiesCache.put(entry.getKey(), entry.getValue().toString());
            }
        } catch (InterruptedException unused) {
        } catch (ExecutionException e) {
            e.getCause();
        }
    }

    public final void writeIdentities() {
        try {
            SharedPreferences.Editor edit = ((SharedPreferences) this.mLoadStoredPreferences.get()).edit();
            edit.putString("events_distinct_id", this.mEventsDistinctId);
            edit.putString("people_distinct_id", this.mPeopleDistinctId);
            JSONArray jSONArray = this.mWaitingPeopleRecords;
            if (jSONArray == null) {
                edit.remove("waiting_array");
            } else {
                edit.putString("waiting_array", jSONArray.toString());
            }
            edit.putBoolean("tracked_integration", this.mTrackedIntegration);
            edit.apply();
        } catch (InterruptedException unused) {
        } catch (ExecutionException e) {
            e.getCause();
        }
    }
}
