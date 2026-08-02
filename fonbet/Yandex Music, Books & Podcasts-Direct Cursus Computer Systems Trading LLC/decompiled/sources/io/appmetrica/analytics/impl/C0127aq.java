package io.appmetrica.analytics.impl;

import defpackage.u75;
import defpackage.v75;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.aq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0127aq implements InterfaceC0532or {
    public final ArrayList a;

    public C0127aq(@NotNull String str, @NotNull List<String> list, int i, @NotNull Qq qq, @NotNull Cr cr, @NotNull AbstractC0796y3 abstractC0796y3) {
        List q0 = CollectionsKt.q0(CollectionsKt.w0(CollectionsKt.A0(list)), i);
        ArrayList arrayList = new ArrayList(v75.o(q0, 10));
        int i2 = 0;
        for (Object obj : q0) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                u75.n();
                throw null;
            }
            arrayList.add(new C0185cq(str + '_' + i2, (String) obj, qq, cr, abstractC0796y3));
            i2 = i3;
        }
        this.a = arrayList;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0532or
    public final void a(@NotNull C0503nr c0503nr) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((C0185cq) it.next()).a(c0503nr);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0532or
    public final void a(@NotNull PublicLogger publicLogger) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((C0185cq) it.next()).e = publicLogger;
        }
    }
}
