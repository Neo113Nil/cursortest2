package com.google.android.material.chip;

import G0.b;
import G0.c;
import G0.d;
import G0.e;
import G0.f;
import L0.j;
import L0.m;
import M.g;
import O.B;
import O.K;
import S0.k;
import S0.v;
import X0.a;
import a.AbstractC0078a;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;
import m.r;
import u0.AbstractC0358a;
import v0.C0361b;

/* loaded from: classes.dex */
public class Chip extends r implements e, v, Checkable {

    /* renamed from: w, reason: collision with root package name */
    public static final Rect f2448w = new Rect();

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f2449x = {R.attr.state_selected};

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f2450y = {R.attr.state_checkable};
    public f e;

    /* renamed from: f, reason: collision with root package name */
    public InsetDrawable f2451f;

    /* renamed from: g, reason: collision with root package name */
    public RippleDrawable f2452g;

    /* renamed from: h, reason: collision with root package name */
    public View.OnClickListener f2453h;
    public CompoundButton.OnCheckedChangeListener i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2454k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2455l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2456m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2457n;

    /* renamed from: o, reason: collision with root package name */
    public int f2458o;

    /* renamed from: p, reason: collision with root package name */
    public int f2459p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f2460q;

    /* renamed from: r, reason: collision with root package name */
    public final d f2461r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2462s;

    /* renamed from: t, reason: collision with root package name */
    public final Rect f2463t;

    /* renamed from: u, reason: collision with root package name */
    public final RectF f2464u;

    /* renamed from: v, reason: collision with root package name */
    public final b f2465v;

    public Chip(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, com.lumenpath.harispro.hrnavigator.R.attr.chipStyle, com.lumenpath.harispro.hrnavigator.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, com.lumenpath.harispro.hrnavigator.R.attr.chipStyle);
        int resourceId;
        int resourceId2;
        int resourceId3;
        this.f2463t = new Rect();
        this.f2464u = new RectF();
        this.f2465v = new b(0, this);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            }
            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        f fVar = new f(context2, attributeSet);
        int[] iArr = AbstractC0358a.f4443f;
        TypedArray g2 = m.g(fVar.f319e0, attributeSet, iArr, com.lumenpath.harispro.hrnavigator.R.attr.chipStyle, com.lumenpath.harispro.hrnavigator.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        fVar.f294E0 = g2.hasValue(37);
        Context context3 = fVar.f319e0;
        ColorStateList B2 = AbstractC0078a.B(context3, g2, 24);
        if (fVar.f337x != B2) {
            fVar.f337x = B2;
            fVar.onStateChange(fVar.getState());
        }
        ColorStateList B3 = AbstractC0078a.B(context3, g2, 11);
        if (fVar.f339y != B3) {
            fVar.f339y = B3;
            fVar.onStateChange(fVar.getState());
        }
        float dimension = g2.getDimension(19, RecyclerView.f2111C0);
        if (fVar.f341z != dimension) {
            fVar.f341z = dimension;
            fVar.invalidateSelf();
            fVar.z();
        }
        if (g2.hasValue(12)) {
            fVar.F(g2.getDimension(12, RecyclerView.f2111C0));
        }
        fVar.K(AbstractC0078a.B(context3, g2, 22));
        fVar.L(g2.getDimension(23, RecyclerView.f2111C0));
        fVar.U(AbstractC0078a.B(context3, g2, 36));
        String text = g2.getText(5);
        text = text == null ? "" : text;
        boolean equals = TextUtils.equals(fVar.f293E, text);
        j jVar = fVar.f325k0;
        if (!equals) {
            fVar.f293E = text;
            jVar.e = true;
            fVar.invalidateSelf();
            fVar.z();
        }
        P0.d dVar = (!g2.hasValue(0) || (resourceId3 = g2.getResourceId(0, 0)) == 0) ? null : new P0.d(context3, resourceId3);
        dVar.f907k = g2.getDimension(1, dVar.f907k);
        jVar.b(dVar, context3);
        int i = g2.getInt(3, 0);
        if (i == 1) {
            fVar.f288B0 = TextUtils.TruncateAt.START;
        } else if (i == 2) {
            fVar.f288B0 = TextUtils.TruncateAt.MIDDLE;
        } else if (i == 3) {
            fVar.f288B0 = TextUtils.TruncateAt.END;
        }
        fVar.J(g2.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            fVar.J(g2.getBoolean(15, false));
        }
        fVar.G(AbstractC0078a.E(context3, g2, 14));
        if (g2.hasValue(17)) {
            fVar.I(AbstractC0078a.B(context3, g2, 17));
        }
        fVar.H(g2.getDimension(16, -1.0f));
        fVar.R(g2.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            fVar.R(g2.getBoolean(26, false));
        }
        fVar.M(AbstractC0078a.E(context3, g2, 25));
        fVar.Q(AbstractC0078a.B(context3, g2, 30));
        fVar.O(g2.getDimension(28, RecyclerView.f2111C0));
        fVar.B(g2.getBoolean(6, false));
        fVar.E(g2.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            fVar.E(g2.getBoolean(8, false));
        }
        fVar.C(AbstractC0078a.E(context3, g2, 7));
        if (g2.hasValue(9)) {
            fVar.D(AbstractC0078a.B(context3, g2, 9));
        }
        fVar.f309U = (!g2.hasValue(39) || (resourceId2 = g2.getResourceId(39, 0)) == 0) ? null : C0361b.a(context3, resourceId2);
        fVar.f310V = (!g2.hasValue(33) || (resourceId = g2.getResourceId(33, 0)) == 0) ? null : C0361b.a(context3, resourceId);
        float dimension2 = g2.getDimension(21, RecyclerView.f2111C0);
        if (fVar.f311W != dimension2) {
            fVar.f311W = dimension2;
            fVar.invalidateSelf();
            fVar.z();
        }
        fVar.T(g2.getDimension(35, RecyclerView.f2111C0));
        fVar.S(g2.getDimension(34, RecyclerView.f2111C0));
        float dimension3 = g2.getDimension(41, RecyclerView.f2111C0);
        if (fVar.f314Z != dimension3) {
            fVar.f314Z = dimension3;
            fVar.invalidateSelf();
            fVar.z();
        }
        float dimension4 = g2.getDimension(40, RecyclerView.f2111C0);
        if (fVar.f315a0 != dimension4) {
            fVar.f315a0 = dimension4;
            fVar.invalidateSelf();
            fVar.z();
        }
        fVar.P(g2.getDimension(29, RecyclerView.f2111C0));
        fVar.N(g2.getDimension(27, RecyclerView.f2111C0));
        float dimension5 = g2.getDimension(13, RecyclerView.f2111C0);
        if (fVar.f318d0 != dimension5) {
            fVar.f318d0 = dimension5;
            fVar.invalidateSelf();
            fVar.z();
        }
        fVar.f292D0 = g2.getDimensionPixelSize(4, Integer.MAX_VALUE);
        g2.recycle();
        m.a(context2, attributeSet, com.lumenpath.harispro.hrnavigator.R.attr.chipStyle, com.lumenpath.harispro.hrnavigator.R.style.Widget_MaterialComponents_Chip_Action);
        m.b(context2, attributeSet, iArr, com.lumenpath.harispro.hrnavigator.R.attr.chipStyle, com.lumenpath.harispro.hrnavigator.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.lumenpath.harispro.hrnavigator.R.attr.chipStyle, com.lumenpath.harispro.hrnavigator.R.style.Widget_MaterialComponents_Chip_Action);
        this.f2457n = obtainStyledAttributes.getBoolean(32, false);
        this.f2459p = (int) Math.ceil(obtainStyledAttributes.getDimension(20, (float) Math.ceil(TypedValue.applyDimension(1, 48, getContext().getResources().getDisplayMetrics()))));
        obtainStyledAttributes.recycle();
        setChipDrawable(fVar);
        fVar.l(B.e(this));
        m.a(context2, attributeSet, com.lumenpath.harispro.hrnavigator.R.attr.chipStyle, com.lumenpath.harispro.hrnavigator.R.style.Widget_MaterialComponents_Chip_Action);
        m.b(context2, attributeSet, iArr, com.lumenpath.harispro.hrnavigator.R.attr.chipStyle, com.lumenpath.harispro.hrnavigator.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, com.lumenpath.harispro.hrnavigator.R.attr.chipStyle, com.lumenpath.harispro.hrnavigator.R.style.Widget_MaterialComponents_Chip_Action);
        boolean hasValue = obtainStyledAttributes2.hasValue(37);
        obtainStyledAttributes2.recycle();
        this.f2461r = new d(this, this);
        e();
        if (!hasValue) {
            setOutlineProvider(new c(this));
        }
        setChecked(this.j);
        setText(fVar.f293E);
        setEllipsize(fVar.f288B0);
        h();
        if (!this.e.f290C0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        g();
        if (this.f2457n) {
            setMinHeight(this.f2459p);
        }
        this.f2458o = getLayoutDirection();
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: G0.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = Chip.this.i;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z2);
                }
            }
        });
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.f2464u;
        rectF.setEmpty();
        if (c() && this.f2453h != null) {
            f fVar = this.e;
            Rect bounds = fVar.getBounds();
            rectF.setEmpty();
            if (fVar.X()) {
                float f2 = fVar.f318d0 + fVar.f317c0 + fVar.f303O + fVar.f316b0 + fVar.f315a0;
                if (fVar.getLayoutDirection() == 0) {
                    float f3 = bounds.right;
                    rectF.right = f3;
                    rectF.left = f3 - f2;
                } else {
                    float f4 = bounds.left;
                    rectF.left = f4;
                    rectF.right = f4 + f2;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i = (int) closeIconTouchBounds.left;
        int i2 = (int) closeIconTouchBounds.top;
        int i3 = (int) closeIconTouchBounds.right;
        int i4 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.f2463t;
        rect.set(i, i2, i3, i4);
        return rect;
    }

    private P0.d getTextAppearance() {
        f fVar = this.e;
        if (fVar != null) {
            return fVar.f325k0.f516g;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z2) {
        if (this.f2455l != z2) {
            this.f2455l = z2;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z2) {
        if (this.f2454k != z2) {
            this.f2454k = z2;
            refreshDrawableState();
        }
    }

    public final void b(int i) {
        this.f2459p = i;
        if (!this.f2457n) {
            InsetDrawable insetDrawable = this.f2451f;
            if (insetDrawable == null) {
                int[] iArr = Q0.a.f928a;
                f();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f2451f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr2 = Q0.a.f928a;
                    f();
                    return;
                }
                return;
            }
        }
        int max = Math.max(0, i - ((int) this.e.f341z));
        int max2 = Math.max(0, i - this.e.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            InsetDrawable insetDrawable2 = this.f2451f;
            if (insetDrawable2 == null) {
                int[] iArr3 = Q0.a.f928a;
                f();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f2451f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr4 = Q0.a.f928a;
                    f();
                    return;
                }
                return;
            }
        }
        int i2 = max2 > 0 ? max2 / 2 : 0;
        int i3 = max > 0 ? max / 2 : 0;
        if (this.f2451f != null) {
            Rect rect = new Rect();
            this.f2451f.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                int[] iArr5 = Q0.a.f928a;
                f();
                return;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.f2451f = new InsetDrawable((Drawable) this.e, i2, i3, i2, i3);
        int[] iArr6 = Q0.a.f928a;
        f();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0011 A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c() {
        f fVar = this.e;
        if (fVar != null) {
            Object obj = fVar.f300L;
            if (obj != null) {
                if (obj instanceof H.a) {
                }
                if (obj == null) {
                    return true;
                }
            }
            obj = null;
            if (obj == null) {
            }
        }
        return false;
    }

    public final boolean d() {
        f fVar = this.e;
        return fVar != null && fVar.f305Q;
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i;
        if (!this.f2462s) {
            return super.dispatchHoverEvent(motionEvent);
        }
        d dVar = this.f2461r;
        AccessibilityManager accessibilityManager = dVar.f1164h;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                Chip chip = dVar.f282q;
                int i2 = (chip.c() && chip.getCloseIconTouchBounds().contains(x2, y2)) ? 1 : 0;
                int i3 = dVar.f1167m;
                if (i3 != i2) {
                    dVar.f1167m = i2;
                    dVar.q(i2, 128);
                    dVar.q(i3, 256);
                }
                if (i2 != Integer.MIN_VALUE) {
                    return true;
                }
            } else if (action == 10 && (i = dVar.f1167m) != Integer.MIN_VALUE) {
                if (i == Integer.MIN_VALUE) {
                    return true;
                }
                dVar.f1167m = Integer.MIN_VALUE;
                dVar.q(i, 256);
                return true;
            }
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f2462s) {
            return super.dispatchKeyEvent(keyEvent);
        }
        d dVar = this.f2461r;
        dVar.getClass();
        boolean z2 = false;
        int i = 0;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i2 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i2 = 33;
                                } else if (keyCode == 21) {
                                    i2 = 17;
                                } else if (keyCode != 22) {
                                    i2 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z3 = false;
                                while (i < repeatCount && dVar.m(i2, null)) {
                                    i++;
                                    z3 = true;
                                }
                                z2 = z3;
                                break;
                            }
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i3 = dVar.f1166l;
                    if (i3 != Integer.MIN_VALUE) {
                        Chip chip = dVar.f282q;
                        if (i3 == 0) {
                            chip.performClick();
                        } else if (i3 == 1) {
                            chip.playSoundEffect(0);
                            View.OnClickListener onClickListener = chip.f2453h;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                            }
                            if (chip.f2462s) {
                                chip.f2461r.q(1, 1);
                            }
                        }
                    }
                    z2 = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                z2 = dVar.m(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                z2 = dVar.m(1, null);
            }
        }
        if (!z2 || dVar.f1166l == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // m.r, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i;
        super.drawableStateChanged();
        f fVar = this.e;
        boolean z2 = false;
        if (fVar != null && f.y(fVar.f300L)) {
            f fVar2 = this.e;
            ?? isEnabled = isEnabled();
            int i2 = isEnabled;
            if (this.f2456m) {
                i2 = isEnabled + 1;
            }
            int i3 = i2;
            if (this.f2455l) {
                i3 = i2 + 1;
            }
            int i4 = i3;
            if (this.f2454k) {
                i4 = i3 + 1;
            }
            int i5 = i4;
            if (isChecked()) {
                i5 = i4 + 1;
            }
            int[] iArr = new int[i5];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i = 1;
            } else {
                i = 0;
            }
            if (this.f2456m) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.f2455l) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.f2454k) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            if (!Arrays.equals(fVar2.f340y0, iArr)) {
                fVar2.f340y0 = iArr;
                if (fVar2.X()) {
                    z2 = fVar2.A(fVar2.getState(), iArr);
                }
            }
        }
        if (z2) {
            invalidate();
        }
    }

    public final void e() {
        f fVar;
        if (!c() || (fVar = this.e) == null || !fVar.f299K || this.f2453h == null) {
            K.l(this, null);
            this.f2462s = false;
        } else {
            K.l(this, this.f2461r);
            this.f2462s = true;
        }
    }

    public final void f() {
        this.f2452g = new RippleDrawable(Q0.a.b(this.e.f291D), getBackgroundDrawable(), null);
        this.e.getClass();
        RippleDrawable rippleDrawable = this.f2452g;
        WeakHashMap weakHashMap = K.f747a;
        setBackground(rippleDrawable);
        g();
    }

    public final void g() {
        f fVar;
        if (TextUtils.isEmpty(getText()) || (fVar = this.e) == null) {
            return;
        }
        int v2 = (int) (fVar.v() + fVar.f318d0 + fVar.f315a0);
        f fVar2 = this.e;
        int u2 = (int) (fVar2.u() + fVar2.f311W + fVar2.f314Z);
        if (this.f2451f != null) {
            Rect rect = new Rect();
            this.f2451f.getPadding(rect);
            u2 += rect.left;
            v2 += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        WeakHashMap weakHashMap = K.f747a;
        setPaddingRelative(u2, paddingTop, v2, paddingBottom);
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f2460q)) {
            return this.f2460q;
        }
        if (!d()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f2451f;
        return insetDrawable == null ? this.e : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        f fVar = this.e;
        if (fVar != null) {
            return fVar.f307S;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        f fVar = this.e;
        if (fVar != null) {
            return fVar.f308T;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        f fVar = this.e;
        if (fVar != null) {
            return fVar.f339y;
        }
        return null;
    }

    public float getChipCornerRadius() {
        f fVar = this.e;
        return fVar != null ? Math.max(RecyclerView.f2111C0, fVar.w()) : RecyclerView.f2111C0;
    }

    public Drawable getChipDrawable() {
        return this.e;
    }

    public float getChipEndPadding() {
        f fVar = this.e;
        return fVar != null ? fVar.f318d0 : RecyclerView.f2111C0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        Drawable drawable;
        f fVar = this.e;
        if (fVar == null || (drawable = fVar.f296G) == 0) {
            return null;
        }
        boolean z2 = drawable instanceof H.a;
        Drawable drawable2 = drawable;
        if (z2) {
            drawable2 = null;
        }
        return drawable2;
    }

    public float getChipIconSize() {
        f fVar = this.e;
        return fVar != null ? fVar.f298I : RecyclerView.f2111C0;
    }

    public ColorStateList getChipIconTint() {
        f fVar = this.e;
        if (fVar != null) {
            return fVar.f297H;
        }
        return null;
    }

    public float getChipMinHeight() {
        f fVar = this.e;
        return fVar != null ? fVar.f341z : RecyclerView.f2111C0;
    }

    public float getChipStartPadding() {
        f fVar = this.e;
        return fVar != null ? fVar.f311W : RecyclerView.f2111C0;
    }

    public ColorStateList getChipStrokeColor() {
        f fVar = this.e;
        if (fVar != null) {
            return fVar.f287B;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        f fVar = this.e;
        return fVar != null ? fVar.f289C : RecyclerView.f2111C0;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getCloseIcon() {
        Drawable drawable;
        f fVar = this.e;
        if (fVar == null || (drawable = fVar.f300L) == 0) {
            return null;
        }
        boolean z2 = drawable instanceof H.a;
        Drawable drawable2 = drawable;
        if (z2) {
            drawable2 = null;
        }
        return drawable2;
    }

    public CharSequence getCloseIconContentDescription() {
        f fVar = this.e;
        if (fVar != null) {
            return fVar.f304P;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        f fVar = this.e;
        return fVar != null ? fVar.f317c0 : RecyclerView.f2111C0;
    }

    public float getCloseIconSize() {
        f fVar = this.e;
        return fVar != null ? fVar.f303O : RecyclerView.f2111C0;
    }

    public float getCloseIconStartPadding() {
        f fVar = this.e;
        return fVar != null ? fVar.f316b0 : RecyclerView.f2111C0;
    }

    public ColorStateList getCloseIconTint() {
        f fVar = this.e;
        if (fVar != null) {
            return fVar.f302N;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        f fVar = this.e;
        if (fVar != null) {
            return fVar.f288B0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.f2462s) {
            d dVar = this.f2461r;
            if (dVar.f1166l == 1 || dVar.f1165k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public C0361b getHideMotionSpec() {
        f fVar = this.e;
        if (fVar != null) {
            return fVar.f310V;
        }
        return null;
    }

    public float getIconEndPadding() {
        f fVar = this.e;
        return fVar != null ? fVar.f313Y : RecyclerView.f2111C0;
    }

    public float getIconStartPadding() {
        f fVar = this.e;
        return fVar != null ? fVar.f312X : RecyclerView.f2111C0;
    }

    public ColorStateList getRippleColor() {
        f fVar = this.e;
        if (fVar != null) {
            return fVar.f291D;
        }
        return null;
    }

    public k getShapeAppearanceModel() {
        return this.e.f1076a.f1062a;
    }

    public C0361b getShowMotionSpec() {
        f fVar = this.e;
        if (fVar != null) {
            return fVar.f309U;
        }
        return null;
    }

    public float getTextEndPadding() {
        f fVar = this.e;
        return fVar != null ? fVar.f315a0 : RecyclerView.f2111C0;
    }

    public float getTextStartPadding() {
        f fVar = this.e;
        return fVar != null ? fVar.f314Z : RecyclerView.f2111C0;
    }

    public final void h() {
        TextPaint paint = getPaint();
        f fVar = this.e;
        if (fVar != null) {
            paint.drawableState = fVar.getState();
        }
        P0.d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.f2465v);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        R.j.o0(this, this.e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f2449x);
        }
        if (d()) {
            View.mergeDrawableStates(onCreateDrawableState, f2450y);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z2, int i, Rect rect) {
        super.onFocusChanged(z2, i, rect);
        if (this.f2462s) {
            d dVar = this.f2461r;
            int i2 = dVar.f1166l;
            if (i2 != Integer.MIN_VALUE) {
                dVar.j(i2);
            }
            if (z2) {
                dVar.m(i, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(d());
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.f2458o != i) {
            this.f2458o = i;
            g();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (r0 != 3) goto L28;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        boolean contains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.f2454k) {
                        if (!contains) {
                            setCloseIconPressed(false);
                        }
                        z2 = true;
                    }
                }
                z2 = false;
            } else if (this.f2454k) {
                playSoundEffect(0);
                View.OnClickListener onClickListener = this.f2453h;
                if (onClickListener != null) {
                    onClickListener.onClick(this);
                }
                if (this.f2462s) {
                    this.f2461r.q(1, 1);
                }
                z2 = true;
                setCloseIconPressed(false);
            }
            z2 = false;
            setCloseIconPressed(false);
        } else {
            if (contains) {
                setCloseIconPressed(true);
                z2 = true;
            }
            z2 = false;
        }
        return z2 || super.onTouchEvent(motionEvent);
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f2460q = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f2452g) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // m.r, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f2452g) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // m.r, android.view.View
    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z2) {
        f fVar = this.e;
        if (fVar != null) {
            fVar.B(z2);
        }
    }

    public void setCheckableResource(int i) {
        f fVar = this.e;
        if (fVar != null) {
            fVar.B(fVar.f319e0.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) {
        f fVar = this.e;
        if (fVar == null) {
            this.j = z2;
        } else if (fVar.f305Q) {
            super.setChecked(z2);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        f fVar = this.e;
        if (fVar != null) {
            fVar.C(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z2) {
        setCheckedIconVisible(z2);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        f fVar = this.e;
        if (fVar != null) {
            fVar.C(h0.f.n(fVar.f319e0, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        f fVar = this.e;
        if (fVar != null) {
            fVar.D(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        f fVar = this.e;
        if (fVar != null) {
            fVar.D(AbstractC0078a.z(fVar.f319e0, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        f fVar = this.e;
        if (fVar != null) {
            fVar.E(fVar.f319e0.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        f fVar = this.e;
        if (fVar == null || fVar.f339y == colorStateList) {
            return;
        }
        fVar.f339y = colorStateList;
        fVar.onStateChange(fVar.getState());
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList z2;
        f fVar = this.e;
        if (fVar == null || fVar.f339y == (z2 = AbstractC0078a.z(fVar.f319e0, i))) {
            return;
        }
        fVar.f339y = z2;
        fVar.onStateChange(fVar.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f2) {
        f fVar = this.e;
        if (fVar != null) {
            fVar.F(f2);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        f fVar = this.e;
        if (fVar != null) {
            fVar.F(fVar.f319e0.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(f fVar) {
        f fVar2 = this.e;
        if (fVar2 != fVar) {
            if (fVar2 != null) {
                fVar2.f286A0 = new WeakReference(null);
            }
            this.e = fVar;
            fVar.f290C0 = false;
            fVar.f286A0 = new WeakReference(this);
            b(this.f2459p);
        }
    }

    public void setChipEndPadding(float f2) {
        f fVar = this.e;
        if (fVar == null || fVar.f318d0 == f2) {
            return;
        }
        fVar.f318d0 = f2;
        fVar.invalidateSelf();
        fVar.z();
    }

    public void setChipEndPaddingResource(int i) {
        f fVar = this.e;
        if (fVar != null) {
            float dimension = fVar.f319e0.getResources().getDimension(i);
            if (fVar.f318d0 != dimension) {
                fVar.f318d0 = dimension;
                fVar.invalidateSelf();
                fVar.z();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        f fVar = this.e;
        if (fVar != null) {
            fVar.G(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z2) {
        setChipIconVisible(z2);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        f fVar = this.e;
        if (fVar != null) {
            fVar.G(h0.f.n(fVar.f319e0, i));
        }
    }

    public void setChipIconSize(float f2) {
        f fVar = this.e;
        if (fVar != null) {
            fVar.H(f2);
        }
    }

    public void setChipIconSizeResource(int i) {
        f fVar = this.e;
        if (fVar != null) {
            fVar.H(fVar.f319e0.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        f fVar = this.e;
        if (fVar != null) {
            fVar.I(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        f fVar = this.e;
        if (fVar != null) {
            fVar.I(AbstractC0078a.z(fVar.f319e0, i));
        }
    }

    public void setChipIconVisible(int i) {
        f fVar = this.e;
        if (fVar != null) {
            fVar.J(fVar.f319e0.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f2) {
        f fVar = this.e;
        if (fVar == null || fVar.f341z == f2) {
            return;
        }
        fVar.f341z = f2;
        fVar.invalidateSelf();
        fVar.z();
    }

    public void setChipMinHeightResource(int i) {
        f fVar = this.e;
        if (fVar != null) {
            float dimension = fVar.f319e0.getResources().getDimension(i);
            if (fVar.f341z != dimension) {
                fVar.f341z = dimension;
                fVar.invalidateSelf();
                fVar.z();
            }
        }
    }

    public void setChipStartPadding(float f2) {
        f fVar = this.e;
        if (fVar == null || fVar.f311W == f2) {
            return;
        }
        fVar.f311W = f2;
        fVar.invalidateSelf();
        fVar.z();
    }

    public void setChipStartPaddingResource(int i) {
        f fVar = this.e;
        if (fVar != null) {
            float dimension = fVar.f319e0.getResources().getDimension(i);
            if (fVar.f311W != dimension) {
                fVar.f311W = dimension;
                fVar.invalidateSelf();
                fVar.z();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        f fVar = this.e;
        if (fVar != null) {
            fVar.K(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        f fVar = this.e;
        if (fVar != null) {
            fVar.K(AbstractC0078a.z(fVar.f319e0, i));
        }
    }

    public void setChipStrokeWidth(float f2) {
        f fVar = this.e;
        if (fVar != null) {
            fVar.L(f2);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        f fVar = this.e;
        if (fVar != null) {
            fVar.L(fVar.f319e0.getResources().getDimension(i));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        f fVar = this.e;
        if (fVar != null) {
            fVar.M(drawable);
        }
        e();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        f fVar = this.e;
        if (fVar == null || fVar.f304P == charSequence) {
            return;
        }
        String str = M.b.f592b;
        M.b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? M.b.e : M.b.f594d;
        bVar.getClass();
        B0.e eVar = g.f601a;
        fVar.f304P = bVar.c(charSequence);
        fVar.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z2) {
        setCloseIconVisible(z2);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f2) {
        f fVar = this.e;
        if (fVar != null) {
            fVar.N(f2);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        f fVar = this.e;
        if (fVar != null) {
            fVar.N(fVar.f319e0.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        f fVar = this.e;
        if (fVar != null) {
            fVar.M(h0.f.n(fVar.f319e0, i));
        }
        e();
    }

    public void setCloseIconSize(float f2) {
        f fVar = this.e;
        if (fVar != null) {
            fVar.O(f2);
        }
    }

    public void setCloseIconSizeResource(int i) {
        f fVar = this.e;
        if (fVar != null) {
            fVar.O(fVar.f319e0.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f2) {
        f fVar = this.e;
        if (fVar != null) {
            fVar.P(f2);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        f fVar = this.e;
        if (fVar != null) {
            fVar.P(fVar.f319e0.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        f fVar = this.e;
        if (fVar != null) {
            fVar.Q(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        f fVar = this.e;
        if (fVar != null) {
            fVar.Q(AbstractC0078a.z(fVar.f319e0, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // m.r, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // m.r, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        f fVar = this.e;
        if (fVar != null) {
            fVar.l(f2);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.e == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        f fVar = this.e;
        if (fVar != null) {
            fVar.f288B0 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z2) {
        this.f2457n = z2;
        b(this.f2459p);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(C0361b c0361b) {
        f fVar = this.e;
        if (fVar != null) {
            fVar.f310V = c0361b;
        }
    }

    public void setHideMotionSpecResource(int i) {
        f fVar = this.e;
        if (fVar != null) {
            fVar.f310V = C0361b.a(fVar.f319e0, i);
        }
    }

    public void setIconEndPadding(float f2) {
        f fVar = this.e;
        if (fVar != null) {
            fVar.S(f2);
        }
    }

    public void setIconEndPaddingResource(int i) {
        f fVar = this.e;
        if (fVar != null) {
            fVar.S(fVar.f319e0.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f2) {
        f fVar = this.e;
        if (fVar != null) {
            fVar.T(f2);
        }
    }

    public void setIconStartPaddingResource(int i) {
        f fVar = this.e;
        if (fVar != null) {
            fVar.T(fVar.f319e0.getResources().getDimension(i));
        }
    }

    public void setInternalOnCheckedChangeListener(L0.e eVar) {
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.e == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        f fVar = this.e;
        if (fVar != null) {
            fVar.f292D0 = i;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.i = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f2453h = onClickListener;
        e();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        f fVar = this.e;
        if (fVar != null) {
            fVar.U(colorStateList);
        }
        this.e.getClass();
        f();
    }

    public void setRippleColorResource(int i) {
        f fVar = this.e;
        if (fVar != null) {
            fVar.U(AbstractC0078a.z(fVar.f319e0, i));
            this.e.getClass();
            f();
        }
    }

    @Override // S0.v
    public void setShapeAppearanceModel(k kVar) {
        this.e.setShapeAppearanceModel(kVar);
    }

    public void setShowMotionSpec(C0361b c0361b) {
        f fVar = this.e;
        if (fVar != null) {
            fVar.f309U = c0361b;
        }
    }

    public void setShowMotionSpecResource(int i) {
        f fVar = this.e;
        if (fVar != null) {
            fVar.f309U = C0361b.a(fVar.f319e0, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z2) {
        if (!z2) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z2);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        f fVar = this.e;
        if (fVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(fVar.f290C0 ? null : charSequence, bufferType);
        f fVar2 = this.e;
        if (fVar2 == null || TextUtils.equals(fVar2.f293E, charSequence)) {
            return;
        }
        fVar2.f293E = charSequence;
        fVar2.f325k0.e = true;
        fVar2.invalidateSelf();
        fVar2.z();
    }

    public void setTextAppearance(P0.d dVar) {
        f fVar = this.e;
        if (fVar != null) {
            fVar.f325k0.b(dVar, fVar.f319e0);
        }
        h();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f2) {
        f fVar = this.e;
        if (fVar == null || fVar.f315a0 == f2) {
            return;
        }
        fVar.f315a0 = f2;
        fVar.invalidateSelf();
        fVar.z();
    }

    public void setTextEndPaddingResource(int i) {
        f fVar = this.e;
        if (fVar != null) {
            float dimension = fVar.f319e0.getResources().getDimension(i);
            if (fVar.f315a0 != dimension) {
                fVar.f315a0 = dimension;
                fVar.invalidateSelf();
                fVar.z();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f2) {
        super.setTextSize(i, f2);
        f fVar = this.e;
        if (fVar != null) {
            float applyDimension = TypedValue.applyDimension(i, f2, getResources().getDisplayMetrics());
            j jVar = fVar.f325k0;
            P0.d dVar = jVar.f516g;
            if (dVar != null) {
                dVar.f907k = applyDimension;
                jVar.f511a.setTextSize(applyDimension);
                fVar.a();
            }
        }
        h();
    }

    public void setTextStartPadding(float f2) {
        f fVar = this.e;
        if (fVar == null || fVar.f314Z == f2) {
            return;
        }
        fVar.f314Z = f2;
        fVar.invalidateSelf();
        fVar.z();
    }

    public void setTextStartPaddingResource(int i) {
        f fVar = this.e;
        if (fVar != null) {
            float dimension = fVar.f319e0.getResources().getDimension(i);
            if (fVar.f314Z != dimension) {
                fVar.f314Z = dimension;
                fVar.invalidateSelf();
                fVar.z();
            }
        }
    }

    public void setCloseIconVisible(boolean z2) {
        f fVar = this.e;
        if (fVar != null) {
            fVar.R(z2);
        }
        e();
    }

    public void setCheckedIconVisible(boolean z2) {
        f fVar = this.e;
        if (fVar != null) {
            fVar.E(z2);
        }
    }

    public void setChipIconVisible(boolean z2) {
        f fVar = this.e;
        if (fVar != null) {
            fVar.J(z2);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        f fVar = this.e;
        if (fVar != null) {
            Context context2 = fVar.f319e0;
            fVar.f325k0.b(new P0.d(context2, i), context2);
        }
        h();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        f fVar = this.e;
        if (fVar != null) {
            Context context = fVar.f319e0;
            fVar.f325k0.b(new P0.d(context, i), context);
        }
        h();
    }
}
