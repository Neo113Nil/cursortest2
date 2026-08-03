package s3;

import android.util.Log;
import java.io.Writer;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class m extends Writer {

    /* renamed from: h, reason: collision with root package name */
    public final StringBuilder f6443h = new StringBuilder(128);

    /* renamed from: g, reason: collision with root package name */
    public final String f6442g = "FragmentManager";

    public final void a() {
        StringBuilder sb = this.f6443h;
        if (sb.length() > 0) {
            Log.d(this.f6442g, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        a();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            char c3 = cArr[i10 + i12];
            if (c3 == '\n') {
                a();
            } else {
                this.f6443h.append(c3);
            }
        }
    }
}
