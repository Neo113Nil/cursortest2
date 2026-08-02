package com.plaid.internal;

import com.plaid.internal.C0095a6;

/* loaded from: classes5.dex */
public final class R0 implements M5 {
    public final S0 a;

    public R0(S0 s0) {
        s0.getClass();
        this.a = s0;
    }

    @Override // com.plaid.internal.M5
    public final boolean a(String str) {
        str.getClass();
        try {
            this.a.b(str);
            return true;
        } catch (Exception e) {
            C0095a6.a.a(C0095a6.a, e);
            return true;
        }
    }

    @Override // com.plaid.internal.M5
    public final void a(AbstractC0282s4 abstractC0282s4) {
        abstractC0282s4.getClass();
    }
}
