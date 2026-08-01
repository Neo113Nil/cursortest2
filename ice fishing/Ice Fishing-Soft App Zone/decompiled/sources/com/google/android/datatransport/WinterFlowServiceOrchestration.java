package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowServiceOrchestration {
    public static final long WinterFlowArrayNetwork(long j, long j2) {
        int i = (int) (j2 >> 32);
        int WinterFlowResponseEngine = WinterFlowHandlerConsumer.WinterFlowResponseEngine(j);
        int WinterFlowRouterRouter = WinterFlowHandlerConsumer.WinterFlowRouterRouter(j);
        if (i < WinterFlowResponseEngine) {
            i = WinterFlowResponseEngine;
        }
        if (i <= WinterFlowRouterRouter) {
            WinterFlowRouterRouter = i;
        }
        int i2 = (int) (j2 & 4294967295L);
        int WinterFlowSyntax = WinterFlowHandlerConsumer.WinterFlowSyntax(j);
        int WinterFlowUnitTestResponse = WinterFlowHandlerConsumer.WinterFlowUnitTestResponse(j);
        if (i2 < WinterFlowSyntax) {
            i2 = WinterFlowSyntax;
        }
        if (i2 <= WinterFlowUnitTestResponse) {
            WinterFlowUnitTestResponse = i2;
        }
        return (WinterFlowRouterRouter << 32) | (WinterFlowUnitTestResponse & 4294967295L);
    }

    public static final int WinterFlowCacheManagerAgent(int i) {
        if (i < 8191) {
            return 13;
        }
        if (i < 32767) {
            return 15;
        }
        if (i < 65535) {
            return 16;
        }
        return i < 262143 ? 18 : 255;
    }

    public static /* synthetic */ long WinterFlowHookDataSource(int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i = Integer.MAX_VALUE;
        }
        if ((i3 & 8) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        return WinterFlowRouterStructure(0, i, 0, i2);
    }

    public static final Void WinterFlowResponseEngine(int i) {
        throw new IllegalArgumentException("Can't represent a size of " + i + " in Constraints");
    }

    public static final long WinterFlowRouterRouter(int i, int i2, long j) {
        int WinterFlowResponseEngine = WinterFlowHandlerConsumer.WinterFlowResponseEngine(j) + i;
        if (WinterFlowResponseEngine < 0) {
            WinterFlowResponseEngine = 0;
        }
        int WinterFlowRouterRouter = WinterFlowHandlerConsumer.WinterFlowRouterRouter(j);
        if (WinterFlowRouterRouter != Integer.MAX_VALUE && (WinterFlowRouterRouter = WinterFlowRouterRouter + i) < 0) {
            WinterFlowRouterRouter = 0;
        }
        int WinterFlowSyntax = WinterFlowHandlerConsumer.WinterFlowSyntax(j) + i2;
        if (WinterFlowSyntax < 0) {
            WinterFlowSyntax = 0;
        }
        int WinterFlowUnitTestResponse = WinterFlowHandlerConsumer.WinterFlowUnitTestResponse(j);
        return WinterFlowRouterStructure(WinterFlowResponseEngine, WinterFlowRouterRouter, WinterFlowSyntax, (WinterFlowUnitTestResponse == Integer.MAX_VALUE || (WinterFlowUnitTestResponse = WinterFlowUnitTestResponse + i2) >= 0) ? WinterFlowUnitTestResponse : 0);
    }

    public static final long WinterFlowRouterStructure(int i, int i2, int i3, int i4) {
        if (!((i3 >= 0) & (i2 >= i) & (i4 >= i3) & (i >= 0))) {
            WinterFlowConcurrencyMapper.WinterFlowRouterStructure("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return WinterFlowUnitTestResponse(i, i2, i3, i4);
    }

    public static final void WinterFlowSyntax(int i, int i2) {
        throw new IllegalArgumentException("Can't represent a width of " + i + " and height of " + i2 + " in Constraints");
    }

    public static final int WinterFlowTransactionManagerStrategy(int i, long j) {
        int WinterFlowResponseEngine = WinterFlowHandlerConsumer.WinterFlowResponseEngine(j);
        int WinterFlowRouterRouter = WinterFlowHandlerConsumer.WinterFlowRouterRouter(j);
        if (i < WinterFlowResponseEngine) {
            i = WinterFlowResponseEngine;
        }
        return i > WinterFlowRouterRouter ? WinterFlowRouterRouter : i;
    }

    public static final long WinterFlowUnitTestResponse(int i, int i2, int i3, int i4) {
        int i5 = i4 == Integer.MAX_VALUE ? i3 : i4;
        int WinterFlowCacheManagerAgent = WinterFlowCacheManagerAgent(i5);
        int i6 = i2 == Integer.MAX_VALUE ? i : i2;
        int WinterFlowCacheManagerAgent2 = WinterFlowCacheManagerAgent(i6);
        if (WinterFlowCacheManagerAgent + WinterFlowCacheManagerAgent2 > 31) {
            WinterFlowSyntax(i6, i5);
        }
        int i7 = i2 + 1;
        int i8 = i4 + 1;
        int i9 = WinterFlowCacheManagerAgent2 - 13;
        return ((i7 & (~(i7 >> 31))) << 33) | ((i9 >> 1) + (i9 & 1)) | (i << 2) | (i3 << (WinterFlowCacheManagerAgent2 + 2)) | ((i8 & (~(i8 >> 31))) << (WinterFlowCacheManagerAgent2 + 33));
    }

    public static final int WinterFlowVariableVersionControl(int i, long j) {
        int WinterFlowSyntax = WinterFlowHandlerConsumer.WinterFlowSyntax(j);
        int WinterFlowUnitTestResponse = WinterFlowHandlerConsumer.WinterFlowUnitTestResponse(j);
        if (i < WinterFlowSyntax) {
            i = WinterFlowSyntax;
        }
        return i > WinterFlowUnitTestResponse ? WinterFlowUnitTestResponse : i;
    }
}
