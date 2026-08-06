package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;

/* loaded from: classes.dex */
public final class Xg extends Rg {

    /* renamed from: b, reason: collision with root package name */
    public final M8 f5396b;

    public Xg(X4 x4) {
        this(x4, x4.j());
    }

    @Override // io.appmetrica.analytics.impl.Rg
    public final boolean a(P5 p5) {
        EnumC0352da enumC0352da;
        if (!TextUtils.isEmpty(p5.getName())) {
            M8 m8 = this.f5396b;
            String name = p5.getName();
            if (m8.f4743c == null) {
                m8.a();
            }
            int hashCode = name.hashCode();
            if (m8.f4743c.f4856b.contains(Integer.valueOf(hashCode))) {
                enumC0352da = EnumC0352da.NON_FIRST_OCCURENCE;
            } else {
                O8 o8 = m8.f4743c;
                EnumC0352da enumC0352da2 = o8.f4855a ? EnumC0352da.FIRST_OCCURRENCE : EnumC0352da.UNKNOWN;
                if (o8.f4858d < 1000) {
                    o8.f4856b.add(Integer.valueOf(hashCode));
                    o8.f4858d++;
                } else {
                    o8.f4855a = false;
                }
                R8 r8 = m8.f4742b;
                O8 o82 = m8.f4743c;
                IBinaryDataHelper iBinaryDataHelper = r8.f4990c;
                Q8 q8 = r8.f4989b;
                r8.f4988a.getClass();
                iBinaryDataHelper.insert("event_hashes", q8.toByteArray((Q8) P8.a(o82)));
                enumC0352da = enumC0352da2;
            }
            p5.f4914k = enumC0352da;
        }
        return false;
    }

    public Xg(X4 x4, M8 m8) {
        super(x4);
        this.f5396b = m8;
    }
}
