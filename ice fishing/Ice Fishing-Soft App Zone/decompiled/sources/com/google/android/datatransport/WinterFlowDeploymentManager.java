package com.google.android.datatransport;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowDeploymentManager {
    public final boolean WinterFlowArrayNetwork;
    public WinterFlowRequestEngine WinterFlowBandwidthObject;
    public final boolean WinterFlowCacheManagerAgent;
    public final TextUtils.TruncateAt WinterFlowHookDataSource;
    public final float WinterFlowResponseEngine;
    public final int WinterFlowRouterRouter;
    public final TextPaint WinterFlowRouterStructure;
    public final int WinterFlowServerProtocol;
    public final Rect WinterFlowServiceUtility = new Rect();
    public final float WinterFlowSyntax;
    public final WinterFlowDebugHandler[] WinterFlowThreadListener;
    public final Paint.FontMetricsInt WinterFlowTransactionAgent;
    public final int WinterFlowTransactionManagerStrategy;
    public final int WinterFlowUnitTestResponse;
    public final Layout WinterFlowVariableVersionControl;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0179 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x028c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x032e  */
    /* JADX WARN: Type inference failed for: r13v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r26v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18, types: [android.graphics.Paint$FontMetricsInt] */
    /* JADX WARN: Type inference failed for: r6v25 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public WinterFlowDeploymentManager(CharSequence charSequence, float f, TextPaint textPaint, int i, TextUtils.TruncateAt truncateAt, int i2, boolean z, int i3, int i4, int i5, int i6, int i7, int i8, WinterFlowParserComponent winterFlowParserComponent) {
        int i9;
        TextDirectionHeuristic textDirectionHeuristic;
        Layout WinterFlowRouterStructure;
        boolean z2;
        int i10;
        WinterFlowDebugHandler[] winterFlowDebugHandlerArr;
        int i11;
        int i12;
        int i13;
        long j;
        int i14;
        long j2;
        char c;
        Throwable th;
        int i15;
        long j3;
        long WinterFlowRouterStructure2;
        int i16;
        ?? isFallbackLineSpacingEnabled;
        ?? isFallbackLineSpacingEnabled2;
        int i17;
        Layout layout;
        int i18;
        ?? r6;
        boolean z3;
        int i19;
        int i20;
        this.WinterFlowRouterStructure = textPaint;
        this.WinterFlowHookDataSource = truncateAt;
        this.WinterFlowCacheManagerAgent = z;
        int length = charSequence.length();
        TextDirectionHeuristic WinterFlowHookDataSource = WinterFlowSessionProvider.WinterFlowHookDataSource(i2);
        Layout.Alignment alignment = WinterFlowTransactionNode.WinterFlowRouterStructure;
        Layout.Alignment alignment2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? Layout.Alignment.ALIGN_NORMAL : WinterFlowTransactionNode.WinterFlowHookDataSource : WinterFlowTransactionNode.WinterFlowRouterStructure : Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        boolean z4 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, WinterFlowVersionControlSystem.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics WinterFlowRouterStructure3 = winterFlowParserComponent.WinterFlowRouterStructure();
            double d = f;
            int ceil = (int) Math.ceil(d);
            if (WinterFlowRouterStructure3 == null || winterFlowParserComponent.WinterFlowCacheManagerAgent() > f || z4) {
                i9 = i3;
                textDirectionHeuristic = WinterFlowHookDataSource;
                WinterFlowRouterStructure = WinterFlowWorkerVersionControl.WinterFlowRouterStructure(charSequence, textPaint, ceil, charSequence.length(), textDirectionHeuristic, alignment2, i9, truncateAt, (int) Math.ceil(d), i8, z, i4, i5, i6, i7);
                z2 = false;
            } else {
                if (ceil < 0) {
                    WinterFlowWorkerPipeline.WinterFlowRouterStructure("negative width");
                }
                if (ceil < 0) {
                    WinterFlowWorkerPipeline.WinterFlowRouterStructure("negative ellipsized width");
                }
                WinterFlowRouterStructure = Build.VERSION.SDK_INT >= 33 ? WinterFlowObjectConsumer.WinterFlowCacheManagerAgent(charSequence, textPaint, ceil, alignment2, WinterFlowRouterStructure3, z, truncateAt, ceil) : new BoringLayout(charSequence, textPaint, ceil, alignment2, 1.0f, 0.0f, WinterFlowRouterStructure3, z, truncateAt, ceil);
                i9 = i3;
                textDirectionHeuristic = WinterFlowHookDataSource;
                z2 = true;
            }
            this.WinterFlowVariableVersionControl = WinterFlowRouterStructure;
            Trace.endSection();
            int min = Math.min(WinterFlowRouterStructure.getLineCount(), i9);
            this.WinterFlowTransactionManagerStrategy = min;
            int i21 = min - 1;
            this.WinterFlowArrayNetwork = min >= i9 && (WinterFlowRouterStructure.getEllipsisCount(i21) > 0 || WinterFlowRouterStructure.getLineEnd(i21) != charSequence.length());
            if (WinterFlowRouterStructure.getText() instanceof Spanned) {
                CharSequence text = WinterFlowRouterStructure.getText();
                text.getClass();
                if (WinterFlowNodeVersion.WinterFlowThreadListener((Spanned) text, WinterFlowDebugHandler.class) || WinterFlowRouterStructure.getText().length() <= 0) {
                    CharSequence text2 = WinterFlowRouterStructure.getText();
                    text2.getClass();
                    i10 = 0;
                    winterFlowDebugHandlerArr = (WinterFlowDebugHandler[]) ((Spanned) text2).getSpans(0, WinterFlowRouterStructure.getText().length(), WinterFlowDebugHandler.class);
                    this.WinterFlowThreadListener = winterFlowDebugHandlerArr;
                    if (winterFlowDebugHandlerArr != null) {
                        WinterFlowDebugHandler winterFlowDebugHandler = winterFlowDebugHandlerArr.length == 0 ? null : winterFlowDebugHandlerArr[i10];
                        if (winterFlowDebugHandler != null) {
                            if (winterFlowDebugHandler.WinterFlowUnitTestResponse) {
                                i11 = 2;
                                if (winterFlowDebugHandler.WinterFlowResponseEngine == 2) {
                                    i20 = 1;
                                    i12 = i20;
                                    if (winterFlowDebugHandlerArr != null) {
                                        WinterFlowDebugHandler winterFlowDebugHandler2 = winterFlowDebugHandlerArr.length == 0 ? null : winterFlowDebugHandlerArr[i10];
                                        if (winterFlowDebugHandler2 != null && winterFlowDebugHandler2.WinterFlowRouterRouter && winterFlowDebugHandler2.WinterFlowResponseEngine == i11) {
                                            i13 = 1;
                                            if (i12 != 0 || i13 == 0) {
                                                j = WinterFlowSessionProvider.WinterFlowHookDataSource;
                                                if (z) {
                                                    i14 = 33;
                                                } else if (z2) {
                                                    BoringLayout boringLayout = (BoringLayout) WinterFlowRouterStructure;
                                                    i14 = 33;
                                                    if (Build.VERSION.SDK_INT >= 33) {
                                                        isFallbackLineSpacingEnabled2 = boringLayout.isFallbackLineSpacingEnabled();
                                                        i16 = isFallbackLineSpacingEnabled2;
                                                        if (i16 == 0) {
                                                            TextPaint paint = WinterFlowRouterStructure.getPaint();
                                                            CharSequence text3 = WinterFlowRouterStructure.getText();
                                                            th = null;
                                                            c = ' ';
                                                            Rect WinterFlowConsumerUserManager = WinterFlowInvokerComponent.WinterFlowConsumerUserManager(paint, text3, WinterFlowRouterStructure.getLineStart(i10), WinterFlowRouterStructure.getLineEnd(i10));
                                                            int lineAscent = WinterFlowRouterStructure.getLineAscent(i10);
                                                            j2 = 4294967295L;
                                                            int i22 = WinterFlowConsumerUserManager.top;
                                                            int topPadding = i22 < lineAscent ? lineAscent - i22 : WinterFlowRouterStructure.getTopPadding();
                                                            i15 = 1;
                                                            WinterFlowConsumerUserManager = min != 1 ? WinterFlowInvokerComponent.WinterFlowConsumerUserManager(paint, text3, WinterFlowRouterStructure.getLineStart(i21), WinterFlowRouterStructure.getLineEnd(i21)) : WinterFlowConsumerUserManager;
                                                            int lineDescent = WinterFlowRouterStructure.getLineDescent(i21);
                                                            int i23 = WinterFlowConsumerUserManager.bottom;
                                                            int bottomPadding = i23 > lineDescent ? i23 - lineDescent : WinterFlowRouterStructure.getBottomPadding();
                                                            if (topPadding != 0 || bottomPadding != 0) {
                                                                j3 = WinterFlowSessionProvider.WinterFlowRouterStructure(topPadding, bottomPadding);
                                                                WinterFlowRouterStructure2 = WinterFlowSessionProvider.WinterFlowRouterStructure(i12 != 0 ? i10 : (int) (j3 >> c), i13 != 0 ? i10 : (int) (j3 & j2));
                                                            }
                                                            j3 = j;
                                                            WinterFlowRouterStructure2 = WinterFlowSessionProvider.WinterFlowRouterStructure(i12 != 0 ? i10 : (int) (j3 >> c), i13 != 0 ? i10 : (int) (j3 & j2));
                                                        }
                                                    }
                                                    i16 = i10;
                                                    if (i16 == 0) {
                                                    }
                                                } else {
                                                    i14 = 33;
                                                    StaticLayout staticLayout = (StaticLayout) WinterFlowRouterStructure;
                                                    int i24 = Build.VERSION.SDK_INT;
                                                    if (i24 >= 33) {
                                                        isFallbackLineSpacingEnabled = staticLayout.isFallbackLineSpacingEnabled();
                                                        i16 = isFallbackLineSpacingEnabled;
                                                    } else {
                                                        if (i24 >= 28) {
                                                            i16 = 1;
                                                        }
                                                        i16 = i10;
                                                    }
                                                    if (i16 == 0) {
                                                    }
                                                }
                                                th = null;
                                                c = ' ';
                                                j2 = 4294967295L;
                                                i15 = 1;
                                                j3 = j;
                                                WinterFlowRouterStructure2 = WinterFlowSessionProvider.WinterFlowRouterStructure(i12 != 0 ? i10 : (int) (j3 >> c), i13 != 0 ? i10 : (int) (j3 & j2));
                                            } else {
                                                WinterFlowRouterStructure2 = WinterFlowSessionProvider.WinterFlowHookDataSource;
                                                j = WinterFlowRouterStructure2;
                                                th = null;
                                                c = ' ';
                                                j2 = 4294967295L;
                                                i15 = 1;
                                                i14 = 33;
                                            }
                                            if (winterFlowDebugHandlerArr != null) {
                                                int length2 = winterFlowDebugHandlerArr.length;
                                                int i25 = i10;
                                                int i26 = i25;
                                                for (int i27 = i26; i27 < length2; i27++) {
                                                    WinterFlowDebugHandler winterFlowDebugHandler3 = winterFlowDebugHandlerArr[i27];
                                                    int i28 = winterFlowDebugHandler3.WinterFlowBandwidthObject;
                                                    i25 = i28 < 0 ? Math.max(i25, Math.abs(i28)) : i25;
                                                    int i29 = winterFlowDebugHandler3.WinterFlowOrchestrationSubsystem;
                                                    if (i29 < 0) {
                                                        i26 = Math.max(i25, Math.abs(i29));
                                                    }
                                                }
                                                j = (i25 == 0 && i26 == 0) ? WinterFlowSessionProvider.WinterFlowHookDataSource : WinterFlowSessionProvider.WinterFlowRouterStructure(i25, i26);
                                            }
                                            this.WinterFlowUnitTestResponse = Math.max((int) (WinterFlowRouterStructure2 >> c), (int) (j >> c));
                                            this.WinterFlowRouterRouter = Math.max((int) (WinterFlowRouterStructure2 & j2), (int) (j & j2));
                                            TextPaint textPaint2 = this.WinterFlowRouterStructure;
                                            WinterFlowDebugHandler[] winterFlowDebugHandlerArr2 = this.WinterFlowThreadListener;
                                            i17 = this.WinterFlowTransactionManagerStrategy - i15;
                                            layout = this.WinterFlowVariableVersionControl;
                                            if (layout.getLineStart(i17) == layout.getLineEnd(i17) || winterFlowDebugHandlerArr2 == null || winterFlowDebugHandlerArr2.length == 0) {
                                                i18 = i10;
                                                r6 = th;
                                            } else {
                                                SpannableString spannableString = new SpannableString("\u200b");
                                                if (winterFlowDebugHandlerArr2.length == 0) {
                                                    WinterFlowCompilerMechanism.WinterFlowSyntax("Array is empty.");
                                                    throw th;
                                                }
                                                WinterFlowDebugHandler winterFlowDebugHandler4 = winterFlowDebugHandlerArr2[i10];
                                                int length3 = spannableString.length();
                                                if (i17 == 0 || !(z3 = winterFlowDebugHandler4.WinterFlowRouterRouter)) {
                                                    ?? r15 = winterFlowDebugHandler4.WinterFlowRouterRouter;
                                                    z3 = r15 == true ? 1 : 0;
                                                    i19 = r15;
                                                } else {
                                                    i19 = i10;
                                                }
                                                spannableString.setSpan(new WinterFlowDebugHandler(winterFlowDebugHandler4.WinterFlowVariableVersionControl, length3, i19, z3, winterFlowDebugHandler4.WinterFlowSyntax, winterFlowDebugHandler4.WinterFlowResponseEngine), i10, spannableString.length(), i14);
                                                i18 = i10;
                                                StaticLayout WinterFlowRouterStructure4 = WinterFlowWorkerVersionControl.WinterFlowRouterStructure(spannableString, textPaint2, Integer.MAX_VALUE, spannableString.length(), textDirectionHeuristic, WinterFlowProxyQueue.WinterFlowRouterStructure, Integer.MAX_VALUE, null, Integer.MAX_VALUE, 0, this.WinterFlowCacheManagerAgent, 0, 0, 0, 0);
                                                Paint.FontMetricsInt fontMetricsInt = new Paint.FontMetricsInt();
                                                fontMetricsInt.ascent = WinterFlowRouterStructure4.getLineAscent(i18);
                                                fontMetricsInt.descent = WinterFlowRouterStructure4.getLineDescent(i18);
                                                fontMetricsInt.top = WinterFlowRouterStructure4.getLineTop(i18);
                                                fontMetricsInt.bottom = WinterFlowRouterStructure4.getLineBottom(i18);
                                                r6 = fontMetricsInt;
                                            }
                                            this.WinterFlowServerProtocol = r6 != 0 ? ((Paint.FontMetricsInt) r6).bottom - ((int) (WinterFlowArrayNetwork(i21) - WinterFlowUnitTestResponse(i21))) : i18;
                                            this.WinterFlowTransactionAgent = r6;
                                            Layout layout2 = this.WinterFlowVariableVersionControl;
                                            this.WinterFlowSyntax = WinterFlowInvokerComponent.WinterFlowEventEmitterController(layout2, i21, layout2.getPaint());
                                            Layout layout3 = this.WinterFlowVariableVersionControl;
                                            this.WinterFlowResponseEngine = WinterFlowInvokerComponent.WinterFlowArrayHelper(layout3, i21, layout3.getPaint());
                                        }
                                    }
                                    i13 = i10;
                                    if (i12 != 0) {
                                    }
                                    j = WinterFlowSessionProvider.WinterFlowHookDataSource;
                                    if (z) {
                                    }
                                    th = null;
                                    c = ' ';
                                    j2 = 4294967295L;
                                    i15 = 1;
                                    j3 = j;
                                    WinterFlowRouterStructure2 = WinterFlowSessionProvider.WinterFlowRouterStructure(i12 != 0 ? i10 : (int) (j3 >> c), i13 != 0 ? i10 : (int) (j3 & j2));
                                    if (winterFlowDebugHandlerArr != null) {
                                    }
                                    this.WinterFlowUnitTestResponse = Math.max((int) (WinterFlowRouterStructure2 >> c), (int) (j >> c));
                                    this.WinterFlowRouterRouter = Math.max((int) (WinterFlowRouterStructure2 & j2), (int) (j & j2));
                                    TextPaint textPaint22 = this.WinterFlowRouterStructure;
                                    WinterFlowDebugHandler[] winterFlowDebugHandlerArr22 = this.WinterFlowThreadListener;
                                    i17 = this.WinterFlowTransactionManagerStrategy - i15;
                                    layout = this.WinterFlowVariableVersionControl;
                                    if (layout.getLineStart(i17) == layout.getLineEnd(i17)) {
                                    }
                                    i18 = i10;
                                    r6 = th;
                                    this.WinterFlowServerProtocol = r6 != 0 ? ((Paint.FontMetricsInt) r6).bottom - ((int) (WinterFlowArrayNetwork(i21) - WinterFlowUnitTestResponse(i21))) : i18;
                                    this.WinterFlowTransactionAgent = r6;
                                    Layout layout22 = this.WinterFlowVariableVersionControl;
                                    this.WinterFlowSyntax = WinterFlowInvokerComponent.WinterFlowEventEmitterController(layout22, i21, layout22.getPaint());
                                    Layout layout32 = this.WinterFlowVariableVersionControl;
                                    this.WinterFlowResponseEngine = WinterFlowInvokerComponent.WinterFlowArrayHelper(layout32, i21, layout32.getPaint());
                                }
                            } else {
                                i11 = 2;
                            }
                            i20 = i10;
                            i12 = i20;
                            if (winterFlowDebugHandlerArr != null) {
                            }
                            i13 = i10;
                            if (i12 != 0) {
                            }
                            j = WinterFlowSessionProvider.WinterFlowHookDataSource;
                            if (z) {
                            }
                            th = null;
                            c = ' ';
                            j2 = 4294967295L;
                            i15 = 1;
                            j3 = j;
                            WinterFlowRouterStructure2 = WinterFlowSessionProvider.WinterFlowRouterStructure(i12 != 0 ? i10 : (int) (j3 >> c), i13 != 0 ? i10 : (int) (j3 & j2));
                            if (winterFlowDebugHandlerArr != null) {
                            }
                            this.WinterFlowUnitTestResponse = Math.max((int) (WinterFlowRouterStructure2 >> c), (int) (j >> c));
                            this.WinterFlowRouterRouter = Math.max((int) (WinterFlowRouterStructure2 & j2), (int) (j & j2));
                            TextPaint textPaint222 = this.WinterFlowRouterStructure;
                            WinterFlowDebugHandler[] winterFlowDebugHandlerArr222 = this.WinterFlowThreadListener;
                            i17 = this.WinterFlowTransactionManagerStrategy - i15;
                            layout = this.WinterFlowVariableVersionControl;
                            if (layout.getLineStart(i17) == layout.getLineEnd(i17)) {
                            }
                            i18 = i10;
                            r6 = th;
                            this.WinterFlowServerProtocol = r6 != 0 ? ((Paint.FontMetricsInt) r6).bottom - ((int) (WinterFlowArrayNetwork(i21) - WinterFlowUnitTestResponse(i21))) : i18;
                            this.WinterFlowTransactionAgent = r6;
                            Layout layout222 = this.WinterFlowVariableVersionControl;
                            this.WinterFlowSyntax = WinterFlowInvokerComponent.WinterFlowEventEmitterController(layout222, i21, layout222.getPaint());
                            Layout layout322 = this.WinterFlowVariableVersionControl;
                            this.WinterFlowResponseEngine = WinterFlowInvokerComponent.WinterFlowArrayHelper(layout322, i21, layout322.getPaint());
                        }
                    }
                    i11 = 2;
                    i12 = i10;
                    if (winterFlowDebugHandlerArr != null) {
                    }
                    i13 = i10;
                    if (i12 != 0) {
                    }
                    j = WinterFlowSessionProvider.WinterFlowHookDataSource;
                    if (z) {
                    }
                    th = null;
                    c = ' ';
                    j2 = 4294967295L;
                    i15 = 1;
                    j3 = j;
                    WinterFlowRouterStructure2 = WinterFlowSessionProvider.WinterFlowRouterStructure(i12 != 0 ? i10 : (int) (j3 >> c), i13 != 0 ? i10 : (int) (j3 & j2));
                    if (winterFlowDebugHandlerArr != null) {
                    }
                    this.WinterFlowUnitTestResponse = Math.max((int) (WinterFlowRouterStructure2 >> c), (int) (j >> c));
                    this.WinterFlowRouterRouter = Math.max((int) (WinterFlowRouterStructure2 & j2), (int) (j & j2));
                    TextPaint textPaint2222 = this.WinterFlowRouterStructure;
                    WinterFlowDebugHandler[] winterFlowDebugHandlerArr2222 = this.WinterFlowThreadListener;
                    i17 = this.WinterFlowTransactionManagerStrategy - i15;
                    layout = this.WinterFlowVariableVersionControl;
                    if (layout.getLineStart(i17) == layout.getLineEnd(i17)) {
                    }
                    i18 = i10;
                    r6 = th;
                    this.WinterFlowServerProtocol = r6 != 0 ? ((Paint.FontMetricsInt) r6).bottom - ((int) (WinterFlowArrayNetwork(i21) - WinterFlowUnitTestResponse(i21))) : i18;
                    this.WinterFlowTransactionAgent = r6;
                    Layout layout2222 = this.WinterFlowVariableVersionControl;
                    this.WinterFlowSyntax = WinterFlowInvokerComponent.WinterFlowEventEmitterController(layout2222, i21, layout2222.getPaint());
                    Layout layout3222 = this.WinterFlowVariableVersionControl;
                    this.WinterFlowResponseEngine = WinterFlowInvokerComponent.WinterFlowArrayHelper(layout3222, i21, layout3222.getPaint());
                }
            }
            winterFlowDebugHandlerArr = null;
            i10 = 0;
            this.WinterFlowThreadListener = winterFlowDebugHandlerArr;
            if (winterFlowDebugHandlerArr != null) {
            }
            i11 = 2;
            i12 = i10;
            if (winterFlowDebugHandlerArr != null) {
            }
            i13 = i10;
            if (i12 != 0) {
            }
            j = WinterFlowSessionProvider.WinterFlowHookDataSource;
            if (z) {
            }
            th = null;
            c = ' ';
            j2 = 4294967295L;
            i15 = 1;
            j3 = j;
            WinterFlowRouterStructure2 = WinterFlowSessionProvider.WinterFlowRouterStructure(i12 != 0 ? i10 : (int) (j3 >> c), i13 != 0 ? i10 : (int) (j3 & j2));
            if (winterFlowDebugHandlerArr != null) {
            }
            this.WinterFlowUnitTestResponse = Math.max((int) (WinterFlowRouterStructure2 >> c), (int) (j >> c));
            this.WinterFlowRouterRouter = Math.max((int) (WinterFlowRouterStructure2 & j2), (int) (j & j2));
            TextPaint textPaint22222 = this.WinterFlowRouterStructure;
            WinterFlowDebugHandler[] winterFlowDebugHandlerArr22222 = this.WinterFlowThreadListener;
            i17 = this.WinterFlowTransactionManagerStrategy - i15;
            layout = this.WinterFlowVariableVersionControl;
            if (layout.getLineStart(i17) == layout.getLineEnd(i17)) {
            }
            i18 = i10;
            r6 = th;
            this.WinterFlowServerProtocol = r6 != 0 ? ((Paint.FontMetricsInt) r6).bottom - ((int) (WinterFlowArrayNetwork(i21) - WinterFlowUnitTestResponse(i21))) : i18;
            this.WinterFlowTransactionAgent = r6;
            Layout layout22222 = this.WinterFlowVariableVersionControl;
            this.WinterFlowSyntax = WinterFlowInvokerComponent.WinterFlowEventEmitterController(layout22222, i21, layout22222.getPaint());
            Layout layout32222 = this.WinterFlowVariableVersionControl;
            this.WinterFlowResponseEngine = WinterFlowInvokerComponent.WinterFlowArrayHelper(layout32222, i21, layout32222.getPaint());
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final float WinterFlowArrayNetwork(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        int i2 = this.WinterFlowTransactionManagerStrategy;
        int i3 = i2 - 1;
        Layout layout = this.WinterFlowVariableVersionControl;
        if (i != i3 || (fontMetricsInt = this.WinterFlowTransactionAgent) == null) {
            return this.WinterFlowUnitTestResponse + layout.getLineBottom(i) + (i == i2 + (-1) ? this.WinterFlowRouterRouter : 0);
        }
        return layout.getLineBottom(i - 1) + fontMetricsInt.bottom;
    }

    public final float WinterFlowCacheManagerAgent(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.WinterFlowUnitTestResponse + ((i != this.WinterFlowTransactionManagerStrategy + (-1) || (fontMetricsInt = this.WinterFlowTransactionAgent) == null) ? this.WinterFlowVariableVersionControl.getLineBaseline(i) : WinterFlowUnitTestResponse(i) - fontMetricsInt.ascent);
    }

    public final WinterFlowRequestEngine WinterFlowHookDataSource() {
        WinterFlowRequestEngine winterFlowRequestEngine = this.WinterFlowBandwidthObject;
        if (winterFlowRequestEngine != null) {
            return winterFlowRequestEngine;
        }
        WinterFlowRequestEngine winterFlowRequestEngine2 = new WinterFlowRequestEngine(this.WinterFlowVariableVersionControl);
        this.WinterFlowBandwidthObject = winterFlowRequestEngine2;
        return winterFlowRequestEngine2;
    }

    public final float WinterFlowRouterRouter(int i, boolean z) {
        return (WinterFlowTransactionManagerStrategy(i) == this.WinterFlowTransactionManagerStrategy - 1 ? this.WinterFlowSyntax + this.WinterFlowResponseEngine : 0.0f) + WinterFlowHookDataSource().WinterFlowResponseEngine(i, true, z);
    }

    public final int WinterFlowRouterStructure() {
        boolean z = this.WinterFlowArrayNetwork;
        Layout layout = this.WinterFlowVariableVersionControl;
        return (z ? layout.getLineBottom(this.WinterFlowTransactionManagerStrategy - 1) : layout.getHeight()) + this.WinterFlowUnitTestResponse + this.WinterFlowRouterRouter + this.WinterFlowServerProtocol;
    }

    public final float WinterFlowSyntax(int i, boolean z) {
        return (WinterFlowTransactionManagerStrategy(i) == this.WinterFlowTransactionManagerStrategy + (-1) ? this.WinterFlowSyntax + this.WinterFlowResponseEngine : 0.0f) + WinterFlowHookDataSource().WinterFlowResponseEngine(i, false, z);
    }

    public final int WinterFlowTransactionManagerStrategy(int i) {
        int i2 = this.WinterFlowTransactionManagerStrategy;
        if (i2 <= 0) {
            return 0;
        }
        int lineForOffset = this.WinterFlowVariableVersionControl.getLineForOffset(i);
        int i3 = i2 - 1;
        return lineForOffset > i3 ? i3 : lineForOffset;
    }

    public final float WinterFlowUnitTestResponse(int i) {
        return this.WinterFlowVariableVersionControl.getLineTop(i) + (i == 0 ? 0 : this.WinterFlowUnitTestResponse);
    }

    public final int WinterFlowVariableVersionControl(int i) {
        ThreadLocal threadLocal = WinterFlowSessionProvider.WinterFlowRouterStructure;
        Layout layout = this.WinterFlowVariableVersionControl;
        return (layout.getEllipsisCount(i) <= 0 || this.WinterFlowHookDataSource != TextUtils.TruncateAt.END) ? layout.getLineEnd(i) : layout.getText().length();
    }
}
