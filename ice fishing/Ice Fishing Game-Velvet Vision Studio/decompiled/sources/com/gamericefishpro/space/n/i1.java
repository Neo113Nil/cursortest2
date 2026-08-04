package com.gamericefishpro.space.n;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i1 implements com.gamericefishpro.space.m.q {
    public static final Method P;
    public static final Method Q;
    public boolean A;
    public boolean B;
    public f1 D;
    public View E;
    public com.gamericefishpro.space.m.k F;
    public final Handler K;
    public Rect M;
    public boolean N;
    public final w O;
    public final Context d;
    public ListAdapter e;
    public m1 i;
    public int w;
    public int y;
    public boolean z;
    public int v = -2;
    public int C = 0;
    public final e1 G = new e1(this, 1);
    public final h1 H = new h1(0, this);
    public final g1 I = new g1(this);
    public final e1 J = new e1(this, 0);
    public final Rect L = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                P = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Q = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
            }
        }
    }

    public i1(Context context, int i) {
        int resourceId;
        this.d = context;
        this.K = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, com.gamericefishpro.space.j.a.l, i, 0);
        this.w = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.y = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.z = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        w wVar = new w(context, null, i, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(null, com.gamericefishpro.space.j.a.p, i, 0);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            wVar.setOverlapAnchor(typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        wVar.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : com.gamericefishpro.space.u6.f.x(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.O = wVar;
        wVar.setInputMethodMode(1);
    }

    @Override // com.gamericefishpro.space.m.q
    public final void a() {
        int i;
        int iMakeMeasureSpec;
        m1 m1Var;
        m1 m1Var2 = this.i;
        Context context = this.d;
        w wVar = this.O;
        if (m1Var2 == null) {
            m1 m1Var3 = new m1(context, !this.N);
            m1Var3.setHoverListener((n1) this);
            this.i = m1Var3;
            m1Var3.setAdapter(this.e);
            this.i.setOnItemClickListener(this.F);
            this.i.setFocusable(true);
            this.i.setFocusableInTouchMode(true);
            this.i.setOnItemSelectedListener(new b1(this));
            this.i.setOnScrollListener(this.I);
            wVar.setContentView(this.i);
        }
        Drawable background = wVar.getBackground();
        Rect rect = this.L;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.z) {
                this.y = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int iA = c1.a(wVar, this.E, this.y, wVar.getInputMethodMode() == 2);
        int i3 = this.v;
        if (i3 != -2) {
            iMakeMeasureSpec = i3 != -1 ? View.MeasureSpec.makeMeasureSpec(i3, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
        }
        int iA2 = this.i.a(iMakeMeasureSpec, iA);
        int paddingBottom = iA2 + (iA2 > 0 ? this.i.getPaddingBottom() + this.i.getPaddingTop() + i : 0);
        wVar.getInputMethodMode();
        wVar.setWindowLayoutType(1002);
        if (wVar.isShowing()) {
            if (this.E.isAttachedToWindow()) {
                int width = this.v;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.E.getWidth();
                }
                wVar.setOutsideTouchable(true);
                wVar.update(this.E, this.w, this.y, width < 0 ? -1 : width, paddingBottom < 0 ? -1 : paddingBottom);
                return;
            }
            return;
        }
        int width2 = this.v;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.E.getWidth();
        }
        wVar.setWidth(width2);
        wVar.setHeight(paddingBottom);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = P;
            if (method != null) {
                try {
                    method.invoke(wVar, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        } else {
            d1.b(wVar, true);
        }
        wVar.setOutsideTouchable(true);
        wVar.setTouchInterceptor(this.H);
        if (this.B) {
            wVar.setOverlapAnchor(this.A);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = Q;
            if (method2 != null) {
                try {
                    method2.invoke(wVar, this.M);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            d1.a(wVar, this.M);
        }
        wVar.showAsDropDown(this.E, this.w, this.y, this.C);
        this.i.setSelection(-1);
        if ((!this.N || this.i.isInTouchMode()) && (m1Var = this.i) != null) {
            m1Var.setListSelectionHidden(true);
            m1Var.requestLayout();
        }
        if (this.N) {
            return;
        }
        this.K.post(this.J);
    }

    public final void b(ListAdapter listAdapter) {
        f1 f1Var = this.D;
        if (f1Var == null) {
            this.D = new f1(this);
        } else {
            ListAdapter listAdapter2 = this.e;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(f1Var);
            }
        }
        this.e = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.D);
        }
        m1 m1Var = this.i;
        if (m1Var != null) {
            m1Var.setAdapter(this.e);
        }
    }

    @Override // com.gamericefishpro.space.m.q
    public final void dismiss() {
        w wVar = this.O;
        wVar.dismiss();
        wVar.setContentView(null);
        this.i = null;
        this.K.removeCallbacks(this.G);
    }

    @Override // com.gamericefishpro.space.m.q
    public final ListView e() {
        return this.i;
    }

    @Override // com.gamericefishpro.space.m.q
    public final boolean j() {
        return this.O.isShowing();
    }
}
