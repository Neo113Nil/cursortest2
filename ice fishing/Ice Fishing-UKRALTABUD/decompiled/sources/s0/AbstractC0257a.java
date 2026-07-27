package s0;

import a.AbstractC0069a;
import android.os.Trace;

/* renamed from: s0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0257a implements AutoCloseable {
    public static String a(String str) {
        if (str.length() < 124) {
            return str;
        }
        return str.substring(0, 124) + "...";
    }

    public static void b(String str) {
        Trace.beginSection(AbstractC0069a.K(a(str)));
    }
}
