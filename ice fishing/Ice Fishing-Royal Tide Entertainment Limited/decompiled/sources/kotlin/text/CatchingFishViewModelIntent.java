package kotlin.text;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.graphics.Insets;
import android.net.Uri;
import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsetsAnimation;
import com.adjust.sdk.Constants;
import com.android.installreferrer.api.InstallReferrerClient;
import com.catchingfish.fishcatcherpro.R;
import com.catchingfish.fishcatcherpro.presentation.launch.MainActivity;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import com.google.android.gms.common.api.Status;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.InvocationTargetException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.regex.Matcher;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class CatchingFishViewModelIntent implements CatchingFishMVIGoogleMaps, CatchingFishViewRobolectric, CatchingFishBundleFABJUnit, CatchingFishLiveDataDagger, CatchingFishFragmentFAB {
    public Object CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;
    public Object CatchingFishWorkManager;

    public /* synthetic */ CatchingFishViewModelIntent(int i, Object obj) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishWorkManager = obj;
    }

    public static void CatchingFishViewModelScope(CatchingFishBiometricRoom catchingFishBiometricRoom) {
        if (catchingFishBiometricRoom.CatchingFishMotionLayout > 0) {
            if (catchingFishBiometricRoom.CatchingFishPayPalService.CatchingFishCoroutine == CatchingFishFirebasePicasso.CatchingFishViewModelFAB && !catchingFishBiometricRoom.CatchingFishEspressoTesting() && !catchingFishBiometricRoom.CatchingFishOkHttp() && !catchingFishBiometricRoom.CatchingFishLayoutInflater && catchingFishBiometricRoom.CatchingFishFragmentFactory()) {
                CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB = (CatchingFishFABStripeAPIFAB) catchingFishBiometricRoom.CatchingFishJobScheduler.CatchingFishFragmentHandler;
                if ((catchingFishFABStripeAPIFAB.CatchingFishViewModelScope & 256) != 0) {
                    while (catchingFishFABStripeAPIFAB != null) {
                        if ((catchingFishFABStripeAPIFAB.CatchingFishWorkManager & 256) != 0) {
                            for (Object obj = catchingFishFABStripeAPIFAB; obj != null; obj = null) {
                                if (obj instanceof CatchingFishMVVMDagger) {
                                    CatchingFishMVVMDagger catchingFishMVVMDagger = (CatchingFishMVVMDagger) obj;
                                    catchingFishMVVMDagger.CatchingFishOkHttp(CatchingFishXMLLayoutGlide.CatchingFishMutableLiveData(catchingFishMVVMDagger, 256));
                                }
                            }
                        }
                        if ((catchingFishFABStripeAPIFAB.CatchingFishViewModelScope & 256) == 0) {
                            break;
                        } else {
                            catchingFishFABStripeAPIFAB = catchingFishFABStripeAPIFAB.CatchingFishLayout;
                        }
                    }
                }
            }
            catchingFishBiometricRoom.CatchingFishGradleManifest = false;
            CatchingFishFABToast CatchingFishCoroutineFlow = catchingFishBiometricRoom.CatchingFishCoroutineFlow();
            Object[] objArr = CatchingFishCoroutineFlow.CatchingFishReduxKtor;
            int i = CatchingFishCoroutineFlow.CatchingFishWorkManager;
            for (int i2 = 0; i2 < i; i2++) {
                CatchingFishViewModelScope((CatchingFishBiometricRoom) objArr[i2]);
            }
        }
    }

    public void CatchingFish(int i, int i2) {
        int[] iArr = (int[]) this.CatchingFishDaggerWebsocket;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        CatchingFishViewModelFAB(i3);
        int[] iArr2 = (int[]) this.CatchingFishDaggerWebsocket;
        System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
        Arrays.fill((int[]) this.CatchingFishDaggerWebsocket, i, i3, -1);
        ArrayList arrayList = (ArrayList) this.CatchingFishWorkManager;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            CatchingFishMVVMAdMob catchingFishMVVMAdMob = (CatchingFishMVVMAdMob) ((ArrayList) this.CatchingFishWorkManager).get(size);
            int i4 = catchingFishMVVMAdMob.CatchingFishReduxKtor;
            if (i4 >= i) {
                catchingFishMVVMAdMob.CatchingFishReduxKtor = i4 + i2;
            }
        }
    }

    public void CatchingFishAnimationMockk(CatchingFishDaggerDataStore catchingFishDaggerDataStore) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", catchingFishDaggerDataStore.CatchingFishParcelableFAB);
            jSONObject.put("Status", CatchingFishMVPLiveData.CatchingFishParcelableFlux(catchingFishDaggerDataStore.CatchingFishSnackbar));
            jSONObject.put("AuthToken", catchingFishDaggerDataStore.CatchingFishCoroutine);
            jSONObject.put("RefreshToken", catchingFishDaggerDataStore.CatchingFishReduxKtor);
            jSONObject.put("TokenCreationEpochInSecs", catchingFishDaggerDataStore.CatchingFishWorkManager);
            jSONObject.put("ExpiresInSecs", catchingFishDaggerDataStore.CatchingFishDaggerWebsocket);
            jSONObject.put("FisError", catchingFishDaggerDataStore.CatchingFishViewModelScope);
            com.google.firebase.CatchingFishPagingLibrary catchingFishPagingLibrary = (com.google.firebase.CatchingFishPagingLibrary) this.CatchingFishWorkManager;
            catchingFishPagingLibrary.CatchingFishParcelableFAB();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", catchingFishPagingLibrary.CatchingFishParcelableFAB.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes(Constants.ENCODING));
            fileOutputStream.close();
            if (createTempFile.renameTo(CatchingFishCloudMessaging())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public void CatchingFishCardViewRealm(String str, CatchingFishFluxContext catchingFishFluxContext) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishFluxContext, "provider");
        CatchingFishMoshiBundle catchingFishMoshiBundle = (CatchingFishMoshiBundle) this.CatchingFishDaggerWebsocket;
        synchronized (catchingFishMoshiBundle.CatchingFishCoroutine) {
            if (catchingFishMoshiBundle.CatchingFishReduxKtor.containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            catchingFishMoshiBundle.CatchingFishReduxKtor.put(str, catchingFishFluxContext);
        }
    }

    public void CatchingFishCardViewView(CatchingFishPayPalCardView catchingFishPayPalCardView) {
        CatchingFishLayoutMVVMFlux catchingFishLayoutMVVMFlux = (CatchingFishLayoutMVVMFlux) this.CatchingFishWorkManager;
        int CatchingFishViewModelScope = catchingFishLayoutMVVMFlux.CatchingFishViewModelScope() - 1;
        while (true) {
            if (CatchingFishViewModelScope < 0) {
                break;
            }
            if (catchingFishPayPalCardView == catchingFishLayoutMVVMFlux.CatchingFishViewModelFAB(CatchingFishViewModelScope)) {
                Object[] objArr = catchingFishLayoutMVVMFlux.CatchingFishWorkManager;
                Object obj = objArr[CatchingFishViewModelScope];
                Object obj2 = CatchingFishBiometricBundle.CatchingFishWorkManager;
                if (obj != obj2) {
                    objArr[CatchingFishViewModelScope] = obj2;
                    catchingFishLayoutMVVMFlux.CatchingFishReduxKtor = true;
                }
            } else {
                CatchingFishViewModelScope--;
            }
        }
        CatchingFishMoshiAndroidX catchingFishMoshiAndroidX = (CatchingFishMoshiAndroidX) ((CatchingFishGraphQLRealmFAB) this.CatchingFishDaggerWebsocket).remove(catchingFishPayPalCardView);
        if (catchingFishMoshiAndroidX != null) {
            catchingFishMoshiAndroidX.CatchingFishParcelableFAB = 0;
            catchingFishMoshiAndroidX.CatchingFishSnackbar = null;
            catchingFishMoshiAndroidX.CatchingFishCoroutine = null;
            CatchingFishMoshiAndroidX.CatchingFishReduxKtor.CatchingFishCoroutine(catchingFishMoshiAndroidX);
        }
    }

    public File CatchingFishCloudMessaging() {
        if (((File) this.CatchingFishDaggerWebsocket) == null) {
            synchronized (this) {
                try {
                    if (((File) this.CatchingFishDaggerWebsocket) == null) {
                        com.google.firebase.CatchingFishPagingLibrary catchingFishPagingLibrary = (com.google.firebase.CatchingFishPagingLibrary) this.CatchingFishWorkManager;
                        catchingFishPagingLibrary.CatchingFishParcelableFAB();
                        this.CatchingFishDaggerWebsocket = new File(catchingFishPagingLibrary.CatchingFishParcelableFAB.getFilesDir(), "PersistedInstallation." + ((com.google.firebase.CatchingFishPagingLibrary) this.CatchingFishWorkManager).CatchingFishCoroutine() + ".json");
                    }
                } finally {
                }
            }
        }
        return (File) this.CatchingFishDaggerWebsocket;
    }

    public void CatchingFishCoroutine(CatchingFishPayPalCardView catchingFishPayPalCardView, CatchingFishToastCoroutine catchingFishToastCoroutine) {
        CatchingFishGraphQLRealmFAB catchingFishGraphQLRealmFAB = (CatchingFishGraphQLRealmFAB) this.CatchingFishDaggerWebsocket;
        CatchingFishMoshiAndroidX catchingFishMoshiAndroidX = (CatchingFishMoshiAndroidX) catchingFishGraphQLRealmFAB.get(catchingFishPayPalCardView);
        if (catchingFishMoshiAndroidX == null) {
            catchingFishMoshiAndroidX = CatchingFishMoshiAndroidX.CatchingFishParcelableFAB();
            catchingFishGraphQLRealmFAB.put(catchingFishPayPalCardView, catchingFishMoshiAndroidX);
        }
        catchingFishMoshiAndroidX.CatchingFishCoroutine = catchingFishToastCoroutine;
        catchingFishMoshiAndroidX.CatchingFishParcelableFAB |= 8;
    }

    public void CatchingFishCoroutineFlow(CatchingFishLayoutRedux catchingFishLayoutRedux) {
        CatchingFishWidgetMVVMAdMob catchingFishWidgetMVVMAdMob = (CatchingFishWidgetMVVMAdMob) this.CatchingFishWorkManager;
        CatchingFishWidgetContext.CatchingFishUnitTesting.getClass();
        CatchingFishFluxFluxBundle catchingFishFluxFluxBundle = catchingFishLayoutRedux.CatchingFishStateLiveData;
        try {
            catchingFishWidgetMVVMAdMob.CatchingFishParcelableFAB(catchingFishLayoutRedux, catchingFishFluxFluxBundle);
            CatchingFishDaggerHiltRedux catchingFishDaggerHiltRedux = (CatchingFishDaggerHiltRedux) catchingFishFluxFluxBundle.CatchingFishReduxKtor;
            if (catchingFishDaggerHiltRedux.CatchingFishUnitTesting) {
                throw new IllegalStateException();
            }
            catchingFishDaggerHiltRedux.CatchingFishUnitTesting = true;
            catchingFishDaggerHiltRedux.CatchingFishDaggerWebsocket.CatchingFishFragmentHandler();
            CatchingFishAdMobGson CatchingFishViewModelFAB = ((CatchingFishFragmentFlux) catchingFishFluxFluxBundle.CatchingFishViewModelScope).CatchingFishViewModelFAB();
            CatchingFishViewModelFAB.CatchingFishDaggerWebsocket.setSoTimeout(0);
            CatchingFishViewModelFAB.CatchingFishViewModelFAB();
            try {
                catchingFishWidgetMVVMAdMob.CatchingFishReduxKtor("OkHttp WebSocket " + ((CatchingFishReduxBundleMVP) this.CatchingFishDaggerWebsocket).CatchingFishParcelableFAB.CatchingFishCloudMessaging(), new CatchingFishFirebaseLayout(CatchingFishViewModelFAB.CatchingFishLayout, CatchingFishViewModelFAB.CatchingFishFragmentHandler, catchingFishFluxFluxBundle));
                catchingFishWidgetMVVMAdMob.CatchingFishSnackbar.CatchingFishCardViewRealm(catchingFishWidgetMVVMAdMob, catchingFishLayoutRedux);
                catchingFishWidgetMVVMAdMob.CatchingFishDaggerWebsocket();
            } catch (Exception e) {
                catchingFishWidgetMVVMAdMob.CatchingFishCoroutine(e);
            }
        } catch (IOException e2) {
            if (catchingFishFluxFluxBundle != null) {
                catchingFishFluxFluxBundle.CatchingFishReduxKtor(true, true, null);
            }
            catchingFishWidgetMVVMAdMob.CatchingFishCoroutine(e2);
            CatchingFishEspressoDagger.CatchingFishSnackbar(catchingFishLayoutRedux);
        }
    }

    public void CatchingFishCustomView(CatchingFishHiltAdMobView catchingFishHiltAdMobView) {
        Object CatchingFishViewModelScope = ((CatchingFishPayPalService) this.CatchingFishWorkManager).CatchingFishViewModelScope(catchingFishHiltAdMobView);
        if (CatchingFishViewModelScope != null) {
            if (!(CatchingFishViewModelScope instanceof CatchingFishBundleGradle)) {
                throw new ClassCastException();
            }
            CatchingFishBundleGradle catchingFishBundleGradle = (CatchingFishBundleGradle) CatchingFishViewModelScope;
            Object[] objArr = catchingFishBundleGradle.CatchingFishParcelableFAB;
            if (catchingFishBundleGradle.CatchingFishSnackbar <= 0) {
                return;
            }
            CatchingFishFirebaseDagger.CatchingFishStateLiveData(objArr[0], "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
            throw new ClassCastException();
        }
    }

    public void CatchingFishDaggerHiltFAB(Bundle bundle) {
        CatchingFishMoshiBundle catchingFishMoshiBundle = (CatchingFishMoshiBundle) this.CatchingFishDaggerWebsocket;
        CatchingFishJUnitLiveData catchingFishJUnitLiveData = catchingFishMoshiBundle.CatchingFishParcelableFAB;
        if (!catchingFishMoshiBundle.CatchingFishDaggerWebsocket) {
            catchingFishMoshiBundle.CatchingFishParcelableFAB();
        }
        if (catchingFishJUnitLiveData.CatchingFishDaggerWebsocket().CatchingFishReduxKtor.compareTo(CatchingFishMockkFirebase.CatchingFishViewModelScope) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + catchingFishJUnitLiveData.CatchingFishDaggerWebsocket().CatchingFishReduxKtor).toString());
        }
        if (catchingFishMoshiBundle.CatchingFishViewModelScope) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        Bundle bundle2 = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            bundle2 = CatchingFishKtorViewModel.CatchingFishAnimationMockk("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
        }
        catchingFishMoshiBundle.CatchingFishWorkManager = bundle2;
        catchingFishMoshiBundle.CatchingFishViewModelScope = true;
    }

    public Bundle CatchingFishDaggerWebsocket(String str) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(str, "key");
        CatchingFishMoshiBundle catchingFishMoshiBundle = (CatchingFishMoshiBundle) this.CatchingFishDaggerWebsocket;
        if (!catchingFishMoshiBundle.CatchingFishViewModelScope) {
            throw new IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
        }
        Bundle bundle = catchingFishMoshiBundle.CatchingFishWorkManager;
        if (bundle == null) {
            return null;
        }
        Bundle CatchingFishAnimationMockk = bundle.containsKey(str) ? CatchingFishKtorViewModel.CatchingFishAnimationMockk(str, bundle) : null;
        bundle.remove(str);
        if (bundle.isEmpty()) {
            catchingFishMoshiBundle.CatchingFishWorkManager = null;
        }
        return CatchingFishAnimationMockk;
    }

    public CatchingFishFluxContext CatchingFishEspressoTesting() {
        CatchingFishFluxContext catchingFishFluxContext;
        CatchingFishMoshiBundle catchingFishMoshiBundle = (CatchingFishMoshiBundle) this.CatchingFishDaggerWebsocket;
        synchronized (catchingFishMoshiBundle.CatchingFishCoroutine) {
            Iterator it = catchingFishMoshiBundle.CatchingFishReduxKtor.entrySet().iterator();
            do {
                catchingFishFluxContext = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                CatchingFishFluxContext catchingFishFluxContext2 = (CatchingFishFluxContext) entry.getValue();
                if (CatchingFishFirebaseDagger.CatchingFishOkHttp(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                    catchingFishFluxContext = catchingFishFluxContext2;
                }
            } while (catchingFishFluxContext == null);
        }
        return catchingFishFluxContext;
    }

    public int CatchingFishFragmentFactory(Context context, CatchingFishMVPUnitTesting catchingFishMVPUnitTesting) {
        int i;
        int i2;
        CatchingFishToastHiltBundle.CatchingFishAnimationMockk(context);
        CatchingFishToastHiltBundle.CatchingFishAnimationMockk(catchingFishMVPUnitTesting);
        int CatchingFishParcelableFAB = catchingFishMVPUnitTesting.CatchingFishParcelableFAB();
        SparseIntArray sparseIntArray = (SparseIntArray) this.CatchingFishDaggerWebsocket;
        synchronized (sparseIntArray) {
            i = sparseIntArray.get(CatchingFishParcelableFAB, -1);
        }
        if (i != -1) {
            return i;
        }
        SparseIntArray sparseIntArray2 = (SparseIntArray) this.CatchingFishDaggerWebsocket;
        synchronized (sparseIntArray2) {
            i2 = 0;
            int i3 = 0;
            while (true) {
                try {
                    if (i3 >= sparseIntArray2.size()) {
                        i2 = -1;
                        break;
                    }
                    int keyAt = sparseIntArray2.keyAt(i3);
                    if (keyAt > CatchingFishParcelableFAB && sparseIntArray2.get(keyAt) == 0) {
                        break;
                    }
                    i3++;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (i2 == -1) {
                i2 = ((CatchingFishAdMobAdMob) this.CatchingFishWorkManager).CatchingFishSnackbar(context, CatchingFishParcelableFAB);
            }
            sparseIntArray2.put(CatchingFishParcelableFAB, i2);
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CctBackendFactory CatchingFishFragmentHandler(String str) {
        Bundle bundle;
        Map map;
        PackageManager packageManager;
        ServiceInfo serviceInfo;
        if (((Map) this.CatchingFishWorkManager) == null) {
            Context context = (Context) this.CatchingFishDaggerWebsocket;
            try {
                packageManager = context.getPackageManager();
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128)) != null) {
                bundle = serviceInfo.metaData;
                if (bundle != null) {
                    map = Collections.EMPTY_MAP;
                } else {
                    HashMap hashMap = new HashMap();
                    for (String str2 : bundle.keySet()) {
                        Object obj = bundle.get(str2);
                        if ((obj instanceof String) && str2.startsWith("backend:")) {
                            for (String str3 : ((String) obj).split(",", -1)) {
                                String trim = str3.trim();
                                if (!trim.isEmpty()) {
                                    hashMap.put(trim, str2.substring(8));
                                }
                            }
                        }
                    }
                    map = hashMap;
                }
                this.CatchingFishWorkManager = map;
            }
            bundle = null;
            if (bundle != null) {
            }
            this.CatchingFishWorkManager = map;
        }
        String str4 = (String) ((Map) this.CatchingFishWorkManager).get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException unused2) {
            StringBuilder sb = new StringBuilder("Class ");
            sb.append(str4);
            sb.append(" is not found.");
            return null;
        } catch (IllegalAccessException unused3) {
            StringBuilder sb2 = new StringBuilder("Could not instantiate ");
            sb2.append(str4);
            sb2.append(".");
            return null;
        } catch (InstantiationException unused4) {
            StringBuilder sb3 = new StringBuilder("Could not instantiate ");
            sb3.append(str4);
            sb3.append(".");
            return null;
        } catch (NoSuchMethodException unused5) {
            "Could not instantiate ".concat(str4);
            return null;
        } catch (InvocationTargetException unused6) {
            "Could not instantiate ".concat(str4);
            return null;
        }
    }

    public CatchingFishDaggerDataStore CatchingFishGsonAppCompat() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(CatchingFishCloudMessaging());
            while (true) {
                try {
                    int read = fileInputStream.read(bArr, 0, 16384);
                    if (read < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } finally {
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String optString = jSONObject.optString("Fid", null);
        int optInt = jSONObject.optInt("Status", 0);
        String optString2 = jSONObject.optString("AuthToken", null);
        String optString3 = jSONObject.optString("RefreshToken", null);
        long optLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String optString4 = jSONObject.optString("FisError", null);
        int i = CatchingFishMVPLiveData.CatchingFishGsonAppCompat(5)[optInt];
        if (i == 0) {
            throw new NullPointerException("Null registrationStatus");
        }
        String str = i == 0 ? " registrationStatus" : "";
        if (str.isEmpty()) {
            return new CatchingFishDaggerDataStore(optString, i, optString2, optString3, optLong2, optLong, optString4);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public void CatchingFishJetpackCompose(int i, int i2) {
        int[] iArr = (int[]) this.CatchingFishDaggerWebsocket;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        CatchingFishViewModelFAB(i3);
        int[] iArr2 = (int[]) this.CatchingFishDaggerWebsocket;
        System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
        int[] iArr3 = (int[]) this.CatchingFishDaggerWebsocket;
        Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.CatchingFishWorkManager;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            CatchingFishMVVMAdMob catchingFishMVVMAdMob = (CatchingFishMVVMAdMob) ((ArrayList) this.CatchingFishWorkManager).get(size);
            int i4 = catchingFishMVVMAdMob.CatchingFishReduxKtor;
            if (i4 >= i) {
                if (i4 < i3) {
                    ((ArrayList) this.CatchingFishWorkManager).remove(size);
                } else {
                    catchingFishMVVMAdMob.CatchingFishReduxKtor = i4 - i2;
                }
            }
        }
    }

    public View CatchingFishLayout(int i, int i2, int i3, int i4) {
        View CatchingFishCoroutineFlow;
        CatchingFishFluxStripeAPI catchingFishFluxStripeAPI = (CatchingFishFluxStripeAPI) this.CatchingFishWorkManager;
        CatchingFishRealmSnackbar catchingFishRealmSnackbar = (CatchingFishRealmSnackbar) this.CatchingFishDaggerWebsocket;
        int CatchingFishReduxKtor = catchingFishRealmSnackbar.CatchingFishReduxKtor();
        int CatchingFishCoroutine = catchingFishRealmSnackbar.CatchingFishCoroutine();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            switch (catchingFishRealmSnackbar.CatchingFishParcelableFAB) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    CatchingFishCoroutineFlow = catchingFishRealmSnackbar.CatchingFishSnackbar.CatchingFishCoroutineFlow(i);
                    break;
                default:
                    CatchingFishCoroutineFlow = catchingFishRealmSnackbar.CatchingFishSnackbar.CatchingFishCoroutineFlow(i);
                    break;
            }
            int CatchingFishSnackbar = catchingFishRealmSnackbar.CatchingFishSnackbar(CatchingFishCoroutineFlow);
            int CatchingFishParcelableFAB = catchingFishRealmSnackbar.CatchingFishParcelableFAB(CatchingFishCoroutineFlow);
            catchingFishFluxStripeAPI.CatchingFishSnackbar = CatchingFishReduxKtor;
            catchingFishFluxStripeAPI.CatchingFishCoroutine = CatchingFishCoroutine;
            catchingFishFluxStripeAPI.CatchingFishReduxKtor = CatchingFishSnackbar;
            catchingFishFluxStripeAPI.CatchingFishDaggerWebsocket = CatchingFishParcelableFAB;
            if (i3 != 0) {
                catchingFishFluxStripeAPI.CatchingFishParcelableFAB = i3;
                if (catchingFishFluxStripeAPI.CatchingFishParcelableFAB()) {
                    return CatchingFishCoroutineFlow;
                }
            }
            if (i4 != 0) {
                catchingFishFluxStripeAPI.CatchingFishParcelableFAB = i4;
                if (catchingFishFluxStripeAPI.CatchingFishParcelableFAB()) {
                    view = CatchingFishCoroutineFlow;
                }
            }
            i += i5;
        }
        return view;
    }

    public void CatchingFishMVPRobolectric() {
        if (!((CatchingFishMoshiBundle) this.CatchingFishDaggerWebsocket).CatchingFishViewModelFAB) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        CatchingFishPayPalWebsocket catchingFishPayPalWebsocket = (CatchingFishPayPalWebsocket) this.CatchingFishWorkManager;
        if (catchingFishPayPalWebsocket == null) {
            catchingFishPayPalWebsocket = new CatchingFishPayPalWebsocket(this);
        }
        this.CatchingFishWorkManager = catchingFishPayPalWebsocket;
        try {
            CatchingFishHiltGradle.class.getDeclaredConstructor(null);
            CatchingFishPayPalWebsocket catchingFishPayPalWebsocket2 = (CatchingFishPayPalWebsocket) this.CatchingFishWorkManager;
            if (catchingFishPayPalWebsocket2 != null) {
                ((LinkedHashSet) catchingFishPayPalWebsocket2.CatchingFishSnackbar).add(CatchingFishHiltGradle.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + CatchingFishHiltGradle.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }

    public void CatchingFishMutableLiveData(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        Map map = (Map) this.CatchingFishWorkManager;
        synchronized (map) {
            hashMap = new HashMap(map);
        }
        Map map2 = (Map) this.CatchingFishDaggerWebsocket;
        synchronized (map2) {
            hashMap2 = new HashMap(map2);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                entry.getKey().getClass();
                throw new ClassCastException();
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((CatchingFishAndroidXPayPal) entry2.getKey()).CatchingFishSnackbar(new CatchingFishSnackbarIntent(status));
            }
        }
    }

    public boolean CatchingFishNavigation(View view) {
        CatchingFishFluxStripeAPI catchingFishFluxStripeAPI = (CatchingFishFluxStripeAPI) this.CatchingFishWorkManager;
        CatchingFishRealmSnackbar catchingFishRealmSnackbar = (CatchingFishRealmSnackbar) this.CatchingFishDaggerWebsocket;
        int CatchingFishReduxKtor = catchingFishRealmSnackbar.CatchingFishReduxKtor();
        int CatchingFishCoroutine = catchingFishRealmSnackbar.CatchingFishCoroutine();
        int CatchingFishSnackbar = catchingFishRealmSnackbar.CatchingFishSnackbar(view);
        int CatchingFishParcelableFAB = catchingFishRealmSnackbar.CatchingFishParcelableFAB(view);
        catchingFishFluxStripeAPI.CatchingFishSnackbar = CatchingFishReduxKtor;
        catchingFishFluxStripeAPI.CatchingFishCoroutine = CatchingFishCoroutine;
        catchingFishFluxStripeAPI.CatchingFishReduxKtor = CatchingFishSnackbar;
        catchingFishFluxStripeAPI.CatchingFishDaggerWebsocket = CatchingFishParcelableFAB;
        catchingFishFluxStripeAPI.CatchingFishParcelableFAB = 24579;
        return catchingFishFluxStripeAPI.CatchingFishParcelableFAB();
    }

    public String CatchingFishOkHttp(String str) {
        String str2 = (String) this.CatchingFishWorkManager;
        Resources resources = (Resources) this.CatchingFishDaggerWebsocket;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    @Override // kotlin.text.CatchingFishBundleFABJUnit
    public Object CatchingFishParcelableFAB(Object obj) {
        return ((CatchingFishMockkView) this.CatchingFishDaggerWebsocket).CatchingFishDaggerWebsocket(null, obj);
    }

    public CatchingFishToastCoroutine CatchingFishParcelableFlux(CatchingFishPayPalCardView catchingFishPayPalCardView, int i) {
        CatchingFishMoshiAndroidX catchingFishMoshiAndroidX;
        CatchingFishToastCoroutine catchingFishToastCoroutine;
        CatchingFishGraphQLRealmFAB catchingFishGraphQLRealmFAB = (CatchingFishGraphQLRealmFAB) this.CatchingFishDaggerWebsocket;
        int CatchingFishReduxKtor = catchingFishGraphQLRealmFAB.CatchingFishReduxKtor(catchingFishPayPalCardView);
        if (CatchingFishReduxKtor >= 0 && (catchingFishMoshiAndroidX = (CatchingFishMoshiAndroidX) catchingFishGraphQLRealmFAB.CatchingFishLayout(CatchingFishReduxKtor)) != null) {
            int i2 = catchingFishMoshiAndroidX.CatchingFishParcelableFAB;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                catchingFishMoshiAndroidX.CatchingFishParcelableFAB = i3;
                if (i == 4) {
                    catchingFishToastCoroutine = catchingFishMoshiAndroidX.CatchingFishSnackbar;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    catchingFishToastCoroutine = catchingFishMoshiAndroidX.CatchingFishCoroutine;
                }
                if ((i3 & 12) == 0) {
                    catchingFishGraphQLRealmFAB.CatchingFishViewModelScope(CatchingFishReduxKtor);
                    catchingFishMoshiAndroidX.CatchingFishParcelableFAB = 0;
                    catchingFishMoshiAndroidX.CatchingFishSnackbar = null;
                    catchingFishMoshiAndroidX.CatchingFishCoroutine = null;
                    CatchingFishMoshiAndroidX.CatchingFishReduxKtor.CatchingFishCoroutine(catchingFishMoshiAndroidX);
                }
                return catchingFishToastCoroutine;
            }
        }
        return null;
    }

    public void CatchingFishPayPal(CatchingFishPayPalCardView catchingFishPayPalCardView) {
        CatchingFishMoshiAndroidX catchingFishMoshiAndroidX = (CatchingFishMoshiAndroidX) ((CatchingFishGraphQLRealmFAB) this.CatchingFishDaggerWebsocket).get(catchingFishPayPalCardView);
        if (catchingFishMoshiAndroidX == null) {
            return;
        }
        catchingFishMoshiAndroidX.CatchingFishParcelableFAB &= -2;
    }

    public void CatchingFishReduxKtor() {
        int[] iArr = (int[]) this.CatchingFishDaggerWebsocket;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.CatchingFishWorkManager = null;
    }

    @Override // kotlin.text.CatchingFishFragmentFAB
    public void CatchingFishRoomDatabase(CatchingFishWorkManagerMVP catchingFishWorkManagerMVP) {
        ((Map) ((CatchingFishViewModelIntent) this.CatchingFishWorkManager).CatchingFishDaggerWebsocket).remove((CatchingFishAndroidXPayPal) this.CatchingFishDaggerWebsocket);
    }

    public void CatchingFishSnackbar(Object obj, String str) {
        int length = str.length();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(length + 1 + valueOf.length());
        sb.append(str);
        sb.append("=");
        sb.append(valueOf);
        ((ArrayList) this.CatchingFishDaggerWebsocket).add(sb.toString());
    }

    public void CatchingFishSpannableWidget(Bundle bundle) {
        CatchingFishMoshiBundle catchingFishMoshiBundle = (CatchingFishMoshiBundle) this.CatchingFishDaggerWebsocket;
        Bundle CatchingFishFragmentHandler = CatchingFishGsonCardView.CatchingFishFragmentHandler((CatchingFishGsonWorkManager[]) Arrays.copyOf(new CatchingFishGsonWorkManager[0], 0));
        Bundle bundle2 = catchingFishMoshiBundle.CatchingFishWorkManager;
        if (bundle2 != null) {
            CatchingFishFragmentHandler.putAll(bundle2);
        }
        synchronized (catchingFishMoshiBundle.CatchingFishCoroutine) {
            for (Map.Entry entry : catchingFishMoshiBundle.CatchingFishReduxKtor.entrySet()) {
                String str = (String) entry.getKey();
                Bundle CatchingFishParcelableFAB = ((CatchingFishFluxContext) entry.getValue()).CatchingFishParcelableFAB();
                CatchingFishFirebaseDagger.CatchingFishNavigation(str, "key");
                CatchingFishFragmentHandler.putBundle(str, CatchingFishParcelableFAB);
            }
        }
        if (CatchingFishFragmentHandler.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", CatchingFishFragmentHandler);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a9  */
    @Override // kotlin.text.CatchingFishLiveDataDagger
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CatchingFishKtorPicassoMVVM CatchingFishStateLiveData(View view, CatchingFishKtorPicassoMVVM catchingFishKtorPicassoMVVM) {
        boolean z;
        boolean z2;
        boolean z3;
        CatchingFishStripeAPIRealm catchingFishStripeAPIRealm = (CatchingFishStripeAPIRealm) this.CatchingFishDaggerWebsocket;
        CatchingFishCardViewGradle catchingFishCardViewGradle = (CatchingFishCardViewGradle) this.CatchingFishWorkManager;
        int i = catchingFishCardViewGradle.CatchingFishParcelableFAB;
        int i2 = catchingFishCardViewGradle.CatchingFishSnackbar;
        int i3 = catchingFishCardViewGradle.CatchingFishCoroutine;
        CatchingFishFragmentHilt catchingFishFragmentHilt = catchingFishKtorPicassoMVVM.CatchingFishParcelableFAB;
        CatchingFishReduxPayPal CatchingFishLayout = catchingFishFragmentHilt.CatchingFishLayout(519);
        CatchingFishReduxPayPal CatchingFishLayout2 = catchingFishFragmentHilt.CatchingFishLayout(32);
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) catchingFishStripeAPIRealm.CatchingFishSnackbar;
        int i4 = CatchingFishLayout.CatchingFishSnackbar;
        int i5 = CatchingFishLayout.CatchingFishCoroutine;
        int i6 = CatchingFishLayout.CatchingFishParcelableFAB;
        bottomSheetBehavior.CatchingFishSpannableWidget = i4;
        boolean z4 = view.getLayoutDirection() == 1;
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        boolean z5 = bottomSheetBehavior.CatchingFishAnimationMockk;
        if (z5) {
            int CatchingFishParcelableFAB = catchingFishKtorPicassoMVVM.CatchingFishParcelableFAB();
            bottomSheetBehavior.CatchingFishDaggerHiltFAB = CatchingFishParcelableFAB;
            paddingBottom = CatchingFishParcelableFAB + i3;
        }
        if (bottomSheetBehavior.CatchingFishStateLiveData) {
            paddingLeft = (z4 ? i2 : i) + i6;
        }
        int i7 = paddingLeft;
        if (bottomSheetBehavior.CatchingFishRoomDatabase) {
            if (!z4) {
                i = i2;
            }
            paddingRight = i + i5;
        }
        int i8 = paddingRight;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (!bottomSheetBehavior.CatchingFish || marginLayoutParams.leftMargin == i6) {
            z = false;
        } else {
            marginLayoutParams.leftMargin = i6;
            z = true;
        }
        if (bottomSheetBehavior.CatchingFishJetpackCompose && marginLayoutParams.rightMargin != i5) {
            marginLayoutParams.rightMargin = i5;
            z = true;
        }
        if (bottomSheetBehavior.CatchingFishCoroutineFlow) {
            int i9 = marginLayoutParams.topMargin;
            int i10 = CatchingFishLayout.CatchingFishSnackbar;
            if (i9 != i10) {
                marginLayoutParams.topMargin = i10;
                z2 = true;
                if (z2) {
                    view.setLayoutParams(marginLayoutParams);
                }
                view.setPadding(i7, view.getPaddingTop(), i8, paddingBottom);
                z3 = catchingFishStripeAPIRealm.CatchingFishParcelableFAB;
                if (z3) {
                    bottomSheetBehavior.CatchingFishOkHttp = CatchingFishLayout2.CatchingFishReduxKtor;
                }
                if (z5 && !z3) {
                    return catchingFishKtorPicassoMVVM;
                }
                bottomSheetBehavior.CatchingFishSensorManager();
                return catchingFishKtorPicassoMVVM;
            }
        }
        z2 = z;
        if (z2) {
        }
        view.setPadding(i7, view.getPaddingTop(), i8, paddingBottom);
        z3 = catchingFishStripeAPIRealm.CatchingFishParcelableFAB;
        if (z3) {
        }
        if (z5) {
        }
        bottomSheetBehavior.CatchingFishSensorManager();
        return catchingFishKtorPicassoMVVM;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean CatchingFishUnitTesting(String str, CatchingFishJUnitGlide catchingFishJUnitGlide, boolean z) {
        Object catchingFishBundleToolbar;
        String substring;
        String CatchingFishEspressoMockk;
        String decode;
        MainActivity mainActivity = ((CatchingFishBundleMoshiMVVM) this.CatchingFishWorkManager).CatchingFishParcelableFAB;
        CatchingFishManifestMVI catchingFishManifestMVI = (CatchingFishManifestMVI) this.CatchingFishDaggerWebsocket;
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishJUnitGlide, "closePopup");
        boolean z2 = z && catchingFishManifestMVI.CatchingFishCoroutine;
        CatchingFishFABMockkPicasso catchingFishFABMockkPicasso = CatchingFishFABMockkPicasso.CatchingFishParcelableFAB;
        CatchingFishAndroidXMockk catchingFishAndroidXMockk = CatchingFishAndroidXMockk.CatchingFishParcelableFAB;
        if (!z2) {
            if (!CatchingFishGradleMVVM.CatchingFishViewModelScope(str)) {
                List list = CatchingFishMoshiAsyncTask.CatchingFishParcelableFAB;
                if (list == null || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (CatchingFishRoomMVVMWidget.CatchingFishDagger(str, (String) it.next())) {
                            catchingFishBundleToolbar = new CatchingFishBundleToolbar(str);
                            break;
                        }
                    }
                }
                catchingFishBundleToolbar = CatchingFishRoomMVVMWidget.CatchingFishDagger(str, "http") ? catchingFishFABMockkPicasso : new CatchingFishViewFluxFlux(str);
            } else if (!CatchingFishRoomMVVMWidget.CatchingFishMutableLiveData(str, "/gp/p/loading")) {
                catchingFishBundleToolbar = new CatchingFishGradleCoroutine(CatchingFishMoshiFluxMoshi.CatchingFishFragmentHandler(str));
            }
            if (!catchingFishBundleToolbar.equals(catchingFishFABMockkPicasso)) {
                return false;
            }
            if (!catchingFishBundleToolbar.equals(catchingFishAndroidXMockk)) {
                if (catchingFishBundleToolbar instanceof CatchingFishGradleCoroutine) {
                    catchingFishJUnitGlide.CatchingFishParcelableFAB();
                    catchingFishManifestMVI.CatchingFishSnackbar(((CatchingFishGradleCoroutine) catchingFishBundleToolbar).CatchingFishParcelableFAB);
                    return true;
                }
                if (catchingFishBundleToolbar instanceof CatchingFishBundleToolbar) {
                    String str2 = ((CatchingFishBundleToolbar) catchingFishBundleToolbar).CatchingFishParcelableFAB;
                    if (CatchingFishRoomMVVMWidget.CatchingFishDagger(str2, "intent://")) {
                        int CatchingFishPayPalService = CatchingFishRoomMVVMWidget.CatchingFishPayPalService(str2, "#Intent;", 0, false);
                        if (CatchingFishPayPalService == -1) {
                            substring = str2;
                        } else {
                            substring = str2.substring(0, CatchingFishPayPalService);
                            CatchingFishFirebaseDagger.CatchingFishRoomDatabase(substring, "substring(...)");
                        }
                        CatchingFishEspressoMockk = CatchingFishRoomMVVMWidget.CatchingFishEspressoMockk(substring, "intent://", "https://");
                    } else {
                        CatchingFishEspressoMockk = str2;
                    }
                    try {
                        mainActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(CatchingFishEspressoMockk)));
                    } catch (Exception unused) {
                        if (CatchingFishRoomMVVMWidget.CatchingFishDagger(str2, "intent://")) {
                            CatchingFishHiltStateFlow catchingFishHiltStateFlow = CatchingFishBundleMoshiMVVM.CatchingFishSnackbar;
                            catchingFishHiltStateFlow.getClass();
                            Matcher matcher = catchingFishHiltStateFlow.CatchingFishReduxKtor.matcher(str2);
                            CatchingFishFirebaseDagger.CatchingFishRoomDatabase(matcher, "matcher(...)");
                            CatchingFishBundleGlide catchingFishBundleGlide = !matcher.find(0) ? null : new CatchingFishBundleGlide(matcher, str2);
                            if (catchingFishBundleGlide != null) {
                                if (((CatchingFishGsonToolbar) catchingFishBundleGlide.CatchingFishWorkManager) == null) {
                                    catchingFishBundleGlide.CatchingFishWorkManager = new CatchingFishGsonToolbar(catchingFishBundleGlide);
                                }
                                CatchingFishGsonToolbar catchingFishGsonToolbar = (CatchingFishGsonToolbar) catchingFishBundleGlide.CatchingFishWorkManager;
                                CatchingFishFirebaseDagger.CatchingFishAnimationMockk(catchingFishGsonToolbar);
                                String str3 = (String) (1 < catchingFishGsonToolbar.CatchingFishParcelableFAB() ? catchingFishGsonToolbar.get(1) : null);
                                if (str3 != null && (decode = URLDecoder.decode(str3, Constants.ENCODING)) != null) {
                                    try {
                                        mainActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(decode)));
                                    } catch (Exception unused2) {
                                    }
                                }
                            }
                        }
                    }
                    catchingFishJUnitGlide.CatchingFishParcelableFAB();
                } else {
                    if (!(catchingFishBundleToolbar instanceof CatchingFishViewFluxFlux)) {
                        throw new CatchingFishBiometricView();
                    }
                    try {
                        mainActivity.startActivity(Intent.parseUri(((CatchingFishViewFluxFlux) catchingFishBundleToolbar).CatchingFishParcelableFAB, 1));
                    } catch (Throwable th) {
                        CatchingFishDaggerBiometric.CatchingFishViewModelFAB(th);
                    }
                }
            }
            return true;
        }
        catchingFishBundleToolbar = catchingFishAndroidXMockk;
        if (!catchingFishBundleToolbar.equals(catchingFishFABMockkPicasso)) {
        }
    }

    public void CatchingFishViewModelFAB(int i) {
        int[] iArr = (int[]) this.CatchingFishDaggerWebsocket;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.CatchingFishDaggerWebsocket = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.CatchingFishDaggerWebsocket = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.CatchingFishDaggerWebsocket;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    @Override // kotlin.text.CatchingFishViewRobolectric
    public List CatchingFishWorkManager(Integer num) {
        List CatchingFishWorkManager = ((CatchingFishViewRobolectric) this.CatchingFishDaggerWebsocket).CatchingFishWorkManager(null);
        CatchingFishGoogleMapsMVP catchingFishGoogleMapsMVP = (CatchingFishGoogleMapsMVP) this.CatchingFishWorkManager;
        int i = catchingFishGoogleMapsMVP.CatchingFishDaggerHiltFAB;
        return i < 0 ? CatchingFishWorkManager : CatchingFishCameraXCameraX.CatchingFishMoshiDaggerHilt(CatchingFishGsonCardView.CatchingFishLayout(catchingFishGoogleMapsMVP, num, i, Integer.valueOf(catchingFishGoogleMapsMVP.CatchingFishMVPRobolectric(catchingFishGoogleMapsMVP.CatchingFishSnackbar, i))), CatchingFishWorkManager);
    }

    @Override // kotlin.text.CatchingFishHandlerMVP
    public Object get() {
        switch (this.CatchingFishReduxKtor) {
            case 1:
                return new CatchingFishPayPalHandler((Context) ((CatchingFishFABFlux) this.CatchingFishDaggerWebsocket).CatchingFishReduxKtor, (CatchingFishJUnitMVIService) ((CatchingFishServiceHilt) this.CatchingFishWorkManager).get());
            default:
                CatchingFishMoshiGson catchingFishMoshiGson = new CatchingFishMoshiGson();
                CatchingFishExoPlayerMVP catchingFishExoPlayerMVP = new CatchingFishExoPlayerMVP();
                Object obj = ((CatchingFishHandlerMVP) this.CatchingFishDaggerWebsocket).get();
                CatchingFishHandlerMVP catchingFishHandlerMVP = (CatchingFishHandlerMVP) this.CatchingFishWorkManager;
                return new CatchingFishMVIView(catchingFishMoshiGson, catchingFishExoPlayerMVP, CatchingFishViewEspresso.CatchingFishWorkManager, (CatchingFishWebsocketHilt) obj, catchingFishHandlerMVP);
        }
    }

    public String toString() {
        switch (this.CatchingFishReduxKtor) {
            case 4:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.CatchingFishWorkManager.getClass().getSimpleName());
                sb.append('{');
                ArrayList arrayList = (ArrayList) this.CatchingFishDaggerWebsocket;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    sb.append((String) arrayList.get(i));
                    if (i < size - 1) {
                        sb.append(", ");
                    }
                }
                sb.append('}');
                return sb.toString();
            case 9:
                String str = "[ ";
                if (((CatchingFishHandlerGson) this.CatchingFishDaggerWebsocket) != null) {
                    for (int i2 = 0; i2 < 9; i2++) {
                        str = str + ((CatchingFishHandlerGson) this.CatchingFishDaggerWebsocket).CatchingFishCloudMessaging[i2] + " ";
                    }
                }
                return str + "] " + ((CatchingFishHandlerGson) this.CatchingFishDaggerWebsocket);
            case 25:
                return "Bounds{lower=" + ((CatchingFishReduxPayPal) this.CatchingFishDaggerWebsocket) + " upper=" + ((CatchingFishReduxPayPal) this.CatchingFishWorkManager) + "}";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ CatchingFishViewModelIntent(int i, Object obj, Object obj2) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = obj;
        this.CatchingFishWorkManager = obj2;
    }

    public /* synthetic */ CatchingFishViewModelIntent(int i, Object obj, Object obj2, boolean z) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishWorkManager = obj;
        this.CatchingFishDaggerWebsocket = obj2;
    }

    public /* synthetic */ CatchingFishViewModelIntent(Object obj) {
        this.CatchingFishReduxKtor = 4;
        this.CatchingFishWorkManager = obj;
        this.CatchingFishDaggerWebsocket = new ArrayList();
    }

    public CatchingFishViewModelIntent(CatchingFishViewModelIntent catchingFishViewModelIntent, CatchingFishAndroidXPayPal catchingFishAndroidXPayPal) {
        this.CatchingFishReduxKtor = 29;
        this.CatchingFishDaggerWebsocket = catchingFishAndroidXPayPal;
        Objects.requireNonNull(catchingFishViewModelIntent);
        this.CatchingFishWorkManager = catchingFishViewModelIntent;
    }

    public CatchingFishViewModelIntent(CatchingFishMoshiAsyncTask catchingFishMoshiAsyncTask, CatchingFishManifestMVI catchingFishManifestMVI, CatchingFishBundleMoshiMVVM catchingFishBundleMoshiMVVM) {
        this.CatchingFishReduxKtor = 24;
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishManifestMVI, "customTabsCoordinator");
        this.CatchingFishDaggerWebsocket = catchingFishManifestMVI;
        this.CatchingFishWorkManager = catchingFishBundleMoshiMVVM;
    }

    public CatchingFishViewModelIntent(CatchingFishMoshiBundle catchingFishMoshiBundle, int i) {
        this.CatchingFishReduxKtor = i;
        switch (i) {
            case 14:
                this.CatchingFishDaggerWebsocket = catchingFishMoshiBundle;
                this.CatchingFishWorkManager = new CatchingFishViewModelIntent(catchingFishMoshiBundle, 13);
                break;
            default:
                this.CatchingFishDaggerWebsocket = catchingFishMoshiBundle;
                break;
        }
    }

    public CatchingFishViewModelIntent(ExecutorService executorService) {
        this.CatchingFishReduxKtor = 11;
        this.CatchingFishWorkManager = new CatchingFishCameraXRetrofit(0);
        this.CatchingFishDaggerWebsocket = executorService;
    }

    public CatchingFishViewModelIntent(Context context, int i) {
        this.CatchingFishReduxKtor = i;
        switch (i) {
            case 18:
                CatchingFishToastHiltBundle.CatchingFishAnimationMockk(context);
                Resources resources = context.getResources();
                this.CatchingFishDaggerWebsocket = resources;
                this.CatchingFishWorkManager = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
                break;
            default:
                this.CatchingFishWorkManager = null;
                this.CatchingFishDaggerWebsocket = context;
                break;
        }
    }

    public CatchingFishViewModelIntent(CatchingFishRealmSnackbar catchingFishRealmSnackbar) {
        this.CatchingFishReduxKtor = 20;
        this.CatchingFishDaggerWebsocket = catchingFishRealmSnackbar;
        CatchingFishFluxStripeAPI catchingFishFluxStripeAPI = new CatchingFishFluxStripeAPI();
        catchingFishFluxStripeAPI.CatchingFishParcelableFAB = 0;
        this.CatchingFishWorkManager = catchingFishFluxStripeAPI;
    }

    public CatchingFishViewModelIntent(WindowInsetsAnimation.Bounds bounds) {
        Insets lowerBound;
        Insets upperBound;
        this.CatchingFishReduxKtor = 25;
        lowerBound = bounds.getLowerBound();
        this.CatchingFishDaggerWebsocket = CatchingFishReduxPayPal.CatchingFishCoroutine(lowerBound);
        upperBound = bounds.getUpperBound();
        this.CatchingFishWorkManager = CatchingFishReduxPayPal.CatchingFishCoroutine(upperBound);
    }

    public CatchingFishViewModelIntent(int i) {
        this.CatchingFishReduxKtor = i;
        switch (i) {
            case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                this.CatchingFishDaggerWebsocket = new CatchingFishFABToast(new CatchingFishBiometricRoom[16]);
                break;
            case 17:
                break;
            case 19:
                this.CatchingFishDaggerWebsocket = new CatchingFishMVPExoPlayer(29);
                this.CatchingFishWorkManager = new CatchingFishGsonIntent(16);
                break;
            case 21:
                this.CatchingFishDaggerWebsocket = new CatchingFishGraphQLRealmFAB(0);
                this.CatchingFishWorkManager = new CatchingFishLayoutMVVMFlux((Object) null);
                break;
            case 23:
                this.CatchingFishDaggerWebsocket = new CatchingFishFABToast(new Reference[16]);
                this.CatchingFishWorkManager = new ReferenceQueue();
                break;
            case 26:
                this.CatchingFishWorkManager = Collections.synchronizedMap(new WeakHashMap());
                this.CatchingFishDaggerWebsocket = Collections.synchronizedMap(new WeakHashMap());
                break;
            case 28:
                CatchingFishAdMobAdMob catchingFishAdMobAdMob = CatchingFishAdMobAdMob.CatchingFishDaggerWebsocket;
                this.CatchingFishDaggerWebsocket = new SparseIntArray();
                this.CatchingFishWorkManager = catchingFishAdMobAdMob;
                break;
            default:
                this.CatchingFishDaggerWebsocket = new CatchingFishPayPalService();
                this.CatchingFishWorkManager = new CatchingFishPayPalService();
                break;
        }
    }
}
