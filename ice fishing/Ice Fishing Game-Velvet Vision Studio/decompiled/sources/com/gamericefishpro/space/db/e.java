package com.gamericefishpro.space.db;

import android.content.Context;
import com.gamericefishpro.space.ei.b0;
import com.gamericefishpro.space.ei.u;
import com.gamericefishpro.space.l4.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    public static final /* synthetic */ com.gamericefishpro.space.ki.d[] d;
    public final String a;
    public final ThreadLocal b;
    public final g c;

    static {
        u uVar = new u(com.gamericefishpro.space.ei.c.d, e.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0);
        b0.a.getClass();
        d = new com.gamericefishpro.space.ki.d[]{uVar};
    }

    public e(Context context, String name) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        this.a = name;
        this.b = new ThreadLocal();
        this.c = com.gamericefishpro.space.hj.c.I(name, new com.gamericefishpro.space.m.d(new a(this, 0)), new a(this, 1), 8).a(context, d[0]);
    }

    public final void a(Function1 transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
    }
}
