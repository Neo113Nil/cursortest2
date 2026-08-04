package com.gamericefishpro.space.t2;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import com.android.installreferrer.api.InstallReferrerClient;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends MetricAffectingSpan {
    public final /* synthetic */ int d;
    public final float e;

    public /* synthetic */ a(int i, float f) {
        this.d = i;
        this.e = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.e);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.e);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.e);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.e);
                break;
        }
    }
}
