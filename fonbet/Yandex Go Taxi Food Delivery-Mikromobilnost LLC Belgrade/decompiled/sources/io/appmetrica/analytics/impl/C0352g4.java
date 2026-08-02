package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.g4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0352g4 implements InterfaceC0895yr {
    @Override // io.appmetrica.analytics.impl.InterfaceC0895yr, defpackage.wls
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<C0467k4> invoke(List<C0467k4> list, C0467k4 c0467k4) {
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                EnumC0271d9 enumC0271d9 = ((C0467k4) it.next()).b;
                EnumC0271d9 enumC0271d92 = c0467k4.b;
                if (enumC0271d9 == enumC0271d92) {
                    if (enumC0271d92 != EnumC0271d9.d) {
                        return null;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (((C0467k4) obj).b != EnumC0271d9.d) {
                            arrayList.add(obj);
                        }
                    }
                    return kotlin.collections.a.o0(arrayList, c0467k4);
                }
            }
        }
        return kotlin.collections.a.o0(list, c0467k4);
    }
}
