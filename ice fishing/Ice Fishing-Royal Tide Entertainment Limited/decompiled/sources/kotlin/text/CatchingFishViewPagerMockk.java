package kotlin.text;

import android.content.ClipDescription;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.autofill.AutofillManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class CatchingFishViewPagerMockk implements CatchingFishLayoutViewPager, CatchingFishFragmentFAB, CatchingFishMVIIntentGradle, CatchingFishReduxEspresso, CatchingFishEspressoToast {
    public final Object CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;

    public /* synthetic */ CatchingFishViewPagerMockk(int i, Object obj) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = obj;
    }

    public static void CatchingFishGsonAppCompat(String str) {
        if (str.startsWith("gcm.n.")) {
            str.substring(6);
        }
    }

    public static boolean CatchingFishUnitTesting(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public CatchingFishGlideFAB CatchingFish(CatchingFishViewModelIntent catchingFishViewModelIntent, CatchingFishGradleCameraX catchingFishGradleCameraX) {
        int i;
        long CatchingFishFragmentFactory;
        long j;
        boolean z;
        CatchingFishLayoutMVVMFlux catchingFishLayoutMVVMFlux = (CatchingFishLayoutMVVMFlux) this.CatchingFishDaggerWebsocket;
        List list = (List) catchingFishViewModelIntent.CatchingFishDaggerWebsocket;
        CatchingFishLayoutMVVMFlux catchingFishLayoutMVVMFlux2 = new CatchingFishLayoutMVVMFlux(list.size());
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            CatchingFishDaggerSnackbar catchingFishDaggerSnackbar = (CatchingFishDaggerSnackbar) list.get(i2);
            long j2 = catchingFishDaggerSnackbar.CatchingFishParcelableFAB;
            CatchingFishMVIKtorFragment catchingFishMVIKtorFragment = (CatchingFishMVIKtorFragment) catchingFishLayoutMVVMFlux.CatchingFishSnackbar(j2);
            if (catchingFishMVIKtorFragment == null) {
                i = i2;
                j = catchingFishDaggerSnackbar.CatchingFishSnackbar;
                CatchingFishFragmentFactory = catchingFishDaggerSnackbar.CatchingFishReduxKtor;
                z = false;
            } else {
                long j3 = catchingFishMVIKtorFragment.CatchingFishParcelableFAB;
                boolean z2 = catchingFishMVIKtorFragment.CatchingFishCoroutine;
                i = i2;
                CatchingFishFragmentFactory = catchingFishGradleCameraX.CatchingFishFragmentFactory(catchingFishMVIKtorFragment.CatchingFishSnackbar);
                j = j3;
                z = z2;
            }
            long j4 = catchingFishDaggerSnackbar.CatchingFishParcelableFAB;
            List list2 = list;
            int i3 = size;
            catchingFishLayoutMVVMFlux2.CatchingFishDaggerWebsocket(j4, new CatchingFishFABAdMob(j4, catchingFishDaggerSnackbar.CatchingFishSnackbar, catchingFishDaggerSnackbar.CatchingFishReduxKtor, catchingFishDaggerSnackbar.CatchingFishDaggerWebsocket, catchingFishDaggerSnackbar.CatchingFishWorkManager, j, CatchingFishFragmentFactory, z, catchingFishDaggerSnackbar.CatchingFishViewModelScope, catchingFishDaggerSnackbar.CatchingFishLayout, catchingFishDaggerSnackbar.CatchingFishFragmentHandler, catchingFishDaggerSnackbar.CatchingFishCloudMessaging));
            boolean z3 = catchingFishDaggerSnackbar.CatchingFishDaggerWebsocket;
            if (z3) {
                catchingFishLayoutMVVMFlux.CatchingFishDaggerWebsocket(j2, new CatchingFishMVIKtorFragment(catchingFishDaggerSnackbar.CatchingFishSnackbar, catchingFishDaggerSnackbar.CatchingFishCoroutine, z3));
            } else {
                catchingFishLayoutMVVMFlux.CatchingFishWorkManager(j2);
            }
            i2 = i + 1;
            list = list2;
            size = i3;
        }
        CatchingFishGlideFAB catchingFishGlideFAB = new CatchingFishGlideFAB();
        catchingFishGlideFAB.CatchingFishSnackbar = catchingFishLayoutMVVMFlux2;
        catchingFishGlideFAB.CatchingFishCoroutine = catchingFishViewModelIntent;
        return catchingFishGlideFAB;
    }

    public void CatchingFishAnimationMockk() {
        ((CatchingFishMVIPicasso) this.CatchingFishDaggerWebsocket).CatchingFishSpannableWidget.CatchingFishDagger();
    }

    public JSONArray CatchingFishCloudMessaging(String str) {
        String CatchingFishOkHttp = CatchingFishOkHttp(str);
        if (TextUtils.isEmpty(CatchingFishOkHttp)) {
            return null;
        }
        try {
            return new JSONArray(CatchingFishOkHttp);
        } catch (JSONException unused) {
            CatchingFishGsonAppCompat(str);
            return null;
        }
    }

    @Override // kotlin.text.CatchingFishLayoutViewPager
    public Object CatchingFishCoroutine(CatchingFishIntentManifest catchingFishIntentManifest, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        Object CatchingFishCoroutine = ((CatchingFishBundleGlide) this.CatchingFishDaggerWebsocket).CatchingFishCoroutine(new CatchingFishCameraXRedux(0, catchingFishIntentManifest), catchingFishWebsocketGradle);
        return CatchingFishCoroutine == CatchingFishXMLLayoutMockk.CatchingFishReduxKtor ? CatchingFishCoroutine : CatchingFishRealmContext.CatchingFishParcelableFAB;
    }

    public void CatchingFishCoroutineFlow(String str) {
        ArrayList arrayList = (ArrayList) this.CatchingFishDaggerWebsocket;
        int i = 0;
        while (i < arrayList.size()) {
            if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                arrayList.remove(i);
                arrayList.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }

    public void CatchingFishDaggerHiltFAB(String str, String str2) {
        CatchingFishKtorStripeAPI.CatchingFishParcelableFAB(str);
        CatchingFishKtorStripeAPI.CatchingFishSnackbar(str2, str);
        CatchingFishCoroutineFlow(str);
        CatchingFishViewModelScope(str, str2);
    }

    public String CatchingFishEspressoTesting(Resources resources, String str, String str2) {
        String[] strArr;
        String CatchingFishOkHttp = CatchingFishOkHttp(str2);
        if (!TextUtils.isEmpty(CatchingFishOkHttp)) {
            return CatchingFishOkHttp;
        }
        String CatchingFishOkHttp2 = CatchingFishOkHttp(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(CatchingFishOkHttp2)) {
            return null;
        }
        int identifier = resources.getIdentifier(CatchingFishOkHttp2, "string", str);
        if (identifier == 0) {
            CatchingFishGsonAppCompat(str2.concat("_loc_key"));
            return null;
        }
        JSONArray CatchingFishCloudMessaging = CatchingFishCloudMessaging(str2.concat("_loc_args"));
        if (CatchingFishCloudMessaging == null) {
            strArr = null;
        } else {
            int length = CatchingFishCloudMessaging.length();
            strArr = new String[length];
            for (int i = 0; i < length; i++) {
                strArr[i] = CatchingFishCloudMessaging.optString(i);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException unused) {
            CatchingFishGsonAppCompat(str2);
            Arrays.toString(strArr);
            return null;
        }
    }

    public Integer CatchingFishFragmentHandler(String str) {
        String CatchingFishOkHttp = CatchingFishOkHttp(str);
        if (TextUtils.isEmpty(CatchingFishOkHttp)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(CatchingFishOkHttp));
        } catch (NumberFormatException unused) {
            CatchingFishGsonAppCompat(str);
            return null;
        }
    }

    public boolean CatchingFishJetpackCompose(CatchingFishBiometricRoom catchingFishBiometricRoom) {
        if (!catchingFishBiometricRoom.CatchingFishCustomView()) {
            CatchingFishFluxGradle.CatchingFishSnackbar("DepthSortedSet.remove called on an unattached node");
        }
        return ((CatchingFishServiceGson) this.CatchingFishDaggerWebsocket).remove(catchingFishBiometricRoom);
    }

    public CatchingFishMVVMAndroidX CatchingFishLayout() {
        return (CatchingFishMVVMAndroidX) ((CatchingFishHandlerAndroidX) this.CatchingFishDaggerWebsocket).getValue();
    }

    public Bundle CatchingFishNavigation() {
        Bundle bundle = (Bundle) this.CatchingFishDaggerWebsocket;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    public String CatchingFishOkHttp(String str) {
        Bundle bundle = (Bundle) this.CatchingFishDaggerWebsocket;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String replace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(replace)) {
                str = replace;
            }
        }
        return bundle.getString(str);
    }

    @Override // kotlin.text.CatchingFishReduxEspresso
    public Object CatchingFishParcelableFAB(CatchingFishMockkView catchingFishMockkView, CatchingFishMVIBundle catchingFishMVIBundle) {
        return ((CatchingFishReduxEspresso) this.CatchingFishDaggerWebsocket).CatchingFishParcelableFAB(new CatchingFishMVVMRealm(catchingFishMockkView, null), catchingFishMVIBundle);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        if (r6.CatchingFishParcelableFAB > r2.CatchingFishParcelableFAB) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Type inference failed for: r3v4, types: [kotlin.text.CatchingFishFluxWorkManager] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void CatchingFishParcelableFlux(CatchingFishMVVMAndroidX catchingFishMVVMAndroidX) {
        Object value;
        CatchingFishMVVMAndroidX catchingFishMVVMAndroidX2;
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishMVVMAndroidX, "newState");
        CatchingFishHandlerAndroidX catchingFishHandlerAndroidX = (CatchingFishHandlerAndroidX) this.CatchingFishDaggerWebsocket;
        do {
            value = catchingFishHandlerAndroidX.getValue();
            catchingFishMVVMAndroidX2 = (CatchingFishMVVMAndroidX) value;
            if (!(catchingFishMVVMAndroidX2 instanceof CatchingFishBiometricMoshi ? true : CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishMVVMAndroidX2, CatchingFishToastSpannable.CatchingFishSnackbar))) {
                if (!(catchingFishMVVMAndroidX2 instanceof CatchingFishMockkStripeAPI)) {
                    if (!(catchingFishMVVMAndroidX2 instanceof CatchingFishCardViewMockk)) {
                        throw new CatchingFishBiometricView();
                    }
                }
                ?? r3 = CatchingFishAdMobFAB.CatchingFishViewModelScope;
                if (value == null) {
                    value = r3;
                }
                if (catchingFishMVVMAndroidX2 == null) {
                    catchingFishMVVMAndroidX2 = r3;
                }
            }
            catchingFishMVVMAndroidX2 = catchingFishMVVMAndroidX;
            ?? r32 = CatchingFishAdMobFAB.CatchingFishViewModelScope;
            if (value == null) {
            }
            if (catchingFishMVVMAndroidX2 == null) {
            }
        } while (!catchingFishHandlerAndroidX.CatchingFishFragmentHandler(value, catchingFishMVVMAndroidX2));
    }

    @Override // kotlin.text.CatchingFishEspressoToast
    public void CatchingFishReduxKtor(int i, Object obj) {
        if (i == 6 || i == 7 || i == 8) {
        }
        ((ProfileInstallReceiver) this.CatchingFishDaggerWebsocket).setResultCode(i);
    }

    @Override // kotlin.text.CatchingFishFragmentFAB
    public void CatchingFishRoomDatabase(CatchingFishWorkManagerMVP catchingFishWorkManagerMVP) {
        String str;
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishWorkManagerMVP, "task");
        CatchingFishKtorMockk catchingFishKtorMockk = (CatchingFishKtorMockk) this.CatchingFishDaggerWebsocket;
        if (catchingFishKtorMockk.CatchingFishParcelableFlux()) {
            String str2 = "";
            if (catchingFishWorkManagerMVP.CatchingFishViewModelFAB() && (str = (String) catchingFishWorkManagerMVP.CatchingFishWorkManager()) != null) {
                str2 = str;
            }
            catchingFishKtorMockk.CatchingFishViewModelFAB(str2);
        }
    }

    @Override // kotlin.text.CatchingFishReduxEspresso
    public CatchingFishLayoutViewPager CatchingFishSnackbar() {
        return ((CatchingFishReduxEspresso) this.CatchingFishDaggerWebsocket).CatchingFishSnackbar();
    }

    public void CatchingFishSpannableWidget(Exception exc) {
        CatchingFishOkHttpCoroutine catchingFishOkHttpCoroutine = (CatchingFishOkHttpCoroutine) this.CatchingFishDaggerWebsocket;
        if (CatchingFishAsyncTask.CatchingFishLayout.CatchingFishEspressoTesting(catchingFishOkHttpCoroutine, null, new CatchingFishGson(exc))) {
            CatchingFishAsyncTask.CatchingFishCoroutine(catchingFishOkHttpCoroutine);
        }
    }

    public void CatchingFishStateLiveData(View view, int i, boolean z) {
        if (Build.VERSION.SDK_INT >= 27) {
            ((AutofillManager) this.CatchingFishDaggerWebsocket).notifyViewVisibilityChanged(view, i, z);
        }
    }

    public boolean CatchingFishViewModelFAB(String str) {
        String CatchingFishOkHttp = CatchingFishOkHttp(str);
        return "1".equals(CatchingFishOkHttp) || Boolean.parseBoolean(CatchingFishOkHttp);
    }

    public void CatchingFishViewModelScope(String str, String str2) {
        ArrayList arrayList = (ArrayList) this.CatchingFishDaggerWebsocket;
        arrayList.add(str);
        arrayList.add(str2.trim());
    }

    public void CatchingFishWorkManager(CatchingFishBiometricRoom catchingFishBiometricRoom) {
        if (!catchingFishBiometricRoom.CatchingFishCustomView()) {
            CatchingFishFluxGradle.CatchingFishSnackbar("DepthSortedSet.add called on an unattached node");
        }
        ((CatchingFishServiceGson) this.CatchingFishDaggerWebsocket).add(catchingFishBiometricRoom);
    }

    public String toString() {
        switch (this.CatchingFishReduxKtor) {
            case 3:
                return ((CatchingFishServiceGson) this.CatchingFishDaggerWebsocket).toString();
            default:
                return super.toString();
        }
    }

    public CatchingFishViewPagerMockk(int i) {
        this.CatchingFishReduxKtor = i;
        switch (i) {
            case 3:
                this.CatchingFishDaggerWebsocket = new CatchingFishServiceGson(CatchingFishXMLLayoutGlide.CatchingFishCoroutine);
                break;
            case 12:
                this.CatchingFishDaggerWebsocket = new ArrayList(20);
                break;
            case 16:
                this.CatchingFishDaggerWebsocket = new LinkedHashMap(0, 0.75f, true);
                break;
            case 24:
                this.CatchingFishDaggerWebsocket = Build.VERSION.SDK_INT >= 28 ? new CatchingFishMoshiFluxMoshi(24) : new CatchingFishMVPExoPlayer(24);
                break;
            case 25:
                this.CatchingFishDaggerWebsocket = new CatchingFishLayoutMVVMFlux((Object) null);
                break;
            default:
                this.CatchingFishDaggerWebsocket = CatchingFishFirebaseDagger.CatchingFishLayout(CatchingFishToastSpannable.CatchingFishSnackbar);
                break;
        }
    }

    public CatchingFishViewPagerMockk(Bundle bundle) {
        this.CatchingFishReduxKtor = 21;
        this.CatchingFishDaggerWebsocket = new Bundle(bundle);
    }

    public CatchingFishViewPagerMockk(TextView textView) {
        this.CatchingFishReduxKtor = 7;
        this.CatchingFishDaggerWebsocket = new CatchingFishServiceManifest(textView);
    }

    public CatchingFishViewPagerMockk(EditText editText) {
        this.CatchingFishReduxKtor = 6;
        this.CatchingFishDaggerWebsocket = new CatchingFishBundleGlide(editText, 18);
    }

    public CatchingFishViewPagerMockk(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.CatchingFishReduxKtor = 13;
        if (Build.VERSION.SDK_INT >= 25) {
            this.CatchingFishDaggerWebsocket = new CatchingFishJUnitMVP(uri, clipDescription, uri2);
        } else {
            this.CatchingFishDaggerWebsocket = new CatchingFishAsyncTaskDagger(uri, clipDescription, uri2, 13);
        }
    }
}
