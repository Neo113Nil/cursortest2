package com.google.android.datatransport;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public class WinterFlowWidgetEntity {
    public static final WinterFlowWebsocketInterface WinterFlowHookDataSource;
    public final WinterFlowWebsocketInterface WinterFlowRouterStructure;

    static {
        int i = Build.VERSION.SDK_INT;
        WinterFlowHookDataSource = (i >= 36 ? new WinterFlowParserServiceProvider() : i >= 35 ? new WinterFlowHookWorker() : i >= 34 ? new WinterFlowSerializerTool() : i >= 31 ? new WinterFlowClassTransaction() : i >= 30 ? new WinterFlowServerModule() : i >= 29 ? new WinterFlowRouterCache() : new WinterFlowPipelineConfiguration()).WinterFlowHookDataSource().WinterFlowRouterStructure.WinterFlowRouterStructure().WinterFlowRouterStructure.WinterFlowHookDataSource().WinterFlowRouterStructure.WinterFlowCacheManagerAgent();
    }

    public WinterFlowWidgetEntity(WinterFlowWebsocketInterface winterFlowWebsocketInterface) {
        this.WinterFlowRouterStructure = winterFlowWebsocketInterface;
    }

    public WinterFlowVariableDataSource WinterFlowBandwidthObject() {
        return WinterFlowServiceUtility();
    }

    public boolean WinterFlowBatchUI() {
        return false;
    }

    public WinterFlowWebsocketInterface WinterFlowCacheManagerAgent() {
        return this.WinterFlowRouterStructure;
    }

    public WinterFlowWebsocketInterface WinterFlowHookDataSource() {
        return this.WinterFlowRouterStructure;
    }

    public WinterFlowVariableDataSource WinterFlowResponseEngine(int i) {
        if ((i & 8) == 0) {
            return WinterFlowVariableDataSource.WinterFlowVariableVersionControl;
        }
        WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("Unable to query the maximum insets for IME");
        return null;
    }

    public boolean WinterFlowRouterAdapter(int i) {
        return true;
    }

    public WinterFlowSoftwareComponent WinterFlowRouterRouter() {
        return null;
    }

    public WinterFlowWebsocketInterface WinterFlowRouterStructure() {
        return this.WinterFlowRouterStructure;
    }

    public WinterFlowVariableDataSource WinterFlowServerProtocol() {
        return WinterFlowVariableDataSource.WinterFlowVariableVersionControl;
    }

    public WinterFlowVariableDataSource WinterFlowServiceUtility() {
        return WinterFlowVariableDataSource.WinterFlowVariableVersionControl;
    }

    public WinterFlowWebsocketInterface WinterFlowSingletonPlatform(int i, int i2, int i3, int i4) {
        return WinterFlowHookDataSource;
    }

    public WinterFlowVariableDataSource WinterFlowSyntax(int i) {
        return WinterFlowVariableDataSource.WinterFlowVariableVersionControl;
    }

    public WinterFlowVariableDataSource WinterFlowThreadListener() {
        return WinterFlowServiceUtility();
    }

    public WinterFlowVariableDataSource WinterFlowTransactionAgent() {
        return WinterFlowServiceUtility();
    }

    public List<Rect> WinterFlowTransactionManagerStrategy(int i) {
        return Collections.EMPTY_LIST;
    }

    public List<Rect> WinterFlowUnitTestResponse(int i) {
        return Collections.EMPTY_LIST;
    }

    public boolean WinterFlowVariableBandwidth() {
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowWidgetEntity)) {
            return false;
        }
        WinterFlowWidgetEntity winterFlowWidgetEntity = (WinterFlowWidgetEntity) obj;
        return WinterFlowBatchUI() == winterFlowWidgetEntity.WinterFlowBatchUI() && WinterFlowVariableBandwidth() == winterFlowWidgetEntity.WinterFlowVariableBandwidth() && Objects.equals(WinterFlowServiceUtility(), winterFlowWidgetEntity.WinterFlowServiceUtility()) && Objects.equals(WinterFlowServerProtocol(), winterFlowWidgetEntity.WinterFlowServerProtocol()) && Objects.equals(WinterFlowRouterRouter(), winterFlowWidgetEntity.WinterFlowRouterRouter());
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(WinterFlowBatchUI()), Boolean.valueOf(WinterFlowVariableBandwidth()), WinterFlowServiceUtility(), WinterFlowServerProtocol(), WinterFlowRouterRouter());
    }

    public void WinterFlowConcurrencyThread() {
    }

    public void WinterFlowArrayHelper(Rect[][] rectArr) {
    }

    public void WinterFlowArrayNetwork(View view) {
    }

    public void WinterFlowBackendCacheManager(WinterFlowVariableDataSource winterFlowVariableDataSource) {
    }

    public void WinterFlowCompilerVariable(Rect[][] rectArr) {
    }

    public void WinterFlowConsumerUserManager(WinterFlowWebsocketInterface winterFlowWebsocketInterface) {
    }

    public void WinterFlowEventEmitterController(int i) {
    }

    public void WinterFlowMapperProtocol(WinterFlowVariableDataSource[] winterFlowVariableDataSourceArr) {
    }

    public void WinterFlowOrchestrationSubsystem(View view) {
    }

    public void WinterFlowResolverController(WinterFlowVariableDataSource winterFlowVariableDataSource) {
    }

    public void WinterFlowSerializerStructure(WinterFlowClassAPI winterFlowClassAPI) {
    }

    public void WinterFlowVariableVersionControl(WinterFlowWebsocketInterface winterFlowWebsocketInterface) {
    }
}
