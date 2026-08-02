package com.google.android.gms.internal.ads;

import com.icefishingapp.icefishing.AbstractC4404f;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import q2.C4900p;

/* renamed from: com.google.android.gms.internal.ads.Mc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC2669Mc extends InterfaceC2737Qc, InterfaceC2652Lc {
    @Override // com.google.android.gms.internal.ads.InterfaceC2737Qc
    void b(String str);

    @Override // com.google.android.gms.internal.ads.InterfaceC2737Qc
    default void c(String str, String str2) {
        b(com.anythink.basead.exoplayer.f.f.o(new StringBuilder(u1.h.a(1, String.valueOf(str2).length(), str) + 2), str, "(", str2, ");"));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2652Lc
    default void d(String str, Map map) {
        try {
            e("openIntentAsync", C4900p.f40199g.f40200a.l(map));
        } catch (JSONException unused) {
            int i = u2.z.f41322b;
            v2.i.f("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2652Lc
    default void e(String str, JSONObject jSONObject) {
        StringBuilder j6 = AbstractC4404f.j("(window.AFMA_ReceiveMessage || function() {})('openIntentAsync',", jSONObject.toString(), ");");
        String sb = j6.toString();
        int i = u2.z.f41322b;
        v2.i.a("Dispatching AFMA event: ".concat(sb));
        b(j6.toString());
    }
}
