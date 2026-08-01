package com.google.android.datatransport;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowQueryService extends View {
    public static final int[] WinterFlowResponseEngine = {R.attr.state_pressed, R.attr.state_enabled};
    public static final int[] WinterFlowTransactionAgent = new int[0];
    public WinterFlowServerConcurrency WinterFlowRouterRouter;
    public WinterFlowAPISystem WinterFlowSyntax;
    public Boolean WinterFlowTransactionManagerStrategy;
    public Long WinterFlowUnitTestResponse;
    public WinterFlowExceptionService WinterFlowVariableVersionControl;

    private final void setRippleState(boolean z) {
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.WinterFlowRouterRouter;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.WinterFlowUnitTestResponse;
        long longValue = currentAnimationTimeMillis - (l != null ? l.longValue() : 0L);
        if (z || longValue >= 5) {
            int[] iArr = z ? WinterFlowResponseEngine : WinterFlowTransactionAgent;
            WinterFlowExceptionService winterFlowExceptionService = this.WinterFlowVariableVersionControl;
            if (winterFlowExceptionService != null) {
                winterFlowExceptionService.setState(iArr);
            }
        } else {
            WinterFlowServerConcurrency winterFlowServerConcurrency = new WinterFlowServerConcurrency(9, this);
            this.WinterFlowRouterRouter = winterFlowServerConcurrency;
            postDelayed(winterFlowServerConcurrency, 50L);
        }
        this.WinterFlowUnitTestResponse = Long.valueOf(currentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$1(WinterFlowQueryService winterFlowQueryService) {
        WinterFlowExceptionService winterFlowExceptionService = winterFlowQueryService.WinterFlowVariableVersionControl;
        if (winterFlowExceptionService != null) {
            winterFlowExceptionService.setState(WinterFlowTransactionAgent);
        }
        winterFlowQueryService.WinterFlowRouterRouter = null;
    }

    public final void WinterFlowArrayNetwork() {
        setRippleState(false);
    }

    public final void WinterFlowCacheManagerAgent() {
        this.WinterFlowSyntax = null;
        WinterFlowServerConcurrency winterFlowServerConcurrency = this.WinterFlowRouterRouter;
        if (winterFlowServerConcurrency != null) {
            removeCallbacks(winterFlowServerConcurrency);
            WinterFlowServerConcurrency winterFlowServerConcurrency2 = this.WinterFlowRouterRouter;
            winterFlowServerConcurrency2.getClass();
            winterFlowServerConcurrency2.run();
        } else {
            WinterFlowExceptionService winterFlowExceptionService = this.WinterFlowVariableVersionControl;
            if (winterFlowExceptionService != null) {
                winterFlowExceptionService.setState(WinterFlowTransactionAgent);
            }
        }
        WinterFlowExceptionService winterFlowExceptionService2 = this.WinterFlowVariableVersionControl;
        if (winterFlowExceptionService2 == null) {
            return;
        }
        winterFlowExceptionService2.setVisible(false, false);
        unscheduleDrawable(winterFlowExceptionService2);
    }

    public final void WinterFlowHookDataSource(WinterFlowDebugVersion winterFlowDebugVersion, boolean z, long j, int i, long j2, WinterFlowAPISystem winterFlowAPISystem) {
        long j3 = winterFlowDebugVersion.WinterFlowRouterStructure;
        if (this.WinterFlowVariableVersionControl == null || !Boolean.valueOf(z).equals(this.WinterFlowTransactionManagerStrategy)) {
            WinterFlowExceptionService winterFlowExceptionService = new WinterFlowExceptionService(z);
            setBackground(winterFlowExceptionService);
            this.WinterFlowVariableVersionControl = winterFlowExceptionService;
            this.WinterFlowTransactionManagerStrategy = Boolean.valueOf(z);
        }
        WinterFlowExceptionService winterFlowExceptionService2 = this.WinterFlowVariableVersionControl;
        winterFlowExceptionService2.getClass();
        this.WinterFlowSyntax = winterFlowAPISystem;
        WinterFlowVariableVersionControl(i, j, j2);
        if (z) {
            winterFlowExceptionService2.setHotspot(Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (4294967295L & j3)));
        } else {
            winterFlowExceptionService2.setHotspot(winterFlowExceptionService2.getBounds().centerX(), winterFlowExceptionService2.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void WinterFlowVariableVersionControl(int i, long j, long j2) {
        WinterFlowExceptionService winterFlowExceptionService = this.WinterFlowVariableVersionControl;
        if (winterFlowExceptionService == null) {
            return;
        }
        if (winterFlowExceptionService.getRadius() != i) {
            winterFlowExceptionService.setRadius(i);
        }
        float f = Build.VERSION.SDK_INT < 28 ? 0.2f : 0.1f;
        if (f > 1.0f) {
            f = 1.0f;
        }
        long WinterFlowHookDataSource = WinterFlowInheritanceSubsystem.WinterFlowHookDataSource(j2, f);
        WinterFlowInheritanceSubsystem winterFlowInheritanceSubsystem = winterFlowExceptionService.WinterFlowTransactionManagerStrategy;
        if (!(winterFlowInheritanceSubsystem == null ? false : WinterFlowUnitTestSoftware.WinterFlowRouterStructure(winterFlowInheritanceSubsystem.WinterFlowRouterStructure, WinterFlowHookDataSource))) {
            winterFlowExceptionService.WinterFlowTransactionManagerStrategy = new WinterFlowInheritanceSubsystem(WinterFlowHookDataSource);
            winterFlowExceptionService.setColor(ColorStateList.valueOf(WinterFlowInvokerComponent.WinterFlowConfiguration(WinterFlowHookDataSource)));
        }
        Rect rect = new Rect(0, 0, WinterFlowCloudStack.WinterFlowFrontendBackend(Float.intBitsToFloat((int) (j >> 32))), WinterFlowCloudStack.WinterFlowFrontendBackend(Float.intBitsToFloat((int) (j & 4294967295L))));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        winterFlowExceptionService.setBounds(rect);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (isAttachedToWindow()) {
            super.draw(canvas);
        } else {
            WinterFlowCacheManagerAgent();
        }
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        WinterFlowAPISystem winterFlowAPISystem = this.WinterFlowSyntax;
        if (winterFlowAPISystem != null) {
            winterFlowAPISystem.WinterFlowRouterStructure();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
