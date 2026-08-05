package defpackage;

import android.util.Log;
import java.io.Writer;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class kq extends Writer {
    public final StringBuilder NCTxEWno = new StringBuilder(128);

    public final void VgvYg0wo() {
        StringBuilder sb = this.NCTxEWno;
        if (sb.length() > 0) {
            Log.d("FragmentManager", sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        VgvYg0wo();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        VgvYg0wo();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                VgvYg0wo();
            } else {
                this.NCTxEWno.append(c);
            }
        }
    }
}
