package kotlin.text;

import android.content.Context;
import android.net.Uri;
import com.adjust.sdk.AdjustInstance;
import com.adjust.sdk.OnLastDeeplinkReadListener;
import com.adjust.sdk.scheduler.AsyncTaskExecutor;

/* loaded from: classes.dex */
public final class CatchingFishCoroutineGradle extends AsyncTaskExecutor {
    public final /* synthetic */ AdjustInstance CatchingFishCoroutine;
    public final /* synthetic */ Context CatchingFishParcelableFAB;
    public final /* synthetic */ OnLastDeeplinkReadListener CatchingFishSnackbar;

    public CatchingFishCoroutineGradle(AdjustInstance adjustInstance, Context context, OnLastDeeplinkReadListener onLastDeeplinkReadListener) {
        this.CatchingFishCoroutine = adjustInstance;
        this.CatchingFishParcelableFAB = context;
        this.CatchingFishSnackbar = onLastDeeplinkReadListener;
    }

    @Override // com.adjust.sdk.scheduler.AsyncTaskExecutor
    public final Object doInBackground(Object[] objArr) {
        String cachedDeeplink;
        cachedDeeplink = this.CatchingFishCoroutine.getCachedDeeplink(this.CatchingFishParcelableFAB);
        try {
            return Uri.parse(cachedDeeplink);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.adjust.sdk.scheduler.AsyncTaskExecutor
    public final void onPostExecute(Object obj) {
        this.CatchingFishSnackbar.onLastDeeplinkRead((Uri) obj);
    }
}
