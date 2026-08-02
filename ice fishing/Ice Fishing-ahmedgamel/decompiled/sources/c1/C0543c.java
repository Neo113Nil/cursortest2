package c1;

import java.util.List;
import m1.C4739a;

/* renamed from: c1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0543c implements InterfaceC0542b {

    /* renamed from: n, reason: collision with root package name */
    public final List f5642n;

    /* renamed from: v, reason: collision with root package name */
    public C4739a f5644v = null;

    /* renamed from: w, reason: collision with root package name */
    public float f5645w = -1.0f;

    /* renamed from: u, reason: collision with root package name */
    public C4739a f5643u = a(0.0f);

    public C0543c(List list) {
        this.f5642n = list;
    }

    public final C4739a a(float f2) {
        List list = this.f5642n;
        C4739a c4739a = (C4739a) list.get(list.size() - 1);
        if (f2 >= c4739a.b()) {
            return c4739a;
        }
        for (int size = list.size() - 2; size >= 1; size--) {
            C4739a c4739a2 = (C4739a) list.get(size);
            if (this.f5643u != c4739a2 && f2 >= c4739a2.b() && f2 < c4739a2.a()) {
                return c4739a2;
            }
        }
        return (C4739a) list.get(0);
    }

    @Override // c1.InterfaceC0542b
    public final boolean d(float f2) {
        C4739a c4739a = this.f5644v;
        C4739a c4739a2 = this.f5643u;
        if (c4739a == c4739a2 && this.f5645w == f2) {
            return true;
        }
        this.f5644v = c4739a2;
        this.f5645w = f2;
        return false;
    }

    @Override // c1.InterfaceC0542b
    public final C4739a f() {
        return this.f5643u;
    }

    @Override // c1.InterfaceC0542b
    public final boolean g(float f2) {
        C4739a c4739a = this.f5643u;
        if (f2 >= c4739a.b() && f2 < c4739a.a()) {
            return !this.f5643u.c();
        }
        this.f5643u = a(f2);
        return true;
    }

    @Override // c1.InterfaceC0542b
    public final boolean isEmpty() {
        return false;
    }

    @Override // c1.InterfaceC0542b
    public final float j() {
        return ((C4739a) this.f5642n.get(r0.size() - 1)).a();
    }

    @Override // c1.InterfaceC0542b
    public final float k() {
        return ((C4739a) this.f5642n.get(0)).b();
    }
}
