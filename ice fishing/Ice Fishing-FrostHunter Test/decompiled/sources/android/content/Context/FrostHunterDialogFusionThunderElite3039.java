package android.content.Context;

import android.os.Build;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterDialogFusionThunderElite3039 extends FrostHunterViewPagerRogueAlphaQuantum8362 implements FrostHunterWithContextAlphaStorm5781 {
    private volatile Object _preHandler;

    public FrostHunterDialogFusionThunderElite3039() {
        super(FrostHunterRewardedAdHyperStrike1151.FrostHunterDialogFragmentTurboPhoenixDragon7627);
        this._preHandler = this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x002c, code lost:
    
        if (java.lang.reflect.Modifier.isStatic(r3.getModifiers()) != false) goto L15;
     */
    @Override // android.content.Context.FrostHunterWithContextAlphaStorm5781
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void FrostHunterMeteringPointBetaCyber9571(FrostHunterCountDownTimerRogueTitan5615 frostHunterCountDownTimerRogueTitan5615, Throwable th) {
        Method method;
        int i = Build.VERSION.SDK_INT;
        if (26 > i || i >= 28) {
            return;
        }
        Object obj = this._preHandler;
        if (obj != this) {
            method = (Method) obj;
        } else {
            try {
                method = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", null);
                if (Modifier.isPublic(method.getModifiers())) {
                }
            } catch (Throwable unused) {
            }
            method = null;
            this._preHandler = method;
        }
        Object invoke = method != null ? method.invoke(null, null) : null;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = invoke instanceof Thread.UncaughtExceptionHandler ? (Thread.UncaughtExceptionHandler) invoke : null;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        }
    }
}
