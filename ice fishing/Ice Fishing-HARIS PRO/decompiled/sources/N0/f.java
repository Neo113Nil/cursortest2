package N0;

import O.K;
import a.AbstractC0078a;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashSet;
import java.util.WeakHashMap;
import l.InterfaceC0212A;
import l.MenuC0229m;
import l.o;
import p0.C0323a;
import v0.AbstractC0360a;
import x0.C0376a;

/* loaded from: classes.dex */
public abstract class f extends ViewGroup implements InterfaceC0212A {

    /* renamed from: F, reason: collision with root package name */
    public static final int[] f670F = {R.attr.state_checked};

    /* renamed from: G, reason: collision with root package name */
    public static final int[] f671G = {-16842910};

    /* renamed from: A, reason: collision with root package name */
    public S0.k f672A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f673B;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f674C;

    /* renamed from: D, reason: collision with root package name */
    public h f675D;

    /* renamed from: E, reason: collision with root package name */
    public MenuC0229m f676E;

    /* renamed from: a, reason: collision with root package name */
    public final C0323a f677a;

    /* renamed from: b, reason: collision with root package name */
    public final B0.l f678b;

    /* renamed from: c, reason: collision with root package name */
    public final N.c f679c;

    /* renamed from: d, reason: collision with root package name */
    public final SparseArray f680d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public d[] f681f;

    /* renamed from: g, reason: collision with root package name */
    public int f682g;

    /* renamed from: h, reason: collision with root package name */
    public int f683h;
    public ColorStateList i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f684k;

    /* renamed from: l, reason: collision with root package name */
    public final ColorStateList f685l;

    /* renamed from: m, reason: collision with root package name */
    public int f686m;

    /* renamed from: n, reason: collision with root package name */
    public int f687n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f688o;

    /* renamed from: p, reason: collision with root package name */
    public Drawable f689p;

    /* renamed from: q, reason: collision with root package name */
    public ColorStateList f690q;

    /* renamed from: r, reason: collision with root package name */
    public int f691r;

    /* renamed from: s, reason: collision with root package name */
    public final SparseArray f692s;

    /* renamed from: t, reason: collision with root package name */
    public int f693t;

    /* renamed from: u, reason: collision with root package name */
    public int f694u;

    /* renamed from: v, reason: collision with root package name */
    public int f695v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f696w;

    /* renamed from: x, reason: collision with root package name */
    public int f697x;

    /* renamed from: y, reason: collision with root package name */
    public int f698y;

    /* renamed from: z, reason: collision with root package name */
    public int f699z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context) {
        super(context);
        int i = 1;
        this.f679c = new N.c(5);
        this.f680d = new SparseArray(5);
        this.f682g = 0;
        this.f683h = 0;
        this.f692s = new SparseArray(5);
        this.f693t = -1;
        this.f694u = -1;
        this.f695v = -1;
        this.f673B = false;
        this.f685l = c();
        if (isInEditMode()) {
            this.f677a = null;
        } else {
            C0323a c0323a = new C0323a();
            this.f677a = c0323a;
            c0323a.L(0);
            c0323a.A(AbstractC0078a.W(getContext(), com.lumenpath.harispro.hrnavigator.R.attr.motionDurationMedium4, getResources().getInteger(com.lumenpath.harispro.hrnavigator.R.integer.material_motion_duration_long_1)));
            c0323a.C(AbstractC0078a.X(getContext(), com.lumenpath.harispro.hrnavigator.R.attr.motionEasingStandard, AbstractC0360a.f4481b));
            c0323a.I(new L0.k());
        }
        this.f678b = new B0.l(i, (A0.b) this);
        WeakHashMap weakHashMap = K.f747a;
        setImportantForAccessibility(1);
    }

    private d getNewItem() {
        d dVar = (d) this.f679c.a();
        return dVar == null ? new A0.a(getContext()) : dVar;
    }

    private void setBadgeIfNeeded(d dVar) {
        C0376a c0376a;
        int id = dVar.getId();
        if (id == -1 || (c0376a = (C0376a) this.f692s.get(id)) == null) {
            return;
        }
        dVar.setBadge(c0376a);
    }

    @Override // l.InterfaceC0212A
    public final void a(MenuC0229m menuC0229m) {
        this.f676E = menuC0229m;
    }

    public final void b() {
        removeAllViews();
        d[] dVarArr = this.f681f;
        if (dVarArr != null) {
            for (d dVar : dVarArr) {
                if (dVar != null) {
                    this.f679c.c(dVar);
                    dVar.i(dVar.f655n);
                    dVar.f661t = null;
                    dVar.f667z = RecyclerView.f2111C0;
                    dVar.f645a = false;
                }
            }
        }
        if (this.f676E.f3713f.size() == 0) {
            this.f682g = 0;
            this.f683h = 0;
            this.f681f = null;
            return;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < this.f676E.f3713f.size(); i++) {
            hashSet.add(Integer.valueOf(this.f676E.getItem(i).getItemId()));
        }
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.f692s;
            if (i2 >= sparseArray.size()) {
                break;
            }
            int keyAt = sparseArray.keyAt(i2);
            if (!hashSet.contains(Integer.valueOf(keyAt))) {
                sparseArray.delete(keyAt);
            }
            i2++;
        }
        this.f681f = new d[this.f676E.f3713f.size()];
        int i3 = this.e;
        boolean z2 = i3 != -1 ? i3 == 0 : this.f676E.l().size() > 3;
        for (int i4 = 0; i4 < this.f676E.f3713f.size(); i4++) {
            this.f675D.f703b = true;
            this.f676E.getItem(i4).setCheckable(true);
            this.f675D.f703b = false;
            d newItem = getNewItem();
            this.f681f[i4] = newItem;
            newItem.setIconTintList(this.i);
            newItem.setIconSize(this.j);
            newItem.setTextColor(this.f685l);
            newItem.setTextAppearanceInactive(this.f686m);
            newItem.setTextAppearanceActive(this.f687n);
            newItem.setTextAppearanceActiveBoldEnabled(this.f688o);
            newItem.setTextColor(this.f684k);
            int i5 = this.f693t;
            if (i5 != -1) {
                newItem.setItemPaddingTop(i5);
            }
            int i6 = this.f694u;
            if (i6 != -1) {
                newItem.setItemPaddingBottom(i6);
            }
            int i7 = this.f695v;
            if (i7 != -1) {
                newItem.setActiveIndicatorLabelPadding(i7);
            }
            newItem.setActiveIndicatorWidth(this.f697x);
            newItem.setActiveIndicatorHeight(this.f698y);
            newItem.setActiveIndicatorMarginHorizontal(this.f699z);
            newItem.setActiveIndicatorDrawable(d());
            newItem.setActiveIndicatorResizeable(this.f673B);
            newItem.setActiveIndicatorEnabled(this.f696w);
            Drawable drawable = this.f689p;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.f691r);
            }
            newItem.setItemRippleColor(this.f690q);
            newItem.setShifting(z2);
            newItem.setLabelVisibilityMode(this.e);
            o oVar = (o) this.f676E.getItem(i4);
            newItem.c(oVar);
            newItem.setItemPosition(i4);
            SparseArray sparseArray2 = this.f680d;
            int i8 = oVar.f3736a;
            newItem.setOnTouchListener((View.OnTouchListener) sparseArray2.get(i8));
            newItem.setOnClickListener(this.f678b);
            int i9 = this.f682g;
            if (i9 != 0 && i8 == i9) {
                this.f683h = i4;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int min = Math.min(this.f676E.f3713f.size() - 1, this.f683h);
        this.f683h = min;
        this.f676E.getItem(min).setChecked(true);
    }

    public final ColorStateList c() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(R.attr.textColorSecondary, typedValue, true)) {
            return null;
        }
        ColorStateList z2 = AbstractC0078a.z(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(com.lumenpath.harispro.hrnavigator.R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i = typedValue.data;
        int defaultColor = z2.getDefaultColor();
        int[] iArr = f671G;
        return new ColorStateList(new int[][]{iArr, f670F, ViewGroup.EMPTY_STATE_SET}, new int[]{z2.getColorForState(iArr, defaultColor), i, defaultColor});
    }

    public final S0.g d() {
        if (this.f672A == null || this.f674C == null) {
            return null;
        }
        S0.g gVar = new S0.g(this.f672A);
        gVar.m(this.f674C);
        return gVar;
    }

    public int getActiveIndicatorLabelPadding() {
        return this.f695v;
    }

    public SparseArray<C0376a> getBadgeDrawables() {
        return this.f692s;
    }

    public ColorStateList getIconTintList() {
        return this.i;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.f674C;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.f696w;
    }

    public int getItemActiveIndicatorHeight() {
        return this.f698y;
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f699z;
    }

    public S0.k getItemActiveIndicatorShapeAppearance() {
        return this.f672A;
    }

    public int getItemActiveIndicatorWidth() {
        return this.f697x;
    }

    public Drawable getItemBackground() {
        d[] dVarArr = this.f681f;
        return (dVarArr == null || dVarArr.length <= 0) ? this.f689p : dVarArr[0].getBackground();
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.f691r;
    }

    public int getItemIconSize() {
        return this.j;
    }

    public int getItemPaddingBottom() {
        return this.f694u;
    }

    public int getItemPaddingTop() {
        return this.f693t;
    }

    public ColorStateList getItemRippleColor() {
        return this.f690q;
    }

    public int getItemTextAppearanceActive() {
        return this.f687n;
    }

    public int getItemTextAppearanceInactive() {
        return this.f686m;
    }

    public ColorStateList getItemTextColor() {
        return this.f684k;
    }

    public int getLabelVisibilityMode() {
        return this.e;
    }

    public MenuC0229m getMenu() {
        return this.f676E;
    }

    public int getSelectedItemId() {
        return this.f682g;
    }

    public int getSelectedItemPosition() {
        return this.f683h;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.f676E.l().size(), false, 1));
    }

    public void setActiveIndicatorLabelPadding(int i) {
        this.f695v = i;
        d[] dVarArr = this.f681f;
        if (dVarArr != null) {
            for (d dVar : dVarArr) {
                dVar.setActiveIndicatorLabelPadding(i);
            }
        }
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.i = colorStateList;
        d[] dVarArr = this.f681f;
        if (dVarArr != null) {
            for (d dVar : dVarArr) {
                dVar.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.f674C = colorStateList;
        d[] dVarArr = this.f681f;
        if (dVarArr != null) {
            for (d dVar : dVarArr) {
                dVar.setActiveIndicatorDrawable(d());
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z2) {
        this.f696w = z2;
        d[] dVarArr = this.f681f;
        if (dVarArr != null) {
            for (d dVar : dVarArr) {
                dVar.setActiveIndicatorEnabled(z2);
            }
        }
    }

    public void setItemActiveIndicatorHeight(int i) {
        this.f698y = i;
        d[] dVarArr = this.f681f;
        if (dVarArr != null) {
            for (d dVar : dVarArr) {
                dVar.setActiveIndicatorHeight(i);
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(int i) {
        this.f699z = i;
        d[] dVarArr = this.f681f;
        if (dVarArr != null) {
            for (d dVar : dVarArr) {
                dVar.setActiveIndicatorMarginHorizontal(i);
            }
        }
    }

    public void setItemActiveIndicatorResizeable(boolean z2) {
        this.f673B = z2;
        d[] dVarArr = this.f681f;
        if (dVarArr != null) {
            for (d dVar : dVarArr) {
                dVar.setActiveIndicatorResizeable(z2);
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(S0.k kVar) {
        this.f672A = kVar;
        d[] dVarArr = this.f681f;
        if (dVarArr != null) {
            for (d dVar : dVarArr) {
                dVar.setActiveIndicatorDrawable(d());
            }
        }
    }

    public void setItemActiveIndicatorWidth(int i) {
        this.f697x = i;
        d[] dVarArr = this.f681f;
        if (dVarArr != null) {
            for (d dVar : dVarArr) {
                dVar.setActiveIndicatorWidth(i);
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.f689p = drawable;
        d[] dVarArr = this.f681f;
        if (dVarArr != null) {
            for (d dVar : dVarArr) {
                dVar.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i) {
        this.f691r = i;
        d[] dVarArr = this.f681f;
        if (dVarArr != null) {
            for (d dVar : dVarArr) {
                dVar.setItemBackground(i);
            }
        }
    }

    public void setItemIconSize(int i) {
        this.j = i;
        d[] dVarArr = this.f681f;
        if (dVarArr != null) {
            for (d dVar : dVarArr) {
                dVar.setIconSize(i);
            }
        }
    }

    public void setItemPaddingBottom(int i) {
        this.f694u = i;
        d[] dVarArr = this.f681f;
        if (dVarArr != null) {
            for (d dVar : dVarArr) {
                dVar.setItemPaddingBottom(i);
            }
        }
    }

    public void setItemPaddingTop(int i) {
        this.f693t = i;
        d[] dVarArr = this.f681f;
        if (dVarArr != null) {
            for (d dVar : dVarArr) {
                dVar.setItemPaddingTop(i);
            }
        }
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f690q = colorStateList;
        d[] dVarArr = this.f681f;
        if (dVarArr != null) {
            for (d dVar : dVarArr) {
                dVar.setItemRippleColor(colorStateList);
            }
        }
    }

    public void setItemTextAppearanceActive(int i) {
        this.f687n = i;
        d[] dVarArr = this.f681f;
        if (dVarArr != null) {
            for (d dVar : dVarArr) {
                dVar.setTextAppearanceActive(i);
                ColorStateList colorStateList = this.f684k;
                if (colorStateList != null) {
                    dVar.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z2) {
        this.f688o = z2;
        d[] dVarArr = this.f681f;
        if (dVarArr != null) {
            for (d dVar : dVarArr) {
                dVar.setTextAppearanceActiveBoldEnabled(z2);
            }
        }
    }

    public void setItemTextAppearanceInactive(int i) {
        this.f686m = i;
        d[] dVarArr = this.f681f;
        if (dVarArr != null) {
            for (d dVar : dVarArr) {
                dVar.setTextAppearanceInactive(i);
                ColorStateList colorStateList = this.f684k;
                if (colorStateList != null) {
                    dVar.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f684k = colorStateList;
        d[] dVarArr = this.f681f;
        if (dVarArr != null) {
            for (d dVar : dVarArr) {
                dVar.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i) {
        this.e = i;
    }

    public void setPresenter(h hVar) {
        this.f675D = hVar;
    }
}
