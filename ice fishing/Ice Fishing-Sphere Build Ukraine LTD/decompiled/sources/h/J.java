package h;

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
import c.AbstractC0097a;
import d.AbstractC0110a;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class J implements g.r {

    /* renamed from: A, reason: collision with root package name */
    public static final Method f2098A;

    /* renamed from: B, reason: collision with root package name */
    public static final Method f2099B;

    /* renamed from: e, reason: collision with root package name */
    public final Context f2100e;

    /* renamed from: f, reason: collision with root package name */
    public ListAdapter f2101f;

    /* renamed from: g, reason: collision with root package name */
    public L f2102g;

    /* renamed from: i, reason: collision with root package name */
    public int f2104i;

    /* renamed from: j, reason: collision with root package name */
    public int f2105j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2106k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2107l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2108m;

    /* renamed from: o, reason: collision with root package name */
    public B.b f2110o;

    /* renamed from: p, reason: collision with root package name */
    public View f2111p;

    /* renamed from: q, reason: collision with root package name */
    public g.l f2112q;

    /* renamed from: v, reason: collision with root package name */
    public final Handler f2116v;

    /* renamed from: x, reason: collision with root package name */
    public Rect f2118x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f2119y;

    /* renamed from: z, reason: collision with root package name */
    public final r f2120z;

    /* renamed from: h, reason: collision with root package name */
    public int f2103h = -2;

    /* renamed from: n, reason: collision with root package name */
    public int f2109n = 0;
    public final RunnableC0156G r = new RunnableC0156G(this, 1);

    /* renamed from: s, reason: collision with root package name */
    public final I f2113s = new I(this);

    /* renamed from: t, reason: collision with root package name */
    public final H f2114t = new H(this);

    /* renamed from: u, reason: collision with root package name */
    public final RunnableC0156G f2115u = new RunnableC0156G(this, 0);

    /* renamed from: w, reason: collision with root package name */
    public final Rect f2117w = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f2098A = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f2099B = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public J(Context context, int i2) {
        int resourceId;
        this.f2100e = context;
        this.f2116v = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC0097a.f1647k, i2, 0);
        this.f2104i = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f2105j = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f2106k = true;
        }
        obtainStyledAttributes.recycle();
        r rVar = new r(context, null, i2, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(null, AbstractC0097a.f1651o, i2, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            A.n.c(rVar, obtainStyledAttributes2.getBoolean(2, false));
        }
        rVar.setBackgroundDrawable((!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) ? obtainStyledAttributes2.getDrawable(0) : AbstractC0110a.a(context, resourceId));
        obtainStyledAttributes2.recycle();
        this.f2120z = rVar;
        rVar.setInputMethodMode(1);
    }

    public final void a(ListAdapter listAdapter) {
        B.b bVar = this.f2110o;
        if (bVar == null) {
            this.f2110o = new B.b(1, this);
        } else {
            ListAdapter listAdapter2 = this.f2101f;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(bVar);
            }
        }
        this.f2101f = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f2110o);
        }
        L l2 = this.f2102g;
        if (l2 != null) {
            l2.setAdapter(this.f2101f);
        }
    }

    @Override // g.r
    public final boolean c() {
        return this.f2120z.isShowing();
    }

    @Override // g.r
    public final void dismiss() {
        r rVar = this.f2120z;
        rVar.dismiss();
        rVar.setContentView(null);
        this.f2102g = null;
        this.f2116v.removeCallbacks(this.r);
    }

    @Override // g.r
    public final ListView e() {
        return this.f2102g;
    }

    @Override // g.r
    public final void f() {
        int i2;
        L l2;
        L l3 = this.f2102g;
        r rVar = this.f2120z;
        Context context = this.f2100e;
        if (l3 == null) {
            L l4 = new L(context, !this.f2119y);
            l4.setHoverListener((M) this);
            this.f2102g = l4;
            l4.setAdapter(this.f2101f);
            this.f2102g.setOnItemClickListener(this.f2112q);
            this.f2102g.setFocusable(true);
            this.f2102g.setFocusableInTouchMode(true);
            this.f2102g.setOnItemSelectedListener(new C0155F(r0, this));
            this.f2102g.setOnScrollListener(this.f2114t);
            rVar.setContentView(this.f2102g);
        }
        Drawable background = rVar.getBackground();
        Rect rect = this.f2117w;
        if (background != null) {
            background.getPadding(rect);
            int i3 = rect.top;
            i2 = rect.bottom + i3;
            if (!this.f2106k) {
                this.f2105j = -i3;
            }
        } else {
            rect.setEmpty();
            i2 = 0;
        }
        int maxAvailableHeight = rVar.getMaxAvailableHeight(this.f2111p, this.f2105j, rVar.getInputMethodMode() == 2);
        int i4 = this.f2103h;
        int a2 = this.f2102g.a(i4 != -2 ? i4 != -1 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), maxAvailableHeight);
        int paddingBottom = a2 + (a2 > 0 ? this.f2102g.getPaddingBottom() + this.f2102g.getPaddingTop() + i2 : 0);
        this.f2120z.getInputMethodMode();
        A.n.d(rVar, 1002);
        if (rVar.isShowing()) {
            View view = this.f2111p;
            Field field = w.x.f3074a;
            if (view.isAttachedToWindow()) {
                int i5 = this.f2103h;
                if (i5 == -1) {
                    i5 = -1;
                } else if (i5 == -2) {
                    i5 = this.f2111p.getWidth();
                }
                rVar.setOutsideTouchable(true);
                rVar.update(this.f2111p, this.f2104i, this.f2105j, i5 < 0 ? -1 : i5, paddingBottom < 0 ? -1 : paddingBottom);
                return;
            }
            return;
        }
        int i6 = this.f2103h;
        if (i6 == -1) {
            i6 = -1;
        } else if (i6 == -2) {
            i6 = this.f2111p.getWidth();
        }
        rVar.setWidth(i6);
        rVar.setHeight(paddingBottom);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f2098A;
            if (method != null) {
                try {
                    method.invoke(rVar, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            rVar.setIsClippedToScreen(true);
        }
        rVar.setOutsideTouchable(true);
        rVar.setTouchInterceptor(this.f2113s);
        if (this.f2108m) {
            A.n.c(rVar, this.f2107l);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f2099B;
            if (method2 != null) {
                try {
                    method2.invoke(rVar, this.f2118x);
                } catch (Exception e2) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
        } else {
            rVar.setEpicenterBounds(this.f2118x);
        }
        rVar.showAsDropDown(this.f2111p, this.f2104i, this.f2105j, this.f2109n);
        this.f2102g.setSelection(-1);
        if ((!this.f2119y || this.f2102g.isInTouchMode()) && (l2 = this.f2102g) != null) {
            l2.setListSelectionHidden(true);
            l2.requestLayout();
        }
        if (this.f2119y) {
            return;
        }
        this.f2116v.post(this.f2115u);
    }
}
