package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.util.AbstractList;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public abstract class zzaed {
    public static final byte[] zza;

    public final class zza extends AbstractList {
        public final zzaeb zza;
        public final zzaec zzb;

        public zza(zzaeb zzaebVar, zzaec zzaecVar) {
            this.zza = zzaebVar;
            this.zzb = zzaecVar;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i) {
            int zzf = ((zzadv) this.zza).zzf(i);
            ((com.google.android.gms.dynamite.zzh) this.zzb).getClass();
            zzabz zzb = zzabz.zzb(zzf);
            return zzb == null ? zzabz.UNKNOWN : zzb;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.zza.size();
        }
    }

    static {
        byte[] bArr = new byte[0];
        zza = bArr;
        ByteBuffer.wrap(bArr);
        int i = 0 + 0;
        try {
            if (i < 0) {
                throw new zzaeh("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            }
            if (i > Integer.MAX_VALUE) {
                throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
        } catch (zzaeh e) {
            Path$$ExternalSyntheticBUOutline0.m((Throwable) e);
        }
    }

    public static int zzb(int i, int i2, int i3, byte[] bArr) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }
}
