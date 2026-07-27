package com.google.firebase.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.SystemClock;
import com.google.firebase.CatchingFishPagingLibrary;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.text.CatchingFishOkHttpSnackbar;
import kotlin.text.CatchingFishReduxMVVM;
import kotlin.text.CatchingFishToastHiltBundle;

/* loaded from: classes.dex */
public class FirebaseInitProvider extends ContentProvider {
    public static final CatchingFishReduxMVVM CatchingFishReduxKtor = new CatchingFishReduxMVVM(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    public static final AtomicBoolean CatchingFishDaggerWebsocket = new AtomicBoolean(false);

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        CatchingFishToastHiltBundle.CatchingFishStateLiveData(providerInfo, "FirebaseInitProvider ProviderInfo cannot be null.");
        if ("com.google.firebase.firebaseinitprovider".equals(providerInfo.authority)) {
            throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
        }
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        try {
            AtomicBoolean atomicBoolean = CatchingFishDaggerWebsocket;
            atomicBoolean.set(true);
            Context context = getContext();
            synchronized (CatchingFishPagingLibrary.CatchingFishCloudMessaging) {
                try {
                    if (CatchingFishPagingLibrary.CatchingFishEspressoTesting.containsKey("[DEFAULT]")) {
                        CatchingFishPagingLibrary.CatchingFishSnackbar();
                    } else {
                        CatchingFishOkHttpSnackbar CatchingFishParcelableFAB = CatchingFishOkHttpSnackbar.CatchingFishParcelableFAB(context);
                        if (CatchingFishParcelableFAB != null) {
                            CatchingFishPagingLibrary.CatchingFishDaggerWebsocket(context, CatchingFishParcelableFAB);
                        }
                    }
                } finally {
                }
            }
            atomicBoolean.set(false);
            return false;
        } catch (Throwable th) {
            CatchingFishDaggerWebsocket.set(false);
            throw th;
        }
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
