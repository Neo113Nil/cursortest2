package x1;

import D1.i;
import D1.o;
import D1.p;

/* loaded from: classes.dex */
public abstract class h extends c implements D1.f {

    /* renamed from: d, reason: collision with root package name */
    public final int f4764d;

    public h(v1.d dVar) {
        super(dVar);
        this.f4764d = 2;
    }

    @Override // D1.f
    public final int f() {
        return this.f4764d;
    }

    @Override // x1.a
    public final String toString() {
        if (this.f4758a != null) {
            return super.toString();
        }
        o.f171a.getClass();
        String a2 = p.a(this);
        i.d(a2, "renderLambdaToString(...)");
        return a2;
    }
}
