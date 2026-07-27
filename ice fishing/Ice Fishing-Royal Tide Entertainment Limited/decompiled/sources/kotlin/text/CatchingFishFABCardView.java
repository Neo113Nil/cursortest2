package kotlin.text;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public final class CatchingFishFABCardView implements ServiceConnection {
    public final CatchingFishMVINavigation CatchingFishCoroutine;
    public Context CatchingFishParcelableFAB;
    public final CatchingFishPayPalToast CatchingFishSnackbar;

    public CatchingFishFABCardView(CatchingFishPayPalToast catchingFishPayPalToast, CatchingFishMVINavigation catchingFishMVINavigation) {
        this.CatchingFishSnackbar = catchingFishPayPalToast;
        this.CatchingFishCoroutine = catchingFishMVINavigation;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        CatchingFishToastGson catchingFishToastGson;
        if (this.CatchingFishParcelableFAB == null) {
            throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
        int i = CatchingFishReduxWebSocket.CatchingFishOkHttp;
        if (iBinder == null) {
            catchingFishToastGson = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface(CatchingFishToastGson.CatchingFishCoroutine);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof CatchingFishToastGson)) {
                CatchingFishFABNavigation catchingFishFABNavigation = new CatchingFishFABNavigation();
                catchingFishFABNavigation.CatchingFishEspressoTesting = iBinder;
                catchingFishToastGson = catchingFishFABNavigation;
            } else {
                catchingFishToastGson = (CatchingFishToastGson) queryLocalInterface;
            }
        }
        CatchingFishGsonAdMob catchingFishGsonAdMob = new CatchingFishGsonAdMob(catchingFishToastGson, componentName);
        CatchingFishFirebaseDagger.CatchingFishNavigation(componentName, "name");
        this.CatchingFishSnackbar.CatchingFishFragmentHandler(catchingFishGsonAdMob);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(componentName, "name");
        this.CatchingFishCoroutine.CatchingFishParcelableFAB();
    }
}
