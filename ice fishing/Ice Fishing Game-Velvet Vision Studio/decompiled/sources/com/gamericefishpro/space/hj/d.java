package com.gamericefishpro.space.hj;

import com.gamericefishpro.space.e.e;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends b {
    public Object b;

    @Override // com.gamericefishpro.space.hj.b
    public final Object a(com.gamericefishpro.space.b1.d context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object obj = this.b;
        if (obj == null) {
            return super.a(context);
        }
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException("Single instance created couldn't return value");
    }

    @Override // com.gamericefishpro.space.hj.b
    public final Object b(com.gamericefishpro.space.b1.d context) {
        Intrinsics.checkNotNullParameter(context, "context");
        e block = new e(6, this, context);
        Intrinsics.checkNotNullParameter(this, "lock");
        Intrinsics.checkNotNullParameter(block, "block");
        synchronized (this) {
            block.invoke();
        }
        Object obj = this.b;
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException("Single instance created couldn't return value");
    }
}
