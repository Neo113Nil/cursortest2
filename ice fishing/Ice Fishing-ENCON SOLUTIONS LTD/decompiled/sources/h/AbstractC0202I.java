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
import c.AbstractC0131a;
import d.AbstractC0142a;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: h.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0202I implements g.r {

    /* renamed from: w, reason: collision with root package name */
    public static final Method f3156w;

    /* renamed from: x, reason: collision with root package name */
    public static final Method f3157x;

    /* renamed from: a, reason: collision with root package name */
    public final Context f3158a;

    /* renamed from: b, reason: collision with root package name */
    public ListAdapter f3159b;

    /* renamed from: c, reason: collision with root package name */
    public C0204K f3160c;

    /* renamed from: e, reason: collision with root package name */
    public int f3162e;

    /* renamed from: f, reason: collision with root package name */
    public int f3163f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3164g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3165h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3166i;

    /* renamed from: k, reason: collision with root package name */
    public D.b f3168k;

    /* renamed from: l, reason: collision with root package name */
    public View f3169l;

    /* renamed from: m, reason: collision with root package name */
    public g.l f3170m;

    /* renamed from: r, reason: collision with root package name */
    public final Handler f3175r;
    public Rect t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f3177u;

    /* renamed from: v, reason: collision with root package name */
    public final r f3178v;

    /* renamed from: d, reason: collision with root package name */
    public int f3161d = -2;

    /* renamed from: j, reason: collision with root package name */
    public int f3167j = 0;

    /* renamed from: n, reason: collision with root package name */
    public final RunnableC0199F f3171n = new RunnableC0199F(this, 1);

    /* renamed from: o, reason: collision with root package name */
    public final ViewOnTouchListenerC0201H f3172o = new ViewOnTouchListenerC0201H(this);

    /* renamed from: p, reason: collision with root package name */
    public final C0200G f3173p = new C0200G(this);

    /* renamed from: q, reason: collision with root package name */
    public final RunnableC0199F f3174q = new RunnableC0199F(this, 0);

    /* renamed from: s, reason: collision with root package name */
    public final Rect f3176s = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f3156w = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f3157x = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public AbstractC0202I(Context context, int i2) {
        int resourceId;
        this.f3158a = context;
        this.f3175r = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC0131a.f2628k, i2, 0);
        this.f3162e = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f3163f = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f3164g = true;
        }
        obtainStyledAttributes.recycle();
        r rVar = new r(context, null, i2, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(null, AbstractC0131a.f2632o, i2, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            C.n.c(rVar, obtainStyledAttributes2.getBoolean(2, false));
        }
        rVar.setBackgroundDrawable((!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) ? obtainStyledAttributes2.getDrawable(0) : AbstractC0142a.a(context, resourceId));
        obtainStyledAttributes2.recycle();
        this.f3178v = rVar;
        rVar.setInputMethodMode(1);
    }

    public final void a(ListAdapter listAdapter) {
        D.b bVar = this.f3168k;
        if (bVar == null) {
            this.f3168k = new D.b(1, this);
        } else {
            ListAdapter listAdapter2 = this.f3159b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(bVar);
            }
        }
        this.f3159b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f3168k);
        }
        C0204K c0204k = this.f3160c;
        if (c0204k != null) {
            c0204k.setAdapter(this.f3159b);
        }
    }

    @Override // g.r
    public final void c() {
        int i2;
        C0204K c0204k;
        C0204K c0204k2 = this.f3160c;
        r rVar = this.f3178v;
        Context context = this.f3158a;
        if (c0204k2 == null) {
            C0204K c0204k3 = new C0204K(context, !this.f3177u);
            c0204k3.setHoverListener((L) this);
            this.f3160c = c0204k3;
            c0204k3.setAdapter(this.f3159b);
            this.f3160c.setOnItemClickListener(this.f3170m);
            this.f3160c.setFocusable(true);
            this.f3160c.setFocusableInTouchMode(true);
            this.f3160c.setOnItemSelectedListener(new C0198E(r0, this));
            this.f3160c.setOnScrollListener(this.f3173p);
            rVar.setContentView(this.f3160c);
        }
        Drawable background = rVar.getBackground();
        Rect rect = this.f3176s;
        if (background != null) {
            background.getPadding(rect);
            int i3 = rect.top;
            i2 = rect.bottom + i3;
            if (!this.f3164g) {
                this.f3163f = -i3;
            }
        } else {
            rect.setEmpty();
            i2 = 0;
        }
        int maxAvailableHeight = rVar.getMaxAvailableHeight(this.f3169l, this.f3163f, rVar.getInputMethodMode() == 2);
        int i4 = this.f3161d;
        int a2 = this.f3160c.a(i4 != -2 ? i4 != -1 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), maxAvailableHeight);
        int paddingBottom = a2 + (a2 > 0 ? this.f3160c.getPaddingBottom() + this.f3160c.getPaddingTop() + i2 : 0);
        this.f3178v.getInputMethodMode();
        C.n.d(rVar, 1002);
        if (rVar.isShowing()) {
            View view = this.f3169l;
            Field field = y.x.f8596a;
            if (view.isAttachedToWindow()) {
                int i5 = this.f3161d;
                if (i5 == -1) {
                    i5 = -1;
                } else if (i5 == -2) {
                    i5 = this.f3169l.getWidth();
                }
                rVar.setOutsideTouchable(true);
                rVar.update(this.f3169l, this.f3162e, this.f3163f, i5 < 0 ? -1 : i5, paddingBottom < 0 ? -1 : paddingBottom);
                return;
            }
            return;
        }
        int i6 = this.f3161d;
        if (i6 == -1) {
            i6 = -1;
        } else if (i6 == -2) {
            i6 = this.f3169l.getWidth();
        }
        rVar.setWidth(i6);
        rVar.setHeight(paddingBottom);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f3156w;
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
        rVar.setTouchInterceptor(this.f3172o);
        if (this.f3166i) {
            C.n.c(rVar, this.f3165h);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f3157x;
            if (method2 != null) {
                try {
                    method2.invoke(rVar, this.t);
                } catch (Exception e2) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
        } else {
            rVar.setEpicenterBounds(this.t);
        }
        rVar.showAsDropDown(this.f3169l, this.f3162e, this.f3163f, this.f3167j);
        this.f3160c.setSelection(-1);
        if ((!this.f3177u || this.f3160c.isInTouchMode()) && (c0204k = this.f3160c) != null) {
            c0204k.setListSelectionHidden(true);
            c0204k.requestLayout();
        }
        if (this.f3177u) {
            return;
        }
        this.f3175r.post(this.f3174q);
    }

    @Override // g.r
    public final void dismiss() {
        r rVar = this.f3178v;
        rVar.dismiss();
        rVar.setContentView(null);
        this.f3160c = null;
        this.f3175r.removeCallbacks(this.f3171n);
    }

    @Override // g.r
    public final boolean i() {
        return this.f3178v.isShowing();
    }

    @Override // g.r
    public final ListView j() {
        return this.f3160c;
    }
}
