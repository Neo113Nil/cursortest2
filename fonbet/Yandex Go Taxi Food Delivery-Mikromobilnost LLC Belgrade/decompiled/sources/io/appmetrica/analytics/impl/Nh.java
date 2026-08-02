package io.appmetrica.analytics.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class Nh implements InterfaceC0895yr {
    public final boolean a;

    public Nh(Ph ph) {
        boolean z;
        List<Oh> list = ph.b;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((Oh) it.next()).c == EnumC0271d9.d) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        this.a = z;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0895yr, defpackage.wls
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Oh> invoke(List<? extends Oh> list, C0251ci c0251ci) {
        Oh oh = new Oh(c0251ci.a, c0251ci.b, c0251ci.e);
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((Oh) it.next()).c == c0251ci.e) {
                    if (oh.c == EnumC0271d9.d && this.a) {
                        return kotlin.collections.a.o0(list, oh);
                    }
                    return null;
                }
            }
        }
        return kotlin.collections.a.o0(list, oh);
    }
}
