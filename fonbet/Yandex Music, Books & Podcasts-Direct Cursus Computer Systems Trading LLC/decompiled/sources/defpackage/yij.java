package defpackage;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
public final class yij extends AtomicInteger implements ka8 {
    private static final long serialVersionUID = 2728361546769921047L;
    public final bjj a;
    public final wjj b;
    public Serializable c;
    public volatile boolean d;

    public yij(bjj bjjVar, wjj wjjVar) {
        this.a = bjjVar;
        this.b = wjjVar;
    }

    @Override // defpackage.ka8
    public final void a() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.a.d(this);
        this.c = null;
    }
}
