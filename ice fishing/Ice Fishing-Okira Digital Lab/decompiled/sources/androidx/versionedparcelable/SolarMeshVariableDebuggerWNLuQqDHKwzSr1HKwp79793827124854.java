package androidx.versionedparcelable;

import android.os.Looper;
import android.view.Choreographer;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Random;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class SolarMeshVariableDebuggerWNLuQqDHKwzSr1HKwp79793827124854 extends ThreadLocal {
    public final /* synthetic */ int ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;

    public /* synthetic */ SolarMeshVariableDebuggerWNLuQqDHKwzSr1HKwp79793827124854(int i) {
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = i;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Choreographer choreographer = Choreographer.getInstance();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    BlazePulseHandlerRepositoryCu2UIlqJXy3VZdiEzw65854048406565 blazePulseHandlerRepositoryCu2UIlqJXy3VZdiEzw65854048406565 = new BlazePulseHandlerRepositoryCu2UIlqJXy3VZdiEzw65854048406565(choreographer, MysticCacheRequestMonitorQYA1Ym9CAA7fiSEGwn24597175563594.CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170(myLooper));
                    return XenoGridProcessorProcessorNcBZZjQOb3tKNLhyLo99586204685692.MysticCacheMiddlewareWorkerK74IVCqnn6Bp9c5lOi26227906401854(blazePulseHandlerRepositoryCu2UIlqJXy3VZdiEzw65854048406565, blazePulseHandlerRepositoryCu2UIlqJXy3VZdiEzw65854048406565.EmeraldStackInterfaceRequestBY5AOpJzA3NBvb5ccp93821256879111);
                }
                GoldenVectorBitwiseWorkerV4G0Yk8psAfnUgbBlF71709461005246.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119("no Looper on this thread");
                return null;
            default:
                return new Random();
        }
    }
}
