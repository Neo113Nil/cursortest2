package kotlin.text;

import android.content.Context;
import java.util.List;

/* loaded from: classes.dex */
public final class CatchingFishFluxMVI {
    public static final /* synthetic */ CatchingFishServiceMoshi[] CatchingFishReduxKtor;
    public final CatchingFishViewPagerMockk CatchingFishCoroutine;
    public final String CatchingFishParcelableFAB;
    public final ThreadLocal CatchingFishSnackbar;

    static {
        CatchingFishGsonSpannable catchingFishGsonSpannable = new CatchingFishGsonSpannable(0, CatchingFishFluxMVI.class, CatchingFishRetrofitGson.CatchingFishReduxKtor, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;");
        CatchingFishContextFlux.CatchingFishParcelableFAB.getClass();
        CatchingFishReduxKtor = new CatchingFishServiceMoshi[]{catchingFishGsonSpannable};
    }

    public CatchingFishFluxMVI(Context context, String str) {
        CatchingFishViewPagerMockk catchingFishViewPagerMockk;
        CatchingFishFirebaseDagger.CatchingFishNavigation(context, "context");
        CatchingFishFirebaseDagger.CatchingFishNavigation(str, "name");
        this.CatchingFishParcelableFAB = str;
        this.CatchingFishSnackbar = new ThreadLocal();
        CatchingFishEspressoPayPal catchingFishEspressoPayPal = new CatchingFishEspressoPayPal(0, new CatchingFishPayPalOkHttp(this));
        int i = 5;
        CatchingFishFragmentFactory catchingFishFragmentFactory = new CatchingFishFragmentFactory(i, this);
        CatchingFishGlideGson catchingFishGlideGson = CatchingFishGoogleMapsHilt.CatchingFishParcelableFAB;
        CatchingFishViewRetrofit catchingFishViewRetrofit = CatchingFishViewRetrofit.CatchingFishWorkManager;
        CatchingFishDaggerToast catchingFishDaggerToast = new CatchingFishDaggerToast(null);
        catchingFishViewRetrofit.getClass();
        CatchingFishFABCoroutine CatchingFishParcelableFAB = CatchingFishGsonCardView.CatchingFishParcelableFAB(CatchingFishAdMobFAB.CatchingFishMutableLiveData(catchingFishViewRetrofit, catchingFishDaggerToast));
        CatchingFishHiltManifest catchingFishHiltManifest = new CatchingFishHiltManifest(str, catchingFishEspressoPayPal, catchingFishFragmentFactory, CatchingFishParcelableFAB);
        CatchingFishFirebaseDagger.CatchingFishNavigation(CatchingFishReduxKtor[0], "property");
        CatchingFishViewPagerMockk catchingFishViewPagerMockk2 = (CatchingFishViewPagerMockk) catchingFishHiltManifest.CatchingFishCoroutine;
        if (catchingFishViewPagerMockk2 == null) {
            synchronized (catchingFishHiltManifest.CatchingFishSnackbar) {
                try {
                    if (((CatchingFishViewPagerMockk) catchingFishHiltManifest.CatchingFishCoroutine) == null) {
                        Context applicationContext = context.getApplicationContext();
                        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(applicationContext, "applicationContext");
                        int i2 = 10;
                        CatchingFishKtorView catchingFishKtorView = new CatchingFishKtorView(new CatchingFishOkHttpOkHttp(new CatchingFishViewPagerRedux(i2, new CatchingFishAppCompatJUnit(i, applicationContext, catchingFishHiltManifest))), CatchingFishGsonCardView.CatchingFishFragmentFactory(new CatchingFishFluxJUnitAdMob((List) catchingFishFragmentFactory.CatchingFishFragmentHandler(applicationContext), null)), catchingFishEspressoPayPal, CatchingFishParcelableFAB);
                        int i3 = 26;
                        catchingFishHiltManifest.CatchingFishCoroutine = new CatchingFishViewPagerMockk(i3, new CatchingFishViewPagerMockk(i3, catchingFishKtorView));
                    }
                    catchingFishViewPagerMockk = (CatchingFishViewPagerMockk) catchingFishHiltManifest.CatchingFishCoroutine;
                    CatchingFishFirebaseDagger.CatchingFishAnimationMockk(catchingFishViewPagerMockk);
                } catch (Throwable th) {
                    throw th;
                }
            }
            catchingFishViewPagerMockk2 = catchingFishViewPagerMockk;
        }
        this.CatchingFishCoroutine = catchingFishViewPagerMockk2;
    }

    public final void CatchingFishParcelableFAB(CatchingFishServiceHandler catchingFishServiceHandler) {
    }
}
