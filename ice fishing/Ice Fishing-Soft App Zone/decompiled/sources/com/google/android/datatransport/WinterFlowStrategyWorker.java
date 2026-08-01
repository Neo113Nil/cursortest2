package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowStrategyWorker implements WinterFlowVersionEngine {
    public final /* synthetic */ Object WinterFlowResponseEngine;
    public final /* synthetic */ Object WinterFlowRouterRouter;
    public final /* synthetic */ Object WinterFlowSyntax;
    public final /* synthetic */ WinterFlowThreadPoolGateway WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ WinterFlowBatchCacheManager WinterFlowUnitTestResponse;
    public final /* synthetic */ int WinterFlowVariableVersionControl = 1;

    public WinterFlowStrategyWorker(WinterFlowCacheManagerMicroservice winterFlowCacheManagerMicroservice, WinterFlowLibrarySessionManager winterFlowLibrarySessionManager, WinterFlowDecoratorPlatform winterFlowDecoratorPlatform, WinterFlowThreadPoolGateway winterFlowThreadPoolGateway, WinterFlowBatchCacheManager winterFlowBatchCacheManager) {
        this.WinterFlowRouterRouter = winterFlowCacheManagerMicroservice;
        this.WinterFlowSyntax = winterFlowLibrarySessionManager;
        this.WinterFlowResponseEngine = winterFlowDecoratorPlatform;
        this.WinterFlowTransactionManagerStrategy = winterFlowThreadPoolGateway;
        this.WinterFlowUnitTestResponse = winterFlowBatchCacheManager;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [com.google.android.datatransport.WinterFlowResolverLibrary] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    @Override // com.google.android.datatransport.WinterFlowVersionEngine
    public final Object WinterFlowTransactionAgent(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        WinterFlowLibrarySessionManager winterFlowLibrarySessionManager;
        int i2 = this.WinterFlowVariableVersionControl;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        Object obj5 = this.WinterFlowResponseEngine;
        WinterFlowBatchCacheManager winterFlowBatchCacheManager = this.WinterFlowUnitTestResponse;
        WinterFlowThreadPoolGateway winterFlowThreadPoolGateway = this.WinterFlowTransactionManagerStrategy;
        Object obj6 = this.WinterFlowSyntax;
        Object obj7 = this.WinterFlowRouterRouter;
        switch (i2) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowExceptionFramework winterFlowExceptionFramework = (WinterFlowExceptionFramework) obj;
                int intValue = ((Number) obj2).intValue();
                ?? r15 = (WinterFlowResolverLibrary) obj3;
                int intValue2 = ((Number) obj4).intValue();
                WinterFlowSyntaxMechanism winterFlowSyntaxMechanism = (WinterFlowSyntaxMechanism) obj6;
                if ((intValue2 & 6) == 0) {
                    i = (r15.WinterFlowVariableVersionControl(winterFlowExceptionFramework) ? 4 : 2) | intValue2;
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i |= r15.WinterFlowCacheManagerAgent(intValue) ? 32 : 16;
                }
                if (!r15.WinterFlowFrontendBackend(i & 1, (i & 147) != 146)) {
                    r15.WinterFlowQueueService();
                    break;
                } else {
                    WinterFlowJavaManager winterFlowJavaManager = (WinterFlowJavaManager) ((Object[]) obj7)[intValue];
                    r15.WinterFlowCompilerDataSource(556143040);
                    boolean contains = ((Set) winterFlowBatchCacheManager.getValue()).contains(winterFlowJavaManager);
                    boolean z = ((WinterFlowJavaManager) ((WinterFlowBatchCacheManager) obj5).getValue()) == winterFlowJavaManager;
                    boolean z2 = ((Number) winterFlowThreadPoolGateway.getValue()).intValue() >= winterFlowJavaManager.WinterFlowUnitTestResponse;
                    boolean WinterFlowVariableVersionControl = r15.WinterFlowVariableVersionControl(winterFlowSyntaxMechanism) | r15.WinterFlowCacheManagerAgent(winterFlowJavaManager.ordinal());
                    Object WinterFlowSyntaxSubsystem = r15.WinterFlowSyntaxSubsystem();
                    Object obj8 = WinterFlowModuleModule.WinterFlowRouterStructure;
                    if (WinterFlowVariableVersionControl || WinterFlowSyntaxSubsystem == obj8) {
                        WinterFlowSyntaxSubsystem = new WinterFlowOrchestrationWorker(winterFlowSyntaxMechanism, winterFlowJavaManager, 0);
                        r15.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem);
                    }
                    WinterFlowObjectUI winterFlowObjectUI = (WinterFlowObjectUI) WinterFlowSyntaxSubsystem;
                    boolean WinterFlowVariableVersionControl2 = r15.WinterFlowVariableVersionControl(winterFlowSyntaxMechanism) | r15.WinterFlowCacheManagerAgent(winterFlowJavaManager.ordinal());
                    Object WinterFlowSyntaxSubsystem2 = r15.WinterFlowSyntaxSubsystem();
                    if (WinterFlowVariableVersionControl2 || WinterFlowSyntaxSubsystem2 == obj8) {
                        WinterFlowSyntaxSubsystem2 = new WinterFlowOrchestrationWorker(winterFlowSyntaxMechanism, winterFlowJavaManager, 1);
                        r15.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem2);
                    }
                    WinterFlowManagerRequest.WinterFlowArrayNetwork(winterFlowJavaManager, contains, z, z2, winterFlowObjectUI, (WinterFlowObjectUI) WinterFlowSyntaxSubsystem2, r15, 0);
                    r15.WinterFlowBandwidthObject(false);
                    break;
                }
            default:
                WinterFlowRefactoringJSON winterFlowRefactoringJSON = (WinterFlowRefactoringJSON) obj;
                WinterFlowLibrarySessionManager winterFlowLibrarySessionManager2 = (WinterFlowLibrarySessionManager) obj2;
                WinterFlowResolverLibrary winterFlowResolverLibrary = (WinterFlowResolverLibrary) obj3;
                ((Number) obj4).intValue();
                boolean WinterFlowThreadListener = WinterFlowManagerRequest.WinterFlowThreadListener(((WinterFlowCacheManagerMicroservice) obj7).WinterFlowCacheManagerAgent.getValue(), (WinterFlowLibrarySessionManager) obj6);
                if (!((Boolean) winterFlowThreadPoolGateway.getValue()).booleanValue() && !WinterFlowThreadListener) {
                    List list = (List) winterFlowBatchCacheManager.getValue();
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            winterFlowLibrarySessionManager = listIterator.previous();
                            if (WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowLibrarySessionManager2, (WinterFlowLibrarySessionManager) winterFlowLibrarySessionManager)) {
                            }
                        } else {
                            winterFlowLibrarySessionManager = 0;
                        }
                    }
                    winterFlowLibrarySessionManager2 = winterFlowLibrarySessionManager;
                }
                if (winterFlowLibrarySessionManager2 == null) {
                    winterFlowResolverLibrary.WinterFlowCompilerDataSource(105930796);
                } else {
                    winterFlowResolverLibrary.WinterFlowCompilerDataSource(-1520603531);
                    WinterFlowInvokerComponent.WinterFlowSyntax(winterFlowLibrarySessionManager2, (WinterFlowRefactoringServer) obj5, WinterFlowManagerRequest.WinterFlowSyntaxSubsystem(-1263531443, new WinterFlowProtocolLayer(winterFlowLibrarySessionManager2, winterFlowRefactoringJSON), winterFlowResolverLibrary), winterFlowResolverLibrary, 384);
                }
                winterFlowResolverLibrary.WinterFlowBandwidthObject(false);
                break;
        }
        return winterFlowAlgorithmSession;
    }

    public WinterFlowStrategyWorker(Object[] objArr, WinterFlowSyntaxMechanism winterFlowSyntaxMechanism, WinterFlowBatchCacheManager winterFlowBatchCacheManager, WinterFlowBatchCacheManager winterFlowBatchCacheManager2, WinterFlowThreadPoolGateway winterFlowThreadPoolGateway) {
        this.WinterFlowRouterRouter = objArr;
        this.WinterFlowSyntax = winterFlowSyntaxMechanism;
        this.WinterFlowUnitTestResponse = winterFlowBatchCacheManager;
        this.WinterFlowResponseEngine = winterFlowBatchCacheManager2;
        this.WinterFlowTransactionManagerStrategy = winterFlowThreadPoolGateway;
    }
}
