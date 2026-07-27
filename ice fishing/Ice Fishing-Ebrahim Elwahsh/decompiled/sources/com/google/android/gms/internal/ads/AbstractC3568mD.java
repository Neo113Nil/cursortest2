package com.google.android.gms.internal.ads;

import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.ads.mD, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC3568mD {
    public static /* synthetic */ boolean a(Unsafe unsafe, AbstractC3837rD abstractC3837rD, long j9, C3191fD c3191fD, C3191fD c3191fD2) {
        while (!unsafe.compareAndSwapObject(abstractC3837rD, j9, c3191fD, c3191fD2)) {
            if (unsafe.getObject(abstractC3837rD, j9) != c3191fD) {
                return false;
            }
        }
        return true;
    }
}
