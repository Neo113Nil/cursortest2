package com.google.android.datatransport;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowWebsocketInterface {
    public static final WinterFlowWebsocketInterface WinterFlowHookDataSource;
    public final WinterFlowWidgetEntity WinterFlowRouterStructure;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            WinterFlowHookDataSource = WinterFlowControllerResolver.WinterFlowResolverController;
        } else if (i >= 30) {
            WinterFlowHookDataSource = WinterFlowBatchSystem.WinterFlowMapperProtocol;
        } else {
            WinterFlowHookDataSource = WinterFlowWidgetEntity.WinterFlowHookDataSource;
        }
    }

    public WinterFlowWebsocketInterface(WinterFlowWebsocketInterface winterFlowWebsocketInterface) {
        if (winterFlowWebsocketInterface == null) {
            this.WinterFlowRouterStructure = new WinterFlowWidgetEntity(this);
            return;
        }
        WinterFlowWidgetEntity winterFlowWidgetEntity = winterFlowWebsocketInterface.WinterFlowRouterStructure;
        int i = Build.VERSION.SDK_INT;
        if (i >= 35 && (winterFlowWidgetEntity instanceof WinterFlowFrameworkInterface)) {
            this.WinterFlowRouterStructure = new WinterFlowFrameworkInterface(this, (WinterFlowFrameworkInterface) winterFlowWidgetEntity);
        } else if (i >= 34 && (winterFlowWidgetEntity instanceof WinterFlowControllerResolver)) {
            this.WinterFlowRouterStructure = new WinterFlowControllerResolver(this, (WinterFlowControllerResolver) winterFlowWidgetEntity);
        } else if (i >= 31 && (winterFlowWidgetEntity instanceof WinterFlowListenerStrategy)) {
            this.WinterFlowRouterStructure = new WinterFlowListenerStrategy(this, (WinterFlowListenerStrategy) winterFlowWidgetEntity);
        } else if (i >= 30 && (winterFlowWidgetEntity instanceof WinterFlowBatchSystem)) {
            this.WinterFlowRouterStructure = new WinterFlowBatchSystem(this, (WinterFlowBatchSystem) winterFlowWidgetEntity);
        } else if (i >= 29 && (winterFlowWidgetEntity instanceof WinterFlowAlgorithmMapper)) {
            this.WinterFlowRouterStructure = new WinterFlowAlgorithmMapper(this, (WinterFlowAlgorithmMapper) winterFlowWidgetEntity);
        } else if (i >= 28 && (winterFlowWidgetEntity instanceof WinterFlowDatabase)) {
            this.WinterFlowRouterStructure = new WinterFlowDatabase(this, (WinterFlowDatabase) winterFlowWidgetEntity);
        } else if (winterFlowWidgetEntity instanceof WinterFlowClassStack) {
            this.WinterFlowRouterStructure = new WinterFlowClassStack(this, (WinterFlowClassStack) winterFlowWidgetEntity);
        } else if (winterFlowWidgetEntity instanceof WinterFlowInheritanceBatch) {
            this.WinterFlowRouterStructure = new WinterFlowInheritanceBatch(this, (WinterFlowInheritanceBatch) winterFlowWidgetEntity);
        } else {
            this.WinterFlowRouterStructure = new WinterFlowWidgetEntity(this);
        }
        winterFlowWidgetEntity.WinterFlowVariableVersionControl(this);
    }

    public static WinterFlowWebsocketInterface WinterFlowCacheManagerAgent(WindowInsets windowInsets, View view) {
        windowInsets.getClass();
        WinterFlowWebsocketInterface winterFlowWebsocketInterface = new WinterFlowWebsocketInterface(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            int i = WinterFlowIDEComponent.WinterFlowRouterStructure;
            WinterFlowWebsocketInterface WinterFlowRouterStructure = WinterFlowVariableMechanism.WinterFlowRouterStructure(view);
            WinterFlowWidgetEntity winterFlowWidgetEntity = winterFlowWebsocketInterface.WinterFlowRouterStructure;
            winterFlowWidgetEntity.WinterFlowConsumerUserManager(WinterFlowRouterStructure);
            View rootView = view.getRootView();
            winterFlowWidgetEntity.WinterFlowArrayNetwork(rootView);
            winterFlowWidgetEntity.WinterFlowOrchestrationSubsystem(rootView);
            winterFlowWidgetEntity.WinterFlowConcurrencyThread();
            winterFlowWidgetEntity.WinterFlowEventEmitterController(view.getWindowSystemUiVisibility());
        }
        return winterFlowWebsocketInterface;
    }

    public static WinterFlowVariableDataSource WinterFlowRouterStructure(WinterFlowVariableDataSource winterFlowVariableDataSource, int i, int i2, int i3, int i4) {
        int max = Math.max(0, winterFlowVariableDataSource.WinterFlowRouterStructure - i);
        int max2 = Math.max(0, winterFlowVariableDataSource.WinterFlowHookDataSource - i2);
        int max3 = Math.max(0, winterFlowVariableDataSource.WinterFlowCacheManagerAgent - i3);
        int max4 = Math.max(0, winterFlowVariableDataSource.WinterFlowArrayNetwork - i4);
        return (max == i && max2 == i2 && max3 == i3 && max4 == i4) ? winterFlowVariableDataSource : WinterFlowVariableDataSource.WinterFlowHookDataSource(max, max2, max3, max4);
    }

    public final WindowInsets WinterFlowHookDataSource() {
        WinterFlowWidgetEntity winterFlowWidgetEntity = this.WinterFlowRouterStructure;
        if (winterFlowWidgetEntity instanceof WinterFlowInheritanceBatch) {
            return ((WinterFlowInheritanceBatch) winterFlowWidgetEntity).WinterFlowCacheManagerAgent;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WinterFlowWebsocketInterface) {
            return Objects.equals(this.WinterFlowRouterStructure, ((WinterFlowWebsocketInterface) obj).WinterFlowRouterStructure);
        }
        return false;
    }

    public final int hashCode() {
        WinterFlowWidgetEntity winterFlowWidgetEntity = this.WinterFlowRouterStructure;
        if (winterFlowWidgetEntity == null) {
            return 0;
        }
        return winterFlowWidgetEntity.hashCode();
    }

    public WinterFlowWebsocketInterface(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.WinterFlowRouterStructure = new WinterFlowFrameworkInterface(this, windowInsets);
            return;
        }
        if (i >= 34) {
            this.WinterFlowRouterStructure = new WinterFlowControllerResolver(this, windowInsets);
            return;
        }
        if (i >= 31) {
            this.WinterFlowRouterStructure = new WinterFlowListenerStrategy(this, windowInsets);
            return;
        }
        if (i >= 30) {
            this.WinterFlowRouterStructure = new WinterFlowBatchSystem(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.WinterFlowRouterStructure = new WinterFlowAlgorithmMapper(this, windowInsets);
        } else if (i >= 28) {
            this.WinterFlowRouterStructure = new WinterFlowDatabase(this, windowInsets);
        } else {
            this.WinterFlowRouterStructure = new WinterFlowClassStack(this, windowInsets);
        }
    }
}
