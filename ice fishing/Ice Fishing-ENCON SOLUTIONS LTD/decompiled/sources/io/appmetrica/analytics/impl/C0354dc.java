package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.dc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0354dc implements InterfaceC0712r9 {

    /* renamed from: a, reason: collision with root package name */
    public final C0527k5 f5816a;

    public C0354dc(InterfaceC0816v9 interfaceC0816v9, L6 l6, Qg qg, C0630o4 c0630o4, Q4 q4, We we) {
        C0328cc c0328cc = new C0328cc(l6, qg, this, c0630o4, we);
        this.f5816a = new C0527k5(interfaceC0816v9, c0328cc.a(), c0328cc.b(), q4);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0712r9
    public final InterfaceC0687q9 a() {
        return this.f5816a;
    }

    public final C0527k5 b() {
        return this.f5816a;
    }
}
