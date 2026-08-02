package just.adapter.sticky;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import core.flex.ui.OrientationAwareRecyclerView;
import defpackage.aeu0;
import defpackage.e6q0;
import defpackage.gki0;
import defpackage.gyt0;
import defpackage.h6q0;
import defpackage.jgb1;
import defpackage.kgb1;
import defpackage.reu0;
import defpackage.sls;
import defpackage.tls;
import defpackage.u0x;
import defpackage.u1w;
import defpackage.vdu0;
import defpackage.w511;
import defpackage.weu0;
import defpackage.xdu0;
import defpackage.xeu0;
import defpackage.ydu0;
import defpackage.zdu0;
import flex.engine.section.ui.StickyHostLayout;
import java.util.HashMap;
import just.adapter.scroll.ScrollDirection;

/* loaded from: classes9.dex */
public final class b {
    public final StickyHostLayout a;
    public final OrientationAwareRecyclerView b;
    public final ydu0 c;
    public final reu0 d;
    public final StickyGravity e;
    public final tls f;
    public final sls g;
    public final tls h;
    public final h6q0 i;
    public final vdu0 j;
    public final e6q0 k;
    public View l;
    public gyt0 o;
    public boolean q;
    public final weu0 m = new weu0();
    public int n = -1;
    public int p = -1;
    public final StickyViewUpdater$UpdateStickyTranslationOnLayoutChange r = new View.OnLayoutChangeListener() { // from class: just.adapter.sticky.StickyViewUpdater$UpdateStickyTranslationOnLayoutChange
        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
            float a = b.this.a(ScrollDirection.IGNORE, 0);
            view.setTranslationY(a);
            b.this.e(a);
        }
    };
    public final HashMap s = new HashMap();

    /* JADX WARN: Type inference failed for: r1v3, types: [just.adapter.sticky.StickyViewUpdater$UpdateStickyTranslationOnLayoutChange] */
    public b(StickyHostLayout stickyHostLayout, OrientationAwareRecyclerView orientationAwareRecyclerView, ydu0 ydu0Var, reu0 reu0Var, StickyGravity stickyGravity, tls tlsVar, sls slsVar, tls tlsVar2, h6q0 h6q0Var, vdu0 vdu0Var, e6q0 e6q0Var) {
        this.a = stickyHostLayout;
        this.b = orientationAwareRecyclerView;
        this.c = ydu0Var;
        this.d = reu0Var;
        this.e = stickyGravity;
        this.f = tlsVar;
        this.g = slsVar;
        this.h = tlsVar2;
        this.i = h6q0Var;
        this.j = vdu0Var;
        this.k = e6q0Var;
    }

    public final float a(ScrollDirection scrollDirection, int i) {
        View view;
        OrientationAwareRecyclerView orientationAwareRecyclerView = this.b;
        RecyclerView.e layoutManager = orientationAwareRecyclerView.getLayoutManager();
        if (layoutManager == null || (view = this.l) == null) {
            return 0.0f;
        }
        return this.d.a(orientationAwareRecyclerView, layoutManager, this.c, view, this.p, this.n, scrollDirection, i, this.j, b(this.p));
    }

    public final int b(int i) {
        aeu0 f;
        xdu0 xdu0Var = (xdu0) this.k.invoke(Integer.valueOf(i));
        int i2 = 0;
        if (xdu0Var == null || (f = xdu0Var.f()) == null) {
            return 0;
        }
        OrientationAwareRecyclerView orientationAwareRecyclerView = this.b;
        float f2 = orientationAwareRecyclerView.getResources().getDisplayMetrics().density;
        tls tlsVar = f.f;
        StickyGravity stickyGravity = this.e;
        int floatValue = (int) (((Number) tlsVar.invoke(stickyGravity)).floatValue() * f2);
        zdu0 zdu0Var = (zdu0) f.g.invoke(stickyGravity);
        u1w a = kgb1.a(orientationAwareRecyclerView);
        int i3 = xeu0.a[stickyGravity.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                w511.b();
                return 0;
            }
            if (zdu0Var.a() && a != null) {
                i2 = a.d;
            }
        } else if (zdu0Var.b() && a != null) {
            i2 = a.b;
        }
        return floatValue + i2;
    }

    public final void c(View view, int i, gki0 gki0Var) {
        int i2;
        weu0 weu0Var = this.m;
        weu0Var.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            weu0Var.a = layoutParams2.getInitialMarginTop();
            weu0Var.b = layoutParams2.getInitialMarginBottom();
            weu0Var.c = layoutParams2.getInitialMarginLeft();
            weu0Var.d = layoutParams2.getInitialMarginRight();
        } else {
            weu0Var.a = jgb1.g(layoutParams);
            weu0Var.b = jgb1.c(layoutParams);
            weu0Var.c = jgb1.d(layoutParams);
            weu0Var.d = jgb1.f(layoutParams);
        }
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            weu0Var.e = ((FrameLayout.LayoutParams) layoutParams).gravity;
        }
        int i3 = weu0Var.a;
        OrientationAwareRecyclerView orientationAwareRecyclerView = this.b;
        weu0Var.a = orientationAwareRecyclerView.getPaddingTop() + i3;
        weu0Var.b = orientationAwareRecyclerView.getPaddingBottom() + weu0Var.b;
        weu0Var.c = orientationAwareRecyclerView.getPaddingLeft() + weu0Var.c;
        weu0Var.d = orientationAwareRecyclerView.getPaddingRight() + weu0Var.d;
        ViewGroup.LayoutParams layoutParams3 = orientationAwareRecyclerView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
        if (marginLayoutParams != null) {
            weu0Var.a += marginLayoutParams.topMargin;
            weu0Var.b += marginLayoutParams.bottomMargin;
            weu0Var.c += marginLayoutParams.leftMargin;
            weu0Var.d += marginLayoutParams.rightMargin;
        }
        Integer valueOf = Integer.valueOf(i);
        HashMap hashMap = this.s;
        Object obj = hashMap.get(valueOf);
        if (obj == null) {
            obj = new Rect();
            hashMap.put(valueOf, obj);
        }
        Rect rect = (Rect) obj;
        x0 findViewHolderForAdapterPosition = orientationAwareRecyclerView.findViewHolderForAdapterPosition(i);
        if (findViewHolderForAdapterPosition != null) {
            gki0Var.m(findViewHolderForAdapterPosition.a, rect);
        }
        weu0Var.c += rect.left;
        weu0Var.d += rect.right;
        int[] iArr = xeu0.a;
        StickyGravity stickyGravity = this.e;
        int i4 = iArr[stickyGravity.ordinal()];
        if (i4 == 1) {
            weu0Var.b += rect.bottom;
        } else {
            if (i4 != 2) {
                w511.b();
                return;
            }
            weu0Var.a += rect.top;
        }
        int i5 = iArr[stickyGravity.ordinal()];
        if (i5 == 1) {
            i2 = 48;
        } else {
            if (i5 != 2) {
                w511.b();
                return;
            }
            i2 = 80;
        }
        weu0Var.e = i2;
        int b = b(i);
        int i6 = iArr[stickyGravity.ordinal()];
        if (i6 == 1) {
            weu0Var.a += b;
        } else {
            if (i6 != 2) {
                w511.b();
                return;
            }
            weu0Var.b += b;
        }
        ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
        if (layoutParams4 instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) layoutParams4;
            if (layoutParams5.gravity == weu0Var.e && layoutParams5.topMargin == weu0Var.a && layoutParams5.bottomMargin == weu0Var.b && layoutParams5.leftMargin == weu0Var.c && layoutParams5.rightMargin == weu0Var.d) {
                return;
            }
        }
        if (!(layoutParams4 instanceof LayoutParams)) {
            layoutParams4 = new LayoutParams(layoutParams4);
        }
        LayoutParams layoutParams6 = (LayoutParams) layoutParams4;
        ((FrameLayout.LayoutParams) layoutParams6).gravity = weu0Var.e;
        ((FrameLayout.LayoutParams) layoutParams6).topMargin = weu0Var.a;
        ((FrameLayout.LayoutParams) layoutParams6).bottomMargin = weu0Var.b;
        ((FrameLayout.LayoutParams) layoutParams6).leftMargin = weu0Var.c;
        ((FrameLayout.LayoutParams) layoutParams6).rightMargin = weu0Var.d;
        view.setLayoutParams(layoutParams4);
    }

    public final void d(boolean z) {
        aeu0 f;
        RecyclerView.Adapter adapter;
        View view = this.l;
        if (view == null) {
            return;
        }
        this.a.removeView(view);
        gyt0 gyt0Var = this.o;
        if (gyt0Var != null) {
            gyt0Var.invoke();
        }
        this.o = null;
        view.removeOnLayoutChangeListener(this.r);
        int a = this.c.a(this.n);
        Integer valueOf = Integer.valueOf(a);
        if (a == -1) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : this.p;
        OrientationAwareRecyclerView orientationAwareRecyclerView = this.b;
        x0 findViewHolderForAdapterPosition = orientationAwareRecyclerView.findViewHolderForAdapterPosition(intValue);
        if (findViewHolderForAdapterPosition != null) {
            View view2 = findViewHolderForAdapterPosition.a;
            if (z && view2.getVisibility() == 4 && (adapter = orientationAwareRecyclerView.getAdapter()) != null) {
                adapter.onViewRecycled(findViewHolderForAdapterPosition);
                adapter.onBindViewHolder(findViewHolderForAdapterPosition, intValue);
            }
            view2.setVisibility(0);
        }
        if (z && this.q) {
            Object obj = (u0x) kotlin.collections.a.S(this.p, this.i.a.J.w);
            xdu0 xdu0Var = obj instanceof xdu0 ? (xdu0) obj : null;
            if (xdu0Var != null && (f = xdu0Var.f()) != null) {
                f.d.invoke(this.e);
            }
        }
        this.p = -1;
        this.n = -1;
        this.q = false;
        this.l = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        if (r7 >= 0.0f) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        if (r2 == r6.q) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        r6.q = r2;
        r6 = (defpackage.u0x) kotlin.collections.a.S(r6.p, r6.i.a.J.w);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
    
        if ((r6 instanceof defpackage.xdu0) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
    
        r6 = (defpackage.xdu0) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
    
        if (r6 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
    
        r6 = r6.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        if (r6 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if (r2 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        r6.c.invoke(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
    
        r6.d.invoke(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0048, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0028, code lost:
    
        if (r7 <= 0.0f) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(float f) {
        if (this.l == null || this.p == -1) {
            return;
        }
        int[] iArr = xeu0.a;
        StickyGravity stickyGravity = this.e;
        int i = iArr[stickyGravity.ordinal()];
        boolean z = false;
        if (i != 1) {
            if (i != 2) {
                w511.b();
            }
        }
    }
}
