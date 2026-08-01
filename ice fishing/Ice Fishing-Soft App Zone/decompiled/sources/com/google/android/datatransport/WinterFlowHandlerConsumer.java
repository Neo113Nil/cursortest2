package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowHandlerConsumer {
    public final long WinterFlowRouterStructure;

    public static final boolean WinterFlowArrayNetwork(long j) {
        int i = (int) (3 & j);
        return (((int) (j >> 33)) & ((1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1)) != 0;
    }

    public static final boolean WinterFlowCacheManagerAgent(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return (((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1)) != 0;
    }

    public static final boolean WinterFlowHookDataSource(long j, long j2) {
        return j == j2;
    }

    public static final int WinterFlowResponseEngine(long j) {
        int i = (int) (3 & j);
        return ((int) (j >> 2)) & ((1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1);
    }

    public static final int WinterFlowRouterRouter(long j) {
        int i = (int) (3 & j);
        int i2 = (int) (j >> 33);
        int i3 = i2 & ((1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1);
        if (i3 == 0) {
            return Integer.MAX_VALUE;
        }
        return i3 - 1;
    }

    public static long WinterFlowRouterStructure(long j, int i, int i2, int i3, int i4, int i5) {
        if ((i5 & 1) != 0) {
            i = WinterFlowResponseEngine(j);
        }
        if ((i5 & 2) != 0) {
            i2 = WinterFlowRouterRouter(j);
        }
        if ((i5 & 4) != 0) {
            i3 = WinterFlowSyntax(j);
        }
        if ((i5 & 8) != 0) {
            i4 = WinterFlowUnitTestResponse(j);
        }
        if (i2 < i || i4 < i3 || i < 0 || i3 < 0) {
            WinterFlowConcurrencyMapper.WinterFlowRouterStructure("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return WinterFlowServiceOrchestration.WinterFlowUnitTestResponse(i, i2, i3, i4);
    }

    public static final int WinterFlowSyntax(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return ((int) (j >> (i2 + 15))) & ((1 << (18 - i2)) - 1);
    }

    public static String WinterFlowTransactionAgent(long j) {
        int WinterFlowRouterRouter = WinterFlowRouterRouter(j);
        String valueOf = WinterFlowRouterRouter == Integer.MAX_VALUE ? "Infinity" : String.valueOf(WinterFlowRouterRouter);
        int WinterFlowUnitTestResponse = WinterFlowUnitTestResponse(j);
        return "Constraints(minWidth = " + WinterFlowResponseEngine(j) + ", maxWidth = " + valueOf + ", minHeight = " + WinterFlowSyntax(j) + ", maxHeight = " + (WinterFlowUnitTestResponse != Integer.MAX_VALUE ? String.valueOf(WinterFlowUnitTestResponse) : "Infinity") + ')';
    }

    public static final boolean WinterFlowTransactionManagerStrategy(long j) {
        int i = (int) (3 & j);
        int i2 = (1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1;
        int i3 = ((int) (j >> 2)) & i2;
        int i4 = ((int) (j >> 33)) & i2;
        return i3 == (i4 == 0 ? Integer.MAX_VALUE : i4 - 1);
    }

    public static final int WinterFlowUnitTestResponse(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        int i3 = ((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1);
        if (i3 == 0) {
            return Integer.MAX_VALUE;
        }
        return i3 - 1;
    }

    public static final boolean WinterFlowVariableVersionControl(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        int i3 = (1 << (18 - i2)) - 1;
        int i4 = ((int) (j >> (i2 + 15))) & i3;
        int i5 = ((int) (j >> (i2 + 46))) & i3;
        return i4 == (i5 == 0 ? Integer.MAX_VALUE : i5 - 1);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof WinterFlowHandlerConsumer) {
            return this.WinterFlowRouterStructure == ((WinterFlowHandlerConsumer) obj).WinterFlowRouterStructure;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.WinterFlowRouterStructure);
    }

    public final String toString() {
        return WinterFlowTransactionAgent(this.WinterFlowRouterStructure);
    }
}
