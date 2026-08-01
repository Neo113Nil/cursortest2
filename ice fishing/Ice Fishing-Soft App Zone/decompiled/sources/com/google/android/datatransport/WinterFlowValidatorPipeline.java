package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public interface WinterFlowValidatorPipeline {
    void WinterFlowArrayNetwork(Object obj, String str);

    void WinterFlowCacheManagerAgent(String str);

    boolean WinterFlowHookDataSource();

    void WinterFlowResponseEngine(String str, Exception exc);

    boolean WinterFlowRouterRouter();

    boolean WinterFlowRouterStructure();

    void WinterFlowServerProtocol(String str, Integer num, Object obj);

    void WinterFlowSyntax(String str, WinterFlowStackLayer winterFlowStackLayer);

    boolean WinterFlowTransactionAgent();

    boolean WinterFlowTransactionManagerStrategy();

    default boolean WinterFlowUnitTestResponse(int i) {
        char c;
        if (i == 1) {
            c = '(';
        } else if (i == 2) {
            c = 30;
        } else if (i == 3) {
            c = 20;
        } else if (i == 4) {
            c = '\n';
        } else {
            if (i != 5) {
                throw null;
            }
            c = 0;
        }
        if (c == 0) {
            return WinterFlowTransactionAgent();
        }
        if (c == '\n') {
            return WinterFlowHookDataSource();
        }
        if (c == 20) {
            return WinterFlowRouterRouter();
        }
        if (c == 30) {
            return WinterFlowRouterStructure();
        }
        if (c == '(') {
            return WinterFlowTransactionManagerStrategy();
        }
        throw new IllegalArgumentException("Level [" + (i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "TRACE" : "DEBUG" : "INFO" : "WARN" : "ERROR") + "] not recognized.");
    }

    void WinterFlowVariableVersionControl(String str);

    String getName();
}
