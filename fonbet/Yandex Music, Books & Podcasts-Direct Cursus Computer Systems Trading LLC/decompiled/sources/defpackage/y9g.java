package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class y9g implements keq {
    public static final Method A;
    public static final Method B;
    public final Context a;
    public ListAdapter b;
    public nra c;
    public int f;
    public int g;
    public boolean i;
    public boolean j;
    public boolean k;
    public nr2 n;
    public View o;
    public AdapterView.OnItemClickListener p;
    public AdapterView.OnItemSelectedListener q;
    public final Handler v;
    public Rect x;
    public boolean y;
    public final or0 z;
    public final int d = -2;
    public int e = -2;
    public final int h = 1002;
    public int l = 0;
    public final int m = Integer.MAX_VALUE;
    public final v9g r = new v9g(this, 1);
    public final x9g s = new x9g(0, this);
    public final w9g t = new w9g(this);
    public final v9g u = new v9g(this, 0);
    public final Rect w = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                A = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                B = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public y9g(Context context, AttributeSet attributeSet, int i, int i2) {
        int resourceId;
        this.a = context;
        this.v = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ken.p, i, 0);
        this.f = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.i = true;
        }
        obtainStyledAttributes.recycle();
        or0 or0Var = new or0(context, attributeSet, i, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, ken.t, i, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            or0Var.setOverlapAnchor(obtainStyledAttributes2.getBoolean(2, false));
        }
        or0Var.setBackgroundDrawable((!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) ? obtainStyledAttributes2.getDrawable(0) : y2x.w(context, resourceId));
        obtainStyledAttributes2.recycle();
        this.z = or0Var;
        or0Var.setInputMethodMode(1);
    }

    @Override // defpackage.keq
    public final boolean a() {
        return this.z.isShowing();
    }

    public nra b(Context context, boolean z) {
        return new nra(context, z);
    }

    public final Drawable d() {
        return this.z.getBackground();
    }

    @Override // defpackage.keq
    public final void dismiss() {
        or0 or0Var = this.z;
        or0Var.dismiss();
        or0Var.setContentView(null);
        this.c = null;
        this.v.removeCallbacks(this.r);
    }

    public final int e() {
        return this.f;
    }

    @Override // defpackage.keq
    public void f() {
        int i;
        int paddingBottom;
        nra nraVar;
        nra nraVar2 = this.c;
        Context context = this.a;
        or0 or0Var = this.z;
        if (nraVar2 == null) {
            nra b = b(context, !this.y);
            this.c = b;
            b.setAdapter(this.b);
            this.c.setOnItemClickListener(this.p);
            this.c.setFocusable(true);
            this.c.setFocusableInTouchMode(true);
            this.c.setOnItemSelectedListener(new s9g(0, this));
            this.c.setOnScrollListener(this.t);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.q;
            if (onItemSelectedListener != null) {
                this.c.setOnItemSelectedListener(onItemSelectedListener);
            }
            or0Var.setContentView(this.c);
        }
        Drawable background = or0Var.getBackground();
        Rect rect = this.w;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.i) {
                this.g = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int a = t9g.a(or0Var, this.o, this.g, or0Var.getInputMethodMode() == 2);
        int i3 = this.d;
        if (i3 == -1) {
            paddingBottom = a + i;
        } else {
            int i4 = this.e;
            int a2 = this.c.a(i4 != -2 ? i4 != -1 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), a);
            paddingBottom = a2 + (a2 > 0 ? this.c.getPaddingBottom() + this.c.getPaddingTop() + i : 0);
        }
        boolean z = or0Var.getInputMethodMode() == 2;
        or0Var.setWindowLayoutType(this.h);
        if (or0Var.isShowing()) {
            if (this.o.isAttachedToWindow()) {
                int i5 = this.e;
                if (i5 == -1) {
                    i5 = -1;
                } else if (i5 == -2) {
                    i5 = this.o.getWidth();
                }
                if (i3 == -1) {
                    i3 = z ? paddingBottom : -1;
                    int i6 = this.e;
                    if (z) {
                        or0Var.setWidth(i6 == -1 ? -1 : 0);
                        or0Var.setHeight(0);
                    } else {
                        or0Var.setWidth(i6 == -1 ? -1 : 0);
                        or0Var.setHeight(-1);
                    }
                } else if (i3 == -2) {
                    i3 = paddingBottom;
                }
                or0Var.setOutsideTouchable(true);
                int i7 = i5;
                View view = this.o;
                int i8 = this.f;
                int i9 = this.g;
                int i10 = i7 < 0 ? -1 : i7;
                if (i3 < 0) {
                    i3 = -1;
                }
                or0Var.update(view, i8, i9, i10, i3);
                return;
            }
            return;
        }
        int i11 = this.e;
        if (i11 == -1) {
            i11 = -1;
        } else if (i11 == -2) {
            i11 = this.o.getWidth();
        }
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = paddingBottom;
        }
        or0Var.setWidth(i11);
        or0Var.setHeight(i3);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = A;
            if (method != null) {
                try {
                    method.invoke(or0Var, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            u9g.b(or0Var, true);
        }
        or0Var.setOutsideTouchable(true);
        or0Var.setTouchInterceptor(this.s);
        if (this.k) {
            or0Var.setOverlapAnchor(this.j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = B;
            if (method2 != null) {
                try {
                    method2.invoke(or0Var, this.x);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            u9g.a(or0Var, this.x);
        }
        or0Var.showAsDropDown(this.o, this.f, this.g, this.l);
        this.c.setSelection(-1);
        if ((!this.y || this.c.isInTouchMode()) && (nraVar = this.c) != null) {
            nraVar.setListSelectionHidden(true);
            nraVar.requestLayout();
        }
        if (this.y) {
            return;
        }
        this.v.post(this.u);
    }

    public final void g(int i) {
        this.f = i;
    }

    public final void j(int i) {
        this.g = i;
        this.i = true;
    }

    public final int n() {
        if (this.i) {
            return this.g;
        }
        return 0;
    }

    public void o(ListAdapter listAdapter) {
        nr2 nr2Var = this.n;
        if (nr2Var == null) {
            this.n = new nr2(2, this);
        } else {
            ListAdapter listAdapter2 = this.b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(nr2Var);
            }
        }
        this.b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.n);
        }
        nra nraVar = this.c;
        if (nraVar != null) {
            nraVar.setAdapter(this.b);
        }
    }

    @Override // defpackage.keq
    public final nra p() {
        return this.c;
    }

    public final void q(Drawable drawable) {
        this.z.setBackgroundDrawable(drawable);
    }

    public final void r(int i) {
        Drawable background = this.z.getBackground();
        if (background == null) {
            this.e = i;
            return;
        }
        Rect rect = this.w;
        background.getPadding(rect);
        this.e = rect.left + rect.right + i;
    }
}
