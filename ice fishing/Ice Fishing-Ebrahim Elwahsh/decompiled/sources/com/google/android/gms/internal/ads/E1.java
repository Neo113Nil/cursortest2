package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class E1 extends AbstractC2982bM {

    /* renamed from: v, reason: collision with root package name */
    public long f24629v;

    /* renamed from: w, reason: collision with root package name */
    public long[] f24630w;

    /* renamed from: x, reason: collision with root package name */
    public long[] f24631x;

    public static String v1(Lr lr) {
        int L8 = lr.L();
        int i = lr.f26234b;
        lr.G(L8);
        return new String(lr.f26233a, i, L8);
    }

    public static HashMap w1(Lr lr) {
        int h9 = lr.h();
        HashMap hashMap = new HashMap(h9);
        for (int i = 0; i < h9; i++) {
            String v12 = v1(lr);
            Serializable x12 = x1(lr.K(), lr);
            if (x12 != null) {
                hashMap.put(v12, x12);
            }
        }
        return hashMap;
    }

    public static Serializable x1(int i, Lr lr) {
        if (i == 0) {
            return Double.valueOf(Double.longBitsToDouble(lr.d()));
        }
        if (i == 1) {
            return Boolean.valueOf(lr.K() == 1);
        }
        if (i == 2) {
            return v1(lr);
        }
        if (i != 3) {
            if (i == 8) {
                return w1(lr);
            }
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(lr.d()));
                lr.G(2);
                return date;
            }
            int h9 = lr.h();
            ArrayList arrayList = new ArrayList(h9);
            for (int i4 = 0; i4 < h9; i4++) {
                Serializable x12 = x1(lr.K(), lr);
                if (x12 != null) {
                    arrayList.add(x12);
                }
            }
            return arrayList;
        }
        HashMap hashMap = new HashMap();
        while (true) {
            String v12 = v1(lr);
            int K8 = lr.K();
            if (K8 == 9) {
                return hashMap;
            }
            Serializable x13 = x1(K8, lr);
            if (x13 != null) {
                hashMap.put(v12, x13);
            }
        }
    }
}
