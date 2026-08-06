package io.appmetrica.analytics.impl;

import i1.AbstractC0252i;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.bf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0305bf implements InterfaceC0314bo {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5670a;

    public C0305bf(C0357df c0357df) {
        boolean z2;
        List<C0331cf> list = c0357df.f5818b;
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((C0331cf) it.next()).f5749c == S7.f5045c) {
                    z2 = false;
                    break;
                }
            }
        }
        z2 = true;
        this.f5670a = z2;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0314bo, t1.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<C0331cf> invoke(List<? extends C0331cf> list, C0693qf c0693qf) {
        C0331cf c0331cf = new C0331cf(c0693qf.f6778a, c0693qf.f6779b, c0693qf.f6782e);
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((C0331cf) it.next()).f5749c == c0693qf.f6782e) {
                    if (c0331cf.f5749c == S7.f5045c && this.f5670a) {
                        return AbstractC0252i.M(list, c0331cf);
                    }
                    return null;
                }
            }
        }
        return AbstractC0252i.M(list, c0331cf);
    }
}
