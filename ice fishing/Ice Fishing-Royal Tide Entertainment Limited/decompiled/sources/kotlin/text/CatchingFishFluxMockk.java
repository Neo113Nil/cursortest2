package kotlin.text;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class CatchingFishFluxMockk {
    public final HashMap CatchingFishCloudMessaging;
    public int CatchingFishCoroutine;
    public long CatchingFishDaggerWebsocket;
    public final AtomicInteger CatchingFishEspressoTesting;
    public final String CatchingFishFragmentHandler;
    public final CatchingFishWidgetContext CatchingFishLayout;
    public final ScheduledExecutorService CatchingFishOkHttp;
    public final Object CatchingFishParcelableFAB;
    public ScheduledFuture CatchingFishReduxKtor;
    public final PowerManager.WakeLock CatchingFishSnackbar;
    public CatchingFishViewModelGson CatchingFishViewModelFAB;
    public boolean CatchingFishViewModelScope;
    public final HashSet CatchingFishWorkManager;
    public static final long CatchingFishUnitTesting = TimeUnit.DAYS.toMillis(366);
    public static volatile ScheduledExecutorService CatchingFishAnimationMockk = null;
    public static final Object CatchingFishStateLiveData = new Object();

    public CatchingFishFluxMockk(Context context) {
        boolean z;
        String packageName = context.getPackageName();
        this.CatchingFishParcelableFAB = new Object();
        this.CatchingFishCoroutine = 0;
        this.CatchingFishWorkManager = new HashSet();
        this.CatchingFishViewModelScope = true;
        this.CatchingFishLayout = CatchingFishWidgetContext.CatchingFishWorkManager;
        this.CatchingFishCloudMessaging = new HashMap();
        this.CatchingFishEspressoTesting = new AtomicInteger(0);
        CatchingFishToastHiltBundle.CatchingFishOkHttp("wake:com.google.firebase.iid.WakeLockHolder", "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        WorkSource workSource = null;
        this.CatchingFishViewModelFAB = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.CatchingFishFragmentHandler = "wake:com.google.firebase.iid.WakeLockHolder";
        } else {
            this.CatchingFishFragmentHandler = "wake:com.google.firebase.iid.WakeLockHolder".length() != 0 ? "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder") : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb = new StringBuilder(29);
            sb.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new CatchingFishBiometricView(sb.toString());
        }
        this.CatchingFishSnackbar = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
        Method method = CatchingFishRetrofitToolbar.CatchingFishParcelableFAB;
        synchronized (CatchingFishRetrofitToolbar.class) {
            Boolean bool = CatchingFishRetrofitToolbar.CatchingFishCoroutine;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = CatchingFishGsonCardView.CatchingFishCloudMessaging(context, "android.permission.UPDATE_DEVICE_STATS") == 0;
                CatchingFishRetrofitToolbar.CatchingFishCoroutine = Boolean.valueOf(z);
            }
        }
        if (z) {
            int i = CatchingFishRoomJUnitGson.CatchingFishParcelableFAB;
            packageName = packageName == null || packageName.trim().isEmpty() ? context.getPackageName() : packageName;
            if (context.getPackageManager() != null && packageName != null) {
                try {
                    ApplicationInfo applicationInfo = CatchingFishHiltSnackbarMVP.CatchingFishParcelableFAB(context).CatchingFishParcelableFAB.getPackageManager().getApplicationInfo(packageName, 0);
                    if (applicationInfo == null) {
                        "Could not get applicationInfo from package: ".concat(packageName);
                    } else {
                        int i2 = applicationInfo.uid;
                        workSource = new WorkSource();
                        Method method2 = CatchingFishRetrofitToolbar.CatchingFishSnackbar;
                        try {
                            if (method2 != null) {
                                method2.invoke(workSource, Integer.valueOf(i2), packageName);
                            } else {
                                Method method3 = CatchingFishRetrofitToolbar.CatchingFishParcelableFAB;
                                if (method3 != null) {
                                    method3.invoke(workSource, Integer.valueOf(i2));
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    "Could not find package: ".concat(packageName);
                }
            }
            if (workSource != null) {
                try {
                    this.CatchingFishSnackbar.setWorkSource(workSource);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
                    e.toString();
                }
            }
        }
        ScheduledExecutorService scheduledExecutorService = CatchingFishAnimationMockk;
        if (scheduledExecutorService == null) {
            synchronized (CatchingFishStateLiveData) {
                try {
                    scheduledExecutorService = CatchingFishAnimationMockk;
                    if (scheduledExecutorService == null) {
                        scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        CatchingFishAnimationMockk = scheduledExecutorService;
                    }
                } finally {
                }
            }
        }
        this.CatchingFishOkHttp = scheduledExecutorService;
    }

    public final void CatchingFishCoroutine() {
        if (this.CatchingFishEspressoTesting.decrementAndGet() < 0) {
            String.valueOf(this.CatchingFishFragmentHandler).concat(" release without a matched acquire!");
        }
        synchronized (this.CatchingFishParcelableFAB) {
            try {
                if (this.CatchingFishViewModelScope) {
                    TextUtils.isEmpty(null);
                }
                if (this.CatchingFishCloudMessaging.containsKey(null)) {
                    CatchingFishRealmRedux catchingFishRealmRedux = (CatchingFishRealmRedux) this.CatchingFishCloudMessaging.get(null);
                    if (catchingFishRealmRedux != null) {
                        int i = catchingFishRealmRedux.CatchingFishParcelableFAB - 1;
                        catchingFishRealmRedux.CatchingFishParcelableFAB = i;
                        if (i == 0) {
                            this.CatchingFishCloudMessaging.remove(null);
                        }
                    }
                } else {
                    String.valueOf(this.CatchingFishFragmentHandler).concat(" counter does not exist");
                }
                CatchingFishDaggerWebsocket();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void CatchingFishDaggerWebsocket() {
        synchronized (this.CatchingFishParcelableFAB) {
            try {
                if (CatchingFishSnackbar()) {
                    if (this.CatchingFishViewModelScope) {
                        int i = this.CatchingFishCoroutine - 1;
                        this.CatchingFishCoroutine = i;
                        if (i > 0) {
                            return;
                        }
                    } else {
                        this.CatchingFishCoroutine = 0;
                    }
                    CatchingFishReduxKtor();
                    Iterator it = this.CatchingFishCloudMessaging.values().iterator();
                    while (it.hasNext()) {
                        ((CatchingFishRealmRedux) it.next()).CatchingFishParcelableFAB = 0;
                    }
                    this.CatchingFishCloudMessaging.clear();
                    ScheduledFuture scheduledFuture = this.CatchingFishReduxKtor;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                        this.CatchingFishReduxKtor = null;
                        this.CatchingFishDaggerWebsocket = 0L;
                    }
                    if (this.CatchingFishSnackbar.isHeld()) {
                        try {
                            try {
                                this.CatchingFishSnackbar.release();
                                if (this.CatchingFishViewModelFAB != null) {
                                    this.CatchingFishViewModelFAB = null;
                                }
                            } catch (RuntimeException e) {
                                if (!e.getClass().equals(RuntimeException.class)) {
                                    throw e;
                                }
                                String.valueOf(this.CatchingFishFragmentHandler).concat(" failed to release!");
                                if (this.CatchingFishViewModelFAB != null) {
                                    this.CatchingFishViewModelFAB = null;
                                }
                            }
                        } catch (Throwable th) {
                            if (this.CatchingFishViewModelFAB != null) {
                                this.CatchingFishViewModelFAB = null;
                            }
                            throw th;
                        }
                    } else {
                        String.valueOf(this.CatchingFishFragmentHandler).concat(" should be held!");
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void CatchingFishParcelableFAB(long j) {
        this.CatchingFishEspressoTesting.incrementAndGet();
        long max = Math.max(Math.min(Long.MAX_VALUE, CatchingFishUnitTesting), 1L);
        if (j > 0) {
            max = Math.min(j, max);
        }
        synchronized (this.CatchingFishParcelableFAB) {
            try {
                if (!CatchingFishSnackbar()) {
                    this.CatchingFishViewModelFAB = CatchingFishViewModelGson.CatchingFishReduxKtor;
                    this.CatchingFishSnackbar.acquire();
                    this.CatchingFishLayout.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.CatchingFishCoroutine++;
                if (this.CatchingFishViewModelScope) {
                    TextUtils.isEmpty(null);
                }
                CatchingFishRealmRedux catchingFishRealmRedux = (CatchingFishRealmRedux) this.CatchingFishCloudMessaging.get(null);
                if (catchingFishRealmRedux == null) {
                    catchingFishRealmRedux = new CatchingFishRealmRedux();
                    this.CatchingFishCloudMessaging.put(null, catchingFishRealmRedux);
                }
                catchingFishRealmRedux.CatchingFishParcelableFAB++;
                this.CatchingFishLayout.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j2 = Long.MAX_VALUE - elapsedRealtime > max ? elapsedRealtime + max : Long.MAX_VALUE;
                if (j2 > this.CatchingFishDaggerWebsocket) {
                    this.CatchingFishDaggerWebsocket = j2;
                    ScheduledFuture scheduledFuture = this.CatchingFishReduxKtor;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.CatchingFishReduxKtor = this.CatchingFishOkHttp.schedule(new CatchingFishGsonRealm(24, this), max, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void CatchingFishReduxKtor() {
        HashSet hashSet = this.CatchingFishWorkManager;
        if (hashSet.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        hashSet.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    public final boolean CatchingFishSnackbar() {
        boolean z;
        synchronized (this.CatchingFishParcelableFAB) {
            z = this.CatchingFishCoroutine > 0;
        }
        return z;
    }
}
