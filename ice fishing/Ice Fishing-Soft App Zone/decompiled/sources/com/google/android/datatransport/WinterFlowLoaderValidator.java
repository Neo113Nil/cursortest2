package com.google.android.datatransport;

import android.os.Bundle;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowLoaderValidator implements Comparable {
    public final int WinterFlowRouterRouter;
    public final boolean WinterFlowSyntax;
    public final Bundle WinterFlowTransactionManagerStrategy;
    public final boolean WinterFlowUnitTestResponse;
    public final WinterFlowServerLayer WinterFlowVariableVersionControl;

    public WinterFlowLoaderValidator(WinterFlowServerLayer winterFlowServerLayer, Bundle bundle, boolean z, int i, boolean z2) {
        this.WinterFlowVariableVersionControl = winterFlowServerLayer;
        this.WinterFlowTransactionManagerStrategy = bundle;
        this.WinterFlowUnitTestResponse = z;
        this.WinterFlowRouterRouter = i;
        this.WinterFlowSyntax = z2;
    }

    @Override // java.lang.Comparable
    /* renamed from: WinterFlowRouterStructure, reason: merged with bridge method [inline-methods] */
    public final int compareTo(WinterFlowLoaderValidator winterFlowLoaderValidator) {
        winterFlowLoaderValidator.getClass();
        boolean z = winterFlowLoaderValidator.WinterFlowSyntax;
        boolean z2 = winterFlowLoaderValidator.WinterFlowUnitTestResponse;
        Bundle bundle = winterFlowLoaderValidator.WinterFlowTransactionManagerStrategy;
        boolean z3 = this.WinterFlowUnitTestResponse;
        if (z3 && !z2) {
            return 1;
        }
        if (!z3 && z2) {
            return -1;
        }
        int i = this.WinterFlowRouterRouter - winterFlowLoaderValidator.WinterFlowRouterRouter;
        if (i > 0) {
            return 1;
        }
        if (i < 0) {
            return -1;
        }
        Bundle bundle2 = this.WinterFlowTransactionManagerStrategy;
        if (bundle2 != null && bundle == null) {
            return 1;
        }
        if (bundle2 == null && bundle != null) {
            return -1;
        }
        if (bundle2 != null) {
            int size = bundle2.size();
            bundle.getClass();
            int size2 = size - bundle.size();
            if (size2 > 0) {
                return 1;
            }
            if (size2 < 0) {
                return -1;
            }
        }
        boolean z4 = this.WinterFlowSyntax;
        if (!z4 || z) {
            return (z4 || !z) ? 0 : -1;
        }
        return 1;
    }
}
