package com.google.android.gms.internal.ads;

import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.ads.lD, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC3524lD {
    public static /* synthetic */ boolean a(Unsafe unsafe, AbstractC3794qD abstractC3794qD, long j6, C3740pD c3740pD, C3740pD c3740pD2) {
        while (!unsafe.compareAndSwapObject(abstractC3794qD, j6, c3740pD, c3740pD2)) {
            if (unsafe.getObject(abstractC3794qD, j6) != c3740pD) {
                return false;
            }
        }
        return true;
    }
}
