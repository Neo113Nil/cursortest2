package defpackage;

import com.google.crypto.tink.shaded.protobuf.c;

/* loaded from: classes3.dex */
public abstract class f3d implements Cloneable {
    public final c a;
    public c b;
    public boolean c = false;

    public f3d(c cVar) {
        this.a = cVar;
        this.b = (c) cVar.f(4);
    }

    public static void e(c cVar, c cVar2) {
        wym wymVar = wym.c;
        wymVar.getClass();
        wymVar.a(cVar.getClass()).j(cVar, cVar2);
    }

    public final c b() {
        c c = c();
        if (c.i()) {
            return c;
        }
        throw new pit();
    }

    public final c c() {
        boolean z = this.c;
        c cVar = this.b;
        if (z) {
            return cVar;
        }
        cVar.getClass();
        wym wymVar = wym.c;
        wymVar.getClass();
        wymVar.a(cVar.getClass()).a(cVar);
        this.c = true;
        return this.b;
    }

    public final Object clone() {
        f3d f3dVar = (f3d) this.a.f(5);
        c c = c();
        f3dVar.d();
        e(f3dVar.b, c);
        return f3dVar;
    }

    public final void d() {
        if (this.c) {
            c cVar = (c) this.b.f(4);
            e(cVar, this.b);
            this.b = cVar;
            this.c = false;
        }
    }
}
