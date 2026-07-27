package kotlin.text;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishXMLLayoutIntent implements CatchingFishLiveDataHandler {
    public final /* synthetic */ Object CatchingFishCoroutine;
    public final /* synthetic */ int CatchingFishParcelableFAB;
    public final /* synthetic */ Object CatchingFishSnackbar;

    public /* synthetic */ CatchingFishXMLLayoutIntent(int i, Object obj, Object obj2) {
        this.CatchingFishParcelableFAB = i;
        this.CatchingFishSnackbar = obj;
        this.CatchingFishCoroutine = obj2;
    }

    @Override // kotlin.text.CatchingFishLiveDataHandler
    public final Object get() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishSpannableJUnit catchingFishSpannableJUnit = (CatchingFishSpannableJUnit) this.CatchingFishSnackbar;
                CatchingFishToastKtor catchingFishToastKtor = (CatchingFishToastKtor) this.CatchingFishCoroutine;
                CatchingFishMockkAsyncTask catchingFishMockkAsyncTask = catchingFishToastKtor.CatchingFishWorkManager;
                CatchingFishViewWorkManager catchingFishViewWorkManager = new CatchingFishViewWorkManager();
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                HashSet hashSet3 = new HashSet();
                HashSet hashSet4 = new HashSet();
                HashSet hashSet5 = new HashSet();
                Set<CatchingFishGlideDaggerHilt> set = catchingFishToastKtor.CatchingFishCoroutine;
                Set set2 = catchingFishToastKtor.CatchingFishViewModelScope;
                for (CatchingFishGlideDaggerHilt catchingFishGlideDaggerHilt : set) {
                    int i = catchingFishGlideDaggerHilt.CatchingFishCoroutine;
                    int i2 = catchingFishGlideDaggerHilt.CatchingFishSnackbar;
                    boolean z = i == 0;
                    CatchingFishFABDagger catchingFishFABDagger = catchingFishGlideDaggerHilt.CatchingFishParcelableFAB;
                    if (z) {
                        if (i2 == 2) {
                            hashSet4.add(catchingFishFABDagger);
                        } else {
                            hashSet.add(catchingFishFABDagger);
                        }
                    } else if (i == 2) {
                        hashSet3.add(catchingFishFABDagger);
                    } else if (i2 == 2) {
                        hashSet5.add(catchingFishFABDagger);
                    } else {
                        hashSet2.add(catchingFishFABDagger);
                    }
                }
                if (!set2.isEmpty()) {
                    hashSet.add(CatchingFishFABDagger.CatchingFishParcelableFAB(CatchingFishMoshiRedux.class));
                }
                catchingFishViewWorkManager.CatchingFishReduxKtor = Collections.unmodifiableSet(hashSet);
                catchingFishViewWorkManager.CatchingFishDaggerWebsocket = Collections.unmodifiableSet(hashSet2);
                catchingFishViewWorkManager.CatchingFishWorkManager = Collections.unmodifiableSet(hashSet3);
                catchingFishViewWorkManager.CatchingFishViewModelScope = Collections.unmodifiableSet(hashSet4);
                catchingFishViewWorkManager.CatchingFishViewModelFAB = Collections.unmodifiableSet(hashSet5);
                catchingFishViewWorkManager.CatchingFishLayout = catchingFishSpannableJUnit;
                return catchingFishMockkAsyncTask.CatchingFishWorkManager(catchingFishViewWorkManager);
            case 1:
                return new CatchingFishCameraXAndroidX((Context) this.CatchingFishSnackbar, (String) this.CatchingFishCoroutine);
            default:
                com.google.firebase.CatchingFishPagingLibrary catchingFishPagingLibrary = (com.google.firebase.CatchingFishPagingLibrary) this.CatchingFishSnackbar;
                Context context = (Context) this.CatchingFishCoroutine;
                String CatchingFishCoroutine = catchingFishPagingLibrary.CatchingFishCoroutine();
                CatchingFishServiceLiveData catchingFishServiceLiveData = new CatchingFishServiceLiveData();
                Context createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
                SharedPreferences sharedPreferences = createDeviceProtectedStorageContext.getSharedPreferences("com.google.firebase.common.prefs:" + CatchingFishCoroutine, 0);
                boolean z2 = true;
                if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
                    z2 = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
                } else {
                    try {
                        PackageManager packageManager = createDeviceProtectedStorageContext.getPackageManager();
                        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(createDeviceProtectedStorageContext.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                            z2 = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                catchingFishServiceLiveData.CatchingFishParcelableFAB = z2;
                return catchingFishServiceLiveData;
        }
    }
}
