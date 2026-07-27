package kotlin.text;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class CatchingFishKtorLiveData implements CatchingFishManifestOkHttp {
    public final Bundle CatchingFishCoroutine;
    public final CatchingFishViewModelIntent CatchingFishDaggerWebsocket;
    public final Application CatchingFishParcelableFAB;
    public final CatchingFishToolbarToast CatchingFishReduxKtor;
    public final CatchingFishMVPGraphQL CatchingFishSnackbar;

    public CatchingFishKtorLiveData(Application application, CatchingFishJUnitLiveData catchingFishJUnitLiveData, Bundle bundle) {
        CatchingFishMVPGraphQL catchingFishMVPGraphQL;
        this.CatchingFishDaggerWebsocket = catchingFishJUnitLiveData.CatchingFishParcelableFAB();
        this.CatchingFishReduxKtor = catchingFishJUnitLiveData.CatchingFishDaggerWebsocket();
        this.CatchingFishCoroutine = bundle;
        this.CatchingFishParcelableFAB = application;
        if (application != null) {
            if (CatchingFishMVPGraphQL.CatchingFishCoroutine == null) {
                CatchingFishMVPGraphQL.CatchingFishCoroutine = new CatchingFishMVPGraphQL(application);
            }
            catchingFishMVPGraphQL = CatchingFishMVPGraphQL.CatchingFishCoroutine;
            CatchingFishFirebaseDagger.CatchingFishAnimationMockk(catchingFishMVPGraphQL);
        } else {
            catchingFishMVPGraphQL = new CatchingFishMVPGraphQL(null);
        }
        this.CatchingFishSnackbar = catchingFishMVPGraphQL;
    }

    @Override // kotlin.text.CatchingFishManifestOkHttp
    public final CatchingFishLayoutGlide CatchingFishCoroutine(CatchingFishAnimationIntent catchingFishAnimationIntent, CatchingFishViewParcelable catchingFishViewParcelable) {
        return CatchingFishParcelableFAB(CatchingFishRobolectricHilt.CatchingFishParcelableFlux(catchingFishAnimationIntent), catchingFishViewParcelable);
    }

    @Override // kotlin.text.CatchingFishManifestOkHttp
    public final CatchingFishLayoutGlide CatchingFishParcelableFAB(Class cls, CatchingFishViewParcelable catchingFishViewParcelable) {
        CatchingFishExoPlayerMVP catchingFishExoPlayerMVP = CatchingFishServiceHilt.CatchingFishFragmentHandler;
        LinkedHashMap linkedHashMap = catchingFishViewParcelable.CatchingFishParcelableFAB;
        String str = (String) linkedHashMap.get(catchingFishExoPlayerMVP);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (linkedHashMap.get(CatchingFishFirebaseDagger.CatchingFishEspressoTesting) == null || linkedHashMap.get(CatchingFishFirebaseDagger.CatchingFishOkHttp) == null) {
            if (this.CatchingFishReduxKtor != null) {
                return CatchingFishReduxKtor(cls, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) linkedHashMap.get(CatchingFishMVPGraphQL.CatchingFishReduxKtor);
        boolean isAssignableFrom = CatchingFishGoogleMapsFlux.class.isAssignableFrom(cls);
        Constructor CatchingFishParcelableFAB = (!isAssignableFrom || application == null) ? CatchingFishReduxContext.CatchingFishParcelableFAB(cls, CatchingFishReduxContext.CatchingFishSnackbar) : CatchingFishReduxContext.CatchingFishParcelableFAB(cls, CatchingFishReduxContext.CatchingFishParcelableFAB);
        return CatchingFishParcelableFAB == null ? this.CatchingFishSnackbar.CatchingFishParcelableFAB(cls, catchingFishViewParcelable) : (!isAssignableFrom || application == null) ? CatchingFishReduxContext.CatchingFishSnackbar(cls, CatchingFishParcelableFAB, CatchingFishFirebaseDagger.CatchingFishParcelableFlux(catchingFishViewParcelable)) : CatchingFishReduxContext.CatchingFishSnackbar(cls, CatchingFishParcelableFAB, application, CatchingFishFirebaseDagger.CatchingFishParcelableFlux(catchingFishViewParcelable));
    }

    public final CatchingFishLayoutGlide CatchingFishReduxKtor(Class cls, String str) {
        AutoCloseable autoCloseable;
        Application application;
        CatchingFishToolbarToast catchingFishToolbarToast = this.CatchingFishReduxKtor;
        if (catchingFishToolbarToast == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean isAssignableFrom = CatchingFishGoogleMapsFlux.class.isAssignableFrom(cls);
        Constructor CatchingFishParcelableFAB = (!isAssignableFrom || this.CatchingFishParcelableFAB == null) ? CatchingFishReduxContext.CatchingFishParcelableFAB(cls, CatchingFishReduxContext.CatchingFishSnackbar) : CatchingFishReduxContext.CatchingFishParcelableFAB(cls, CatchingFishReduxContext.CatchingFishParcelableFAB);
        if (CatchingFishParcelableFAB == null) {
            if (this.CatchingFishParcelableFAB != null) {
                return this.CatchingFishSnackbar.CatchingFishSnackbar(cls);
            }
            if (CatchingFishMockkViewRoom.CatchingFishParcelableFAB == null) {
                CatchingFishMockkViewRoom.CatchingFishParcelableFAB = new CatchingFishMockkViewRoom();
            }
            CatchingFishFirebaseDagger.CatchingFishAnimationMockk(CatchingFishMockkViewRoom.CatchingFishParcelableFAB);
            return CatchingFishXMLLayoutGlide.CatchingFishNavigation(cls);
        }
        CatchingFishViewModelIntent catchingFishViewModelIntent = this.CatchingFishDaggerWebsocket;
        CatchingFishFirebaseDagger.CatchingFishAnimationMockk(catchingFishViewModelIntent);
        CatchingFishSnackbarRedux CatchingFishOkHttp = CatchingFishDaggerBiometric.CatchingFishOkHttp(catchingFishViewModelIntent.CatchingFishDaggerWebsocket(str), this.CatchingFishCoroutine);
        CatchingFishGsonWidget catchingFishGsonWidget = new CatchingFishGsonWidget(str, CatchingFishOkHttp);
        catchingFishGsonWidget.CatchingFishLayout(catchingFishToolbarToast, catchingFishViewModelIntent);
        CatchingFishMockkFirebase catchingFishMockkFirebase = catchingFishToolbarToast.CatchingFishReduxKtor;
        if (catchingFishMockkFirebase == CatchingFishMockkFirebase.CatchingFishDaggerWebsocket || catchingFishMockkFirebase.compareTo(CatchingFishMockkFirebase.CatchingFishViewModelScope) >= 0) {
            catchingFishViewModelIntent.CatchingFishMVPRobolectric();
        } else {
            catchingFishToolbarToast.CatchingFishParcelableFAB(new CatchingFishLiveDataPicasso(catchingFishToolbarToast, catchingFishViewModelIntent));
        }
        CatchingFishLayoutGlide CatchingFishSnackbar = (!isAssignableFrom || (application = this.CatchingFishParcelableFAB) == null) ? CatchingFishReduxContext.CatchingFishSnackbar(cls, CatchingFishParcelableFAB, CatchingFishOkHttp) : CatchingFishReduxContext.CatchingFishSnackbar(cls, CatchingFishParcelableFAB, application, CatchingFishOkHttp);
        CatchingFishSnackbar.getClass();
        CatchingFishEspressoMVPGson catchingFishEspressoMVPGson = CatchingFishSnackbar.CatchingFishParcelableFAB;
        if (catchingFishEspressoMVPGson == null) {
            return CatchingFishSnackbar;
        }
        if (catchingFishEspressoMVPGson.CatchingFishReduxKtor) {
            CatchingFishEspressoMVPGson.CatchingFishParcelableFAB(catchingFishGsonWidget);
            return CatchingFishSnackbar;
        }
        synchronized (catchingFishEspressoMVPGson.CatchingFishParcelableFAB) {
            autoCloseable = (AutoCloseable) catchingFishEspressoMVPGson.CatchingFishSnackbar.put("androidx.lifecycle.savedstate.vm.tag", catchingFishGsonWidget);
        }
        CatchingFishEspressoMVPGson.CatchingFishParcelableFAB(autoCloseable);
        return CatchingFishSnackbar;
    }

    @Override // kotlin.text.CatchingFishManifestOkHttp
    public final CatchingFishLayoutGlide CatchingFishSnackbar(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return CatchingFishReduxKtor(cls, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}
