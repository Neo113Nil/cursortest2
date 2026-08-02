package io.appmetrica.analytics.impl;

import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* renamed from: io.appmetrica.analytics.impl.b6, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0210b6 implements es {
    public final List a;

    public C0210b6(List<? extends Pair<String, ? extends es>> list) {
        this.a = list;
    }

    @Override // io.appmetrica.analytics.impl.es
    public final void a(String str) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((es) ((Pair) it.next()).f()).a(str);
        }
    }

    @Override // io.appmetrica.analytics.impl.es
    public final String b() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            String b = ((es) ((Pair) it.next()).f()).b();
            if (b != null && b.length() > 0) {
                return b;
            }
        }
        return null;
    }

    @Override // io.appmetrica.analytics.impl.es
    public final void flushAsync() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((es) ((Pair) it.next()).f()).flushAsync();
        }
    }

    @Override // io.appmetrica.analytics.impl.es
    public final void a() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((es) ((Pair) it.next()).f()).a();
        }
    }
}
