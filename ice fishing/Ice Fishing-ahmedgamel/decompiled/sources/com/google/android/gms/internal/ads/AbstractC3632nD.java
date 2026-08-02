package com.google.android.gms.internal.ads;

import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.ads.nD, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC3632nD {
    public static /* synthetic */ boolean a(Unsafe unsafe, AbstractC3794qD abstractC3794qD, long j6, C3148eD c3148eD, C3148eD c3148eD2) {
        while (!unsafe.compareAndSwapObject(abstractC3794qD, j6, c3148eD, c3148eD2)) {
            if (unsafe.getObject(abstractC3794qD, j6) != c3148eD) {
                return false;
            }
        }
        return true;
    }
}
