package com.gamericefishpro.space.v8;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i extends f implements com.gamericefishpro.space.t8.a {
    public final Set W;

    /* JADX WARN: Illegal instructions before constructor call */
    public i(Context context, Looper looper, int i, com.gamericefishpro.space.b8.k kVar, com.gamericefishpro.space.t8.f fVar, com.gamericefishpro.space.t8.g gVar) {
        n0 n0VarA = n0.a(context);
        com.gamericefishpro.space.s8.e eVar = com.gamericefishpro.space.s8.e.d;
        c0.g(fVar);
        c0.g(gVar);
        super(context, looper, n0VarA, eVar, i, new com.gamericefishpro.space.tb.u(15, fVar), new com.gamericefishpro.space.tb.u(16, gVar), (String) kVar.w);
        Set set = (Set) kVar.e;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.W = set;
    }

    @Override // com.gamericefishpro.space.t8.a
    public final Set b() {
        return m() ? this.W : Collections.EMPTY_SET;
    }

    @Override // com.gamericefishpro.space.v8.f
    public final Account q() {
        return null;
    }

    @Override // com.gamericefishpro.space.v8.f
    public final Set t() {
        return this.W;
    }
}
