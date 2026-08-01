package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowVersionFramework extends WinterFlowNodeInheritance implements WinterFlowEventEvent {
    public final /* synthetic */ WinterFlowExceptionListener WinterFlowBandwidthObject;
    public final /* synthetic */ WinterFlowMapperJava WinterFlowConcurrencyThread;
    public final /* synthetic */ WinterFlowLibraryDatabaseSchema WinterFlowOrchestrationSubsystem;
    public Object WinterFlowResponseEngine;
    public WinterFlowLibraryDatabaseSchema WinterFlowServerProtocol;
    public /* synthetic */ Object WinterFlowServiceUtility;
    public final /* synthetic */ WinterFlowRendererAgent WinterFlowSingletonPlatform;
    public WinterFlowCacheCacheManager WinterFlowSyntax;
    public int WinterFlowThreadListener;
    public WinterFlowRendererAgent WinterFlowTransactionAgent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowVersionFramework(WinterFlowExceptionListener winterFlowExceptionListener, WinterFlowLibraryDatabaseSchema winterFlowLibraryDatabaseSchema, WinterFlowMapperJava winterFlowMapperJava, WinterFlowRendererAgent winterFlowRendererAgent, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        super(2, winterFlowTransactionManagerLayer);
        this.WinterFlowBandwidthObject = winterFlowExceptionListener;
        this.WinterFlowOrchestrationSubsystem = winterFlowLibraryDatabaseSchema;
        this.WinterFlowConcurrencyThread = winterFlowMapperJava;
        this.WinterFlowSingletonPlatform = winterFlowRendererAgent;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final WinterFlowTransactionManagerLayer WinterFlowServerProtocol(WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, Object obj) {
        WinterFlowVersionFramework winterFlowVersionFramework = new WinterFlowVersionFramework(this.WinterFlowBandwidthObject, this.WinterFlowOrchestrationSubsystem, this.WinterFlowConcurrencyThread, this.WinterFlowSingletonPlatform, winterFlowTransactionManagerLayer);
        winterFlowVersionFramework.WinterFlowServiceUtility = obj;
        return winterFlowVersionFramework;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstInlineVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected instance arg in invoke
        	at jadx.core.dex.visitors.ConstInlineVisitor.addExplicitCast(ConstInlineVisitor.java:285)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:267)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:177)
        	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:110)
        	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:55)
        	at jadx.core.dex.visitors.ConstInlineVisitor.visit(ConstInlineVisitor.java:47)
        */
    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final java.lang.Object WinterFlowServiceUtility(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.datatransport.WinterFlowVersionFramework.WinterFlowServiceUtility(java.lang.Object):java.lang.Object");
    }

    @Override // com.google.android.datatransport.WinterFlowEventEvent
    public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
        return ((WinterFlowVersionFramework) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(WinterFlowAlgorithmSession.WinterFlowRouterStructure);
    }
}
