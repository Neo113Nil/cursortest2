package com.google.android.datatransport;

import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowSessionProvider {
    public static final ThreadLocal WinterFlowRouterStructure = new ThreadLocal();
    public static final long WinterFlowHookDataSource = WinterFlowRouterStructure(0, 0);

    public static final TextDirectionHeuristic WinterFlowHookDataSource(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.LOCALE : TextDirectionHeuristics.ANYRTL_LTR : TextDirectionHeuristics.FIRSTSTRONG_RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
    }

    public static final long WinterFlowRouterStructure(int i, int i2) {
        return (i2 & 4294967295L) | (i << 32);
    }
}
