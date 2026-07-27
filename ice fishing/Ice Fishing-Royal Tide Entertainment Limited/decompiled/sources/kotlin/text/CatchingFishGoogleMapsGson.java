package kotlin.text;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.activity.ComponentActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class CatchingFishGoogleMapsGson {
    public final /* synthetic */ ComponentActivity CatchingFishViewModelFAB;
    public final LinkedHashMap CatchingFishParcelableFAB = new LinkedHashMap();
    public final LinkedHashMap CatchingFishSnackbar = new LinkedHashMap();
    public final LinkedHashMap CatchingFishCoroutine = new LinkedHashMap();
    public final ArrayList CatchingFishReduxKtor = new ArrayList();
    public final transient LinkedHashMap CatchingFishDaggerWebsocket = new LinkedHashMap();
    public final LinkedHashMap CatchingFishWorkManager = new LinkedHashMap();
    public final Bundle CatchingFishViewModelScope = new Bundle();

    public CatchingFishGoogleMapsGson(ComponentActivity componentActivity) {
        this.CatchingFishViewModelFAB = componentActivity;
    }

    public final CatchingFishMoshiFABMVVM CatchingFishCoroutine(String str, CatchingFishFirebaseDagger catchingFishFirebaseDagger, CatchingFishBundleKtor catchingFishBundleKtor) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(str, "key");
        CatchingFishReduxKtor(str);
        this.CatchingFishDaggerWebsocket.put(str, new CatchingFishGlide(catchingFishBundleKtor, catchingFishFirebaseDagger));
        LinkedHashMap linkedHashMap = this.CatchingFishWorkManager;
        if (linkedHashMap.containsKey(str)) {
            Object obj = linkedHashMap.get(str);
            linkedHashMap.remove(str);
            catchingFishBundleKtor.CatchingFishParcelableFAB(obj);
        }
        Bundle bundle = this.CatchingFishViewModelScope;
        CatchingFishToolbar catchingFishToolbar = (CatchingFishToolbar) CatchingFishBiometricBundle.CatchingFishJetpackCompose(str, bundle);
        if (catchingFishToolbar != null) {
            bundle.remove(str);
            catchingFishBundleKtor.CatchingFishParcelableFAB(catchingFishFirebaseDagger.CatchingFishPayPalLiveData(catchingFishToolbar.CatchingFishDaggerWebsocket, catchingFishToolbar.CatchingFishReduxKtor));
        }
        return new CatchingFishMoshiFABMVVM(this, str, catchingFishFirebaseDagger, 1);
    }

    public final void CatchingFishDaggerWebsocket(String str) {
        Integer num;
        CatchingFishFirebaseDagger.CatchingFishNavigation(str, "key");
        if (!this.CatchingFishReduxKtor.contains(str) && (num = (Integer) this.CatchingFishSnackbar.remove(str)) != null) {
            this.CatchingFishParcelableFAB.remove(num);
        }
        this.CatchingFishDaggerWebsocket.remove(str);
        LinkedHashMap linkedHashMap = this.CatchingFishWorkManager;
        if (linkedHashMap.containsKey(str)) {
            Objects.toString(linkedHashMap.get(str));
            linkedHashMap.remove(str);
        }
        Bundle bundle = this.CatchingFishViewModelScope;
        if (bundle.containsKey(str)) {
            Objects.toString((CatchingFishToolbar) CatchingFishBiometricBundle.CatchingFishJetpackCompose(str, bundle));
            bundle.remove(str);
        }
        LinkedHashMap linkedHashMap2 = this.CatchingFishCoroutine;
        CatchingFishCameraXLiveData catchingFishCameraXLiveData = (CatchingFishCameraXLiveData) linkedHashMap2.get(str);
        if (catchingFishCameraXLiveData != null) {
            ArrayList arrayList = catchingFishCameraXLiveData.CatchingFishSnackbar;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                catchingFishCameraXLiveData.CatchingFishParcelableFAB.CatchingFishWorkManager((CatchingFishMVPViewService) obj);
            }
            arrayList.clear();
            linkedHashMap2.remove(str);
        }
    }

    public final boolean CatchingFishParcelableFAB(int i, int i2, Intent intent) {
        String str = (String) this.CatchingFishParcelableFAB.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        CatchingFishGlide catchingFishGlide = (CatchingFishGlide) this.CatchingFishDaggerWebsocket.get(str);
        if ((catchingFishGlide != null ? catchingFishGlide.CatchingFishParcelableFAB : null) != null) {
            ArrayList arrayList = this.CatchingFishReduxKtor;
            if (arrayList.contains(str)) {
                catchingFishGlide.CatchingFishParcelableFAB.CatchingFishParcelableFAB(catchingFishGlide.CatchingFishSnackbar.CatchingFishPayPalLiveData(intent, i2));
                arrayList.remove(str);
                return true;
            }
        }
        this.CatchingFishWorkManager.remove(str);
        this.CatchingFishViewModelScope.putParcelable(str, new CatchingFishToolbar(intent, i2));
        return true;
    }

    public final void CatchingFishReduxKtor(String str) {
        LinkedHashMap linkedHashMap = this.CatchingFishSnackbar;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        CatchingFishMotionLayout catchingFishMotionLayout = new CatchingFishMotionLayout(0);
        Iterator it = new CatchingFishMVIManifest(new CatchingFishMVIAnimation(catchingFishMotionLayout, new CatchingFishFragmentFactory(12, catchingFishMotionLayout))).iterator();
        while (it.hasNext()) {
            Number number = (Number) it.next();
            Integer valueOf = Integer.valueOf(number.intValue());
            LinkedHashMap linkedHashMap2 = this.CatchingFishParcelableFAB;
            if (!linkedHashMap2.containsKey(valueOf)) {
                int intValue = number.intValue();
                linkedHashMap2.put(Integer.valueOf(intValue), str);
                linkedHashMap.put(str, Integer.valueOf(intValue));
                return;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void CatchingFishSnackbar(int i, CatchingFishFirebaseDagger catchingFishFirebaseDagger, Object obj) {
        Bundle bundle;
        int i2;
        ComponentActivity componentActivity = this.CatchingFishViewModelFAB;
        CatchingFishServiceHilt CatchingFishJobScheduler = catchingFishFirebaseDagger.CatchingFishJobScheduler(componentActivity, obj);
        if (CatchingFishJobScheduler != null) {
            new Handler(Looper.getMainLooper()).post(new CatchingFishHiltViewPager(i, 0, this, CatchingFishJobScheduler));
            return;
        }
        Intent CatchingFishSpannableWidget = catchingFishFirebaseDagger.CatchingFishSpannableWidget(componentActivity, obj);
        if (CatchingFishSpannableWidget.getExtras() != null) {
            Bundle extras = CatchingFishSpannableWidget.getExtras();
            CatchingFishFirebaseDagger.CatchingFishAnimationMockk(extras);
            if (extras.getClassLoader() == null) {
                CatchingFishSpannableWidget.setExtrasClassLoader(componentActivity.getClassLoader());
            }
        }
        if (CatchingFishSpannableWidget.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundle = CatchingFishSpannableWidget.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            CatchingFishSpannableWidget.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundle = null;
        }
        Bundle bundle2 = bundle;
        if (!"androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(CatchingFishSpannableWidget.getAction())) {
            if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(CatchingFishSpannableWidget.getAction())) {
                componentActivity.startActivityForResult(CatchingFishSpannableWidget, i, bundle2);
                return;
            }
            CatchingFishGlideEspresso catchingFishGlideEspresso = (CatchingFishGlideEspresso) CatchingFishSpannableWidget.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                CatchingFishFirebaseDagger.CatchingFishAnimationMockk(catchingFishGlideEspresso);
                i2 = i;
            } catch (IntentSender.SendIntentException e) {
                e = e;
                i2 = i;
            }
            try {
                componentActivity.startIntentSenderForResult(catchingFishGlideEspresso.CatchingFishReduxKtor, i2, catchingFishGlideEspresso.CatchingFishDaggerWebsocket, catchingFishGlideEspresso.CatchingFishWorkManager, catchingFishGlideEspresso.CatchingFishViewModelScope, 0, bundle2);
                return;
            } catch (IntentSender.SendIntentException e2) {
                e = e2;
                new Handler(Looper.getMainLooper()).post(new CatchingFishHiltViewPager(i2, 1, this, e));
                return;
            }
        }
        String[] stringArrayExtra = CatchingFishSpannableWidget.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        if (stringArrayExtra == null) {
            stringArrayExtra = new String[0];
        }
        HashSet hashSet = new HashSet();
        for (int i3 = 0; i3 < stringArrayExtra.length; i3++) {
            if (TextUtils.isEmpty(stringArrayExtra[i3])) {
                throw new IllegalArgumentException(CatchingFishMVPLiveData.CatchingFishStateLiveData(new StringBuilder("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(stringArrayExtra[i3], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i3));
            }
        }
        int size = hashSet.size();
        String[] strArr = size > 0 ? new String[stringArrayExtra.length - size] : stringArrayExtra;
        if (size > 0) {
            if (size == stringArrayExtra.length) {
                return;
            }
            int i4 = 0;
            for (int i5 = 0; i5 < stringArrayExtra.length; i5++) {
                if (!hashSet.contains(Integer.valueOf(i5))) {
                    strArr[i4] = stringArrayExtra[i5];
                    i4++;
                }
            }
        }
        if (componentActivity instanceof CatchingFishMVVMWidget) {
        }
        componentActivity.requestPermissions(stringArrayExtra, i);
    }
}
