package defpackage;

import android.os.Build;
import java.util.UUID;

/* loaded from: classes.dex */
public final class vvc {
    public static final boolean c;
    public final UUID a;
    public final byte[] b;

    static {
        boolean z;
        if ("Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z = true;
                c = z;
            }
        }
        z = false;
        c = z;
    }

    public vvc(UUID uuid, byte[] bArr) {
        this.a = uuid;
        this.b = bArr;
    }
}
