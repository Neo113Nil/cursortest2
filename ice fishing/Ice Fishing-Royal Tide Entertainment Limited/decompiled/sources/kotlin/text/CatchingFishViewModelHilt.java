package kotlin.text;

import android.content.AttributionSource;
import android.content.Context;
import android.os.Build;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class CatchingFishViewModelHilt {
    public final CatchingFishServiceHilt CatchingFishCoroutine;
    public final CatchingFishFABMVICardView CatchingFishDaggerWebsocket;
    public final CatchingFishExoPlayerGson CatchingFishLayout;
    public final Context CatchingFishParcelableFAB;
    public final CatchingFishBundleGlide CatchingFishReduxKtor;
    public final String CatchingFishSnackbar;
    public final CatchingFishWidgetContext CatchingFishViewModelFAB;
    public final int CatchingFishViewModelScope;
    public final CatchingFishExoPlayerRoom CatchingFishWorkManager;

    public CatchingFishViewModelHilt(Context context, CatchingFishBundleGlide catchingFishBundleGlide, CatchingFishFABMVICardView catchingFishFABMVICardView, CatchingFishHiltMVIViewFAB catchingFishHiltMVIViewFAB) {
        AttributionSource attributionSource;
        CatchingFishToastHiltBundle.CatchingFishStateLiveData(context, "Null context is not permitted.");
        CatchingFishToastHiltBundle.CatchingFishStateLiveData(catchingFishBundleGlide, "Api must not be null.");
        CatchingFishToastHiltBundle.CatchingFishStateLiveData(catchingFishHiltMVIViewFAB, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        CatchingFishToastHiltBundle.CatchingFishStateLiveData(applicationContext, "The provided context did not have an application context.");
        this.CatchingFishParcelableFAB = applicationContext;
        int i = Build.VERSION.SDK_INT;
        CatchingFishServiceHilt catchingFishServiceHilt = null;
        String CatchingFishSnackbar = (i < 30 || i < 30) ? null : CatchingFishJUnitIntent.CatchingFishSnackbar(context);
        this.CatchingFishSnackbar = CatchingFishSnackbar;
        if (i >= 31) {
            attributionSource = context.getAttributionSource();
            catchingFishServiceHilt = new CatchingFishServiceHilt(18, attributionSource);
        }
        this.CatchingFishCoroutine = catchingFishServiceHilt;
        this.CatchingFishReduxKtor = catchingFishBundleGlide;
        this.CatchingFishDaggerWebsocket = catchingFishFABMVICardView;
        this.CatchingFishWorkManager = new CatchingFishExoPlayerRoom(catchingFishBundleGlide, catchingFishFABMVICardView, CatchingFishSnackbar);
        CatchingFishExoPlayerGson CatchingFishCoroutine = CatchingFishExoPlayerGson.CatchingFishCoroutine(applicationContext);
        this.CatchingFishLayout = CatchingFishCoroutine;
        this.CatchingFishViewModelScope = CatchingFishCoroutine.CatchingFishViewModelFAB.getAndIncrement();
        this.CatchingFishViewModelFAB = catchingFishHiltMVIViewFAB.CatchingFishParcelableFAB;
        CatchingFishPayPalRedux catchingFishPayPalRedux = CatchingFishCoroutine.CatchingFishOkHttp;
        catchingFishPayPalRedux.sendMessage(catchingFishPayPalRedux.obtainMessage(7, this));
    }

    public final CatchingFishAsyncTaskDagger CatchingFishParcelableFAB() {
        CatchingFishAsyncTaskDagger catchingFishAsyncTaskDagger = new CatchingFishAsyncTaskDagger(8, false);
        Set set = Collections.EMPTY_SET;
        if (((CatchingFishRoomStateFlow) catchingFishAsyncTaskDagger.CatchingFishDaggerWebsocket) == null) {
            catchingFishAsyncTaskDagger.CatchingFishDaggerWebsocket = new CatchingFishRoomStateFlow(0);
        }
        ((CatchingFishRoomStateFlow) catchingFishAsyncTaskDagger.CatchingFishDaggerWebsocket).addAll(set);
        Context context = this.CatchingFishParcelableFAB;
        catchingFishAsyncTaskDagger.CatchingFishViewModelScope = context.getClass().getName();
        catchingFishAsyncTaskDagger.CatchingFishWorkManager = context.getPackageName();
        return catchingFishAsyncTaskDagger;
    }

    public final CatchingFishWorkManagerMVP CatchingFishSnackbar(CatchingFishGlideFAB catchingFishGlideFAB) {
        CatchingFishAndroidXPayPal catchingFishAndroidXPayPal = new CatchingFishAndroidXPayPal();
        CatchingFishExoPlayerGson catchingFishExoPlayerGson = this.CatchingFishLayout;
        CatchingFishPayPalRedux catchingFishPayPalRedux = catchingFishExoPlayerGson.CatchingFishOkHttp;
        catchingFishPayPalRedux.sendMessage(catchingFishPayPalRedux.obtainMessage(4, new CatchingFishViewLifecycle(new CatchingFishFluxFABAndroidX(catchingFishGlideFAB, catchingFishAndroidXPayPal, this.CatchingFishViewModelFAB), catchingFishExoPlayerGson.CatchingFishLayout.get(), this)));
        return catchingFishAndroidXPayPal.CatchingFishParcelableFAB;
    }
}
