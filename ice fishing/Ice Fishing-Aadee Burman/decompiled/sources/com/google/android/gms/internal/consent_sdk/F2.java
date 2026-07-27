package com.google.android.gms.internal.consent_sdk;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class F2 {

    /* renamed from: c, reason: collision with root package name */
    public static final F2 f35514c = new F2();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f35516b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final C4386w2 f35515a = new C4386w2(0);

    public final I2 a(Class cls) {
        I2 k9;
        Charset charset = AbstractC4370s2.f35744a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.f35516b;
        I2 i22 = (I2) concurrentHashMap.get(cls);
        if (i22 != null) {
            return i22;
        }
        C4386w2 c4386w2 = this.f35515a;
        c4386w2.getClass();
        O2 o22 = J2.f35554a;
        if (!AbstractC4355o2.class.isAssignableFrom(cls)) {
            int i = AbstractC4315e2.f35667a;
        }
        H2 d2 = ((C4386w2) c4386w2.f35781u).d(cls);
        if ((d2.f35528d & 2) == 2) {
            int i6 = AbstractC4315e2.f35667a;
            O2 o23 = J2.f35554a;
            J1 j12 = AbstractC4339k2.f35708a;
            k9 = new D2(o23, d2.f35525a);
        } else {
            int i9 = AbstractC4315e2.f35667a;
            int i10 = E2.f35508a;
            int i11 = AbstractC4382v2.f35773a;
            O2 o24 = J2.f35554a;
            J1 j13 = d2.a() + (-1) != 1 ? AbstractC4339k2.f35708a : null;
            int i12 = AbstractC4398z2.f35802a;
            k9 = C2.k(d2, o24, j13);
        }
        I2 i23 = (I2) concurrentHashMap.putIfAbsent(cls, k9);
        return i23 != null ? i23 : k9;
    }
}
