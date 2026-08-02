package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashMap;

/* loaded from: classes9.dex */
public final class Y5 {
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final Context c;

    public Y5(Context context) {
        this.c = context.getApplicationContext();
    }

    public final InterfaceC0389hc a(K5 k5, C0468k5 c0468k5, Y8 y8, HashMap hashMap) {
        InterfaceC0389hc interfaceC0389hc = (InterfaceC0389hc) hashMap.get(k5.toString());
        if (interfaceC0389hc != null) {
            interfaceC0389hc.a(c0468k5);
            return interfaceC0389hc;
        }
        InterfaceC0389hc a = y8.a(this.c, k5, c0468k5);
        hashMap.put(k5.toString(), a);
        return a;
    }
}
