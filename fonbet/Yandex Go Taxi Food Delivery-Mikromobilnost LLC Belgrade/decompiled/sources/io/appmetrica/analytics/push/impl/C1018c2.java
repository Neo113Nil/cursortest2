package io.appmetrica.analytics.push.impl;

import android.content.Context;
import defpackage.gw00;
import defpackage.tcc;
import io.appmetrica.analytics.push.provider.api.PushServiceController;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: io.appmetrica.analytics.push.impl.c2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C1018c2 {
    public final Context a;
    public final LinkedHashMap b;

    public C1018c2(Context context, ArrayList arrayList) {
        this.a = context;
        int d = gw00.d(tcc.n(arrayList, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(d < 16 ? 16 : d);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            linkedHashMap.put(((PushServiceController) next).getTransportId(), next);
        }
        this.b = linkedHashMap;
    }
}
