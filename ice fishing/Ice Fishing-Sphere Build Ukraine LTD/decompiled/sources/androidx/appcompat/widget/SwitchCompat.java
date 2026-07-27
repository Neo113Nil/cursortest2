package androidx.appcompat.widget;

import L.C0026b;
import a.AbstractC0069a;
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
import c.AbstractC0097a;
import d.AbstractC0110a;
import e.C0124a;
import h.AbstractC0180y;
import h.C0175t;
import h.g0;
import h.w0;
import java.lang.reflect.Field;
import q.AbstractC0227a;
import w.x;

/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {

    /* renamed from: Q, reason: collision with root package name */
    public static final g0 f1219Q = new g0(Float.class, "thumbPos");

    /* renamed from: R, reason: collision with root package name */
    public static final int[] f1220R = {R.attr.state_checked};

    /* renamed from: A, reason: collision with root package name */
    public final int f1221A;

    /* renamed from: B, reason: collision with root package name */
    public float f1222B;

    /* renamed from: C, reason: collision with root package name */
    public int f1223C;

    /* renamed from: D, reason: collision with root package name */
    public int f1224D;

    /* renamed from: E, reason: collision with root package name */
    public int f1225E;

    /* renamed from: F, reason: collision with root package name */
    public int f1226F;

    /* renamed from: G, reason: collision with root package name */
    public int f1227G;

    /* renamed from: H, reason: collision with root package name */
    public int f1228H;

    /* renamed from: I, reason: collision with root package name */
    public int f1229I;

    /* renamed from: J, reason: collision with root package name */
    public final TextPaint f1230J;

    /* renamed from: K, reason: collision with root package name */
    public final ColorStateList f1231K;

    /* renamed from: L, reason: collision with root package name */
    public StaticLayout f1232L;

    /* renamed from: M, reason: collision with root package name */
    public StaticLayout f1233M;

    /* renamed from: N, reason: collision with root package name */
    public final C0124a f1234N;

    /* renamed from: O, reason: collision with root package name */
    public ObjectAnimator f1235O;

    /* renamed from: P, reason: collision with root package name */
    public final Rect f1236P;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f1237e;

    /* renamed from: f, reason: collision with root package name */
    public ColorStateList f1238f;

    /* renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f1239g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1240h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1241i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f1242j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f1243k;

    /* renamed from: l, reason: collision with root package name */
    public PorterDuff.Mode f1244l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1245m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1246n;

    /* renamed from: o, reason: collision with root package name */
    public int f1247o;

    /* renamed from: p, reason: collision with root package name */
    public int f1248p;

    /* renamed from: q, reason: collision with root package name */
    public int f1249q;
    public boolean r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f1250s;

    /* renamed from: t, reason: collision with root package name */
    public CharSequence f1251t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1252u;

    /* renamed from: v, reason: collision with root package name */
    public int f1253v;

    /* renamed from: w, reason: collision with root package name */
    public final int f1254w;

    /* renamed from: x, reason: collision with root package name */
    public float f1255x;

    /* renamed from: y, reason: collision with root package name */
    public float f1256y;

    /* renamed from: z, reason: collision with root package name */
    public final VelocityTracker f1257z;

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00fe, code lost:
    
        if (r9 != null) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SwitchCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.icecatchbiger.hookfrostmaster.R.attr.switchStyle);
        ColorStateList colorStateList;
        int resourceId;
        this.f1238f = null;
        this.f1239g = null;
        this.f1240h = false;
        this.f1241i = false;
        this.f1243k = null;
        this.f1244l = null;
        this.f1245m = false;
        this.f1246n = false;
        this.f1257z = VelocityTracker.obtain();
        this.f1236P = new Rect();
        TextPaint textPaint = new TextPaint(1);
        this.f1230J = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        C0026b E2 = C0026b.E(context, attributeSet, AbstractC0097a.r, com.icecatchbiger.hookfrostmaster.R.attr.switchStyle);
        Drawable x2 = E2.x(2);
        this.f1237e = x2;
        if (x2 != null) {
            x2.setCallback(this);
        }
        Drawable x3 = E2.x(11);
        this.f1242j = x3;
        if (x3 != null) {
            x3.setCallback(this);
        }
        TypedArray typedArray = (TypedArray) E2.f524f;
        this.f1250s = typedArray.getText(0);
        this.f1251t = typedArray.getText(1);
        this.f1252u = typedArray.getBoolean(3, true);
        this.f1247o = typedArray.getDimensionPixelSize(8, 0);
        this.f1248p = typedArray.getDimensionPixelSize(5, 0);
        this.f1249q = typedArray.getDimensionPixelSize(6, 0);
        this.r = typedArray.getBoolean(4, false);
        ColorStateList w2 = E2.w(9);
        if (w2 != null) {
            this.f1238f = w2;
            this.f1240h = true;
        }
        PorterDuff.Mode c2 = AbstractC0180y.c(typedArray.getInt(10, -1), null);
        if (this.f1239g != c2) {
            this.f1239g = c2;
            this.f1241i = true;
        }
        if (this.f1240h || this.f1241i) {
            a();
        }
        ColorStateList w3 = E2.w(12);
        if (w3 != null) {
            this.f1243k = w3;
            this.f1245m = true;
        }
        PorterDuff.Mode c3 = AbstractC0180y.c(typedArray.getInt(13, -1), null);
        if (this.f1244l != c3) {
            this.f1244l = c3;
            this.f1246n = true;
        }
        if (this.f1245m || this.f1246n) {
            b();
        }
        int resourceId2 = typedArray.getResourceId(7, 0);
        if (resourceId2 != 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId2, AbstractC0097a.f1654s);
            if (obtainStyledAttributes.hasValue(3) && (resourceId = obtainStyledAttributes.getResourceId(3, 0)) != 0) {
                Object obj = AbstractC0110a.f1780a;
                colorStateList = context.getColorStateList(resourceId);
            }
            colorStateList = obtainStyledAttributes.getColorStateList(3);
            if (colorStateList != null) {
                this.f1231K = colorStateList;
            } else {
                this.f1231K = getTextColors();
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
                C0124a c0124a = new C0124a();
                c0124a.f1843a = context2.getResources().getConfiguration().locale;
                this.f1234N = c0124a;
            } else {
                this.f1234N = null;
            }
            obtainStyledAttributes.recycle();
        }
        new C0175t(this).d(attributeSet, com.icecatchbiger.hookfrostmaster.R.attr.switchStyle);
        E2.H();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1254w = viewConfiguration.getScaledTouchSlop();
        this.f1221A = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }

    private boolean getTargetCheckedState() {
        return this.f1222B > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((w0.a(this) ? 1.0f - this.f1222B : this.f1222B) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f1242j;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f1236P;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f1237e;
        Rect b2 = drawable2 != null ? AbstractC0180y.b(drawable2) : AbstractC0180y.f2319a;
        return ((((this.f1223C - this.f1225E) - rect.left) - rect.right) - b2.left) - b2.right;
    }

    public final void a() {
        Drawable drawable = this.f1237e;
        if (drawable != null) {
            if (this.f1240h || this.f1241i) {
                Drawable mutate = drawable.mutate();
                this.f1237e = mutate;
                if (this.f1240h) {
                    AbstractC0227a.h(mutate, this.f1238f);
                }
                if (this.f1241i) {
                    AbstractC0227a.i(this.f1237e, this.f1239g);
                }
                if (this.f1237e.isStateful()) {
                    this.f1237e.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        Drawable drawable = this.f1242j;
        if (drawable != null) {
            if (this.f1245m || this.f1246n) {
                Drawable mutate = drawable.mutate();
                this.f1242j = mutate;
                if (this.f1245m) {
                    AbstractC0227a.h(mutate, this.f1243k);
                }
                if (this.f1246n) {
                    AbstractC0227a.i(this.f1242j, this.f1244l);
                }
                if (this.f1242j.isStateful()) {
                    this.f1242j.setState(getDrawableState());
                }
            }
        }
    }

    public final StaticLayout c(CharSequence charSequence) {
        C0124a c0124a = this.f1234N;
        if (c0124a != null) {
            charSequence = c0124a.getTransformation(charSequence, this);
        }
        CharSequence charSequence2 = charSequence;
        return new StaticLayout(charSequence2, this.f1230J, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, r2)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i2;
        int i3;
        int i4 = this.f1226F;
        int i5 = this.f1227G;
        int i6 = this.f1228H;
        int i7 = this.f1229I;
        int thumbOffset = getThumbOffset() + i4;
        Drawable drawable = this.f1237e;
        Rect b2 = drawable != null ? AbstractC0180y.b(drawable) : AbstractC0180y.f2319a;
        Drawable drawable2 = this.f1242j;
        Rect rect = this.f1236P;
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
                    this.f1242j.setBounds(i4, i2, i6, i3);
                }
            } else {
                i2 = i5;
            }
            i3 = i7;
            this.f1242j.setBounds(i4, i2, i6, i3);
        }
        Drawable drawable3 = this.f1237e;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i16 = thumbOffset - rect.left;
            int i17 = thumbOffset + this.f1225E + rect.right;
            this.f1237e.setBounds(i16, i5, i17, i7);
            Drawable background = getBackground();
            if (background != null) {
                AbstractC0227a.f(background, i16, i5, i17, i7);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f2, float f3) {
        super.drawableHotspotChanged(f2, f3);
        Drawable drawable = this.f1237e;
        if (drawable != null) {
            AbstractC0227a.e(drawable, f2, f3);
        }
        Drawable drawable2 = this.f1242j;
        if (drawable2 != null) {
            AbstractC0227a.e(drawable2, f2, f3);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1237e;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f1242j;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!w0.a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f1223C;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f1249q : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (w0.a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f1223C;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f1249q : compoundPaddingRight;
    }

    public boolean getShowText() {
        return this.f1252u;
    }

    public boolean getSplitTrack() {
        return this.r;
    }

    public int getSwitchMinWidth() {
        return this.f1248p;
    }

    public int getSwitchPadding() {
        return this.f1249q;
    }

    public CharSequence getTextOff() {
        return this.f1251t;
    }

    public CharSequence getTextOn() {
        return this.f1250s;
    }

    public Drawable getThumbDrawable() {
        return this.f1237e;
    }

    public int getThumbTextPadding() {
        return this.f1247o;
    }

    public ColorStateList getThumbTintList() {
        return this.f1238f;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f1239g;
    }

    public Drawable getTrackDrawable() {
        return this.f1242j;
    }

    public ColorStateList getTrackTintList() {
        return this.f1243k;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f1244l;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1237e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1242j;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f1235O;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f1235O.end();
        this.f1235O = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f1220R);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.f1242j;
        Rect rect = this.f1236P;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i2 = this.f1227G;
        int i3 = this.f1229I;
        int i4 = i2 + rect.top;
        int i5 = i3 - rect.bottom;
        Drawable drawable2 = this.f1237e;
        if (drawable != null) {
            if (!this.r || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect b2 = AbstractC0180y.b(drawable2);
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
        StaticLayout staticLayout = getTargetCheckedState() ? this.f1232L : this.f1233M;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f1231K;
            TextPaint textPaint = this.f1230J;
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
        CharSequence charSequence = isChecked() ? this.f1250s : this.f1251t;
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
        if (this.f1237e != null) {
            Drawable drawable = this.f1242j;
            Rect rect = this.f1236P;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect b2 = AbstractC0180y.b(this.f1237e);
            i6 = Math.max(0, b2.left - rect.left);
            i10 = Math.max(0, b2.right - rect.right);
        } else {
            i6 = 0;
        }
        if (w0.a(this)) {
            i7 = getPaddingLeft() + i6;
            width = ((this.f1223C + i7) - i6) - i10;
        } else {
            width = (getWidth() - getPaddingRight()) - i10;
            i7 = (width - this.f1223C) + i6 + i10;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i11 = this.f1224D;
            int i12 = height - (i11 / 2);
            i8 = i11 + i12;
            i9 = i12;
        } else if (gravity != 80) {
            i9 = getPaddingTop();
            i8 = this.f1224D + i9;
        } else {
            i8 = getHeight() - getPaddingBottom();
            i9 = i8 - this.f1224D;
        }
        this.f1226F = i7;
        this.f1227G = i9;
        this.f1229I = i8;
        this.f1228H = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        if (this.f1252u) {
            if (this.f1232L == null) {
                this.f1232L = c(this.f1250s);
            }
            if (this.f1233M == null) {
                this.f1233M = c(this.f1251t);
            }
        }
        Drawable drawable = this.f1237e;
        int i7 = 0;
        Rect rect = this.f1236P;
        if (drawable != null) {
            drawable.getPadding(rect);
            i4 = (this.f1237e.getIntrinsicWidth() - rect.left) - rect.right;
            i5 = this.f1237e.getIntrinsicHeight();
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (this.f1252u) {
            i6 = (this.f1247o * 2) + Math.max(this.f1232L.getWidth(), this.f1233M.getWidth());
        } else {
            i6 = 0;
        }
        this.f1225E = Math.max(i6, i4);
        Drawable drawable2 = this.f1242j;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i7 = this.f1242j.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i8 = rect.left;
        int i9 = rect.right;
        Drawable drawable3 = this.f1237e;
        if (drawable3 != null) {
            Rect b2 = AbstractC0180y.b(drawable3);
            i8 = Math.max(i8, b2.left);
            i9 = Math.max(i9, b2.right);
        }
        int max = Math.max(this.f1248p, (this.f1225E * 2) + i8 + i9);
        int max2 = Math.max(i7, i5);
        this.f1223C = max;
        this.f1224D = max2;
        super.onMeasure(i2, i3);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f1250s : this.f1251t;
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
        VelocityTracker velocityTracker = this.f1257z;
        velocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int i2 = this.f1254w;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i3 = this.f1253v;
                    if (i3 == 1) {
                        float x2 = motionEvent.getX();
                        float y2 = motionEvent.getY();
                        float f2 = i2;
                        if (Math.abs(x2 - this.f1255x) > f2 || Math.abs(y2 - this.f1256y) > f2) {
                            this.f1253v = 2;
                            getParent().requestDisallowInterceptTouchEvent(true);
                            this.f1255x = x2;
                            this.f1256y = y2;
                            return true;
                        }
                    } else if (i3 == 2) {
                        float x3 = motionEvent.getX();
                        int thumbScrollRange = getThumbScrollRange();
                        float f3 = x3 - this.f1255x;
                        float f4 = thumbScrollRange != 0 ? f3 / thumbScrollRange : f3 > 0.0f ? 1.0f : -1.0f;
                        if (w0.a(this)) {
                            f4 = -f4;
                        }
                        float f5 = this.f1222B;
                        float f6 = f4 + f5;
                        float f7 = f6 >= 0.0f ? f6 > 1.0f ? 1.0f : f6 : 0.0f;
                        if (f7 != f5) {
                            this.f1255x = x3;
                            setThumbPosition(f7);
                        }
                        return true;
                    }
                }
            }
            if (this.f1253v == 2) {
                this.f1253v = 0;
                boolean z3 = motionEvent.getAction() == 1 && isEnabled();
                boolean isChecked = isChecked();
                if (z3) {
                    velocityTracker.computeCurrentVelocity(1000);
                    float xVelocity = velocityTracker.getXVelocity();
                    z2 = Math.abs(xVelocity) > ((float) this.f1221A) ? !w0.a(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f : getTargetCheckedState();
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
            this.f1253v = 0;
            velocityTracker.clear();
        } else {
            float x4 = motionEvent.getX();
            float y3 = motionEvent.getY();
            if (isEnabled() && this.f1237e != null) {
                int thumbOffset = getThumbOffset();
                Drawable drawable = this.f1237e;
                Rect rect = this.f1236P;
                drawable.getPadding(rect);
                int i4 = this.f1227G - i2;
                int i5 = (this.f1226F + thumbOffset) - i2;
                int i6 = this.f1225E + i5 + rect.left + rect.right + i2;
                int i7 = this.f1229I + i2;
                if (x4 > i5 && x4 < i6 && y3 > i4 && y3 < i7) {
                    this.f1253v = 1;
                    this.f1255x = x4;
                    this.f1256y = y3;
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
            Field field = x.f3074a;
            if (isLaidOut()) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f1219Q, isChecked ? 1.0f : 0.0f);
                this.f1235O = ofFloat;
                ofFloat.setDuration(250L);
                this.f1235O.setAutoCancel(true);
                this.f1235O.start();
                return;
            }
        }
        ObjectAnimator objectAnimator = this.f1235O;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        setThumbPosition(isChecked ? 1.0f : 0.0f);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0069a.N(callback, this));
    }

    public void setShowText(boolean z2) {
        if (this.f1252u != z2) {
            this.f1252u = z2;
            requestLayout();
        }
    }

    public void setSplitTrack(boolean z2) {
        this.r = z2;
        invalidate();
    }

    public void setSwitchMinWidth(int i2) {
        this.f1248p = i2;
        requestLayout();
    }

    public void setSwitchPadding(int i2) {
        this.f1249q = i2;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.f1230J;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        this.f1251t = charSequence;
        requestLayout();
    }

    public void setTextOn(CharSequence charSequence) {
        this.f1250s = charSequence;
        requestLayout();
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1237e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1237e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f2) {
        this.f1222B = f2;
        invalidate();
    }

    public void setThumbResource(int i2) {
        setThumbDrawable(AbstractC0110a.a(getContext(), i2));
    }

    public void setThumbTextPadding(int i2) {
        this.f1247o = i2;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f1238f = colorStateList;
        this.f1240h = true;
        a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f1239g = mode;
        this.f1241i = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1242j;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1242j = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i2) {
        setTrackDrawable(AbstractC0110a.a(getContext(), i2));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f1243k = colorStateList;
        this.f1245m = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f1244l = mode;
        this.f1246n = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1237e || drawable == this.f1242j;
    }
}
