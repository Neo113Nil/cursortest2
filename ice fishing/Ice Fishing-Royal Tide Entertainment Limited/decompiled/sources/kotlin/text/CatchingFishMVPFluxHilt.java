package kotlin.text;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;

/* loaded from: classes.dex */
public final class CatchingFishMVPFluxHilt extends View {
    public static final CatchingFishLayoutPayPal CatchingFishUnitTesting = new CatchingFishLayoutPayPal(0);
    public CatchingFishGradleMVPKtor CatchingFishCloudMessaging;
    public final CatchingFishManifestPayPal CatchingFishDaggerWebsocket;
    public CatchingFishServiceHandler CatchingFishEspressoTesting;
    public CatchingFishOkHttpFlux CatchingFishFragmentHandler;
    public boolean CatchingFishLayout;
    public CatchingFishHiltMVI CatchingFishOkHttp;
    public final CatchingFishWidgetAppCompat CatchingFishReduxKtor;
    public Outline CatchingFishViewModelFAB;
    public boolean CatchingFishViewModelScope;
    public final CatchingFishEspressoMoshi CatchingFishWorkManager;

    public CatchingFishMVPFluxHilt(CatchingFishWidgetAppCompat catchingFishWidgetAppCompat, CatchingFishManifestPayPal catchingFishManifestPayPal, CatchingFishEspressoMoshi catchingFishEspressoMoshi) {
        super(catchingFishWidgetAppCompat.getContext());
        this.CatchingFishReduxKtor = catchingFishWidgetAppCompat;
        this.CatchingFishDaggerWebsocket = catchingFishManifestPayPal;
        this.CatchingFishWorkManager = catchingFishEspressoMoshi;
        setOutlineProvider(CatchingFishUnitTesting);
        this.CatchingFishLayout = true;
        this.CatchingFishFragmentHandler = CatchingFishLayoutRoomFAB.CatchingFishCoroutine;
        this.CatchingFishCloudMessaging = CatchingFishGradleMVPKtor.CatchingFishReduxKtor;
        CatchingFishFirebaseRealm.CatchingFishParcelableFAB.getClass();
        this.CatchingFishEspressoTesting = CatchingFishMVI.CatchingFishCoroutineFlow;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        CatchingFishManifestPayPal catchingFishManifestPayPal = this.CatchingFishDaggerWebsocket;
        CatchingFishRoom catchingFishRoom = catchingFishManifestPayPal.CatchingFishParcelableFAB;
        Canvas canvas2 = catchingFishRoom.CatchingFishParcelableFAB;
        catchingFishRoom.CatchingFishParcelableFAB = canvas;
        CatchingFishOkHttpFlux catchingFishOkHttpFlux = this.CatchingFishFragmentHandler;
        CatchingFishGradleMVPKtor catchingFishGradleMVPKtor = this.CatchingFishCloudMessaging;
        float width = getWidth();
        float height = getHeight();
        long floatToRawIntBits = (Float.floatToRawIntBits(height) & 4294967295L) | (Float.floatToRawIntBits(width) << 32);
        CatchingFishHiltMVI catchingFishHiltMVI = this.CatchingFishOkHttp;
        CatchingFishServiceHandler catchingFishServiceHandler = this.CatchingFishEspressoTesting;
        CatchingFishEspressoMoshi catchingFishEspressoMoshi = this.CatchingFishWorkManager;
        CatchingFishAsyncTaskDagger catchingFishAsyncTaskDagger = catchingFishEspressoMoshi.CatchingFishDaggerWebsocket;
        CatchingFishJUnitDataStore catchingFishJUnitDataStore = ((CatchingFishEspressoMoshi) catchingFishAsyncTaskDagger.CatchingFishViewModelScope).CatchingFishReduxKtor;
        CatchingFishOkHttpFlux catchingFishOkHttpFlux2 = catchingFishJUnitDataStore.CatchingFishParcelableFAB;
        CatchingFishGradleMVPKtor catchingFishGradleMVPKtor2 = catchingFishJUnitDataStore.CatchingFishSnackbar;
        CatchingFishOkHttpHandler CatchingFishCardViewView = catchingFishAsyncTaskDagger.CatchingFishCardViewView();
        CatchingFishAsyncTaskDagger catchingFishAsyncTaskDagger2 = catchingFishEspressoMoshi.CatchingFishDaggerWebsocket;
        long CatchingFishDagger = catchingFishAsyncTaskDagger2.CatchingFishDagger();
        CatchingFishHiltMVI catchingFishHiltMVI2 = (CatchingFishHiltMVI) catchingFishAsyncTaskDagger2.CatchingFishWorkManager;
        catchingFishAsyncTaskDagger2.CatchingFishNavigationGson(catchingFishOkHttpFlux);
        catchingFishAsyncTaskDagger2.CatchingFishRedux(catchingFishGradleMVPKtor);
        catchingFishAsyncTaskDagger2.CatchingFishAndroidX(catchingFishRoom);
        catchingFishAsyncTaskDagger2.CatchingFishCustomViewJUnit(floatToRawIntBits);
        catchingFishAsyncTaskDagger2.CatchingFishWorkManager = catchingFishHiltMVI;
        catchingFishRoom.CatchingFishCloudMessaging();
        try {
            catchingFishServiceHandler.CatchingFishFragmentHandler(catchingFishEspressoMoshi);
            catchingFishRoom.CatchingFishLayout();
            catchingFishAsyncTaskDagger2.CatchingFishNavigationGson(catchingFishOkHttpFlux2);
            catchingFishAsyncTaskDagger2.CatchingFishRedux(catchingFishGradleMVPKtor2);
            catchingFishAsyncTaskDagger2.CatchingFishAndroidX(CatchingFishCardViewView);
            catchingFishAsyncTaskDagger2.CatchingFishCustomViewJUnit(CatchingFishDagger);
            catchingFishAsyncTaskDagger2.CatchingFishWorkManager = catchingFishHiltMVI2;
            catchingFishManifestPayPal.CatchingFishParcelableFAB.CatchingFishParcelableFAB = canvas2;
            this.CatchingFishViewModelScope = false;
        } catch (Throwable th) {
            catchingFishRoom.CatchingFishLayout();
            catchingFishAsyncTaskDagger2.CatchingFishNavigationGson(catchingFishOkHttpFlux2);
            catchingFishAsyncTaskDagger2.CatchingFishRedux(catchingFishGradleMVPKtor2);
            catchingFishAsyncTaskDagger2.CatchingFishAndroidX(CatchingFishCardViewView);
            catchingFishAsyncTaskDagger2.CatchingFishCustomViewJUnit(CatchingFishDagger);
            catchingFishAsyncTaskDagger2.CatchingFishWorkManager = catchingFishHiltMVI2;
            throw th;
        }
    }

    public final boolean getCanUseCompositingLayer$ui_graphics_release() {
        return this.CatchingFishLayout;
    }

    public final CatchingFishManifestPayPal getCanvasHolder() {
        return this.CatchingFishDaggerWebsocket;
    }

    public final View getOwnerView() {
        return this.CatchingFishReduxKtor;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.CatchingFishLayout;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.CatchingFishViewModelScope) {
            return;
        }
        this.CatchingFishViewModelScope = true;
        super.invalidate();
    }

    public final void setCanUseCompositingLayer$ui_graphics_release(boolean z) {
        if (this.CatchingFishLayout != z) {
            this.CatchingFishLayout = z;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z) {
        this.CatchingFishViewModelScope = z;
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
