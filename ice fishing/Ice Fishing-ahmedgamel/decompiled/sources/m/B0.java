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
import com.facebook.ads.AdError;
import g.AbstractC4528a;
import java.lang.reflect.Method;
import l.InterfaceC4652C;

/* loaded from: classes.dex */
public class B0 implements InterfaceC4652C {

    /* renamed from: T, reason: collision with root package name */
    public static final Method f39034T;

    /* renamed from: U, reason: collision with root package name */
    public static final Method f39035U;

    /* renamed from: B, reason: collision with root package name */
    public boolean f39037B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f39038C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f39039D;

    /* renamed from: G, reason: collision with root package name */
    public G0.h f39042G;

    /* renamed from: H, reason: collision with root package name */
    public View f39043H;

    /* renamed from: I, reason: collision with root package name */
    public AdapterView.OnItemClickListener f39044I;
    public AdapterView.OnItemSelectedListener J;

    /* renamed from: O, reason: collision with root package name */
    public final Handler f39049O;

    /* renamed from: Q, reason: collision with root package name */
    public Rect f39051Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f39052R;

    /* renamed from: S, reason: collision with root package name */
    public final C4737z f39053S;

    /* renamed from: n, reason: collision with root package name */
    public final Context f39054n;

    /* renamed from: u, reason: collision with root package name */
    public ListAdapter f39055u;

    /* renamed from: v, reason: collision with root package name */
    public C4719p0 f39056v;

    /* renamed from: y, reason: collision with root package name */
    public int f39059y;

    /* renamed from: z, reason: collision with root package name */
    public int f39060z;

    /* renamed from: w, reason: collision with root package name */
    public final int f39057w = -2;

    /* renamed from: x, reason: collision with root package name */
    public int f39058x = -2;

    /* renamed from: A, reason: collision with root package name */
    public final int f39036A = AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE;

    /* renamed from: E, reason: collision with root package name */
    public int f39040E = 0;

    /* renamed from: F, reason: collision with root package name */
    public final int f39041F = Integer.MAX_VALUE;

    /* renamed from: K, reason: collision with root package name */
    public final RunnableC4736y0 f39045K = new RunnableC4736y0(this, 1);

    /* renamed from: L, reason: collision with root package name */
    public final A0 f39046L = new A0(this);

    /* renamed from: M, reason: collision with root package name */
    public final C4738z0 f39047M = new C4738z0(this);

    /* renamed from: N, reason: collision with root package name */
    public final RunnableC4736y0 f39048N = new RunnableC4736y0(this, 0);

    /* renamed from: P, reason: collision with root package name */
    public final Rect f39050P = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f39034T = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f39035U = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public B0(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        this.f39054n = context;
        this.f39049O = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4528a.f37564p, i, 0);
        this.f39059y = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f39060z = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f39037B = true;
        }
        obtainStyledAttributes.recycle();
        C4737z c4737z = new C4737z(context, attributeSet, i, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC4528a.f37568t, i, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            U.l.c(c4737z, obtainStyledAttributes2.getBoolean(2, false));
        }
        c4737z.setBackgroundDrawable((!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) ? obtainStyledAttributes2.getDrawable(0) : com.bumptech.glide.g.h(context, resourceId));
        obtainStyledAttributes2.recycle();
        this.f39053S = c4737z;
        c4737z.setInputMethodMode(1);
    }

    @Override // l.InterfaceC4652C
    public final boolean a() {
        return this.f39053S.isShowing();
    }

    public final int b() {
        return this.f39059y;
    }

    public final void d(int i) {
        this.f39059y = i;
    }

    @Override // l.InterfaceC4652C
    public final void dismiss() {
        C4737z c4737z = this.f39053S;
        c4737z.dismiss();
        c4737z.setContentView(null);
        this.f39056v = null;
        this.f39049O.removeCallbacks(this.f39045K);
    }

    @Override // l.InterfaceC4652C
    public final C4719p0 f() {
        return this.f39056v;
    }

    public final Drawable getBackground() {
        return this.f39053S.getBackground();
    }

    public final void h(int i) {
        this.f39060z = i;
        this.f39037B = true;
    }

    public final int k() {
        if (this.f39037B) {
            return this.f39060z;
        }
        return 0;
    }

    public void l(ListAdapter listAdapter) {
        G0.h hVar = this.f39042G;
        if (hVar == null) {
            this.f39042G = new G0.h(1, this);
        } else {
            ListAdapter listAdapter2 = this.f39055u;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(hVar);
            }
        }
        this.f39055u = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f39042G);
        }
        C4719p0 c4719p0 = this.f39056v;
        if (c4719p0 != null) {
            c4719p0.setAdapter(this.f39055u);
        }
    }

    public C4719p0 m(Context context, boolean z6) {
        return new C4719p0(context, z6);
    }

    public final void n(int i) {
        Drawable background = this.f39053S.getBackground();
        if (background == null) {
            this.f39058x = i;
            return;
        }
        Rect rect = this.f39050P;
        background.getPadding(rect);
        this.f39058x = rect.left + rect.right + i;
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        this.f39053S.setBackgroundDrawable(drawable);
    }

    @Override // l.InterfaceC4652C
    public final void show() {
        int i;
        int paddingBottom;
        C4719p0 c4719p0;
        C4719p0 c4719p02 = this.f39056v;
        C4737z c4737z = this.f39053S;
        Context context = this.f39054n;
        if (c4719p02 == null) {
            C4719p0 m9 = m(context, !this.f39052R);
            this.f39056v = m9;
            m9.setAdapter(this.f39055u);
            this.f39056v.setOnItemClickListener(this.f39044I);
            this.f39056v.setFocusable(true);
            this.f39056v.setFocusableInTouchMode(true);
            this.f39056v.setOnItemSelectedListener(new C4730v0(this));
            this.f39056v.setOnScrollListener(this.f39047M);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.J;
            if (onItemSelectedListener != null) {
                this.f39056v.setOnItemSelectedListener(onItemSelectedListener);
            }
            c4737z.setContentView(this.f39056v);
        }
        Drawable background = c4737z.getBackground();
        Rect rect = this.f39050P;
        if (background != null) {
            background.getPadding(rect);
            int i4 = rect.top;
            i = rect.bottom + i4;
            if (!this.f39037B) {
                this.f39060z = -i4;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int a9 = AbstractC4732w0.a(c4737z, this.f39043H, this.f39060z, c4737z.getInputMethodMode() == 2);
        int i6 = this.f39057w;
        if (i6 == -1) {
            paddingBottom = a9 + i;
        } else {
            int i9 = this.f39058x;
            int a10 = this.f39056v.a(i9 != -2 ? i9 != -1 ? View.MeasureSpec.makeMeasureSpec(i9, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), a9);
            paddingBottom = a10 + (a10 > 0 ? this.f39056v.getPaddingBottom() + this.f39056v.getPaddingTop() + i : 0);
        }
        boolean z6 = this.f39053S.getInputMethodMode() == 2;
        U.l.d(c4737z, this.f39036A);
        if (c4737z.isShowing()) {
            if (this.f39043H.isAttachedToWindow()) {
                int i10 = this.f39058x;
                if (i10 == -1) {
                    i10 = -1;
                } else if (i10 == -2) {
                    i10 = this.f39043H.getWidth();
                }
                if (i6 == -1) {
                    i6 = z6 ? paddingBottom : -1;
                    if (z6) {
                        c4737z.setWidth(this.f39058x == -1 ? -1 : 0);
                        c4737z.setHeight(0);
                    } else {
                        c4737z.setWidth(this.f39058x == -1 ? -1 : 0);
                        c4737z.setHeight(-1);
                    }
                } else if (i6 == -2) {
                    i6 = paddingBottom;
                }
                c4737z.setOutsideTouchable(true);
                View view = this.f39043H;
                int i11 = this.f39059y;
                int i12 = this.f39060z;
                if (i10 < 0) {
                    i10 = -1;
                }
                c4737z.update(view, i11, i12, i10, i6 < 0 ? -1 : i6);
                return;
            }
            return;
        }
        int i13 = this.f39058x;
        if (i13 == -1) {
            i13 = -1;
        } else if (i13 == -2) {
            i13 = this.f39043H.getWidth();
        }
        if (i6 == -1) {
            i6 = -1;
        } else if (i6 == -2) {
            i6 = paddingBottom;
        }
        c4737z.setWidth(i13);
        c4737z.setHeight(i6);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f39034T;
            if (method != null) {
                try {
                    method.invoke(c4737z, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            AbstractC4734x0.b(c4737z, true);
        }
        c4737z.setOutsideTouchable(true);
        c4737z.setTouchInterceptor(this.f39046L);
        if (this.f39039D) {
            U.l.c(c4737z, this.f39038C);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f39035U;
            if (method2 != null) {
                try {
                    method2.invoke(c4737z, this.f39051Q);
                } catch (Exception e9) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e9);
                }
            }
        } else {
            AbstractC4734x0.a(c4737z, this.f39051Q);
        }
        c4737z.showAsDropDown(this.f39043H, this.f39059y, this.f39060z, this.f39040E);
        this.f39056v.setSelection(-1);
        if ((!this.f39052R || this.f39056v.isInTouchMode()) && (c4719p0 = this.f39056v) != null) {
            c4719p0.setListSelectionHidden(true);
            c4719p0.requestLayout();
        }
        if (this.f39052R) {
            return;
        }
        this.f39049O.post(this.f39048N);
    }
}
