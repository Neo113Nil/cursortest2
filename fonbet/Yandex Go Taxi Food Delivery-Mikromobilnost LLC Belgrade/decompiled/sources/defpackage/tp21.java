package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes15.dex */
public final class tp21 implements y4e {
    public final Handler a = new Handler();
    public final HashMap b = new HashMap();
    public final w3c c;
    public final x0j0 w;
    public final g370 x;
    public boolean y;

    public tp21(w3c w3cVar, x0j0 x0j0Var, a5e a5eVar, g370 g370Var) {
        this.c = w3cVar;
        this.w = x0j0Var;
        this.x = g370Var;
        a5eVar.a(this);
    }

    public final void a(long j, long j2, String str) {
        z83.g(null, this.a.getLooper(), Looper.myLooper());
        sp21 sp21Var = (sp21) this.b.get(str);
        if (sp21Var == null) {
            this.x.a(j, str, "no subscriptions");
        } else {
            sp21Var.I(j, j2);
        }
    }

    @Override // defpackage.y4e
    public final void c(wor0 wor0Var) {
        z83.g(null, this.a.getLooper(), Looper.myLooper());
        this.y = true;
        HashMap hashMap = this.b;
        Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            sp21 sp21Var = (sp21) hashMap.get((String) it.next());
            sp21Var.G(sp21Var.x);
        }
    }

    @Override // defpackage.y4e
    public final void onConnectionClosed() {
        z83.g(null, this.a.getLooper(), Looper.myLooper());
        this.y = false;
        HashMap hashMap = this.b;
        Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            sp21 sp21Var = (sp21) hashMap.get((String) it.next());
            sp21Var.G(sp21Var.x);
        }
    }
}
