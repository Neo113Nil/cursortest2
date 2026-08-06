package io.appmetrica.analytics.impl;

import i1.AbstractC0252i;
import i1.AbstractC0253j;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class Wm implements InterfaceC0391eo {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f5336a;

    public Wm(String str, List<String> list, int i2, Ln ln, InterfaceC0753so interfaceC0753so, J2 j2) {
        List O2 = AbstractC0252i.O(i2, AbstractC0252i.R(AbstractC0252i.V(list)));
        ArrayList arrayList = new ArrayList(i1.k.E(O2));
        int i3 = 0;
        for (Object obj : O2) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                AbstractC0253j.D();
                throw null;
            }
            arrayList.add(new Ym(str + '_' + i3, (String) obj, ln, interfaceC0753so, j2));
            i3 = i4;
        }
        this.f5336a = arrayList;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0391eo
    public final void a(Cdo cdo) {
        Iterator it = this.f5336a.iterator();
        while (it.hasNext()) {
            ((Ym) it.next()).a(cdo);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0391eo
    public final void a(PublicLogger publicLogger) {
        Iterator it = this.f5336a.iterator();
        while (it.hasNext()) {
            ((Ym) it.next()).f4147e = publicLogger;
        }
    }
}
