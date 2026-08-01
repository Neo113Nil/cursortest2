package com.google.android.datatransport;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowDeserializationInterface extends View {
    public static final WinterFlowAlgorithmDeserialization WinterFlowBandwidthObject = new WinterFlowAlgorithmDeserialization(1);
    public boolean WinterFlowResponseEngine;
    public boolean WinterFlowRouterRouter;
    public WinterFlowCacheManagerConfiguration WinterFlowServerProtocol;
    public WinterFlowObjectMicroservice WinterFlowServiceUtility;
    public Outline WinterFlowSyntax;
    public WinterFlowObjectSession WinterFlowThreadListener;
    public WinterFlowConcurrencyParser WinterFlowTransactionAgent;
    public final WinterFlowGatewayDeserialization WinterFlowTransactionManagerStrategy;
    public final WinterFlowCacheThread WinterFlowUnitTestResponse;
    public final WinterFlowProtocolDataSource WinterFlowVariableVersionControl;

    public WinterFlowDeserializationInterface(WinterFlowProtocolDataSource winterFlowProtocolDataSource, WinterFlowGatewayDeserialization winterFlowGatewayDeserialization, WinterFlowCacheThread winterFlowCacheThread) {
        super(winterFlowProtocolDataSource.getContext());
        this.WinterFlowVariableVersionControl = winterFlowProtocolDataSource;
        this.WinterFlowTransactionManagerStrategy = winterFlowGatewayDeserialization;
        this.WinterFlowUnitTestResponse = winterFlowCacheThread;
        setOutlineProvider(WinterFlowBandwidthObject);
        this.WinterFlowResponseEngine = true;
        this.WinterFlowTransactionAgent = WinterFlowUnitTestLibrary.WinterFlowArrayNetwork;
        this.WinterFlowServerProtocol = WinterFlowCacheManagerConfiguration.WinterFlowVariableVersionControl;
        WinterFlowProtocolVersion.WinterFlowRouterStructure.getClass();
        this.WinterFlowThreadListener = WinterFlowServiceProviderBatch.WinterFlowEventEmitterController;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        WinterFlowGatewayDeserialization winterFlowGatewayDeserialization = this.WinterFlowTransactionManagerStrategy;
        WinterFlowHookInterface winterFlowHookInterface = winterFlowGatewayDeserialization.WinterFlowRouterStructure;
        Canvas canvas2 = winterFlowHookInterface.WinterFlowRouterStructure;
        winterFlowHookInterface.WinterFlowRouterStructure = canvas;
        WinterFlowConcurrencyParser winterFlowConcurrencyParser = this.WinterFlowTransactionAgent;
        WinterFlowCacheManagerConfiguration winterFlowCacheManagerConfiguration = this.WinterFlowServerProtocol;
        float width = getWidth();
        float height = getHeight();
        long floatToRawIntBits = (Float.floatToRawIntBits(height) & 4294967295L) | (Float.floatToRawIntBits(width) << 32);
        WinterFlowObjectMicroservice winterFlowObjectMicroservice = this.WinterFlowServiceUtility;
        WinterFlowObjectSession winterFlowObjectSession = this.WinterFlowThreadListener;
        WinterFlowCacheThread winterFlowCacheThread = this.WinterFlowUnitTestResponse;
        WinterFlowObjectPackage winterFlowObjectPackage = winterFlowCacheThread.WinterFlowTransactionManagerStrategy;
        WinterFlowSessionQueue winterFlowSessionQueue = ((WinterFlowCacheThread) winterFlowObjectPackage.WinterFlowRouterRouter).WinterFlowVariableVersionControl;
        WinterFlowConcurrencyParser winterFlowConcurrencyParser2 = winterFlowSessionQueue.WinterFlowRouterStructure;
        WinterFlowCacheManagerConfiguration winterFlowCacheManagerConfiguration2 = winterFlowSessionQueue.WinterFlowHookDataSource;
        WinterFlowJavaLayer WinterFlowTransactionAgent = winterFlowObjectPackage.WinterFlowTransactionAgent();
        WinterFlowObjectPackage winterFlowObjectPackage2 = winterFlowCacheThread.WinterFlowTransactionManagerStrategy;
        long WinterFlowThreadListener = winterFlowObjectPackage2.WinterFlowThreadListener();
        WinterFlowObjectMicroservice winterFlowObjectMicroservice2 = (WinterFlowObjectMicroservice) winterFlowObjectPackage2.WinterFlowUnitTestResponse;
        winterFlowObjectPackage2.WinterFlowBackendCacheManager(winterFlowConcurrencyParser);
        winterFlowObjectPackage2.WinterFlowEventEmitterController(winterFlowCacheManagerConfiguration);
        winterFlowObjectPackage2.WinterFlowConsumerUserManager(winterFlowHookInterface);
        winterFlowObjectPackage2.WinterFlowArrayHelper(floatToRawIntBits);
        winterFlowObjectPackage2.WinterFlowUnitTestResponse = winterFlowObjectMicroservice;
        winterFlowHookInterface.WinterFlowTransactionAgent();
        try {
            winterFlowObjectSession.WinterFlowUnitTestResponse(winterFlowCacheThread);
            winterFlowHookInterface.WinterFlowResponseEngine();
            winterFlowObjectPackage2.WinterFlowBackendCacheManager(winterFlowConcurrencyParser2);
            winterFlowObjectPackage2.WinterFlowEventEmitterController(winterFlowCacheManagerConfiguration2);
            winterFlowObjectPackage2.WinterFlowConsumerUserManager(WinterFlowTransactionAgent);
            winterFlowObjectPackage2.WinterFlowArrayHelper(WinterFlowThreadListener);
            winterFlowObjectPackage2.WinterFlowUnitTestResponse = winterFlowObjectMicroservice2;
            winterFlowGatewayDeserialization.WinterFlowRouterStructure.WinterFlowRouterStructure = canvas2;
            this.WinterFlowRouterRouter = false;
        } catch (Throwable th) {
            winterFlowHookInterface.WinterFlowResponseEngine();
            winterFlowObjectPackage2.WinterFlowBackendCacheManager(winterFlowConcurrencyParser2);
            winterFlowObjectPackage2.WinterFlowEventEmitterController(winterFlowCacheManagerConfiguration2);
            winterFlowObjectPackage2.WinterFlowConsumerUserManager(WinterFlowTransactionAgent);
            winterFlowObjectPackage2.WinterFlowArrayHelper(WinterFlowThreadListener);
            winterFlowObjectPackage2.WinterFlowUnitTestResponse = winterFlowObjectMicroservice2;
            throw th;
        }
    }

    public final boolean getCanUseCompositingLayer$ui_graphics() {
        return this.WinterFlowResponseEngine;
    }

    public final WinterFlowGatewayDeserialization getCanvasHolder() {
        return this.WinterFlowTransactionManagerStrategy;
    }

    public final View getOwnerView() {
        return this.WinterFlowVariableVersionControl;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.WinterFlowResponseEngine;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.WinterFlowRouterRouter) {
            return;
        }
        this.WinterFlowRouterRouter = true;
        super.invalidate();
    }

    public final void setCanUseCompositingLayer$ui_graphics(boolean z) {
        if (this.WinterFlowResponseEngine != z) {
            this.WinterFlowResponseEngine = z;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z) {
        this.WinterFlowRouterRouter = z;
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
