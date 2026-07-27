package l;

import O2.C0360j;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import h.DialogInterfaceC4548h;

/* renamed from: l.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4652i implements y, AdapterView.OnItemClickListener {

    /* renamed from: n, reason: collision with root package name */
    public Context f38791n;

    /* renamed from: u, reason: collision with root package name */
    public LayoutInflater f38792u;

    /* renamed from: v, reason: collision with root package name */
    public m f38793v;

    /* renamed from: w, reason: collision with root package name */
    public ExpandedMenuView f38794w;

    /* renamed from: x, reason: collision with root package name */
    public x f38795x;

    /* renamed from: y, reason: collision with root package name */
    public C4651h f38796y;

    public C4652i(ContextWrapper contextWrapper) {
        this.f38791n = contextWrapper;
        this.f38792u = LayoutInflater.from(contextWrapper);
    }

    @Override // l.y
    public final void b(m mVar, boolean z3) {
        x xVar = this.f38795x;
        if (xVar != null) {
            xVar.b(mVar, z3);
        }
    }

    @Override // l.y
    public final boolean c(o oVar) {
        return false;
    }

    @Override // l.y
    public final boolean d() {
        return false;
    }

    @Override // l.y
    public final void e() {
        C4651h c4651h = this.f38796y;
        if (c4651h != null) {
            c4651h.notifyDataSetChanged();
        }
    }

    @Override // l.y
    public final void g(x xVar) {
        throw null;
    }

    @Override // l.y
    public final void h(Context context, m mVar) {
        if (this.f38791n != null) {
            this.f38791n = context;
            if (this.f38792u == null) {
                this.f38792u = LayoutInflater.from(context);
            }
        }
        this.f38793v = mVar;
        C4651h c4651h = this.f38796y;
        if (c4651h != null) {
            c4651h.notifyDataSetChanged();
        }
    }

    @Override // l.y
    public final boolean i(SubMenuC4643E subMenuC4643E) {
        if (!subMenuC4643E.hasVisibleItems()) {
            return false;
        }
        n nVar = new n();
        nVar.f38827n = subMenuC4643E;
        Context context = subMenuC4643E.f38820n;
        G1.a aVar = new G1.a(context);
        C0360j c0360j = (C0360j) aVar.f1051v;
        C4652i c4652i = new C4652i((ContextThemeWrapper) c0360j.f2250v);
        nVar.f38829v = c4652i;
        c4652i.f38795x = nVar;
        subMenuC4643E.b(c4652i, context);
        C4652i c4652i2 = nVar.f38829v;
        if (c4652i2.f38796y == null) {
            c4652i2.f38796y = new C4651h(c4652i2);
        }
        c0360j.f2246B = c4652i2.f38796y;
        c0360j.f2247C = nVar;
        View view = subMenuC4643E.f38811H;
        if (view != null) {
            c0360j.f2254z = view;
        } else {
            c0360j.f2252x = subMenuC4643E.f38810G;
            c0360j.f2253y = subMenuC4643E.f38809F;
        }
        c0360j.f2245A = nVar;
        DialogInterfaceC4548h c9 = aVar.c();
        nVar.f38828u = c9;
        c9.setOnDismissListener(nVar);
        WindowManager.LayoutParams attributes = nVar.f38828u.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        nVar.f38828u.show();
        x xVar = this.f38795x;
        if (xVar == null) {
            return true;
        }
        xVar.j(subMenuC4643E);
        return true;
    }

    @Override // l.y
    public final boolean j(o oVar) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j6) {
        this.f38793v.q(this.f38796y.getItem(i), this, 0);
    }
}
