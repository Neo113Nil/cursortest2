package defpackage;

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
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public final class q54 extends yxh implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public final Context b;
    public final int c;
    public final int d;
    public final boolean e;
    public final Handler f;
    public View n;
    public View o;
    public int p;
    public boolean q;
    public boolean r;
    public int s;
    public int t;
    public boolean v;
    public fyh w;
    public ViewTreeObserver x;
    public PopupWindow.OnDismissListener y;
    public boolean z;
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final vr0 i = new vr0(2, this);
    public final jb j = new jb(3, this);
    public final sld k = new sld(15, this);
    public int l = 0;
    public int m = 0;
    public boolean u = false;

    public q54(Context context, View view, int i, boolean z) {
        this.b = context;
        this.n = view;
        this.d = i;
        this.e = z;
        this.p = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f = new Handler();
    }

    @Override // defpackage.keq
    public final boolean a() {
        ArrayList arrayList = this.h;
        return arrayList.size() > 0 && ((p54) arrayList.get(0)).a.z.isShowing();
    }

    @Override // defpackage.gyh
    public final boolean b(tmr tmrVar) {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            p54 p54Var = (p54) it.next();
            if (tmrVar == p54Var.b) {
                p54Var.a.c.requestFocus();
                return true;
            }
        }
        if (!tmrVar.hasVisibleItems()) {
            return false;
        }
        k(tmrVar);
        fyh fyhVar = this.w;
        if (fyhVar != null) {
            fyhVar.w(tmrVar);
        }
        return true;
    }

    @Override // defpackage.gyh
    public final void d(fyh fyhVar) {
        this.w = fyhVar;
    }

    @Override // defpackage.keq
    public final void dismiss() {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        if (size > 0) {
            p54[] p54VarArr = (p54[]) arrayList.toArray(new p54[size]);
            for (int i = size - 1; i >= 0; i--) {
                p54 p54Var = p54VarArr[i];
                if (p54Var.a.z.isShowing()) {
                    p54Var.a.dismiss();
                }
            }
        }
    }

    @Override // defpackage.gyh
    public final void e(hxh hxhVar, boolean z) {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (hxhVar == ((p54) arrayList.get(i)).b) {
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
            ((p54) arrayList.get(i2)).b.c(false);
        }
        p54 p54Var = (p54) arrayList.remove(i);
        hxh hxhVar2 = p54Var.b;
        eyh eyhVar = p54Var.a;
        or0 or0Var = eyhVar.z;
        hxhVar2.r(this);
        if (this.z) {
            byh.b(or0Var, null);
            or0Var.setAnimationStyle(0);
        }
        eyhVar.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.p = ((p54) arrayList.get(size2 - 1)).c;
        } else {
            this.p = this.n.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((p54) arrayList.get(0)).b.c(false);
                return;
            }
            return;
        }
        dismiss();
        fyh fyhVar = this.w;
        if (fyhVar != null) {
            fyhVar.e(hxhVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.x;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.x.removeGlobalOnLayoutListener(this.i);
            }
            this.x = null;
        }
        this.o.removeOnAttachStateChangeListener(this.j);
        this.y.onDismiss();
    }

    @Override // defpackage.keq
    public final void f() {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.g;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            u((hxh) it.next());
        }
        arrayList.clear();
        View view = this.n;
        this.o = view;
        if (view != null) {
            boolean z = this.x == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.x = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.i);
            }
            this.o.addOnAttachStateChangeListener(this.j);
        }
    }

    @Override // defpackage.gyh
    public final void g() {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((p54) it.next()).a.c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((dxh) adapter).notifyDataSetChanged();
        }
    }

    @Override // defpackage.gyh
    public final boolean h() {
        return false;
    }

    @Override // defpackage.yxh
    public final void k(hxh hxhVar) {
        hxhVar.b(this, this.b);
        if (a()) {
            u(hxhVar);
        } else {
            this.g.add(hxhVar);
        }
    }

    @Override // defpackage.yxh
    public final void m(View view) {
        if (this.n != view) {
            this.n = view;
            this.m = Gravity.getAbsoluteGravity(this.l, view.getLayoutDirection());
        }
    }

    @Override // defpackage.yxh
    public final void n(boolean z) {
        this.u = z;
    }

    @Override // defpackage.yxh
    public final void o(int i) {
        if (this.l != i) {
            this.l = i;
            this.m = Gravity.getAbsoluteGravity(i, this.n.getLayoutDirection());
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        p54 p54Var;
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                p54Var = null;
                break;
            }
            p54Var = (p54) arrayList.get(i);
            if (!p54Var.a.z.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (p54Var != null) {
            p54Var.b.c(false);
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

    @Override // defpackage.keq
    public final nra p() {
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((p54) vz1.m(arrayList, 1)).a.c;
    }

    @Override // defpackage.yxh
    public final void q(int i) {
        this.q = true;
        this.s = i;
    }

    @Override // defpackage.yxh
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.y = onDismissListener;
    }

    @Override // defpackage.yxh
    public final void s(boolean z) {
        this.v = z;
    }

    @Override // defpackage.yxh
    public final void t(int i) {
        this.r = true;
        this.t = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0173  */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r17v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(hxh hxhVar) {
        boolean z;
        boolean z2;
        View view;
        p54 p54Var;
        int i;
        int i2;
        int i3;
        int width;
        MenuItem menuItem;
        dxh dxhVar;
        int i4;
        int firstVisiblePosition;
        Context context = this.b;
        LayoutInflater from = LayoutInflater.from(context);
        dxh dxhVar2 = new dxh(hxhVar, from, this.e, R.layout.abc_cascading_menu_item_layout);
        if (!a() && this.u) {
            dxhVar2.c = true;
        } else if (a()) {
            int size = hxhVar.f.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size) {
                    z = false;
                    break;
                }
                MenuItem item = hxhVar.getItem(i5);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i5++;
            }
            dxhVar2.c = z;
        }
        int l = yxh.l(dxhVar2, context, this.c);
        eyh eyhVar = new eyh(context, null, this.d, 0);
        eyhVar.C = this.k;
        eyhVar.p = this;
        or0 or0Var = eyhVar.z;
        or0Var.setOnDismissListener(this);
        eyhVar.o = this.n;
        eyhVar.l = this.m;
        eyhVar.y = true;
        or0Var.setFocusable(true);
        or0Var.setInputMethodMode(2);
        eyhVar.o(dxhVar2);
        eyhVar.r(l);
        eyhVar.l = this.m;
        ArrayList arrayList = this.h;
        if (arrayList.size() > 0) {
            p54Var = (p54) vz1.m(arrayList, 1);
            hxh hxhVar2 = p54Var.b;
            int size2 = hxhVar2.f.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size2) {
                    menuItem = null;
                    break;
                }
                menuItem = hxhVar2.getItem(i6);
                if (menuItem.hasSubMenu() && hxhVar == menuItem.getSubMenu()) {
                    break;
                } else {
                    i6++;
                }
            }
            if (menuItem == null) {
                z2 = 0;
                view = null;
            } else {
                nra nraVar = p54Var.a.c;
                ListAdapter adapter = nraVar.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i4 = headerViewListAdapter.getHeadersCount();
                    dxhVar = (dxh) headerViewListAdapter.getWrappedAdapter();
                } else {
                    dxhVar = (dxh) adapter;
                    i4 = 0;
                }
                int count = dxhVar.getCount();
                int i7 = 0;
                boolean z3 = false;
                while (true) {
                    if (i7 >= count) {
                        i7 = -1;
                        break;
                    } else if (menuItem == dxhVar.getItem(i7)) {
                        break;
                    } else {
                        i7++;
                    }
                }
                if (i7 != -1 && (firstVisiblePosition = (i7 + i4) - nraVar.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < nraVar.getChildCount()) {
                    view = nraVar.getChildAt(firstVisiblePosition);
                    z2 = z3;
                } else {
                    view = null;
                    z2 = z3;
                }
            }
        } else {
            z2 = 0;
            view = null;
            p54Var = null;
        }
        if (view != null) {
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = eyh.D;
                if (method != null) {
                    try {
                        Object[] objArr = new Object[1];
                        objArr[z2] = Boolean.FALSE;
                        method.invoke(or0Var, objArr);
                    } catch (Exception unused) {
                        Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    }
                }
            } else {
                cyh.a(or0Var, z2);
            }
            byh.a(or0Var, null);
            nra nraVar2 = ((p54) arrayList.get(arrayList.size() - 1)).a.c;
            int[] iArr = new int[2];
            nraVar2.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            this.o.getWindowVisibleDisplayFrame(rect);
            if (this.p == 1) {
                if (nraVar2.getWidth() + iArr[0] + l > rect.right) {
                    i = 0;
                    boolean z4 = i != 1;
                    this.p = i;
                    if (Build.VERSION.SDK_INT < 26) {
                        eyhVar.o = view;
                        i2 = 0;
                        i3 = 0;
                    } else {
                        int[] iArr2 = new int[2];
                        this.n.getLocationOnScreen(iArr2);
                        int[] iArr3 = new int[2];
                        view.getLocationOnScreen(iArr3);
                        if ((this.m & 7) == 5) {
                            iArr2[0] = this.n.getWidth() + iArr2[0];
                            iArr3[0] = view.getWidth() + iArr3[0];
                        }
                        int i8 = iArr3[0] - iArr2[0];
                        i2 = iArr3[1] - iArr2[1];
                        i3 = i8;
                    }
                    if ((this.m & 5) == 5) {
                        if (z4) {
                            width = i3 + view.getWidth();
                            eyhVar.f = width;
                            eyhVar.k = true;
                            eyhVar.j = true;
                            eyhVar.j(i2);
                        }
                        width = i3 - l;
                        eyhVar.f = width;
                        eyhVar.k = true;
                        eyhVar.j = true;
                        eyhVar.j(i2);
                    } else if (z4) {
                        width = i3 + l;
                        eyhVar.f = width;
                        eyhVar.k = true;
                        eyhVar.j = true;
                        eyhVar.j(i2);
                    } else {
                        l = view.getWidth();
                        width = i3 - l;
                        eyhVar.f = width;
                        eyhVar.k = true;
                        eyhVar.j = true;
                        eyhVar.j(i2);
                    }
                }
                i = 1;
                if (i != 1) {
                }
                this.p = i;
                if (Build.VERSION.SDK_INT < 26) {
                }
                if ((this.m & 5) == 5) {
                }
            } else {
                if (iArr[0] - l >= 0) {
                    i = 0;
                    if (i != 1) {
                    }
                    this.p = i;
                    if (Build.VERSION.SDK_INT < 26) {
                    }
                    if ((this.m & 5) == 5) {
                    }
                }
                i = 1;
                if (i != 1) {
                }
                this.p = i;
                if (Build.VERSION.SDK_INT < 26) {
                }
                if ((this.m & 5) == 5) {
                }
            }
        } else {
            if (this.q) {
                eyhVar.f = this.s;
            }
            if (this.r) {
                eyhVar.j(this.t);
            }
            Rect rect2 = this.a;
            eyhVar.x = rect2 != null ? new Rect(rect2) : null;
        }
        arrayList.add(new p54(eyhVar, hxhVar, this.p));
        eyhVar.f();
        nra nraVar3 = eyhVar.c;
        nraVar3.setOnKeyListener(this);
        if (p54Var == null && this.v && hxhVar.m != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) nraVar3, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(hxhVar.m);
            nraVar3.addHeaderView(frameLayout, null, false);
            eyhVar.f();
        }
    }
}
