package com.plaid.internal;

import com.plaid.internal.A7;

/* renamed from: com.plaid.internal.j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0197j implements B1 {
    public final /* synthetic */ C0242o a;

    public C0197j(C0242o c0242o) {
        this.a = c0242o;
    }

    @Override // com.plaid.internal.B1
    public final InterfaceC0270r1 a() {
        A7 a7 = this.a.f;
        A7.a aVar = a7.a;
        if (aVar == null) {
            A7.d.a(W3.DEBUG, "no cached http client available", new Object[0]);
            return null;
        }
        if (aVar.a.isConnected() == EnumC0340z.YES) {
            A7.d.a(W3.DEBUG, "use cached http client (still connected)", new Object[0]);
            return a7.a.a;
        }
        A7.d.a(W3.DEBUG, "discard cached http client (disconnected)", new Object[0]);
        return null;
    }
}
