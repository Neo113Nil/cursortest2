package com.google.android.gms.internal.ads;

import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class FC extends OutputStream {
    public final String toString() {
        return "ByteStreams.nullOutputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        bArr.getClass();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i4) {
        bArr.getClass();
        AbstractC2792Sd.M(i, i4 + i, bArr.length);
    }
}
