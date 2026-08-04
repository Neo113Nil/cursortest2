package com.gamericefishpro.space.t2;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import com.android.installreferrer.api.InstallReferrerClient;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends MetricAffectingSpan {
    public final /* synthetic */ int d;
    public final Object e;

    public /* synthetic */ b(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                textPaint.setFontFeatureSettings((String) this.e);
                break;
            default:
                textPaint.setTypeface((Typeface) this.e);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                textPaint.setFontFeatureSettings((String) this.e);
                break;
            default:
                textPaint.setTypeface((Typeface) this.e);
                break;
        }
    }
}
