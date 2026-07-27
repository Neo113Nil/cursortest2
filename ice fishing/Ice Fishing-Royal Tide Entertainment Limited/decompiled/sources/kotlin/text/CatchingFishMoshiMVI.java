package kotlin.text;

import android.os.Bundle;
import android.view.View;
import androidx.activity.ComponentActivity;
import com.android.installreferrer.api.InstallReferrerClient;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class CatchingFishMoshiMVI implements CatchingFishMVPViewService {
    public final Object CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;

    public /* synthetic */ CatchingFishMoshiMVI(int i, Object obj) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = obj;
    }

    @Override // kotlin.text.CatchingFishMVPViewService
    public final void CatchingFishSnackbar(CatchingFishToastFlux catchingFishToastFlux, CatchingFishToolbarLiveData catchingFishToolbarLiveData) {
        View view;
        int i = this.CatchingFishReduxKtor;
        Object obj = this.CatchingFishDaggerWebsocket;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishJUnitLiveData catchingFishJUnitLiveData = (CatchingFishJUnitLiveData) obj;
                if (catchingFishToolbarLiveData != CatchingFishToolbarLiveData.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                catchingFishToastFlux.CatchingFishDaggerWebsocket().CatchingFishWorkManager(this);
                Bundle CatchingFishDaggerWebsocket = catchingFishJUnitLiveData.CatchingFishParcelableFAB().CatchingFishDaggerWebsocket("androidx.savedstate.Restarter");
                if (CatchingFishDaggerWebsocket == null) {
                    return;
                }
                ArrayList<String> stringArrayList = CatchingFishDaggerWebsocket.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    throw new IllegalStateException("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                int size = stringArrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    String str = stringArrayList.get(i2);
                    i2++;
                    String str2 = str;
                    try {
                        Class<? extends U> asSubclass = Class.forName(str2, false, CatchingFishMoshiMVI.class.getClassLoader()).asSubclass(CatchingFishWidgetPicasso.class);
                        CatchingFishFirebaseDagger.CatchingFishAnimationMockk(asSubclass);
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object newInstance = declaredConstructor.newInstance(null);
                                CatchingFishFirebaseDagger.CatchingFishAnimationMockk(newInstance);
                                if (!(catchingFishJUnitLiveData instanceof CatchingFishDataStoreFlux)) {
                                    throw new IllegalStateException(("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: " + catchingFishJUnitLiveData).toString());
                                }
                                CatchingFishManifestService CatchingFishReduxKtor = ((CatchingFishDataStoreFlux) catchingFishJUnitLiveData).CatchingFishReduxKtor();
                                CatchingFishViewModelIntent CatchingFishParcelableFAB = catchingFishJUnitLiveData.CatchingFishParcelableFAB();
                                CatchingFishReduxKtor.getClass();
                                LinkedHashMap linkedHashMap = CatchingFishReduxKtor.CatchingFishParcelableFAB;
                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    String str3 = (String) it.next();
                                    CatchingFishFirebaseDagger.CatchingFishNavigation(str3, "key");
                                    CatchingFishLayoutGlide catchingFishLayoutGlide = (CatchingFishLayoutGlide) linkedHashMap.get(str3);
                                    if (catchingFishLayoutGlide != null) {
                                        CatchingFishBiometricBundle.CatchingFishCoroutine(catchingFishLayoutGlide, CatchingFishParcelableFAB, catchingFishJUnitLiveData.CatchingFishDaggerWebsocket());
                                    }
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    CatchingFishParcelableFAB.CatchingFishMVPRobolectric();
                                }
                            } catch (Exception e) {
                                throw new RuntimeException("Failed to instantiate " + str2, e);
                            }
                        } catch (NoSuchMethodException e2) {
                            throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                        }
                    } catch (ClassNotFoundException e3) {
                        throw new RuntimeException(CatchingFishMVPLiveData.CatchingFishOkHttp("Class ", str2, " wasn't found"), e3);
                    }
                }
                return;
            case 1:
                ComponentActivity componentActivity = (ComponentActivity) obj;
                int i3 = ComponentActivity.CatchingFishParcelableFlux;
                if (componentActivity.CatchingFishViewModelFAB == null) {
                    CatchingFishKtorMoshiGson catchingFishKtorMoshiGson = (CatchingFishKtorMoshiGson) componentActivity.getLastNonConfigurationInstance();
                    if (catchingFishKtorMoshiGson != null) {
                        componentActivity.CatchingFishViewModelFAB = catchingFishKtorMoshiGson.CatchingFishParcelableFAB;
                    }
                    if (componentActivity.CatchingFishViewModelFAB == null) {
                        componentActivity.CatchingFishViewModelFAB = new CatchingFishManifestService();
                    }
                }
                componentActivity.CatchingFishReduxKtor.CatchingFishWorkManager(this);
                return;
            case 2:
                new HashMap();
                CatchingFishPicassoRoom[] catchingFishPicassoRoomArr = (CatchingFishPicassoRoom[]) obj;
                if (catchingFishPicassoRoomArr.length > 0) {
                    CatchingFishPicassoRoom catchingFishPicassoRoom = catchingFishPicassoRoomArr[0];
                    throw null;
                }
                if (catchingFishPicassoRoomArr.length <= 0) {
                    return;
                }
                CatchingFishPicassoRoom catchingFishPicassoRoom2 = catchingFishPicassoRoomArr[0];
                throw null;
            case 3:
                if (catchingFishToolbarLiveData != CatchingFishToolbarLiveData.ON_STOP || (view = ((CatchingFishGoogleMapsMoshi) obj).CatchingFishPayPalService) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
                return;
            default:
                if (catchingFishToolbarLiveData == CatchingFishToolbarLiveData.ON_CREATE) {
                    catchingFishToastFlux.CatchingFishDaggerWebsocket().CatchingFishWorkManager(this);
                    ((CatchingFishMockkRoom) obj).CatchingFishSnackbar();
                    return;
                } else {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + catchingFishToolbarLiveData).toString());
                }
        }
    }
}
