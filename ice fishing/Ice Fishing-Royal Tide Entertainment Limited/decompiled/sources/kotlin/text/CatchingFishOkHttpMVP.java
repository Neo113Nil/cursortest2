package kotlin.text;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class CatchingFishOkHttpMVP extends WindowInsetsAnimation$Callback {
    public ArrayList CatchingFishCoroutine;
    public final CatchingFishReduxLayout CatchingFishParcelableFAB;
    public final HashMap CatchingFishReduxKtor;
    public List CatchingFishSnackbar;

    public CatchingFishOkHttpMVP(CatchingFishReduxLayout catchingFishReduxLayout) {
        super(catchingFishReduxLayout.CatchingFishReduxKtor);
        this.CatchingFishReduxKtor = new HashMap();
        this.CatchingFishParcelableFAB = catchingFishReduxLayout;
    }

    public final CatchingFishGoogleMapsJUnit CatchingFishParcelableFAB(WindowInsetsAnimation windowInsetsAnimation) {
        CatchingFishGoogleMapsJUnit catchingFishGoogleMapsJUnit = (CatchingFishGoogleMapsJUnit) this.CatchingFishReduxKtor.get(windowInsetsAnimation);
        if (catchingFishGoogleMapsJUnit != null) {
            return catchingFishGoogleMapsJUnit;
        }
        CatchingFishGoogleMapsJUnit catchingFishGoogleMapsJUnit2 = new CatchingFishGoogleMapsJUnit(0, null, 0L);
        catchingFishGoogleMapsJUnit2.CatchingFishParcelableFAB = new CatchingFishServiceService(windowInsetsAnimation);
        this.CatchingFishReduxKtor.put(windowInsetsAnimation, catchingFishGoogleMapsJUnit2);
        return catchingFishGoogleMapsJUnit2;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.CatchingFishParcelableFAB.CatchingFishReduxKtor(CatchingFishParcelableFAB(windowInsetsAnimation));
        this.CatchingFishReduxKtor.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.CatchingFishParcelableFAB.CatchingFishDaggerWebsocket(CatchingFishParcelableFAB(windowInsetsAnimation));
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        float fraction;
        ArrayList arrayList = this.CatchingFishCoroutine;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.CatchingFishCoroutine = arrayList2;
            this.CatchingFishSnackbar = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation CatchingFishCloudMessaging = CatchingFishCameraX.CatchingFishCloudMessaging(list.get(size));
            CatchingFishGoogleMapsJUnit CatchingFishParcelableFAB = CatchingFishParcelableFAB(CatchingFishCloudMessaging);
            fraction = CatchingFishCloudMessaging.getFraction();
            CatchingFishParcelableFAB.CatchingFishParcelableFAB.CatchingFishDaggerWebsocket(fraction);
            this.CatchingFishCoroutine.add(CatchingFishParcelableFAB);
        }
        return this.CatchingFishParcelableFAB.CatchingFishWorkManager(CatchingFishKtorPicassoMVVM.CatchingFishViewModelScope(null, windowInsets), this.CatchingFishSnackbar).CatchingFishWorkManager();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        CatchingFishViewModelIntent CatchingFishViewModelScope = this.CatchingFishParcelableFAB.CatchingFishViewModelScope(CatchingFishParcelableFAB(windowInsetsAnimation), new CatchingFishViewModelIntent(bounds));
        CatchingFishViewModelScope.getClass();
        CatchingFishCameraX.CatchingFishUnitTesting();
        return CatchingFishCameraX.CatchingFishLayout(((CatchingFishReduxPayPal) CatchingFishViewModelScope.CatchingFishDaggerWebsocket).CatchingFishReduxKtor(), ((CatchingFishReduxPayPal) CatchingFishViewModelScope.CatchingFishWorkManager).CatchingFishReduxKtor());
    }
}
