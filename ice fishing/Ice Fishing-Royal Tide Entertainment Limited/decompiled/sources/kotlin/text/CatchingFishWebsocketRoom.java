package kotlin.text;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class CatchingFishWebsocketRoom {
    public Serializable CatchingFishCoroutine;
    public boolean CatchingFishParcelableFAB;
    public Object CatchingFishReduxKtor;
    public final Object CatchingFishSnackbar;

    public CatchingFishWebsocketRoom() {
        this.CatchingFishSnackbar = new Object();
        this.CatchingFishCoroutine = new ArrayList();
        this.CatchingFishReduxKtor = new ArrayList();
        this.CatchingFishParcelableFAB = true;
    }

    public synchronized boolean CatchingFishParcelableFAB() {
        boolean z;
        boolean z2;
        try {
            synchronized (this) {
                try {
                    if (!this.CatchingFishParcelableFAB) {
                        Boolean CatchingFishSnackbar = CatchingFishSnackbar();
                        this.CatchingFishCoroutine = CatchingFishSnackbar;
                        if (CatchingFishSnackbar == null) {
                            ((CatchingFishDataStoreFAB) ((CatchingFishGlideDataStore) this.CatchingFishSnackbar)).CatchingFishParcelableFAB(new CatchingFishLayoutLayout(25));
                        }
                        this.CatchingFishParcelableFAB = true;
                    }
                } finally {
                }
            }
            return z2;
        } catch (Throwable th) {
            throw th;
        }
        Boolean bool = (Boolean) this.CatchingFishCoroutine;
        if (bool != null) {
            z2 = bool.booleanValue();
        } else {
            com.google.firebase.CatchingFishPagingLibrary catchingFishPagingLibrary = ((FirebaseMessaging) this.CatchingFishReduxKtor).CatchingFishParcelableFAB;
            catchingFishPagingLibrary.CatchingFishParcelableFAB();
            CatchingFishServiceLiveData catchingFishServiceLiveData = (CatchingFishServiceLiveData) catchingFishPagingLibrary.CatchingFishViewModelScope.get();
            synchronized (catchingFishServiceLiveData) {
                z = catchingFishServiceLiveData.CatchingFishParcelableFAB;
            }
            z2 = z;
        }
        return z2;
    }

    public Boolean CatchingFishSnackbar() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        com.google.firebase.CatchingFishPagingLibrary catchingFishPagingLibrary = ((FirebaseMessaging) this.CatchingFishReduxKtor).CatchingFishParcelableFAB;
        catchingFishPagingLibrary.CatchingFishParcelableFAB();
        Context context = catchingFishPagingLibrary.CatchingFishParcelableFAB;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public CatchingFishWebsocketRoom(FirebaseMessaging firebaseMessaging, CatchingFishGlideDataStore catchingFishGlideDataStore) {
        this.CatchingFishReduxKtor = firebaseMessaging;
        this.CatchingFishSnackbar = catchingFishGlideDataStore;
    }
}
