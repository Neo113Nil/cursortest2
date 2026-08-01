package a1;

import java.util.List;
import k1.C4629a;

/* renamed from: a1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0427d implements InterfaceC0425b {

    /* renamed from: n, reason: collision with root package name */
    public final C4629a f4251n;

    /* renamed from: u, reason: collision with root package name */
    public float f4252u = -1.0f;

    public C0427d(List list) {
        this.f4251n = (C4629a) list.get(0);
    }

    @Override // a1.InterfaceC0425b
    public final boolean h(float f3) {
        if (this.f4252u == f3) {
            return true;
        }
        this.f4252u = f3;
        return false;
    }

    @Override // a1.InterfaceC0425b
    public final C4629a i() {
        return this.f4251n;
    }

    @Override // a1.InterfaceC0425b
    public final boolean isEmpty() {
        return false;
    }

    @Override // a1.InterfaceC0425b
    public final boolean k(float f3) {
        return !this.f4251n.c();
    }

    @Override // a1.InterfaceC0425b
    public final float q() {
        return this.f4251n.a();
    }

    @Override // a1.InterfaceC0425b
    public final float r() {
        return this.f4251n.b();
    }
}
