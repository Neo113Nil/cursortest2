package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import h.C0161b;
import h.DialogInterfaceC0165f;

/* renamed from: l.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0225i implements y, AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public Context f3698a;

    /* renamed from: b, reason: collision with root package name */
    public LayoutInflater f3699b;

    /* renamed from: c, reason: collision with root package name */
    public MenuC0229m f3700c;

    /* renamed from: d, reason: collision with root package name */
    public ExpandedMenuView f3701d;
    public x e;

    /* renamed from: f, reason: collision with root package name */
    public C0224h f3702f;

    public C0225i(ContextWrapper contextWrapper) {
        this.f3698a = contextWrapper;
        this.f3699b = LayoutInflater.from(contextWrapper);
    }

    @Override // l.y
    public final void b(MenuC0229m menuC0229m, boolean z2) {
        x xVar = this.e;
        if (xVar != null) {
            xVar.b(menuC0229m, z2);
        }
    }

    @Override // l.y
    public final void d(Context context, MenuC0229m menuC0229m) {
        if (this.f3698a != null) {
            this.f3698a = context;
            if (this.f3699b == null) {
                this.f3699b = LayoutInflater.from(context);
            }
        }
        this.f3700c = menuC0229m;
        C0224h c0224h = this.f3702f;
        if (c0224h != null) {
            c0224h.notifyDataSetChanged();
        }
    }

    @Override // l.y
    public final boolean e(SubMenuC0216E subMenuC0216E) {
        if (!subMenuC0216E.hasVisibleItems()) {
            return false;
        }
        n nVar = new n();
        nVar.f3730a = subMenuC0216E;
        Context context = subMenuC0216E.f3709a;
        B0.g gVar = new B0.g(context);
        C0161b c0161b = (C0161b) gVar.f47b;
        C0225i c0225i = new C0225i(c0161b.f3179a);
        nVar.f3732c = c0225i;
        c0225i.e = nVar;
        subMenuC0216E.b(c0225i, context);
        C0225i c0225i2 = nVar.f3732c;
        if (c0225i2.f3702f == null) {
            c0225i2.f3702f = new C0224h(c0225i2);
        }
        c0161b.f3184g = c0225i2.f3702f;
        c0161b.f3185h = nVar;
        View view = subMenuC0216E.f3720o;
        if (view != null) {
            c0161b.e = view;
        } else {
            c0161b.f3181c = subMenuC0216E.f3719n;
            c0161b.f3182d = subMenuC0216E.f3718m;
        }
        c0161b.f3183f = nVar;
        DialogInterfaceC0165f b2 = gVar.b();
        nVar.f3731b = b2;
        b2.setOnDismissListener(nVar);
        WindowManager.LayoutParams attributes = nVar.f3731b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        nVar.f3731b.show();
        x xVar = this.e;
        if (xVar == null) {
            return true;
        }
        xVar.j(subMenuC0216E);
        return true;
    }

    @Override // l.y
    public final int f() {
        return 0;
    }

    @Override // l.y
    public final void h(x xVar) {
        throw null;
    }

    @Override // l.y
    public final boolean i(o oVar) {
        return false;
    }

    @Override // l.y
    public final boolean j() {
        return false;
    }

    @Override // l.y
    public final boolean k(o oVar) {
        return false;
    }

    @Override // l.y
    public final Parcelable l() {
        if (this.f3701d == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f3701d;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    @Override // l.y
    public final void m(boolean z2) {
        C0224h c0224h = this.f3702f;
        if (c0224h != null) {
            c0224h.notifyDataSetChanged();
        }
    }

    @Override // l.y
    public final void n(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f3701d.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f3700c.q(this.f3702f.getItem(i), this, 0);
    }
}
