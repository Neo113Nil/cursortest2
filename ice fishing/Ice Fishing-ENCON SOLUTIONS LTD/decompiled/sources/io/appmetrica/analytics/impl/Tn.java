package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class Tn {
    public static final Qn a(Throwable th, V v2, List list, String str, Boolean bool) {
        ArrayList arrayList = null;
        Gn a2 = th != null ? Hn.a(th, 1, 0) : null;
        if (list != null) {
            arrayList = new ArrayList(i1.k.E(list));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new Dl((StackTraceElement) it.next()));
            }
        }
        return new Qn(a2, v2, arrayList, null, null, null, str, bool);
    }
}
