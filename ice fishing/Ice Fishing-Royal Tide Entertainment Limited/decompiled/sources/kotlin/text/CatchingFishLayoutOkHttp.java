package kotlin.text;

import android.os.Handler;
import android.os.Looper;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public final class CatchingFishLayoutOkHttp implements Executor {
    public final Object CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;

    public /* synthetic */ CatchingFishLayoutOkHttp(int i, Object obj) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Handler handler = (Handler) this.CatchingFishDaggerWebsocket;
                runnable.getClass();
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            case 1:
                ((Executor) this.CatchingFishDaggerWebsocket).execute(new CatchingFishFABXMLLayout(runnable, 0));
                return;
            default:
                ((CatchingFishPayPalRedux) this.CatchingFishDaggerWebsocket).post(runnable);
                return;
        }
    }

    public CatchingFishLayoutOkHttp() {
        this.CatchingFishReduxKtor = 2;
        CatchingFishPayPalRedux catchingFishPayPalRedux = new CatchingFishPayPalRedux(Looper.getMainLooper());
        Looper.getMainLooper();
        this.CatchingFishDaggerWebsocket = catchingFishPayPalRedux;
    }
}
