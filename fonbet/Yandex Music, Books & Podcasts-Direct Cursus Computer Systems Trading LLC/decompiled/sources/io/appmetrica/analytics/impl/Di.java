package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;

/* loaded from: classes5.dex */
public final class Di implements InterfaceC0839zi {
    public final /* synthetic */ Hi a;

    public Di(Hi hi) {
        this.a = hi;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0839zi
    public final void a() {
        Hi hi = this.a;
        ArrayList arrayList = hi.g;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Qi qi = (Qi) next;
            hi.c.getClass();
            String str = qi != null ? qi.a : null;
            if (str != null && str.length() != 0) {
                arrayList2.add(next);
            }
        }
        hi.a(hi.c.a(CollectionsKt.O(arrayList2)));
    }
}
