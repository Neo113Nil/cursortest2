package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class G1 extends OK {

    /* renamed from: v, reason: collision with root package name */
    public long f25694v;

    /* renamed from: w, reason: collision with root package name */
    public long[] f25695w;

    /* renamed from: x, reason: collision with root package name */
    public long[] f25696x;

    public static String R1(Cr cr) {
        int L2 = cr.L();
        int i = cr.f24998b;
        cr.G(L2);
        return new String(cr.f24997a, i, L2);
    }

    public static HashMap T1(Cr cr) {
        int h3 = cr.h();
        HashMap hashMap = new HashMap(h3);
        for (int i = 0; i < h3; i++) {
            String R1 = R1(cr);
            Serializable U12 = U1(cr.K(), cr);
            if (U12 != null) {
                hashMap.put(R1, U12);
            }
        }
        return hashMap;
    }

    public static Serializable U1(int i, Cr cr) {
        if (i == 0) {
            return Double.valueOf(Double.longBitsToDouble(cr.d()));
        }
        if (i == 1) {
            return Boolean.valueOf(cr.K() == 1);
        }
        if (i == 2) {
            return R1(cr);
        }
        if (i != 3) {
            if (i == 8) {
                return T1(cr);
            }
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(cr.d()));
                cr.G(2);
                return date;
            }
            int h3 = cr.h();
            ArrayList arrayList = new ArrayList(h3);
            for (int i4 = 0; i4 < h3; i4++) {
                Serializable U12 = U1(cr.K(), cr);
                if (U12 != null) {
                    arrayList.add(U12);
                }
            }
            return arrayList;
        }
        HashMap hashMap = new HashMap();
        while (true) {
            String R1 = R1(cr);
            int K7 = cr.K();
            if (K7 == 9) {
                return hashMap;
            }
            Serializable U13 = U1(K7, cr);
            if (U13 != null) {
                hashMap.put(R1, U13);
            }
        }
    }
}
