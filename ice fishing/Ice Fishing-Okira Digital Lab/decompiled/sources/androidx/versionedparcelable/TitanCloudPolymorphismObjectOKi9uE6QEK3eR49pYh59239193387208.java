package androidx.versionedparcelable;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public abstract class TitanCloudPolymorphismObjectOKi9uE6QEK3eR49pYh59239193387208 {
    public static final /* synthetic */ int ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = 0;
    private static volatile Choreographer choreographer;

    static {
        Object photonFrameOverloadingEngineWw7n8FB5ih6HWZQ8dp81198068058588;
        try {
            photonFrameOverloadingEngineWw7n8FB5ih6HWZQ8dp81198068058588 = new DeltaSignalHeuristicLambdaWOlkAIyxKHNvfKxznZ71024478229184(ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(Looper.getMainLooper()));
        } catch (Throwable th) {
            photonFrameOverloadingEngineWw7n8FB5ih6HWZQ8dp81198068058588 = new PhotonFrameOverloadingEngineWw7n8FB5ih6HWZQ8dp81198068058588(th);
        }
        if (photonFrameOverloadingEngineWw7n8FB5ih6HWZQ8dp81198068058588 instanceof PhotonFrameOverloadingEngineWw7n8FB5ih6HWZQ8dp81198068058588) {
            photonFrameOverloadingEngineWw7n8FB5ih6HWZQ8dp81198068058588 = null;
        }
    }

    public static final Handler ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(Looper looper) {
        if (Build.VERSION.SDK_INT < 28) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        invoke.getClass();
        return (Handler) invoke;
    }
}
