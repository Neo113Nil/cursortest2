package S;

import android.os.Trace;

/* loaded from: classes.dex */
public abstract class a {
    public static void a(int i2, String str) {
        Trace.beginAsyncSection(str, i2);
    }

    public static void b(int i2, String str) {
        Trace.endAsyncSection(str, i2);
    }

    public static boolean c() {
        return Trace.isEnabled();
    }
}
