package com.gamericefishpro.space.mf;

import android.content.Context;
import com.gamericefishpro.space.l6.z;
import com.gamericefishpro.space.m6.o;
import com.gamericefishpro.space.v8.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class h {
    public static final h INSTANCE = new h();

    private h() {
    }

    private final void initializeWorkManager(Context context) {
        try {
            context.getApplicationContext();
            o.b(context, new com.gamericefishpro.space.l6.c(new l(7)));
        } catch (IllegalStateException e) {
            com.gamericefishpro.space.od.b.error("OSWorkManagerHelper initializing WorkManager failed: ", e);
        }
    }

    public final synchronized z getInstance(Context context) {
        o oVarA;
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            try {
                oVarA = o.a(context);
            } catch (IllegalStateException e) {
                com.gamericefishpro.space.od.b.error("OSWorkManagerHelper.getInstance failed, attempting to initialize: ", e);
                initializeWorkManager(context);
                oVarA = o.a(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return oVarA;
    }
}
