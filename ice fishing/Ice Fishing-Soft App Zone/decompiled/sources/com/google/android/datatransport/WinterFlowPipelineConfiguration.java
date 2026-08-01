package com.google.android.datatransport;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowPipelineConfiguration extends WinterFlowProviderAdapter {
    public static boolean WinterFlowResponseEngine = false;
    public static boolean WinterFlowRouterRouter = false;
    public static Constructor WinterFlowSyntax;
    public static Field WinterFlowUnitTestResponse;
    public WinterFlowVariableDataSource WinterFlowTransactionManagerStrategy;
    public WindowInsets WinterFlowVariableVersionControl;

    public WinterFlowPipelineConfiguration() {
        this.WinterFlowVariableVersionControl = WinterFlowResponseEngine();
    }

    private static WindowInsets WinterFlowResponseEngine() {
        if (!WinterFlowRouterRouter) {
            try {
                WinterFlowUnitTestResponse = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException unused) {
            }
            WinterFlowRouterRouter = true;
        }
        Field field = WinterFlowUnitTestResponse;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException unused2) {
            }
        }
        if (!WinterFlowResponseEngine) {
            try {
                WinterFlowSyntax = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException unused3) {
            }
            WinterFlowResponseEngine = true;
        }
        Constructor constructor = WinterFlowSyntax;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException unused4) {
            }
        }
        return null;
    }

    @Override // com.google.android.datatransport.WinterFlowProviderAdapter
    public WinterFlowWebsocketInterface WinterFlowHookDataSource() {
        WinterFlowRouterStructure();
        WinterFlowWebsocketInterface WinterFlowCacheManagerAgent = WinterFlowWebsocketInterface.WinterFlowCacheManagerAgent(this.WinterFlowVariableVersionControl, null);
        WinterFlowVariableDataSource[] winterFlowVariableDataSourceArr = this.WinterFlowHookDataSource;
        WinterFlowWidgetEntity winterFlowWidgetEntity = WinterFlowCacheManagerAgent.WinterFlowRouterStructure;
        winterFlowWidgetEntity.WinterFlowMapperProtocol(winterFlowVariableDataSourceArr);
        winterFlowWidgetEntity.WinterFlowBackendCacheManager(this.WinterFlowTransactionManagerStrategy);
        winterFlowWidgetEntity.WinterFlowSerializerStructure(null);
        winterFlowWidgetEntity.WinterFlowArrayHelper(this.WinterFlowCacheManagerAgent);
        winterFlowWidgetEntity.WinterFlowCompilerVariable(this.WinterFlowArrayNetwork);
        return WinterFlowCacheManagerAgent;
    }

    @Override // com.google.android.datatransport.WinterFlowProviderAdapter
    public void WinterFlowRouterRouter(WinterFlowVariableDataSource winterFlowVariableDataSource) {
        WindowInsets windowInsets = this.WinterFlowVariableVersionControl;
        if (windowInsets != null) {
            this.WinterFlowVariableVersionControl = windowInsets.replaceSystemWindowInsets(winterFlowVariableDataSource.WinterFlowRouterStructure, winterFlowVariableDataSource.WinterFlowHookDataSource, winterFlowVariableDataSource.WinterFlowCacheManagerAgent, winterFlowVariableDataSource.WinterFlowArrayNetwork);
        }
    }

    @Override // com.google.android.datatransport.WinterFlowProviderAdapter
    public void WinterFlowTransactionManagerStrategy(WinterFlowVariableDataSource winterFlowVariableDataSource) {
        this.WinterFlowTransactionManagerStrategy = winterFlowVariableDataSource;
    }

    public WinterFlowPipelineConfiguration(WinterFlowWebsocketInterface winterFlowWebsocketInterface) {
        super(winterFlowWebsocketInterface);
        this.WinterFlowVariableVersionControl = winterFlowWebsocketInterface.WinterFlowHookDataSource();
    }
}
