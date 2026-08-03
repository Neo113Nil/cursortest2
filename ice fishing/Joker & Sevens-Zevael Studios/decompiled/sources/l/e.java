package l;

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
import h3.w;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import m.q0;
import m.r0;
import org.fortheloss.st.R;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e extends j implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public boolean B;
    public m C;
    public ViewTreeObserver D;
    public PopupWindow.OnDismissListener E;
    public boolean F;

    /* renamed from: h, reason: collision with root package name */
    public final Context f3664h;

    /* renamed from: i, reason: collision with root package name */
    public final int f3665i;

    /* renamed from: j, reason: collision with root package name */
    public final int f3666j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f3667k;

    /* renamed from: l, reason: collision with root package name */
    public final Handler f3668l;

    /* renamed from: t, reason: collision with root package name */
    public View f3676t;

    /* renamed from: u, reason: collision with root package name */
    public View f3677u;

    /* renamed from: v, reason: collision with root package name */
    public int f3678v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f3679w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f3680x;

    /* renamed from: y, reason: collision with root package name */
    public int f3681y;

    /* renamed from: z, reason: collision with root package name */
    public int f3682z;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f3669m = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f3670n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final c f3671o = new c(this, 0);

    /* renamed from: p, reason: collision with root package name */
    public final f1.e f3672p = new f1.e(1, this);

    /* renamed from: q, reason: collision with root package name */
    public final f8.c f3673q = new f8.c(22, this);

    /* renamed from: r, reason: collision with root package name */
    public int f3674r = 0;

    /* renamed from: s, reason: collision with root package name */
    public int f3675s = 0;
    public boolean A = false;

    public e(Context context, View view, int i10, boolean z10) {
        this.f3664h = context;
        this.f3676t = view;
        this.f3666j = i10;
        this.f3667k = z10;
        Field field = w.f2829a;
        this.f3678v = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f3665i = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f3668l = new Handler();
    }

    @Override // l.n
    public final void a(h hVar, boolean z10) {
        ArrayList arrayList = this.f3670n;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (hVar == ((d) arrayList.get(i10)).f3662b) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 < 0) {
            return;
        }
        int i11 = i10 + 1;
        if (i11 < arrayList.size()) {
            ((d) arrayList.get(i11)).f3662b.c(false);
        }
        d dVar = (d) arrayList.remove(i10);
        h hVar2 = dVar.f3662b;
        r0 r0Var = dVar.f3661a;
        m.r rVar = r0Var.B;
        CopyOnWriteArrayList copyOnWriteArrayList = hVar2.f3707r;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            n nVar = (n) weakReference.get();
            if (nVar == null || nVar == this) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        if (this.F) {
            rVar.setExitTransition(null);
            rVar.setAnimationStyle(0);
        }
        r0Var.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f3678v = ((d) arrayList.get(size2 - 1)).f3663c;
        } else {
            View view = this.f3676t;
            Field field = w.f2829a;
            this.f3678v = view.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z10) {
                ((d) arrayList.get(0)).f3662b.c(false);
                return;
            }
            return;
        }
        dismiss();
        m mVar = this.C;
        if (mVar != null) {
            mVar.a(hVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.D;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.D.removeGlobalOnLayoutListener(this.f3671o);
            }
            this.D = null;
        }
        this.f3677u.removeOnAttachStateChangeListener(this.f3672p);
        this.E.onDismiss();
    }

    @Override // l.p
    public final void b() {
        if (j()) {
            return;
        }
        ArrayList arrayList = this.f3669m;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            u((h) obj);
        }
        arrayList.clear();
        View view = this.f3676t;
        this.f3677u = view;
        if (view != null) {
            boolean z10 = this.D == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.D = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f3671o);
            }
            this.f3677u.addOnAttachStateChangeListener(this.f3672p);
        }
    }

    @Override // l.n
    public final void c() {
        ArrayList arrayList = this.f3670n;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ListAdapter adapter = ((d) obj).f3661a.f4402i.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((f) adapter).notifyDataSetChanged();
        }
    }

    @Override // l.p
    public final ListView d() {
        ArrayList arrayList = this.f3670n;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((d) arrayList.get(arrayList.size() - 1)).f3661a.f4402i;
    }

    @Override // l.p
    public final void dismiss() {
        ArrayList arrayList = this.f3670n;
        int size = arrayList.size();
        if (size > 0) {
            d[] dVarArr = (d[]) arrayList.toArray(new d[size]);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                d dVar = dVarArr[i10];
                if (dVar.f3661a.B.isShowing()) {
                    dVar.f3661a.dismiss();
                }
            }
        }
    }

    @Override // l.n
    public final void e(m mVar) {
        this.C = mVar;
    }

    @Override // l.n
    public final boolean h() {
        return false;
    }

    @Override // l.n
    public final boolean i(r rVar) {
        ArrayList arrayList = this.f3670n;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            d dVar = (d) obj;
            if (rVar == dVar.f3662b) {
                dVar.f3661a.f4402i.requestFocus();
                return true;
            }
        }
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        l(rVar);
        m mVar = this.C;
        if (mVar != null) {
            mVar.f(rVar);
        }
        return true;
    }

    @Override // l.p
    public final boolean j() {
        ArrayList arrayList = this.f3670n;
        return arrayList.size() > 0 && ((d) arrayList.get(0)).f3661a.B.isShowing();
    }

    @Override // l.j
    public final void l(h hVar) {
        hVar.b(this, this.f3664h);
        if (j()) {
            u(hVar);
        } else {
            this.f3669m.add(hVar);
        }
    }

    @Override // l.j
    public final void n(View view) {
        if (this.f3676t != view) {
            this.f3676t = view;
            int i10 = this.f3674r;
            Field field = w.f2829a;
            this.f3675s = Gravity.getAbsoluteGravity(i10, view.getLayoutDirection());
        }
    }

    @Override // l.j
    public final void o(boolean z10) {
        this.A = z10;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        d dVar;
        ArrayList arrayList = this.f3670n;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                dVar = null;
                break;
            }
            dVar = (d) arrayList.get(i10);
            if (!dVar.f3661a.B.isShowing()) {
                break;
            } else {
                i10++;
            }
        }
        if (dVar != null) {
            dVar.f3662b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i10 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // l.j
    public final void p(int i10) {
        if (this.f3674r != i10) {
            this.f3674r = i10;
            View view = this.f3676t;
            Field field = w.f2829a;
            this.f3675s = Gravity.getAbsoluteGravity(i10, view.getLayoutDirection());
        }
    }

    @Override // l.j
    public final void q(int i10) {
        this.f3679w = true;
        this.f3681y = i10;
    }

    @Override // l.j
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.E = onDismissListener;
    }

    @Override // l.j
    public final void s(boolean z10) {
        this.B = z10;
    }

    @Override // l.j
    public final void t(int i10) {
        this.f3680x = true;
        this.f3682z = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x017b, code lost:
    
        if (((r7.getWidth() + r9[r16]) + r5) > r11.right) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x017d, code lost:
    
        r7 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0181, code lost:
    
        r7 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0186, code lost:
    
        if ((r9[r16] - r5) < 0) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(h hVar) {
        boolean z10;
        int i10;
        int i11;
        d dVar;
        View view;
        int i12;
        MenuItem menuItem;
        f fVar;
        int i13;
        int firstVisiblePosition;
        Context context = this.f3664h;
        LayoutInflater from = LayoutInflater.from(context);
        f fVar2 = new f(hVar, from, this.f3667k, R.layout.abc_cascading_menu_item_layout);
        if (!j() && this.A) {
            fVar2.f3685i = true;
        } else if (j()) {
            int size = hVar.f3695f.size();
            int i14 = 0;
            while (true) {
                if (i14 >= size) {
                    z10 = false;
                    break;
                }
                MenuItem item = hVar.getItem(i14);
                if (item.isVisible() && item.getIcon() != null) {
                    z10 = true;
                    break;
                }
                i14++;
            }
            fVar2.f3685i = z10;
        }
        int m10 = j.m(fVar2, context, this.f3665i);
        r0 r0Var = new r0(context, this.f3666j);
        r0Var.E = this.f3673q;
        r0Var.f4412s = this;
        r0Var.B.setOnDismissListener(this);
        r0Var.f4411r = this.f3676t;
        r0Var.f4409p = this.f3675s;
        r0Var.A = true;
        r0Var.B.setFocusable(true);
        r0Var.B.setInputMethodMode(2);
        r0Var.a(fVar2);
        Drawable background = r0Var.B.getBackground();
        if (background != null) {
            Rect rect = r0Var.f4418y;
            background.getPadding(rect);
            r0Var.f4403j = rect.left + rect.right + m10;
        } else {
            r0Var.f4403j = m10;
        }
        r0Var.f4409p = this.f3675s;
        ArrayList arrayList = this.f3670n;
        if (arrayList.size() > 0) {
            dVar = (d) arrayList.get(arrayList.size() - 1);
            h hVar2 = dVar.f3662b;
            int size2 = hVar2.f3695f.size();
            int i15 = 0;
            while (true) {
                if (i15 >= size2) {
                    menuItem = null;
                    break;
                }
                menuItem = hVar2.getItem(i15);
                if (menuItem.hasSubMenu() && hVar == menuItem.getSubMenu()) {
                    break;
                } else {
                    i15++;
                }
            }
            if (menuItem == null) {
                i10 = 1;
                view = null;
                i11 = 0;
            } else {
                q0 q0Var = dVar.f3661a.f4402i;
                ListAdapter adapter = q0Var.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i13 = headerViewListAdapter.getHeadersCount();
                    fVar = (f) headerViewListAdapter.getWrappedAdapter();
                } else {
                    fVar = (f) adapter;
                    i13 = 0;
                }
                int count = fVar.getCount();
                i10 = 1;
                int i16 = 0;
                i11 = 0;
                while (true) {
                    if (i16 >= count) {
                        i16 = -1;
                        break;
                    } else if (menuItem == fVar.getItem(i16)) {
                        break;
                    } else {
                        i16++;
                    }
                }
                view = (i16 != -1 && (firstVisiblePosition = (i16 + i13) - q0Var.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < q0Var.getChildCount()) ? q0Var.getChildAt(firstVisiblePosition) : null;
            }
        } else {
            i10 = 1;
            i11 = 0;
            dVar = null;
            view = null;
        }
        if (view != null) {
            int i17 = Build.VERSION.SDK_INT;
            m.r rVar = r0Var.B;
            if (i17 <= 28) {
                Method method = r0.F;
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
            r0Var.B.setEnterTransition(null);
            q0 q0Var2 = ((d) arrayList.get(arrayList.size() - 1)).f3661a.f4402i;
            int[] iArr = new int[2];
            q0Var2.getLocationOnScreen(iArr);
            Rect rect2 = new Rect();
            this.f3677u.getWindowVisibleDisplayFrame(rect2);
            if (this.f3678v == i10) {
            }
            int i18 = i12 == 1 ? 1 : i11;
            this.f3678v = i12;
            r0Var.f4411r = view;
            if ((this.f3675s & 5) != 5) {
                m10 = i18 != 0 ? view.getWidth() : 0 - m10;
            } else if (i18 == 0) {
                m10 = 0 - view.getWidth();
            }
            r0Var.f4404k = m10;
            r0Var.f4408o = true;
            r0Var.f4407n = true;
            r0Var.f4405l = i11;
            r0Var.f4406m = true;
        } else {
            if (this.f3679w) {
                r0Var.f4404k = this.f3681y;
            }
            if (this.f3680x) {
                r0Var.f4405l = this.f3682z;
                r0Var.f4406m = true;
            }
            Rect rect3 = this.f3736g;
            r0Var.f4419z = rect3 != null ? new Rect(rect3) : null;
        }
        arrayList.add(new d(r0Var, hVar, this.f3678v));
        r0Var.b();
        q0 q0Var3 = r0Var.f4402i;
        q0Var3.setOnKeyListener(this);
        if (dVar == null && this.B && hVar.f3701l != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) q0Var3, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(hVar.f3701l);
            q0Var3.addHeaderView(frameLayout, null, false);
            r0Var.b();
        }
    }
}
