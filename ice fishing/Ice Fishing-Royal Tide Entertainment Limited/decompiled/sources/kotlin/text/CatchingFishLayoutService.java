package kotlin.text;

import android.net.TrafficStats;
import android.text.TextUtils;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class CatchingFishLayoutService implements CatchingFishToolbarPayPal {
    public static final Object CatchingFishOkHttp = new Object();
    public final HashSet CatchingFishCloudMessaging;
    public final CatchingFishViewModelIntent CatchingFishCoroutine;
    public final CatchingFishWebsocketOkHttp CatchingFishDaggerWebsocket;
    public final ArrayList CatchingFishEspressoTesting;
    public String CatchingFishFragmentHandler;
    public final CatchingFishLifecycleGradle CatchingFishLayout;
    public final com.google.firebase.CatchingFishPagingLibrary CatchingFishParcelableFAB;
    public final CatchingFishMVIRoomMoshi CatchingFishReduxKtor;
    public final CatchingFishCoroutineDagger CatchingFishSnackbar;
    public final ExecutorService CatchingFishViewModelFAB;
    public final Object CatchingFishViewModelScope;
    public final CatchingFishHiltJUnitMockk CatchingFishWorkManager;

    static {
        new AtomicInteger(1);
    }

    public CatchingFishLayoutService(com.google.firebase.CatchingFishPagingLibrary catchingFishPagingLibrary, CatchingFishLiveDataHandler catchingFishLiveDataHandler, ExecutorService executorService, CatchingFishLifecycleGradle catchingFishLifecycleGradle) {
        catchingFishPagingLibrary.CatchingFishParcelableFAB();
        CatchingFishCoroutineDagger catchingFishCoroutineDagger = new CatchingFishCoroutineDagger(catchingFishPagingLibrary.CatchingFishParcelableFAB, catchingFishLiveDataHandler);
        CatchingFishViewModelIntent catchingFishViewModelIntent = new CatchingFishViewModelIntent(7, catchingFishPagingLibrary);
        if (CatchingFishMoshiGson.CatchingFishParcelableFAB == null) {
            CatchingFishMoshiGson.CatchingFishParcelableFAB = new CatchingFishMoshiGson();
        }
        CatchingFishMoshiGson catchingFishMoshiGson = CatchingFishMoshiGson.CatchingFishParcelableFAB;
        if (CatchingFishMVIRoomMoshi.CatchingFishReduxKtor == null) {
            CatchingFishMVIRoomMoshi.CatchingFishReduxKtor = new CatchingFishMVIRoomMoshi(catchingFishMoshiGson);
        }
        CatchingFishMVIRoomMoshi catchingFishMVIRoomMoshi = CatchingFishMVIRoomMoshi.CatchingFishReduxKtor;
        CatchingFishWebsocketOkHttp catchingFishWebsocketOkHttp = new CatchingFishWebsocketOkHttp(new CatchingFishMVIStateFlow(2, catchingFishPagingLibrary));
        CatchingFishHiltJUnitMockk catchingFishHiltJUnitMockk = new CatchingFishHiltJUnitMockk();
        this.CatchingFishViewModelScope = new Object();
        this.CatchingFishCloudMessaging = new HashSet();
        this.CatchingFishEspressoTesting = new ArrayList();
        this.CatchingFishParcelableFAB = catchingFishPagingLibrary;
        this.CatchingFishSnackbar = catchingFishCoroutineDagger;
        this.CatchingFishCoroutine = catchingFishViewModelIntent;
        this.CatchingFishReduxKtor = catchingFishMVIRoomMoshi;
        this.CatchingFishDaggerWebsocket = catchingFishWebsocketOkHttp;
        this.CatchingFishWorkManager = catchingFishHiltJUnitMockk;
        this.CatchingFishViewModelFAB = executorService;
        this.CatchingFishLayout = catchingFishLifecycleGradle;
    }

    public final CatchingFishWorkManagerMVP CatchingFishCoroutine() {
        String str;
        CatchingFishDaggerWebsocket();
        synchronized (this) {
            str = this.CatchingFishFragmentHandler;
        }
        if (str != null) {
            return CatchingFishViewMVIMVVM.CatchingFishDaggerWebsocket(str);
        }
        CatchingFishAndroidXPayPal catchingFishAndroidXPayPal = new CatchingFishAndroidXPayPal();
        CatchingFishViewContext catchingFishViewContext = new CatchingFishViewContext(catchingFishAndroidXPayPal);
        synchronized (this.CatchingFishViewModelScope) {
            this.CatchingFishEspressoTesting.add(catchingFishViewContext);
        }
        CatchingFishWorkManagerMVP catchingFishWorkManagerMVP = catchingFishAndroidXPayPal.CatchingFishParcelableFAB;
        this.CatchingFishViewModelFAB.execute(new CatchingFishOkHttpLayout(this, 0));
        return catchingFishWorkManagerMVP;
    }

    public final void CatchingFishDaggerWebsocket() {
        com.google.firebase.CatchingFishPagingLibrary catchingFishPagingLibrary = this.CatchingFishParcelableFAB;
        catchingFishPagingLibrary.CatchingFishParcelableFAB();
        CatchingFishToastHiltBundle.CatchingFishOkHttp(catchingFishPagingLibrary.CatchingFishCoroutine.CatchingFishSnackbar, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        catchingFishPagingLibrary.CatchingFishParcelableFAB();
        CatchingFishToastHiltBundle.CatchingFishOkHttp(catchingFishPagingLibrary.CatchingFishCoroutine.CatchingFishViewModelScope, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        catchingFishPagingLibrary.CatchingFishParcelableFAB();
        CatchingFishToastHiltBundle.CatchingFishOkHttp(catchingFishPagingLibrary.CatchingFishCoroutine.CatchingFishParcelableFAB, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        catchingFishPagingLibrary.CatchingFishParcelableFAB();
        String str = catchingFishPagingLibrary.CatchingFishCoroutine.CatchingFishSnackbar;
        Pattern pattern = CatchingFishMVIRoomMoshi.CatchingFishCoroutine;
        CatchingFishToastHiltBundle.CatchingFishFragmentHandler("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        catchingFishPagingLibrary.CatchingFishParcelableFAB();
        CatchingFishToastHiltBundle.CatchingFishFragmentHandler("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", CatchingFishMVIRoomMoshi.CatchingFishCoroutine.matcher(catchingFishPagingLibrary.CatchingFishCoroutine.CatchingFishParcelableFAB).matches());
    }

    public final void CatchingFishLayout(CatchingFishDaggerDataStore catchingFishDaggerDataStore) {
        synchronized (this.CatchingFishViewModelScope) {
            try {
                Iterator it = this.CatchingFishEspressoTesting.iterator();
                while (it.hasNext()) {
                    if (((CatchingFishKtorCameraXView) it.next()).CatchingFishParcelableFAB(catchingFishDaggerDataStore)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        r3 = CatchingFishWorkManager(r2);
        r4 = r6.CatchingFishCoroutine;
        r2 = r2.CatchingFishParcelableFAB();
        r2.CatchingFishSnackbar = r3;
        r2.CatchingFishParcelableFAB = 3;
        r2 = r2.CatchingFishParcelableFAB();
        r4.CatchingFishAnimationMockk(r2);
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void CatchingFishParcelableFAB() {
        CatchingFishDaggerDataStore CatchingFishGsonAppCompat;
        synchronized (CatchingFishOkHttp) {
            try {
                com.google.firebase.CatchingFishPagingLibrary catchingFishPagingLibrary = this.CatchingFishParcelableFAB;
                catchingFishPagingLibrary.CatchingFishParcelableFAB();
                CatchingFishBundleGlide CatchingFishReduxKtor = CatchingFishBundleGlide.CatchingFishReduxKtor(catchingFishPagingLibrary.CatchingFishParcelableFAB);
                try {
                    CatchingFishGsonAppCompat = this.CatchingFishCoroutine.CatchingFishGsonAppCompat();
                    int i = CatchingFishGsonAppCompat.CatchingFishSnackbar;
                    boolean z = true;
                    if (i != 2 && i != 1) {
                        z = false;
                    }
                    if (CatchingFishReduxKtor != null) {
                        CatchingFishReduxKtor.CatchingFishFragmentFactory();
                    }
                } catch (Throwable th) {
                    if (CatchingFishReduxKtor != null) {
                        CatchingFishReduxKtor.CatchingFishFragmentFactory();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        CatchingFishLayout(CatchingFishGsonAppCompat);
        this.CatchingFishLayout.execute(new CatchingFishOkHttpLayout(this, 2));
    }

    public final CatchingFishWorkManagerMVP CatchingFishReduxKtor() {
        CatchingFishDaggerWebsocket();
        CatchingFishAndroidXPayPal catchingFishAndroidXPayPal = new CatchingFishAndroidXPayPal();
        CatchingFishHiltWebSocket catchingFishHiltWebSocket = new CatchingFishHiltWebSocket(this.CatchingFishReduxKtor, catchingFishAndroidXPayPal);
        synchronized (this.CatchingFishViewModelScope) {
            this.CatchingFishEspressoTesting.add(catchingFishHiltWebSocket);
        }
        CatchingFishWorkManagerMVP catchingFishWorkManagerMVP = catchingFishAndroidXPayPal.CatchingFishParcelableFAB;
        this.CatchingFishViewModelFAB.execute(new CatchingFishOkHttpLayout(this, 1));
        return catchingFishWorkManagerMVP;
    }

    public final CatchingFishDaggerDataStore CatchingFishSnackbar(CatchingFishDaggerDataStore catchingFishDaggerDataStore) {
        int responseCode;
        CatchingFishExoPlayerMVVM CatchingFishWorkManager;
        CatchingFishCoroutineDagger catchingFishCoroutineDagger = this.CatchingFishSnackbar;
        com.google.firebase.CatchingFishPagingLibrary catchingFishPagingLibrary = this.CatchingFishParcelableFAB;
        catchingFishPagingLibrary.CatchingFishParcelableFAB();
        String str = catchingFishPagingLibrary.CatchingFishCoroutine.CatchingFishParcelableFAB;
        String str2 = catchingFishDaggerDataStore.CatchingFishParcelableFAB;
        com.google.firebase.CatchingFishPagingLibrary catchingFishPagingLibrary2 = this.CatchingFishParcelableFAB;
        catchingFishPagingLibrary2.CatchingFishParcelableFAB();
        String str3 = catchingFishPagingLibrary2.CatchingFishCoroutine.CatchingFishViewModelScope;
        String str4 = catchingFishDaggerDataStore.CatchingFishReduxKtor;
        CatchingFishJUnitMVI catchingFishJUnitMVI = catchingFishCoroutineDagger.CatchingFishCoroutine;
        if (!catchingFishJUnitMVI.CatchingFishParcelableFAB()) {
            throw new CatchingFishCardViewCameraX("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL CatchingFishParcelableFAB = CatchingFishCoroutineDagger.CatchingFishParcelableFAB("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
        for (int i = 0; i <= 1; i++) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection CatchingFishCoroutine = catchingFishCoroutineDagger.CatchingFishCoroutine(CatchingFishParcelableFAB, str);
            try {
                try {
                    CatchingFishCoroutine.setRequestMethod("POST");
                    CatchingFishCoroutine.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    CatchingFishCoroutine.setDoOutput(true);
                    CatchingFishCoroutineDagger.CatchingFishViewModelFAB(CatchingFishCoroutine);
                    responseCode = CatchingFishCoroutine.getResponseCode();
                    catchingFishJUnitMVI.CatchingFishSnackbar(responseCode);
                } finally {
                    CatchingFishCoroutine.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            } catch (IOException | AssertionError unused) {
            }
            if (responseCode >= 200 && responseCode < 300) {
                CatchingFishWorkManager = CatchingFishCoroutineDagger.CatchingFishWorkManager(CatchingFishCoroutine);
            } else {
                CatchingFishCoroutineDagger.CatchingFishSnackbar(CatchingFishCoroutine, null, str, str3);
                if (responseCode == 401 || responseCode == 404) {
                    CatchingFishGsonWebSocket CatchingFishParcelableFAB2 = CatchingFishExoPlayerMVVM.CatchingFishParcelableFAB();
                    CatchingFishParcelableFAB2.CatchingFishSnackbar = 3;
                    CatchingFishWorkManager = CatchingFishParcelableFAB2.CatchingFishSnackbar();
                } else {
                    if (responseCode == 429) {
                        throw new CatchingFishCardViewCameraX("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        CatchingFishGsonWebSocket CatchingFishParcelableFAB3 = CatchingFishExoPlayerMVVM.CatchingFishParcelableFAB();
                        CatchingFishParcelableFAB3.CatchingFishSnackbar = 2;
                        CatchingFishWorkManager = CatchingFishParcelableFAB3.CatchingFishSnackbar();
                    }
                }
            }
            int CatchingFishParcelableFlux = CatchingFishMVPLiveData.CatchingFishParcelableFlux(CatchingFishWorkManager.CatchingFishCoroutine);
            if (CatchingFishParcelableFlux != 0) {
                if (CatchingFishParcelableFlux == 1) {
                    CatchingFishKtorReduxBundle CatchingFishParcelableFAB4 = catchingFishDaggerDataStore.CatchingFishParcelableFAB();
                    CatchingFishParcelableFAB4.CatchingFishDaggerWebsocket = "BAD CONFIG";
                    CatchingFishParcelableFAB4.CatchingFishParcelableFAB = 5;
                    return CatchingFishParcelableFAB4.CatchingFishParcelableFAB();
                }
                if (CatchingFishParcelableFlux != 2) {
                    throw new CatchingFishCardViewCameraX("Firebase Installations Service is unavailable. Please try again later.");
                }
                synchronized (this) {
                    this.CatchingFishFragmentHandler = null;
                }
                CatchingFishKtorReduxBundle CatchingFishParcelableFAB5 = catchingFishDaggerDataStore.CatchingFishParcelableFAB();
                CatchingFishParcelableFAB5.CatchingFishParcelableFAB = 2;
                return CatchingFishParcelableFAB5.CatchingFishParcelableFAB();
            }
            String str5 = CatchingFishWorkManager.CatchingFishParcelableFAB;
            long j = CatchingFishWorkManager.CatchingFishSnackbar;
            CatchingFishMVIRoomMoshi catchingFishMVIRoomMoshi = this.CatchingFishReduxKtor;
            catchingFishMVIRoomMoshi.getClass();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            catchingFishMVIRoomMoshi.CatchingFishParcelableFAB.getClass();
            long seconds = timeUnit.toSeconds(System.currentTimeMillis());
            CatchingFishKtorReduxBundle CatchingFishParcelableFAB6 = catchingFishDaggerDataStore.CatchingFishParcelableFAB();
            CatchingFishParcelableFAB6.CatchingFishCoroutine = str5;
            CatchingFishParcelableFAB6.CatchingFishWorkManager = Long.valueOf(j);
            CatchingFishParcelableFAB6.CatchingFishViewModelScope = Long.valueOf(seconds);
            return CatchingFishParcelableFAB6.CatchingFishParcelableFAB();
        }
        throw new CatchingFishCardViewCameraX("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void CatchingFishViewModelFAB(Exception exc) {
        synchronized (this.CatchingFishViewModelScope) {
            try {
                Iterator it = this.CatchingFishEspressoTesting.iterator();
                while (it.hasNext()) {
                    if (((CatchingFishKtorCameraXView) it.next()).CatchingFishSnackbar(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.text.CatchingFishCoroutineDagger] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [kotlin.text.CatchingFishLiveDataIntent] */
    public final CatchingFishDaggerDataStore CatchingFishViewModelScope(CatchingFishDaggerDataStore catchingFishDaggerDataStore) {
        int responseCode;
        String str = catchingFishDaggerDataStore.CatchingFishParcelableFAB;
        String str2 = null;
        if (str != null && str.length() == 11) {
            CatchingFishOkHttpFragment catchingFishOkHttpFragment = (CatchingFishOkHttpFragment) this.CatchingFishDaggerWebsocket.get();
            synchronized (catchingFishOkHttpFragment.CatchingFishParcelableFAB) {
                try {
                    String[] strArr = CatchingFishOkHttpFragment.CatchingFishCoroutine;
                    int i = 0;
                    while (true) {
                        if (i < 4) {
                            String str3 = strArr[i];
                            String string = catchingFishOkHttpFragment.CatchingFishParcelableFAB.getString("|T|" + catchingFishOkHttpFragment.CatchingFishSnackbar + "|" + str3, null);
                            if (string == null || string.isEmpty()) {
                                i++;
                            } else if (string.startsWith("{")) {
                                try {
                                    str2 = new JSONObject(string).getString("token");
                                } catch (JSONException unused) {
                                }
                            } else {
                                str2 = string;
                            }
                        }
                    }
                } finally {
                }
            }
        }
        CatchingFishCoroutineDagger catchingFishCoroutineDagger = this.CatchingFishSnackbar;
        com.google.firebase.CatchingFishPagingLibrary catchingFishPagingLibrary = this.CatchingFishParcelableFAB;
        catchingFishPagingLibrary.CatchingFishParcelableFAB();
        String str4 = catchingFishPagingLibrary.CatchingFishCoroutine.CatchingFishParcelableFAB;
        String str5 = catchingFishDaggerDataStore.CatchingFishParcelableFAB;
        com.google.firebase.CatchingFishPagingLibrary catchingFishPagingLibrary2 = this.CatchingFishParcelableFAB;
        catchingFishPagingLibrary2.CatchingFishParcelableFAB();
        String str6 = catchingFishPagingLibrary2.CatchingFishCoroutine.CatchingFishViewModelScope;
        com.google.firebase.CatchingFishPagingLibrary catchingFishPagingLibrary3 = this.CatchingFishParcelableFAB;
        catchingFishPagingLibrary3.CatchingFishParcelableFAB();
        String str7 = catchingFishPagingLibrary3.CatchingFishCoroutine.CatchingFishSnackbar;
        CatchingFishJUnitMVI catchingFishJUnitMVI = catchingFishCoroutineDagger.CatchingFishCoroutine;
        if (!catchingFishJUnitMVI.CatchingFishParcelableFAB()) {
            throw new CatchingFishCardViewCameraX("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL CatchingFishParcelableFAB = CatchingFishCoroutineDagger.CatchingFishParcelableFAB("projects/" + str6 + "/installations");
        int i2 = 0;
        CatchingFishLiveDataIntent catchingFishLiveDataIntent = catchingFishCoroutineDagger;
        while (i2 <= 1) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection CatchingFishCoroutine = catchingFishLiveDataIntent.CatchingFishCoroutine(CatchingFishParcelableFAB, str4);
            try {
                try {
                    CatchingFishCoroutine.setRequestMethod("POST");
                    CatchingFishCoroutine.setDoOutput(true);
                    if (str2 != null) {
                        CatchingFishCoroutine.addRequestProperty("x-goog-fis-android-iid-migration-auth", str2);
                    }
                    CatchingFishCoroutineDagger.CatchingFishViewModelScope(CatchingFishCoroutine, str5, str7);
                    responseCode = CatchingFishCoroutine.getResponseCode();
                    catchingFishJUnitMVI.CatchingFishSnackbar(responseCode);
                } catch (IOException | AssertionError unused2) {
                }
                if (responseCode >= 200 && responseCode < 300) {
                    CatchingFishLiveDataIntent CatchingFishDaggerWebsocket = CatchingFishCoroutineDagger.CatchingFishDaggerWebsocket(CatchingFishCoroutine);
                    CatchingFishCoroutine.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    catchingFishLiveDataIntent = CatchingFishDaggerWebsocket;
                } else {
                    try {
                        CatchingFishCoroutineDagger.CatchingFishSnackbar(CatchingFishCoroutine, str7, str4, str6);
                    } catch (IOException | AssertionError unused3) {
                        CatchingFishCoroutine.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        i2++;
                        catchingFishLiveDataIntent = catchingFishLiveDataIntent;
                    }
                    if (responseCode == 429) {
                        throw new CatchingFishCardViewCameraX("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        CatchingFishLiveDataIntent catchingFishLiveDataIntent2 = new CatchingFishLiveDataIntent(null, null, null, null, 2);
                        CatchingFishCoroutine.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        catchingFishLiveDataIntent = catchingFishLiveDataIntent2;
                    } else {
                        CatchingFishCoroutine.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        i2++;
                        catchingFishLiveDataIntent = catchingFishLiveDataIntent;
                    }
                }
                int CatchingFishParcelableFlux = CatchingFishMVPLiveData.CatchingFishParcelableFlux(catchingFishLiveDataIntent.CatchingFishDaggerWebsocket);
                if (CatchingFishParcelableFlux != 0) {
                    if (CatchingFishParcelableFlux != 1) {
                        throw new CatchingFishCardViewCameraX("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    CatchingFishKtorReduxBundle CatchingFishParcelableFAB2 = catchingFishDaggerDataStore.CatchingFishParcelableFAB();
                    CatchingFishParcelableFAB2.CatchingFishDaggerWebsocket = "BAD CONFIG";
                    CatchingFishParcelableFAB2.CatchingFishParcelableFAB = 5;
                    return CatchingFishParcelableFAB2.CatchingFishParcelableFAB();
                }
                String str8 = catchingFishLiveDataIntent.CatchingFishSnackbar;
                String str9 = catchingFishLiveDataIntent.CatchingFishCoroutine;
                CatchingFishMVIRoomMoshi catchingFishMVIRoomMoshi = this.CatchingFishReduxKtor;
                catchingFishMVIRoomMoshi.getClass();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                catchingFishMVIRoomMoshi.CatchingFishParcelableFAB.getClass();
                long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                CatchingFishExoPlayerMVVM catchingFishExoPlayerMVVM = catchingFishLiveDataIntent.CatchingFishReduxKtor;
                String str10 = catchingFishExoPlayerMVVM.CatchingFishParcelableFAB;
                long j = catchingFishExoPlayerMVVM.CatchingFishSnackbar;
                CatchingFishKtorReduxBundle CatchingFishParcelableFAB3 = catchingFishDaggerDataStore.CatchingFishParcelableFAB();
                CatchingFishParcelableFAB3.CatchingFishSnackbar = str8;
                CatchingFishParcelableFAB3.CatchingFishParcelableFAB = 4;
                CatchingFishParcelableFAB3.CatchingFishCoroutine = str10;
                CatchingFishParcelableFAB3.CatchingFishReduxKtor = str9;
                CatchingFishParcelableFAB3.CatchingFishWorkManager = Long.valueOf(j);
                CatchingFishParcelableFAB3.CatchingFishViewModelScope = Long.valueOf(seconds);
                return CatchingFishParcelableFAB3.CatchingFishParcelableFAB();
            } finally {
                CatchingFishCoroutine.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
        }
        throw new CatchingFishCardViewCameraX("Firebase Installations Service is unavailable. Please try again later.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if ("[DEFAULT]".equals(r0.CatchingFishSnackbar) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String CatchingFishWorkManager(CatchingFishDaggerDataStore catchingFishDaggerDataStore) {
        String string;
        com.google.firebase.CatchingFishPagingLibrary catchingFishPagingLibrary = this.CatchingFishParcelableFAB;
        catchingFishPagingLibrary.CatchingFishParcelableFAB();
        if (!catchingFishPagingLibrary.CatchingFishSnackbar.equals("CHIME_ANDROID_SDK")) {
            com.google.firebase.CatchingFishPagingLibrary catchingFishPagingLibrary2 = this.CatchingFishParcelableFAB;
            catchingFishPagingLibrary2.CatchingFishParcelableFAB();
        }
        if (catchingFishDaggerDataStore.CatchingFishSnackbar == 1) {
            CatchingFishOkHttpFragment catchingFishOkHttpFragment = (CatchingFishOkHttpFragment) this.CatchingFishDaggerWebsocket.get();
            synchronized (catchingFishOkHttpFragment.CatchingFishParcelableFAB) {
                try {
                    synchronized (catchingFishOkHttpFragment.CatchingFishParcelableFAB) {
                        string = catchingFishOkHttpFragment.CatchingFishParcelableFAB.getString("|S|id", null);
                    }
                    if (string == null) {
                        string = catchingFishOkHttpFragment.CatchingFishParcelableFAB();
                    }
                } finally {
                }
            }
            if (!TextUtils.isEmpty(string)) {
                return string;
            }
            this.CatchingFishWorkManager.getClass();
            return CatchingFishHiltJUnitMockk.CatchingFishParcelableFAB();
        }
        this.CatchingFishWorkManager.getClass();
        return CatchingFishHiltJUnitMockk.CatchingFishParcelableFAB();
    }
}
