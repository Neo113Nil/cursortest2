package com.gamericefishpro.space.n9;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g2 {
    public final Context a;
    public final Boolean b;
    public final long c;
    public final com.gamericefishpro.space.i9.t0 d;
    public final boolean e;
    public final Long f;
    public final String g;

    public g2(Context context, com.gamericefishpro.space.i9.t0 t0Var, Long l) {
        this.e = true;
        com.gamericefishpro.space.v8.c0.g(context);
        Context applicationContext = context.getApplicationContext();
        com.gamericefishpro.space.v8.c0.g(applicationContext);
        this.a = applicationContext;
        this.f = l;
        if (t0Var != null) {
            this.d = t0Var;
            this.e = t0Var.i;
            this.c = t0Var.e;
            this.g = t0Var.w;
            Bundle bundle = t0Var.v;
            if (bundle != null) {
                this.b = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
