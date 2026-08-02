package io.appmetrica.analytics.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.xh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0782xh implements InterfaceC0301gr {
    public final boolean a;

    public C0782xh(@NotNull C0838zh c0838zh) {
        boolean z;
        List<C0810yh> list = c0838zh.b;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((C0810yh) it.next()).c == X8.c) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        this.a = z;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0301gr, kotlin.jvm.functions.Function2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<C0810yh> invoke(@NotNull List<? extends C0810yh> list, @NotNull Mh mh) {
        C0810yh c0810yh = new C0810yh(mh.a, mh.b, mh.e);
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((C0810yh) it.next()).c == mh.e) {
                    if (c0810yh.c == X8.c && this.a) {
                        return CollectionsKt.h0(list, c0810yh);
                    }
                    return null;
                }
            }
        }
        return CollectionsKt.h0(list, c0810yh);
    }
}
