package kotlin.text;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.view.View;
import com.adjust.sdk.scheduler.SingleThreadCachedScheduler;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class CatchingFishGsonRealmMoshi implements Runnable {
    public final Object CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;
    public final /* synthetic */ Object CatchingFishWorkManager;

    public /* synthetic */ CatchingFishGsonRealmMoshi(int i, Object obj, Object obj2) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishWorkManager = obj;
        this.CatchingFishDaggerWebsocket = obj2;
    }

    private final void CatchingFishParcelableFAB() {
        CatchingFishEspressoContext catchingFishEspressoContext = (CatchingFishEspressoContext) this.CatchingFishWorkManager;
        synchronized (catchingFishEspressoContext.CatchingFishWorkManager) {
            try {
                CatchingFishMoshiJUnitRoom catchingFishMoshiJUnitRoom = (CatchingFishMoshiJUnitRoom) catchingFishEspressoContext.CatchingFishViewModelScope;
                if (catchingFishMoshiJUnitRoom != null) {
                    catchingFishMoshiJUnitRoom.CatchingFishSnackbar(((CatchingFishWorkManagerMVP) this.CatchingFishDaggerWebsocket).CatchingFishWorkManager());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void CatchingFishSnackbar() {
        CatchingFishMVPGsonMockk catchingFishMVPGsonMockk = (CatchingFishMVPGsonMockk) this.CatchingFishDaggerWebsocket;
        int i = ((CatchingFishFluxKtor) this.CatchingFishWorkManager).CatchingFishParcelableFAB;
        synchronized (catchingFishMVPGsonMockk) {
            CatchingFishFluxKtor catchingFishFluxKtor = (CatchingFishFluxKtor) catchingFishMVPGsonMockk.CatchingFishDaggerWebsocket.get(i);
            if (catchingFishFluxKtor != null) {
                catchingFishMVPGsonMockk.CatchingFishDaggerWebsocket.remove(i);
                catchingFishFluxKtor.CatchingFishSnackbar(new CatchingFishSnackbarIntent("Timed out waiting for response", null));
                catchingFishMVPGsonMockk.CatchingFishCoroutine();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list;
        boolean z;
        List list2;
        List list3;
        Runnable runnable;
        List list4;
        CatchingFishCoroutineFlux catchingFishCoroutineFlux;
        CatchingFishCoroutineFlux catchingFishToastGsonFlux;
        int i = 0;
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((SingleThreadCachedScheduler) this.CatchingFishWorkManager).tryExecuteRunnable((Runnable) this.CatchingFishDaggerWebsocket);
                while (true) {
                    list = ((SingleThreadCachedScheduler) this.CatchingFishWorkManager).queue;
                    synchronized (list) {
                        try {
                            z = ((SingleThreadCachedScheduler) this.CatchingFishWorkManager).isTeardown;
                            if (z) {
                                return;
                            }
                            list2 = ((SingleThreadCachedScheduler) this.CatchingFishWorkManager).queue;
                            if (list2.isEmpty()) {
                                ((SingleThreadCachedScheduler) this.CatchingFishWorkManager).isThreadProcessing = false;
                                return;
                            }
                            list3 = ((SingleThreadCachedScheduler) this.CatchingFishWorkManager).queue;
                            runnable = (Runnable) list3.get(0);
                            list4 = ((SingleThreadCachedScheduler) this.CatchingFishWorkManager).queue;
                            list4.remove(0);
                        } finally {
                        }
                    }
                    ((SingleThreadCachedScheduler) this.CatchingFishWorkManager).tryExecuteRunnable(runnable);
                }
            case 1:
                CatchingFishCameraXHandler catchingFishCameraXHandler = ((SwipeDismissBehavior) this.CatchingFishWorkManager).CatchingFishParcelableFAB;
                if (catchingFishCameraXHandler == null || !catchingFishCameraXHandler.CatchingFishWorkManager()) {
                    return;
                }
                ((View) this.CatchingFishDaggerWebsocket).postOnAnimation(this);
                return;
            case 2:
                ConnectionResult connectionResult = (ConnectionResult) this.CatchingFishDaggerWebsocket;
                CatchingFishGsonFragment catchingFishGsonFragment = (CatchingFishGsonFragment) this.CatchingFishWorkManager;
                CatchingFishExoPlayerGson catchingFishExoPlayerGson = (CatchingFishExoPlayerGson) catchingFishGsonFragment.CatchingFishLayout;
                CatchingFishMVPUnitTesting catchingFishMVPUnitTesting = (CatchingFishMVPUnitTesting) catchingFishGsonFragment.CatchingFishDaggerWebsocket;
                CatchingFishAdMobDaggerMVP catchingFishAdMobDaggerMVP = (CatchingFishAdMobDaggerMVP) catchingFishExoPlayerGson.CatchingFishFragmentHandler.get((CatchingFishExoPlayerRoom) catchingFishGsonFragment.CatchingFishWorkManager);
                if (catchingFishAdMobDaggerMVP == null) {
                    return;
                }
                if (connectionResult.CatchingFishDaggerWebsocket != 0) {
                    catchingFishAdMobDaggerMVP.CatchingFishUnitTesting(connectionResult, null);
                    return;
                }
                catchingFishGsonFragment.CatchingFishReduxKtor = true;
                if (catchingFishMVPUnitTesting.CatchingFishSnackbar()) {
                    if (!catchingFishGsonFragment.CatchingFishReduxKtor || (catchingFishCoroutineFlux = (CatchingFishCoroutineFlux) catchingFishGsonFragment.CatchingFishViewModelScope) == null) {
                        return;
                    }
                    ((com.google.android.gms.common.internal.CatchingFishPagingLibrary) catchingFishMVPUnitTesting).CatchingFishViewModelFAB(catchingFishCoroutineFlux, (Set) catchingFishGsonFragment.CatchingFishViewModelFAB);
                    return;
                }
                try {
                    com.google.android.gms.common.internal.CatchingFishPagingLibrary catchingFishPagingLibrary = (com.google.android.gms.common.internal.CatchingFishPagingLibrary) catchingFishMVPUnitTesting;
                    ((com.google.android.gms.common.internal.CatchingFishPagingLibrary) catchingFishMVPUnitTesting).CatchingFishViewModelFAB(null, catchingFishPagingLibrary.CatchingFishSnackbar() ? catchingFishPagingLibrary.CatchingFishParcelableFlux : Collections.EMPTY_SET);
                    return;
                } catch (SecurityException unused) {
                    ((com.google.android.gms.common.internal.CatchingFishPagingLibrary) catchingFishMVPUnitTesting).CatchingFishDaggerWebsocket("Failed to get service from broker.");
                    catchingFishAdMobDaggerMVP.CatchingFishUnitTesting(new ConnectionResult(10, null, null), null);
                    return;
                }
            case 3:
                CatchingFishRobolectricMVI catchingFishRobolectricMVI = (CatchingFishRobolectricMVI) this.CatchingFishWorkManager;
                CatchingFishHiltGlideFlux catchingFishHiltGlideFlux = (CatchingFishHiltGlideFlux) this.CatchingFishDaggerWebsocket;
                catchingFishRobolectricMVI.getClass();
                ConnectionResult connectionResult2 = catchingFishHiltGlideFlux.CatchingFishDaggerWebsocket;
                if (connectionResult2.CatchingFishDaggerWebsocket == 0) {
                    CatchingFishWidgetFABGlide catchingFishWidgetFABGlide = catchingFishHiltGlideFlux.CatchingFishWorkManager;
                    CatchingFishToastHiltBundle.CatchingFishAnimationMockk(catchingFishWidgetFABGlide);
                    ConnectionResult connectionResult3 = catchingFishWidgetFABGlide.CatchingFishWorkManager;
                    if (connectionResult3.CatchingFishDaggerWebsocket != 0) {
                        String valueOf = String.valueOf(connectionResult3);
                        new Exception();
                        "Sign-in succeeded with resolve account failure: ".concat(valueOf);
                        catchingFishRobolectricMVI.CatchingFish.CatchingFishSnackbar(connectionResult3);
                        catchingFishRobolectricMVI.CatchingFishNavigation.CatchingFishReduxKtor();
                        return;
                    }
                    CatchingFishGsonFragment catchingFishGsonFragment2 = catchingFishRobolectricMVI.CatchingFish;
                    IBinder iBinder = catchingFishWidgetFABGlide.CatchingFishDaggerWebsocket;
                    if (iBinder == null) {
                        catchingFishToastGsonFlux = null;
                    } else {
                        int i2 = CatchingFishExoPlayer.CatchingFishOkHttp;
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        catchingFishToastGsonFlux = queryLocalInterface instanceof CatchingFishCoroutineFlux ? (CatchingFishCoroutineFlux) queryLocalInterface : new CatchingFishToastGsonFlux(iBinder);
                    }
                    Set set = catchingFishRobolectricMVI.CatchingFishStateLiveData;
                    catchingFishGsonFragment2.getClass();
                    if (catchingFishToastGsonFlux == null || set == null) {
                        new Exception();
                        catchingFishGsonFragment2.CatchingFishSnackbar(new ConnectionResult(4, null, null));
                    } else {
                        catchingFishGsonFragment2.CatchingFishViewModelScope = catchingFishToastGsonFlux;
                        catchingFishGsonFragment2.CatchingFishViewModelFAB = set;
                        if (catchingFishGsonFragment2.CatchingFishReduxKtor) {
                            ((com.google.android.gms.common.internal.CatchingFishPagingLibrary) ((CatchingFishMVPUnitTesting) catchingFishGsonFragment2.CatchingFishDaggerWebsocket)).CatchingFishViewModelFAB(catchingFishToastGsonFlux, set);
                        }
                    }
                } else {
                    catchingFishRobolectricMVI.CatchingFish.CatchingFishSnackbar(connectionResult2);
                }
                catchingFishRobolectricMVI.CatchingFishNavigation.CatchingFishReduxKtor();
                return;
            case 4:
                CatchingFishWorkManagerMVP catchingFishWorkManagerMVP = (CatchingFishWorkManagerMVP) this.CatchingFishDaggerWebsocket;
                if (catchingFishWorkManagerMVP.CatchingFishReduxKtor) {
                    ((CatchingFishRoomRealm) this.CatchingFishWorkManager).CatchingFishViewModelScope.CatchingFishEspressoTesting();
                    return;
                }
                try {
                    ((CatchingFishRoomRealm) this.CatchingFishWorkManager).CatchingFishViewModelScope.CatchingFishFragmentHandler(((CatchingFishRoomRealm) this.CatchingFishWorkManager).CatchingFishWorkManager.CatchingFishFragmentHandler(catchingFishWorkManagerMVP));
                    return;
                } catch (CatchingFishDaggerGsonFlux e) {
                    if (e.getCause() instanceof Exception) {
                        ((CatchingFishRoomRealm) this.CatchingFishWorkManager).CatchingFishViewModelScope.CatchingFishCloudMessaging((Exception) e.getCause());
                        return;
                    } else {
                        ((CatchingFishRoomRealm) this.CatchingFishWorkManager).CatchingFishViewModelScope.CatchingFishCloudMessaging(e);
                        return;
                    }
                } catch (Exception e2) {
                    ((CatchingFishRoomRealm) this.CatchingFishWorkManager).CatchingFishViewModelScope.CatchingFishCloudMessaging(e2);
                    return;
                }
            case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                CatchingFishRoomRealm catchingFishRoomRealm = (CatchingFishRoomRealm) this.CatchingFishWorkManager;
                try {
                    CatchingFishWorkManagerMVP catchingFishWorkManagerMVP2 = (CatchingFishWorkManagerMVP) catchingFishRoomRealm.CatchingFishWorkManager.CatchingFishFragmentHandler((CatchingFishWorkManagerMVP) this.CatchingFishDaggerWebsocket);
                    if (catchingFishWorkManagerMVP2 == null) {
                        catchingFishRoomRealm.CatchingFishCoroutine(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    CatchingFishGlideFAB catchingFishGlideFAB = catchingFishWorkManagerMVP2.CatchingFishSnackbar;
                    CatchingFishToastGraphQLMVP catchingFishToastGraphQLMVP = CatchingFishReduxMockk.CatchingFishSnackbar;
                    catchingFishWorkManagerMVP2.CatchingFishSnackbar(catchingFishToastGraphQLMVP, catchingFishRoomRealm);
                    catchingFishGlideFAB.CatchingFishSnackbar(new CatchingFishEspressoContext((Executor) catchingFishToastGraphQLMVP, (CatchingFishRoomToolbar) catchingFishRoomRealm));
                    catchingFishWorkManagerMVP2.CatchingFishUnitTesting();
                    catchingFishGlideFAB.CatchingFishSnackbar(new CatchingFishEspressoContext((Executor) catchingFishToastGraphQLMVP, (CatchingFishSpannableFAB) catchingFishRoomRealm));
                    catchingFishWorkManagerMVP2.CatchingFishUnitTesting();
                    return;
                } catch (CatchingFishDaggerGsonFlux e3) {
                    if (e3.getCause() instanceof Exception) {
                        catchingFishRoomRealm.CatchingFishViewModelScope.CatchingFishCloudMessaging((Exception) e3.getCause());
                        return;
                    } else {
                        catchingFishRoomRealm.CatchingFishViewModelScope.CatchingFishCloudMessaging(e3);
                        return;
                    }
                } catch (Exception e4) {
                    catchingFishRoomRealm.CatchingFishViewModelScope.CatchingFishCloudMessaging(e4);
                    return;
                }
            case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                CatchingFishEspressoContext catchingFishEspressoContext = (CatchingFishEspressoContext) this.CatchingFishWorkManager;
                synchronized (catchingFishEspressoContext.CatchingFishWorkManager) {
                    ((CatchingFishFragmentFAB) catchingFishEspressoContext.CatchingFishViewModelScope).CatchingFishRoomDatabase((CatchingFishWorkManagerMVP) this.CatchingFishDaggerWebsocket);
                }
                return;
            case CatchingFishMoshiSpannable.DOUBLE_FIELD_NUMBER /* 7 */:
                CatchingFishMVPGsonMockk catchingFishMVPGsonMockk = (CatchingFishMVPGsonMockk) this.CatchingFishDaggerWebsocket;
                IBinder iBinder2 = (IBinder) this.CatchingFishWorkManager;
                synchronized (catchingFishMVPGsonMockk) {
                    if (iBinder2 == null) {
                        catchingFishMVPGsonMockk.CatchingFishParcelableFAB("Null service connection");
                    } else {
                        try {
                            catchingFishMVPGsonMockk.CatchingFishCoroutine = new CatchingFishContextPicasso(iBinder2);
                            catchingFishMVPGsonMockk.CatchingFishParcelableFAB = 2;
                            ((ScheduledExecutorService) catchingFishMVPGsonMockk.CatchingFishWorkManager.CatchingFishCoroutine).execute(new CatchingFishMVVMRoomRedux(catchingFishMVPGsonMockk, i));
                        } catch (RemoteException e5) {
                            catchingFishMVPGsonMockk.CatchingFishParcelableFAB(e5.getMessage());
                        }
                    }
                }
                return;
            case CatchingFishMoshiSpannable.BYTES_FIELD_NUMBER /* 8 */:
                CatchingFishEspressoContext catchingFishEspressoContext2 = (CatchingFishEspressoContext) this.CatchingFishWorkManager;
                synchronized (catchingFishEspressoContext2.CatchingFishWorkManager) {
                    try {
                        CatchingFishRoomToolbar catchingFishRoomToolbar = (CatchingFishRoomToolbar) catchingFishEspressoContext2.CatchingFishViewModelScope;
                        if (catchingFishRoomToolbar != null) {
                            Exception CatchingFishDaggerWebsocket = ((CatchingFishWorkManagerMVP) this.CatchingFishDaggerWebsocket).CatchingFishDaggerWebsocket();
                            CatchingFishToastHiltBundle.CatchingFishAnimationMockk(CatchingFishDaggerWebsocket);
                            catchingFishRoomToolbar.CatchingFishCoroutine(CatchingFishDaggerWebsocket);
                        }
                    } finally {
                    }
                }
                return;
            case 9:
                CatchingFishParcelableFAB();
                return;
            case 10:
                CatchingFishSnackbar();
                return;
            case 11:
                CatchingFishEspressoContext catchingFishEspressoContext3 = (CatchingFishEspressoContext) this.CatchingFishWorkManager;
                try {
                    CatchingFishWorkManagerMVP CatchingFishDaggerWebsocket2 = ((CatchingFishReduxIntent) catchingFishEspressoContext3.CatchingFishWorkManager).CatchingFishDaggerWebsocket(((CatchingFishWorkManagerMVP) this.CatchingFishDaggerWebsocket).CatchingFishWorkManager());
                    CatchingFishGlideFAB catchingFishGlideFAB2 = CatchingFishDaggerWebsocket2.CatchingFishSnackbar;
                    CatchingFishToastGraphQLMVP catchingFishToastGraphQLMVP2 = CatchingFishReduxMockk.CatchingFishSnackbar;
                    CatchingFishDaggerWebsocket2.CatchingFishSnackbar(catchingFishToastGraphQLMVP2, catchingFishEspressoContext3);
                    catchingFishGlideFAB2.CatchingFishSnackbar(new CatchingFishEspressoContext((Executor) catchingFishToastGraphQLMVP2, (CatchingFishRoomToolbar) catchingFishEspressoContext3));
                    CatchingFishDaggerWebsocket2.CatchingFishUnitTesting();
                    catchingFishGlideFAB2.CatchingFishSnackbar(new CatchingFishEspressoContext((Executor) catchingFishToastGraphQLMVP2, (CatchingFishSpannableFAB) catchingFishEspressoContext3));
                    CatchingFishDaggerWebsocket2.CatchingFishUnitTesting();
                    return;
                } catch (CancellationException unused2) {
                    catchingFishEspressoContext3.CatchingFishParcelableFAB();
                    return;
                } catch (CatchingFishDaggerGsonFlux e6) {
                    if (e6.getCause() instanceof Exception) {
                        catchingFishEspressoContext3.CatchingFishCoroutine((Exception) e6.getCause());
                        return;
                    } else {
                        catchingFishEspressoContext3.CatchingFishCoroutine(e6);
                        return;
                    }
                } catch (Exception e7) {
                    catchingFishEspressoContext3.CatchingFishCoroutine(e7);
                    return;
                }
            default:
                CatchingFishWorkManagerMVP catchingFishWorkManagerMVP3 = (CatchingFishWorkManagerMVP) this.CatchingFishDaggerWebsocket;
                try {
                    catchingFishWorkManagerMVP3.CatchingFishFragmentHandler(((Callable) this.CatchingFishWorkManager).call());
                    return;
                } catch (Exception e8) {
                    catchingFishWorkManagerMVP3.CatchingFishCloudMessaging(e8);
                    return;
                } catch (Throwable th) {
                    catchingFishWorkManagerMVP3.CatchingFishCloudMessaging(new RuntimeException(th));
                    return;
                }
        }
    }

    public /* synthetic */ CatchingFishGsonRealmMoshi(int i, Object obj, Object obj2, boolean z) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = obj;
        this.CatchingFishWorkManager = obj2;
    }

    public CatchingFishGsonRealmMoshi(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.CatchingFishReduxKtor = 1;
        this.CatchingFishWorkManager = swipeDismissBehavior;
        this.CatchingFishDaggerWebsocket = view;
    }
}
