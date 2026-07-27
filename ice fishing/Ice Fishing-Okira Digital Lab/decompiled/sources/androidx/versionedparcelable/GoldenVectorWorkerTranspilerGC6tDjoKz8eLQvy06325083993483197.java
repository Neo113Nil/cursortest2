package androidx.versionedparcelable;

import android.os.Process;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class GoldenVectorWorkerTranspilerGC6tDjoKz8eLQvy06325083993483197 implements Runnable {
    public final Runnable LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public final /* synthetic */ int RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;

    public /* synthetic */ GoldenVectorWorkerTranspilerGC6tDjoKz8eLQvy06325083993483197(Runnable runnable, int i) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = i;
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        Runnable runnable = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                try {
                    runnable.run();
                    break;
                } catch (Exception unused) {
                    BlazePulseExecutorVectorX9T7zrg3lwf2GjPHIy93052600711395.WhiteFieldUnificationOverridingEBdwjF0noilpOVdrsu81945136372121("Executor");
                    return;
                }
            case 1:
                runnable.run();
                break;
            default:
                Process.setThreadPriority(0);
                runnable.run();
                break;
        }
    }

    public String toString() {
        switch (this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867) {
            case 1:
                return this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119.toString();
            default:
                return super.toString();
        }
    }
}
