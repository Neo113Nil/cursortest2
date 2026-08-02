package com.plaid.internal;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedHashMap;

/* renamed from: com.plaid.internal.s0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0278s0 implements InterfaceC0214k7 {
    public static final C0323x0 a;

    static {
        W3 w3 = Z3.a;
        a = new C0323x0("auth");
    }

    public static String a(InterfaceC0286t interfaceC0286t, C0251p c0251p) {
        InterfaceC0172g1 c0190i1;
        long j;
        String b = interfaceC0286t.b();
        LinkedHashMap b2 = AbstractC0306v1.b(b);
        if (b2.containsKey("testVfp")) {
            LinkedHashMap b3 = AbstractC0306v1.b(b);
            try {
                j = Long.parseLong((String) b3.get("delay"));
            } catch (Exception unused) {
                j = 0;
            }
            String str = (String) b3.get("testVfp");
            String str2 = (String) AbstractC0306v1.b(b).get("cid");
            if (str2 == null) {
                LinkedHashMap b4 = AbstractC0306v1.b(b);
                str2 = (String) b4.get("vfp");
                if (str2 == null) {
                    str2 = (String) b4.get("token");
                }
            }
            c0190i1 = new C0181h1(j, str, str2);
        } else if ("2".equals((String) b2.get("pfflow"))) {
            a.a(W3.INFO, "flow v2 detected", new Object[0]);
            c0190i1 = C0199j1.a(b);
        } else {
            a.a(W3.INFO, "flow v1 detected", new Object[0]);
            C0323x0 c0323x0 = C0190i1.b;
            if (!"f".equals(AbstractC0306v1.b(b).get("r"))) {
                b = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Boxes$$ExternalSyntheticOutline1.m(b), b.indexOf(63) == -1 ? "?" : "&", "r=f");
            }
            try {
                new URL(b);
                c0190i1 = new C0190i1(b);
            } catch (MalformedURLException unused2) {
                throw new C0260q(T0.AUTH_MALFORMED_INPUT_DATA, Recorder$$ExternalSyntheticOutline2.m("Malformed url ", b));
            }
        }
        return c0190i1.a(interfaceC0286t.a(), c0251p);
    }

    @Override // com.plaid.internal.InterfaceC0214k7
    public final C0179h a(Object obj, C0251p c0251p) {
        try {
            return C0179h.a(a((InterfaceC0286t) obj, c0251p));
        } catch (Exception e) {
            return C0179h.a(e);
        }
    }
}
