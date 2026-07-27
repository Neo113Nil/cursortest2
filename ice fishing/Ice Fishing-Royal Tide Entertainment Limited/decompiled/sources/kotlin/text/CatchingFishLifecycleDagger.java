package kotlin.text;

import android.content.Context;
import com.adjust.sdk.AdjustFactory;
import com.adjust.sdk.Reflection;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class CatchingFishLifecycleDagger implements Callable {
    public final /* synthetic */ int CatchingFishParcelableFAB;
    public final /* synthetic */ Object CatchingFishSnackbar;

    public /* synthetic */ CatchingFishLifecycleDagger(int i, Object obj) {
        this.CatchingFishParcelableFAB = i;
        this.CatchingFishSnackbar = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                try {
                    return ((Callable) this.CatchingFishSnackbar).call();
                } catch (Throwable th) {
                    AdjustFactory.getLogger().error("Callable error [%s] of type [%s]", th.getMessage(), th.getClass().getCanonicalName());
                    return null;
                }
            default:
                try {
                    return Reflection.getAdvertisingInfoObject((Context) this.CatchingFishSnackbar);
                } catch (Exception unused) {
                    return null;
                }
        }
    }
}
