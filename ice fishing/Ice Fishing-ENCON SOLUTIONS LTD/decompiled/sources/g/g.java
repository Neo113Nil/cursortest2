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
import com.watchfacestudio.spraktum.R;
import h.C0204K;
import h.L;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import y.x;

/* loaded from: classes.dex */
public final class g extends l implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: b, reason: collision with root package name */
    public final Context f3020b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3021c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3022d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3023e;

    /* renamed from: f, reason: collision with root package name */
    public final Handler f3024f;

    /* renamed from: i, reason: collision with root package name */
    public final c f3027i;

    /* renamed from: j, reason: collision with root package name */
    public final d f3028j;

    /* renamed from: n, reason: collision with root package name */
    public View f3032n;

    /* renamed from: o, reason: collision with root package name */
    public View f3033o;

    /* renamed from: p, reason: collision with root package name */
    public int f3034p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3035q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3036r;

    /* renamed from: s, reason: collision with root package name */
    public int f3037s;
    public int t;

    /* renamed from: v, reason: collision with root package name */
    public boolean f3039v;

    /* renamed from: w, reason: collision with root package name */
    public o f3040w;

    /* renamed from: x, reason: collision with root package name */
    public ViewTreeObserver f3041x;

    /* renamed from: y, reason: collision with root package name */
    public m f3042y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f3043z;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f3025g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f3026h = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public final Z0.i f3029k = new Z0.i(17, this);

    /* renamed from: l, reason: collision with root package name */
    public int f3030l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f3031m = 0;

    /* renamed from: u, reason: collision with root package name */
    public boolean f3038u = false;

    public g(Context context, View view, int i2, boolean z2) {
        this.f3027i = new c(this, r0);
        this.f3028j = new d(this, r0);
        this.f3020b = context;
        this.f3032n = view;
        this.f3022d = i2;
        this.f3023e = z2;
        Field field = x.f8596a;
        this.f3034p = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f3021c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f3024f = new Handler();
    }

    @Override // g.p
    public final void a(j jVar, boolean z2) {
        ArrayList arrayList = this.f3026h;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (jVar == ((f) arrayList.get(i2)).f3018b) {
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
            ((f) arrayList.get(i3)).f3018b.c(false);
        }
        f fVar = (f) arrayList.remove(i2);
        CopyOnWriteArrayList copyOnWriteArrayList = fVar.f3018b.f3068r;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            p pVar = (p) weakReference.get();
            if (pVar == null || pVar == this) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        boolean z3 = this.f3043z;
        L l2 = fVar.f3017a;
        if (z3) {
            l2.f3178v.setExitTransition(null);
            l2.f3178v.setAnimationStyle(0);
        }
        l2.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f3034p = ((f) arrayList.get(size2 - 1)).f3019c;
        } else {
            View view = this.f3032n;
            Field field = x.f8596a;
            this.f3034p = view.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z2) {
                ((f) arrayList.get(0)).f3018b.c(false);
                return;
            }
            return;
        }
        dismiss();
        o oVar = this.f3040w;
        if (oVar != null) {
            oVar.a(jVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f3041x;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f3041x.removeGlobalOnLayoutListener(this.f3027i);
            }
            this.f3041x = null;
        }
        this.f3033o.removeOnAttachStateChangeListener(this.f3028j);
        this.f3042y.onDismiss();
    }

    @Override // g.p
    public final boolean b(t tVar) {
        Iterator it = this.f3026h.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            if (tVar == fVar.f3018b) {
                fVar.f3017a.f3160c.requestFocus();
                return true;
            }
        }
        if (!tVar.hasVisibleItems()) {
            return false;
        }
        l(tVar);
        o oVar = this.f3040w;
        if (oVar != null) {
            oVar.e(tVar);
        }
        return true;
    }

    @Override // g.r
    public final void c() {
        if (i()) {
            return;
        }
        ArrayList arrayList = this.f3025g;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            v((j) it.next());
        }
        arrayList.clear();
        View view = this.f3032n;
        this.f3033o = view;
        if (view != null) {
            boolean z2 = this.f3041x == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f3041x = viewTreeObserver;
            if (z2) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f3027i);
            }
            this.f3033o.addOnAttachStateChangeListener(this.f3028j);
        }
    }

    @Override // g.p
    public final void d(o oVar) {
        this.f3040w = oVar;
    }

    @Override // g.r
    public final void dismiss() {
        ArrayList arrayList = this.f3026h;
        int size = arrayList.size();
        if (size > 0) {
            f[] fVarArr = (f[]) arrayList.toArray(new f[size]);
            for (int i2 = size - 1; i2 >= 0; i2--) {
                f fVar = fVarArr[i2];
                if (fVar.f3017a.f3178v.isShowing()) {
                    fVar.f3017a.dismiss();
                }
            }
        }
    }

    @Override // g.p
    public final boolean e() {
        return false;
    }

    @Override // g.p
    public final void h() {
        Iterator it = this.f3026h.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((f) it.next()).f3017a.f3160c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((h) adapter).notifyDataSetChanged();
        }
    }

    @Override // g.r
    public final boolean i() {
        ArrayList arrayList = this.f3026h;
        return arrayList.size() > 0 && ((f) arrayList.get(0)).f3017a.f3178v.isShowing();
    }

    @Override // g.r
    public final ListView j() {
        ArrayList arrayList = this.f3026h;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((f) arrayList.get(arrayList.size() - 1)).f3017a.f3160c;
    }

    @Override // g.l
    public final void l(j jVar) {
        jVar.b(this, this.f3020b);
        if (i()) {
            v(jVar);
        } else {
            this.f3025g.add(jVar);
        }
    }

    @Override // g.l
    public final void n(View view) {
        if (this.f3032n != view) {
            this.f3032n = view;
            int i2 = this.f3030l;
            Field field = x.f8596a;
            this.f3031m = Gravity.getAbsoluteGravity(i2, view.getLayoutDirection());
        }
    }

    @Override // g.l
    public final void o(boolean z2) {
        this.f3038u = z2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        f fVar;
        ArrayList arrayList = this.f3026h;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                fVar = null;
                break;
            }
            fVar = (f) arrayList.get(i2);
            if (!fVar.f3017a.f3178v.isShowing()) {
                break;
            } else {
                i2++;
            }
        }
        if (fVar != null) {
            fVar.f3018b.c(false);
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
        if (this.f3030l != i2) {
            this.f3030l = i2;
            View view = this.f3032n;
            Field field = x.f8596a;
            this.f3031m = Gravity.getAbsoluteGravity(i2, view.getLayoutDirection());
        }
    }

    @Override // g.l
    public final void q(int i2) {
        this.f3035q = true;
        this.f3037s = i2;
    }

    @Override // g.l
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f3042y = (m) onDismissListener;
    }

    @Override // g.l
    public final void s(boolean z2) {
        this.f3039v = z2;
    }

    @Override // g.l
    public final void t(int i2) {
        this.f3036r = true;
        this.t = i2;
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
        f fVar;
        View view;
        int i2;
        char c2;
        int i3;
        int i4;
        int width;
        MenuItem menuItem;
        h hVar;
        int i5;
        int firstVisiblePosition;
        Context context = this.f3020b;
        LayoutInflater from = LayoutInflater.from(context);
        h hVar2 = new h(jVar, from, this.f3023e, R.layout.abc_cascading_menu_item_layout);
        if (!i() && this.f3038u) {
            hVar2.f3046c = true;
        } else if (i()) {
            hVar2.f3046c = l.u(jVar);
        }
        int m2 = l.m(hVar2, context, this.f3021c);
        L l2 = new L(context, this.f3022d);
        l2.f3184y = this.f3029k;
        l2.f3170m = this;
        l2.f3178v.setOnDismissListener(this);
        l2.f3169l = this.f3032n;
        l2.f3167j = this.f3031m;
        l2.f3177u = true;
        l2.f3178v.setFocusable(true);
        l2.f3178v.setInputMethodMode(2);
        l2.a(hVar2);
        Drawable background = l2.f3178v.getBackground();
        if (background != null) {
            Rect rect = l2.f3176s;
            background.getPadding(rect);
            l2.f3161d = rect.left + rect.right + m2;
        } else {
            l2.f3161d = m2;
        }
        l2.f3167j = this.f3031m;
        ArrayList arrayList = this.f3026h;
        if (arrayList.size() > 0) {
            fVar = (f) arrayList.get(arrayList.size() - 1);
            j jVar2 = fVar.f3018b;
            int size = jVar2.f3056f.size();
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
                C0204K c0204k = fVar.f3017a.f3160c;
                ListAdapter adapter = c0204k.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i5 = headerViewListAdapter.getHeadersCount();
                    hVar = (h) headerViewListAdapter.getWrappedAdapter();
                } else {
                    hVar = (h) adapter;
                    i5 = 0;
                }
                int count = hVar.getCount();
                int i7 = 0;
                while (true) {
                    if (i7 >= count) {
                        i7 = -1;
                        break;
                    } else if (menuItem == hVar.getItem(i7)) {
                        break;
                    } else {
                        i7++;
                    }
                }
                if (i7 != -1 && (firstVisiblePosition = (i7 + i5) - c0204k.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < c0204k.getChildCount()) {
                    view = c0204k.getChildAt(firstVisiblePosition);
                }
            }
            view = null;
        } else {
            fVar = null;
            view = null;
        }
        if (view != null) {
            int i8 = Build.VERSION.SDK_INT;
            h.r rVar = l2.f3178v;
            if (i8 <= 28) {
                Method method = L.f3183z;
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
            l2.f3178v.setEnterTransition(null);
            C0204K c0204k2 = ((f) arrayList.get(arrayList.size() - 1)).f3017a.f3160c;
            int[] iArr = new int[2];
            c0204k2.getLocationOnScreen(iArr);
            Rect rect2 = new Rect();
            this.f3033o.getWindowVisibleDisplayFrame(rect2);
            if (this.f3034p == 1) {
                if (c0204k2.getWidth() + iArr[0] + m2 > rect2.right) {
                    i2 = 0;
                    boolean z2 = i2 != 1;
                    this.f3034p = i2;
                    if (Build.VERSION.SDK_INT < 26) {
                        l2.f3169l = view;
                        i4 = 0;
                        i3 = 0;
                    } else {
                        int[] iArr2 = new int[2];
                        this.f3032n.getLocationOnScreen(iArr2);
                        int[] iArr3 = new int[2];
                        view.getLocationOnScreen(iArr3);
                        if ((this.f3031m & 7) == 5) {
                            c2 = 0;
                            iArr2[0] = this.f3032n.getWidth() + iArr2[0];
                            iArr3[0] = view.getWidth() + iArr3[0];
                        } else {
                            c2 = 0;
                        }
                        i3 = iArr3[c2] - iArr2[c2];
                        i4 = iArr3[1] - iArr2[1];
                    }
                    if ((this.f3031m & 5) == 5) {
                        if (z2) {
                            width = i3 + view.getWidth();
                            l2.f3162e = width;
                            l2.f3166i = true;
                            l2.f3165h = true;
                            l2.f3163f = i4;
                            l2.f3164g = true;
                        }
                        width = i3 - m2;
                        l2.f3162e = width;
                        l2.f3166i = true;
                        l2.f3165h = true;
                        l2.f3163f = i4;
                        l2.f3164g = true;
                    } else if (z2) {
                        width = i3 + m2;
                        l2.f3162e = width;
                        l2.f3166i = true;
                        l2.f3165h = true;
                        l2.f3163f = i4;
                        l2.f3164g = true;
                    } else {
                        m2 = view.getWidth();
                        width = i3 - m2;
                        l2.f3162e = width;
                        l2.f3166i = true;
                        l2.f3165h = true;
                        l2.f3163f = i4;
                        l2.f3164g = true;
                    }
                }
                i2 = 1;
                if (i2 != 1) {
                }
                this.f3034p = i2;
                if (Build.VERSION.SDK_INT < 26) {
                }
                if ((this.f3031m & 5) == 5) {
                }
            } else {
                if (iArr[0] - m2 >= 0) {
                    i2 = 0;
                    if (i2 != 1) {
                    }
                    this.f3034p = i2;
                    if (Build.VERSION.SDK_INT < 26) {
                    }
                    if ((this.f3031m & 5) == 5) {
                    }
                }
                i2 = 1;
                if (i2 != 1) {
                }
                this.f3034p = i2;
                if (Build.VERSION.SDK_INT < 26) {
                }
                if ((this.f3031m & 5) == 5) {
                }
            }
        } else {
            if (this.f3035q) {
                l2.f3162e = this.f3037s;
            }
            if (this.f3036r) {
                l2.f3163f = this.t;
                l2.f3164g = true;
            }
            Rect rect3 = this.f3097a;
            l2.t = rect3 != null ? new Rect(rect3) : null;
        }
        arrayList.add(new f(l2, jVar, this.f3034p));
        l2.c();
        C0204K c0204k3 = l2.f3160c;
        c0204k3.setOnKeyListener(this);
        if (fVar == null && this.f3039v && jVar.f3062l != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0204k3, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(jVar.f3062l);
            c0204k3.addHeaderView(frameLayout, null, false);
            l2.c();
        }
    }
}
