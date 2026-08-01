package com.google.android.datatransport;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowParserComponent {
    public final int WinterFlowCacheManagerAgent;
    public final TextPaint WinterFlowHookDataSource;
    public CharSequence WinterFlowRouterRouter;
    public final CharSequence WinterFlowRouterStructure;
    public BoringLayout.Metrics WinterFlowTransactionManagerStrategy;
    public boolean WinterFlowUnitTestResponse;
    public float WinterFlowArrayNetwork = Float.NaN;
    public float WinterFlowVariableVersionControl = Float.NaN;

    public WinterFlowParserComponent(CharSequence charSequence, TextPaint textPaint, int i) {
        this.WinterFlowRouterStructure = charSequence;
        this.WinterFlowHookDataSource = textPaint;
        this.WinterFlowCacheManagerAgent = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        if (com.google.android.datatransport.WinterFlowNodeVersion.WinterFlowThreadListener(r2, com.google.android.datatransport.WinterFlowDataSourceException.class) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
    
        if (r3.getLetterSpacing() == 0.0f) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float WinterFlowCacheManagerAgent() {
        if (!Float.isNaN(this.WinterFlowArrayNetwork)) {
            return this.WinterFlowArrayNetwork;
        }
        BoringLayout.Metrics WinterFlowRouterStructure = WinterFlowRouterStructure();
        float f = WinterFlowRouterStructure != null ? WinterFlowRouterStructure.width : -1;
        TextPaint textPaint = this.WinterFlowHookDataSource;
        if (f < 0.0f) {
            f = (float) Math.ceil(Layout.getDesiredWidth(WinterFlowHookDataSource(), 0, WinterFlowHookDataSource().length(), textPaint));
        }
        if (f != 0.0f) {
            CharSequence charSequence = this.WinterFlowRouterStructure;
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                if (!WinterFlowNodeVersion.WinterFlowThreadListener(spanned, WinterFlowFunctionDebug.class)) {
                }
                f += 0.5f;
            }
        }
        this.WinterFlowArrayNetwork = f;
        return f;
    }

    public final CharSequence WinterFlowHookDataSource() {
        CharSequence charSequence = this.WinterFlowRouterRouter;
        if (charSequence != null) {
            charSequence.getClass();
            return charSequence;
        }
        CharSequence charSequence2 = this.WinterFlowRouterStructure;
        if (charSequence2 instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence2;
            if (WinterFlowNodeVersion.WinterFlowThreadListener(spanned, CharacterStyle.class)) {
                CharacterStyle[] characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, charSequence2.length(), CharacterStyle.class);
                if (characterStyleArr != null && characterStyleArr.length != 0) {
                    SpannableString spannableString = null;
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        if (!(characterStyle instanceof MetricAffectingSpan)) {
                            if (spannableString == null) {
                                spannableString = new SpannableString(charSequence2);
                            }
                            spannableString.removeSpan(characterStyle);
                        }
                    }
                    if (spannableString != null) {
                        charSequence2 = spannableString;
                    }
                }
            }
        }
        this.WinterFlowRouterRouter = charSequence2;
        return charSequence2;
    }

    public final BoringLayout.Metrics WinterFlowRouterStructure() {
        if (!this.WinterFlowUnitTestResponse) {
            TextDirectionHeuristic WinterFlowHookDataSource = WinterFlowSessionProvider.WinterFlowHookDataSource(this.WinterFlowCacheManagerAgent);
            int i = Build.VERSION.SDK_INT;
            CharSequence charSequence = this.WinterFlowRouterStructure;
            TextPaint textPaint = this.WinterFlowHookDataSource;
            this.WinterFlowTransactionManagerStrategy = i >= 33 ? BoringLayout.isBoring(charSequence, textPaint, WinterFlowHookDataSource, true, null) : !WinterFlowHookDataSource.isRtl(charSequence, 0, charSequence.length()) ? BoringLayout.isBoring(charSequence, textPaint, null) : null;
            this.WinterFlowUnitTestResponse = true;
        }
        return this.WinterFlowTransactionManagerStrategy;
    }
}
