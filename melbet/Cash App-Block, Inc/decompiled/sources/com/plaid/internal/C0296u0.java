package com.plaid.internal;

import com.plaid.internal.InterfaceC0270r1;
import java.io.IOException;

/* renamed from: com.plaid.internal.u0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0296u0 implements InterfaceC0214k7 {
    public final String a = "https://device.payfone.com:4443/whatismyipaddress";

    public final D0 a(D0 d0, InterfaceC0270r1 interfaceC0270r1) {
        String str;
        try {
            InterfaceC0270r1.b a = interfaceC0270r1.a(new InterfaceC0270r1.a(this.a, false, null, -1));
            int i = a.b;
            if (i < 200 || i >= 300) {
                str = null;
            } else {
                str = a.a;
                if (str != null) {
                    str = str.replaceAll("[^0-9.:a-fA-F]", "");
                }
            }
            if (str == null || str.length() > 64) {
                throw new C0260q(T0.GENERIC_COMMUNICATION_ERROR, "API failed to provide a valid device IP address");
            }
            return d0 == null ? new D0(str, null, null) : new D0(str, d0.b, d0.c);
        } catch (IOException unused) {
            throw new C0260q(T0.GENERIC_COMMUNICATION_ERROR, "No response received from URL.");
        }
    }

    @Override // com.plaid.internal.InterfaceC0214k7
    public final C0179h a(Object obj, C0251p c0251p) {
        F0 f0 = (F0) obj;
        D0 b = f0.b();
        if (b != null && b.b != null) {
            return C0179h.a(b);
        }
        if (b != null && !"_auto_detect_".equals(b.a)) {
            return C0179h.a(b);
        }
        try {
            return C0179h.a(a(b, f0.a()));
        } catch (C0260q e) {
            return C0179h.a((Exception) e);
        }
    }
}
