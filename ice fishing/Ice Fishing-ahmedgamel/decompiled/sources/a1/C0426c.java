package a1;

import java.util.List;
import k1.C4629a;

/* renamed from: a1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0426c implements InterfaceC0425b {

    /* renamed from: n, reason: collision with root package name */
    public final List f4247n;

    /* renamed from: v, reason: collision with root package name */
    public C4629a f4249v = null;

    /* renamed from: w, reason: collision with root package name */
    public float f4250w = -1.0f;

    /* renamed from: u, reason: collision with root package name */
    public C4629a f4248u = a(0.0f);

    public C0426c(List list) {
        this.f4247n = list;
    }

    public final C4629a a(float f3) {
        List list = this.f4247n;
        C4629a c4629a = (C4629a) list.get(list.size() - 1);
        if (f3 >= c4629a.b()) {
            return c4629a;
        }
        for (int size = list.size() - 2; size >= 1; size--) {
            C4629a c4629a2 = (C4629a) list.get(size);
            if (this.f4248u != c4629a2 && f3 >= c4629a2.b() && f3 < c4629a2.a()) {
                return c4629a2;
            }
        }
        return (C4629a) list.get(0);
    }

    @Override // a1.InterfaceC0425b
    public final boolean h(float f3) {
        C4629a c4629a = this.f4249v;
        C4629a c4629a2 = this.f4248u;
        if (c4629a == c4629a2 && this.f4250w == f3) {
            return true;
        }
        this.f4249v = c4629a2;
        this.f4250w = f3;
        return false;
    }

    @Override // a1.InterfaceC0425b
    public final C4629a i() {
        return this.f4248u;
    }

    @Override // a1.InterfaceC0425b
    public final boolean isEmpty() {
        return false;
    }

    @Override // a1.InterfaceC0425b
    public final boolean k(float f3) {
        C4629a c4629a = this.f4248u;
        if (f3 >= c4629a.b() && f3 < c4629a.a()) {
            return !this.f4248u.c();
        }
        this.f4248u = a(f3);
        return true;
    }

    @Override // a1.InterfaceC0425b
    public final float q() {
        return ((C4629a) this.f4247n.get(r0.size() - 1)).a();
    }

    @Override // a1.InterfaceC0425b
    public final float r() {
        return ((C4629a) this.f4247n.get(0)).b();
    }
}
