package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowLoaderService implements Comparable {
    public final String WinterFlowRouterRouter;
    public final int WinterFlowTransactionManagerStrategy;
    public final String WinterFlowUnitTestResponse;
    public final int WinterFlowVariableVersionControl;

    public WinterFlowLoaderService(int i, int i2, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = i2;
        this.WinterFlowUnitTestResponse = str;
        this.WinterFlowRouterRouter = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        WinterFlowLoaderService winterFlowLoaderService = (WinterFlowLoaderService) obj;
        winterFlowLoaderService.getClass();
        int i = this.WinterFlowVariableVersionControl - winterFlowLoaderService.WinterFlowVariableVersionControl;
        return i == 0 ? this.WinterFlowTransactionManagerStrategy - winterFlowLoaderService.WinterFlowTransactionManagerStrategy : i;
    }
}
