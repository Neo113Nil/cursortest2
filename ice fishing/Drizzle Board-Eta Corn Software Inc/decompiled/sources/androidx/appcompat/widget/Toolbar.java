package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.kolosta.rejin.jilosa.R;
import defpackage.CMlnIseC;
import defpackage.CTE3lpUp;
import defpackage.EiHZrOWV;
import defpackage.ad0;
import defpackage.bd0;
import defpackage.cs;
import defpackage.d40;
import defpackage.dd0;
import defpackage.e50;
import defpackage.f0;
import defpackage.fh0;
import defpackage.hg0;
import defpackage.i1;
import defpackage.pP9Y2m6O;
import defpackage.ra;
import defpackage.ra0;
import defpackage.sa;
import defpackage.uc0;
import defpackage.vc0;
import defpackage.w;
import defpackage.wc0;
import defpackage.xc0;
import defpackage.xi;
import defpackage.yc0;
import defpackage.yr;
import defpackage.z00;
import defpackage.zc0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    public CharSequence DK9slbsy;
    public int Ey6iv0m0;
    public OnBackInvokedDispatcher FXJmAAN1;
    public int FySoLYna;
    public d40 I5GHvsYW;
    public int KlHjfFWx;
    public w MdtA4re8;
    public boolean Mq3SeTnW;
    public final i1 N8VPGzVC;
    public ActionMenuView NCTxEWno;
    public int OnDfzHZD;
    public int OxcuoDLp;
    public CMlnIseC P7K7Inc8;
    public final CharSequence Qr9iLBAD;
    public int RXQxj5Oe;
    public final ArrayList SgZGMMPL;
    public ColorStateList U0LaHZX7;
    public EiHZrOWV VgvYg0wo;
    public final vc0 VhgXwMj9;
    public CharSequence WYNAV5pd;
    public CTE3lpUp Xkz7p5xa;
    public dd0 aZz0PFXp;
    public int amk52bBQ;
    public final Drawable b2ZJblxo;
    public final f0 eIA6dogk;
    public View eVhOlqcC;
    public final ArrayList euDDoUNr;
    public xc0 fVMzMhyS;
    public final int gjV1z5T1;
    public boolean hzgxAD8d;
    public boolean i7xS8jrb;
    public EiHZrOWV jb9XjC4I;
    public Context k3x7lurq;
    public final int lDXGDhIF;
    public ColorStateList lwWCatUu;
    public boolean nSmgoSB5;
    public int ow5vqvCr;
    public ArrayList pRiPUEwG;
    public final int sjUBp5pO;
    public w wxUZMvaN;
    public int ygLcUYwZ;
    public final int[] ytu5o6f4;
    public OnBackInvokedCallback zCflySGU;

    public Toolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.gjV1z5T1 = 8388627;
        this.euDDoUNr = new ArrayList();
        this.SgZGMMPL = new ArrayList();
        this.ytu5o6f4 = new int[2];
        this.eIA6dogk = new f0(new uc0(this, 1));
        this.pRiPUEwG = new ArrayList();
        this.VhgXwMj9 = new vc0(this);
        this.N8VPGzVC = new i1(10, this);
        Context context2 = getContext();
        int[] iArr = z00.FySoLYna;
        f0 Mq3SeTnW = f0.Mq3SeTnW(context2, attributeSet, iArr, R.attr.toolbarStyle);
        hg0.jb9XjC4I(this, context, iArr, attributeSet, (TypedArray) Mq3SeTnW.MdtA4re8, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) Mq3SeTnW.MdtA4re8;
        this.OnDfzHZD = typedArray.getResourceId(28, 0);
        this.ygLcUYwZ = typedArray.getResourceId(19, 0);
        this.gjV1z5T1 = typedArray.getInteger(0, 8388627);
        this.lDXGDhIF = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.Ey6iv0m0 = dimensionPixelOffset;
        this.KlHjfFWx = dimensionPixelOffset;
        this.amk52bBQ = dimensionPixelOffset;
        this.OxcuoDLp = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.OxcuoDLp = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.amk52bBQ = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.KlHjfFWx = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.Ey6iv0m0 = dimensionPixelOffset5;
        }
        this.sjUBp5pO = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        wxUZMvaN();
        d40 d40Var = this.I5GHvsYW;
        d40Var.Qr9iLBAD = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            d40Var.VgvYg0wo = dimensionPixelSize;
            d40Var.qoPGr6Ce = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            d40Var.P7K7Inc8 = dimensionPixelSize2;
            d40Var.NCTxEWno = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            d40Var.qoPGr6Ce(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.RXQxj5Oe = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.FySoLYna = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.b2ZJblxo = Mq3SeTnW.OxcuoDLp(4);
        this.Qr9iLBAD = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.k3x7lurq = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable OxcuoDLp = Mq3SeTnW.OxcuoDLp(16);
        if (OxcuoDLp != null) {
            setNavigationIcon(OxcuoDLp);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable OxcuoDLp2 = Mq3SeTnW.OxcuoDLp(11);
        if (OxcuoDLp2 != null) {
            setLogo(OxcuoDLp2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(Mq3SeTnW.sjUBp5pO(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(Mq3SeTnW.sjUBp5pO(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        Mq3SeTnW.SgZGMMPL();
    }

    public static yc0 Qr9iLBAD() {
        yc0 yc0Var = new yc0(-2, -2);
        yc0Var.NCTxEWno = 0;
        yc0Var.qoPGr6Ce = 8388627;
        return yc0Var;
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new ra0(getContext());
    }

    public static yc0 jb9XjC4I(ViewGroup.LayoutParams layoutParams) {
        boolean z = layoutParams instanceof yc0;
        if (z) {
            yc0 yc0Var = (yc0) layoutParams;
            yc0 yc0Var2 = new yc0(yc0Var);
            yc0Var2.NCTxEWno = 0;
            yc0Var2.NCTxEWno = yc0Var.NCTxEWno;
            return yc0Var2;
        }
        if (z) {
            yc0 yc0Var3 = new yc0((yc0) layoutParams);
            yc0Var3.NCTxEWno = 0;
            return yc0Var3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            yc0 yc0Var4 = new yc0(layoutParams);
            yc0Var4.NCTxEWno = 0;
            return yc0Var4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        yc0 yc0Var5 = new yc0(marginLayoutParams);
        yc0Var5.NCTxEWno = 0;
        ((ViewGroup.MarginLayoutParams) yc0Var5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) yc0Var5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) yc0Var5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) yc0Var5).bottomMargin = marginLayoutParams.bottomMargin;
        return yc0Var5;
    }

    public static int k3x7lurq(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int ow5vqvCr(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void Ey6iv0m0() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher qoPGr6Ce = wc0.qoPGr6Ce(this);
            xc0 xc0Var = this.fVMzMhyS;
            int i = 0;
            boolean z = (xc0Var == null || xc0Var.MdtA4re8 == null || qoPGr6Ce == null || !isAttachedToWindow() || !this.nSmgoSB5) ? false : true;
            if (!z || this.FXJmAAN1 != null) {
                if (z || (onBackInvokedDispatcher = this.FXJmAAN1) == null) {
                    return;
                }
                wc0.wxUZMvaN(onBackInvokedDispatcher, this.zCflySGU);
                this.FXJmAAN1 = null;
                return;
            }
            OnBackInvokedCallback onBackInvokedCallback = this.zCflySGU;
            if (onBackInvokedCallback == null) {
                onBackInvokedCallback = wc0.NCTxEWno(new uc0(this, i));
                this.zCflySGU = onBackInvokedCallback;
            }
            wc0.MdtA4re8(qoPGr6Ce, onBackInvokedCallback);
            this.FXJmAAN1 = qoPGr6Ce;
        }
    }

    public final boolean KlHjfFWx(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final void MdtA4re8() {
        if (this.jb9XjC4I == null) {
            EiHZrOWV eiHZrOWV = new EiHZrOWV(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.jb9XjC4I = eiHZrOWV;
            eiHZrOWV.setImageDrawable(this.b2ZJblxo);
            this.jb9XjC4I.setContentDescription(this.Qr9iLBAD);
            yc0 Qr9iLBAD = Qr9iLBAD();
            Qr9iLBAD.qoPGr6Ce = (this.lDXGDhIF & 112) | 8388611;
            Qr9iLBAD.NCTxEWno = 2;
            this.jb9XjC4I.setLayoutParams(Qr9iLBAD);
            this.jb9XjC4I.setOnClickListener(new pP9Y2m6O(3, this));
        }
    }

    public final void NCTxEWno(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        yc0 Qr9iLBAD = layoutParams == null ? Qr9iLBAD() : !checkLayoutParams(layoutParams) ? jb9XjC4I(layoutParams) : (yc0) layoutParams;
        Qr9iLBAD.NCTxEWno = 1;
        if (!z || this.eVhOlqcC == null) {
            addView(view, Qr9iLBAD);
        } else {
            view.setLayoutParams(Qr9iLBAD);
            this.SgZGMMPL.add(view);
        }
    }

    public final void OnDfzHZD() {
        ArrayList arrayList = this.pRiPUEwG;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            getMenu().removeItem(((MenuItem) obj).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.eIA6dogk.VgvYg0wo).iterator();
        while (it.hasNext()) {
            ((xi) it.next()).qoPGr6Ce.eVhOlqcC();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.pRiPUEwG = currentMenuItems2;
    }

    public final int OxcuoDLp(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void P7K7Inc8() {
        if (this.NCTxEWno == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.NCTxEWno = actionMenuView;
            actionMenuView.setPopupTheme(this.ow5vqvCr);
            this.NCTxEWno.setOnMenuItemClickListener(this.VhgXwMj9);
            ActionMenuView actionMenuView2 = this.NCTxEWno;
            vc0 vc0Var = new vc0(this);
            actionMenuView2.getClass();
            actionMenuView2.RXQxj5Oe = vc0Var;
            yc0 Qr9iLBAD = Qr9iLBAD();
            Qr9iLBAD.qoPGr6Ce = (this.lDXGDhIF & 112) | 8388613;
            this.NCTxEWno.setLayoutParams(Qr9iLBAD);
            NCTxEWno(this.NCTxEWno, false);
        }
    }

    public final void VgvYg0wo() {
        P7K7Inc8();
        ActionMenuView actionMenuView = this.NCTxEWno;
        if (actionMenuView.OxcuoDLp == null) {
            yr yrVar = (yr) actionMenuView.getMenu();
            if (this.fVMzMhyS == null) {
                this.fVMzMhyS = new xc0(this);
            }
            this.NCTxEWno.setExpandedActionViewsExclusive(true);
            yrVar.NCTxEWno(this.fVMzMhyS, this.k3x7lurq);
            Ey6iv0m0();
        }
    }

    public final void amk52bBQ(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final void b2ZJblxo() {
        if (this.VgvYg0wo == null) {
            this.VgvYg0wo = new EiHZrOWV(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            yc0 Qr9iLBAD = Qr9iLBAD();
            Qr9iLBAD.qoPGr6Ce = (this.lDXGDhIF & 112) | 8388611;
            this.VgvYg0wo.setLayoutParams(Qr9iLBAD);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof yc0);
    }

    public final int eVhOlqcC(View view, int i) {
        yc0 yc0Var = (yc0) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = yc0Var.qoPGr6Ce & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.gjV1z5T1 & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) yc0Var).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i5 = ((ViewGroup.MarginLayoutParams) yc0Var).topMargin;
        if (i4 < i5) {
            i4 = i5;
        } else {
            int i6 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
            int i7 = ((ViewGroup.MarginLayoutParams) yc0Var).bottomMargin;
            if (i6 < i7) {
                i4 = Math.max(0, i4 - (i7 - i6));
            }
        }
        return paddingTop + i4;
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return Qr9iLBAD();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        yc0 yc0Var = new yc0(context, attributeSet);
        yc0Var.qoPGr6Ce = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z00.NCTxEWno);
        yc0Var.qoPGr6Ce = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        yc0Var.NCTxEWno = 0;
        return yc0Var;
    }

    public CharSequence getCollapseContentDescription() {
        EiHZrOWV eiHZrOWV = this.jb9XjC4I;
        if (eiHZrOWV != null) {
            return eiHZrOWV.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        EiHZrOWV eiHZrOWV = this.jb9XjC4I;
        if (eiHZrOWV != null) {
            return eiHZrOWV.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        d40 d40Var = this.I5GHvsYW;
        if (d40Var != null) {
            return d40Var.b2ZJblxo ? d40Var.qoPGr6Ce : d40Var.NCTxEWno;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.FySoLYna;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        d40 d40Var = this.I5GHvsYW;
        if (d40Var != null) {
            return d40Var.qoPGr6Ce;
        }
        return 0;
    }

    public int getContentInsetRight() {
        d40 d40Var = this.I5GHvsYW;
        if (d40Var != null) {
            return d40Var.NCTxEWno;
        }
        return 0;
    }

    public int getContentInsetStart() {
        d40 d40Var = this.I5GHvsYW;
        if (d40Var != null) {
            return d40Var.b2ZJblxo ? d40Var.NCTxEWno : d40Var.qoPGr6Ce;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.RXQxj5Oe;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        yr yrVar;
        ActionMenuView actionMenuView = this.NCTxEWno;
        return (actionMenuView == null || (yrVar = actionMenuView.OxcuoDLp) == null || !yrVar.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.FySoLYna, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.RXQxj5Oe, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        CMlnIseC cMlnIseC = this.P7K7Inc8;
        if (cMlnIseC != null) {
            return cMlnIseC.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        CMlnIseC cMlnIseC = this.P7K7Inc8;
        if (cMlnIseC != null) {
            return cMlnIseC.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        VgvYg0wo();
        return this.NCTxEWno.getMenu();
    }

    public View getNavButtonView() {
        return this.VgvYg0wo;
    }

    public CharSequence getNavigationContentDescription() {
        EiHZrOWV eiHZrOWV = this.VgvYg0wo;
        if (eiHZrOWV != null) {
            return eiHZrOWV.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        EiHZrOWV eiHZrOWV = this.VgvYg0wo;
        if (eiHZrOWV != null) {
            return eiHZrOWV.getDrawable();
        }
        return null;
    }

    public CTE3lpUp getOuterActionMenuPresenter() {
        return this.Xkz7p5xa;
    }

    public Drawable getOverflowIcon() {
        VgvYg0wo();
        return this.NCTxEWno.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.k3x7lurq;
    }

    public int getPopupTheme() {
        return this.ow5vqvCr;
    }

    public CharSequence getSubtitle() {
        return this.DK9slbsy;
    }

    public final TextView getSubtitleTextView() {
        return this.wxUZMvaN;
    }

    public CharSequence getTitle() {
        return this.WYNAV5pd;
    }

    public int getTitleMarginBottom() {
        return this.Ey6iv0m0;
    }

    public int getTitleMarginEnd() {
        return this.amk52bBQ;
    }

    public int getTitleMarginStart() {
        return this.OxcuoDLp;
    }

    public int getTitleMarginTop() {
        return this.KlHjfFWx;
    }

    public final TextView getTitleTextView() {
        return this.MdtA4re8;
    }

    public sa getWrapper() {
        Drawable drawable;
        dd0 dd0Var = this.aZz0PFXp;
        if (dd0Var == null) {
            dd0Var = new dd0();
            dd0Var.ygLcUYwZ = 0;
            dd0Var.qoPGr6Ce = this;
            dd0Var.Qr9iLBAD = getTitle();
            dd0Var.jb9XjC4I = getSubtitle();
            dd0Var.b2ZJblxo = dd0Var.Qr9iLBAD != null;
            dd0Var.P7K7Inc8 = getNavigationIcon();
            f0 Mq3SeTnW = f0.Mq3SeTnW(getContext(), null, z00.qoPGr6Ce, R.attr.actionBarStyle);
            TypedArray typedArray = (TypedArray) Mq3SeTnW.MdtA4re8;
            dd0Var.lDXGDhIF = Mq3SeTnW.OxcuoDLp(15);
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                dd0Var.b2ZJblxo = true;
                dd0Var.Qr9iLBAD = text;
                if ((dd0Var.NCTxEWno & 8) != 0) {
                    setTitle(text);
                    if (dd0Var.b2ZJblxo) {
                        hg0.k3x7lurq(getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                dd0Var.jb9XjC4I = text2;
                if ((dd0Var.NCTxEWno & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable OxcuoDLp = Mq3SeTnW.OxcuoDLp(20);
            if (OxcuoDLp != null) {
                dd0Var.VgvYg0wo = OxcuoDLp;
                dd0Var.MdtA4re8();
            }
            Drawable OxcuoDLp2 = Mq3SeTnW.OxcuoDLp(17);
            if (OxcuoDLp2 != null) {
                dd0Var.wxUZMvaN = OxcuoDLp2;
                dd0Var.MdtA4re8();
            }
            if (dd0Var.P7K7Inc8 == null && (drawable = dd0Var.lDXGDhIF) != null) {
                dd0Var.P7K7Inc8 = drawable;
                if ((dd0Var.NCTxEWno & 4) != 0) {
                    setNavigationIcon(drawable);
                } else {
                    setNavigationIcon((Drawable) null);
                }
            }
            dd0Var.qoPGr6Ce(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = dd0Var.MdtA4re8;
                if (view != null && (dd0Var.NCTxEWno & 16) != 0) {
                    removeView(view);
                }
                dd0Var.MdtA4re8 = inflate;
                if (inflate != null && (dd0Var.NCTxEWno & 16) != 0) {
                    addView(inflate);
                }
                dd0Var.qoPGr6Ce(dd0Var.NCTxEWno | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int max = Math.max(dimensionPixelOffset, 0);
                int max2 = Math.max(dimensionPixelOffset2, 0);
                wxUZMvaN();
                this.I5GHvsYW.qoPGr6Ce(max, max2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.OnDfzHZD = resourceId2;
                w wVar = this.MdtA4re8;
                if (wVar != null) {
                    wVar.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.ygLcUYwZ = resourceId3;
                w wVar2 = this.wxUZMvaN;
                if (wVar2 != null) {
                    wVar2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            Mq3SeTnW.SgZGMMPL();
            if (R.string.abc_action_bar_up_description != dd0Var.ygLcUYwZ) {
                dd0Var.ygLcUYwZ = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i = dd0Var.ygLcUYwZ;
                    dd0Var.eVhOlqcC = i != 0 ? getContext().getString(i) : null;
                    dd0Var.NCTxEWno();
                }
            }
            dd0Var.eVhOlqcC = getNavigationContentDescription();
            setNavigationOnClickListener(new bd0(dd0Var));
            this.aZz0PFXp = dd0Var;
        }
        return dd0Var;
    }

    public final int lDXGDhIF(View view, int i, int i2, int[] iArr) {
        yc0 yc0Var = (yc0) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) yc0Var).leftMargin - iArr[0];
        int max = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int eVhOlqcC = eVhOlqcC(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, eVhOlqcC, max + measuredWidth, view.getMeasuredHeight() + eVhOlqcC);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) yc0Var).rightMargin + max;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Ey6iv0m0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.N8VPGzVC);
        Ey6iv0m0();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.Mq3SeTnW = false;
        }
        if (!this.Mq3SeTnW) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.Mq3SeTnW = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.Mq3SeTnW = false;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0285 A[LOOP:0: B:44:0x0283->B:45:0x0285, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x029d A[LOOP:1: B:48:0x029b->B:49:0x029d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02bd A[LOOP:2: B:52:0x02bb->B:53:0x02bd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0310 A[LOOP:3: B:61:0x030e->B:62:0x0310, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x020e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int max;
        boolean KlHjfFWx;
        boolean KlHjfFWx2;
        boolean z2;
        int i7;
        int i8;
        int paddingTop;
        int i9;
        int i10;
        int i11;
        int i12;
        int size;
        int i13;
        int i14;
        int size2;
        int i15;
        int size3;
        int i16;
        int i17;
        int i18;
        int size4;
        boolean z3 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i19 = width - paddingRight;
        int[] iArr = this.ytu5o6f4;
        iArr[1] = 0;
        iArr[0] = 0;
        WeakHashMap weakHashMap = hg0.qoPGr6Ce;
        int minimumHeight = getMinimumHeight();
        int min = minimumHeight >= 0 ? Math.min(minimumHeight, i4 - i2) : 0;
        if (KlHjfFWx(this.VgvYg0wo)) {
            EiHZrOWV eiHZrOWV = this.VgvYg0wo;
            if (z3) {
                i6 = sjUBp5pO(eiHZrOWV, i19, min, iArr);
                i5 = paddingLeft;
                if (KlHjfFWx(this.jb9XjC4I)) {
                    EiHZrOWV eiHZrOWV2 = this.jb9XjC4I;
                    if (z3) {
                        i6 = sjUBp5pO(eiHZrOWV2, i6, min, iArr);
                    } else {
                        i5 = lDXGDhIF(eiHZrOWV2, i5, min, iArr);
                    }
                }
                if (KlHjfFWx(this.NCTxEWno)) {
                    ActionMenuView actionMenuView = this.NCTxEWno;
                    if (z3) {
                        i5 = lDXGDhIF(actionMenuView, i5, min, iArr);
                    } else {
                        i6 = sjUBp5pO(actionMenuView, i6, min, iArr);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - i5);
                iArr[1] = Math.max(0, currentContentInsetRight - (i19 - i6));
                max = Math.max(i5, currentContentInsetLeft);
                int min2 = Math.min(i6, i19 - currentContentInsetRight);
                if (KlHjfFWx(this.eVhOlqcC)) {
                    View view = this.eVhOlqcC;
                    if (z3) {
                        min2 = sjUBp5pO(view, min2, min, iArr);
                    } else {
                        max = lDXGDhIF(view, max, min, iArr);
                    }
                }
                if (KlHjfFWx(this.P7K7Inc8)) {
                    CMlnIseC cMlnIseC = this.P7K7Inc8;
                    if (z3) {
                        min2 = sjUBp5pO(cMlnIseC, min2, min, iArr);
                    } else {
                        max = lDXGDhIF(cMlnIseC, max, min, iArr);
                    }
                }
                KlHjfFWx = KlHjfFWx(this.MdtA4re8);
                KlHjfFWx2 = KlHjfFWx(this.wxUZMvaN);
                if (KlHjfFWx) {
                    z2 = z3;
                    i7 = 0;
                } else {
                    yc0 yc0Var = (yc0) this.MdtA4re8.getLayoutParams();
                    z2 = z3;
                    i7 = this.MdtA4re8.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) yc0Var).topMargin + ((ViewGroup.MarginLayoutParams) yc0Var).bottomMargin;
                }
                if (!KlHjfFWx2) {
                    yc0 yc0Var2 = (yc0) this.wxUZMvaN.getLayoutParams();
                    i7 = this.wxUZMvaN.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) yc0Var2).topMargin + ((ViewGroup.MarginLayoutParams) yc0Var2).bottomMargin + i7;
                }
                if (!KlHjfFWx || KlHjfFWx2) {
                    w wVar = !KlHjfFWx ? this.MdtA4re8 : this.wxUZMvaN;
                    w wVar2 = !KlHjfFWx2 ? this.wxUZMvaN : this.MdtA4re8;
                    yc0 yc0Var3 = (yc0) wVar.getLayoutParams();
                    yc0 yc0Var4 = (yc0) wVar2.getLayoutParams();
                    int i20 = i7;
                    boolean z4 = (!KlHjfFWx && this.MdtA4re8.getMeasuredWidth() > 0) || (KlHjfFWx2 && this.wxUZMvaN.getMeasuredWidth() > 0);
                    i8 = this.gjV1z5T1 & 112;
                    int i21 = max;
                    if (i8 != 48) {
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) yc0Var3).topMargin + this.KlHjfFWx;
                    } else if (i8 != 80) {
                        int i22 = (((height - paddingTop2) - paddingBottom) - i20) / 2;
                        int i23 = ((ViewGroup.MarginLayoutParams) yc0Var3).topMargin + this.KlHjfFWx;
                        if (i22 < i23) {
                            i22 = i23;
                        } else {
                            int i24 = (((height - paddingBottom) - i20) - i22) - paddingTop2;
                            int i25 = ((ViewGroup.MarginLayoutParams) yc0Var3).bottomMargin;
                            int i26 = this.Ey6iv0m0;
                            if (i24 < i25 + i26) {
                                i22 = Math.max(0, i22 - ((((ViewGroup.MarginLayoutParams) yc0Var4).bottomMargin + i26) - i24));
                            }
                        }
                        paddingTop = paddingTop2 + i22;
                    } else {
                        paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) yc0Var4).bottomMargin) - this.Ey6iv0m0) - i20;
                    }
                    if (z2) {
                        int i27 = (z4 ? this.OxcuoDLp : 0) - iArr[0];
                        max = Math.max(0, i27) + i21;
                        iArr[0] = Math.max(0, -i27);
                        if (KlHjfFWx) {
                            yc0 yc0Var5 = (yc0) this.MdtA4re8.getLayoutParams();
                            int measuredWidth = this.MdtA4re8.getMeasuredWidth() + max;
                            int measuredHeight = this.MdtA4re8.getMeasuredHeight() + paddingTop;
                            this.MdtA4re8.layout(max, paddingTop, measuredWidth, measuredHeight);
                            i9 = measuredWidth + this.amk52bBQ;
                            paddingTop = measuredHeight + ((ViewGroup.MarginLayoutParams) yc0Var5).bottomMargin;
                        } else {
                            i9 = max;
                        }
                        if (KlHjfFWx2) {
                            int i28 = paddingTop + ((ViewGroup.MarginLayoutParams) ((yc0) this.wxUZMvaN.getLayoutParams())).topMargin;
                            int measuredWidth2 = this.wxUZMvaN.getMeasuredWidth() + max;
                            this.wxUZMvaN.layout(max, i28, measuredWidth2, this.wxUZMvaN.getMeasuredHeight() + i28);
                            i10 = measuredWidth2 + this.amk52bBQ;
                        } else {
                            i10 = max;
                        }
                        if (z4) {
                            max = Math.max(i9, i10);
                        }
                    } else {
                        int i29 = (z4 ? this.OxcuoDLp : 0) - iArr[1];
                        min2 -= Math.max(0, i29);
                        iArr[1] = Math.max(0, -i29);
                        if (KlHjfFWx) {
                            yc0 yc0Var6 = (yc0) this.MdtA4re8.getLayoutParams();
                            int measuredWidth3 = min2 - this.MdtA4re8.getMeasuredWidth();
                            int measuredHeight2 = this.MdtA4re8.getMeasuredHeight() + paddingTop;
                            this.MdtA4re8.layout(measuredWidth3, paddingTop, min2, measuredHeight2);
                            i11 = measuredWidth3 - this.amk52bBQ;
                            paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) yc0Var6).bottomMargin;
                        } else {
                            i11 = min2;
                        }
                        if (KlHjfFWx2) {
                            int i30 = paddingTop + ((ViewGroup.MarginLayoutParams) ((yc0) this.wxUZMvaN.getLayoutParams())).topMargin;
                            this.wxUZMvaN.layout(min2 - this.wxUZMvaN.getMeasuredWidth(), i30, min2, this.wxUZMvaN.getMeasuredHeight() + i30);
                            i12 = min2 - this.amk52bBQ;
                        } else {
                            i12 = min2;
                        }
                        if (z4) {
                            min2 = Math.min(i11, i12);
                        }
                        max = i21;
                    }
                }
                ArrayList arrayList = this.euDDoUNr;
                qoPGr6Ce(arrayList, 3);
                size = arrayList.size();
                i13 = max;
                for (i14 = 0; i14 < size; i14++) {
                    i13 = lDXGDhIF((View) arrayList.get(i14), i13, min, iArr);
                }
                qoPGr6Ce(arrayList, 5);
                size2 = arrayList.size();
                for (i15 = 0; i15 < size2; i15++) {
                    min2 = sjUBp5pO((View) arrayList.get(i15), min2, min, iArr);
                }
                qoPGr6Ce(arrayList, 1);
                int i31 = iArr[0];
                int i32 = iArr[1];
                size3 = arrayList.size();
                int i33 = i31;
                i16 = 0;
                int i34 = 0;
                while (i16 < size3) {
                    View view2 = (View) arrayList.get(i16);
                    yc0 yc0Var7 = (yc0) view2.getLayoutParams();
                    int i35 = i32;
                    int i36 = ((ViewGroup.MarginLayoutParams) yc0Var7).leftMargin - i33;
                    int i37 = ((ViewGroup.MarginLayoutParams) yc0Var7).rightMargin - i35;
                    int max2 = Math.max(0, i36);
                    int max3 = Math.max(0, i37);
                    int max4 = Math.max(0, -i36);
                    int max5 = Math.max(0, -i37);
                    i34 += view2.getMeasuredWidth() + max2 + max3;
                    i16++;
                    i33 = max4;
                    i32 = max5;
                }
                i18 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (i34 / 2);
                int i38 = i34 + i18;
                if (i18 >= i13) {
                    i13 = i38 > min2 ? i18 - (i38 - min2) : i18;
                }
                size4 = arrayList.size();
                for (i17 = 0; i17 < size4; i17++) {
                    i13 = lDXGDhIF((View) arrayList.get(i17), i13, min, iArr);
                }
                arrayList.clear();
            }
            i5 = lDXGDhIF(eiHZrOWV, paddingLeft, min, iArr);
        } else {
            i5 = paddingLeft;
        }
        i6 = i19;
        if (KlHjfFWx(this.jb9XjC4I)) {
        }
        if (KlHjfFWx(this.NCTxEWno)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - i5);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i19 - i6));
        max = Math.max(i5, currentContentInsetLeft2);
        int min22 = Math.min(i6, i19 - currentContentInsetRight2);
        if (KlHjfFWx(this.eVhOlqcC)) {
        }
        if (KlHjfFWx(this.P7K7Inc8)) {
        }
        KlHjfFWx = KlHjfFWx(this.MdtA4re8);
        KlHjfFWx2 = KlHjfFWx(this.wxUZMvaN);
        if (KlHjfFWx) {
        }
        if (!KlHjfFWx2) {
        }
        if (!KlHjfFWx) {
        }
        if (!KlHjfFWx) {
        }
        if (!KlHjfFWx2) {
        }
        yc0 yc0Var32 = (yc0) wVar.getLayoutParams();
        yc0 yc0Var42 = (yc0) wVar2.getLayoutParams();
        int i202 = i7;
        if (KlHjfFWx) {
        }
        i8 = this.gjV1z5T1 & 112;
        int i212 = max;
        if (i8 != 48) {
        }
        if (z2) {
        }
        ArrayList arrayList2 = this.euDDoUNr;
        qoPGr6Ce(arrayList2, 3);
        size = arrayList2.size();
        i13 = max;
        while (i14 < size) {
        }
        qoPGr6Ce(arrayList2, 5);
        size2 = arrayList2.size();
        while (i15 < size2) {
        }
        qoPGr6Ce(arrayList2, 1);
        int i312 = iArr[0];
        int i322 = iArr[1];
        size3 = arrayList2.size();
        int i332 = i312;
        i16 = 0;
        int i342 = 0;
        while (i16 < size3) {
        }
        i18 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (i342 / 2);
        int i382 = i342 + i18;
        if (i18 >= i13) {
        }
        size4 = arrayList2.size();
        while (i17 < size4) {
        }
        arrayList2.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        char c;
        Object[] objArr;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z = fh0.qoPGr6Ce;
        int i10 = 0;
        if (getLayoutDirection() == 1) {
            objArr = true;
            c = 0;
        } else {
            c = 1;
            objArr = false;
        }
        if (KlHjfFWx(this.VgvYg0wo)) {
            amk52bBQ(this.VgvYg0wo, i, 0, i2, this.sjUBp5pO);
            i3 = k3x7lurq(this.VgvYg0wo) + this.VgvYg0wo.getMeasuredWidth();
            i4 = Math.max(0, ow5vqvCr(this.VgvYg0wo) + this.VgvYg0wo.getMeasuredHeight());
            i5 = View.combineMeasuredStates(0, this.VgvYg0wo.getMeasuredState());
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        if (KlHjfFWx(this.jb9XjC4I)) {
            amk52bBQ(this.jb9XjC4I, i, 0, i2, this.sjUBp5pO);
            i3 = k3x7lurq(this.jb9XjC4I) + this.jb9XjC4I.getMeasuredWidth();
            i4 = Math.max(i4, ow5vqvCr(this.jb9XjC4I) + this.jb9XjC4I.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.jb9XjC4I.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i3);
        int max2 = Math.max(0, currentContentInsetStart - i3);
        Object[] objArr2 = objArr;
        int[] iArr = this.ytu5o6f4;
        iArr[objArr2 == true ? 1 : 0] = max2;
        if (KlHjfFWx(this.NCTxEWno)) {
            amk52bBQ(this.NCTxEWno, i, max, i2, this.sjUBp5pO);
            i6 = k3x7lurq(this.NCTxEWno) + this.NCTxEWno.getMeasuredWidth();
            i4 = Math.max(i4, ow5vqvCr(this.NCTxEWno) + this.NCTxEWno.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.NCTxEWno.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, i6);
        iArr[c] = Math.max(0, currentContentInsetEnd - i6);
        if (KlHjfFWx(this.eVhOlqcC)) {
            max3 += OxcuoDLp(this.eVhOlqcC, i, max3, i2, 0, iArr);
            i4 = Math.max(i4, ow5vqvCr(this.eVhOlqcC) + this.eVhOlqcC.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.eVhOlqcC.getMeasuredState());
        }
        if (KlHjfFWx(this.P7K7Inc8)) {
            max3 += OxcuoDLp(this.P7K7Inc8, i, max3, i2, 0, iArr);
            i4 = Math.max(i4, ow5vqvCr(this.P7K7Inc8) + this.P7K7Inc8.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.P7K7Inc8.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (((yc0) childAt.getLayoutParams()).NCTxEWno == 0 && KlHjfFWx(childAt)) {
                max3 += OxcuoDLp(childAt, i, max3, i2, 0, iArr);
                int max4 = Math.max(i4, ow5vqvCr(childAt) + childAt.getMeasuredHeight());
                i5 = View.combineMeasuredStates(i5, childAt.getMeasuredState());
                i4 = max4;
            } else {
                max3 = max3;
            }
        }
        int i12 = max3;
        int i13 = this.KlHjfFWx + this.Ey6iv0m0;
        int i14 = this.OxcuoDLp + this.amk52bBQ;
        if (KlHjfFWx(this.MdtA4re8)) {
            OxcuoDLp(this.MdtA4re8, i, i12 + i14, i2, i13, iArr);
            int k3x7lurq = k3x7lurq(this.MdtA4re8) + this.MdtA4re8.getMeasuredWidth();
            i7 = ow5vqvCr(this.MdtA4re8) + this.MdtA4re8.getMeasuredHeight();
            i8 = View.combineMeasuredStates(i5, this.MdtA4re8.getMeasuredState());
            i9 = k3x7lurq;
        } else {
            i7 = 0;
            i8 = i5;
            i9 = 0;
        }
        if (KlHjfFWx(this.wxUZMvaN)) {
            i9 = Math.max(i9, OxcuoDLp(this.wxUZMvaN, i, i12 + i14, i2, i13 + i7, iArr));
            i7 += ow5vqvCr(this.wxUZMvaN) + this.wxUZMvaN.getMeasuredHeight();
            i8 = View.combineMeasuredStates(i8, this.wxUZMvaN.getMeasuredState());
        }
        int max5 = Math.max(i4, i7);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i12 + i9;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max5;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, (-16777216) & i8);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, i8 << 16);
        if (this.hzgxAD8d) {
            int childCount2 = getChildCount();
            for (int i15 = 0; i15 < childCount2; i15++) {
                View childAt2 = getChildAt(i15);
                if (!KlHjfFWx(childAt2) || childAt2.getMeasuredWidth() <= 0 || childAt2.getMeasuredHeight() <= 0) {
                }
            }
            setMeasuredDimension(resolveSizeAndState, i10);
        }
        i10 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, i10);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof ad0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ad0 ad0Var = (ad0) parcelable;
        super.onRestoreInstanceState(ad0Var.NCTxEWno);
        ActionMenuView actionMenuView = this.NCTxEWno;
        yr yrVar = actionMenuView != null ? actionMenuView.OxcuoDLp : null;
        int i = ad0Var.wxUZMvaN;
        if (i != 0 && this.fVMzMhyS != null && yrVar != null && (findItem = yrVar.findItem(i)) != null) {
            findItem.expandActionView();
        }
        if (ad0Var.VgvYg0wo) {
            i1 i1Var = this.N8VPGzVC;
            removeCallbacks(i1Var);
            post(i1Var);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        wxUZMvaN();
        d40 d40Var = this.I5GHvsYW;
        boolean z = i == 1;
        if (z == d40Var.b2ZJblxo) {
            return;
        }
        d40Var.b2ZJblxo = z;
        if (!d40Var.Qr9iLBAD) {
            d40Var.qoPGr6Ce = d40Var.VgvYg0wo;
            d40Var.NCTxEWno = d40Var.P7K7Inc8;
            return;
        }
        if (z) {
            int i2 = d40Var.wxUZMvaN;
            if (i2 == Integer.MIN_VALUE) {
                i2 = d40Var.VgvYg0wo;
            }
            d40Var.qoPGr6Ce = i2;
            int i3 = d40Var.MdtA4re8;
            if (i3 == Integer.MIN_VALUE) {
                i3 = d40Var.P7K7Inc8;
            }
            d40Var.NCTxEWno = i3;
            return;
        }
        int i4 = d40Var.MdtA4re8;
        if (i4 == Integer.MIN_VALUE) {
            i4 = d40Var.VgvYg0wo;
        }
        d40Var.qoPGr6Ce = i4;
        int i5 = d40Var.wxUZMvaN;
        if (i5 == Integer.MIN_VALUE) {
            i5 = d40Var.P7K7Inc8;
        }
        d40Var.NCTxEWno = i5;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        CTE3lpUp cTE3lpUp;
        cs csVar;
        ad0 ad0Var = new ad0(super.onSaveInstanceState());
        xc0 xc0Var = this.fVMzMhyS;
        if (xc0Var != null && (csVar = xc0Var.MdtA4re8) != null) {
            ad0Var.wxUZMvaN = csVar.qoPGr6Ce;
        }
        ActionMenuView actionMenuView = this.NCTxEWno;
        ad0Var.VgvYg0wo = (actionMenuView == null || (cTE3lpUp = actionMenuView.I5GHvsYW) == null || !cTE3lpUp.jb9XjC4I()) ? false : true;
        return ad0Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.i7xS8jrb = false;
        }
        if (!this.i7xS8jrb) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.i7xS8jrb = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.i7xS8jrb = false;
        return true;
    }

    public final void qoPGr6Ce(ArrayList arrayList, int i) {
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                yc0 yc0Var = (yc0) childAt.getLayoutParams();
                if (yc0Var.NCTxEWno == 0 && KlHjfFWx(childAt)) {
                    int i3 = yc0Var.qoPGr6Ce;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i3, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            yc0 yc0Var2 = (yc0) childAt2.getLayoutParams();
            if (yc0Var2.NCTxEWno == 0 && KlHjfFWx(childAt2)) {
                int i5 = yc0Var2.qoPGr6Ce;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i5, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.nSmgoSB5 != z) {
            this.nSmgoSB5 = z;
            Ey6iv0m0();
        }
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            MdtA4re8();
        }
        EiHZrOWV eiHZrOWV = this.jb9XjC4I;
        if (eiHZrOWV != null) {
            eiHZrOWV.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            MdtA4re8();
            this.jb9XjC4I.setImageDrawable(drawable);
        } else {
            EiHZrOWV eiHZrOWV = this.jb9XjC4I;
            if (eiHZrOWV != null) {
                eiHZrOWV.setImageDrawable(this.b2ZJblxo);
            }
        }
    }

    public void setCollapsible(boolean z) {
        this.hzgxAD8d = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.FySoLYna) {
            this.FySoLYna = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.RXQxj5Oe) {
            this.RXQxj5Oe = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(Drawable drawable) {
        CMlnIseC cMlnIseC = this.P7K7Inc8;
        if (drawable != null) {
            if (cMlnIseC == null) {
                cMlnIseC = new CMlnIseC(getContext(), null, 0);
                this.P7K7Inc8 = cMlnIseC;
            }
            if (!ygLcUYwZ(cMlnIseC)) {
                NCTxEWno(this.P7K7Inc8, true);
            }
        } else if (cMlnIseC != null && ygLcUYwZ(cMlnIseC)) {
            removeView(this.P7K7Inc8);
            this.SgZGMMPL.remove(this.P7K7Inc8);
        }
        CMlnIseC cMlnIseC2 = this.P7K7Inc8;
        if (cMlnIseC2 != null) {
            cMlnIseC2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.P7K7Inc8 == null) {
            this.P7K7Inc8 = new CMlnIseC(getContext(), null, 0);
        }
        CMlnIseC cMlnIseC = this.P7K7Inc8;
        if (cMlnIseC != null) {
            cMlnIseC.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            b2ZJblxo();
        }
        EiHZrOWV eiHZrOWV = this.VgvYg0wo;
        if (eiHZrOWV != null) {
            eiHZrOWV.setContentDescription(charSequence);
            e50.ygLcUYwZ(this.VgvYg0wo, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            b2ZJblxo();
            if (!ygLcUYwZ(this.VgvYg0wo)) {
                NCTxEWno(this.VgvYg0wo, true);
            }
        } else {
            EiHZrOWV eiHZrOWV = this.VgvYg0wo;
            if (eiHZrOWV != null && ygLcUYwZ(eiHZrOWV)) {
                removeView(this.VgvYg0wo);
                this.SgZGMMPL.remove(this.VgvYg0wo);
            }
        }
        EiHZrOWV eiHZrOWV2 = this.VgvYg0wo;
        if (eiHZrOWV2 != null) {
            eiHZrOWV2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        b2ZJblxo();
        this.VgvYg0wo.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        VgvYg0wo();
        this.NCTxEWno.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.ow5vqvCr != i) {
            this.ow5vqvCr = i;
            if (i == 0) {
                this.k3x7lurq = getContext();
            } else {
                this.k3x7lurq = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        w wVar = this.wxUZMvaN;
        if (!isEmpty) {
            if (wVar == null) {
                Context context = getContext();
                w wVar2 = new w(context, null);
                this.wxUZMvaN = wVar2;
                wVar2.setSingleLine();
                this.wxUZMvaN.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.ygLcUYwZ;
                if (i != 0) {
                    this.wxUZMvaN.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.U0LaHZX7;
                if (colorStateList != null) {
                    this.wxUZMvaN.setTextColor(colorStateList);
                }
            }
            if (!ygLcUYwZ(this.wxUZMvaN)) {
                NCTxEWno(this.wxUZMvaN, true);
            }
        } else if (wVar != null && ygLcUYwZ(wVar)) {
            removeView(this.wxUZMvaN);
            this.SgZGMMPL.remove(this.wxUZMvaN);
        }
        w wVar3 = this.wxUZMvaN;
        if (wVar3 != null) {
            wVar3.setText(charSequence);
        }
        this.DK9slbsy = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.U0LaHZX7 = colorStateList;
        w wVar = this.wxUZMvaN;
        if (wVar != null) {
            wVar.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        w wVar = this.MdtA4re8;
        if (!isEmpty) {
            if (wVar == null) {
                Context context = getContext();
                w wVar2 = new w(context, null);
                this.MdtA4re8 = wVar2;
                wVar2.setSingleLine();
                this.MdtA4re8.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.OnDfzHZD;
                if (i != 0) {
                    this.MdtA4re8.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.lwWCatUu;
                if (colorStateList != null) {
                    this.MdtA4re8.setTextColor(colorStateList);
                }
            }
            if (!ygLcUYwZ(this.MdtA4re8)) {
                NCTxEWno(this.MdtA4re8, true);
            }
        } else if (wVar != null && ygLcUYwZ(wVar)) {
            removeView(this.MdtA4re8);
            this.SgZGMMPL.remove(this.MdtA4re8);
        }
        w wVar3 = this.MdtA4re8;
        if (wVar3 != null) {
            wVar3.setText(charSequence);
        }
        this.WYNAV5pd = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.Ey6iv0m0 = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.amk52bBQ = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.OxcuoDLp = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.KlHjfFWx = i;
        requestLayout();
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.lwWCatUu = colorStateList;
        w wVar = this.MdtA4re8;
        if (wVar != null) {
            wVar.setTextColor(colorStateList);
        }
    }

    public final int sjUBp5pO(View view, int i, int i2, int[] iArr) {
        yc0 yc0Var = (yc0) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) yc0Var).rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int eVhOlqcC = eVhOlqcC(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, eVhOlqcC, max, view.getMeasuredHeight() + eVhOlqcC);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) yc0Var).leftMargin);
    }

    public final void wxUZMvaN() {
        if (this.I5GHvsYW == null) {
            d40 d40Var = new d40();
            d40Var.qoPGr6Ce = 0;
            d40Var.NCTxEWno = 0;
            d40Var.MdtA4re8 = Integer.MIN_VALUE;
            d40Var.wxUZMvaN = Integer.MIN_VALUE;
            d40Var.VgvYg0wo = 0;
            d40Var.P7K7Inc8 = 0;
            d40Var.b2ZJblxo = false;
            d40Var.Qr9iLBAD = false;
            this.I5GHvsYW = d40Var;
        }
    }

    public final boolean ygLcUYwZ(View view) {
        return view.getParent() == this || this.SgZGMMPL.contains(view);
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(ra.Ey6iv0m0(getContext(), i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return jb9XjC4I(layoutParams);
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(ra.Ey6iv0m0(getContext(), i));
    }

    public void setLogo(int i) {
        setLogo(ra.Ey6iv0m0(getContext(), i));
    }

    public void setOnMenuItemClickListener(zc0 zc0Var) {
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public Toolbar(Context context) {
        this(context, null);
    }
}
