package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.a6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2927a6 {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f29795a;

    static {
        ZB zb;
        C3128du c3128du = new C3128du(6);
        c3128du.f(N5.f27233n, -42L, -64L);
        c3128du.f(N5.f27241u, -6L, -53L);
        c3128du.f(N5.f27243v, -41L, -31L);
        c3128du.f(N5.f27245w, -40L, -28L);
        c3128du.f(N5.f27247x, -29L, -37L);
        c3128du.f(N5.f27249y, -80L, -32L);
        c3128du.f(N5.f27251z, -17L, -36L);
        c3128du.f(N5.f27191A, -82L, -35L);
        c3128du.f(N5.f27193B, -63L, -52L);
        c3128du.f(N5.f27195C, -23L, -11L);
        c3128du.f(N5.f27196D, -69L, -68L);
        c3128du.f(N5.f27198E, -62L, -55L);
        c3128du.f(N5.f27200F, -78L, -25L);
        c3128du.f(N5.f27202G, -71L, -3L);
        c3128du.f(N5.f27204H, -18L, -4L);
        c3128du.f(N5.f27206I, -67L, -19L);
        c3128du.f(N5.J, -58L);
        c3128du.f(N5.f27209K, -2L);
        c3128du.f(N5.f27211L, -34L);
        c3128du.f(N5.f27213M, -30L);
        c3128du.f(N5.f27215N, -56L);
        c3128du.f(N5.f27219P, -57L);
        c3128du.f(N5.f27220Q, -66L);
        c3128du.f(N5.f27221R, -60L);
        c3128du.f(N5.f27222S, -27L);
        c3128du.f(N5.f27223T, -26L);
        c3128du.f(N5.f27224U, -74L);
        c3128du.f(N5.f27225V, -77L);
        c3128du.f(N5.f27227X, -38L);
        c3128du.f(N5.f27228Z, -79L);
        c3128du.f(N5.f27229i0, -7L);
        c3128du.f(N5.f27230j0, -51L);
        c3128du.f(N5.f27231k0, -9L);
        c3128du.f(N5.f27232l0, -47L);
        c3128du.f(N5.m0, -70L);
        c3128du.f(N5.f27234n0, -14L);
        c3128du.f(N5.f27235o0, -5L);
        c3128du.f(N5.f27236p0, -39L);
        c3128du.f(N5.f27237q0, -8L);
        c3128du.f(N5.f27238r0, -54L);
        c3128du.f(N5.f27239s0, -15L);
        c3128du.f(N5.f27240t0, -12L);
        c3128du.f(N5.f27242u0, -21L);
        c3128du.f(N5.f27244v0, -43L);
        c3128du.f(N5.Y, -20L);
        c3128du.f(N5.f27226W, -81L);
        c3128du.f(N5.f27246w0, -46L);
        c3128du.f(N5.f27248x0, -61L);
        c3128du.f(N5.f27250y0, -44L);
        c3128du.f(N5.f27217O, -59L);
        c3128du.f(N5.f27252z0, -49L);
        c3128du.f(N5.f27192A0, -75L);
        c3128du.f(N5.f27194B0, -24L);
        c3128du.f(N5.f27203G0, -13L);
        c3128du.f(N5.f27205H0, -1L);
        c3128du.f(N5.C0, -33L);
        c3128du.f(N5.f27197D0, -45L);
        c3128du.f(N5.f27199E0, -50L);
        c3128du.f(N5.f27201F0, -65L);
        c3128du.f(N5.f27207I0, -16L);
        c3128du.f(N5.f27208J0, -73L);
        c3128du.f(N5.f27210K0, -10L);
        c3128du.f(N5.f27212L0, -48L);
        c3128du.f(N5.f27214M0, -22L);
        c3128du.f(N5.f27216N0, -76L);
        c3128du.f(N5.f27218O0, -72L);
        GB gb = (GB) c3128du.f30647u;
        if (gb == null) {
            zb = LB.f26873z;
        } else {
            Collection entrySet = gb.entrySet();
            if (((AbstractCollection) entrySet).isEmpty()) {
                zb = LB.f26873z;
            } else {
                EB eb = (EB) entrySet;
                C3516l5 c3516l5 = new C3516l5(eb.f25315u.size());
                Iterator it = eb.iterator();
                int i = 0;
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Object key = entry.getKey();
                    XB k9 = XB.k(((WB) entry.getValue()).h());
                    if (!k9.isEmpty()) {
                        c3516l5.e(key, k9);
                        i += k9.size();
                    }
                }
                zb = new ZB(c3516l5.s(true), i);
            }
        }
        YB yb = zb.f29630y;
        if (yb == null) {
            yb = new YB(zb);
            zb.f29630y = yb;
        }
        AbstractC4278zC a9 = yb.a();
        while (a9.hasNext()) {
            Map.Entry entry2 = (Map.Entry) a9.next();
            if (((Long) entry2.getValue()).longValue() > -1 || ((Long) entry2.getValue()).longValue() < -82) {
                throw new B0.c(L5.a("DkWkogARIjm8VAqEzyEdNWdUqAjIW8EtmA==").concat(String.valueOf(entry2.getValue())));
            }
        }
        HashMap hashMap = new HashMap();
        YB yb2 = zb.f29630y;
        if (yb2 == null) {
            yb2 = new YB(zb);
            zb.f29630y = yb2;
        }
        AbstractC4278zC a10 = yb2.a();
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
        f29795a = hashMap;
    }
}
