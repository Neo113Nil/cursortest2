package android.content.Context;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterRunnableSpeedHyperion6925 {
    public static final /* synthetic */ int FrostHunterAlphaAnimationNeoCosmos5761 = 0;
    private static volatile Choreographer choreographer;

    static {
        Object frostHunterRealtimeDatabaseBetaOlympianPhoenix2409;
        try {
            frostHunterRealtimeDatabaseBetaOlympianPhoenix2409 = new FrostHunterCountDownTimerCyberVisionTitanium9970(FrostHunterAlphaAnimationNeoCosmos5761(Looper.getMainLooper()));
        } catch (Throwable th) {
            frostHunterRealtimeDatabaseBetaOlympianPhoenix2409 = new FrostHunterRealtimeDatabaseBetaOlympianPhoenix2409(th);
        }
        if (frostHunterRealtimeDatabaseBetaOlympianPhoenix2409 instanceof FrostHunterRealtimeDatabaseBetaOlympianPhoenix2409) {
            frostHunterRealtimeDatabaseBetaOlympianPhoenix2409 = null;
        }
    }

    public static final Handler FrostHunterAlphaAnimationNeoCosmos5761(Looper looper) {
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
