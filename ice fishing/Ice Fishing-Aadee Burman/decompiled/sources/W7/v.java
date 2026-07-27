package W7;

import z7.InterfaceC5267d;
import z7.InterfaceC5272i;

/* loaded from: classes2.dex */
public final class v implements InterfaceC5267d, B7.d {

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC5267d f3459n;

    /* renamed from: u, reason: collision with root package name */
    public final InterfaceC5272i f3460u;

    public v(InterfaceC5267d interfaceC5267d, InterfaceC5272i interfaceC5272i) {
        this.f3459n = interfaceC5267d;
        this.f3460u = interfaceC5272i;
    }

    @Override // B7.d
    public final B7.d getCallerFrame() {
        InterfaceC5267d interfaceC5267d = this.f3459n;
        if (interfaceC5267d instanceof B7.d) {
            return (B7.d) interfaceC5267d;
        }
        return null;
    }

    @Override // z7.InterfaceC5267d
    public final InterfaceC5272i getContext() {
        return this.f3460u;
    }

    @Override // z7.InterfaceC5267d
    public final void resumeWith(Object obj) {
        this.f3459n.resumeWith(obj);
    }
}
