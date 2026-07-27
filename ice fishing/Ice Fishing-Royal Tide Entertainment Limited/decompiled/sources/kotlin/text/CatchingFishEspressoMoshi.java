package kotlin.text;

import android.graphics.Paint;
import android.graphics.Shader;

/* loaded from: classes.dex */
public final class CatchingFishEspressoMoshi implements CatchingFishPicassoManifest {
    public final CatchingFishAsyncTaskDagger CatchingFishDaggerWebsocket;
    public final CatchingFishJUnitDataStore CatchingFishReduxKtor;
    public CatchingFishFluxFirebase CatchingFishViewModelScope;
    public CatchingFishFluxFirebase CatchingFishWorkManager;

    public CatchingFishEspressoMoshi() {
        CatchingFishMockkWebSocket catchingFishMockkWebSocket = CatchingFishLayoutRoomFAB.CatchingFishCoroutine;
        CatchingFishJUnitDataStore catchingFishJUnitDataStore = new CatchingFishJUnitDataStore();
        catchingFishJUnitDataStore.CatchingFishParcelableFAB = catchingFishMockkWebSocket;
        catchingFishJUnitDataStore.CatchingFishSnackbar = CatchingFishGradleMVPKtor.CatchingFishReduxKtor;
        catchingFishJUnitDataStore.CatchingFishCoroutine = CatchingFishMVPGsonFABRoom.CatchingFishParcelableFAB;
        catchingFishJUnitDataStore.CatchingFishReduxKtor = 0L;
        this.CatchingFishReduxKtor = catchingFishJUnitDataStore;
        this.CatchingFishDaggerWebsocket = new CatchingFishAsyncTaskDagger(this);
    }

    public static CatchingFishFluxFirebase CatchingFishParcelableFAB(CatchingFishEspressoMoshi catchingFishEspressoMoshi, long j, CatchingFishFirebaseDagger catchingFishFirebaseDagger, int i) {
        CatchingFishFluxFirebase CatchingFishViewModelFAB = catchingFishEspressoMoshi.CatchingFishViewModelFAB(catchingFishFirebaseDagger);
        if (!CatchingFishToastFragment.CatchingFishCoroutine(CatchingFishFirebaseDagger.CatchingFishSnackbar(((Paint) CatchingFishViewModelFAB.CatchingFishSnackbar).getColor()), j)) {
            CatchingFishViewModelFAB.CatchingFishDaggerWebsocket(j);
        }
        if (((Shader) CatchingFishViewModelFAB.CatchingFishCoroutine) != null) {
            CatchingFishViewModelFAB.CatchingFishCoroutine = null;
            ((Paint) CatchingFishViewModelFAB.CatchingFishSnackbar).setShader(null);
        }
        if (!CatchingFishFirebaseDagger.CatchingFishOkHttp((CatchingFishFluxIntent) CatchingFishViewModelFAB.CatchingFishReduxKtor, null)) {
            CatchingFishViewModelFAB.CatchingFishWorkManager(null);
        }
        if (CatchingFishViewModelFAB.CatchingFishParcelableFAB != i) {
            CatchingFishViewModelFAB.CatchingFishReduxKtor(i);
        }
        if (((Paint) CatchingFishViewModelFAB.CatchingFishSnackbar).isFilterBitmap()) {
            return CatchingFishViewModelFAB;
        }
        ((Paint) CatchingFishViewModelFAB.CatchingFishSnackbar).setFilterBitmap(true);
        return CatchingFishViewModelFAB;
    }

    @Override // kotlin.text.CatchingFishOkHttpFlux
    public final float CatchingFishDaggerWebsocket() {
        return this.CatchingFishReduxKtor.CatchingFishParcelableFAB.CatchingFishDaggerWebsocket();
    }

    @Override // kotlin.text.CatchingFishOkHttpFlux
    public final float CatchingFishFragmentHandler() {
        return this.CatchingFishReduxKtor.CatchingFishParcelableFAB.CatchingFishFragmentHandler();
    }

    @Override // kotlin.text.CatchingFishPicassoManifest
    public final void CatchingFishGsonAppCompat(long j, long j2, long j3, float f, int i) {
        CatchingFishOkHttpHandler catchingFishOkHttpHandler = this.CatchingFishReduxKtor.CatchingFishCoroutine;
        CatchingFishFluxFirebase catchingFishFluxFirebase = this.CatchingFishViewModelScope;
        if (catchingFishFluxFirebase == null) {
            catchingFishFluxFirebase = CatchingFishBiometricBundle.CatchingFishSnackbar();
            catchingFishFluxFirebase.CatchingFishViewModelScope(1);
            this.CatchingFishViewModelScope = catchingFishFluxFirebase;
        }
        Paint paint = (Paint) catchingFishFluxFirebase.CatchingFishSnackbar;
        if (!CatchingFishToastFragment.CatchingFishCoroutine(CatchingFishFirebaseDagger.CatchingFishSnackbar(paint.getColor()), j)) {
            catchingFishFluxFirebase.CatchingFishDaggerWebsocket(j);
        }
        if (((Shader) catchingFishFluxFirebase.CatchingFishCoroutine) != null) {
            catchingFishFluxFirebase.CatchingFishCoroutine = null;
            ((Paint) catchingFishFluxFirebase.CatchingFishSnackbar).setShader(null);
        }
        if (!CatchingFishFirebaseDagger.CatchingFishOkHttp((CatchingFishFluxIntent) catchingFishFluxFirebase.CatchingFishReduxKtor, null)) {
            catchingFishFluxFirebase.CatchingFishWorkManager(null);
        }
        if (catchingFishFluxFirebase.CatchingFishParcelableFAB != 3) {
            catchingFishFluxFirebase.CatchingFishReduxKtor(3);
        }
        if (paint.getStrokeWidth() != f) {
            ((Paint) catchingFishFluxFirebase.CatchingFishSnackbar).setStrokeWidth(f);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            ((Paint) catchingFishFluxFirebase.CatchingFishSnackbar).setStrokeMiter(4.0f);
        }
        if (catchingFishFluxFirebase.CatchingFishParcelableFAB() != i) {
            ((Paint) catchingFishFluxFirebase.CatchingFishSnackbar).setStrokeCap(i == 2 ? Paint.Cap.SQUARE : i == 1 ? Paint.Cap.ROUND : i == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT);
        }
        if (catchingFishFluxFirebase.CatchingFishSnackbar() != 0) {
            ((Paint) catchingFishFluxFirebase.CatchingFishSnackbar).setStrokeJoin(Paint.Join.MITER);
        }
        if (!paint.isFilterBitmap()) {
            ((Paint) catchingFishFluxFirebase.CatchingFishSnackbar).setFilterBitmap(true);
        }
        catchingFishOkHttpHandler.CatchingFishCoroutine(j2, j3, catchingFishFluxFirebase);
    }

    @Override // kotlin.text.CatchingFishPicassoManifest
    public final void CatchingFishJobScheduler(long j, long j2, long j3, CatchingFishFirebaseDagger catchingFishFirebaseDagger, int i) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        this.CatchingFishReduxKtor.CatchingFishCoroutine.CatchingFishParcelableFAB(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i3), CatchingFishParcelableFAB(this, j, catchingFishFirebaseDagger, i));
    }

    @Override // kotlin.text.CatchingFishPicassoManifest
    public final void CatchingFishMVPRobolectric(CatchingFishMoshiRealm catchingFishMoshiRealm, CatchingFishRobolectricHilt catchingFishRobolectricHilt, float f, CatchingFishFirebaseDagger catchingFishFirebaseDagger) {
        this.CatchingFishReduxKtor.CatchingFishCoroutine.CatchingFishOkHttp(catchingFishMoshiRealm, CatchingFishSnackbar(catchingFishRobolectricHilt, catchingFishFirebaseDagger, f, null, 1));
    }

    @Override // kotlin.text.CatchingFishPicassoManifest
    public final void CatchingFishMutableLiveData(CatchingFishWidgetWebSocket catchingFishWidgetWebSocket, long j, long j2, long j3, float f, CatchingFishFluxIntent catchingFishFluxIntent, int i) {
        this.CatchingFishReduxKtor.CatchingFishCoroutine.CatchingFishViewModelScope(catchingFishWidgetWebSocket, j, j2, j3, CatchingFishSnackbar(null, CatchingFishContextHilt.CatchingFishCoroutineFlow, f, catchingFishFluxIntent, i));
    }

    @Override // kotlin.text.CatchingFishPicassoManifest
    public final void CatchingFishReduxKtor(long j, float f, long j2, CatchingFishFirebaseDagger catchingFishFirebaseDagger) {
        this.CatchingFishReduxKtor.CatchingFishCoroutine.CatchingFishFragmentHandler(f, j2, CatchingFishParcelableFAB(this, j, catchingFishFirebaseDagger, 3));
    }

    @Override // kotlin.text.CatchingFishPicassoManifest
    public final CatchingFishAsyncTaskDagger CatchingFishRoomDatabase() {
        return this.CatchingFishDaggerWebsocket;
    }

    public final CatchingFishFluxFirebase CatchingFishSnackbar(CatchingFishRobolectricHilt catchingFishRobolectricHilt, CatchingFishFirebaseDagger catchingFishFirebaseDagger, float f, CatchingFishFluxIntent catchingFishFluxIntent, int i) {
        CatchingFishFluxFirebase CatchingFishViewModelFAB = CatchingFishViewModelFAB(catchingFishFirebaseDagger);
        if (catchingFishRobolectricHilt != null) {
            catchingFishRobolectricHilt.CatchingFishFragmentHandler(f, CatchingFishNavigation(), CatchingFishViewModelFAB);
        } else {
            if (((Shader) CatchingFishViewModelFAB.CatchingFishCoroutine) != null) {
                CatchingFishViewModelFAB.CatchingFishCoroutine = null;
                ((Paint) CatchingFishViewModelFAB.CatchingFishSnackbar).setShader(null);
            }
            long CatchingFishSnackbar = CatchingFishFirebaseDagger.CatchingFishSnackbar(((Paint) CatchingFishViewModelFAB.CatchingFishSnackbar).getColor());
            long j = CatchingFishToastFragment.CatchingFishSnackbar;
            if (!CatchingFishToastFragment.CatchingFishCoroutine(CatchingFishSnackbar, j)) {
                CatchingFishViewModelFAB.CatchingFishDaggerWebsocket(j);
            }
            if (((Paint) CatchingFishViewModelFAB.CatchingFishSnackbar).getAlpha() / 255.0f != f) {
                CatchingFishViewModelFAB.CatchingFishCoroutine(f);
            }
        }
        if (!CatchingFishFirebaseDagger.CatchingFishOkHttp((CatchingFishFluxIntent) CatchingFishViewModelFAB.CatchingFishReduxKtor, catchingFishFluxIntent)) {
            CatchingFishViewModelFAB.CatchingFishWorkManager(catchingFishFluxIntent);
        }
        if (CatchingFishViewModelFAB.CatchingFishParcelableFAB != 3) {
            CatchingFishViewModelFAB.CatchingFishReduxKtor(3);
        }
        if (((Paint) CatchingFishViewModelFAB.CatchingFishSnackbar).isFilterBitmap() == i) {
            return CatchingFishViewModelFAB;
        }
        ((Paint) CatchingFishViewModelFAB.CatchingFishSnackbar).setFilterBitmap(true ^ (i == 0));
        return CatchingFishViewModelFAB;
    }

    public final CatchingFishFluxFirebase CatchingFishViewModelFAB(CatchingFishFirebaseDagger catchingFishFirebaseDagger) {
        if (CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishFirebaseDagger, CatchingFishContextHilt.CatchingFishCoroutineFlow)) {
            CatchingFishFluxFirebase catchingFishFluxFirebase = this.CatchingFishWorkManager;
            if (catchingFishFluxFirebase != null) {
                return catchingFishFluxFirebase;
            }
            CatchingFishFluxFirebase CatchingFishSnackbar = CatchingFishBiometricBundle.CatchingFishSnackbar();
            CatchingFishSnackbar.CatchingFishViewModelScope(0);
            this.CatchingFishWorkManager = CatchingFishSnackbar;
            return CatchingFishSnackbar;
        }
        if (!(catchingFishFirebaseDagger instanceof CatchingFishEspressoBundle)) {
            throw new CatchingFishBiometricView();
        }
        CatchingFishFluxFirebase catchingFishFluxFirebase2 = this.CatchingFishViewModelScope;
        if (catchingFishFluxFirebase2 == null) {
            catchingFishFluxFirebase2 = CatchingFishBiometricBundle.CatchingFishSnackbar();
            catchingFishFluxFirebase2.CatchingFishViewModelScope(1);
            this.CatchingFishViewModelScope = catchingFishFluxFirebase2;
        }
        Paint paint = (Paint) catchingFishFluxFirebase2.CatchingFishSnackbar;
        float strokeWidth = paint.getStrokeWidth();
        CatchingFishEspressoBundle catchingFishEspressoBundle = (CatchingFishEspressoBundle) catchingFishFirebaseDagger;
        float f = catchingFishEspressoBundle.CatchingFishCoroutineFlow;
        if (strokeWidth != f) {
            ((Paint) catchingFishFluxFirebase2.CatchingFishSnackbar).setStrokeWidth(f);
        }
        int CatchingFishParcelableFAB = catchingFishFluxFirebase2.CatchingFishParcelableFAB();
        int i = catchingFishEspressoBundle.CatchingFishSpannableWidget;
        if (CatchingFishParcelableFAB != i) {
            ((Paint) catchingFishFluxFirebase2.CatchingFishSnackbar).setStrokeCap(i == 2 ? Paint.Cap.SQUARE : i == 1 ? Paint.Cap.ROUND : i == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT);
        }
        float strokeMiter = paint.getStrokeMiter();
        float f2 = catchingFishEspressoBundle.CatchingFishDaggerHiltFAB;
        if (strokeMiter != f2) {
            ((Paint) catchingFishFluxFirebase2.CatchingFishSnackbar).setStrokeMiter(f2);
        }
        int CatchingFishSnackbar2 = catchingFishFluxFirebase2.CatchingFishSnackbar();
        int i2 = catchingFishEspressoBundle.CatchingFishParcelableFlux;
        if (CatchingFishSnackbar2 == i2) {
            return catchingFishFluxFirebase2;
        }
        ((Paint) catchingFishFluxFirebase2.CatchingFishSnackbar).setStrokeJoin(i2 == 0 ? Paint.Join.MITER : i2 == 2 ? Paint.Join.BEVEL : i2 == 1 ? Paint.Join.ROUND : Paint.Join.MITER);
        return catchingFishFluxFirebase2;
    }

    @Override // kotlin.text.CatchingFishPicassoManifest
    public final CatchingFishGradleMVPKtor getLayoutDirection() {
        return this.CatchingFishReduxKtor.CatchingFishSnackbar;
    }
}
