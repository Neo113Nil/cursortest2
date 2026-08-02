package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import io.requery.android.database.sqlite.SQLiteDatabase;

/* loaded from: classes.dex */
public final class h9g implements gyh, AdapterView.OnItemClickListener {
    public Context a;
    public LayoutInflater b;
    public hxh c;
    public ExpandedMenuView d;
    public fyh e;
    public g9g f;

    public h9g(Context context) {
        this.a = context;
        this.b = LayoutInflater.from(context);
    }

    @Override // defpackage.gyh
    public final boolean b(tmr tmrVar) {
        boolean hasVisibleItems = tmrVar.hasVisibleItems();
        Context context = tmrVar.a;
        if (!hasVisibleItems) {
            return false;
        }
        ixh ixhVar = new ixh();
        ixhVar.a = tmrVar;
        o30 o30Var = new o30(context);
        h9g h9gVar = new h9g(o30Var.getContext());
        ixhVar.c = h9gVar;
        h9gVar.e = ixhVar;
        tmrVar.b(h9gVar, context);
        h9g h9gVar2 = ixhVar.c;
        if (h9gVar2.f == null) {
            h9gVar2.f = new g9g(h9gVar2);
        }
        g9g g9gVar = h9gVar2.f;
        k30 k30Var = o30Var.a;
        k30Var.p = g9gVar;
        k30Var.q = ixhVar;
        View view = tmrVar.o;
        if (view != null) {
            k30Var.e = view;
        } else {
            k30Var.c = tmrVar.n;
            o30Var.setTitle(tmrVar.m);
        }
        k30Var.o = ixhVar;
        p30 create = o30Var.create();
        ixhVar.b = create;
        create.setOnDismissListener(ixhVar);
        WindowManager.LayoutParams attributes = ixhVar.b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= SQLiteDatabase.OPEN_SHAREDCACHE;
        ixhVar.b.show();
        fyh fyhVar = this.e;
        if (fyhVar == null) {
            return true;
        }
        fyhVar.w(tmrVar);
        return true;
    }

    @Override // defpackage.gyh
    public final boolean c(rxh rxhVar) {
        return false;
    }

    @Override // defpackage.gyh
    public final void d(fyh fyhVar) {
        throw null;
    }

    @Override // defpackage.gyh
    public final void e(hxh hxhVar, boolean z) {
        fyh fyhVar = this.e;
        if (fyhVar != null) {
            fyhVar.e(hxhVar, z);
        }
    }

    @Override // defpackage.gyh
    public final void g() {
        g9g g9gVar = this.f;
        if (g9gVar != null) {
            g9gVar.notifyDataSetChanged();
        }
    }

    @Override // defpackage.gyh
    public final boolean h() {
        return false;
    }

    @Override // defpackage.gyh
    public final boolean i(rxh rxhVar) {
        return false;
    }

    @Override // defpackage.gyh
    public final void j(Context context, hxh hxhVar) {
        if (this.a != null) {
            this.a = context;
            if (this.b == null) {
                this.b = LayoutInflater.from(context);
            }
        }
        this.c = hxhVar;
        g9g g9gVar = this.f;
        if (g9gVar != null) {
            g9gVar.notifyDataSetChanged();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.c.q(this.f.getItem(i), this, 0);
    }
}
