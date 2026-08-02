package com.google.android.material.chip;

import E3.v;
import H.g;
import J3.a;
import L3.F;
import L3.h;
import O.L;
import O.X;
import O3.b;
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
import com.facebook.ads.AdError;
import com.google.android.material.chip.Chip;
import com.icefishingapp.icefishing.C5275R;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;
import k3.AbstractC4632a;
import l3.C4662b;
import m.C4707q;
import t3.C5039b;
import t3.c;
import t3.d;
import t3.e;
import t3.f;
import y3.InterfaceC5237e;
import y3.i;
import y3.k;

/* loaded from: classes2.dex */
public class Chip extends C4707q implements e, v, Checkable {

    /* renamed from: P, reason: collision with root package name */
    public static final Rect f35912P = new Rect();

    /* renamed from: Q, reason: collision with root package name */
    public static final int[] f35913Q = {R.attr.state_selected};

    /* renamed from: R, reason: collision with root package name */
    public static final int[] f35914R = {R.attr.state_checkable};

    /* renamed from: A, reason: collision with root package name */
    public View.OnClickListener f35915A;

    /* renamed from: B, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f35916B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f35917C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f35918D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f35919E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f35920F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f35921G;

    /* renamed from: H, reason: collision with root package name */
    public int f35922H;

    /* renamed from: I, reason: collision with root package name */
    public int f35923I;
    public CharSequence J;

    /* renamed from: K, reason: collision with root package name */
    public final d f35924K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f35925L;

    /* renamed from: M, reason: collision with root package name */
    public final Rect f35926M;

    /* renamed from: N, reason: collision with root package name */
    public final RectF f35927N;

    /* renamed from: O, reason: collision with root package name */
    public final C5039b f35928O;

    /* renamed from: x, reason: collision with root package name */
    public f f35929x;

    /* renamed from: y, reason: collision with root package name */
    public InsetDrawable f35930y;

    /* renamed from: z, reason: collision with root package name */
    public RippleDrawable f35931z;

    public Chip(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, C5275R.attr.chipStyle, C5275R.style.Widget_MaterialComponents_Chip_Action), attributeSet, C5275R.attr.chipStyle);
        int resourceId;
        int resourceId2;
        int resourceId3;
        this.f35926M = new Rect();
        this.f35927N = new RectF();
        this.f35928O = new C5039b(0, this);
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
        int[] iArr = AbstractC4632a.f38631c;
        TypedArray f3 = k.f(fVar.f40876K0, attributeSet, iArr, C5275R.attr.chipStyle, C5275R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        fVar.f40911k1 = f3.hasValue(37);
        Context context3 = fVar.f40876K0;
        ColorStateList m4 = b.m(context3, f3, 24);
        if (fVar.f40882Q != m4) {
            fVar.f40882Q = m4;
            fVar.onStateChange(fVar.getState());
        }
        ColorStateList m9 = b.m(context3, f3, 11);
        if (fVar.f40884R != m9) {
            fVar.f40884R = m9;
            fVar.onStateChange(fVar.getState());
        }
        float dimension = f3.getDimension(19, 0.0f);
        if (fVar.f40886S != dimension) {
            fVar.f40886S = dimension;
            fVar.invalidateSelf();
            fVar.u();
        }
        if (f3.hasValue(12)) {
            fVar.A(f3.getDimension(12, 0.0f));
        }
        fVar.F(b.m(context3, f3, 22));
        fVar.G(f3.getDimension(23, 0.0f));
        fVar.P(b.m(context3, f3, 36));
        String text = f3.getText(5);
        text = text == null ? "" : text;
        if (!TextUtils.equals(fVar.f40896X, text)) {
            fVar.f40896X = text;
            fVar.f40883Q0.f41922d = true;
            fVar.invalidateSelf();
            fVar.u();
        }
        B3.d dVar = (!f3.hasValue(0) || (resourceId3 = f3.getResourceId(0, 0)) == 0) ? null : new B3.d(context3, resourceId3);
        dVar.f203k = f3.getDimension(1, dVar.f203k);
        fVar.Q(dVar);
        int i = f3.getInt(3, 0);
        if (i == 1) {
            fVar.f40908h1 = TextUtils.TruncateAt.START;
        } else if (i == 2) {
            fVar.f40908h1 = TextUtils.TruncateAt.MIDDLE;
        } else if (i == 3) {
            fVar.f40908h1 = TextUtils.TruncateAt.END;
        }
        fVar.E(f3.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            fVar.E(f3.getBoolean(15, false));
        }
        fVar.B(b.o(context3, f3, 14));
        if (f3.hasValue(17)) {
            fVar.D(b.m(context3, f3, 17));
        }
        fVar.C(f3.getDimension(16, -1.0f));
        fVar.M(f3.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            fVar.M(f3.getBoolean(26, false));
        }
        fVar.H(b.o(context3, f3, 25));
        fVar.L(b.m(context3, f3, 30));
        fVar.J(f3.getDimension(28, 0.0f));
        fVar.w(f3.getBoolean(6, false));
        fVar.z(f3.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            fVar.z(f3.getBoolean(8, false));
        }
        fVar.x(b.o(context3, f3, 7));
        if (f3.hasValue(9)) {
            fVar.y(b.m(context3, f3, 9));
        }
        fVar.f40867A0 = (!f3.hasValue(39) || (resourceId2 = f3.getResourceId(39, 0)) == 0) ? null : C4662b.a(context3, resourceId2);
        fVar.f40868B0 = (!f3.hasValue(33) || (resourceId = f3.getResourceId(33, 0)) == 0) ? null : C4662b.a(context3, resourceId);
        float dimension2 = f3.getDimension(21, 0.0f);
        if (fVar.C0 != dimension2) {
            fVar.C0 = dimension2;
            fVar.invalidateSelf();
            fVar.u();
        }
        fVar.O(f3.getDimension(35, 0.0f));
        fVar.N(f3.getDimension(34, 0.0f));
        float dimension3 = f3.getDimension(41, 0.0f);
        if (fVar.f40871F0 != dimension3) {
            fVar.f40871F0 = dimension3;
            fVar.invalidateSelf();
            fVar.u();
        }
        float dimension4 = f3.getDimension(40, 0.0f);
        if (fVar.f40872G0 != dimension4) {
            fVar.f40872G0 = dimension4;
            fVar.invalidateSelf();
            fVar.u();
        }
        fVar.K(f3.getDimension(29, 0.0f));
        fVar.I(f3.getDimension(27, 0.0f));
        float dimension5 = f3.getDimension(13, 0.0f);
        if (fVar.f40875J0 != dimension5) {
            fVar.f40875J0 = dimension5;
            fVar.invalidateSelf();
            fVar.u();
        }
        fVar.f40910j1 = f3.getDimensionPixelSize(4, Integer.MAX_VALUE);
        f3.recycle();
        k.a(context2, attributeSet, C5275R.attr.chipStyle, C5275R.style.Widget_MaterialComponents_Chip_Action);
        k.b(context2, attributeSet, iArr, C5275R.attr.chipStyle, C5275R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, C5275R.attr.chipStyle, C5275R.style.Widget_MaterialComponents_Chip_Action);
        this.f35921G = obtainStyledAttributes.getBoolean(32, false);
        this.f35923I = (int) Math.ceil(obtainStyledAttributes.getDimension(20, (float) Math.ceil(TypedValue.applyDimension(1, 48, getContext().getResources().getDisplayMetrics()))));
        obtainStyledAttributes.recycle();
        setChipDrawable(fVar);
        fVar.i(L.i(this));
        k.a(context2, attributeSet, C5275R.attr.chipStyle, C5275R.style.Widget_MaterialComponents_Chip_Action);
        k.b(context2, attributeSet, iArr, C5275R.attr.chipStyle, C5275R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, C5275R.attr.chipStyle, C5275R.style.Widget_MaterialComponents_Chip_Action);
        boolean hasValue = obtainStyledAttributes2.hasValue(37);
        obtainStyledAttributes2.recycle();
        this.f35924K = new d(this, this);
        d();
        if (!hasValue) {
            setOutlineProvider(new c(this));
        }
        setChecked(this.f35917C);
        setText(fVar.f40896X);
        setEllipsize(fVar.f40908h1);
        g();
        if (!this.f35929x.f40909i1) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        f();
        if (this.f35921G) {
            setMinHeight(this.f35923I);
        }
        this.f35922H = getLayoutDirection();
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: t3.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = Chip.this.f35916B;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z3);
                }
            }
        });
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.f35927N;
        rectF.setEmpty();
        if (c() && this.f35915A != null) {
            f fVar = this.f35929x;
            Rect bounds = fVar.getBounds();
            rectF.setEmpty();
            if (fVar.T()) {
                float f3 = fVar.f40875J0 + fVar.f40874I0 + fVar.f40919u0 + fVar.f40873H0 + fVar.f40872G0;
                if (H.b.a(fVar) == 0) {
                    float f9 = bounds.right;
                    rectF.right = f9;
                    rectF.left = f9 - f3;
                } else {
                    float f10 = bounds.left;
                    rectF.left = f10;
                    rectF.right = f10 + f3;
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
        int i6 = (int) closeIconTouchBounds.top;
        int i9 = (int) closeIconTouchBounds.right;
        int i10 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.f35926M;
        rect.set(i, i6, i9, i10);
        return rect;
    }

    private B3.d getTextAppearance() {
        f fVar = this.f35929x;
        if (fVar != null) {
            return fVar.f40883Q0.f41924f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z3) {
        if (this.f35919E != z3) {
            this.f35919E = z3;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z3) {
        if (this.f35918D != z3) {
            this.f35918D = z3;
            refreshDrawableState();
        }
    }

    public final void b(int i) {
        this.f35923I = i;
        if (!this.f35921G) {
            InsetDrawable insetDrawable = this.f35930y;
            if (insetDrawable == null) {
                int[] iArr = C3.a.f430a;
                e();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f35930y = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr2 = C3.a.f430a;
                    e();
                    return;
                }
                return;
            }
        }
        int max = Math.max(0, i - ((int) this.f35929x.f40886S));
        int max2 = Math.max(0, i - this.f35929x.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            InsetDrawable insetDrawable2 = this.f35930y;
            if (insetDrawable2 == null) {
                int[] iArr3 = C3.a.f430a;
                e();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f35930y = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr4 = C3.a.f430a;
                    e();
                    return;
                }
                return;
            }
        }
        int i6 = max2 > 0 ? max2 / 2 : 0;
        int i9 = max > 0 ? max / 2 : 0;
        if (this.f35930y != null) {
            Rect rect = new Rect();
            this.f35930y.getPadding(rect);
            if (rect.top == i9 && rect.bottom == i9 && rect.left == i6 && rect.right == i6) {
                int[] iArr5 = C3.a.f430a;
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
        this.f35930y = new InsetDrawable((Drawable) this.f35929x, i6, i9, i6, i9);
        int[] iArr6 = C3.a.f430a;
        e();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0011 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c() {
        f fVar = this.f35929x;
        if (fVar == null) {
            return false;
        }
        Object obj = fVar.f40916r0;
        if (obj != null) {
            if (obj instanceof g) {
            }
            return obj == null;
        }
        obj = null;
        if (obj == null) {
        }
    }

    public final void d() {
        f fVar;
        if (!c() || (fVar = this.f35929x) == null || !fVar.f40915q0 || this.f35915A == null) {
            X.o(this, null);
            this.f35925L = false;
        } else {
            X.o(this, this.f35924K);
            this.f35925L = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0069, code lost:
    
        if (r1 != Integer.MIN_VALUE) goto L38;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i;
        if (!this.f35925L) {
            return super.dispatchHoverEvent(motionEvent);
        }
        d dVar = this.f35924K;
        AccessibilityManager accessibilityManager = dVar.f3369h;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                float x9 = motionEvent.getX();
                float y7 = motionEvent.getY();
                Chip chip = dVar.f40864q;
                int i6 = (chip.c() && chip.getCloseIconTouchBounds().contains(x9, y7)) ? 1 : 0;
                int i9 = dVar.f3373m;
                if (i9 != i6) {
                    dVar.f3373m = i6;
                    dVar.q(i6, 128);
                    dVar.q(i9, 256);
                }
            } else if (action == 10 && (i = dVar.f3373m) != Integer.MIN_VALUE) {
                if (i != Integer.MIN_VALUE) {
                    dVar.f3373m = Integer.MIN_VALUE;
                    dVar.q(i, 256);
                    return true;
                }
            }
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f35925L) {
            return super.dispatchKeyEvent(keyEvent);
        }
        d dVar = this.f35924K;
        dVar.getClass();
        boolean z3 = false;
        int i = 0;
        z3 = false;
        z3 = false;
        z3 = false;
        z3 = false;
        z3 = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i6 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i6 = 33;
                                } else if (keyCode == 21) {
                                    i6 = 17;
                                } else if (keyCode != 22) {
                                    i6 = com.anythink.expressad.video.module.a.a.f21731U;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z6 = false;
                                while (i < repeatCount && dVar.m(i6, null)) {
                                    i++;
                                    z6 = true;
                                }
                                z3 = z6;
                                break;
                            }
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i9 = dVar.f3372l;
                    if (i9 != Integer.MIN_VALUE) {
                        Chip chip = dVar.f40864q;
                        if (i9 == 0) {
                            chip.performClick();
                        } else if (i9 == 1) {
                            chip.playSoundEffect(0);
                            View.OnClickListener onClickListener = chip.f35915A;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                            }
                            if (chip.f35925L) {
                                chip.f35924K.q(1, 1);
                            }
                        }
                    }
                    z3 = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                z3 = dVar.m(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                z3 = dVar.m(1, null);
            }
        }
        if (!z3 || dVar.f3372l == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // m.C4707q, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i;
        super.drawableStateChanged();
        f fVar = this.f35929x;
        boolean z3 = false;
        if (fVar != null && f.t(fVar.f40916r0)) {
            f fVar2 = this.f35929x;
            ?? isEnabled = isEnabled();
            int i6 = isEnabled;
            if (this.f35920F) {
                i6 = isEnabled + 1;
            }
            int i9 = i6;
            if (this.f35919E) {
                i9 = i6 + 1;
            }
            int i10 = i9;
            if (this.f35918D) {
                i10 = i9 + 1;
            }
            int i11 = i10;
            if (isChecked()) {
                i11 = i10 + 1;
            }
            int[] iArr = new int[i11];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i = 1;
            } else {
                i = 0;
            }
            if (this.f35920F) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.f35919E) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.f35918D) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            if (!Arrays.equals(fVar2.f40905e1, iArr)) {
                fVar2.f40905e1 = iArr;
                if (fVar2.T()) {
                    z3 = fVar2.v(fVar2.getState(), iArr);
                }
            }
        }
        if (z3) {
            invalidate();
        }
    }

    public final void e() {
        this.f35931z = new RippleDrawable(C3.a.a(this.f35929x.f40894W), getBackgroundDrawable(), null);
        this.f35929x.getClass();
        RippleDrawable rippleDrawable = this.f35931z;
        WeakHashMap weakHashMap = X.f2054a;
        setBackground(rippleDrawable);
        f();
    }

    public final void f() {
        f fVar;
        if (TextUtils.isEmpty(getText()) || (fVar = this.f35929x) == null) {
            return;
        }
        int q8 = (int) (fVar.q() + fVar.f40875J0 + fVar.f40872G0);
        f fVar2 = this.f35929x;
        int p9 = (int) (fVar2.p() + fVar2.C0 + fVar2.f40871F0);
        if (this.f35930y != null) {
            Rect rect = new Rect();
            this.f35930y.getPadding(rect);
            p9 += rect.left;
            q8 += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        WeakHashMap weakHashMap = X.f2054a;
        setPaddingRelative(p9, paddingTop, q8, paddingBottom);
    }

    public final void g() {
        TextPaint paint = getPaint();
        f fVar = this.f35929x;
        if (fVar != null) {
            paint.drawableState = fVar.getState();
        }
        B3.d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.f35928O);
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.J)) {
            return this.J;
        }
        f fVar = this.f35929x;
        if (!(fVar != null && fVar.f40921w0)) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f35930y;
        return insetDrawable == null ? this.f35929x : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        f fVar = this.f35929x;
        if (fVar != null) {
            return fVar.f40923y0;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        f fVar = this.f35929x;
        if (fVar != null) {
            return fVar.f40924z0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        f fVar = this.f35929x;
        if (fVar != null) {
            return fVar.f40884R;
        }
        return null;
    }

    public float getChipCornerRadius() {
        f fVar = this.f35929x;
        if (fVar != null) {
            return Math.max(0.0f, fVar.r());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f35929x;
    }

    public float getChipEndPadding() {
        f fVar = this.f35929x;
        if (fVar != null) {
            return fVar.f40875J0;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        Drawable drawable;
        f fVar = this.f35929x;
        if (fVar == null || (drawable = fVar.f40899Z) == 0) {
            return null;
        }
        if (!(drawable instanceof g)) {
            return drawable;
        }
        return null;
    }

    public float getChipIconSize() {
        f fVar = this.f35929x;
        if (fVar != null) {
            return fVar.f40913o0;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        f fVar = this.f35929x;
        if (fVar != null) {
            return fVar.f40912n0;
        }
        return null;
    }

    public float getChipMinHeight() {
        f fVar = this.f35929x;
        if (fVar != null) {
            return fVar.f40886S;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        f fVar = this.f35929x;
        if (fVar != null) {
            return fVar.C0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        f fVar = this.f35929x;
        if (fVar != null) {
            return fVar.f40890U;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        f fVar = this.f35929x;
        if (fVar != null) {
            return fVar.f40892V;
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
        f fVar = this.f35929x;
        if (fVar == null || (drawable = fVar.f40916r0) == 0) {
            return null;
        }
        if (!(drawable instanceof g)) {
            return drawable;
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        f fVar = this.f35929x;
        if (fVar != null) {
            return fVar.f40920v0;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        f fVar = this.f35929x;
        if (fVar != null) {
            return fVar.f40874I0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        f fVar = this.f35929x;
        if (fVar != null) {
            return fVar.f40919u0;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        f fVar = this.f35929x;
        if (fVar != null) {
            return fVar.f40873H0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        f fVar = this.f35929x;
        if (fVar != null) {
            return fVar.f40918t0;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        f fVar = this.f35929x;
        if (fVar != null) {
            return fVar.f40908h1;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.f35925L) {
            d dVar = this.f35924K;
            if (dVar.f3372l == 1 || dVar.f3371k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public C4662b getHideMotionSpec() {
        f fVar = this.f35929x;
        if (fVar != null) {
            return fVar.f40868B0;
        }
        return null;
    }

    public float getIconEndPadding() {
        f fVar = this.f35929x;
        if (fVar != null) {
            return fVar.f40870E0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        f fVar = this.f35929x;
        if (fVar != null) {
            return fVar.f40869D0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        f fVar = this.f35929x;
        if (fVar != null) {
            return fVar.f40894W;
        }
        return null;
    }

    public E3.k getShapeAppearanceModel() {
        return this.f35929x.f766n.f736a;
    }

    public C4662b getShowMotionSpec() {
        f fVar = this.f35929x;
        if (fVar != null) {
            return fVar.f40867A0;
        }
        return null;
    }

    public float getTextEndPadding() {
        f fVar = this.f35929x;
        if (fVar != null) {
            return fVar.f40872G0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        f fVar = this.f35929x;
        if (fVar != null) {
            return fVar.f40871F0;
        }
        return 0.0f;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        F.s(this, this.f35929x);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f35913Q);
        }
        f fVar = this.f35929x;
        if (fVar != null && fVar.f40921w0) {
            View.mergeDrawableStates(onCreateDrawableState, f35914R);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z3, int i, Rect rect) {
        super.onFocusChanged(z3, i, rect);
        if (this.f35925L) {
            d dVar = this.f35924K;
            int i6 = dVar.f3372l;
            if (i6 != Integer.MIN_VALUE) {
                dVar.j(i6);
            }
            if (z3) {
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
        f fVar = this.f35929x;
        accessibilityNodeInfo.setCheckable(fVar != null && fVar.f40921w0);
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE) : super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.f35922H != i) {
            this.f35922H = i;
            f();
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
        boolean z3;
        int actionMasked = motionEvent.getActionMasked();
        boolean contains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.f35918D) {
                        if (!contains) {
                            setCloseIconPressed(false);
                        }
                        z3 = true;
                    }
                }
                z3 = false;
            } else if (this.f35918D) {
                playSoundEffect(0);
                View.OnClickListener onClickListener = this.f35915A;
                if (onClickListener != null) {
                    onClickListener.onClick(this);
                }
                if (this.f35925L) {
                    this.f35924K.q(1, 1);
                }
                z3 = true;
                setCloseIconPressed(false);
            }
            z3 = false;
            setCloseIconPressed(false);
        } else {
            if (contains) {
                setCloseIconPressed(true);
                z3 = true;
            }
            z3 = false;
        }
        return z3 || super.onTouchEvent(motionEvent);
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.J = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f35931z) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // m.C4707q, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f35931z) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // m.C4707q, android.view.View
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

    public void setCheckable(boolean z3) {
        f fVar = this.f35929x;
        if (fVar != null) {
            fVar.w(z3);
        }
    }

    public void setCheckableResource(int i) {
        f fVar = this.f35929x;
        if (fVar != null) {
            fVar.w(fVar.f40876K0.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z3) {
        f fVar = this.f35929x;
        if (fVar == null) {
            this.f35917C = z3;
        } else if (fVar.f40921w0) {
            super.setChecked(z3);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        f fVar = this.f35929x;
        if (fVar != null) {
            fVar.x(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z3) {
        setCheckedIconVisible(z3);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        f fVar = this.f35929x;
        if (fVar != null) {
            fVar.x(com.bumptech.glide.g.e(fVar.f40876K0, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        f fVar = this.f35929x;
        if (fVar != null) {
            fVar.y(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        f fVar = this.f35929x;
        if (fVar != null) {
            fVar.y(E.e.c(fVar.f40876K0, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        f fVar = this.f35929x;
        if (fVar != null) {
            fVar.z(fVar.f40876K0.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        f fVar = this.f35929x;
        if (fVar == null || fVar.f40884R == colorStateList) {
            return;
        }
        fVar.f40884R = colorStateList;
        fVar.onStateChange(fVar.getState());
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList c9;
        f fVar = this.f35929x;
        if (fVar == null || fVar.f40884R == (c9 = E.e.c(fVar.f40876K0, i))) {
            return;
        }
        fVar.f40884R = c9;
        fVar.onStateChange(fVar.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f3) {
        f fVar = this.f35929x;
        if (fVar != null) {
            fVar.A(f3);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        f fVar = this.f35929x;
        if (fVar != null) {
            fVar.A(fVar.f40876K0.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(f fVar) {
        f fVar2 = this.f35929x;
        if (fVar2 != fVar) {
            if (fVar2 != null) {
                fVar2.f40907g1 = new WeakReference(null);
            }
            this.f35929x = fVar;
            fVar.f40909i1 = false;
            fVar.f40907g1 = new WeakReference(this);
            b(this.f35923I);
        }
    }

    public void setChipEndPadding(float f3) {
        f fVar = this.f35929x;
        if (fVar == null || fVar.f40875J0 == f3) {
            return;
        }
        fVar.f40875J0 = f3;
        fVar.invalidateSelf();
        fVar.u();
    }

    public void setChipEndPaddingResource(int i) {
        f fVar = this.f35929x;
        if (fVar != null) {
            float dimension = fVar.f40876K0.getResources().getDimension(i);
            if (fVar.f40875J0 != dimension) {
                fVar.f40875J0 = dimension;
                fVar.invalidateSelf();
                fVar.u();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        f fVar = this.f35929x;
        if (fVar != null) {
            fVar.B(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z3) {
        setChipIconVisible(z3);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        f fVar = this.f35929x;
        if (fVar != null) {
            fVar.B(com.bumptech.glide.g.e(fVar.f40876K0, i));
        }
    }

    public void setChipIconSize(float f3) {
        f fVar = this.f35929x;
        if (fVar != null) {
            fVar.C(f3);
        }
    }

    public void setChipIconSizeResource(int i) {
        f fVar = this.f35929x;
        if (fVar != null) {
            fVar.C(fVar.f40876K0.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        f fVar = this.f35929x;
        if (fVar != null) {
            fVar.D(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        f fVar = this.f35929x;
        if (fVar != null) {
            fVar.D(E.e.c(fVar.f40876K0, i));
        }
    }

    public void setChipIconVisible(int i) {
        f fVar = this.f35929x;
        if (fVar != null) {
            fVar.E(fVar.f40876K0.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f3) {
        f fVar = this.f35929x;
        if (fVar == null || fVar.f40886S == f3) {
            return;
        }
        fVar.f40886S = f3;
        fVar.invalidateSelf();
        fVar.u();
    }

    public void setChipMinHeightResource(int i) {
        f fVar = this.f35929x;
        if (fVar != null) {
            float dimension = fVar.f40876K0.getResources().getDimension(i);
            if (fVar.f40886S != dimension) {
                fVar.f40886S = dimension;
                fVar.invalidateSelf();
                fVar.u();
            }
        }
    }

    public void setChipStartPadding(float f3) {
        f fVar = this.f35929x;
        if (fVar == null || fVar.C0 == f3) {
            return;
        }
        fVar.C0 = f3;
        fVar.invalidateSelf();
        fVar.u();
    }

    public void setChipStartPaddingResource(int i) {
        f fVar = this.f35929x;
        if (fVar != null) {
            float dimension = fVar.f40876K0.getResources().getDimension(i);
            if (fVar.C0 != dimension) {
                fVar.C0 = dimension;
                fVar.invalidateSelf();
                fVar.u();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        f fVar = this.f35929x;
        if (fVar != null) {
            fVar.F(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        f fVar = this.f35929x;
        if (fVar != null) {
            fVar.F(E.e.c(fVar.f40876K0, i));
        }
    }

    public void setChipStrokeWidth(float f3) {
        f fVar = this.f35929x;
        if (fVar != null) {
            fVar.G(f3);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        f fVar = this.f35929x;
        if (fVar != null) {
            fVar.G(fVar.f40876K0.getResources().getDimension(i));
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
        f fVar = this.f35929x;
        if (fVar != null) {
            fVar.H(drawable);
        }
        d();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        f fVar = this.f35929x;
        if (fVar == null || fVar.f40920v0 == charSequence) {
            return;
        }
        String str = M.b.f1765b;
        M.b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? M.b.f1768e : M.b.f1767d;
        bVar.getClass();
        h hVar = M.h.f1775a;
        fVar.f40920v0 = bVar.c(charSequence);
        fVar.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z3) {
        setCloseIconVisible(z3);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f3) {
        f fVar = this.f35929x;
        if (fVar != null) {
            fVar.I(f3);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        f fVar = this.f35929x;
        if (fVar != null) {
            fVar.I(fVar.f40876K0.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        f fVar = this.f35929x;
        if (fVar != null) {
            fVar.H(com.bumptech.glide.g.e(fVar.f40876K0, i));
        }
        d();
    }

    public void setCloseIconSize(float f3) {
        f fVar = this.f35929x;
        if (fVar != null) {
            fVar.J(f3);
        }
    }

    public void setCloseIconSizeResource(int i) {
        f fVar = this.f35929x;
        if (fVar != null) {
            fVar.J(fVar.f40876K0.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f3) {
        f fVar = this.f35929x;
        if (fVar != null) {
            fVar.K(f3);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        f fVar = this.f35929x;
        if (fVar != null) {
            fVar.K(fVar.f40876K0.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        f fVar = this.f35929x;
        if (fVar != null) {
            fVar.L(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        f fVar = this.f35929x;
        if (fVar != null) {
            fVar.L(E.e.c(fVar.f40876K0, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // m.C4707q, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // m.C4707q, android.widget.TextView
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
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i6, int i9, int i10) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i9 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i6, i9, i10);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i6, int i9, int i10) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i9 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i, i6, i9, i10);
    }

    @Override // android.view.View
    public void setElevation(float f3) {
        super.setElevation(f3);
        f fVar = this.f35929x;
        if (fVar != null) {
            fVar.i(f3);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f35929x == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        f fVar = this.f35929x;
        if (fVar != null) {
            fVar.f40908h1 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z3) {
        this.f35921G = z3;
        b(this.f35923I);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(C4662b c4662b) {
        f fVar = this.f35929x;
        if (fVar != null) {
            fVar.f40868B0 = c4662b;
        }
    }

    public void setHideMotionSpecResource(int i) {
        f fVar = this.f35929x;
        if (fVar != null) {
            fVar.f40868B0 = C4662b.a(fVar.f40876K0, i);
        }
    }

    public void setIconEndPadding(float f3) {
        f fVar = this.f35929x;
        if (fVar != null) {
            fVar.N(f3);
        }
    }

    public void setIconEndPaddingResource(int i) {
        f fVar = this.f35929x;
        if (fVar != null) {
            fVar.N(fVar.f40876K0.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f3) {
        f fVar = this.f35929x;
        if (fVar != null) {
            fVar.O(f3);
        }
    }

    public void setIconStartPaddingResource(int i) {
        f fVar = this.f35929x;
        if (fVar != null) {
            fVar.O(fVar.f40876K0.getResources().getDimension(i));
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.f35929x == null) {
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
        f fVar = this.f35929x;
        if (fVar != null) {
            fVar.f40910j1 = i;
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
        this.f35916B = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f35915A = onClickListener;
        d();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        f fVar = this.f35929x;
        if (fVar != null) {
            fVar.P(colorStateList);
        }
        this.f35929x.getClass();
        e();
    }

    public void setRippleColorResource(int i) {
        f fVar = this.f35929x;
        if (fVar != null) {
            fVar.P(E.e.c(fVar.f40876K0, i));
            this.f35929x.getClass();
            e();
        }
    }

    @Override // E3.v
    public void setShapeAppearanceModel(E3.k kVar) {
        this.f35929x.setShapeAppearanceModel(kVar);
    }

    public void setShowMotionSpec(C4662b c4662b) {
        f fVar = this.f35929x;
        if (fVar != null) {
            fVar.f40867A0 = c4662b;
        }
    }

    public void setShowMotionSpecResource(int i) {
        f fVar = this.f35929x;
        if (fVar != null) {
            fVar.f40867A0 = C4662b.a(fVar.f40876K0, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z3) {
        if (!z3) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z3);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        f fVar = this.f35929x;
        if (fVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(fVar.f40909i1 ? null : charSequence, bufferType);
        f fVar2 = this.f35929x;
        if (fVar2 == null || TextUtils.equals(fVar2.f40896X, charSequence)) {
            return;
        }
        fVar2.f40896X = charSequence;
        fVar2.f40883Q0.f41922d = true;
        fVar2.invalidateSelf();
        fVar2.u();
    }

    public void setTextAppearance(B3.d dVar) {
        f fVar = this.f35929x;
        if (fVar != null) {
            fVar.Q(dVar);
        }
        g();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f3) {
        f fVar = this.f35929x;
        if (fVar == null || fVar.f40872G0 == f3) {
            return;
        }
        fVar.f40872G0 = f3;
        fVar.invalidateSelf();
        fVar.u();
    }

    public void setTextEndPaddingResource(int i) {
        f fVar = this.f35929x;
        if (fVar != null) {
            float dimension = fVar.f40876K0.getResources().getDimension(i);
            if (fVar.f40872G0 != dimension) {
                fVar.f40872G0 = dimension;
                fVar.invalidateSelf();
                fVar.u();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f3) {
        super.setTextSize(i, f3);
        f fVar = this.f35929x;
        if (fVar != null) {
            float applyDimension = TypedValue.applyDimension(i, f3, getResources().getDisplayMetrics());
            i iVar = fVar.f40883Q0;
            B3.d dVar = iVar.f41924f;
            if (dVar != null) {
                dVar.f203k = applyDimension;
                iVar.f41919a.setTextSize(applyDimension);
                fVar.u();
                fVar.invalidateSelf();
            }
        }
        g();
    }

    public void setTextStartPadding(float f3) {
        f fVar = this.f35929x;
        if (fVar == null || fVar.f40871F0 == f3) {
            return;
        }
        fVar.f40871F0 = f3;
        fVar.invalidateSelf();
        fVar.u();
    }

    public void setTextStartPaddingResource(int i) {
        f fVar = this.f35929x;
        if (fVar != null) {
            float dimension = fVar.f40876K0.getResources().getDimension(i);
            if (fVar.f40871F0 != dimension) {
                fVar.f40871F0 = dimension;
                fVar.invalidateSelf();
                fVar.u();
            }
        }
    }

    public void setCloseIconVisible(boolean z3) {
        f fVar = this.f35929x;
        if (fVar != null) {
            fVar.M(z3);
        }
        d();
    }

    public void setCheckedIconVisible(boolean z3) {
        f fVar = this.f35929x;
        if (fVar != null) {
            fVar.z(z3);
        }
    }

    public void setChipIconVisible(boolean z3) {
        f fVar = this.f35929x;
        if (fVar != null) {
            fVar.E(z3);
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
        f fVar = this.f35929x;
        if (fVar != null) {
            fVar.Q(new B3.d(fVar.f40876K0, i));
        }
        g();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        f fVar = this.f35929x;
        if (fVar != null) {
            fVar.Q(new B3.d(fVar.f40876K0, i));
        }
        g();
    }

    public void setInternalOnCheckedChangeListener(InterfaceC5237e interfaceC5237e) {
    }
}
