package com.squareup.cash.card.onboarding;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cardcustomizations.stampview.Stamp;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* loaded from: classes4.dex */
public final class SvgView extends View {
    public final Paint paint;
    public Stamp svgStamp;
    public final Matrix transformationMatrix;
    public final RectF viewBounds;

    public SvgView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.viewBounds = new RectF();
        this.transformationMatrix = new Matrix();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(-16777216);
        this.paint = paint;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        Stamp stamp = this.svgStamp;
        if (stamp != null) {
            Paint paint = this.paint;
            paint.getClass();
            Matrix matrix = this.transformationMatrix;
            matrix.getClass();
            Path path = stamp.path;
            if (path == null) {
                Intrinsics.throwUninitializedPropertyAccessException("path");
                throw null;
            }
            Path path2 = stamp.renderedPath;
            path.transform(matrix, path2);
            canvas.drawPath(path2, paint);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        RectF rectF = this.viewBounds;
        rectF.set(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, measuredWidth, measuredHeight);
        Stamp stamp = this.svgStamp;
        if (stamp != null) {
            this.transformationMatrix.setRectToRect(stamp.getCanvasBounds(), rectF, Matrix.ScaleToFit.CENTER);
        }
    }

    public final void setColor(int i) {
        this.paint.setColor(i);
    }

    public final void setStamp(com.squareup.protos.franklin.common.Stamp stamp) {
        stamp.getClass();
        try {
            String str = stamp.name;
            str.getClass();
            String str2 = stamp.svg;
            str2.getClass();
            Stamp stamp2 = new Stamp(str, str2);
            this.transformationMatrix.setRectToRect(stamp2.getCanvasBounds(), this.viewBounds, Matrix.ScaleToFit.CENTER);
            this.svgStamp = stamp2;
        } catch (Exception e) {
            Timber.Forest.w("Failed to load stamp " + stamp, new Object[0], e);
            setOnClickListener(null);
            setClickable(false);
            this.svgStamp = null;
        }
        invalidate();
    }

    public final void setStrokeWidth(float f) {
        this.paint.setStrokeWidth(f);
    }
}
