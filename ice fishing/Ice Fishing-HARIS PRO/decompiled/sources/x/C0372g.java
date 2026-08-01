package x;

import java.util.Iterator;

/* renamed from: x.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0372g extends C0371f {

    /* renamed from: m, reason: collision with root package name */
    public int f4694m;

    public C0372g(o oVar) {
        super(oVar);
        if (oVar instanceof k) {
            this.e = 2;
        } else {
            this.e = 3;
        }
    }

    @Override // x.C0371f
    public final void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.f4690g = i;
        Iterator it = this.f4692k.iterator();
        while (it.hasNext()) {
            InterfaceC0369d interfaceC0369d = (InterfaceC0369d) it.next();
            interfaceC0369d.a(interfaceC0369d);
        }
    }
}
