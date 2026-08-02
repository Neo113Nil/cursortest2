package com.google.android.gms.internal.mlkit_genai_prompt;

import sun.misc.Unsafe;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class zzjf$$ExternalSyntheticBackportWithForwarding0 {
    public static /* synthetic */ boolean m(Unsafe unsafe, zzjd zzjdVar, long j, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(zzjdVar, j, obj, obj2)) {
            if (unsafe.getObject(zzjdVar, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
