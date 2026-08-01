package com.google.android.datatransport;

import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowExceptionProtocol {
    public static final WinterFlowExceptionProtocol WinterFlowHookDataSource;
    public static volatile WinterFlowExceptionProtocol WinterFlowRouterStructure;

    static {
        WinterFlowExceptionProtocol winterFlowExceptionProtocol = new WinterFlowExceptionProtocol();
        Map map = Collections.EMPTY_MAP;
        WinterFlowHookDataSource = winterFlowExceptionProtocol;
    }

    public static WinterFlowExceptionProtocol WinterFlowRouterStructure() {
        WinterFlowExceptionProtocol winterFlowExceptionProtocol;
        WinterFlowRequestCompiler winterFlowRequestCompiler = WinterFlowRequestCompiler.WinterFlowCacheManagerAgent;
        WinterFlowExceptionProtocol winterFlowExceptionProtocol2 = WinterFlowRouterStructure;
        if (winterFlowExceptionProtocol2 != null) {
            return winterFlowExceptionProtocol2;
        }
        synchronized (WinterFlowExceptionProtocol.class) {
            try {
                winterFlowExceptionProtocol = WinterFlowRouterStructure;
                if (winterFlowExceptionProtocol == null) {
                    Class cls = WinterFlowOrchestrationLayer.WinterFlowRouterStructure;
                    WinterFlowExceptionProtocol winterFlowExceptionProtocol3 = null;
                    if (cls != null) {
                        try {
                            winterFlowExceptionProtocol3 = (WinterFlowExceptionProtocol) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    winterFlowExceptionProtocol = winterFlowExceptionProtocol3 != null ? winterFlowExceptionProtocol3 : WinterFlowHookDataSource;
                    WinterFlowRouterStructure = winterFlowExceptionProtocol;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return winterFlowExceptionProtocol;
    }
}
