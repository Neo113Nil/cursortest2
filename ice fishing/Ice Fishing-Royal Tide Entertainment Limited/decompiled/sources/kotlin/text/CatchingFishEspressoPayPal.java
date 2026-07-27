package kotlin.text;

import android.graphics.Region;
import android.os.Parcel;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class CatchingFishEspressoPayPal implements CatchingFishLayoutViewPager, CatchingFishMockkDaggerHilt, CatchingFishFluxBiometric, CatchingFishSnackbarFAB {
    public Object CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;

    public /* synthetic */ CatchingFishEspressoPayPal(int i, Object obj) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r6v4, types: [kotlin.text.CatchingFishMVIBundle, kotlin.text.CatchingFishMockkView] */
    @Override // kotlin.text.CatchingFishLayoutViewPager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object CatchingFishCoroutine(CatchingFishIntentManifest catchingFishIntentManifest, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        CatchingFishFlux catchingFishFlux;
        int i;
        Throwable th;
        CatchingFishAdMobHilt catchingFishAdMobHilt;
        if (catchingFishWebsocketGradle instanceof CatchingFishFlux) {
            catchingFishFlux = (CatchingFishFlux) catchingFishWebsocketGradle;
            int i2 = catchingFishFlux.CatchingFishFragmentHandler;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                catchingFishFlux.CatchingFishFragmentHandler = i2 - Integer.MIN_VALUE;
                Object obj = catchingFishFlux.CatchingFishViewModelFAB;
                i = catchingFishFlux.CatchingFishFragmentHandler;
                CatchingFishRealmContext catchingFishRealmContext = CatchingFishRealmContext.CatchingFishParcelableFAB;
                if (i != 0) {
                    CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
                    CatchingFishManifestMockk catchingFishManifestMockk = catchingFishFlux.CatchingFishDaggerWebsocket;
                    CatchingFishFirebaseDagger.CatchingFishAnimationMockk(catchingFishManifestMockk);
                    CatchingFishAdMobHilt catchingFishAdMobHilt2 = new CatchingFishAdMobHilt(catchingFishIntentManifest, catchingFishManifestMockk);
                    try {
                        catchingFishFlux.CatchingFishViewModelScope = catchingFishAdMobHilt2;
                        catchingFishFlux.CatchingFishFragmentHandler = 1;
                        Object CatchingFishDaggerWebsocket = ((CatchingFishMVIBundle) this.CatchingFishDaggerWebsocket).CatchingFishDaggerWebsocket(catchingFishAdMobHilt2, catchingFishFlux);
                        CatchingFishXMLLayoutMockk catchingFishXMLLayoutMockk = CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
                        if (CatchingFishDaggerWebsocket != catchingFishXMLLayoutMockk) {
                            CatchingFishDaggerWebsocket = catchingFishRealmContext;
                        }
                        if (CatchingFishDaggerWebsocket == catchingFishXMLLayoutMockk) {
                            return catchingFishXMLLayoutMockk;
                        }
                        catchingFishAdMobHilt = catchingFishAdMobHilt2;
                    } catch (Throwable th2) {
                        th = th2;
                        catchingFishAdMobHilt = catchingFishAdMobHilt2;
                        catchingFishAdMobHilt.CatchingFishUnitTesting();
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    catchingFishAdMobHilt = catchingFishFlux.CatchingFishViewModelScope;
                    try {
                        CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        catchingFishAdMobHilt.CatchingFishUnitTesting();
                        throw th;
                    }
                }
                catchingFishAdMobHilt.CatchingFishUnitTesting();
                return catchingFishRealmContext;
            }
        }
        catchingFishFlux = new CatchingFishFlux(this, catchingFishWebsocketGradle);
        Object obj2 = catchingFishFlux.CatchingFishViewModelFAB;
        i = catchingFishFlux.CatchingFishFragmentHandler;
        CatchingFishRealmContext catchingFishRealmContext2 = CatchingFishRealmContext.CatchingFishParcelableFAB;
        if (i != 0) {
        }
        catchingFishAdMobHilt.CatchingFishUnitTesting();
        return catchingFishRealmContext2;
    }

    public WebView CatchingFishLayout() {
        int childCount;
        FrameLayout frameLayout = (FrameLayout) this.CatchingFishDaggerWebsocket;
        if (frameLayout == null || frameLayout.getChildCount() - 1 < 0) {
            return null;
        }
        View childAt = frameLayout.getChildAt(childCount);
        if (childAt instanceof WebView) {
            return (WebView) childAt;
        }
        return null;
    }

    @Override // kotlin.text.CatchingFishSnackbarFAB
    public CatchingFishEspressoView CatchingFishParcelableFAB(long j, CatchingFishEspressoView catchingFishEspressoView, CatchingFishEspressoView catchingFishEspressoView2, CatchingFishEspressoView catchingFishEspressoView3) {
        return ((CatchingFishAsyncTaskDagger) this.CatchingFishDaggerWebsocket).CatchingFishParcelableFAB(j, catchingFishEspressoView, catchingFishEspressoView2, catchingFishEspressoView3);
    }

    @Override // kotlin.text.CatchingFishSnackbarFAB
    public long CatchingFishReduxKtor(CatchingFishEspressoView catchingFishEspressoView, CatchingFishEspressoView catchingFishEspressoView2, CatchingFishEspressoView catchingFishEspressoView3) {
        return 1500 * 1000000;
    }

    @Override // kotlin.text.CatchingFishFluxBiometric
    public boolean CatchingFishSnackbar(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.CatchingFishDaggerWebsocket;
        if (!swipeDismissBehavior.CatchingFishNavigation(view)) {
            return false;
        }
        boolean z = view.getLayoutDirection() == 1;
        int i = swipeDismissBehavior.CatchingFishReduxKtor;
        int width = (!(i == 0 && z) && (i != 1 || z)) ? view.getWidth() : -view.getWidth();
        WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
        view.offsetLeftAndRight(width);
        view.setAlpha(0.0f);
        return true;
    }

    public CatchingFishCameraXRoom CatchingFishViewModelFAB(int i) {
        return (CatchingFishCameraXRoom) this.CatchingFishDaggerWebsocket;
    }

    public synchronized void CatchingFishViewModelScope(CatchingFishHiltMVIEspresso catchingFishHiltMVIEspresso) {
        ((LinkedHashSet) this.CatchingFishDaggerWebsocket).remove(catchingFishHiltMVIEspresso);
    }

    public void CatchingFishWorkManager(Object obj, Object obj2) {
        Parcel obtain;
        CatchingFishAndroidXPayPal catchingFishAndroidXPayPal = (CatchingFishAndroidXPayPal) obj2;
        switch (this.CatchingFishReduxKtor) {
            case 20:
                CatchingFishIntentRetrofit catchingFishIntentRetrofit = (CatchingFishIntentRetrofit) ((CatchingFishFluxRoomDagger) obj).CatchingFishLayout();
                CatchingFishMVVMIntent catchingFishMVVMIntent = (CatchingFishMVVMIntent) this.CatchingFishDaggerWebsocket;
                obtain = Parcel.obtain();
                obtain.writeInterfaceToken(catchingFishIntentRetrofit.CatchingFishOkHttp);
                int i = CatchingFishKtorEspresso.CatchingFishParcelableFAB;
                obtain.writeInt(1);
                catchingFishMVVMIntent.writeToParcel(obtain, 0);
                try {
                    catchingFishIntentRetrofit.CatchingFishEspressoTesting.transact(1, obtain, null, 1);
                    obtain.recycle();
                    catchingFishAndroidXPayPal.CatchingFishParcelableFAB(null);
                    return;
                } finally {
                }
            default:
                CatchingFishContextView catchingFishContextView = (CatchingFishContextView) ((CatchingFishToolbarGraphQL) obj).CatchingFishLayout();
                CatchingFishMVPAdMobKtor catchingFishMVPAdMobKtor = (CatchingFishMVPAdMobKtor) this.CatchingFishDaggerWebsocket;
                obtain = Parcel.obtain();
                obtain.writeInterfaceToken(catchingFishContextView.CatchingFishOkHttp);
                int i2 = CatchingFishKtorEspresso.CatchingFishParcelableFAB;
                if (catchingFishMVPAdMobKtor == null) {
                    obtain.writeInt(0);
                } else {
                    obtain.writeInt(1);
                    catchingFishMVPAdMobKtor.writeToParcel(obtain, 0);
                }
                try {
                    catchingFishContextView.CatchingFishEspressoTesting.transact(1, obtain, null, 1);
                    obtain.recycle();
                    catchingFishAndroidXPayPal.CatchingFishParcelableFAB(null);
                    return;
                } finally {
                }
        }
    }

    @Override // kotlin.text.CatchingFishMockkDaggerHilt
    public void onCancel() {
        ((CatchingFishMVPDatabinding) this.CatchingFishDaggerWebsocket).CatchingFishParcelableFAB();
    }

    public /* synthetic */ CatchingFishEspressoPayPal(int i, boolean z) {
        this.CatchingFishReduxKtor = i;
    }

    public CatchingFishEspressoPayPal(int i) {
        this.CatchingFishReduxKtor = i;
        switch (i) {
            case 2:
                this.CatchingFishDaggerWebsocket = new LinkedHashSet();
                break;
            case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                this.CatchingFishDaggerWebsocket = new Region();
                break;
            default:
                this.CatchingFishDaggerWebsocket = CatchingFishRobolectricHilt.CatchingFishCoroutine();
                break;
        }
    }

    public CatchingFishEspressoPayPal(long[] jArr) {
        CatchingFishViewFAB catchingFishViewFAB;
        this.CatchingFishReduxKtor = 6;
        if (jArr != null) {
            long[] copyOf = Arrays.copyOf(jArr, jArr.length);
            catchingFishViewFAB = new CatchingFishViewFAB(copyOf.length);
            int i = catchingFishViewFAB.CatchingFishSnackbar;
            if (i >= 0) {
                if (copyOf.length != 0) {
                    int length = copyOf.length + i;
                    long[] jArr2 = catchingFishViewFAB.CatchingFishParcelableFAB;
                    if (jArr2.length < length) {
                        long[] copyOf2 = Arrays.copyOf(jArr2, Math.max(length, (jArr2.length * 3) / 2));
                        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(copyOf2, "copyOf(...)");
                        catchingFishViewFAB.CatchingFishParcelableFAB = copyOf2;
                    }
                    long[] jArr3 = catchingFishViewFAB.CatchingFishParcelableFAB;
                    int i2 = catchingFishViewFAB.CatchingFishSnackbar;
                    if (i != i2) {
                        CatchingFishMVVMHilt.CatchingFishRecyclerView(jArr3, jArr3, copyOf.length + i, i, i2);
                    }
                    CatchingFishMVVMHilt.CatchingFishRecyclerView(copyOf, jArr3, i, 0, copyOf.length);
                    catchingFishViewFAB.CatchingFishSnackbar += copyOf.length;
                }
            } else {
                CatchingFishHiltMVPToast.CatchingFishGradleManifest("");
                throw null;
            }
        } else {
            catchingFishViewFAB = new CatchingFishViewFAB(16);
        }
        this.CatchingFishDaggerWebsocket = catchingFishViewFAB;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CatchingFishEspressoPayPal(CatchingFishMockkView catchingFishMockkView) {
        this.CatchingFishReduxKtor = 3;
        this.CatchingFishDaggerWebsocket = (CatchingFishMVIBundle) catchingFishMockkView;
    }

    public CatchingFishEspressoPayPal(CatchingFishAndroidXOkHttp catchingFishAndroidXOkHttp) {
        this.CatchingFishReduxKtor = 13;
        this.CatchingFishDaggerWebsocket = new CatchingFishAsyncTaskDagger(new CatchingFishCameraXRoom(catchingFishAndroidXOkHttp));
    }
}
