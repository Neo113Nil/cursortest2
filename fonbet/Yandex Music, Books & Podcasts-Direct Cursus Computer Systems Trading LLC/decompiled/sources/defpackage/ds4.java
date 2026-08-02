package defpackage;

import android.hardware.SensorManager;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class ds4 {
    public static SensorManager b;
    public static seu c;
    public static String d;
    public static volatile boolean g;
    public static final teu a = new teu();
    public static final AtomicBoolean e = new AtomicBoolean(true);
    public static final AtomicBoolean f = new AtomicBoolean(false);

    public static final String a() {
        if (bp6.a.contains(ds4.class)) {
            return null;
        }
        try {
            if (d == null) {
                d = UUID.randomUUID().toString();
            }
            String str = d;
            if (str != null) {
                return str;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (Throwable th) {
            bp6.a(ds4.class, th);
            return null;
        }
    }
}
