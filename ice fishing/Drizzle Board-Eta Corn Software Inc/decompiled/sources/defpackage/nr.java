package defpackage;

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
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import com.kolosta.rejin.jilosa.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class nr extends FOrSgJlm {
    public int[] Ey6iv0m0;
    public CompoundButton.OnCheckedChangeListener FySoLYna;
    public boolean I5GHvsYW;
    public int KlHjfFWx;
    public Drawable OnDfzHZD;
    public ColorStateList OxcuoDLp;
    public final LinkedHashSet P7K7Inc8;
    public ColorStateList Qr9iLBAD;
    public CharSequence RXQxj5Oe;
    public final b2 WYNAV5pd;
    public PorterDuff.Mode amk52bBQ;
    public final LinkedHashSet b2ZJblxo;
    public boolean eVhOlqcC;
    public final zgcfmssZ gjV1z5T1;
    public boolean jb9XjC4I;
    public boolean k3x7lurq;
    public boolean lDXGDhIF;
    public CharSequence ow5vqvCr;
    public ColorStateList sjUBp5pO;
    public Drawable ygLcUYwZ;
    public static final int[] DK9slbsy = {R.attr.state_indeterminate};
    public static final int[] lwWCatUu = {R.attr.state_error};
    public static final int[][] U0LaHZX7 = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public static final int i7xS8jrb = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    public nr(Context context, AttributeSet attributeSet) {
        super(le0.nSmgoSB5(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, R.attr.checkboxStyle);
        this.P7K7Inc8 = new LinkedHashSet();
        this.b2ZJblxo = new LinkedHashSet();
        Context context2 = getContext();
        zgcfmssZ zgcfmssz = new zgcfmssZ(context2);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = i30.qoPGr6Ce;
        Drawable drawable = resources.getDrawable(R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        zgcfmssz.NCTxEWno = drawable;
        drawable.setCallback(zgcfmssz.b2ZJblxo);
        new j8OPu0Ny(zgcfmssz.NCTxEWno.getConstantState());
        this.gjV1z5T1 = zgcfmssz;
        this.WYNAV5pd = new b2(this, 2);
        Context context3 = getContext();
        this.OnDfzHZD = getButtonDrawable();
        this.sjUBp5pO = getSuperButtonTintList();
        setSupportButtonTintList(null);
        fn.NCTxEWno(context3, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        int[] iArr = y00.ygLcUYwZ;
        fn.wxUZMvaN(context3, attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        TypedArray obtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        f0 f0Var = new f0(context3, obtainStyledAttributes);
        this.ygLcUYwZ = f0Var.OxcuoDLp(2);
        if (this.OnDfzHZD != null && ra.ytu5o6f4(context3.getTheme(), R.attr.isMaterial3Theme, false)) {
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
            if (resourceId == i7xS8jrb && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.OnDfzHZD = ra.Ey6iv0m0(context3, R.drawable.mtrl_checkbox_button);
                this.lDXGDhIF = true;
                if (this.ygLcUYwZ == null) {
                    this.ygLcUYwZ = ra.Ey6iv0m0(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.OxcuoDLp = w30.FySoLYna(context3, f0Var, 3);
        int i = obtainStyledAttributes.getInt(4, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.amk52bBQ = g50.b2ZJblxo(i);
        this.jb9XjC4I = obtainStyledAttributes.getBoolean(11, false);
        this.eVhOlqcC = obtainStyledAttributes.getBoolean(6, true);
        this.k3x7lurq = obtainStyledAttributes.getBoolean(9, false);
        this.ow5vqvCr = obtainStyledAttributes.getText(8);
        if (obtainStyledAttributes.hasValue(7)) {
            setCheckedState(obtainStyledAttributes.getInt(7, 0));
        }
        if (obtainStyledAttributes.hasValue(10)) {
            setRippleColor(w30.FySoLYna(context3, f0Var, 10));
        }
        f0Var.SgZGMMPL();
        qoPGr6Ce();
    }

    private String getButtonStateDescription() {
        int i = this.KlHjfFWx;
        return i == 1 ? getResources().getString(R.string.mtrl_checkbox_state_description_checked) : i == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        ColorStateList colorStateList = this.Qr9iLBAD;
        if (colorStateList != null) {
            return colorStateList;
        }
        int ygLcUYwZ = fn.ygLcUYwZ(this, R.attr.colorControlActivated);
        int ygLcUYwZ2 = fn.ygLcUYwZ(this, R.attr.colorError);
        int ygLcUYwZ3 = fn.ygLcUYwZ(this, R.attr.colorSurface);
        int ygLcUYwZ4 = fn.ygLcUYwZ(this, R.attr.colorOnSurface);
        ColorStateList colorStateList2 = new ColorStateList(U0LaHZX7, new int[]{fn.I5GHvsYW(ygLcUYwZ3, ygLcUYwZ2, 1.0f), fn.I5GHvsYW(ygLcUYwZ3, ygLcUYwZ, 1.0f), fn.I5GHvsYW(ygLcUYwZ3, ygLcUYwZ4, 0.54f), fn.I5GHvsYW(ygLcUYwZ3, ygLcUYwZ4, 0.38f), fn.I5GHvsYW(ygLcUYwZ3, ygLcUYwZ4, 0.38f)});
        this.Qr9iLBAD = colorStateList2;
        return colorStateList2;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.sjUBp5pO;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    private void setRippleColor(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return;
        }
        Drawable background = getBackground();
        if (background instanceof DrawableWrapper) {
            background = ((DrawableWrapper) background).getDrawable();
        }
        if (background instanceof RippleDrawable) {
            ((RippleDrawable) background).setColor(colorStateList);
        }
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.OnDfzHZD;
    }

    public Drawable getButtonIconDrawable() {
        return this.ygLcUYwZ;
    }

    public ColorStateList getButtonIconTintList() {
        return this.OxcuoDLp;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.amk52bBQ;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.sjUBp5pO;
    }

    public int getCheckedState() {
        return this.KlHjfFWx;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.ow5vqvCr;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.KlHjfFWx == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.jb9XjC4I && this.sjUBp5pO == null && this.OxcuoDLp == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] copyOf;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, DK9slbsy);
        }
        if (this.k3x7lurq) {
            View.mergeDrawableStates(onCreateDrawableState, lwWCatUu);
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
        this.Ey6iv0m0 = copyOf;
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (!this.eVhOlqcC || !TextUtils.isEmpty(getText()) || (buttonDrawable = getButtonDrawable()) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - buttonDrawable.getIntrinsicWidth()) / 2) * (getLayoutDirection() == 1 ? -1 : 1);
        int save = canvas.save();
        canvas.translate(width, 0.0f);
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
        if (accessibilityNodeInfo != null && this.k3x7lurq) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.ow5vqvCr));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof mr)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        mr mrVar = (mr) parcelable;
        super.onRestoreInstanceState(mrVar.getSuperState());
        setCheckedState(mrVar.NCTxEWno);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        mr mrVar = new mr(super.onSaveInstanceState());
        mrVar.NCTxEWno = getCheckedState();
        return mrVar;
    }

    public final void qoPGr6Ce() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        tef3qNMP tef3qnmp;
        Drawable drawable = this.OnDfzHZD;
        ColorStateList colorStateList3 = this.sjUBp5pO;
        PorterDuff.Mode buttonTintMode = getButtonTintMode();
        if (drawable == null) {
            drawable = null;
        } else if (colorStateList3 != null) {
            drawable = drawable.mutate();
            if (buttonTintMode != null) {
                drawable.setTintMode(buttonTintMode);
            }
        }
        this.OnDfzHZD = drawable;
        Drawable drawable2 = this.ygLcUYwZ;
        ColorStateList colorStateList4 = this.OxcuoDLp;
        PorterDuff.Mode mode = this.amk52bBQ;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (colorStateList4 != null) {
            drawable2 = drawable2.mutate();
            if (mode != null) {
                drawable2.setTintMode(mode);
            }
        }
        this.ygLcUYwZ = drawable2;
        if (this.lDXGDhIF) {
            zgcfmssZ zgcfmssz = this.gjV1z5T1;
            if (zgcfmssz != null) {
                arJtZsWp arjtzswp = zgcfmssz.MdtA4re8;
                Drawable drawable3 = zgcfmssz.NCTxEWno;
                b2 b2Var = this.WYNAV5pd;
                if (drawable3 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable3;
                    W64EBLa6 w64EBLa6 = b2Var.qoPGr6Ce;
                    if (w64EBLa6 == null) {
                        w64EBLa6 = new W64EBLa6(b2Var);
                        b2Var.qoPGr6Ce = w64EBLa6;
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(w64EBLa6);
                }
                ArrayList arrayList = zgcfmssz.P7K7Inc8;
                if (arrayList != null && b2Var != null) {
                    arrayList.remove(b2Var);
                    if (zgcfmssz.P7K7Inc8.size() == 0 && (tef3qnmp = zgcfmssz.VgvYg0wo) != null) {
                        arjtzswp.NCTxEWno.removeListener(tef3qnmp);
                        zgcfmssz.VgvYg0wo = null;
                    }
                }
                Drawable drawable4 = zgcfmssz.NCTxEWno;
                if (drawable4 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable4;
                    W64EBLa6 w64EBLa62 = b2Var.qoPGr6Ce;
                    if (w64EBLa62 == null) {
                        w64EBLa62 = new W64EBLa6(b2Var);
                        b2Var.qoPGr6Ce = w64EBLa62;
                    }
                    animatedVectorDrawable2.registerAnimationCallback(w64EBLa62);
                } else if (b2Var != null) {
                    ArrayList arrayList2 = zgcfmssz.P7K7Inc8;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        zgcfmssz.P7K7Inc8 = arrayList2;
                    }
                    if (!arrayList2.contains(b2Var)) {
                        zgcfmssz.P7K7Inc8.add(b2Var);
                        tef3qNMP tef3qnmp2 = zgcfmssz.VgvYg0wo;
                        if (tef3qnmp2 == null) {
                            tef3qnmp2 = new tef3qNMP(1, zgcfmssz);
                            zgcfmssz.VgvYg0wo = tef3qnmp2;
                        }
                        arjtzswp.NCTxEWno.addListener(tef3qnmp2);
                    }
                }
            }
            Drawable drawable5 = this.OnDfzHZD;
            if ((drawable5 instanceof AnimatedStateListDrawable) && zgcfmssz != null) {
                ((AnimatedStateListDrawable) drawable5).addTransition(R.id.checked, R.id.unchecked, zgcfmssz, false);
                ((AnimatedStateListDrawable) this.OnDfzHZD).addTransition(R.id.indeterminate, R.id.unchecked, zgcfmssz, false);
            }
        }
        Drawable drawable6 = this.OnDfzHZD;
        if (drawable6 != null && (colorStateList2 = this.sjUBp5pO) != null) {
            drawable6.setTintList(colorStateList2);
        }
        Drawable drawable7 = this.ygLcUYwZ;
        if (drawable7 != null && (colorStateList = this.OxcuoDLp) != null) {
            drawable7.setTintList(colorStateList);
        }
        Drawable drawable8 = this.OnDfzHZD;
        Drawable drawable9 = this.ygLcUYwZ;
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
                float f = intrinsicWidth / intrinsicHeight;
                if (f >= drawable8.getIntrinsicWidth() / drawable8.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable8.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable8.getIntrinsicHeight();
                    intrinsicWidth = (int) (f * intrinsicHeight);
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

    @Override // defpackage.FOrSgJlm, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(ra.Ey6iv0m0(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.ygLcUYwZ = drawable;
        qoPGr6Ce();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(ra.Ey6iv0m0(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.OxcuoDLp == colorStateList) {
            return;
        }
        this.OxcuoDLp = colorStateList;
        qoPGr6Ce();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.amk52bBQ == mode) {
            return;
        }
        this.amk52bBQ = mode;
        qoPGr6Ce();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.sjUBp5pO == colorStateList) {
            return;
        }
        this.sjUBp5pO = colorStateList;
        qoPGr6Ce();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        qoPGr6Ce();
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.eVhOlqcC = z;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedState(z ? 1 : 0);
    }

    public void setCheckedState(int i) {
        AutofillManager autofillManager;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.KlHjfFWx != i) {
            this.KlHjfFWx = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30 && this.RXQxj5Oe == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.I5GHvsYW) {
                return;
            }
            this.I5GHvsYW = true;
            LinkedHashSet linkedHashSet = this.b2ZJblxo;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    m1.qoPGr6Ce();
                    return;
                }
            }
            if (this.KlHjfFWx != 2 && (onCheckedChangeListener = this.FySoLYna) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (i2 >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.I5GHvsYW = false;
        }
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.ow5vqvCr = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z) {
        if (this.k3x7lurq == z) {
            return;
        }
        this.k3x7lurq = z;
        refreshDrawableState();
        Iterator it = this.P7K7Inc8.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            m1.qoPGr6Ce();
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.FySoLYna = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.RXQxj5Oe = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.jb9XjC4I = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // defpackage.FOrSgJlm, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.OnDfzHZD = drawable;
        this.lDXGDhIF = false;
        qoPGr6Ce();
    }
}
