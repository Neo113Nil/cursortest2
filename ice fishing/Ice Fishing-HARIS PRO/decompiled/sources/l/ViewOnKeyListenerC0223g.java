package l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.lumenpath.harispro.hrnavigator.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import m.C0236B;
import m.C0276r0;
import m.G0;
import m.H0;
import m.J0;

/* renamed from: l.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0223g extends u implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: b, reason: collision with root package name */
    public final Context f3674b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3675c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3676d;
    public final boolean e;

    /* renamed from: f, reason: collision with root package name */
    public final Handler f3677f;

    /* renamed from: n, reason: collision with root package name */
    public View f3683n;

    /* renamed from: o, reason: collision with root package name */
    public View f3684o;

    /* renamed from: p, reason: collision with root package name */
    public int f3685p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3686q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3687r;

    /* renamed from: s, reason: collision with root package name */
    public int f3688s;

    /* renamed from: t, reason: collision with root package name */
    public int f3689t;

    /* renamed from: v, reason: collision with root package name */
    public boolean f3691v;

    /* renamed from: w, reason: collision with root package name */
    public x f3692w;

    /* renamed from: x, reason: collision with root package name */
    public ViewTreeObserver f3693x;

    /* renamed from: y, reason: collision with root package name */
    public v f3694y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f3695z;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f3678g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f3679h = new ArrayList();
    public final ViewTreeObserverOnGlobalLayoutListenerC0220d i = new ViewTreeObserverOnGlobalLayoutListenerC0220d(0, this);
    public final V0.n j = new V0.n(2, this);

    /* renamed from: k, reason: collision with root package name */
    public final B.b f3680k = new B.b(25, this);

    /* renamed from: l, reason: collision with root package name */
    public int f3681l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f3682m = 0;

    /* renamed from: u, reason: collision with root package name */
    public boolean f3690u = false;

    public ViewOnKeyListenerC0223g(Context context, View view, int i, boolean z2) {
        this.f3674b = context;
        this.f3683n = view;
        this.f3676d = i;
        this.e = z2;
        this.f3685p = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f3675c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f3677f = new Handler();
    }

    @Override // l.InterfaceC0214C
    public final boolean a() {
        ArrayList arrayList = this.f3679h;
        return arrayList.size() > 0 && ((C0222f) arrayList.get(0)).f3671a.f3828z.isShowing();
    }

    @Override // l.y
    public final void b(MenuC0229m menuC0229m, boolean z2) {
        ArrayList arrayList = this.f3679h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC0229m == ((C0222f) arrayList.get(i)).f3672b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < arrayList.size()) {
            ((C0222f) arrayList.get(i2)).f3672b.c(false);
        }
        C0222f c0222f = (C0222f) arrayList.remove(i);
        c0222f.f3672b.r(this);
        boolean z3 = this.f3695z;
        J0 j02 = c0222f.f3671a;
        if (z3) {
            G0.b(j02.f3828z, null);
            j02.f3828z.setAnimationStyle(0);
        }
        j02.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f3685p = ((C0222f) arrayList.get(size2 - 1)).f3673c;
        } else {
            this.f3685p = this.f3683n.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z2) {
                ((C0222f) arrayList.get(0)).f3672b.c(false);
                return;
            }
            return;
        }
        dismiss();
        x xVar = this.f3692w;
        if (xVar != null) {
            xVar.b(menuC0229m, true);
        }
        ViewTreeObserver viewTreeObserver = this.f3693x;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f3693x.removeGlobalOnLayoutListener(this.i);
            }
            this.f3693x = null;
        }
        this.f3684o.removeOnAttachStateChangeListener(this.j);
        this.f3694y.onDismiss();
    }

    @Override // l.InterfaceC0214C
    public final void c() {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.f3678g;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            y((MenuC0229m) it.next());
        }
        arrayList.clear();
        View view = this.f3683n;
        this.f3684o = view;
        if (view != null) {
            boolean z2 = this.f3693x == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f3693x = viewTreeObserver;
            if (z2) {
                viewTreeObserver.addOnGlobalLayoutListener(this.i);
            }
            this.f3684o.addOnAttachStateChangeListener(this.j);
        }
    }

    @Override // l.InterfaceC0214C
    public final void dismiss() {
        ArrayList arrayList = this.f3679h;
        int size = arrayList.size();
        if (size > 0) {
            C0222f[] c0222fArr = (C0222f[]) arrayList.toArray(new C0222f[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0222f c0222f = c0222fArr[i];
                if (c0222f.f3671a.f3828z.isShowing()) {
                    c0222f.f3671a.dismiss();
                }
            }
        }
    }

    @Override // l.y
    public final boolean e(SubMenuC0216E subMenuC0216E) {
        Iterator it = this.f3679h.iterator();
        while (it.hasNext()) {
            C0222f c0222f = (C0222f) it.next();
            if (subMenuC0216E == c0222f.f3672b) {
                c0222f.f3671a.f3808c.requestFocus();
                return true;
            }
        }
        if (!subMenuC0216E.hasVisibleItems()) {
            return false;
        }
        o(subMenuC0216E);
        x xVar = this.f3692w;
        if (xVar != null) {
            xVar.j(subMenuC0216E);
        }
        return true;
    }

    @Override // l.InterfaceC0214C
    public final C0276r0 g() {
        ArrayList arrayList = this.f3679h;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C0222f) arrayList.get(arrayList.size() - 1)).f3671a.f3808c;
    }

    @Override // l.y
    public final void h(x xVar) {
        this.f3692w = xVar;
    }

    @Override // l.y
    public final boolean j() {
        return false;
    }

    @Override // l.y
    public final Parcelable l() {
        return null;
    }

    @Override // l.y
    public final void m(boolean z2) {
        Iterator it = this.f3679h.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C0222f) it.next()).f3671a.f3808c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C0226j) adapter).notifyDataSetChanged();
        }
    }

    @Override // l.y
    public final void n(Parcelable parcelable) {
    }

    @Override // l.u
    public final void o(MenuC0229m menuC0229m) {
        menuC0229m.b(this, this.f3674b);
        if (a()) {
            y(menuC0229m);
        } else {
            this.f3678g.add(menuC0229m);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C0222f c0222f;
        ArrayList arrayList = this.f3679h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c0222f = null;
                break;
            }
            c0222f = (C0222f) arrayList.get(i);
            if (!c0222f.f3671a.f3828z.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (c0222f != null) {
            c0222f.f3672b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // l.u
    public final void q(View view) {
        if (this.f3683n != view) {
            this.f3683n = view;
            this.f3682m = Gravity.getAbsoluteGravity(this.f3681l, view.getLayoutDirection());
        }
    }

    @Override // l.u
    public final void r(boolean z2) {
        this.f3690u = z2;
    }

    @Override // l.u
    public final void s(int i) {
        if (this.f3681l != i) {
            this.f3681l = i;
            this.f3682m = Gravity.getAbsoluteGravity(i, this.f3683n.getLayoutDirection());
        }
    }

    @Override // l.u
    public final void t(int i) {
        this.f3686q = true;
        this.f3688s = i;
    }

    @Override // l.u
    public final void u(PopupWindow.OnDismissListener onDismissListener) {
        this.f3694y = (v) onDismissListener;
    }

    @Override // l.u
    public final void v(boolean z2) {
        this.f3691v = z2;
    }

    @Override // l.u
    public final void w(int i) {
        this.f3687r = true;
        this.f3689t = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x013f, code lost:
    
        if (((r8.getWidth() + r9[0]) + r5) > r11.right) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0141, code lost:
    
        r9 = 0;
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0144, code lost:
    
        r8 = 1;
        r9 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x014a, code lost:
    
        if ((r9[0] - r5) < 0) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(MenuC0229m menuC0229m) {
        C0222f c0222f;
        View view;
        int i;
        int i2;
        MenuItem menuItem;
        C0226j c0226j;
        int i3;
        int firstVisiblePosition;
        Context context = this.f3674b;
        LayoutInflater from = LayoutInflater.from(context);
        C0226j c0226j2 = new C0226j(menuC0229m, from, this.e, R.layout.abc_cascading_menu_item_layout);
        if (!a() && this.f3690u) {
            c0226j2.f3705c = true;
        } else if (a()) {
            c0226j2.f3705c = u.x(menuC0229m);
        }
        int p2 = u.p(c0226j2, context, this.f3675c);
        J0 j02 = new J0(context, null, this.f3676d);
        j02.f3839C = this.f3680k;
        j02.f3818p = this;
        j02.f3828z.setOnDismissListener(this);
        j02.f3817o = this.f3683n;
        j02.f3814l = this.f3682m;
        j02.f3827y = true;
        j02.f3828z.setFocusable(true);
        j02.f3828z.setInputMethodMode(2);
        j02.o(c0226j2);
        j02.r(p2);
        j02.f3814l = this.f3682m;
        ArrayList arrayList = this.f3679h;
        if (arrayList.size() > 0) {
            c0222f = (C0222f) arrayList.get(arrayList.size() - 1);
            MenuC0229m menuC0229m2 = c0222f.f3672b;
            int size = menuC0229m2.f3713f.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    menuItem = null;
                    break;
                }
                menuItem = menuC0229m2.getItem(i4);
                if (menuItem.hasSubMenu() && menuC0229m == menuItem.getSubMenu()) {
                    break;
                } else {
                    i4++;
                }
            }
            if (menuItem == null) {
                view = null;
            } else {
                C0276r0 c0276r0 = c0222f.f3671a.f3808c;
                ListAdapter adapter = c0276r0.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i3 = headerViewListAdapter.getHeadersCount();
                    c0226j = (C0226j) headerViewListAdapter.getWrappedAdapter();
                } else {
                    c0226j = (C0226j) adapter;
                    i3 = 0;
                }
                int count = c0226j.getCount();
                int i5 = 0;
                while (true) {
                    if (i5 >= count) {
                        i5 = -1;
                        break;
                    } else if (menuItem == c0226j.getItem(i5)) {
                        break;
                    } else {
                        i5++;
                    }
                }
                if (i5 != -1 && (firstVisiblePosition = (i5 + i3) - c0276r0.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < c0276r0.getChildCount()) {
                    view = c0276r0.getChildAt(firstVisiblePosition);
                }
            }
            if (view == null) {
                int i6 = Build.VERSION.SDK_INT;
                C0236B c0236b = j02.f3828z;
                if (i6 <= 28) {
                    Method method = J0.f3838D;
                    if (method != null) {
                        try {
                            method.invoke(c0236b, Boolean.FALSE);
                        } catch (Exception unused) {
                            Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                        }
                    }
                } else {
                    H0.a(c0236b, false);
                }
                G0.a(j02.f3828z, null);
                C0276r0 c0276r02 = ((C0222f) arrayList.get(arrayList.size() - 1)).f3671a.f3808c;
                int[] iArr = new int[2];
                c0276r02.getLocationOnScreen(iArr);
                Rect rect = new Rect();
                this.f3684o.getWindowVisibleDisplayFrame(rect);
                if (this.f3685p == 1) {
                }
                boolean z2 = i2 == i;
                this.f3685p = i2;
                j02.f3817o = view;
                if ((this.f3682m & 5) != 5) {
                    p2 = z2 ? view.getWidth() : 0 - p2;
                } else if (!z2) {
                    p2 = 0 - view.getWidth();
                }
                j02.f3810f = p2;
                j02.f3813k = true;
                j02.j = true;
                j02.m(0);
            } else {
                if (this.f3686q) {
                    j02.f3810f = this.f3688s;
                }
                if (this.f3687r) {
                    j02.m(this.f3689t);
                }
                Rect rect2 = this.f3769a;
                j02.f3826x = rect2 != null ? new Rect(rect2) : null;
            }
            arrayList.add(new C0222f(j02, menuC0229m, this.f3685p));
            j02.c();
            C0276r0 c0276r03 = j02.f3808c;
            c0276r03.setOnKeyListener(this);
            if (c0222f == null || !this.f3691v || menuC0229m.f3718m == null) {
                return;
            }
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0276r03, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(menuC0229m.f3718m);
            c0276r03.addHeaderView(frameLayout, null, false);
            j02.c();
            return;
        }
        c0222f = null;
        view = null;
        if (view == null) {
        }
        arrayList.add(new C0222f(j02, menuC0229m, this.f3685p));
        j02.c();
        C0276r0 c0276r032 = j02.f3808c;
        c0276r032.setOnKeyListener(this);
        if (c0222f == null) {
        }
    }
}
