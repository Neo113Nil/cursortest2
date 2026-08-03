package m;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class o1 implements l.n {

    /* renamed from: g, reason: collision with root package name */
    public l.h f4420g;

    /* renamed from: h, reason: collision with root package name */
    public l.i f4421h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Toolbar f4422i;

    public o1(Toolbar toolbar) {
        this.f4422i = toolbar;
    }

    @Override // l.n
    public final void c() {
        if (this.f4421h != null) {
            l.h hVar = this.f4420g;
            if (hVar != null) {
                int size = hVar.f3695f.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (this.f4420g.getItem(i10) == this.f4421h) {
                        return;
                    }
                }
            }
            k(this.f4421h);
        }
    }

    @Override // l.n
    public final boolean f(l.i iVar) {
        Toolbar toolbar = this.f4422i;
        toolbar.c();
        ViewParent parent = toolbar.f465n.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f465n);
            }
            toolbar.addView(toolbar.f465n);
        }
        View view = iVar.f3735z;
        if (view == null) {
            view = null;
        }
        toolbar.f466o = view;
        this.f4421h = iVar;
        ViewParent parent2 = view.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f466o);
            }
            p1 g8 = Toolbar.g();
            g8.f4425a = (toolbar.f471t & 112) | 8388611;
            g8.f4426b = 2;
            toolbar.f466o.setLayoutParams(g8);
            toolbar.addView(toolbar.f466o);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((p1) childAt.getLayoutParams()).f4426b != 2 && childAt != toolbar.f458g) {
                toolbar.removeViewAt(childCount);
                toolbar.K.add(childAt);
            }
        }
        toolbar.requestLayout();
        iVar.B = true;
        iVar.f3723n.o(false);
        KeyEvent.Callback callback = toolbar.f466o;
        if (callback instanceof k.a) {
            SearchView searchView = (SearchView) ((k.a) callback);
            SearchView.SearchAutoComplete searchAutoComplete = searchView.f449v;
            if (!searchView.f443f0) {
                searchView.f443f0 = true;
                int imeOptions = searchAutoComplete.getImeOptions();
                searchView.f444g0 = imeOptions;
                searchAutoComplete.setImeOptions(imeOptions | 33554432);
                searchAutoComplete.setText("");
                searchView.setIconified(false);
            }
        }
        return true;
    }

    @Override // l.n
    public final void g(Context context, l.h hVar) {
        l.i iVar;
        l.h hVar2 = this.f4420g;
        if (hVar2 != null && (iVar = this.f4421h) != null) {
            hVar2.d(iVar);
        }
        this.f4420g = hVar;
    }

    @Override // l.n
    public final boolean h() {
        return false;
    }

    @Override // l.n
    public final boolean i(l.r rVar) {
        return false;
    }

    @Override // l.n
    public final boolean k(l.i iVar) {
        Toolbar toolbar = this.f4422i;
        KeyEvent.Callback callback = toolbar.f466o;
        if (callback instanceof k.a) {
            SearchView searchView = (SearchView) ((k.a) callback);
            SearchView.SearchAutoComplete searchAutoComplete = searchView.f449v;
            searchAutoComplete.setText("");
            searchAutoComplete.setSelection(searchAutoComplete.length());
            searchView.f442e0 = "";
            searchView.clearFocus();
            searchView.u(true);
            searchAutoComplete.setImeOptions(searchView.f444g0);
            searchView.f443f0 = false;
        }
        toolbar.removeView(toolbar.f466o);
        toolbar.removeView(toolbar.f465n);
        toolbar.f466o = null;
        ArrayList arrayList = toolbar.K;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f4421h = null;
        toolbar.requestLayout();
        iVar.B = false;
        iVar.f3723n.o(false);
        return true;
    }

    @Override // l.n
    public final void a(l.h hVar, boolean z10) {
    }
}
