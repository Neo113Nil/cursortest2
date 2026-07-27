package kotlin.text;

import java.io.Writer;

/* loaded from: classes.dex */
public final class CatchingFishViewPagerMVP extends Writer {
    public final StringBuilder CatchingFishReduxKtor = new StringBuilder(128);

    public final void CatchingFishSnackbar() {
        StringBuilder sb = this.CatchingFishReduxKtor;
        if (sb.length() > 0) {
            sb.toString();
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        CatchingFishSnackbar();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        CatchingFishSnackbar();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                CatchingFishSnackbar();
            } else {
                this.CatchingFishReduxKtor.append(c);
            }
        }
    }
}
