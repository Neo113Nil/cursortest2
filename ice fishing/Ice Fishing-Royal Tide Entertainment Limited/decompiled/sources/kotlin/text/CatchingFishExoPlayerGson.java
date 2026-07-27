package kotlin.text;

import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.SparseIntArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class CatchingFishExoPlayerGson implements Handler.Callback {
    public static CatchingFishExoPlayerGson CatchingFishNavigation;
    public final CatchingFishRoomStateFlow CatchingFishCloudMessaging;
    public CatchingFishMVPAdMobKtor CatchingFishCoroutine;
    public final Context CatchingFishDaggerWebsocket;
    public final CatchingFishRoomStateFlow CatchingFishEspressoTesting;
    public final ConcurrentHashMap CatchingFishFragmentHandler;
    public final AtomicInteger CatchingFishLayout;
    public final CatchingFishPayPalRedux CatchingFishOkHttp;
    public long CatchingFishParcelableFAB;
    public CatchingFishGlideToolbar CatchingFishReduxKtor;
    public boolean CatchingFishSnackbar;
    public volatile boolean CatchingFishUnitTesting;
    public final AtomicInteger CatchingFishViewModelFAB;
    public final CatchingFishViewModelIntent CatchingFishViewModelScope;
    public final CatchingFishAdMobAdMob CatchingFishWorkManager;
    public static final Status CatchingFishAnimationMockk = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);
    public static final Status CatchingFishStateLiveData = new Status(4, "The user must be signed in to make this API call.", null, null);
    public static final Object CatchingFishRoomDatabase = new Object();

    public CatchingFishExoPlayerGson(Context context, Looper looper) {
        CatchingFishAdMobAdMob catchingFishAdMobAdMob = CatchingFishAdMobAdMob.CatchingFishDaggerWebsocket;
        this.CatchingFishParcelableFAB = 10000L;
        this.CatchingFishSnackbar = false;
        this.CatchingFishViewModelFAB = new AtomicInteger(1);
        this.CatchingFishLayout = new AtomicInteger(0);
        this.CatchingFishFragmentHandler = new ConcurrentHashMap(5, 0.75f, 1);
        this.CatchingFishCloudMessaging = new CatchingFishRoomStateFlow(0);
        this.CatchingFishEspressoTesting = new CatchingFishRoomStateFlow(0);
        this.CatchingFishUnitTesting = true;
        this.CatchingFishDaggerWebsocket = context;
        CatchingFishPayPalRedux catchingFishPayPalRedux = new CatchingFishPayPalRedux(looper, this);
        Looper.getMainLooper();
        this.CatchingFishOkHttp = catchingFishPayPalRedux;
        this.CatchingFishWorkManager = catchingFishAdMobAdMob;
        this.CatchingFishViewModelScope = new CatchingFishViewModelIntent(28);
        PackageManager packageManager = context.getPackageManager();
        if (CatchingFishFirebaseDagger.CatchingFishJetpackCompose == null) {
            CatchingFishFirebaseDagger.CatchingFishJetpackCompose = Boolean.valueOf(CatchingFishHiltMVPToast.CatchingFishSpannableWidget() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (CatchingFishFirebaseDagger.CatchingFishJetpackCompose.booleanValue()) {
            this.CatchingFishUnitTesting = false;
        }
        catchingFishPayPalRedux.sendMessage(catchingFishPayPalRedux.obtainMessage(6));
    }

    public static CatchingFishExoPlayerGson CatchingFishCoroutine(Context context) {
        CatchingFishExoPlayerGson catchingFishExoPlayerGson;
        HandlerThread handlerThread;
        synchronized (CatchingFishRoomDatabase) {
            if (CatchingFishNavigation == null) {
                synchronized (CatchingFishGradleService.CatchingFishViewModelScope) {
                    try {
                        handlerThread = CatchingFishGradleService.CatchingFishLayout;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            CatchingFishGradleService.CatchingFishLayout = handlerThread2;
                            handlerThread2.start();
                            handlerThread = CatchingFishGradleService.CatchingFishLayout;
                        }
                    } finally {
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = CatchingFishAdMobAdMob.CatchingFishReduxKtor;
                CatchingFishNavigation = new CatchingFishExoPlayerGson(applicationContext, looper);
            }
            catchingFishExoPlayerGson = CatchingFishNavigation;
        }
        return catchingFishExoPlayerGson;
    }

    public static Status CatchingFishSnackbar(CatchingFishExoPlayerRoom catchingFishExoPlayerRoom, ConnectionResult connectionResult) {
        String str = (String) catchingFishExoPlayerRoom.CatchingFishSnackbar.CatchingFishWorkManager;
        String valueOf = String.valueOf(connectionResult);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 63 + valueOf.length());
        sb.append("API: ");
        sb.append(str);
        sb.append(" is not available on this device. Connection failed with: ");
        sb.append(valueOf);
        return new Status(17, sb.toString(), connectionResult.CatchingFishWorkManager, connectionResult);
    }

    public final boolean CatchingFishDaggerWebsocket(ConnectionResult connectionResult, int i) {
        boolean booleanValue;
        boolean isInstantApp;
        PendingIntent activity;
        Boolean bool;
        CatchingFishAdMobAdMob catchingFishAdMobAdMob = this.CatchingFishWorkManager;
        Context context = this.CatchingFishDaggerWebsocket;
        catchingFishAdMobAdMob.getClass();
        synchronized (CatchingFishGsonCardView.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = CatchingFishGsonCardView.CatchingFishParcelableFAB;
            if (context2 != null && (bool = CatchingFishGsonCardView.CatchingFishSnackbar) != null && context2 == applicationContext) {
                booleanValue = bool.booleanValue();
            }
            CatchingFishGsonCardView.CatchingFishSnackbar = null;
            if (CatchingFishHiltMVPToast.CatchingFishSpannableWidget()) {
                isInstantApp = applicationContext.getPackageManager().isInstantApp();
                CatchingFishGsonCardView.CatchingFishSnackbar = Boolean.valueOf(isInstantApp);
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    CatchingFishGsonCardView.CatchingFishSnackbar = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    CatchingFishGsonCardView.CatchingFishSnackbar = Boolean.FALSE;
                }
            }
            CatchingFishGsonCardView.CatchingFishParcelableFAB = applicationContext;
            booleanValue = CatchingFishGsonCardView.CatchingFishSnackbar.booleanValue();
        }
        if (booleanValue) {
            return false;
        }
        int i2 = connectionResult.CatchingFishDaggerWebsocket;
        if ((i2 == 0 || connectionResult.CatchingFishWorkManager == null) ? false : true) {
            activity = connectionResult.CatchingFishWorkManager;
        } else {
            Intent CatchingFishParcelableFAB = catchingFishAdMobAdMob.CatchingFishParcelableFAB(i2, context, null);
            activity = CatchingFishParcelableFAB != null ? PendingIntent.getActivity(context, 0, CatchingFishParcelableFAB, 201326592) : null;
        }
        if (activity == null) {
            return false;
        }
        int i3 = connectionResult.CatchingFishDaggerWebsocket;
        int i4 = GoogleApiActivity.CatchingFishDaggerWebsocket;
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra("pending_intent", activity);
        intent.putExtra("failing_client_id", i);
        intent.putExtra("notify_manager", true);
        catchingFishAdMobAdMob.CatchingFishWorkManager(context, i3, PendingIntent.getActivity(context, 0, intent, CatchingFishViewRoomContext.CatchingFishParcelableFAB | 134217728));
        catchingFishAdMobAdMob.getClass();
        Integer num = connectionResult.CatchingFishViewModelFAB;
        CatchingFishMVVMIntent catchingFishMVVMIntent = new CatchingFishMVVMIntent(num == null ? -1 : num.intValue(), context.getPackageName(), System.currentTimeMillis(), connectionResult.CatchingFishDaggerWebsocket, false);
        if (catchingFishAdMobAdMob.CatchingFishCoroutine == null) {
            catchingFishAdMobAdMob.CatchingFishCoroutine = new CatchingFishGlideToolbar(context, CatchingFishGlideToolbar.CatchingFishFragmentHandler, CatchingFishFABMVICardView.CatchingFishParcelableFAB, CatchingFishHiltMVIViewFAB.CatchingFishSnackbar);
        }
        CatchingFishGlideToolbar catchingFishGlideToolbar = catchingFishAdMobAdMob.CatchingFishCoroutine;
        catchingFishGlideToolbar.getClass();
        CatchingFishGlideFAB catchingFishGlideFAB = new CatchingFishGlideFAB();
        catchingFishGlideFAB.CatchingFishCoroutine = new CatchingFishAppCompatPayPal[]{CatchingFishBiometricBundle.CatchingFishOkHttp};
        catchingFishGlideFAB.CatchingFishParcelableFAB = false;
        catchingFishGlideFAB.CatchingFishSnackbar = new CatchingFishEspressoPayPal(20, catchingFishMVVMIntent);
        catchingFishGlideToolbar.CatchingFishSnackbar(new CatchingFishGlideFAB(catchingFishGlideFAB, (CatchingFishAppCompatPayPal[]) catchingFishGlideFAB.CatchingFishCoroutine, catchingFishGlideFAB.CatchingFishParcelableFAB));
        return true;
    }

    public final CatchingFishAdMobDaggerMVP CatchingFishParcelableFAB(CatchingFishViewModelHilt catchingFishViewModelHilt) {
        CatchingFishExoPlayerRoom catchingFishExoPlayerRoom = catchingFishViewModelHilt.CatchingFishWorkManager;
        ConcurrentHashMap concurrentHashMap = this.CatchingFishFragmentHandler;
        CatchingFishAdMobDaggerMVP catchingFishAdMobDaggerMVP = (CatchingFishAdMobDaggerMVP) concurrentHashMap.get(catchingFishExoPlayerRoom);
        if (catchingFishAdMobDaggerMVP == null) {
            catchingFishAdMobDaggerMVP = new CatchingFishAdMobDaggerMVP(this, catchingFishViewModelHilt);
            concurrentHashMap.put(catchingFishExoPlayerRoom, catchingFishAdMobDaggerMVP);
        }
        if (catchingFishAdMobDaggerMVP.CatchingFishOkHttp.CatchingFishSnackbar()) {
            this.CatchingFishEspressoTesting.add(catchingFishExoPlayerRoom);
        }
        catchingFishAdMobDaggerMVP.CatchingFishRoomDatabase();
        return catchingFishAdMobDaggerMVP;
    }

    public final boolean CatchingFishReduxKtor() {
        int i;
        if (this.CatchingFishSnackbar) {
            return false;
        }
        CatchingFishWidgetContext.CatchingFishSnackbar().getClass();
        SparseIntArray sparseIntArray = (SparseIntArray) this.CatchingFishViewModelScope.CatchingFishDaggerWebsocket;
        synchronized (sparseIntArray) {
            i = sparseIntArray.get(203400000, -1);
        }
        return i == -1 || i == 0;
    }

    public final void CatchingFishWorkManager(ConnectionResult connectionResult, int i) {
        if (CatchingFishDaggerWebsocket(connectionResult, i)) {
            return;
        }
        CatchingFishPayPalRedux catchingFishPayPalRedux = this.CatchingFishOkHttp;
        catchingFishPayPalRedux.sendMessage(catchingFishPayPalRedux.obtainMessage(5, i, 0, connectionResult));
    }

    /* JADX WARN: Removed duplicated region for block: B:179:0x0381  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(Message message) {
        CatchingFishAdMobDaggerMVP catchingFishAdMobDaggerMVP;
        boolean z;
        boolean isIsolated;
        CatchingFishAppCompatPayPal[] CatchingFishParcelableFAB;
        CatchingFishPayPalRedux catchingFishPayPalRedux = this.CatchingFishOkHttp;
        ConcurrentHashMap concurrentHashMap = this.CatchingFishFragmentHandler;
        int i = message.what;
        int i2 = 21;
        switch (i) {
            case 1:
                this.CatchingFishParcelableFAB = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                catchingFishPayPalRedux.removeMessages(12);
                Iterator it = concurrentHashMap.keySet().iterator();
                while (it.hasNext()) {
                    catchingFishPayPalRedux.sendMessageDelayed(catchingFishPayPalRedux.obtainMessage(12, (CatchingFishExoPlayerRoom) it.next()), this.CatchingFishParcelableFAB);
                }
                return true;
            case 2:
                throw CatchingFishMVPLiveData.CatchingFishLayout(message.obj);
            case 3:
                for (CatchingFishAdMobDaggerMVP catchingFishAdMobDaggerMVP2 : concurrentHashMap.values()) {
                    CatchingFishToastHiltBundle.CatchingFishCloudMessaging(catchingFishAdMobDaggerMVP2.CatchingFishSpannableWidget.CatchingFishOkHttp);
                    catchingFishAdMobDaggerMVP2.CatchingFishDaggerHiltFAB = null;
                    catchingFishAdMobDaggerMVP2.CatchingFishRoomDatabase();
                }
                return true;
            case 4:
            case CatchingFishMoshiSpannable.BYTES_FIELD_NUMBER /* 8 */:
            case 13:
                CatchingFishViewLifecycle catchingFishViewLifecycle = (CatchingFishViewLifecycle) message.obj;
                CatchingFishViewModelHilt catchingFishViewModelHilt = catchingFishViewLifecycle.CatchingFishCoroutine;
                CatchingFishFluxFABAndroidX catchingFishFluxFABAndroidX = catchingFishViewLifecycle.CatchingFishParcelableFAB;
                CatchingFishAdMobDaggerMVP catchingFishAdMobDaggerMVP3 = (CatchingFishAdMobDaggerMVP) concurrentHashMap.get(catchingFishViewModelHilt.CatchingFishWorkManager);
                if (catchingFishAdMobDaggerMVP3 == null) {
                    catchingFishAdMobDaggerMVP3 = CatchingFishParcelableFAB(catchingFishViewModelHilt);
                }
                if (!catchingFishAdMobDaggerMVP3.CatchingFishOkHttp.CatchingFishSnackbar() || this.CatchingFishLayout.get() == catchingFishViewLifecycle.CatchingFishSnackbar) {
                    catchingFishAdMobDaggerMVP3.CatchingFishAnimationMockk(catchingFishFluxFABAndroidX);
                    return true;
                }
                catchingFishFluxFABAndroidX.CatchingFishReduxKtor(CatchingFishAnimationMockk);
                catchingFishAdMobDaggerMVP3.CatchingFishStateLiveData();
                return true;
            case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                int i3 = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                Iterator it2 = concurrentHashMap.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        catchingFishAdMobDaggerMVP = (CatchingFishAdMobDaggerMVP) it2.next();
                        if (catchingFishAdMobDaggerMVP.CatchingFishNavigation == i3) {
                        }
                    } else {
                        catchingFishAdMobDaggerMVP = null;
                    }
                }
                if (catchingFishAdMobDaggerMVP == null) {
                    new StringBuilder(String.valueOf(i3).length() + 65);
                    new Exception();
                    return true;
                }
                int i4 = connectionResult.CatchingFishDaggerWebsocket;
                if (i4 != 13) {
                    catchingFishAdMobDaggerMVP.CatchingFishFragmentHandler(CatchingFishSnackbar(catchingFishAdMobDaggerMVP.CatchingFishUnitTesting, connectionResult));
                    return true;
                }
                this.CatchingFishWorkManager.getClass();
                AtomicBoolean atomicBoolean = CatchingFishFluxParcelable.CatchingFishParcelableFAB;
                String CatchingFishParcelableFAB2 = ConnectionResult.CatchingFishParcelableFAB(i4);
                String str = connectionResult.CatchingFishViewModelScope;
                StringBuilder sb = new StringBuilder(String.valueOf(CatchingFishParcelableFAB2).length() + 69 + String.valueOf(str).length());
                sb.append("Error resolution was canceled by the user, original error message: ");
                sb.append(CatchingFishParcelableFAB2);
                sb.append(": ");
                sb.append(str);
                catchingFishAdMobDaggerMVP.CatchingFishFragmentHandler(new Status(17, sb.toString(), null, null));
                return true;
            case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                Context context = this.CatchingFishDaggerWebsocket;
                if (context.getApplicationContext() instanceof Application) {
                    CatchingFishMockkExoPlayer.CatchingFishParcelableFAB((Application) context.getApplicationContext());
                    CatchingFishMockkExoPlayer catchingFishMockkExoPlayer = CatchingFishMockkExoPlayer.CatchingFishViewModelFAB;
                    CatchingFishRealmFlux catchingFishRealmFlux = new CatchingFishRealmFlux(this);
                    catchingFishMockkExoPlayer.getClass();
                    synchronized (catchingFishMockkExoPlayer) {
                        catchingFishMockkExoPlayer.CatchingFishWorkManager.add(catchingFishRealmFlux);
                    }
                    AtomicBoolean atomicBoolean2 = catchingFishMockkExoPlayer.CatchingFishReduxKtor;
                    AtomicBoolean atomicBoolean3 = catchingFishMockkExoPlayer.CatchingFishDaggerWebsocket;
                    if (!atomicBoolean3.get()) {
                        Boolean bool = CatchingFishKtorViewModel.CatchingFishCoroutine;
                        if (bool == null) {
                            if (Build.VERSION.SDK_INT >= 28) {
                                isIsolated = Process.isIsolated();
                                bool = Boolean.valueOf(isIsolated);
                            } else {
                                try {
                                    Object invoke = Process.class.getDeclaredMethod("isIsolated", null).invoke(null, null);
                                    Object[] objArr = new Object[0];
                                    if (invoke == null) {
                                        throw new CatchingFishBiometricView(CatchingFishKtorViewModel.CatchingFishCustomView("expected a non-null reference", objArr));
                                    }
                                    bool = (Boolean) invoke;
                                } catch (ReflectiveOperationException unused) {
                                    bool = Boolean.FALSE;
                                }
                            }
                            CatchingFishKtorViewModel.CatchingFishCoroutine = bool;
                        }
                        if (bool.booleanValue()) {
                            z = true;
                            if (!z) {
                                this.CatchingFishParcelableFAB = 300000L;
                            }
                        } else {
                            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                            ActivityManager.getMyMemoryState(runningAppProcessInfo);
                            if (!atomicBoolean3.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                                atomicBoolean2.set(true);
                            }
                        }
                    }
                    z = atomicBoolean2.get();
                    if (!z) {
                    }
                }
                return true;
            case CatchingFishMoshiSpannable.DOUBLE_FIELD_NUMBER /* 7 */:
                CatchingFishParcelableFAB((CatchingFishViewModelHilt) message.obj);
                return true;
            case 9:
                if (concurrentHashMap.containsKey(message.obj)) {
                    CatchingFishAdMobDaggerMVP catchingFishAdMobDaggerMVP4 = (CatchingFishAdMobDaggerMVP) concurrentHashMap.get(message.obj);
                    CatchingFishToastHiltBundle.CatchingFishCloudMessaging(catchingFishAdMobDaggerMVP4.CatchingFishSpannableWidget.CatchingFishOkHttp);
                    if (catchingFishAdMobDaggerMVP4.CatchingFishJetpackCompose) {
                        catchingFishAdMobDaggerMVP4.CatchingFishRoomDatabase();
                        return true;
                    }
                }
                return true;
            case 10:
                CatchingFishRoomStateFlow catchingFishRoomStateFlow = this.CatchingFishEspressoTesting;
                catchingFishRoomStateFlow.getClass();
                CatchingFishHiltToast catchingFishHiltToast = new CatchingFishHiltToast(catchingFishRoomStateFlow);
                while (catchingFishHiltToast.hasNext()) {
                    CatchingFishAdMobDaggerMVP catchingFishAdMobDaggerMVP5 = (CatchingFishAdMobDaggerMVP) concurrentHashMap.remove((CatchingFishExoPlayerRoom) catchingFishHiltToast.next());
                    if (catchingFishAdMobDaggerMVP5 != null) {
                        catchingFishAdMobDaggerMVP5.CatchingFishStateLiveData();
                    }
                }
                catchingFishRoomStateFlow.clear();
                return true;
            case 11:
                if (concurrentHashMap.containsKey(message.obj)) {
                    CatchingFishAdMobDaggerMVP catchingFishAdMobDaggerMVP6 = (CatchingFishAdMobDaggerMVP) concurrentHashMap.get(message.obj);
                    CatchingFishExoPlayerGson catchingFishExoPlayerGson = catchingFishAdMobDaggerMVP6.CatchingFishSpannableWidget;
                    CatchingFishToastHiltBundle.CatchingFishCloudMessaging(catchingFishExoPlayerGson.CatchingFishOkHttp);
                    boolean z2 = catchingFishAdMobDaggerMVP6.CatchingFishJetpackCompose;
                    if (z2) {
                        if (z2) {
                            CatchingFishExoPlayerGson catchingFishExoPlayerGson2 = catchingFishAdMobDaggerMVP6.CatchingFishSpannableWidget;
                            CatchingFishExoPlayerRoom catchingFishExoPlayerRoom = catchingFishAdMobDaggerMVP6.CatchingFishUnitTesting;
                            catchingFishExoPlayerGson2.CatchingFishOkHttp.removeMessages(11, catchingFishExoPlayerRoom);
                            catchingFishExoPlayerGson2.CatchingFishOkHttp.removeMessages(9, catchingFishExoPlayerRoom);
                            catchingFishAdMobDaggerMVP6.CatchingFishJetpackCompose = false;
                        }
                        catchingFishAdMobDaggerMVP6.CatchingFishFragmentHandler(catchingFishExoPlayerGson.CatchingFishWorkManager.CatchingFishSnackbar(catchingFishExoPlayerGson.CatchingFishDaggerWebsocket, CatchingFishFABKtor.CatchingFishParcelableFAB) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.", null, null) : new Status(22, "API failed to connect while resuming due to an unknown error.", null, null));
                        ((com.google.android.gms.common.internal.CatchingFishPagingLibrary) catchingFishAdMobDaggerMVP6.CatchingFishOkHttp).CatchingFishDaggerWebsocket("Timing out connection while resuming.");
                        return true;
                    }
                }
                return true;
            case 12:
                if (concurrentHashMap.containsKey(message.obj)) {
                    CatchingFishAdMobDaggerMVP catchingFishAdMobDaggerMVP7 = (CatchingFishAdMobDaggerMVP) concurrentHashMap.get(message.obj);
                    CatchingFishToastHiltBundle.CatchingFishCloudMessaging(catchingFishAdMobDaggerMVP7.CatchingFishSpannableWidget.CatchingFishOkHttp);
                    com.google.android.gms.common.internal.CatchingFishPagingLibrary catchingFishPagingLibrary = (com.google.android.gms.common.internal.CatchingFishPagingLibrary) catchingFishAdMobDaggerMVP7.CatchingFishOkHttp;
                    if (catchingFishPagingLibrary.CatchingFishOkHttp() && catchingFishAdMobDaggerMVP7.CatchingFishRoomDatabase.isEmpty()) {
                        CatchingFishViewModelIntent catchingFishViewModelIntent = catchingFishAdMobDaggerMVP7.CatchingFishAnimationMockk;
                        if (((Map) catchingFishViewModelIntent.CatchingFishWorkManager).isEmpty() && ((Map) catchingFishViewModelIntent.CatchingFishDaggerWebsocket).isEmpty()) {
                            catchingFishPagingLibrary.CatchingFishDaggerWebsocket("Timing out service connection.");
                            return true;
                        }
                        catchingFishAdMobDaggerMVP7.CatchingFishCloudMessaging();
                    }
                    return true;
                }
                return true;
            case 14:
                throw CatchingFishMVPLiveData.CatchingFishLayout(message.obj);
            case 15:
                CatchingFishRoomGsonMVP catchingFishRoomGsonMVP = (CatchingFishRoomGsonMVP) message.obj;
                if (concurrentHashMap.containsKey(catchingFishRoomGsonMVP.CatchingFishParcelableFAB)) {
                    CatchingFishAdMobDaggerMVP catchingFishAdMobDaggerMVP8 = (CatchingFishAdMobDaggerMVP) concurrentHashMap.get(catchingFishRoomGsonMVP.CatchingFishParcelableFAB);
                    if (catchingFishAdMobDaggerMVP8.CatchingFishCoroutineFlow.contains(catchingFishRoomGsonMVP) && !catchingFishAdMobDaggerMVP8.CatchingFishJetpackCompose) {
                        if (((com.google.android.gms.common.internal.CatchingFishPagingLibrary) catchingFishAdMobDaggerMVP8.CatchingFishOkHttp).CatchingFishOkHttp()) {
                            catchingFishAdMobDaggerMVP8.CatchingFishViewModelScope();
                            return true;
                        }
                        catchingFishAdMobDaggerMVP8.CatchingFishRoomDatabase();
                        return true;
                    }
                }
                return true;
            case 16:
                CatchingFishRoomGsonMVP catchingFishRoomGsonMVP2 = (CatchingFishRoomGsonMVP) message.obj;
                if (concurrentHashMap.containsKey(catchingFishRoomGsonMVP2.CatchingFishParcelableFAB)) {
                    CatchingFishAdMobDaggerMVP catchingFishAdMobDaggerMVP9 = (CatchingFishAdMobDaggerMVP) concurrentHashMap.get(catchingFishRoomGsonMVP2.CatchingFishParcelableFAB);
                    if (catchingFishAdMobDaggerMVP9.CatchingFishCoroutineFlow.remove(catchingFishRoomGsonMVP2)) {
                        CatchingFishExoPlayerGson catchingFishExoPlayerGson3 = catchingFishAdMobDaggerMVP9.CatchingFishSpannableWidget;
                        catchingFishExoPlayerGson3.CatchingFishOkHttp.removeMessages(15, catchingFishRoomGsonMVP2);
                        catchingFishExoPlayerGson3.CatchingFishOkHttp.removeMessages(16, catchingFishRoomGsonMVP2);
                        CatchingFishAppCompatPayPal catchingFishAppCompatPayPal = catchingFishRoomGsonMVP2.CatchingFishSnackbar;
                        LinkedList<CatchingFishCardViewFluxMVI> linkedList = catchingFishAdMobDaggerMVP9.CatchingFishEspressoTesting;
                        ArrayList arrayList = new ArrayList(linkedList.size());
                        for (CatchingFishCardViewFluxMVI catchingFishCardViewFluxMVI : linkedList) {
                            if (catchingFishCardViewFluxMVI != null && (CatchingFishParcelableFAB = catchingFishCardViewFluxMVI.CatchingFishParcelableFAB(catchingFishAdMobDaggerMVP9)) != null) {
                                int length = CatchingFishParcelableFAB.length;
                                int i5 = 0;
                                while (true) {
                                    if (i5 >= length) {
                                        break;
                                    }
                                    if (!CatchingFishLayoutRoom.CatchingFishOkHttp(CatchingFishParcelableFAB[i5], catchingFishAppCompatPayPal)) {
                                        i5++;
                                    } else if (i5 >= 0) {
                                        arrayList.add(catchingFishCardViewFluxMVI);
                                    }
                                }
                            }
                        }
                        int size = arrayList.size();
                        for (int i6 = 0; i6 < size; i6++) {
                            CatchingFishCardViewFluxMVI catchingFishCardViewFluxMVI2 = (CatchingFishCardViewFluxMVI) arrayList.get(i6);
                            linkedList.remove(catchingFishCardViewFluxMVI2);
                            catchingFishCardViewFluxMVI2.CatchingFishDaggerWebsocket(new CatchingFishHandlerGlideMVP(catchingFishAppCompatPayPal));
                        }
                    }
                }
                return true;
            case 17:
                CatchingFishMVPAdMobKtor catchingFishMVPAdMobKtor = this.CatchingFishCoroutine;
                if (catchingFishMVPAdMobKtor != null) {
                    if (catchingFishMVPAdMobKtor.CatchingFishReduxKtor > 0 || CatchingFishReduxKtor()) {
                        if (this.CatchingFishReduxKtor == null) {
                            this.CatchingFishReduxKtor = new CatchingFishGlideToolbar(this.CatchingFishDaggerWebsocket, CatchingFishGlideToolbar.CatchingFishCloudMessaging, CatchingFishBundleHandler.CatchingFishSnackbar, CatchingFishHiltMVIViewFAB.CatchingFishSnackbar);
                        }
                        CatchingFishGlideToolbar catchingFishGlideToolbar = this.CatchingFishReduxKtor;
                        catchingFishGlideToolbar.getClass();
                        CatchingFishGlideFAB catchingFishGlideFAB = new CatchingFishGlideFAB();
                        CatchingFishAppCompatPayPal[] catchingFishAppCompatPayPalArr = {CatchingFishBiometricBundle.CatchingFishEspressoTesting};
                        catchingFishGlideFAB.CatchingFishCoroutine = catchingFishAppCompatPayPalArr;
                        catchingFishGlideFAB.CatchingFishParcelableFAB = false;
                        catchingFishGlideFAB.CatchingFishSnackbar = new CatchingFishEspressoPayPal(i2, catchingFishMVPAdMobKtor);
                        catchingFishGlideToolbar.CatchingFishSnackbar(new CatchingFishGlideFAB(catchingFishGlideFAB, catchingFishAppCompatPayPalArr, false));
                    }
                    this.CatchingFishCoroutine = null;
                    return true;
                }
                return true;
            case 18:
                ((CatchingFishJUnitAppCompat) message.obj).getClass();
                if (0 == 0) {
                    CatchingFishMVPAdMobKtor catchingFishMVPAdMobKtor2 = new CatchingFishMVPAdMobKtor(0, Arrays.asList(null));
                    if (this.CatchingFishReduxKtor == null) {
                        this.CatchingFishReduxKtor = new CatchingFishGlideToolbar(this.CatchingFishDaggerWebsocket, CatchingFishGlideToolbar.CatchingFishCloudMessaging, CatchingFishBundleHandler.CatchingFishSnackbar, CatchingFishHiltMVIViewFAB.CatchingFishSnackbar);
                    }
                    CatchingFishGlideToolbar catchingFishGlideToolbar2 = this.CatchingFishReduxKtor;
                    catchingFishGlideToolbar2.getClass();
                    CatchingFishGlideFAB catchingFishGlideFAB2 = new CatchingFishGlideFAB();
                    CatchingFishAppCompatPayPal[] catchingFishAppCompatPayPalArr2 = {CatchingFishBiometricBundle.CatchingFishEspressoTesting};
                    catchingFishGlideFAB2.CatchingFishCoroutine = catchingFishAppCompatPayPalArr2;
                    catchingFishGlideFAB2.CatchingFishParcelableFAB = false;
                    catchingFishGlideFAB2.CatchingFishSnackbar = new CatchingFishEspressoPayPal(i2, catchingFishMVPAdMobKtor2);
                    catchingFishGlideToolbar2.CatchingFishSnackbar(new CatchingFishGlideFAB(catchingFishGlideFAB2, catchingFishAppCompatPayPalArr2, false));
                    return true;
                }
                CatchingFishMVPAdMobKtor catchingFishMVPAdMobKtor3 = this.CatchingFishCoroutine;
                if (catchingFishMVPAdMobKtor3 != null) {
                    List list = catchingFishMVPAdMobKtor3.CatchingFishDaggerWebsocket;
                    if (catchingFishMVPAdMobKtor3.CatchingFishReduxKtor != 0 || (list != null && list.size() >= 0)) {
                        catchingFishPayPalRedux.removeMessages(17);
                        CatchingFishMVPAdMobKtor catchingFishMVPAdMobKtor4 = this.CatchingFishCoroutine;
                        if (catchingFishMVPAdMobKtor4 != null) {
                            if (catchingFishMVPAdMobKtor4.CatchingFishReduxKtor > 0 || CatchingFishReduxKtor()) {
                                if (this.CatchingFishReduxKtor == null) {
                                    this.CatchingFishReduxKtor = new CatchingFishGlideToolbar(this.CatchingFishDaggerWebsocket, CatchingFishGlideToolbar.CatchingFishCloudMessaging, CatchingFishBundleHandler.CatchingFishSnackbar, CatchingFishHiltMVIViewFAB.CatchingFishSnackbar);
                                }
                                CatchingFishGlideToolbar catchingFishGlideToolbar3 = this.CatchingFishReduxKtor;
                                catchingFishGlideToolbar3.getClass();
                                CatchingFishGlideFAB catchingFishGlideFAB3 = new CatchingFishGlideFAB();
                                CatchingFishAppCompatPayPal[] catchingFishAppCompatPayPalArr3 = {CatchingFishBiometricBundle.CatchingFishEspressoTesting};
                                catchingFishGlideFAB3.CatchingFishCoroutine = catchingFishAppCompatPayPalArr3;
                                catchingFishGlideFAB3.CatchingFishParcelableFAB = false;
                                catchingFishGlideFAB3.CatchingFishSnackbar = new CatchingFishEspressoPayPal(i2, catchingFishMVPAdMobKtor4);
                                catchingFishGlideToolbar3.CatchingFishSnackbar(new CatchingFishGlideFAB(catchingFishGlideFAB3, catchingFishAppCompatPayPalArr3, false));
                            }
                            this.CatchingFishCoroutine = null;
                        }
                    } else {
                        CatchingFishMVPAdMobKtor catchingFishMVPAdMobKtor5 = this.CatchingFishCoroutine;
                        if (catchingFishMVPAdMobKtor5.CatchingFishDaggerWebsocket == null) {
                            catchingFishMVPAdMobKtor5.CatchingFishDaggerWebsocket = new ArrayList();
                        }
                        catchingFishMVPAdMobKtor5.CatchingFishDaggerWebsocket.add(null);
                    }
                }
                if (this.CatchingFishCoroutine == null) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(null);
                    this.CatchingFishCoroutine = new CatchingFishMVPAdMobKtor(0, arrayList2);
                    catchingFishPayPalRedux.sendMessageDelayed(catchingFishPayPalRedux.obtainMessage(17), 0L);
                    return true;
                }
                return true;
            case 19:
                this.CatchingFishSnackbar = false;
                return true;
            default:
                new StringBuilder(String.valueOf(i).length() + 20);
                return false;
        }
    }
}
