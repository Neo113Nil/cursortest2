package com.google.android.datatransport;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowMapperTool implements Spannable {
    public Spannable WinterFlowTransactionManagerStrategy;
    public boolean WinterFlowVariableVersionControl = false;

    public WinterFlowMapperTool(Spannable spannable) {
        this.WinterFlowTransactionManagerStrategy = spannable;
    }

    public final void WinterFlowRouterStructure() {
        Spannable spannable = this.WinterFlowTransactionManagerStrategy;
        if (!this.WinterFlowVariableVersionControl) {
            if ((Build.VERSION.SDK_INT < 28 ? new WinterFlowAlgorithmDebug(28) : new WinterFlowAPIHelper(28)).WinterFlowTransactionManagerStrategy(spannable)) {
                this.WinterFlowTransactionManagerStrategy = new SpannableString(spannable);
            }
        }
        this.WinterFlowVariableVersionControl = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.WinterFlowTransactionManagerStrategy.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.WinterFlowTransactionManagerStrategy.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.WinterFlowTransactionManagerStrategy.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.WinterFlowTransactionManagerStrategy.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.WinterFlowTransactionManagerStrategy.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.WinterFlowTransactionManagerStrategy.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        return this.WinterFlowTransactionManagerStrategy.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.WinterFlowTransactionManagerStrategy.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.WinterFlowTransactionManagerStrategy.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        WinterFlowRouterStructure();
        this.WinterFlowTransactionManagerStrategy.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        WinterFlowRouterStructure();
        this.WinterFlowTransactionManagerStrategy.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.WinterFlowTransactionManagerStrategy.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.WinterFlowTransactionManagerStrategy.toString();
    }
}
