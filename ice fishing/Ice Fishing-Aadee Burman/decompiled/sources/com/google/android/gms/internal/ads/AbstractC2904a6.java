package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.a6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2904a6 {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f29025a;

    static {
        ZB zb;
        C3105du c3105du = new C3105du(6);
        c3105du.f(N5.f26449n, -42L, -64L);
        c3105du.f(N5.f26457u, -6L, -53L);
        c3105du.f(N5.f26459v, -41L, -31L);
        c3105du.f(N5.f26461w, -40L, -28L);
        c3105du.f(N5.f26463x, -29L, -37L);
        c3105du.f(N5.f26465y, -80L, -32L);
        c3105du.f(N5.f26467z, -17L, -36L);
        c3105du.f(N5.f26406A, -82L, -35L);
        c3105du.f(N5.f26408B, -63L, -52L);
        c3105du.f(N5.f26410C, -23L, -11L);
        c3105du.f(N5.f26411D, -69L, -68L);
        c3105du.f(N5.f26413E, -62L, -55L);
        c3105du.f(N5.f26415F, -78L, -25L);
        c3105du.f(N5.f26417G, -71L, -3L);
        c3105du.f(N5.f26419H, -18L, -4L);
        c3105du.f(N5.f26421I, -67L, -19L);
        c3105du.f(N5.J, -58L);
        c3105du.f(N5.f26424K, -2L);
        c3105du.f(N5.f26426L, -34L);
        c3105du.f(N5.f26428M, -30L);
        c3105du.f(N5.f26430N, -56L);
        c3105du.f(N5.f26434P, -57L);
        c3105du.f(N5.f26436Q, -66L);
        c3105du.f(N5.f26438R, -60L);
        c3105du.f(N5.f26440S, -27L);
        c3105du.f(N5.f26442T, -26L);
        c3105du.f(N5.f26444U, -74L);
        c3105du.f(N5.f26445V, -77L);
        c3105du.f(N5.f26447X, -38L);
        c3105du.f(N5.f26448Z, -79L);
        c3105du.f(N5.f26450n0, -7L);
        c3105du.f(N5.f26451o0, -51L);
        c3105du.f(N5.f26452p0, -9L);
        c3105du.f(N5.f26453q0, -47L);
        c3105du.f(N5.f26454r0, -70L);
        c3105du.f(N5.f26455s0, -14L);
        c3105du.f(N5.f26456t0, -5L);
        c3105du.f(N5.f26458u0, -39L);
        c3105du.f(N5.f26460v0, -8L);
        c3105du.f(N5.f26462w0, -54L);
        c3105du.f(N5.f26464x0, -15L);
        c3105du.f(N5.f26466y0, -12L);
        c3105du.f(N5.f26468z0, -21L);
        c3105du.f(N5.f26407A0, -43L);
        c3105du.f(N5.Y, -20L);
        c3105du.f(N5.f26446W, -81L);
        c3105du.f(N5.f26409B0, -46L);
        c3105du.f(N5.C0, -61L);
        c3105du.f(N5.f26412D0, -44L);
        c3105du.f(N5.f26432O, -59L);
        c3105du.f(N5.f26414E0, -49L);
        c3105du.f(N5.f26416F0, -75L);
        c3105du.f(N5.f26418G0, -24L);
        c3105du.f(N5.f26427L0, -13L);
        c3105du.f(N5.f26429M0, -1L);
        c3105du.f(N5.f26420H0, -33L);
        c3105du.f(N5.f26422I0, -45L);
        c3105du.f(N5.f26423J0, -50L);
        c3105du.f(N5.f26425K0, -65L);
        c3105du.f(N5.f26431N0, -16L);
        c3105du.f(N5.f26433O0, -73L);
        c3105du.f(N5.f26435P0, -10L);
        c3105du.f(N5.f26437Q0, -48L);
        c3105du.f(N5.f26439R0, -22L);
        c3105du.f(N5.f26441S0, -76L);
        c3105du.f(N5.f26443T0, -72L);
        GB gb = (GB) c3105du.f29859u;
        if (gb == null) {
            zb = LB.f26073z;
        } else {
            Collection entrySet = gb.entrySet();
            if (((AbstractCollection) entrySet).isEmpty()) {
                zb = LB.f26073z;
            } else {
                EB eb = (EB) entrySet;
                C3493l5 c3493l5 = new C3493l5(eb.f24554u.size());
                Iterator it = eb.iterator();
                int i = 0;
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Object key = entry.getKey();
                    XB k9 = XB.k(((WB) entry.getValue()).h());
                    if (!k9.isEmpty()) {
                        c3493l5.e(key, k9);
                        i += k9.size();
                    }
                }
                zb = new ZB(c3493l5.s(true), i);
            }
        }
        YB yb = zb.f28850y;
        if (yb == null) {
            yb = new YB(zb);
            zb.f28850y = yb;
        }
        AbstractC4255zC a9 = yb.a();
        while (a9.hasNext()) {
            Map.Entry entry2 = (Map.Entry) a9.next();
            if (((Long) entry2.getValue()).longValue() > -1 || ((Long) entry2.getValue()).longValue() < -82) {
                throw new B0.c(L5.a("DkWkogARIjm8VAqEzyEdNWdUqAjIW8EtmA==").concat(String.valueOf(entry2.getValue())));
            }
        }
        HashMap hashMap = new HashMap();
        YB yb2 = zb.f28850y;
        if (yb2 == null) {
            yb2 = new YB(zb);
            zb.f28850y = yb2;
        }
        AbstractC4255zC a10 = yb2.a();
        while (a10.hasNext()) {
            Map.Entry entry3 = (Map.Entry) a10.next();
            N5 n52 = (N5) entry3.getKey();
            Long l9 = (Long) entry3.getValue();
            long longValue = l9.longValue();
            if (hashMap.containsKey(l9)) {
                String valueOf = String.valueOf(hashMap.get(l9));
                String valueOf2 = String.valueOf(n52);
                StringBuilder sb = new StringBuilder(valueOf.length() + String.valueOf(longValue).length() + 27 + 5 + valueOf2.length());
                sb.append(L5.a("H16u7wATM3S4Tl6egTYIeX5f+xfdXtsmmA=="));
                sb.append(longValue);
                sb.append(L5.a("cQk="));
                sb.append(valueOf);
                sb.append(L5.a("a0ivq0U="));
                sb.append(valueOf2);
                throw new B0.c(sb.toString());
            }
            hashMap.put(l9, n52);
        }
        f29025a = hashMap;
    }
}
