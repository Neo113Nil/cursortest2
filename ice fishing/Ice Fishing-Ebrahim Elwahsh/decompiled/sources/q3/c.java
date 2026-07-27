package q3;

import D.y;
import E0.e;
import E0.f;
import F.j;
import F.o;
import a.AbstractC0415a;
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
import com.bumptech.glide.d;
import com.icefishing.icefishingliveapp.C5284R;
import i3.AbstractC4576a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import m.C4755q;
import m.Q0;

/* loaded from: classes2.dex */
public final class c extends C4755q {

    /* renamed from: R, reason: collision with root package name */
    public static final int[] f40130R = {C5284R.attr.state_indeterminate};

    /* renamed from: S, reason: collision with root package name */
    public static final int[] f40131S = {C5284R.attr.state_error};

    /* renamed from: T, reason: collision with root package name */
    public static final int[][] f40132T = {new int[]{R.attr.state_enabled, C5284R.attr.state_error}, new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: U, reason: collision with root package name */
    public static final int f40133U = Resources.getSystem().getIdentifier("btn_check_material_anim", k.f19790c, com.onesignal.core.internal.backend.impl.a.TURBINE_FEATURES_PLATFORM_ANDROID);

    /* renamed from: A, reason: collision with root package name */
    public boolean f40134A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f40135B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f40136C;

    /* renamed from: D, reason: collision with root package name */
    public CharSequence f40137D;

    /* renamed from: E, reason: collision with root package name */
    public Drawable f40138E;

    /* renamed from: F, reason: collision with root package name */
    public Drawable f40139F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f40140G;

    /* renamed from: H, reason: collision with root package name */
    public ColorStateList f40141H;

    /* renamed from: I, reason: collision with root package name */
    public ColorStateList f40142I;
    public PorterDuff.Mode J;

    /* renamed from: K, reason: collision with root package name */
    public int f40143K;

    /* renamed from: L, reason: collision with root package name */
    public int[] f40144L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f40145M;

    /* renamed from: N, reason: collision with root package name */
    public CharSequence f40146N;

    /* renamed from: O, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f40147O;

    /* renamed from: P, reason: collision with root package name */
    public final f f40148P;

    /* renamed from: Q, reason: collision with root package name */
    public final a f40149Q;

    /* renamed from: x, reason: collision with root package name */
    public final LinkedHashSet f40150x;

    /* renamed from: y, reason: collision with root package name */
    public final LinkedHashSet f40151y;

    /* renamed from: z, reason: collision with root package name */
    public ColorStateList f40152z;

    public c(Context context, AttributeSet attributeSet) {
        super(H3.a.a(context, attributeSet, C5284R.attr.checkboxStyle, C5284R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, C5284R.attr.checkboxStyle);
        this.f40150x = new LinkedHashSet();
        this.f40151y = new LinkedHashSet();
        Context context2 = getContext();
        f fVar = new f(context2);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = o.f927a;
        Drawable a9 = j.a(resources, C5284R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        fVar.f750n = a9;
        a9.setCallback(fVar.f749y);
        new e(0, fVar.f750n.getConstantState());
        this.f40148P = fVar;
        this.f40149Q = new a(this);
        Context context3 = getContext();
        this.f40138E = U.c.a(this);
        this.f40141H = getSuperButtonTintList();
        setSupportButtonTintList(null);
        int[] iArr = AbstractC4576a.f38304n;
        w3.k.a(context3, attributeSet, C5284R.attr.checkboxStyle, C5284R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        w3.k.b(context3, attributeSet, iArr, C5284R.attr.checkboxStyle, C5284R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        TypedArray obtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, iArr, C5284R.attr.checkboxStyle, C5284R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        Q0 q02 = new Q0(context3, obtainStyledAttributes);
        this.f40139F = q02.g(2);
        if (this.f40138E != null && AbstractC0415a.A(context3, C5284R.attr.isMaterial3Theme, false)) {
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
            if (resourceId == f40133U && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.f40138E = com.bumptech.glide.f.h(context3, C5284R.drawable.mtrl_checkbox_button);
                this.f40140G = true;
                if (this.f40139F == null) {
                    this.f40139F = com.bumptech.glide.f.h(context3, C5284R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.f40142I = d.p(context3, q02, 3);
        this.J = w3.k.g(obtainStyledAttributes.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.f40134A = obtainStyledAttributes.getBoolean(10, false);
        this.f40135B = obtainStyledAttributes.getBoolean(6, true);
        this.f40136C = obtainStyledAttributes.getBoolean(9, false);
        this.f40137D = obtainStyledAttributes.getText(8);
        if (obtainStyledAttributes.hasValue(7)) {
            setCheckedState(obtainStyledAttributes.getInt(7, 0));
        }
        q02.q();
        a();
    }

    private String getButtonStateDescription() {
        int i = this.f40143K;
        return i == 1 ? getResources().getString(C5284R.string.mtrl_checkbox_state_description_checked) : i == 0 ? getResources().getString(C5284R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(C5284R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f40152z == null) {
            int f6 = U2.a.f(C5284R.attr.colorControlActivated, this);
            int f9 = U2.a.f(C5284R.attr.colorError, this);
            int f10 = U2.a.f(C5284R.attr.colorSurface, this);
            int f11 = U2.a.f(C5284R.attr.colorOnSurface, this);
            this.f40152z = new ColorStateList(f40132T, new int[]{U2.a.n(f10, f9, 1.0f), U2.a.n(f10, f6, 1.0f), U2.a.n(f10, f11, 0.54f), U2.a.n(f10, f11, 0.38f), U2.a.n(f10, f11, 0.38f)});
        }
        return this.f40152z;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f40141H;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final void a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        D0.k kVar;
        Drawable drawable = this.f40138E;
        ColorStateList colorStateList3 = this.f40141H;
        PorterDuff.Mode b9 = U.b.b(this);
        if (drawable == null) {
            drawable = null;
        } else if (colorStateList3 != null) {
            drawable = drawable.mutate();
            if (b9 != null) {
                H.a.i(drawable, b9);
            }
        }
        this.f40138E = drawable;
        Drawable drawable2 = this.f40139F;
        ColorStateList colorStateList4 = this.f40142I;
        PorterDuff.Mode mode = this.J;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (colorStateList4 != null) {
            drawable2 = drawable2.mutate();
            if (mode != null) {
                H.a.i(drawable2, mode);
            }
        }
        this.f40139F = drawable2;
        if (this.f40140G) {
            f fVar = this.f40148P;
            if (fVar != null) {
                Drawable drawable3 = fVar.f750n;
                a aVar = this.f40149Q;
                if (drawable3 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable3;
                    if (aVar.f40127a == null) {
                        aVar.f40127a = new E0.b(aVar);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(aVar.f40127a);
                }
                ArrayList arrayList = fVar.f748x;
                E0.d dVar = fVar.f745u;
                if (arrayList != null && aVar != null) {
                    arrayList.remove(aVar);
                    if (fVar.f748x.size() == 0 && (kVar = fVar.f747w) != null) {
                        dVar.f740b.removeListener(kVar);
                        fVar.f747w = null;
                    }
                }
                Drawable drawable4 = fVar.f750n;
                if (drawable4 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable4;
                    if (aVar.f40127a == null) {
                        aVar.f40127a = new E0.b(aVar);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(aVar.f40127a);
                } else if (aVar != null) {
                    if (fVar.f748x == null) {
                        fVar.f748x = new ArrayList();
                    }
                    if (!fVar.f748x.contains(aVar)) {
                        fVar.f748x.add(aVar);
                        if (fVar.f747w == null) {
                            fVar.f747w = new D0.k(1, fVar);
                        }
                        dVar.f740b.addListener(fVar.f747w);
                    }
                }
            }
            Drawable drawable5 = this.f40138E;
            if ((drawable5 instanceof AnimatedStateListDrawable) && fVar != null) {
                ((AnimatedStateListDrawable) drawable5).addTransition(C5284R.id.checked, C5284R.id.unchecked, fVar, false);
                ((AnimatedStateListDrawable) this.f40138E).addTransition(C5284R.id.indeterminate, C5284R.id.unchecked, fVar, false);
            }
        }
        Drawable drawable6 = this.f40138E;
        if (drawable6 != null && (colorStateList2 = this.f40141H) != null) {
            H.a.h(drawable6, colorStateList2);
        }
        Drawable drawable7 = this.f40139F;
        if (drawable7 != null && (colorStateList = this.f40142I) != null) {
            H.a.h(drawable7, colorStateList);
        }
        Drawable drawable8 = this.f40138E;
        Drawable drawable9 = this.f40139F;
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
                float f6 = intrinsicWidth / intrinsicHeight;
                if (f6 >= drawable8.getIntrinsicWidth() / drawable8.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable8.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f6);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable8.getIntrinsicHeight();
                    intrinsicWidth = (int) (f6 * intrinsicHeight);
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
        return this.f40138E;
    }

    public Drawable getButtonIconDrawable() {
        return this.f40139F;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f40142I;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.J;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f40141H;
    }

    public int getCheckedState() {
        return this.f40143K;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f40137D;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.f40143K == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f40134A && this.f40141H == null && this.f40142I == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] copyOf;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, f40130R);
        }
        if (this.f40136C) {
            View.mergeDrawableStates(onCreateDrawableState, f40131S);
        }
        int i4 = 0;
        while (true) {
            if (i4 >= onCreateDrawableState.length) {
                copyOf = Arrays.copyOf(onCreateDrawableState, onCreateDrawableState.length + 1);
                copyOf[onCreateDrawableState.length] = 16842912;
                break;
            }
            int i9 = onCreateDrawableState[i4];
            if (i9 == 16842912) {
                copyOf = onCreateDrawableState;
                break;
            }
            if (i9 == 0) {
                copyOf = (int[]) onCreateDrawableState.clone();
                copyOf[i4] = 16842912;
                break;
            }
            i4++;
        }
        this.f40144L = copyOf;
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable a9;
        if (!this.f40135B || !TextUtils.isEmpty(getText()) || (a9 = U.c.a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - a9.getIntrinsicWidth()) / 2) * (w3.k.e(this) ? -1 : 1);
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
        if (accessibilityNodeInfo != null && this.f40136C) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f40137D));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        setCheckedState(bVar.f40129n);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f40129n = getCheckedState();
        return bVar;
    }

    @Override // m.C4755q, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(com.bumptech.glide.f.h(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f40139F = drawable;
        a();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(com.bumptech.glide.f.h(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f40142I == colorStateList) {
            return;
        }
        this.f40142I = colorStateList;
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
        if (this.f40141H == colorStateList) {
            return;
        }
        this.f40141H = colorStateList;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        a();
    }

    public void setCenterIfNoTextEnabled(boolean z8) {
        this.f40135B = z8;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z8) {
        setCheckedState(z8 ? 1 : 0);
    }

    public void setCheckedState(int i) {
        AutofillManager autofillManager;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f40143K != i) {
            this.f40143K = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 30 && this.f40146N == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.f40145M) {
                return;
            }
            this.f40145M = true;
            LinkedHashSet linkedHashSet = this.f40151y;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw y.h(it);
                }
            }
            if (this.f40143K != 2 && (onCheckedChangeListener = this.f40147O) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (i4 >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f40145M = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z8) {
        super.setEnabled(z8);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f40137D = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z8) {
        if (this.f40136C == z8) {
            return;
        }
        this.f40136C = z8;
        refreshDrawableState();
        Iterator it = this.f40150x.iterator();
        if (it.hasNext()) {
            throw y.h(it);
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f40147O = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f40146N = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z8) {
        this.f40134A = z8;
        if (z8) {
            U.b.c(this, getMaterialThemeColorsTintList());
        } else {
            U.b.c(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // m.C4755q, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f40138E = drawable;
        this.f40140G = false;
        a();
    }
}
