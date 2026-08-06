package E1;

import n1.InterfaceC0992c;

/* loaded from: classes.dex */
public final class s implements l1.d, InterfaceC0992c {

    /* renamed from: a, reason: collision with root package name */
    public final l1.d f342a;

    /* renamed from: b, reason: collision with root package name */
    public final l1.i f343b;

    public s(l1.d dVar, l1.i iVar) {
        this.f342a = dVar;
        this.f343b = iVar;
    }

    @Override // n1.InterfaceC0992c
    public final InterfaceC0992c f() {
        l1.d dVar = this.f342a;
        if (dVar instanceof InterfaceC0992c) {
            return (InterfaceC0992c) dVar;
        }
        return null;
    }

    @Override // l1.d
    public final l1.i getContext() {
        return this.f343b;
    }

    @Override // l1.d
    public final void i(Object obj) {
        this.f342a.i(obj);
    }
}
