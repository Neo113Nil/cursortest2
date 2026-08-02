package com.plaid.internal;

import com.plaid.internal.InterfaceC0270r1;
import java.net.MalformedURLException;
import java.net.URL;

/* renamed from: com.plaid.internal.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0098b implements InterfaceC0270r1 {
    public final C0143d a;
    public final C0196i7 b;

    public C0098b(C0175g4 c0175g4) {
        this.a = new C0143d(c0175g4);
        this.b = new C0196i7(c0175g4);
    }

    @Override // com.plaid.internal.InterfaceC0270r1
    public final InterfaceC0270r1.b a(InterfaceC0270r1.a aVar) {
        boolean z;
        try {
            z = new URL(aVar.a).getProtocol().equals("https");
        } catch (MalformedURLException unused) {
            z = false;
        }
        return z ? this.a.a(aVar) : this.b.a(aVar);
    }

    @Override // com.plaid.internal.InterfaceC0270r1
    public final EnumC0340z isConnected() {
        return this.a.isConnected();
    }

    @Override // com.plaid.internal.InterfaceC0270r1
    public final void a() {
        this.a.a();
        this.b.a();
    }
}
