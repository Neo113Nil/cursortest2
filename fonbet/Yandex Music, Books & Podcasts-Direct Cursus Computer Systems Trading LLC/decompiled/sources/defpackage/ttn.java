package defpackage;

import android.view.View;
import java.util.Iterator;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class ttn extends zc4 {
    public final gc8 n;
    public final dv8 o;
    public final tx8 p;

    public ttn(gc8 gc8Var, dv8 dv8Var, tx8 tx8Var) {
        this.n = gc8Var;
        this.o = dv8Var;
        this.p = tx8Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void m0(View view) {
        if (view instanceof ptn) {
            ((ptn) view).a();
        }
        Object tag = view.getTag(R.id.div_releasable_list);
        q4r q4rVar = tag instanceof q4r ? (q4r) tag : null;
        vz0 vz0Var = q4rVar != null ? new vz0(6, q4rVar) : null;
        if (vz0Var == null) {
            return;
        }
        Iterator it = vz0Var.iterator();
        while (true) {
            c7 c7Var = (c7) it;
            if (!c7Var.hasNext()) {
                return;
            } else {
                ((ptn) c7Var.next()).a();
            }
        }
    }

    @Override // defpackage.zc4
    public final void e0(kv8 kv8Var) {
        xzb xzbVar;
        db8 div = kv8Var.getDiv();
        if (div == null) {
            return;
        }
        yu8 yu8Var = div.c;
        e23 bindingContext = kv8Var.getBindingContext();
        if (bindingContext == null || (xzbVar = bindingContext.b) == null) {
            return;
        }
        m0(kv8Var);
        View customView = kv8Var.getCustomView();
        if (customView != null) {
            this.p.e(this.n, xzbVar, customView, yu8Var);
            this.o.d(customView, yu8Var);
        }
    }

    @Override // defpackage.zc4
    public final void h0(oc9 oc9Var) {
        x(oc9Var);
        oc9Var.getViewPager().setAdapter(null);
    }

    @Override // defpackage.zc4
    public final void i0(hh9 hh9Var) {
        x(hh9Var);
        hh9Var.setAdapter(null);
    }

    @Override // defpackage.zc4
    public final void k0(View view) {
        m0(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.zc4
    public final void x(f29 f29Var) {
        f29Var.getClass();
        View view = (View) f29Var;
        jc8 div = f29Var.getDiv();
        dp8 d = div != null ? div.d() : null;
        e23 bindingContext = f29Var.getBindingContext();
        xzb xzbVar = bindingContext != null ? bindingContext.b : null;
        if (d != null && xzbVar != null) {
            this.p.e(this.n, xzbVar, view, d);
        }
        m0(view);
    }
}
