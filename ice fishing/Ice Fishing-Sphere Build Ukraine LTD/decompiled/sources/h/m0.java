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

    /* renamed from: e, reason: collision with root package name */
    public g.j f2232e;

    /* renamed from: f, reason: collision with root package name */
    public g.k f2233f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Toolbar f2234g;

    public m0(Toolbar toolbar) {
        this.f2234g = toolbar;
    }

    @Override // g.p
    public final void b() {
        if (this.f2233f != null) {
            g.j jVar = this.f2232e;
            if (jVar != null) {
                int size = jVar.f1977f.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (this.f2232e.getItem(i2) == this.f2233f) {
                        return;
                    }
                }
            }
            k(this.f2233f);
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
        g.j jVar2 = this.f2232e;
        if (jVar2 != null && (kVar = this.f2233f) != null) {
            jVar2.d(kVar);
        }
        this.f2232e = jVar;
    }

    @Override // g.p
    public final boolean j(g.k kVar) {
        Toolbar toolbar = this.f2234g;
        toolbar.c();
        ViewParent parent = toolbar.f1280l.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f1280l);
            }
            toolbar.addView(toolbar.f1280l);
        }
        View view = kVar.f2017z;
        if (view == null) {
            view = null;
        }
        toolbar.f1281m = view;
        this.f2233f = kVar;
        ViewParent parent2 = view.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f1281m);
            }
            n0 g2 = Toolbar.g();
            g2.f2241a = (toolbar.r & 112) | 8388611;
            g2.f2242b = 2;
            toolbar.f1281m.setLayoutParams(g2);
            toolbar.addView(toolbar.f1281m);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((n0) childAt.getLayoutParams()).f2242b != 2 && childAt != toolbar.f1273e) {
                toolbar.removeViewAt(childCount);
                toolbar.f1266I.add(childAt);
            }
        }
        toolbar.requestLayout();
        kVar.f1992B = true;
        kVar.f2006n.o(false);
        KeyEvent.Callback callback = toolbar.f1281m;
        if (callback instanceof InterfaceC0136a) {
            SearchView searchView = (SearchView) ((InterfaceC0136a) callback);
            if (!searchView.f1202d0) {
                searchView.f1202d0 = true;
                SearchView.SearchAutoComplete searchAutoComplete = searchView.f1208t;
                int imeOptions = searchAutoComplete.getImeOptions();
                searchView.f1203e0 = imeOptions;
                searchAutoComplete.setImeOptions(imeOptions | 33554432);
                searchAutoComplete.setText("");
                searchView.setIconified(false);
            }
        }
        return true;
    }

    @Override // g.p
    public final boolean k(g.k kVar) {
        Toolbar toolbar = this.f2234g;
        KeyEvent.Callback callback = toolbar.f1281m;
        if (callback instanceof InterfaceC0136a) {
            SearchView searchView = (SearchView) ((InterfaceC0136a) callback);
            SearchView.SearchAutoComplete searchAutoComplete = searchView.f1208t;
            searchAutoComplete.setText("");
            searchAutoComplete.setSelection(searchAutoComplete.length());
            searchView.f1201c0 = "";
            searchView.clearFocus();
            searchView.u(true);
            searchAutoComplete.setImeOptions(searchView.f1203e0);
            searchView.f1202d0 = false;
        }
        toolbar.removeView(toolbar.f1281m);
        toolbar.removeView(toolbar.f1280l);
        toolbar.f1281m = null;
        ArrayList arrayList = toolbar.f1266I;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f2233f = null;
        toolbar.requestLayout();
        kVar.f1992B = false;
        kVar.f2006n.o(false);
        return true;
    }

    @Override // g.p
    public final void a(g.j jVar, boolean z2) {
    }
}
