package com.google.firebase.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.firebase.events.Publisher;

/* loaded from: classes.dex */
public final class DataCollectionConfigStorage {
    public boolean dataCollectionDefaultEnabled;
    public final Publisher publisher;
    public final SharedPreferences sharedPreferences;

    public DataCollectionConfigStorage(Context context, String str, Publisher publisher) {
        boolean z;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Context createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
        SharedPreferences sharedPreferences = createDeviceProtectedStorageContext.getSharedPreferences("com.google.firebase.common.prefs:".concat(str), 0);
        this.sharedPreferences = sharedPreferences;
        this.publisher = publisher;
        boolean z2 = true;
        if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
            z = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
        } else {
            try {
                PackageManager packageManager = createDeviceProtectedStorageContext.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(createDeviceProtectedStorageContext.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                    z2 = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            z = z2;
        }
        this.dataCollectionDefaultEnabled = z;
    }
}
