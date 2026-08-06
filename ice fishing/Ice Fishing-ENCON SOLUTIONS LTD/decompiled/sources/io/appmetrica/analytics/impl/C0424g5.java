package io.appmetrica.analytics.impl;

import h1.C0234d;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.g5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0424g5 implements Bo {

    /* renamed from: a, reason: collision with root package name */
    public final List f6051a;

    public C0424g5(List<? extends C0234d> list) {
        this.f6051a = list;
    }

    @Override // io.appmetrica.analytics.impl.Bo
    public final String a() {
        Iterator it = this.f6051a.iterator();
        while (it.hasNext()) {
            String a2 = ((Bo) ((C0234d) it.next()).f3387b).a();
            if (a2 != null && a2.length() > 0) {
                return a2;
            }
        }
        return null;
    }

    @Override // io.appmetrica.analytics.impl.Bo
    public final void a(String str) {
        Iterator it = this.f6051a.iterator();
        while (it.hasNext()) {
            ((Bo) ((C0234d) it.next()).f3387b).a(str);
        }
    }
}
