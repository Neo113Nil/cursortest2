package com.squareup.cash.mooncake.themes.widget;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import com.squareup.util.android.Views;

/* loaded from: classes6.dex */
public final class MooncakeThemeSpan extends MetricAffectingSpan {
    public final Context context;
    public final TextThemeInfo textThemeInfo;

    public MooncakeThemeSpan(Context context, TextThemeInfo textThemeInfo) {
        context.getClass();
        textThemeInfo.getClass();
        this.context = context;
        this.textThemeInfo = textThemeInfo;
    }

    public final void update(TextPaint textPaint) {
        TextThemeInfo textThemeInfo = this.textThemeInfo;
        int i = textThemeInfo.font;
        Context context = this.context;
        textPaint.setTypeface(PlatformKt.getFont(context, i));
        textThemeInfo.textSize.getClass();
        context.getClass();
        textPaint.setTextSize(Views.sp(context, r1.value));
        textPaint.setLetterSpacing(DBUtil.calculateLetterSpacingEm(context, textThemeInfo));
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.getClass();
        update(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.getClass();
        update(textPaint);
    }
}
