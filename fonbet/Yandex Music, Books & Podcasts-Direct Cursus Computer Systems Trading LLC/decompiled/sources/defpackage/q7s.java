package defpackage;

import android.view.View;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class q7s implements ux8 {
    public final jyr a;
    public final jyr b = btf.b(new eyq(28, this));
    public final LinkedHashMap c = new LinkedHashMap();
    public boolean d;
    public boolean e;

    public q7s(jyr jyrVar) {
        this.a = jyrVar;
    }

    public final void a() {
        LinkedHashMap linkedHashMap = this.c;
        if (linkedHashMap.isEmpty()) {
            return;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            if (((View) ((Map.Entry) it.next()).getValue()).getVisibility() == 0) {
                if (this.e) {
                    return;
                }
                this.e = true;
                aik aikVar = (aik) this.b.getValue();
                aikVar.b();
                aikVar.c();
                return;
            }
        }
    }

    @Override // defpackage.ux8
    public final void b(gc8 gc8Var, xzb xzbVar, View view, dp8 dp8Var) {
        xzbVar.getClass();
        view.getClass();
        dp8Var.getClass();
        String id = dp8Var.getId();
        if (id == null) {
            ssg.a(6, "TariffPaywallPromoCodeExtension", "Div must be used with id", null);
            return;
        }
        view.setVisibility(this.d ? 0 : 8);
        this.c.put(id, view);
        a();
    }

    @Override // defpackage.ux8
    public final boolean c(dp8 dp8Var) {
        dp8Var.getClass();
        return sj2.t(dp8Var, "promo_code");
    }

    @Override // defpackage.ux8
    public final void e(gc8 gc8Var, xzb xzbVar, View view, dp8 dp8Var) {
        gc8Var.getClass();
        xzbVar.getClass();
        view.getClass();
        dp8Var.getClass();
        String id = dp8Var.getId();
        if (id != null) {
        }
    }

    public final void h(boolean z) {
        this.d = z;
        Iterator it = this.c.entrySet().iterator();
        while (it.hasNext()) {
            View view = (View) ((Map.Entry) it.next()).getValue();
            if (view.getVisibility() != 0) {
                view.setVisibility(this.d ? 0 : 8);
            }
        }
        a();
    }
}
