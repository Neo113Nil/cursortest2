package com.google.android.datatransport;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowProxySystem {
    public static final /* synthetic */ int WinterFlowRouterStructure = 0;
    private static volatile Choreographer choreographer;

    static {
        Object winterFlowDecoratorTool;
        try {
            winterFlowDecoratorTool = new WinterFlowFrameworkNetwork(WinterFlowRouterStructure(Looper.getMainLooper()));
        } catch (Throwable th) {
            winterFlowDecoratorTool = new WinterFlowDecoratorTool(th);
        }
        if (winterFlowDecoratorTool instanceof WinterFlowDecoratorTool) {
            winterFlowDecoratorTool = null;
        }
    }

    public static final Handler WinterFlowRouterStructure(Looper looper) {
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
