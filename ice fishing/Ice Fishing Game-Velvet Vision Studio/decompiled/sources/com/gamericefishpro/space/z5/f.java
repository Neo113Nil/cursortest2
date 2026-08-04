package com.gamericefishpro.space.z5;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static final void a(String key, Bundle bundle) {
        Intrinsics.checkNotNullParameter(key, "key");
        bundle.putString(key, null);
    }

    public static final void b(Bundle bundle, String key, Bundle value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        bundle.putBundle(key, value);
    }

    public static final void c(Bundle bundle, String key, List value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(value, "<this>");
        bundle.putStringArrayList(key, value instanceof ArrayList ? (ArrayList) value : new ArrayList<>(value));
    }
}
