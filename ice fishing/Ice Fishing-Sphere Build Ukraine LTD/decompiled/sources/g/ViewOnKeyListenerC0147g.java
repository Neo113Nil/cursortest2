package g;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
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
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.icecatchbiger.hookfrostmaster.R;
import h.L;
import h.M;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import w.x;

/* renamed from: g.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0147g extends l implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: A, reason: collision with root package name */
    public o f1941A;

    /* renamed from: B, reason: collision with root package name */
    public ViewTreeObserver f1942B;

    /* renamed from: C, reason: collision with root package name */
    public m f1943C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f1944D;

    /* renamed from: f, reason: collision with root package name */
    public final Context f1945f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1946g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1947h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f1948i;

    /* renamed from: j, reason: collision with root package name */
    public final Handler f1949j;

    /* renamed from: m, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC0143c f1952m;

    /* renamed from: n, reason: collision with root package name */
    public final ViewOnAttachStateChangeListenerC0144d f1953n;
    public View r;

    /* renamed from: s, reason: collision with root package name */
    public View f1957s;

    /* renamed from: t, reason: collision with root package name */
    public int f1958t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1959u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1960v;

    /* renamed from: w, reason: collision with root package name */
    public int f1961w;

    /* renamed from: x, reason: collision with root package name */
    public int f1962x;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1964z;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f1950k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f1951l = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final A.j f1954o = new A.j(19, this);

    /* renamed from: p, reason: collision with root package name */
    public int f1955p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f1956q = 0;

    /* renamed from: y, reason: collision with root package name */
    public boolean f1963y = false;

    public ViewOnKeyListenerC0147g(Context context, View view, int i2, boolean z2) {
        this.f1952m = new ViewTreeObserverOnGlobalLayoutListenerC0143c(this, r0);
        this.f1953n = new ViewOnAttachStateChangeListenerC0144d(this, r0);
        this.f1945f = context;
        this.r = view;
        this.f1947h = i2;
        this.f1948i = z2;
        Field field = x.f3074a;
        this.f1958t = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f1946g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f1949j = new Handler();
    }

    @Override // g.p
    public final void a(j jVar, boolean z2) {
        ArrayList arrayList = this.f1951l;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (jVar == ((C0146f) arrayList.get(i2)).f1939b) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0) {
            return;
        }
        int i3 = i2 + 1;
        if (i3 < arrayList.size()) {
            ((C0146f) arrayList.get(i3)).f1939b.c(false);
        }
        C0146f c0146f = (C0146f) arrayList.remove(i2);
        CopyOnWriteArrayList copyOnWriteArrayList = c0146f.f1939b.r;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            p pVar = (p) weakReference.get();
            if (pVar == null || pVar == this) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        boolean z3 = this.f1944D;
        M m2 = c0146f.f1938a;
        if (z3) {
            m2.f2120z.setExitTransition(null);
            m2.f2120z.setAnimationStyle(0);
        }
        m2.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f1958t = ((C0146f) arrayList.get(size2 - 1)).f1940c;
        } else {
            View view = this.r;
            Field field = x.f3074a;
            this.f1958t = view.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z2) {
                ((C0146f) arrayList.get(0)).f1939b.c(false);
                return;
            }
            return;
        }
        dismiss();
        o oVar = this.f1941A;
        if (oVar != null) {
            oVar.a(jVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f1942B;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f1942B.removeGlobalOnLayoutListener(this.f1952m);
            }
            this.f1942B = null;
        }
        this.f1957s.removeOnAttachStateChangeListener(this.f1953n);
        this.f1943C.onDismiss();
    }

    @Override // g.p
    public final void b() {
        Iterator it = this.f1951l.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C0146f) it.next()).f1938a.f2102g.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C0148h) adapter).notifyDataSetChanged();
        }
    }

    @Override // g.r
    public final boolean c() {
        ArrayList arrayList = this.f1951l;
        return arrayList.size() > 0 && ((C0146f) arrayList.get(0)).f1938a.f2120z.isShowing();
    }

    @Override // g.p
    public final boolean d(t tVar) {
        Iterator it = this.f1951l.iterator();
        while (it.hasNext()) {
            C0146f c0146f = (C0146f) it.next();
            if (tVar == c0146f.f1939b) {
                c0146f.f1938a.f2102g.requestFocus();
                return true;
            }
        }
        if (!tVar.hasVisibleItems()) {
            return false;
        }
        l(tVar);
        o oVar = this.f1941A;
        if (oVar != null) {
            oVar.n(tVar);
        }
        return true;
    }

    @Override // g.r
    public final void dismiss() {
        ArrayList arrayList = this.f1951l;
        int size = arrayList.size();
        if (size > 0) {
            C0146f[] c0146fArr = (C0146f[]) arrayList.toArray(new C0146f[size]);
            for (int i2 = size - 1; i2 >= 0; i2--) {
                C0146f c0146f = c0146fArr[i2];
                if (c0146f.f1938a.f2120z.isShowing()) {
                    c0146f.f1938a.dismiss();
                }
            }
        }
    }

    @Override // g.r
    public final ListView e() {
        ArrayList arrayList = this.f1951l;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C0146f) arrayList.get(arrayList.size() - 1)).f1938a.f2102g;
    }

    @Override // g.r
    public final void f() {
        if (c()) {
            return;
        }
        ArrayList arrayList = this.f1950k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            v((j) it.next());
        }
        arrayList.clear();
        View view = this.r;
        this.f1957s = view;
        if (view != null) {
            boolean z2 = this.f1942B == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f1942B = viewTreeObserver;
            if (z2) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f1952m);
            }
            this.f1957s.addOnAttachStateChangeListener(this.f1953n);
        }
    }

    @Override // g.p
    public final void g(o oVar) {
        this.f1941A = oVar;
    }

    @Override // g.p
    public final boolean h() {
        return false;
    }

    @Override // g.l
    public final void l(j jVar) {
        jVar.b(this, this.f1945f);
        if (c()) {
            v(jVar);
        } else {
            this.f1950k.add(jVar);
        }
    }

    @Override // g.l
    public final void n(View view) {
        if (this.r != view) {
            this.r = view;
            int i2 = this.f1955p;
            Field field = x.f3074a;
            this.f1956q = Gravity.getAbsoluteGravity(i2, view.getLayoutDirection());
        }
    }

    @Override // g.l
    public final void o(boolean z2) {
        this.f1963y = z2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C0146f c0146f;
        ArrayList arrayList = this.f1951l;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                c0146f = null;
                break;
            }
            c0146f = (C0146f) arrayList.get(i2);
            if (!c0146f.f1938a.f2120z.isShowing()) {
                break;
            } else {
                i2++;
            }
        }
        if (c0146f != null) {
            c0146f.f1939b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // g.l
    public final void p(int i2) {
        if (this.f1955p != i2) {
            this.f1955p = i2;
            View view = this.r;
            Field field = x.f3074a;
            this.f1956q = Gravity.getAbsoluteGravity(i2, view.getLayoutDirection());
        }
    }

    @Override // g.l
    public final void q(int i2) {
        this.f1959u = true;
        this.f1961w = i2;
    }

    @Override // g.l
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f1943C = (m) onDismissListener;
    }

    @Override // g.l
    public final void s(boolean z2) {
        this.f1964z = z2;
    }

    @Override // g.l
    public final void t(int i2) {
        this.f1960v = true;
        this.f1962x = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(j jVar) {
        C0146f c0146f;
        View view;
        int i2;
        char c2;
        int i3;
        int i4;
        int width;
        MenuItem menuItem;
        C0148h c0148h;
        int i5;
        int firstVisiblePosition;
        Context context = this.f1945f;
        LayoutInflater from = LayoutInflater.from(context);
        C0148h c0148h2 = new C0148h(jVar, from, this.f1948i, R.layout.abc_cascading_menu_item_layout);
        if (!c() && this.f1963y) {
            c0148h2.f1967g = true;
        } else if (c()) {
            c0148h2.f1967g = l.u(jVar);
        }
        int m2 = l.m(c0148h2, context, this.f1946g);
        M m3 = new M(context, this.f1947h);
        m3.f2125C = this.f1954o;
        m3.f2112q = this;
        m3.f2120z.setOnDismissListener(this);
        m3.f2111p = this.r;
        m3.f2109n = this.f1956q;
        m3.f2119y = true;
        m3.f2120z.setFocusable(true);
        m3.f2120z.setInputMethodMode(2);
        m3.a(c0148h2);
        Drawable background = m3.f2120z.getBackground();
        if (background != null) {
            Rect rect = m3.f2117w;
            background.getPadding(rect);
            m3.f2103h = rect.left + rect.right + m2;
        } else {
            m3.f2103h = m2;
        }
        m3.f2109n = this.f1956q;
        ArrayList arrayList = this.f1951l;
        if (arrayList.size() > 0) {
            c0146f = (C0146f) arrayList.get(arrayList.size() - 1);
            j jVar2 = c0146f.f1939b;
            int size = jVar2.f1977f.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size) {
                    menuItem = null;
                    break;
                }
                menuItem = jVar2.getItem(i6);
                if (menuItem.hasSubMenu() && jVar == menuItem.getSubMenu()) {
                    break;
                } else {
                    i6++;
                }
            }
            if (menuItem != null) {
                L l2 = c0146f.f1938a.f2102g;
                ListAdapter adapter = l2.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i5 = headerViewListAdapter.getHeadersCount();
                    c0148h = (C0148h) headerViewListAdapter.getWrappedAdapter();
                } else {
                    c0148h = (C0148h) adapter;
                    i5 = 0;
                }
                int count = c0148h.getCount();
                int i7 = 0;
                while (true) {
                    if (i7 >= count) {
                        i7 = -1;
                        break;
                    } else if (menuItem == c0148h.getItem(i7)) {
                        break;
                    } else {
                        i7++;
                    }
                }
                if (i7 != -1 && (firstVisiblePosition = (i7 + i5) - l2.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < l2.getChildCount()) {
                    view = l2.getChildAt(firstVisiblePosition);
                }
            }
            view = null;
        } else {
            c0146f = null;
            view = null;
        }
        if (view != null) {
            int i8 = Build.VERSION.SDK_INT;
            h.r rVar = m3.f2120z;
            if (i8 <= 28) {
                Method method = M.f2124D;
                if (method != null) {
                    try {
                        method.invoke(rVar, Boolean.FALSE);
                    } catch (Exception unused) {
                        Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    }
                }
            } else {
                rVar.setTouchModal(false);
            }
            m3.f2120z.setEnterTransition(null);
            L l3 = ((C0146f) arrayList.get(arrayList.size() - 1)).f1938a.f2102g;
            int[] iArr = new int[2];
            l3.getLocationOnScreen(iArr);
            Rect rect2 = new Rect();
            this.f1957s.getWindowVisibleDisplayFrame(rect2);
            if (this.f1958t == 1) {
                if (l3.getWidth() + iArr[0] + m2 > rect2.right) {
                    i2 = 0;
                    boolean z2 = i2 != 1;
                    this.f1958t = i2;
                    if (Build.VERSION.SDK_INT < 26) {
                        m3.f2111p = view;
                        i4 = 0;
                        i3 = 0;
                    } else {
                        int[] iArr2 = new int[2];
                        this.r.getLocationOnScreen(iArr2);
                        int[] iArr3 = new int[2];
                        view.getLocationOnScreen(iArr3);
                        if ((this.f1956q & 7) == 5) {
                            c2 = 0;
                            iArr2[0] = this.r.getWidth() + iArr2[0];
                            iArr3[0] = view.getWidth() + iArr3[0];
                        } else {
                            c2 = 0;
                        }
                        i3 = iArr3[c2] - iArr2[c2];
                        i4 = iArr3[1] - iArr2[1];
                    }
                    if ((this.f1956q & 5) == 5) {
                        if (z2) {
                            width = i3 + view.getWidth();
                            m3.f2104i = width;
                            m3.f2108m = true;
                            m3.f2107l = true;
                            m3.f2105j = i4;
                            m3.f2106k = true;
                        }
                        width = i3 - m2;
                        m3.f2104i = width;
                        m3.f2108m = true;
                        m3.f2107l = true;
                        m3.f2105j = i4;
                        m3.f2106k = true;
                    } else if (z2) {
                        width = i3 + m2;
                        m3.f2104i = width;
                        m3.f2108m = true;
                        m3.f2107l = true;
                        m3.f2105j = i4;
                        m3.f2106k = true;
                    } else {
                        m2 = view.getWidth();
                        width = i3 - m2;
                        m3.f2104i = width;
                        m3.f2108m = true;
                        m3.f2107l = true;
                        m3.f2105j = i4;
                        m3.f2106k = true;
                    }
                }
                i2 = 1;
                if (i2 != 1) {
                }
                this.f1958t = i2;
                if (Build.VERSION.SDK_INT < 26) {
                }
                if ((this.f1956q & 5) == 5) {
                }
            } else {
                if (iArr[0] - m2 >= 0) {
                    i2 = 0;
                    if (i2 != 1) {
                    }
                    this.f1958t = i2;
                    if (Build.VERSION.SDK_INT < 26) {
                    }
                    if ((this.f1956q & 5) == 5) {
                    }
                }
                i2 = 1;
                if (i2 != 1) {
                }
                this.f1958t = i2;
                if (Build.VERSION.SDK_INT < 26) {
                }
                if ((this.f1956q & 5) == 5) {
                }
            }
        } else {
            if (this.f1959u) {
                m3.f2104i = this.f1961w;
            }
            if (this.f1960v) {
                m3.f2105j = this.f1962x;
                m3.f2106k = true;
            }
            Rect rect3 = this.f2018e;
            m3.f2118x = rect3 != null ? new Rect(rect3) : null;
        }
        arrayList.add(new C0146f(m3, jVar, this.f1958t));
        m3.f();
        L l4 = m3.f2102g;
        l4.setOnKeyListener(this);
        if (c0146f == null && this.f1964z && jVar.f1983l != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) l4, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(jVar.f1983l);
            l4.addHeaderView(frameLayout, null, false);
            m3.f();
        }
    }
}
