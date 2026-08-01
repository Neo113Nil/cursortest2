package androidx.emoji2.text;

import android.os.Trace;

/* loaded from: classes.dex */
public final class m implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = K.n.f1485a;
            Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
            if (j.f4772k != null) {
                j.a().c();
            }
            Trace.endSection();
        } catch (Throwable th) {
            int i6 = K.n.f1485a;
            Trace.endSection();
            throw th;
        }
    }
}
