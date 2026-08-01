package com.google.android.datatransport;

import java.io.FileOutputStream;
import java.io.OutputStream;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowWorkerEngine extends OutputStream {
    public final FileOutputStream WinterFlowVariableVersionControl;

    public WinterFlowWorkerEngine(FileOutputStream fileOutputStream) {
        this.WinterFlowVariableVersionControl = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        this.WinterFlowVariableVersionControl.flush();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        bArr.getClass();
        this.WinterFlowVariableVersionControl.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.WinterFlowVariableVersionControl.write(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        bArr.getClass();
        this.WinterFlowVariableVersionControl.write(bArr, i, i2);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
