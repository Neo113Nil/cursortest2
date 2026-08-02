package androidx.viewpager2.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.NonNull;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import defpackage.agu;
import defpackage.bgu;
import defpackage.bjt;
import defpackage.cgu;
import defpackage.dgu;
import defpackage.e7o;
import defpackage.egu;
import defpackage.f2k;
import defpackage.fgu;
import defpackage.fwo;
import defpackage.ggu;
import defpackage.gwo;
import defpackage.hgu;
import defpackage.ir5;
import defpackage.qon;
import defpackage.rdn;
import defpackage.t4c;
import defpackage.tb;
import defpackage.von;
import defpackage.wdu;
import defpackage.xq0;
import defpackage.yon;
import defpackage.zfu;
import defpackage.zs3;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {
    public final Rect a;
    public final Rect b;
    public final ir5 c;
    public int d;
    public boolean e;
    public final zfu f;
    public cgu g;
    public int h;
    public Parcelable i;
    public ggu j;
    public fgu k;
    public gwo l;
    public ir5 m;
    public t4c n;
    public f2k o;
    public von p;
    public boolean q;
    public boolean r;
    public int s;
    public bjt t;

    public ViewPager2(@NonNull Context context) {
        super(context);
        this.a = new Rect();
        this.b = new Rect();
        this.c = new ir5();
        this.e = false;
        this.f = new zfu(0, this);
        this.h = -1;
        this.p = null;
        this.q = false;
        this.r = true;
        this.s = -1;
        a(context, null);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        this.t = new bjt(this);
        ggu gguVar = new ggu(this, context);
        this.j = gguVar;
        gguVar.setId(View.generateViewId());
        this.j.setDescendantFocusability(SQLiteDatabase.OPEN_SHAREDCACHE);
        cgu cguVar = new cgu(this, context);
        this.g = cguVar;
        this.j.setLayoutManager(cguVar);
        int i = 1;
        this.j.setScrollingTouchSlop(1);
        int[] iArr = rdn.a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        wdu.p(this, context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        int i2 = 0;
        try {
            setOrientation(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
            this.j.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            ggu gguVar2 = this.j;
            bgu bguVar = new bgu();
            if (gguVar2.C == null) {
                gguVar2.C = new ArrayList();
            }
            gguVar2.C.add(bguVar);
            gwo gwoVar = new gwo(this);
            this.l = gwoVar;
            this.n = new t4c(this, gwoVar, this.j);
            fgu fguVar = new fgu(this);
            this.k = fguVar;
            fguVar.a(this.j);
            this.j.t(this.l);
            ir5 ir5Var = new ir5();
            this.m = ir5Var;
            this.l.a = ir5Var;
            agu aguVar = new agu(this, i2);
            agu aguVar2 = new agu(this, i);
            ((ArrayList) ir5Var.b).add(aguVar);
            ((ArrayList) this.m.b).add(aguVar2);
            bjt bjtVar = this.t;
            ggu gguVar3 = this.j;
            bjtVar.getClass();
            gguVar3.setImportantForAccessibility(2);
            bjtVar.c = new zfu(i, bjtVar);
            ViewPager2 viewPager2 = (ViewPager2) bjtVar.d;
            if (viewPager2.getImportantForAccessibility() == 0) {
                viewPager2.setImportantForAccessibility(1);
            }
            ((ArrayList) this.m.b).add(this.c);
            f2k f2kVar = new f2k(this.g);
            this.o = f2kVar;
            ((ArrayList) this.m.b).add(f2kVar);
            ggu gguVar4 = this.j;
            attachViewToParent(gguVar4, 0, gguVar4.getLayoutParams());
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void b(dgu dguVar) {
        ((ArrayList) this.c.b).add(dguVar);
    }

    public final void c() {
        if (((egu) this.o.c) == null) {
            return;
        }
        gwo gwoVar = this.l;
        gwoVar.g();
        fwo fwoVar = gwoVar.g;
        double d = fwoVar.b + fwoVar.a;
        int i = (int) d;
        float f = (float) (d - i);
        this.o.b(i, f, Math.round(getPageSize() * f));
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.j.canScrollHorizontally(i);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.j.canScrollVertically(i);
    }

    public final void d() {
        qon adapter;
        if (this.h == -1 || (adapter = getAdapter()) == null) {
            return;
        }
        if (this.i != null) {
            this.i = null;
        }
        int max = Math.max(0, Math.min(this.h, adapter.c() - 1));
        this.d = max;
        this.h = -1;
        this.j.z0(max);
        this.t.r();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof hgu) {
            int i = ((hgu) parcelable).a;
            sparseArray.put(this.j.getId(), (Parcelable) sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        d();
    }

    public final void e(int i, boolean z) {
        if (this.n.b.m) {
            xq0.q("Cannot change current item when ViewPager2 is fake dragging");
        } else {
            f(i, z);
        }
    }

    public final void f(int i, boolean z) {
        qon adapter = getAdapter();
        if (adapter == null) {
            if (this.h != -1) {
                this.h = Math.max(i, 0);
                return;
            }
            return;
        }
        if (adapter.c() <= 0) {
            return;
        }
        int min = Math.min(Math.max(i, 0), adapter.c() - 1);
        int i2 = this.d;
        if (min == i2 && this.l.f == 0) {
            return;
        }
        if (min == i2 && z) {
            return;
        }
        double d = i2;
        this.d = min;
        this.t.r();
        gwo gwoVar = this.l;
        if (gwoVar.f != 0) {
            gwoVar.g();
            fwo fwoVar = gwoVar.g;
            d = fwoVar.b + fwoVar.a;
        }
        gwo gwoVar2 = this.l;
        gwoVar2.getClass();
        gwoVar2.e = z ? 2 : 3;
        gwoVar2.m = false;
        boolean z2 = gwoVar2.i != min;
        gwoVar2.i = min;
        gwoVar2.d(2);
        if (z2) {
            gwoVar2.c(min);
        }
        if (!z) {
            this.j.z0(min);
            return;
        }
        double d2 = min;
        double abs = Math.abs(d2 - d);
        ggu gguVar = this.j;
        if (abs <= 3.0d) {
            gguVar.C0(min);
            return;
        }
        gguVar.z0(d2 > d ? min - 3 : min + 3);
        ggu gguVar2 = this.j;
        gguVar2.post(new zs3(min, gguVar2));
    }

    public final void g(dgu dguVar) {
        ((ArrayList) this.c.b).remove(dguVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        this.t.getClass();
        this.t.getClass();
        return "androidx.viewpager.widget.ViewPager";
    }

    public qon getAdapter() {
        return this.j.getAdapter();
    }

    public int getCurrentItem() {
        return this.d;
    }

    public int getItemDecorationCount() {
        return this.j.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.s;
    }

    public int getOrientation() {
        return this.g.p == 1 ? 1 : 0;
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        ggu gguVar = this.j;
        if (getOrientation() == 0) {
            height = gguVar.getWidth() - gguVar.getPaddingLeft();
            paddingBottom = gguVar.getPaddingRight();
        } else {
            height = gguVar.getHeight() - gguVar.getPaddingTop();
            paddingBottom = gguVar.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.l.f;
    }

    public final void h() {
        fgu fguVar = this.k;
        if (fguVar == null) {
            xq0.q("Design assumption violated.");
            return;
        }
        View e = fguVar.e(this.g);
        if (e == null) {
            return;
        }
        this.g.getClass();
        int f0 = yon.f0(e);
        if (f0 != this.d && getScrollState() == 0) {
            this.m.c(f0);
        }
        this.e = false;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        int i2;
        int c;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ViewPager2 viewPager2 = (ViewPager2) this.t.d;
        if (viewPager2.getAdapter() == null) {
            i = 0;
            i2 = 0;
        } else if (viewPager2.getOrientation() == 1) {
            i = viewPager2.getAdapter().c();
            i2 = 1;
        } else {
            i2 = viewPager2.getAdapter().c();
            i = 1;
        }
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) tb.b(i, i2, 0).a);
        qon adapter = viewPager2.getAdapter();
        if (adapter == null || (c = adapter.c()) == 0 || !viewPager2.r) {
            return;
        }
        if (viewPager2.d > 0) {
            accessibilityNodeInfo.addAction(RemoteCameraConfig.Notification.ID);
        }
        if (viewPager2.d < c - 1) {
            accessibilityNodeInfo.addAction(4096);
        }
        accessibilityNodeInfo.setScrollable(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = this.j.getMeasuredWidth();
        int measuredHeight = this.j.getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        Rect rect = this.a;
        rect.left = paddingLeft;
        rect.right = (i3 - i) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = (i4 - i2) - getPaddingBottom();
        Rect rect2 = this.b;
        Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
        this.j.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.e) {
            h();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        measureChild(this.j, i, i2);
        int measuredWidth = this.j.getMeasuredWidth();
        int measuredHeight = this.j.getMeasuredHeight();
        int measuredState = this.j.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + measuredHeight;
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, measuredState), View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof hgu)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        hgu hguVar = (hgu) parcelable;
        super.onRestoreInstanceState(hguVar.getSuperState());
        this.h = hguVar.b;
        this.i = hguVar.c;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        hgu hguVar = new hgu(super.onSaveInstanceState());
        hguVar.a = this.j.getId();
        int i = this.h;
        if (i == -1) {
            i = this.d;
        }
        hguVar.b = i;
        Parcelable parcelable = this.i;
        if (parcelable != null) {
            hguVar.c = parcelable;
            return hguVar;
        }
        this.j.getAdapter();
        return hguVar;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        this.t.getClass();
        if (i != 8192 && i != 4096) {
            return super.performAccessibilityAction(i, bundle);
        }
        bjt bjtVar = this.t;
        bjtVar.getClass();
        ViewPager2 viewPager2 = (ViewPager2) bjtVar.d;
        if (i != 8192 && i != 4096) {
            e7o.n();
            return false;
        }
        int currentItem = i == 8192 ? viewPager2.getCurrentItem() - 1 : viewPager2.getCurrentItem() + 1;
        if (viewPager2.r) {
            viewPager2.f(currentItem, true);
        }
        return true;
    }

    public void setAdapter(qon qonVar) {
        qon adapter = this.j.getAdapter();
        bjt bjtVar = this.t;
        if (adapter != null) {
            adapter.t((zfu) bjtVar.c);
        } else {
            bjtVar.getClass();
        }
        zfu zfuVar = this.f;
        if (adapter != null) {
            adapter.t(zfuVar);
        }
        this.j.setAdapter(qonVar);
        this.d = 0;
        d();
        bjt bjtVar2 = this.t;
        bjtVar2.r();
        if (qonVar != null) {
            qonVar.r((zfu) bjtVar2.c);
        }
        if (qonVar != null) {
            qonVar.r(zfuVar);
        }
    }

    public void setCurrentItem(int i) {
        e(i, true);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        this.t.r();
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1 && i != -1) {
            xq0.x("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        } else {
            this.s = i;
            this.j.requestLayout();
        }
    }

    public void setOrientation(int i) {
        this.g.J1(i);
        this.t.r();
    }

    public void setPageTransformer(egu eguVar) {
        boolean z = this.q;
        if (eguVar != null) {
            if (!z) {
                this.p = this.j.getItemAnimator();
                this.q = true;
            }
            this.j.setItemAnimator(null);
        } else if (z) {
            this.j.setItemAnimator(this.p);
            this.p = null;
            this.q = false;
        }
        f2k f2kVar = this.o;
        if (eguVar == ((egu) f2kVar.c)) {
            return;
        }
        f2kVar.c = eguVar;
        c();
    }

    public void setUserInputEnabled(boolean z) {
        this.r = z;
        this.t.r();
    }

    public ViewPager2(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new Rect();
        this.b = new Rect();
        this.c = new ir5();
        this.e = false;
        this.f = new zfu(0, this);
        this.h = -1;
        this.p = null;
        this.q = false;
        this.r = true;
        this.s = -1;
        a(context, attributeSet);
    }

    public ViewPager2(@NonNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new Rect();
        this.b = new Rect();
        this.c = new ir5();
        this.e = false;
        this.f = new zfu(0, this);
        this.h = -1;
        this.p = null;
        this.q = false;
        this.r = true;
        this.s = -1;
        a(context, attributeSet);
    }

    public ViewPager2(@NonNull Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = new Rect();
        this.b = new Rect();
        this.c = new ir5();
        this.e = false;
        this.f = new zfu(0, this);
        this.h = -1;
        this.p = null;
        this.q = false;
        this.r = true;
        this.s = -1;
        a(context, attributeSet);
    }
}
