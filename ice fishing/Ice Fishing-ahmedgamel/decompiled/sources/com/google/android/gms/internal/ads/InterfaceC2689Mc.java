package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import s2.C4949p;
import w.AbstractC5128c;

/* renamed from: com.google.android.gms.internal.ads.Mc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC2689Mc extends InterfaceC2757Qc, InterfaceC2672Lc {
    @Override // com.google.android.gms.internal.ads.InterfaceC2757Qc
    void b(String str);

    @Override // com.google.android.gms.internal.ads.InterfaceC2757Qc
    default void c(String str, String str2) {
        b(com.IceFishing.LiveIceFishing.k.r(new StringBuilder(AbstractC5128c.j(1, String.valueOf(str2).length(), str) + 2), str, "(", str2, ");"));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2672Lc
    default void d(String str, Map map) {
        try {
            e("openIntentAsync", C4949p.f40498g.f40499a.l(map));
        } catch (JSONException unused) {
            int i = w2.z.f41712b;
            x2.i.f("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2672Lc
    default void e(String str, JSONObject jSONObject) {
        StringBuilder l9 = Wv.l("(window.AFMA_ReceiveMessage || function() {})('openIntentAsync',", jSONObject.toString(), ");");
        String sb = l9.toString();
        int i = w2.z.f41712b;
        x2.i.a("Dispatching AFMA event: ".concat(sb));
        b(l9.toString());
    }
}
