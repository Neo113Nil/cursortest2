package com.google.android.datatransport;

import java.io.OutputStream;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowPackageManager extends OutputStream {
    public long WinterFlowVariableVersionControl;

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int i3;
        if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.WinterFlowVariableVersionControl += i2;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.WinterFlowVariableVersionControl += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.WinterFlowVariableVersionControl++;
    }
}
