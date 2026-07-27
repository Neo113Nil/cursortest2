package kotlin.text;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.FragmentActivity;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishFABLifecycle implements CatchingFishViewPagerMVI {
    public final /* synthetic */ int CatchingFishParcelableFAB;
    public final /* synthetic */ ComponentActivity CatchingFishSnackbar;

    public /* synthetic */ CatchingFishFABLifecycle(ComponentActivity componentActivity, int i) {
        this.CatchingFishParcelableFAB = i;
        this.CatchingFishSnackbar = componentActivity;
    }

    @Override // kotlin.text.CatchingFishViewPagerMVI
    public final void CatchingFishParcelableFAB(ComponentActivity componentActivity) {
        int i = this.CatchingFishParcelableFAB;
        ComponentActivity componentActivity2 = this.CatchingFishSnackbar;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i2 = ComponentActivity.CatchingFishParcelableFlux;
                CatchingFishFirebaseDagger.CatchingFishNavigation(componentActivity, "it");
                Bundle CatchingFishDaggerWebsocket = ((CatchingFishViewModelIntent) componentActivity2.CatchingFishViewModelScope.CatchingFishWorkManager).CatchingFishDaggerWebsocket("android:support:activity-result");
                if (CatchingFishDaggerWebsocket != null) {
                    CatchingFishGoogleMapsGson catchingFishGoogleMapsGson = componentActivity2.CatchingFishEspressoTesting;
                    LinkedHashMap linkedHashMap = catchingFishGoogleMapsGson.CatchingFishSnackbar;
                    LinkedHashMap linkedHashMap2 = catchingFishGoogleMapsGson.CatchingFishParcelableFAB;
                    Bundle bundle = catchingFishGoogleMapsGson.CatchingFishViewModelScope;
                    ArrayList<Integer> integerArrayList = CatchingFishDaggerWebsocket.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = CatchingFishDaggerWebsocket.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList != null && integerArrayList != null) {
                        ArrayList<String> stringArrayList2 = CatchingFishDaggerWebsocket.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                        if (stringArrayList2 != null) {
                            catchingFishGoogleMapsGson.CatchingFishReduxKtor.addAll(stringArrayList2);
                        }
                        Bundle bundle2 = CatchingFishDaggerWebsocket.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                        if (bundle2 != null) {
                            bundle.putAll(bundle2);
                        }
                        int size = stringArrayList.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            String str = stringArrayList.get(i3);
                            if (linkedHashMap.containsKey(str)) {
                                Integer num = (Integer) linkedHashMap.remove(str);
                                if (!bundle.containsKey(str)) {
                                    CatchingFishLayoutRoomFAB.CatchingFishLayout(linkedHashMap2).remove(num);
                                }
                            }
                            Integer num2 = integerArrayList.get(i3);
                            CatchingFishFirebaseDagger.CatchingFishRoomDatabase(num2, "get(...)");
                            int intValue = num2.intValue();
                            String str2 = stringArrayList.get(i3);
                            CatchingFishFirebaseDagger.CatchingFishRoomDatabase(str2, "get(...)");
                            String str3 = str2;
                            linkedHashMap2.put(Integer.valueOf(intValue), str3);
                            catchingFishGoogleMapsGson.CatchingFishSnackbar.put(str3, Integer.valueOf(intValue));
                        }
                        break;
                    }
                }
                break;
            default:
                CatchingFishMVIPicasso catchingFishMVIPicasso = (CatchingFishMVIPicasso) ((FragmentActivity) componentActivity2).CatchingFishGsonAppCompat.CatchingFishDaggerWebsocket;
                catchingFishMVIPicasso.CatchingFishSpannableWidget.CatchingFishSnackbar(catchingFishMVIPicasso, catchingFishMVIPicasso, null);
                break;
        }
    }
}
