package com.yandex.music.screen.landing.ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.b1e;
import defpackage.ern;
import defpackage.opi;
import defpackage.s9f;
import defpackage.sij;
import defpackage.weo;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class HomeLandingBottomSheetLayout extends FrameLayout {
    public static final /* synthetic */ s9f[] h;
    public final sij a;
    public boolean b;
    public Path c;
    public final float d;
    public final float e;
    public final Paint f;
    public final float g;

    static {
        opi opiVar = new opi(HomeLandingBottomSheetLayout.class, "anchorAlpha", "getAnchorAlpha()F", 0);
        ern.a.getClass();
        h = new s9f[]{opiVar};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeLandingBottomSheetLayout(@NotNull Context context) {
        super(context);
        context.getClass();
        this.a = new b1e(this, 0);
        this.b = true;
        float dimension = getResources().getDimension(R.dimen.juicy_bottom_sheet_anchor_height);
        this.d = getResources().getDimension(R.dimen.juicy_bottom_sheet_anchor_weight);
        this.e = getResources().getDimension(R.dimen.juicy_bottom_sheet_anchor_top_margin);
        Paint paint = new Paint();
        this.f = paint;
        this.g = getResources().getDimension(R.dimen.juicy_bottom_sheet_top_corners_radius);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(dimension);
        Context context2 = getContext();
        context2.getClass();
        paint.setColor(weo.M(context2, R.attr.bgPlaceholder));
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Path path;
        canvas.getClass();
        if (this.b && (path = this.c) != null) {
            canvas.clipPath(path);
        }
        super.draw(canvas);
    }

    public final float getAnchorAlpha() {
        return ((Number) this.a.getValue(this, h[0])).floatValue();
    }

    public final boolean getEnableRoundedCorners() {
        return this.b;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        float width = getWidth();
        float f = this.d;
        float f2 = 2;
        canvas.drawLine((width - f) / f2, this.e, (getWidth() + f) / f2, this.e, this.f);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float f = this.g;
        Path path = new Path();
        path.addRoundRect(new RectF(0.0f, 0.0f, i, i2), new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CW);
        this.c = path;
    }

    public final void setAnchorAlpha(float f) {
        this.a.setValue(this, h[0], Float.valueOf(f));
    }

    public final void setEnableRoundedCorners(boolean z) {
        this.b = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeLandingBottomSheetLayout(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.a = new b1e(this, 1);
        this.b = true;
        float dimension = getResources().getDimension(R.dimen.juicy_bottom_sheet_anchor_height);
        this.d = getResources().getDimension(R.dimen.juicy_bottom_sheet_anchor_weight);
        this.e = getResources().getDimension(R.dimen.juicy_bottom_sheet_anchor_top_margin);
        Paint paint = new Paint();
        this.f = paint;
        this.g = getResources().getDimension(R.dimen.juicy_bottom_sheet_top_corners_radius);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(dimension);
        Context context2 = getContext();
        context2.getClass();
        paint.setColor(weo.M(context2, R.attr.bgPlaceholder));
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeLandingBottomSheetLayout(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.a = new b1e(this, 2);
        this.b = true;
        float dimension = getResources().getDimension(R.dimen.juicy_bottom_sheet_anchor_height);
        this.d = getResources().getDimension(R.dimen.juicy_bottom_sheet_anchor_weight);
        this.e = getResources().getDimension(R.dimen.juicy_bottom_sheet_anchor_top_margin);
        Paint paint = new Paint();
        this.f = paint;
        this.g = getResources().getDimension(R.dimen.juicy_bottom_sheet_top_corners_radius);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(dimension);
        Context context2 = getContext();
        context2.getClass();
        paint.setColor(weo.M(context2, R.attr.bgPlaceholder));
        paint.setStrokeCap(Paint.Cap.ROUND);
    }
}
