package x;

import java.util.Iterator;

/* renamed from: x.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5168g extends C5167f {

    /* renamed from: m, reason: collision with root package name */
    public int f41783m;

    public C5168g(AbstractC5177p abstractC5177p) {
        super(abstractC5177p);
        if (abstractC5177p instanceof C5172k) {
            this.f41776e = 2;
        } else {
            this.f41776e = 3;
        }
    }

    @Override // x.C5167f
    public final void d(int i) {
        if (this.f41780j) {
            return;
        }
        this.f41780j = true;
        this.f41778g = i;
        Iterator it = this.f41781k.iterator();
        while (it.hasNext()) {
            InterfaceC5165d interfaceC5165d = (InterfaceC5165d) it.next();
            interfaceC5165d.a(interfaceC5165d);
        }
    }
}
