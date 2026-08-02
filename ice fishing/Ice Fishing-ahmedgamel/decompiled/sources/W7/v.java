package W7;

import z7.InterfaceC5240d;
import z7.InterfaceC5245i;

/* loaded from: classes2.dex */
public final class v implements InterfaceC5240d, B7.d {

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC5240d f3621n;

    /* renamed from: u, reason: collision with root package name */
    public final InterfaceC5245i f3622u;

    public v(InterfaceC5240d interfaceC5240d, InterfaceC5245i interfaceC5245i) {
        this.f3621n = interfaceC5240d;
        this.f3622u = interfaceC5245i;
    }

    @Override // B7.d
    public final B7.d getCallerFrame() {
        InterfaceC5240d interfaceC5240d = this.f3621n;
        if (interfaceC5240d instanceof B7.d) {
            return (B7.d) interfaceC5240d;
        }
        return null;
    }

    @Override // z7.InterfaceC5240d
    public final InterfaceC5245i getContext() {
        return this.f3622u;
    }

    @Override // z7.InterfaceC5240d
    public final void resumeWith(Object obj) {
        this.f3621n.resumeWith(obj);
    }
}
