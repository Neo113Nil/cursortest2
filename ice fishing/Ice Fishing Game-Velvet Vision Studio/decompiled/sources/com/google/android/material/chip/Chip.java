package com.google.android.material.chip;

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
import com.gamericefishpro.space.aa.b;
import com.gamericefishpro.space.aa.d;
import com.gamericefishpro.space.aa.e;
import com.gamericefishpro.space.aa.f;
import com.gamericefishpro.space.b4.g;
import com.gamericefishpro.space.d4.l0;
import com.gamericefishpro.space.d9.h;
import com.gamericefishpro.space.fa.j;
import com.gamericefishpro.space.fa.l;
import com.gamericefishpro.space.hj.c;
import com.gamericefishpro.space.ka.n;
import com.gamericefishpro.space.ka.y;
import com.gamericefishpro.space.n.o;
import com.gamericefishpro.space.oa.a;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class Chip extends o implements e, y, Checkable {
    public static final Rect P = new Rect();
    public static final int[] Q = {R.attr.state_selected};
    public static final int[] R = {R.attr.state_checkable};
    public View.OnClickListener A;
    public CompoundButton.OnCheckedChangeListener B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public CharSequence J;
    public final d K;
    public boolean L;
    public final Rect M;
    public final RectF N;
    public final b O;
    public f w;
    public InsetDrawable y;
    public RippleDrawable z;

    public Chip(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        int resourceId3;
        super(a.a(context, attributeSet, com.gamericefishpro.space.R.attr.chipStyle, com.gamericefishpro.space.R.style.Widget_MaterialComponents_Chip_Action), attributeSet);
        this.M = new Rect();
        this.N = new RectF();
        this.O = new b(0, this);
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
        Context context3 = fVar.G0;
        int[] iArr = com.gamericefishpro.space.s9.a.c;
        TypedArray typedArrayE = l.e(context3, attributeSet, iArr, com.gamericefishpro.space.R.attr.chipStyle, com.gamericefishpro.space.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        fVar.g1 = typedArrayE.hasValue(37);
        Context context4 = fVar.G0;
        ColorStateList colorStateListV = c.v(context4, typedArrayE, 24);
        if (fVar.Z != colorStateListV) {
            fVar.Z = colorStateListV;
            fVar.onStateChange(fVar.getState());
        }
        ColorStateList colorStateListV2 = c.v(context4, typedArrayE, 11);
        if (fVar.a0 != colorStateListV2) {
            fVar.a0 = colorStateListV2;
            fVar.onStateChange(fVar.getState());
        }
        float dimension = typedArrayE.getDimension(19, 0.0f);
        if (fVar.b0 != dimension) {
            fVar.b0 = dimension;
            fVar.invalidateSelf();
            fVar.A();
        }
        if (typedArrayE.hasValue(12)) {
            fVar.G(typedArrayE.getDimension(12, 0.0f));
        }
        fVar.L(c.v(context4, typedArrayE, 22));
        fVar.M(typedArrayE.getDimension(23, 0.0f));
        fVar.W(c.v(context4, typedArrayE, 36));
        String text = typedArrayE.getText(5);
        text = text == null ? "" : text;
        if (!TextUtils.equals(fVar.g0, text)) {
            fVar.g0 = text;
            fVar.M0.d = true;
            fVar.invalidateSelf();
            fVar.A();
        }
        com.gamericefishpro.space.ha.d dVar = (!typedArrayE.hasValue(0) || (resourceId3 = typedArrayE.getResourceId(0, 0)) == 0) ? null : new com.gamericefishpro.space.ha.d(context4, resourceId3);
        dVar.l = typedArrayE.getDimension(1, dVar.l);
        fVar.X(dVar);
        int i = typedArrayE.getInt(3, 0);
        if (i == 1) {
            fVar.d1 = TextUtils.TruncateAt.START;
        } else if (i == 2) {
            fVar.d1 = TextUtils.TruncateAt.MIDDLE;
        } else if (i == 3) {
            fVar.d1 = TextUtils.TruncateAt.END;
        }
        fVar.K(typedArrayE.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            fVar.K(typedArrayE.getBoolean(15, false));
        }
        fVar.H(c.y(context4, typedArrayE, 14));
        if (typedArrayE.hasValue(17)) {
            fVar.J(c.v(context4, typedArrayE, 17));
        }
        fVar.I(typedArrayE.getDimension(16, -1.0f));
        fVar.T(typedArrayE.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            fVar.T(typedArrayE.getBoolean(26, false));
        }
        fVar.N(c.y(context4, typedArrayE, 25));
        fVar.S(c.v(context4, typedArrayE, 30));
        fVar.P(typedArrayE.getDimension(28, 0.0f));
        fVar.C(typedArrayE.getBoolean(6, false));
        fVar.F(typedArrayE.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            fVar.F(typedArrayE.getBoolean(8, false));
        }
        fVar.D(c.y(context4, typedArrayE, 7));
        if (typedArrayE.hasValue(9)) {
            fVar.E(c.v(context4, typedArrayE, 9));
        }
        fVar.w0 = (!typedArrayE.hasValue(39) || (resourceId2 = typedArrayE.getResourceId(39, 0)) == 0) ? null : com.gamericefishpro.space.t9.b.a(context4, resourceId2);
        fVar.x0 = (!typedArrayE.hasValue(33) || (resourceId = typedArrayE.getResourceId(33, 0)) == 0) ? null : com.gamericefishpro.space.t9.b.a(context4, resourceId);
        float dimension2 = typedArrayE.getDimension(21, 0.0f);
        if (fVar.y0 != dimension2) {
            fVar.y0 = dimension2;
            fVar.invalidateSelf();
            fVar.A();
        }
        fVar.V(typedArrayE.getDimension(35, 0.0f));
        fVar.U(typedArrayE.getDimension(34, 0.0f));
        float dimension3 = typedArrayE.getDimension(41, 0.0f);
        if (fVar.B0 != dimension3) {
            fVar.B0 = dimension3;
            fVar.invalidateSelf();
            fVar.A();
        }
        float dimension4 = typedArrayE.getDimension(40, 0.0f);
        if (fVar.C0 != dimension4) {
            fVar.C0 = dimension4;
            fVar.invalidateSelf();
            fVar.A();
        }
        fVar.Q(typedArrayE.getDimension(29, 0.0f));
        fVar.O(typedArrayE.getDimension(27, 0.0f));
        float dimension5 = typedArrayE.getDimension(13, 0.0f);
        if (fVar.F0 != dimension5) {
            fVar.F0 = dimension5;
            fVar.invalidateSelf();
            fVar.A();
        }
        fVar.f1 = typedArrayE.getDimensionPixelSize(4, Integer.MAX_VALUE);
        typedArrayE.recycle();
        l.a(context2, attributeSet, com.gamericefishpro.space.R.attr.chipStyle, com.gamericefishpro.space.R.style.Widget_MaterialComponents_Chip_Action);
        l.b(context2, attributeSet, iArr, com.gamericefishpro.space.R.attr.chipStyle, com.gamericefishpro.space.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.gamericefishpro.space.R.attr.chipStyle, com.gamericefishpro.space.R.style.Widget_MaterialComponents_Chip_Action);
        this.G = typedArrayObtainStyledAttributes.getBoolean(32, false);
        TypedValue typedValueI = h.I(context2, com.gamericefishpro.space.R.attr.minTouchTargetSize);
        this.I = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(20, (int) ((typedValueI == null || typedValueI.type != 5) ? context2.getResources().getDimension(com.gamericefishpro.space.R.dimen.mtrl_min_touch_target_size) : typedValueI.getDimension(context2.getResources().getDisplayMetrics()))));
        typedArrayObtainStyledAttributes.recycle();
        setChipDrawable(fVar);
        fVar.m(getElevation());
        l.a(context2, attributeSet, com.gamericefishpro.space.R.attr.chipStyle, com.gamericefishpro.space.R.style.Widget_MaterialComponents_Chip_Action);
        l.b(context2, attributeSet, iArr, com.gamericefishpro.space.R.attr.chipStyle, com.gamericefishpro.space.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, com.gamericefishpro.space.R.attr.chipStyle, com.gamericefishpro.space.R.style.Widget_MaterialComponents_Chip_Action);
        boolean zHasValue = typedArrayObtainStyledAttributes2.hasValue(37);
        typedArrayObtainStyledAttributes2.recycle();
        this.K = new d(this, this);
        d();
        if (!zHasValue) {
            setOutlineProvider(new com.gamericefishpro.space.aa.c(this));
        }
        setChecked(this.C);
        setText(fVar.g0);
        setEllipsize(fVar.d1);
        g();
        if (!this.w.e1) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        f();
        if (this.G) {
            setMinHeight(this.I);
        }
        this.H = getLayoutDirection();
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.gamericefishpro.space.aa.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.a.B;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z);
                }
            }
        });
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.N;
        rectF.setEmpty();
        if (c() && this.A != null) {
            f fVar = this.w;
            Rect bounds = fVar.getBounds();
            rectF.setEmpty();
            if (fVar.a0()) {
                float f = fVar.F0 + fVar.E0 + fVar.q0 + fVar.D0 + fVar.C0;
                if (fVar.getLayoutDirection() == 0) {
                    float f2 = bounds.right;
                    rectF.right = f2;
                    rectF.left = f2 - f;
                } else {
                    float f3 = bounds.left;
                    rectF.left = f3;
                    rectF.right = f3 + f;
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
        Rect rect = this.M;
        rect.set(i, i2, i3, i4);
        return rect;
    }

    private com.gamericefishpro.space.ha.d getTextAppearance() {
        f fVar = this.w;
        if (fVar != null) {
            return fVar.M0.f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.E != z) {
            this.E = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.D != z) {
            this.D = z;
            refreshDrawableState();
        }
    }

    public final void b(int i) {
        this.I = i;
        if (!this.G) {
            InsetDrawable insetDrawable = this.y;
            if (insetDrawable == null) {
                e();
                return;
            } else {
                if (insetDrawable != null) {
                    this.y = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    e();
                    return;
                }
                return;
            }
        }
        int iMax = Math.max(0, i - ((int) this.w.b0));
        int iMax2 = Math.max(0, i - this.w.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            InsetDrawable insetDrawable2 = this.y;
            if (insetDrawable2 == null) {
                e();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.y = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    e();
                    return;
                }
                return;
            }
        }
        int i2 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i3 = iMax > 0 ? iMax / 2 : 0;
        if (this.y != null) {
            Rect rect = new Rect();
            this.y.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                e();
                return;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.y = new InsetDrawable((Drawable) this.w, i2, i3, i2, i3);
        e();
    }

    public final boolean c() {
        f fVar = this.w;
        if (fVar == null) {
            return false;
        }
        Object obj = fVar.n0;
        if (obj == null) {
            obj = null;
        } else if (obj instanceof com.gamericefishpro.space.v3.a) {
            obj = null;
        }
        return obj != null;
    }

    public final void d() {
        f fVar;
        if (!c() || (fVar = this.w) == null || !fVar.m0 || this.A == null) {
            l0.l(this, null);
            this.L = false;
        } else {
            l0.l(this, this.K);
            this.L = true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x006b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0072 A[RETURN] */
    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i;
        if (!this.L) {
            return super.dispatchHoverEvent(motionEvent);
        }
        d dVar = this.K;
        AccessibilityManager accessibilityManager = dVar.A;
        int i2 = 0;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                Chip chip = dVar.J;
                if (chip.c() && chip.getCloseIconTouchBounds().contains(x, y)) {
                    i2 = 1;
                }
                int i3 = dVar.F;
                if (i3 != i2) {
                    dVar.F = i2;
                    dVar.r(i2, 128);
                    dVar.r(i3, 256);
                    return true;
                }
            } else if (action == 10 && (i = dVar.F) != Integer.MIN_VALUE) {
                if (i != Integer.MIN_VALUE) {
                    dVar.F = Integer.MIN_VALUE;
                    dVar.r(Integer.MIN_VALUE, 128);
                    dVar.r(i, 256);
                    return true;
                }
            } else if (super.dispatchHoverEvent(motionEvent)) {
                return false;
            }
        } else if (super.dispatchHoverEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:46:0x0080  */
    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i;
        Chip chip;
        View.OnClickListener onClickListener;
        if (!this.L) {
            return super.dispatchKeyEvent(keyEvent);
        }
        d dVar = this.K;
        dVar.getClass();
        boolean zM = false;
        int i2 = 0;
        zM = false;
        zM = false;
        zM = false;
        zM = false;
        zM = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i3 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i3 = 33;
                                } else if (keyCode == 21) {
                                    i3 = 17;
                                } else if (keyCode != 22) {
                                    i3 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z = false;
                                while (i2 < repeatCount && dVar.m(i3, null)) {
                                    i2++;
                                    z = true;
                                }
                                zM = z;
                            }
                            break;
                        case 23:
                            if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                                i = dVar.E;
                                if (i != Integer.MIN_VALUE) {
                                    chip = dVar.J;
                                    if (i == 0) {
                                        chip.performClick();
                                    } else if (i == 1) {
                                        chip.playSoundEffect(0);
                                        onClickListener = chip.A;
                                        if (onClickListener != null) {
                                            onClickListener.onClick(chip);
                                        }
                                        if (chip.L) {
                                            chip.K.r(1, 1);
                                        }
                                    }
                                }
                                zM = true;
                            }
                            break;
                    }
                } else if (keyEvent.hasNoModifiers()) {
                    i = dVar.E;
                    if (i != Integer.MIN_VALUE) {
                        chip = dVar.J;
                        if (i == 0) {
                            chip.performClick();
                        } else if (i == 1) {
                            chip.playSoundEffect(0);
                            onClickListener = chip.A;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                            }
                            if (chip.L) {
                                chip.K.r(1, 1);
                            }
                        }
                    }
                    zM = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                zM = dVar.m(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                zM = dVar.m(1, null);
            }
        }
        if (!zM || dVar.E == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // com.gamericefishpro.space.n.o, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i;
        super.drawableStateChanged();
        f fVar = this.w;
        boolean zR = false;
        int i2 = 0;
        zR = false;
        if (fVar != null && f.z(fVar.n0)) {
            f fVar2 = this.w;
            ?? IsEnabled = isEnabled();
            if (this.F) {
                i = IsEnabled;
                i = IsEnabled + 1;
            }
            i = IsEnabled;
            int i3 = i;
            if (this.E) {
                i3 = i + 1;
            }
            int i4 = i3;
            if (this.D) {
                i4 = i3 + 1;
            }
            int i5 = i4;
            if (isChecked()) {
                i5 = i4 + 1;
            }
            int[] iArr = new int[i5];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i2 = 1;
            }
            if (this.F) {
                iArr[i2] = 16842908;
                i2++;
            }
            if (this.E) {
                iArr[i2] = 16843623;
                i2++;
            }
            if (this.D) {
                iArr[i2] = 16842919;
                i2++;
            }
            if (isChecked()) {
                iArr[i2] = 16842913;
            }
            zR = fVar2.R(iArr);
        }
        if (zR) {
            invalidate();
        }
    }

    public final void e() {
        this.z = new RippleDrawable(com.gamericefishpro.space.ia.a.a(this.w.f0), getBackgroundDrawable(), null);
        this.w.getClass();
        setBackground(this.z);
        f();
    }

    public final void f() {
        f fVar;
        if (TextUtils.isEmpty(getText()) || (fVar = this.w) == null) {
            return;
        }
        int iW = (int) (fVar.w() + fVar.F0 + fVar.C0);
        f fVar2 = this.w;
        int iV = (int) (fVar2.v() + fVar2.y0 + fVar2.B0);
        if (this.y != null) {
            Rect rect = new Rect();
            this.y.getPadding(rect);
            iV += rect.left;
            iW += rect.right;
        }
        setPaddingRelative(iV, getPaddingTop(), iW, getPaddingBottom());
    }

    public final void g() {
        TextPaint paint = getPaint();
        f fVar = this.w;
        if (fVar != null) {
            paint.drawableState = fVar.getState();
        }
        com.gamericefishpro.space.ha.d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.d(getContext(), paint, this.O);
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.J)) {
            return this.J;
        }
        f fVar = this.w;
        if (fVar == null || !fVar.s0) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.y;
        return insetDrawable == null ? this.w : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        f fVar = this.w;
        if (fVar != null) {
            return fVar.u0;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        f fVar = this.w;
        if (fVar != null) {
            return fVar.v0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        f fVar = this.w;
        if (fVar != null) {
            return fVar.a0;
        }
        return null;
    }

    public float getChipCornerRadius() {
        f fVar = this.w;
        if (fVar != null) {
            return Math.max(0.0f, fVar.x());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.w;
    }

    public float getChipEndPadding() {
        f fVar = this.w;
        if (fVar != null) {
            return fVar.F0;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        Drawable drawable;
        f fVar = this.w;
        if (fVar == null || (drawable = fVar.i0) == 0) {
            return null;
        }
        if (!(drawable instanceof com.gamericefishpro.space.v3.a)) {
            return drawable;
        }
        return null;
    }

    public float getChipIconSize() {
        f fVar = this.w;
        if (fVar != null) {
            return fVar.k0;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        f fVar = this.w;
        if (fVar != null) {
            return fVar.j0;
        }
        return null;
    }

    public float getChipMinHeight() {
        f fVar = this.w;
        if (fVar != null) {
            return fVar.b0;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        f fVar = this.w;
        if (fVar != null) {
            return fVar.y0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        f fVar = this.w;
        if (fVar != null) {
            return fVar.d0;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        f fVar = this.w;
        if (fVar != null) {
            return fVar.e0;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getCloseIcon() {
        Drawable drawable;
        f fVar = this.w;
        if (fVar == null || (drawable = fVar.n0) == 0) {
            return null;
        }
        if (!(drawable instanceof com.gamericefishpro.space.v3.a)) {
            return drawable;
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        f fVar = this.w;
        if (fVar != null) {
            return fVar.r0;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        f fVar = this.w;
        if (fVar != null) {
            return fVar.E0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        f fVar = this.w;
        if (fVar != null) {
            return fVar.q0;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        f fVar = this.w;
        if (fVar != null) {
            return fVar.D0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        f fVar = this.w;
        if (fVar != null) {
            return fVar.p0;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        f fVar = this.w;
        if (fVar != null) {
            return fVar.d1;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.L) {
            d dVar = this.K;
            if (dVar.E == 1 || dVar.D == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public com.gamericefishpro.space.t9.b getHideMotionSpec() {
        f fVar = this.w;
        if (fVar != null) {
            return fVar.x0;
        }
        return null;
    }

    public float getIconEndPadding() {
        f fVar = this.w;
        if (fVar != null) {
            return fVar.A0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        f fVar = this.w;
        if (fVar != null) {
            return fVar.z0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        f fVar = this.w;
        if (fVar != null) {
            return fVar.f0;
        }
        return null;
    }

    public n getShapeAppearanceModel() {
        return this.w.e.a;
    }

    public com.gamericefishpro.space.t9.b getShowMotionSpec() {
        f fVar = this.w;
        if (fVar != null) {
            return fVar.w0;
        }
        return null;
    }

    public float getTextEndPadding() {
        f fVar = this.w;
        if (fVar != null) {
            return fVar.C0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        f fVar = this.w;
        if (fVar != null) {
            return fVar.B0;
        }
        return 0.0f;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.gamericefishpro.space.i.a.O(this, this.w);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, Q);
        }
        f fVar = this.w;
        if (fVar != null && fVar.s0) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, R);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.L) {
            d dVar = this.K;
            int i2 = dVar.E;
            if (i2 != Integer.MIN_VALUE) {
                dVar.j(i2);
            }
            if (z) {
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
        f fVar = this.w;
        accessibilityNodeInfo.setCheckable(fVar != null && fVar.s0);
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
        if (this.H != i) {
            this.H = i;
            f();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        boolean zContains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                    }
                } else if (this.D) {
                    if (!zContains) {
                        setCloseIconPressed(false);
                    }
                    z = true;
                }
                z = false;
            } else {
                if (this.D) {
                    playSoundEffect(0);
                    View.OnClickListener onClickListener = this.A;
                    if (onClickListener != null) {
                        onClickListener.onClick(this);
                    }
                    if (this.L) {
                        this.K.r(1, 1);
                    }
                    z = true;
                }
                setCloseIconPressed(false);
            }
            z = false;
            setCloseIconPressed(false);
        } else if (zContains) {
            setCloseIconPressed(true);
            z = true;
        } else {
            z = false;
        }
        return z || super.onTouchEvent(motionEvent);
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.J = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.z) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // com.gamericefishpro.space.n.o, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.z) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // com.gamericefishpro.space.n.o, android.view.View
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

    public void setCheckable(boolean z) {
        f fVar = this.w;
        if (fVar != null) {
            fVar.C(z);
        }
    }

    public void setCheckableResource(int i) {
        f fVar = this.w;
        if (fVar != null) {
            fVar.C(fVar.G0.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        f fVar = this.w;
        if (fVar == null) {
            this.C = z;
        } else if (fVar.s0) {
            super.setChecked(z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        f fVar = this.w;
        if (fVar != null) {
            fVar.D(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        f fVar = this.w;
        if (fVar != null) {
            fVar.D(com.gamericefishpro.space.u6.f.x(fVar.G0, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        f fVar = this.w;
        if (fVar != null) {
            fVar.E(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        f fVar = this.w;
        if (fVar != null) {
            fVar.E(com.gamericefishpro.space.s3.a.c(fVar.G0, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        f fVar = this.w;
        if (fVar != null) {
            fVar.F(fVar.G0.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        f fVar = this.w;
        if (fVar == null || fVar.a0 == colorStateList) {
            return;
        }
        fVar.a0 = colorStateList;
        fVar.onStateChange(fVar.getState());
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList colorStateListC;
        f fVar = this.w;
        if (fVar == null || fVar.a0 == (colorStateListC = com.gamericefishpro.space.s3.a.c(fVar.G0, i))) {
            return;
        }
        fVar.a0 = colorStateListC;
        fVar.onStateChange(fVar.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        f fVar = this.w;
        if (fVar != null) {
            fVar.G(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        f fVar = this.w;
        if (fVar != null) {
            fVar.G(fVar.G0.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(f fVar) {
        f fVar2 = this.w;
        if (fVar2 != fVar) {
            if (fVar2 != null) {
                fVar2.c1 = new WeakReference(null);
            }
            this.w = fVar;
            fVar.e1 = false;
            fVar.c1 = new WeakReference(this);
            b(this.I);
        }
    }

    public void setChipEndPadding(float f) {
        f fVar = this.w;
        if (fVar == null || fVar.F0 == f) {
            return;
        }
        fVar.F0 = f;
        fVar.invalidateSelf();
        fVar.A();
    }

    public void setChipEndPaddingResource(int i) {
        f fVar = this.w;
        if (fVar != null) {
            float dimension = fVar.G0.getResources().getDimension(i);
            if (fVar.F0 != dimension) {
                fVar.F0 = dimension;
                fVar.invalidateSelf();
                fVar.A();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        f fVar = this.w;
        if (fVar != null) {
            fVar.H(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        f fVar = this.w;
        if (fVar != null) {
            fVar.H(com.gamericefishpro.space.u6.f.x(fVar.G0, i));
        }
    }

    public void setChipIconSize(float f) {
        f fVar = this.w;
        if (fVar != null) {
            fVar.I(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        f fVar = this.w;
        if (fVar != null) {
            fVar.I(fVar.G0.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        f fVar = this.w;
        if (fVar != null) {
            fVar.J(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        f fVar = this.w;
        if (fVar != null) {
            fVar.J(com.gamericefishpro.space.s3.a.c(fVar.G0, i));
        }
    }

    public void setChipIconVisible(int i) {
        f fVar = this.w;
        if (fVar != null) {
            fVar.K(fVar.G0.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f) {
        f fVar = this.w;
        if (fVar == null || fVar.b0 == f) {
            return;
        }
        fVar.b0 = f;
        fVar.invalidateSelf();
        fVar.A();
    }

    public void setChipMinHeightResource(int i) {
        f fVar = this.w;
        if (fVar != null) {
            float dimension = fVar.G0.getResources().getDimension(i);
            if (fVar.b0 != dimension) {
                fVar.b0 = dimension;
                fVar.invalidateSelf();
                fVar.A();
            }
        }
    }

    public void setChipStartPadding(float f) {
        f fVar = this.w;
        if (fVar == null || fVar.y0 == f) {
            return;
        }
        fVar.y0 = f;
        fVar.invalidateSelf();
        fVar.A();
    }

    public void setChipStartPaddingResource(int i) {
        f fVar = this.w;
        if (fVar != null) {
            float dimension = fVar.G0.getResources().getDimension(i);
            if (fVar.y0 != dimension) {
                fVar.y0 = dimension;
                fVar.invalidateSelf();
                fVar.A();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        f fVar = this.w;
        if (fVar != null) {
            fVar.L(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        f fVar = this.w;
        if (fVar != null) {
            fVar.L(com.gamericefishpro.space.s3.a.c(fVar.G0, i));
        }
    }

    public void setChipStrokeWidth(float f) {
        f fVar = this.w;
        if (fVar != null) {
            fVar.M(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        f fVar = this.w;
        if (fVar != null) {
            fVar.M(fVar.G0.getResources().getDimension(i));
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
        f fVar = this.w;
        if (fVar != null) {
            fVar.N(drawable);
        }
        d();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        f fVar = this.w;
        if (fVar == null || fVar.r0 == charSequence) {
            return;
        }
        String str = com.gamericefishpro.space.b4.b.b;
        com.gamericefishpro.space.b4.b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? com.gamericefishpro.space.b4.b.e : com.gamericefishpro.space.b4.b.d;
        bVar.getClass();
        com.gamericefishpro.space.b4.f fVar2 = g.a;
        fVar.r0 = bVar.c(charSequence);
        fVar.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        f fVar = this.w;
        if (fVar != null) {
            fVar.O(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        f fVar = this.w;
        if (fVar != null) {
            fVar.O(fVar.G0.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        f fVar = this.w;
        if (fVar != null) {
            fVar.N(com.gamericefishpro.space.u6.f.x(fVar.G0, i));
        }
        d();
    }

    public void setCloseIconSize(float f) {
        f fVar = this.w;
        if (fVar != null) {
            fVar.P(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        f fVar = this.w;
        if (fVar != null) {
            fVar.P(fVar.G0.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        f fVar = this.w;
        if (fVar != null) {
            fVar.Q(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        f fVar = this.w;
        if (fVar != null) {
            fVar.Q(fVar.G0.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        f fVar = this.w;
        if (fVar != null) {
            fVar.S(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        f fVar = this.w;
        if (fVar != null) {
            fVar.S(com.gamericefishpro.space.s3.a.c(fVar.G0, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // com.gamericefishpro.space.n.o, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // com.gamericefishpro.space.n.o, android.widget.TextView
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
    public void setElevation(float f) {
        super.setElevation(f);
        f fVar = this.w;
        if (fVar != null) {
            fVar.m(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.w == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        f fVar = this.w;
        if (fVar != null) {
            fVar.d1 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.G = z;
        b(this.I);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(com.gamericefishpro.space.t9.b bVar) {
        f fVar = this.w;
        if (fVar != null) {
            fVar.x0 = bVar;
        }
    }

    public void setHideMotionSpecResource(int i) {
        f fVar = this.w;
        if (fVar != null) {
            fVar.x0 = com.gamericefishpro.space.t9.b.a(fVar.G0, i);
        }
    }

    public void setIconEndPadding(float f) {
        f fVar = this.w;
        if (fVar != null) {
            fVar.U(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        f fVar = this.w;
        if (fVar != null) {
            fVar.U(fVar.G0.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        f fVar = this.w;
        if (fVar != null) {
            fVar.V(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        f fVar = this.w;
        if (fVar != null) {
            fVar.V(fVar.G0.getResources().getDimension(i));
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.w == null) {
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
        f fVar = this.w;
        if (fVar != null) {
            fVar.f1 = i;
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
        this.B = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.A = onClickListener;
        d();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        f fVar = this.w;
        if (fVar != null) {
            fVar.W(colorStateList);
        }
        this.w.getClass();
        e();
    }

    public void setRippleColorResource(int i) {
        f fVar = this.w;
        if (fVar != null) {
            fVar.W(com.gamericefishpro.space.s3.a.c(fVar.G0, i));
            this.w.getClass();
            e();
        }
    }

    @Override // com.gamericefishpro.space.ka.y
    public void setShapeAppearanceModel(n nVar) {
        this.w.setShapeAppearanceModel(nVar);
    }

    public void setShowMotionSpec(com.gamericefishpro.space.t9.b bVar) {
        f fVar = this.w;
        if (fVar != null) {
            fVar.w0 = bVar;
        }
    }

    public void setShowMotionSpecResource(int i) {
        f fVar = this.w;
        if (fVar != null) {
            fVar.w0 = com.gamericefishpro.space.t9.b.a(fVar.G0, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (!z) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        f fVar = this.w;
        if (fVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(fVar.e1 ? null : charSequence, bufferType);
        f fVar2 = this.w;
        if (fVar2 == null || TextUtils.equals(fVar2.g0, charSequence)) {
            return;
        }
        fVar2.g0 = charSequence;
        fVar2.M0.d = true;
        fVar2.invalidateSelf();
        fVar2.A();
    }

    public void setTextAppearance(com.gamericefishpro.space.ha.d dVar) {
        f fVar = this.w;
        if (fVar != null) {
            fVar.X(dVar);
        }
        g();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        f fVar = this.w;
        if (fVar == null || fVar.C0 == f) {
            return;
        }
        fVar.C0 = f;
        fVar.invalidateSelf();
        fVar.A();
    }

    public void setTextEndPaddingResource(int i) {
        f fVar = this.w;
        if (fVar != null) {
            float dimension = fVar.G0.getResources().getDimension(i);
            if (fVar.C0 != dimension) {
                fVar.C0 = dimension;
                fVar.invalidateSelf();
                fVar.A();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        f fVar = this.w;
        if (fVar != null) {
            float fApplyDimension = TypedValue.applyDimension(i, f, getResources().getDisplayMetrics());
            j jVar = fVar.M0;
            com.gamericefishpro.space.ha.d dVar = jVar.f;
            if (dVar != null) {
                dVar.l = fApplyDimension;
                jVar.a.setTextSize(fApplyDimension);
                fVar.A();
                fVar.invalidateSelf();
            }
        }
        g();
    }

    public void setTextStartPadding(float f) {
        f fVar = this.w;
        if (fVar == null || fVar.B0 == f) {
            return;
        }
        fVar.B0 = f;
        fVar.invalidateSelf();
        fVar.A();
    }

    public void setTextStartPaddingResource(int i) {
        f fVar = this.w;
        if (fVar != null) {
            float dimension = fVar.G0.getResources().getDimension(i);
            if (fVar.B0 != dimension) {
                fVar.B0 = dimension;
                fVar.invalidateSelf();
                fVar.A();
            }
        }
    }

    public void setCloseIconVisible(boolean z) {
        f fVar = this.w;
        if (fVar != null) {
            fVar.T(z);
        }
        d();
    }

    public void setCheckedIconVisible(boolean z) {
        f fVar = this.w;
        if (fVar != null) {
            fVar.F(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        f fVar = this.w;
        if (fVar != null) {
            fVar.K(z);
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
        f fVar = this.w;
        if (fVar != null) {
            fVar.X(new com.gamericefishpro.space.ha.d(fVar.G0, i));
        }
        g();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        f fVar = this.w;
        if (fVar != null) {
            fVar.X(new com.gamericefishpro.space.ha.d(fVar.G0, i));
        }
        g();
    }

    public void setInternalOnCheckedChangeListener(com.gamericefishpro.space.fa.f fVar) {
    }
}
