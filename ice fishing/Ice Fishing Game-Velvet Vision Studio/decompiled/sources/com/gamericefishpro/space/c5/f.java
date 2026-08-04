package com.gamericefishpro.space.c5;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends c {
    public f(c initialExtras) {
        Intrinsics.checkNotNullParameter(initialExtras, "initialExtras");
        LinkedHashMap initialExtras2 = initialExtras.a;
        Intrinsics.checkNotNullParameter(initialExtras2, "initialExtras");
        this.a.putAll(initialExtras2);
    }

    @Override // com.gamericefishpro.space.c5.c
    public final Object a(b key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.a.get(key);
    }

    public final void b(b key, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.a.put(key, obj);
    }

    public /* synthetic */ f(int i) {
        this(a.b);
    }
}
