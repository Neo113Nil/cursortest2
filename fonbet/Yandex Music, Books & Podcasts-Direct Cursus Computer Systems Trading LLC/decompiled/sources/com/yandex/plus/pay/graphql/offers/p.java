package com.yandex.plus.pay.graphql.offers;

import com.yandex.plus.core.graphql.fragment.pn;
import com.yandex.plus.core.graphql.fragment.qn;
import com.yandex.plus.pay.repository.api.model.offers.u;
import com.yandex.plus.pay.repository.api.model.offers.v;
import defpackage.b6e;

/* loaded from: classes5.dex */
public final class p {
    public static v a(qn qnVar) {
        u uVar;
        pn pnVar = qnVar.a;
        if (pnVar == null) {
            return null;
        }
        int ordinal = pnVar.b.ordinal();
        if (ordinal == 0) {
            uVar = u.a;
        } else {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return null;
                }
                b6e.s();
                return null;
            }
            uVar = u.b;
        }
        return new v(pnVar.a, uVar);
    }
}
