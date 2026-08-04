package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import com.gamericefishpro.space.d9.h;
import com.gamericefishpro.space.fa.l;
import com.gamericefishpro.space.hj.c;
import com.gamericefishpro.space.ka.b0;
import com.gamericefishpro.space.ka.c0;
import com.gamericefishpro.space.ka.d0;
import com.gamericefishpro.space.ka.j;
import com.gamericefishpro.space.ka.m;
import com.gamericefishpro.space.ka.y;
import com.gamericefishpro.space.n.n;
import com.gamericefishpro.space.r4.e;
import com.gamericefishpro.space.r4.f;
import com.gamericefishpro.space.tb.u;
import com.gamericefishpro.space.y9.a;
import com.gamericefishpro.space.y9.b;
import com.gamericefishpro.space.y9.d;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class MaterialButton extends n implements Checkable, y {
    public static final int[] b0 = {R.attr.state_checkable};
    public static final int[] c0 = {R.attr.state_checked};
    public static final a d0 = new a();
    public ColorStateList A;
    public Drawable B;
    public String C;
    public int D;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public boolean I;
    public int J;
    public int K;
    public float L;
    public int M;
    public int N;
    public LinearLayout.LayoutParams O;
    public boolean P;
    public int Q;
    public boolean R;
    public int S;
    public d0 T;
    public int U;
    public float V;
    public float W;
    public e a0;
    public final com.gamericefishpro.space.y9.e v;
    public final LinkedHashSet w;
    public b y;
    public PorterDuff.Mode z;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(com.gamericefishpro.space.oa.a.b(context, attributeSet, com.gamericefishpro.space.R.attr.materialButtonStyle, com.gamericefishpro.space.R.style.Widget_MaterialComponents_Button, new int[]{com.gamericefishpro.space.R.attr.materialSizeOverlay}), attributeSet);
        this.w = new LinkedHashSet();
        this.H = false;
        this.I = false;
        this.K = -1;
        this.L = -1.0f;
        this.M = -1;
        this.N = -1;
        this.S = -1;
        Context context2 = getContext();
        TypedArray typedArrayE = l.e(context2, attributeSet, com.gamericefishpro.space.s9.a.i, com.gamericefishpro.space.R.attr.materialButtonStyle, com.gamericefishpro.space.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.G = typedArrayE.getDimensionPixelSize(13, 0);
        int i = typedArrayE.getInt(16, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.z = l.f(i, mode);
        this.A = c.v(getContext(), typedArrayE, 15);
        this.B = c.y(getContext(), typedArrayE, 11);
        this.J = typedArrayE.getInteger(12, 1);
        this.D = typedArrayE.getDimensionPixelSize(14, 0);
        b0 b0VarB = b0.b(context2, typedArrayE, 19);
        com.gamericefishpro.space.ka.n nVarC = b0VarB != null ? b0VarB.c() : com.gamericefishpro.space.ka.n.b(context2, attributeSet, com.gamericefishpro.space.R.attr.materialButtonStyle, com.gamericefishpro.space.R.style.Widget_MaterialComponents_Button).a();
        boolean z = typedArrayE.getBoolean(17, false);
        com.gamericefishpro.space.y9.e eVar = new com.gamericefishpro.space.y9.e(this, nVarC);
        this.v = eVar;
        eVar.f = typedArrayE.getDimensionPixelOffset(2, 0);
        eVar.g = typedArrayE.getDimensionPixelOffset(3, 0);
        eVar.h = typedArrayE.getDimensionPixelOffset(4, 0);
        eVar.i = typedArrayE.getDimensionPixelOffset(5, 0);
        if (typedArrayE.hasValue(9)) {
            int dimensionPixelSize = typedArrayE.getDimensionPixelSize(9, -1);
            eVar.j = dimensionPixelSize;
            float f = dimensionPixelSize;
            m mVarF = eVar.b.f();
            mVarF.e = new com.gamericefishpro.space.ka.a(f);
            mVarF.f = new com.gamericefishpro.space.ka.a(f);
            mVarF.g = new com.gamericefishpro.space.ka.a(f);
            mVarF.h = new com.gamericefishpro.space.ka.a(f);
            eVar.b = mVarF.a();
            eVar.c = null;
            eVar.d();
            eVar.s = true;
        }
        eVar.k = typedArrayE.getDimensionPixelSize(22, 0);
        eVar.l = l.f(typedArrayE.getInt(8, -1), mode);
        eVar.m = c.v(getContext(), typedArrayE, 7);
        eVar.n = c.v(getContext(), typedArrayE, 21);
        eVar.o = c.v(getContext(), typedArrayE, 18);
        eVar.t = typedArrayE.getBoolean(6, false);
        eVar.w = typedArrayE.getDimensionPixelSize(10, 0);
        eVar.u = typedArrayE.getBoolean(23, true);
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (typedArrayE.hasValue(0)) {
            eVar.r = true;
            setSupportBackgroundTintList(eVar.m);
            setSupportBackgroundTintMode(eVar.l);
        } else {
            eVar.c();
        }
        setPaddingRelative(paddingStart + eVar.f, paddingTop + eVar.h, paddingEnd + eVar.g, paddingBottom + eVar.i);
        setCheckedInternal(typedArrayE.getBoolean(1, false));
        if (b0VarB != null) {
            eVar.d = d();
            if (eVar.c != null) {
                eVar.d();
            }
            eVar.c = b0VarB;
            eVar.d();
        }
        setOpticalCenterEnabled(z);
        typedArrayE.recycle();
        setCompoundDrawablePadding(this.G);
        h(this.B != null);
    }

    public static /* synthetic */ void a(MaterialButton materialButton) {
        materialButton.Q = materialButton.getOpticalCenterShift();
        materialButton.j();
        materialButton.invalidate();
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment == 1) {
            return getGravityTextAlignment();
        }
        if (textAlignment == 6 || textAlignment == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getDisplayedWidthIncrease() {
        return this.V;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity != 1) {
            return (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private int getOpticalCenterShift() {
        j jVarA;
        if (this.P && this.R && (jVarA = this.v.a(false)) != null) {
            return (int) (jVarA.h() * 0.11f);
        }
        return 0;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(fMax);
    }

    private void setCheckedInternal(boolean z) {
        com.gamericefishpro.space.y9.e eVar = this.v;
        if (eVar == null || !eVar.t || this.H == z) {
            return;
        }
        this.H = z;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
            boolean z2 = this.H;
            if (!materialButtonToggleGroup.E) {
                materialButtonToggleGroup.f(getId(), z2);
            }
        }
        if (this.I) {
            return;
        }
        this.I = true;
        Iterator it = this.w.iterator();
        if (it.hasNext()) {
            throw com.gamericefishpro.space.m5.a.f(it);
        }
        this.I = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayedWidthIncrease(float f) {
        MaterialButton materialButton;
        MaterialButton materialButton2;
        if (this.V != f) {
            this.V = f;
            j();
            invalidate();
            if (getParent() instanceof d) {
                d dVar = (d) getParent();
                int i = (int) this.V;
                int iIndexOfChild = dVar.indexOfChild(this);
                if (iIndexOfChild < 0) {
                    return;
                }
                int i2 = iIndexOfChild - 1;
                while (true) {
                    materialButton = null;
                    if (i2 < 0) {
                        materialButton2 = null;
                        break;
                    } else {
                        if (dVar.c(i2)) {
                            materialButton2 = (MaterialButton) dVar.getChildAt(i2);
                            break;
                        }
                        i2--;
                    }
                }
                int childCount = dVar.getChildCount();
                while (true) {
                    iIndexOfChild++;
                    if (iIndexOfChild >= childCount) {
                        break;
                    } else if (dVar.c(iIndexOfChild)) {
                        materialButton = (MaterialButton) dVar.getChildAt(iIndexOfChild);
                        break;
                    }
                }
                if (materialButton2 == null && materialButton == null) {
                    return;
                }
                if (materialButton2 == null) {
                    materialButton.setDisplayedWidthDecrease(i);
                }
                if (materialButton == null) {
                    materialButton2.setDisplayedWidthDecrease(i);
                }
                if (materialButton2 == null || materialButton == null) {
                    return;
                }
                materialButton2.setDisplayedWidthDecrease(i / 2);
                materialButton.setDisplayedWidthDecrease((i + 1) / 2);
            }
        }
    }

    public final f d() {
        Context context = getContext();
        TypedValue typedValueI = h.I(context, com.gamericefishpro.space.R.attr.motionSpringFastSpatial);
        int[] iArr = com.gamericefishpro.space.s9.a.n;
        TypedArray typedArrayObtainStyledAttributes = typedValueI == null ? context.obtainStyledAttributes(null, iArr, 0, com.gamericefishpro.space.R.style.Motion_Material3_Spring_Standard_Fast_Spatial) : context.obtainStyledAttributes(typedValueI.resourceId, iArr);
        f fVar = new f();
        try {
            float f = typedArrayObtainStyledAttributes.getFloat(1, Float.MIN_VALUE);
            if (f == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have stiffness value.");
            }
            float f2 = typedArrayObtainStyledAttributes.getFloat(0, Float.MIN_VALUE);
            if (f2 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have a damping value.");
            }
            fVar.b(f);
            fVar.a(f2);
            typedArrayObtainStyledAttributes.recycle();
            return fVar;
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final boolean e() {
        com.gamericefishpro.space.y9.e eVar = this.v;
        return (eVar == null || eVar.r) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0080  */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    public final void f(boolean z) {
        int i;
        if (this.T == null) {
            return;
        }
        if (this.a0 == null) {
            e eVar = new e(this, d0);
            this.a0 = eVar;
            eVar.m = d();
        }
        if (this.R) {
            int i2 = this.U;
            d0 d0Var = this.T;
            int[] drawableState = getDrawableState();
            int[][] iArr = d0Var.c;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                i = -1;
                if (i4 >= d0Var.a) {
                    i4 = -1;
                    break;
                } else if (StateSet.stateSetMatches(iArr[i4], drawableState)) {
                    break;
                } else {
                    i4++;
                }
            }
            if (i4 < 0) {
                int[] iArr2 = StateSet.WILD_CARD;
                int[][] iArr3 = d0Var.c;
                for (int i5 = 0; i5 < d0Var.a; i5++) {
                    if (StateSet.stateSetMatches(iArr3[i5], iArr2)) {
                        i = i5;
                        break;
                    }
                }
                i4 = i;
            }
            c0 c0Var = (c0) (i4 < 0 ? d0Var.b : d0Var.d[i4]).e;
            int width = getWidth();
            float f = c0Var.b;
            int i6 = c0Var.a;
            if (i6 != 1) {
                if (i6 == 2) {
                }
                this.a0.a(Math.min(i2, i3));
                if (z) {
                    this.a0.d();
                }
            }
            f *= width;
            i3 = (int) f;
            this.a0.a(Math.min(i2, i3));
            if (z) {
                this.a0.d();
            }
        }
    }

    public final void g() {
        int i = this.J;
        if (i == 1 || i == 2) {
            setCompoundDrawablesRelative(this.B, null, null, null);
            return;
        }
        if (i == 3 || i == 4) {
            setCompoundDrawablesRelative(null, null, this.B, null);
        } else if (i == 16 || i == 32) {
            setCompoundDrawablesRelative(null, this.B, null, null);
        }
    }

    public String getA11yClassName() {
        if (!TextUtils.isEmpty(this.C)) {
            return this.C;
        }
        com.gamericefishpro.space.y9.e eVar = this.v;
        return ((eVar == null || !eVar.t) ? Button.class : CompoundButton.class).getName();
    }

    public int getAllowedWidthDecrease() {
        return this.S;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (e()) {
            return this.v.j;
        }
        return 0;
    }

    public f getCornerSpringForce() {
        return this.v.d;
    }

    public Drawable getIcon() {
        return this.B;
    }

    public int getIconGravity() {
        return this.J;
    }

    public int getIconPadding() {
        return this.G;
    }

    public int getIconSize() {
        return this.D;
    }

    public ColorStateList getIconTint() {
        return this.A;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.z;
    }

    public int getInsetBottom() {
        return this.v.i;
    }

    public int getInsetTop() {
        return this.v.h;
    }

    public ColorStateList getRippleColor() {
        if (e()) {
            return this.v.o;
        }
        return null;
    }

    public com.gamericefishpro.space.ka.n getShapeAppearanceModel() {
        if (e()) {
            return this.v.b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public b0 getStateListShapeAppearanceModel() {
        if (e()) {
            return this.v.c;
        }
        throw new IllegalStateException("Attempted to get StateListShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (e()) {
            return this.v.n;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (e()) {
            return this.v.k;
        }
        return 0;
    }

    @Override // com.gamericefishpro.space.n.n
    public ColorStateList getSupportBackgroundTintList() {
        return e() ? this.v.m : super.getSupportBackgroundTintList();
    }

    @Override // com.gamericefishpro.space.n.n
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return e() ? this.v.l : super.getSupportBackgroundTintMode();
    }

    public final void h(boolean z) {
        Drawable drawable = this.B;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.B = drawableMutate;
            drawableMutate.setTintList(this.A);
            PorterDuff.Mode mode = this.z;
            if (mode != null) {
                this.B.setTintMode(mode);
            }
            int intrinsicWidth = this.D;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.B.getIntrinsicWidth();
            }
            int intrinsicHeight = this.D;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.B.getIntrinsicHeight();
            }
            Drawable drawable2 = this.B;
            int i = this.E;
            int i2 = this.F;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.B.setVisible(true, z);
        }
        if (z) {
            g();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i3 = this.J;
        if (((i3 == 1 || i3 == 2) && drawable3 != this.B) || (((i3 == 3 || i3 == 4) && drawable5 != this.B) || ((i3 == 16 || i3 == 32) && drawable4 != this.B))) {
            g();
        }
    }

    public final void i(int i, int i2) {
        if (this.B == null || getLayout() == null) {
            return;
        }
        int i3 = this.J;
        if (i3 != 1 && i3 != 2 && i3 != 3 && i3 != 4) {
            if (i3 == 16 || i3 == 32) {
                this.E = 0;
                if (i3 == 16) {
                    this.F = 0;
                    h(false);
                    return;
                }
                int intrinsicHeight = this.D;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.B.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i2 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.G) - getPaddingBottom()) / 2);
                if (this.F != iMax) {
                    this.F = iMax;
                    h(false);
                    return;
                }
                return;
            }
            return;
        }
        this.F = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i4 = this.J;
        if (i4 == 1 || i4 == 3 || ((i4 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i4 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.E = 0;
            h(false);
            return;
        }
        int intrinsicWidth = this.D;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.B.getIntrinsicWidth();
        }
        int textLayoutWidth = ((((i - getTextLayoutWidth()) - getPaddingEnd()) - intrinsicWidth) - this.G) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.J == 4)) {
            textLayoutWidth = -textLayoutWidth;
        }
        if (this.E != textLayoutWidth) {
            this.E = textLayoutWidth;
            h(false);
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.H;
    }

    public final void j() {
        int i = (int) (this.V - this.W);
        int i2 = (i / 2) + this.Q;
        getLayoutParams().width = (int) (this.L + i);
        setPaddingRelative(this.M + i2, getPaddingTop(), (this.N + i) - i2, getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (e()) {
            com.gamericefishpro.space.i.a.O(this, this.v.a(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        com.gamericefishpro.space.y9.e eVar = this.v;
        if (eVar != null && eVar.t) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, b0);
        }
        if (this.H) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, c0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // com.gamericefishpro.space.n.n, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.H);
    }

    @Override // com.gamericefishpro.space.n.n, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        com.gamericefishpro.space.y9.e eVar = this.v;
        accessibilityNodeInfo.setCheckable(eVar != null && eVar.t);
        accessibilityNodeInfo.setChecked(this.H);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // com.gamericefishpro.space.n.n, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        i(getMeasuredWidth(), getMeasuredHeight());
        int i6 = getResources().getConfiguration().orientation;
        if (this.K != i6) {
            this.K = i6;
            this.L = -1.0f;
        }
        if (this.L == -1.0f) {
            this.L = getMeasuredWidth();
            if (this.O == null && (getParent() instanceof d) && ((d) getParent()).getButtonSizeChange() != null) {
                this.O = (LinearLayout.LayoutParams) getLayoutParams();
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.O);
                layoutParams.width = (int) this.L;
                setLayoutParams(layoutParams);
            }
        }
        boolean z2 = false;
        if (this.S == -1) {
            if (this.B == null) {
                i5 = 0;
            } else {
                int iconPadding = getIconPadding();
                int intrinsicWidth = this.D;
                if (intrinsicWidth == 0) {
                    intrinsicWidth = this.B.getIntrinsicWidth();
                }
                i5 = iconPadding + intrinsicWidth;
            }
            this.S = (getMeasuredWidth() - getTextLayoutWidth()) - i5;
        }
        if (this.M == -1) {
            this.M = getPaddingStart();
        }
        if (this.N == -1) {
            this.N = getPaddingEnd();
        }
        if ((getParent() instanceof d) && ((d) getParent()).getOrientation() == 0) {
            z2 = true;
        }
        this.R = z2;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof com.gamericefishpro.space.y9.c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        com.gamericefishpro.space.y9.c cVar = (com.gamericefishpro.space.y9.c) parcelable;
        super.onRestoreInstanceState(cVar.d);
        setChecked(cVar.i);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        com.gamericefishpro.space.y9.c cVar = new com.gamericefishpro.space.y9.c(super.onSaveInstanceState());
        cVar.i = this.H;
        return cVar;
    }

    @Override // com.gamericefishpro.space.n.n, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (isEnabled() && this.v.u) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.B != null) {
            if (this.B.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.C = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (!e()) {
            super.setBackgroundColor(i);
            return;
        }
        com.gamericefishpro.space.y9.e eVar = this.v;
        if (eVar.a(false) != null) {
            eVar.a(false).setTint(i);
        }
    }

    @Override // com.gamericefishpro.space.n.n, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!e()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        com.gamericefishpro.space.y9.e eVar = this.v;
        eVar.r = true;
        MaterialButton materialButton = eVar.a;
        materialButton.setSupportBackgroundTintList(eVar.m);
        materialButton.setSupportBackgroundTintMode(eVar.l);
        super.setBackgroundDrawable(drawable);
    }

    @Override // com.gamericefishpro.space.n.n, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? com.gamericefishpro.space.u6.f.x(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (e()) {
            this.v.t = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedInternal(z);
    }

    public void setCornerRadius(int i) {
        if (e()) {
            com.gamericefishpro.space.y9.e eVar = this.v;
            if (eVar.s && eVar.j == i) {
                return;
            }
            eVar.j = i;
            eVar.s = true;
            float f = i;
            m mVarF = eVar.b.f();
            mVarF.e = new com.gamericefishpro.space.ka.a(f);
            mVarF.f = new com.gamericefishpro.space.ka.a(f);
            mVarF.g = new com.gamericefishpro.space.ka.a(f);
            mVarF.h = new com.gamericefishpro.space.ka.a(f);
            eVar.b = mVarF.a();
            eVar.c = null;
            eVar.d();
        }
    }

    public void setCornerRadiusResource(int i) {
        if (e()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCornerSpringForce(f fVar) {
        com.gamericefishpro.space.y9.e eVar = this.v;
        eVar.d = fVar;
        if (eVar.c != null) {
            eVar.d();
        }
    }

    public void setDisplayedWidthDecrease(int i) {
        this.W = Math.min(i, this.S);
        j();
        invalidate();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (e()) {
            this.v.a(false).m(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.B != drawable) {
            this.B = drawable;
            h(true);
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.J != i) {
            this.J = i;
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.G != i) {
            this.G = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? com.gamericefishpro.space.u6.f.x(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.D != i) {
            this.D = i;
            h(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.A != colorStateList) {
            this.A = colorStateList;
            h(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.z != mode) {
            this.z = mode;
            h(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(com.gamericefishpro.space.s3.a.c(getContext(), i));
    }

    public void setInsetBottom(int i) {
        com.gamericefishpro.space.y9.e eVar = this.v;
        eVar.b(eVar.h, i);
    }

    public void setInsetTop(int i) {
        com.gamericefishpro.space.y9.e eVar = this.v;
        eVar.b(i, eVar.i);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(b bVar) {
        this.y = bVar;
    }

    public void setOpticalCenterEnabled(boolean z) {
        if (this.P != z) {
            this.P = z;
            com.gamericefishpro.space.y9.e eVar = this.v;
            if (z) {
                com.gamericefishpro.space.a8.b bVar = new com.gamericefishpro.space.a8.b(15, this);
                eVar.e = bVar;
                j jVarA = eVar.a(false);
                if (jVarA != null) {
                    jVarA.W = bVar;
                }
            } else {
                eVar.e = null;
                j jVarA2 = eVar.a(false);
                if (jVarA2 != null) {
                    jVarA2.W = null;
                }
            }
            post(new com.appsflyer.a(24, this));
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        b bVar = this.y;
        if (bVar != null) {
            ((MaterialButtonToggleGroup) ((u) bVar).e).invalidate();
        }
        super.setPressed(z);
        f(false);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (e()) {
            com.gamericefishpro.space.y9.e eVar = this.v;
            MaterialButton materialButton = eVar.a;
            if (eVar.o != colorStateList) {
                eVar.o = colorStateList;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(com.gamericefishpro.space.ia.a.a(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (e()) {
            setRippleColor(com.gamericefishpro.space.s3.a.c(getContext(), i));
        }
    }

    @Override // com.gamericefishpro.space.ka.y
    public void setShapeAppearanceModel(com.gamericefishpro.space.ka.n nVar) {
        if (!e()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        com.gamericefishpro.space.y9.e eVar = this.v;
        eVar.b = nVar;
        eVar.c = null;
        eVar.d();
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (e()) {
            com.gamericefishpro.space.y9.e eVar = this.v;
            eVar.q = z;
            eVar.e();
        }
    }

    public void setSizeChange(d0 d0Var) {
        if (this.T != d0Var) {
            this.T = d0Var;
            f(true);
        }
    }

    public void setStateListShapeAppearanceModel(b0 b0Var) {
        if (!e()) {
            throw new IllegalStateException("Attempted to set StateListShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        com.gamericefishpro.space.y9.e eVar = this.v;
        if (eVar.d == null && b0Var.d()) {
            eVar.d = d();
            if (eVar.c != null) {
                eVar.d();
            }
        }
        eVar.c = b0Var;
        eVar.d();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (e()) {
            com.gamericefishpro.space.y9.e eVar = this.v;
            if (eVar.n != colorStateList) {
                eVar.n = colorStateList;
                eVar.e();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (e()) {
            setStrokeColor(com.gamericefishpro.space.s3.a.c(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (e()) {
            com.gamericefishpro.space.y9.e eVar = this.v;
            if (eVar.k != i) {
                eVar.k = i;
                eVar.e();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (e()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // com.gamericefishpro.space.n.n
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!e()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        com.gamericefishpro.space.y9.e eVar = this.v;
        if (eVar.m != colorStateList) {
            eVar.m = colorStateList;
            if (eVar.a(false) != null) {
                eVar.a(false).setTintList(eVar.m);
            }
        }
    }

    @Override // com.gamericefishpro.space.n.n
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!e()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        com.gamericefishpro.space.y9.e eVar = this.v;
        if (eVar.l != mode) {
            eVar.l = mode;
            if (eVar.a(false) == null || eVar.l == null) {
                return;
            }
            eVar.a(false).setTintMode(eVar.l);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.v.u = z;
    }

    @Override // android.widget.TextView
    public void setWidth(int i) {
        this.L = -1.0f;
        super.setWidth(i);
    }

    public void setWidthChangeMax(int i) {
        if (this.U != i) {
            this.U = i;
            f(true);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.H);
    }
}
