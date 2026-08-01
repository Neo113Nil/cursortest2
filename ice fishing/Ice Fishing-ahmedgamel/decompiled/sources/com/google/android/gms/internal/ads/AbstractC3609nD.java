package com.google.android.gms.internal.ads;

import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.ads.nD, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC3609nD {
    public static /* synthetic */ boolean a(Unsafe unsafe, AbstractC3771qD abstractC3771qD, long j6, C3125eD c3125eD, C3125eD c3125eD2) {
        while (!unsafe.compareAndSwapObject(abstractC3771qD, j6, c3125eD, c3125eD2)) {
            if (unsafe.getObject(abstractC3771qD, j6) != c3125eD) {
                return false;
            }
        }
        return true;
    }
}
