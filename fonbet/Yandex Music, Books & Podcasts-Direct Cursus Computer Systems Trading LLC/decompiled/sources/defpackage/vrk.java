package defpackage;

import io.grpc.internal.a;
import java.util.logging.Level;

/* loaded from: classes5.dex */
public final class vrk implements beg {
    public s76 a = s76.a(r76.d);
    public yrk b;
    public final /* synthetic */ a c;

    public vrk(a aVar) {
        this.c = aVar;
    }

    @Override // defpackage.beg
    public final void a(s76 s76Var) {
        a.l.log(Level.FINE, "Received health status {0} for subchannel {1}", new Object[]{s76Var, this.b.a});
        this.a = s76Var;
        a aVar = this.c;
        if (aVar.i.c() && ((yrk) aVar.h.get(aVar.i.a())).c == this) {
            aVar.B(this.b);
        }
    }
}
