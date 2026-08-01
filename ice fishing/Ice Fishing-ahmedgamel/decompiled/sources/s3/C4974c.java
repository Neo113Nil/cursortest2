package s3;

import D.y;
import E0.d;
import E0.e;
import E0.f;
import F.j;
import F.q;
import L3.F;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import com.anythink.expressad.foundation.h.k;
import com.icefishinggame.icefishinggamemultigames.C5275R;
import j4.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import k3.AbstractC4632a;
import m.C4707q;

/* renamed from: s3.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4974c extends C4707q {

    /* renamed from: R, reason: collision with root package name */
    public static final int[] f40466R = {C5275R.attr.state_indeterminate};

    /* renamed from: S, reason: collision with root package name */
    public static final int[] f40467S = {C5275R.attr.state_error};

    /* renamed from: T, reason: collision with root package name */
    public static final int[][] f40468T = {new int[]{R.attr.state_enabled, C5275R.attr.state_error}, new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: U, reason: collision with root package name */
    public static final int f40469U = Resources.getSystem().getIdentifier("btn_check_material_anim", k.f19632c, com.onesignal.core.internal.backend.impl.a.TURBINE_FEATURES_PLATFORM_ANDROID);

    /* renamed from: A, reason: collision with root package name */
    public boolean f40470A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f40471B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f40472C;

    /* renamed from: D, reason: collision with root package name */
    public CharSequence f40473D;

    /* renamed from: E, reason: collision with root package name */
    public Drawable f40474E;

    /* renamed from: F, reason: collision with root package name */
    public Drawable f40475F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f40476G;

    /* renamed from: H, reason: collision with root package name */
    public ColorStateList f40477H;

    /* renamed from: I, reason: collision with root package name */
    public ColorStateList f40478I;
    public PorterDuff.Mode J;

    /* renamed from: K, reason: collision with root package name */
    public int f40479K;

    /* renamed from: L, reason: collision with root package name */
    public int[] f40480L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f40481M;

    /* renamed from: N, reason: collision with root package name */
    public CharSequence f40482N;

    /* renamed from: O, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f40483O;

    /* renamed from: P, reason: collision with root package name */
    public final f f40484P;

    /* renamed from: Q, reason: collision with root package name */
    public final C4972a f40485Q;

    /* renamed from: x, reason: collision with root package name */
    public final LinkedHashSet f40486x;

    /* renamed from: y, reason: collision with root package name */
    public final LinkedHashSet f40487y;

    /* renamed from: z, reason: collision with root package name */
    public ColorStateList f40488z;

    public C4974c(Context context, AttributeSet attributeSet) {
        super(J3.a.a(context, attributeSet, C5275R.attr.checkboxStyle, C5275R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, C5275R.attr.checkboxStyle);
        this.f40486x = new LinkedHashSet();
        this.f40487y = new LinkedHashSet();
        Context context2 = getContext();
        f fVar = new f(context2);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = q.f879a;
        Drawable a9 = j.a(resources, C5275R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        fVar.f670n = a9;
        a9.setCallback(fVar.f669y);
        new e(0, fVar.f670n.getConstantState());
        this.f40484P = fVar;
        this.f40485Q = new C4972a(this);
        Context context3 = getContext();
        this.f40474E = U.c.a(this);
        this.f40477H = getSuperButtonTintList();
        setSupportButtonTintList(null);
        int[] iArr = AbstractC4632a.f38641n;
        y3.k.a(context3, attributeSet, C5275R.attr.checkboxStyle, C5275R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        y3.k.b(context3, attributeSet, iArr, C5275R.attr.checkboxStyle, C5275R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        TypedArray obtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, iArr, C5275R.attr.checkboxStyle, C5275R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        g gVar = new g(context3, obtainStyledAttributes);
        this.f40475F = gVar.i(2);
        if (this.f40474E != null && F.q(context3, C5275R.attr.isMaterial3Theme, false)) {
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
            if (resourceId == f40469U && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.f40474E = com.bumptech.glide.g.e(context3, C5275R.drawable.mtrl_checkbox_button);
                this.f40476G = true;
                if (this.f40475F == null) {
                    this.f40475F = com.bumptech.glide.g.e(context3, C5275R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.f40478I = O3.b.n(context3, gVar, 3);
        this.J = y3.k.g(obtainStyledAttributes.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.f40470A = obtainStyledAttributes.getBoolean(10, false);
        this.f40471B = obtainStyledAttributes.getBoolean(6, true);
        this.f40472C = obtainStyledAttributes.getBoolean(9, false);
        this.f40473D = obtainStyledAttributes.getText(8);
        if (obtainStyledAttributes.hasValue(7)) {
            setCheckedState(obtainStyledAttributes.getInt(7, 0));
        }
        gVar.t();
        a();
    }

    private String getButtonStateDescription() {
        int i = this.f40479K;
        return i == 1 ? getResources().getString(C5275R.string.mtrl_checkbox_state_description_checked) : i == 0 ? getResources().getString(C5275R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(C5275R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f40488z == null) {
            int l9 = V2.a.l(C5275R.attr.colorControlActivated, this);
            int l10 = V2.a.l(C5275R.attr.colorError, this);
            int l11 = V2.a.l(C5275R.attr.colorSurface, this);
            int l12 = V2.a.l(C5275R.attr.colorOnSurface, this);
            this.f40488z = new ColorStateList(f40468T, new int[]{V2.a.r(l11, l10, 1.0f), V2.a.r(l11, l9, 1.0f), V2.a.r(l11, l12, 0.54f), V2.a.r(l11, l12, 0.38f), V2.a.r(l11, l12, 0.38f)});
        }
        return this.f40488z;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f40477H;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final void a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        D0.k kVar;
        Drawable drawable = this.f40474E;
        ColorStateList colorStateList3 = this.f40477H;
        PorterDuff.Mode b9 = U.b.b(this);
        if (drawable == null) {
            drawable = null;
        } else if (colorStateList3 != null) {
            drawable = drawable.mutate();
            if (b9 != null) {
                H.a.i(drawable, b9);
            }
        }
        this.f40474E = drawable;
        Drawable drawable2 = this.f40475F;
        ColorStateList colorStateList4 = this.f40478I;
        PorterDuff.Mode mode = this.J;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (colorStateList4 != null) {
            drawable2 = drawable2.mutate();
            if (mode != null) {
                H.a.i(drawable2, mode);
            }
        }
        this.f40475F = drawable2;
        if (this.f40476G) {
            f fVar = this.f40484P;
            if (fVar != null) {
                Drawable drawable3 = fVar.f670n;
                C4972a c4972a = this.f40485Q;
                if (drawable3 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable3;
                    if (c4972a.f40463a == null) {
                        c4972a.f40463a = new E0.b(c4972a);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(c4972a.f40463a);
                }
                ArrayList arrayList = fVar.f668x;
                d dVar = fVar.f665u;
                if (arrayList != null && c4972a != null) {
                    arrayList.remove(c4972a);
                    if (fVar.f668x.size() == 0 && (kVar = fVar.f667w) != null) {
                        dVar.f660b.removeListener(kVar);
                        fVar.f667w = null;
                    }
                }
                Drawable drawable4 = fVar.f670n;
                if (drawable4 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable4;
                    if (c4972a.f40463a == null) {
                        c4972a.f40463a = new E0.b(c4972a);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(c4972a.f40463a);
                } else if (c4972a != null) {
                    if (fVar.f668x == null) {
                        fVar.f668x = new ArrayList();
                    }
                    if (!fVar.f668x.contains(c4972a)) {
                        fVar.f668x.add(c4972a);
                        if (fVar.f667w == null) {
                            fVar.f667w = new D0.k(1, fVar);
                        }
                        dVar.f660b.addListener(fVar.f667w);
                    }
                }
            }
            Drawable drawable5 = this.f40474E;
            if ((drawable5 instanceof AnimatedStateListDrawable) && fVar != null) {
                ((AnimatedStateListDrawable) drawable5).addTransition(C5275R.id.checked, C5275R.id.unchecked, fVar, false);
                ((AnimatedStateListDrawable) this.f40474E).addTransition(C5275R.id.indeterminate, C5275R.id.unchecked, fVar, false);
            }
        }
        Drawable drawable6 = this.f40474E;
        if (drawable6 != null && (colorStateList2 = this.f40477H) != null) {
            H.a.h(drawable6, colorStateList2);
        }
        Drawable drawable7 = this.f40475F;
        if (drawable7 != null && (colorStateList = this.f40478I) != null) {
            H.a.h(drawable7, colorStateList);
        }
        Drawable drawable8 = this.f40474E;
        Drawable drawable9 = this.f40475F;
        if (drawable8 == null) {
            drawable8 = drawable9;
        } else if (drawable9 != null) {
            int intrinsicWidth = drawable9.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable8.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable9.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable8.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable8.getIntrinsicWidth() || intrinsicHeight > drawable8.getIntrinsicHeight()) {
                float f3 = intrinsicWidth / intrinsicHeight;
                if (f3 >= drawable8.getIntrinsicWidth() / drawable8.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable8.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f3);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable8.getIntrinsicHeight();
                    intrinsicWidth = (int) (f3 * intrinsicHeight);
                }
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable8, drawable9});
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable8 = layerDrawable;
        }
        super.setButtonDrawable(drawable8);
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f40474E;
    }

    public Drawable getButtonIconDrawable() {
        return this.f40475F;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f40478I;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.J;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f40477H;
    }

    public int getCheckedState() {
        return this.f40479K;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f40473D;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.f40479K == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f40470A && this.f40477H == null && this.f40478I == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] copyOf;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, f40466R);
        }
        if (this.f40472C) {
            View.mergeDrawableStates(onCreateDrawableState, f40467S);
        }
        int i6 = 0;
        while (true) {
            if (i6 >= onCreateDrawableState.length) {
                copyOf = Arrays.copyOf(onCreateDrawableState, onCreateDrawableState.length + 1);
                copyOf[onCreateDrawableState.length] = 16842912;
                break;
            }
            int i9 = onCreateDrawableState[i6];
            if (i9 == 16842912) {
                copyOf = onCreateDrawableState;
                break;
            }
            if (i9 == 0) {
                copyOf = (int[]) onCreateDrawableState.clone();
                copyOf[i6] = 16842912;
                break;
            }
            i6++;
        }
        this.f40480L = copyOf;
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable a9;
        if (!this.f40471B || !TextUtils.isEmpty(getText()) || (a9 = U.c.a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - a9.getIntrinsicWidth()) / 2) * (y3.k.e(this) ? -1 : 1);
        int save = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
        if (getBackground() != null) {
            Rect bounds = a9.getBounds();
            H.a.f(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.f40472C) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f40473D));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C4973b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C4973b c4973b = (C4973b) parcelable;
        super.onRestoreInstanceState(c4973b.getSuperState());
        setCheckedState(c4973b.f40465n);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        C4973b c4973b = new C4973b(super.onSaveInstanceState());
        c4973b.f40465n = getCheckedState();
        return c4973b;
    }

    @Override // m.C4707q, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(com.bumptech.glide.g.e(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f40475F = drawable;
        a();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(com.bumptech.glide.g.e(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f40478I == colorStateList) {
            return;
        }
        this.f40478I = colorStateList;
        a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.J == mode) {
            return;
        }
        this.J = mode;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f40477H == colorStateList) {
            return;
        }
        this.f40477H = colorStateList;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        a();
    }

    public void setCenterIfNoTextEnabled(boolean z3) {
        this.f40471B = z3;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z3) {
        setCheckedState(z3 ? 1 : 0);
    }

    public void setCheckedState(int i) {
        AutofillManager autofillManager;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f40479K != i) {
            this.f40479K = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 30 && this.f40482N == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.f40481M) {
                return;
            }
            this.f40481M = true;
            LinkedHashSet linkedHashSet = this.f40487y;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw y.j(it);
                }
            }
            if (this.f40479K != 2 && (onCheckedChangeListener = this.f40483O) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (i6 >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f40481M = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z3) {
        super.setEnabled(z3);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f40473D = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z3) {
        if (this.f40472C == z3) {
            return;
        }
        this.f40472C = z3;
        refreshDrawableState();
        Iterator it = this.f40486x.iterator();
        if (it.hasNext()) {
            throw y.j(it);
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f40483O = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f40482N = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z3) {
        this.f40470A = z3;
        if (z3) {
            U.b.c(this, getMaterialThemeColorsTintList());
        } else {
            U.b.c(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // m.C4707q, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f40474E = drawable;
        this.f40476G = false;
        a();
    }
}
