package ru.yandex.taxi.plaque.animation.transitions;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.transition.Transition;
import androidx.transition.TransitionValues;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import defpackage.b64;
import defpackage.g8e;
import defpackage.hay;
import defpackage.rsy0;
import java.util.HashMap;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* loaded from: classes6.dex */
public final class TextSizeTransition extends Transition {
    public static final String[] h0 = {"TextSizeTransition:fontSize"};

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0002\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ7\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010\"\u001a\u00020\u00162\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0004H\u0016¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010&R\u0014\u0010'\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010(R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010*R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010.R\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010.R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010.R\u0014\u0010\r\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010.R*\u0010/\u001a\u00020\b2\u0006\u0010/\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010.\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u00104\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010.\u001a\u0004\b5\u00101\"\u0004\b6\u00103R\"\u00107\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010.\u001a\u0004\b8\u00101\"\u0004\b9\u00103R\"\u0010:\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010.\u001a\u0004\b;\u00101\"\u0004\b<\u00103R\"\u0010=\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010.\u001a\u0004\b>\u00101\"\u0004\b?\u00103¨\u0006@"}, d2 = {"Lru/yandex/taxi/plaque/animation/transitions/TextSizeTransition$SwitchBitmapDrawable;", "Landroid/graphics/drawable/Drawable;", "Landroid/widget/TextView;", "view", "", "gravity", "Landroid/graphics/Bitmap;", "startBitmap", "", "startFontSize", "startWidth", "endBitmap", "endFontSize", "endWidth", "<init>", "(Landroid/widget/TextView;ILandroid/graphics/Bitmap;FFLandroid/graphics/Bitmap;FF)V", "start", "end", "dim", "scale", "getTranslationPoint", "(IFFFF)F", "Lzy11;", "invalidateSelf", "()V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", CaretView.ALPHA_PROPERTY, "setAlpha", "(I)V", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "getOpacity", "()I", "Landroid/widget/TextView;", "horizontalGravity", CA20Status.STATUS_USER_I, "verticalGravity", "Landroid/graphics/Bitmap;", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "F", "fontSize", "getFontSize", "()F", "setFontSize", "(F)V", "left", "getLeft", "setLeft", "top", "getTop", "setTop", "right", "getRight", "setRight", "bottom", "getBottom", "setBottom", "plaque_sdk"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class SwitchBitmapDrawable extends Drawable {
        private float bottom;
        private final Bitmap endBitmap;
        private final float endFontSize;
        private final float endWidth;
        private float fontSize;
        private final int horizontalGravity;
        private float left;
        private final Paint paint = new Paint();
        private float right;
        private final Bitmap startBitmap;
        private final float startFontSize;
        private final float startWidth;
        private float top;
        private final int verticalGravity;
        private final TextView view;

        public SwitchBitmapDrawable(TextView textView, int i, Bitmap bitmap, float f, float f2, Bitmap bitmap2, float f3, float f4) {
            this.view = textView;
            this.horizontalGravity = i & 7;
            this.verticalGravity = i & 112;
            this.startBitmap = bitmap;
            this.endBitmap = bitmap2;
            this.startFontSize = f;
            this.endFontSize = f3;
            this.startWidth = f2;
            this.endWidth = f4;
        }

        private final float getTranslationPoint(int gravity, float start, float end, float dim, float scale) {
            return (gravity == 1 || gravity == 16) ? b64.a(dim, scale, start + end, 2.0f) : (gravity == 80 || gravity == 8388613) ? end - (dim * scale) : start;
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            SwitchBitmapDrawable switchBitmapDrawable;
            Float f;
            SwitchBitmapDrawable switchBitmapDrawable2;
            Float f2;
            SwitchBitmapDrawable switchBitmapDrawable3;
            int save = canvas.save();
            float f3 = this.startFontSize;
            float f4 = this.endFontSize;
            float f5 = f3 / (f3 + f4);
            float f6 = this.fontSize;
            if (f6 == 0.0f) {
                f6 = f3;
            }
            float f7 = (f6 - f3) / (f4 - f3);
            String[] strArr = TextSizeTransition.h0;
            float f8 = this.startWidth;
            float f9 = this.endWidth;
            float b = g8e.b(f9, f8, f7, f8);
            Float f10 = null;
            if (f7 < f5) {
                float f11 = b / f8;
                if (this.startBitmap != null) {
                    switchBitmapDrawable2 = this;
                    f2 = Float.valueOf(getTranslationPoint(this.horizontalGravity, this.left, this.right, r1.getWidth(), f11));
                } else {
                    switchBitmapDrawable2 = this;
                    f2 = null;
                }
                if (switchBitmapDrawable2.startBitmap != null) {
                    switchBitmapDrawable3 = switchBitmapDrawable2;
                    f10 = Float.valueOf(switchBitmapDrawable3.getTranslationPoint(switchBitmapDrawable2.verticalGravity, switchBitmapDrawable2.top, switchBitmapDrawable2.bottom, r1.getHeight(), f11));
                } else {
                    switchBitmapDrawable3 = switchBitmapDrawable2;
                }
                if (f10 != null && f2 != null) {
                    canvas.translate(f2.floatValue(), f10.floatValue());
                }
                canvas.scale(f11, f11);
                Bitmap bitmap = switchBitmapDrawable3.startBitmap;
                if (bitmap != null) {
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, switchBitmapDrawable3.paint);
                }
            } else {
                float f12 = b / f9;
                if (this.endBitmap != null) {
                    switchBitmapDrawable = this;
                    f = Float.valueOf(switchBitmapDrawable.getTranslationPoint(switchBitmapDrawable.horizontalGravity, switchBitmapDrawable.left, switchBitmapDrawable.right, r13.getWidth(), f12));
                } else {
                    switchBitmapDrawable = this;
                    f = null;
                }
                if (switchBitmapDrawable.endBitmap != null) {
                    f10 = Float.valueOf(switchBitmapDrawable.getTranslationPoint(switchBitmapDrawable.verticalGravity, switchBitmapDrawable.top, switchBitmapDrawable.bottom, r1.getHeight(), f12));
                }
                if (f != null && f10 != null) {
                    canvas.translate(f.floatValue(), f10.floatValue());
                }
                canvas.scale(f12, f12);
                Bitmap bitmap2 = switchBitmapDrawable.endBitmap;
                if (bitmap2 != null) {
                    canvas.drawBitmap(bitmap2, 0.0f, 0.0f, switchBitmapDrawable.paint);
                }
            }
            canvas.restoreToCount(save);
        }

        public final float getBottom() {
            return this.bottom;
        }

        public final float getFontSize() {
            return this.fontSize;
        }

        public final float getLeft() {
            return this.left;
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        public final float getRight() {
            return this.right;
        }

        public final float getTop() {
            return this.top;
        }

        @Override // android.graphics.drawable.Drawable
        public void invalidateSelf() {
            super.invalidateSelf();
            this.view.invalidate();
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int alpha) {
        }

        public final void setBottom(float f) {
            this.bottom = f;
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
            this.paint.setColorFilter(colorFilter);
        }

        public final void setFontSize(float f) {
            this.fontSize = f;
            invalidateSelf();
        }

        public final void setLeft(float f) {
            this.left = f;
        }

        public final void setRight(float f) {
            this.right = f;
        }

        public final void setTop(float f) {
            this.top = f;
        }
    }

    public static void X(TransitionValues transitionValues) {
        View view = transitionValues.b;
        HashMap hashMap = transitionValues.a;
        TextView textView = view instanceof TextView ? (TextView) view : null;
        if (textView == null) {
            return;
        }
        hashMap.put("TextSizeTransition:fontSize", Float.valueOf(textView.getTextSize()));
        hashMap.put("TextSizeTransition:data", new rsy0(textView));
    }

    @Override // androidx.transition.Transition
    public final String[] A() {
        return h0;
    }

    @Override // androidx.transition.Transition
    public final void f(TransitionValues transitionValues) {
        X(transitionValues);
    }

    @Override // androidx.transition.Transition
    public final void i(TransitionValues transitionValues) {
        X(transitionValues);
    }

    @Override // androidx.transition.Transition
    public final Animator o(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null) {
            return null;
        }
        HashMap hashMap = transitionValues.a;
        if (transitionValues2 == null) {
            return null;
        }
        HashMap hashMap2 = transitionValues2.a;
        rsy0 rsy0Var = (rsy0) hashMap.get("TextSizeTransition:data");
        rsy0 rsy0Var2 = (rsy0) hashMap2.get("TextSizeTransition:data");
        if (rsy0Var.g != rsy0Var2.g) {
            return null;
        }
        TextView textView = (TextView) transitionValues2.b;
        float floatValue = ((Float) hashMap.get("TextSizeTransition:fontSize")).floatValue();
        hay.f(textView, rsy0Var, floatValue);
        float measureText = textView.getPaint().measureText(textView.getText().toString());
        Bitmap d = hay.d(textView);
        float f = d == null ? 0.0f : floatValue;
        float floatValue2 = ((Float) hashMap2.get("TextSizeTransition:fontSize")).floatValue();
        hay.f(textView, rsy0Var2, floatValue2);
        float measureText2 = textView.getPaint().measureText(textView.getText().toString());
        Bitmap d2 = hay.d(textView);
        float f2 = d2 == null ? 0.0f : floatValue2;
        if (f == 0.0f && f2 == 0.0f) {
            return null;
        }
        ColorStateList textColors = textView.getTextColors();
        textView.setTextColor(0);
        float f3 = f2;
        SwitchBitmapDrawable switchBitmapDrawable = new SwitchBitmapDrawable(textView, rsy0Var.g, d, f, measureText, d2, f3, measureText2);
        textView.getOverlay().add(switchBitmapDrawable);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(switchBitmapDrawable, PropertyValuesHolder.ofFloat("left", rsy0Var.a, rsy0Var2.a), PropertyValuesHolder.ofFloat("top", rsy0Var.b, rsy0Var2.b), PropertyValuesHolder.ofFloat("right", rsy0Var.e - rsy0Var.c, rsy0Var2.e - rsy0Var2.c), PropertyValuesHolder.ofFloat("bottom", rsy0Var.f - rsy0Var.d, rsy0Var2.f - rsy0Var2.d), PropertyValuesHolder.ofFloat("fontSize", f, f3));
        a(new a(textView, switchBitmapDrawable, textColors, ofPropertyValuesHolder, rsy0Var, rsy0Var2, f3));
        return ofPropertyValuesHolder;
    }
}
