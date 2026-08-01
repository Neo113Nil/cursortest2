package com.google.android.datatransport;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowInvokerProtocol implements WinterFlowProtocolVersion {
    public static final WinterFlowServiceStructure WinterFlowMapperProtocol = new WinterFlowServiceStructure();
    public final WinterFlowDeserializationInterface WinterFlowArrayNetwork;
    public int WinterFlowBandwidthObject;
    public float WinterFlowBatchUI;
    public final WinterFlowGatewayDeserialization WinterFlowCacheManagerAgent;
    public boolean WinterFlowConcurrencyThread;
    public final WinterFlowProtocolDataSource WinterFlowHookDataSource;
    public float WinterFlowOrchestrationSubsystem;
    public long WinterFlowResponseEngine;
    public long WinterFlowRouterAdapter;
    public int WinterFlowRouterRouter;
    public long WinterFlowSerializerStructure;
    public boolean WinterFlowServerProtocol;
    public int WinterFlowServiceUtility;
    public float WinterFlowSingletonPlatform;
    public int WinterFlowSyntax;
    public boolean WinterFlowThreadListener;
    public boolean WinterFlowTransactionAgent;
    public final Rect WinterFlowTransactionManagerStrategy;
    public Paint WinterFlowUnitTestResponse;
    public float WinterFlowVariableBandwidth;
    public final Resources WinterFlowVariableVersionControl;

    public WinterFlowInvokerProtocol(WinterFlowProtocolDataSource winterFlowProtocolDataSource) {
        WinterFlowGatewayDeserialization winterFlowGatewayDeserialization = new WinterFlowGatewayDeserialization();
        WinterFlowCacheThread winterFlowCacheThread = new WinterFlowCacheThread();
        this.WinterFlowHookDataSource = winterFlowProtocolDataSource;
        this.WinterFlowCacheManagerAgent = winterFlowGatewayDeserialization;
        WinterFlowDeserializationInterface winterFlowDeserializationInterface = new WinterFlowDeserializationInterface(winterFlowProtocolDataSource, winterFlowGatewayDeserialization, winterFlowCacheThread);
        this.WinterFlowArrayNetwork = winterFlowDeserializationInterface;
        this.WinterFlowVariableVersionControl = winterFlowProtocolDataSource.getResources();
        this.WinterFlowTransactionManagerStrategy = new Rect();
        winterFlowProtocolDataSource.addView(winterFlowDeserializationInterface);
        winterFlowDeserializationInterface.setClipBounds(null);
        this.WinterFlowResponseEngine = 0L;
        View.generateViewId();
        this.WinterFlowServiceUtility = 3;
        this.WinterFlowBandwidthObject = 0;
        this.WinterFlowOrchestrationSubsystem = 1.0f;
        this.WinterFlowSingletonPlatform = 1.0f;
        this.WinterFlowVariableBandwidth = 1.0f;
        long j = WinterFlowInheritanceSubsystem.WinterFlowHookDataSource;
        this.WinterFlowRouterAdapter = j;
        this.WinterFlowSerializerStructure = j;
    }

    @Override // com.google.android.datatransport.WinterFlowProtocolVersion
    public final void WinterFlowArrayHelper(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.WinterFlowSerializerStructure = j;
            this.WinterFlowArrayNetwork.setOutlineSpotShadowColor(WinterFlowInvokerComponent.WinterFlowConfiguration(j));
        }
    }

    @Override // com.google.android.datatransport.WinterFlowProtocolVersion
    public final void WinterFlowArrayNetwork(float f) {
        this.WinterFlowOrchestrationSubsystem = f;
        this.WinterFlowArrayNetwork.setAlpha(f);
    }

    @Override // com.google.android.datatransport.WinterFlowProtocolVersion
    public final void WinterFlowBackendCacheManager(int i) {
        this.WinterFlowBandwidthObject = i;
        WinterFlowCloudMicroservice();
    }

    @Override // com.google.android.datatransport.WinterFlowProtocolVersion
    public final void WinterFlowBandwidthObject(float f) {
        this.WinterFlowSingletonPlatform = f;
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

    public final void WinterFlowCloudMicroservice() {
        int i = this.WinterFlowBandwidthObject;
        if (i != 1 && this.WinterFlowServiceUtility == 3) {
            WinterFlowRouterStructure(i);
        } else {
            WinterFlowRouterStructure(1);
        }
    }

    @Override // com.google.android.datatransport.WinterFlowProtocolVersion
    public final void WinterFlowCompilerHandler(long j) {
        long j2 = 9223372034707292159L & j;
        WinterFlowDeserializationInterface winterFlowDeserializationInterface = this.WinterFlowArrayNetwork;
        if (j2 != 9205357640488583168L) {
            this.WinterFlowConcurrencyThread = false;
            winterFlowDeserializationInterface.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            winterFlowDeserializationInterface.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                winterFlowDeserializationInterface.resetPivot();
                return;
            }
            this.WinterFlowConcurrencyThread = true;
            winterFlowDeserializationInterface.setPivotX(((int) (this.WinterFlowResponseEngine >> 32)) / 2.0f);
            winterFlowDeserializationInterface.setPivotY(((int) (this.WinterFlowResponseEngine & 4294967295L)) / 2.0f);
        }
    }

    @Override // com.google.android.datatransport.WinterFlowProtocolVersion
    public final void WinterFlowCompilerVariable(float f) {
        this.WinterFlowVariableBandwidth = f;
        this.WinterFlowArrayNetwork.setScaleY(f);
    }

    @Override // com.google.android.datatransport.WinterFlowProtocolVersion
    public final void WinterFlowConcurrencyThread(int i) {
        this.WinterFlowServiceUtility = i;
        Paint paint = this.WinterFlowUnitTestResponse;
        if (paint == null) {
            paint = new Paint();
            this.WinterFlowUnitTestResponse = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(WinterFlowServerManager.WinterFlowSoftwareProtocol(i)));
        WinterFlowCloudMicroservice();
    }

    @Override // com.google.android.datatransport.WinterFlowProtocolVersion
    public final Matrix WinterFlowConfigurationSubsystem() {
        return this.WinterFlowArrayNetwork.getMatrix();
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
        return this.WinterFlowRouterAdapter;
    }

    @Override // com.google.android.datatransport.WinterFlowProtocolVersion
    public final float WinterFlowHookDataSource() {
        return this.WinterFlowOrchestrationSubsystem;
    }

    @Override // com.google.android.datatransport.WinterFlowProtocolVersion
    public final int WinterFlowMapperProtocol() {
        return this.WinterFlowBandwidthObject;
    }

    @Override // com.google.android.datatransport.WinterFlowProtocolVersion
    public final void WinterFlowOrchestrationSubsystem(WinterFlowJavaLayer winterFlowJavaLayer) {
        Rect rect;
        boolean z = this.WinterFlowTransactionAgent;
        WinterFlowDeserializationInterface winterFlowDeserializationInterface = this.WinterFlowArrayNetwork;
        if (z) {
            if ((this.WinterFlowThreadListener || winterFlowDeserializationInterface.getClipToOutline()) && !this.WinterFlowServerProtocol) {
                rect = this.WinterFlowTransactionManagerStrategy;
                rect.left = 0;
                rect.top = 0;
                rect.right = winterFlowDeserializationInterface.getWidth();
                rect.bottom = winterFlowDeserializationInterface.getHeight();
            } else {
                rect = null;
            }
            winterFlowDeserializationInterface.setClipBounds(rect);
        }
        Canvas canvas = WinterFlowBandwidthListener.WinterFlowRouterStructure;
        if (((WinterFlowHookInterface) winterFlowJavaLayer).WinterFlowRouterStructure.isHardwareAccelerated()) {
            this.WinterFlowHookDataSource.WinterFlowRouterStructure(winterFlowJavaLayer, winterFlowDeserializationInterface, winterFlowDeserializationInterface.getDrawingTime());
        }
    }

    @Override // com.google.android.datatransport.WinterFlowProtocolVersion
    public final void WinterFlowPackageIDE(float f) {
        this.WinterFlowArrayNetwork.setCameraDistance(f * this.WinterFlowVariableVersionControl.getDisplayMetrics().densityDpi);
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

    public final void WinterFlowRouterStructure(int i) {
        Paint paint = this.WinterFlowUnitTestResponse;
        WinterFlowDeserializationInterface winterFlowDeserializationInterface = this.WinterFlowArrayNetwork;
        boolean z = true;
        if (i == 1) {
            winterFlowDeserializationInterface.setLayerType(2, paint);
        } else if (i == 2) {
            winterFlowDeserializationInterface.setLayerType(0, paint);
            z = false;
        } else {
            winterFlowDeserializationInterface.setLayerType(0, paint);
        }
        winterFlowDeserializationInterface.setCanUseCompositingLayer$ui_graphics(z);
    }

    @Override // com.google.android.datatransport.WinterFlowProtocolVersion
    public final void WinterFlowSerializerStructure(boolean z) {
        boolean z2 = false;
        this.WinterFlowThreadListener = z && !this.WinterFlowServerProtocol;
        this.WinterFlowTransactionAgent = true;
        if (z && this.WinterFlowServerProtocol) {
            z2 = true;
        }
        this.WinterFlowArrayNetwork.setClipToOutline(z2);
    }

    @Override // com.google.android.datatransport.WinterFlowProtocolVersion
    public final void WinterFlowServerProtocol(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.WinterFlowRouterAdapter = j;
            this.WinterFlowArrayNetwork.setOutlineAmbientShadowColor(WinterFlowInvokerComponent.WinterFlowConfiguration(j));
        }
    }

    @Override // com.google.android.datatransport.WinterFlowProtocolVersion
    public final void WinterFlowServiceUtility() {
        Paint paint = this.WinterFlowUnitTestResponse;
        if (paint == null) {
            paint = new Paint();
            this.WinterFlowUnitTestResponse = paint;
        }
        paint.setColorFilter(null);
        WinterFlowCloudMicroservice();
    }

    @Override // com.google.android.datatransport.WinterFlowProtocolVersion
    public final float WinterFlowSingletonPlatform() {
        return this.WinterFlowArrayNetwork.getCameraDistance() / this.WinterFlowVariableVersionControl.getDisplayMetrics().densityDpi;
    }

    @Override // com.google.android.datatransport.WinterFlowProtocolVersion
    public final float WinterFlowSoftwareEngine() {
        return this.WinterFlowVariableBandwidth;
    }

    @Override // com.google.android.datatransport.WinterFlowProtocolVersion
    public final float WinterFlowSoftwareProtocol() {
        return this.WinterFlowBatchUI;
    }

    @Override // com.google.android.datatransport.WinterFlowProtocolVersion
    public final void WinterFlowStrategyTool(int i, int i2, long j) {
        boolean WinterFlowRouterStructure = WinterFlowJavaEntity.WinterFlowRouterStructure(this.WinterFlowResponseEngine, j);
        WinterFlowDeserializationInterface winterFlowDeserializationInterface = this.WinterFlowArrayNetwork;
        if (WinterFlowRouterStructure) {
            int i3 = this.WinterFlowRouterRouter;
            if (i3 != i) {
                winterFlowDeserializationInterface.offsetLeftAndRight(i - i3);
            }
            int i4 = this.WinterFlowSyntax;
            if (i4 != i2) {
                winterFlowDeserializationInterface.offsetTopAndBottom(i2 - i4);
            }
        } else {
            if (this.WinterFlowThreadListener || winterFlowDeserializationInterface.getClipToOutline()) {
                this.WinterFlowTransactionAgent = true;
            }
            int i5 = (int) (j >> 32);
            int i6 = (int) (4294967295L & j);
            winterFlowDeserializationInterface.layout(i, i2, i + i5, i2 + i6);
            this.WinterFlowResponseEngine = j;
            if (this.WinterFlowConcurrencyThread) {
                winterFlowDeserializationInterface.setPivotX(i5 / 2.0f);
                winterFlowDeserializationInterface.setPivotY(i6 / 2.0f);
            }
        }
        this.WinterFlowRouterRouter = i;
        this.WinterFlowSyntax = i2;
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
        return this.WinterFlowServiceUtility;
    }

    @Override // com.google.android.datatransport.WinterFlowProtocolVersion
    public final void WinterFlowThreadListener(Outline outline, long j) {
        WinterFlowDeserializationInterface winterFlowDeserializationInterface = this.WinterFlowArrayNetwork;
        winterFlowDeserializationInterface.WinterFlowSyntax = outline;
        winterFlowDeserializationInterface.invalidateOutline();
        if ((this.WinterFlowThreadListener || winterFlowDeserializationInterface.getClipToOutline()) && outline != null) {
            winterFlowDeserializationInterface.setClipToOutline(true);
            if (this.WinterFlowThreadListener) {
                this.WinterFlowThreadListener = false;
                this.WinterFlowTransactionAgent = true;
            }
        }
        this.WinterFlowServerProtocol = outline != null;
    }

    @Override // com.google.android.datatransport.WinterFlowProtocolVersion
    public final long WinterFlowTransactionAgent() {
        return this.WinterFlowSerializerStructure;
    }

    @Override // com.google.android.datatransport.WinterFlowProtocolVersion
    public final void WinterFlowTransactionManagerStrategy(float f) {
        this.WinterFlowBatchUI = f;
        this.WinterFlowArrayNetwork.setElevation(f);
    }

    @Override // com.google.android.datatransport.WinterFlowProtocolVersion
    public final void WinterFlowUnitTestResponse(WinterFlowConcurrencyParser winterFlowConcurrencyParser, WinterFlowCacheManagerConfiguration winterFlowCacheManagerConfiguration, WinterFlowObjectMicroservice winterFlowObjectMicroservice, WinterFlowProviderFramework winterFlowProviderFramework) {
        WinterFlowDeserializationInterface winterFlowDeserializationInterface = this.WinterFlowArrayNetwork;
        ViewParent parent = winterFlowDeserializationInterface.getParent();
        WinterFlowProtocolDataSource winterFlowProtocolDataSource = this.WinterFlowHookDataSource;
        if (parent == null) {
            winterFlowProtocolDataSource.addView(winterFlowDeserializationInterface);
        }
        winterFlowDeserializationInterface.WinterFlowTransactionAgent = winterFlowConcurrencyParser;
        winterFlowDeserializationInterface.WinterFlowServerProtocol = winterFlowCacheManagerConfiguration;
        winterFlowDeserializationInterface.WinterFlowThreadListener = winterFlowProviderFramework;
        winterFlowDeserializationInterface.WinterFlowServiceUtility = winterFlowObjectMicroservice;
        if (winterFlowDeserializationInterface.isAttachedToWindow()) {
            winterFlowDeserializationInterface.setVisibility(4);
            winterFlowDeserializationInterface.setVisibility(0);
            try {
                WinterFlowHookInterface winterFlowHookInterface = this.WinterFlowCacheManagerAgent.WinterFlowRouterStructure;
                WinterFlowServiceStructure winterFlowServiceStructure = WinterFlowMapperProtocol;
                Canvas canvas = winterFlowHookInterface.WinterFlowRouterStructure;
                winterFlowHookInterface.WinterFlowRouterStructure = winterFlowServiceStructure;
                winterFlowProtocolDataSource.WinterFlowRouterStructure(winterFlowHookInterface, winterFlowDeserializationInterface, winterFlowDeserializationInterface.getDrawingTime());
                winterFlowHookInterface.WinterFlowRouterStructure = canvas;
            } catch (ClassCastException unused) {
            }
        }
    }

    @Override // com.google.android.datatransport.WinterFlowProtocolVersion
    public final void WinterFlowVariableBandwidth() {
        this.WinterFlowHookDataSource.removeViewInLayout(this.WinterFlowArrayNetwork);
    }

    @Override // com.google.android.datatransport.WinterFlowProtocolVersion
    public final float WinterFlowVariableVersionControl() {
        return this.WinterFlowSingletonPlatform;
    }
}
