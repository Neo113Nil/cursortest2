package com.google.android.gms.internal.measurement;

import java.io.FilterOutputStream;

/* loaded from: classes4.dex */
public abstract class zzso extends FilterOutputStream {
    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) {
        ((FilterOutputStream) this).out.write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        ((FilterOutputStream) this).out.write(bArr, i, i2);
    }
}
