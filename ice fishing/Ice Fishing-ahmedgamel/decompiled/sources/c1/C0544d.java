package c1;

import java.util.List;
import m1.C4739a;

/* renamed from: c1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0544d implements InterfaceC0542b {

    /* renamed from: n, reason: collision with root package name */
    public final C4739a f5646n;

    /* renamed from: u, reason: collision with root package name */
    public float f5647u = -1.0f;

    public C0544d(List list) {
        this.f5646n = (C4739a) list.get(0);
    }

    @Override // c1.InterfaceC0542b
    public final boolean d(float f2) {
        if (this.f5647u == f2) {
            return true;
        }
        this.f5647u = f2;
        return false;
    }

    @Override // c1.InterfaceC0542b
    public final C4739a f() {
        return this.f5646n;
    }

    @Override // c1.InterfaceC0542b
    public final boolean g(float f2) {
        return !this.f5646n.c();
    }

    @Override // c1.InterfaceC0542b
    public final boolean isEmpty() {
        return false;
    }

    @Override // c1.InterfaceC0542b
    public final float j() {
        return this.f5646n.a();
    }

    @Override // c1.InterfaceC0542b
    public final float k() {
        return this.f5646n.b();
    }
}
