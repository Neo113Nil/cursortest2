package com.gamericefishpro.space.yh;

import com.gamericefishpro.space.ph.u;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class b extends com.gamericefishpro.space.xh.b {
    @Override // com.gamericefishpro.space.xh.b
    public final void a(Throwable cause, Throwable exception) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        Intrinsics.checkNotNullParameter(exception, "exception");
        Integer num = a.b;
        if (num == null || num.intValue() >= 19) {
            cause.addSuppressed(exception);
        } else {
            super.a(cause, exception);
        }
    }

    @Override // com.gamericefishpro.space.xh.b
    public final List b(Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        Integer num = a.b;
        if (num != null && num.intValue() < 19) {
            return super.b(exception);
        }
        Throwable[] suppressed = exception.getSuppressed();
        Intrinsics.checkNotNullExpressionValue(suppressed, "getSuppressed(...)");
        return u.b(suppressed);
    }
}
