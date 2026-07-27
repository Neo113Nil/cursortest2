package kotlin.text;

import android.content.Context;
import com.adjust.sdk.Reflection;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class CatchingFishServiceRedux implements Callable {
    public final /* synthetic */ Object CatchingFishCoroutine;
    public final /* synthetic */ int CatchingFishParcelableFAB;
    public final /* synthetic */ Context CatchingFishSnackbar;

    public /* synthetic */ CatchingFishServiceRedux(Context context, Object obj, int i) {
        this.CatchingFishParcelableFAB = i;
        this.CatchingFishSnackbar = context;
        this.CatchingFishCoroutine = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return Reflection.getPlayAdId(this.CatchingFishSnackbar, this.CatchingFishCoroutine);
            default:
                return Reflection.isPlayTrackingEnabled(this.CatchingFishSnackbar, this.CatchingFishCoroutine);
        }
    }
}
