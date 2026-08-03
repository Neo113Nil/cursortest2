package q3;

import android.os.Trace;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class m implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i10 = d3.b.f1654a;
            Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
            if (i.f5758k != null) {
                i.a().c();
            }
            Trace.endSection();
        } catch (Throwable th) {
            int i11 = d3.b.f1654a;
            Trace.endSection();
            throw th;
        }
    }
}
