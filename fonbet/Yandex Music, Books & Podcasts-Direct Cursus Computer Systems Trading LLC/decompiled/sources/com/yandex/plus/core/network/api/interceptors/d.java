package com.yandex.plus.core.network.api.interceptors;

import defpackage.bse;
import defpackage.d0o;
import defpackage.l3o;
import defpackage.msa;
import defpackage.nsa;
import defpackage.oi3;
import defpackage.ssa;
import defpackage.ukn;
import defpackage.x0q;
import defpackage.y0q;
import defpackage.yd5;
import java.util.Iterator;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class d implements bse {
    public final x0q a = y0q.b(0, 1, oi3.b, 1);

    @Override // defpackage.bse
    public final l3o b(ukn uknVar) {
        nsa nsaVar;
        l3o f = uknVar.f((d0o) uknVar.i);
        Iterator it = f.f.r("X-Yandex-Plus-Invalidate-Stored-Values").iterator();
        do {
            nsaVar = null;
            if (!it.hasNext()) {
                break;
            }
            Long s0 = StringsKt.s0((String) it.next());
            if (s0 != null) {
                msa msaVar = nsa.b;
                nsaVar = new nsa(yd5.N(s0.longValue(), ssa.SECONDS));
            }
        } while (nsaVar == null);
        if (nsaVar != null) {
            this.a.a(new nsa(nsaVar.a));
        }
        return f;
    }
}
