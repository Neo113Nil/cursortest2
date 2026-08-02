package defpackage;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class cfb implements t7k, u7k {
    public final t7k a;
    public final ArrayList b = new ArrayList();
    public final v07 c = new v07(3, this);

    public cfb(t7k t7kVar) {
        this.a = t7kVar;
    }

    @Override // defpackage.t7k
    public final y7k a() {
        return this.c;
    }

    @Override // defpackage.t7k
    public final t8s b() {
        return this.a.b();
    }

    @Override // defpackage.u7k
    public final t7k c() {
        return this.a;
    }

    @Override // defpackage.t7k
    public final boolean d() {
        return this.a.d();
    }
}
