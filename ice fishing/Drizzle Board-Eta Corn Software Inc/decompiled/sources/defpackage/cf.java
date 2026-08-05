package defpackage;

import android.os.Trace;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class cf implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = jd0.qoPGr6Ce;
            Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
            if (ze.k3x7lurq != null) {
                ze.qoPGr6Ce().MdtA4re8();
            }
            Trace.endSection();
        } catch (Throwable th) {
            int i2 = jd0.qoPGr6Ce;
            Trace.endSection();
            throw th;
        }
    }
}
