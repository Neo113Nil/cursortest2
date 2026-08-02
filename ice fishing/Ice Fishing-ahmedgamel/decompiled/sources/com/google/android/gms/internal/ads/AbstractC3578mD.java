package com.google.android.gms.internal.ads;

import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.ads.mD, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC3578mD {
    public static /* synthetic */ boolean a(Unsafe unsafe, AbstractC3794qD abstractC3794qD, long j6, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(abstractC3794qD, j6, obj, obj2)) {
            if (unsafe.getObject(abstractC3794qD, j6) != obj) {
                return false;
            }
        }
        return true;
    }
}
