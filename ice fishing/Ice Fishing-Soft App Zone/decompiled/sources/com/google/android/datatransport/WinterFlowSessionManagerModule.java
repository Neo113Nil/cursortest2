package com.google.android.datatransport;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowSessionManagerModule extends WinterFlowLoaderFramework implements WinterFlowServiceLoader {
    public final WinterFlowResolverSubsystem WinterFlowBandwidthObject;
    public boolean WinterFlowConcurrencyThread;
    public boolean WinterFlowOrchestrationSubsystem;
    public final Window WinterFlowServiceUtility;
    public boolean WinterFlowSingletonPlatform;
    public boolean WinterFlowVariableBandwidth;

    public WinterFlowSessionManagerModule(Context context, Window window) {
        super(context);
        this.WinterFlowServiceUtility = window;
        this.WinterFlowBandwidthObject = WinterFlowDecoratorUI.WinterFlowSerializerStructure(WinterFlowWebsocketMechanism.WinterFlowRouterStructure);
        int i = WinterFlowIDEComponent.WinterFlowRouterStructure;
        WinterFlowIDEEvent.WinterFlowHookDataSource(this, this);
        WinterFlowValidatorEngine.WinterFlowRouterStructure(this, new WinterFlowSchedulerUserManager(this, 1));
    }

    @Override // com.google.android.datatransport.WinterFlowLoaderFramework
    public final void WinterFlowHookDataSource(WinterFlowResolverLibrary winterFlowResolverLibrary, int i) {
        winterFlowResolverLibrary.WinterFlowFrameworkTransaction(1735448596);
        int i2 = 4;
        int i3 = (winterFlowResolverLibrary.WinterFlowUnitTestResponse(this) ? 4 : 2) | i;
        if (winterFlowResolverLibrary.WinterFlowFrontendBackend(i3 & 1, (i3 & 3) != 2)) {
            ((WinterFlowEventEvent) this.WinterFlowBandwidthObject.getValue()).WinterFlowVariableVersionControl(winterFlowResolverLibrary, 0);
        } else {
            winterFlowResolverLibrary.WinterFlowQueueService();
        }
        WinterFlowStackEngine WinterFlowConcurrencyThread = winterFlowResolverLibrary.WinterFlowConcurrencyThread();
        if (WinterFlowConcurrencyThread != null) {
            WinterFlowConcurrencyThread.WinterFlowArrayNetwork = new WinterFlowRendererQuery(this, i, i2);
        }
    }

    @Override // com.google.android.datatransport.WinterFlowLoaderFramework
    public final void WinterFlowRouterRouter(int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int paddingLeft = (((i5 - measuredWidth) - paddingRight) / 2) + getPaddingLeft();
        int paddingTop = (((i6 - measuredHeight) - paddingBottom) / 2) + getPaddingTop();
        childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight + paddingTop);
    }

    @Override // com.google.android.datatransport.WinterFlowServiceLoader
    public final WinterFlowWebsocketInterface WinterFlowRouterStructure(View view, WinterFlowWebsocketInterface winterFlowWebsocketInterface) {
        if (!this.WinterFlowConcurrencyThread) {
            View childAt = getChildAt(0);
            int max = Math.max(0, childAt.getLeft());
            int max2 = Math.max(0, childAt.getTop());
            int max3 = Math.max(0, getWidth() - childAt.getRight());
            int max4 = Math.max(0, getHeight() - childAt.getBottom());
            if (max != 0 || max2 != 0 || max3 != 0 || max4 != 0) {
                return winterFlowWebsocketInterface.WinterFlowRouterStructure.WinterFlowSingletonPlatform(max, max2, max3, max4);
            }
        }
        return winterFlowWebsocketInterface;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0088  */
    @Override // com.google.android.datatransport.WinterFlowLoaderFramework
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void WinterFlowSyntax(int i, int i2) {
        int i3;
        int i4;
        int mode;
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.WinterFlowSyntax(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        Window window = this.WinterFlowServiceUtility;
        if (mode2 == Integer.MIN_VALUE && !this.WinterFlowOrchestrationSubsystem && window.getAttributes().height == -2) {
            if (this.WinterFlowConcurrencyThread) {
                int i5 = Build.VERSION.SDK_INT;
                if (i5 < 30) {
                    i3 = WinterFlowFrameworkSystem.WinterFlowRouterStructure.WinterFlowRouterStructure(window);
                } else if (i5 < 32) {
                    i3 = WinterFlowResolverProcessor.WinterFlowRouterStructure.WinterFlowRouterStructure(window);
                }
            } else {
                i3 = size2 + 1;
            }
            int paddingRight = getPaddingRight() + getPaddingLeft();
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            i4 = size - paddingRight;
            if (i4 < 0) {
                i4 = 0;
            }
            int i6 = i3 - paddingBottom;
            int i7 = i6 >= 0 ? i6 : 0;
            mode = View.MeasureSpec.getMode(i);
            if (mode != 0) {
                i = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
            }
            if (mode2 != 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE);
            }
            childAt.measure(i, i2);
            if (mode != Integer.MIN_VALUE) {
                size = Math.min(size, childAt.getMeasuredWidth() + paddingRight);
            } else if (mode != 1073741824) {
                size = childAt.getMeasuredWidth() + paddingRight;
            }
            setMeasuredDimension(size, mode2 == Integer.MIN_VALUE ? mode2 != 1073741824 ? childAt.getMeasuredHeight() + paddingBottom : size2 : Math.min(size2, childAt.getMeasuredHeight() + paddingBottom));
            if (this.WinterFlowConcurrencyThread && childAt.getMeasuredHeight() + paddingBottom > size2 && window.getAttributes().height == -2) {
                window.addFlags(Integer.MIN_VALUE);
                if (this.WinterFlowOrchestrationSubsystem) {
                    return;
                }
                window.setLayout(-1, -1);
                return;
            }
            return;
        }
        i3 = size2;
        int paddingRight2 = getPaddingRight() + getPaddingLeft();
        int paddingBottom2 = getPaddingBottom() + getPaddingTop();
        i4 = size - paddingRight2;
        if (i4 < 0) {
        }
        int i62 = i3 - paddingBottom2;
        if (i62 >= 0) {
        }
        mode = View.MeasureSpec.getMode(i);
        if (mode != 0) {
        }
        if (mode2 != 0) {
        }
        childAt.measure(i, i2);
        if (mode != Integer.MIN_VALUE) {
        }
        setMeasuredDimension(size, mode2 == Integer.MIN_VALUE ? mode2 != 1073741824 ? childAt.getMeasuredHeight() + paddingBottom2 : size2 : Math.min(size2, childAt.getMeasuredHeight() + paddingBottom2));
        if (this.WinterFlowConcurrencyThread) {
        }
    }

    @Override // com.google.android.datatransport.WinterFlowLoaderFramework
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.WinterFlowVariableBandwidth;
    }
}
