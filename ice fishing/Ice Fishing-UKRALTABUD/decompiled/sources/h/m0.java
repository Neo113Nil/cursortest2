package h;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import f.InterfaceC0136a;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class m0 implements g.p {

    /* renamed from: f, reason: collision with root package name */
    public g.j f2224f;

    /* renamed from: g, reason: collision with root package name */
    public g.k f2225g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Toolbar f2226h;

    public m0(Toolbar toolbar) {
        this.f2226h = toolbar;
    }

    @Override // g.p
    public final void b() {
        if (this.f2225g != null) {
            g.j jVar = this.f2224f;
            if (jVar != null) {
                int size = jVar.f1969f.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (this.f2224f.getItem(i2) == this.f2225g) {
                        return;
                    }
                }
            }
            k(this.f2225g);
        }
    }

    @Override // g.p
    public final boolean d(g.t tVar) {
        return false;
    }

    @Override // g.p
    public final boolean h() {
        return false;
    }

    @Override // g.p
    public final void i(Context context, g.j jVar) {
        g.k kVar;
        g.j jVar2 = this.f2224f;
        if (jVar2 != null && (kVar = this.f2225g) != null) {
            jVar2.d(kVar);
        }
        this.f2224f = jVar;
    }

    @Override // g.p
    public final boolean j(g.k kVar) {
        Toolbar toolbar = this.f2226h;
        toolbar.c();
        ViewParent parent = toolbar.f1273m.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f1273m);
            }
            toolbar.addView(toolbar.f1273m);
        }
        View view = kVar.f2009z;
        if (view == null) {
            view = null;
        }
        toolbar.f1274n = view;
        this.f2225g = kVar;
        ViewParent parent2 = view.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f1274n);
            }
            n0 g2 = Toolbar.g();
            g2.f2233a = (toolbar.f1278s & 112) | 8388611;
            g2.f2234b = 2;
            toolbar.f1274n.setLayoutParams(g2);
            toolbar.addView(toolbar.f1274n);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((n0) childAt.getLayoutParams()).f2234b != 2 && childAt != toolbar.f1266f) {
                toolbar.removeViewAt(childCount);
                toolbar.f1259J.add(childAt);
            }
        }
        toolbar.requestLayout();
        kVar.f1984B = true;
        kVar.f1998n.o(false);
        KeyEvent.Callback callback = toolbar.f1274n;
        if (callback instanceof InterfaceC0136a) {
            SearchView searchView = (SearchView) ((InterfaceC0136a) callback);
            if (!searchView.f1196e0) {
                searchView.f1196e0 = true;
                SearchView.SearchAutoComplete searchAutoComplete = searchView.f1201u;
                int imeOptions = searchAutoComplete.getImeOptions();
                searchView.f1197f0 = imeOptions;
                searchAutoComplete.setImeOptions(imeOptions | 33554432);
                searchAutoComplete.setText("");
                searchView.setIconified(false);
            }
        }
        return true;
    }

    @Override // g.p
    public final boolean k(g.k kVar) {
        Toolbar toolbar = this.f2226h;
        KeyEvent.Callback callback = toolbar.f1274n;
        if (callback instanceof InterfaceC0136a) {
            SearchView searchView = (SearchView) ((InterfaceC0136a) callback);
            SearchView.SearchAutoComplete searchAutoComplete = searchView.f1201u;
            searchAutoComplete.setText("");
            searchAutoComplete.setSelection(searchAutoComplete.length());
            searchView.f1195d0 = "";
            searchView.clearFocus();
            searchView.u(true);
            searchAutoComplete.setImeOptions(searchView.f1197f0);
            searchView.f1196e0 = false;
        }
        toolbar.removeView(toolbar.f1274n);
        toolbar.removeView(toolbar.f1273m);
        toolbar.f1274n = null;
        ArrayList arrayList = toolbar.f1259J;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f2225g = null;
        toolbar.requestLayout();
        kVar.f1984B = false;
        kVar.f1998n.o(false);
        return true;
    }

    @Override // g.p
    public final void a(g.j jVar, boolean z2) {
    }
}
