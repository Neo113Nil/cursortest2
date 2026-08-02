package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes9.dex */
public final class Hj extends Aj {
    public final C0214ba b;

    public Hj(S5 s5) {
        this(s5, s5.k());
    }

    @Override // io.appmetrica.analytics.impl.Aj
    public final boolean a(K6 k6) {
        EnumC0821wb enumC0821wb;
        if (!StringUtils.isNullOrEmpty(k6.getName())) {
            C0214ba c0214ba = this.b;
            String name = k6.getName();
            if (c0214ba.c == null) {
                c0214ba.a();
            }
            int hashCode = name.hashCode();
            if (c0214ba.c.b.contains(Integer.valueOf(hashCode))) {
                enumC0821wb = EnumC0821wb.NON_FIRST_OCCURENCE;
            } else {
                C0272da c0272da = c0214ba.c;
                EnumC0821wb enumC0821wb2 = c0272da.a ? EnumC0821wb.FIRST_OCCURRENCE : EnumC0821wb.UNKNOWN;
                if (c0272da.d < 1000) {
                    c0272da.b.add(Integer.valueOf(hashCode));
                    c0272da.d++;
                } else {
                    c0272da.a = false;
                }
                C0358ga c0358ga = c0214ba.b;
                C0272da c0272da2 = c0214ba.c;
                IBinaryDataHelper iBinaryDataHelper = c0358ga.c;
                C0329fa c0329fa = c0358ga.b;
                c0358ga.a.getClass();
                iBinaryDataHelper.insert("event_hashes", c0329fa.toByteArray((C0329fa) C0300ea.a(c0272da2)));
                enumC0821wb = enumC0821wb2;
            }
            k6.k = enumC0821wb;
        }
        return false;
    }

    public Hj(S5 s5, C0214ba c0214ba) {
        super(s5);
        this.b = c0214ba;
    }
}
