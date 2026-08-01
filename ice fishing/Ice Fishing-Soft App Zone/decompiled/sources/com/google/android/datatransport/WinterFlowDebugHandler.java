package com.google.android.datatransport;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowDebugHandler implements LineHeightSpan {
    public int WinterFlowBandwidthObject;
    public int WinterFlowOrchestrationSubsystem;
    public final int WinterFlowResponseEngine;
    public final boolean WinterFlowRouterRouter;
    public final float WinterFlowSyntax;
    public final int WinterFlowTransactionManagerStrategy;
    public final boolean WinterFlowUnitTestResponse;
    public final float WinterFlowVariableVersionControl;
    public int WinterFlowTransactionAgent = Integer.MIN_VALUE;
    public int WinterFlowServerProtocol = Integer.MIN_VALUE;
    public int WinterFlowThreadListener = Integer.MIN_VALUE;
    public int WinterFlowServiceUtility = Integer.MIN_VALUE;

    public WinterFlowDebugHandler(float f, int i, boolean z, boolean z2, float f2, int i2) {
        this.WinterFlowVariableVersionControl = f;
        this.WinterFlowTransactionManagerStrategy = i;
        this.WinterFlowUnitTestResponse = z;
        this.WinterFlowRouterRouter = z2;
        this.WinterFlowSyntax = f2;
        this.WinterFlowResponseEngine = i2;
        if ((0.0f > f2 || f2 > 1.0f) && f2 != -1.0f) {
            WinterFlowWorkerPipeline.WinterFlowHookDataSource("topRatio should be in [0..1] range or -1");
        }
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        int i5 = fontMetricsInt.descent;
        int i6 = fontMetricsInt.ascent;
        if (i5 - i6 <= 0) {
            return;
        }
        boolean z = i == 0;
        boolean z2 = i2 == this.WinterFlowTransactionManagerStrategy;
        int i7 = this.WinterFlowResponseEngine;
        boolean z3 = this.WinterFlowRouterRouter;
        boolean z4 = this.WinterFlowUnitTestResponse;
        if (z && z2 && z4 && z3 && i7 != 2) {
            return;
        }
        if (this.WinterFlowTransactionAgent == Integer.MIN_VALUE) {
            int i8 = i5 - i6;
            int ceil = (int) Math.ceil(this.WinterFlowVariableVersionControl);
            int i9 = ceil - i8;
            if (i7 != 1 || i9 > 0) {
                float f = this.WinterFlowSyntax;
                if (f == -1.0f) {
                    f = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
                }
                int ceil2 = (int) (i9 <= 0 ? Math.ceil(i9 * f) : Math.ceil((1.0f - f) * i9));
                int i10 = fontMetricsInt.descent;
                int i11 = ceil2 + i10;
                this.WinterFlowThreadListener = i11;
                int i12 = i11 - ceil;
                this.WinterFlowServerProtocol = i12;
                if (i7 == 0 || i9 >= 0) {
                    if (z4) {
                        i12 = fontMetricsInt.ascent;
                    }
                    this.WinterFlowTransactionAgent = i12;
                    if (z3) {
                        i11 = i10;
                    }
                    this.WinterFlowServiceUtility = i11;
                    this.WinterFlowBandwidthObject = fontMetricsInt.ascent - i12;
                    this.WinterFlowOrchestrationSubsystem = i11 - i10;
                } else if (i7 == 2) {
                    int i13 = fontMetricsInt.ascent;
                    this.WinterFlowTransactionAgent = z4 ? Math.max(i13, i12) : Math.min(i13, i12);
                    int i14 = fontMetricsInt.descent;
                    int i15 = this.WinterFlowThreadListener;
                    this.WinterFlowServiceUtility = z3 ? Math.min(i14, i15) : Math.max(i14, i15);
                    this.WinterFlowBandwidthObject = 0;
                    this.WinterFlowOrchestrationSubsystem = 0;
                }
            } else {
                int i16 = fontMetricsInt.ascent;
                this.WinterFlowServerProtocol = i16;
                int i17 = fontMetricsInt.descent;
                this.WinterFlowThreadListener = i17;
                this.WinterFlowTransactionAgent = i16;
                this.WinterFlowServiceUtility = i17;
                this.WinterFlowBandwidthObject = 0;
                this.WinterFlowOrchestrationSubsystem = 0;
            }
        }
        fontMetricsInt.ascent = z ? this.WinterFlowTransactionAgent : this.WinterFlowServerProtocol;
        fontMetricsInt.descent = z2 ? this.WinterFlowServiceUtility : this.WinterFlowThreadListener;
    }
}
