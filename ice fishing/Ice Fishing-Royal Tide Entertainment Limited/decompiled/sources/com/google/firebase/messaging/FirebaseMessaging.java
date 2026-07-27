package com.google.firebase.messaging;

import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.text.CatchingFishAdMobToast;
import kotlin.text.CatchingFishBiometric;
import kotlin.text.CatchingFishCameraXRetrofit;
import kotlin.text.CatchingFishCardViewPicasso;
import kotlin.text.CatchingFishDaggerBiometric;
import kotlin.text.CatchingFishDataStoreHilt;
import kotlin.text.CatchingFishFluxFirebase;
import kotlin.text.CatchingFishFluxKtor;
import kotlin.text.CatchingFishGlideAdMobMVI;
import kotlin.text.CatchingFishGlideDataStore;
import kotlin.text.CatchingFishGlideViewModel;
import kotlin.text.CatchingFishLiveDataHandler;
import kotlin.text.CatchingFishMVPMVPViewModel;
import kotlin.text.CatchingFishMVPRecyclerView;
import kotlin.text.CatchingFishMoshiWidgetMVP;
import kotlin.text.CatchingFishRoomView;
import kotlin.text.CatchingFishToastGraphQLMVP;
import kotlin.text.CatchingFishToastHiltBundle;
import kotlin.text.CatchingFishToolbarPayPal;
import kotlin.text.CatchingFishViewMVIMVVM;
import kotlin.text.CatchingFishViewModelIntent;
import kotlin.text.CatchingFishViewWorkManager;
import kotlin.text.CatchingFishWebSocketIntent;
import kotlin.text.CatchingFishWebsocketRoom;
import kotlin.text.CatchingFishWidgetContext;
import kotlin.text.CatchingFishWorkManagerMVP;
import kotlin.text.CatchingFishXMLLayoutOkHttp;

/* loaded from: classes.dex */
public class FirebaseMessaging {
    public static CatchingFishMVPMVPViewModel CatchingFishCloudMessaging;
    public static ScheduledThreadPoolExecutor CatchingFishOkHttp;
    public final CatchingFishViewWorkManager CatchingFishCoroutine;
    public final CatchingFishWebsocketRoom CatchingFishDaggerWebsocket;
    public boolean CatchingFishLayout;
    public final com.google.firebase.CatchingFishPagingLibrary CatchingFishParcelableFAB;
    public final CatchingFishViewModelIntent CatchingFishReduxKtor;
    public final Context CatchingFishSnackbar;
    public final CatchingFishAdMobToast CatchingFishViewModelFAB;
    public final ThreadPoolExecutor CatchingFishViewModelScope;
    public final ScheduledThreadPoolExecutor CatchingFishWorkManager;
    public static final long CatchingFishFragmentHandler = TimeUnit.HOURS.toSeconds(8);
    public static CatchingFishLiveDataHandler CatchingFishEspressoTesting = new CatchingFishCardViewPicasso(5);

    public FirebaseMessaging(com.google.firebase.CatchingFishPagingLibrary catchingFishPagingLibrary, CatchingFishLiveDataHandler catchingFishLiveDataHandler, CatchingFishLiveDataHandler catchingFishLiveDataHandler2, CatchingFishToolbarPayPal catchingFishToolbarPayPal, CatchingFishLiveDataHandler catchingFishLiveDataHandler3, CatchingFishGlideDataStore catchingFishGlideDataStore) {
        catchingFishPagingLibrary.CatchingFishParcelableFAB();
        Context context = catchingFishPagingLibrary.CatchingFishParcelableFAB;
        final CatchingFishAdMobToast catchingFishAdMobToast = new CatchingFishAdMobToast();
        final int i = 0;
        catchingFishAdMobToast.CatchingFishSnackbar = 0;
        catchingFishAdMobToast.CatchingFishCoroutine = context;
        catchingFishPagingLibrary.CatchingFishParcelableFAB();
        CatchingFishGlideAdMobMVI catchingFishGlideAdMobMVI = new CatchingFishGlideAdMobMVI(catchingFishPagingLibrary.CatchingFishParcelableFAB);
        final CatchingFishViewWorkManager catchingFishViewWorkManager = new CatchingFishViewWorkManager();
        catchingFishViewWorkManager.CatchingFishReduxKtor = catchingFishPagingLibrary;
        catchingFishViewWorkManager.CatchingFishDaggerWebsocket = catchingFishAdMobToast;
        catchingFishViewWorkManager.CatchingFishWorkManager = catchingFishGlideAdMobMVI;
        catchingFishViewWorkManager.CatchingFishViewModelScope = catchingFishLiveDataHandler;
        catchingFishViewWorkManager.CatchingFishViewModelFAB = catchingFishLiveDataHandler2;
        catchingFishViewWorkManager.CatchingFishLayout = catchingFishToolbarPayPal;
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new CatchingFishMoshiWidgetMVP("Firebase-Messaging-Task"));
        final int i2 = 1;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new CatchingFishMoshiWidgetMVP("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new CatchingFishMoshiWidgetMVP("Firebase-Messaging-File-Io"));
        this.CatchingFishLayout = false;
        CatchingFishEspressoTesting = catchingFishLiveDataHandler3;
        this.CatchingFishParcelableFAB = catchingFishPagingLibrary;
        this.CatchingFishDaggerWebsocket = new CatchingFishWebsocketRoom(this, catchingFishGlideDataStore);
        catchingFishPagingLibrary.CatchingFishParcelableFAB();
        final Context context2 = catchingFishPagingLibrary.CatchingFishParcelableFAB;
        this.CatchingFishSnackbar = context2;
        CatchingFishWebSocketIntent catchingFishWebSocketIntent = new CatchingFishWebSocketIntent();
        this.CatchingFishViewModelFAB = catchingFishAdMobToast;
        this.CatchingFishCoroutine = catchingFishViewWorkManager;
        this.CatchingFishReduxKtor = new CatchingFishViewModelIntent(newSingleThreadExecutor);
        this.CatchingFishWorkManager = scheduledThreadPoolExecutor;
        this.CatchingFishViewModelScope = threadPoolExecutor;
        catchingFishPagingLibrary.CatchingFishParcelableFAB();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(catchingFishWebSocketIntent);
        } else {
            Objects.toString(context);
        }
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: kotlin.text.CatchingFishPicassoRealm
            public final /* synthetic */ FirebaseMessaging CatchingFishDaggerWebsocket;

            {
                this.CatchingFishDaggerWebsocket = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                CatchingFishWorkManagerMVP catchingFishWorkManagerMVP;
                int i3;
                switch (i) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        FirebaseMessaging firebaseMessaging = this.CatchingFishDaggerWebsocket;
                        if (firebaseMessaging.CatchingFishDaggerWebsocket.CatchingFishParcelableFAB() && firebaseMessaging.CatchingFishViewModelFAB(firebaseMessaging.CatchingFishReduxKtor())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.CatchingFishLayout) {
                                    firebaseMessaging.CatchingFishViewModelScope(0L);
                                }
                            }
                            return;
                        }
                        return;
                    default:
                        FirebaseMessaging firebaseMessaging2 = this.CatchingFishDaggerWebsocket;
                        final Context context3 = firebaseMessaging2.CatchingFishSnackbar;
                        CatchingFishToastHiltBundle.CatchingFishParcelableFlux(context3);
                        CatchingFishViewWorkManager catchingFishViewWorkManager2 = firebaseMessaging2.CatchingFishCoroutine;
                        final boolean CatchingFishWorkManager = firebaseMessaging2.CatchingFishWorkManager();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences CatchingFishRoomDatabase = CatchingFishLayoutRoom.CatchingFishRoomDatabase(context3);
                            if (!CatchingFishRoomDatabase.contains("proxy_retention") || CatchingFishRoomDatabase.getBoolean("proxy_retention", false) != CatchingFishWorkManager) {
                                CatchingFishGlideAdMobMVI catchingFishGlideAdMobMVI2 = (CatchingFishGlideAdMobMVI) catchingFishViewWorkManager2.CatchingFishWorkManager;
                                if (catchingFishGlideAdMobMVI2.CatchingFishCoroutine.CatchingFishParcelableFAB() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", CatchingFishWorkManager);
                                    CatchingFishFluxFirebase CatchingFishViewModelFAB = CatchingFishFluxFirebase.CatchingFishViewModelFAB(catchingFishGlideAdMobMVI2.CatchingFishSnackbar);
                                    synchronized (CatchingFishViewModelFAB) {
                                        i3 = CatchingFishViewModelFAB.CatchingFishParcelableFAB;
                                        CatchingFishViewModelFAB.CatchingFishParcelableFAB = i3 + 1;
                                    }
                                    catchingFishWorkManagerMVP = CatchingFishViewModelFAB.CatchingFishLayout(new CatchingFishFluxKtor(i3, 4, bundle, 0));
                                } else {
                                    IOException iOException = new IOException("SERVICE_NOT_AVAILABLE");
                                    CatchingFishWorkManagerMVP catchingFishWorkManagerMVP2 = new CatchingFishWorkManagerMVP();
                                    catchingFishWorkManagerMVP2.CatchingFishCloudMessaging(iOException);
                                    catchingFishWorkManagerMVP = catchingFishWorkManagerMVP2;
                                }
                                catchingFishWorkManagerMVP.CatchingFishSnackbar(new CatchingFishExoPlayerRealm(), new CatchingFishMoshiJUnitRoom() { // from class: kotlin.text.CatchingFishMockkPicassoFAB
                                    @Override // kotlin.text.CatchingFishMoshiJUnitRoom
                                    public final void CatchingFishSnackbar(Object obj) {
                                        SharedPreferences.Editor edit = CatchingFishLayoutRoom.CatchingFishRoomDatabase(context3).edit();
                                        edit.putBoolean("proxy_retention", CatchingFishWorkManager);
                                        edit.apply();
                                    }
                                });
                            }
                        }
                        if (firebaseMessaging2.CatchingFishWorkManager()) {
                            firebaseMessaging2.CatchingFishDaggerWebsocket();
                            return;
                        }
                        return;
                }
            }
        });
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new CatchingFishMoshiWidgetMVP("Firebase-Messaging-Topics-Io"));
        int i3 = CatchingFishRoomView.CatchingFishFragmentHandler;
        CatchingFishViewMVIMVVM.CatchingFishReduxKtor(scheduledThreadPoolExecutor2, new Callable() { // from class: kotlin.text.CatchingFishGsonToastOkHttp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                CatchingFishIntentService catchingFishIntentService;
                Context context3 = context2;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor3 = scheduledThreadPoolExecutor2;
                FirebaseMessaging firebaseMessaging = this;
                CatchingFishAdMobToast catchingFishAdMobToast2 = catchingFishAdMobToast;
                CatchingFishViewWorkManager catchingFishViewWorkManager2 = catchingFishViewWorkManager;
                synchronized (CatchingFishIntentService.class) {
                    try {
                        WeakReference weakReference = CatchingFishIntentService.CatchingFishSnackbar;
                        catchingFishIntentService = weakReference != null ? (CatchingFishIntentService) weakReference.get() : null;
                        if (catchingFishIntentService == null) {
                            SharedPreferences sharedPreferences = context3.getSharedPreferences("com.google.android.gms.appid", 0);
                            CatchingFishIntentService catchingFishIntentService2 = new CatchingFishIntentService();
                            synchronized (catchingFishIntentService2) {
                                catchingFishIntentService2.CatchingFishParcelableFAB = CatchingFishSensorManager.CatchingFishCoroutine(sharedPreferences, scheduledThreadPoolExecutor3);
                            }
                            CatchingFishIntentService.CatchingFishSnackbar = new WeakReference(catchingFishIntentService2);
                            catchingFishIntentService = catchingFishIntentService2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return new CatchingFishRoomView(firebaseMessaging, catchingFishAdMobToast2, catchingFishIntentService, catchingFishViewWorkManager2, context3, scheduledThreadPoolExecutor3);
            }
        }).CatchingFishSnackbar(scheduledThreadPoolExecutor, new CatchingFishGlideViewModel(this, i));
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: kotlin.text.CatchingFishPicassoRealm
            public final /* synthetic */ FirebaseMessaging CatchingFishDaggerWebsocket;

            {
                this.CatchingFishDaggerWebsocket = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                CatchingFishWorkManagerMVP catchingFishWorkManagerMVP;
                int i32;
                switch (i2) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        FirebaseMessaging firebaseMessaging = this.CatchingFishDaggerWebsocket;
                        if (firebaseMessaging.CatchingFishDaggerWebsocket.CatchingFishParcelableFAB() && firebaseMessaging.CatchingFishViewModelFAB(firebaseMessaging.CatchingFishReduxKtor())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.CatchingFishLayout) {
                                    firebaseMessaging.CatchingFishViewModelScope(0L);
                                }
                            }
                            return;
                        }
                        return;
                    default:
                        FirebaseMessaging firebaseMessaging2 = this.CatchingFishDaggerWebsocket;
                        final Context context3 = firebaseMessaging2.CatchingFishSnackbar;
                        CatchingFishToastHiltBundle.CatchingFishParcelableFlux(context3);
                        CatchingFishViewWorkManager catchingFishViewWorkManager2 = firebaseMessaging2.CatchingFishCoroutine;
                        final boolean CatchingFishWorkManager = firebaseMessaging2.CatchingFishWorkManager();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences CatchingFishRoomDatabase = CatchingFishLayoutRoom.CatchingFishRoomDatabase(context3);
                            if (!CatchingFishRoomDatabase.contains("proxy_retention") || CatchingFishRoomDatabase.getBoolean("proxy_retention", false) != CatchingFishWorkManager) {
                                CatchingFishGlideAdMobMVI catchingFishGlideAdMobMVI2 = (CatchingFishGlideAdMobMVI) catchingFishViewWorkManager2.CatchingFishWorkManager;
                                if (catchingFishGlideAdMobMVI2.CatchingFishCoroutine.CatchingFishParcelableFAB() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", CatchingFishWorkManager);
                                    CatchingFishFluxFirebase CatchingFishViewModelFAB = CatchingFishFluxFirebase.CatchingFishViewModelFAB(catchingFishGlideAdMobMVI2.CatchingFishSnackbar);
                                    synchronized (CatchingFishViewModelFAB) {
                                        i32 = CatchingFishViewModelFAB.CatchingFishParcelableFAB;
                                        CatchingFishViewModelFAB.CatchingFishParcelableFAB = i32 + 1;
                                    }
                                    catchingFishWorkManagerMVP = CatchingFishViewModelFAB.CatchingFishLayout(new CatchingFishFluxKtor(i32, 4, bundle, 0));
                                } else {
                                    IOException iOException = new IOException("SERVICE_NOT_AVAILABLE");
                                    CatchingFishWorkManagerMVP catchingFishWorkManagerMVP2 = new CatchingFishWorkManagerMVP();
                                    catchingFishWorkManagerMVP2.CatchingFishCloudMessaging(iOException);
                                    catchingFishWorkManagerMVP = catchingFishWorkManagerMVP2;
                                }
                                catchingFishWorkManagerMVP.CatchingFishSnackbar(new CatchingFishExoPlayerRealm(), new CatchingFishMoshiJUnitRoom() { // from class: kotlin.text.CatchingFishMockkPicassoFAB
                                    @Override // kotlin.text.CatchingFishMoshiJUnitRoom
                                    public final void CatchingFishSnackbar(Object obj) {
                                        SharedPreferences.Editor edit = CatchingFishLayoutRoom.CatchingFishRoomDatabase(context3).edit();
                                        edit.putBoolean("proxy_retention", CatchingFishWorkManager);
                                        edit.apply();
                                    }
                                });
                            }
                        }
                        if (firebaseMessaging2.CatchingFishWorkManager()) {
                            firebaseMessaging2.CatchingFishDaggerWebsocket();
                            return;
                        }
                        return;
                }
            }
        });
    }

    public static synchronized CatchingFishMVPMVPViewModel CatchingFishCoroutine(Context context) {
        CatchingFishMVPMVPViewModel catchingFishMVPMVPViewModel;
        synchronized (FirebaseMessaging.class) {
            try {
                if (CatchingFishCloudMessaging == null) {
                    CatchingFishCloudMessaging = new CatchingFishMVPMVPViewModel(context);
                }
                catchingFishMVPMVPViewModel = CatchingFishCloudMessaging;
            } catch (Throwable th) {
                throw th;
            }
        }
        return catchingFishMVPMVPViewModel;
    }

    public static void CatchingFishSnackbar(Runnable runnable, long j) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (CatchingFishOkHttp == null) {
                    CatchingFishOkHttp = new ScheduledThreadPoolExecutor(1, new CatchingFishMoshiWidgetMVP("TAG"));
                }
                CatchingFishOkHttp.schedule(runnable, j, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized FirebaseMessaging getInstance(com.google.firebase.CatchingFishPagingLibrary catchingFishPagingLibrary) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            catchingFishPagingLibrary.CatchingFishParcelableFAB();
            firebaseMessaging = (FirebaseMessaging) catchingFishPagingLibrary.CatchingFishReduxKtor.CatchingFishParcelableFAB(FirebaseMessaging.class);
            CatchingFishToastHiltBundle.CatchingFishStateLiveData(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public final void CatchingFishDaggerWebsocket() {
        CatchingFishWorkManagerMVP catchingFishWorkManagerMVP;
        int i;
        CatchingFishGlideAdMobMVI catchingFishGlideAdMobMVI = (CatchingFishGlideAdMobMVI) this.CatchingFishCoroutine.CatchingFishWorkManager;
        if (catchingFishGlideAdMobMVI.CatchingFishCoroutine.CatchingFishParcelableFAB() >= 241100000) {
            CatchingFishFluxFirebase CatchingFishViewModelFAB = CatchingFishFluxFirebase.CatchingFishViewModelFAB(catchingFishGlideAdMobMVI.CatchingFishSnackbar);
            Bundle bundle = Bundle.EMPTY;
            synchronized (CatchingFishViewModelFAB) {
                i = CatchingFishViewModelFAB.CatchingFishParcelableFAB;
                CatchingFishViewModelFAB.CatchingFishParcelableFAB = i + 1;
            }
            catchingFishWorkManagerMVP = CatchingFishViewModelFAB.CatchingFishLayout(new CatchingFishFluxKtor(i, 5, bundle, 1)).CatchingFishCoroutine(CatchingFishToastGraphQLMVP.CatchingFishWorkManager, CatchingFishWidgetContext.CatchingFishOkHttp);
        } else {
            IOException iOException = new IOException("SERVICE_NOT_AVAILABLE");
            CatchingFishWorkManagerMVP catchingFishWorkManagerMVP2 = new CatchingFishWorkManagerMVP();
            catchingFishWorkManagerMVP2.CatchingFishCloudMessaging(iOException);
            catchingFishWorkManagerMVP = catchingFishWorkManagerMVP2;
        }
        catchingFishWorkManagerMVP.CatchingFishSnackbar(this.CatchingFishWorkManager, new CatchingFishGlideViewModel(this, 1));
    }

    public final String CatchingFishParcelableFAB() {
        CatchingFishWorkManagerMVP catchingFishWorkManagerMVP;
        CatchingFishMVPRecyclerView CatchingFishReduxKtor = CatchingFishReduxKtor();
        if (!CatchingFishViewModelFAB(CatchingFishReduxKtor)) {
            return CatchingFishReduxKtor.CatchingFishParcelableFAB;
        }
        String CatchingFishCoroutine = CatchingFishAdMobToast.CatchingFishCoroutine(this.CatchingFishParcelableFAB);
        CatchingFishViewModelIntent catchingFishViewModelIntent = this.CatchingFishReduxKtor;
        synchronized (catchingFishViewModelIntent) {
            catchingFishWorkManagerMVP = (CatchingFishWorkManagerMVP) ((CatchingFishCameraXRetrofit) catchingFishViewModelIntent.CatchingFishWorkManager).get(CatchingFishCoroutine);
            if (catchingFishWorkManagerMVP == null) {
                CatchingFishViewWorkManager catchingFishViewWorkManager = this.CatchingFishCoroutine;
                catchingFishWorkManagerMVP = catchingFishViewWorkManager.CatchingFishOkHttp(catchingFishViewWorkManager.CatchingFishNavigation(CatchingFishAdMobToast.CatchingFishCoroutine((com.google.firebase.CatchingFishPagingLibrary) catchingFishViewWorkManager.CatchingFishReduxKtor), "*", new Bundle())).CatchingFishLayout(this.CatchingFishViewModelScope, new CatchingFishDataStoreHilt(this, CatchingFishCoroutine, CatchingFishReduxKtor, 1)).CatchingFishReduxKtor((Executor) catchingFishViewModelIntent.CatchingFishDaggerWebsocket, new CatchingFishXMLLayoutOkHttp(catchingFishViewModelIntent, CatchingFishCoroutine));
                ((CatchingFishCameraXRetrofit) catchingFishViewModelIntent.CatchingFishWorkManager).put(CatchingFishCoroutine, catchingFishWorkManagerMVP);
            }
        }
        try {
            return (String) CatchingFishViewMVIMVVM.CatchingFishSnackbar(catchingFishWorkManagerMVP);
        } catch (InterruptedException | ExecutionException e) {
            throw new IOException(e);
        }
    }

    public final CatchingFishMVPRecyclerView CatchingFishReduxKtor() {
        CatchingFishMVPRecyclerView CatchingFishParcelableFAB;
        CatchingFishMVPMVPViewModel CatchingFishCoroutine = CatchingFishCoroutine(this.CatchingFishSnackbar);
        com.google.firebase.CatchingFishPagingLibrary catchingFishPagingLibrary = this.CatchingFishParcelableFAB;
        catchingFishPagingLibrary.CatchingFishParcelableFAB();
        String CatchingFishCoroutine2 = "[DEFAULT]".equals(catchingFishPagingLibrary.CatchingFishSnackbar) ? "" : catchingFishPagingLibrary.CatchingFishCoroutine();
        String CatchingFishCoroutine3 = CatchingFishAdMobToast.CatchingFishCoroutine(this.CatchingFishParcelableFAB);
        synchronized (CatchingFishCoroutine) {
            CatchingFishParcelableFAB = CatchingFishMVPRecyclerView.CatchingFishParcelableFAB(CatchingFishCoroutine.CatchingFishParcelableFAB.getString(CatchingFishCoroutine2 + "|T|" + CatchingFishCoroutine3 + "|*", null));
        }
        return CatchingFishParcelableFAB;
    }

    public final boolean CatchingFishViewModelFAB(CatchingFishMVPRecyclerView catchingFishMVPRecyclerView) {
        if (catchingFishMVPRecyclerView != null) {
            return System.currentTimeMillis() > catchingFishMVPRecyclerView.CatchingFishCoroutine + CatchingFishMVPRecyclerView.CatchingFishReduxKtor || !this.CatchingFishViewModelFAB.CatchingFishSnackbar().equals(catchingFishMVPRecyclerView.CatchingFishSnackbar);
        }
        return true;
    }

    public final synchronized void CatchingFishViewModelScope(long j) {
        CatchingFishSnackbar(new CatchingFishPagingLibrary(this, Math.min(Math.max(30L, 2 * j), CatchingFishFragmentHandler)), j);
        this.CatchingFishLayout = true;
    }

    public final boolean CatchingFishWorkManager() {
        String notificationDelegate;
        Context context = this.CatchingFishSnackbar;
        CatchingFishToastHiltBundle.CatchingFishParcelableFlux(context);
        if (Build.VERSION.SDK_INT >= 29) {
            if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
                notificationDelegate = ((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate();
                if ("com.google.android.gms".equals(notificationDelegate)) {
                    com.google.firebase.CatchingFishPagingLibrary catchingFishPagingLibrary = this.CatchingFishParcelableFAB;
                    catchingFishPagingLibrary.CatchingFishParcelableFAB();
                    if (catchingFishPagingLibrary.CatchingFishReduxKtor.CatchingFishParcelableFAB(CatchingFishBiometric.class) != null) {
                        return true;
                    }
                    if (CatchingFishDaggerBiometric.CatchingFishAnimationMockk() && CatchingFishEspressoTesting != null) {
                        return true;
                    }
                }
                return false;
            }
            context.getPackageName();
        }
        return false;
    }
}
