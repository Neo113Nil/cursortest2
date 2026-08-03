package m;

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
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class o0 implements l.p {
    public static final Method C;
    public static final Method D;
    public boolean A;
    public final r B;

    /* renamed from: g, reason: collision with root package name */
    public final Context f4400g;

    /* renamed from: h, reason: collision with root package name */
    public ListAdapter f4401h;

    /* renamed from: i, reason: collision with root package name */
    public q0 f4402i;

    /* renamed from: k, reason: collision with root package name */
    public int f4404k;

    /* renamed from: l, reason: collision with root package name */
    public int f4405l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4406m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4407n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f4408o;

    /* renamed from: q, reason: collision with root package name */
    public l0 f4410q;

    /* renamed from: r, reason: collision with root package name */
    public View f4411r;

    /* renamed from: s, reason: collision with root package name */
    public l.j f4412s;

    /* renamed from: x, reason: collision with root package name */
    public final Handler f4417x;

    /* renamed from: z, reason: collision with root package name */
    public Rect f4419z;

    /* renamed from: j, reason: collision with root package name */
    public int f4403j = -2;

    /* renamed from: p, reason: collision with root package name */
    public int f4409p = 0;

    /* renamed from: t, reason: collision with root package name */
    public final k0 f4413t = new k0(this, 1);

    /* renamed from: u, reason: collision with root package name */
    public final n0 f4414u = new n0(this);

    /* renamed from: v, reason: collision with root package name */
    public final m0 f4415v = new m0(this);

    /* renamed from: w, reason: collision with root package name */
    public final k0 f4416w = new k0(this, 0);

    /* renamed from: y, reason: collision with root package name */
    public final Rect f4418y = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                C = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                D = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public o0(Context context, int i10) {
        int resourceId;
        this.f4400g = context;
        this.f4417x = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, i.a.f2920k, i10, 0);
        this.f4404k = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f4405l = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f4406m = true;
        }
        obtainStyledAttributes.recycle();
        r rVar = new r(context, null, i10, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(null, i.a.f2924o, i10, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            rVar.setOverlapAnchor(obtainStyledAttributes2.getBoolean(2, false));
        }
        rVar.setBackgroundDrawable((!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) ? obtainStyledAttributes2.getDrawable(0) : j.a.a(context, resourceId));
        obtainStyledAttributes2.recycle();
        this.B = rVar;
        rVar.setInputMethodMode(1);
    }

    public final void a(ListAdapter listAdapter) {
        l0 l0Var = this.f4410q;
        if (l0Var == null) {
            this.f4410q = new l0(0, this);
        } else {
            ListAdapter listAdapter2 = this.f4401h;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(l0Var);
            }
        }
        this.f4401h = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f4410q);
        }
        q0 q0Var = this.f4402i;
        if (q0Var != null) {
            q0Var.setAdapter(this.f4401h);
        }
    }

    @Override // l.p
    public final void b() {
        int i10;
        q0 q0Var;
        q0 q0Var2 = this.f4402i;
        Context context = this.f4400g;
        r rVar = this.B;
        if (q0Var2 == null) {
            q0 q0Var3 = new q0(context, !this.A);
            q0Var3.setHoverListener((r0) this);
            this.f4402i = q0Var3;
            q0Var3.setAdapter(this.f4401h);
            this.f4402i.setOnItemClickListener(this.f4412s);
            this.f4402i.setFocusable(true);
            this.f4402i.setFocusableInTouchMode(true);
            this.f4402i.setOnItemSelectedListener(new j0(0, this));
            this.f4402i.setOnScrollListener(this.f4415v);
            rVar.setContentView(this.f4402i);
        }
        Drawable background = rVar.getBackground();
        Rect rect = this.f4418y;
        if (background != null) {
            background.getPadding(rect);
            int i11 = rect.top;
            i10 = rect.bottom + i11;
            if (!this.f4406m) {
                this.f4405l = -i11;
            }
        } else {
            rect.setEmpty();
            i10 = 0;
        }
        int maxAvailableHeight = rVar.getMaxAvailableHeight(this.f4411r, this.f4405l, rVar.getInputMethodMode() == 2);
        int i12 = this.f4403j;
        int a6 = this.f4402i.a(i12 != -2 ? i12 != -1 ? View.MeasureSpec.makeMeasureSpec(i12, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), maxAvailableHeight);
        int paddingBottom = a6 + (a6 > 0 ? this.f4402i.getPaddingBottom() + this.f4402i.getPaddingTop() + i10 : 0);
        rVar.getInputMethodMode();
        rVar.setWindowLayoutType(1002);
        if (rVar.isShowing()) {
            View view = this.f4411r;
            Field field = h3.w.f2829a;
            if (view.isAttachedToWindow()) {
                int i13 = this.f4403j;
                if (i13 == -1) {
                    i13 = -1;
                } else if (i13 == -2) {
                    i13 = this.f4411r.getWidth();
                }
                rVar.setOutsideTouchable(true);
                rVar.update(this.f4411r, this.f4404k, this.f4405l, i13 < 0 ? -1 : i13, paddingBottom < 0 ? -1 : paddingBottom);
                return;
            }
            return;
        }
        int i14 = this.f4403j;
        if (i14 == -1) {
            i14 = -1;
        } else if (i14 == -2) {
            i14 = this.f4411r.getWidth();
        }
        rVar.setWidth(i14);
        rVar.setHeight(paddingBottom);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = C;
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
        rVar.setTouchInterceptor(this.f4414u);
        if (this.f4408o) {
            rVar.setOverlapAnchor(this.f4407n);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = D;
            if (method2 != null) {
                try {
                    method2.invoke(rVar, this.f4419z);
                } catch (Exception e10) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e10);
                }
            }
        } else {
            rVar.setEpicenterBounds(this.f4419z);
        }
        rVar.showAsDropDown(this.f4411r, this.f4404k, this.f4405l, this.f4409p);
        this.f4402i.setSelection(-1);
        if ((!this.A || this.f4402i.isInTouchMode()) && (q0Var = this.f4402i) != null) {
            q0Var.setListSelectionHidden(true);
            q0Var.requestLayout();
        }
        if (this.A) {
            return;
        }
        this.f4417x.post(this.f4416w);
    }

    @Override // l.p
    public final ListView d() {
        return this.f4402i;
    }

    @Override // l.p
    public final void dismiss() {
        r rVar = this.B;
        rVar.dismiss();
        rVar.setContentView(null);
        this.f4402i = null;
        this.f4417x.removeCallbacks(this.f4413t);
    }

    @Override // l.p
    public final boolean j() {
        return this.B.isShowing();
    }
}
