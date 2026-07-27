package kotlin.text;

import android.widget.FrameLayout;
import com.catchingfish.fishcatcherpro.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class CatchingFishMoshiKtorJUnit {
    public static final ArrayList CatchingFishCoroutine;
    public static final CatchingFishWebSocketView CatchingFishParcelableFAB;
    public static final ThreadLocal CatchingFishSnackbar;

    static {
        CatchingFishWebSocketView catchingFishWebSocketView = new CatchingFishWebSocketView();
        catchingFishWebSocketView.CatchingFishCustomView = new ArrayList();
        catchingFishWebSocketView.CatchingFishJobScheduler = false;
        catchingFishWebSocketView.CatchingFishPayPalService = 0;
        catchingFishWebSocketView.CatchingFishFragmentFactory = false;
        catchingFishWebSocketView.CatchingFishSensorManager(new CatchingFishLiveDataHilt(2));
        catchingFishWebSocketView.CatchingFishSensorManager(new CatchingFishGsonCoroutine());
        catchingFishWebSocketView.CatchingFishSensorManager(new CatchingFishLiveDataHilt(1));
        CatchingFishParcelableFAB = catchingFishWebSocketView;
        CatchingFishSnackbar = new ThreadLocal();
        CatchingFishCoroutine = new ArrayList();
    }

    public static void CatchingFishParcelableFAB(FrameLayout frameLayout, CatchingFishMockkRedux catchingFishMockkRedux) {
        ArrayList arrayList = CatchingFishCoroutine;
        if (arrayList.contains(frameLayout) || !frameLayout.isLaidOut()) {
            return;
        }
        arrayList.add(frameLayout);
        if (catchingFishMockkRedux == null) {
            catchingFishMockkRedux = CatchingFishParcelableFAB;
        }
        CatchingFishMockkRedux clone = catchingFishMockkRedux.clone();
        ArrayList arrayList2 = (ArrayList) CatchingFishSnackbar().get(frameLayout);
        if (arrayList2 != null && arrayList2.size() > 0) {
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                ((CatchingFishMockkRedux) obj).CatchingFishSpannableWidget(frameLayout);
            }
        }
        clone.CatchingFishViewModelFAB(frameLayout, true);
        if (frameLayout.getTag(R.id.transition_current_scene) != null) {
            throw new ClassCastException();
        }
        frameLayout.setTag(R.id.transition_current_scene, null);
        CatchingFishFABFluxAndroidX catchingFishFABFluxAndroidX = new CatchingFishFABFluxAndroidX();
        catchingFishFABFluxAndroidX.CatchingFishReduxKtor = clone;
        catchingFishFABFluxAndroidX.CatchingFishDaggerWebsocket = frameLayout;
        frameLayout.addOnAttachStateChangeListener(catchingFishFABFluxAndroidX);
        frameLayout.getViewTreeObserver().addOnPreDrawListener(catchingFishFABFluxAndroidX);
    }

    public static CatchingFishCameraXRetrofit CatchingFishSnackbar() {
        CatchingFishCameraXRetrofit catchingFishCameraXRetrofit;
        ThreadLocal threadLocal = CatchingFishSnackbar;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (catchingFishCameraXRetrofit = (CatchingFishCameraXRetrofit) weakReference.get()) != null) {
            return catchingFishCameraXRetrofit;
        }
        CatchingFishCameraXRetrofit catchingFishCameraXRetrofit2 = new CatchingFishCameraXRetrofit(0);
        threadLocal.set(new WeakReference(catchingFishCameraXRetrofit2));
        return catchingFishCameraXRetrofit2;
    }
}
