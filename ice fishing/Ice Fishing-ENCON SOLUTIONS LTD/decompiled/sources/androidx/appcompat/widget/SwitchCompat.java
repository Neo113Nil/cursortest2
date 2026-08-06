package androidx.appcompat.widget;

import R1.l;
import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import c.AbstractC0131a;
import d.AbstractC0142a;
import e.C0145a;
import h.AbstractC0227x;
import h.C0222s;
import h.e0;
import h.t0;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.lang.reflect.Field;
import s.AbstractC1044a;
import y.x;

/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {

    /* renamed from: R, reason: collision with root package name */
    public static final e0 f2171R = new e0(Float.class, "thumbPos");

    /* renamed from: S, reason: collision with root package name */
    public static final int[] f2172S = {R.attr.state_checked};

    /* renamed from: A, reason: collision with root package name */
    public int f2173A;

    /* renamed from: B, reason: collision with root package name */
    public int f2174B;

    /* renamed from: C, reason: collision with root package name */
    public int f2175C;

    /* renamed from: D, reason: collision with root package name */
    public int f2176D;

    /* renamed from: E, reason: collision with root package name */
    public int f2177E;

    /* renamed from: F, reason: collision with root package name */
    public final TextPaint f2178F;
    public final ColorStateList G;

    /* renamed from: H, reason: collision with root package name */
    public StaticLayout f2179H;

    /* renamed from: I, reason: collision with root package name */
    public StaticLayout f2180I;

    /* renamed from: J, reason: collision with root package name */
    public final C0145a f2181J;

    /* renamed from: K, reason: collision with root package name */
    public ObjectAnimator f2182K;

    /* renamed from: L, reason: collision with root package name */
    public final Rect f2183L;

    /* renamed from: a, reason: collision with root package name */
    public Drawable f2184a;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f2185b;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f2186c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2187d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2188e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f2189f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f2190g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f2191h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2192i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2193j;

    /* renamed from: k, reason: collision with root package name */
    public int f2194k;

    /* renamed from: l, reason: collision with root package name */
    public int f2195l;

    /* renamed from: m, reason: collision with root package name */
    public int f2196m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2197n;

    /* renamed from: o, reason: collision with root package name */
    public CharSequence f2198o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f2199p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2200q;

    /* renamed from: r, reason: collision with root package name */
    public int f2201r;

    /* renamed from: s, reason: collision with root package name */
    public final int f2202s;
    public float t;

    /* renamed from: u, reason: collision with root package name */
    public float f2203u;

    /* renamed from: v, reason: collision with root package name */
    public final VelocityTracker f2204v;

    /* renamed from: w, reason: collision with root package name */
    public final int f2205w;

    /* renamed from: x, reason: collision with root package name */
    public float f2206x;

    /* renamed from: y, reason: collision with root package name */
    public int f2207y;

    /* renamed from: z, reason: collision with root package name */
    public int f2208z;

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00fe, code lost:
    
        if (r9 != null) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SwitchCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.watchfacestudio.spraktum.R.attr.switchStyle);
        ColorStateList colorStateList;
        int resourceId;
        this.f2185b = null;
        this.f2186c = null;
        this.f2187d = false;
        this.f2188e = false;
        this.f2190g = null;
        this.f2191h = null;
        this.f2192i = false;
        this.f2193j = false;
        this.f2204v = VelocityTracker.obtain();
        this.f2183L = new Rect();
        TextPaint textPaint = new TextPaint(1);
        this.f2178F = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        I0.b H2 = I0.b.H(context, attributeSet, AbstractC0131a.f2635r, com.watchfacestudio.spraktum.R.attr.switchStyle);
        Drawable A2 = H2.A(2);
        this.f2184a = A2;
        if (A2 != null) {
            A2.setCallback(this);
        }
        Drawable A3 = H2.A(11);
        this.f2189f = A3;
        if (A3 != null) {
            A3.setCallback(this);
        }
        TypedArray typedArray = (TypedArray) H2.f722c;
        this.f2198o = typedArray.getText(0);
        this.f2199p = typedArray.getText(1);
        this.f2200q = typedArray.getBoolean(3, true);
        this.f2194k = typedArray.getDimensionPixelSize(8, 0);
        this.f2195l = typedArray.getDimensionPixelSize(5, 0);
        this.f2196m = typedArray.getDimensionPixelSize(6, 0);
        this.f2197n = typedArray.getBoolean(4, false);
        ColorStateList z2 = H2.z(9);
        if (z2 != null) {
            this.f2185b = z2;
            this.f2187d = true;
        }
        PorterDuff.Mode c2 = AbstractC0227x.c(typedArray.getInt(10, -1), null);
        if (this.f2186c != c2) {
            this.f2186c = c2;
            this.f2188e = true;
        }
        if (this.f2187d || this.f2188e) {
            a();
        }
        ColorStateList z3 = H2.z(12);
        if (z3 != null) {
            this.f2190g = z3;
            this.f2192i = true;
        }
        PorterDuff.Mode c3 = AbstractC0227x.c(typedArray.getInt(13, -1), null);
        if (this.f2191h != c3) {
            this.f2191h = c3;
            this.f2193j = true;
        }
        if (this.f2192i || this.f2193j) {
            b();
        }
        int resourceId2 = typedArray.getResourceId(7, 0);
        if (resourceId2 != 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId2, AbstractC0131a.f2636s);
            if (obtainStyledAttributes.hasValue(3) && (resourceId = obtainStyledAttributes.getResourceId(3, 0)) != 0) {
                Object obj = AbstractC0142a.f2825a;
                colorStateList = context.getColorStateList(resourceId);
            }
            colorStateList = obtainStyledAttributes.getColorStateList(3);
            if (colorStateList != null) {
                this.G = colorStateList;
            } else {
                this.G = getTextColors();
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f2 = dimensionPixelSize;
                if (f2 != textPaint.getTextSize()) {
                    textPaint.setTextSize(f2);
                    requestLayout();
                }
            }
            int i2 = obtainStyledAttributes.getInt(1, -1);
            int i3 = obtainStyledAttributes.getInt(2, -1);
            Typeface typeface = i2 != 1 ? i2 != 2 ? i2 != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            if (i3 > 0) {
                Typeface defaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i3) : Typeface.create(typeface, i3);
                setSwitchTypeface(defaultFromStyle);
                int i4 = (~(defaultFromStyle != null ? defaultFromStyle.getStyle() : 0)) & i3;
                textPaint.setFakeBoldText((i4 & 1) != 0);
                textPaint.setTextSkewX((i4 & 2) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (obtainStyledAttributes.getBoolean(14, false)) {
                Context context2 = getContext();
                C0145a c0145a = new C0145a();
                c0145a.f2831a = context2.getResources().getConfiguration().locale;
                this.f2181J = c0145a;
            } else {
                this.f2181J = null;
            }
            obtainStyledAttributes.recycle();
        }
        new C0222s(this).d(attributeSet, com.watchfacestudio.spraktum.R.attr.switchStyle);
        H2.K();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f2202s = viewConfiguration.getScaledTouchSlop();
        this.f2205w = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }

    private boolean getTargetCheckedState() {
        return this.f2206x > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((t0.a(this) ? 1.0f - this.f2206x : this.f2206x) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f2189f;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f2183L;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f2184a;
        Rect b2 = drawable2 != null ? AbstractC0227x.b(drawable2) : AbstractC0227x.f3368a;
        return ((((this.f2207y - this.f2173A) - rect.left) - rect.right) - b2.left) - b2.right;
    }

    public final void a() {
        Drawable drawable = this.f2184a;
        if (drawable != null) {
            if (this.f2187d || this.f2188e) {
                Drawable mutate = drawable.mutate();
                this.f2184a = mutate;
                if (this.f2187d) {
                    AbstractC1044a.h(mutate, this.f2185b);
                }
                if (this.f2188e) {
                    AbstractC1044a.i(this.f2184a, this.f2186c);
                }
                if (this.f2184a.isStateful()) {
                    this.f2184a.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        Drawable drawable = this.f2189f;
        if (drawable != null) {
            if (this.f2192i || this.f2193j) {
                Drawable mutate = drawable.mutate();
                this.f2189f = mutate;
                if (this.f2192i) {
                    AbstractC1044a.h(mutate, this.f2190g);
                }
                if (this.f2193j) {
                    AbstractC1044a.i(this.f2189f, this.f2191h);
                }
                if (this.f2189f.isStateful()) {
                    this.f2189f.setState(getDrawableState());
                }
            }
        }
    }

    public final StaticLayout c(CharSequence charSequence) {
        C0145a c0145a = this.f2181J;
        if (c0145a != null) {
            charSequence = c0145a.getTransformation(charSequence, this);
        }
        CharSequence charSequence2 = charSequence;
        return new StaticLayout(charSequence2, this.f2178F, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, r2)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i2;
        int i3;
        int i4 = this.f2174B;
        int i5 = this.f2175C;
        int i6 = this.f2176D;
        int i7 = this.f2177E;
        int thumbOffset = getThumbOffset() + i4;
        Drawable drawable = this.f2184a;
        Rect b2 = drawable != null ? AbstractC0227x.b(drawable) : AbstractC0227x.f3368a;
        Drawable drawable2 = this.f2189f;
        Rect rect = this.f2183L;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i8 = rect.left;
            thumbOffset += i8;
            if (b2 != null) {
                int i9 = b2.left;
                if (i9 > i8) {
                    i4 += i9 - i8;
                }
                int i10 = b2.top;
                int i11 = rect.top;
                i2 = i10 > i11 ? (i10 - i11) + i5 : i5;
                int i12 = b2.right;
                int i13 = rect.right;
                if (i12 > i13) {
                    i6 -= i12 - i13;
                }
                int i14 = b2.bottom;
                int i15 = rect.bottom;
                if (i14 > i15) {
                    i3 = i7 - (i14 - i15);
                    this.f2189f.setBounds(i4, i2, i6, i3);
                }
            } else {
                i2 = i5;
            }
            i3 = i7;
            this.f2189f.setBounds(i4, i2, i6, i3);
        }
        Drawable drawable3 = this.f2184a;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i16 = thumbOffset - rect.left;
            int i17 = thumbOffset + this.f2173A + rect.right;
            this.f2184a.setBounds(i16, i5, i17, i7);
            Drawable background = getBackground();
            if (background != null) {
                AbstractC1044a.f(background, i16, i5, i17, i7);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f2, float f3) {
        super.drawableHotspotChanged(f2, f3);
        Drawable drawable = this.f2184a;
        if (drawable != null) {
            AbstractC1044a.e(drawable, f2, f3);
        }
        Drawable drawable2 = this.f2189f;
        if (drawable2 != null) {
            AbstractC1044a.e(drawable2, f2, f3);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f2184a;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f2189f;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!t0.a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f2207y;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f2196m : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (t0.a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f2207y;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f2196m : compoundPaddingRight;
    }

    public boolean getShowText() {
        return this.f2200q;
    }

    public boolean getSplitTrack() {
        return this.f2197n;
    }

    public int getSwitchMinWidth() {
        return this.f2195l;
    }

    public int getSwitchPadding() {
        return this.f2196m;
    }

    public CharSequence getTextOff() {
        return this.f2199p;
    }

    public CharSequence getTextOn() {
        return this.f2198o;
    }

    public Drawable getThumbDrawable() {
        return this.f2184a;
    }

    public int getThumbTextPadding() {
        return this.f2194k;
    }

    public ColorStateList getThumbTintList() {
        return this.f2185b;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f2186c;
    }

    public Drawable getTrackDrawable() {
        return this.f2189f;
    }

    public ColorStateList getTrackTintList() {
        return this.f2190g;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f2191h;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f2184a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f2189f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f2182K;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f2182K.end();
        this.f2182K = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f2172S);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.f2189f;
        Rect rect = this.f2183L;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i2 = this.f2175C;
        int i3 = this.f2177E;
        int i4 = i2 + rect.top;
        int i5 = i3 - rect.bottom;
        Drawable drawable2 = this.f2184a;
        if (drawable != null) {
            if (!this.f2197n || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect b2 = AbstractC0227x.b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += b2.left;
                rect.right -= b2.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        StaticLayout staticLayout = getTargetCheckedState() ? this.f2179H : this.f2180I;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.G;
            TextPaint textPaint = this.f2178F;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i4 + i5) / 2) - (staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        CharSequence charSequence = isChecked() ? this.f2198o : this.f2199p;
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        CharSequence text = accessibilityNodeInfo.getText();
        if (TextUtils.isEmpty(text)) {
            accessibilityNodeInfo.setText(charSequence);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(text);
        sb.append(' ');
        sb.append(charSequence);
        accessibilityNodeInfo.setText(sb);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6;
        int width;
        int i7;
        int i8;
        int i9;
        super.onLayout(z2, i2, i3, i4, i5);
        int i10 = 0;
        if (this.f2184a != null) {
            Drawable drawable = this.f2189f;
            Rect rect = this.f2183L;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect b2 = AbstractC0227x.b(this.f2184a);
            i6 = Math.max(0, b2.left - rect.left);
            i10 = Math.max(0, b2.right - rect.right);
        } else {
            i6 = 0;
        }
        if (t0.a(this)) {
            i7 = getPaddingLeft() + i6;
            width = ((this.f2207y + i7) - i6) - i10;
        } else {
            width = (getWidth() - getPaddingRight()) - i10;
            i7 = (width - this.f2207y) + i6 + i10;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i11 = this.f2208z;
            int i12 = height - (i11 / 2);
            i8 = i11 + i12;
            i9 = i12;
        } else if (gravity != 80) {
            i9 = getPaddingTop();
            i8 = this.f2208z + i9;
        } else {
            i8 = getHeight() - getPaddingBottom();
            i9 = i8 - this.f2208z;
        }
        this.f2174B = i7;
        this.f2175C = i9;
        this.f2177E = i8;
        this.f2176D = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        if (this.f2200q) {
            if (this.f2179H == null) {
                this.f2179H = c(this.f2198o);
            }
            if (this.f2180I == null) {
                this.f2180I = c(this.f2199p);
            }
        }
        Drawable drawable = this.f2184a;
        int i7 = 0;
        Rect rect = this.f2183L;
        if (drawable != null) {
            drawable.getPadding(rect);
            i4 = (this.f2184a.getIntrinsicWidth() - rect.left) - rect.right;
            i5 = this.f2184a.getIntrinsicHeight();
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (this.f2200q) {
            i6 = (this.f2194k * 2) + Math.max(this.f2179H.getWidth(), this.f2180I.getWidth());
        } else {
            i6 = 0;
        }
        this.f2173A = Math.max(i6, i4);
        Drawable drawable2 = this.f2189f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i7 = this.f2189f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i8 = rect.left;
        int i9 = rect.right;
        Drawable drawable3 = this.f2184a;
        if (drawable3 != null) {
            Rect b2 = AbstractC0227x.b(drawable3);
            i8 = Math.max(i8, b2.left);
            i9 = Math.max(i9, b2.right);
        }
        int max = Math.max(this.f2195l, (this.f2173A * 2) + i8 + i9);
        int max2 = Math.max(i7, i5);
        this.f2207y = max;
        this.f2208z = max2;
        super.onMeasure(i2, i3);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f2198o : this.f2199p;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (r1 != 3) goto L82;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        VelocityTracker velocityTracker = this.f2204v;
        velocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int i2 = this.f2202s;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i3 = this.f2201r;
                    if (i3 == 1) {
                        float x2 = motionEvent.getX();
                        float y2 = motionEvent.getY();
                        float f2 = i2;
                        if (Math.abs(x2 - this.t) > f2 || Math.abs(y2 - this.f2203u) > f2) {
                            this.f2201r = 2;
                            getParent().requestDisallowInterceptTouchEvent(true);
                            this.t = x2;
                            this.f2203u = y2;
                            return true;
                        }
                    } else if (i3 == 2) {
                        float x3 = motionEvent.getX();
                        int thumbScrollRange = getThumbScrollRange();
                        float f3 = x3 - this.t;
                        float f4 = thumbScrollRange != 0 ? f3 / thumbScrollRange : f3 > 0.0f ? 1.0f : -1.0f;
                        if (t0.a(this)) {
                            f4 = -f4;
                        }
                        float f5 = this.f2206x;
                        float f6 = f4 + f5;
                        float f7 = f6 >= 0.0f ? f6 > 1.0f ? 1.0f : f6 : 0.0f;
                        if (f7 != f5) {
                            this.t = x3;
                            setThumbPosition(f7);
                        }
                        return true;
                    }
                }
            }
            if (this.f2201r == 2) {
                this.f2201r = 0;
                boolean z3 = motionEvent.getAction() == 1 && isEnabled();
                boolean isChecked = isChecked();
                if (z3) {
                    velocityTracker.computeCurrentVelocity(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT);
                    float xVelocity = velocityTracker.getXVelocity();
                    z2 = Math.abs(xVelocity) > ((float) this.f2205w) ? !t0.a(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f : getTargetCheckedState();
                } else {
                    z2 = isChecked;
                }
                if (z2 != isChecked) {
                    playSoundEffect(0);
                }
                setChecked(z2);
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setAction(3);
                super.onTouchEvent(obtain);
                obtain.recycle();
                super.onTouchEvent(motionEvent);
                return true;
            }
            this.f2201r = 0;
            velocityTracker.clear();
        } else {
            float x4 = motionEvent.getX();
            float y3 = motionEvent.getY();
            if (isEnabled() && this.f2184a != null) {
                int thumbOffset = getThumbOffset();
                Drawable drawable = this.f2184a;
                Rect rect = this.f2183L;
                drawable.getPadding(rect);
                int i4 = this.f2175C - i2;
                int i5 = (this.f2174B + thumbOffset) - i2;
                int i6 = this.f2173A + i5 + rect.left + rect.right + i2;
                int i7 = this.f2177E + i2;
                if (x4 > i5 && x4 < i6 && y3 > i4 && y3 < i7) {
                    this.f2201r = 1;
                    this.t = x4;
                    this.f2203u = y3;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) {
        super.setChecked(z2);
        boolean isChecked = isChecked();
        if (getWindowToken() != null) {
            Field field = x.f8596a;
            if (isLaidOut()) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f2171R, isChecked ? 1.0f : 0.0f);
                this.f2182K = ofFloat;
                ofFloat.setDuration(250L);
                this.f2182K.setAutoCancel(true);
                this.f2182K.start();
                return;
            }
        }
        ObjectAnimator objectAnimator = this.f2182K;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        setThumbPosition(isChecked ? 1.0f : 0.0f);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(l.I(callback, this));
    }

    public void setShowText(boolean z2) {
        if (this.f2200q != z2) {
            this.f2200q = z2;
            requestLayout();
        }
    }

    public void setSplitTrack(boolean z2) {
        this.f2197n = z2;
        invalidate();
    }

    public void setSwitchMinWidth(int i2) {
        this.f2195l = i2;
        requestLayout();
    }

    public void setSwitchPadding(int i2) {
        this.f2196m = i2;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.f2178F;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        this.f2199p = charSequence;
        requestLayout();
    }

    public void setTextOn(CharSequence charSequence) {
        this.f2198o = charSequence;
        requestLayout();
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f2184a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f2184a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f2) {
        this.f2206x = f2;
        invalidate();
    }

    public void setThumbResource(int i2) {
        setThumbDrawable(AbstractC0142a.a(getContext(), i2));
    }

    public void setThumbTextPadding(int i2) {
        this.f2194k = i2;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f2185b = colorStateList;
        this.f2187d = true;
        a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f2186c = mode;
        this.f2188e = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f2189f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f2189f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i2) {
        setTrackDrawable(AbstractC0142a.a(getContext(), i2));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f2190g = colorStateList;
        this.f2192i = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f2191h = mode;
        this.f2193j = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f2184a || drawable == this.f2189f;
    }
}
