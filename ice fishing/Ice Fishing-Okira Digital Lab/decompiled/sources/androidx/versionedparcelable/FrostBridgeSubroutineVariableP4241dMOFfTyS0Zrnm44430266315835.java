package androidx.versionedparcelable;

import android.os.Looper;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class FrostBridgeSubroutineVariableP4241dMOFfTyS0Zrnm44430266315835 implements Executor {
    public final Object LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public final /* synthetic */ int RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = 1;

    public FrostBridgeSubroutineVariableP4241dMOFfTyS0Zrnm44430266315835() {
        ZenithPathBinaryInterfaceJPvSokakdHX9LAzKqB54416701949648 zenithPathBinaryInterfaceJPvSokakdHX9LAzKqB54416701949648 = new ZenithPathBinaryInterfaceJPvSokakdHX9LAzKqB54416701949648(Looper.getMainLooper());
        Looper.getMainLooper();
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = zenithPathBinaryInterfaceJPvSokakdHX9LAzKqB54416701949648;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((Executor) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).execute(new GoldenVectorWorkerTranspilerGC6tDjoKz8eLQvy06325083993483197(runnable, 0));
                break;
            default:
                ((ZenithPathBinaryInterfaceJPvSokakdHX9LAzKqB54416701949648) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).post(runnable);
                break;
        }
    }

    public FrostBridgeSubroutineVariableP4241dMOFfTyS0Zrnm44430266315835(ExecutorService executorService) {
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = executorService;
    }
}
