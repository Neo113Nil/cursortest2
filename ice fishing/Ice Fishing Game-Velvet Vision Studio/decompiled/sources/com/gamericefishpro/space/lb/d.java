package com.gamericefishpro.space.lb;

import android.content.Context;
import android.os.UserManager;
import com.gamericefishpro.space.bb.q;
import com.gamericefishpro.space.r9.o;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements f, g {
    public final q a;
    public final Context b;
    public final com.gamericefishpro.space.nb.a c;
    public final Set d;
    public final Executor e;

    public d(Context context, String str, Set set, com.gamericefishpro.space.nb.a aVar, Executor executor) {
        this.a = new q(new com.gamericefishpro.space.bb.g(1, context, str));
        this.d = set;
        this.e = executor;
        this.c = aVar;
        this.b = context;
    }

    public final o a() {
        if (!((UserManager) this.b.getSystemService(UserManager.class)).isUserUnlocked()) {
            return com.gamericefishpro.space.d9.h.w("");
        }
        return com.gamericefishpro.space.d9.h.l(this.e, new c(0, this));
    }

    public final void b() {
        if (this.d.size() <= 0) {
            com.gamericefishpro.space.d9.h.w(null);
        } else if (!((UserManager) this.b.getSystemService(UserManager.class)).isUserUnlocked()) {
            com.gamericefishpro.space.d9.h.w(null);
        } else {
            com.gamericefishpro.space.d9.h.l(this.e, new c(1, this));
        }
    }
}
