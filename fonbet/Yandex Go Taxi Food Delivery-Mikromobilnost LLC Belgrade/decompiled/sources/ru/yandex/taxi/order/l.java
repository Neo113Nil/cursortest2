package ru.yandex.taxi.order;

import androidx.lifecycle.Lifecycle;
import defpackage.tje;
import defpackage.tse;
import defpackage.w980;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes9.dex */
public final class l {
    public final Lifecycle a;
    public volatile boolean b;
    public volatile boolean c;
    public volatile boolean d;
    public volatile boolean e;
    public volatile boolean f;
    public final ArrayList g = new ArrayList();

    public l(Lifecycle lifecycle, tse tseVar) {
        this.a = lifecycle;
        tje.N(tseVar, null, null, new OrderUiActivityMonitor$subscribeToLifecycle$1(this, null), 3);
    }

    public final void a() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            w980 w980Var = (w980) it.next();
            w980Var.getClass();
            w980Var.a(b(true));
        }
    }

    public final boolean b(boolean z) {
        boolean z2 = (this.e || this.c || this.d) && !this.f;
        return z ? this.b && z2 : z2;
    }
}
