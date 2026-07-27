package kotlin.text;

import com.adjust.sdk.AdjustFactory;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final class CatchingFishGlideCustomView implements RejectedExecutionHandler {
    public final /* synthetic */ int CatchingFishParcelableFAB;
    public final /* synthetic */ String CatchingFishSnackbar;

    public /* synthetic */ CatchingFishGlideCustomView(String str, int i) {
        this.CatchingFishParcelableFAB = i;
        this.CatchingFishSnackbar = str;
    }

    @Override // java.util.concurrent.RejectedExecutionHandler
    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                AdjustFactory.getLogger().warn("Runnable [%s] rejected from [%s] ", runnable.toString(), this.CatchingFishSnackbar);
                break;
            default:
                AdjustFactory.getLogger().warn("Runnable [%s] rejected from [%s] ", runnable.toString(), this.CatchingFishSnackbar);
                break;
        }
    }
}
