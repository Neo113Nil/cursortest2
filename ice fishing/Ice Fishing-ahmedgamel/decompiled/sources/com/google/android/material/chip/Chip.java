package com.google.android.material.chip;

import A3.j;
import A3.l;
import A3.n;
import G3.k;
import G3.v;
import H.b;
import H.g;
import L3.a;
import M.h;
import M.i;
import O.L;
import O.X;
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
import com.IceFishing.LiveIceFishing.C5248R;
import com.bumptech.glide.f;
import com.facebook.ads.AdError;
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;
import m.C4720q;
import m3.AbstractC4742a;
import n3.C4771b;
import v3.C5103b;
import v3.c;
import v3.d;
import v3.e;

/* loaded from: classes2.dex */
public class Chip extends C4720q implements d, v, Checkable {

    /* renamed from: P, reason: collision with root package name */
    public static final Rect f36680P = new Rect();

    /* renamed from: Q, reason: collision with root package name */
    public static final int[] f36681Q = {R.attr.state_selected};

    /* renamed from: R, reason: collision with root package name */
    public static final int[] f36682R = {R.attr.state_checkable};

    /* renamed from: A, reason: collision with root package name */
    public View.OnClickListener f36683A;

    /* renamed from: B, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f36684B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f36685C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f36686D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f36687E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f36688F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f36689G;

    /* renamed from: H, reason: collision with root package name */
    public int f36690H;

    /* renamed from: I, reason: collision with root package name */
    public int f36691I;
    public CharSequence J;

    /* renamed from: K, reason: collision with root package name */
    public final c f36692K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f36693L;

    /* renamed from: M, reason: collision with root package name */
    public final Rect f36694M;

    /* renamed from: N, reason: collision with root package name */
    public final RectF f36695N;

    /* renamed from: O, reason: collision with root package name */
    public final j f36696O;

    /* renamed from: x, reason: collision with root package name */
    public e f36697x;

    /* renamed from: y, reason: collision with root package name */
    public InsetDrawable f36698y;

    /* renamed from: z, reason: collision with root package name */
    public RippleDrawable f36699z;

    public Chip(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, C5248R.attr.chipStyle, C5248R.style.Widget_MaterialComponents_Chip_Action), attributeSet, C5248R.attr.chipStyle);
        int resourceId;
        int resourceId2;
        int resourceId3;
        this.f36694M = new Rect();
        this.f36695N = new RectF();
        this.f36696O = new j(1, this);
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
        e eVar = new e(context2, attributeSet);
        int[] iArr = AbstractC4742a.f39420c;
        TypedArray f2 = n.f(eVar.f41156F0, attributeSet, iArr, C5248R.attr.chipStyle, C5248R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        eVar.f41191f1 = f2.hasValue(37);
        Context context3 = eVar.f41156F0;
        ColorStateList j6 = f.j(context3, f2, 24);
        if (eVar.f41167Q != j6) {
            eVar.f41167Q = j6;
            eVar.onStateChange(eVar.getState());
        }
        ColorStateList j9 = f.j(context3, f2, 11);
        if (eVar.f41169R != j9) {
            eVar.f41169R = j9;
            eVar.onStateChange(eVar.getState());
        }
        float dimension = f2.getDimension(19, 0.0f);
        if (eVar.f41171S != dimension) {
            eVar.f41171S = dimension;
            eVar.invalidateSelf();
            eVar.u();
        }
        if (f2.hasValue(12)) {
            eVar.A(f2.getDimension(12, 0.0f));
        }
        eVar.F(f.j(context3, f2, 22));
        eVar.G(f2.getDimension(23, 0.0f));
        eVar.P(f.j(context3, f2, 36));
        String text = f2.getText(5);
        text = text == null ? "" : text;
        if (!TextUtils.equals(eVar.f41181X, text)) {
            eVar.f41181X = text;
            eVar.f41162L0.f175d = true;
            eVar.invalidateSelf();
            eVar.u();
        }
        D3.d dVar = (!f2.hasValue(0) || (resourceId3 = f2.getResourceId(0, 0)) == 0) ? null : new D3.d(context3, resourceId3);
        dVar.f622k = f2.getDimension(1, dVar.f622k);
        eVar.Q(dVar);
        int i = f2.getInt(3, 0);
        if (i == 1) {
            eVar.f41188c1 = TextUtils.TruncateAt.START;
        } else if (i == 2) {
            eVar.f41188c1 = TextUtils.TruncateAt.MIDDLE;
        } else if (i == 3) {
            eVar.f41188c1 = TextUtils.TruncateAt.END;
        }
        eVar.E(f2.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            eVar.E(f2.getBoolean(15, false));
        }
        eVar.B(f.l(context3, f2, 14));
        if (f2.hasValue(17)) {
            eVar.D(f.j(context3, f2, 17));
        }
        eVar.C(f2.getDimension(16, -1.0f));
        eVar.M(f2.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            eVar.M(f2.getBoolean(26, false));
        }
        eVar.H(f.l(context3, f2, 25));
        eVar.L(f.j(context3, f2, 30));
        eVar.J(f2.getDimension(28, 0.0f));
        eVar.w(f2.getBoolean(6, false));
        eVar.z(f2.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            eVar.z(f2.getBoolean(8, false));
        }
        eVar.x(f.l(context3, f2, 7));
        if (f2.hasValue(9)) {
            eVar.y(f.j(context3, f2, 9));
        }
        eVar.f41204v0 = (!f2.hasValue(39) || (resourceId2 = f2.getResourceId(39, 0)) == 0) ? null : C4771b.a(context3, resourceId2);
        eVar.f41205w0 = (!f2.hasValue(33) || (resourceId = f2.getResourceId(33, 0)) == 0) ? null : C4771b.a(context3, resourceId);
        float dimension2 = f2.getDimension(21, 0.0f);
        if (eVar.f41206x0 != dimension2) {
            eVar.f41206x0 = dimension2;
            eVar.invalidateSelf();
            eVar.u();
        }
        eVar.O(f2.getDimension(35, 0.0f));
        eVar.N(f2.getDimension(34, 0.0f));
        float dimension3 = f2.getDimension(41, 0.0f);
        if (eVar.f41152A0 != dimension3) {
            eVar.f41152A0 = dimension3;
            eVar.invalidateSelf();
            eVar.u();
        }
        float dimension4 = f2.getDimension(40, 0.0f);
        if (eVar.f41153B0 != dimension4) {
            eVar.f41153B0 = dimension4;
            eVar.invalidateSelf();
            eVar.u();
        }
        eVar.K(f2.getDimension(29, 0.0f));
        eVar.I(f2.getDimension(27, 0.0f));
        float dimension5 = f2.getDimension(13, 0.0f);
        if (eVar.f41155E0 != dimension5) {
            eVar.f41155E0 = dimension5;
            eVar.invalidateSelf();
            eVar.u();
        }
        eVar.f41190e1 = f2.getDimensionPixelSize(4, Integer.MAX_VALUE);
        f2.recycle();
        n.a(context2, attributeSet, C5248R.attr.chipStyle, C5248R.style.Widget_MaterialComponents_Chip_Action);
        n.b(context2, attributeSet, iArr, C5248R.attr.chipStyle, C5248R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, C5248R.attr.chipStyle, C5248R.style.Widget_MaterialComponents_Chip_Action);
        this.f36689G = obtainStyledAttributes.getBoolean(32, false);
        this.f36691I = (int) Math.ceil(obtainStyledAttributes.getDimension(20, (float) Math.ceil(TypedValue.applyDimension(1, 48, getContext().getResources().getDisplayMetrics()))));
        obtainStyledAttributes.recycle();
        setChipDrawable(eVar);
        eVar.i(L.i(this));
        n.a(context2, attributeSet, C5248R.attr.chipStyle, C5248R.style.Widget_MaterialComponents_Chip_Action);
        n.b(context2, attributeSet, iArr, C5248R.attr.chipStyle, C5248R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, C5248R.attr.chipStyle, C5248R.style.Widget_MaterialComponents_Chip_Action);
        boolean hasValue = obtainStyledAttributes2.hasValue(37);
        obtainStyledAttributes2.recycle();
        this.f36692K = new c(this, this);
        d();
        if (!hasValue) {
            setOutlineProvider(new C5103b(this));
        }
        setChecked(this.f36685C);
        setText(eVar.f41181X);
        setEllipsize(eVar.f41188c1);
        g();
        if (!this.f36697x.f41189d1) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        f();
        if (this.f36689G) {
            setMinHeight(this.f36691I);
        }
        this.f36690H = getLayoutDirection();
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: v3.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z6) {
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = Chip.this.f36684B;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z6);
                }
            }
        });
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.f36695N;
        rectF.setEmpty();
        if (c() && this.f36683A != null) {
            e eVar = this.f36697x;
            Rect bounds = eVar.getBounds();
            rectF.setEmpty();
            if (eVar.T()) {
                float f2 = eVar.f41155E0 + eVar.f41154D0 + eVar.f41198p0 + eVar.C0 + eVar.f41153B0;
                if (b.a(eVar) == 0) {
                    float f9 = bounds.right;
                    rectF.right = f9;
                    rectF.left = f9 - f2;
                } else {
                    float f10 = bounds.left;
                    rectF.left = f10;
                    rectF.right = f10 + f2;
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
        int i4 = (int) closeIconTouchBounds.top;
        int i6 = (int) closeIconTouchBounds.right;
        int i9 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.f36694M;
        rect.set(i, i4, i6, i9);
        return rect;
    }

    private D3.d getTextAppearance() {
        e eVar = this.f36697x;
        if (eVar != null) {
            return eVar.f41162L0.f177f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z6) {
        if (this.f36687E != z6) {
            this.f36687E = z6;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z6) {
        if (this.f36686D != z6) {
            this.f36686D = z6;
            refreshDrawableState();
        }
    }

    public final void b(int i) {
        this.f36691I = i;
        if (!this.f36689G) {
            InsetDrawable insetDrawable = this.f36698y;
            if (insetDrawable == null) {
                int[] iArr = E3.a.f895a;
                e();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f36698y = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr2 = E3.a.f895a;
                    e();
                    return;
                }
                return;
            }
        }
        int max = Math.max(0, i - ((int) this.f36697x.f41171S));
        int max2 = Math.max(0, i - this.f36697x.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            InsetDrawable insetDrawable2 = this.f36698y;
            if (insetDrawable2 == null) {
                int[] iArr3 = E3.a.f895a;
                e();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f36698y = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr4 = E3.a.f895a;
                    e();
                    return;
                }
                return;
            }
        }
        int i4 = max2 > 0 ? max2 / 2 : 0;
        int i6 = max > 0 ? max / 2 : 0;
        if (this.f36698y != null) {
            Rect rect = new Rect();
            this.f36698y.getPadding(rect);
            if (rect.top == i6 && rect.bottom == i6 && rect.left == i4 && rect.right == i4) {
                int[] iArr5 = E3.a.f895a;
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
        this.f36698y = new InsetDrawable((Drawable) this.f36697x, i4, i6, i4, i6);
        int[] iArr6 = E3.a.f895a;
        e();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0011 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c() {
        e eVar = this.f36697x;
        if (eVar == null) {
            return false;
        }
        Object obj = eVar.m0;
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
        e eVar;
        if (!c() || (eVar = this.f36697x) == null || !eVar.f41195l0 || this.f36683A == null) {
            X.o(this, null);
            this.f36693L = false;
        } else {
            X.o(this, this.f36692K);
            this.f36693L = true;
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
        if (!this.f36693L) {
            return super.dispatchHoverEvent(motionEvent);
        }
        c cVar = this.f36692K;
        AccessibilityManager accessibilityManager = cVar.f3499h;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                float x9 = motionEvent.getX();
                float y7 = motionEvent.getY();
                Chip chip = cVar.f41149q;
                int i4 = (chip.c() && chip.getCloseIconTouchBounds().contains(x9, y7)) ? 1 : 0;
                int i6 = cVar.f3503m;
                if (i6 != i4) {
                    cVar.f3503m = i4;
                    cVar.q(i4, 128);
                    cVar.q(i6, 256);
                }
            } else if (action == 10 && (i = cVar.f3503m) != Integer.MIN_VALUE) {
                if (i != Integer.MIN_VALUE) {
                    cVar.f3503m = Integer.MIN_VALUE;
                    cVar.q(i, 256);
                    return true;
                }
            }
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f36693L) {
            return super.dispatchKeyEvent(keyEvent);
        }
        c cVar = this.f36692K;
        cVar.getClass();
        boolean z6 = false;
        int i = 0;
        z6 = false;
        z6 = false;
        z6 = false;
        z6 = false;
        z6 = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i4 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i4 = 33;
                                } else if (keyCode == 21) {
                                    i4 = 17;
                                } else if (keyCode != 22) {
                                    i4 = com.anythink.expressad.video.module.a.a.f22518U;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z9 = false;
                                while (i < repeatCount && cVar.m(i4, null)) {
                                    i++;
                                    z9 = true;
                                }
                                z6 = z9;
                                break;
                            }
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i6 = cVar.f3502l;
                    if (i6 != Integer.MIN_VALUE) {
                        Chip chip = cVar.f41149q;
                        if (i6 == 0) {
                            chip.performClick();
                        } else if (i6 == 1) {
                            chip.playSoundEffect(0);
                            View.OnClickListener onClickListener = chip.f36683A;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                            }
                            if (chip.f36693L) {
                                chip.f36692K.q(1, 1);
                            }
                        }
                    }
                    z6 = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                z6 = cVar.m(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                z6 = cVar.m(1, null);
            }
        }
        if (!z6 || cVar.f3502l == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // m.C4720q, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i;
        super.drawableStateChanged();
        e eVar = this.f36697x;
        boolean z6 = false;
        if (eVar != null && e.t(eVar.m0)) {
            e eVar2 = this.f36697x;
            ?? isEnabled = isEnabled();
            int i4 = isEnabled;
            if (this.f36688F) {
                i4 = isEnabled + 1;
            }
            int i6 = i4;
            if (this.f36687E) {
                i6 = i4 + 1;
            }
            int i9 = i6;
            if (this.f36686D) {
                i9 = i6 + 1;
            }
            int i10 = i9;
            if (isChecked()) {
                i10 = i9 + 1;
            }
            int[] iArr = new int[i10];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i = 1;
            } else {
                i = 0;
            }
            if (this.f36688F) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.f36687E) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.f36686D) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            if (!Arrays.equals(eVar2.f41185Z0, iArr)) {
                eVar2.f41185Z0 = iArr;
                if (eVar2.T()) {
                    z6 = eVar2.v(eVar2.getState(), iArr);
                }
            }
        }
        if (z6) {
            invalidate();
        }
    }

    public final void e() {
        this.f36699z = new RippleDrawable(E3.a.a(this.f36697x.f41179W), getBackgroundDrawable(), null);
        this.f36697x.getClass();
        RippleDrawable rippleDrawable = this.f36699z;
        WeakHashMap weakHashMap = X.f2142a;
        setBackground(rippleDrawable);
        f();
    }

    public final void f() {
        e eVar;
        if (TextUtils.isEmpty(getText()) || (eVar = this.f36697x) == null) {
            return;
        }
        int q8 = (int) (eVar.q() + eVar.f41155E0 + eVar.f41153B0);
        e eVar2 = this.f36697x;
        int p9 = (int) (eVar2.p() + eVar2.f41206x0 + eVar2.f41152A0);
        if (this.f36698y != null) {
            Rect rect = new Rect();
            this.f36698y.getPadding(rect);
            p9 += rect.left;
            q8 += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        WeakHashMap weakHashMap = X.f2142a;
        setPaddingRelative(p9, paddingTop, q8, paddingBottom);
    }

    public final void g() {
        TextPaint paint = getPaint();
        e eVar = this.f36697x;
        if (eVar != null) {
            paint.drawableState = eVar.getState();
        }
        D3.d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.f36696O);
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.J)) {
            return this.J;
        }
        e eVar = this.f36697x;
        if (!(eVar != null && eVar.f41200r0)) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f36698y;
        return insetDrawable == null ? this.f36697x : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        e eVar = this.f36697x;
        if (eVar != null) {
            return eVar.f41202t0;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        e eVar = this.f36697x;
        if (eVar != null) {
            return eVar.f41203u0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        e eVar = this.f36697x;
        if (eVar != null) {
            return eVar.f41169R;
        }
        return null;
    }

    public float getChipCornerRadius() {
        e eVar = this.f36697x;
        if (eVar != null) {
            return Math.max(0.0f, eVar.r());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f36697x;
    }

    public float getChipEndPadding() {
        e eVar = this.f36697x;
        if (eVar != null) {
            return eVar.f41155E0;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        Drawable drawable;
        e eVar = this.f36697x;
        if (eVar == null || (drawable = eVar.f41184Z) == 0) {
            return null;
        }
        if (!(drawable instanceof g)) {
            return drawable;
        }
        return null;
    }

    public float getChipIconSize() {
        e eVar = this.f36697x;
        if (eVar != null) {
            return eVar.f41193j0;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        e eVar = this.f36697x;
        if (eVar != null) {
            return eVar.f41192i0;
        }
        return null;
    }

    public float getChipMinHeight() {
        e eVar = this.f36697x;
        if (eVar != null) {
            return eVar.f41171S;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        e eVar = this.f36697x;
        if (eVar != null) {
            return eVar.f41206x0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        e eVar = this.f36697x;
        if (eVar != null) {
            return eVar.f41175U;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        e eVar = this.f36697x;
        if (eVar != null) {
            return eVar.f41177V;
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
        e eVar = this.f36697x;
        if (eVar == null || (drawable = eVar.m0) == 0) {
            return null;
        }
        if (!(drawable instanceof g)) {
            return drawable;
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        e eVar = this.f36697x;
        if (eVar != null) {
            return eVar.f41199q0;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        e eVar = this.f36697x;
        if (eVar != null) {
            return eVar.f41154D0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        e eVar = this.f36697x;
        if (eVar != null) {
            return eVar.f41198p0;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        e eVar = this.f36697x;
        if (eVar != null) {
            return eVar.C0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        e eVar = this.f36697x;
        if (eVar != null) {
            return eVar.f41197o0;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        e eVar = this.f36697x;
        if (eVar != null) {
            return eVar.f41188c1;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.f36693L) {
            c cVar = this.f36692K;
            if (cVar.f3502l == 1 || cVar.f3501k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public C4771b getHideMotionSpec() {
        e eVar = this.f36697x;
        if (eVar != null) {
            return eVar.f41205w0;
        }
        return null;
    }

    public float getIconEndPadding() {
        e eVar = this.f36697x;
        if (eVar != null) {
            return eVar.f41208z0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        e eVar = this.f36697x;
        if (eVar != null) {
            return eVar.f41207y0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        e eVar = this.f36697x;
        if (eVar != null) {
            return eVar.f41179W;
        }
        return null;
    }

    public k getShapeAppearanceModel() {
        return this.f36697x.f1108n.f1078a;
    }

    public C4771b getShowMotionSpec() {
        e eVar = this.f36697x;
        if (eVar != null) {
            return eVar.f41204v0;
        }
        return null;
    }

    public float getTextEndPadding() {
        e eVar = this.f36697x;
        if (eVar != null) {
            return eVar.f41153B0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        e eVar = this.f36697x;
        if (eVar != null) {
            return eVar.f41152A0;
        }
        return 0.0f;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Z2.d.q(this, this.f36697x);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f36681Q);
        }
        e eVar = this.f36697x;
        if (eVar != null && eVar.f41200r0) {
            View.mergeDrawableStates(onCreateDrawableState, f36682R);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z6, int i, Rect rect) {
        super.onFocusChanged(z6, i, rect);
        if (this.f36693L) {
            c cVar = this.f36692K;
            int i4 = cVar.f3502l;
            if (i4 != Integer.MIN_VALUE) {
                cVar.j(i4);
            }
            if (z6) {
                cVar.m(i, rect);
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
        e eVar = this.f36697x;
        accessibilityNodeInfo.setCheckable(eVar != null && eVar.f41200r0);
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
        if (this.f36690H != i) {
            this.f36690H = i;
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
        boolean z6;
        int actionMasked = motionEvent.getActionMasked();
        boolean contains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.f36686D) {
                        if (!contains) {
                            setCloseIconPressed(false);
                        }
                        z6 = true;
                    }
                }
                z6 = false;
            } else if (this.f36686D) {
                playSoundEffect(0);
                View.OnClickListener onClickListener = this.f36683A;
                if (onClickListener != null) {
                    onClickListener.onClick(this);
                }
                if (this.f36693L) {
                    this.f36692K.q(1, 1);
                }
                z6 = true;
                setCloseIconPressed(false);
            }
            z6 = false;
            setCloseIconPressed(false);
        } else {
            if (contains) {
                setCloseIconPressed(true);
                z6 = true;
            }
            z6 = false;
        }
        return z6 || super.onTouchEvent(motionEvent);
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.J = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f36699z) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // m.C4720q, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f36699z) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // m.C4720q, android.view.View
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

    public void setCheckable(boolean z6) {
        e eVar = this.f36697x;
        if (eVar != null) {
            eVar.w(z6);
        }
    }

    public void setCheckableResource(int i) {
        e eVar = this.f36697x;
        if (eVar != null) {
            eVar.w(eVar.f41156F0.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z6) {
        e eVar = this.f36697x;
        if (eVar == null) {
            this.f36685C = z6;
        } else if (eVar.f41200r0) {
            super.setChecked(z6);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        e eVar = this.f36697x;
        if (eVar != null) {
            eVar.x(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z6) {
        setCheckedIconVisible(z6);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        e eVar = this.f36697x;
        if (eVar != null) {
            eVar.x(com.bumptech.glide.g.h(eVar.f41156F0, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        e eVar = this.f36697x;
        if (eVar != null) {
            eVar.y(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        e eVar = this.f36697x;
        if (eVar != null) {
            eVar.y(E.e.c(eVar.f41156F0, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        e eVar = this.f36697x;
        if (eVar != null) {
            eVar.z(eVar.f41156F0.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        e eVar = this.f36697x;
        if (eVar == null || eVar.f41169R == colorStateList) {
            return;
        }
        eVar.f41169R = colorStateList;
        eVar.onStateChange(eVar.getState());
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList c9;
        e eVar = this.f36697x;
        if (eVar == null || eVar.f41169R == (c9 = E.e.c(eVar.f41156F0, i))) {
            return;
        }
        eVar.f41169R = c9;
        eVar.onStateChange(eVar.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f2) {
        e eVar = this.f36697x;
        if (eVar != null) {
            eVar.A(f2);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        e eVar = this.f36697x;
        if (eVar != null) {
            eVar.A(eVar.f41156F0.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(e eVar) {
        e eVar2 = this.f36697x;
        if (eVar2 != eVar) {
            if (eVar2 != null) {
                eVar2.f41187b1 = new WeakReference(null);
            }
            this.f36697x = eVar;
            eVar.f41189d1 = false;
            eVar.f41187b1 = new WeakReference(this);
            b(this.f36691I);
        }
    }

    public void setChipEndPadding(float f2) {
        e eVar = this.f36697x;
        if (eVar == null || eVar.f41155E0 == f2) {
            return;
        }
        eVar.f41155E0 = f2;
        eVar.invalidateSelf();
        eVar.u();
    }

    public void setChipEndPaddingResource(int i) {
        e eVar = this.f36697x;
        if (eVar != null) {
            float dimension = eVar.f41156F0.getResources().getDimension(i);
            if (eVar.f41155E0 != dimension) {
                eVar.f41155E0 = dimension;
                eVar.invalidateSelf();
                eVar.u();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        e eVar = this.f36697x;
        if (eVar != null) {
            eVar.B(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z6) {
        setChipIconVisible(z6);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        e eVar = this.f36697x;
        if (eVar != null) {
            eVar.B(com.bumptech.glide.g.h(eVar.f41156F0, i));
        }
    }

    public void setChipIconSize(float f2) {
        e eVar = this.f36697x;
        if (eVar != null) {
            eVar.C(f2);
        }
    }

    public void setChipIconSizeResource(int i) {
        e eVar = this.f36697x;
        if (eVar != null) {
            eVar.C(eVar.f41156F0.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        e eVar = this.f36697x;
        if (eVar != null) {
            eVar.D(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        e eVar = this.f36697x;
        if (eVar != null) {
            eVar.D(E.e.c(eVar.f41156F0, i));
        }
    }

    public void setChipIconVisible(int i) {
        e eVar = this.f36697x;
        if (eVar != null) {
            eVar.E(eVar.f41156F0.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f2) {
        e eVar = this.f36697x;
        if (eVar == null || eVar.f41171S == f2) {
            return;
        }
        eVar.f41171S = f2;
        eVar.invalidateSelf();
        eVar.u();
    }

    public void setChipMinHeightResource(int i) {
        e eVar = this.f36697x;
        if (eVar != null) {
            float dimension = eVar.f41156F0.getResources().getDimension(i);
            if (eVar.f41171S != dimension) {
                eVar.f41171S = dimension;
                eVar.invalidateSelf();
                eVar.u();
            }
        }
    }

    public void setChipStartPadding(float f2) {
        e eVar = this.f36697x;
        if (eVar == null || eVar.f41206x0 == f2) {
            return;
        }
        eVar.f41206x0 = f2;
        eVar.invalidateSelf();
        eVar.u();
    }

    public void setChipStartPaddingResource(int i) {
        e eVar = this.f36697x;
        if (eVar != null) {
            float dimension = eVar.f41156F0.getResources().getDimension(i);
            if (eVar.f41206x0 != dimension) {
                eVar.f41206x0 = dimension;
                eVar.invalidateSelf();
                eVar.u();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        e eVar = this.f36697x;
        if (eVar != null) {
            eVar.F(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        e eVar = this.f36697x;
        if (eVar != null) {
            eVar.F(E.e.c(eVar.f41156F0, i));
        }
    }

    public void setChipStrokeWidth(float f2) {
        e eVar = this.f36697x;
        if (eVar != null) {
            eVar.G(f2);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        e eVar = this.f36697x;
        if (eVar != null) {
            eVar.G(eVar.f41156F0.getResources().getDimension(i));
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
        e eVar = this.f36697x;
        if (eVar != null) {
            eVar.H(drawable);
        }
        d();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        e eVar = this.f36697x;
        if (eVar == null || eVar.f41199q0 == charSequence) {
            return;
        }
        String str = M.b.f1796b;
        M.b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? M.b.f1799e : M.b.f1798d;
        bVar.getClass();
        h hVar = i.f1808a;
        eVar.f41199q0 = bVar.c(charSequence);
        eVar.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z6) {
        setCloseIconVisible(z6);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f2) {
        e eVar = this.f36697x;
        if (eVar != null) {
            eVar.I(f2);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        e eVar = this.f36697x;
        if (eVar != null) {
            eVar.I(eVar.f41156F0.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        e eVar = this.f36697x;
        if (eVar != null) {
            eVar.H(com.bumptech.glide.g.h(eVar.f41156F0, i));
        }
        d();
    }

    public void setCloseIconSize(float f2) {
        e eVar = this.f36697x;
        if (eVar != null) {
            eVar.J(f2);
        }
    }

    public void setCloseIconSizeResource(int i) {
        e eVar = this.f36697x;
        if (eVar != null) {
            eVar.J(eVar.f41156F0.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f2) {
        e eVar = this.f36697x;
        if (eVar != null) {
            eVar.K(f2);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        e eVar = this.f36697x;
        if (eVar != null) {
            eVar.K(eVar.f41156F0.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        e eVar = this.f36697x;
        if (eVar != null) {
            eVar.L(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        e eVar = this.f36697x;
        if (eVar != null) {
            eVar.L(E.e.c(eVar.f41156F0, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // m.C4720q, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // m.C4720q, android.widget.TextView
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
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i4, int i6, int i9) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i6 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i4, i6, i9);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i4, int i6, int i9) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i6 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i, i4, i6, i9);
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        e eVar = this.f36697x;
        if (eVar != null) {
            eVar.i(f2);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f36697x == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        e eVar = this.f36697x;
        if (eVar != null) {
            eVar.f41188c1 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z6) {
        this.f36689G = z6;
        b(this.f36691I);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(C4771b c4771b) {
        e eVar = this.f36697x;
        if (eVar != null) {
            eVar.f41205w0 = c4771b;
        }
    }

    public void setHideMotionSpecResource(int i) {
        e eVar = this.f36697x;
        if (eVar != null) {
            eVar.f41205w0 = C4771b.a(eVar.f41156F0, i);
        }
    }

    public void setIconEndPadding(float f2) {
        e eVar = this.f36697x;
        if (eVar != null) {
            eVar.N(f2);
        }
    }

    public void setIconEndPaddingResource(int i) {
        e eVar = this.f36697x;
        if (eVar != null) {
            eVar.N(eVar.f41156F0.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f2) {
        e eVar = this.f36697x;
        if (eVar != null) {
            eVar.O(f2);
        }
    }

    public void setIconStartPaddingResource(int i) {
        e eVar = this.f36697x;
        if (eVar != null) {
            eVar.O(eVar.f41156F0.getResources().getDimension(i));
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.f36697x == null) {
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
        e eVar = this.f36697x;
        if (eVar != null) {
            eVar.f41190e1 = i;
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
        this.f36684B = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f36683A = onClickListener;
        d();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        e eVar = this.f36697x;
        if (eVar != null) {
            eVar.P(colorStateList);
        }
        this.f36697x.getClass();
        e();
    }

    public void setRippleColorResource(int i) {
        e eVar = this.f36697x;
        if (eVar != null) {
            eVar.P(E.e.c(eVar.f41156F0, i));
            this.f36697x.getClass();
            e();
        }
    }

    @Override // G3.v
    public void setShapeAppearanceModel(k kVar) {
        this.f36697x.setShapeAppearanceModel(kVar);
    }

    public void setShowMotionSpec(C4771b c4771b) {
        e eVar = this.f36697x;
        if (eVar != null) {
            eVar.f41204v0 = c4771b;
        }
    }

    public void setShowMotionSpecResource(int i) {
        e eVar = this.f36697x;
        if (eVar != null) {
            eVar.f41204v0 = C4771b.a(eVar.f41156F0, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z6) {
        if (!z6) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z6);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        e eVar = this.f36697x;
        if (eVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(eVar.f41189d1 ? null : charSequence, bufferType);
        e eVar2 = this.f36697x;
        if (eVar2 == null || TextUtils.equals(eVar2.f41181X, charSequence)) {
            return;
        }
        eVar2.f41181X = charSequence;
        eVar2.f41162L0.f175d = true;
        eVar2.invalidateSelf();
        eVar2.u();
    }

    public void setTextAppearance(D3.d dVar) {
        e eVar = this.f36697x;
        if (eVar != null) {
            eVar.Q(dVar);
        }
        g();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f2) {
        e eVar = this.f36697x;
        if (eVar == null || eVar.f41153B0 == f2) {
            return;
        }
        eVar.f41153B0 = f2;
        eVar.invalidateSelf();
        eVar.u();
    }

    public void setTextEndPaddingResource(int i) {
        e eVar = this.f36697x;
        if (eVar != null) {
            float dimension = eVar.f41156F0.getResources().getDimension(i);
            if (eVar.f41153B0 != dimension) {
                eVar.f41153B0 = dimension;
                eVar.invalidateSelf();
                eVar.u();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f2) {
        super.setTextSize(i, f2);
        e eVar = this.f36697x;
        if (eVar != null) {
            float applyDimension = TypedValue.applyDimension(i, f2, getResources().getDisplayMetrics());
            l lVar = eVar.f41162L0;
            D3.d dVar = lVar.f177f;
            if (dVar != null) {
                dVar.f622k = applyDimension;
                lVar.f172a.setTextSize(applyDimension);
                eVar.u();
                eVar.invalidateSelf();
            }
        }
        g();
    }

    public void setTextStartPadding(float f2) {
        e eVar = this.f36697x;
        if (eVar == null || eVar.f41152A0 == f2) {
            return;
        }
        eVar.f41152A0 = f2;
        eVar.invalidateSelf();
        eVar.u();
    }

    public void setTextStartPaddingResource(int i) {
        e eVar = this.f36697x;
        if (eVar != null) {
            float dimension = eVar.f41156F0.getResources().getDimension(i);
            if (eVar.f41152A0 != dimension) {
                eVar.f41152A0 = dimension;
                eVar.invalidateSelf();
                eVar.u();
            }
        }
    }

    public void setCloseIconVisible(boolean z6) {
        e eVar = this.f36697x;
        if (eVar != null) {
            eVar.M(z6);
        }
        d();
    }

    public void setCheckedIconVisible(boolean z6) {
        e eVar = this.f36697x;
        if (eVar != null) {
            eVar.z(z6);
        }
    }

    public void setChipIconVisible(boolean z6) {
        e eVar = this.f36697x;
        if (eVar != null) {
            eVar.E(z6);
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
        e eVar = this.f36697x;
        if (eVar != null) {
            eVar.Q(new D3.d(eVar.f41156F0, i));
        }
        g();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        e eVar = this.f36697x;
        if (eVar != null) {
            eVar.Q(new D3.d(eVar.f41156F0, i));
        }
        g();
    }

    public void setInternalOnCheckedChangeListener(A3.g gVar) {
    }
}
