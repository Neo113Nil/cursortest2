package com.google.android.gms.internal.measurement;

import com.datadog.trace.api.ConfigCollectorAtomicFieldUpdaterHelper;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* loaded from: classes4.dex */
public final class zzok implements Comparable {
    public static final AtomicReferenceFieldUpdater zzc = AtomicReferenceFieldUpdater.newUpdater(zzok.class, Object.class, "zzb");
    public static final /* synthetic */ long zzc$offset = ConfigCollectorAtomicFieldUpdaterHelper.unsafe.objectFieldOffset(zzok.class.getDeclaredField("zzb"));
    public final String zza;
    public volatile Object zzb;

    public /* synthetic */ zzok(String str, byte[] bArr) {
        this.zza = str;
        this.zzb = bArr;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.zza.compareTo((String) obj);
    }

    public final /* synthetic */ String zza() {
        return this.zza;
    }

    public final /* synthetic */ void zzb(byte[] bArr) {
        byte[][] bArr2;
        zzok zzokVar;
        int i = 0;
        while (true) {
            Object obj = this.zzb;
            if (!(obj instanceof byte[])) {
                byte[][] bArr3 = (byte[][]) obj;
                while (true) {
                    int length = bArr3.length;
                    if (i >= length) {
                        bArr2 = (byte[][]) Arrays.copyOf(bArr3, length + 1);
                        bArr2[length] = bArr;
                        break;
                    } else if (Arrays.equals(bArr, bArr3[i])) {
                        return;
                    } else {
                        i++;
                    }
                }
            } else {
                byte[] bArr4 = (byte[]) obj;
                if (Arrays.equals(bArr, bArr4)) {
                    return;
                }
                i = 1;
                bArr2 = new byte[][]{bArr4, bArr};
            }
            byte[][] bArr5 = bArr2;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = zzc;
            while (true) {
                atomicReferenceFieldUpdater.getClass();
                Unsafe unsafe = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
                long j = zzc$offset;
                zzokVar = this;
                if (unsafe.compareAndSwapObject(zzokVar, j, obj, bArr5)) {
                    return;
                }
                if (unsafe.getObjectVolatile(zzokVar, j) != obj) {
                    break;
                } else {
                    this = zzokVar;
                }
            }
            this = zzokVar;
        }
    }
}
