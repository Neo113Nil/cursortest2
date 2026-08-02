package com.google.android.gms.internal.consent_sdk;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class F2 {

    /* renamed from: c, reason: collision with root package name */
    public static final F2 f36283c = new F2();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f36285b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final C4409w2 f36284a = new C4409w2(0);

    public final I2 a(Class cls) {
        I2 k9;
        Charset charset = AbstractC4393s2.f36513a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.f36285b;
        I2 i22 = (I2) concurrentHashMap.get(cls);
        if (i22 != null) {
            return i22;
        }
        C4409w2 c4409w2 = this.f36284a;
        c4409w2.getClass();
        O2 o22 = J2.f36323a;
        if (!AbstractC4378o2.class.isAssignableFrom(cls)) {
            int i = AbstractC4338e2.f36436a;
        }
        H2 d9 = ((C4409w2) c4409w2.f36550u).d(cls);
        if ((d9.f36297d & 2) == 2) {
            int i4 = AbstractC4338e2.f36436a;
            O2 o23 = J2.f36323a;
            J1 j12 = AbstractC4362k2.f36477a;
            k9 = new D2(o23, d9.f36294a);
        } else {
            int i6 = AbstractC4338e2.f36436a;
            int i9 = E2.f36277a;
            int i10 = AbstractC4405v2.f36542a;
            O2 o24 = J2.f36323a;
            J1 j13 = d9.a() + (-1) != 1 ? AbstractC4362k2.f36477a : null;
            int i11 = AbstractC4421z2.f36571a;
            k9 = C2.k(d9, o24, j13);
        }
        I2 i23 = (I2) concurrentHashMap.putIfAbsent(cls, k9);
        return i23 != null ? i23 : k9;
    }
}
