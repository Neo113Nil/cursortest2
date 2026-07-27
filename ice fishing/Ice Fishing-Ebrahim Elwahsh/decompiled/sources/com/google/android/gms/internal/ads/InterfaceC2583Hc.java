package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import q2.C4907p;
import t0.AbstractC5051n;

/* renamed from: com.google.android.gms.internal.ads.Hc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC2583Hc extends InterfaceC2651Lc, InterfaceC2566Gc {
    @Override // com.google.android.gms.internal.ads.InterfaceC2566Gc
    default void a(String str, Map map) {
        try {
            c("openIntentAsync", C4907p.f40108g.f40109a.l(map));
        } catch (JSONException unused) {
            int i = t2.C.f40822b;
            u2.i.f("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2566Gc
    default void c(String str, JSONObject jSONObject) {
        StringBuilder m8 = CL.m("(window.AFMA_ReceiveMessage || function() {})('openIntentAsync',", jSONObject.toString(), ");");
        String sb = m8.toString();
        int i = t2.C.f40822b;
        u2.i.a("Dispatching AFMA event: ".concat(sb));
        d(m8.toString());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2651Lc
    void d(String str);

    @Override // com.google.android.gms.internal.ads.InterfaceC2651Lc
    default void i(String str, String str2) {
        d(com.anythink.basead.b.c.i.q(new StringBuilder(AbstractC5051n.a(1, String.valueOf(str2).length(), str) + 2), str, "(", str2, ");"));
    }
}
