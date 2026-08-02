package androidx.compose.foundation.lazy.layout;

import android.os.Build;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class PrefetchScheduler_androidKt {
    public static final PrefetchScheduler_androidKt$RobolectricImpl$1 RobolectricImpl;

    static {
        PrefetchScheduler_androidKt$RobolectricImpl$1 prefetchScheduler_androidKt$RobolectricImpl$1;
        String str = Build.FINGERPRINT;
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            if (Intrinsics.areEqual(lowerCase, "robolectric")) {
                prefetchScheduler_androidKt$RobolectricImpl$1 = new PrefetchScheduler_androidKt$RobolectricImpl$1();
                RobolectricImpl = prefetchScheduler_androidKt$RobolectricImpl$1;
            }
        }
        prefetchScheduler_androidKt$RobolectricImpl$1 = null;
        RobolectricImpl = prefetchScheduler_androidKt$RobolectricImpl$1;
    }
}
