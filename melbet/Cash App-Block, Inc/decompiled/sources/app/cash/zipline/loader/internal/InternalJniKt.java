package app.cash.zipline.loader.internal;

import com.google.android.gms.dynamite.zzf;
import java.security.SecureRandom;

/* loaded from: classes.dex */
public abstract class InternalJniKt {
    public static final zzf ecdsaP256;
    public static final InternalJniKt$systemEpochMsClock$1 systemEpochMsClock;

    static {
        new SecureRandom().nextLong();
        ecdsaP256 = new zzf(10);
        systemEpochMsClock = InternalJniKt$systemEpochMsClock$1.INSTANCE;
    }
}
