package com.plaid.internal;

/* renamed from: com.plaid.internal.w0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0314w0 implements InterfaceC0214k7 {
    public final C0305v0 a;

    public C0314w0(C0305v0 c0305v0) {
        this.a = c0305v0;
    }

    @Override // com.plaid.internal.InterfaceC0214k7
    public final C0179h a(Object obj, C0251p c0251p) {
        try {
            InterfaceC0270r1 a = ((B1) obj).a();
            return a != null ? C0179h.a(a) : C0179h.a(this.a.a());
        } catch (C0260q e) {
            return C0179h.a((Exception) e);
        }
    }
}
