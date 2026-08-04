package com.gamericefishpro.space.s6;

import android.content.Context;
import android.net.ConnectivityManager;
import com.gamericefishpro.space.f5.y;
import com.gamericefishpro.space.l6.q;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends y {
    public final ConnectivityManager f;
    public final f g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, com.gamericefishpro.space.r5.b taskExecutor) {
        super(context, taskExecutor);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        Object systemService = ((Context) this.b).getSystemService("connectivity");
        Intrinsics.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f = (ConnectivityManager) systemService;
        this.g = new f(this);
    }

    @Override // com.gamericefishpro.space.f5.y
    public final Object b() {
        return h.a(this.f);
    }

    @Override // com.gamericefishpro.space.f5.y
    public final void f() {
        try {
            q qVarC = q.c();
            String str = h.a;
            qVarC.getClass();
            com.gamericefishpro.space.v6.i.a(this.f, this.g);
        } catch (IllegalArgumentException e) {
            q.c().b(h.a, "Received exception while registering network callback", e);
        } catch (SecurityException e2) {
            q.c().b(h.a, "Received exception while registering network callback", e2);
        }
    }

    @Override // com.gamericefishpro.space.f5.y
    public final void g() {
        try {
            q qVarC = q.c();
            String str = h.a;
            qVarC.getClass();
            com.gamericefishpro.space.v6.g.c(this.f, this.g);
        } catch (IllegalArgumentException e) {
            q.c().b(h.a, "Received exception while unregistering network callback", e);
        } catch (SecurityException e2) {
            q.c().b(h.a, "Received exception while unregistering network callback", e2);
        }
    }
}
