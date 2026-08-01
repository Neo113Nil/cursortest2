package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowNodeServiceProvider {
    public static final WinterFlowJSONDecorator WinterFlowArrayNetwork;
    public static final WinterFlowJSONDecorator WinterFlowBandwidthObject;
    public static final WinterFlowJSONDecorator WinterFlowConcurrencyThread;
    public static final WinterFlowJSONDecorator WinterFlowOrchestrationSubsystem;
    public static final WinterFlowJSONDecorator WinterFlowResponseEngine;
    public static final WinterFlowJSONDecorator WinterFlowRouterRouter;
    public static final WinterFlowJSONDecorator WinterFlowServerProtocol;
    public static final WinterFlowJSONDecorator WinterFlowServiceUtility;
    public static final WinterFlowJSONDecorator WinterFlowSingletonPlatform;
    public static final WinterFlowJSONDecorator WinterFlowSyntax;
    public static final WinterFlowJSONDecorator WinterFlowThreadListener;
    public static final WinterFlowJSONDecorator WinterFlowTransactionAgent;
    public static final WinterFlowJSONDecorator WinterFlowTransactionManagerStrategy;
    public static final WinterFlowJSONDecorator WinterFlowUnitTestResponse;
    public static final WinterFlowJSONDecorator WinterFlowVariableBandwidth;
    public static final WinterFlowJSONDecorator WinterFlowVariableVersionControl;
    public static final WinterFlowJSONEngine WinterFlowRouterStructure = new WinterFlowJSONEngine(-1, null, null, 0);
    public static final int WinterFlowHookDataSource = WinterFlowDecoratorRouter.WinterFlowServerProtocol("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 12);
    public static final int WinterFlowCacheManagerAgent = WinterFlowDecoratorRouter.WinterFlowServerProtocol("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 12);

    static {
        int i = 25;
        WinterFlowArrayNetwork = new WinterFlowJSONDecorator(i, "BUFFERED");
        WinterFlowVariableVersionControl = new WinterFlowJSONDecorator(i, "SHOULD_BUFFER");
        WinterFlowTransactionManagerStrategy = new WinterFlowJSONDecorator(i, "S_RESUMING_BY_RCV");
        WinterFlowUnitTestResponse = new WinterFlowJSONDecorator(i, "RESUMING_BY_EB");
        WinterFlowRouterRouter = new WinterFlowJSONDecorator(i, "POISONED");
        WinterFlowSyntax = new WinterFlowJSONDecorator(i, "DONE_RCV");
        WinterFlowResponseEngine = new WinterFlowJSONDecorator(i, "INTERRUPTED_SEND");
        WinterFlowTransactionAgent = new WinterFlowJSONDecorator(i, "INTERRUPTED_RCV");
        WinterFlowServerProtocol = new WinterFlowJSONDecorator(i, "CHANNEL_CLOSED");
        WinterFlowThreadListener = new WinterFlowJSONDecorator(i, "SUSPEND");
        WinterFlowServiceUtility = new WinterFlowJSONDecorator(i, "SUSPEND_NO_WAITER");
        WinterFlowBandwidthObject = new WinterFlowJSONDecorator(i, "FAILED");
        WinterFlowOrchestrationSubsystem = new WinterFlowJSONDecorator(i, "NO_RECEIVE_RESULT");
        WinterFlowConcurrencyThread = new WinterFlowJSONDecorator(i, "CLOSE_HANDLER_CLOSED");
        WinterFlowSingletonPlatform = new WinterFlowJSONDecorator(i, "CLOSE_HANDLER_INVOKED");
        WinterFlowVariableBandwidth = new WinterFlowJSONDecorator(i, "NO_CLOSE_CAUSE");
    }
}
