package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.HashSet;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class mv extends ViewGroup implements rs {
    public static final int[] TrssYQ34 = {R.attr.state_checked};
    public static final int[] g2aRJUAd = {-16842910};
    public int DK9slbsy;
    public Drawable Ey6iv0m0;
    public boolean FXJmAAN1;
    public final SparseArray FySoLYna;
    public boolean HdOGZAzC;
    public ColorStateList I5GHvsYW;
    public boolean KRabZ4CU;
    public boolean KlHjfFWx;
    public final pP9Y2m6O MdtA4re8;
    public int Mq3SeTnW;
    public int N8VPGzVC;
    public final j1 NCTxEWno;
    public ColorStateList OnDfzHZD;
    public int OxcuoDLp;
    public int P7K7Inc8;
    public lv[] Qr9iLBAD;
    public int RXQxj5Oe;
    public int SgZGMMPL;
    public boolean U0LaHZX7;
    public final SparseArray VgvYg0wo;
    public t60 VhgXwMj9;
    public int WYNAV5pd;
    public ColorStateList Xkz7p5xa;
    public MenuItem ZyZthT5G;
    public boolean aZz0PFXp;
    public int amk52bBQ;
    public int b2ZJblxo;
    public int bvfAo0eO;
    public int eIA6dogk;
    public int eVhOlqcC;
    public int euDDoUNr;
    public ov fVMzMhyS;
    public int gjV1z5T1;
    public final Rect gmkaJpmS;
    public kv hzgxAD8d;
    public int i7xS8jrb;
    public int jb9XjC4I;
    public ColorStateList k3x7lurq;
    public int lDXGDhIF;
    public int lwWCatUu;
    public int nSmgoSB5;
    public int ow5vqvCr;
    public int pRiPUEwG;
    public int sjUBp5pO;
    public a00 wxUZMvaN;
    public final ColorStateList ygLcUYwZ;
    public int ytu5o6f4;
    public boolean zCflySGU;

    public mv(Context context) {
        super(context);
        this.VgvYg0wo = new SparseArray();
        this.jb9XjC4I = -1;
        this.eVhOlqcC = -1;
        this.FySoLYna = new SparseArray();
        this.gjV1z5T1 = -1;
        this.WYNAV5pd = -1;
        this.DK9slbsy = -1;
        this.lwWCatUu = -1;
        this.pRiPUEwG = 49;
        this.aZz0PFXp = false;
        this.nSmgoSB5 = 1;
        this.N8VPGzVC = 0;
        this.ZyZthT5G = null;
        this.bvfAo0eO = 7;
        this.KRabZ4CU = false;
        this.gmkaJpmS = new Rect();
        this.ygLcUYwZ = MdtA4re8();
        if (isInEditMode()) {
            this.NCTxEWno = null;
        } else {
            j1 j1Var = new j1();
            this.NCTxEWno = j1Var;
            j1Var.fVMzMhyS(0);
            j1Var.ygLcUYwZ();
            j1Var.U0LaHZX7(ra.eIA6dogk(getContext(), com.kolosta.rejin.jilosa.R.attr.motionDurationMedium4, getResources().getInteger(com.kolosta.rejin.jilosa.R.integer.material_motion_duration_long_1)));
            j1Var.Mq3SeTnW(w30.hzgxAD8d(getContext(), com.kolosta.rejin.jilosa.R.attr.motionEasingStandard, yoc1Y4KB.NCTxEWno));
            j1Var.VhgXwMj9(new fc0());
        }
        this.MdtA4re8 = new pP9Y2m6O(2, (r2) this);
        setImportantForAccessibility(1);
    }

    private int getCollapsedVisibleItemCount() {
        return Math.min(this.bvfAo0eO, this.hzgxAD8d.VgvYg0wo);
    }

    private iv getNewItem() {
        a00 a00Var = this.wxUZMvaN;
        iv ivVar = a00Var != null ? (iv) a00Var.qoPGr6Ce() : null;
        return ivVar == null ? new q2(getContext()) : ivVar;
    }

    private void setBadgeIfNeeded(iv ivVar) {
        t1 t1Var;
        int id = ivVar.getId();
        if (id == -1 || (t1Var = (t1) this.FySoLYna.get(id)) == null) {
            return;
        }
        ivVar.setBadge(t1Var);
    }

    public final ColorStateList MdtA4re8() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(R.attr.textColorSecondary, typedValue, true)) {
            return null;
        }
        ColorStateList RXQxj5Oe = w30.RXQxj5Oe(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(com.kolosta.rejin.jilosa.R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i = typedValue.data;
        int defaultColor = RXQxj5Oe.getDefaultColor();
        int[] iArr = TrssYQ34;
        int[] iArr2 = ViewGroup.EMPTY_STATE_SET;
        int[] iArr3 = g2aRJUAd;
        return new ColorStateList(new int[][]{iArr3, iArr, iArr2}, new int[]{RXQxj5Oe.getColorForState(iArr3, defaultColor), i, defaultColor});
    }

    @Override // defpackage.rs
    public final void NCTxEWno(yr yrVar) {
        this.hzgxAD8d = new kv(yrVar);
    }

    public final iv VgvYg0wo(int i, cs csVar, boolean z, boolean z2) {
        this.fVMzMhyS.MdtA4re8 = true;
        csVar.setCheckable(true);
        this.fVMzMhyS.MdtA4re8 = false;
        iv newItem = getNewItem();
        newItem.setShifting(z);
        newItem.setLabelMaxLines(this.nSmgoSB5);
        newItem.setIconTintList(this.k3x7lurq);
        newItem.setIconSize(this.ow5vqvCr);
        newItem.setTextColor(this.ygLcUYwZ);
        newItem.setTextAppearanceInactive(this.lDXGDhIF);
        newItem.setTextAppearanceActive(this.sjUBp5pO);
        newItem.setHorizontalTextAppearanceInactive(this.OxcuoDLp);
        newItem.setHorizontalTextAppearanceActive(this.amk52bBQ);
        newItem.setTextAppearanceActiveBoldEnabled(this.KlHjfFWx);
        newItem.setTextColor(this.OnDfzHZD);
        int i2 = this.gjV1z5T1;
        if (i2 != -1) {
            newItem.setItemPaddingTop(i2);
        }
        int i3 = this.WYNAV5pd;
        if (i3 != -1) {
            newItem.setItemPaddingBottom(i3);
        }
        newItem.setMeasureBottomPaddingFromLabelBaseline(this.zCflySGU);
        newItem.setLabelFontScalingEnabled(this.FXJmAAN1);
        int i4 = this.DK9slbsy;
        if (i4 != -1) {
            newItem.setActiveIndicatorLabelPadding(i4);
        }
        int i5 = this.lwWCatUu;
        if (i5 != -1) {
            newItem.setIconLabelHorizontalSpacing(i5);
        }
        newItem.setActiveIndicatorWidth(this.i7xS8jrb);
        newItem.setActiveIndicatorHeight(this.Mq3SeTnW);
        newItem.setActiveIndicatorExpandedWidth(this.euDDoUNr);
        newItem.setActiveIndicatorExpandedHeight(this.SgZGMMPL);
        newItem.setActiveIndicatorMarginHorizontal(this.ytu5o6f4);
        newItem.setItemGravity(this.pRiPUEwG);
        newItem.setActiveIndicatorExpandedPadding(this.gmkaJpmS);
        newItem.setActiveIndicatorExpandedMarginHorizontal(this.eIA6dogk);
        newItem.setActiveIndicatorDrawable(wxUZMvaN());
        newItem.setActiveIndicatorResizeable(this.aZz0PFXp);
        newItem.setActiveIndicatorEnabled(this.U0LaHZX7);
        Drawable drawable = this.Ey6iv0m0;
        if (drawable != null) {
            newItem.setItemBackground(drawable);
        } else {
            newItem.setItemBackground(this.RXQxj5Oe);
        }
        newItem.setItemRippleColor(this.I5GHvsYW);
        newItem.setLabelVisibilityMode(this.P7K7Inc8);
        newItem.setItemIconGravity(this.b2ZJblxo);
        newItem.setOnlyShowWhenExpanded(z2);
        newItem.setExpanded(this.HdOGZAzC);
        newItem.qoPGr6Ce(csVar);
        newItem.setItemPosition(i);
        int i6 = csVar.qoPGr6Ce;
        newItem.setOnTouchListener((View.OnTouchListener) this.VgvYg0wo.get(i6));
        newItem.setOnClickListener(this.MdtA4re8);
        int i7 = this.jb9XjC4I;
        if (i7 != 0 && i6 == i7) {
            this.eVhOlqcC = i;
        }
        setBadgeIfNeeded(newItem);
        return newItem;
    }

    public int getActiveIndicatorLabelPadding() {
        return this.DK9slbsy;
    }

    public SparseArray<t1> getBadgeDrawables() {
        return this.FySoLYna;
    }

    public int getCurrentVisibleContentItemCount() {
        return this.HdOGZAzC ? this.hzgxAD8d.wxUZMvaN : getCollapsedVisibleItemCount();
    }

    public int getHorizontalItemTextAppearanceActive() {
        return this.amk52bBQ;
    }

    public int getHorizontalItemTextAppearanceInactive() {
        return this.OxcuoDLp;
    }

    public int getIconLabelHorizontalSpacing() {
        return this.lwWCatUu;
    }

    public ColorStateList getIconTintList() {
        return this.k3x7lurq;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.Xkz7p5xa;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.U0LaHZX7;
    }

    public int getItemActiveIndicatorExpandedHeight() {
        return this.SgZGMMPL;
    }

    public int getItemActiveIndicatorExpandedMarginHorizontal() {
        return this.eIA6dogk;
    }

    public int getItemActiveIndicatorExpandedWidth() {
        return this.euDDoUNr;
    }

    public int getItemActiveIndicatorHeight() {
        return this.Mq3SeTnW;
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.ytu5o6f4;
    }

    public t60 getItemActiveIndicatorShapeAppearance() {
        return this.VhgXwMj9;
    }

    public int getItemActiveIndicatorWidth() {
        return this.i7xS8jrb;
    }

    public Drawable getItemBackground() {
        lv[] lvVarArr = this.Qr9iLBAD;
        if (lvVarArr != null && lvVarArr.length > 0) {
            for (lv lvVar : lvVarArr) {
                if (lvVar instanceof iv) {
                    return ((iv) lvVar).getBackground();
                }
            }
        }
        return this.Ey6iv0m0;
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.RXQxj5Oe;
    }

    public int getItemGravity() {
        return this.pRiPUEwG;
    }

    public int getItemIconGravity() {
        return this.b2ZJblxo;
    }

    public int getItemIconSize() {
        return this.ow5vqvCr;
    }

    public int getItemPaddingBottom() {
        return this.WYNAV5pd;
    }

    public int getItemPaddingTop() {
        return this.gjV1z5T1;
    }

    public ColorStateList getItemRippleColor() {
        return this.I5GHvsYW;
    }

    public int getItemTextAppearanceActive() {
        return this.sjUBp5pO;
    }

    public int getItemTextAppearanceInactive() {
        return this.lDXGDhIF;
    }

    public ColorStateList getItemTextColor() {
        return this.OnDfzHZD;
    }

    public int getLabelMaxLines() {
        return this.nSmgoSB5;
    }

    public int getLabelVisibilityMode() {
        return this.P7K7Inc8;
    }

    public kv getMenu() {
        return this.hzgxAD8d;
    }

    public boolean getScaleLabelTextWithFont() {
        return this.FXJmAAN1;
    }

    public int getSelectedItemId() {
        return this.jb9XjC4I;
    }

    public int getSelectedItemPosition() {
        return this.eVhOlqcC;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, getCurrentVisibleContentItemCount(), false, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void qoPGr6Ce() {
        iv ivVar;
        removeAllViews();
        lv[] lvVarArr = this.Qr9iLBAD;
        if (lvVarArr != null && this.wxUZMvaN != null) {
            for (lv lvVar : lvVarArr) {
                if (lvVar instanceof iv) {
                    iv ivVar2 = (iv) lvVar;
                    this.wxUZMvaN.MdtA4re8(ivVar2);
                    ivVar2.eVhOlqcC(ivVar2.I5GHvsYW);
                    ivVar2.VhgXwMj9 = null;
                    ivVar2.FXJmAAN1 = 0.0f;
                    ivVar2.NCTxEWno = false;
                }
            }
        }
        this.fVMzMhyS.MdtA4re8 = true;
        this.hzgxAD8d.NCTxEWno();
        this.fVMzMhyS.MdtA4re8 = false;
        int i = this.hzgxAD8d.MdtA4re8;
        if (i == 0) {
            this.jb9XjC4I = 0;
            this.eVhOlqcC = 0;
            this.Qr9iLBAD = null;
            this.wxUZMvaN = null;
            return;
        }
        if (this.wxUZMvaN == null || this.N8VPGzVC != i) {
            this.N8VPGzVC = i;
            this.wxUZMvaN = new a00(i);
        }
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < this.hzgxAD8d.NCTxEWno.size(); i2++) {
            hashSet.add(Integer.valueOf(this.hzgxAD8d.qoPGr6Ce(i2).getItemId()));
        }
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.FySoLYna;
            if (i3 >= sparseArray.size()) {
                break;
            }
            int keyAt = sparseArray.keyAt(i3);
            if (!hashSet.contains(Integer.valueOf(keyAt))) {
                sparseArray.delete(keyAt);
            }
            i3++;
        }
        int size = this.hzgxAD8d.NCTxEWno.size();
        this.Qr9iLBAD = new lv[size];
        int i4 = this.P7K7Inc8;
        boolean z = i4 != -1 ? i4 == 0 : getCurrentVisibleContentItemCount() > 3;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            MenuItem qoPGr6Ce = this.hzgxAD8d.qoPGr6Ce(i7);
            boolean z2 = qoPGr6Ce instanceof pd;
            if (z2) {
                Context context = getContext();
                fv fvVar = new fv(context);
                LayoutInflater.from(context).inflate(com.kolosta.rejin.jilosa.R.layout.m3_navigation_menu_divider, (ViewGroup) fvVar, true);
                fvVar.NCTxEWno();
                fvVar.setOnlyShowWhenExpanded(true);
                fvVar.setDividersEnabled(this.KRabZ4CU);
                ivVar = fvVar;
            } else if (qoPGr6Ce.hasSubMenu()) {
                if (i5 > 0) {
                    m1.sjUBp5pO("Only one layer of submenu is supported; a submenu inside a submenu is not supported by the Navigation Bar.");
                    return;
                }
                pv pvVar = new pv(getContext());
                int i8 = this.amk52bBQ;
                if (i8 == 0) {
                    i8 = this.sjUBp5pO;
                }
                pvVar.setTextAppearance(i8);
                pvVar.setTextColor(this.OnDfzHZD);
                pvVar.setOnlyShowWhenExpanded(true);
                pvVar.qoPGr6Ce((cs) qoPGr6Ce);
                i5 = qoPGr6Ce.getSubMenu().size();
                ivVar = pvVar;
            } else if (i5 > 0) {
                i5--;
                ivVar = VgvYg0wo(i7, (cs) qoPGr6Ce, z, true);
            } else {
                cs csVar = (cs) qoPGr6Ce;
                boolean z3 = i6 >= this.bvfAo0eO;
                i6++;
                ivVar = VgvYg0wo(i7, csVar, z, z3);
            }
            if (!z2 && qoPGr6Ce.isCheckable() && this.eVhOlqcC == -1) {
                this.eVhOlqcC = i7;
            }
            this.Qr9iLBAD[i7] = ivVar;
            addView(ivVar);
        }
        int min = Math.min(size - 1, this.eVhOlqcC);
        this.eVhOlqcC = min;
        setCheckedItem(this.Qr9iLBAD[min].getItemData());
    }

    public void setActiveIndicatorLabelPadding(int i) {
        this.DK9slbsy = i;
        lv[] lvVarArr = this.Qr9iLBAD;
        if (lvVarArr != null) {
            for (lv lvVar : lvVarArr) {
                if (lvVar instanceof iv) {
                    ((iv) lvVar).setActiveIndicatorLabelPadding(i);
                }
            }
        }
    }

    public void setCheckedItem(MenuItem menuItem) {
        if (this.ZyZthT5G == menuItem || !menuItem.isCheckable()) {
            return;
        }
        MenuItem menuItem2 = this.ZyZthT5G;
        if (menuItem2 != null && menuItem2.isChecked()) {
            this.ZyZthT5G.setChecked(false);
        }
        menuItem.setChecked(true);
        this.ZyZthT5G = menuItem;
    }

    public void setCollapsedMaxItemCount(int i) {
        this.bvfAo0eO = i;
    }

    public void setExpanded(boolean z) {
        this.HdOGZAzC = z;
        lv[] lvVarArr = this.Qr9iLBAD;
        if (lvVarArr != null) {
            for (lv lvVar : lvVarArr) {
                lvVar.setExpanded(z);
            }
        }
    }

    public void setHorizontalItemTextAppearanceActive(int i) {
        this.amk52bBQ = i;
        lv[] lvVarArr = this.Qr9iLBAD;
        if (lvVarArr != null) {
            for (lv lvVar : lvVarArr) {
                if (lvVar instanceof iv) {
                    ((iv) lvVar).setHorizontalTextAppearanceActive(i);
                }
            }
        }
    }

    public void setHorizontalItemTextAppearanceInactive(int i) {
        this.OxcuoDLp = i;
        lv[] lvVarArr = this.Qr9iLBAD;
        if (lvVarArr != null) {
            for (lv lvVar : lvVarArr) {
                if (lvVar instanceof iv) {
                    ((iv) lvVar).setHorizontalTextAppearanceInactive(i);
                }
            }
        }
    }

    public void setIconLabelHorizontalSpacing(int i) {
        this.lwWCatUu = i;
        lv[] lvVarArr = this.Qr9iLBAD;
        if (lvVarArr != null) {
            for (lv lvVar : lvVarArr) {
                if (lvVar instanceof iv) {
                    ((iv) lvVar).setIconLabelHorizontalSpacing(i);
                }
            }
        }
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.k3x7lurq = colorStateList;
        lv[] lvVarArr = this.Qr9iLBAD;
        if (lvVarArr != null) {
            for (lv lvVar : lvVarArr) {
                if (lvVar instanceof iv) {
                    ((iv) lvVar).setIconTintList(colorStateList);
                }
            }
        }
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.Xkz7p5xa = colorStateList;
        lv[] lvVarArr = this.Qr9iLBAD;
        if (lvVarArr != null) {
            for (lv lvVar : lvVarArr) {
                if (lvVar instanceof iv) {
                    ((iv) lvVar).setActiveIndicatorDrawable(wxUZMvaN());
                }
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.U0LaHZX7 = z;
        lv[] lvVarArr = this.Qr9iLBAD;
        if (lvVarArr != null) {
            for (lv lvVar : lvVarArr) {
                if (lvVar instanceof iv) {
                    ((iv) lvVar).setActiveIndicatorEnabled(z);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedHeight(int i) {
        this.SgZGMMPL = i;
        lv[] lvVarArr = this.Qr9iLBAD;
        if (lvVarArr != null) {
            for (lv lvVar : lvVarArr) {
                if (lvVar instanceof iv) {
                    ((iv) lvVar).setActiveIndicatorExpandedHeight(i);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedMarginHorizontal(int i) {
        this.eIA6dogk = i;
        lv[] lvVarArr = this.Qr9iLBAD;
        if (lvVarArr != null) {
            for (lv lvVar : lvVarArr) {
                if (lvVar instanceof iv) {
                    ((iv) lvVar).setActiveIndicatorExpandedMarginHorizontal(i);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedWidth(int i) {
        this.euDDoUNr = i;
        lv[] lvVarArr = this.Qr9iLBAD;
        if (lvVarArr != null) {
            for (lv lvVar : lvVarArr) {
                if (lvVar instanceof iv) {
                    ((iv) lvVar).setActiveIndicatorExpandedWidth(i);
                }
            }
        }
    }

    public void setItemActiveIndicatorHeight(int i) {
        this.Mq3SeTnW = i;
        lv[] lvVarArr = this.Qr9iLBAD;
        if (lvVarArr != null) {
            for (lv lvVar : lvVarArr) {
                if (lvVar instanceof iv) {
                    ((iv) lvVar).setActiveIndicatorHeight(i);
                }
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(int i) {
        this.ytu5o6f4 = i;
        lv[] lvVarArr = this.Qr9iLBAD;
        if (lvVarArr != null) {
            for (lv lvVar : lvVarArr) {
                if (lvVar instanceof iv) {
                    ((iv) lvVar).setActiveIndicatorMarginHorizontal(i);
                }
            }
        }
    }

    public void setItemActiveIndicatorResizeable(boolean z) {
        this.aZz0PFXp = z;
        lv[] lvVarArr = this.Qr9iLBAD;
        if (lvVarArr != null) {
            for (lv lvVar : lvVarArr) {
                if (lvVar instanceof iv) {
                    ((iv) lvVar).setActiveIndicatorResizeable(z);
                }
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(t60 t60Var) {
        this.VhgXwMj9 = t60Var;
        lv[] lvVarArr = this.Qr9iLBAD;
        if (lvVarArr != null) {
            for (lv lvVar : lvVarArr) {
                if (lvVar instanceof iv) {
                    ((iv) lvVar).setActiveIndicatorDrawable(wxUZMvaN());
                }
            }
        }
    }

    public void setItemActiveIndicatorWidth(int i) {
        this.i7xS8jrb = i;
        lv[] lvVarArr = this.Qr9iLBAD;
        if (lvVarArr != null) {
            for (lv lvVar : lvVarArr) {
                if (lvVar instanceof iv) {
                    ((iv) lvVar).setActiveIndicatorWidth(i);
                }
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.Ey6iv0m0 = drawable;
        lv[] lvVarArr = this.Qr9iLBAD;
        if (lvVarArr != null) {
            for (lv lvVar : lvVarArr) {
                if (lvVar instanceof iv) {
                    ((iv) lvVar).setItemBackground(drawable);
                }
            }
        }
    }

    public void setItemBackgroundRes(int i) {
        this.RXQxj5Oe = i;
        lv[] lvVarArr = this.Qr9iLBAD;
        if (lvVarArr != null) {
            for (lv lvVar : lvVarArr) {
                if (lvVar instanceof iv) {
                    ((iv) lvVar).setItemBackground(i);
                }
            }
        }
    }

    public void setItemGravity(int i) {
        this.pRiPUEwG = i;
        lv[] lvVarArr = this.Qr9iLBAD;
        if (lvVarArr != null) {
            for (lv lvVar : lvVarArr) {
                if (lvVar instanceof iv) {
                    ((iv) lvVar).setItemGravity(i);
                }
            }
        }
    }

    public void setItemIconGravity(int i) {
        this.b2ZJblxo = i;
        lv[] lvVarArr = this.Qr9iLBAD;
        if (lvVarArr != null) {
            for (lv lvVar : lvVarArr) {
                if (lvVar instanceof iv) {
                    ((iv) lvVar).setItemIconGravity(i);
                }
            }
        }
    }

    public void setItemIconSize(int i) {
        this.ow5vqvCr = i;
        lv[] lvVarArr = this.Qr9iLBAD;
        if (lvVarArr != null) {
            for (lv lvVar : lvVarArr) {
                if (lvVar instanceof iv) {
                    ((iv) lvVar).setIconSize(i);
                }
            }
        }
    }

    public void setItemPaddingBottom(int i) {
        this.WYNAV5pd = i;
        lv[] lvVarArr = this.Qr9iLBAD;
        if (lvVarArr != null) {
            for (lv lvVar : lvVarArr) {
                if (lvVar instanceof iv) {
                    ((iv) lvVar).setItemPaddingBottom(this.WYNAV5pd);
                }
            }
        }
    }

    public void setItemPaddingTop(int i) {
        this.gjV1z5T1 = i;
        lv[] lvVarArr = this.Qr9iLBAD;
        if (lvVarArr != null) {
            for (lv lvVar : lvVarArr) {
                if (lvVar instanceof iv) {
                    ((iv) lvVar).setItemPaddingTop(i);
                }
            }
        }
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.I5GHvsYW = colorStateList;
        lv[] lvVarArr = this.Qr9iLBAD;
        if (lvVarArr != null) {
            for (lv lvVar : lvVarArr) {
                if (lvVar instanceof iv) {
                    ((iv) lvVar).setItemRippleColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceActive(int i) {
        this.sjUBp5pO = i;
        lv[] lvVarArr = this.Qr9iLBAD;
        if (lvVarArr != null) {
            for (lv lvVar : lvVarArr) {
                if (lvVar instanceof iv) {
                    ((iv) lvVar).setTextAppearanceActive(i);
                }
            }
        }
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z) {
        this.KlHjfFWx = z;
        lv[] lvVarArr = this.Qr9iLBAD;
        if (lvVarArr != null) {
            for (lv lvVar : lvVarArr) {
                if (lvVar instanceof iv) {
                    ((iv) lvVar).setTextAppearanceActiveBoldEnabled(z);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(int i) {
        this.lDXGDhIF = i;
        lv[] lvVarArr = this.Qr9iLBAD;
        if (lvVarArr != null) {
            for (lv lvVar : lvVarArr) {
                if (lvVar instanceof iv) {
                    ((iv) lvVar).setTextAppearanceInactive(i);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.OnDfzHZD = colorStateList;
        lv[] lvVarArr = this.Qr9iLBAD;
        if (lvVarArr != null) {
            for (lv lvVar : lvVarArr) {
                if (lvVar instanceof iv) {
                    ((iv) lvVar).setTextColor(colorStateList);
                }
            }
        }
    }

    public void setLabelFontScalingEnabled(boolean z) {
        this.FXJmAAN1 = z;
        lv[] lvVarArr = this.Qr9iLBAD;
        if (lvVarArr != null) {
            for (lv lvVar : lvVarArr) {
                if (lvVar instanceof iv) {
                    ((iv) lvVar).setLabelFontScalingEnabled(z);
                }
            }
        }
    }

    public void setLabelMaxLines(int i) {
        this.nSmgoSB5 = i;
        lv[] lvVarArr = this.Qr9iLBAD;
        if (lvVarArr != null) {
            for (lv lvVar : lvVarArr) {
                if (lvVar instanceof iv) {
                    ((iv) lvVar).setLabelMaxLines(i);
                }
            }
        }
    }

    public void setLabelVisibilityMode(int i) {
        this.P7K7Inc8 = i;
    }

    public void setMeasurePaddingFromLabelBaseline(boolean z) {
        this.zCflySGU = z;
        lv[] lvVarArr = this.Qr9iLBAD;
        if (lvVarArr != null) {
            for (lv lvVar : lvVarArr) {
                if (lvVar instanceof iv) {
                    ((iv) lvVar).setMeasureBottomPaddingFromLabelBaseline(z);
                }
            }
        }
    }

    public void setPresenter(ov ovVar) {
        this.fVMzMhyS = ovVar;
    }

    public void setSubmenuDividersEnabled(boolean z) {
        if (this.KRabZ4CU == z) {
            return;
        }
        this.KRabZ4CU = z;
        lv[] lvVarArr = this.Qr9iLBAD;
        if (lvVarArr != null) {
            for (lv lvVar : lvVarArr) {
                if (lvVar instanceof fv) {
                    ((fv) lvVar).setDividersEnabled(z);
                }
            }
        }
    }

    public final tr wxUZMvaN() {
        if (this.VhgXwMj9 == null || this.Xkz7p5xa == null) {
            return null;
        }
        tr trVar = new tr(this.VhgXwMj9);
        trVar.OxcuoDLp(this.Xkz7p5xa);
        return trVar;
    }
}
