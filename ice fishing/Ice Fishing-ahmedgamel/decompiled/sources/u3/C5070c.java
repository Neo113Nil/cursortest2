package u3;

import A3.n;
import D.x;
import E0.d;
import E0.e;
import E0.f;
import F.j;
import F.q;
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
import com.IceFishing.LiveIceFishing.C5248R;
import com.anythink.expressad.foundation.h.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import l4.g;
import m.C4720q;
import m3.AbstractC4742a;

/* renamed from: u3.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5070c extends C4720q {

    /* renamed from: R, reason: collision with root package name */
    public static final int[] f41020R = {C5248R.attr.state_indeterminate};

    /* renamed from: S, reason: collision with root package name */
    public static final int[] f41021S = {C5248R.attr.state_error};

    /* renamed from: T, reason: collision with root package name */
    public static final int[][] f41022T = {new int[]{R.attr.state_enabled, C5248R.attr.state_error}, new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: U, reason: collision with root package name */
    public static final int f41023U = Resources.getSystem().getIdentifier("btn_check_material_anim", k.f20419c, com.onesignal.core.internal.backend.impl.a.TURBINE_FEATURES_PLATFORM_ANDROID);

    /* renamed from: A, reason: collision with root package name */
    public boolean f41024A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f41025B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f41026C;

    /* renamed from: D, reason: collision with root package name */
    public CharSequence f41027D;

    /* renamed from: E, reason: collision with root package name */
    public Drawable f41028E;

    /* renamed from: F, reason: collision with root package name */
    public Drawable f41029F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f41030G;

    /* renamed from: H, reason: collision with root package name */
    public ColorStateList f41031H;

    /* renamed from: I, reason: collision with root package name */
    public ColorStateList f41032I;
    public PorterDuff.Mode J;

    /* renamed from: K, reason: collision with root package name */
    public int f41033K;

    /* renamed from: L, reason: collision with root package name */
    public int[] f41034L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f41035M;

    /* renamed from: N, reason: collision with root package name */
    public CharSequence f41036N;

    /* renamed from: O, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f41037O;

    /* renamed from: P, reason: collision with root package name */
    public final f f41038P;

    /* renamed from: Q, reason: collision with root package name */
    public final C5068a f41039Q;

    /* renamed from: x, reason: collision with root package name */
    public final LinkedHashSet f41040x;

    /* renamed from: y, reason: collision with root package name */
    public final LinkedHashSet f41041y;

    /* renamed from: z, reason: collision with root package name */
    public ColorStateList f41042z;

    public C5070c(Context context, AttributeSet attributeSet) {
        super(L3.a.a(context, attributeSet, C5248R.attr.checkboxStyle, C5248R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, C5248R.attr.checkboxStyle);
        this.f41040x = new LinkedHashSet();
        this.f41041y = new LinkedHashSet();
        Context context2 = getContext();
        f fVar = new f(context2);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = q.f942a;
        Drawable a9 = j.a(resources, C5248R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        fVar.f650n = a9;
        a9.setCallback(fVar.f649y);
        new e(0, fVar.f650n.getConstantState());
        this.f41038P = fVar;
        this.f41039Q = new C5068a(this);
        Context context3 = getContext();
        this.f41028E = U.c.a(this);
        this.f41031H = getSuperButtonTintList();
        setSupportButtonTintList(null);
        int[] iArr = AbstractC4742a.f39430n;
        n.a(context3, attributeSet, C5248R.attr.checkboxStyle, C5248R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        n.b(context3, attributeSet, iArr, C5248R.attr.checkboxStyle, C5248R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        TypedArray obtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, iArr, C5248R.attr.checkboxStyle, C5248R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        g gVar = new g(context3, obtainStyledAttributes);
        this.f41029F = gVar.i(2);
        if (this.f41028E != null && com.bumptech.glide.e.g(context3, C5248R.attr.isMaterial3Theme, false)) {
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
            if (resourceId == f41023U && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.f41028E = com.bumptech.glide.g.h(context3, C5248R.drawable.mtrl_checkbox_button);
                this.f41030G = true;
                if (this.f41029F == null) {
                    this.f41029F = com.bumptech.glide.g.h(context3, C5248R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.f41032I = com.bumptech.glide.f.k(context3, gVar, 3);
        this.J = n.g(obtainStyledAttributes.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.f41024A = obtainStyledAttributes.getBoolean(10, false);
        this.f41025B = obtainStyledAttributes.getBoolean(6, true);
        this.f41026C = obtainStyledAttributes.getBoolean(9, false);
        this.f41027D = obtainStyledAttributes.getText(8);
        if (obtainStyledAttributes.hasValue(7)) {
            setCheckedState(obtainStyledAttributes.getInt(7, 0));
        }
        gVar.t();
        a();
    }

    private String getButtonStateDescription() {
        int i = this.f41033K;
        return i == 1 ? getResources().getString(C5248R.string.mtrl_checkbox_state_description_checked) : i == 0 ? getResources().getString(C5248R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(C5248R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f41042z == null) {
            int h3 = Q3.b.h(C5248R.attr.colorControlActivated, this);
            int h9 = Q3.b.h(C5248R.attr.colorError, this);
            int h10 = Q3.b.h(C5248R.attr.colorSurface, this);
            int h11 = Q3.b.h(C5248R.attr.colorOnSurface, this);
            this.f41042z = new ColorStateList(f41022T, new int[]{Q3.b.l(h10, h9, 1.0f), Q3.b.l(h10, h3, 1.0f), Q3.b.l(h10, h11, 0.54f), Q3.b.l(h10, h11, 0.38f), Q3.b.l(h10, h11, 0.38f)});
        }
        return this.f41042z;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f41031H;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final void a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        D0.k kVar;
        Drawable drawable = this.f41028E;
        ColorStateList colorStateList3 = this.f41031H;
        PorterDuff.Mode b9 = U.b.b(this);
        if (drawable == null) {
            drawable = null;
        } else if (colorStateList3 != null) {
            drawable = drawable.mutate();
            if (b9 != null) {
                H.a.i(drawable, b9);
            }
        }
        this.f41028E = drawable;
        Drawable drawable2 = this.f41029F;
        ColorStateList colorStateList4 = this.f41032I;
        PorterDuff.Mode mode = this.J;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (colorStateList4 != null) {
            drawable2 = drawable2.mutate();
            if (mode != null) {
                H.a.i(drawable2, mode);
            }
        }
        this.f41029F = drawable2;
        if (this.f41030G) {
            f fVar = this.f41038P;
            if (fVar != null) {
                Drawable drawable3 = fVar.f650n;
                C5068a c5068a = this.f41039Q;
                if (drawable3 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable3;
                    if (c5068a.f41017a == null) {
                        c5068a.f41017a = new E0.b(c5068a);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(c5068a.f41017a);
                }
                ArrayList arrayList = fVar.f648x;
                d dVar = fVar.f645u;
                if (arrayList != null && c5068a != null) {
                    arrayList.remove(c5068a);
                    if (fVar.f648x.size() == 0 && (kVar = fVar.f647w) != null) {
                        dVar.f640b.removeListener(kVar);
                        fVar.f647w = null;
                    }
                }
                Drawable drawable4 = fVar.f650n;
                if (drawable4 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable4;
                    if (c5068a.f41017a == null) {
                        c5068a.f41017a = new E0.b(c5068a);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(c5068a.f41017a);
                } else if (c5068a != null) {
                    if (fVar.f648x == null) {
                        fVar.f648x = new ArrayList();
                    }
                    if (!fVar.f648x.contains(c5068a)) {
                        fVar.f648x.add(c5068a);
                        if (fVar.f647w == null) {
                            fVar.f647w = new D0.k(1, fVar);
                        }
                        dVar.f640b.addListener(fVar.f647w);
                    }
                }
            }
            Drawable drawable5 = this.f41028E;
            if ((drawable5 instanceof AnimatedStateListDrawable) && fVar != null) {
                ((AnimatedStateListDrawable) drawable5).addTransition(C5248R.id.checked, C5248R.id.unchecked, fVar, false);
                ((AnimatedStateListDrawable) this.f41028E).addTransition(C5248R.id.indeterminate, C5248R.id.unchecked, fVar, false);
            }
        }
        Drawable drawable6 = this.f41028E;
        if (drawable6 != null && (colorStateList2 = this.f41031H) != null) {
            H.a.h(drawable6, colorStateList2);
        }
        Drawable drawable7 = this.f41029F;
        if (drawable7 != null && (colorStateList = this.f41032I) != null) {
            H.a.h(drawable7, colorStateList);
        }
        Drawable drawable8 = this.f41028E;
        Drawable drawable9 = this.f41029F;
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
                float f2 = intrinsicWidth / intrinsicHeight;
                if (f2 >= drawable8.getIntrinsicWidth() / drawable8.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable8.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f2);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable8.getIntrinsicHeight();
                    intrinsicWidth = (int) (f2 * intrinsicHeight);
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
        return this.f41028E;
    }

    public Drawable getButtonIconDrawable() {
        return this.f41029F;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f41032I;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.J;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f41031H;
    }

    public int getCheckedState() {
        return this.f41033K;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f41027D;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.f41033K == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f41024A && this.f41031H == null && this.f41032I == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] copyOf;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, f41020R);
        }
        if (this.f41026C) {
            View.mergeDrawableStates(onCreateDrawableState, f41021S);
        }
        int i4 = 0;
        while (true) {
            if (i4 >= onCreateDrawableState.length) {
                copyOf = Arrays.copyOf(onCreateDrawableState, onCreateDrawableState.length + 1);
                copyOf[onCreateDrawableState.length] = 16842912;
                break;
            }
            int i6 = onCreateDrawableState[i4];
            if (i6 == 16842912) {
                copyOf = onCreateDrawableState;
                break;
            }
            if (i6 == 0) {
                copyOf = (int[]) onCreateDrawableState.clone();
                copyOf[i4] = 16842912;
                break;
            }
            i4++;
        }
        this.f41034L = copyOf;
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable a9;
        if (!this.f41025B || !TextUtils.isEmpty(getText()) || (a9 = U.c.a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - a9.getIntrinsicWidth()) / 2) * (n.e(this) ? -1 : 1);
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
        if (accessibilityNodeInfo != null && this.f41026C) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f41027D));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C5069b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C5069b c5069b = (C5069b) parcelable;
        super.onRestoreInstanceState(c5069b.getSuperState());
        setCheckedState(c5069b.f41019n);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        C5069b c5069b = new C5069b(super.onSaveInstanceState());
        c5069b.f41019n = getCheckedState();
        return c5069b;
    }

    @Override // m.C4720q, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(com.bumptech.glide.g.h(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f41029F = drawable;
        a();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(com.bumptech.glide.g.h(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f41032I == colorStateList) {
            return;
        }
        this.f41032I = colorStateList;
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
        if (this.f41031H == colorStateList) {
            return;
        }
        this.f41031H = colorStateList;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        a();
    }

    public void setCenterIfNoTextEnabled(boolean z6) {
        this.f41025B = z6;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z6) {
        setCheckedState(z6 ? 1 : 0);
    }

    public void setCheckedState(int i) {
        AutofillManager autofillManager;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f41033K != i) {
            this.f41033K = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 30 && this.f41036N == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.f41035M) {
                return;
            }
            this.f41035M = true;
            LinkedHashSet linkedHashSet = this.f41041y;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw x.i(it);
                }
            }
            if (this.f41033K != 2 && (onCheckedChangeListener = this.f41037O) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (i4 >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f41035M = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z6) {
        super.setEnabled(z6);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f41027D = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z6) {
        if (this.f41026C == z6) {
            return;
        }
        this.f41026C = z6;
        refreshDrawableState();
        Iterator it = this.f41040x.iterator();
        if (it.hasNext()) {
            throw x.i(it);
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f41037O = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f41036N = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z6) {
        this.f41024A = z6;
        if (z6) {
            U.b.c(this, getMaterialThemeColorsTintList());
        } else {
            U.b.c(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // m.C4720q, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f41028E = drawable;
        this.f41030G = false;
        a();
    }
}
