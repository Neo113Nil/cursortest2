package io.appmetrica.analytics.impl;

import defpackage.scc;
import defpackage.tcc;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.sq, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0720sq implements Hr {
    public final ArrayList a;

    public C0720sq(String str, List<String> list, int i, InterfaceC0461jr interfaceC0461jr, Vr vr, AbstractC0871y3 abstractC0871y3) {
        List A0 = kotlin.collections.a.A0(kotlin.collections.a.J0(kotlin.collections.a.N0(list)), i);
        ArrayList arrayList = new ArrayList(tcc.n(A0, 10));
        int i2 = 0;
        for (Object obj : A0) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                scc.m();
                throw null;
            }
            arrayList.add(new C0778uq(str + '_' + i2, (String) obj, interfaceC0461jr, vr, abstractC0871y3));
            i2 = i3;
        }
        this.a = arrayList;
    }

    @Override // io.appmetrica.analytics.impl.Hr
    public final void a(Gr gr) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((C0778uq) it.next()).a(gr);
        }
    }

    @Override // io.appmetrica.analytics.impl.Hr
    public final void a(PublicLogger publicLogger) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((C0778uq) it.next()).e = publicLogger;
        }
    }
}
