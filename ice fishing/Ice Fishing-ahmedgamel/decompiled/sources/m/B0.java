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
import g.AbstractC4518a;
import java.lang.reflect.Method;
import l.InterfaceC4641C;

/* loaded from: classes.dex */
public class B0 implements InterfaceC4641C {

    /* renamed from: T, reason: collision with root package name */
    public static final Method f38966T;

    /* renamed from: U, reason: collision with root package name */
    public static final Method f38967U;

    /* renamed from: B, reason: collision with root package name */
    public boolean f38969B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f38970C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f38971D;

    /* renamed from: G, reason: collision with root package name */
    public G0.i f38974G;

    /* renamed from: H, reason: collision with root package name */
    public View f38975H;

    /* renamed from: I, reason: collision with root package name */
    public AdapterView.OnItemClickListener f38976I;
    public AdapterView.OnItemSelectedListener J;

    /* renamed from: O, reason: collision with root package name */
    public final Handler f38981O;

    /* renamed from: Q, reason: collision with root package name */
    public Rect f38983Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f38984R;

    /* renamed from: S, reason: collision with root package name */
    public final C4724z f38985S;

    /* renamed from: n, reason: collision with root package name */
    public final Context f38986n;

    /* renamed from: u, reason: collision with root package name */
    public ListAdapter f38987u;

    /* renamed from: v, reason: collision with root package name */
    public C4706p0 f38988v;

    /* renamed from: y, reason: collision with root package name */
    public int f38991y;

    /* renamed from: z, reason: collision with root package name */
    public int f38992z;

    /* renamed from: w, reason: collision with root package name */
    public final int f38989w = -2;

    /* renamed from: x, reason: collision with root package name */
    public int f38990x = -2;

    /* renamed from: A, reason: collision with root package name */
    public final int f38968A = AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE;

    /* renamed from: E, reason: collision with root package name */
    public int f38972E = 0;

    /* renamed from: F, reason: collision with root package name */
    public final int f38973F = Integer.MAX_VALUE;

    /* renamed from: K, reason: collision with root package name */
    public final RunnableC4723y0 f38977K = new RunnableC4723y0(this, 1);

    /* renamed from: L, reason: collision with root package name */
    public final A0 f38978L = new A0(this);

    /* renamed from: M, reason: collision with root package name */
    public final C4725z0 f38979M = new C4725z0(this);

    /* renamed from: N, reason: collision with root package name */
    public final RunnableC4723y0 f38980N = new RunnableC4723y0(this, 0);

    /* renamed from: P, reason: collision with root package name */
    public final Rect f38982P = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f38966T = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f38967U = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public B0(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        this.f38986n = context;
        this.f38981O = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4518a.f37602p, i, 0);
        this.f38991y = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f38992z = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f38969B = true;
        }
        obtainStyledAttributes.recycle();
        C4724z c4724z = new C4724z(context, attributeSet, i, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC4518a.f37606t, i, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            U.l.c(c4724z, obtainStyledAttributes2.getBoolean(2, false));
        }
        c4724z.setBackgroundDrawable((!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) ? obtainStyledAttributes2.getDrawable(0) : com.bumptech.glide.g.e(context, resourceId));
        obtainStyledAttributes2.recycle();
        this.f38985S = c4724z;
        c4724z.setInputMethodMode(1);
    }

    @Override // l.InterfaceC4641C
    public final boolean a() {
        return this.f38985S.isShowing();
    }

    public final int b() {
        return this.f38991y;
    }

    public final void d(int i) {
        this.f38991y = i;
    }

    @Override // l.InterfaceC4641C
    public final void dismiss() {
        C4724z c4724z = this.f38985S;
        c4724z.dismiss();
        c4724z.setContentView(null);
        this.f38988v = null;
        this.f38981O.removeCallbacks(this.f38977K);
    }

    @Override // l.InterfaceC4641C
    public final C4706p0 f() {
        return this.f38988v;
    }

    public final Drawable getBackground() {
        return this.f38985S.getBackground();
    }

    public final void h(int i) {
        this.f38992z = i;
        this.f38969B = true;
    }

    public final int k() {
        if (this.f38969B) {
            return this.f38992z;
        }
        return 0;
    }

    public void m(ListAdapter listAdapter) {
        G0.i iVar = this.f38974G;
        if (iVar == null) {
            this.f38974G = new G0.i(1, this);
        } else {
            ListAdapter listAdapter2 = this.f38987u;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(iVar);
            }
        }
        this.f38987u = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f38974G);
        }
        C4706p0 c4706p0 = this.f38988v;
        if (c4706p0 != null) {
            c4706p0.setAdapter(this.f38987u);
        }
    }

    public C4706p0 n(Context context, boolean z3) {
        return new C4706p0(context, z3);
    }

    public final void o(int i) {
        Drawable background = this.f38985S.getBackground();
        if (background == null) {
            this.f38990x = i;
            return;
        }
        Rect rect = this.f38982P;
        background.getPadding(rect);
        this.f38990x = rect.left + rect.right + i;
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        this.f38985S.setBackgroundDrawable(drawable);
    }

    @Override // l.InterfaceC4641C
    public final void show() {
        int i;
        int paddingBottom;
        C4706p0 c4706p0;
        C4706p0 c4706p02 = this.f38988v;
        C4724z c4724z = this.f38985S;
        Context context = this.f38986n;
        if (c4706p02 == null) {
            C4706p0 n9 = n(context, !this.f38984R);
            this.f38988v = n9;
            n9.setAdapter(this.f38987u);
            this.f38988v.setOnItemClickListener(this.f38976I);
            this.f38988v.setFocusable(true);
            this.f38988v.setFocusableInTouchMode(true);
            this.f38988v.setOnItemSelectedListener(new C4717v0(this));
            this.f38988v.setOnScrollListener(this.f38979M);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.J;
            if (onItemSelectedListener != null) {
                this.f38988v.setOnItemSelectedListener(onItemSelectedListener);
            }
            c4724z.setContentView(this.f38988v);
        }
        Drawable background = c4724z.getBackground();
        Rect rect = this.f38982P;
        if (background != null) {
            background.getPadding(rect);
            int i6 = rect.top;
            i = rect.bottom + i6;
            if (!this.f38969B) {
                this.f38992z = -i6;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int a9 = AbstractC4719w0.a(c4724z, this.f38975H, this.f38992z, c4724z.getInputMethodMode() == 2);
        int i9 = this.f38989w;
        if (i9 == -1) {
            paddingBottom = a9 + i;
        } else {
            int i10 = this.f38990x;
            int a10 = this.f38988v.a(i10 != -2 ? i10 != -1 ? View.MeasureSpec.makeMeasureSpec(i10, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), a9);
            paddingBottom = a10 + (a10 > 0 ? this.f38988v.getPaddingBottom() + this.f38988v.getPaddingTop() + i : 0);
        }
        boolean z3 = this.f38985S.getInputMethodMode() == 2;
        U.l.d(c4724z, this.f38968A);
        if (c4724z.isShowing()) {
            if (this.f38975H.isAttachedToWindow()) {
                int i11 = this.f38990x;
                if (i11 == -1) {
                    i11 = -1;
                } else if (i11 == -2) {
                    i11 = this.f38975H.getWidth();
                }
                if (i9 == -1) {
                    i9 = z3 ? paddingBottom : -1;
                    if (z3) {
                        c4724z.setWidth(this.f38990x == -1 ? -1 : 0);
                        c4724z.setHeight(0);
                    } else {
                        c4724z.setWidth(this.f38990x == -1 ? -1 : 0);
                        c4724z.setHeight(-1);
                    }
                } else if (i9 == -2) {
                    i9 = paddingBottom;
                }
                c4724z.setOutsideTouchable(true);
                View view = this.f38975H;
                int i12 = this.f38991y;
                int i13 = this.f38992z;
                if (i11 < 0) {
                    i11 = -1;
                }
                c4724z.update(view, i12, i13, i11, i9 < 0 ? -1 : i9);
                return;
            }
            return;
        }
        int i14 = this.f38990x;
        if (i14 == -1) {
            i14 = -1;
        } else if (i14 == -2) {
            i14 = this.f38975H.getWidth();
        }
        if (i9 == -1) {
            i9 = -1;
        } else if (i9 == -2) {
            i9 = paddingBottom;
        }
        c4724z.setWidth(i14);
        c4724z.setHeight(i9);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f38966T;
            if (method != null) {
                try {
                    method.invoke(c4724z, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            AbstractC4721x0.b(c4724z, true);
        }
        c4724z.setOutsideTouchable(true);
        c4724z.setTouchInterceptor(this.f38978L);
        if (this.f38971D) {
            U.l.c(c4724z, this.f38970C);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f38967U;
            if (method2 != null) {
                try {
                    method2.invoke(c4724z, this.f38983Q);
                } catch (Exception e9) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e9);
                }
            }
        } else {
            AbstractC4721x0.a(c4724z, this.f38983Q);
        }
        c4724z.showAsDropDown(this.f38975H, this.f38991y, this.f38992z, this.f38972E);
        this.f38988v.setSelection(-1);
        if ((!this.f38984R || this.f38988v.isInTouchMode()) && (c4706p0 = this.f38988v) != null) {
            c4706p0.setListSelectionHidden(true);
            c4706p0.requestLayout();
        }
        if (this.f38984R) {
            return;
        }
        this.f38981O.post(this.f38980N);
    }
}
