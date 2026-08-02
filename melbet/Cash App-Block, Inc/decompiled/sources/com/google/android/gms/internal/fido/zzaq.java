package com.google.android.gms.internal.fido;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import java.io.IOException;
import java.util.ArrayDeque;

/* loaded from: classes4.dex */
public final class zzaq {
    public final Object zze;

    public zzaq() {
        this.zze = new ArrayDeque(16);
    }

    public Object zza() {
        if (zzh.zze == null) {
            zzh.zze = new zzag();
        }
        synchronized (zzh.f63zza) {
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }

    public void zzb() {
        ArrayDeque arrayDeque = (ArrayDeque) this.zze;
        if (arrayDeque.isEmpty()) {
            return;
        }
        throw new IOException("data item not completed, stackSize: " + arrayDeque.size() + " scope: " + zzh());
    }

    public void zze(long j) {
        long zzh = zzh();
        if (zzh != j) {
            if (zzh != -1) {
                if (zzh != -2) {
                    return;
                } else {
                    zzh = -2;
                }
            }
            StringBuilder m1149m = Boxes$$ExternalSyntheticOutline1.m1149m(j, "expected non-string scope or scope ", " but found ");
            m1149m.append(zzh);
            throw new IOException(m1149m.toString());
        }
    }

    public long zzh() {
        ArrayDeque arrayDeque = (ArrayDeque) this.zze;
        if (arrayDeque.isEmpty()) {
            return 0L;
        }
        return ((Long) arrayDeque.peek()).longValue();
    }

    public zzaq(Object obj) {
        this.zze = obj;
    }
}
