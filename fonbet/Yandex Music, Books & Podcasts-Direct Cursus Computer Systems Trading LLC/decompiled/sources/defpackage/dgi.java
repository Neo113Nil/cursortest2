package defpackage;

import io.grpc.util.a;
import io.grpc.util.c;

/* loaded from: classes5.dex */
public final class dgi {
    public final egi a;
    public final a b;
    public final deg c;
    public r76 d;
    public aeg e;
    public boolean f = false;
    public final /* synthetic */ c g;

    public dgi(c cVar, egi egiVar, csk cskVar, wrk wrkVar) {
        this.g = cVar;
        this.a = egiVar;
        this.c = cskVar;
        this.e = wrkVar;
        a aVar = new a(new qwd(1, this));
        this.b = aVar;
        this.d = r76.a;
        aVar.B(cskVar);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address = ");
        sb.append(this.a);
        sb.append(", state = ");
        sb.append(this.d);
        sb.append(", picker type: ");
        sb.append(this.e.getClass());
        sb.append(", lb: ");
        sb.append(this.b.z().getClass());
        sb.append(this.f ? ", deactivated" : "");
        return sb.toString();
    }
}
