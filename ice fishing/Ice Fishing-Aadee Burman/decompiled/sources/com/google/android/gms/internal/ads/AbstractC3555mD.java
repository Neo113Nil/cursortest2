package com.google.android.gms.internal.ads;

import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.ads.mD, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC3555mD {
    public static /* synthetic */ boolean a(Unsafe unsafe, AbstractC3771qD abstractC3771qD, long j6, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(abstractC3771qD, j6, obj, obj2)) {
            if (unsafe.getObject(abstractC3771qD, j6) != obj) {
                return false;
            }
        }
        return true;
    }
}
