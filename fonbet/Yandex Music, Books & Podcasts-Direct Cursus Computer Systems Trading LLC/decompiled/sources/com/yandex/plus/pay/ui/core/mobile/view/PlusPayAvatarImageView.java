package com.yandex.plus.pay.ui.core.mobile.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.home.feature.webviews.internal.stories.m;
import com.yandex.plus.pay.ui.core.mobile.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class PlusPayAvatarImageView extends AppCompatImageView {
    public static final /* synthetic */ int g = 0;
    public boolean a;
    public float b;
    public float c;
    public Drawable d;
    public Path e;
    public Path f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlusPayAvatarImageView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.e = new Path();
        this.f = new Path();
        r1.T(this, attributeSet, a.a, 0, 0, new m(7, this));
    }

    public final float getStrokePadding() {
        return this.c;
    }

    public final float getStrokeWidth() {
        return this.b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        int save;
        canvas.getClass();
        if (this.a) {
            Path path = this.e;
            save = canvas.save();
            canvas.clipPath(path);
            try {
                Drawable drawable = this.d;
                if (drawable != null) {
                    drawable.draw(canvas);
                }
                canvas.restoreToCount(save);
            } finally {
            }
        }
        Path path2 = this.f;
        save = canvas.save();
        canvas.clipPath(path2);
        try {
            super.onDraw(canvas);
        } finally {
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float f = i / 2.0f;
        float f2 = i2 / 2.0f;
        float min = Math.min(f, f2);
        Path path = new Path();
        Path.Direction direction = Path.Direction.CW;
        path.addCircle(f, f2, min, direction);
        this.e = path;
        Path path2 = new Path();
        path2.addCircle(f, f2, min - this.b, direction);
        this.e.op(path2, Path.Op.DIFFERENCE);
        Path path3 = new Path();
        path3.addCircle(f, f2, (min - this.b) - this.c, direction);
        this.f = path3;
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getHeight());
        }
    }

    public final void setGradientDrawable(@NotNull Drawable drawable) {
        drawable.getClass();
        this.d = drawable;
        invalidate();
    }

    public final void setPlusStroked(boolean z) {
        this.a = z;
        invalidate();
    }

    public final void setStrokePadding(float f) {
        this.c = f;
        invalidate();
    }

    public final void setStrokeWidth(float f) {
        this.b = f;
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlusPayAvatarImageView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ PlusPayAvatarImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlusPayAvatarImageView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
