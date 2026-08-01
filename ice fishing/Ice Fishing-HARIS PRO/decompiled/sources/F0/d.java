package F0;

import F.o;
import L0.m;
import M0.h;
import a.AbstractC0078a;
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
import androidx.recyclerview.widget.RecyclerView;
import com.lumenpath.harispro.hrnavigator.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import m.r;
import q0.e;
import q0.f;
import u0.AbstractC0358a;

/* loaded from: classes.dex */
public final class d extends r {
    public final LinkedHashSet e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f240f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f241g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f242h;
    public boolean i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f243k;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f244l;

    /* renamed from: m, reason: collision with root package name */
    public Drawable f245m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f246n;

    /* renamed from: o, reason: collision with root package name */
    public ColorStateList f247o;

    /* renamed from: p, reason: collision with root package name */
    public ColorStateList f248p;

    /* renamed from: q, reason: collision with root package name */
    public PorterDuff.Mode f249q;

    /* renamed from: r, reason: collision with root package name */
    public int f250r;

    /* renamed from: s, reason: collision with root package name */
    public int[] f251s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f252t;

    /* renamed from: u, reason: collision with root package name */
    public CharSequence f253u;

    /* renamed from: v, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f254v;

    /* renamed from: w, reason: collision with root package name */
    public final f f255w;

    /* renamed from: x, reason: collision with root package name */
    public final a f256x;

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f238y = {R.attr.state_indeterminate};

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f239z = {R.attr.state_error};

    /* renamed from: A, reason: collision with root package name */
    public static final int[][] f236A = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: B, reason: collision with root package name */
    public static final int f237B = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    public d(Context context, AttributeSet attributeSet) {
        super(X0.a.a(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, R.attr.checkboxStyle);
        this.e = new LinkedHashSet();
        this.f240f = new LinkedHashSet();
        Context context2 = getContext();
        f fVar = new f(context2);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = o.f221a;
        Drawable drawable = resources.getDrawable(R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        fVar.f4249a = drawable;
        drawable.setCallback(fVar.f4248f);
        new e(fVar.f4249a.getConstantState());
        this.f255w = fVar;
        this.f256x = new a(this);
        Context context3 = getContext();
        this.f244l = getButtonDrawable();
        this.f247o = getSuperButtonTintList();
        setSupportButtonTintList(null);
        h h2 = m.h(context3, attributeSet, AbstractC0358a.f4453r, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        this.f245m = h2.c(2);
        Drawable drawable2 = this.f244l;
        TypedArray typedArray = (TypedArray) h2.f617c;
        if (drawable2 != null && AbstractC0078a.V(context3, R.attr.isMaterial3Theme, false)) {
            int resourceId = typedArray.getResourceId(0, 0);
            int resourceId2 = typedArray.getResourceId(1, 0);
            if (resourceId == f237B && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.f244l = h0.f.n(context3, R.drawable.mtrl_checkbox_button);
                this.f246n = true;
                if (this.f245m == null) {
                    this.f245m = h0.f.n(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.f248p = AbstractC0078a.A(context3, h2, 3);
        this.f249q = m.i(typedArray.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.f242h = typedArray.getBoolean(10, false);
        this.i = typedArray.getBoolean(6, true);
        this.j = typedArray.getBoolean(9, false);
        this.f243k = typedArray.getText(8);
        if (typedArray.hasValue(7)) {
            setCheckedState(typedArray.getInt(7, 0));
        }
        h2.l();
        a();
    }

    private String getButtonStateDescription() {
        int i = this.f250r;
        return i == 1 ? getResources().getString(R.string.mtrl_checkbox_state_description_checked) : i == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f241g == null) {
            int y2 = AbstractC0078a.y(this, R.attr.colorControlActivated);
            int y3 = AbstractC0078a.y(this, R.attr.colorError);
            int y4 = AbstractC0078a.y(this, R.attr.colorSurface);
            int y5 = AbstractC0078a.y(this, R.attr.colorOnSurface);
            this.f241g = new ColorStateList(f236A, new int[]{AbstractC0078a.O(y4, y3, 1.0f), AbstractC0078a.O(y4, y2, 1.0f), AbstractC0078a.O(y4, y5, 0.54f), AbstractC0078a.O(y4, y5, 0.38f), AbstractC0078a.O(y4, y5, 0.38f)});
        }
        return this.f241g;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f247o;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final void a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        B0.c cVar;
        Drawable drawable = this.f244l;
        ColorStateList colorStateList3 = this.f247o;
        PorterDuff.Mode buttonTintMode = getButtonTintMode();
        if (drawable == null) {
            drawable = null;
        } else if (colorStateList3 != null) {
            drawable = drawable.mutate();
            if (buttonTintMode != null) {
                drawable.setTintMode(buttonTintMode);
            }
        }
        this.f244l = drawable;
        Drawable drawable2 = this.f245m;
        ColorStateList colorStateList4 = this.f248p;
        PorterDuff.Mode mode = this.f249q;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (colorStateList4 != null) {
            drawable2 = drawable2.mutate();
            if (mode != null) {
                drawable2.setTintMode(mode);
            }
        }
        this.f245m = drawable2;
        if (this.f246n) {
            f fVar = this.f255w;
            if (fVar != null) {
                Drawable drawable3 = fVar.f4249a;
                a aVar = this.f256x;
                if (drawable3 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable3;
                    if (aVar.f232a == null) {
                        aVar.f232a = new q0.b(aVar);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(aVar.f232a);
                }
                ArrayList arrayList = fVar.e;
                q0.d dVar = fVar.f4245b;
                if (arrayList != null && aVar != null) {
                    arrayList.remove(aVar);
                    if (fVar.e.size() == 0 && (cVar = fVar.f4247d) != null) {
                        dVar.f4241b.removeListener(cVar);
                        fVar.f4247d = null;
                    }
                }
                Drawable drawable4 = fVar.f4249a;
                if (drawable4 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable4;
                    if (aVar.f232a == null) {
                        aVar.f232a = new q0.b(aVar);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(aVar.f232a);
                } else if (aVar != null) {
                    if (fVar.e == null) {
                        fVar.e = new ArrayList();
                    }
                    if (!fVar.e.contains(aVar)) {
                        fVar.e.add(aVar);
                        if (fVar.f4247d == null) {
                            fVar.f4247d = new B0.c(7, fVar);
                        }
                        dVar.f4241b.addListener(fVar.f4247d);
                    }
                }
            }
            Drawable drawable5 = this.f244l;
            if ((drawable5 instanceof AnimatedStateListDrawable) && fVar != null) {
                ((AnimatedStateListDrawable) drawable5).addTransition(R.id.checked, R.id.unchecked, fVar, false);
                ((AnimatedStateListDrawable) this.f244l).addTransition(R.id.indeterminate, R.id.unchecked, fVar, false);
            }
        }
        Drawable drawable6 = this.f244l;
        if (drawable6 != null && (colorStateList2 = this.f247o) != null) {
            drawable6.setTintList(colorStateList2);
        }
        Drawable drawable7 = this.f245m;
        if (drawable7 != null && (colorStateList = this.f248p) != null) {
            drawable7.setTintList(colorStateList);
        }
        Drawable drawable8 = this.f244l;
        Drawable drawable9 = this.f245m;
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
        return this.f244l;
    }

    public Drawable getButtonIconDrawable() {
        return this.f245m;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f248p;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f249q;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f247o;
    }

    public int getCheckedState() {
        return this.f250r;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f243k;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.f250r == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f242h && this.f247o == null && this.f248p == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] copyOf;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, f238y);
        }
        if (this.j) {
            View.mergeDrawableStates(onCreateDrawableState, f239z);
        }
        int i2 = 0;
        while (true) {
            if (i2 >= onCreateDrawableState.length) {
                copyOf = Arrays.copyOf(onCreateDrawableState, onCreateDrawableState.length + 1);
                copyOf[onCreateDrawableState.length] = 16842912;
                break;
            }
            int i3 = onCreateDrawableState[i2];
            if (i3 == 16842912) {
                copyOf = onCreateDrawableState;
                break;
            }
            if (i3 == 0) {
                copyOf = (int[]) onCreateDrawableState.clone();
                copyOf[i2] = 16842912;
                break;
            }
            i2++;
        }
        this.f251s = copyOf;
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (!this.i || !TextUtils.isEmpty(getText()) || (buttonDrawable = getButtonDrawable()) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - buttonDrawable.getIntrinsicWidth()) / 2) * (m.f(this) ? -1 : 1);
        int save = canvas.save();
        canvas.translate(width, RecyclerView.f2111C0);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
        if (getBackground() != null) {
            Rect bounds = buttonDrawable.getBounds();
            getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.j) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f243k));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.getSuperState());
        setCheckedState(cVar.f235a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.f235a = getCheckedState();
        return cVar;
    }

    @Override // m.r, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(h0.f.n(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f245m = drawable;
        a();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(h0.f.n(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f248p == colorStateList) {
            return;
        }
        this.f248p = colorStateList;
        a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f249q == mode) {
            return;
        }
        this.f249q = mode;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f247o == colorStateList) {
            return;
        }
        this.f247o = colorStateList;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        a();
    }

    public void setCenterIfNoTextEnabled(boolean z2) {
        this.i = z2;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) {
        setCheckedState(z2 ? 1 : 0);
    }

    public void setCheckedState(int i) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f250r != i) {
            this.f250r = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.f253u == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.f252t) {
                return;
            }
            this.f252t = true;
            LinkedHashSet linkedHashSet = this.f240f;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
            }
            if (this.f250r != 2 && (onCheckedChangeListener = this.f254v) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f252t = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f243k = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z2) {
        if (this.j == z2) {
            return;
        }
        this.j = z2;
        refreshDrawableState();
        Iterator it = this.e.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f254v = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f253u = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z2) {
        this.f242h = z2;
        if (z2) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // m.r, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f244l = drawable;
        this.f246n = false;
        a();
    }
}
