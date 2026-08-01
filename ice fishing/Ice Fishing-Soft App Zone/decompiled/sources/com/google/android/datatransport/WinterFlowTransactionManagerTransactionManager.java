package com.google.android.datatransport;

import android.view.View;
import android.view.ViewGroup;
import com.icewinter.flow.winter.icecatch.R;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowTransactionManagerTransactionManager {
    public static final ViewGroup.LayoutParams WinterFlowRouterStructure = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final WinterFlowAlgorithmSyntax WinterFlowRouterStructure(WinterFlowLoaderFramework winterFlowLoaderFramework, WinterFlowTransactionManagerEncryption winterFlowTransactionManagerEncryption, WinterFlowEventTool winterFlowEventTool) {
        WinterFlowSyntaxTransactionManager winterFlowSyntaxTransactionManager;
        WinterFlowAlgorithmSyntax winterFlowAlgorithmSyntax;
        Object[] objArr = 0;
        if (WinterFlowDataSourceAlgorithm.WinterFlowRouterStructure.compareAndSet(false, true)) {
            WinterFlowWorkerThreadPool WinterFlowRouterStructure2 = WinterFlowHandlerWebsocket.WinterFlowRouterStructure(1, 6, null);
            WinterFlowCacheRuntime.WinterFlowStrategyTool(WinterFlowEncryptionSubsystem.WinterFlowHookDataSource((WinterFlowEncryptionMicroservice) WinterFlowServerHook.WinterFlowConcurrencyThread.getValue()), null, new WinterFlowMapperJava(WinterFlowRouterStructure2, objArr == true ? 1 : 0, 9), 3);
            WinterFlowProviderFramework winterFlowProviderFramework = new WinterFlowProviderFramework(13, WinterFlowRouterStructure2);
            synchronized (WinterFlowVersionProtocol.WinterFlowCacheManagerAgent) {
                WinterFlowVersionProtocol.WinterFlowSyntax = WinterFlowSerializerUtility.WinterFlowFunctionPipeline(WinterFlowVersionProtocol.WinterFlowSyntax, winterFlowProviderFramework);
            }
            WinterFlowVersionProtocol.WinterFlowCacheManagerAgent();
        }
        if (winterFlowLoaderFramework.getChildCount() > 0) {
            View childAt = winterFlowLoaderFramework.getChildAt(0);
            winterFlowSyntaxTransactionManager = childAt instanceof WinterFlowSyntaxTransactionManager ? (WinterFlowSyntaxTransactionManager) childAt : null;
            if (winterFlowSyntaxTransactionManager != null) {
                winterFlowSyntaxTransactionManager.setComposeViewContext(winterFlowTransactionManagerEncryption);
                if (winterFlowSyntaxTransactionManager == null) {
                    winterFlowSyntaxTransactionManager = new WinterFlowSyntaxTransactionManager(winterFlowLoaderFramework.getContext(), winterFlowTransactionManagerEncryption);
                    winterFlowLoaderFramework.addView(winterFlowSyntaxTransactionManager.getView(), WinterFlowRouterStructure);
                }
                winterFlowSyntaxTransactionManager.setComposeViewContext(winterFlowTransactionManagerEncryption);
                if (winterFlowLoaderFramework.getComposeViewContext$ui() != null) {
                    winterFlowTransactionManagerEncryption.WinterFlowCacheManagerAgent();
                    winterFlowSyntaxTransactionManager.setComposeViewContextIncrementedDuringInit$ui(true);
                }
                Object tag = winterFlowSyntaxTransactionManager.getTag(R.id.wrapped_composition_tag);
                winterFlowAlgorithmSyntax = tag instanceof WinterFlowAlgorithmSyntax ? (WinterFlowAlgorithmSyntax) tag : null;
                if (winterFlowAlgorithmSyntax == null) {
                    winterFlowAlgorithmSyntax = new WinterFlowAlgorithmSyntax(winterFlowSyntaxTransactionManager, new WinterFlowTransactionBackend(winterFlowTransactionManagerEncryption.WinterFlowHookDataSource, new WinterFlowResolverController(winterFlowSyntaxTransactionManager.getRoot())));
                    winterFlowSyntaxTransactionManager.setTag(R.id.wrapped_composition_tag, winterFlowAlgorithmSyntax);
                }
                winterFlowAlgorithmSyntax.WinterFlowCacheManagerAgent(winterFlowEventTool);
                winterFlowSyntaxTransactionManager.setFrameEndScheduler$ui(new WinterFlowTransactionManagerDeserialization(winterFlowTransactionManagerEncryption.WinterFlowHookDataSource));
                return winterFlowAlgorithmSyntax;
            }
        } else {
            winterFlowLoaderFramework.removeAllViews();
        }
        winterFlowSyntaxTransactionManager = null;
        if (winterFlowSyntaxTransactionManager == null) {
        }
        winterFlowSyntaxTransactionManager.setComposeViewContext(winterFlowTransactionManagerEncryption);
        if (winterFlowLoaderFramework.getComposeViewContext$ui() != null) {
        }
        Object tag2 = winterFlowSyntaxTransactionManager.getTag(R.id.wrapped_composition_tag);
        if (tag2 instanceof WinterFlowAlgorithmSyntax) {
        }
        if (winterFlowAlgorithmSyntax == null) {
        }
        winterFlowAlgorithmSyntax.WinterFlowCacheManagerAgent(winterFlowEventTool);
        winterFlowSyntaxTransactionManager.setFrameEndScheduler$ui(new WinterFlowTransactionManagerDeserialization(winterFlowTransactionManagerEncryption.WinterFlowHookDataSource));
        return winterFlowAlgorithmSyntax;
    }
}
