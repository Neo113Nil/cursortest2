package com.google.android.datatransport;

import java.io.PrintStream;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowQueueRequest {
    public static final int WinterFlowHookDataSource;
    public static final int WinterFlowRouterStructure;

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
    
        if (r0.equalsIgnoreCase("WARN") != false) goto L26;
     */
    static {
        int i;
        String[] strArr = {"System.out", "stdout", "sysout"};
        String property = System.getProperty("slf4j.internal.report.stream");
        int i2 = 2;
        if (property != null && !property.isEmpty()) {
            for (int i3 = 0; i3 < 3; i3++) {
                if (strArr[i3].equalsIgnoreCase(property)) {
                    i = 2;
                    break;
                }
            }
        }
        i = 1;
        WinterFlowRouterStructure = i;
        String property2 = System.getProperty("slf4j.internal.verbosity");
        if (property2 != null && !property2.isEmpty()) {
            if (property2.equalsIgnoreCase("ERROR")) {
                i2 = 3;
            }
            WinterFlowHookDataSource = i2;
        }
        i2 = 1;
        WinterFlowHookDataSource = i2;
    }

    public static final void WinterFlowCacheManagerAgent(String str) {
        if (WinterFlowResolverBackend.WinterFlowHookDataSource(2) >= WinterFlowResolverBackend.WinterFlowHookDataSource(WinterFlowHookDataSource)) {
            WinterFlowHookDataSource().println("SLF4J(W): ".concat(str));
        }
    }

    public static PrintStream WinterFlowHookDataSource() {
        return WinterFlowResolverBackend.WinterFlowRouterAdapter(WinterFlowRouterStructure) != 1 ? System.err : System.out;
    }

    public static final void WinterFlowRouterStructure(String str, Throwable th) {
        WinterFlowHookDataSource().println("SLF4J(E): ".concat(str));
        WinterFlowHookDataSource().println("SLF4J(E): Reported exception:");
        th.printStackTrace(WinterFlowHookDataSource());
    }
}
