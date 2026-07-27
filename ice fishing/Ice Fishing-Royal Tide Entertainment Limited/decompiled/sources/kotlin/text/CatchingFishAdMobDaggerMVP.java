package kotlin.text;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.SparseIntArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class CatchingFishAdMobDaggerMVP implements CatchingFishJUnitPicasso, CatchingFishHandlerBundle {
    public final CatchingFishRobolectricMVI CatchingFish;
    public final CatchingFishViewModelIntent CatchingFishAnimationMockk;
    public boolean CatchingFishJetpackCompose;
    public final int CatchingFishNavigation;
    public final CatchingFishMVPUnitTesting CatchingFishOkHttp;
    public final /* synthetic */ CatchingFishExoPlayerGson CatchingFishSpannableWidget;
    public final CatchingFishExoPlayerRoom CatchingFishUnitTesting;
    public final LinkedList CatchingFishEspressoTesting = new LinkedList();
    public final HashSet CatchingFishStateLiveData = new HashSet();
    public final HashMap CatchingFishRoomDatabase = new HashMap();
    public final ArrayList CatchingFishCoroutineFlow = new ArrayList();
    public ConnectionResult CatchingFishDaggerHiltFAB = null;

    public CatchingFishAdMobDaggerMVP(CatchingFishExoPlayerGson catchingFishExoPlayerGson, CatchingFishViewModelHilt catchingFishViewModelHilt) {
        this.CatchingFishSpannableWidget = catchingFishExoPlayerGson;
        Looper looper = catchingFishExoPlayerGson.CatchingFishOkHttp.getLooper();
        CatchingFishAsyncTaskDagger CatchingFishParcelableFAB = catchingFishViewModelHilt.CatchingFishParcelableFAB();
        CatchingFishViewWorkManager catchingFishViewWorkManager = new CatchingFishViewWorkManager((CatchingFishRoomStateFlow) CatchingFishParcelableFAB.CatchingFishDaggerWebsocket, (String) CatchingFishParcelableFAB.CatchingFishWorkManager, (String) CatchingFishParcelableFAB.CatchingFishViewModelScope);
        CatchingFishGsonCardView catchingFishGsonCardView = (CatchingFishGsonCardView) catchingFishViewModelHilt.CatchingFishReduxKtor.CatchingFishDaggerWebsocket;
        CatchingFishToastHiltBundle.CatchingFishAnimationMockk(catchingFishGsonCardView);
        CatchingFishMVPUnitTesting CatchingFishViewModelScope = catchingFishGsonCardView.CatchingFishViewModelScope(catchingFishViewModelHilt.CatchingFishParcelableFAB, looper, catchingFishViewWorkManager, catchingFishViewModelHilt.CatchingFishDaggerWebsocket, this, this);
        CatchingFishServiceHilt catchingFishServiceHilt = catchingFishViewModelHilt.CatchingFishCoroutine;
        if (catchingFishServiceHilt == null || !(CatchingFishViewModelScope instanceof com.google.android.gms.common.internal.CatchingFishPagingLibrary)) {
            String str = catchingFishViewModelHilt.CatchingFishSnackbar;
            if (str != null && (CatchingFishViewModelScope instanceof com.google.android.gms.common.internal.CatchingFishPagingLibrary)) {
                ((com.google.android.gms.common.internal.CatchingFishPagingLibrary) CatchingFishViewModelScope).CatchingFishNavigation = str;
            }
        } else {
            ((com.google.android.gms.common.internal.CatchingFishPagingLibrary) CatchingFishViewModelScope).CatchingFish = catchingFishServiceHilt;
        }
        this.CatchingFishOkHttp = CatchingFishViewModelScope;
        this.CatchingFishUnitTesting = catchingFishViewModelHilt.CatchingFishWorkManager;
        this.CatchingFishAnimationMockk = new CatchingFishViewModelIntent(26);
        this.CatchingFishNavigation = catchingFishViewModelHilt.CatchingFishViewModelScope;
        if (!CatchingFishViewModelScope.CatchingFishSnackbar()) {
            this.CatchingFish = null;
            return;
        }
        Context context = catchingFishExoPlayerGson.CatchingFishDaggerWebsocket;
        CatchingFishPayPalRedux catchingFishPayPalRedux = catchingFishExoPlayerGson.CatchingFishOkHttp;
        CatchingFishAsyncTaskDagger CatchingFishParcelableFAB2 = catchingFishViewModelHilt.CatchingFishParcelableFAB();
        this.CatchingFish = new CatchingFishRobolectricMVI(context, catchingFishPayPalRedux, new CatchingFishViewWorkManager((CatchingFishRoomStateFlow) CatchingFishParcelableFAB2.CatchingFishDaggerWebsocket, (String) CatchingFishParcelableFAB2.CatchingFishWorkManager, (String) CatchingFishParcelableFAB2.CatchingFishViewModelScope));
    }

    public final void CatchingFishAnimationMockk(CatchingFishCardViewFluxMVI catchingFishCardViewFluxMVI) {
        CatchingFishToastHiltBundle.CatchingFishCloudMessaging(this.CatchingFishSpannableWidget.CatchingFishOkHttp);
        boolean CatchingFishOkHttp = ((com.google.android.gms.common.internal.CatchingFishPagingLibrary) this.CatchingFishOkHttp).CatchingFishOkHttp();
        LinkedList linkedList = this.CatchingFishEspressoTesting;
        if (CatchingFishOkHttp) {
            if (CatchingFishViewModelFAB(catchingFishCardViewFluxMVI)) {
                CatchingFishCloudMessaging();
                return;
            } else {
                linkedList.add(catchingFishCardViewFluxMVI);
                return;
            }
        }
        linkedList.add(catchingFishCardViewFluxMVI);
        ConnectionResult connectionResult = this.CatchingFishDaggerHiltFAB;
        if (connectionResult == null || connectionResult.CatchingFishDaggerWebsocket == 0 || connectionResult.CatchingFishWorkManager == null) {
            CatchingFishRoomDatabase();
        } else {
            CatchingFishUnitTesting(connectionResult, null);
        }
    }

    public final void CatchingFishCloudMessaging() {
        CatchingFishExoPlayerGson catchingFishExoPlayerGson = this.CatchingFishSpannableWidget;
        CatchingFishPayPalRedux catchingFishPayPalRedux = catchingFishExoPlayerGson.CatchingFishOkHttp;
        CatchingFishExoPlayerRoom catchingFishExoPlayerRoom = this.CatchingFishUnitTesting;
        catchingFishPayPalRedux.removeMessages(12, catchingFishExoPlayerRoom);
        CatchingFishPayPalRedux catchingFishPayPalRedux2 = catchingFishExoPlayerGson.CatchingFishOkHttp;
        catchingFishPayPalRedux2.sendMessageDelayed(catchingFishPayPalRedux2.obtainMessage(12, catchingFishExoPlayerRoom), catchingFishExoPlayerGson.CatchingFishParcelableFAB);
    }

    @Override // kotlin.text.CatchingFishJUnitPicasso
    public final void CatchingFishCoroutine() {
        CatchingFishExoPlayerGson catchingFishExoPlayerGson = this.CatchingFishSpannableWidget;
        if (Looper.myLooper() == catchingFishExoPlayerGson.CatchingFishOkHttp.getLooper()) {
            CatchingFishSnackbar();
        } else {
            catchingFishExoPlayerGson.CatchingFishOkHttp.post(new CatchingFishGsonRealm(20, this));
        }
    }

    @Override // kotlin.text.CatchingFishHandlerBundle
    public final void CatchingFishDaggerWebsocket(ConnectionResult connectionResult) {
        CatchingFishUnitTesting(connectionResult, null);
    }

    public final void CatchingFishEspressoTesting(ConnectionResult connectionResult) {
        HashSet hashSet = this.CatchingFishStateLiveData;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
            return;
        }
        if (it.next() != null) {
            throw new ClassCastException();
        }
        if (CatchingFishLayoutRoom.CatchingFishOkHttp(connectionResult, ConnectionResult.CatchingFishLayout)) {
            com.google.android.gms.common.internal.CatchingFishPagingLibrary catchingFishPagingLibrary = (com.google.android.gms.common.internal.CatchingFishPagingLibrary) this.CatchingFishOkHttp;
            if (!catchingFishPagingLibrary.CatchingFishOkHttp() || catchingFishPagingLibrary.CatchingFishSnackbar == null) {
                throw new RuntimeException("Failed to connect when checking package");
            }
        }
        throw null;
    }

    public final void CatchingFishFragmentHandler(Status status) {
        CatchingFishToastHiltBundle.CatchingFishCloudMessaging(this.CatchingFishSpannableWidget.CatchingFishOkHttp);
        CatchingFishLayout(status, null, false);
    }

    public final void CatchingFishLayout(Status status, Exception exc, boolean z) {
        CatchingFishToastHiltBundle.CatchingFishCloudMessaging(this.CatchingFishSpannableWidget.CatchingFishOkHttp);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.CatchingFishEspressoTesting.iterator();
        while (it.hasNext()) {
            CatchingFishCardViewFluxMVI catchingFishCardViewFluxMVI = (CatchingFishCardViewFluxMVI) it.next();
            if (!z || catchingFishCardViewFluxMVI.CatchingFishParcelableFAB == 2) {
                if (status != null) {
                    catchingFishCardViewFluxMVI.CatchingFishReduxKtor(status);
                } else {
                    catchingFishCardViewFluxMVI.CatchingFishDaggerWebsocket(exc);
                }
                it.remove();
            }
        }
    }

    public final void CatchingFishOkHttp(ConnectionResult connectionResult) {
        CatchingFishToastHiltBundle.CatchingFishCloudMessaging(this.CatchingFishSpannableWidget.CatchingFishOkHttp);
        CatchingFishMVPUnitTesting catchingFishMVPUnitTesting = this.CatchingFishOkHttp;
        String name = catchingFishMVPUnitTesting.getClass().getName();
        String valueOf = String.valueOf(connectionResult);
        StringBuilder sb = new StringBuilder(name.length() + 25 + valueOf.length());
        sb.append("onSignInFailed for ");
        sb.append(name);
        sb.append(" with ");
        sb.append(valueOf);
        ((com.google.android.gms.common.internal.CatchingFishPagingLibrary) catchingFishMVPUnitTesting).CatchingFishDaggerWebsocket(sb.toString());
        CatchingFishUnitTesting(connectionResult, null);
    }

    @Override // kotlin.text.CatchingFishJUnitPicasso
    public final void CatchingFishParcelableFAB(int i) {
        CatchingFishExoPlayerGson catchingFishExoPlayerGson = this.CatchingFishSpannableWidget;
        if (Looper.myLooper() == catchingFishExoPlayerGson.CatchingFishOkHttp.getLooper()) {
            CatchingFishReduxKtor(i);
        } else {
            catchingFishExoPlayerGson.CatchingFishOkHttp.post(new CatchingFishServiceEspresso(i, 4, this));
        }
    }

    public final void CatchingFishReduxKtor(int i) {
        CatchingFishToastHiltBundle.CatchingFishCloudMessaging(this.CatchingFishSpannableWidget.CatchingFishOkHttp);
        this.CatchingFishDaggerHiltFAB = null;
        this.CatchingFishJetpackCompose = true;
        String str = ((com.google.android.gms.common.internal.CatchingFishPagingLibrary) this.CatchingFishOkHttp).CatchingFishParcelableFAB;
        CatchingFishViewModelIntent catchingFishViewModelIntent = this.CatchingFishAnimationMockk;
        catchingFishViewModelIntent.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (str != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(str);
        }
        catchingFishViewModelIntent.CatchingFishMutableLiveData(true, new Status(20, sb.toString(), null, null));
        CatchingFishExoPlayerRoom catchingFishExoPlayerRoom = this.CatchingFishUnitTesting;
        CatchingFishExoPlayerGson catchingFishExoPlayerGson = this.CatchingFishSpannableWidget;
        CatchingFishPayPalRedux catchingFishPayPalRedux = catchingFishExoPlayerGson.CatchingFishOkHttp;
        catchingFishPayPalRedux.sendMessageDelayed(Message.obtain(catchingFishPayPalRedux, 9, catchingFishExoPlayerRoom), 5000L);
        CatchingFishPayPalRedux catchingFishPayPalRedux2 = catchingFishExoPlayerGson.CatchingFishOkHttp;
        catchingFishPayPalRedux2.sendMessageDelayed(Message.obtain(catchingFishPayPalRedux2, 11, catchingFishExoPlayerRoom), 120000L);
        SparseIntArray sparseIntArray = (SparseIntArray) catchingFishExoPlayerGson.CatchingFishViewModelScope.CatchingFishDaggerWebsocket;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
        Iterator it = this.CatchingFishRoomDatabase.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public final void CatchingFishRoomDatabase() {
        CatchingFishExoPlayerGson catchingFishExoPlayerGson = this.CatchingFishSpannableWidget;
        CatchingFishToastHiltBundle.CatchingFishCloudMessaging(catchingFishExoPlayerGson.CatchingFishOkHttp);
        CatchingFishMVPUnitTesting catchingFishMVPUnitTesting = this.CatchingFishOkHttp;
        com.google.android.gms.common.internal.CatchingFishPagingLibrary catchingFishPagingLibrary = (com.google.android.gms.common.internal.CatchingFishPagingLibrary) catchingFishMVPUnitTesting;
        if (catchingFishPagingLibrary.CatchingFishOkHttp() || catchingFishPagingLibrary.CatchingFishUnitTesting()) {
            return;
        }
        try {
            int CatchingFishFragmentFactory = catchingFishExoPlayerGson.CatchingFishViewModelScope.CatchingFishFragmentFactory(catchingFishExoPlayerGson.CatchingFishDaggerWebsocket, catchingFishPagingLibrary);
            if (CatchingFishFragmentFactory != 0) {
                ConnectionResult connectionResult = new ConnectionResult(CatchingFishFragmentFactory, null, null);
                new StringBuilder(catchingFishMVPUnitTesting.getClass().getName().length() + 35 + connectionResult.toString().length());
                CatchingFishUnitTesting(connectionResult, null);
                return;
            }
            CatchingFishGsonFragment catchingFishGsonFragment = new CatchingFishGsonFragment();
            Objects.requireNonNull(catchingFishExoPlayerGson);
            catchingFishGsonFragment.CatchingFishLayout = catchingFishExoPlayerGson;
            catchingFishGsonFragment.CatchingFishViewModelScope = null;
            catchingFishGsonFragment.CatchingFishViewModelFAB = null;
            catchingFishGsonFragment.CatchingFishReduxKtor = false;
            catchingFishGsonFragment.CatchingFishDaggerWebsocket = catchingFishPagingLibrary;
            catchingFishGsonFragment.CatchingFishWorkManager = this.CatchingFishUnitTesting;
            if (catchingFishPagingLibrary.CatchingFishSnackbar()) {
                CatchingFishRobolectricMVI catchingFishRobolectricMVI = this.CatchingFish;
                CatchingFishToastHiltBundle.CatchingFishAnimationMockk(catchingFishRobolectricMVI);
                CatchingFishWidgetRetrofit catchingFishWidgetRetrofit = catchingFishRobolectricMVI.CatchingFishNavigation;
                if (catchingFishWidgetRetrofit != null) {
                    catchingFishWidgetRetrofit.CatchingFishReduxKtor();
                }
                CatchingFishViewWorkManager catchingFishViewWorkManager = catchingFishRobolectricMVI.CatchingFishRoomDatabase;
                catchingFishViewWorkManager.CatchingFishLayout = Integer.valueOf(System.identityHashCode(catchingFishRobolectricMVI));
                CatchingFishToastDataStore catchingFishToastDataStore = catchingFishRobolectricMVI.CatchingFishAnimationMockk;
                Context context = catchingFishRobolectricMVI.CatchingFishOkHttp;
                Handler handler = catchingFishRobolectricMVI.CatchingFishUnitTesting;
                catchingFishRobolectricMVI.CatchingFishNavigation = (CatchingFishWidgetRetrofit) catchingFishToastDataStore.CatchingFishViewModelScope(context, handler.getLooper(), catchingFishViewWorkManager, (CatchingFishMVIGradleRealm) catchingFishViewWorkManager.CatchingFishViewModelFAB, catchingFishRobolectricMVI, catchingFishRobolectricMVI);
                catchingFishRobolectricMVI.CatchingFish = catchingFishGsonFragment;
                Set set = catchingFishRobolectricMVI.CatchingFishStateLiveData;
                if (set == null || set.isEmpty()) {
                    handler.post(new CatchingFishGsonRealm(catchingFishRobolectricMVI));
                } else {
                    CatchingFishWidgetRetrofit catchingFishWidgetRetrofit2 = catchingFishRobolectricMVI.CatchingFishNavigation;
                    catchingFishWidgetRetrofit2.getClass();
                    catchingFishWidgetRetrofit2.CatchingFishLayout = new CatchingFishServiceHilt(catchingFishWidgetRetrofit2);
                    catchingFishWidgetRetrofit2.CatchingFishStateLiveData(2, null);
                }
            }
            try {
                catchingFishPagingLibrary.CatchingFishLayout = catchingFishGsonFragment;
                catchingFishPagingLibrary.CatchingFishStateLiveData(2, null);
            } catch (SecurityException e) {
                CatchingFishUnitTesting(new ConnectionResult(10, null, null), e);
            }
        } catch (IllegalStateException e2) {
            CatchingFishUnitTesting(new ConnectionResult(10, null, null), e2);
        }
    }

    public final void CatchingFishSnackbar() {
        CatchingFishExoPlayerGson catchingFishExoPlayerGson = this.CatchingFishSpannableWidget;
        CatchingFishToastHiltBundle.CatchingFishCloudMessaging(catchingFishExoPlayerGson.CatchingFishOkHttp);
        this.CatchingFishDaggerHiltFAB = null;
        CatchingFishEspressoTesting(ConnectionResult.CatchingFishLayout);
        if (this.CatchingFishJetpackCompose) {
            CatchingFishPayPalRedux catchingFishPayPalRedux = catchingFishExoPlayerGson.CatchingFishOkHttp;
            CatchingFishExoPlayerRoom catchingFishExoPlayerRoom = this.CatchingFishUnitTesting;
            catchingFishPayPalRedux.removeMessages(11, catchingFishExoPlayerRoom);
            catchingFishExoPlayerGson.CatchingFishOkHttp.removeMessages(9, catchingFishExoPlayerRoom);
            this.CatchingFishJetpackCompose = false;
        }
        Iterator it = this.CatchingFishRoomDatabase.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        CatchingFishViewModelScope();
        CatchingFishCloudMessaging();
    }

    public final void CatchingFishStateLiveData() {
        CatchingFishExoPlayerGson catchingFishExoPlayerGson = this.CatchingFishSpannableWidget;
        CatchingFishToastHiltBundle.CatchingFishCloudMessaging(catchingFishExoPlayerGson.CatchingFishOkHttp);
        Status status = CatchingFishExoPlayerGson.CatchingFishAnimationMockk;
        CatchingFishFragmentHandler(status);
        this.CatchingFishAnimationMockk.CatchingFishMutableLiveData(false, status);
        for (CatchingFishRealmBiometric catchingFishRealmBiometric : (CatchingFishRealmBiometric[]) this.CatchingFishRoomDatabase.keySet().toArray(new CatchingFishRealmBiometric[0])) {
            CatchingFishAnimationMockk(new CatchingFishBundleMoshi(new CatchingFishAndroidXPayPal()));
        }
        CatchingFishEspressoTesting(new ConnectionResult(4, null, null));
        if (((com.google.android.gms.common.internal.CatchingFishPagingLibrary) this.CatchingFishOkHttp).CatchingFishOkHttp()) {
            catchingFishExoPlayerGson.CatchingFishOkHttp.post(new CatchingFishGsonRealm(21, new CatchingFishEspressoPayPal(17, this)));
        }
    }

    public final void CatchingFishUnitTesting(ConnectionResult connectionResult, RuntimeException runtimeException) {
        CatchingFishWidgetRetrofit catchingFishWidgetRetrofit;
        CatchingFishExoPlayerGson catchingFishExoPlayerGson = this.CatchingFishSpannableWidget;
        CatchingFishToastHiltBundle.CatchingFishCloudMessaging(catchingFishExoPlayerGson.CatchingFishOkHttp);
        CatchingFishRobolectricMVI catchingFishRobolectricMVI = this.CatchingFish;
        if (catchingFishRobolectricMVI != null && (catchingFishWidgetRetrofit = catchingFishRobolectricMVI.CatchingFishNavigation) != null) {
            catchingFishWidgetRetrofit.CatchingFishReduxKtor();
        }
        CatchingFishToastHiltBundle.CatchingFishCloudMessaging(this.CatchingFishSpannableWidget.CatchingFishOkHttp);
        this.CatchingFishDaggerHiltFAB = null;
        SparseIntArray sparseIntArray = (SparseIntArray) catchingFishExoPlayerGson.CatchingFishViewModelScope.CatchingFishDaggerWebsocket;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
        CatchingFishEspressoTesting(connectionResult);
        if ((this.CatchingFishOkHttp instanceof CatchingFishToolbarGraphQL) && connectionResult.CatchingFishDaggerWebsocket != 24) {
            catchingFishExoPlayerGson.CatchingFishSnackbar = true;
            CatchingFishPayPalRedux catchingFishPayPalRedux = catchingFishExoPlayerGson.CatchingFishOkHttp;
            catchingFishPayPalRedux.sendMessageDelayed(catchingFishPayPalRedux.obtainMessage(19), 300000L);
        }
        int i = connectionResult.CatchingFishDaggerWebsocket;
        if (i == 4) {
            CatchingFishFragmentHandler(CatchingFishExoPlayerGson.CatchingFishStateLiveData);
            return;
        }
        if (i == 25) {
            CatchingFishFragmentHandler(CatchingFishExoPlayerGson.CatchingFishSnackbar(this.CatchingFishUnitTesting, connectionResult));
            return;
        }
        LinkedList linkedList = this.CatchingFishEspressoTesting;
        if (linkedList.isEmpty()) {
            this.CatchingFishDaggerHiltFAB = connectionResult;
            return;
        }
        if (runtimeException != null) {
            CatchingFishToastHiltBundle.CatchingFishCloudMessaging(catchingFishExoPlayerGson.CatchingFishOkHttp);
            CatchingFishLayout(null, runtimeException, false);
            return;
        }
        if (!catchingFishExoPlayerGson.CatchingFishUnitTesting) {
            CatchingFishFragmentHandler(CatchingFishExoPlayerGson.CatchingFishSnackbar(this.CatchingFishUnitTesting, connectionResult));
            return;
        }
        CatchingFishExoPlayerRoom catchingFishExoPlayerRoom = this.CatchingFishUnitTesting;
        CatchingFishLayout(CatchingFishExoPlayerGson.CatchingFishSnackbar(catchingFishExoPlayerRoom, connectionResult), null, true);
        if (linkedList.isEmpty() || CatchingFishWorkManager(connectionResult) || catchingFishExoPlayerGson.CatchingFishDaggerWebsocket(connectionResult, this.CatchingFishNavigation)) {
            return;
        }
        if (connectionResult.CatchingFishDaggerWebsocket == 18) {
            this.CatchingFishJetpackCompose = true;
        }
        if (!this.CatchingFishJetpackCompose) {
            CatchingFishFragmentHandler(CatchingFishExoPlayerGson.CatchingFishSnackbar(catchingFishExoPlayerRoom, connectionResult));
        } else {
            CatchingFishPayPalRedux catchingFishPayPalRedux2 = catchingFishExoPlayerGson.CatchingFishOkHttp;
            catchingFishPayPalRedux2.sendMessageDelayed(Message.obtain(catchingFishPayPalRedux2, 9, catchingFishExoPlayerRoom), 5000L);
        }
    }

    public final boolean CatchingFishViewModelFAB(CatchingFishCardViewFluxMVI catchingFishCardViewFluxMVI) {
        if (catchingFishCardViewFluxMVI == null) {
            CatchingFishViewModelIntent catchingFishViewModelIntent = this.CatchingFishAnimationMockk;
            CatchingFishMVPUnitTesting catchingFishMVPUnitTesting = this.CatchingFishOkHttp;
            catchingFishCardViewFluxMVI.CatchingFishWorkManager(catchingFishViewModelIntent, catchingFishMVPUnitTesting.CatchingFishSnackbar());
            try {
                catchingFishCardViewFluxMVI.CatchingFishViewModelScope(this);
                return true;
            } catch (DeadObjectException unused) {
                CatchingFishParcelableFAB(1);
                ((com.google.android.gms.common.internal.CatchingFishPagingLibrary) catchingFishMVPUnitTesting).CatchingFishDaggerWebsocket("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        CatchingFishAppCompatPayPal[] CatchingFishParcelableFAB = catchingFishCardViewFluxMVI.CatchingFishParcelableFAB(this);
        CatchingFishAppCompatPayPal catchingFishAppCompatPayPal = null;
        if (CatchingFishParcelableFAB != null && CatchingFishParcelableFAB.length != 0) {
            CatchingFishToastGoogleMaps catchingFishToastGoogleMaps = ((com.google.android.gms.common.internal.CatchingFishPagingLibrary) this.CatchingFishOkHttp).CatchingFishDaggerHiltFAB;
            CatchingFishAppCompatPayPal[] catchingFishAppCompatPayPalArr = catchingFishToastGoogleMaps == null ? null : catchingFishToastGoogleMaps.CatchingFishDaggerWebsocket;
            if (catchingFishAppCompatPayPalArr == null) {
                catchingFishAppCompatPayPalArr = new CatchingFishAppCompatPayPal[0];
            }
            CatchingFishCameraXRetrofit catchingFishCameraXRetrofit = new CatchingFishCameraXRetrofit(catchingFishAppCompatPayPalArr.length);
            for (CatchingFishAppCompatPayPal catchingFishAppCompatPayPal2 : catchingFishAppCompatPayPalArr) {
                catchingFishCameraXRetrofit.put(catchingFishAppCompatPayPal2.CatchingFishReduxKtor, Long.valueOf(catchingFishAppCompatPayPal2.CatchingFishParcelableFAB()));
            }
            for (CatchingFishAppCompatPayPal catchingFishAppCompatPayPal3 : CatchingFishParcelableFAB) {
                Long l = (Long) catchingFishCameraXRetrofit.get(catchingFishAppCompatPayPal3.CatchingFishReduxKtor);
                if (l == null || l.longValue() < catchingFishAppCompatPayPal3.CatchingFishParcelableFAB()) {
                    catchingFishAppCompatPayPal = catchingFishAppCompatPayPal3;
                    break;
                }
            }
        }
        if (catchingFishAppCompatPayPal == null) {
            CatchingFishViewModelIntent catchingFishViewModelIntent2 = this.CatchingFishAnimationMockk;
            CatchingFishMVPUnitTesting catchingFishMVPUnitTesting2 = this.CatchingFishOkHttp;
            catchingFishCardViewFluxMVI.CatchingFishWorkManager(catchingFishViewModelIntent2, catchingFishMVPUnitTesting2.CatchingFishSnackbar());
            try {
                catchingFishCardViewFluxMVI.CatchingFishViewModelScope(this);
                return true;
            } catch (DeadObjectException unused2) {
                CatchingFishParcelableFAB(1);
                ((com.google.android.gms.common.internal.CatchingFishPagingLibrary) catchingFishMVPUnitTesting2).CatchingFishDaggerWebsocket("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        new StringBuilder(this.CatchingFishOkHttp.getClass().getName().length() + 53 + String.valueOf(catchingFishAppCompatPayPal.CatchingFishReduxKtor).length() + 2 + String.valueOf(catchingFishAppCompatPayPal.CatchingFishParcelableFAB()).length() + 2);
        CatchingFishExoPlayerGson catchingFishExoPlayerGson = this.CatchingFishSpannableWidget;
        if (!catchingFishExoPlayerGson.CatchingFishUnitTesting || !catchingFishCardViewFluxMVI.CatchingFishSnackbar(this)) {
            catchingFishCardViewFluxMVI.CatchingFishDaggerWebsocket(new CatchingFishHandlerGlideMVP(catchingFishAppCompatPayPal));
            return true;
        }
        int CatchingFishCoroutine = catchingFishCardViewFluxMVI.CatchingFishCoroutine(this);
        CatchingFishRoomGsonMVP catchingFishRoomGsonMVP = new CatchingFishRoomGsonMVP(this.CatchingFishUnitTesting, catchingFishAppCompatPayPal);
        ArrayList arrayList = this.CatchingFishCoroutineFlow;
        int indexOf = arrayList.indexOf(catchingFishRoomGsonMVP);
        if (indexOf >= 0) {
            CatchingFishRoomGsonMVP catchingFishRoomGsonMVP2 = (CatchingFishRoomGsonMVP) arrayList.get(indexOf);
            catchingFishExoPlayerGson.CatchingFishOkHttp.removeMessages(15, catchingFishRoomGsonMVP2);
            catchingFishExoPlayerGson.CatchingFishOkHttp.sendMessageDelayed(Message.obtain(catchingFishExoPlayerGson.CatchingFishOkHttp, 15, catchingFishRoomGsonMVP2), 5000L);
        } else {
            arrayList.add(catchingFishRoomGsonMVP);
            catchingFishExoPlayerGson.CatchingFishOkHttp.sendMessageDelayed(Message.obtain(catchingFishExoPlayerGson.CatchingFishOkHttp, 15, catchingFishRoomGsonMVP), 5000L);
            catchingFishExoPlayerGson.CatchingFishOkHttp.sendMessageDelayed(Message.obtain(catchingFishExoPlayerGson.CatchingFishOkHttp, 16, catchingFishRoomGsonMVP), 120000L);
            ConnectionResult connectionResult = new ConnectionResult(1, 2, null, null, Integer.valueOf(CatchingFishCoroutine));
            if (CatchingFishWorkManager(connectionResult)) {
                new StringBuilder(String.valueOf(catchingFishAppCompatPayPal.CatchingFishReduxKtor).length() + 61 + String.valueOf(catchingFishAppCompatPayPal.CatchingFishParcelableFAB()).length());
            } else if (catchingFishExoPlayerGson.CatchingFishDaggerWebsocket(connectionResult, this.CatchingFishNavigation)) {
                new StringBuilder(String.valueOf(catchingFishAppCompatPayPal.CatchingFishReduxKtor).length() + 55 + String.valueOf(catchingFishAppCompatPayPal.CatchingFishParcelableFAB()).length());
            }
        }
        return false;
    }

    public final void CatchingFishViewModelScope() {
        LinkedList linkedList = this.CatchingFishEspressoTesting;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            CatchingFishCardViewFluxMVI catchingFishCardViewFluxMVI = (CatchingFishCardViewFluxMVI) arrayList.get(i);
            if (!((com.google.android.gms.common.internal.CatchingFishPagingLibrary) this.CatchingFishOkHttp).CatchingFishOkHttp()) {
                return;
            }
            if (CatchingFishViewModelFAB(catchingFishCardViewFluxMVI)) {
                linkedList.remove(catchingFishCardViewFluxMVI);
            }
        }
    }

    public final boolean CatchingFishWorkManager(ConnectionResult connectionResult) {
        synchronized (CatchingFishExoPlayerGson.CatchingFishRoomDatabase) {
            this.CatchingFishSpannableWidget.getClass();
        }
        return false;
    }
}
