package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import java.util.HashSet;

/* loaded from: classes9.dex */
public final class V2 extends Aj {
    public final as b;
    public final C0573nn c;

    public V2(S5 s5) {
        this(s5, s5.v(), C0573nn.c());
    }

    @Override // io.appmetrica.analytics.impl.Aj
    public final boolean a(K6 k6) {
        S5 s5 = this.a;
        if (!this.b.c() && !this.b.d()) {
            if (((Xj) s5.k.a()).e) {
                C0573nn c0573nn = this.c;
                synchronized (c0573nn) {
                    c0573nn.b.d(false);
                }
            }
            C0214ba c0214ba = this.a.l;
            if (c0214ba.c == null) {
                c0214ba.a();
            }
            C0272da c0272da = c0214ba.c;
            c0272da.getClass();
            c0272da.b = new HashSet();
            c0272da.d = 0;
            C0272da c0272da2 = c0214ba.c;
            c0272da2.a = true;
            C0358ga c0358ga = c0214ba.b;
            IBinaryDataHelper iBinaryDataHelper = c0358ga.c;
            C0329fa c0329fa = c0358ga.b;
            c0358ga.a.getClass();
            iBinaryDataHelper.insert("event_hashes", c0329fa.toByteArray((C0329fa) C0300ea.a(c0272da2)));
        }
        return false;
    }

    public V2(S5 s5, as asVar, C0573nn c0573nn) {
        super(s5);
        this.b = asVar;
        this.c = c0573nn;
    }
}
