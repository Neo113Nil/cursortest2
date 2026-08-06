package h;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import f.InterfaceC0146a;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j0 implements g.p {

    /* renamed from: a, reason: collision with root package name */
    public g.j f3275a;

    /* renamed from: b, reason: collision with root package name */
    public g.k f3276b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Toolbar f3277c;

    public j0(Toolbar toolbar) {
        this.f3277c = toolbar;
    }

    @Override // g.p
    public final boolean b(g.t tVar) {
        return false;
    }

    @Override // g.p
    public final boolean e() {
        return false;
    }

    @Override // g.p
    public final boolean f(g.k kVar) {
        Toolbar toolbar = this.f3277c;
        toolbar.c();
        ViewParent parent = toolbar.f2226h.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f2226h);
            }
            toolbar.addView(toolbar.f2226h);
        }
        View view = kVar.f3096z;
        if (view == null) {
            view = null;
        }
        toolbar.f2227i = view;
        this.f3276b = kVar;
        ViewParent parent2 = view.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f2227i);
            }
            k0 g2 = Toolbar.g();
            g2.f3284a = (toolbar.f2232n & 112) | 8388611;
            g2.f3285b = 2;
            toolbar.f2227i.setLayoutParams(g2);
            toolbar.addView(toolbar.f2227i);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((k0) childAt.getLayoutParams()).f3285b != 2 && childAt != toolbar.f2219a) {
                toolbar.removeViewAt(childCount);
                toolbar.f2213E.add(childAt);
            }
        }
        toolbar.requestLayout();
        kVar.f3071B = true;
        kVar.f3085n.o(false);
        KeyEvent.Callback callback = toolbar.f2227i;
        if (callback instanceof InterfaceC0146a) {
            SearchView searchView = (SearchView) ((InterfaceC0146a) callback);
            if (!searchView.e0) {
                searchView.e0 = true;
                SearchView.SearchAutoComplete searchAutoComplete = searchView.f2157p;
                int imeOptions = searchAutoComplete.getImeOptions();
                searchView.f0 = imeOptions;
                searchAutoComplete.setImeOptions(imeOptions | 33554432);
                searchAutoComplete.setText("");
                searchView.setIconified(false);
            }
        }
        return true;
    }

    @Override // g.p
    public final boolean g(g.k kVar) {
        Toolbar toolbar = this.f3277c;
        KeyEvent.Callback callback = toolbar.f2227i;
        if (callback instanceof InterfaceC0146a) {
            SearchView searchView = (SearchView) ((InterfaceC0146a) callback);
            SearchView.SearchAutoComplete searchAutoComplete = searchView.f2157p;
            searchAutoComplete.setText("");
            searchAutoComplete.setSelection(searchAutoComplete.length());
            searchView.f2152d0 = "";
            searchView.clearFocus();
            searchView.u(true);
            searchAutoComplete.setImeOptions(searchView.f0);
            searchView.e0 = false;
        }
        toolbar.removeView(toolbar.f2227i);
        toolbar.removeView(toolbar.f2226h);
        toolbar.f2227i = null;
        ArrayList arrayList = toolbar.f2213E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f3276b = null;
        toolbar.requestLayout();
        kVar.f3071B = false;
        kVar.f3085n.o(false);
        return true;
    }

    @Override // g.p
    public final void h() {
        if (this.f3276b != null) {
            g.j jVar = this.f3275a;
            if (jVar != null) {
                int size = jVar.f3056f.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (this.f3275a.getItem(i2) == this.f3276b) {
                        return;
                    }
                }
            }
            g(this.f3276b);
        }
    }

    @Override // g.p
    public final void k(Context context, g.j jVar) {
        g.k kVar;
        g.j jVar2 = this.f3275a;
        if (jVar2 != null && (kVar = this.f3276b) != null) {
            jVar2.d(kVar);
        }
        this.f3275a = jVar;
    }

    @Override // g.p
    public final void a(g.j jVar, boolean z2) {
    }
}
