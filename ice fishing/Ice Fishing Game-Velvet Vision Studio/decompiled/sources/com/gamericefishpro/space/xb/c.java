package com.gamericefishpro.space.xb;

import android.content.Context;
import com.gamericefishpro.space.oh.i;
import com.gamericefishpro.space.oh.s;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static final s a = i.b(b.d);

    public static com.gamericefishpro.space.hc.b a() {
        a aVar = (a) a.getValue();
        Intrinsics.c(aVar, "null cannot be cast to non-null type com.onesignal.common.services.IServiceProvider");
        return (com.gamericefishpro.space.hc.b) aVar;
    }

    public static final boolean b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return ((a) a.getValue()).initWithContext(context, null);
    }
}
