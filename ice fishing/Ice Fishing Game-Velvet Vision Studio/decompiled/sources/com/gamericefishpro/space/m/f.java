package com.gamericefishpro.space.m;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
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
import com.gamericefishpro.space.R;
import com.gamericefishpro.space.i2.x1;
import com.gamericefishpro.space.n.k1;
import com.gamericefishpro.space.n.l1;
import com.gamericefishpro.space.n.m1;
import com.gamericefishpro.space.n.n1;
import com.gamericefishpro.space.n.w;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends k implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public View G;
    public View H;
    public int I;
    public boolean J;
    public boolean K;
    public int L;
    public int M;
    public boolean O;
    public n P;
    public ViewTreeObserver Q;
    public PopupWindow.OnDismissListener R;
    public boolean S;
    public final Context e;
    public final int i;
    public final int v;
    public final boolean w;
    public final Handler y;
    public final ArrayList z = new ArrayList();
    public final ArrayList A = new ArrayList();
    public final c B = new c(this, 0);
    public final x1 C = new x1(2, this);
    public final d D = new d(0, this);
    public int E = 0;
    public int F = 0;
    public boolean N = false;

    public f(Context context, View view, int i, boolean z) {
        this.e = context;
        this.G = view;
        this.v = i;
        this.w = z;
        this.I = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.i = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.y = new Handler();
    }

    @Override // com.gamericefishpro.space.m.q
    public final void a() {
        if (j()) {
            return;
        }
        ArrayList arrayList = this.z;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            u((i) obj);
        }
        arrayList.clear();
        View view = this.G;
        this.H = view;
        if (view != null) {
            boolean z = this.Q == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.Q = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.B);
            }
            this.H.addOnAttachStateChangeListener(this.C);
        }
    }

    @Override // com.gamericefishpro.space.m.o
    public final void b(i iVar, boolean z) {
        ArrayList arrayList = this.A;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (iVar == ((e) arrayList.get(i)).b) {
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
            ((e) arrayList.get(i2)).b.c(false);
        }
        e eVar = (e) arrayList.remove(i);
        i iVar2 = eVar.b;
        n1 n1Var = eVar.a;
        w wVar = n1Var.O;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = iVar2.r;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            o oVar = (o) weakReference.get();
            if (oVar == null || oVar == this) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        if (this.S) {
            k1.b(wVar, null);
            wVar.setAnimationStyle(0);
        }
        n1Var.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.I = ((e) arrayList.get(size2 - 1)).c;
        } else {
            this.I = this.G.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((e) arrayList.get(0)).b.c(false);
                return;
            }
            return;
        }
        dismiss();
        n nVar = this.P;
        if (nVar != null) {
            nVar.b(iVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.Q;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.Q.removeGlobalOnLayoutListener(this.B);
            }
            this.Q = null;
        }
        this.H.removeOnAttachStateChangeListener(this.C);
        this.R.onDismiss();
    }

    @Override // com.gamericefishpro.space.m.o
    public final void c() {
        ArrayList arrayList = this.A;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ListAdapter adapter = ((e) obj).a.i.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((g) adapter).notifyDataSetChanged();
        }
    }

    @Override // com.gamericefishpro.space.m.q
    public final void dismiss() {
        ArrayList arrayList = this.A;
        int size = arrayList.size();
        if (size > 0) {
            e[] eVarArr = (e[]) arrayList.toArray(new e[size]);
            for (int i = size - 1; i >= 0; i--) {
                e eVar = eVarArr[i];
                if (eVar.a.O.isShowing()) {
                    eVar.a.dismiss();
                }
            }
        }
    }

    @Override // com.gamericefishpro.space.m.q
    public final ListView e() {
        ArrayList arrayList = this.A;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((e) arrayList.get(arrayList.size() - 1)).a.i;
    }

    @Override // com.gamericefishpro.space.m.o
    public final boolean f(s sVar) {
        ArrayList arrayList = this.A;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            e eVar = (e) obj;
            if (sVar == eVar.b) {
                eVar.a.i.requestFocus();
                return true;
            }
        }
        if (!sVar.hasVisibleItems()) {
            return false;
        }
        l(sVar);
        n nVar = this.P;
        if (nVar != null) {
            nVar.c(sVar);
        }
        return true;
    }

    @Override // com.gamericefishpro.space.m.o
    public final void g(n nVar) {
        this.P = nVar;
    }

    @Override // com.gamericefishpro.space.m.o
    public final boolean i() {
        return false;
    }

    @Override // com.gamericefishpro.space.m.q
    public final boolean j() {
        ArrayList arrayList = this.A;
        return arrayList.size() > 0 && ((e) arrayList.get(0)).a.O.isShowing();
    }

    @Override // com.gamericefishpro.space.m.k
    public final void l(i iVar) {
        iVar.b(this, this.e);
        if (j()) {
            u(iVar);
        } else {
            this.z.add(iVar);
        }
    }

    @Override // com.gamericefishpro.space.m.k
    public final void n(View view) {
        if (this.G != view) {
            this.G = view;
            this.F = Gravity.getAbsoluteGravity(this.E, view.getLayoutDirection());
        }
    }

    @Override // com.gamericefishpro.space.m.k
    public final void o(boolean z) {
        this.N = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        e eVar;
        ArrayList arrayList = this.A;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                eVar = null;
                break;
            }
            eVar = (e) arrayList.get(i);
            if (!eVar.a.O.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (eVar != null) {
            eVar.b.c(false);
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

    @Override // com.gamericefishpro.space.m.k
    public final void p(int i) {
        if (this.E != i) {
            this.E = i;
            this.F = Gravity.getAbsoluteGravity(i, this.G.getLayoutDirection());
        }
    }

    @Override // com.gamericefishpro.space.m.k
    public final void q(int i) {
        this.J = true;
        this.L = i;
    }

    @Override // com.gamericefishpro.space.m.k
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.R = onDismissListener;
    }

    @Override // com.gamericefishpro.space.m.k
    public final void s(boolean z) {
        this.O = z;
    }

    @Override // com.gamericefishpro.space.m.k
    public final void t(int i) {
        this.K = true;
        this.M = i;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0128 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x011c  */
    /* JADX WARN: Code duplicated, block: B:61:0x0124  */
    /* JADX WARN: Code duplicated, block: B:65:0x0132  */
    /* JADX WARN: Code duplicated, block: B:68:0x0161  */
    /* JADX WARN: Code duplicated, block: B:70:0x016d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0170  */
    /* JADX WARN: Code duplicated, block: B:73:0x0172  */
    /* JADX WARN: Code duplicated, block: B:77:0x017a  */
    /* JADX WARN: Code duplicated, block: B:78:0x017c  */
    /* JADX WARN: Code duplicated, block: B:81:0x0187 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x018a  */
    /* JADX WARN: Code duplicated, block: B:84:0x0191 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x0193  */
    /* JADX WARN: Code duplicated, block: B:86:0x0198  */
    /* JADX WARN: Code duplicated, block: B:88:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:90:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:93:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:96:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:97:0x01c3  */
    public final void u(i iVar) {
        boolean z;
        int i;
        e eVar;
        View childAt;
        Rect rect;
        Rect rect2;
        int i2;
        w wVar;
        m1 m1Var;
        int[] iArr;
        Rect rect3;
        int i3;
        boolean z2;
        Method method;
        MenuItem item;
        g gVar;
        int headersCount;
        int firstVisiblePosition;
        Context context = this.e;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        g gVar2 = new g(iVar, layoutInflaterFrom, this.w, R.layout.abc_cascading_menu_item_layout);
        if (!j() && this.N) {
            gVar2.c = true;
        } else if (j()) {
            int size = iVar.f.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    z = false;
                    break;
                }
                MenuItem item2 = iVar.getItem(i4);
                if (item2.isVisible() && item2.getIcon() != null) {
                    z = true;
                    break;
                }
                i4++;
            }
            gVar2.c = z;
        }
        int iM = k.m(gVar2, context, this.i);
        n1 n1Var = new n1(context, this.v);
        n1Var.R = this.D;
        n1Var.F = this;
        n1Var.O.setOnDismissListener(this);
        n1Var.E = this.G;
        n1Var.C = this.F;
        n1Var.N = true;
        n1Var.O.setFocusable(true);
        n1Var.O.setInputMethodMode(2);
        n1Var.b(gVar2);
        Drawable background = n1Var.O.getBackground();
        if (background != null) {
            Rect rect4 = n1Var.L;
            background.getPadding(rect4);
            n1Var.v = rect4.left + rect4.right + iM;
        } else {
            n1Var.v = iM;
        }
        n1Var.C = this.F;
        ArrayList arrayList = this.A;
        if (arrayList.size() > 0) {
            eVar = (e) arrayList.get(arrayList.size() - 1);
            i iVar2 = eVar.b;
            int size2 = iVar2.f.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size2) {
                    item = null;
                    break;
                }
                item = iVar2.getItem(i5);
                if (item.hasSubMenu() && iVar == item.getSubMenu()) {
                    break;
                } else {
                    i5++;
                }
            }
            if (item != null) {
                m1 m1Var2 = eVar.a.i;
                ListAdapter adapter = m1Var2.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    gVar = (g) headerViewListAdapter.getWrappedAdapter();
                } else {
                    gVar = (g) adapter;
                    headersCount = 0;
                }
                int count = gVar.getCount();
                i = 1;
                int i6 = 0;
                while (true) {
                    if (i6 >= count) {
                        i6 = -1;
                        break;
                    } else if (item == gVar.getItem(i6)) {
                        break;
                    } else {
                        i6++;
                    }
                }
                childAt = (i6 != -1 && (firstVisiblePosition = (i6 + headersCount) - m1Var2.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < m1Var2.getChildCount()) ? m1Var2.getChildAt(firstVisiblePosition) : null;
                if (childAt != null) {
                    i2 = Build.VERSION.SDK_INT;
                    wVar = n1Var.O;
                    if (i2 <= 28) {
                        method = n1.S;
                        if (method != null) {
                            try {
                                method.invoke(wVar, Boolean.FALSE);
                            } catch (Exception unused) {
                            }
                        }
                    } else {
                        l1.a(wVar, false);
                    }
                    k1.a(n1Var.O, null);
                    m1Var = ((e) arrayList.get(arrayList.size() - 1)).a.i;
                    iArr = new int[2];
                    m1Var.getLocationOnScreen(iArr);
                    rect3 = new Rect();
                    this.H.getWindowVisibleDisplayFrame(rect3);
                    if (this.I == i) {
                        if (m1Var.getWidth() + iArr[0] + iM > rect3.right) {
                            i3 = 0;
                        } else {
                            i3 = 1;
                        }
                    } else if (iArr[0] - iM < 0) {
                        i3 = 1;
                    } else {
                        i3 = 0;
                    }
                    if (i3 == 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    this.I = i3;
                    n1Var.E = childAt;
                    if ((this.F & 5) == 5) {
                        if (!z2) {
                            iM = 0 - childAt.getWidth();
                        }
                    } else if (z2) {
                        iM = childAt.getWidth();
                    } else {
                        iM = 0 - iM;
                    }
                    n1Var.w = iM;
                    n1Var.B = true;
                    n1Var.A = true;
                    n1Var.y = 0;
                    n1Var.z = true;
                } else {
                    if (this.J) {
                        n1Var.w = this.L;
                    }
                    if (this.K) {
                        n1Var.y = this.M;
                        n1Var.z = true;
                    }
                    rect = this.d;
                    if (rect != null) {
                        rect2 = new Rect(rect);
                    } else {
                        rect2 = null;
                    }
                    n1Var.M = rect2;
                }
                arrayList.add(new e(n1Var, iVar, this.I));
                n1Var.a();
                m1 m1Var3 = n1Var.i;
                m1Var3.setOnKeyListener(this);
                if (eVar == null || !this.O || iVar.l == null) {
                    return;
                }
                FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) m1Var3, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                frameLayout.setEnabled(false);
                textView.setText(iVar.l);
                m1Var3.addHeaderView(frameLayout, null, false);
                n1Var.a();
                return;
            }
            i = 1;
        } else {
            i = 1;
            eVar = null;
        }
        if (childAt != null) {
            i2 = Build.VERSION.SDK_INT;
            wVar = n1Var.O;
            if (i2 <= 28) {
                method = n1.S;
                if (method != null) {
                    method.invoke(wVar, Boolean.FALSE);
                }
            } else {
                l1.a(wVar, false);
            }
            k1.a(n1Var.O, null);
            m1Var = ((e) arrayList.get(arrayList.size() - 1)).a.i;
            iArr = new int[2];
            m1Var.getLocationOnScreen(iArr);
            rect3 = new Rect();
            this.H.getWindowVisibleDisplayFrame(rect3);
            if (this.I == i) {
                if (m1Var.getWidth() + iArr[0] + iM > rect3.right) {
                    i3 = 0;
                } else {
                    i3 = 1;
                }
            } else if (iArr[0] - iM < 0) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            if (i3 == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.I = i3;
            n1Var.E = childAt;
            if ((this.F & 5) == 5) {
                if (!z2) {
                    iM = 0 - childAt.getWidth();
                }
            } else if (z2) {
                iM = childAt.getWidth();
            } else {
                iM = 0 - iM;
            }
            n1Var.w = iM;
            n1Var.B = true;
            n1Var.A = true;
            n1Var.y = 0;
            n1Var.z = true;
        } else {
            if (this.J) {
                n1Var.w = this.L;
            }
            if (this.K) {
                n1Var.y = this.M;
                n1Var.z = true;
            }
            rect = this.d;
            if (rect != null) {
                rect2 = new Rect(rect);
            } else {
                rect2 = null;
            }
            n1Var.M = rect2;
        }
        arrayList.add(new e(n1Var, iVar, this.I));
        n1Var.a();
        m1 m1Var4 = n1Var.i;
        m1Var4.setOnKeyListener(this);
        if (eVar == null) {
        }
    }
}
