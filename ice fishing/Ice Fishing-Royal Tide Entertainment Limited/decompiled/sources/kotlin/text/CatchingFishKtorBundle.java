package kotlin.text;

import android.content.Context;
import android.os.Handler;
import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.AdjustAttribution;
import com.adjust.sdk.AdjustInstance;
import com.adjust.sdk.OnAdidReadListener;
import com.adjust.sdk.OnAttributionReadListener;
import com.adjust.sdk.Util;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class CatchingFishKtorBundle implements Runnable {
    public final /* synthetic */ Context CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;
    public final /* synthetic */ Object CatchingFishViewModelFAB;
    public final /* synthetic */ AdjustInstance CatchingFishViewModelScope;
    public final /* synthetic */ long CatchingFishWorkManager;

    public /* synthetic */ CatchingFishKtorBundle(AdjustInstance adjustInstance, Context context, Object obj, long j, int i) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishViewModelScope = adjustInstance;
        this.CatchingFishDaggerWebsocket = context;
        this.CatchingFishViewModelFAB = obj;
        this.CatchingFishWorkManager = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Context context = this.CatchingFishDaggerWebsocket;
                String adidFromActivityStateFile = Util.getAdidFromActivityStateFile(context);
                if (adidFromActivityStateFile == null) {
                    OnAdidReadListener onAdidReadListener = (OnAdidReadListener) this.CatchingFishViewModelFAB;
                    arrayList = this.CatchingFishViewModelScope.cachedAdidReadTimeoutCallbacks;
                    ActivityHandler.queueGetAdidWithTimeout(this.CatchingFishWorkManager, onAdidReadListener, arrayList, context);
                    break;
                } else {
                    new Handler(context.getMainLooper()).post(new CatchingFishService(13, this, adidFromActivityStateFile));
                    break;
                }
            default:
                Context context2 = this.CatchingFishDaggerWebsocket;
                AdjustAttribution attributionFromAttributionFile = Util.getAttributionFromAttributionFile(context2);
                if (attributionFromAttributionFile == null) {
                    OnAttributionReadListener onAttributionReadListener = (OnAttributionReadListener) this.CatchingFishViewModelFAB;
                    arrayList2 = this.CatchingFishViewModelScope.cachedAttributionReadTimeoutCallbacks;
                    ActivityHandler.queueGetAttributionWithTimeout(this.CatchingFishWorkManager, onAttributionReadListener, arrayList2, context2);
                    break;
                } else {
                    new Handler(context2.getMainLooper()).post(new CatchingFishService(14, this, attributionFromAttributionFile));
                    break;
                }
        }
    }
}
