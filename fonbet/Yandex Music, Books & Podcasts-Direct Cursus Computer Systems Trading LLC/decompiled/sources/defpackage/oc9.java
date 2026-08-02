package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public class oc9 extends kgu implements f29 {
    public static final /* synthetic */ int n = 0;
    public final /* synthetic */ g29 c;
    public dgu d;
    public final ArrayList e;
    public dgu f;
    public jc9 g;
    public d3k h;
    public kc9 i;
    public bqj j;
    public final GestureDetector k;
    public final Object l;
    public final Rect m;

    public oc9(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new g29();
        this.e = new ArrayList();
        this.k = new GestureDetector(context, new bf3(2, this));
        this.l = btf.a(bwf.c, new rs6(24, this));
        this.m = new Rect();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [arf, java.lang.Object] */
    private lc9 getAccessibilityDelegate() {
        return (lc9) this.l.getValue();
    }

    @Override // defpackage.f29, defpackage.a0c, defpackage.ptn
    public final void a() {
        this.c.a();
    }

    public final void b() {
        RecyclerView recyclerView;
        lc9 accessibilityDelegate = getAccessibilityDelegate();
        if (accessibilityDelegate == null || (recyclerView = getRecyclerView()) == null) {
            return;
        }
        recyclerView.setAccessibilityDelegateCompat(accessibilityDelegate);
    }

    public final boolean c(ViewGroup viewGroup, int i, int i2, Function1 function1) {
        for (int childCount = viewGroup.getChildCount() - 1; -1 < childCount; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            Rect rect = this.m;
            childAt.getHitRect(rect);
            if (rect.contains(i, i2) && (((Boolean) function1.invoke(childAt)).booleanValue() || ((childAt instanceof ViewGroup) && c((ViewGroup) childAt, i - rect.left, i2 - rect.top, function1)))) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.p7t
    public final void d(View view) {
        this.c.d(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.k.onTouchEvent(motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        tp8 divBorderDrawer = getDivBorderDrawer();
        if (divBorderDrawer == null) {
            super.draw(canvas);
            return;
        }
        int save = canvas.save();
        try {
            divBorderDrawer.c(canvas);
            super.draw(canvas);
            divBorderDrawer.d(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view != null && view.getVisibility() == 0) {
            bg3.z(view, canvas);
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // defpackage.p7t
    public final boolean e() {
        return this.c.b.e();
    }

    @Override // defpackage.yp8
    public final void g(e23 e23Var, op8 op8Var, View view) {
        this.c.g(e23Var, op8Var, view);
    }

    @Override // defpackage.f29
    public e23 getBindingContext() {
        return this.c.d;
    }

    public dgu getChangePageCallbackForLogger$div_release() {
        return this.f;
    }

    public jc9 getChangePageCallbackForOffScreenPages$div_release() {
        return this.g;
    }

    public dgu getChangePageCallbackForState$div_release() {
        return this.d;
    }

    public boolean getClipToPage$div_release() {
        RecyclerView recyclerView = getRecyclerView();
        if (recyclerView != null) {
            return recyclerView.getClipChildren();
        }
        return false;
    }

    public int getCurrentItem$div_release() {
        return getViewPager().getCurrentItem();
    }

    @Override // defpackage.f29
    public kb8 getDiv() {
        return (kb8) this.c.c;
    }

    @Override // defpackage.yp8
    public tp8 getDivBorderDrawer() {
        return this.c.a.a;
    }

    @Override // defpackage.yp8
    public boolean getNeedClipping() {
        return this.c.a.b;
    }

    public bqj getOnInterceptTouchEventListener() {
        return this.j;
    }

    public kc9 getPagerOnItemsCountChange$div_release() {
        return this.i;
    }

    public d3k getPagerSelectedActionsDispatcher$div_release() {
        return this.h;
    }

    @Override // defpackage.a0c
    @NotNull
    public List<ja8> getSubscriptions() {
        return this.c.e;
    }

    @Override // defpackage.p7t
    public final void h(View view) {
        this.c.h(view);
    }

    @Override // defpackage.a0c
    public final void i(ja8 ja8Var) {
        this.c.i(ja8Var);
    }

    @Override // defpackage.yp8
    public final void k() {
        this.c.k();
    }

    @Override // defpackage.a0c
    public final void l() {
        this.c.l();
    }

    @Override // defpackage.yp8
    public final void m() {
        this.c.m();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        bqj onInterceptTouchEventListener = getOnInterceptTouchEventListener();
        if (onInterceptTouchEventListener != null) {
            ((o6c) onInterceptTouchEventListener).E(this, motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.c.b(i, i2);
    }

    @Override // defpackage.f29
    public void setBindingContext(e23 e23Var) {
        this.c.d = e23Var;
    }

    public void setChangePageCallbackForLogger$div_release(dgu dguVar) {
        dgu dguVar2 = this.f;
        if (dguVar2 != null) {
            getViewPager().g(dguVar2);
        }
        if (dguVar != null) {
            getViewPager().b(dguVar);
        }
        this.f = dguVar;
    }

    public void setChangePageCallbackForOffScreenPages$div_release(jc9 jc9Var) {
        jc9 jc9Var2 = this.g;
        if (jc9Var2 != null) {
            getViewPager().g(jc9Var2);
            RecyclerView recyclerView = getRecyclerView();
            if (recyclerView != null) {
                recyclerView.removeOnLayoutChangeListener(jc9Var2);
            }
        }
        if (jc9Var != null) {
            getViewPager().b(jc9Var);
            RecyclerView recyclerView2 = getRecyclerView();
            if (recyclerView2 != null) {
                recyclerView2.addOnLayoutChangeListener(jc9Var);
            }
        }
        this.g = jc9Var;
    }

    public void setChangePageCallbackForState$div_release(dgu dguVar) {
        dgu dguVar2 = this.d;
        if (dguVar2 != null) {
            getViewPager().g(dguVar2);
        }
        if (dguVar != null) {
            getViewPager().b(dguVar);
        }
        this.d = dguVar;
    }

    public void setClipToPage$div_release(boolean z) {
        RecyclerView recyclerView = getRecyclerView();
        if (recyclerView == null) {
            return;
        }
        recyclerView.setClipChildren(z);
    }

    public void setCurrentItem$div_release(int i) {
        getViewPager().e(i, false);
    }

    @Override // defpackage.yp8
    public void setNeedClipping(boolean z) {
        this.c.setNeedClipping(z);
    }

    public void setOnInterceptTouchEventListener(bqj bqjVar) {
        this.j = bqjVar;
    }

    public void setPagerOnItemsCountChange$div_release(kc9 kc9Var) {
        this.i = kc9Var;
    }

    public void setPagerSelectedActionsDispatcher$div_release(d3k d3kVar) {
        d3k d3kVar2 = this.h;
        if (d3kVar2 != null) {
            ViewPager2 viewPager = getViewPager();
            c3k c3kVar = d3kVar2.d;
            if (c3kVar != null) {
                viewPager.g(c3kVar);
            }
            d3kVar2.d = null;
        }
        if (d3kVar != null) {
            ViewPager2 viewPager2 = getViewPager();
            c3k c3kVar2 = new c3k(d3kVar);
            viewPager2.b(c3kVar2);
            d3kVar.d = c3kVar2;
        }
        this.h = d3kVar;
    }

    @Override // defpackage.f29
    public void setDiv(kb8 kb8Var) {
        this.c.c = kb8Var;
    }

    public oc9(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ oc9(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public oc9(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }
}
