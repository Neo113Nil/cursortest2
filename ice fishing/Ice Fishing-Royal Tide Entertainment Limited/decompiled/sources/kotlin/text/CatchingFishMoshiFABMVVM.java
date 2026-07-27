package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class CatchingFishMoshiFABMVVM {
    public final /* synthetic */ String CatchingFishCoroutine;
    public final /* synthetic */ int CatchingFishParcelableFAB;
    public final /* synthetic */ CatchingFishFirebaseDagger CatchingFishReduxKtor;
    public final /* synthetic */ CatchingFishGoogleMapsGson CatchingFishSnackbar;

    public /* synthetic */ CatchingFishMoshiFABMVVM(CatchingFishGoogleMapsGson catchingFishGoogleMapsGson, String str, CatchingFishFirebaseDagger catchingFishFirebaseDagger, int i) {
        this.CatchingFishParcelableFAB = i;
        this.CatchingFishSnackbar = catchingFishGoogleMapsGson;
        this.CatchingFishCoroutine = str;
        this.CatchingFishReduxKtor = catchingFishFirebaseDagger;
    }

    public final void CatchingFishParcelableFAB(Object obj) {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishGoogleMapsGson catchingFishGoogleMapsGson = this.CatchingFishSnackbar;
                LinkedHashMap linkedHashMap = catchingFishGoogleMapsGson.CatchingFishSnackbar;
                ArrayList arrayList = catchingFishGoogleMapsGson.CatchingFishReduxKtor;
                String str = this.CatchingFishCoroutine;
                Object obj2 = linkedHashMap.get(str);
                CatchingFishFirebaseDagger catchingFishFirebaseDagger = this.CatchingFishReduxKtor;
                if (obj2 == null) {
                    throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + catchingFishFirebaseDagger + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                }
                int intValue = ((Number) obj2).intValue();
                arrayList.add(str);
                try {
                    catchingFishGoogleMapsGson.CatchingFishSnackbar(intValue, catchingFishFirebaseDagger, obj);
                    return;
                } catch (Exception e) {
                    arrayList.remove(str);
                    throw e;
                }
            default:
                CatchingFishGoogleMapsGson catchingFishGoogleMapsGson2 = this.CatchingFishSnackbar;
                ArrayList arrayList2 = catchingFishGoogleMapsGson2.CatchingFishReduxKtor;
                LinkedHashMap linkedHashMap2 = catchingFishGoogleMapsGson2.CatchingFishSnackbar;
                String str2 = this.CatchingFishCoroutine;
                Object obj3 = linkedHashMap2.get(str2);
                CatchingFishFirebaseDagger catchingFishFirebaseDagger2 = this.CatchingFishReduxKtor;
                if (obj3 == null) {
                    throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + catchingFishFirebaseDagger2 + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                }
                int intValue2 = ((Number) obj3).intValue();
                arrayList2.add(str2);
                try {
                    catchingFishGoogleMapsGson2.CatchingFishSnackbar(intValue2, catchingFishFirebaseDagger2, obj);
                    return;
                } catch (Exception e2) {
                    arrayList2.remove(str2);
                    throw e2;
                }
        }
    }
}
