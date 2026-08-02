package com.yandex.plus.plaquesdk.design;

import android.R;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.Switch;
import androidx.annotation.NonNull;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u;
import defpackage.hr2;
import defpackage.k5c;
import defpackage.le;
import java.util.Arrays;

/* loaded from: classes5.dex */
public class e extends View implements Checkable {
    public static final int[] u = {R.attr.state_checked};
    public final hr2 a;
    public final le b;
    public final ArgbEvaluator c;
    public final k5c d;
    public ValueAnimator e;
    public Paint f;
    public Paint g;
    public ColorStateList h;
    public final float i;
    public final int j;
    public final ColorStateList k;
    public boolean l;
    public float m;
    public int n;
    public int o;
    public int p;
    public int q;
    public boolean r;
    public boolean s;
    public final b t;

    public e(@NonNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new hr2(27, this);
        this.b = new le(16, this);
        this.c = new ArgbEvaluator();
        final int i2 = 1;
        this.d = new k5c(1);
        this.n = -65281;
        this.o = -65281;
        this.r = true;
        this.s = true;
        b bVar = new b();
        final int i3 = 0;
        bVar.a = false;
        this.t = bVar;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, com.yandex.plus.plaquesdk.c.b, i, 0);
        final int i4 = 3;
        final int i5 = 2;
        if (attributeSet != null) {
            u.B(attributeSet, obtainStyledAttributes, "component_switch_unchecked_color", 2, ru.yandex.music.R.attr.plaque_sdk_controlMinor, new com.yandex.plus.plaquesdk.utils.a(this) { // from class: com.yandex.plus.plaquesdk.design.a
                public final /* synthetic */ e b;

                {
                    this.b = this;
                }

                @Override // com.yandex.plus.plaquesdk.utils.a
                public final void a(Integer num) {
                    switch (i3) {
                        case 0:
                            this.b.setUncheckedColorAttr(num.intValue());
                            break;
                        case 1:
                            this.b.setUncheckedTrackColor(num.intValue());
                            break;
                        case 2:
                            this.b.setTrackColorAttr(num.intValue());
                            break;
                        default:
                            this.b.setTrackColor(num.intValue());
                            break;
                    }
                }
            }, new com.yandex.plus.plaquesdk.utils.a(this) { // from class: com.yandex.plus.plaquesdk.design.a
                public final /* synthetic */ e b;

                {
                    this.b = this;
                }

                @Override // com.yandex.plus.plaquesdk.utils.a
                public final void a(Integer num) {
                    switch (i2) {
                        case 0:
                            this.b.setUncheckedColorAttr(num.intValue());
                            break;
                        case 1:
                            this.b.setUncheckedTrackColor(num.intValue());
                            break;
                        case 2:
                            this.b.setTrackColorAttr(num.intValue());
                            break;
                        default:
                            this.b.setTrackColor(num.intValue());
                            break;
                    }
                }
            });
            u.B(attributeSet, obtainStyledAttributes, "component_switch_track_color", 1, ru.yandex.music.R.attr.plaque_sdk_controlMain, new com.yandex.plus.plaquesdk.utils.a(this) { // from class: com.yandex.plus.plaquesdk.design.a
                public final /* synthetic */ e b;

                {
                    this.b = this;
                }

                @Override // com.yandex.plus.plaquesdk.utils.a
                public final void a(Integer num) {
                    switch (i5) {
                        case 0:
                            this.b.setUncheckedColorAttr(num.intValue());
                            break;
                        case 1:
                            this.b.setUncheckedTrackColor(num.intValue());
                            break;
                        case 2:
                            this.b.setTrackColorAttr(num.intValue());
                            break;
                        default:
                            this.b.setTrackColor(num.intValue());
                            break;
                    }
                }
            }, new com.yandex.plus.plaquesdk.utils.a(this) { // from class: com.yandex.plus.plaquesdk.design.a
                public final /* synthetic */ e b;

                {
                    this.b = this;
                }

                @Override // com.yandex.plus.plaquesdk.utils.a
                public final void a(Integer num) {
                    switch (i4) {
                        case 0:
                            this.b.setUncheckedColorAttr(num.intValue());
                            break;
                        case 1:
                            this.b.setUncheckedTrackColor(num.intValue());
                            break;
                        case 2:
                            this.b.setTrackColorAttr(num.intValue());
                            break;
                        default:
                            this.b.setTrackColor(num.intValue());
                            break;
                    }
                }
            });
        } else {
            setUncheckedColorAttr(ru.yandex.music.R.attr.plaque_sdk_controlMinor);
            setTrackColorAttr(ru.yandex.music.R.attr.plaque_sdk_controlMain);
        }
        Context context2 = getContext();
        context2.getClass();
        int color = context2.getColor(ru.yandex.music.R.color.plaque_sdk_component_white);
        this.q = color;
        this.p = color;
        this.h = r1.n(this.o, this.n);
        this.k = r1.n(this.q, this.p);
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        boolean z2 = obtainStyledAttributes.getBoolean(3, true);
        d(z, false);
        setEnabled(z2);
        Context context3 = getContext();
        context3.getClass();
        setBackgroundColor(context3.getColor(ru.yandex.music.R.color.plaque_sdk_transparent));
        obtainStyledAttributes.recycle();
        this.i = getResources().getDimension(ru.yandex.music.R.dimen.plaque_sdk_component_switch_thumb_radius);
        this.j = b(2);
        setLayerType(1, null);
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setThumbProgress(float f) {
        this.m = f;
        f();
        g();
        invalidate();
    }

    public final int b(int i) {
        Context context = getContext();
        context.getClass();
        Resources resources = context.getResources();
        resources.getClass();
        return (int) TypedValue.applyDimension(1, i, resources.getDisplayMetrics());
    }

    public final void c() {
        Paint paint = new Paint();
        this.f = paint;
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.g = paint2;
        paint2.setAntiAlias(true);
        f();
        g();
    }

    public final void d(boolean z, boolean z2) {
        if (z != this.l) {
            this.l = z;
            this.t.a = z;
            float f = z ? 1.0f : 0.0f;
            refreshDrawableState();
            if (z2) {
                if (this.s) {
                    com.yandex.plus.plaquesdk.b.a(getContext());
                }
                ValueAnimator valueAnimator = this.e;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.e = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.m, f);
                this.e = ofFloat;
                ofFloat.setInterpolator(this.d);
                this.e.setDuration(150L);
                this.e.addUpdateListener(this.a);
                this.e.addListener(this.b);
                this.e.start();
            } else {
                ValueAnimator valueAnimator2 = this.e;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    this.e = null;
                }
                setThumbProgress(f);
            }
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] onCreateDrawableState = super.onCreateDrawableState(0);
        int[] copyOf = Arrays.copyOf(onCreateDrawableState, onCreateDrawableState.length + 1);
        View.mergeDrawableStates(copyOf, u);
        this.n = this.h.getColorForState(onCreateDrawableState, -65281);
        this.o = this.h.getColorForState(copyOf, -65281);
        this.p = this.k.getColorForState(onCreateDrawableState, -65281);
        this.q = this.k.getColorForState(copyOf, -65281);
        f();
        g();
        invalidate();
    }

    public final void e(int i, int i2) {
        this.o = i;
        this.n = i2;
        this.h = r1.n(i, i2);
        f();
        invalidate();
    }

    public final void f() {
        if (this.f == null) {
            c();
            return;
        }
        this.f.setColor(((Integer) this.c.evaluate(this.m, Integer.valueOf(this.n), Integer.valueOf(this.o))).intValue());
    }

    public final void g() {
        if (this.g == null) {
            c();
            return;
        }
        this.g.setColor(((Integer) this.c.evaluate(this.m, Integer.valueOf(this.p), Integer.valueOf(this.q))).intValue());
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.l;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setThumbProgress(this.l ? 1.0f : 0.0f);
    }

    @Override // android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.l) {
            View.mergeDrawableStates(onCreateDrawableState, u);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.e = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.f != null) {
            int measuredWidth = getMeasuredWidth();
            float measuredHeight = getMeasuredHeight();
            RectF rectF = new RectF(0.0f, 0.0f, measuredWidth, measuredHeight);
            float f = measuredHeight / 2.0f;
            canvas.drawRoundRect(rectF, f, f, this.f);
        }
        if (this.g == null) {
            return;
        }
        int measuredWidth2 = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        int layoutDirection = getLayoutDirection();
        int i = this.j;
        float f2 = this.i;
        float f3 = layoutDirection == 1 ? (measuredWidth2 - i) - f2 : i + f2;
        float abs = Math.abs(f3 - (getLayoutDirection() == 1 ? i + f2 : (measuredWidth2 - i) - f2));
        boolean z = getLayoutDirection() == 1;
        float f4 = this.m;
        canvas.drawCircle(z ? f3 - (abs * f4) : f3 + (abs * f4), measuredHeight2 / 2.0f, f2, this.g);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setChecked(this.l);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.l);
        accessibilityNodeInfo.setClassName(Switch.class.getName());
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(b(56), 1073741824), View.MeasureSpec.makeMeasureSpec(b(32), 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        d(dVar.a, false);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = AbsSavedState.EMPTY_STATE;
        }
        d dVar = new d(onSaveInstanceState);
        dVar.a = this.l;
        return dVar;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (!isEnabled() || !this.r) {
            return super.performClick();
        }
        if (isEnabled()) {
            d(!this.l, true);
        }
        return super.performClick();
    }

    public void setAutoToggle(boolean z) {
        this.r = false;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        d(z, false);
    }

    public void setCheckedWithAnimation(boolean z) {
        d(z, true);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        setAlpha(z ? 1.0f : 0.5f);
        super.setEnabled(z);
    }

    public void setHapticEnabled(boolean z) {
        this.s = z;
    }

    public void setOnCheckedChangedListener(c cVar) {
        if (cVar == null || isClickable()) {
            return;
        }
        setClickable(true);
    }

    public void setTrackColor(int i) {
        e(com.yandex.plus.bdui.plus.analytics.b.f(i, this), this.n);
    }

    public void setTrackColorAttr(int i) {
        setTag(ru.yandex.music.R.id.plaque_sdk_checked_color_id, Integer.valueOf(i));
        Context context = getContext();
        context.getClass();
        e(com.yandex.plus.bdui.flex.ui.a.n(context, i), this.n);
    }

    public void setUncheckedColorAttr(int i) {
        setTag(ru.yandex.music.R.id.plaque_sdk_unchecked_color_id, Integer.valueOf(i));
        int i2 = this.o;
        Context context = getContext();
        context.getClass();
        e(i2, com.yandex.plus.bdui.flex.ui.a.n(context, i));
    }

    public void setUncheckedTrackColor(int i) {
        e(this.o, com.yandex.plus.bdui.plus.analytics.b.f(i, this));
    }

    public void setVisible(boolean z) {
        setVisibility(z ? 0 : 8);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        d(!this.l, false);
    }

    public e(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ru.yandex.music.R.attr.plaque_sdk_switchComponentStyle);
    }

    public e(@NonNull Context context) {
        this(context, null);
    }
}
