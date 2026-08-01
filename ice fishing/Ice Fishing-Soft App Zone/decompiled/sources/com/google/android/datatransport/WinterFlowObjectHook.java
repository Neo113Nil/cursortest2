package com.google.android.datatransport;

import com.adjust.sdk.Constants;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowObjectHook implements Comparable {
    public static final WinterFlowObjectHook WinterFlowResponseEngine;
    public static final WinterFlowObjectHook WinterFlowRouterRouter;
    public static final WinterFlowObjectHook WinterFlowSyntax;
    public static final WinterFlowObjectHook WinterFlowTransactionAgent;
    public static final WinterFlowObjectHook WinterFlowTransactionManagerStrategy;
    public static final WinterFlowObjectHook WinterFlowUnitTestResponse;
    public final int WinterFlowVariableVersionControl;

    static {
        WinterFlowObjectHook winterFlowObjectHook = new WinterFlowObjectHook(100);
        WinterFlowObjectHook winterFlowObjectHook2 = new WinterFlowObjectHook(200);
        WinterFlowObjectHook winterFlowObjectHook3 = new WinterFlowObjectHook(300);
        WinterFlowObjectHook winterFlowObjectHook4 = new WinterFlowObjectHook(Constants.MINIMAL_ERROR_STATUS_CODE);
        WinterFlowTransactionManagerStrategy = winterFlowObjectHook4;
        WinterFlowObjectHook winterFlowObjectHook5 = new WinterFlowObjectHook(500);
        WinterFlowUnitTestResponse = winterFlowObjectHook5;
        WinterFlowObjectHook winterFlowObjectHook6 = new WinterFlowObjectHook(600);
        WinterFlowRouterRouter = winterFlowObjectHook6;
        WinterFlowObjectHook winterFlowObjectHook7 = new WinterFlowObjectHook(700);
        WinterFlowObjectHook winterFlowObjectHook8 = new WinterFlowObjectHook(800);
        WinterFlowObjectHook winterFlowObjectHook9 = new WinterFlowObjectHook(900);
        WinterFlowSyntax = winterFlowObjectHook4;
        WinterFlowResponseEngine = winterFlowObjectHook5;
        WinterFlowTransactionAgent = winterFlowObjectHook7;
        WinterFlowUnitTestLibrary.WinterFlowPackageIDE(winterFlowObjectHook, winterFlowObjectHook2, winterFlowObjectHook3, winterFlowObjectHook4, winterFlowObjectHook5, winterFlowObjectHook6, winterFlowObjectHook7, winterFlowObjectHook8, winterFlowObjectHook9);
    }

    public WinterFlowObjectHook(int i) {
        this.WinterFlowVariableVersionControl = i;
        boolean z = false;
        if (1 <= i && i < 1001) {
            z = true;
        }
        if (z) {
            return;
        }
        WinterFlowWorkerPipeline.WinterFlowRouterStructure("Font weight can be in range [1, 1000]. Current value: " + i);
    }

    @Override // java.lang.Comparable
    /* renamed from: WinterFlowRouterStructure, reason: merged with bridge method [inline-methods] */
    public final int compareTo(WinterFlowObjectHook winterFlowObjectHook) {
        return WinterFlowManagerRequest.WinterFlowBatchUI(this.WinterFlowVariableVersionControl, winterFlowObjectHook.WinterFlowVariableVersionControl);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WinterFlowObjectHook) {
            return this.WinterFlowVariableVersionControl == ((WinterFlowObjectHook) obj).WinterFlowVariableVersionControl;
        }
        return false;
    }

    public final int hashCode() {
        return this.WinterFlowVariableVersionControl;
    }

    public final String toString() {
        return WinterFlowResolverBackend.WinterFlowServerProtocol(new StringBuilder("FontWeight(weight="), this.WinterFlowVariableVersionControl, ')');
    }
}
