package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class G1 extends OK {

    /* renamed from: v, reason: collision with root package name */
    public long f24904v;

    /* renamed from: w, reason: collision with root package name */
    public long[] f24905w;

    /* renamed from: x, reason: collision with root package name */
    public long[] f24906x;

    public static String Q1(Cr cr) {
        int L6 = cr.L();
        int i = cr.f24253b;
        cr.G(L6);
        return new String(cr.f24252a, i, L6);
    }

    public static HashMap T1(Cr cr) {
        int h9 = cr.h();
        HashMap hashMap = new HashMap(h9);
        for (int i = 0; i < h9; i++) {
            String Q12 = Q1(cr);
            Serializable U12 = U1(cr.K(), cr);
            if (U12 != null) {
                hashMap.put(Q12, U12);
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
            return Q1(cr);
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
            int h9 = cr.h();
            ArrayList arrayList = new ArrayList(h9);
            for (int i6 = 0; i6 < h9; i6++) {
                Serializable U12 = U1(cr.K(), cr);
                if (U12 != null) {
                    arrayList.add(U12);
                }
            }
            return arrayList;
        }
        HashMap hashMap = new HashMap();
        while (true) {
            String Q12 = Q1(cr);
            int K7 = cr.K();
            if (K7 == 9) {
                return hashMap;
            }
            Serializable U13 = U1(K7, cr);
            if (U13 != null) {
                hashMap.put(Q12, U13);
            }
        }
    }
}
