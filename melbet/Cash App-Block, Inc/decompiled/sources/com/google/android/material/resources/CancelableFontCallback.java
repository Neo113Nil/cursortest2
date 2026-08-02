package com.google.android.material.resources;

import android.graphics.Typeface;
import com.withpersona.sdk2.inquiry.shared.LottieUtilsKt;

/* loaded from: classes4.dex */
public final class CancelableFontCallback extends LottieUtilsKt {
    public final ApplyFont applyFont;
    public boolean cancelled;
    public final Typeface fallbackFont;

    public interface ApplyFont {
        void apply(Typeface typeface);
    }

    public CancelableFontCallback(ApplyFont applyFont, Typeface typeface) {
        this.fallbackFont = typeface;
        this.applyFont = applyFont;
    }

    @Override // com.withpersona.sdk2.inquiry.shared.LottieUtilsKt
    public final void onFontRetrievalFailed(int i) {
        if (this.cancelled) {
            return;
        }
        this.applyFont.apply(this.fallbackFont);
    }

    @Override // com.withpersona.sdk2.inquiry.shared.LottieUtilsKt
    public final void onFontRetrieved(Typeface typeface, boolean z) {
        if (this.cancelled) {
            return;
        }
        this.applyFont.apply(typeface);
    }
}
