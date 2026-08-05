package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.kolosta.rejin.jilosa.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class tv extends FrameLayout {
    public final r2 MdtA4re8;
    public final jv NCTxEWno;
    public rv P7K7Inc8;
    public ra0 VgvYg0wo;
    public final ov wxUZMvaN;

    public tv(Context context, AttributeSet attributeSet) {
        super(le0.nSmgoSB5(context, attributeSet, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView), attributeSet, R.attr.bottomNavigationStyle);
        ov ovVar = new ov();
        ovVar.MdtA4re8 = false;
        this.wxUZMvaN = ovVar;
        Context context2 = getContext();
        fn.NCTxEWno(context2, attributeSet, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView);
        int[] iArr = y00.RXQxj5Oe;
        fn.wxUZMvaN(context2, attributeSet, iArr, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView, 17, 15);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView);
        f0 f0Var = new f0(context2, obtainStyledAttributes);
        jv jvVar = new jv(context2, getClass(), getMaxItemCount());
        this.NCTxEWno = jvVar;
        r2 r2Var = new r2(context2);
        this.MdtA4re8 = r2Var;
        r2Var.setMinimumHeight(getSuggestedMinimumHeight());
        r2Var.setCollapsedMaxItemCount(getCollapsedMaxItemCount());
        ovVar.NCTxEWno = r2Var;
        ovVar.wxUZMvaN = 1;
        r2Var.setPresenter(ovVar);
        jvVar.NCTxEWno(ovVar, jvVar.qoPGr6Ce);
        ovVar.Qr9iLBAD(getContext(), jvVar);
        if (obtainStyledAttributes.hasValue(11)) {
            r2Var.setIconTintList(f0Var.sjUBp5pO(11));
        } else {
            r2Var.setIconTintList(r2Var.MdtA4re8());
        }
        setItemIconSize(obtainStyledAttributes.getDimensionPixelSize(10, getResources().getDimensionPixelSize(R.dimen.mtrl_navigation_bar_item_default_icon_size)));
        if (obtainStyledAttributes.hasValue(17)) {
            setItemTextAppearanceInactive(obtainStyledAttributes.getResourceId(17, 0));
        }
        if (obtainStyledAttributes.hasValue(15)) {
            setItemTextAppearanceActive(obtainStyledAttributes.getResourceId(15, 0));
        }
        if (obtainStyledAttributes.hasValue(4)) {
            setHorizontalItemTextAppearanceInactive(obtainStyledAttributes.getResourceId(4, 0));
        }
        if (obtainStyledAttributes.hasValue(3)) {
            setHorizontalItemTextAppearanceActive(obtainStyledAttributes.getResourceId(3, 0));
        }
        setItemTextAppearanceActiveBoldEnabled(obtainStyledAttributes.getBoolean(16, true));
        if (obtainStyledAttributes.hasValue(18)) {
            setItemTextColor(f0Var.sjUBp5pO(18));
        }
        Drawable background = getBackground();
        ColorStateList valueOf = background instanceof ColorDrawable ? ColorStateList.valueOf(((ColorDrawable) background).getColor()) : (Build.VERSION.SDK_INT < 29 || !SgZGMMPL.ygLcUYwZ(background)) ? null : SgZGMMPL.wxUZMvaN(background).getColorStateList();
        if (background == null || valueOf != null) {
            tr trVar = new tr(t60.P7K7Inc8(context2, attributeSet, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView).qoPGr6Ce());
            if (valueOf != null) {
                trVar.OxcuoDLp(valueOf);
            }
            trVar.OnDfzHZD(context2);
            setBackground(trVar);
        }
        if (obtainStyledAttributes.hasValue(13)) {
            setItemPaddingTop(obtainStyledAttributes.getDimensionPixelSize(13, 0));
        }
        if (obtainStyledAttributes.hasValue(12)) {
            setItemPaddingBottom(obtainStyledAttributes.getDimensionPixelSize(12, 0));
        }
        if (obtainStyledAttributes.hasValue(0)) {
            setActiveIndicatorLabelPadding(obtainStyledAttributes.getDimensionPixelSize(0, 0));
        }
        if (obtainStyledAttributes.hasValue(5)) {
            setIconLabelHorizontalSpacing(obtainStyledAttributes.getDimensionPixelSize(5, 0));
        }
        if (obtainStyledAttributes.hasValue(2)) {
            setElevation(obtainStyledAttributes.getDimensionPixelSize(2, 0));
        }
        getBackground().mutate().setTintList(w30.FySoLYna(context2, f0Var, 1));
        setLabelVisibilityMode(obtainStyledAttributes.getInteger(21, -1));
        setItemIconGravity(obtainStyledAttributes.getInteger(9, 0));
        setItemGravity(obtainStyledAttributes.getInteger(8, 49));
        int resourceId = obtainStyledAttributes.getResourceId(7, 0);
        if (resourceId != 0) {
            r2Var.setItemBackgroundRes(resourceId);
        } else {
            setItemRippleColor(w30.FySoLYna(context2, f0Var, 14));
        }
        setMeasureBottomPaddingFromLabelBaseline(obtainStyledAttributes.getBoolean(22, true));
        setLabelFontScalingEnabled(obtainStyledAttributes.getBoolean(19, false));
        setLabelMaxLines(obtainStyledAttributes.getInteger(20, 1));
        int resourceId2 = obtainStyledAttributes.getResourceId(6, 0);
        if (resourceId2 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(resourceId2, y00.I5GHvsYW);
            int dimensionPixelSize = obtainStyledAttributes2.getDimensionPixelSize(1, 0);
            setItemActiveIndicatorWidth(dimensionPixelSize);
            setItemActiveIndicatorHeight(obtainStyledAttributes2.getDimensionPixelSize(0, 0));
            int dimensionPixelOffset = obtainStyledAttributes2.getDimensionPixelOffset(10, 0);
            setItemActiveIndicatorMarginHorizontal(dimensionPixelOffset);
            String string = obtainStyledAttributes2.getString(9);
            int i = -2;
            if (string != null) {
                if (String.valueOf(-1).equals(string)) {
                    i = -1;
                } else if (!String.valueOf(-2).equals(string)) {
                    i = obtainStyledAttributes2.getDimensionPixelSize(9, -2);
                }
            }
            setItemActiveIndicatorExpandedWidth(i);
            setItemActiveIndicatorExpandedHeight(obtainStyledAttributes2.getDimensionPixelSize(7, dimensionPixelSize));
            setItemActiveIndicatorExpandedMarginHorizontal(obtainStyledAttributes2.getDimensionPixelOffset(8, dimensionPixelOffset));
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.m3_navigation_item_leading_trailing_space);
            int dimensionPixelOffset2 = obtainStyledAttributes2.getDimensionPixelOffset(5, dimensionPixelSize2);
            int dimensionPixelOffset3 = obtainStyledAttributes2.getDimensionPixelOffset(4, dimensionPixelSize2);
            int i2 = getLayoutDirection() == 1 ? dimensionPixelOffset3 : dimensionPixelOffset2;
            int dimensionPixelOffset4 = obtainStyledAttributes2.getDimensionPixelOffset(6, 0);
            dimensionPixelOffset2 = getLayoutDirection() != 1 ? dimensionPixelOffset3 : dimensionPixelOffset2;
            int dimensionPixelOffset5 = obtainStyledAttributes2.getDimensionPixelOffset(3, 0);
            Rect rect = r2Var.gmkaJpmS;
            rect.left = i2;
            rect.top = dimensionPixelOffset4;
            rect.right = dimensionPixelOffset2;
            rect.bottom = dimensionPixelOffset5;
            lv[] lvVarArr = r2Var.Qr9iLBAD;
            if (lvVarArr != null) {
                for (lv lvVar : lvVarArr) {
                    if (lvVar instanceof iv) {
                        ((iv) lvVar).setActiveIndicatorExpandedPadding(rect);
                    }
                }
            }
            setItemActiveIndicatorColor(w30.gjV1z5T1(context2, obtainStyledAttributes2, 2));
            setItemActiveIndicatorShapeAppearance(t60.b2ZJblxo(new ContextThemeWrapper(context2, obtainStyledAttributes2.getResourceId(11, 0)).obtainStyledAttributes(y00.gjV1z5T1), new P7K7Inc8(0.0f)).qoPGr6Ce());
            obtainStyledAttributes2.recycle();
        }
        if (obtainStyledAttributes.hasValue(23)) {
            int resourceId3 = obtainStyledAttributes.getResourceId(23, 0);
            ov ovVar2 = this.wxUZMvaN;
            ovVar2.MdtA4re8 = true;
            getMenuInflater().inflate(resourceId3, this.NCTxEWno);
            ovVar2.MdtA4re8 = false;
            ovVar2.eVhOlqcC(true);
        }
        f0Var.SgZGMMPL();
        addView(this.MdtA4re8);
        this.NCTxEWno.VgvYg0wo = new tg0(20, (BottomNavigationView) this);
    }

    private MenuInflater getMenuInflater() {
        ra0 ra0Var = this.VgvYg0wo;
        if (ra0Var != null) {
            return ra0Var;
        }
        ra0 ra0Var2 = new ra0(getContext());
        this.VgvYg0wo = ra0Var2;
        return ra0Var2;
    }

    private void setMeasureBottomPaddingFromLabelBaseline(boolean z) {
        this.MdtA4re8.setMeasurePaddingFromLabelBaseline(z);
    }

    public int getActiveIndicatorLabelPadding() {
        return this.MdtA4re8.getActiveIndicatorLabelPadding();
    }

    public int getCollapsedMaxItemCount() {
        return getMaxItemCount();
    }

    public int getHorizontalItemTextAppearanceActive() {
        return this.MdtA4re8.getHorizontalItemTextAppearanceActive();
    }

    public int getHorizontalItemTextAppearanceInactive() {
        return this.MdtA4re8.getHorizontalItemTextAppearanceInactive();
    }

    public int getIconLabelHorizontalSpacing() {
        return this.MdtA4re8.getIconLabelHorizontalSpacing();
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.MdtA4re8.getItemActiveIndicatorColor();
    }

    public int getItemActiveIndicatorExpandedHeight() {
        return this.MdtA4re8.getItemActiveIndicatorExpandedHeight();
    }

    public int getItemActiveIndicatorExpandedMarginHorizontal() {
        return this.MdtA4re8.getItemActiveIndicatorExpandedMarginHorizontal();
    }

    public int getItemActiveIndicatorExpandedWidth() {
        return this.MdtA4re8.getItemActiveIndicatorExpandedWidth();
    }

    public int getItemActiveIndicatorHeight() {
        return this.MdtA4re8.getItemActiveIndicatorHeight();
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.MdtA4re8.getItemActiveIndicatorMarginHorizontal();
    }

    public t60 getItemActiveIndicatorShapeAppearance() {
        return this.MdtA4re8.getItemActiveIndicatorShapeAppearance();
    }

    public int getItemActiveIndicatorWidth() {
        return this.MdtA4re8.getItemActiveIndicatorWidth();
    }

    public Drawable getItemBackground() {
        return this.MdtA4re8.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.MdtA4re8.getItemBackgroundRes();
    }

    public int getItemGravity() {
        return this.MdtA4re8.getItemGravity();
    }

    public int getItemIconGravity() {
        return this.MdtA4re8.getItemIconGravity();
    }

    public int getItemIconSize() {
        return this.MdtA4re8.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.MdtA4re8.getIconTintList();
    }

    public int getItemPaddingBottom() {
        return this.MdtA4re8.getItemPaddingBottom();
    }

    public int getItemPaddingTop() {
        return this.MdtA4re8.getItemPaddingTop();
    }

    public ColorStateList getItemRippleColor() {
        return this.MdtA4re8.getItemRippleColor();
    }

    public int getItemTextAppearanceActive() {
        return this.MdtA4re8.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.MdtA4re8.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.MdtA4re8.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.MdtA4re8.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    public Menu getMenu() {
        return this.NCTxEWno;
    }

    public rs getMenuView() {
        return this.MdtA4re8;
    }

    public ViewGroup getMenuViewGroup() {
        return this.MdtA4re8;
    }

    public ov getPresenter() {
        return this.wxUZMvaN;
    }

    public boolean getScaleLabelTextWithFont() {
        return this.MdtA4re8.getScaleLabelTextWithFont();
    }

    public int getSelectedItemId() {
        return this.MdtA4re8.getSelectedItemId();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof tr) {
            le0.Xkz7p5xa(this, (tr) background);
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof sv)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        sv svVar = (sv) parcelable;
        super.onRestoreInstanceState(svVar.NCTxEWno);
        Bundle bundle = svVar.wxUZMvaN;
        CopyOnWriteArrayList copyOnWriteArrayList = this.NCTxEWno.I5GHvsYW;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray == null || copyOnWriteArrayList.isEmpty()) {
            return;
        }
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            ps psVar = (ps) weakReference.get();
            if (psVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                int id = psVar.getId();
                if (id > 0 && (parcelable2 = (Parcelable) sparseParcelableArray.get(id)) != null) {
                    psVar.VgvYg0wo(parcelable2);
                }
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable OnDfzHZD;
        sv svVar = new sv(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        svVar.wxUZMvaN = bundle;
        CopyOnWriteArrayList copyOnWriteArrayList = this.NCTxEWno.I5GHvsYW;
        if (copyOnWriteArrayList.isEmpty()) {
            return svVar;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            ps psVar = (ps) weakReference.get();
            if (psVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                int id = psVar.getId();
                if (id > 0 && (OnDfzHZD = psVar.OnDfzHZD()) != null) {
                    sparseArray.put(id, OnDfzHZD);
                }
            }
        }
        bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        return svVar;
    }

    public void setActiveIndicatorLabelPadding(int i) {
        this.MdtA4re8.setActiveIndicatorLabelPadding(i);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof tr) {
            ((tr) background).sjUBp5pO(f);
        }
    }

    public void setHorizontalItemTextAppearanceActive(int i) {
        this.MdtA4re8.setHorizontalItemTextAppearanceActive(i);
    }

    public void setHorizontalItemTextAppearanceInactive(int i) {
        this.MdtA4re8.setHorizontalItemTextAppearanceInactive(i);
    }

    public void setIconLabelHorizontalSpacing(int i) {
        this.MdtA4re8.setIconLabelHorizontalSpacing(i);
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.MdtA4re8.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.MdtA4re8.setItemActiveIndicatorEnabled(z);
    }

    public void setItemActiveIndicatorExpandedHeight(int i) {
        this.MdtA4re8.setItemActiveIndicatorExpandedHeight(i);
    }

    public void setItemActiveIndicatorExpandedMarginHorizontal(int i) {
        this.MdtA4re8.setItemActiveIndicatorExpandedMarginHorizontal(i);
    }

    public void setItemActiveIndicatorExpandedWidth(int i) {
        this.MdtA4re8.setItemActiveIndicatorExpandedWidth(i);
    }

    public void setItemActiveIndicatorHeight(int i) {
        this.MdtA4re8.setItemActiveIndicatorHeight(i);
    }

    public void setItemActiveIndicatorMarginHorizontal(int i) {
        this.MdtA4re8.setItemActiveIndicatorMarginHorizontal(i);
    }

    public void setItemActiveIndicatorShapeAppearance(t60 t60Var) {
        this.MdtA4re8.setItemActiveIndicatorShapeAppearance(t60Var);
    }

    public void setItemActiveIndicatorWidth(int i) {
        this.MdtA4re8.setItemActiveIndicatorWidth(i);
    }

    public void setItemBackground(Drawable drawable) {
        this.MdtA4re8.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(int i) {
        this.MdtA4re8.setItemBackgroundRes(i);
    }

    public void setItemGravity(int i) {
        r2 r2Var = this.MdtA4re8;
        if (r2Var.getItemGravity() != i) {
            r2Var.setItemGravity(i);
            this.wxUZMvaN.eVhOlqcC(false);
        }
    }

    public void setItemIconGravity(int i) {
        r2 r2Var = this.MdtA4re8;
        if (r2Var.getItemIconGravity() != i) {
            r2Var.setItemIconGravity(i);
            this.wxUZMvaN.eVhOlqcC(false);
        }
    }

    public void setItemIconSize(int i) {
        this.MdtA4re8.setItemIconSize(i);
    }

    public void setItemIconSizeRes(int i) {
        setItemIconSize(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.MdtA4re8.setIconTintList(colorStateList);
    }

    public void setItemPaddingBottom(int i) {
        this.MdtA4re8.setItemPaddingBottom(i);
    }

    public void setItemPaddingTop(int i) {
        this.MdtA4re8.setItemPaddingTop(i);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.MdtA4re8.setItemRippleColor(colorStateList);
    }

    public void setItemTextAppearanceActive(int i) {
        this.MdtA4re8.setItemTextAppearanceActive(i);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z) {
        this.MdtA4re8.setItemTextAppearanceActiveBoldEnabled(z);
    }

    public void setItemTextAppearanceInactive(int i) {
        this.MdtA4re8.setItemTextAppearanceInactive(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.MdtA4re8.setItemTextColor(colorStateList);
    }

    public void setLabelFontScalingEnabled(boolean z) {
        this.MdtA4re8.setLabelFontScalingEnabled(z);
    }

    public void setLabelMaxLines(int i) {
        this.MdtA4re8.setLabelMaxLines(i);
    }

    public void setLabelVisibilityMode(int i) {
        r2 r2Var = this.MdtA4re8;
        if (r2Var.getLabelVisibilityMode() != i) {
            r2Var.setLabelVisibilityMode(i);
            this.wxUZMvaN.eVhOlqcC(false);
        }
    }

    public void setOnItemSelectedListener(rv rvVar) {
        this.P7K7Inc8 = rvVar;
    }

    public void setSelectedItemId(int i) {
        jv jvVar = this.NCTxEWno;
        MenuItem findItem = jvVar.findItem(i);
        if (findItem != null) {
            boolean OxcuoDLp = jvVar.OxcuoDLp(findItem, this.wxUZMvaN, 0);
            if (findItem.isCheckable()) {
                if (!OxcuoDLp || findItem.isChecked()) {
                    this.MdtA4re8.setCheckedItem(findItem);
                }
            }
        }
    }

    public void setOnItemReselectedListener(qv qvVar) {
    }
}
