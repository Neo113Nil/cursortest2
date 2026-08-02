package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class xot implements p3c {
    public final szm a;
    public final szm b;
    public final szm c;
    public final uto d;
    public final szm e;
    public final szm f;
    public final szm g;

    public xot(szm szmVar, szm szmVar2, szm szmVar3, uto utoVar, szm szmVar4, szm szmVar5, szm szmVar6) {
        this.a = szmVar;
        this.b = szmVar2;
        this.c = szmVar3;
        this.d = utoVar;
        this.e = szmVar4;
        this.f = szmVar5;
        this.g = szmVar6;
    }

    @Override // defpackage.szm
    public final Object get() {
        return new hgp((Context) this.a.get(), (v2i) this.b.get(), (bko) this.c.get(), (ime) this.d.get(), (Executor) this.e.get(), (bko) this.f.get(), new vpl(), new qcm(), (bko) this.g.get());
    }
}
