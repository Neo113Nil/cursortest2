package com.gamericefishpro.space.h0;

import android.os.Build;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c1 {
    public static final b1 a;

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    static {
        b1 b1Var;
        String str = Build.FINGERPRINT;
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (Intrinsics.a(lowerCase, "robolectric")) {
                b1Var = new b1();
            } else {
                b1Var = null;
            }
        } else {
            b1Var = null;
        }
        a = b1Var;
    }
}
