package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.c4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0163c4 implements InterfaceC0301gr {
    @Override // io.appmetrica.analytics.impl.InterfaceC0301gr, kotlin.jvm.functions.Function2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<C0278g4> invoke(@NotNull List<C0278g4> list, @NotNull C0278g4 c0278g4) {
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                X8 x8 = ((C0278g4) it.next()).b;
                X8 x82 = c0278g4.b;
                if (x8 == x82) {
                    if (x82 != X8.c) {
                        return null;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (((C0278g4) obj).b != X8.c) {
                            arrayList.add(obj);
                        }
                    }
                    return CollectionsKt.h0(arrayList, c0278g4);
                }
            }
        }
        return CollectionsKt.h0(list, c0278g4);
    }
}
