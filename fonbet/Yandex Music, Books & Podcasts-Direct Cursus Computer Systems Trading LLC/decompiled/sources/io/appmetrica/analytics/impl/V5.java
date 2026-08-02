package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashMap;

/* loaded from: classes5.dex */
public final class V5 {
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final Context c;

    public V5(Context context) {
        this.c = context.getApplicationContext();
    }

    public final Sb a(H5 h5, C0279g5 c0279g5, T8 t8, HashMap hashMap) {
        Sb sb = (Sb) hashMap.get(h5.toString());
        if (sb != null) {
            sb.a(c0279g5);
            return sb;
        }
        Sb a = t8.a(this.c, h5, c0279g5);
        hashMap.put(h5.toString(), a);
        return a;
    }
}
