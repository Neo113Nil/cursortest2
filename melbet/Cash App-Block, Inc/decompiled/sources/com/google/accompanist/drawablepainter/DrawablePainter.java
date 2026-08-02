package com.google.accompanist.drawablepainter;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.unit.LayoutDirection;
import coil3.ImageLoader$Builder$$ExternalSyntheticLambda1;
import coil3.size.DimensionKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.RangesKt___RangesKt;

/* loaded from: classes.dex */
public final class DrawablePainter extends Painter implements RememberObserver {
    public final Lazy callback$delegate;
    public final ParcelableSnapshotMutableState drawInvalidateTick$delegate;
    public final Drawable drawable;
    public final ParcelableSnapshotMutableState drawableIntrinsicSize$delegate;

    public DrawablePainter(Drawable drawable) {
        drawable.getClass();
        this.drawable = drawable;
        this.drawInvalidateTick$delegate = Updater.mutableStateOf$default(0);
        Lazy lazy = DrawablePainterKt.MAIN_HANDLER$delegate;
        this.drawableIntrinsicSize$delegate = Updater.mutableStateOf$default(new Size((drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) ? 9205357640488583168L : DimensionKt.Size(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight())));
        this.callback$delegate = LazyKt.lazy(new ImageLoader$Builder$$ExternalSyntheticLambda1(this, 26));
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean applyAlpha(float f) {
        this.drawable.setAlpha(RangesKt___RangesKt.coerceIn(MathKt__MathJVMKt.roundToInt(f * 255.0f), 0, 255));
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean applyColorFilter(ColorFilter colorFilter) {
        this.drawable.setColorFilter(colorFilter != null ? colorFilter.nativeColorFilter : null);
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean applyLayoutDirection(LayoutDirection layoutDirection) {
        int i;
        layoutDirection.getClass();
        int ordinal = layoutDirection.ordinal();
        if (ordinal != 0) {
            i = 1;
            if (ordinal != 1) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return false;
            }
        } else {
            i = 0;
        }
        return this.drawable.setLayoutDirection(i);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public final long mo759getIntrinsicSizeNHjbRc() {
        return ((Size) this.drawableIntrinsicSize$delegate.getValue()).packedValue;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onAbandoned() {
        onForgotten();
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final void onDraw(DrawScope drawScope) {
        drawScope.getClass();
        Canvas canvas = drawScope.getDrawContext().getCanvas();
        ((Number) this.drawInvalidateTick$delegate.getValue()).intValue();
        try {
            canvas.save();
            int i = Build.VERSION.SDK_INT;
            Drawable drawable = this.drawable;
            if (i >= 31 || !(drawable instanceof AnimatedImageDrawable)) {
                drawable.setBounds(0, 0, MathKt__MathJVMKt.roundToInt(Size.m643getWidthimpl(drawScope.mo753getSizeNHjbRc())), MathKt__MathJVMKt.roundToInt(Size.m640getHeightimpl(drawScope.mo753getSizeNHjbRc())));
            } else {
                canvas.scale(Size.m643getWidthimpl(drawScope.mo753getSizeNHjbRc()) / Size.m643getWidthimpl(mo759getIntrinsicSizeNHjbRc()), Size.m640getHeightimpl(drawScope.mo753getSizeNHjbRc()) / Size.m640getHeightimpl(mo759getIntrinsicSizeNHjbRc()));
            }
            android.graphics.Canvas canvas2 = AndroidCanvas_androidKt.EmptyCanvas;
            drawable.draw(((AndroidCanvas) canvas).internalCanvas);
            canvas.restore();
        } catch (Throwable th) {
            canvas.restore();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.RememberObserver
    public final void onForgotten() {
        Drawable drawable = this.drawable;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        drawable.setVisible(false, false);
        drawable.setCallback(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.RememberObserver
    public final void onRemembered() {
        Drawable.Callback callback = (Drawable.Callback) this.callback$delegate.getValue();
        Drawable drawable = this.drawable;
        drawable.setCallback(callback);
        drawable.setVisible(true, true);
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }
}
