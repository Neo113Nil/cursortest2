package com.google.android.datatransport;

import java.io.Writer;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowUserManagerHelper extends Writer {
    public final StringBuilder WinterFlowVariableVersionControl = new StringBuilder(128);

    public final void WinterFlowHookDataSource() {
        StringBuilder sb = this.WinterFlowVariableVersionControl;
        if (sb.length() > 0) {
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        WinterFlowHookDataSource();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        WinterFlowHookDataSource();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                WinterFlowHookDataSource();
            } else {
                this.WinterFlowVariableVersionControl.append(c);
            }
        }
    }
}
