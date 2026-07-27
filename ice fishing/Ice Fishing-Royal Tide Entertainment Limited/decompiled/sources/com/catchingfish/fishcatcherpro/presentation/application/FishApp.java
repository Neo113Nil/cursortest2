package com.catchingfish.fishcatcherpro.presentation.application;

import android.app.Application;
import android.text.TextUtils;
import kotlin.text.CatchingFishBundleAndroidX;

/* loaded from: classes.dex */
public class FishApp extends Application {
    public CatchingFishBundleAndroidX CatchingFishReduxKtor;

    @Override // android.app.Application
    public final void onCreate() {
        super.onCreate();
        this.CatchingFishReduxKtor = new CatchingFishBundleAndroidX(this);
        String packageName = getPackageName();
        if (TextUtils.isEmpty(packageName)) {
            packageName = getPackageName();
        }
        getSharedPreferences(packageName + "_preferences", 0);
    }
}
