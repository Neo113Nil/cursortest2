package com.google.android.gms.internal.measurement;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class zzrq extends zzso {
    public final ArrayList zza;

    public zzrq(OutputStream outputStream, ArrayList arrayList) {
        super(outputStream);
        this.zza = arrayList;
    }

    public static zzrq zza(OutputStream outputStream, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw Recorder$$ExternalSyntheticOutline2.m(it);
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return new zzrq(outputStream, arrayList2);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
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

    @Override // com.google.android.gms.internal.measurement.zzso, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) {
        ((FilterOutputStream) this).out.write(bArr);
        Iterator it = this.zza.iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                a$$ExternalSyntheticBUOutline0.m$1();
            } else {
                int length = bArr.length;
                throw null;
            }
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) {
        ((FilterOutputStream) this).out.write(i);
        Iterator it = this.zza.iterator();
        if (it.hasNext()) {
            throw Recorder$$ExternalSyntheticOutline2.m(it);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzso, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        ((FilterOutputStream) this).out.write(bArr, i, i2);
        Iterator it = this.zza.iterator();
        if (it.hasNext()) {
            throw Recorder$$ExternalSyntheticOutline2.m(it);
        }
    }
}
