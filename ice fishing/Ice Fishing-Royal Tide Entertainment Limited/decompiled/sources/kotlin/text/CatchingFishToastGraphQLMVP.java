package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishToastGraphQLMVP implements Executor {
    public static final /* synthetic */ CatchingFishToastGraphQLMVP CatchingFishDaggerWebsocket = new CatchingFishToastGraphQLMVP(0);
    public static final /* synthetic */ CatchingFishToastGraphQLMVP CatchingFishWorkManager = new CatchingFishToastGraphQLMVP(1);
    public final /* synthetic */ int CatchingFishReduxKtor;

    public /* synthetic */ CatchingFishToastGraphQLMVP(int i) {
        this.CatchingFishReduxKtor = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                runnable.run();
                break;
            case 1:
                runnable.run();
                break;
            case 2:
                new Thread(runnable).start();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
