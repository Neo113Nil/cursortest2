package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class X5 {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f28604a;

    static {
        C3026cC c3026cC;
        Mu mu = new Mu(5);
        mu.f(K5.f25918n, -42L, -64L);
        mu.f(K5.f25926u, -6L, -53L);
        mu.f(K5.f25928v, -41L, -31L);
        mu.f(K5.f25930w, -40L, -28L);
        mu.f(K5.f25932x, -29L, -37L);
        mu.f(K5.f25934y, -80L, -32L);
        mu.f(K5.f25936z, -17L, -36L);
        mu.f(K5.f25875A, -82L, -35L);
        mu.f(K5.f25877B, -63L, -52L);
        mu.f(K5.f25879C, -23L, -11L);
        mu.f(K5.f25880D, -69L, -68L);
        mu.f(K5.f25882E, -62L, -55L);
        mu.f(K5.f25884F, -78L, -25L);
        mu.f(K5.f25886G, -71L, -3L);
        mu.f(K5.f25888H, -18L, -4L);
        mu.f(K5.f25890I, -67L, -19L);
        mu.f(K5.J, -58L);
        mu.f(K5.f25893K, -2L);
        mu.f(K5.f25895L, -34L);
        mu.f(K5.f25897M, -30L);
        mu.f(K5.f25899N, -56L);
        mu.f(K5.f25903P, -57L);
        mu.f(K5.f25905Q, -66L);
        mu.f(K5.f25907R, -60L);
        mu.f(K5.f25909S, -27L);
        mu.f(K5.f25911T, -26L);
        mu.f(K5.f25913U, -74L);
        mu.f(K5.f25914V, -77L);
        mu.f(K5.f25916X, -38L);
        mu.f(K5.f25917Z, -79L);
        mu.f(K5.f25919n0, -7L);
        mu.f(K5.f25920o0, -51L);
        mu.f(K5.f25921p0, -9L);
        mu.f(K5.f25922q0, -47L);
        mu.f(K5.f25923r0, -70L);
        mu.f(K5.f25924s0, -14L);
        mu.f(K5.f25925t0, -5L);
        mu.f(K5.f25927u0, -39L);
        mu.f(K5.f25929v0, -8L);
        mu.f(K5.f25931w0, -54L);
        mu.f(K5.f25933x0, -15L);
        mu.f(K5.f25935y0, -12L);
        mu.f(K5.f25937z0, -21L);
        mu.f(K5.f25876A0, -43L);
        mu.f(K5.Y, -20L);
        mu.f(K5.f25915W, -81L);
        mu.f(K5.f25878B0, -46L);
        mu.f(K5.C0, -61L);
        mu.f(K5.f25881D0, -44L);
        mu.f(K5.f25901O, -59L);
        mu.f(K5.f25883E0, -49L);
        mu.f(K5.f25885F0, -75L);
        mu.f(K5.f25887G0, -24L);
        mu.f(K5.f25896L0, -13L);
        mu.f(K5.f25898M0, -1L);
        mu.f(K5.f25889H0, -33L);
        mu.f(K5.f25891I0, -45L);
        mu.f(K5.f25892J0, -50L);
        mu.f(K5.f25894K0, -65L);
        mu.f(K5.f25900N0, -16L);
        mu.f(K5.f25902O0, -73L);
        mu.f(K5.f25904P0, -10L);
        mu.f(K5.f25906Q0, -48L);
        mu.f(K5.f25908R0, -22L);
        mu.f(K5.f25910S0, -76L);
        mu.f(K5.f25912T0, -72L);
        JB jb = (JB) mu.f26395u;
        if (jb == null) {
            c3026cC = OB.f26663z;
        } else {
            Collection entrySet = jb.entrySet();
            if (((AbstractCollection) entrySet).isEmpty()) {
                c3026cC = OB.f26663z;
            } else {
                HB hb = (HB) entrySet;
                C3398j5 c3398j5 = new C3398j5(hb.f25319u.size());
                Iterator it = hb.iterator();
                int i = 0;
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Object key = entry.getKey();
                    AbstractC2917aC k6 = AbstractC2917aC.k(((ZB) entry.getValue()).h());
                    if (!k6.isEmpty()) {
                        c3398j5.h(key, k6);
                        i += k6.size();
                    }
                }
                c3026cC = new C3026cC(c3398j5.s(true), i);
            }
        }
        C2972bC c2972bC = c3026cC.f29651y;
        if (c2972bC == null) {
            c2972bC = new C2972bC(c3026cC);
            c3026cC.f29651y = c2972bC;
        }
        CC a9 = c2972bC.a();
        while (a9.hasNext()) {
            Map.Entry entry2 = (Map.Entry) a9.next();
            if (((Long) entry2.getValue()).longValue() > -1 || ((Long) entry2.getValue()).longValue() < -82) {
                throw new B0.c(I5.a("DkWkogARIjm8VAqEzyEdNWdUqAjIW8EtmA==").concat(String.valueOf(entry2.getValue())));
            }
        }
        HashMap hashMap = new HashMap();
        C2972bC c2972bC2 = c3026cC.f29651y;
        if (c2972bC2 == null) {
            c2972bC2 = new C2972bC(c3026cC);
            c3026cC.f29651y = c2972bC2;
        }
        CC a10 = c2972bC2.a();
        while (a10.hasNext()) {
            Map.Entry entry3 = (Map.Entry) a10.next();
            K5 k52 = (K5) entry3.getKey();
            Long l9 = (Long) entry3.getValue();
            long longValue = l9.longValue();
            if (hashMap.containsKey(l9)) {
                String valueOf = String.valueOf(hashMap.get(l9));
                String valueOf2 = String.valueOf(k52);
                StringBuilder sb = new StringBuilder(valueOf.length() + String.valueOf(longValue).length() + 27 + 5 + valueOf2.length());
                sb.append(I5.a("H16u7wATM3S4Tl6egTYIeX5f+xfdXtsmmA=="));
                sb.append(longValue);
                sb.append(I5.a("cQk="));
                sb.append(valueOf);
                sb.append(I5.a("a0ivq0U="));
                sb.append(valueOf2);
                throw new B0.c(sb.toString());
            }
            hashMap.put(l9, k52);
        }
        f28604a = hashMap;
    }
}
