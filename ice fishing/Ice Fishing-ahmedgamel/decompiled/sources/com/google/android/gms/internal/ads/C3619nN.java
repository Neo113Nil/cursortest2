package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.nN, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3619nN implements InterfaceC3511lN {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f32723c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile InterfaceC3297hN f32724a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f32725b;

    public static InterfaceC3511lN a(InterfaceC3297hN interfaceC3297hN) {
        if ((interfaceC3297hN instanceof C3619nN) || (interfaceC3297hN instanceof C3243gN)) {
            return interfaceC3297hN;
        }
        C3619nN c3619nN = new C3619nN();
        c3619nN.f32725b = f32723c;
        c3619nN.f32724a = interfaceC3297hN;
        return c3619nN;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3511lN
    public final Object f() {
        Object obj = this.f32725b;
        if (obj != f32723c) {
            return obj;
        }
        InterfaceC3297hN interfaceC3297hN = this.f32724a;
        if (interfaceC3297hN == null) {
            return this.f32725b;
        }
        Object f3 = interfaceC3297hN.f();
        this.f32725b = f3;
        this.f32724a = null;
        return f3;
    }
}
