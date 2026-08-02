package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;

/* renamed from: io.appmetrica.analytics.impl.ba, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0214ba {
    public final int a;
    public final C0358ga b;
    public C0272da c;

    public C0214ba(C0358ga c0358ga, int i) {
        this.a = i;
        this.b = c0358ga;
    }

    public final void a() {
        C0272da c0272da;
        C0358ga c0358ga = this.b;
        c0358ga.getClass();
        try {
            byte[] bArr = c0358ga.c.get("event_hashes");
            boolean a = Or.a(bArr);
            C0300ea c0300ea = c0358ga.a;
            if (a) {
                c0358ga.b.getClass();
                Ja ja = new Ja();
                c0300ea.getClass();
                c0272da = new C0272da(ja.a, ja.b, ja.c, CollectionUtils.hashSetFromIntArray(ja.d));
            } else {
                Ja state = c0358ga.b.toState(bArr);
                c0300ea.getClass();
                c0272da = new C0272da(state.a, state.b, state.c, CollectionUtils.hashSetFromIntArray(state.d));
            }
        } catch (Throwable unused) {
            C0300ea c0300ea2 = c0358ga.a;
            c0358ga.b.getClass();
            Ja ja2 = new Ja();
            c0300ea2.getClass();
            c0272da = new C0272da(ja2.a, ja2.b, ja2.c, CollectionUtils.hashSetFromIntArray(ja2.d));
        }
        this.c = c0272da;
        int i = c0272da.c;
        int i2 = this.a;
        if (i != i2) {
            c0272da.c = i2;
            c0272da.d = 0;
            C0358ga c0358ga2 = this.b;
            IBinaryDataHelper iBinaryDataHelper = c0358ga2.c;
            C0329fa c0329fa = c0358ga2.b;
            c0358ga2.a.getClass();
            iBinaryDataHelper.insert("event_hashes", c0329fa.toByteArray((C0329fa) C0300ea.a(c0272da)));
        }
    }
}
