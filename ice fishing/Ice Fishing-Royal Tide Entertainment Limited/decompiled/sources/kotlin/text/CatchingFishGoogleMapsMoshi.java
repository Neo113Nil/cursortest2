package kotlin.text;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.catchingfish.fishcatcherpro.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class CatchingFishGoogleMapsMoshi implements ComponentCallbacks, View.OnCreateContextMenuListener, CatchingFishToastFlux, CatchingFishDataStoreFlux, CatchingFishHandlerMVPRealm, CatchingFishJUnitLiveData {
    public static final Object CatchingFishStateFlow = new Object();
    public boolean CatchingFish;
    public boolean CatchingFishAnimationMockk;
    public final ArrayList CatchingFishAppCompat;
    public boolean CatchingFishCameraXIntent;
    public int CatchingFishCardViewRealm;
    public boolean CatchingFishCardViewView;
    public CatchingFishToastSharedFlow CatchingFishCoroutineFlow;
    public boolean CatchingFishCustomView;
    public CatchingFishGradleEspresso CatchingFishDagger;
    public CatchingFishMVIPicasso CatchingFishDaggerHiltFAB;
    public Bundle CatchingFishDaggerWebsocket;
    public final CatchingFishDataStoreOkHttp CatchingFishDataStoreIntent;
    public int CatchingFishEspressoTesting;
    public CatchingFishGoogleMapsMoshi CatchingFishFragmentHandler;
    public int CatchingFishGsonAppCompat;
    public boolean CatchingFishHandler;
    public int CatchingFishJetpackCompose;
    public ViewGroup CatchingFishJobScheduler;
    public Bundle CatchingFishLayout;
    public CatchingFishServiceWidget CatchingFishLayoutInflater;
    public boolean CatchingFishMVPRobolectric;
    public CatchingFishToolbarToast CatchingFishMotionLayout;
    public boolean CatchingFishMutableLiveData;
    public boolean CatchingFishNavigation;
    public CatchingFishGoogleMapsMoshi CatchingFishParcelableFlux;
    public String CatchingFishPayPal;
    public String CatchingFishPayPalLiveData;
    public View CatchingFishPayPalService;
    public CatchingFishViewModelIntent CatchingFishRecyclerView;
    public boolean CatchingFishRoomDatabase;
    public boolean CatchingFishSensorManager;
    public boolean CatchingFishStateLiveData;
    public boolean CatchingFishUnitTesting;
    public Bundle CatchingFishViewModelScope;
    public SparseArray CatchingFishWorkManager;
    public int CatchingFishReduxKtor = -1;
    public String CatchingFishViewModelFAB = UUID.randomUUID().toString();
    public String CatchingFishCloudMessaging = null;
    public Boolean CatchingFishOkHttp = null;
    public CatchingFishToastSharedFlow CatchingFishSpannableWidget = new CatchingFishToastSharedFlow();
    public final boolean CatchingFishFragmentFactory = true;
    public boolean CatchingFishEspressoMockk = true;
    public CatchingFishMockkFirebase CatchingFishGradleManifest = CatchingFishMockkFirebase.CatchingFishViewModelFAB;
    public final CatchingFishGraphQLHilt CatchingFishParcelable = new CatchingFishGraphQLHilt();

    public CatchingFishGoogleMapsMoshi() {
        new AtomicInteger();
        this.CatchingFishAppCompat = new ArrayList();
        this.CatchingFishDataStoreIntent = new CatchingFishDataStoreOkHttp(this);
        CatchingFishCloudMessaging();
    }

    public View CatchingFish(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void CatchingFishAnimationMockk() {
        this.CatchingFishMutableLiveData = true;
    }

    public void CatchingFishCardViewRealm(Bundle bundle) {
        this.CatchingFishMutableLiveData = true;
    }

    public final Context CatchingFishCardViewView() {
        Context CatchingFishViewModelFAB = CatchingFishViewModelFAB();
        if (CatchingFishViewModelFAB != null) {
            return CatchingFishViewModelFAB;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final void CatchingFishCloudMessaging() {
        this.CatchingFishMotionLayout = new CatchingFishToolbarToast(this);
        this.CatchingFishRecyclerView = new CatchingFishViewModelIntent(new CatchingFishMoshiBundle(this, new CatchingFishFluxPicasso(6, this)), 14);
        ArrayList arrayList = this.CatchingFishAppCompat;
        CatchingFishDataStoreOkHttp catchingFishDataStoreOkHttp = this.CatchingFishDataStoreIntent;
        if (arrayList.contains(catchingFishDataStoreOkHttp)) {
            return;
        }
        if (this.CatchingFishReduxKtor < 0) {
            arrayList.add(catchingFishDataStoreOkHttp);
            return;
        }
        CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi = catchingFishDataStoreOkHttp.CatchingFishParcelableFAB;
        ((CatchingFishMoshiBundle) catchingFishGoogleMapsMoshi.CatchingFishRecyclerView.CatchingFishDaggerWebsocket).CatchingFishParcelableFAB();
        CatchingFishFirebaseDagger.CatchingFishPayPal(catchingFishGoogleMapsMoshi);
    }

    @Override // kotlin.text.CatchingFishHandlerMVPRealm
    public final CatchingFishViewParcelable CatchingFishCoroutine() {
        Application application;
        Context applicationContext = CatchingFishCardViewView().getApplicationContext();
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
        if (application == null && CatchingFishToastSharedFlow.CatchingFishFragmentFactory(3)) {
            Objects.toString(CatchingFishCardViewView().getApplicationContext());
        }
        CatchingFishViewParcelable catchingFishViewParcelable = new CatchingFishViewParcelable(0);
        LinkedHashMap linkedHashMap = catchingFishViewParcelable.CatchingFishParcelableFAB;
        if (application != null) {
            linkedHashMap.put(CatchingFishMVPGraphQL.CatchingFishReduxKtor, application);
        }
        linkedHashMap.put(CatchingFishFirebaseDagger.CatchingFishEspressoTesting, this);
        linkedHashMap.put(CatchingFishFirebaseDagger.CatchingFishOkHttp, this);
        Bundle bundle = this.CatchingFishLayout;
        if (bundle != null) {
            linkedHashMap.put(CatchingFishFirebaseDagger.CatchingFishUnitTesting, bundle);
        }
        return catchingFishViewParcelable;
    }

    public void CatchingFishCoroutineFlow() {
        this.CatchingFishMutableLiveData = true;
    }

    public final void CatchingFishCustomView(int i, int i2, int i3, int i4) {
        if (this.CatchingFishDagger == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        CatchingFishWorkManager().CatchingFishSnackbar = i;
        CatchingFishWorkManager().CatchingFishCoroutine = i2;
        CatchingFishWorkManager().CatchingFishReduxKtor = i3;
        CatchingFishWorkManager().CatchingFishDaggerWebsocket = i4;
    }

    public LayoutInflater CatchingFishDaggerHiltFAB(Bundle bundle) {
        CatchingFishMVIPicasso catchingFishMVIPicasso = this.CatchingFishDaggerHiltFAB;
        if (catchingFishMVIPicasso == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        FragmentActivity fragmentActivity = catchingFishMVIPicasso.CatchingFishParcelableFlux;
        LayoutInflater cloneInContext = fragmentActivity.getLayoutInflater().cloneInContext(fragmentActivity);
        cloneInContext.setFactory2(this.CatchingFishSpannableWidget.CatchingFishWorkManager);
        return cloneInContext;
    }

    @Override // kotlin.text.CatchingFishToastFlux
    public final CatchingFishToolbarToast CatchingFishDaggerWebsocket() {
        return this.CatchingFishMotionLayout;
    }

    public final void CatchingFishEspressoTesting() {
        CatchingFishCloudMessaging();
        this.CatchingFishPayPalLiveData = this.CatchingFishViewModelFAB;
        this.CatchingFishViewModelFAB = UUID.randomUUID().toString();
        this.CatchingFishUnitTesting = false;
        this.CatchingFishAnimationMockk = false;
        this.CatchingFishStateLiveData = false;
        this.CatchingFishRoomDatabase = false;
        this.CatchingFishNavigation = false;
        this.CatchingFishJetpackCompose = 0;
        this.CatchingFishCoroutineFlow = null;
        this.CatchingFishSpannableWidget = new CatchingFishToastSharedFlow();
        this.CatchingFishDaggerHiltFAB = null;
        this.CatchingFishGsonAppCompat = 0;
        this.CatchingFishCardViewRealm = 0;
        this.CatchingFishPayPal = null;
        this.CatchingFishCardViewView = false;
        this.CatchingFishMVPRobolectric = false;
    }

    public final void CatchingFishFragmentFactory(Bundle bundle) {
        CatchingFishToastSharedFlow catchingFishToastSharedFlow = this.CatchingFishCoroutineFlow;
        if (catchingFishToastSharedFlow != null && (catchingFishToastSharedFlow.CatchingFishFragmentFactory || catchingFishToastSharedFlow.CatchingFishMutableLiveData)) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.CatchingFishLayout = bundle;
    }

    public final CatchingFishToastSharedFlow CatchingFishFragmentHandler() {
        CatchingFishToastSharedFlow catchingFishToastSharedFlow = this.CatchingFishCoroutineFlow;
        if (catchingFishToastSharedFlow != null) {
            return catchingFishToastSharedFlow;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public void CatchingFishGsonAppCompat() {
        this.CatchingFishMutableLiveData = true;
    }

    public void CatchingFishJetpackCompose() {
        this.CatchingFishMutableLiveData = true;
    }

    public final int CatchingFishLayout() {
        CatchingFishMockkFirebase catchingFishMockkFirebase = this.CatchingFishGradleManifest;
        return (catchingFishMockkFirebase == CatchingFishMockkFirebase.CatchingFishDaggerWebsocket || this.CatchingFishParcelableFlux == null) ? catchingFishMockkFirebase.ordinal() : Math.min(catchingFishMockkFirebase.ordinal(), this.CatchingFishParcelableFlux.CatchingFishLayout());
    }

    public final View CatchingFishMVPRobolectric() {
        View view = this.CatchingFishPayPalService;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public void CatchingFishNavigation(Bundle bundle) {
        Parcelable parcelable;
        this.CatchingFishMutableLiveData = true;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.CatchingFishSpannableWidget.CatchingFishLayoutInflater(parcelable);
            CatchingFishToastSharedFlow catchingFishToastSharedFlow = this.CatchingFishSpannableWidget;
            catchingFishToastSharedFlow.CatchingFishFragmentFactory = false;
            catchingFishToastSharedFlow.CatchingFishMutableLiveData = false;
            catchingFishToastSharedFlow.CatchingFishCameraXIntent.CatchingFishViewModelScope = false;
            catchingFishToastSharedFlow.CatchingFishJetpackCompose(1);
        }
        CatchingFishToastSharedFlow catchingFishToastSharedFlow2 = this.CatchingFishSpannableWidget;
        if (catchingFishToastSharedFlow2.CatchingFish >= 1) {
            return;
        }
        catchingFishToastSharedFlow2.CatchingFishFragmentFactory = false;
        catchingFishToastSharedFlow2.CatchingFishMutableLiveData = false;
        catchingFishToastSharedFlow2.CatchingFishCameraXIntent.CatchingFishViewModelScope = false;
        catchingFishToastSharedFlow2.CatchingFishJetpackCompose(1);
    }

    public final boolean CatchingFishOkHttp() {
        if (this.CatchingFishCardViewView) {
            return true;
        }
        CatchingFishToastSharedFlow catchingFishToastSharedFlow = this.CatchingFishCoroutineFlow;
        if (catchingFishToastSharedFlow != null) {
            CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi = this.CatchingFishParcelableFlux;
            catchingFishToastSharedFlow.getClass();
            if (catchingFishGoogleMapsMoshi == null ? false : catchingFishGoogleMapsMoshi.CatchingFishOkHttp()) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.text.CatchingFishJUnitLiveData
    public final CatchingFishViewModelIntent CatchingFishParcelableFAB() {
        return (CatchingFishViewModelIntent) this.CatchingFishRecyclerView.CatchingFishWorkManager;
    }

    public void CatchingFishParcelableFlux() {
        this.CatchingFishMutableLiveData = true;
    }

    public void CatchingFishPayPal(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.CatchingFishSpannableWidget.CatchingFishDagger();
        this.CatchingFish = true;
        this.CatchingFishLayoutInflater = new CatchingFishServiceWidget(this, CatchingFishReduxKtor());
        View CatchingFish = CatchingFish(layoutInflater, viewGroup);
        this.CatchingFishPayPalService = CatchingFish;
        if (CatchingFish == null) {
            if (this.CatchingFishLayoutInflater.CatchingFishWorkManager != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.CatchingFishLayoutInflater = null;
            return;
        }
        this.CatchingFishLayoutInflater.CatchingFishWorkManager();
        CatchingFishHiltMVPToast.CatchingFishFragmentFactory(this.CatchingFishPayPalService, this.CatchingFishLayoutInflater);
        View view = this.CatchingFishPayPalService;
        CatchingFishServiceWidget catchingFishServiceWidget = this.CatchingFishLayoutInflater;
        CatchingFishFirebaseDagger.CatchingFishNavigation(view, "<this>");
        view.setTag(R.id.view_tree_view_model_store_owner, catchingFishServiceWidget);
        CatchingFishOkHttpFAB.CatchingFishRecyclerView(this.CatchingFishPayPalService, this.CatchingFishLayoutInflater);
        CatchingFishGraphQLHilt catchingFishGraphQLHilt = this.CatchingFishParcelable;
        CatchingFishServiceWidget catchingFishServiceWidget2 = this.CatchingFishLayoutInflater;
        catchingFishGraphQLHilt.getClass();
        CatchingFishGraphQLHilt.CatchingFishParcelableFAB("setValue");
        catchingFishGraphQLHilt.CatchingFishViewModelScope++;
        catchingFishGraphQLHilt.CatchingFishDaggerWebsocket = catchingFishServiceWidget2;
        catchingFishGraphQLHilt.CatchingFishCoroutine(null);
    }

    @Override // kotlin.text.CatchingFishDataStoreFlux
    public final CatchingFishManifestService CatchingFishReduxKtor() {
        if (this.CatchingFishCoroutineFlow == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (CatchingFishLayout() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap hashMap = this.CatchingFishCoroutineFlow.CatchingFishCameraXIntent.CatchingFishReduxKtor;
        CatchingFishManifestService catchingFishManifestService = (CatchingFishManifestService) hashMap.get(this.CatchingFishViewModelFAB);
        if (catchingFishManifestService != null) {
            return catchingFishManifestService;
        }
        CatchingFishManifestService catchingFishManifestService2 = new CatchingFishManifestService();
        hashMap.put(this.CatchingFishViewModelFAB, catchingFishManifestService2);
        return catchingFishManifestService2;
    }

    public void CatchingFishRoomDatabase(Context context) {
        this.CatchingFishMutableLiveData = true;
        CatchingFishMVIPicasso catchingFishMVIPicasso = this.CatchingFishDaggerHiltFAB;
        if ((catchingFishMVIPicasso == null ? null : catchingFishMVIPicasso.CatchingFishJetpackCompose) != null) {
            this.CatchingFishMutableLiveData = true;
        }
    }

    public CatchingFishRobolectricHilt CatchingFishSnackbar() {
        return new CatchingFishGsonJUnitRoom(this);
    }

    public abstract void CatchingFishSpannableWidget(Bundle bundle);

    public void CatchingFishStateLiveData(int i, int i2, Intent intent) {
        if (CatchingFishToastSharedFlow.CatchingFishFragmentFactory(2)) {
            toString();
            Objects.toString(intent);
        }
    }

    public final boolean CatchingFishUnitTesting() {
        return this.CatchingFishJetpackCompose > 0;
    }

    public final Context CatchingFishViewModelFAB() {
        CatchingFishMVIPicasso catchingFishMVIPicasso = this.CatchingFishDaggerHiltFAB;
        if (catchingFishMVIPicasso == null) {
            return null;
        }
        return catchingFishMVIPicasso.CatchingFishCoroutineFlow;
    }

    public final CatchingFishToastSharedFlow CatchingFishViewModelScope() {
        if (this.CatchingFishDaggerHiltFAB != null) {
            return this.CatchingFishSpannableWidget;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public final CatchingFishGradleEspresso CatchingFishWorkManager() {
        if (this.CatchingFishDagger == null) {
            CatchingFishGradleEspresso catchingFishGradleEspresso = new CatchingFishGradleEspresso();
            Object obj = CatchingFishStateFlow;
            catchingFishGradleEspresso.CatchingFishViewModelScope = obj;
            catchingFishGradleEspresso.CatchingFishViewModelFAB = obj;
            catchingFishGradleEspresso.CatchingFishLayout = obj;
            catchingFishGradleEspresso.CatchingFishFragmentHandler = 1.0f;
            catchingFishGradleEspresso.CatchingFishCloudMessaging = null;
            this.CatchingFishDagger = catchingFishGradleEspresso;
        }
        return this.CatchingFishDagger;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.CatchingFishMutableLiveData = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        CatchingFishMVIPicasso catchingFishMVIPicasso = this.CatchingFishDaggerHiltFAB;
        FragmentActivity fragmentActivity = catchingFishMVIPicasso == null ? null : catchingFishMVIPicasso.CatchingFishJetpackCompose;
        if (fragmentActivity != null) {
            fragmentActivity.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.CatchingFishMutableLiveData = true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.CatchingFishViewModelFAB);
        if (this.CatchingFishGsonAppCompat != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.CatchingFishGsonAppCompat));
        }
        if (this.CatchingFishPayPal != null) {
            sb.append(" tag=");
            sb.append(this.CatchingFishPayPal);
        }
        sb.append(")");
        return sb.toString();
    }
}
