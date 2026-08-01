package com.google.android.datatransport;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowStackEntity implements WinterFlowProtocolVersion {
    public static final AtomicBoolean WinterFlowMapperProtocol = new AtomicBoolean(true);
    public final RenderNode WinterFlowArrayNetwork;
    public float WinterFlowBandwidthObject;
    public boolean WinterFlowBatchUI;
    public final WinterFlowCacheThread WinterFlowCacheManagerAgent;
    public long WinterFlowConcurrencyThread;
    public final WinterFlowGatewayDeserialization WinterFlowHookDataSource;
    public float WinterFlowOrchestrationSubsystem;
    public int WinterFlowResponseEngine;
    public boolean WinterFlowRouterAdapter;
    public boolean WinterFlowRouterRouter;
    public boolean WinterFlowSerializerStructure;
    public float WinterFlowServerProtocol;
    public float WinterFlowServiceUtility;
    public long WinterFlowSingletonPlatform;
    public long WinterFlowSyntax;
    public boolean WinterFlowThreadListener;
    public int WinterFlowTransactionAgent;
    public Paint WinterFlowTransactionManagerStrategy;
    public Matrix WinterFlowUnitTestResponse;
    public float WinterFlowVariableBandwidth;
    public long WinterFlowVariableVersionControl;

    public WinterFlowStackEntity(WinterFlowSyntaxTransactionManager winterFlowSyntaxTransactionManager, WinterFlowGatewayDeserialization winterFlowGatewayDeserialization, WinterFlowCacheThread winterFlowCacheThread) {
        this.WinterFlowHookDataSource = winterFlowGatewayDeserialization;
        this.WinterFlowCacheManagerAgent = winterFlowCacheThread;
        RenderNode create = RenderNode.create("Compose", winterFlowSyntaxTransactionManager);
        this.WinterFlowArrayNetwork = create;
        this.WinterFlowVariableVersionControl = 0L;
        this.WinterFlowSyntax = 0L;
        if (WinterFlowMapperProtocol.getAndSet(false)) {
            create.setScaleX(create.getScaleX());
            create.setScaleY(create.getScaleY());
            create.setTranslationX(create.getTranslationX());
            create.setTranslationY(create.getTranslationY());
            create.setElevation(create.getElevation());
            create.setRotation(create.getRotation());
            create.setRotationX(create.getRotationX());
            create.setRotationY(create.getRotationY());
            create.setCameraDistance(create.getCameraDistance());
            create.setPivotX(create.getPivotX());
            create.setPivotY(create.getPivotY());
            create.setClipToOutline(create.getClipToOutline());
            create.setClipToBounds(false);
            create.setAlpha(create.getAlpha());
            create.isValid();
            create.setLeftTopRightBottom(0, 0, 0, 0);
            create.offsetLeftAndRight(0);
            create.offsetTopAndBottom(0);
            if (Build.VERSION.SDK_INT >= 28) {
                WinterFlowRequestMechanism.WinterFlowCacheManagerAgent(create, WinterFlowRequestMechanism.WinterFlowRouterStructure(create));
                WinterFlowRequestMechanism.WinterFlowArrayNetwork(create, WinterFlowRequestMechanism.WinterFlowHookDataSource(create));
            }
            WinterFlowRepositoryMapper.WinterFlowRouterStructure(create);
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
        }
        create.setClipToBounds(false);
        WinterFlowCloudMicroservice(0);
        this.WinterFlowResponseEngine = 0;
        this.WinterFlowTransactionAgent = 3;
        this.WinterFlowServerProtocol = 1.0f;
        this.WinterFlowServiceUtility = 1.0f;
        this.WinterFlowBandwidthObject = 1.0f;
        long j = WinterFlowInheritanceSubsystem.WinterFlowHookDataSource;
        this.WinterFlowConcurrencyThread = j;
        this.WinterFlowSingletonPlatform = j;
        this.WinterFlowVariableBandwidth = 8.0f;
    }

    @Override // com.google.android.datatransport.WinterFlowProtocolVersion
    public final void WinterFlowArrayHelper(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.WinterFlowSingletonPlatform = j;
            WinterFlowRequestMechanism.WinterFlowArrayNetwork(this.WinterFlowArrayNetwork, WinterFlowInvokerComponent.WinterFlowConfiguration(j));
        }
    }

    @Override // com.google.android.datatransport.WinterFlowProtocolVersion
    public final void WinterFlowArrayNetwork(float f) {
        this.WinterFlowServerProtocol = f;
        this.WinterFlowArrayNetwork.setAlpha(f);
    }

    @Override // com.google.android.datatransport.WinterFlowProtocolVersion
    public final void WinterFlowBackendCacheManager(int i) {
        this.WinterFlowResponseEngine = i;
        WinterFlowUIMiddleware();
    }

    @Override // com.google.android.datatransport.WinterFlowProtocolVersion
    public final void WinterFlowBandwidthObject(float f) {
        this.WinterFlowServiceUtility = f;
        this.WinterFlowArrayNetwork.setScaleX(f);
    }

    @Override // com.google.android.datatransport.WinterFlowProtocolVersion
    public final float WinterFlowBatchUI() {
        return 0.0f;
    }

    @Override // com.google.android.datatransport.WinterFlowProtocolVersion
    public final void WinterFlowCacheManagerAgent() {
        this.WinterFlowArrayNetwork.setRotationX(0.0f);
    }

    @Override // com.google.android.datatransport.WinterFlowProtocolVersion
    public final float WinterFlowCacheManagerListener() {
        return 0.0f;
    }

    public final void WinterFlowCloudMicroservice(int i) {
        RenderNode renderNode = this.WinterFlowArrayNetwork;
        if (i == 1) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.WinterFlowTransactionManagerStrategy);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.WinterFlowTransactionManagerStrategy);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.WinterFlowTransactionManagerStrategy);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // com.google.android.datatransport.WinterFlowProtocolVersion
    public final void WinterFlowCompilerHandler(long j) {
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            this.WinterFlowThreadListener = true;
            this.WinterFlowArrayNetwork.setPivotX(((int) (this.WinterFlowVariableVersionControl >> 32)) / 2.0f);
            this.WinterFlowArrayNetwork.setPivotY(((int) (4294967295L & this.WinterFlowVariableVersionControl)) / 2.0f);
        } else {
            this.WinterFlowThreadListener = false;
            this.WinterFlowArrayNetwork.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            this.WinterFlowArrayNetwork.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    @Override // com.google.android.datatransport.WinterFlowProtocolVersion
    public final void WinterFlowCompilerVariable(float f) {
        this.WinterFlowBandwidthObject = f;
        this.WinterFlowArrayNetwork.setScaleY(f);
    }

    @Override // com.google.android.datatransport.WinterFlowProtocolVersion
    public final void WinterFlowConcurrencyThread(int i) {
        if (this.WinterFlowTransactionAgent == i) {
            return;
        }
        this.WinterFlowTransactionAgent = i;
        Paint paint = this.WinterFlowTransactionManagerStrategy;
        if (paint == null) {
            paint = new Paint();
            this.WinterFlowTransactionManagerStrategy = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(WinterFlowServerManager.WinterFlowSoftwareProtocol(i)));
        WinterFlowUIMiddleware();
    }

    @Override // com.google.android.datatransport.WinterFlowProtocolVersion
    public final Matrix WinterFlowConfigurationSubsystem() {
        Matrix matrix = this.WinterFlowUnitTestResponse;
        if (matrix == null) {
            matrix = new Matrix();
            this.WinterFlowUnitTestResponse = matrix;
        }
        this.WinterFlowArrayNetwork.getMatrix(matrix);
        return matrix;
    }

    @Override // com.google.android.datatransport.WinterFlowProtocolVersion
    public final WinterFlowProxyValidator WinterFlowConsumerUserManager() {
        return null;
    }

    @Override // com.google.android.datatransport.WinterFlowProtocolVersion
    public final void WinterFlowEventEmitterController() {
        this.WinterFlowArrayNetwork.setRotation(0.0f);
    }

    @Override // com.google.android.datatransport.WinterFlowProtocolVersion
    public final long WinterFlowFrontendBackend() {
        return this.WinterFlowConcurrencyThread;
    }

    @Override // com.google.android.datatransport.WinterFlowProtocolVersion
    public final float WinterFlowHookDataSource() {
        return this.WinterFlowServerProtocol;
    }

    @Override // com.google.android.datatransport.WinterFlowProtocolVersion
    public final int WinterFlowMapperProtocol() {
        return this.WinterFlowResponseEngine;
    }

    @Override // com.google.android.datatransport.WinterFlowProtocolVersion
    public final void WinterFlowOrchestrationSubsystem(WinterFlowJavaLayer winterFlowJavaLayer) {
        Canvas canvas = WinterFlowBandwidthListener.WinterFlowRouterStructure;
        DisplayListCanvas displayListCanvas = ((WinterFlowHookInterface) winterFlowJavaLayer).WinterFlowRouterStructure;
        displayListCanvas.getClass();
        displayListCanvas.drawRenderNode(this.WinterFlowArrayNetwork);
    }

    @Override // com.google.android.datatransport.WinterFlowProtocolVersion
    public final void WinterFlowPackageIDE(float f) {
        this.WinterFlowVariableBandwidth = f;
        this.WinterFlowArrayNetwork.setCameraDistance(-f);
    }

    @Override // com.google.android.datatransport.WinterFlowProtocolVersion
    public final float WinterFlowResolverController() {
        return 0.0f;
    }

    @Override // com.google.android.datatransport.WinterFlowProtocolVersion
    public final void WinterFlowResponseEngine() {
        this.WinterFlowArrayNetwork.setRotationY(0.0f);
    }

    @Override // com.google.android.datatransport.WinterFlowProtocolVersion
    public final void WinterFlowRouterAdapter() {
        this.WinterFlowArrayNetwork.setTranslationX(0.0f);
    }

    @Override // com.google.android.datatransport.WinterFlowProtocolVersion
    public final float WinterFlowRouterRouter() {
        return 0.0f;
    }

    public final void WinterFlowRouterStructure() {
        boolean z = this.WinterFlowBatchUI;
        boolean z2 = false;
        boolean z3 = z && !this.WinterFlowRouterRouter;
        if (z && this.WinterFlowRouterRouter) {
            z2 = true;
        }
        if (z3 != this.WinterFlowRouterAdapter) {
            this.WinterFlowRouterAdapter = z3;
            this.WinterFlowArrayNetwork.setClipToBounds(z3);
        }
        if (z2 != this.WinterFlowSerializerStructure) {
            this.WinterFlowSerializerStructure = z2;
            this.WinterFlowArrayNetwork.setClipToOutline(z2);
        }
    }

    @Override // com.google.android.datatransport.WinterFlowProtocolVersion
    public final void WinterFlowSerializerStructure(boolean z) {
        this.WinterFlowBatchUI = z;
        WinterFlowRouterStructure();
    }

    @Override // com.google.android.datatransport.WinterFlowProtocolVersion
    public final void WinterFlowServerProtocol(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.WinterFlowConcurrencyThread = j;
            WinterFlowRequestMechanism.WinterFlowCacheManagerAgent(this.WinterFlowArrayNetwork, WinterFlowInvokerComponent.WinterFlowConfiguration(j));
        }
    }

    @Override // com.google.android.datatransport.WinterFlowProtocolVersion
    public final void WinterFlowServiceUtility() {
        WinterFlowUIMiddleware();
    }

    @Override // com.google.android.datatransport.WinterFlowProtocolVersion
    public final float WinterFlowSingletonPlatform() {
        return this.WinterFlowVariableBandwidth;
    }

    @Override // com.google.android.datatransport.WinterFlowProtocolVersion
    public final float WinterFlowSoftwareEngine() {
        return this.WinterFlowBandwidthObject;
    }

    @Override // com.google.android.datatransport.WinterFlowProtocolVersion
    public final float WinterFlowSoftwareProtocol() {
        return this.WinterFlowOrchestrationSubsystem;
    }

    @Override // com.google.android.datatransport.WinterFlowProtocolVersion
    public final void WinterFlowStrategyTool(int i, int i2, long j) {
        int i3 = (int) (j >> 32);
        int i4 = (int) (4294967295L & j);
        this.WinterFlowArrayNetwork.setLeftTopRightBottom(i, i2, i + i3, i2 + i4);
        if (WinterFlowJavaEntity.WinterFlowRouterStructure(this.WinterFlowVariableVersionControl, j)) {
            return;
        }
        if (this.WinterFlowThreadListener) {
            this.WinterFlowArrayNetwork.setPivotX(i3 / 2.0f);
            this.WinterFlowArrayNetwork.setPivotY(i4 / 2.0f);
        }
        this.WinterFlowVariableVersionControl = j;
    }

    @Override // com.google.android.datatransport.WinterFlowProtocolVersion
    public final void WinterFlowSyntax() {
        this.WinterFlowArrayNetwork.setTranslationY(0.0f);
    }

    @Override // com.google.android.datatransport.WinterFlowProtocolVersion
    public final float WinterFlowSyntaxSubsystem() {
        return 0.0f;
    }

    @Override // com.google.android.datatransport.WinterFlowProtocolVersion
    public final int WinterFlowTestingNode() {
        return this.WinterFlowTransactionAgent;
    }

    @Override // com.google.android.datatransport.WinterFlowProtocolVersion
    public final void WinterFlowThreadListener(Outline outline, long j) {
        this.WinterFlowSyntax = j;
        this.WinterFlowArrayNetwork.setOutline(outline);
        this.WinterFlowRouterRouter = outline != null;
        WinterFlowRouterStructure();
    }

    @Override // com.google.android.datatransport.WinterFlowProtocolVersion
    public final long WinterFlowTransactionAgent() {
        return this.WinterFlowSingletonPlatform;
    }

    @Override // com.google.android.datatransport.WinterFlowProtocolVersion
    public final void WinterFlowTransactionManagerStrategy(float f) {
        this.WinterFlowOrchestrationSubsystem = f;
        this.WinterFlowArrayNetwork.setElevation(f);
    }

    public final void WinterFlowUIMiddleware() {
        int i = this.WinterFlowResponseEngine;
        if (i != 1 && this.WinterFlowTransactionAgent == 3) {
            WinterFlowCloudMicroservice(i);
        } else {
            WinterFlowCloudMicroservice(1);
        }
    }

    @Override // com.google.android.datatransport.WinterFlowProtocolVersion
    public final void WinterFlowUnitTestResponse(WinterFlowConcurrencyParser winterFlowConcurrencyParser, WinterFlowCacheManagerConfiguration winterFlowCacheManagerConfiguration, WinterFlowObjectMicroservice winterFlowObjectMicroservice, WinterFlowProviderFramework winterFlowProviderFramework) {
        Canvas start = this.WinterFlowArrayNetwork.start(Math.max((int) (this.WinterFlowVariableVersionControl >> 32), (int) (this.WinterFlowSyntax >> 32)), Math.max((int) (this.WinterFlowVariableVersionControl & 4294967295L), (int) (this.WinterFlowSyntax & 4294967295L)));
        try {
            WinterFlowHookInterface winterFlowHookInterface = this.WinterFlowHookDataSource.WinterFlowRouterStructure;
            Canvas canvas = winterFlowHookInterface.WinterFlowRouterStructure;
            winterFlowHookInterface.WinterFlowRouterStructure = start;
            WinterFlowCacheThread winterFlowCacheThread = this.WinterFlowCacheManagerAgent;
            WinterFlowObjectPackage winterFlowObjectPackage = winterFlowCacheThread.WinterFlowTransactionManagerStrategy;
            long WinterFlowUserManagerUserManager = WinterFlowServerManager.WinterFlowUserManagerUserManager(this.WinterFlowVariableVersionControl);
            WinterFlowSessionQueue winterFlowSessionQueue = ((WinterFlowCacheThread) winterFlowObjectPackage.WinterFlowRouterRouter).WinterFlowVariableVersionControl;
            WinterFlowConcurrencyParser winterFlowConcurrencyParser2 = winterFlowSessionQueue.WinterFlowRouterStructure;
            WinterFlowCacheManagerConfiguration winterFlowCacheManagerConfiguration2 = winterFlowSessionQueue.WinterFlowHookDataSource;
            WinterFlowJavaLayer WinterFlowTransactionAgent = winterFlowObjectPackage.WinterFlowTransactionAgent();
            long WinterFlowThreadListener = winterFlowObjectPackage.WinterFlowThreadListener();
            WinterFlowObjectMicroservice winterFlowObjectMicroservice2 = (WinterFlowObjectMicroservice) winterFlowObjectPackage.WinterFlowUnitTestResponse;
            winterFlowObjectPackage.WinterFlowBackendCacheManager(winterFlowConcurrencyParser);
            winterFlowObjectPackage.WinterFlowEventEmitterController(winterFlowCacheManagerConfiguration);
            winterFlowObjectPackage.WinterFlowConsumerUserManager(winterFlowHookInterface);
            winterFlowObjectPackage.WinterFlowArrayHelper(WinterFlowUserManagerUserManager);
            winterFlowObjectPackage.WinterFlowUnitTestResponse = winterFlowObjectMicroservice;
            winterFlowHookInterface.WinterFlowTransactionAgent();
            try {
                winterFlowProviderFramework.WinterFlowUnitTestResponse(winterFlowCacheThread);
                winterFlowHookInterface.WinterFlowResponseEngine();
                winterFlowObjectPackage.WinterFlowBackendCacheManager(winterFlowConcurrencyParser2);
                winterFlowObjectPackage.WinterFlowEventEmitterController(winterFlowCacheManagerConfiguration2);
                winterFlowObjectPackage.WinterFlowConsumerUserManager(WinterFlowTransactionAgent);
                winterFlowObjectPackage.WinterFlowArrayHelper(WinterFlowThreadListener);
                winterFlowObjectPackage.WinterFlowUnitTestResponse = winterFlowObjectMicroservice2;
                winterFlowHookInterface.WinterFlowRouterStructure = canvas;
            } catch (Throwable th) {
                winterFlowHookInterface.WinterFlowResponseEngine();
                WinterFlowObjectPackage winterFlowObjectPackage2 = winterFlowCacheThread.WinterFlowTransactionManagerStrategy;
                winterFlowObjectPackage2.WinterFlowBackendCacheManager(winterFlowConcurrencyParser2);
                winterFlowObjectPackage2.WinterFlowEventEmitterController(winterFlowCacheManagerConfiguration2);
                winterFlowObjectPackage2.WinterFlowConsumerUserManager(WinterFlowTransactionAgent);
                winterFlowObjectPackage2.WinterFlowArrayHelper(WinterFlowThreadListener);
                winterFlowObjectPackage2.WinterFlowUnitTestResponse = winterFlowObjectMicroservice2;
                throw th;
            }
        } finally {
            this.WinterFlowArrayNetwork.end(start);
        }
    }

    @Override // com.google.android.datatransport.WinterFlowProtocolVersion
    public final boolean WinterFlowUserManagerUserManager() {
        return this.WinterFlowArrayNetwork.isValid();
    }

    @Override // com.google.android.datatransport.WinterFlowProtocolVersion
    public final void WinterFlowVariableBandwidth() {
        WinterFlowRepositoryMapper.WinterFlowRouterStructure(this.WinterFlowArrayNetwork);
    }

    @Override // com.google.android.datatransport.WinterFlowProtocolVersion
    public final float WinterFlowVariableVersionControl() {
        return this.WinterFlowServiceUtility;
    }
}
