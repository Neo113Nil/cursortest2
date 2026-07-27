package kotlin.text;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class CatchingFishJUnitJUnitKtor {
    public static CatchingFishFluxMockk CatchingFishCoroutine;
    public static final long CatchingFishParcelableFAB = TimeUnit.MINUTES.toMillis(1);
    public static final Object CatchingFishSnackbar = new Object();

    public static ComponentName CatchingFishCoroutine(Context context, Intent intent) {
        synchronized (CatchingFishSnackbar) {
            try {
                CatchingFishParcelableFAB(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                ComponentName startService = context.startService(intent);
                if (startService == null) {
                    return null;
                }
                if (!booleanExtra) {
                    CatchingFishCoroutine.CatchingFishParcelableFAB(CatchingFishParcelableFAB);
                }
                return startService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void CatchingFishParcelableFAB(Context context) {
        if (CatchingFishCoroutine == null) {
            CatchingFishFluxMockk catchingFishFluxMockk = new CatchingFishFluxMockk(context);
            CatchingFishCoroutine = catchingFishFluxMockk;
            synchronized (catchingFishFluxMockk.CatchingFishParcelableFAB) {
                catchingFishFluxMockk.CatchingFishViewModelScope = true;
            }
        }
    }

    public static void CatchingFishSnackbar(Intent intent) {
        synchronized (CatchingFishSnackbar) {
            try {
                if (CatchingFishCoroutine != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    CatchingFishCoroutine.CatchingFishCoroutine();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
