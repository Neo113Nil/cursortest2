package kotlin.text;

import android.content.Context;
import android.os.Handler;
import com.adjust.sdk.AdjustTimeoutCallback;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class CatchingFishFluxRedux implements Runnable {
    public final /* synthetic */ AdjustTimeoutCallback CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;
    public final /* synthetic */ Context CatchingFishViewModelScope;
    public final /* synthetic */ ArrayList CatchingFishWorkManager;

    public /* synthetic */ CatchingFishFluxRedux(AdjustTimeoutCallback adjustTimeoutCallback, ArrayList arrayList, Context context, int i) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = adjustTimeoutCallback;
        this.CatchingFishWorkManager = arrayList;
        this.CatchingFishViewModelScope = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (this.CatchingFishDaggerWebsocket.getOnAdidReadListener() != null) {
                    synchronized (this.CatchingFishWorkManager) {
                        this.CatchingFishWorkManager.remove(this.CatchingFishDaggerWebsocket);
                    }
                    new Handler(this.CatchingFishViewModelScope.getMainLooper()).post(new CatchingFishGsonRealm(0, this));
                    return;
                }
                return;
            default:
                if (this.CatchingFishDaggerWebsocket.getOnAttributionReadListener() != null) {
                    synchronized (this.CatchingFishWorkManager) {
                        this.CatchingFishWorkManager.remove(this.CatchingFishDaggerWebsocket);
                    }
                    new Handler(this.CatchingFishViewModelScope.getMainLooper()).post(new CatchingFishGsonRealm(1, this));
                    return;
                }
                return;
        }
    }
}
