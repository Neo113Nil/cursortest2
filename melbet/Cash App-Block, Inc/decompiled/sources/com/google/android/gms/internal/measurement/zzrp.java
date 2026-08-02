package com.google.android.gms.internal.measurement;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class zzrp extends zzsn {
    public final ArrayList zza;

    public zzrp(InputStream inputStream, ArrayList arrayList) {
        super(inputStream);
        this.zza = arrayList;
    }

    public static zzrp zza(InputStream inputStream, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw Recorder$$ExternalSyntheticOutline2.m(it);
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return new zzrp(inputStream, arrayList2);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                a$$ExternalSyntheticBUOutline0.m$1();
                return;
            }
            try {
                throw null;
            } catch (Throwable unused) {
            }
        }
        super.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int read = ((FilterInputStream) this).in.read();
        if (read != -1) {
            Iterator it = this.zza.iterator();
            if (it.hasNext()) {
                throw Recorder$$ExternalSyntheticOutline2.m(it);
            }
        }
        return read;
    }

    @Override // com.google.android.gms.internal.measurement.zzsn, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        int read = ((FilterInputStream) this).in.read(bArr);
        if (read != -1) {
            Iterator it = this.zza.iterator();
            if (it.hasNext()) {
                throw Recorder$$ExternalSyntheticOutline2.m(it);
            }
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read = ((FilterInputStream) this).in.read(bArr, i, i2);
        if (read != -1) {
            Iterator it = this.zza.iterator();
            if (it.hasNext()) {
                throw Recorder$$ExternalSyntheticOutline2.m(it);
            }
        }
        return read;
    }
}
