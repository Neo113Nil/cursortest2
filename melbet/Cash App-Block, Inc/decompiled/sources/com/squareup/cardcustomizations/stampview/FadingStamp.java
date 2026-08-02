package com.squareup.cardcustomizations.stampview;

import android.os.SystemClock;
import androidx.compose.ui.graphics.AndroidPaint;
import androidx.compose.ui.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.ranges.RangesKt___RangesKt;

/* loaded from: classes5.dex */
public final class FadingStamp {
    public final TransformedStamp movingStamp;
    public final AndroidPaint paint;
    public final long startTime = SystemClock.elapsedRealtime();

    public FadingStamp(TransformedStamp transformedStamp, AndroidPaint androidPaint) {
        this.movingStamp = transformedStamp;
        this.paint = androidPaint;
    }

    public final void draw(Canvas canvas) {
        canvas.getClass();
        float coerceIn = 1.0f - RangesKt___RangesKt.coerceIn((SystemClock.elapsedRealtime() - this.startTime) / 300.0f, RecyclerView.DECELERATION_RATE, 1.0f);
        AndroidPaint androidPaint = this.paint;
        androidPaint.setAlpha(coerceIn);
        TransformedStamp.draw$default(this.movingStamp, canvas, androidPaint);
    }

    public final boolean isComplete() {
        return ((float) (SystemClock.elapsedRealtime() - this.startTime)) > 300.0f;
    }
}
