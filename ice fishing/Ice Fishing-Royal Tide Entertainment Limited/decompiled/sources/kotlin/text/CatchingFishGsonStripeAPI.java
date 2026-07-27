package kotlin.text;

import android.os.Build;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* loaded from: classes.dex */
public final class CatchingFishGsonStripeAPI extends CatchingFishAdMobDataStore implements CatchingFishDaggerMVI {
    private volatile Object _preHandler;

    public CatchingFishGsonStripeAPI() {
        super(CatchingFishMoshiFluxMoshi.CatchingFishViewModelScope);
        this._preHandler = this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x002c, code lost:
    
        if (java.lang.reflect.Modifier.isStatic(r4.getModifiers()) != false) goto L15;
     */
    @Override // kotlin.text.CatchingFishDaggerMVI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void CatchingFishLayout(Throwable th, CatchingFishManifestMockk catchingFishManifestMockk) {
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
