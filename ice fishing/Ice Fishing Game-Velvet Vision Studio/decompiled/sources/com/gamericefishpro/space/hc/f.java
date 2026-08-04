package com.gamericefishpro.space.hc;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends e {
    private final Function1<b, Object> create;
    private Object obj;

    /* JADX WARN: Multi-variable type inference failed */
    public f(Function1<? super b, Object> create) {
        Intrinsics.checkNotNullParameter(create, "create");
        this.create = create;
    }

    @Override // com.gamericefishpro.space.hc.e
    public Object resolve(b provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Object obj = this.obj;
        if (obj != null) {
            return obj;
        }
        Object objInvoke = this.create.invoke(provider);
        this.obj = objInvoke;
        return objInvoke;
    }
}
