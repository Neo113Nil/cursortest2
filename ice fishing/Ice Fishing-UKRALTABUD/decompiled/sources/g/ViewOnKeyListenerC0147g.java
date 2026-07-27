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
import com.icedrifter.arcticquest.R;
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
    public boolean f1933A;

    /* renamed from: B, reason: collision with root package name */
    public o f1934B;

    /* renamed from: C, reason: collision with root package name */
    public ViewTreeObserver f1935C;

    /* renamed from: D, reason: collision with root package name */
    public m f1936D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f1937E;

    /* renamed from: g, reason: collision with root package name */
    public final Context f1938g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1939h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1940i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f1941j;

    /* renamed from: k, reason: collision with root package name */
    public final Handler f1942k;

    /* renamed from: n, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC0143c f1945n;

    /* renamed from: o, reason: collision with root package name */
    public final ViewOnAttachStateChangeListenerC0144d f1946o;

    /* renamed from: s, reason: collision with root package name */
    public View f1949s;

    /* renamed from: t, reason: collision with root package name */
    public View f1950t;

    /* renamed from: u, reason: collision with root package name */
    public int f1951u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1952v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f1953w;

    /* renamed from: x, reason: collision with root package name */
    public int f1954x;

    /* renamed from: y, reason: collision with root package name */
    public int f1955y;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f1943l = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f1944m = new ArrayList();

    /* renamed from: p, reason: collision with root package name */
    public final A.j f1947p = new A.j(19, this);

    /* renamed from: q, reason: collision with root package name */
    public int f1948q = 0;
    public int r = 0;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1956z = false;

    public ViewOnKeyListenerC0147g(Context context, View view, int i2, boolean z2) {
        this.f1945n = new ViewTreeObserverOnGlobalLayoutListenerC0143c(this, r0);
        this.f1946o = new ViewOnAttachStateChangeListenerC0144d(this, r0);
        this.f1938g = context;
        this.f1949s = view;
        this.f1940i = i2;
        this.f1941j = z2;
        Field field = x.f3069a;
        this.f1951u = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f1939h = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f1942k = new Handler();
    }

    @Override // g.p
    public final void a(j jVar, boolean z2) {
        ArrayList arrayList = this.f1944m;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (jVar == ((C0146f) arrayList.get(i2)).f1931b) {
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
            ((C0146f) arrayList.get(i3)).f1931b.c(false);
        }
        C0146f c0146f = (C0146f) arrayList.remove(i2);
        CopyOnWriteArrayList copyOnWriteArrayList = c0146f.f1931b.r;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            p pVar = (p) weakReference.get();
            if (pVar == null || pVar == this) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        boolean z3 = this.f1937E;
        M m2 = c0146f.f1930a;
        if (z3) {
            m2.f2091A.setExitTransition(null);
            m2.f2091A.setAnimationStyle(0);
        }
        m2.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f1951u = ((C0146f) arrayList.get(size2 - 1)).f1932c;
        } else {
            View view = this.f1949s;
            Field field = x.f3069a;
            this.f1951u = view.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z2) {
                ((C0146f) arrayList.get(0)).f1931b.c(false);
                return;
            }
            return;
        }
        dismiss();
        o oVar = this.f1934B;
        if (oVar != null) {
            oVar.a(jVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f1935C;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f1935C.removeGlobalOnLayoutListener(this.f1945n);
            }
            this.f1935C = null;
        }
        this.f1950t.removeOnAttachStateChangeListener(this.f1946o);
        this.f1936D.onDismiss();
    }

    @Override // g.p
    public final void b() {
        Iterator it = this.f1944m.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C0146f) it.next()).f1930a.f2094h.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C0148h) adapter).notifyDataSetChanged();
        }
    }

    @Override // g.r
    public final boolean c() {
        ArrayList arrayList = this.f1944m;
        return arrayList.size() > 0 && ((C0146f) arrayList.get(0)).f1930a.f2091A.isShowing();
    }

    @Override // g.p
    public final boolean d(t tVar) {
        Iterator it = this.f1944m.iterator();
        while (it.hasNext()) {
            C0146f c0146f = (C0146f) it.next();
            if (tVar == c0146f.f1931b) {
                c0146f.f1930a.f2094h.requestFocus();
                return true;
            }
        }
        if (!tVar.hasVisibleItems()) {
            return false;
        }
        l(tVar);
        o oVar = this.f1934B;
        if (oVar != null) {
            oVar.m(tVar);
        }
        return true;
    }

    @Override // g.r
    public final void dismiss() {
        ArrayList arrayList = this.f1944m;
        int size = arrayList.size();
        if (size > 0) {
            C0146f[] c0146fArr = (C0146f[]) arrayList.toArray(new C0146f[size]);
            for (int i2 = size - 1; i2 >= 0; i2--) {
                C0146f c0146f = c0146fArr[i2];
                if (c0146f.f1930a.f2091A.isShowing()) {
                    c0146f.f1930a.dismiss();
                }
            }
        }
    }

    @Override // g.r
    public final ListView e() {
        ArrayList arrayList = this.f1944m;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C0146f) arrayList.get(arrayList.size() - 1)).f1930a.f2094h;
    }

    @Override // g.r
    public final void f() {
        if (c()) {
            return;
        }
        ArrayList arrayList = this.f1943l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            v((j) it.next());
        }
        arrayList.clear();
        View view = this.f1949s;
        this.f1950t = view;
        if (view != null) {
            boolean z2 = this.f1935C == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f1935C = viewTreeObserver;
            if (z2) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f1945n);
            }
            this.f1950t.addOnAttachStateChangeListener(this.f1946o);
        }
    }

    @Override // g.p
    public final void g(o oVar) {
        this.f1934B = oVar;
    }

    @Override // g.p
    public final boolean h() {
        return false;
    }

    @Override // g.l
    public final void l(j jVar) {
        jVar.b(this, this.f1938g);
        if (c()) {
            v(jVar);
        } else {
            this.f1943l.add(jVar);
        }
    }

    @Override // g.l
    public final void n(View view) {
        if (this.f1949s != view) {
            this.f1949s = view;
            int i2 = this.f1948q;
            Field field = x.f3069a;
            this.r = Gravity.getAbsoluteGravity(i2, view.getLayoutDirection());
        }
    }

    @Override // g.l
    public final void o(boolean z2) {
        this.f1956z = z2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C0146f c0146f;
        ArrayList arrayList = this.f1944m;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                c0146f = null;
                break;
            }
            c0146f = (C0146f) arrayList.get(i2);
            if (!c0146f.f1930a.f2091A.isShowing()) {
                break;
            } else {
                i2++;
            }
        }
        if (c0146f != null) {
            c0146f.f1931b.c(false);
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
        if (this.f1948q != i2) {
            this.f1948q = i2;
            View view = this.f1949s;
            Field field = x.f3069a;
            this.r = Gravity.getAbsoluteGravity(i2, view.getLayoutDirection());
        }
    }

    @Override // g.l
    public final void q(int i2) {
        this.f1952v = true;
        this.f1954x = i2;
    }

    @Override // g.l
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f1936D = (m) onDismissListener;
    }

    @Override // g.l
    public final void s(boolean z2) {
        this.f1933A = z2;
    }

    @Override // g.l
    public final void t(int i2) {
        this.f1953w = true;
        this.f1955y = i2;
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
        Context context = this.f1938g;
        LayoutInflater from = LayoutInflater.from(context);
        C0148h c0148h2 = new C0148h(jVar, from, this.f1941j, R.layout.abc_cascading_menu_item_layout);
        if (!c() && this.f1956z) {
            c0148h2.f1959h = true;
        } else if (c()) {
            c0148h2.f1959h = l.u(jVar);
        }
        int m2 = l.m(c0148h2, context, this.f1939h);
        M m3 = new M(context, this.f1940i);
        m3.f2117D = this.f1947p;
        m3.r = this;
        m3.f2091A.setOnDismissListener(this);
        m3.f2103q = this.f1949s;
        m3.f2101o = this.r;
        m3.f2111z = true;
        m3.f2091A.setFocusable(true);
        m3.f2091A.setInputMethodMode(2);
        m3.a(c0148h2);
        Drawable background = m3.f2091A.getBackground();
        if (background != null) {
            Rect rect = m3.f2109x;
            background.getPadding(rect);
            m3.f2095i = rect.left + rect.right + m2;
        } else {
            m3.f2095i = m2;
        }
        m3.f2101o = this.r;
        ArrayList arrayList = this.f1944m;
        if (arrayList.size() > 0) {
            c0146f = (C0146f) arrayList.get(arrayList.size() - 1);
            j jVar2 = c0146f.f1931b;
            int size = jVar2.f1969f.size();
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
                L l2 = c0146f.f1930a.f2094h;
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
            h.r rVar = m3.f2091A;
            if (i8 <= 28) {
                Method method = M.f2116E;
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
            m3.f2091A.setEnterTransition(null);
            L l3 = ((C0146f) arrayList.get(arrayList.size() - 1)).f1930a.f2094h;
            int[] iArr = new int[2];
            l3.getLocationOnScreen(iArr);
            Rect rect2 = new Rect();
            this.f1950t.getWindowVisibleDisplayFrame(rect2);
            if (this.f1951u == 1) {
                if (l3.getWidth() + iArr[0] + m2 > rect2.right) {
                    i2 = 0;
                    boolean z2 = i2 != 1;
                    this.f1951u = i2;
                    if (Build.VERSION.SDK_INT < 26) {
                        m3.f2103q = view;
                        i4 = 0;
                        i3 = 0;
                    } else {
                        int[] iArr2 = new int[2];
                        this.f1949s.getLocationOnScreen(iArr2);
                        int[] iArr3 = new int[2];
                        view.getLocationOnScreen(iArr3);
                        if ((this.r & 7) == 5) {
                            c2 = 0;
                            iArr2[0] = this.f1949s.getWidth() + iArr2[0];
                            iArr3[0] = view.getWidth() + iArr3[0];
                        } else {
                            c2 = 0;
                        }
                        i3 = iArr3[c2] - iArr2[c2];
                        i4 = iArr3[1] - iArr2[1];
                    }
                    if ((this.r & 5) == 5) {
                        if (z2) {
                            width = i3 + view.getWidth();
                            m3.f2096j = width;
                            m3.f2100n = true;
                            m3.f2099m = true;
                            m3.f2097k = i4;
                            m3.f2098l = true;
                        }
                        width = i3 - m2;
                        m3.f2096j = width;
                        m3.f2100n = true;
                        m3.f2099m = true;
                        m3.f2097k = i4;
                        m3.f2098l = true;
                    } else if (z2) {
                        width = i3 + m2;
                        m3.f2096j = width;
                        m3.f2100n = true;
                        m3.f2099m = true;
                        m3.f2097k = i4;
                        m3.f2098l = true;
                    } else {
                        m2 = view.getWidth();
                        width = i3 - m2;
                        m3.f2096j = width;
                        m3.f2100n = true;
                        m3.f2099m = true;
                        m3.f2097k = i4;
                        m3.f2098l = true;
                    }
                }
                i2 = 1;
                if (i2 != 1) {
                }
                this.f1951u = i2;
                if (Build.VERSION.SDK_INT < 26) {
                }
                if ((this.r & 5) == 5) {
                }
            } else {
                if (iArr[0] - m2 >= 0) {
                    i2 = 0;
                    if (i2 != 1) {
                    }
                    this.f1951u = i2;
                    if (Build.VERSION.SDK_INT < 26) {
                    }
                    if ((this.r & 5) == 5) {
                    }
                }
                i2 = 1;
                if (i2 != 1) {
                }
                this.f1951u = i2;
                if (Build.VERSION.SDK_INT < 26) {
                }
                if ((this.r & 5) == 5) {
                }
            }
        } else {
            if (this.f1952v) {
                m3.f2096j = this.f1954x;
            }
            if (this.f1953w) {
                m3.f2097k = this.f1955y;
                m3.f2098l = true;
            }
            Rect rect3 = this.f2010f;
            m3.f2110y = rect3 != null ? new Rect(rect3) : null;
        }
        arrayList.add(new C0146f(m3, jVar, this.f1951u));
        m3.f();
        L l4 = m3.f2094h;
        l4.setOnKeyListener(this);
        if (c0146f == null && this.f1933A && jVar.f1975l != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) l4, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(jVar.f1975l);
            l4.addHeaderView(frameLayout, null, false);
            m3.f();
        }
    }
}
