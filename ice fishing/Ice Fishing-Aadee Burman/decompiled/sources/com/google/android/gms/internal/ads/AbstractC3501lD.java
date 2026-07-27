package com.google.android.gms.internal.ads;

import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.ads.lD, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC3501lD {
    public static /* synthetic */ boolean a(Unsafe unsafe, AbstractC3771qD abstractC3771qD, long j6, C3717pD c3717pD, C3717pD c3717pD2) {
        while (!unsafe.compareAndSwapObject(abstractC3771qD, j6, c3717pD, c3717pD2)) {
            if (unsafe.getObject(abstractC3771qD, j6) != c3717pD) {
                return false;
            }
        }
        return true;
    }
}
