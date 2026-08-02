package com.plaid.internal;

import com.plaid.internal.InterfaceC0270r1;
import java.io.IOException;

/* renamed from: com.plaid.internal.t0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0287t0 {
    public final C0323x0 a;
    public final String b;
    public final int c;

    public C0287t0() {
        W3 w3 = Z3.a;
        this.a = new C0323x0("connectivity-validator");
        this.b = "https://clients3.google.com/generate_204";
        this.c = 10000;
    }

    public final boolean a(C0098b c0098b) {
        boolean z;
        int i;
        long currentTimeMillis = System.currentTimeMillis();
        while (true) {
            z = false;
            try {
                InterfaceC0270r1.b a = c0098b.a(new InterfaceC0270r1.a(this.b, false, null, -1));
                this.a.a(W3.TRACE, "response status " + a.b, new Object[0]);
                int i2 = a.b;
                if (i2 >= 200 && i2 < 300) {
                    z = true;
                }
            } catch (IOException e) {
                this.a.a(e, "cannot reach test endpoint");
            }
            if (z || ((i = this.c) > 0 && i + currentTimeMillis <= System.currentTimeMillis())) {
                break;
            }
        }
        this.a.a(W3.TRACE, "httpclient %s", z ? "online" : "offline");
        return z;
    }
}
