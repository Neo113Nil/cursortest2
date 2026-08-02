package io.appmetrica.analytics.impl;

import defpackage.v75;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class Yq {
    public static final Vq a(Throwable th, Z z, List list, String str, Boolean bool) {
        ArrayList arrayList = null;
        Lq a = th != null ? Mq.a(th, 1, 0) : null;
        if (list != null) {
            arrayList = new ArrayList(v75.o(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new Go((StackTraceElement) it.next()));
            }
        }
        return new Vq(a, z, arrayList, null, null, null, str, bool);
    }
}
