package kotlin.text;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class CatchingFishRoomView {
    public static final /* synthetic */ int CatchingFishFragmentHandler = 0;
    public static final long CatchingFishLayout = TimeUnit.HOURS.toSeconds(8);
    public final CatchingFishViewWorkManager CatchingFishCoroutine;
    public final Context CatchingFishParcelableFAB;
    public final FirebaseMessaging CatchingFishReduxKtor;
    public final CatchingFishAdMobToast CatchingFishSnackbar;
    public final CatchingFishIntentService CatchingFishViewModelFAB;
    public final ScheduledThreadPoolExecutor CatchingFishWorkManager;
    public final CatchingFishCameraXRetrofit CatchingFishDaggerWebsocket = new CatchingFishCameraXRetrofit(0);
    public boolean CatchingFishViewModelScope = false;

    public CatchingFishRoomView(FirebaseMessaging firebaseMessaging, CatchingFishAdMobToast catchingFishAdMobToast, CatchingFishIntentService catchingFishIntentService, CatchingFishViewWorkManager catchingFishViewWorkManager, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.CatchingFishReduxKtor = firebaseMessaging;
        this.CatchingFishSnackbar = catchingFishAdMobToast;
        this.CatchingFishViewModelFAB = catchingFishIntentService;
        this.CatchingFishCoroutine = catchingFishViewWorkManager;
        this.CatchingFishParcelableFAB = context;
        this.CatchingFishWorkManager = scheduledThreadPoolExecutor;
    }

    public static void CatchingFishParcelableFAB(CatchingFishWorkManagerMVP catchingFishWorkManagerMVP) {
        try {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            CatchingFishViewMVIMVVM.CatchingFishCoroutine(catchingFishWorkManagerMVP, 30L);
        } catch (InterruptedException | TimeoutException e) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e2);
            }
            throw ((RuntimeException) cause);
        }
    }

    public final void CatchingFishCoroutine(String str) {
        String CatchingFishParcelableFAB = this.CatchingFishReduxKtor.CatchingFishParcelableFAB();
        CatchingFishViewWorkManager catchingFishViewWorkManager = this.CatchingFishCoroutine;
        catchingFishViewWorkManager.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        CatchingFishParcelableFAB(catchingFishViewWorkManager.CatchingFishOkHttp(catchingFishViewWorkManager.CatchingFishNavigation(CatchingFishParcelableFAB, "/topics/" + str, bundle)));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0043 A[Catch: IOException -> 0x002c, TRY_LEAVE, TryCatch #4 {IOException -> 0x002c, blocks: (B:8:0x0011, B:62:0x003f, B:63:0x0043, B:64:0x0022, B:67:0x002f), top: B:7:0x0011 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean CatchingFishDaggerWebsocket() {
        CatchingFishRetrofitToast CatchingFishParcelableFAB;
        char c;
        CatchingFishIntentService catchingFishIntentService;
        while (true) {
            synchronized (this) {
                try {
                    CatchingFishParcelableFAB = this.CatchingFishViewModelFAB.CatchingFishParcelableFAB();
                    if (CatchingFishParcelableFAB == null) {
                        return true;
                    }
                } finally {
                }
            }
            try {
                String str = CatchingFishParcelableFAB.CatchingFishSnackbar;
                String str2 = CatchingFishParcelableFAB.CatchingFishParcelableFAB;
                int hashCode = str.hashCode();
                if (hashCode != 83) {
                    if (hashCode == 85 && str.equals("U")) {
                        c = 1;
                        if (c != 0) {
                            CatchingFishSnackbar(str2);
                        } else if (c == 1) {
                            CatchingFishCoroutine(str2);
                        }
                        catchingFishIntentService = this.CatchingFishViewModelFAB;
                        synchronized (catchingFishIntentService) {
                            CatchingFishSensorManager catchingFishSensorManager = catchingFishIntentService.CatchingFishParcelableFAB;
                            String str3 = CatchingFishParcelableFAB.CatchingFishCoroutine;
                            synchronized (((ArrayDeque) catchingFishSensorManager.CatchingFishViewModelScope)) {
                                if (((ArrayDeque) catchingFishSensorManager.CatchingFishViewModelScope).remove(str3)) {
                                    ((ScheduledThreadPoolExecutor) catchingFishSensorManager.CatchingFishViewModelFAB).execute(new CatchingFishMVPLayout(19, catchingFishSensorManager));
                                }
                            }
                        }
                        synchronized (this.CatchingFishDaggerWebsocket) {
                            try {
                                String str4 = CatchingFishParcelableFAB.CatchingFishCoroutine;
                                if (this.CatchingFishDaggerWebsocket.containsKey(str4)) {
                                    ArrayDeque arrayDeque = (ArrayDeque) this.CatchingFishDaggerWebsocket.get(str4);
                                    CatchingFishAndroidXPayPal catchingFishAndroidXPayPal = (CatchingFishAndroidXPayPal) arrayDeque.poll();
                                    if (catchingFishAndroidXPayPal != null) {
                                        catchingFishAndroidXPayPal.CatchingFishParcelableFAB(null);
                                    }
                                    if (arrayDeque.isEmpty()) {
                                        this.CatchingFishDaggerWebsocket.remove(str4);
                                    }
                                }
                            } finally {
                            }
                        }
                    }
                    c = 65535;
                    if (c != 0) {
                    }
                    catchingFishIntentService = this.CatchingFishViewModelFAB;
                    synchronized (catchingFishIntentService) {
                    }
                } else {
                    if (str.equals("S")) {
                        c = 0;
                        if (c != 0) {
                        }
                        catchingFishIntentService = this.CatchingFishViewModelFAB;
                        synchronized (catchingFishIntentService) {
                        }
                    }
                    c = 65535;
                    if (c != 0) {
                    }
                    catchingFishIntentService = this.CatchingFishViewModelFAB;
                    synchronized (catchingFishIntentService) {
                    }
                }
            } catch (IOException e) {
                if ("SERVICE_NOT_AVAILABLE".equals(e.getMessage()) || "INTERNAL_SERVER_ERROR".equals(e.getMessage()) || "TOO_MANY_SUBSCRIBERS".equals(e.getMessage())) {
                    e.getMessage();
                } else if (e.getMessage() != null) {
                    throw e;
                }
                return false;
            }
        }
    }

    public final synchronized void CatchingFishReduxKtor(boolean z) {
        this.CatchingFishViewModelScope = z;
    }

    public final void CatchingFishSnackbar(String str) {
        String CatchingFishParcelableFAB = this.CatchingFishReduxKtor.CatchingFishParcelableFAB();
        CatchingFishViewWorkManager catchingFishViewWorkManager = this.CatchingFishCoroutine;
        catchingFishViewWorkManager.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        CatchingFishParcelableFAB(catchingFishViewWorkManager.CatchingFishOkHttp(catchingFishViewWorkManager.CatchingFishNavigation(CatchingFishParcelableFAB, "/topics/" + str, bundle)));
    }

    public final void CatchingFishWorkManager(long j) {
        this.CatchingFishWorkManager.schedule(new com.google.firebase.messaging.CatchingFishViewPagerToast(this, this.CatchingFishParcelableFAB, this.CatchingFishSnackbar, Math.min(Math.max(30L, 2 * j), CatchingFishLayout)), j, TimeUnit.SECONDS);
        CatchingFishReduxKtor(true);
    }
}
