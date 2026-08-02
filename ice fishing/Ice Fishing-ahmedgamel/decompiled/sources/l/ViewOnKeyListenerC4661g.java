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
import com.IceFishing.LiveIceFishing.C5248R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import m.C4719p0;
import m.C4737z;
import m.D0;
import m.E0;
import m.G0;

/* renamed from: l.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC4661g extends u implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: G, reason: collision with root package name */
    public View f38698G;

    /* renamed from: H, reason: collision with root package name */
    public View f38699H;

    /* renamed from: I, reason: collision with root package name */
    public int f38700I;
    public boolean J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f38701K;

    /* renamed from: L, reason: collision with root package name */
    public int f38702L;

    /* renamed from: M, reason: collision with root package name */
    public int f38703M;

    /* renamed from: O, reason: collision with root package name */
    public boolean f38705O;

    /* renamed from: P, reason: collision with root package name */
    public x f38706P;

    /* renamed from: Q, reason: collision with root package name */
    public ViewTreeObserver f38707Q;

    /* renamed from: R, reason: collision with root package name */
    public v f38708R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f38709S;

    /* renamed from: u, reason: collision with root package name */
    public final Context f38710u;

    /* renamed from: v, reason: collision with root package name */
    public final int f38711v;

    /* renamed from: w, reason: collision with root package name */
    public final int f38712w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f38713x;

    /* renamed from: y, reason: collision with root package name */
    public final Handler f38714y;

    /* renamed from: z, reason: collision with root package name */
    public final ArrayList f38715z = new ArrayList();

    /* renamed from: A, reason: collision with root package name */
    public final ArrayList f38692A = new ArrayList();

    /* renamed from: B, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC4658d f38693B = new ViewTreeObserverOnGlobalLayoutListenerC4658d(0, this);

    /* renamed from: C, reason: collision with root package name */
    public final J3.p f38694C = new J3.p(2, this);

    /* renamed from: D, reason: collision with root package name */
    public final C4659e f38695D = new C4659e(0, this);

    /* renamed from: E, reason: collision with root package name */
    public int f38696E = 0;

    /* renamed from: F, reason: collision with root package name */
    public int f38697F = 0;

    /* renamed from: N, reason: collision with root package name */
    public boolean f38704N = false;

    public ViewOnKeyListenerC4661g(Context context, View view, int i, boolean z6) {
        this.f38710u = context;
        this.f38698G = view;
        this.f38712w = i;
        this.f38713x = z6;
        this.f38700I = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f38711v = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C5248R.dimen.abc_config_prefDialogWidth));
        this.f38714y = new Handler();
    }

    @Override // l.InterfaceC4652C
    public final boolean a() {
        ArrayList arrayList = this.f38692A;
        return arrayList.size() > 0 && ((C4660f) arrayList.get(0)).f38689a.f39053S.isShowing();
    }

    @Override // l.y
    public final void b(m mVar, boolean z6) {
        ArrayList arrayList = this.f38692A;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (mVar == ((C4660f) arrayList.get(i)).f38690b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i4 = i + 1;
        if (i4 < arrayList.size()) {
            ((C4660f) arrayList.get(i4)).f38690b.c(false);
        }
        C4660f c4660f = (C4660f) arrayList.remove(i);
        c4660f.f38690b.r(this);
        boolean z9 = this.f38709S;
        G0 g02 = c4660f.f38689a;
        if (z9) {
            D0.b(g02.f39053S, null);
            g02.f39053S.setAnimationStyle(0);
        }
        g02.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f38700I = ((C4660f) arrayList.get(size2 - 1)).f38691c;
        } else {
            this.f38700I = this.f38698G.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z6) {
                ((C4660f) arrayList.get(0)).f38690b.c(false);
                return;
            }
            return;
        }
        dismiss();
        x xVar = this.f38706P;
        if (xVar != null) {
            xVar.b(mVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f38707Q;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f38707Q.removeGlobalOnLayoutListener(this.f38693B);
            }
            this.f38707Q = null;
        }
        this.f38699H.removeOnAttachStateChangeListener(this.f38694C);
        this.f38708R.onDismiss();
    }

    @Override // l.y
    public final boolean d() {
        return false;
    }

    @Override // l.InterfaceC4652C
    public final void dismiss() {
        ArrayList arrayList = this.f38692A;
        int size = arrayList.size();
        if (size > 0) {
            C4660f[] c4660fArr = (C4660f[]) arrayList.toArray(new C4660f[size]);
            for (int i = size - 1; i >= 0; i--) {
                C4660f c4660f = c4660fArr[i];
                if (c4660f.f38689a.f39053S.isShowing()) {
                    c4660f.f38689a.dismiss();
                }
            }
        }
    }

    @Override // l.y
    public final void e() {
        Iterator it = this.f38692A.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C4660f) it.next()).f38689a.f39056v.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C4664j) adapter).notifyDataSetChanged();
        }
    }

    @Override // l.InterfaceC4652C
    public final C4719p0 f() {
        ArrayList arrayList = this.f38692A;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C4660f) arrayList.get(arrayList.size() - 1)).f38689a.f39056v;
    }

    @Override // l.y
    public final void g(x xVar) {
        this.f38706P = xVar;
    }

    @Override // l.y
    public final boolean i(SubMenuC4654E subMenuC4654E) {
        Iterator it = this.f38692A.iterator();
        while (it.hasNext()) {
            C4660f c4660f = (C4660f) it.next();
            if (subMenuC4654E == c4660f.f38690b) {
                c4660f.f38689a.f39056v.requestFocus();
                return true;
            }
        }
        if (!subMenuC4654E.hasVisibleItems()) {
            return false;
        }
        k(subMenuC4654E);
        x xVar = this.f38706P;
        if (xVar != null) {
            xVar.e(subMenuC4654E);
        }
        return true;
    }

    @Override // l.u
    public final void k(m mVar) {
        mVar.b(this, this.f38710u);
        if (a()) {
            u(mVar);
        } else {
            this.f38715z.add(mVar);
        }
    }

    @Override // l.u
    public final void m(View view) {
        if (this.f38698G != view) {
            this.f38698G = view;
            this.f38697F = Gravity.getAbsoluteGravity(this.f38696E, view.getLayoutDirection());
        }
    }

    @Override // l.u
    public final void n(boolean z6) {
        this.f38704N = z6;
    }

    @Override // l.u
    public final void o(int i) {
        if (this.f38696E != i) {
            this.f38696E = i;
            this.f38697F = Gravity.getAbsoluteGravity(i, this.f38698G.getLayoutDirection());
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C4660f c4660f;
        ArrayList arrayList = this.f38692A;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c4660f = null;
                break;
            }
            c4660f = (C4660f) arrayList.get(i);
            if (!c4660f.f38689a.f39053S.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (c4660f != null) {
            c4660f.f38690b.c(false);
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
        this.f38702L = i;
    }

    @Override // l.u
    public final void q(PopupWindow.OnDismissListener onDismissListener) {
        this.f38708R = (v) onDismissListener;
    }

    @Override // l.u
    public final void r(boolean z6) {
        this.f38705O = z6;
    }

    @Override // l.u
    public final void s(int i) {
        this.f38701K = true;
        this.f38703M = i;
    }

    @Override // l.InterfaceC4652C
    public final void show() {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.f38715z;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            u((m) it.next());
        }
        arrayList.clear();
        View view = this.f38698G;
        this.f38699H = view;
        if (view != null) {
            boolean z6 = this.f38707Q == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f38707Q = viewTreeObserver;
            if (z6) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f38693B);
            }
            this.f38699H.addOnAttachStateChangeListener(this.f38694C);
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
        C4660f c4660f;
        View view;
        int i4;
        int i6;
        int i9;
        int width;
        MenuItem menuItem;
        C4664j c4664j;
        int i10;
        int firstVisiblePosition;
        Context context = this.f38710u;
        LayoutInflater from = LayoutInflater.from(context);
        C4664j c4664j2 = new C4664j(mVar, from, this.f38713x, C5248R.layout.abc_cascading_menu_item_layout);
        if (!a() && this.f38704N) {
            c4664j2.f38726c = true;
        } else if (a()) {
            c4664j2.f38726c = u.t(mVar);
        }
        int l9 = u.l(c4664j2, context, this.f38711v);
        G0 g02 = new G0(context, null, this.f38712w);
        g02.f39075V = this.f38695D;
        g02.f39044I = this;
        g02.f39053S.setOnDismissListener(this);
        g02.f39043H = this.f38698G;
        g02.f39040E = this.f38697F;
        g02.f39052R = true;
        g02.f39053S.setFocusable(true);
        g02.f39053S.setInputMethodMode(2);
        g02.l(c4664j2);
        g02.n(l9);
        g02.f39040E = this.f38697F;
        ArrayList arrayList = this.f38692A;
        if (arrayList.size() > 0) {
            c4660f = (C4660f) arrayList.get(arrayList.size() - 1);
            m mVar2 = c4660f.f38690b;
            int size = mVar2.f38752y.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    menuItem = null;
                    break;
                }
                menuItem = mVar2.getItem(i11);
                if (menuItem.hasSubMenu() && mVar == menuItem.getSubMenu()) {
                    break;
                } else {
                    i11++;
                }
            }
            if (menuItem == null) {
                i = 1;
                view = null;
            } else {
                C4719p0 c4719p0 = c4660f.f38689a.f39056v;
                ListAdapter adapter = c4719p0.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i10 = headerViewListAdapter.getHeadersCount();
                    c4664j = (C4664j) headerViewListAdapter.getWrappedAdapter();
                } else {
                    c4664j = (C4664j) adapter;
                    i10 = 0;
                }
                int count = c4664j.getCount();
                i = 1;
                int i12 = 0;
                while (true) {
                    if (i12 >= count) {
                        i12 = -1;
                        break;
                    } else if (menuItem == c4664j.getItem(i12)) {
                        break;
                    } else {
                        i12++;
                    }
                }
                if (i12 != -1 && (firstVisiblePosition = (i12 + i10) - c4719p0.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < c4719p0.getChildCount()) {
                    view = c4719p0.getChildAt(firstVisiblePosition);
                }
            }
            if (view == null) {
                int i13 = Build.VERSION.SDK_INT;
                C4737z c4737z = g02.f39053S;
                if (i13 <= 28) {
                    Method method = G0.f39074W;
                    if (method != null) {
                        try {
                            method.invoke(c4737z, Boolean.FALSE);
                        } catch (Exception unused) {
                            Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                        }
                    }
                } else {
                    E0.a(c4737z, false);
                }
                D0.a(g02.f39053S, null);
                C4719p0 c4719p02 = ((C4660f) arrayList.get(arrayList.size() - 1)).f38689a.f39056v;
                int[] iArr = new int[2];
                c4719p02.getLocationOnScreen(iArr);
                Rect rect = new Rect();
                this.f38699H.getWindowVisibleDisplayFrame(rect);
                if (this.f38700I == i) {
                }
                boolean z6 = i4 == 1;
                this.f38700I = i4;
                if (Build.VERSION.SDK_INT >= 26) {
                    g02.f39043H = view;
                    i9 = 0;
                    i6 = 0;
                } else {
                    int[] iArr2 = new int[2];
                    this.f38698G.getLocationOnScreen(iArr2);
                    int[] iArr3 = new int[2];
                    view.getLocationOnScreen(iArr3);
                    if ((this.f38697F & 7) == 5) {
                        iArr2[0] = this.f38698G.getWidth() + iArr2[0];
                        iArr3[0] = view.getWidth() + iArr3[0];
                    }
                    i6 = iArr3[0] - iArr2[0];
                    i9 = iArr3[1] - iArr2[1];
                }
                if ((this.f38697F & 5) != 5) {
                    if (z6) {
                        width = i6 + view.getWidth();
                        g02.f39059y = width;
                        g02.f39039D = true;
                        g02.f39038C = true;
                        g02.h(i9);
                    }
                    width = i6 - l9;
                    g02.f39059y = width;
                    g02.f39039D = true;
                    g02.f39038C = true;
                    g02.h(i9);
                } else if (z6) {
                    width = i6 + l9;
                    g02.f39059y = width;
                    g02.f39039D = true;
                    g02.f39038C = true;
                    g02.h(i9);
                } else {
                    l9 = view.getWidth();
                    width = i6 - l9;
                    g02.f39059y = width;
                    g02.f39039D = true;
                    g02.f39038C = true;
                    g02.h(i9);
                }
            } else {
                if (this.J) {
                    g02.f39059y = this.f38702L;
                }
                if (this.f38701K) {
                    g02.h(this.f38703M);
                }
                Rect rect2 = this.f38795n;
                g02.f39051Q = rect2 != null ? new Rect(rect2) : null;
            }
            arrayList.add(new C4660f(g02, mVar, this.f38700I));
            g02.show();
            C4719p0 c4719p03 = g02.f39056v;
            c4719p03.setOnKeyListener(this);
            if (c4660f == null || !this.f38705O || mVar.f38736F == null) {
                return;
            }
            FrameLayout frameLayout = (FrameLayout) from.inflate(C5248R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c4719p03, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(mVar.f38736F);
            c4719p03.addHeaderView(frameLayout, null, false);
            g02.show();
            return;
        }
        i = 1;
        c4660f = null;
        view = null;
        if (view == null) {
        }
        arrayList.add(new C4660f(g02, mVar, this.f38700I));
        g02.show();
        C4719p0 c4719p032 = g02.f39056v;
        c4719p032.setOnKeyListener(this);
        if (c4660f == null) {
        }
    }
}
