package kotlin.text;

import android.view.View;
import android.view.ViewGroup;
import com.catchingfish.fishcatcherpro.R;

/* loaded from: classes.dex */
public abstract class CatchingFishAsyncTaskGson {
    public static final ViewGroup.LayoutParams CatchingFishParcelableFAB = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ad  */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Collection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final CatchingFishRetrofitRoom CatchingFishParcelableFAB(CatchingFishSnackbar catchingFishSnackbar, CatchingFishMVIWebSocket catchingFishMVIWebSocket, CatchingFishLifecycleRedux catchingFishLifecycleRedux) {
        CatchingFishGradleCameraX catchingFishGradleCameraX;
        CatchingFishRetrofitRoom catchingFishRetrofitRoom;
        if (CatchingFishHandlerFirebase.CatchingFishParcelableFAB.compareAndSet(false, true)) {
            CatchingFishPicassoCameraX CatchingFishParcelableFAB2 = CatchingFishAdMobFAB.CatchingFishParcelableFAB(1, null, 6);
            CatchingFishXMLLayoutGlide.CatchingFishGsonAppCompat(CatchingFishGsonCardView.CatchingFishParcelableFAB((CatchingFishManifestMockk) CatchingFishContextFragment.CatchingFishStateLiveData.getValue()), null, new CatchingFishViewDaggerHilt(CatchingFishParcelableFAB2, null), 3);
            CatchingFishMVVM catchingFishMVVM = new CatchingFishMVVM(10, CatchingFishParcelableFAB2);
            synchronized (CatchingFishIntentBundle.CatchingFishCoroutine) {
                CatchingFishIntentBundle.CatchingFishLayout = CatchingFishCameraXCameraX.CatchingFishStripeAPI(CatchingFishIntentBundle.CatchingFishLayout, catchingFishMVVM);
            }
            CatchingFishIntentBundle.CatchingFishParcelableFAB();
        }
        if (catchingFishSnackbar.getChildCount() > 0) {
            View childAt = catchingFishSnackbar.getChildAt(0);
            if (childAt instanceof CatchingFishGradleCameraX) {
                catchingFishGradleCameraX = (CatchingFishGradleCameraX) childAt;
                if (catchingFishGradleCameraX == null) {
                    catchingFishGradleCameraX = new CatchingFishGradleCameraX(catchingFishSnackbar.getContext(), catchingFishMVIWebSocket.CatchingFishLayout());
                    catchingFishSnackbar.addView(catchingFishGradleCameraX.getView(), CatchingFishParcelableFAB);
                }
                Object tag = catchingFishGradleCameraX.getView().getTag(R.id.wrapped_composition_tag);
                catchingFishRetrofitRoom = tag instanceof CatchingFishRetrofitRoom ? (CatchingFishRetrofitRoom) tag : null;
                if (catchingFishRetrofitRoom == null) {
                    catchingFishRetrofitRoom = new CatchingFishRetrofitRoom(catchingFishGradleCameraX, new CatchingFishLayoutStripeAPI(catchingFishMVIWebSocket, new CatchingFishAsyncTaskDagger(catchingFishGradleCameraX.getRoot())));
                    catchingFishGradleCameraX.getView().setTag(R.id.wrapped_composition_tag, catchingFishRetrofitRoom);
                }
                catchingFishRetrofitRoom.CatchingFishWorkManager(catchingFishLifecycleRedux);
                if (!CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishGradleCameraX.getCoroutineContext(), catchingFishMVIWebSocket.CatchingFishLayout())) {
                    catchingFishGradleCameraX.setCoroutineContext(catchingFishMVIWebSocket.CatchingFishLayout());
                }
                return catchingFishRetrofitRoom;
            }
        } else {
            catchingFishSnackbar.removeAllViews();
        }
        catchingFishGradleCameraX = null;
        if (catchingFishGradleCameraX == null) {
        }
        Object tag2 = catchingFishGradleCameraX.getView().getTag(R.id.wrapped_composition_tag);
        if (tag2 instanceof CatchingFishRetrofitRoom) {
        }
        if (catchingFishRetrofitRoom == null) {
        }
        catchingFishRetrofitRoom.CatchingFishWorkManager(catchingFishLifecycleRedux);
        if (!CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishGradleCameraX.getCoroutineContext(), catchingFishMVIWebSocket.CatchingFishLayout())) {
        }
        return catchingFishRetrofitRoom;
    }
}
