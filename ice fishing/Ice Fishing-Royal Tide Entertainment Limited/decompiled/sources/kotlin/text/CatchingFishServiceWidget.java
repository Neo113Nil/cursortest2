package kotlin.text;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class CatchingFishServiceWidget implements CatchingFishHandlerMVPRealm, CatchingFishJUnitLiveData, CatchingFishDataStoreFlux {
    public final CatchingFishManifestService CatchingFishDaggerWebsocket;
    public final CatchingFishGoogleMapsMoshi CatchingFishReduxKtor;
    public CatchingFishToolbarToast CatchingFishWorkManager = null;
    public CatchingFishViewModelIntent CatchingFishViewModelScope = null;

    public CatchingFishServiceWidget(CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi, CatchingFishManifestService catchingFishManifestService) {
        this.CatchingFishReduxKtor = catchingFishGoogleMapsMoshi;
        this.CatchingFishDaggerWebsocket = catchingFishManifestService;
    }

    @Override // kotlin.text.CatchingFishHandlerMVPRealm
    public final CatchingFishViewParcelable CatchingFishCoroutine() {
        Application application;
        CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi = this.CatchingFishReduxKtor;
        Context applicationContext = catchingFishGoogleMapsMoshi.CatchingFishCardViewView().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        CatchingFishViewParcelable catchingFishViewParcelable = new CatchingFishViewParcelable(0);
        LinkedHashMap linkedHashMap = catchingFishViewParcelable.CatchingFishParcelableFAB;
        if (application != null) {
            linkedHashMap.put(CatchingFishMVPGraphQL.CatchingFishReduxKtor, application);
        }
        linkedHashMap.put(CatchingFishFirebaseDagger.CatchingFishEspressoTesting, this);
        linkedHashMap.put(CatchingFishFirebaseDagger.CatchingFishOkHttp, this);
        Bundle bundle = catchingFishGoogleMapsMoshi.CatchingFishLayout;
        if (bundle != null) {
            linkedHashMap.put(CatchingFishFirebaseDagger.CatchingFishUnitTesting, bundle);
        }
        return catchingFishViewParcelable;
    }

    @Override // kotlin.text.CatchingFishToastFlux
    public final CatchingFishToolbarToast CatchingFishDaggerWebsocket() {
        CatchingFishWorkManager();
        return this.CatchingFishWorkManager;
    }

    @Override // kotlin.text.CatchingFishJUnitLiveData
    public final CatchingFishViewModelIntent CatchingFishParcelableFAB() {
        CatchingFishWorkManager();
        return (CatchingFishViewModelIntent) this.CatchingFishViewModelScope.CatchingFishWorkManager;
    }

    @Override // kotlin.text.CatchingFishDataStoreFlux
    public final CatchingFishManifestService CatchingFishReduxKtor() {
        CatchingFishWorkManager();
        return this.CatchingFishDaggerWebsocket;
    }

    public final void CatchingFishSnackbar(CatchingFishToolbarLiveData catchingFishToolbarLiveData) {
        this.CatchingFishWorkManager.CatchingFishReduxKtor(catchingFishToolbarLiveData);
    }

    public final void CatchingFishWorkManager() {
        if (this.CatchingFishWorkManager == null) {
            this.CatchingFishWorkManager = new CatchingFishToolbarToast(this);
            CatchingFishMoshiBundle catchingFishMoshiBundle = new CatchingFishMoshiBundle(this, new CatchingFishFluxPicasso(6, this));
            this.CatchingFishViewModelScope = new CatchingFishViewModelIntent(catchingFishMoshiBundle, 14);
            catchingFishMoshiBundle.CatchingFishParcelableFAB();
            CatchingFishFirebaseDagger.CatchingFishPayPal(this);
        }
    }
}
