package N0;

import L0.m;
import O.K;
import a.AbstractC0078a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.FrameLayout;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.lumenpath.harispro.hrnavigator.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import k.C0184h;
import l.InterfaceC0212A;
import l.y;
import u0.AbstractC0358a;

/* loaded from: classes.dex */
public abstract class l extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final e f706a;

    /* renamed from: b, reason: collision with root package name */
    public final A0.b f707b;

    /* renamed from: c, reason: collision with root package name */
    public final h f708c;

    /* renamed from: d, reason: collision with root package name */
    public C0184h f709d;
    public j e;

    /* renamed from: f, reason: collision with root package name */
    public i f710f;

    public l(Context context, AttributeSet attributeSet) {
        super(X0.a.a(context, attributeSet, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView), attributeSet, R.attr.bottomNavigationStyle);
        h hVar = new h();
        hVar.f703b = false;
        this.f708c = hVar;
        Context context2 = getContext();
        M0.h h2 = m.h(context2, attributeSet, AbstractC0358a.f4461z, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView, 12, 10);
        e eVar = new e(context2, getClass(), getMaxItemCount());
        this.f706a = eVar;
        A0.b bVar = new A0.b(context2);
        this.f707b = bVar;
        hVar.f702a = bVar;
        hVar.f704c = 1;
        bVar.setPresenter(hVar);
        eVar.b(hVar, eVar.f3709a);
        getContext();
        hVar.f702a.f676E = eVar;
        TypedArray typedArray = (TypedArray) h2.f617c;
        if (typedArray.hasValue(6)) {
            bVar.setIconTintList(h2.b(6));
        } else {
            bVar.setIconTintList(bVar.c());
        }
        setItemIconSize(typedArray.getDimensionPixelSize(5, getResources().getDimensionPixelSize(R.dimen.mtrl_navigation_bar_item_default_icon_size)));
        if (typedArray.hasValue(12)) {
            setItemTextAppearanceInactive(typedArray.getResourceId(12, 0));
        }
        if (typedArray.hasValue(10)) {
            setItemTextAppearanceActive(typedArray.getResourceId(10, 0));
        }
        setItemTextAppearanceActiveBoldEnabled(typedArray.getBoolean(11, true));
        if (typedArray.hasValue(13)) {
            setItemTextColor(h2.b(13));
        }
        Drawable background = getBackground();
        ColorStateList C2 = AbstractC0078a.C(background);
        if (background == null || C2 != null) {
            S0.g gVar = new S0.g(S0.k.b(context2, attributeSet, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView).a());
            if (C2 != null) {
                gVar.m(C2);
            }
            gVar.j(context2);
            WeakHashMap weakHashMap = K.f747a;
            setBackground(gVar);
        }
        if (typedArray.hasValue(8)) {
            setItemPaddingTop(typedArray.getDimensionPixelSize(8, 0));
        }
        if (typedArray.hasValue(7)) {
            setItemPaddingBottom(typedArray.getDimensionPixelSize(7, 0));
        }
        if (typedArray.hasValue(0)) {
            setActiveIndicatorLabelPadding(typedArray.getDimensionPixelSize(0, 0));
        }
        if (typedArray.hasValue(2)) {
            setElevation(typedArray.getDimensionPixelSize(2, 0));
        }
        getBackground().mutate().setTintList(AbstractC0078a.A(context2, h2, 1));
        setLabelVisibilityMode(typedArray.getInteger(14, -1));
        int resourceId = typedArray.getResourceId(4, 0);
        if (resourceId != 0) {
            bVar.setItemBackgroundRes(resourceId);
        } else {
            setItemRippleColor(AbstractC0078a.A(context2, h2, 9));
        }
        int resourceId2 = typedArray.getResourceId(3, 0);
        if (resourceId2 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(resourceId2, AbstractC0358a.f4460y);
            setItemActiveIndicatorWidth(obtainStyledAttributes.getDimensionPixelSize(1, 0));
            setItemActiveIndicatorHeight(obtainStyledAttributes.getDimensionPixelSize(0, 0));
            setItemActiveIndicatorMarginHorizontal(obtainStyledAttributes.getDimensionPixelOffset(3, 0));
            setItemActiveIndicatorColor(AbstractC0078a.B(context2, obtainStyledAttributes, 2));
            setItemActiveIndicatorShapeAppearance(S0.k.a(context2, obtainStyledAttributes.getResourceId(4, 0), 0, new S0.a(0)).a());
            obtainStyledAttributes.recycle();
        }
        if (typedArray.hasValue(15)) {
            int resourceId3 = typedArray.getResourceId(15, 0);
            hVar.f703b = true;
            getMenuInflater().inflate(resourceId3, eVar);
            hVar.f703b = false;
            hVar.m(true);
        }
        h2.l();
        addView(bVar);
        eVar.e = new B.b(5, (BottomNavigationView) this);
    }

    private MenuInflater getMenuInflater() {
        if (this.f709d == null) {
            this.f709d = new C0184h(getContext());
        }
        return this.f709d;
    }

    public int getActiveIndicatorLabelPadding() {
        return this.f707b.getActiveIndicatorLabelPadding();
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.f707b.getItemActiveIndicatorColor();
    }

    public int getItemActiveIndicatorHeight() {
        return this.f707b.getItemActiveIndicatorHeight();
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f707b.getItemActiveIndicatorMarginHorizontal();
    }

    public S0.k getItemActiveIndicatorShapeAppearance() {
        return this.f707b.getItemActiveIndicatorShapeAppearance();
    }

    public int getItemActiveIndicatorWidth() {
        return this.f707b.getItemActiveIndicatorWidth();
    }

    public Drawable getItemBackground() {
        return this.f707b.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.f707b.getItemBackgroundRes();
    }

    public int getItemIconSize() {
        return this.f707b.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.f707b.getIconTintList();
    }

    public int getItemPaddingBottom() {
        return this.f707b.getItemPaddingBottom();
    }

    public int getItemPaddingTop() {
        return this.f707b.getItemPaddingTop();
    }

    public ColorStateList getItemRippleColor() {
        return this.f707b.getItemRippleColor();
    }

    public int getItemTextAppearanceActive() {
        return this.f707b.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.f707b.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.f707b.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f707b.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    public Menu getMenu() {
        return this.f706a;
    }

    public InterfaceC0212A getMenuView() {
        return this.f707b;
    }

    public h getPresenter() {
        return this.f708c;
    }

    public int getSelectedItemId() {
        return this.f707b.getSelectedItemId();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof S0.g) {
            R.j.o0(this, (S0.g) background);
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof k)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        k kVar = (k) parcelable;
        super.onRestoreInstanceState(kVar.f1147a);
        Bundle bundle = kVar.f705c;
        e eVar = this.f706a;
        eVar.getClass();
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = eVar.f3726u;
            if (copyOnWriteArrayList.isEmpty()) {
                return;
            }
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                y yVar = (y) weakReference.get();
                if (yVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    int f2 = yVar.f();
                    if (f2 > 0 && (parcelable2 = (Parcelable) sparseParcelableArray.get(f2)) != null) {
                        yVar.n(parcelable2);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable l2;
        k kVar = new k(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        kVar.f705c = bundle;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f706a.f3726u;
        if (!copyOnWriteArrayList.isEmpty()) {
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                y yVar = (y) weakReference.get();
                if (yVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    int f2 = yVar.f();
                    if (f2 > 0 && (l2 = yVar.l()) != null) {
                        sparseArray.put(f2, l2);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        }
        return kVar;
    }

    public void setActiveIndicatorLabelPadding(int i) {
        this.f707b.setActiveIndicatorLabelPadding(i);
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        Drawable background = getBackground();
        if (background instanceof S0.g) {
            ((S0.g) background).l(f2);
        }
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.f707b.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z2) {
        this.f707b.setItemActiveIndicatorEnabled(z2);
    }

    public void setItemActiveIndicatorHeight(int i) {
        this.f707b.setItemActiveIndicatorHeight(i);
    }

    public void setItemActiveIndicatorMarginHorizontal(int i) {
        this.f707b.setItemActiveIndicatorMarginHorizontal(i);
    }

    public void setItemActiveIndicatorShapeAppearance(S0.k kVar) {
        this.f707b.setItemActiveIndicatorShapeAppearance(kVar);
    }

    public void setItemActiveIndicatorWidth(int i) {
        this.f707b.setItemActiveIndicatorWidth(i);
    }

    public void setItemBackground(Drawable drawable) {
        this.f707b.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(int i) {
        this.f707b.setItemBackgroundRes(i);
    }

    public void setItemIconSize(int i) {
        this.f707b.setItemIconSize(i);
    }

    public void setItemIconSizeRes(int i) {
        setItemIconSize(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f707b.setIconTintList(colorStateList);
    }

    public void setItemPaddingBottom(int i) {
        this.f707b.setItemPaddingBottom(i);
    }

    public void setItemPaddingTop(int i) {
        this.f707b.setItemPaddingTop(i);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f707b.setItemRippleColor(colorStateList);
    }

    public void setItemTextAppearanceActive(int i) {
        this.f707b.setItemTextAppearanceActive(i);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z2) {
        this.f707b.setItemTextAppearanceActiveBoldEnabled(z2);
    }

    public void setItemTextAppearanceInactive(int i) {
        this.f707b.setItemTextAppearanceInactive(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f707b.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i) {
        A0.b bVar = this.f707b;
        if (bVar.getLabelVisibilityMode() != i) {
            bVar.setLabelVisibilityMode(i);
            this.f708c.m(false);
        }
    }

    public void setOnItemReselectedListener(i iVar) {
        this.f710f = iVar;
    }

    public void setOnItemSelectedListener(j jVar) {
        this.e = jVar;
    }

    public void setSelectedItemId(int i) {
        e eVar = this.f706a;
        MenuItem findItem = eVar.findItem(i);
        if (findItem == null || eVar.q(findItem, this.f708c, 0)) {
            return;
        }
        findItem.setChecked(true);
    }
}
