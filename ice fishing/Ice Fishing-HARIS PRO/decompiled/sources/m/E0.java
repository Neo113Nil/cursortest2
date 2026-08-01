package m;

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
import g.AbstractC0155a;
import java.lang.reflect.Method;
import l.InterfaceC0214C;

/* loaded from: classes.dex */
public class E0 implements InterfaceC0214C {

    /* renamed from: A, reason: collision with root package name */
    public static final Method f3804A;

    /* renamed from: B, reason: collision with root package name */
    public static final Method f3805B;

    /* renamed from: a, reason: collision with root package name */
    public final Context f3806a;

    /* renamed from: b, reason: collision with root package name */
    public ListAdapter f3807b;

    /* renamed from: c, reason: collision with root package name */
    public C0276r0 f3808c;

    /* renamed from: f, reason: collision with root package name */
    public int f3810f;

    /* renamed from: g, reason: collision with root package name */
    public int f3811g;
    public boolean i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3813k;

    /* renamed from: n, reason: collision with root package name */
    public B0 f3816n;

    /* renamed from: o, reason: collision with root package name */
    public View f3817o;

    /* renamed from: p, reason: collision with root package name */
    public AdapterView.OnItemClickListener f3818p;

    /* renamed from: q, reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f3819q;

    /* renamed from: v, reason: collision with root package name */
    public final Handler f3824v;

    /* renamed from: x, reason: collision with root package name */
    public Rect f3826x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f3827y;

    /* renamed from: z, reason: collision with root package name */
    public final C0236B f3828z;

    /* renamed from: d, reason: collision with root package name */
    public final int f3809d = -2;
    public int e = -2;

    /* renamed from: h, reason: collision with root package name */
    public final int f3812h = 1002;

    /* renamed from: l, reason: collision with root package name */
    public int f3814l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final int f3815m = Integer.MAX_VALUE;

    /* renamed from: r, reason: collision with root package name */
    public final A0 f3820r = new A0(this, 1);

    /* renamed from: s, reason: collision with root package name */
    public final D0 f3821s = new D0(this);

    /* renamed from: t, reason: collision with root package name */
    public final C0 f3822t = new C0(this);

    /* renamed from: u, reason: collision with root package name */
    public final A0 f3823u = new A0(this, 0);

    /* renamed from: w, reason: collision with root package name */
    public final Rect f3825w = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f3804A = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f3805B = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public E0(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        this.f3806a = context;
        this.f3824v = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0155a.f3045o, i, 0);
        this.f3810f = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f3811g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.i = true;
        }
        obtainStyledAttributes.recycle();
        C0236B c0236b = new C0236B(context, attributeSet, i, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0155a.f3049s, i, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            c0236b.setOverlapAnchor(obtainStyledAttributes2.getBoolean(2, false));
        }
        c0236b.setBackgroundDrawable((!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) ? obtainStyledAttributes2.getDrawable(0) : h0.f.n(context, resourceId));
        obtainStyledAttributes2.recycle();
        this.f3828z = c0236b;
        c0236b.setInputMethodMode(1);
    }

    @Override // l.InterfaceC0214C
    public final boolean a() {
        return this.f3828z.isShowing();
    }

    @Override // l.InterfaceC0214C
    public final void c() {
        int i;
        int paddingBottom;
        C0276r0 c0276r0;
        C0276r0 c0276r02 = this.f3808c;
        C0236B c0236b = this.f3828z;
        Context context = this.f3806a;
        if (c0276r02 == null) {
            C0276r0 q2 = q(context, !this.f3827y);
            this.f3808c = q2;
            q2.setAdapter(this.f3807b);
            this.f3808c.setOnItemClickListener(this.f3818p);
            this.f3808c.setFocusable(true);
            this.f3808c.setFocusableInTouchMode(true);
            this.f3808c.setOnItemSelectedListener(new C0288x0(this));
            this.f3808c.setOnScrollListener(this.f3822t);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f3819q;
            if (onItemSelectedListener != null) {
                this.f3808c.setOnItemSelectedListener(onItemSelectedListener);
            }
            c0236b.setContentView(this.f3808c);
        }
        Drawable background = c0236b.getBackground();
        Rect rect = this.f3825w;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.i) {
                this.f3811g = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int a2 = AbstractC0290y0.a(c0236b, this.f3817o, this.f3811g, c0236b.getInputMethodMode() == 2);
        int i3 = this.f3809d;
        if (i3 == -1) {
            paddingBottom = a2 + i;
        } else {
            int i4 = this.e;
            int a3 = this.f3808c.a(i4 != -2 ? i4 != -1 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), a2);
            paddingBottom = a3 + (a3 > 0 ? this.f3808c.getPaddingBottom() + this.f3808c.getPaddingTop() + i : 0);
        }
        boolean z2 = this.f3828z.getInputMethodMode() == 2;
        c0236b.setWindowLayoutType(this.f3812h);
        if (c0236b.isShowing()) {
            if (this.f3817o.isAttachedToWindow()) {
                int i5 = this.e;
                if (i5 == -1) {
                    i5 = -1;
                } else if (i5 == -2) {
                    i5 = this.f3817o.getWidth();
                }
                if (i3 == -1) {
                    i3 = z2 ? paddingBottom : -1;
                    if (z2) {
                        c0236b.setWidth(this.e == -1 ? -1 : 0);
                        c0236b.setHeight(0);
                    } else {
                        c0236b.setWidth(this.e == -1 ? -1 : 0);
                        c0236b.setHeight(-1);
                    }
                } else if (i3 == -2) {
                    i3 = paddingBottom;
                }
                c0236b.setOutsideTouchable(true);
                View view = this.f3817o;
                int i6 = this.f3810f;
                int i7 = this.f3811g;
                if (i5 < 0) {
                    i5 = -1;
                }
                c0236b.update(view, i6, i7, i5, i3 < 0 ? -1 : i3);
                return;
            }
            return;
        }
        int i8 = this.e;
        if (i8 == -1) {
            i8 = -1;
        } else if (i8 == -2) {
            i8 = this.f3817o.getWidth();
        }
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = paddingBottom;
        }
        c0236b.setWidth(i8);
        c0236b.setHeight(i3);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f3804A;
            if (method != null) {
                try {
                    method.invoke(c0236b, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            AbstractC0292z0.b(c0236b, true);
        }
        c0236b.setOutsideTouchable(true);
        c0236b.setTouchInterceptor(this.f3821s);
        if (this.f3813k) {
            c0236b.setOverlapAnchor(this.j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f3805B;
            if (method2 != null) {
                try {
                    method2.invoke(c0236b, this.f3826x);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            AbstractC0292z0.a(c0236b, this.f3826x);
        }
        c0236b.showAsDropDown(this.f3817o, this.f3810f, this.f3811g, this.f3814l);
        this.f3808c.setSelection(-1);
        if ((!this.f3827y || this.f3808c.isInTouchMode()) && (c0276r0 = this.f3808c) != null) {
            c0276r0.setListSelectionHidden(true);
            c0276r0.requestLayout();
        }
        if (this.f3827y) {
            return;
        }
        this.f3824v.post(this.f3823u);
    }

    public final void d(int i) {
        this.f3810f = i;
    }

    @Override // l.InterfaceC0214C
    public final void dismiss() {
        C0236B c0236b = this.f3828z;
        c0236b.dismiss();
        c0236b.setContentView(null);
        this.f3808c = null;
        this.f3824v.removeCallbacks(this.f3820r);
    }

    public final int f() {
        return this.f3810f;
    }

    @Override // l.InterfaceC0214C
    public final C0276r0 g() {
        return this.f3808c;
    }

    public final int k() {
        if (this.i) {
            return this.f3811g;
        }
        return 0;
    }

    public final void l(Drawable drawable) {
        this.f3828z.setBackgroundDrawable(drawable);
    }

    public final void m(int i) {
        this.f3811g = i;
        this.i = true;
    }

    public final Drawable n() {
        return this.f3828z.getBackground();
    }

    public void o(ListAdapter listAdapter) {
        B0 b02 = this.f3816n;
        if (b02 == null) {
            this.f3816n = new B0(this);
        } else {
            ListAdapter listAdapter2 = this.f3807b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(b02);
            }
        }
        this.f3807b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f3816n);
        }
        C0276r0 c0276r0 = this.f3808c;
        if (c0276r0 != null) {
            c0276r0.setAdapter(this.f3807b);
        }
    }

    public C0276r0 q(Context context, boolean z2) {
        return new C0276r0(context, z2);
    }

    public final void r(int i) {
        Drawable background = this.f3828z.getBackground();
        if (background == null) {
            this.e = i;
            return;
        }
        Rect rect = this.f3825w;
        background.getPadding(rect);
        this.e = rect.left + rect.right + i;
    }
}
