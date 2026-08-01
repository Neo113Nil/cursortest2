package com.google.android.datatransport;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowProcessorUtility extends FilterInputStream {
    public long WinterFlowTransactionManagerStrategy;
    public long WinterFlowVariableVersionControl;

    public WinterFlowProcessorUtility(InputStream inputStream) {
        super(inputStream);
        this.WinterFlowTransactionManagerStrategy = -1L;
        this.WinterFlowVariableVersionControl = 1048577L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return (int) Math.min(((FilterInputStream) this).in.available(), this.WinterFlowVariableVersionControl);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        ((FilterInputStream) this).in.mark(i);
        this.WinterFlowTransactionManagerStrategy = this.WinterFlowVariableVersionControl;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        long j = this.WinterFlowVariableVersionControl;
        if (j == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read(bArr, i, (int) Math.min(i2, j));
        if (read != -1) {
            this.WinterFlowVariableVersionControl -= read;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.WinterFlowTransactionManagerStrategy == -1) {
            throw new IOException("Mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.WinterFlowVariableVersionControl = this.WinterFlowTransactionManagerStrategy;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        long skip = ((FilterInputStream) this).in.skip(Math.min(j, this.WinterFlowVariableVersionControl));
        this.WinterFlowVariableVersionControl -= skip;
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        if (this.WinterFlowVariableVersionControl == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read();
        if (read != -1) {
            this.WinterFlowVariableVersionControl--;
        }
        return read;
    }
}
