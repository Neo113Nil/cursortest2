package l;

import Q2.C0365j;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import h.DialogInterfaceC4552h;

/* renamed from: l.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4663i implements y, AdapterView.OnItemClickListener {

    /* renamed from: n, reason: collision with root package name */
    public Context f38718n;

    /* renamed from: u, reason: collision with root package name */
    public LayoutInflater f38719u;

    /* renamed from: v, reason: collision with root package name */
    public m f38720v;

    /* renamed from: w, reason: collision with root package name */
    public ExpandedMenuView f38721w;

    /* renamed from: x, reason: collision with root package name */
    public x f38722x;

    /* renamed from: y, reason: collision with root package name */
    public C4662h f38723y;

    public C4663i(ContextWrapper contextWrapper) {
        this.f38718n = contextWrapper;
        this.f38719u = LayoutInflater.from(contextWrapper);
    }

    @Override // l.y
    public final void b(m mVar, boolean z6) {
        x xVar = this.f38722x;
        if (xVar != null) {
            xVar.b(mVar, z6);
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
        C4662h c4662h = this.f38723y;
        if (c4662h != null) {
            c4662h.notifyDataSetChanged();
        }
    }

    @Override // l.y
    public final void g(x xVar) {
        throw null;
    }

    @Override // l.y
    public final void h(Context context, m mVar) {
        if (this.f38718n != null) {
            this.f38718n = context;
            if (this.f38719u == null) {
                this.f38719u = LayoutInflater.from(context);
            }
        }
        this.f38720v = mVar;
        C4662h c4662h = this.f38723y;
        if (c4662h != null) {
            c4662h.notifyDataSetChanged();
        }
    }

    @Override // l.y
    public final boolean i(SubMenuC4654E subMenuC4654E) {
        if (!subMenuC4654E.hasVisibleItems()) {
            return false;
        }
        n nVar = new n();
        nVar.f38754n = subMenuC4654E;
        Context context = subMenuC4654E.f38747n;
        I1.a aVar = new I1.a(context);
        C0365j c0365j = (C0365j) aVar.f1304v;
        C4663i c4663i = new C4663i((ContextThemeWrapper) c0365j.f2568v);
        nVar.f38756v = c4663i;
        c4663i.f38722x = nVar;
        subMenuC4654E.b(c4663i, context);
        C4663i c4663i2 = nVar.f38756v;
        if (c4663i2.f38723y == null) {
            c4663i2.f38723y = new C4662h(c4663i2);
        }
        c0365j.f2564B = c4663i2.f38723y;
        c0365j.f2565C = nVar;
        View view = subMenuC4654E.f38738H;
        if (view != null) {
            c0365j.f2572z = view;
        } else {
            c0365j.f2570x = subMenuC4654E.f38737G;
            c0365j.f2571y = subMenuC4654E.f38736F;
        }
        c0365j.f2563A = nVar;
        DialogInterfaceC4552h b9 = aVar.b();
        nVar.f38755u = b9;
        b9.setOnDismissListener(nVar);
        WindowManager.LayoutParams attributes = nVar.f38755u.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        nVar.f38755u.show();
        x xVar = this.f38722x;
        if (xVar == null) {
            return true;
        }
        xVar.e(subMenuC4654E);
        return true;
    }

    @Override // l.y
    public final boolean j(o oVar) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j6) {
        this.f38720v.q(this.f38723y.getItem(i), this, 0);
    }
}
