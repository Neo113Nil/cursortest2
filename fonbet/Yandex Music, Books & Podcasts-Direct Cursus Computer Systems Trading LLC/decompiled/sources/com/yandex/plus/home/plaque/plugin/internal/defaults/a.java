package com.yandex.plus.home.plaque.plugin.internal.defaults;

import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.RegionIterator;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u;
import com.yandex.plus.home.feature.webviews.internal.stories.i;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.ui.g;
import defpackage.au1;
import defpackage.ctm;
import defpackage.fe0;
import defpackage.gzf;
import defpackage.ib;
import defpackage.nyf;
import defpackage.xq0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* loaded from: classes5.dex */
public final class a implements com.yandex.plus.home.plaque.feature.api.a {
    public final nyf a;
    public final float b;
    public final au1 c;
    public final WeakHashMap d;
    public final LinkedHashSet e;
    public final g f;
    public final ib g;
    public final fe0 h;

    public a() {
        gzf gzfVar = ctm.i.f;
        au1 au1Var = new au1(15);
        gzfVar.getClass();
        this.a = gzfVar;
        this.b = 0.5f;
        this.c = au1Var;
        this.d = new WeakHashMap();
        this.e = new LinkedHashSet();
        this.f = new g(2, this);
        this.g = new ib(2, this);
        this.h = new fe0(1, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0131 A[LOOP:0: B:2:0x000a->B:22:0x0131, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x013a A[EDGE_INSN: B:23:0x013a->B:24:0x013a BREAK  A[LOOP:0: B:2:0x000a->B:22:0x0131], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(a aVar) {
        boolean z;
        int indexOfChild;
        boolean z2 = false;
        boolean z3 = false;
        for (View view : aVar.e) {
            float f = aVar.b;
            View rootView = view.getRootView();
            rootView.getClass();
            double d = f;
            if (0.0d > d || d > 1.0d) {
                xq0.x("percentNeeded must be 0.0 <= percentNeeded <= 1.0!");
                return;
            }
            if (view.getVisibility() == 0) {
                Rect rect = new Rect();
                int measuredWidth = view.getMeasuredWidth();
                if (measuredWidth < 1) {
                    measuredWidth = 1;
                }
                int measuredHeight = view.getMeasuredHeight();
                if (measuredHeight < 1) {
                    measuredHeight = 1;
                }
                rect.set(z2 ? 1 : 0, z2 ? 1 : 0, measuredWidth, measuredHeight);
                ViewParent parent = view.getParent();
                if (parent != null) {
                    parent.getChildVisibleRect(view, rect, null);
                    View rootView2 = view.getRootView();
                    z = rect.intersect(rootView2.getLeft(), rootView2.getTop(), rootView2.getRight(), rootView2.getBottom());
                } else {
                    z = z2 ? 1 : 0;
                }
                if (z) {
                    float height = rect.height() * rect.width() * f;
                    if (rect.height() * rect.width() >= height) {
                        Region region = new Region(rect);
                        ViewParent parent2 = view.getParent();
                        ViewGroup viewGroup = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
                        View view2 = view;
                        ViewGroup viewGroup2 = viewGroup;
                        while (true) {
                            if (viewGroup2 == null) {
                                z2 = view2.equals(rootView);
                                break;
                            }
                            if ((viewGroup2.getVisibility() == 0 ? true : z2 ? 1 : 0) != true || (indexOfChild = viewGroup2.indexOfChild(view2)) < 0) {
                                break;
                            }
                            int i = indexOfChild + 1;
                            Rect rect2 = new Rect();
                            Region region2 = new Region();
                            int childCount = viewGroup2.getChildCount();
                            while (true) {
                                if (i >= childCount) {
                                    z2 = true;
                                    break;
                                }
                                View childAt = viewGroup2.getChildAt(i);
                                region2.setEmpty();
                                childAt.getClass();
                                if (u.d(region2, childAt, rect2) && (!region.op(region2, Region.Op.DIFFERENCE) || region.isEmpty())) {
                                    break;
                                }
                                RegionIterator regionIterator = new RegionIterator(region);
                                Rect rect3 = new Rect();
                                int i2 = z2 ? 1 : 0;
                                while (regionIterator.next(rect3)) {
                                    i2 = (rect3.height() * rect3.width()) + i2;
                                    if (i2 >= height) {
                                        break;
                                    }
                                }
                                z2 = false;
                                break;
                                i++;
                                z2 = false;
                            }
                            if (!z2) {
                                break;
                            }
                            ViewParent parent3 = viewGroup2.getParent();
                            view2 = viewGroup2;
                            viewGroup2 = parent3 instanceof ViewGroup ? (ViewGroup) parent3 : null;
                            z2 = false;
                        }
                    }
                }
                z3 = z2;
                if (!z3) {
                    break;
                } else {
                    z2 = false;
                }
            }
            z3 = false;
            if (!z3) {
            }
        }
        aVar.d(z3);
    }

    @Override // com.yandex.plus.home.plaque.feature.api.a
    public final void a(com.yandex.plus.home.plaque.feature.internal.a aVar) {
        this.d.put(aVar, Boolean.TRUE);
    }

    @Override // com.yandex.plus.home.plaque.feature.api.a
    public final void b(com.yandex.plus.home.plaque.feature.internal.a aVar) {
        aVar.getClass();
        this.d.remove(aVar);
    }

    public final void d(boolean z) {
        Iterator it = this.d.keySet().iterator();
        while (it.hasNext()) {
            ((com.yandex.plus.home.plaque.feature.internal.a) it.next()).a(z);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getClass();
        LinkedHashSet linkedHashSet = this.e;
        boolean isEmpty = linkedHashSet.isEmpty();
        if (linkedHashSet.add(view)) {
            if (isEmpty) {
                this.a.a(this.f);
                ViewTreeObserver viewTreeObserver = view.getRootView().getViewTreeObserver();
                viewTreeObserver.addOnGlobalLayoutListener(this.g);
                viewTreeObserver.addOnScrollChangedListener(this.h);
            }
            this.c.R(new i(0, this, a.class, "checkVisibility", "checkVisibility()V", 0, 21));
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.getClass();
        LinkedHashSet linkedHashSet = this.e;
        if (linkedHashSet.remove(view)) {
            boolean isEmpty = linkedHashSet.isEmpty();
            au1 au1Var = this.c;
            if (!isEmpty) {
                au1Var.R(new i(0, this, a.class, "checkVisibility", "checkVisibility()V", 0, 22));
                return;
            }
            view.getRootView().getViewTreeObserver().removeOnGlobalLayoutListener(this.g);
            view.getRootView().getViewTreeObserver().removeOnScrollChangedListener(this.h);
            this.a.d(this.f);
            au1Var.N().removeMessages(1);
            d(false);
        }
    }
}
