package com.google.android.gms.internal.mlkit_vision_barcode;

import sun.misc.Unsafe;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class zzec$$ExternalSyntheticBackportWithForwarding0 {
    public static /* synthetic */ boolean m(Unsafe unsafe, zzdz zzdzVar, long j, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(zzdzVar, j, obj, obj2)) {
            if (unsafe.getObject(zzdzVar, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
