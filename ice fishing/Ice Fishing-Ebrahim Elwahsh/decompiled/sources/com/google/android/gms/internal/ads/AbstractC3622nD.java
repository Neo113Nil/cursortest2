package com.google.android.gms.internal.ads;

import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.ads.nD, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC3622nD {
    public static /* synthetic */ boolean a(Unsafe unsafe, AbstractC3837rD abstractC3837rD, long j9, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(abstractC3837rD, j9, obj, obj2)) {
            if (unsafe.getObject(abstractC3837rD, j9) != obj) {
                return false;
            }
        }
        return true;
    }
}
