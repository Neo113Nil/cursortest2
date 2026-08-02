package com.plaid.internal;

/* renamed from: com.plaid.internal.h1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0181h1 implements InterfaceC0172g1 {
    public final String a;
    public final long b;
    public final String c;

    public C0181h1(long j, String str, String str2) {
        this.a = str;
        this.b = j;
        this.c = str2;
    }

    @Override // com.plaid.internal.InterfaceC0172g1
    public final String a(InterfaceC0270r1 interfaceC0270r1, C0251p c0251p) {
        c0251p.d = "test";
        c0251p.e = this.c;
        long j = this.b;
        if (j > 0) {
            try {
                Thread.sleep(j);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
        return this.a;
    }
}
