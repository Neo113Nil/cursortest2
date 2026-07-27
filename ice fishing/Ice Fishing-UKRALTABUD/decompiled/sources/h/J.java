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

    /* renamed from: B, reason: collision with root package name */
    public static final Method f2089B;

    /* renamed from: C, reason: collision with root package name */
    public static final Method f2090C;

    /* renamed from: A, reason: collision with root package name */
    public final r f2091A;

    /* renamed from: f, reason: collision with root package name */
    public final Context f2092f;

    /* renamed from: g, reason: collision with root package name */
    public ListAdapter f2093g;

    /* renamed from: h, reason: collision with root package name */
    public L f2094h;

    /* renamed from: j, reason: collision with root package name */
    public int f2096j;

    /* renamed from: k, reason: collision with root package name */
    public int f2097k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2098l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2099m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2100n;

    /* renamed from: p, reason: collision with root package name */
    public B.b f2102p;

    /* renamed from: q, reason: collision with root package name */
    public View f2103q;
    public g.l r;

    /* renamed from: w, reason: collision with root package name */
    public final Handler f2108w;

    /* renamed from: y, reason: collision with root package name */
    public Rect f2110y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f2111z;

    /* renamed from: i, reason: collision with root package name */
    public int f2095i = -2;

    /* renamed from: o, reason: collision with root package name */
    public int f2101o = 0;

    /* renamed from: s, reason: collision with root package name */
    public final RunnableC0156G f2104s = new RunnableC0156G(this, 1);

    /* renamed from: t, reason: collision with root package name */
    public final I f2105t = new I(this);

    /* renamed from: u, reason: collision with root package name */
    public final H f2106u = new H(this);

    /* renamed from: v, reason: collision with root package name */
    public final RunnableC0156G f2107v = new RunnableC0156G(this, 0);

    /* renamed from: x, reason: collision with root package name */
    public final Rect f2109x = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f2089B = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f2090C = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public J(Context context, int i2) {
        int resourceId;
        this.f2092f = context;
        this.f2108w = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC0097a.f1639k, i2, 0);
        this.f2096j = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f2097k = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f2098l = true;
        }
        obtainStyledAttributes.recycle();
        r rVar = new r(context, null, i2, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(null, AbstractC0097a.f1643o, i2, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            A.n.c(rVar, obtainStyledAttributes2.getBoolean(2, false));
        }
        rVar.setBackgroundDrawable((!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) ? obtainStyledAttributes2.getDrawable(0) : AbstractC0110a.a(context, resourceId));
        obtainStyledAttributes2.recycle();
        this.f2091A = rVar;
        rVar.setInputMethodMode(1);
    }

    public final void a(ListAdapter listAdapter) {
        B.b bVar = this.f2102p;
        if (bVar == null) {
            this.f2102p = new B.b(1, this);
        } else {
            ListAdapter listAdapter2 = this.f2093g;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(bVar);
            }
        }
        this.f2093g = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f2102p);
        }
        L l2 = this.f2094h;
        if (l2 != null) {
            l2.setAdapter(this.f2093g);
        }
    }

    @Override // g.r
    public final boolean c() {
        return this.f2091A.isShowing();
    }

    @Override // g.r
    public final void dismiss() {
        r rVar = this.f2091A;
        rVar.dismiss();
        rVar.setContentView(null);
        this.f2094h = null;
        this.f2108w.removeCallbacks(this.f2104s);
    }

    @Override // g.r
    public final ListView e() {
        return this.f2094h;
    }

    @Override // g.r
    public final void f() {
        int i2;
        L l2;
        L l3 = this.f2094h;
        r rVar = this.f2091A;
        Context context = this.f2092f;
        if (l3 == null) {
            L l4 = new L(context, !this.f2111z);
            l4.setHoverListener((M) this);
            this.f2094h = l4;
            l4.setAdapter(this.f2093g);
            this.f2094h.setOnItemClickListener(this.r);
            this.f2094h.setFocusable(true);
            this.f2094h.setFocusableInTouchMode(true);
            this.f2094h.setOnItemSelectedListener(new C0155F(r0, this));
            this.f2094h.setOnScrollListener(this.f2106u);
            rVar.setContentView(this.f2094h);
        }
        Drawable background = rVar.getBackground();
        Rect rect = this.f2109x;
        if (background != null) {
            background.getPadding(rect);
            int i3 = rect.top;
            i2 = rect.bottom + i3;
            if (!this.f2098l) {
                this.f2097k = -i3;
            }
        } else {
            rect.setEmpty();
            i2 = 0;
        }
        int maxAvailableHeight = rVar.getMaxAvailableHeight(this.f2103q, this.f2097k, rVar.getInputMethodMode() == 2);
        int i4 = this.f2095i;
        int a2 = this.f2094h.a(i4 != -2 ? i4 != -1 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), maxAvailableHeight);
        int paddingBottom = a2 + (a2 > 0 ? this.f2094h.getPaddingBottom() + this.f2094h.getPaddingTop() + i2 : 0);
        this.f2091A.getInputMethodMode();
        A.n.d(rVar, 1002);
        if (rVar.isShowing()) {
            View view = this.f2103q;
            Field field = w.x.f3069a;
            if (view.isAttachedToWindow()) {
                int i5 = this.f2095i;
                if (i5 == -1) {
                    i5 = -1;
                } else if (i5 == -2) {
                    i5 = this.f2103q.getWidth();
                }
                rVar.setOutsideTouchable(true);
                rVar.update(this.f2103q, this.f2096j, this.f2097k, i5 < 0 ? -1 : i5, paddingBottom < 0 ? -1 : paddingBottom);
                return;
            }
            return;
        }
        int i6 = this.f2095i;
        if (i6 == -1) {
            i6 = -1;
        } else if (i6 == -2) {
            i6 = this.f2103q.getWidth();
        }
        rVar.setWidth(i6);
        rVar.setHeight(paddingBottom);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f2089B;
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
        rVar.setTouchInterceptor(this.f2105t);
        if (this.f2100n) {
            A.n.c(rVar, this.f2099m);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f2090C;
            if (method2 != null) {
                try {
                    method2.invoke(rVar, this.f2110y);
                } catch (Exception e2) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
        } else {
            rVar.setEpicenterBounds(this.f2110y);
        }
        rVar.showAsDropDown(this.f2103q, this.f2096j, this.f2097k, this.f2101o);
        this.f2094h.setSelection(-1);
        if ((!this.f2111z || this.f2094h.isInTouchMode()) && (l2 = this.f2094h) != null) {
            l2.setListSelectionHidden(true);
            l2.requestLayout();
        }
        if (this.f2111z) {
            return;
        }
        this.f2108w.post(this.f2107v);
    }
}
