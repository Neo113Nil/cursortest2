package l;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
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
import android.widget.PopupWindow;
import android.widget.TextView;
import com.icefishing.icefishingbigwin.C5275R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import m.C4706p0;
import m.C4724z;
import m.D0;
import m.E0;
import m.G0;

/* renamed from: l.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC4650g extends u implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: G, reason: collision with root package name */
    public View f38771G;

    /* renamed from: H, reason: collision with root package name */
    public View f38772H;

    /* renamed from: I, reason: collision with root package name */
    public int f38773I;
    public boolean J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f38774K;

    /* renamed from: L, reason: collision with root package name */
    public int f38775L;

    /* renamed from: M, reason: collision with root package name */
    public int f38776M;

    /* renamed from: O, reason: collision with root package name */
    public boolean f38778O;

    /* renamed from: P, reason: collision with root package name */
    public x f38779P;

    /* renamed from: Q, reason: collision with root package name */
    public ViewTreeObserver f38780Q;

    /* renamed from: R, reason: collision with root package name */
    public v f38781R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f38782S;

    /* renamed from: u, reason: collision with root package name */
    public final Context f38783u;

    /* renamed from: v, reason: collision with root package name */
    public final int f38784v;

    /* renamed from: w, reason: collision with root package name */
    public final int f38785w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f38786x;

    /* renamed from: y, reason: collision with root package name */
    public final Handler f38787y;

    /* renamed from: z, reason: collision with root package name */
    public final ArrayList f38788z = new ArrayList();

    /* renamed from: A, reason: collision with root package name */
    public final ArrayList f38765A = new ArrayList();

    /* renamed from: B, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC4647d f38766B = new ViewTreeObserverOnGlobalLayoutListenerC4647d(0, this);

    /* renamed from: C, reason: collision with root package name */
    public final H3.p f38767C = new H3.p(2, this);

    /* renamed from: D, reason: collision with root package name */
    public final C4648e f38768D = new C4648e(0, this);

    /* renamed from: E, reason: collision with root package name */
    public int f38769E = 0;

    /* renamed from: F, reason: collision with root package name */
    public int f38770F = 0;

    /* renamed from: N, reason: collision with root package name */
    public boolean f38777N = false;

    public ViewOnKeyListenerC4650g(Context context, View view, int i, boolean z3) {
        this.f38783u = context;
        this.f38771G = view;
        this.f38785w = i;
        this.f38786x = z3;
        this.f38773I = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f38784v = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C5275R.dimen.abc_config_prefDialogWidth));
        this.f38787y = new Handler();
    }

    @Override // l.InterfaceC4641C
    public final boolean a() {
        ArrayList arrayList = this.f38765A;
        return arrayList.size() > 0 && ((C4649f) arrayList.get(0)).f38762a.f38985S.isShowing();
    }

    @Override // l.y
    public final void b(m mVar, boolean z3) {
        ArrayList arrayList = this.f38765A;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (mVar == ((C4649f) arrayList.get(i)).f38763b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i6 = i + 1;
        if (i6 < arrayList.size()) {
            ((C4649f) arrayList.get(i6)).f38763b.c(false);
        }
        C4649f c4649f = (C4649f) arrayList.remove(i);
        c4649f.f38763b.r(this);
        boolean z6 = this.f38782S;
        G0 g02 = c4649f.f38762a;
        if (z6) {
            D0.b(g02.f38985S, null);
            g02.f38985S.setAnimationStyle(0);
        }
        g02.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f38773I = ((C4649f) arrayList.get(size2 - 1)).f38764c;
        } else {
            this.f38773I = this.f38771G.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z3) {
                ((C4649f) arrayList.get(0)).f38763b.c(false);
                return;
            }
            return;
        }
        dismiss();
        x xVar = this.f38779P;
        if (xVar != null) {
            xVar.b(mVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f38780Q;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f38780Q.removeGlobalOnLayoutListener(this.f38766B);
            }
            this.f38780Q = null;
        }
        this.f38772H.removeOnAttachStateChangeListener(this.f38767C);
        this.f38781R.onDismiss();
    }

    @Override // l.y
    public final boolean d() {
        return false;
    }

    @Override // l.InterfaceC4641C
    public final void dismiss() {
        ArrayList arrayList = this.f38765A;
        int size = arrayList.size();
        if (size > 0) {
            C4649f[] c4649fArr = (C4649f[]) arrayList.toArray(new C4649f[size]);
            for (int i = size - 1; i >= 0; i--) {
                C4649f c4649f = c4649fArr[i];
                if (c4649f.f38762a.f38985S.isShowing()) {
                    c4649f.f38762a.dismiss();
                }
            }
        }
    }

    @Override // l.y
    public final void e() {
        Iterator it = this.f38765A.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C4649f) it.next()).f38762a.f38988v.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C4653j) adapter).notifyDataSetChanged();
        }
    }

    @Override // l.InterfaceC4641C
    public final C4706p0 f() {
        ArrayList arrayList = this.f38765A;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C4649f) arrayList.get(arrayList.size() - 1)).f38762a.f38988v;
    }

    @Override // l.y
    public final void g(x xVar) {
        this.f38779P = xVar;
    }

    @Override // l.y
    public final boolean i(SubMenuC4643E subMenuC4643E) {
        Iterator it = this.f38765A.iterator();
        while (it.hasNext()) {
            C4649f c4649f = (C4649f) it.next();
            if (subMenuC4643E == c4649f.f38763b) {
                c4649f.f38762a.f38988v.requestFocus();
                return true;
            }
        }
        if (!subMenuC4643E.hasVisibleItems()) {
            return false;
        }
        k(subMenuC4643E);
        x xVar = this.f38779P;
        if (xVar != null) {
            xVar.j(subMenuC4643E);
        }
        return true;
    }

    @Override // l.u
    public final void k(m mVar) {
        mVar.b(this, this.f38783u);
        if (a()) {
            u(mVar);
        } else {
            this.f38788z.add(mVar);
        }
    }

    @Override // l.u
    public final void m(View view) {
        if (this.f38771G != view) {
            this.f38771G = view;
            this.f38770F = Gravity.getAbsoluteGravity(this.f38769E, view.getLayoutDirection());
        }
    }

    @Override // l.u
    public final void n(boolean z3) {
        this.f38777N = z3;
    }

    @Override // l.u
    public final void o(int i) {
        if (this.f38769E != i) {
            this.f38769E = i;
            this.f38770F = Gravity.getAbsoluteGravity(i, this.f38771G.getLayoutDirection());
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C4649f c4649f;
        ArrayList arrayList = this.f38765A;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c4649f = null;
                break;
            }
            c4649f = (C4649f) arrayList.get(i);
            if (!c4649f.f38762a.f38985S.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (c4649f != null) {
            c4649f.f38763b.c(false);
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
    public final void p(int i) {
        this.J = true;
        this.f38775L = i;
    }

    @Override // l.u
    public final void q(PopupWindow.OnDismissListener onDismissListener) {
        this.f38781R = (v) onDismissListener;
    }

    @Override // l.u
    public final void r(boolean z3) {
        this.f38778O = z3;
    }

    @Override // l.u
    public final void s(int i) {
        this.f38774K = true;
        this.f38776M = i;
    }

    @Override // l.InterfaceC4641C
    public final void show() {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.f38788z;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            u((m) it.next());
        }
        arrayList.clear();
        View view = this.f38771G;
        this.f38772H = view;
        if (view != null) {
            boolean z3 = this.f38780Q == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f38780Q = viewTreeObserver;
            if (z3) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f38766B);
            }
            this.f38772H.addOnAttachStateChangeListener(this.f38767C);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0146, code lost:
    
        if (((r8.getWidth() + r11[0]) + r5) > r9.right) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0148, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x014b, code lost:
    
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0150, code lost:
    
        if ((r11[0] - r5) < 0) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(m mVar) {
        int i;
        C4649f c4649f;
        View view;
        int i6;
        int i9;
        int i10;
        int width;
        MenuItem menuItem;
        C4653j c4653j;
        int i11;
        int firstVisiblePosition;
        Context context = this.f38783u;
        LayoutInflater from = LayoutInflater.from(context);
        C4653j c4653j2 = new C4653j(mVar, from, this.f38786x, C5275R.layout.abc_cascading_menu_item_layout);
        if (!a() && this.f38777N) {
            c4653j2.f38799c = true;
        } else if (a()) {
            c4653j2.f38799c = u.t(mVar);
        }
        int l9 = u.l(c4653j2, context, this.f38784v);
        G0 g02 = new G0(context, null, this.f38785w);
        g02.f39007V = this.f38768D;
        g02.f38976I = this;
        g02.f38985S.setOnDismissListener(this);
        g02.f38975H = this.f38771G;
        g02.f38972E = this.f38770F;
        g02.f38984R = true;
        g02.f38985S.setFocusable(true);
        g02.f38985S.setInputMethodMode(2);
        g02.m(c4653j2);
        g02.o(l9);
        g02.f38972E = this.f38770F;
        ArrayList arrayList = this.f38765A;
        if (arrayList.size() > 0) {
            c4649f = (C4649f) arrayList.get(arrayList.size() - 1);
            m mVar2 = c4649f.f38763b;
            int size = mVar2.f38825y.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size) {
                    menuItem = null;
                    break;
                }
                menuItem = mVar2.getItem(i12);
                if (menuItem.hasSubMenu() && mVar == menuItem.getSubMenu()) {
                    break;
                } else {
                    i12++;
                }
            }
            if (menuItem == null) {
                i = 1;
                view = null;
            } else {
                C4706p0 c4706p0 = c4649f.f38762a.f38988v;
                ListAdapter adapter = c4706p0.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i11 = headerViewListAdapter.getHeadersCount();
                    c4653j = (C4653j) headerViewListAdapter.getWrappedAdapter();
                } else {
                    c4653j = (C4653j) adapter;
                    i11 = 0;
                }
                int count = c4653j.getCount();
                i = 1;
                int i13 = 0;
                while (true) {
                    if (i13 >= count) {
                        i13 = -1;
                        break;
                    } else if (menuItem == c4653j.getItem(i13)) {
                        break;
                    } else {
                        i13++;
                    }
                }
                if (i13 != -1 && (firstVisiblePosition = (i13 + i11) - c4706p0.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < c4706p0.getChildCount()) {
                    view = c4706p0.getChildAt(firstVisiblePosition);
                }
            }
            if (view == null) {
                int i14 = Build.VERSION.SDK_INT;
                C4724z c4724z = g02.f38985S;
                if (i14 <= 28) {
                    Method method = G0.f39006W;
                    if (method != null) {
                        try {
                            method.invoke(c4724z, Boolean.FALSE);
                        } catch (Exception unused) {
                            Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                        }
                    }
                } else {
                    E0.a(c4724z, false);
                }
                D0.a(g02.f38985S, null);
                C4706p0 c4706p02 = ((C4649f) arrayList.get(arrayList.size() - 1)).f38762a.f38988v;
                int[] iArr = new int[2];
                c4706p02.getLocationOnScreen(iArr);
                Rect rect = new Rect();
                this.f38772H.getWindowVisibleDisplayFrame(rect);
                if (this.f38773I == i) {
                }
                boolean z3 = i6 == 1;
                this.f38773I = i6;
                if (Build.VERSION.SDK_INT >= 26) {
                    g02.f38975H = view;
                    i10 = 0;
                    i9 = 0;
                } else {
                    int[] iArr2 = new int[2];
                    this.f38771G.getLocationOnScreen(iArr2);
                    int[] iArr3 = new int[2];
                    view.getLocationOnScreen(iArr3);
                    if ((this.f38770F & 7) == 5) {
                        iArr2[0] = this.f38771G.getWidth() + iArr2[0];
                        iArr3[0] = view.getWidth() + iArr3[0];
                    }
                    i9 = iArr3[0] - iArr2[0];
                    i10 = iArr3[1] - iArr2[1];
                }
                if ((this.f38770F & 5) != 5) {
                    if (z3) {
                        width = i9 + view.getWidth();
                        g02.f38991y = width;
                        g02.f38971D = true;
                        g02.f38970C = true;
                        g02.h(i10);
                    }
                    width = i9 - l9;
                    g02.f38991y = width;
                    g02.f38971D = true;
                    g02.f38970C = true;
                    g02.h(i10);
                } else if (z3) {
                    width = i9 + l9;
                    g02.f38991y = width;
                    g02.f38971D = true;
                    g02.f38970C = true;
                    g02.h(i10);
                } else {
                    l9 = view.getWidth();
                    width = i9 - l9;
                    g02.f38991y = width;
                    g02.f38971D = true;
                    g02.f38970C = true;
                    g02.h(i10);
                }
            } else {
                if (this.J) {
                    g02.f38991y = this.f38775L;
                }
                if (this.f38774K) {
                    g02.h(this.f38776M);
                }
                Rect rect2 = this.f38868n;
                g02.f38983Q = rect2 != null ? new Rect(rect2) : null;
            }
            arrayList.add(new C4649f(g02, mVar, this.f38773I));
            g02.show();
            C4706p0 c4706p03 = g02.f38988v;
            c4706p03.setOnKeyListener(this);
            if (c4649f == null || !this.f38778O || mVar.f38809F == null) {
                return;
            }
            FrameLayout frameLayout = (FrameLayout) from.inflate(C5275R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c4706p03, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(mVar.f38809F);
            c4706p03.addHeaderView(frameLayout, null, false);
            g02.show();
            return;
        }
        i = 1;
        c4649f = null;
        view = null;
        if (view == null) {
        }
        arrayList.add(new C4649f(g02, mVar, this.f38773I));
        g02.show();
        C4706p0 c4706p032 = g02.f38988v;
        c4706p032.setOnKeyListener(this);
        if (c4649f == null) {
        }
    }
}
