package kotlin.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes.dex */
public final class CatchingFishGsonPicasso implements CatchingFishAdMobCoroutine {
    public final Context CatchingFishCoroutine;
    public final CatchingFishMVIWorkManager CatchingFishDaggerWebsocket;
    public final CatchingFishViewPagerMockk CatchingFishParcelableFAB;
    public final URL CatchingFishReduxKtor;
    public final ConnectivityManager CatchingFishSnackbar;
    public final int CatchingFishViewModelScope;
    public final CatchingFishMVIWorkManager CatchingFishWorkManager;

    public CatchingFishGsonPicasso(Context context, CatchingFishMVIWorkManager catchingFishMVIWorkManager, CatchingFishMVIWorkManager catchingFishMVIWorkManager2) {
        CatchingFishFABDatabinding catchingFishFABDatabinding = new CatchingFishFABDatabinding();
        CatchingFishJUnitGradle catchingFishJUnitGradle = CatchingFishJUnitGradle.CatchingFishParcelableFAB;
        catchingFishFABDatabinding.CatchingFishParcelableFAB(CatchingFishOkHttpWebsocket.class, catchingFishJUnitGradle);
        catchingFishFABDatabinding.CatchingFishParcelableFAB(CatchingFishToastPayPal.class, catchingFishJUnitGradle);
        CatchingFishRoomDatabaseMVP catchingFishRoomDatabaseMVP = CatchingFishRoomDatabaseMVP.CatchingFishParcelableFAB;
        catchingFishFABDatabinding.CatchingFishParcelableFAB(CatchingFishViewModelRoom.class, catchingFishRoomDatabaseMVP);
        catchingFishFABDatabinding.CatchingFishParcelableFAB(CatchingFishExoPlayerIntent.class, catchingFishRoomDatabaseMVP);
        CatchingFishContextOkHttp catchingFishContextOkHttp = CatchingFishContextOkHttp.CatchingFishParcelableFAB;
        catchingFishFABDatabinding.CatchingFishParcelableFAB(CatchingFishGsonCustomView.class, catchingFishContextOkHttp);
        catchingFishFABDatabinding.CatchingFishParcelableFAB(CatchingFishFragmentOkHttp.class, catchingFishContextOkHttp);
        CatchingFishViewPagerOkHttp catchingFishViewPagerOkHttp = CatchingFishViewPagerOkHttp.CatchingFishParcelableFAB;
        catchingFishFABDatabinding.CatchingFishParcelableFAB(CatchingFishNavigationGlide.class, catchingFishViewPagerOkHttp);
        catchingFishFABDatabinding.CatchingFishParcelableFAB(CatchingFishAndroidXRedux.class, catchingFishViewPagerOkHttp);
        CatchingFishParcelableMoshi catchingFishParcelableMoshi = CatchingFishParcelableMoshi.CatchingFishParcelableFAB;
        catchingFishFABDatabinding.CatchingFishParcelableFAB(CatchingFishParcelableGson.class, catchingFishParcelableMoshi);
        catchingFishFABDatabinding.CatchingFishParcelableFAB(CatchingFishPicassoRedux.class, catchingFishParcelableMoshi);
        CatchingFishWebSocketKtor catchingFishWebSocketKtor = CatchingFishWebSocketKtor.CatchingFishParcelableFAB;
        catchingFishFABDatabinding.CatchingFishParcelableFAB(CatchingFishBundleAppCompat.class, catchingFishWebSocketKtor);
        catchingFishFABDatabinding.CatchingFishParcelableFAB(CatchingFishHiltKtor.class, catchingFishWebSocketKtor);
        catchingFishFABDatabinding.CatchingFishViewModelScope = true;
        this.CatchingFishParcelableFAB = new CatchingFishViewPagerMockk(14, catchingFishFABDatabinding);
        this.CatchingFishCoroutine = context;
        this.CatchingFishSnackbar = (ConnectivityManager) context.getSystemService("connectivity");
        this.CatchingFishReduxKtor = CatchingFishSnackbar(CatchingFishWidgetMVVM.CatchingFishCoroutine);
        this.CatchingFishDaggerWebsocket = catchingFishMVIWorkManager2;
        this.CatchingFishWorkManager = catchingFishMVIWorkManager;
        this.CatchingFishViewModelScope = 130000;
    }

    public static URL CatchingFishSnackbar(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Invalid url: " + str, e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a7, code lost:
    
        if (((kotlin.text.CatchingFishDataStoreRealm) kotlin.text.CatchingFishDataStoreRealm.CatchingFishReduxKtor.get(r0)) != null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CatchingFishSpannableView CatchingFishParcelableFAB(CatchingFishSpannableView catchingFishSpannableView) {
        int type;
        int subtype;
        HashMap hashMap;
        NetworkInfo activeNetworkInfo = this.CatchingFishSnackbar.getActiveNetworkInfo();
        CatchingFishViewWorkManager CatchingFishCoroutine = catchingFishSpannableView.CatchingFishCoroutine();
        int i = Build.VERSION.SDK_INT;
        HashMap hashMap2 = (HashMap) CatchingFishCoroutine.CatchingFishLayout;
        if (hashMap2 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap2.put("sdk-version", String.valueOf(i));
        CatchingFishCoroutine.CatchingFishLayout("model", Build.MODEL);
        CatchingFishCoroutine.CatchingFishLayout("hardware", Build.HARDWARE);
        CatchingFishCoroutine.CatchingFishLayout("device", Build.DEVICE);
        CatchingFishCoroutine.CatchingFishLayout("product", Build.PRODUCT);
        CatchingFishCoroutine.CatchingFishLayout("os-uild", Build.ID);
        CatchingFishCoroutine.CatchingFishLayout("manufacturer", Build.MANUFACTURER);
        CatchingFishCoroutine.CatchingFishLayout("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
        HashMap hashMap3 = (HashMap) CatchingFishCoroutine.CatchingFishLayout;
        if (hashMap3 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap3.put("tz-offset", String.valueOf(offset));
        int i2 = -1;
        if (activeNetworkInfo == null) {
            SparseArray sparseArray = CatchingFishIntentWebsocket.CatchingFishReduxKtor;
            type = -1;
        } else {
            type = activeNetworkInfo.getType();
        }
        HashMap hashMap4 = (HashMap) CatchingFishCoroutine.CatchingFishLayout;
        if (hashMap4 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap4.put("net-type", String.valueOf(type));
        if (activeNetworkInfo != null) {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                SparseArray sparseArray2 = CatchingFishDataStoreRealm.CatchingFishReduxKtor;
                subtype = 100;
            }
            hashMap = (HashMap) CatchingFishCoroutine.CatchingFishLayout;
            if (hashMap != null) {
                throw new IllegalStateException("Property \"autoMetadata\" has not been set");
            }
            hashMap.put("mobile-subtype", String.valueOf(subtype));
            CatchingFishCoroutine.CatchingFishLayout("country", Locale.getDefault().getCountry());
            CatchingFishCoroutine.CatchingFishLayout("locale", Locale.getDefault().getLanguage());
            Context context = this.CatchingFishCoroutine;
            CatchingFishCoroutine.CatchingFishLayout("mcc_mnc", ((TelephonyManager) context.getSystemService("phone")).getSimOperator());
            try {
                i2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                CatchingFishToastHiltBundle.CatchingFishSpannableWidget("CctTransportBackend");
            }
            CatchingFishCoroutine.CatchingFishLayout("application_build", Integer.toString(i2));
            return CatchingFishCoroutine.CatchingFishCloudMessaging();
        }
        SparseArray sparseArray3 = CatchingFishDataStoreRealm.CatchingFishReduxKtor;
        subtype = 0;
        hashMap = (HashMap) CatchingFishCoroutine.CatchingFishLayout;
        if (hashMap != null) {
        }
    }
}
