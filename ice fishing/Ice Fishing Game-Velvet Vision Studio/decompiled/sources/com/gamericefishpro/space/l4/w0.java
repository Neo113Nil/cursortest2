package com.gamericefishpro.space.l4;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 extends OutputStream {
    public final FileOutputStream d;

    public w0(FileOutputStream fileOutputStream) {
        Intrinsics.checkNotNullParameter(fileOutputStream, "fileOutputStream");
        this.d = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.d.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        this.d.write(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] b) throws IOException {
        Intrinsics.checkNotNullParameter(b, "b");
        this.d.write(b);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bytes, int i, int i2) throws IOException {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.d.write(bytes, i, i2);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
