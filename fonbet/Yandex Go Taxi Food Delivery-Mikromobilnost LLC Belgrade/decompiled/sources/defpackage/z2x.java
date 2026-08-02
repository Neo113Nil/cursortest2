package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.x0;
import flex.engine.section.metrics.PooledPreDrawListener;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes9.dex */
public final class z2x extends y70 {
    public final wyi0 a;
    public final sls b;
    public final a6q0 c;
    public final ofa0 d;
    public boolean g;
    public final LinkedHashMap e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();
    public final ssu h = new ssu(1, this);

    public z2x(wyi0 wyi0Var, sls slsVar, a6q0 a6q0Var) {
        this.a = wyi0Var;
        this.b = slsVar;
        this.c = a6q0Var;
        this.d = new ofa0(new au50(16, this), new gp50(21, this), slsVar);
    }

    @Override // defpackage.y70
    public final void a(x0 x0Var, int i, Object obj) {
        vyi0 vyi0Var = obj instanceof vyi0 ? (vyi0) obj : null;
        if (vyi0Var == null) {
            return;
        }
        View view = x0Var.a;
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        e(view);
        if (viewTreeObserver.isAlive()) {
            ofa0 ofa0Var = this.d;
            PooledPreDrawListener pooledPreDrawListener = (PooledPreDrawListener) ((x43) ofa0Var.w).m();
            PooledPreDrawListener pooledPreDrawListener2 = pooledPreDrawListener;
            if (pooledPreDrawListener == null) {
                pooledPreDrawListener2 = new PooledPreDrawListener((au50) ofa0Var.a, (gp50) ofa0Var.b, (sls) ofa0Var.c);
            }
            pooledPreDrawListener2.prepare(view, viewTreeObserver, i, vyi0Var);
            viewTreeObserver.addOnPreDrawListener(pooledPreDrawListener2);
            this.e.put(view, pooledPreDrawListener2);
        }
    }

    @Override // defpackage.y70
    public final Object b(u0x u0xVar) {
        String str;
        boolean z = u0xVar instanceof aul;
        aul aulVar = z ? (aul) u0xVar : null;
        String str2 = aulVar != null ? aulVar.l : null;
        aul aulVar2 = z ? (aul) u0xVar : null;
        if (aulVar2 == null || (str = aulVar2.o) == null) {
            aul aulVar3 = z ? (aul) u0xVar : null;
            str = aulVar3 != null ? aulVar3.n : null;
        }
        if (str2 == null && str == null) {
            return null;
        }
        return new vyi0(str2, str, ((Number) this.b.invoke()).longValue());
    }

    @Override // defpackage.y70
    public final void c() {
        LinkedHashMap linkedHashMap = this.e;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((PooledPreDrawListener) it.next()).cancel();
        }
        linkedHashMap.clear();
        this.f.clear();
        this.g = false;
    }

    @Override // defpackage.y70
    public final void d(x0 x0Var) {
        e(x0Var.a);
    }

    public final void e(View view) {
        PooledPreDrawListener pooledPreDrawListener = (PooledPreDrawListener) this.e.remove(view);
        if (pooledPreDrawListener == null) {
            return;
        }
        this.f.remove(Integer.valueOf(pooledPreDrawListener.getPosition()));
        pooledPreDrawListener.cancel();
        ofa0 ofa0Var = this.d;
        ofa0Var.getClass();
        pooledPreDrawListener.clear();
        x43 x43Var = (x43) ofa0Var.w;
        if (x43Var.size() < 10) {
            x43Var.addLast(pooledPreDrawListener);
        }
    }
}
