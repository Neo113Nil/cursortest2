package kotlin.text;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.adjust.sdk.Constants;
import com.android.installreferrer.api.InstallReferrerClient;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class CatchingFishGsonRetrofit {
    public final CatchingFishOkHttpFirebase CatchingFishCoroutine;
    public final Executor CatchingFishDaggerWebsocket;
    public final CatchingFishEspressoAdMob CatchingFishLayout;
    public final Context CatchingFishParcelableFAB;
    public final CatchingFishAppCompatLayout CatchingFishReduxKtor;
    public final CatchingFishPayPalHandler CatchingFishSnackbar;
    public final CatchingFishMVIWorkManager CatchingFishViewModelFAB;
    public final CatchingFishMVIWorkManager CatchingFishViewModelScope;
    public final CatchingFishGsonCameraX CatchingFishWorkManager;

    public CatchingFishGsonRetrofit(Context context, CatchingFishPayPalHandler catchingFishPayPalHandler, CatchingFishOkHttpFirebase catchingFishOkHttpFirebase, CatchingFishAppCompatLayout catchingFishAppCompatLayout, Executor executor, CatchingFishGsonCameraX catchingFishGsonCameraX, CatchingFishMVIWorkManager catchingFishMVIWorkManager, CatchingFishMVIWorkManager catchingFishMVIWorkManager2, CatchingFishEspressoAdMob catchingFishEspressoAdMob) {
        this.CatchingFishParcelableFAB = context;
        this.CatchingFishSnackbar = catchingFishPayPalHandler;
        this.CatchingFishCoroutine = catchingFishOkHttpFirebase;
        this.CatchingFishReduxKtor = catchingFishAppCompatLayout;
        this.CatchingFishDaggerWebsocket = executor;
        this.CatchingFishWorkManager = catchingFishGsonCameraX;
        this.CatchingFishViewModelScope = catchingFishMVIWorkManager;
        this.CatchingFishViewModelFAB = catchingFishMVIWorkManager2;
        this.CatchingFishLayout = catchingFishEspressoAdMob;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x03c4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void CatchingFishParcelableFAB(CatchingFishBundleMVIHilt catchingFishBundleMVIHilt, int i) {
        byte[] bArr;
        CatchingFishAdMobCoroutine catchingFishAdMobCoroutine;
        long j;
        CatchingFishLayoutAppCompat catchingFishLayoutAppCompat;
        String str;
        CatchingFishLayoutAppCompat catchingFishLayoutAppCompat2;
        int i2;
        CatchingFishJobSchedulerMVI CatchingFishSnackbar;
        Integer num;
        String str2;
        long j2;
        CatchingFishHiltPayPal catchingFishHiltPayPal;
        byte[] bArr2;
        int i3;
        final CatchingFishGsonRetrofit catchingFishGsonRetrofit = this;
        final CatchingFishBundleMVIHilt catchingFishBundleMVIHilt2 = catchingFishBundleMVIHilt;
        byte[] bArr3 = catchingFishBundleMVIHilt2.CatchingFishSnackbar;
        CatchingFishAdMobCoroutine CatchingFishParcelableFAB = catchingFishGsonRetrofit.CatchingFishSnackbar.CatchingFishParcelableFAB(catchingFishBundleMVIHilt2.CatchingFishParcelableFAB);
        long j3 = 0;
        while (true) {
            final int i4 = 0;
            CatchingFishHandlerJUnit catchingFishHandlerJUnit = new CatchingFishHandlerJUnit(catchingFishGsonRetrofit) { // from class: kotlin.text.CatchingFishGradleFragment
                public final /* synthetic */ CatchingFishGsonRetrofit CatchingFishDaggerWebsocket;

                {
                    this.CatchingFishDaggerWebsocket = catchingFishGsonRetrofit;
                }

                @Override // kotlin.text.CatchingFishHandlerJUnit
                public final Object CatchingFishParcelableFAB() {
                    Boolean bool;
                    switch (i4) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            CatchingFishBundleMVIHilt catchingFishBundleMVIHilt3 = catchingFishBundleMVIHilt2;
                            CatchingFishMVIView catchingFishMVIView = (CatchingFishMVIView) this.CatchingFishDaggerWebsocket.CatchingFishCoroutine;
                            SQLiteDatabase CatchingFishSnackbar2 = catchingFishMVIView.CatchingFishSnackbar();
                            CatchingFishSnackbar2.beginTransaction();
                            try {
                                Long CatchingFishCoroutine = CatchingFishMVIView.CatchingFishCoroutine(CatchingFishSnackbar2, catchingFishBundleMVIHilt3);
                                if (CatchingFishCoroutine == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor rawQuery = catchingFishMVIView.CatchingFishSnackbar().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{CatchingFishCoroutine.toString()});
                                    try {
                                        Boolean valueOf = Boolean.valueOf(rawQuery.moveToNext());
                                        rawQuery.close();
                                        bool = valueOf;
                                    } catch (Throwable th) {
                                        rawQuery.close();
                                        throw th;
                                    }
                                }
                                CatchingFishSnackbar2.setTransactionSuccessful();
                                return bool;
                            } finally {
                                CatchingFishSnackbar2.endTransaction();
                            }
                        default:
                            CatchingFishMVIView catchingFishMVIView2 = (CatchingFishMVIView) this.CatchingFishDaggerWebsocket.CatchingFishCoroutine;
                            catchingFishMVIView2.getClass();
                            return (Iterable) catchingFishMVIView2.CatchingFishReduxKtor(new CatchingFishXMLLayoutOkHttp(4, catchingFishMVIView2, catchingFishBundleMVIHilt2));
                    }
                }
            };
            CatchingFishMVIView catchingFishMVIView = (CatchingFishMVIView) catchingFishGsonRetrofit.CatchingFishWorkManager;
            if (!((Boolean) catchingFishMVIView.CatchingFishEspressoTesting(catchingFishHandlerJUnit)).booleanValue()) {
                catchingFishMVIView.CatchingFishEspressoTesting(new CatchingFishRealmRealm(j3, catchingFishGsonRetrofit, catchingFishBundleMVIHilt2));
                return;
            }
            final int i5 = 1;
            Iterable iterable = (Iterable) catchingFishMVIView.CatchingFishEspressoTesting(new CatchingFishHandlerJUnit(catchingFishGsonRetrofit) { // from class: kotlin.text.CatchingFishGradleFragment
                public final /* synthetic */ CatchingFishGsonRetrofit CatchingFishDaggerWebsocket;

                {
                    this.CatchingFishDaggerWebsocket = catchingFishGsonRetrofit;
                }

                @Override // kotlin.text.CatchingFishHandlerJUnit
                public final Object CatchingFishParcelableFAB() {
                    Boolean bool;
                    switch (i5) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            CatchingFishBundleMVIHilt catchingFishBundleMVIHilt3 = catchingFishBundleMVIHilt2;
                            CatchingFishMVIView catchingFishMVIView2 = (CatchingFishMVIView) this.CatchingFishDaggerWebsocket.CatchingFishCoroutine;
                            SQLiteDatabase CatchingFishSnackbar2 = catchingFishMVIView2.CatchingFishSnackbar();
                            CatchingFishSnackbar2.beginTransaction();
                            try {
                                Long CatchingFishCoroutine = CatchingFishMVIView.CatchingFishCoroutine(CatchingFishSnackbar2, catchingFishBundleMVIHilt3);
                                if (CatchingFishCoroutine == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor rawQuery = catchingFishMVIView2.CatchingFishSnackbar().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{CatchingFishCoroutine.toString()});
                                    try {
                                        Boolean valueOf = Boolean.valueOf(rawQuery.moveToNext());
                                        rawQuery.close();
                                        bool = valueOf;
                                    } catch (Throwable th) {
                                        rawQuery.close();
                                        throw th;
                                    }
                                }
                                CatchingFishSnackbar2.setTransactionSuccessful();
                                return bool;
                            } finally {
                                CatchingFishSnackbar2.endTransaction();
                            }
                        default:
                            CatchingFishMVIView catchingFishMVIView22 = (CatchingFishMVIView) this.CatchingFishDaggerWebsocket.CatchingFishCoroutine;
                            catchingFishMVIView22.getClass();
                            return (Iterable) catchingFishMVIView22.CatchingFishReduxKtor(new CatchingFishXMLLayoutOkHttp(4, catchingFishMVIView22, catchingFishBundleMVIHilt2));
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            if (CatchingFishParcelableFAB == null) {
                CatchingFishToastHiltBundle.CatchingFishNavigation("Uploader", "Unknown backend for %s, deleting event batch for it...", catchingFishBundleMVIHilt2);
                catchingFishLayoutAppCompat2 = new CatchingFishLayoutAppCompat(3, -1L);
                bArr = bArr3;
                catchingFishAdMobCoroutine = CatchingFishParcelableFAB;
                j = j3;
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((CatchingFishHiltIntent) it.next()).CatchingFishCoroutine);
                }
                if (bArr3 != null) {
                    CatchingFishEspressoAdMob catchingFishEspressoAdMob = catchingFishGsonRetrofit.CatchingFishLayout;
                    Objects.requireNonNull(catchingFishEspressoAdMob);
                    CatchingFishEspressoOkHttp catchingFishEspressoOkHttp = (CatchingFishEspressoOkHttp) catchingFishMVIView.CatchingFishEspressoTesting(new CatchingFishLayoutCoroutine(7, catchingFishEspressoAdMob));
                    CatchingFishViewWorkManager catchingFishViewWorkManager = new CatchingFishViewWorkManager();
                    catchingFishViewWorkManager.CatchingFishLayout = new HashMap();
                    catchingFishViewWorkManager.CatchingFishViewModelScope = Long.valueOf(catchingFishGsonRetrofit.CatchingFishViewModelScope.CatchingFishParcelableFAB());
                    catchingFishViewWorkManager.CatchingFishViewModelFAB = Long.valueOf(catchingFishGsonRetrofit.CatchingFishViewModelFAB.CatchingFishParcelableFAB());
                    catchingFishViewWorkManager.CatchingFishReduxKtor = "GDT_CLIENT_METRICS";
                    CatchingFishBiometricIntent catchingFishBiometricIntent = new CatchingFishBiometricIntent("proto");
                    catchingFishEspressoOkHttp.getClass();
                    CatchingFishAsyncTaskDagger catchingFishAsyncTaskDagger = CatchingFishSpannableFlux.CatchingFishParcelableFAB;
                    catchingFishAsyncTaskDagger.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        catchingFishAsyncTaskDagger.CatchingFishPayPal(catchingFishEspressoOkHttp, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    catchingFishViewWorkManager.CatchingFishWorkManager = new CatchingFishManifestBundle(catchingFishBiometricIntent, byteArrayOutputStream.toByteArray());
                    arrayList.add(((CatchingFishGsonPicasso) CatchingFishParcelableFAB).CatchingFishParcelableFAB(catchingFishViewWorkManager.CatchingFishCloudMessaging()));
                }
                CatchingFishGsonPicasso catchingFishGsonPicasso = (CatchingFishGsonPicasso) CatchingFishParcelableFAB;
                HashMap hashMap = new HashMap();
                int size = arrayList.size();
                int i6 = 0;
                while (i6 < size) {
                    Object obj = arrayList.get(i6);
                    i6++;
                    CatchingFishSpannableView catchingFishSpannableView = (CatchingFishSpannableView) obj;
                    String str3 = catchingFishSpannableView.CatchingFishParcelableFAB;
                    if (hashMap.containsKey(str3)) {
                        bArr2 = bArr3;
                        ((List) hashMap.get(str3)).add(catchingFishSpannableView);
                    } else {
                        bArr2 = bArr3;
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(catchingFishSpannableView);
                        hashMap.put(str3, arrayList2);
                    }
                    bArr3 = bArr2;
                }
                bArr = bArr3;
                ArrayList arrayList3 = new ArrayList();
                for (Map.Entry entry : hashMap.entrySet()) {
                    CatchingFishSpannableView catchingFishSpannableView2 = (CatchingFishSpannableView) ((List) entry.getValue()).get(0);
                    CatchingFishJUnitWidget catchingFishJUnitWidget = CatchingFishJUnitWidget.CatchingFishReduxKtor;
                    long CatchingFishParcelableFAB2 = catchingFishGsonPicasso.CatchingFishWorkManager.CatchingFishParcelableFAB();
                    long CatchingFishParcelableFAB3 = catchingFishGsonPicasso.CatchingFishDaggerWebsocket.CatchingFishParcelableFAB();
                    CatchingFishFragmentOkHttp catchingFishFragmentOkHttp = new CatchingFishFragmentOkHttp(new CatchingFishAndroidXRedux(Integer.valueOf(catchingFishSpannableView2.CatchingFishSnackbar("sdk-version")), catchingFishSpannableView2.CatchingFishParcelableFAB("model"), catchingFishSpannableView2.CatchingFishParcelableFAB("hardware"), catchingFishSpannableView2.CatchingFishParcelableFAB("device"), catchingFishSpannableView2.CatchingFishParcelableFAB("product"), catchingFishSpannableView2.CatchingFishParcelableFAB("os-uild"), catchingFishSpannableView2.CatchingFishParcelableFAB("manufacturer"), catchingFishSpannableView2.CatchingFishParcelableFAB("fingerprint"), catchingFishSpannableView2.CatchingFishParcelableFAB("locale"), catchingFishSpannableView2.CatchingFishParcelableFAB("country"), catchingFishSpannableView2.CatchingFishParcelableFAB("mcc_mnc"), catchingFishSpannableView2.CatchingFishParcelableFAB("application_build")));
                    try {
                        str2 = null;
                        num = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                    } catch (NumberFormatException unused2) {
                        num = null;
                        str2 = (String) entry.getKey();
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (CatchingFishSpannableView catchingFishSpannableView3 : (List) entry.getValue()) {
                        CatchingFishManifestBundle catchingFishManifestBundle = catchingFishSpannableView3.CatchingFishCoroutine;
                        CatchingFishAdMobCoroutine catchingFishAdMobCoroutine2 = CatchingFishParcelableFAB;
                        CatchingFishBiometricIntent catchingFishBiometricIntent2 = catchingFishManifestBundle.CatchingFishParcelableFAB;
                        byte[] bArr4 = catchingFishManifestBundle.CatchingFishSnackbar;
                        if (catchingFishBiometricIntent2.equals(new CatchingFishBiometricIntent("proto"))) {
                            catchingFishHiltPayPal = new CatchingFishHiltPayPal();
                            catchingFishHiltPayPal.CatchingFishReduxKtor = bArr4;
                            j2 = j3;
                        } else {
                            j2 = j3;
                            if (catchingFishBiometricIntent2.equals(new CatchingFishBiometricIntent("json"))) {
                                String str4 = new String(bArr4, Charset.forName(Constants.ENCODING));
                                CatchingFishHiltPayPal catchingFishHiltPayPal2 = new CatchingFishHiltPayPal();
                                catchingFishHiltPayPal2.CatchingFishDaggerWebsocket = str4;
                                catchingFishHiltPayPal = catchingFishHiltPayPal2;
                            } else {
                                if (Log.isLoggable(CatchingFishToastHiltBundle.CatchingFishSpannableWidget("CctTransportBackend"), 5)) {
                                    catchingFishBiometricIntent2.toString();
                                }
                                CatchingFishParcelableFAB = catchingFishAdMobCoroutine2;
                                j3 = j2;
                            }
                        }
                        catchingFishHiltPayPal.CatchingFishParcelableFAB = Long.valueOf(catchingFishSpannableView3.CatchingFishReduxKtor);
                        catchingFishHiltPayPal.CatchingFishCoroutine = Long.valueOf(catchingFishSpannableView3.CatchingFishDaggerWebsocket);
                        String str5 = (String) catchingFishSpannableView3.CatchingFishWorkManager.get("tz-offset");
                        catchingFishHiltPayPal.CatchingFishWorkManager = Long.valueOf(str5 == null ? 0L : Long.valueOf(str5).longValue());
                        catchingFishHiltPayPal.CatchingFishViewModelScope = new CatchingFishHiltKtor((CatchingFishIntentWebsocket) CatchingFishIntentWebsocket.CatchingFishReduxKtor.get(catchingFishSpannableView3.CatchingFishSnackbar("net-type")), (CatchingFishDataStoreRealm) CatchingFishDataStoreRealm.CatchingFishReduxKtor.get(catchingFishSpannableView3.CatchingFishSnackbar("mobile-subtype")));
                        Integer num2 = catchingFishSpannableView3.CatchingFishSnackbar;
                        if (num2 != null) {
                            catchingFishHiltPayPal.CatchingFishSnackbar = num2;
                        }
                        String str6 = ((Long) catchingFishHiltPayPal.CatchingFishParcelableFAB) == null ? " eventTimeMs" : "";
                        if (((Long) catchingFishHiltPayPal.CatchingFishCoroutine) == null) {
                            str6 = str6.concat(" eventUptimeMs");
                        }
                        if (((Long) catchingFishHiltPayPal.CatchingFishWorkManager) == null) {
                            str6 = CatchingFishMVPLiveData.CatchingFishEspressoTesting(str6, " timezoneOffsetSeconds");
                        }
                        if (!str6.isEmpty()) {
                            throw new IllegalStateException("Missing required properties:".concat(str6));
                        }
                        arrayList4.add(new CatchingFishPicassoRedux(((Long) catchingFishHiltPayPal.CatchingFishParcelableFAB).longValue(), (Integer) catchingFishHiltPayPal.CatchingFishSnackbar, ((Long) catchingFishHiltPayPal.CatchingFishCoroutine).longValue(), (byte[]) catchingFishHiltPayPal.CatchingFishReduxKtor, (String) catchingFishHiltPayPal.CatchingFishDaggerWebsocket, ((Long) catchingFishHiltPayPal.CatchingFishWorkManager).longValue(), (CatchingFishHiltKtor) catchingFishHiltPayPal.CatchingFishViewModelScope));
                        CatchingFishParcelableFAB = catchingFishAdMobCoroutine2;
                        j3 = j2;
                    }
                    arrayList3.add(new CatchingFishExoPlayerIntent(CatchingFishParcelableFAB2, CatchingFishParcelableFAB3, catchingFishFragmentOkHttp, num, str2, arrayList4));
                }
                catchingFishAdMobCoroutine = CatchingFishParcelableFAB;
                j = j3;
                CatchingFishToastPayPal catchingFishToastPayPal = new CatchingFishToastPayPal(arrayList3);
                URL url = catchingFishGsonPicasso.CatchingFishReduxKtor;
                if (bArr != null) {
                    try {
                        CatchingFishWidgetMVVM CatchingFishParcelableFAB4 = CatchingFishWidgetMVVM.CatchingFishParcelableFAB(bArr);
                        str = CatchingFishParcelableFAB4.CatchingFishSnackbar;
                        if (str == null) {
                            str = null;
                        }
                        String str7 = CatchingFishParcelableFAB4.CatchingFishParcelableFAB;
                        if (str7 != null) {
                            url = CatchingFishGsonPicasso.CatchingFishSnackbar(str7);
                        }
                    } catch (IllegalArgumentException unused3) {
                        catchingFishLayoutAppCompat = new CatchingFishLayoutAppCompat(3, -1L);
                    }
                } else {
                    str = null;
                }
                try {
                    CatchingFishAsyncTaskDagger catchingFishAsyncTaskDagger2 = new CatchingFishAsyncTaskDagger(url, catchingFishToastPayPal, str, 6);
                    CatchingFishLayoutCoroutine catchingFishLayoutCoroutine = new CatchingFishLayoutCoroutine(0, catchingFishGsonPicasso);
                    int i7 = 5;
                    do {
                        CatchingFishSnackbar = catchingFishLayoutCoroutine.CatchingFishSnackbar(catchingFishAsyncTaskDagger2);
                        URL url2 = CatchingFishSnackbar.CatchingFishSnackbar;
                        if (url2 != null) {
                            CatchingFishToastHiltBundle.CatchingFishNavigation("CctTransportBackend", "Following redirect to: %s", url2);
                            catchingFishAsyncTaskDagger2 = new CatchingFishAsyncTaskDagger(url2, (CatchingFishToastPayPal) catchingFishAsyncTaskDagger2.CatchingFishWorkManager, (String) catchingFishAsyncTaskDagger2.CatchingFishViewModelScope, 6);
                        } else {
                            catchingFishAsyncTaskDagger2 = null;
                        }
                        if (catchingFishAsyncTaskDagger2 == null) {
                            break;
                        } else {
                            i7--;
                        }
                    } while (i7 >= 1);
                    int i8 = CatchingFishSnackbar.CatchingFishParcelableFAB;
                    if (i8 == 200) {
                        catchingFishLayoutAppCompat2 = new CatchingFishLayoutAppCompat(1, CatchingFishSnackbar.CatchingFishCoroutine);
                    } else {
                        if (i8 >= 500 || i8 == 404) {
                            catchingFishLayoutAppCompat = new CatchingFishLayoutAppCompat(2, -1L);
                        } else if (i8 == 400) {
                            try {
                                catchingFishLayoutAppCompat = new CatchingFishLayoutAppCompat(4, -1L);
                            } catch (IOException unused4) {
                                CatchingFishToastHiltBundle.CatchingFishSpannableWidget("CctTransportBackend");
                                i2 = 2;
                                catchingFishLayoutAppCompat2 = new CatchingFishLayoutAppCompat(2, -1L);
                                i3 = catchingFishLayoutAppCompat2.CatchingFishParcelableFAB;
                                if (i3 != i2) {
                                }
                            }
                        } else {
                            catchingFishLayoutAppCompat = new CatchingFishLayoutAppCompat(3, -1L);
                        }
                        catchingFishLayoutAppCompat2 = catchingFishLayoutAppCompat;
                    }
                } catch (IOException unused5) {
                }
            }
            i2 = 2;
            i3 = catchingFishLayoutAppCompat2.CatchingFishParcelableFAB;
            if (i3 != i2) {
                catchingFishMVIView.CatchingFishEspressoTesting(new CatchingFishRealmLayout(this, iterable, catchingFishBundleMVIHilt, j));
                this.CatchingFishReduxKtor.CatchingFishParcelableFAB(catchingFishBundleMVIHilt, i + 1, true);
                return;
            }
            catchingFishGsonRetrofit = this;
            catchingFishBundleMVIHilt2 = catchingFishBundleMVIHilt;
            long j4 = j;
            catchingFishMVIView.CatchingFishEspressoTesting(new CatchingFishXMLLayoutOkHttp(5, catchingFishGsonRetrofit, iterable));
            if (i3 == 1) {
                j3 = Math.max(j4, catchingFishLayoutAppCompat2.CatchingFishSnackbar);
                if (bArr != null) {
                    catchingFishMVIView.CatchingFishEspressoTesting(new CatchingFishLayoutCoroutine(9, catchingFishGsonRetrofit));
                }
            } else {
                if (i3 == 4) {
                    HashMap hashMap2 = new HashMap();
                    Iterator it2 = iterable.iterator();
                    while (it2.hasNext()) {
                        String str8 = ((CatchingFishHiltIntent) it2.next()).CatchingFishCoroutine.CatchingFishParcelableFAB;
                        if (hashMap2.containsKey(str8)) {
                            hashMap2.put(str8, Integer.valueOf(((Integer) hashMap2.get(str8)).intValue() + 1));
                        } else {
                            hashMap2.put(str8, 1);
                        }
                    }
                    catchingFishMVIView.CatchingFishEspressoTesting(new CatchingFishXMLLayoutOkHttp(6, catchingFishGsonRetrofit, hashMap2));
                }
                j3 = j4;
            }
            bArr3 = bArr;
            CatchingFishParcelableFAB = catchingFishAdMobCoroutine;
        }
    }
}
